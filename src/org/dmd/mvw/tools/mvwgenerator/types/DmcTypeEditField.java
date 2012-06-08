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
package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcHashedAttribute;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
abstract public class DmcTypeEditField  extends DmcHashedAttribute<EditField> implements Serializable {

	public DmcTypeEditField(){
		
	}
	
	public DmcTypeEditField(DmcAttributeInfo ai){
		super(ai);
	}

	@Override
	public EditField cloneValue(EditField original) {
		return(new EditField(original));
	}

	@Override
	public EditField deserializeValue(DmcInputStreamIF dis) throws Exception {
		EditField rc = new EditField();
		rc.deserializeIt(dis);
		return(rc);
	}

	@Override
	public void serializeValue(DmcOutputStreamIF dos, EditField value) throws Exception {
		value.serializeIt(dos);
	}

	@Override
	public EditField typeCheck(Object value) throws DmcValueException {
		if (value instanceof EditField)
			return((EditField)value);
		if (value instanceof String)
			return(new EditField((String)value));
		throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with EditField or String expected."));
	}
	
	

}
