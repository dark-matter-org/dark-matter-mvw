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

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dmc.types.CamelCaseName;

import org.dmd.mvw.tools.mvwgenerator.generated.types.MvwDefinitionREF;

import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvwDefinition
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:583)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMvwDefinitionREF extends DmcTypeNamedObjectREF<MvwDefinitionREF, CamelCaseName> {

    public DmcTypeMvwDefinitionREF(){
    
    }

    public DmcTypeMvwDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected MvwDefinitionREF getNewHelper(){
        return(new MvwDefinitionREF());
    }

    @Override
    protected CamelCaseName getNewName(){
        return(new CamelCaseName());
    }

    @Override
    protected String getDMOClassName(){
        return( MvwDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof MvwDefinitionDMO)
            return(true);
        return(false);
    }

    @Override
    protected MvwDefinitionREF typeCheck(Object value) throws DmcValueException {
        MvwDefinitionREF rc = null;

        if (value instanceof MvwDefinitionREF)
            rc = (MvwDefinitionREF)value;
        else if (value instanceof MvwDefinitionDMO)
            rc = new MvwDefinitionREF((MvwDefinitionDMO)value);
        else if (value instanceof CamelCaseName)
            rc = new MvwDefinitionREF((CamelCaseName)value);
        else if (value instanceof String)
            rc = new MvwDefinitionREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MvwDefinitionREF, MvwDefinitionDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, MvwDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public MvwDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        MvwDefinitionREF rc = new MvwDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public MvwDefinitionREF cloneValue(MvwDefinitionREF value){
        return(new MvwDefinitionREF(value));
    }



}
