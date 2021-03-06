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
package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                  // Always required - (GenUtility.java:227)
import org.dmd.dmc.DmcAttribute;                                              // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcSliceInfo;                                              // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                         // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.CamelCaseName;                                       // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                    // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type - (GenUtility.java:339)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Base class - (GenUtility.java:367)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The PropertyAccessGenerator allows for the specification of the code\n
 * generation extension that generates property access code mechanisms for a
 * particular\n widget set.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class PropertyAccessGeneratorDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "PropertyAccessGenerator";


    static {
    }

    public PropertyAccessGeneratorDMO() {
        super("PropertyAccessGenerator");
    }

    protected PropertyAccessGeneratorDMO(String oc) {
        super(oc);
    }

    @Override
    public PropertyAccessGeneratorDMO getNew(){
        PropertyAccessGeneratorDMO rc = new PropertyAccessGeneratorDMO();
        return(rc);
    }

    @Override
    public PropertyAccessGeneratorDMO getSlice(DmcSliceInfo info){
        PropertyAccessGeneratorDMO rc = new PropertyAccessGeneratorDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public PropertyAccessGeneratorDMO(DmcTypeModifierMV mods) {
        super("PropertyAccessGenerator");
        modrec(true);
        setModifier(mods);
    }

    public PropertyAccessGeneratorDMO getModificationRecorder(){
        PropertyAccessGeneratorDMO rc = new PropertyAccessGeneratorDMO();
        rc.setCamelCaseName(getCamelCaseName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__camelCaseName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__camelCaseName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof PropertyAccessGeneratorDMO){
            return( getObjectName().equals( ((PropertyAccessGeneratorDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:784)
    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public CamelCaseName getCamelCaseName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MetaDMSAG.__camelCaseName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setCamelCaseName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__camelCaseName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MetaDMSAG.__camelCaseName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__camelCaseName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setCamelCaseName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MetaDMSAG.__camelCaseName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MetaDMSAG.__camelCaseName);
        
        attr.set(value);
        set(MetaDMSAG.__camelCaseName,attr);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remCamelCaseName(){
         rem(MetaDMSAG.__camelCaseName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public String getPropertyAccessGeneratorClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__propertyAccessGeneratorClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets propertyAccessGeneratorClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setPropertyAccessGeneratorClass(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__propertyAccessGeneratorClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__propertyAccessGeneratorClass);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__propertyAccessGeneratorClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets propertyAccessGeneratorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setPropertyAccessGeneratorClass(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__propertyAccessGeneratorClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__propertyAccessGeneratorClass);
        
        attr.set(value);
        set(MvwDMSAG.__propertyAccessGeneratorClass,attr);
    }

    /**
     * Removes the propertyAccessGeneratorClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remPropertyAccessGeneratorClass(){
         rem(MvwDMSAG.__propertyAccessGeneratorClass);
    }




}
