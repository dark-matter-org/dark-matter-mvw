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

	/**
	 * We generate the initial extended version of the view if it doesn't already exist. This
	 * just saves time when you're getting started.
	 * @param extendir the directory just above where the MVW configuration is defined
	 * @param view the view being created
	 * @throws IOException 
	 */
	static void formatInitialView(String extendir, View view) throws IOException {
		StringBuilder outdir = new StringBuilder(extendir);
		
		if (view.getSubpackage() != null) {
			ArrayList<String>	tokens = CheapSplitter.split(view.getSubpackage(), '.', false, true);
			for(String token: tokens) {
				outdir.append(File.separator + token);
			}
		}
		
		File dir = new File(outdir.toString());
		
		if (!dir.exists()) {
			DebugInfo.debug("Creating extended code directory:" + outdir.toString());
			dir.mkdirs();
		}
		
		String	fn		= outdir.toString() + File.separator + view.getViewName() + ".java";
		File		file 	= new File(fn);
		
		if (!file.exists()) {
			// NOTE: WE DON'T USE THE FileUpdateManager WHEN WRITING THESE FILES - otherwise, we wind up
			// with problems of removing files that were previously dumped to the output directory, which
			// is not what we want. The FileUpdateManager is only used for directories where all content 
			// is generated.
			BufferedWriter 	out = new BufferedWriter(new FileWriter(fn));

	        out.write("package " + view.getExtendedClassPackage() + ";\n\n");
	        
	        if (view.getUsesRunContextItemHasValue())
		        out.write("import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;\n");
	        
	        out.write("import com.google.gwt.user.client.ui.Widget;\n");
	        out.write("import " + view.getPresenterImport() + ";\n");
	        out.write("import " + view.getBaseImplImport() + ";\n\n");
	        
			out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        out.write("public class " + view.getViewName() + " extends " + view.getViewName() + "BaseImpl {\n\n");
	        
	        if (view.getUsesRunContextItemHasValue()){
		        	out.write("    public " + view.getViewName() + "(" + view.getViewName() + "PresenterIF p, MvwRunContextIF rc){\n");
		        out.write("        super(p,rc);\n");
		        out.write("    }\n\n");
	        }
	        else {
		        	out.write("    public " + view.getViewName() + "(" + view.getViewName() + "PresenterIF p){\n");
		        out.write("        super(p);\n");
		        out.write("    }\n\n");
	        }

	        out.write("    @Override\n");
	        out.write("    public Widget asWidget() {\n");
	        out.write("        // TODO Auto-generated method stub\n");
	        out.write("        return null;\n");
	        out.write("    }\n");	        
	        
	        out.write("}\n\n");
	        
	        out.write("\n");
	        
	        out.close();
		
		}
		
	}
}
