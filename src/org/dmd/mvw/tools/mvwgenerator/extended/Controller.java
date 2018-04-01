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
package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.mvw.tools.mvwgenerator.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.ActionBinding;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ControllerDMW;
import org.dmd.util.exceptions.ResultException;

public class Controller extends ControllerDMW implements CodeGenComponentIF {
	
	StringBuffer		controllerInterfaces;
	
	// The run context item that's automatically created for us in the definition manager
	RunContextItem		runContextItem;

	public Controller(){
		
	}
	
	@Override
	public void resetCodeGenInfo() {
		super.resetCodeGenInfo();
		initialized 			= false;
		controllerInterfaces	= null;
	}

	@Override
	public boolean usesRunContext(){
		super.usesRunContext();
		
		if (getImplementsActionHasValue()){
			usesRunContext.set(true);
		}
		
		return(usesRunContext.booleanValue());
	}
	
	public void setRunContextItem(RunContextItem i){
		runContextItem = i;
	}
	
	public RunContextItem getRunContextItem(){
		return(runContextItem);
	}
	
	public String getControllerInterfaces(){
		if (hasCommsMethods()){
			controllerInterfaces.append("implements ResponseHandlerIF");
			if (handlesObjectEvents())
				controllerInterfaces.append(", EventHandlerIF");
		}
		if (isCentralDMPErrorHandler()){
			if (controllerInterfaces.length() > 0)
				controllerInterfaces.append(", ");
			else
				controllerInterfaces.append("implements ");
			controllerInterfaces.append("CentralDMPErrorHandlerIF");
		}
		if (isCentralRPCErrorHandler()){
			if (controllerInterfaces.length() > 0)
				controllerInterfaces.append(", ");
			else
				controllerInterfaces.append("implements ");
			controllerInterfaces.append("CentralRPCErrorHandlerIF");
		}
		if (isCentralAsyncErrorHandler()){
			if (controllerInterfaces.length() > 0)
				controllerInterfaces.append(", ");
			else
				controllerInterfaces.append("implements ");
			controllerInterfaces.append("MvwAsyncErrorHandlerIF");
		}
		if (controllerInterfaces.length() > 0)
			controllerInterfaces.append(" ");
		return(controllerInterfaces.toString());
	}
	
	public void initCodeGenInfo(boolean rpc, boolean dmp) throws ResultException {
		if (!initialized){
			initialized = true;
			
			if (getInstantiatesPresenterHasValue()){
				for(Presenter presenter: getInstantiatesPresenterIterable()){
					addUsesRunContextItem(presenter.getRunContextItem());
				}
			}
			
			super.initCodeGenInfo(rpc,dmp);
			
			if (isCentralDMPErrorHandler())
				imports.addImport("org.dmd.dmp.client.CentralDMPErrorHandlerIF", "Is the central DMP error handler");

			if (isCentralRPCErrorHandler())
				imports.addImport("org.dmd.dmp.client.CentralRPCErrorHandlerIF", "Is the central RPC error handler");
			
			if (isCentralAsyncErrorHandler())
				imports.addImport("org.dmd.mvw.client.mvw.MvwAsyncErrorHandlerIF", "Is the central async code error handler");
			
			if (getImplementsActionHasValue()){
				
				for(ActionBinding action: getImplementsActionIterable()){
					String capped = GenUtility.capTheName(action.getActionBindingName().getNameString());
					String cappedAction = GenUtility.capTheName(action.getActionBindingName().getNameString()) + "Action";
					
					actionVariables.append("    protected final " + cappedAction + " " + action.getActionBindingName() + ";\n");
					
					actionInstantiations.append("\n");
					actionInstantiations.append("        " + action.getActionBindingName() + " = new " + cappedAction + "(this);\n");
					actionInstantiations.append("        MenuControllerRCI.addAction(" + action.getActionBindingName() + ");\n");
					
					String i = getDefinedInModule().getGenPackage() + ".generated.mvw.actions." + cappedAction;
					imports.addImport(i, "The " + action.getActionBindingName() + " action");
					imports.addImport("org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF", "Required by actions");
					
					abstractMethods.append("\n");
					abstractMethods.append("    abstract public void execute" + capped + "(TriggerIF trigger, Object widgetEvent);\n");
				}
			}

			controllerInterfaces = new StringBuffer();
		}
	}
	
	public String getExtendedClassPackage(){
		if (getSubpackage() == null)
			return(getDefinedInModule().getGenPackage() + ".extended");
		else
			return(getDefinedInModule().getGenPackage() + ".extended." + getSubpackage());
		
	}
	
	/**
	 * @return the import for base implementation of this presenter.
	 */
	public String getBaseImplImport(){
		return(getDefinedInModule().getGenPackage() + ".generated.mvw.controllers." + getControllerName() + "BaseImpl");
	}
	

	
	@Override
	public String genSubPackage(){
		return("controllers");
	}

}
