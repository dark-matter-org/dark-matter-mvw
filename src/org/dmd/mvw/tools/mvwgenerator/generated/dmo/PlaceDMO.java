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
import java.io.Serializable;                                                        // Always required - (GenUtility.java:227)
import org.dmd.dmc.DmcAttribute;                                                    // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                                // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                                         // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                                    // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                               // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.CamelCaseName;                                             // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                          // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringSV;                                 // Required type - (GenUtility.java:339)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActivityDMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;               // Base class - (GenUtility.java:367)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ActivityREF;                  // Helper class - (GenUtility.java:346)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeActivityREFSV;         // Reference type - (GenUtility.java:311)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class PlaceDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Place";


    static {
    }

    public PlaceDMO() {
        super("Place");
    }

    protected PlaceDMO(String oc) {
        super(oc);
    }

    @Override
    public PlaceDMO getNew(){
        PlaceDMO rc = new PlaceDMO();
        return(rc);
    }

    @Override
    public PlaceDMO getSlice(DmcSliceInfo info){
        PlaceDMO rc = new PlaceDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public PlaceDMO(DmcTypeModifierMV mods) {
        super("Place");
        modrec(true);
        setModifier(mods);
    }

    public PlaceDMO getModificationRecorder(){
        PlaceDMO rc = new PlaceDMO();
        rc.setPlaceName(getPlaceName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__placeName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__placeName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof PlaceDMO){
            return( getObjectName().equals( ((PlaceDMO) obj).getObjectName()) );
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
    public CamelCaseName getPlaceName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__placeName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets placeName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setPlaceName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__placeName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__placeName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__placeName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets placeName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setPlaceName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__placeName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__placeName);
        
        attr.set(value);
        set(MvwDMSAG.__placeName,attr);
    }

    /**
     * Removes the placeName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remPlaceName(){
         rem(MvwDMSAG.__placeName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public String getPlacePrefix(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__placePrefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setPlacePrefix(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__placePrefix);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__placePrefix);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__placePrefix,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setPlacePrefix(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__placePrefix);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__placePrefix);
        
        attr.set(value);
        set(MvwDMSAG.__placePrefix,attr);
    }

    /**
     * Removes the placePrefix attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remPlacePrefix(){
         rem(MvwDMSAG.__placePrefix);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:660)
    public ActivityREF getRunsActivity(){
        DmcTypeActivityREFSV attr = (DmcTypeActivityREFSV) get(MvwDMSAG.__runsActivity);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to Activity without attempting lazy resolution (if turned on).
     */
    public ActivityREF getRunsActivityREF(){
        DmcTypeActivityREFSV attr = (DmcTypeActivityREFSV) get(MvwDMSAG.__runsActivity);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets runsActivity to the specified value.
     * @param value ActivityDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:714)
    public void setRunsActivity(ActivityDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__runsActivity);
        if (attr == null)
            attr = new DmcTypeActivityREFSV(MvwDMSAG.__runsActivity);
        else
            ((DmcTypeActivityREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(MvwDMSAG.__runsActivity,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets runsActivity to the specified value.
     * @param value A value compatible with DmcTypeActivityREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setRunsActivity(Object value) throws DmcValueException {
        DmcTypeActivityREFSV attr  = (DmcTypeActivityREFSV) get(MvwDMSAG.__runsActivity);
        if (attr == null)
            attr = new DmcTypeActivityREFSV(MvwDMSAG.__runsActivity);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(MvwDMSAG.__runsActivity,attr);
    }

    /**
     * Removes the runsActivity attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remRunsActivity(){
         rem(MvwDMSAG.__runsActivity);
    }




}
