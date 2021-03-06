package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.HashSet;                                                              // To support getMVCopy() - (BaseDMWGenerator.java:1090)
import java.util.Iterator;                                                             // Support copy of MV objects - (BaseDMWGenerator.java:2130)
import org.dmd.dmc.*;                                                                  // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.CamelCaseName;                                                // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                                                    // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                            // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.dmw.StringIterableDMW;                                    // For multi-valued String - (BaseDMWGenerator.java:1993)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                  // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.mvw.tools.mvwgenerator.extended.EnumMappingGenerator;                   // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                          // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.mvw.tools.mvwgenerator.extended.forms.EnumMapping;                      // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.EnumMappingDMO;                    // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                          // Attribute skipEnumValue from the mvw schema - (BaseDMWGenerator.java:910)
import org.dmd.mvw.tools.mvwgenerator.generated.types.EnumMappingGeneratorREF;         // Is reference type REF - (BaseDMWGenerator.java:1005)



/**
 * The EnumMapping class allows for generation of a set of static data
 * instances\n that represent the values from the specified enumeration
 * (type). Depending on the widget set\n you're using, you will specify
 * different mappingGenerators; these are defined as extensions\n to the
 * standard MVW generation mechanisms. For example, the dark-matter-gxt
 * project defines\n the GXTEnumGenerator generator that will generate code
 * that maps an enum to code that can be used with\n a selector widget.\n <p
 * />\n Enum values are comprised of an integer, a name, a description and
 * optionally, a label as follows - int name description : label.\n If you
 * specify useNameAsLabel, the uppercase name value of the enum is used to
 * display the value\n of the. If useNameAsLabel is not specified, the label
 * will be used if it has been specified. Otherwise,\n the description is
 * used.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class EnumMappingDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public EnumMappingDMW() {
        super(new EnumMappingDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._EnumMapping);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public EnumMappingDMW(DmcTypeModifierMV mods) {
        super(new EnumMappingDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._EnumMapping);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public EnumMapping getModificationRecorder(){
        EnumMapping rc = new EnumMapping();
        rc.setMappingName(getMappingName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public EnumMappingDMW(EnumMappingDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._EnumMapping);
    }

    public EnumMapping cloneIt() {
        EnumMapping rc = new EnumMapping();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public EnumMappingDMO getDMO() {
        return((EnumMappingDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected EnumMappingDMW(EnumMappingDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public CamelCaseName getObjectName(){
        return(((EnumMappingDMO) core).getMappingName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((EnumMappingDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof EnumMappingDMW){
            return( getObjectName().equals( ((EnumMappingDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getEmptyText(){
        return(((EnumMappingDMO) core).getEmptyText());
    }

    /**
     * Sets emptyText to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setEmptyText(Object value) throws DmcValueException {
        ((EnumMappingDMO) core).setEmptyText(value);
    }

    /**
     * Sets emptyText to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setEmptyText(String value){
        ((EnumMappingDMO) core).setEmptyText(value);
    }

    /**
     * Removes the emptyText attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remEmptyText(){
        ((EnumMappingDMO) core).remEmptyText();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getEnumName(){
        return(((EnumMappingDMO) core).getEnumName());
    }

    /**
     * Sets enumName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setEnumName(Object value) throws DmcValueException {
        ((EnumMappingDMO) core).setEnumName(value);
    }

    /**
     * Sets enumName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setEnumName(String value){
        ((EnumMappingDMO) core).setEnumName(value);
    }

    /**
     * Removes the enumName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remEnumName(){
        ((EnumMappingDMO) core).remEnumName();
    }

    /**
     * @return A EnumMappingGenerator object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public EnumMappingGenerator getMappingGenerator(){
        EnumMappingGeneratorREF ref = ((EnumMappingDMO) core).getMappingGenerator();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((EnumMappingGenerator)ref.getObject().getContainer());
    }

    /**
     * Sets the mappingGenerator to the specified value.
     * @param value A value compatible with EnumMappingGeneratorREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setMappingGenerator(EnumMappingGenerator value) {
        ((EnumMappingDMO) core).setMappingGenerator(value.getDMO());
    }

    /**
     * Sets the mappingGenerator to the specified value.
     * @param value A value compatible with EnumMappingGeneratorREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1418)
    public void setMappingGenerator(Object value) throws DmcValueException {
        ((EnumMappingDMO) core).setMappingGenerator(value);
    }

    /**
     * Removes the mappingGenerator attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remMappingGenerator(){
        ((EnumMappingDMO) core).remMappingGenerator();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public CamelCaseName getMappingName(){
        return(((EnumMappingDMO) core).getMappingName());
    }

    /**
     * Sets mappingName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setMappingName(Object value) throws DmcValueException {
        ((EnumMappingDMO) core).setMappingName(value);
    }

    /**
     * Sets mappingName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setMappingName(CamelCaseName value){
        ((EnumMappingDMO) core).setMappingName(value);
    }

    /**
     * Removes the mappingName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remMappingName(){
        ((EnumMappingDMO) core).remMappingName();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getSkipEnumValueSize(){
        return(((EnumMappingDMO) core).getSkipEnumValueSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getSkipEnumValueIsEmpty(){
        if (((EnumMappingDMO) core).getSkipEnumValueSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getSkipEnumValueHasValue(){
        if (((EnumMappingDMO) core).getSkipEnumValueSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public StringIterableDMW getSkipEnumValueIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__skipEnumValue);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((EnumMappingDMO) core).getSkipEnumValue()));
    }

    /**
     * Adds another skipEnumValue value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addSkipEnumValue(Object value) throws DmcValueException {
        ((EnumMappingDMO) core).addSkipEnumValue(value);
    }

    /**
     * Adds another skipEnumValue value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addSkipEnumValue(String value){
        ((EnumMappingDMO) core).addSkipEnumValue(value);
    }

    /**
     * Returns true if the collection contains the skipEnumValue value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean skipEnumValueContains(String value){
        return(((EnumMappingDMO) core).skipEnumValueContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public HashSet<String> getSkipEnumValueCopy(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__skipEnumValue);
        if (attr == null)
            return(new HashSet<String>());
        
        HashSet<String> rc = new HashSet<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a skipEnumValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delSkipEnumValue(Object value) throws DmcValueException {
        ((EnumMappingDMO) core).delSkipEnumValue(value);
    }

    /**
     * Deletes a skipEnumValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delSkipEnumValue(String value){
        ((EnumMappingDMO) core).delSkipEnumValue(value);
    }

    /**
     * Removes the skipEnumValue attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remSkipEnumValue(){
        ((EnumMappingDMO) core).remSkipEnumValue();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getUnsetValue(){
        return(((EnumMappingDMO) core).getUnsetValue());
    }

    /**
     * Sets unsetValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setUnsetValue(Object value) throws DmcValueException {
        ((EnumMappingDMO) core).setUnsetValue(value);
    }

    /**
     * Sets unsetValue to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setUnsetValue(String value){
        ((EnumMappingDMO) core).setUnsetValue(value);
    }

    /**
     * Removes the unsetValue attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remUnsetValue(){
        ((EnumMappingDMO) core).remUnsetValue();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isUseNameAsLabel(){
        return(((EnumMappingDMO) core).isUseNameAsLabel());
    }

    /**
     * Sets useNameAsLabel to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setUseNameAsLabel(Object value) throws DmcValueException {
        ((EnumMappingDMO) core).setUseNameAsLabel(value);
    }

    /**
     * Sets useNameAsLabel to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setUseNameAsLabel(Boolean value){
        ((EnumMappingDMO) core).setUseNameAsLabel(value);
    }

    /**
     * Removes the useNameAsLabel attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remUseNameAsLabel(){
        ((EnumMappingDMO) core).remUseNameAsLabel();
    }


}
