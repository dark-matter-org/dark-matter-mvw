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
package org.dmd.mvw.tools.mvwgenerator.extended;

import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.ClassDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MvwDefinitionDMW;
import org.dmd.mvw.tools.mvwgenerator.util.MvwDefinitionManager;

abstract public class MvwDefinition extends MvwDefinitionDMW {
	
	public MvwDefinition(){
		
	}

	protected MvwDefinition(MvwDefinitionDMO obj, ClassDefinition cd){
		super(obj,cd);
	}

	public void resolveReferences(MvwDefinitionManager mvwDefinitionManager, MvwDefinitionManager mvwDefinitionManager2) throws DmcValueExceptionSet {
		super.resolveReferences(mvwDefinitionManager, mvwDefinitionManager2);
		
	}
	
}
