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
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.types.CamelCaseName;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;
import org.dmd.util.formatting.CodeFormatter;

public class RunContextItemFormatter {

	static public void dumpRCISummary(RunContextItem rci, BufferedWriter out) throws IOException {
//		DebugInfo.debug("\n\n" + event.getBackRefs());
		
//		event.showReferences();
		
		out.write("        <tr>\n");
		
		out.write("            <td> <div class=\"eventName\">" + rci.getItemName() + "</div>\n");
		out.write("            " + StandardParts.moduleLink(rci.getDefinedInModule()) + "\n");
		out.write("            </td>\n");
		
		out.write("            <td colspan=\"2\" class=\"description\">");
		
		out.write("            <div class=\"argvector\">" + CodeFormatter.foldFullyQualified(rci.getUseClass(), 90) + " </div> <p/> \n");
		
		out.write("            " + rci.getDescription() + "\n");
		out.write("            </td>\n");
		
		out.write("        </tr>\n");
		
		out.write("        <tr>\n");
		out.write("            <td>\n");
		out.write("            </td>\n");
		out.write("            <td>\n");
		out.write("                <table>\n");
		
		if (rci.isReferenced()){
			TreeMap<CamelCaseName,MvwDefinition>	users = new TreeMap<CamelCaseName, MvwDefinition>();
			
			ArrayList<DmcObject> managedBy = rci.getDMO().getReferringObjectsViaAttribute(MvwDMSAG.__usesRunContextItem);
			for(DmcObject obj: managedBy){
				MvwDefinition md = (MvwDefinition) obj.getContainer();
				users.put(md.getCamelCaseName(), md);
			}
						
			out.write("                    <tr>\n");
			out.write("                        <td> Used by:");
			out.write("                        </td>\n");
			out.write("                        <td>\n");
			
			for(MvwDefinition def: users.values()){
				out.write(StandardParts.definitionLink(def) + " ");
			}
			
			out.write("                        </td>");
			out.write("                    </tr>");
			
		}
		
		out.write("                </table>\n");
		out.write("            </td>\n");
		out.write("        </tr>\n");
		
	}
	
	
}
