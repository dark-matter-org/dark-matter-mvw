package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.Iterator;                                            // Support copy of MV objects - (BaseDMWGenerator.java:2240)
import java.util.TreeSet;                                             // To support getMVCopy() - (BaseDMWGenerator.java:1210)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.types.CamelCaseName;                               // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                                   // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.dmw.StringIterableDMW;                   // For multi-valued String - (BaseDMWGenerator.java:2103)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.mvw.tools.mvwgenerator.extended.Event;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;         // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.EventDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;         // Attribute importThis from the mvw schema - (BaseDMWGenerator.java:897)



/**
 * The specification of an Event definition will result in the creation of\n
 * a gwtEvent and its associated handler interface.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class EventDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public EventDMW() {
        super(new EventDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Event);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public EventDMW(DmcTypeModifierMV mods) {
        super(new EventDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Event);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public Event getModificationRecorder(){
        Event rc = new Event();
        rc.setEventName(getEventName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public EventDMW(EventDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Event);
    }

    public Event cloneIt() {
        Event rc = new Event();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public EventDMO getDMO() {
        return((EventDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected EventDMW(EventDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public CamelCaseName getObjectName(){
        return(((EventDMO) core).getEventName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((EventDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof EventDMW){
            return( getObjectName().equals( ((EventDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getArgVector(){
        return(((EventDMO) core).getArgVector());
    }

    /**
     * Sets argVector to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setArgVector(Object value) throws DmcValueException {
        ((EventDMO) core).setArgVector(value);
    }

    /**
     * Sets argVector to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setArgVector(String value){
        ((EventDMO) core).setArgVector(value);
    }

    /**
     * Removes the argVector attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remArgVector(){
        ((EventDMO) core).remArgVector();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public CamelCaseName getEventName(){
        return(((EventDMO) core).getEventName());
    }

    /**
     * Sets eventName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setEventName(Object value) throws DmcValueException {
        ((EventDMO) core).setEventName(value);
    }

    /**
     * Sets eventName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setEventName(CamelCaseName value){
        ((EventDMO) core).setEventName(value);
    }

    /**
     * Removes the eventName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remEventName(){
        ((EventDMO) core).remEventName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public Boolean isFiredInThisModule(){
        return(((EventDMO) core).isFiredInThisModule());
    }

    /**
     * Sets firedInThisModule to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setFiredInThisModule(Object value) throws DmcValueException {
        ((EventDMO) core).setFiredInThisModule(value);
    }

    /**
     * Sets firedInThisModule to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setFiredInThisModule(Boolean value){
        ((EventDMO) core).setFiredInThisModule(value);
    }

    /**
     * Removes the firedInThisModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remFiredInThisModule(){
        ((EventDMO) core).remFiredInThisModule();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1671)
    public int getImportThisSize(){
        return(((EventDMO) core).getImportThisSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1679)
    public boolean getImportThisIsEmpty(){
        if (((EventDMO) core).getImportThisSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1689)
    public boolean getImportThisHasValue(){
        if (((EventDMO) core).getImportThisSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2107)
    public StringIterableDMW getImportThisIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__importThis);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((EventDMO) core).getImportThis()));
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2133)
    public void addImportThis(Object value) throws DmcValueException {
        ((EventDMO) core).addImportThis(value);
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2143)
    public void addImportThis(String value){
        ((EventDMO) core).addImportThis(value);
    }

    /**
     * Returns true if the collection contains the importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2200)
    public boolean importThisContains(String value){
        return(((EventDMO) core).importThisContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2244)
    @SuppressWarnings("unchecked")
    public TreeSet<String> getImportThisCopy(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__importThis);
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
     * Deletes a importThis value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2271)
    public void delImportThis(Object value) throws DmcValueException {
        ((EventDMO) core).delImportThis(value);
    }

    /**
     * Deletes a importThis value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2280)
    public void delImportThis(String value){
        ((EventDMO) core).delImportThis(value);
    }

    /**
     * Removes the importThis attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2292)
    public void remImportThis(){
        ((EventDMO) core).remImportThis();
    }


}
