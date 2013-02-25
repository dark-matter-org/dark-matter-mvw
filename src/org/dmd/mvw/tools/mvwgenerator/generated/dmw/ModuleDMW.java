package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.ArrayList;                                            // To support getMVCopy() - (BaseDMWGeneratorNewest.java:999)
import java.util.Iterator;                                             // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2054)
import java.util.TreeSet;                                              // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1028)
import org.dmd.dmc.*;                                                  // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dmc.types.CamelCaseName;                                // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.ClassDefinition;                                    // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:889)
import org.dmd.dms.generated.dmo.MetaDMSAG;                            // Attribute dependsOnSchema from the meta schema - (BaseDMWGeneratorNewest.java:720)
import org.dmd.dms.generated.dmw.StringIterableDMW;                    // For multi-valued String - (BaseDMWGeneratorNewest.java:1919)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:893)
import org.dmd.mvw.tools.mvwgenerator.extended.Module;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:898)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;          // Derived class - (BaseDMWGeneratorNewest.java:1066)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ModuleDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;          // Attribute dependsOnModule from the mvw schema - (BaseDMWGeneratorNewest.java:720)


/**
 * The Module is used to define a reusable set of MVW functionality which\n
 * can be referred to in Application definitions or other Module definitions.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class ModuleDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public ModuleDMW() {
        super(new ModuleDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Module);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public ModuleDMW(DmcTypeModifierMV mods) {
        super(new ModuleDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Module);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public Module getModificationRecorder(){
        Module rc = new Module();
        rc.setModuleName(getModuleName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public ModuleDMW(ModuleDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Module);
    }

    public Module cloneIt() {
        Module rc = new Module();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ModuleDMO getDMO() {
        return((ModuleDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected ModuleDMW(ModuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1115)
    public CamelCaseName getObjectName(){
        return(((ModuleDMO) core).getModuleName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ModuleDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ModuleDMW){
            return( getObjectName().equals( ((ModuleDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1489)
    public int getDependsOnModuleSize(){
        return(((ModuleDMO) core).getDependsOnModuleSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1497)
    public boolean getDependsOnModuleIsEmpty(){
        if (((ModuleDMO) core).getDependsOnModuleSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1507)
    public boolean getDependsOnModuleHasValue(){
        if (((ModuleDMO) core).getDependsOnModuleSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1923)
    public StringIterableDMW getDependsOnModuleIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ModuleDMO) core).getDependsOnModule()));
    }

    /**
     * Adds another dependsOnModule value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1949)
    public void addDependsOnModule(Object value) throws DmcValueException {
        ((ModuleDMO) core).addDependsOnModule(value);
    }

    /**
     * Adds another dependsOnModule value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1959)
    public void addDependsOnModule(String value){
        ((ModuleDMO) core).addDependsOnModule(value);
    }

    /**
     * Returns true if the collection contains the dependsOnModule value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2016)
    public boolean dependsOnModuleContains(String value){
        return(((ModuleDMO) core).dependsOnModuleContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2058)
    @SuppressWarnings("unchecked")
    public TreeSet<String> getDependsOnModuleCopy(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__dependsOnModule);
        if (attr == null)
            return(new TreeSet<String>());
        
        TreeSet<String> rc = new TreeSet<String>();
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a dependsOnModule value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2085)
    public void delDependsOnModule(Object value) throws DmcValueException {
        ((ModuleDMO) core).delDependsOnModule(value);
    }

    /**
     * Deletes a dependsOnModule value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2094)
    public void delDependsOnModule(String value){
        ((ModuleDMO) core).delDependsOnModule(value);
    }

    /**
     * Removes the dependsOnModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2106)
    public void remDependsOnModule(){
        ((ModuleDMO) core).remDependsOnModule();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1489)
    public int getDependsOnSchemaSize(){
        return(((ModuleDMO) core).getDependsOnSchemaSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1497)
    public boolean getDependsOnSchemaIsEmpty(){
        if (((ModuleDMO) core).getDependsOnSchemaSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1507)
    public boolean getDependsOnSchemaHasValue(){
        if (((ModuleDMO) core).getDependsOnSchemaSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1923)
    public StringIterableDMW getDependsOnSchemaIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((ModuleDMO) core).getDependsOnSchema()));
    }

    /**
     * Adds another dependsOnSchema value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1949)
    public void addDependsOnSchema(Object value) throws DmcValueException {
        ((ModuleDMO) core).addDependsOnSchema(value);
    }

    /**
     * Adds another dependsOnSchema value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1959)
    public void addDependsOnSchema(String value){
        ((ModuleDMO) core).addDependsOnSchema(value);
    }

    /**
     * Returns true if the collection contains the dependsOnSchema value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2016)
    public boolean dependsOnSchemaContains(String value){
        return(((ModuleDMO) core).dependsOnSchemaContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2058)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDependsOnSchemaCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__dependsOnSchema);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a dependsOnSchema value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2085)
    public void delDependsOnSchema(Object value) throws DmcValueException {
        ((ModuleDMO) core).delDependsOnSchema(value);
    }

    /**
     * Deletes a dependsOnSchema value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2094)
    public void delDependsOnSchema(String value){
        ((ModuleDMO) core).delDependsOnSchema(value);
    }

    /**
     * Removes the dependsOnSchema attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2106)
    public void remDependsOnSchema(){
        ((ModuleDMO) core).remDependsOnSchema();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getGenPackage(){
        return(((ModuleDMO) core).getGenPackage());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setGenPackage(Object value) throws DmcValueException {
        ((ModuleDMO) core).setGenPackage(value);
    }

    /**
     * Sets genPackage to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setGenPackage(String value){
        ((ModuleDMO) core).setGenPackage(value);
    }

    /**
     * Removes the genPackage attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remGenPackage(){
        ((ModuleDMO) core).remGenPackage();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public CamelCaseName getModuleName(){
        return(((ModuleDMO) core).getModuleName());
    }

    /**
     * Sets moduleName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setModuleName(Object value) throws DmcValueException {
        ((ModuleDMO) core).setModuleName(value);
    }

    /**
     * Sets moduleName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setModuleName(CamelCaseName value){
        ((ModuleDMO) core).setModuleName(value);
    }

    /**
     * Removes the moduleName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remModuleName(){
        ((ModuleDMO) core).remModuleName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Boolean isUsingStandardSubpackages(){
        return(((ModuleDMO) core).isUsingStandardSubpackages());
    }

    /**
     * Sets usingStandardSubpackages to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setUsingStandardSubpackages(Object value) throws DmcValueException {
        ((ModuleDMO) core).setUsingStandardSubpackages(value);
    }

    /**
     * Sets usingStandardSubpackages to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setUsingStandardSubpackages(Boolean value){
        ((ModuleDMO) core).setUsingStandardSubpackages(value);
    }

    /**
     * Removes the usingStandardSubpackages attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remUsingStandardSubpackages(){
        ((ModuleDMO) core).remUsingStandardSubpackages();
    }


}
