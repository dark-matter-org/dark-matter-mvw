//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dmp.server.servlet.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                  // Always required - (GenUtility.java:220)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcHierarchicNamedObjectIF;                // Named object - (GenUtility.java:369)
import org.dmd.dmc.DmcNamedObjectIF;                          // Named object - (GenUtility.java:371)
import org.dmd.dmc.DmcObject;                                 // Structural class - (GenUtility.java:347)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.DotName;                             // Naming attribute type - (GenUtility.java:366)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeDotNameSV;          // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:223)

/**
 * The UserFolderRI provides for a grouping of UserRI objects.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class UserFolderRIDMO  extends DmcObject  implements DmcNamedObjectIF, DmcHierarchicNamedObjectIF, Serializable  {

    public final static String constructionClassName = "UserFolderRI";


    static {
    }

    public UserFolderRIDMO() {
        super("UserFolderRI");
    }

    protected UserFolderRIDMO(String oc) {
        super(oc);
    }

    @Override
    public UserFolderRIDMO getNew(){
        UserFolderRIDMO rc = new UserFolderRIDMO();
        return(rc);
    }

    @Override
    public UserFolderRIDMO getSlice(DmcSliceInfo info){
        UserFolderRIDMO rc = new UserFolderRIDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UserFolderRIDMO(DmcTypeModifierMV mods) {
        super("UserFolderRI");
        modrec(true);
        setModifier(mods);
    }

    public UserFolderRIDMO getModificationRecorder(){
        UserFolderRIDMO rc = new UserFolderRIDMO();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public DotName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__dotName);
        if (name != null)
            return((DotName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:755)
    public DotName getHierarchicObjectName(){
        return(getObjectName());
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:761)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__dotName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public boolean equals(Object obj){
        if (obj instanceof UserFolderRIDMO){
            return( getObjectName().equals( ((UserFolderRIDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public int hashCode(){
        DotName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setDotName(DotName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__dotName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setDotName(Object value) throws DmcValueException {
        DmcTypeDotNameSV attr  = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remDotName(){
         rem(MetaDMSAG.__dotName);
    }




}