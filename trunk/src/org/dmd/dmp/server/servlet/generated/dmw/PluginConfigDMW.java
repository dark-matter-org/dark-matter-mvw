package org.dmd.dmp.server.servlet.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                    // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dmc.types.CamelCaseName;                                  // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dmp.server.servlet.extended.PluginConfig;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:898)
import org.dmd.dmp.server.servlet.generated.dmo.PluginConfigDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)
import org.dmd.dms.ClassDefinition;                                      // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:889)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:894)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:893)
import org.dmd.dmw.DmwNamedObjectWrapper;                                // Named object wrapper - (BaseDMWGeneratorNewest.java:1060)


/**
 * The PluginConfig is used to specify a plugin to be loaded into\n the DMP
 * Servlet Reference Implementation servlet.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class PluginConfigDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public PluginConfigDMW() {
        super(new PluginConfigDMO(), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._PluginConfig);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public PluginConfigDMW(DmcTypeModifierMV mods) {
        super(new PluginConfigDMO(mods), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._PluginConfig);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public PluginConfig getModificationRecorder(){
        PluginConfig rc = new PluginConfig();
        rc.setCamelCaseName(getCamelCaseName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public PluginConfigDMW(PluginConfigDMO obj) {
        super(obj, org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._PluginConfig);
    }

    public PluginConfig cloneIt() {
        PluginConfig rc = new PluginConfig();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PluginConfigDMO getDMO() {
        return((PluginConfigDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected PluginConfigDMW(PluginConfigDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1115)
    public CamelCaseName getObjectName(){
        return(((PluginConfigDMO) core).getCamelCaseName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((PluginConfigDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof PluginConfigDMW){
            return( getObjectName().equals( ((PluginConfigDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public CamelCaseName getCamelCaseName(){
        return(((PluginConfigDMO) core).getCamelCaseName());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setCamelCaseName(Object value) throws DmcValueException {
        ((PluginConfigDMO) core).setCamelCaseName(value);
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setCamelCaseName(CamelCaseName value){
        ((PluginConfigDMO) core).setCamelCaseName(value);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remCamelCaseName(){
        ((PluginConfigDMO) core).remCamelCaseName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getDescription(){
        return(((PluginConfigDMO) core).getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setDescription(Object value) throws DmcValueException {
        ((PluginConfigDMO) core).setDescription(value);
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setDescription(String value){
        ((PluginConfigDMO) core).setDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remDescription(){
        ((PluginConfigDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getFile(){
        return(((PluginConfigDMO) core).getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setFile(Object value) throws DmcValueException {
        ((PluginConfigDMO) core).setFile(value);
    }

    /**
     * Sets file to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setFile(String value){
        ((PluginConfigDMO) core).setFile(value);
    }

    /**
     * Removes the file attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remFile(){
        ((PluginConfigDMO) core).remFile();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Integer getLineNumber(){
        return(((PluginConfigDMO) core).getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setLineNumber(Object value) throws DmcValueException {
        ((PluginConfigDMO) core).setLineNumber(value);
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setLineNumber(Integer value){
        ((PluginConfigDMO) core).setLineNumber(value);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remLineNumber(){
        ((PluginConfigDMO) core).remLineNumber();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getPluginClass(){
        return(((PluginConfigDMO) core).getPluginClass());
    }

    /**
     * Sets pluginClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setPluginClass(Object value) throws DmcValueException {
        ((PluginConfigDMO) core).setPluginClass(value);
    }

    /**
     * Sets pluginClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setPluginClass(String value){
        ((PluginConfigDMO) core).setPluginClass(value);
    }

    /**
     * Removes the pluginClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remPluginClass(){
        ((PluginConfigDMO) core).remPluginClass();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public CamelCaseName getPluginName(){
        return(((PluginConfigDMO) core).getPluginName());
    }

    /**
     * Sets pluginName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setPluginName(Object value) throws DmcValueException {
        ((PluginConfigDMO) core).setPluginName(value);
    }

    /**
     * Sets pluginName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setPluginName(CamelCaseName value){
        ((PluginConfigDMO) core).setPluginName(value);
    }

    /**
     * Removes the pluginName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remPluginName(){
        ((PluginConfigDMO) core).remPluginName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Boolean isRunnable(){
        return(((PluginConfigDMO) core).isRunnable());
    }

    /**
     * Sets runnable to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setRunnable(Object value) throws DmcValueException {
        ((PluginConfigDMO) core).setRunnable(value);
    }

    /**
     * Sets runnable to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setRunnable(Boolean value){
        ((PluginConfigDMO) core).setRunnable(value);
    }

    /**
     * Removes the runnable attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remRunnable(){
        ((PluginConfigDMO) core).remRunnable();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Integer getStartOrder(){
        return(((PluginConfigDMO) core).getStartOrder());
    }

    /**
     * Sets startOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setStartOrder(Object value) throws DmcValueException {
        ((PluginConfigDMO) core).setStartOrder(value);
    }

    /**
     * Sets startOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setStartOrder(Integer value){
        ((PluginConfigDMO) core).setStartOrder(value);
    }

    /**
     * Removes the startOrder attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remStartOrder(){
        ((PluginConfigDMO) core).remStartOrder();
    }


}
