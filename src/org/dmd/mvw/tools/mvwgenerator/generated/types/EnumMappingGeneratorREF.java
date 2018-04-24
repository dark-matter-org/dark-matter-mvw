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

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF; // base import
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.EnumMappingGeneratorDMO; // primitive type
import org.dmd.dmc.types.CamelCaseName;
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV; 

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.DataTypeEnum;
/**
 * This is the generated DmcAttribute derivative for values of type EnumMappingGenerator
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:420)
 */
@SuppressWarnings("serial")
public class EnumMappingGeneratorREF extends DmcNamedObjectNontransportableREF<EnumMappingGeneratorDMO> {

    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    
    DmcTypeCamelCaseNameSV myName;    
    
    public EnumMappingGeneratorREF(){
    }

    public EnumMappingGeneratorREF(EnumMappingGeneratorDMO o){
         object = o;
         myName = (DmcTypeCamelCaseNameSV)o.getObjectNameAttribute();
    }

    public EnumMappingGeneratorREF(CamelCaseName n) throws DmcValueException {
         object = null;
         myName = new DmcTypeCamelCaseNameSV(__camelCaseName);
         myName.set(n);
    }

    public EnumMappingGeneratorREF(String n) throws DmcValueException {
         object = null;
         myName = new DmcTypeCamelCaseNameSV(__camelCaseName);
         myName.set(n);
    }

    public EnumMappingGeneratorREF(EnumMappingGeneratorREF original){
        myName = original.myName;
        object = original.object;
    }

    public void setObject(EnumMappingGeneratorDMO o){
         object = o;
         if (object != null)
             myName = (DmcTypeCamelCaseNameSV)o.getObjectNameAttribute();
    }

    /**
     * Clones this reference.
     */
    public EnumMappingGeneratorREF cloneMe(){
        EnumMappingGeneratorREF rc = new EnumMappingGeneratorREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectName n) throws DmcValueException {
        if (myName == null)
            myName = new DmcTypeCamelCaseNameSV(__camelCaseName);
        myName.set(n);
    }

    public DmcObjectName getObjectName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    public CamelCaseName getName(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName.getSV());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        if (myName == null)
            throw(new IllegalStateException("You've tried to access the name of an object but the name attribute hasn't been set."));
        
        return(myName);
    }

    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        myName.serializeIt(dos);
    }

    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        myName = (DmcTypeCamelCaseNameSV) dis.getAttributeInstance();
        myName.deserializeIt(dis);
    }

}
