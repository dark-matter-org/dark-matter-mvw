//	---------------------------------------------------------------------------
//	dark-matter-mvw
//	Copyright (c) 2012 dark-matter-mvw committers
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
package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.dmd.dmc.types.CheapSplitter;
import org.dmd.mvw.tools.mvwgenerator.extended.Controller;
import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;

public class ControllerFormatter {

	static public void formatControllerBaseImpl(String outdir, Controller controller) throws IOException {
		
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, controller.getControllerName() + "BaseImpl.java");

        out.write("package " + controller.getDefinedInModule().getGenPackage() + ".generated.mvw.controllers;\n\n");
        
        out.write(controller.getImports());
        
        out.write("\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("abstract public class " + controller.getControllerName() + "BaseImpl " + controller.getControllerInterfaces() + "{\n\n");
        
    	boolean onDemand = false;
    	for(RunContextItem rci: controller.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariable());
    		if (rci.isCreateOnDemand())
    			onDemand = true;
    	}
    	
    	if (onDemand){
        	out.write("\n");
        	out.write("    MvwRunContextIF runcontext;\n");
    	}
    	
    	out.write("\n");
    	
    	out.write(controller.getCommsConstants());
    	
    	if (controller.getImplementsActionHasValue()){
    		out.write(controller.getActionVariables() + "\n");
    	}
    	
    	///////////////////////////////////////////////////////////////////////
    	// Constructor
    	
    	if (controller.usesRunContext())
    		out.write("    public " + controller.getControllerName() + "BaseImpl(MvwRunContextIF rc){\n");
    	else
    		out.write("    public " + controller.getControllerName() + "BaseImpl(){\n");
    	
    	for(RunContextItem rci: controller.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariableAssignment());
    	}
    	
    	if (controller.usesRunContext() && onDemand){
        	out.write("\n");
        	out.write("        runcontext = rc;\n");
    	}
    		
    	out.write("\n" + controller.getAttributeSchemaLoaders() + "\n");
    	
    	out.write(controller.getEventRegistration() + "\n");

    	if (controller.getImplementsActionHasValue()){
    		out.write(controller.getActionInstantiations() + "\n");
    	}
    	
        out.write("    }\n\n");
        
    	///////////////////////////////////////////////////////////////////////
        
        // On demand accessors
    	for(RunContextItem rci: controller.getUsesRunContextItemIterable()){
    		out.write(rci.getOnDemandMethod());
    	}
    	
    	// Fire event methods
    	out.write(controller.getFireMethods());
    	
    	// Communications methods
    	out.write(controller.getCommsMethods());
    	
        out.write(controller.getAbstractMethods());
        
        out.write("}\n\n");
        
        out.close();
	}
	
	/**
	 * We generate the initial extended version of the controller if it doesn't already exist.
	 * @param extendir the directory just above where the MVW configuration is defined
	 * @param controller the controller being created
	 * @throws IOException
	 */
	static void formatInitialController(String extendir, Controller controller) throws IOException {
		StringBuilder outdir = new StringBuilder(extendir);
		
		if (controller.getSubpackage() != null) {
			ArrayList<String>	tokens = CheapSplitter.split(controller.getSubpackage(), '.', false, true);
			for(String token: tokens) {
				outdir.append(File.separator + token);
			}
		}
		
		File dir = new File(outdir.toString());
		
		if (!dir.exists()) {
			DebugInfo.debug("Creating extended code directory:" + outdir.toString());
			dir.mkdirs();
		}
		
		String	fn		= outdir.toString() + File.separator + controller.getControllerName() + ".java";
		File		file 	= new File(fn);
		
		if (!file.exists()) {
			// NOTE: WE DON'T USE THE FileUpdateManager WHEN WRITING THESE FILES - otherwise, we wind up
			// with problems of removing files that were previously dumped to the output directory, which
			// is not what we want. The FileUpdateManager is only used for directories where all content 
			// is generated.
			BufferedWriter 	out = new BufferedWriter(new FileWriter(fn));

	        out.write("package " + controller.getExtendedClassPackage() + ";\n\n");
	        
	        out.write("import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;\n");
	        out.write("import " + controller.getBaseImplImport() + ";\n\n");
	        
			out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        out.write("public class " + controller.getControllerName() + " extends " + controller.getControllerName() + "BaseImpl {\n\n");
	        
	        out.write("    public " + controller.getControllerName() + "(MvwRunContextIF rc){\n");
	        out.write("        super(rc);\n");
	        out.write("    }\n");

	        out.write("}\n\n");
	        
	        out.write("\n");
	        
	        out.close();
		}		
	}
	
}
