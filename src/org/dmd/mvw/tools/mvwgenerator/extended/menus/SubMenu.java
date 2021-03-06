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

import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.SubMenuDMW;
import org.dmd.mvw.tools.mvwgenerator.util.RunContextItemCollection;
import org.dmd.util.exceptions.ResultException;

public class SubMenu extends SubMenuDMW {

	RunContextItem I18NRCI;
	String label;

	public SubMenu(){
		
	}
	
	public String getLabelForCreation(){
		return(label);
	}
	
	public RunContextItem getRCI(){
		return(I18NRCI);
	}
	
	public void initLabelInfo(RunContextItemCollection context) throws ResultException {
		if (getDisplayLabel() == null){
			if (getDisplayLabelI18N() == null){
				ResultException errors  = new ResultException();
				errors.addError("The " + getElementName() + " SubMenu must have either a displayLabel or a displayLabelI18N defined.");
				errors.result.lastResult().fileName(getFile());
				errors.result.lastResult().lineNumber(getLineNumber());			
				throw(errors);
			}
			int period = getDisplayLabelI18N().indexOf(".");
			if (period == -1){
				ResultException errors  = new ResultException();
				errors.addError("The " + getElementName() + " SubMenu has a malformed displayLabelI18N: " + getDisplayLabelI18N());
				errors.result.lastResult().fileName(getFile());
				errors.result.lastResult().lineNumber(getLineNumber());			
				throw(errors);
			}
			String rciString = getDisplayLabelI18N().substring(0, period).trim();
			
			RunContextItem rci = context.getItem(rciString);
			
			if (rci == null){
				ResultException errors  = new ResultException();
				errors.addError("The " + getElementName() + " SubMenu refers to an unknown RunContextItem in its displayLabelI18N: " + rciString);
				errors.result.lastResult().fileName(getFile());
				errors.result.lastResult().lineNumber(getLineNumber());			
				throw(errors);
			}
			I18NRCI = rci;
			
			label = getDisplayLabelI18N();
		}
		else{
			I18NRCI = null;
			label = "\"" + getDisplayLabel() + "\"";
		}
	}

}
