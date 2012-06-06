package org.dmd.dmp.server.servlet.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                              // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.DotName;                                  // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dmp.server.servlet.generated.dmo.UserRIDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dms.*;                                              // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmw.DmwHierarchicObjectWrapper;                     // Hierarchic object wrapper - (BaseDMWGeneratorNewest.java:1055)


/**
 * The UserRI class provides a user representation for use with the 
 * Reference Implementation (RI).
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class UserRIDMW extends DmwHierarchicObjectWrapper implements DmcHierarchicNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public UserRIDMW() {
        super(new UserRIDMO(), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._UserRI);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public UserRIDMW(DmcTypeModifierMV mods) {
        super(new UserRIDMO(mods), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._UserRI);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:500)
    public UserRIDMW getModificationRecorder(){
        UserRIDMW rc = new UserRIDMW();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected UserRIDMW(UserRIDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1113)
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

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1134)
    public DotName getHierarchicObjectName(){
        return(((UserRIDMO) core).getDotName());
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public DotName getDotName(){
        return(((UserRIDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setDotName(Object value) throws DmcValueException {
        ((UserRIDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setDotName(DotName value){
        ((UserRIDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remDotName(){
        ((UserRIDMO) core).remDotName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public Integer getIdRI(){
        return(((UserRIDMO) core).getIdRI());
    }

    /**
     * Sets idRI to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setIdRI(Object value) throws DmcValueException {
        ((UserRIDMO) core).setIdRI(value);
    }

    /**
     * Sets idRI to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setIdRI(Integer value){
        ((UserRIDMO) core).setIdRI(value);
    }

    /**
     * Removes the idRI attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remIdRI(){
        ((UserRIDMO) core).remIdRI();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getPassword(){
        return(((UserRIDMO) core).getPassword());
    }

    /**
     * Sets password to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setPassword(Object value) throws DmcValueException {
        ((UserRIDMO) core).setPassword(value);
    }

    /**
     * Sets password to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setPassword(String value){
        ((UserRIDMO) core).setPassword(value);
    }

    /**
     * Removes the password attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remPassword(){
        ((UserRIDMO) core).remPassword();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getUserName(){
        return(((UserRIDMO) core).getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setUserName(Object value) throws DmcValueException {
        ((UserRIDMO) core).setUserName(value);
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setUserName(String value){
        ((UserRIDMO) core).setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remUserName(){
        ((UserRIDMO) core).remUserName();
    }


}
