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

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.dmd.dmc.DmcOmni;
import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.util.MvwDefinitionManager;
import org.dmd.util.exceptions.DebugInfo;

public class MvwHtmlDocGenerator {
	
	String outdir;
	
	MvwDefinitionManager defManager;

	public MvwHtmlDocGenerator(MvwDefinitionManager dm){
		defManager = dm;
	}

	public void dumpDocumentation(String od) throws IOException {
		outdir = od + File.separator + "mvw";
		
		DebugInfo.debug("Generating MVW documentation: " + outdir);
		
		Summarizer summary = new Summarizer(defManager,od);
		
		initDirs();

		URL url = this.getClass().getResource("mvwstyle.css");
		DebugInfo.debug("url: " + url.getFile());
		FileUtils.copyURLToFile(url, new File(outdir + File.separator + "mvwstyle.css"));
		
		DmcOmni.instance().backRefTracking(true);
		defManager.prepAggregatedInfo();
		
		for (Module module: defManager.getModules().values()){
			ModulePage.dumpModule(outdir, module, summary);
		}
		
		summary.dumpSummaryFiles();
	}
	
	void initDirs(){
		File dmsdocdir = new File(outdir);
		if (!dmsdocdir.exists())
			dmsdocdir.mkdir();
	}

}
