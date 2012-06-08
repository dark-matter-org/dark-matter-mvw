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
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.Controller;
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
}
