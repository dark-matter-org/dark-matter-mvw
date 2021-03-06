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
import org.dmd.dms.doc.web.Converter;
import org.dmd.mvw.tools.mvwgenerator.extended.Event;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;

public class EventFormatter {

	static public void dumpEventSummary(Event event, BufferedWriter out) throws IOException {
//		DebugInfo.debug("\n\n" + event.getBackRefs());
		
//		event.showReferences();
		
		out.write("        <tr>\n");
		
		out.write("            <td> <div class=\"eventName\">" + event.getEventName() + "</div>\n");
		out.write("            " + StandardParts.moduleLink(event.getDefinedInModule()) + "\n");
		out.write("            </td>\n");
		
		out.write("            <td colspan=\"2\" class=\"description\">");
		if (event.getArgVector().length() > 2){
			out.write("            <div class=\"argvector\">" + event.getArgVector() + " </div> <p/> \n");
		}
		
		if (event.getDescriptionHasValue()) {
			// TODO: should be able to get the description with new lines
			out.write("            " + Converter.convert(event.getDescriptionIterable()) + "\n");
		}
		out.write("            </td>\n");
		
		out.write("        </tr>\n");
		
		out.write("        <tr>\n");
		out.write("            <td>\n");
		out.write("            </td>\n");
		out.write("            <td>\n");
		out.write("                <table>\n");
		if (event.getFiredBy().size() > 0){
			out.write("                    <tr>");
			out.write("                        <td> Fired by:");
			out.write("                        </td>\n");
			out.write("                        <td>\n");
			
			for(MvwDefinition def: event.getFiredBy().values()){
				out.write(StandardParts.definitionLink(def) + " ");
			}
			
			out.write("                        </td>\n");
			out.write("                    </tr>\n");
		}
		
		if (event.getLocallyFired().size() > 0){
			out.write("                    <tr>\n");
			out.write("                        <td> Fired locally by:");
			out.write("                        </td>\n");
			out.write("                        <td>");
			
			TreeMap<CamelCaseName,MvwDefinition>	presenters = new TreeMap<CamelCaseName, MvwDefinition>();
			
			for(MvwDefinition def: event.getLocallyFired().values()){
				out.write(StandardParts.definitionLink(def) + " ");
				ArrayList<DmcObject> managedBy = def.getDMO().getReferringObjectsViaAttribute(MvwDMSAG.__managesView);
				for(DmcObject obj: managedBy){
					MvwDefinition md = (MvwDefinition) obj.getContainer();
					presenters.put(md.getCamelCaseName(), md);
				}
//				DebugInfo.debug(def.getBackRefs());
//				DebugInfo.debug("---------------------------------------");
			}
			
			out.write("                        </td>\n");
			out.write("                    </tr>\n");
			
			out.write("                    <tr>\n");
			out.write("                        <td> Handled by:");
			out.write("                        </td>\n");
			out.write("                        <td>\n");
			
			for(MvwDefinition def: presenters.values()){
				out.write(StandardParts.definitionLink(def) + " ");
			}
			
			out.write("                        </td>");
			out.write("                    </tr>");
			
		}
		
		
		if (event.getHandledBy().size() > 0){
			out.write("                    <tr>");
			out.write("                        <td> Handled by:");
			out.write("                        </td>");
			out.write("                        <td>");
			
			for(MvwDefinition def: event.getHandledBy().values()){
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
