package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                   // Support for MULTI attribute - (BaseDMWGenerator.java:2226)
import java.util.Iterator;                                                    // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import org.dmd.dmc.*;                                                         // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.types.CamelCaseName;                                       // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                                           // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Attribute description from the meta schema - (BaseDMWGenerator.java:897)
import org.dmd.dms.generated.dmw.StringIterableDMW;                           // For multi-valued String - (BaseDMWGenerator.java:2103)
import org.dmd.dmw.DmwNamedObjectWrapper;                                     // Named object wrapper - (BaseDMWGenerator.java:1242)
import org.dmd.mvw.tools.mvwgenerator.extended.Module;                        // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Abstract class - (BaseDMWGenerator.java:1230)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ModuleREF;              // Is reference type REF - (BaseDMWGenerator.java:1115)



/**
 * The MvwDefinition class provide a common base for all MVW definition\n
 * classes.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class MvwDefinitionDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    protected MvwDefinitionDMW() {
        super();
    }

    abstract public MvwDefinition getModificationRecorder();

    public MvwDefinitionDMO getDMO() {
        return((MvwDefinitionDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected MvwDefinitionDMW(MvwDefinitionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
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

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public CamelCaseName getCamelCaseName(){
        return(((MvwDefinitionDMO) core).getCamelCaseName());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setCamelCaseName(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setCamelCaseName(value);
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setCamelCaseName(CamelCaseName value){
        ((MvwDefinitionDMO) core).setCamelCaseName(value);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remCamelCaseName(){
        ((MvwDefinitionDMO) core).remCamelCaseName();
    }

    /**
     * @return A Module object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1434)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1519)
    public void setDefinedInModule(Module value) {
        ((MvwDefinitionDMO) core).setDefinedInModule(value.getDMO());
    }

    /**
     * Sets the definedInModule to the specified value.
     * @param value A value compatible with ModuleREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1528)
    public void setDefinedInModule(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setDefinedInModule(value);
    }

    /**
     * Removes the definedInModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remDefinedInModule(){
        ((MvwDefinitionDMO) core).remDefinedInModule();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getDescriptionSize(){
        return(((MvwDefinitionDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getDescriptionIsEmpty(){
        if (((MvwDefinitionDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getDescriptionHasValue(){
        if (((MvwDefinitionDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((MvwDefinitionDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addDescription(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addDescription(String value){
        ((MvwDefinitionDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean descriptionContains(String value){
        return(((MvwDefinitionDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDescriptionCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
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
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delDescription(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delDescription(String value){
        ((MvwDefinitionDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remDescription(){
        ((MvwDefinitionDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getFile(){
        return(((MvwDefinitionDMO) core).getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setFile(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setFile(value);
    }

    /**
     * Sets file to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setFile(String value){
        ((MvwDefinitionDMO) core).setFile(value);
    }

    /**
     * Removes the file attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remFile(){
        ((MvwDefinitionDMO) core).remFile();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public Integer getLineNumber(){
        return(((MvwDefinitionDMO) core).getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setLineNumber(Object value) throws DmcValueException {
        ((MvwDefinitionDMO) core).setLineNumber(value);
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setLineNumber(Integer value){
        ((MvwDefinitionDMO) core).setLineNumber(value);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remLineNumber(){
        ((MvwDefinitionDMO) core).remLineNumber();
    }


}
