//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

import org.dmd.mvw.tools.mvwgenerator.generated.types.EnumMappingGeneratorREF;

import org.dmd.mvw.tools.mvwgenerator.generated.dmo.EnumMappingGeneratorDMO;

/**
 * This is the generated DmcAttribute derivative for values of type EnumMappingGenerator
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREFHelperType(DmoTypeFormatter.java:585)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeEnumMappingGeneratorREF extends DmcTypeNamedObjectREF<EnumMappingGeneratorREF, CamelCaseName> {

    public DmcTypeEnumMappingGeneratorREF(){
    
    }

    public DmcTypeEnumMappingGeneratorREF(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected EnumMappingGeneratorREF getNewHelper(){
        return(new EnumMappingGeneratorREF());
    }

    @Override
    protected CamelCaseName getNewName(){
        return(new CamelCaseName());
    }

    @Override
    protected String getDMOClassName(){
        return( EnumMappingGeneratorDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof EnumMappingGeneratorDMO)
            return(true);
        return(false);
    }

    @Override
    protected EnumMappingGeneratorREF typeCheck(Object value) throws DmcValueException {
        EnumMappingGeneratorREF rc = null;

        if (value instanceof EnumMappingGeneratorREF)
            rc = (EnumMappingGeneratorREF)value;
        else if (value instanceof EnumMappingGeneratorDMO)
            rc = new EnumMappingGeneratorREF((EnumMappingGeneratorDMO)value);
        else if (value instanceof CamelCaseName)
            rc = new EnumMappingGeneratorREF((CamelCaseName)value);
        else if (value instanceof String)
            rc = new EnumMappingGeneratorREF((String)value);
        else
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with EnumMappingGeneratorREF, EnumMappingGeneratorDMO or String expected."));

        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, EnumMappingGeneratorREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public EnumMappingGeneratorREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        EnumMappingGeneratorREF rc = new EnumMappingGeneratorREF();
        rc.deserializeIt(dis);
        return(rc);
    }

    @Override
    public EnumMappingGeneratorREF cloneValue(EnumMappingGeneratorREF value){
        return(new EnumMappingGeneratorREF(value));
    }



}