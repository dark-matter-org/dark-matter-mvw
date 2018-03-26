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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                  // Always required - (GenUtility.java:227)
import java.util.*;                                                           // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                              // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcSliceInfo;                                              // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                         // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.CamelCaseName;                                       // Naming attribute type - (GenUtility.java:382)
import org.dmd.dmg.generated.dmo.DmgDMSAG;                                    // Attribute from dmg schema - (GenUtility.java:197)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                          // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                    // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringMV;                           // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringSET;                          // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type - (GenUtility.java:339)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Base class - (GenUtility.java:367)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The Module is used to define a reusable set of MVW functionality which\n
 * can be referred to in Application definitions or other Module definitions.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ModuleDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Module";


    static {
    }

    public ModuleDMO() {
        super("Module");
    }

    protected ModuleDMO(String oc) {
        super(oc);
    }

    @Override
    public ModuleDMO getNew(){
        ModuleDMO rc = new ModuleDMO();
        return(rc);
    }

    @Override
    public ModuleDMO getSlice(DmcSliceInfo info){
        ModuleDMO rc = new ModuleDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ModuleDMO(DmcTypeModifierMV mods) {
        super("Module");
        modrec(true);
        setModifier(mods);
    }

    public ModuleDMO getModificationRecorder(){
        ModuleDMO rc = new ModuleDMO();
        rc.setModuleName(getModuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__moduleName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__moduleName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof ModuleDMO){
            return( getObjectName().equals( ((ModuleDMO) obj).getObjectName()) );
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

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public Iterator<String> getDependsOnModule(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1136)
    public String getNthDependsOnModule(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another dependsOnModule to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1150)
    public DmcAttribute<?> addDependsOnModule(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__dependsOnModule);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__dependsOnModule,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1225)
    public boolean dependsOnModuleContains(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another dependsOnModule value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1257)
    public DmcAttribute<?> addDependsOnModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__dependsOnModule);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__dependsOnModule,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnModule
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
    public int getDependsOnModuleSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        if (attr == null){
            if (MvwDMSAG.__dependsOnModule.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__dependsOnModule.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnModule value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1332)
    public DmcAttribute<?> delDependsOnModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__dependsOnModule), value);
        else
            attr = del(MvwDMSAG.__dependsOnModule, value);
        
        return(attr);
    }

    /**
     * Deletes a dependsOnModule from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1348)
    public DmcAttribute<?> delDependsOnModule(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__dependsOnModule);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__dependsOnModule), value);
        else
            attr = del(MvwDMSAG.__dependsOnModule, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnModule attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1367)
    public void remDependsOnModule(){
         rem(MvwDMSAG.__dependsOnModule);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public Iterator<String> getDependsOnSchema(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1136)
    public String getNthDependsOnSchema(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another dependsOnSchema to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1150)
    public DmcAttribute<?> addDependsOnSchema(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__dependsOnSchema);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__dependsOnSchema,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1225)
    public boolean dependsOnSchemaContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another dependsOnSchema value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1257)
    public DmcAttribute<?> addDependsOnSchema(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__dependsOnSchema);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__dependsOnSchema,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnSchema
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
    public int getDependsOnSchemaSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        if (attr == null){
            if (MetaDMSAG.__dependsOnSchema.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__dependsOnSchema.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnSchema value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1332)
    public DmcAttribute<?> delDependsOnSchema(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__dependsOnSchema), value);
        else
            attr = del(MetaDMSAG.__dependsOnSchema, value);
        
        return(attr);
    }

    /**
     * Deletes a dependsOnSchema from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1348)
    public DmcAttribute<?> delDependsOnSchema(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__dependsOnSchema);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__dependsOnSchema), value);
        else
            attr = del(MetaDMSAG.__dependsOnSchema, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnSchema attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1367)
    public void remDependsOnSchema(){
         rem(MetaDMSAG.__dependsOnSchema);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:796)
    public Boolean isUsingStandardSubpackages(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__usingStandardSubpackages);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets usingStandardSubpackages to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
    public void setUsingStandardSubpackages(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__usingStandardSubpackages);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__usingStandardSubpackages);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__usingStandardSubpackages,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets usingStandardSubpackages to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setUsingStandardSubpackages(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__usingStandardSubpackages);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__usingStandardSubpackages);
        
        attr.set(value);
        set(MvwDMSAG.__usingStandardSubpackages,attr);
    }

    /**
     * Removes the usingStandardSubpackages attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remUsingStandardSubpackages(){
         rem(MvwDMSAG.__usingStandardSubpackages);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:796)
    public CamelCaseName getModuleName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__moduleName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets moduleName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
    public void setModuleName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__moduleName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__moduleName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__moduleName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets moduleName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setModuleName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__moduleName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__moduleName);
        
        attr.set(value);
        set(MvwDMSAG.__moduleName,attr);
    }

    /**
     * Removes the moduleName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remModuleName(){
         rem(MvwDMSAG.__moduleName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:796)
    public String getGenPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmgDMSAG.__genPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
    public void setGenPackage(String value) {
        DmcAttribute<?> attr = get(DmgDMSAG.__genPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(DmgDMSAG.__genPackage);
        
        try{
            attr.set(value);
            set(DmgDMSAG.__genPackage,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setGenPackage(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmgDMSAG.__genPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(DmgDMSAG.__genPackage);
        
        attr.set(value);
        set(DmgDMSAG.__genPackage,attr);
    }

    /**
     * Removes the genPackage attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remGenPackage(){
         rem(DmgDMSAG.__genPackage);
    }




}
