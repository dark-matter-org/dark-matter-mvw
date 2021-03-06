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
package org.dmd.mvw.tools.mvwgenerator.extended.menus;

import org.dmd.mvw.tools.mvwgenerator.extended.CodeGenComponentIF;
import org.dmd.mvw.tools.mvwgenerator.extended.Component;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ActionBindingDMW;
import org.dmd.util.codegen.ImportManager;

public class ActionBinding extends ActionBindingDMW implements CodeGenComponentIF {
	
	boolean			initialized;
	ImportManager	imports;

	public ActionBinding(){
		
	}
	
	public String getImports(){
		return(imports.getFormattedImports());
	}
	
	public void initCodeGenInfo(){
		
		if (!initialized){
			initialized = true;
			imports = new ImportManager();		
	
			imports.addImport("org.dmd.mvw.client.mvwmenus.base.Action", "Base class");
			imports.addImport("org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF", "Trigger interface");
			
			Component component = getImplementedBy();
			String genPackage = component.getDefinedInModule().getGenPackage();	
			String compImport = genPackage + ".generated.mvw." + component.genSubPackage() + "." + component.getComponentName() + "BaseImpl";
			
			imports.addImport(compImport, "Implementing component");
		}
		
	}

	@Override
	public void resetCodeGenInfo() {
		initialized = false;
		imports		= null;
		
	}
}
