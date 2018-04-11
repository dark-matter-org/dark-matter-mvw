//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmp.server.servlet.base;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.server.servlet.base.actions.ActionManagerIF;
import org.dmd.dmp.server.servlet.base.cache.CacheIF;
import org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF;
import org.dmd.dmp.server.servlet.base.interfaces.SecurityManagerIF;
import org.dmd.dmp.server.servlet.dmpservletri.DMPServiceImpl;
import org.dmd.dmp.server.servlet.extended.PluginConfig;
import org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG;
import org.dmd.dmp.server.servlet.generated.dmo.DmpServerDMSAG;
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;
import org.dmd.dmv.shared.DmvRuleManager;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.dmw.DmwOmni;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;

/**
 * The PluginManager reads a plugin configuration and loads and instantiates
 * the plugins specified. Certain plugin roles are required in order for the 
 * application to function properly. These roles include:
 * <ul>
 * <li>Cache - which provides centralized access to named objects and allows for 
 * CRUDE operations - Create, Read, Update, Delete and Events associated with 
 * the objects it manages. A cache implementation MUST be Runnable in order to
 * allow for proper sequencing of operations and events.
 * </li>
 * <li>SecurityManager - provides user authentication and session management.
 * </li>
 * <ul>
 */
public class PluginManager implements DmcUncheckedOIFHandlerIF {

	// Our overall schema, including the required schemas of the plugins
	// that have been loaded.
//	SchemaManager							schema;
	
	// The factory used to instantiate the appropriate wrapped objects from
	// the plugin config file or other files that we're asked to load
	DmwObjectFactory						factory;
	
	// Our OIF parser.
	DmcUncheckedOIFParser					configParser;
	
	// The plugins that we've loaded
	TreeMap<DmcObjectName,PluginConfig>		pluginConfigs;
	
	// Key: integer start order
	// Value: an array of plugins to be started at that order 
	TreeMap<Integer,ArrayList<DmpServletPlugin>>		startOrder;
	
	// The servlet in which we're running
	DMPServiceImpl							servlet;
	
	// The handle to the plugin that allows for registration of handlers for
	// the various types of Dark Matter Protocol requests.
	RequestTrackerIF						requestTracker;
	DmpServletPlugin						requestTrackerPlugin;

	// The handle to the plugin that implements our security behaviour. If this
	// role is unfilled after the load sequence, we throw an exception.
	SecurityManagerIF						securityManager;
	DmpServletPlugin						securityPlugin;
	
	// The handle to the plugin that implements our cache. If this role is unfilled
	// after the load sequence, we throw an exception.
	CacheIF									cache;
	DmpServletPlugin							cachePlugin;
	
	// The handle to the plugin that will allow for execution of asynchronous
	// action-based processing. This is NOT a required plugin
	ActionManagerIF							actionManager;
	DmpServletPlugin							actionManagerPlugin;
	
	DmvRuleManager							ruleManager;
	
	
	public PluginManager(DMPServiceImpl s) throws ResultException, DmcValueException {
//		schema 		= new SchemaManager();
		servlet		= s;
		
		DmpSchemaAG 		dmp 	= new DmpSchemaAG();
		DmpServerSchemaAG 	dmps 	= new DmpServerSchemaAG();
		
		DmwOmni.instance().addSchema(dmp.getInstance());
		DmwOmni.instance().addSchema(dmps.getInstance());
		
//		schema.manageSchema(dmp);
//		schema.manageSchema(dmps);
		
//		factory 		= new DmwObjectFactory(schema);
		factory 		= new DmwObjectFactory(DmwOmni.instance().getSchema());
		configParser	= new DmcUncheckedOIFParser(this);
		
		pluginConfigs	= new TreeMap<DmcObjectName, PluginConfig>();
		startOrder		= new TreeMap<Integer, ArrayList<DmpServletPlugin>>();
		
		securityManager	= null;
		
		ruleManager		= new DmvRuleManager();
		ruleManager.loadRules(DmpDMSAG.instance());
		ruleManager.loadRules(DmpServerDMSAG.instance());
	}
	
//	public SchemaManager getSchema(){
//		return(schema);
//	}
	
	public SecurityManagerIF getSecurityManager(){
		return(securityManager);
	}
	
	public RequestTrackerIF getRequestTracker(){
		return(requestTracker);
	}

	public DMPServiceImpl getServlet(){
		return(servlet);
	}

	public CacheIF getCache(){
		return(cache);
	}

	/**
	 * @return the action manager with which you may register action handling functionality.
	 */
	public ActionManagerIF getActionManager(){
		return(actionManager);
	}

	/**
	 * Loads the plugins specified in the plugin configuation file. 
	 * @param fn the name of the plugin configuration file.
	 * @throws ResultException
	 * @throws DmcValueException
	 * @throws DmcRuleExceptionSet 
	 * @throws DmcNameClashException 
	 */
	public void loadPlugins(String fn) throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
		File pluginFile = new File(fn);
		
		if (!pluginFile.exists()){
			ResultException ex = new ResultException();
			ex.addError("Could not open DMP Servlet configuration file: " + fn);
			throw(ex);
		}
		configParser.parseFile(fn);
		
		for(PluginConfig sp: pluginConfigs.values()){
			DmpServletPlugin plugin = instantiatePlugin(sp);
			
			if (plugin instanceof RequestTrackerIF){
				if (requestTracker == null){
					requestTracker = (RequestTrackerIF) plugin;
					requestTrackerPlugin = plugin;
				}
				else{
					ResultException ex = new ResultException("Multiple request tracker plugins specified.");
					throw(ex);
				}
			}
			else if (plugin instanceof CacheIF){
				if (cache == null){
					cache = (CacheIF) plugin;
					cachePlugin = plugin;
				}
				else{
					ResultException ex = new ResultException("Multiple cache plugins specified.");
					throw(ex);
				}
			}
			else if (plugin instanceof SecurityManagerIF){
				if (securityManager == null){
					securityManager = (SecurityManagerIF) plugin;
					securityPlugin	= plugin;
				}
				else{
					ResultException ex = new ResultException("Multiple security manager plugins specified.");
					throw(ex);
				}
			}
			else if (plugin instanceof ActionManagerIF) {
				if (actionManager == null) {
					actionManager = (ActionManagerIF) plugin;
					actionManagerPlugin = plugin;
				}
				else {
					ResultException ex = new ResultException("Multiple action manager plugins specified.");
					throw(ex);
				}
			}
			else{
				ArrayList<DmpServletPlugin> plugins = startOrder.get(sp.getStartOrder());
				
				if (plugins == null) {
					plugins = new ArrayList<>();
					startOrder.put(sp.getStartOrder(), plugins);
				}
				plugins.add(plugin);
			}
		}
		
		if (requestTracker == null){
			ResultException ex = new ResultException();
			ex.addError("No plugin has been specified that implements the org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF interface");
			throw(ex);
		}
		
		if (cache == null){
			ResultException ex = new ResultException();
			ex.addError("No plugin has been specified that implements the org.dmd.dmp.server.servlet.base.interfaces.CacheIF interface");
			throw(ex);
		}
		
		if (securityManager == null){
			ResultException ex = new ResultException();
			ex.addError("No plugin has been specified that implements the org.dmd.dmp.server.servlet.base.interfaces.SecurityManagerIF interface");
			throw(ex);
		}
	}
	
	public void preInit() throws ResultException, DmcValueException{
		
		requestTrackerPlugin.preInit();
		
		cachePlugin.preInit();
		
		securityPlugin.preInit();
		
		if (actionManagerPlugin != null)
			actionManagerPlugin.preInit();
		
		for(Integer order: startOrder.keySet()) {
			ArrayList<DmpServletPlugin> plugins = startOrder.get(order);
			for(DmpServletPlugin sp: plugins){
				sp.preInit();
			}
		}
	}
	
	public void init() throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {
		
		requestTrackerPlugin.init();
		
		cachePlugin.init();
		
		securityPlugin.init();

		if (actionManagerPlugin != null)
			actionManagerPlugin.init();
		
		for(Integer order: startOrder.keySet()) {
			ArrayList<DmpServletPlugin> plugins = startOrder.get(order);
			for(DmpServletPlugin sp: plugins){
				sp.init();
			}
		}
	}
	
	public void start() throws ResultException, DmcValueException{
		
		requestTrackerPlugin.start();
		
		cachePlugin.start();
		
		securityPlugin.start();
		
		if (actionManagerPlugin != null)
			actionManagerPlugin.start();
		
		for(Integer order: startOrder.keySet()) {
			ArrayList<DmpServletPlugin> plugins = startOrder.get(order);
			for(DmpServletPlugin sp: plugins){
				sp.start();
			}
		}
	}
	
	public void shutdown(){
		ArrayList<DmpServletPlugin> reverse = new ArrayList<DmpServletPlugin>();
		
		for(Integer order: startOrder.keySet()) {
			ArrayList<DmpServletPlugin> plugins = startOrder.get(order);
			for(DmpServletPlugin sp: plugins){
				reverse.add(0,sp);
			}
		}
		
		for(DmpServletPlugin sp: reverse){
			sp.shutdown();
		}
		
		if (actionManagerPlugin != null)
			actionManagerPlugin.shutdown();
		
		securityPlugin.shutdown();
		
		cachePlugin.shutdown();
		
		requestTrackerPlugin.shutdown();
	}

	DmpServletPlugin instantiatePlugin(PluginConfig pc) throws ResultException{
		DmpServletPlugin rc = null;
		Class<?> pluginClass = null;
		
		try {
			if (pc.getPluginClass() == null) {
				ResultException ex = new ResultException();
				ex.addError("Mandatory attribute pluginClass not specified");
				ex.setLocationInfo(pc.getFile(), pc.getLineNumber());
				throw(ex);
			}
			pluginClass = Class.forName(pc.getPluginClass());
		} catch (ClassNotFoundException e) {
			ResultException ex = new ResultException();
			ex.addError("Plugin class not found: " + pc.getPluginClass());
			ex.setLocationInfo(pc.getFile(), pc.getLineNumber());
			throw(ex);
		}
		
		try {
			rc = (DmpServletPlugin) pluginClass.newInstance();
			rc.setManagerAndConfig(this,pc);
		} catch (InstantiationException e) {
			ResultException ex = new ResultException();
			ex.addError("InstantiationException for: " + pc.getPluginClass());
			ex.setLocationInfo(pc.getFile(), pc.getLineNumber());
			throw(ex);
		} catch (IllegalAccessException e) {
			ResultException ex = new ResultException();
			ex.addError("IllegalAccessException for: " + pc.getPluginClass());
			ex.setLocationInfo(pc.getFile(), pc.getLineNumber());
			throw(ex);
		}
		
		return(rc);
	}

	@Override
	public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException {
		PluginConfig config = null;
		
		try {
			config = (PluginConfig) factory.createWrapper(uco);
		} catch (ClassNotFoundException e) {
			ResultException ex = new ResultException("Unknown object class: " + uco.classes.get(0));
			ex.result.lastResult().moreMessages("The plugin configuration file should contain PluginConfig objects.");
			ex.result.lastResult().fileName(infile);
			ex.result.lastResult().lineNumber(lineNumber);
			throw(ex);
		} catch (ClassCastException e){
			ResultException ex = new ResultException("Invalid object in plugin config file: " + uco.classes.get(0));
			ex.result.lastResult().fileName(infile);
			ex.result.lastResult().lineNumber(lineNumber);
			throw(ex);
		} catch (DmcNameClashException e) {
			ResultException ex = new ResultException("Name clash for class: " + uco.classes.get(0));
			ex.result.lastResult().fileName(infile);
			ex.result.lastResult().lineNumber(lineNumber);
			throw(ex);
		}
		
		config.setLineNumber(lineNumber);
		config.setFile(infile);
		if (config.getPluginName() != null)
			config.setCamelCaseName(config.getPluginName());
		
		try {
			ruleManager.executeAttributeValidation(config.getDmcObject());
			ruleManager.executeObjectValidation(config.getDmcObject());
//		} catch (DmcValueExceptionSet e) {
//			ResultException ex = new ResultException();
//			for(DmcValueException dve: e.getExceptions()){
//				ex.addError(dve.getLocalizedMessage());
//			}
//			ex.setLocationInfo(infile, lineNumber);
//			ex.result.lastResult().moreMessages("Object class: " + config.getConstructionClassName());
//			
//			throw(ex);
		} catch (DmcRuleExceptionSet e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (pluginConfigs.get(config.getObjectName()) != null){
			ResultException ex = new ResultException("Duplicate plugin name: " + config.getObjectName());
			ex.result.lastResult().fileName(infile);
			ex.result.lastResult().lineNumber(lineNumber);
			throw(ex);
		}
		
		pluginConfigs.put(config.getObjectName(), config);
//		startOrder.put(plugin., value)
	}
}
