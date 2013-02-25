package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                         // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dmc.types.CamelCaseName;                                       // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.ClassDefinition;                                           // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:889)
import org.dmd.dmw.DmwNamedObjectWrapper;                                     // Named object wrapper - (BaseDMWGeneratorNewest.java:1060)
import org.dmd.mvw.tools.mvwgenerator.extended.Module;                        // Is reference type - (BaseDMWGeneratorNewest.java:925)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:898)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Abstract class - (BaseDMWGeneratorNewest.java:1048)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ModuleREF;              // Is reference type REF - (BaseDMWGeneratorNewest.java:933)


/**
 * The MvwDefinition class provide a common base for all MVW definition\n
 * classes.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class MvwDefinitionDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    protected MvwDefinitionDMW() {
        super();
    }

    abstract public MvwDefinition getModificationRecorder();

    public MvwDefinitionDMO getDMO() {
        return((MvwDefinitionDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected MvwDefinitionDMW(MvwDefinitionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1115)
    public CamelCaseName getObjectName(){
        return(((MvwDefinitionDMO) core).getCamelCaseName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MvwDefinitionDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvwDefinitionDMW){
            return( getObjectName().equals( ((MvwDefinitionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public CamelCaseName getCamelCaseName(){
        return(((MvwDefinitionDMO) core).getCamelCaseName());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setCamelCaseName(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setCamelCaseName(value);
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setCamelCaseName(CamelCaseName value){
        ((MvwDefinitionDMO) core).setCamelCaseName(value);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remCamelCaseName(){
        ((MvwDefinitionDMO) core).remCamelCaseName();
    }

    /**
     * @return A Module object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1252)
    public Module getDefinedInModule(){
        ModuleREF ref = ((MvwDefinitionDMO) core).getDefinedInModule();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Module)ref.getObject().getContainer());
    }

    /**
     * Sets the definedInModule to the specified value.
     * @param value A value compatible with ModuleREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1337)
    public void setDefinedInModule(Module value) {
        ((MvwDefinitionDMO) core).setDefinedInModule(value.getDMO());
    }

    /**
     * Sets the definedInModule to the specified value.
     * @param value A value compatible with ModuleREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1346)
    public void setDefinedInModule(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setDefinedInModule(value);
    }

    /**
     * Removes the definedInModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remDefinedInModule(){
        ((MvwDefinitionDMO) core).remDefinedInModule();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getDescription(){
        return(((MvwDefinitionDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setDescription(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setDescription(String value){
        ((MvwDefinitionDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remDescription(){
        ((MvwDefinitionDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getFile(){
        return(((MvwDefinitionDMO) core).getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setFile(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setFile(value);
    }

    /**
     * Sets file to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setFile(String value){
        ((MvwDefinitionDMO) core).setFile(value);
    }

    /**
     * Removes the file attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remFile(){
        ((MvwDefinitionDMO) core).remFile();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Integer getLineNumber(){
        return(((MvwDefinitionDMO) core).getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setLineNumber(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setLineNumber(value);
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setLineNumber(Integer value){
        ((MvwDefinitionDMO) core).setLineNumber(value);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remLineNumber(){
        ((MvwDefinitionDMO) core).remLineNumber();
    }


}
