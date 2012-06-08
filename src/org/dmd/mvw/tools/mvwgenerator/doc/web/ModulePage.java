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
package org.dmd.mvw.tools.mvwgenerator.doc.web;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

import org.dmd.dmc.types.CamelCaseName;
import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;

/**
 * The ModulePage class will format the information for a single module with a navigation
 * area to access all modules associated with a particular project.
 */
public class ModulePage {

	static public void dumpModule(String outdir, Module module, Summarizer summarizer) throws IOException {
		module.initAssociatedDefintions();

		String ofn = outdir + File.separator + module.getCamelCaseName() + ".html";
		BufferedWriter out = new BufferedWriter( new FileWriter(ofn) );
		
		StandardParts.writePageHeader(out, "The " + module.getCamelCaseName() + " Module");
		
		StandardParts.writeContentStart(out);
		
		dumpModule(module, out);
		
		dumpIndex(module, out);

		StandardParts.writeContentEnd(out);

		out.write(summarizer.getSideBar());

		StandardParts.writePageFooter(out);

		out.close();
	}
	
	static void dumpModule(Module module, BufferedWriter out) throws IOException {
		out.write("      <div class=\"module-name\">" + module.getCamelCaseName() + " </div>\n\n");
		out.write("      <div class=\"description\">" + module.getDescription() + " </div>\n\n");
	}
	
	static void dumpIndex(Module module, BufferedWriter out) throws IOException {
		
		if (module.getApplications().size() > 0){
			writeSummary("Applications", module.getApplications(), out);
		}
		if (module.getControllers().size() > 0){
			writeSummary("Controllers", module.getControllers(), out);
		}
		if (module.getPresenters().size() > 0){
			writeSummary("Presenters", module.getPresenters(), out);
		}
		if (module.getViews().size() > 0){
			writeSummary("Views", module.getViews(), out);
		}
		if (module.getPlaces().size() > 0){
			writeSummary("Places", module.getPlaces(), out);
		}
		if (module.getActivities().size() > 0){
			writeSummary("Activities", module.getActivities(), out);
		}
		if (module.getContextItems().size() > 0){
			writeSummary("Run Context Items", module.getContextItems(), out);
		}
		if (module.getBindings().size() > 0){
			writeSummary("Form Bindings", module.getBindings(), out);
		}
		if (module.getEditors().size() > 0){
			writeSummary("Field Editors", module.getEditors(), out);
		}
	}
	
	static void writeSummary(String title, TreeMap<CamelCaseName,? extends MvwDefinition> defs, BufferedWriter out) throws IOException{
		out.write("    <div class=\"definitionList\">\n");
		out.write("    <h2> " + title + "</h2>\n");
		out.write("    <table>\n");
		
		for(MvwDefinition def: defs.values()){
			out.write("      <tr>\n");
			out.write("      <td class=\"spacer\"> </td>\n");
			out.write("      <td> <a class=\"deflink\" href=\"#" + def.getCamelCaseName() + "\"> " + def.getCamelCaseName() + " </a></td>\n");
			out.write("      </tr>\n");
		}
		
		out.write("    </table>\n");
		out.write("    </div>");
		
	}
	
	static void dumpDetails(Module module, BufferedWriter out) throws IOException {
		if (module.getApplications().size() > 0){
			
		}
		if (module.getControllers().size() > 0){
			
		}
		if (module.getPresenters().size() > 0){
			
		}
		if (module.getViews().size() > 0){
			
		}
		if (module.getPlaces().size() > 0){
			
		}
		if (module.getActivities().size() > 0){
			
		}
		if (module.getContextItems().size() > 0){
			
		}
		if (module.getBindings().size() > 0){
			
		}
		if (module.getEditors().size() > 0){
			
		}
	}
}
