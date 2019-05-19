package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                                 // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.CamelCaseName;                                               // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                                                   // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;                         // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.mvw.tools.mvwgenerator.extended.forms.FieldEditorDefinition;           // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.FieldEditorDefinitionDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)



/**
 * The FieldEditor class allows for the definition of implementation specific
 * field\n editors. The specified class must implement the
 * org.dmd.dmc.DmcPresentationIF\n interface so that it can be initialized by
 * the FormBinder that is generated for each FormBindingDefinition\n instance
 * and so that it can interact with the AttributeTracker and the
 * SetRequestGenerator.\n <p/>\n When dealing with indexed attributes, the
 * default behaviour is to create a\n form binding with an editor instance
 * for each index slot. However, in some cases, you\n want to use a single
 * complex editor that handles the attribute. By setting useSingleEditor\n to
 * true, the form binding will contain a single editor for an indexed
 * attribute.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class FieldEditorDefinitionDMW extends MvwDefinition implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public FieldEditorDefinitionDMW() {
        super(new FieldEditorDefinitionDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._FieldEditorDefinition);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public FieldEditorDefinitionDMW(DmcTypeModifierMV mods) {
        super(new FieldEditorDefinitionDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._FieldEditorDefinition);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public FieldEditorDefinition getModificationRecorder(){
        FieldEditorDefinition rc = new FieldEditorDefinition();
        rc.setEditorName(getEditorName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public FieldEditorDefinitionDMW(FieldEditorDefinitionDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._FieldEditorDefinition);
    }

    public FieldEditorDefinition cloneIt() {
        FieldEditorDefinition rc = new FieldEditorDefinition();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public FieldEditorDefinitionDMO getDMO() {
        return((FieldEditorDefinitionDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected FieldEditorDefinitionDMW(FieldEditorDefinitionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public CamelCaseName getObjectName(){
        return(((FieldEditorDefinitionDMO) core).getEditorName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((FieldEditorDefinitionDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof FieldEditorDefinitionDMW){
            return( getObjectName().equals( ((FieldEditorDefinitionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public CamelCaseName getEditorName(){
        return(((FieldEditorDefinitionDMO) core).getEditorName());
    }

    /**
     * Sets editorName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setEditorName(Object value) throws DmcValueException {
        ((FieldEditorDefinitionDMO) core).setEditorName(value);
    }

    /**
     * Sets editorName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setEditorName(CamelCaseName value){
        ((FieldEditorDefinitionDMO) core).setEditorName(value);
    }

    /**
     * Removes the editorName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remEditorName(){
        ((FieldEditorDefinitionDMO) core).remEditorName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getUseClass(){
        return(((FieldEditorDefinitionDMO) core).getUseClass());
    }

    /**
     * Sets useClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setUseClass(Object value) throws DmcValueException {
        ((FieldEditorDefinitionDMO) core).setUseClass(value);
    }

    /**
     * Sets useClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setUseClass(String value){
        ((FieldEditorDefinitionDMO) core).setUseClass(value);
    }

    /**
     * Removes the useClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remUseClass(){
        ((FieldEditorDefinitionDMO) core).remUseClass();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isUseSingleEditor(){
        return(((FieldEditorDefinitionDMO) core).isUseSingleEditor());
    }

    /**
     * Sets useSingleEditor to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setUseSingleEditor(Object value) throws DmcValueException {
        ((FieldEditorDefinitionDMO) core).setUseSingleEditor(value);
    }

    /**
     * Sets useSingleEditor to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setUseSingleEditor(Boolean value){
        ((FieldEditorDefinitionDMO) core).setUseSingleEditor(value);
    }

    /**
     * Removes the useSingleEditor attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remUseSingleEditor(){
        ((FieldEditorDefinitionDMO) core).remUseSingleEditor();
    }


}
