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
import org.dmd.mvw.tools.mvwgenerator.extended.Activity;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;

public class ActivityFormatter {

	public static void formatActivity(String outdir, Activity activity) throws IOException {
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, activity.getActivityName() + "BaseImpl.java");

        out.write("package " + activity.getDefinedInModule().getGenPackage() + ".generated.mvw.activities;\n\n");
        
        out.write(activity.getImports());
        
        out.write("\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("abstract public class " + activity.getActivityName() + "BaseImpl" + activity.getBaseClassName() + activity.getInterfaces() + " {\n\n");

    	boolean onDemand = false;
    	for(RunContextItem rci: activity.getUsesRunContextItemIterable()){
    		// If it's create on demand, we will have to hang on to the run context
    		// and we won't have member for the item
    		if (rci.isCreateOnDemand())
    			onDemand = true;
    		else
    			out.write(rci.getImplVariable());
    	}
    	
    	if (onDemand){
        	out.write("\n");
        	out.write("    MvwRunContextIF runcontext;\n");
    	}

    	out.write("\n");
    	
    	out.write(activity.getCommsConstants());

//    	if (activity.getImplementsActionHasValue()){
//    		out.write(activity.getActionVariables() + "\n");
//    	}
    	
    	///////////////////////////////////////////////////////////////////////
    	// Constructor

    	if (activity.usesRunContext())
        	out.write("    public " + activity.getActivityName() + "BaseImpl(MvwRunContextIF rc){\n");
    	else
    		out.write("    public " + activity.getActivityName() + "BaseImpl(){\n");

    	for(RunContextItem rci: activity.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariableAssignment());
    	}

    	if (activity.usesRunContext() && onDemand){
        	out.write("\n");
        	out.write("        runcontext = rc;\n");
    	}

    	out.write(activity.getEventRegistration() + "\n");

    	//    	if (activity.getImplementsActionHasValue()){
//    		out.write(activity.getActionInstantiations() + "\n");
//    	}
    	
    	out.write("    }\n\n");
        
    	///////////////////////////////////////////////////////////////////////

        // On demand accessors
    	for(RunContextItem rci: activity.getUsesRunContextItemIterable()){
    		out.write(rci.getOnDemandMethod());
    	}
    	
    	// Fire event methods
    	out.write(activity.getFireMethods());
    	
    	// Communications methods
        out.write(activity.getCommsMethods());
        
        out.write(activity.getAbstractMethods());

    	out.write("}\n\n");

        out.close();
	}
	
	/**
	 * We generate the initial extended version of the activity if it doesn't already exist. This
	 * just saves time when you're getting started.
	 * @param extendir the directory just above where the MVW configuration is defined
	 * @param activity the activity being created
	 * @throws IOException 
	 */
	static void formatInitialActivity(String extendir, Activity activity) throws IOException {
		StringBuilder outdir = new StringBuilder(extendir);
		
		if (activity.getSubpackage() != null) {
			ArrayList<String>	tokens = CheapSplitter.split(activity.getSubpackage(), '.', false, true);
			for(String token: tokens) {
				outdir.append(File.separator + token);
			}
		}
		
		File dir = new File(outdir.toString());
		
		if (!dir.exists()) {
			DebugInfo.debug("Creating extended code directory:" + outdir.toString());
			dir.mkdirs();
		}
		
		String	fn		= outdir.toString() + File.separator + activity.getActivityName() + ".java";
		File		file 	= new File(fn);
		
		if (!file.exists()) {
			// NOTE: WE DON'T USE THE FileUpdateManager WHEN WRITING THESE FILES - otherwise, we wind up
			// with problems of removing files that were previously dumped to the output directory, which
			// is not what we want. The FileUpdateManager is only used for directories where all content 
			// is generated.
			BufferedWriter 	out = new BufferedWriter(new FileWriter(fn));

	        out.write("package " + activity.getExtendedClassPackage() + ";\n\n");
	        
	        out.write("import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;\n");
	        out.write("import " + activity.getBaseImplImport() + ";\n\n");
	        
			out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        out.write("public class " + activity.getActivityName() + " extends " + activity.getActivityName() + "BaseImpl {\n\n");
	        
	        out.write("    public " + activity.getActivityName() + "(MvwRunContextIF rc){\n");
	        out.write("        super(rc);\n");
	        out.write("    }\n");

	        out.write("}\n\n");
	        
	        out.write("\n");
	        
	        out.close();
		
		}
		
	}
	
}
