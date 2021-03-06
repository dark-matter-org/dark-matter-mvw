package org.dmd.dmp.server.servlet.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                              // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.DotName;                                  // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dmp.server.servlet.generated.dmo.UserRIDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dms.ClassDefinition;                                // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmw.DmwHierarchicObjectWrapper;                     // Hierarchic object wrapper - (BaseDMWGenerator.java:1129)



/**
 * The UserRI class provides a user representation for use with the \n
 * Reference Implementation (RI).
 * <P>
 * Generated from the dmpServer schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class UserRIDMW extends DmwHierarchicObjectWrapper implements DmcHierarchicNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public UserRIDMW() {
        super(new UserRIDMO(), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._UserRI);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public UserRIDMW(DmcTypeModifierMV mods) {
        super(new UserRIDMO(mods), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._UserRI);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:634)
    public UserRIDMW getModificationRecorder(){
        UserRIDMW rc = new UserRIDMW();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public UserRIDMW(UserRIDMO obj) {
        super(obj, org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._UserRI);
    }

    public UserRIDMW cloneIt() {
        UserRIDMW rc = new UserRIDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UserRIDMO getDMO() {
        return((UserRIDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected UserRIDMW(UserRIDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public DotName getObjectName(){
        return(((UserRIDMO) core).getDotName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((UserRIDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof UserRIDMW){
            return( getObjectName().equals( ((UserRIDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1208)
    public DotName getHierarchicObjectName(){
        return(((UserRIDMO) core).getDotName());
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DotName getDotName(){
        return(((UserRIDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setDotName(Object value) throws DmcValueException {
        ((UserRIDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setDotName(DotName value){
        ((UserRIDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remDotName(){
        ((UserRIDMO) core).remDotName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Integer getIdRI(){
        return(((UserRIDMO) core).getIdRI());
    }

    /**
     * Sets idRI to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setIdRI(Object value) throws DmcValueException {
        ((UserRIDMO) core).setIdRI(value);
    }

    /**
     * Sets idRI to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setIdRI(Integer value){
        ((UserRIDMO) core).setIdRI(value);
    }

    /**
     * Removes the idRI attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remIdRI(){
        ((UserRIDMO) core).remIdRI();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getPassword(){
        return(((UserRIDMO) core).getPassword());
    }

    /**
     * Sets password to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setPassword(Object value) throws DmcValueException {
        ((UserRIDMO) core).setPassword(value);
    }

    /**
     * Sets password to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setPassword(String value){
        ((UserRIDMO) core).setPassword(value);
    }

    /**
     * Removes the password attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remPassword(){
        ((UserRIDMO) core).remPassword();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getUserName(){
        return(((UserRIDMO) core).getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setUserName(Object value) throws DmcValueException {
        ((UserRIDMO) core).setUserName(value);
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setUserName(String value){
        ((UserRIDMO) core).setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remUserName(){
        ((UserRIDMO) core).remUserName();
    }


}
