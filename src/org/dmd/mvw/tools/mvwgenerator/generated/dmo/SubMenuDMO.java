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
import java.io.Serializable;                                                    // Always required - (GenUtility.java:227)
import org.dmd.dmc.DmcAttribute;                                                // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                            // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                                     // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                                // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                           // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.CamelCaseName;                                         // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                      // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                           // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringSV;                             // Required type - (GenUtility.java:339)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuDMO;                    // Base class - (GenUtility.java:367)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeMenuREFSV;         // Reference type - (GenUtility.java:311)
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuREF;                  // Helper class - (GenUtility.java:346)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The SubMenu is used to define a submenu that is included as part of a Menu.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class SubMenuDMO  extends MenuDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "SubMenu";


    static {
    }

    public SubMenuDMO() {
        super("SubMenu");
    }

    protected SubMenuDMO(String oc) {
        super(oc);
    }

    @Override
    public SubMenuDMO getNew(){
        SubMenuDMO rc = new SubMenuDMO();
        return(rc);
    }

    @Override
    public SubMenuDMO getSlice(DmcSliceInfo info){
        SubMenuDMO rc = new SubMenuDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public SubMenuDMO(DmcTypeModifierMV mods) {
        super("SubMenu");
        modrec(true);
        setModifier(mods);
    }

    public SubMenuDMO getModificationRecorder(){
        SubMenuDMO rc = new SubMenuDMO();
        rc.setElementName(getElementName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__elementName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__elementName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof SubMenuDMO){
            return( getObjectName().equals( ((SubMenuDMO) obj).getObjectName()) );
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:796)
    public String getDisplayLabel(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__displayLabel);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
    public void setDisplayLabel(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__displayLabel);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__displayLabel);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__displayLabel,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setDisplayLabel(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__displayLabel);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__displayLabel);
        
        attr.set(value);
        set(MvwDMSAG.__displayLabel,attr);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remDisplayLabel(){
         rem(MvwDMSAG.__displayLabel);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:796)
    public String getDisplayLabelI18N(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__displayLabelI18N);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets displayLabelI18N to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
    public void setDisplayLabelI18N(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__displayLabelI18N);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__displayLabelI18N);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__displayLabelI18N,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets displayLabelI18N to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setDisplayLabelI18N(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__displayLabelI18N);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__displayLabelI18N);
        
        attr.set(value);
        set(MvwDMSAG.__displayLabelI18N,attr);
    }

    /**
     * Removes the displayLabelI18N attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remDisplayLabelI18N(){
         rem(MvwDMSAG.__displayLabelI18N);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:796)
    public String getUseImpl(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__useImpl);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useImpl to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
    public void setUseImpl(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__useImpl);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useImpl);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__useImpl,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useImpl to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setUseImpl(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__useImpl);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useImpl);
        
        attr.set(value);
        set(MvwDMSAG.__useImpl,attr);
    }

    /**
     * Removes the useImpl attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remUseImpl(){
         rem(MvwDMSAG.__useImpl);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:796)
    public CamelCaseName getElementName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__elementName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
    public void setElementName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__elementName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__elementName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__elementName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setElementName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__elementName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__elementName);
        
        attr.set(value);
        set(MvwDMSAG.__elementName,attr);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remElementName(){
         rem(MvwDMSAG.__elementName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:667)
    public MenuREF getAddToMenu(){
        DmcTypeMenuREFSV attr = (DmcTypeMenuREFSV) get(MvwDMSAG.__addToMenu);
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
     * Returns the reference to Menu without attempting lazy resolution (if turned on).
     */
    public MenuREF getAddToMenuREF(){
        DmcTypeMenuREFSV attr = (DmcTypeMenuREFSV) get(MvwDMSAG.__addToMenu);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets addToMenu to the specified value.
     * @param value MenuDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
    public void setAddToMenu(MenuDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__addToMenu);
        if (attr == null)
            attr = new DmcTypeMenuREFSV(MvwDMSAG.__addToMenu);
        else
            ((DmcTypeMenuREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(MvwDMSAG.__addToMenu,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets addToMenu to the specified value.
     * @param value A value compatible with DmcTypeMenuREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setAddToMenu(Object value) throws DmcValueException {
        DmcTypeMenuREFSV attr  = (DmcTypeMenuREFSV) get(MvwDMSAG.__addToMenu);
        if (attr == null)
            attr = new DmcTypeMenuREFSV(MvwDMSAG.__addToMenu);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(MvwDMSAG.__addToMenu,attr);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remAddToMenu(){
         rem(MvwDMSAG.__addToMenu);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:796)
    public String getMenuOrder(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__menuOrder);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
    public void setMenuOrder(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__menuOrder);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__menuOrder);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__menuOrder,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setMenuOrder(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__menuOrder);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__menuOrder);
        
        attr.set(value);
        set(MvwDMSAG.__menuOrder,attr);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remMenuOrder(){
         rem(MvwDMSAG.__menuOrder);
    }




}
