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
import java.io.Serializable;                                                          // Always required - (GenUtility.java:227)
import java.util.*;                                                                   // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                                      // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                                  // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                                           // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                                      // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                                 // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.CamelCaseName;                                               // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;                                  // Type specific set/add - (GenUtility.java:318)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.ClassDefinitionREF;                                // Helper class - (GenUtility.java:346)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                                  // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                            // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSV;                       // Reference type - (GenUtility.java:311)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                                  // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.I18NConfigDMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;                 // Base class - (GenUtility.java:367)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeEditFieldMV;             // Required type - (GenUtility.java:339)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeI18NConfigREFSV;         // Reference type - (GenUtility.java:311)
import org.dmd.mvw.tools.mvwgenerator.generated.types.I18NConfigREF;                  // Helper class - (GenUtility.java:346)
import org.dmd.mvw.tools.mvwgenerator.types.EditField;                                // Primitive type - (GenUtility.java:282)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The FormBinding class allows for the definition of bindings between DMO
 * attributes\n and the editors that will be used to display and edit their
 * values.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class FormBindingDefinitionDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "FormBindingDefinition";


    static {
    }

    public FormBindingDefinitionDMO() {
        super("FormBindingDefinition");
    }

    protected FormBindingDefinitionDMO(String oc) {
        super(oc);
    }

    @Override
    public FormBindingDefinitionDMO getNew(){
        FormBindingDefinitionDMO rc = new FormBindingDefinitionDMO();
        return(rc);
    }

    @Override
    public FormBindingDefinitionDMO getSlice(DmcSliceInfo info){
        FormBindingDefinitionDMO rc = new FormBindingDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public FormBindingDefinitionDMO(DmcTypeModifierMV mods) {
        super("FormBindingDefinition");
        modrec(true);
        setModifier(mods);
    }

    public FormBindingDefinitionDMO getModificationRecorder(){
        FormBindingDefinitionDMO rc = new FormBindingDefinitionDMO();
        rc.setBindingName(getBindingName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__bindingName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__bindingName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof FormBindingDefinitionDMO){
            return( getObjectName().equals( ((FormBindingDefinitionDMO) obj).getObjectName()) );
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
    public Boolean isStrictlyChecked(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__strictlyChecked);
        if (attr == null)
            return(true);

        return(attr.getSV());
    }

    /**
     * Sets strictlyChecked to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setStrictlyChecked(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__strictlyChecked);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__strictlyChecked);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__strictlyChecked,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets strictlyChecked to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setStrictlyChecked(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__strictlyChecked);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__strictlyChecked);
        
        attr.set(value);
        set(MvwDMSAG.__strictlyChecked,attr);
    }

    /**
     * Removes the strictlyChecked attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remStrictlyChecked(){
         rem(MvwDMSAG.__strictlyChecked);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:660)
    public I18NConfigREF getUseI18NConfig(){
        DmcTypeI18NConfigREFSV attr = (DmcTypeI18NConfigREFSV) get(MvwDMSAG.__useI18NConfig);
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
     * Returns the reference to I18NConfig without attempting lazy resolution (if turned on).
     */
    public I18NConfigREF getUseI18NConfigREF(){
        DmcTypeI18NConfigREFSV attr = (DmcTypeI18NConfigREFSV) get(MvwDMSAG.__useI18NConfig);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useI18NConfig to the specified value.
     * @param value I18NConfigDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:714)
    public void setUseI18NConfig(I18NConfigDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__useI18NConfig);
        if (attr == null)
            attr = new DmcTypeI18NConfigREFSV(MvwDMSAG.__useI18NConfig);
        else
            ((DmcTypeI18NConfigREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(MvwDMSAG.__useI18NConfig,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useI18NConfig to the specified value.
     * @param value A value compatible with DmcTypeI18NConfigREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setUseI18NConfig(Object value) throws DmcValueException {
        DmcTypeI18NConfigREFSV attr  = (DmcTypeI18NConfigREFSV) get(MvwDMSAG.__useI18NConfig);
        if (attr == null)
            attr = new DmcTypeI18NConfigREFSV(MvwDMSAG.__useI18NConfig);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(MvwDMSAG.__useI18NConfig,attr);
    }

    /**
     * Removes the useI18NConfig attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remUseI18NConfig(){
         rem(MvwDMSAG.__useI18NConfig);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Boolean isTipsFromI18N(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__tipsFromI18N);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets tipsFromI18N to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setTipsFromI18N(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__tipsFromI18N);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__tipsFromI18N);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__tipsFromI18N,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets tipsFromI18N to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setTipsFromI18N(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__tipsFromI18N);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__tipsFromI18N);
        
        attr.set(value);
        set(MvwDMSAG.__tipsFromI18N,attr);
    }

    /**
     * Removes the tipsFromI18N attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remTipsFromI18N(){
         rem(MvwDMSAG.__tipsFromI18N);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Integer getLabelWidth(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MvwDMSAG.__labelWidth);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets labelWidth to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setLabelWidth(Integer value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__labelWidth);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MvwDMSAG.__labelWidth);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__labelWidth,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets labelWidth to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setLabelWidth(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(MvwDMSAG.__labelWidth);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MvwDMSAG.__labelWidth);
        
        attr.set(value);
        set(MvwDMSAG.__labelWidth,attr);
    }

    /**
     * Removes the labelWidth attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remLabelWidth(){
         rem(MvwDMSAG.__labelWidth);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public CamelCaseName getBindingName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__bindingName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets bindingName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setBindingName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__bindingName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__bindingName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__bindingName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets bindingName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setBindingName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__bindingName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__bindingName);
        
        attr.set(value);
        set(MvwDMSAG.__bindingName,attr);
    }

    /**
     * Removes the bindingName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remBindingName(){
         rem(MvwDMSAG.__bindingName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:660)
    public ClassDefinitionREF getEditObject(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(MvwDMSAG.__editObject);
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
     * Returns the reference to ClassDefinition without attempting lazy resolution (if turned on).
     */
    public ClassDefinitionREF getEditObjectREF(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(MvwDMSAG.__editObject);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets editObject to the specified value.
     * @param value ClassDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:714)
    public void setEditObject(ClassDefinitionDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__editObject);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(MvwDMSAG.__editObject);
        else
            ((DmcTypeClassDefinitionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(MvwDMSAG.__editObject,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets editObject to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setEditObject(Object value) throws DmcValueException {
        DmcTypeClassDefinitionREFSV attr  = (DmcTypeClassDefinitionREFSV) get(MvwDMSAG.__editObject);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(MvwDMSAG.__editObject);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(MvwDMSAG.__editObject,attr);
    }

    /**
     * Removes the editObject attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remEditObject(){
         rem(MvwDMSAG.__editObject);
    }

    /**
     * @return An Iterator of EditField objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1278)
    public Iterator<EditField> getEditField(){
        DmcTypeEditFieldMV attr = (DmcTypeEditFieldMV) get(MvwDMSAG.__editField);
        if (attr == null)
            return( ((List<EditField>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth EditField value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1290)
    public EditField getNthEditField(int i){
        DmcTypeEditFieldMV attr = (DmcTypeEditFieldMV) get(MvwDMSAG.__editField);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another editField to the specified value.
     * @param value EditField
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1304)
    public DmcAttribute<?> addEditField(EditField value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__editField);
        if (attr == null)
            attr = new DmcTypeEditFieldMV(MvwDMSAG.__editField);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__editField,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified EditField.
     * @param value EditField
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1379)
    public boolean editFieldContains(EditField value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__editField);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another editField value.
     * @param value A value compatible with EditField
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1411)
    public DmcAttribute<?> addEditField(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__editField);
        if (attr == null)
            attr = new DmcTypeEditFieldMV(MvwDMSAG.__editField);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__editField,attr);
        return(attr);
    }

    /**
     * Returns the number of values in editField
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1428)
    public int getEditFieldSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__editField);
        if (attr == null){
            if (MvwDMSAG.__editField.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__editField.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a editField value.
     * @param value The EditField to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1486)
    public DmcAttribute<?> delEditField(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__editField);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEditFieldMV(MvwDMSAG.__editField), value);
        else
            attr = del(MvwDMSAG.__editField, value);
        
        return(attr);
    }

    /**
     * Deletes a editField from the specified value.
     * @param value EditField
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1502)
    public DmcAttribute<?> delEditField(EditField value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__editField);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEditFieldMV(MvwDMSAG.__editField), value);
        else
            attr = del(MvwDMSAG.__editField, value);
        
        return(attr);
    }

    /**
     * Removes the editField attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1521)
    public void remEditField(){
         rem(MvwDMSAG.__editField);
    }




}
