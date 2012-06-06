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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:368)
import java.io.Serializable;                                                        // Always required - (GenUtility.java:197)
import java.util.*;                                                                 // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                                    // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcNamedObjectIF;                                                // Named object - (GenUtility.java:348)
import org.dmd.dmc.DmcOmni;                                                         // Lazy resolution - (GenUtility.java:293)
import org.dmd.dmc.DmcSliceInfo;                                                    // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                                               // Any attributes - (GenUtility.java:214)
import org.dmd.dmc.types.CamelCaseName;                                             // Naming attribute type - (GenUtility.java:343)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                          // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dms.generated.types.DmcTypeStringSV;                                 // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActivityDMO;                    // Type specific set/add - (GenUtility.java:280)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;               // Base class - (GenUtility.java:328)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ActivityREF;                  // Helper class - (GenUtility.java:308)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeActivityREFSV;         // Reference type - (GenUtility.java:273)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * null
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class PlaceDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Place";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public PlaceDMO() {
        super("Place");
    }

    protected PlaceDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
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

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__placeName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__placeName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof PlaceDMO){
            return( getObjectName().equals( ((PlaceDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remPlaceName(){
         rem(MvwDMSAG.__placeName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remPlacePrefix(){
         rem(MvwDMSAG.__placePrefix);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:676)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remRunsActivity(){
         rem(MvwDMSAG.__runsActivity);
    }




}
