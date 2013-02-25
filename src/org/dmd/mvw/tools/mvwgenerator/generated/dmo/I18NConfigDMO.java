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
package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                                   // Always required - (GenUtility.java:220)
import org.dmd.dmc.DmcAttribute;                                               // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcNamedObjectIF;                                           // Named object - (GenUtility.java:371)
import org.dmd.dmc.DmcSliceInfo;                                               // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                                          // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.CamelCaseName;                                        // Naming attribute type - (GenUtility.java:366)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                    // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                     // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                          // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO;         // Base class - (GenUtility.java:351)

/**
 * The I18NConfig is a specialized RunContextItem that indicates an
 * interface\n class used to access internationalized constants or messages.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class I18NConfigDMO  extends RunContextItemDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "I18NConfig";


    static {
    }

    public I18NConfigDMO() {
        super("I18NConfig");
    }

    protected I18NConfigDMO(String oc) {
        super(oc);
    }

    @Override
    public I18NConfigDMO getNew(){
        I18NConfigDMO rc = new I18NConfigDMO();
        return(rc);
    }

    @Override
    public I18NConfigDMO getSlice(DmcSliceInfo info){
        I18NConfigDMO rc = new I18NConfigDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public I18NConfigDMO(DmcTypeModifierMV mods) {
        super("I18NConfig");
        modrec(true);
        setModifier(mods);
    }

    public I18NConfigDMO getModificationRecorder(){
        I18NConfigDMO rc = new I18NConfigDMO();
        rc.setItemName(getItemName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__itemName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:761)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__itemName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public boolean equals(Object obj){
        if (obj instanceof I18NConfigDMO){
            return( getObjectName().equals( ((I18NConfigDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public CamelCaseName getItemName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__itemName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets itemName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setItemName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__itemName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__itemName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__itemName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets itemName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setItemName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__itemName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__itemName);
        
        attr.set(value);
        set(MvwDMSAG.__itemName,attr);
    }

    /**
     * Removes the itemName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remItemName(){
         rem(MvwDMSAG.__itemName);
    }




}
