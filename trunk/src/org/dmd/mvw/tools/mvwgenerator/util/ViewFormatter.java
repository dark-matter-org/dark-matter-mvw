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

import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.extended.View;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;

public class ViewFormatter {

	static public void formatViewInterface(String outdir, View view) throws IOException{
		
		if (view.isCodeSplit())
			ViewFormatter.formatPresenterAsyncIF(outdir, view);
			
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, view.getViewName().getNameString() + "IF.java");

        out.write("package " + view.getDefinedInModule().getGenPackage() + ".generated.mvw.views;\n\n");
        
        out.write(view.getInterfaceImports() + "\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public interface " + view.getViewName() + "IF {\n\n");
        
        out.write("    public interface " + view.getViewName() + "PresenterIF {\n\n");
        
        out.write(view.getPresenterMethods());
        
        out.write("    }\n\n");
        
        out.write(view.getViewMethods());
        
        out.write("}\n\n");
        
        out.close();
	}
	
	static public void formatViewBaseImpl(String outdir, View view) throws IOException{
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, view.getViewName().getNameString() + "BaseImpl.java");
		
        out.write("package " + view.getDefinedInModule().getGenPackage() + ".generated.mvw.views;\n\n");

        out.write(view.getViewImplImports() + "\n");
        
        String otherInterfaces = "";
        
        if (view.isWidget())
        	otherInterfaces = ", IsWidget";
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("abstract public class " + view.getViewName() + "BaseImpl implements " + view.getViewName() + "IF" + otherInterfaces + " {\n\n");
        
        out.write("    protected " + view.getViewName() + "PresenterIF presenter;\n\n");
        
        if (view.getUsesRunContextItemHasValue()){
        	for(RunContextItem rci: view.getUsesRunContextItemIterable()){
        		out.write(rci.getImplVariable());
        	}
        	out.write("\n");
        }
        
        if (view.getUsesRunContextItemHasValue()){
            out.write("    protected " + view.getViewName() + "BaseImpl(" + view.getViewName() + "PresenterIF p, MvwRunContextIF rc){\n");
            out.write("        presenter = p;\n\n");
            if (view.getUsesRunContextItemHasValue()){
            	for(RunContextItem rci: view.getUsesRunContextItemIterable()){
            		out.write(rci.getImplVariableAssignment());
            	}
            }
            out.write("    }\n\n");
        }
        else{
            out.write("    protected " + view.getViewName() + "BaseImpl(" + view.getViewName() + "PresenterIF p){\n");
            out.write("        presenter = p;\n");
            out.write("    }\n\n");
        }
        
//        out.write("    public void setPresenter(" + view.getViewName() + "Presenter p){\n");
//        out.write("        presenter = p;\n");
//        out.write("    }\n");
//        out.write("    \n");
        
        out.write(view.getViewImplMethods());
        
        out.write("}\n\n");
        
        out.close();
	}
	
	static void formatPresenterAsyncIF(String outdir, View view) throws IOException {
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, view.getViewName() + "AsyncIF.java");

        out.write("package " + view.getDefinedInModule().getGenPackage() + ".generated.mvw.views;\n\n");
        
        out.write("import " + view.getExtendedClassImport() + ";\n\n");
        
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public interface " + view.getViewName() + "AsyncIF {\n\n");
        
        out.write("    public void async" + view.getViewName() + "Ready(" + view.getViewName() + " v);\n");
        
        out.write("}\n");

        out.write("\n");
        
        out.close();
	}


}
