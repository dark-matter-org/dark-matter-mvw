package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                                 // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.CamelCaseName;                                               // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                                                   // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Menu;                            // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Separator;                       // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.SeparatorDMO;                     // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuElementDefinitionDMW;         // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuREF;                        // Is reference type REF - (BaseDMWGenerator.java:1005)



/**
 * The Separator is used to define menu separators.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
// Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:547)
public class SeparatorDMW extends MenuElementDefinitionDMW implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public SeparatorDMW() {
        super(new SeparatorDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Separator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public SeparatorDMW(DmcTypeModifierMV mods) {
        super(new SeparatorDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Separator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public Separator getModificationRecorder(){
        Separator rc = new Separator();
        rc.setElementName(getElementName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public SeparatorDMW(SeparatorDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Separator);
    }

    public Separator cloneIt() {
        Separator rc = new Separator();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public SeparatorDMO getDMO() {
        return((SeparatorDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected SeparatorDMW(SeparatorDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public CamelCaseName getObjectName(){
        return(((SeparatorDMO) core).getElementName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((SeparatorDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof SeparatorDMW){
            return( getObjectName().equals( ((SeparatorDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A Menu object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public Menu getAddToMenu(){
        MenuREF ref = ((SeparatorDMO) core).getAddToMenu();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((Menu)ref.getObject().getContainer());
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MenuREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setAddToMenu(Menu value) {
        ((SeparatorDMO) core).setAddToMenu(value.getDMO());
    }

    /**
     * Sets the addToMenu to the specified value.
     * @param value A value compatible with MenuREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1418)
    public void setAddToMenu(Object value) throws DmcValueException {
        ((SeparatorDMO) core).setAddToMenu(value);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remAddToMenu(){
        ((SeparatorDMO) core).remAddToMenu();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public CamelCaseName getElementName(){
        return(((SeparatorDMO) core).getElementName());
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setElementName(Object value) throws DmcValueException {
        ((SeparatorDMO) core).setElementName(value);
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setElementName(CamelCaseName value){
        ((SeparatorDMO) core).setElementName(value);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remElementName(){
        ((SeparatorDMO) core).remElementName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getMenuOrder(){
        return(((SeparatorDMO) core).getMenuOrder());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setMenuOrder(Object value) throws DmcValueException {
        ((SeparatorDMO) core).setMenuOrder(value);
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setMenuOrder(String value){
        ((SeparatorDMO) core).setMenuOrder(value);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remMenuOrder(){
        ((SeparatorDMO) core).remMenuOrder();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getUseImpl(){
        return(((SeparatorDMO) core).getUseImpl());
    }

    /**
     * Sets useImpl to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setUseImpl(Object value) throws DmcValueException {
        ((SeparatorDMO) core).setUseImpl(value);
    }

    /**
     * Sets useImpl to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setUseImpl(String value){
        ((SeparatorDMO) core).setUseImpl(value);
    }

    /**
     * Removes the useImpl attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remUseImpl(){
        ((SeparatorDMO) core).remUseImpl();
    }


}
