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

import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;

public class PresenterFormatter {

	static public void formatPresenterBaseImpl(String outdir, Presenter presenter) throws IOException {
		
		if (presenter.isCodeSplit())
			PresenterFormatter.formatPresenterAsyncIF(outdir, presenter);
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, presenter.getPresenterName() + "BaseImpl.java");

        out.write("package " + presenter.getDefinedInModule().getGenPackage() + ".generated.mvw.presenters;\n\n");
        
        out.write(presenter.getImports());
        
        out.write("\n");
        
        
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("abstract public class " + presenter.getPresenterName() + "BaseImpl" + presenter.getPresenterInterfaces() + " {\n\n");
        
    	boolean onDemand = false;
    	for(RunContextItem rci: presenter.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariable());
    		if (rci.isCreateOnDemand())
    			onDemand = true;
    	}
    	
    	if (onDemand){
        	out.write("\n");
        	out.write("    MvwRunContextIF runcontext;\n");
    	}
    	
    	out.write("\n");
    	
    	out.write(presenter.getCommsConstants());
    	
//    	if (presenter.getImplementsActionHasValue()){
//    		out.write(presenter.getActionVariables() + "\n");
//    	}
    	
    	///////////////////////////////////////////////////////////////////////
    	// Constructor

    	if (presenter.usesRunContext())
    		out.write("    public " + presenter.getPresenterName() + "BaseImpl(MvwRunContextIF rc){\n");
    	else
    		out.write("    public " + presenter.getPresenterName() + "BaseImpl(){\n");

    	for(RunContextItem rci: presenter.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariableAssignment());
    	}

    	if (presenter.usesRunContext() && onDemand){
        	out.write("\n");
        	out.write("        runcontext = rc;\n");
    	}
    	
    	out.write(presenter.getEventRegistration() + "\n");
    		
//    	if (presenter.getImplementsActionHasValue()){
//    		out.write(presenter.getActionInstantiations() + "\n");
//    	}
    	
        out.write("    }\n\n");
        
    	///////////////////////////////////////////////////////////////////////

        // On demand accessors
    	for(RunContextItem rci: presenter.getUsesRunContextItemIterable()){
    		out.write(rci.getOnDemandMethod());
    	}

    	// Fire event methods
    	out.write(presenter.getFireMethods());
    	
    	// Communications methods
    	out.write(presenter.getCommsMethods());
        
        out.write(presenter.getAbstractMethods());
        
        out.write("}\n\n");
        
        out.close();
	}
	
	static void formatPresenterAsyncIF(String outdir, Presenter presenter) throws IOException {
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, presenter.getPresenterName() + "AsyncIF.java");

        out.write("package " + presenter.getDefinedInModule().getGenPackage() + ".generated.mvw.presenters;\n\n");
        
        out.write("import " + presenter.getExtendedClassImport() + ";\n\n");
        
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public interface " + presenter.getPresenterName() + "AsyncIF {\n\n");
        
        out.write("    public void async" + presenter.getPresenterName() + "Ready(" + presenter.getPresenterName() + " p);\n");
        
        out.write("}\n");

        out.write("\n");
        
        out.close();
	}

}
