//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2018 dark-matter-data committers
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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.types.EditField;    // base type import
import org.dmd.mvw.tools.mvwgenerator.types.DmcTypeEditField;    // DmcType import
/**
 * The DmcTypeEditFieldSV provides storage for a single-valued EditField
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2151)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpTypes(DmoTypeFormatter.java:100)
 */
@SuppressWarnings("serial")
public class DmcTypeEditFieldSV extends DmcTypeEditField implements Serializable {
    
    protected EditField value;
    
    public DmcTypeEditFieldSV(){
    
    }
    
    public DmcTypeEditFieldSV(DmcAttributeInfo ai){
        super(ai);
    }
    
    public DmcTypeEditFieldSV getNew(){
        return(new DmcTypeEditFieldSV(getAttributeInfo()));
    }
    
    public DmcTypeEditFieldSV getNew(DmcAttributeInfo ai){
        return(new DmcTypeEditFieldSV(ai));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2183)
    public DmcAttribute<EditField> cloneIt(){
        DmcTypeEditFieldSV rc = getNew();
        rc.value = value;
        return(rc);
    }
    
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2194)
    public EditField getSVCopy(){
        if (value == null)
            return(null);
        return(cloneValue(value));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpSVType(GenUtility.java:2206)
    public EditField set(Object v) throws DmcValueException {
        EditField rc = typeCheck(v);
        // We only return a value if the value actually changed. This supports
        // the applyModifier() mechanism on DmcObject where we only return true
        // if something changed as a result of the modifier
        if (value == null)
            value = rc;
        else{
            if (value.equals(rc))
                rc = null;
            else
                value = rc;
        }
        return(rc);
    }
    
    @Override
    public EditField getSV(){
        return(value);
    }
    
    @Override
    public int getMVSize(){
        return(0);
    }
    
}

