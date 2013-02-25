package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.ArrayList;                                                        // To support getMVCopy() - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dmc.*;                                                              // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dmc.types.CamelCaseName;                                            // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.ClassDefinition;                                                // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:889)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                        // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:894)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:893)
import org.dmd.mvw.tools.mvwgenerator.extended.Activity;                           // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:898)
import org.dmd.mvw.tools.mvwgenerator.extended.Component;                          // Derived class - (BaseDMWGeneratorNewest.java:1066)
import org.dmd.mvw.tools.mvwgenerator.extended.Controller;                         // Is reference type - (BaseDMWGeneratorNewest.java:925)
import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;                          // Is reference type - (BaseDMWGeneratorNewest.java:925)
import org.dmd.mvw.tools.mvwgenerator.extended.View;                               // Is reference type - (BaseDMWGeneratorNewest.java:925)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActivityDMO;                   // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ControllerDMO;                 // For multi-valued adds of Controller - (BaseDMWGeneratorNewest.java:1585)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                      // Attribute instantiatesPresenter from the mvw schema - (BaseDMWGeneratorNewest.java:720)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PresenterDMO;                  // For multi-valued adds of Presenter - (BaseDMWGeneratorNewest.java:1585)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;                       // For multi-valued adds of View - (BaseDMWGeneratorNewest.java:1585)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ControllerIterableDMW;         // For multi-valued Controller - (BaseDMWGeneratorNewest.java:1527)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PresenterIterableDMW;          // For multi-valued Presenter - (BaseDMWGeneratorNewest.java:1527)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ViewIterableDMW;               // For multi-valued View - (BaseDMWGeneratorNewest.java:1527)


/**
 * If you are making use of Places, you'll define an Activity for\n each of
 * them; all activities are derived from com.google.gwt.app.place.Activity.
 * If you\n have common functionality that you wish to use for your Activity
 * classes, implement\n it in a class derived from
 * com.google.gwt.app.place.Activity and specify that class\n in the
 * useBaseClass attribute of your defined Activity.\n <p />\n Activities are
 * meant to be short-lived, disposable entities that run in a particular
 * Place.\n However, if you are building an application, it may be that you
 * have a single Place and\n that all behaviour takes place within the guise
 * of a single Activity.\n <p />\n If the Activity manages a view, it will be
 * generated as implementing the View's \n presenter interface.\n <p/>\n
 * Activities provide a natural division point for GWT code splitting, if
 * you've structured your\n code appropriately. By specifying the codeSplit
 * flag as true, the code for the Activity will be \n asynchronously loaded
 * using the GWT code splitting mechanisms.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class ActivityDMW extends Component implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public ActivityDMW() {
        super(new ActivityDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Activity);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public ActivityDMW(DmcTypeModifierMV mods) {
        super(new ActivityDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Activity);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public Activity getModificationRecorder(){
        Activity rc = new Activity();
        rc.setActivityName(getActivityName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public ActivityDMW(ActivityDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Activity);
    }

    public Activity cloneIt() {
        Activity rc = new Activity();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ActivityDMO getDMO() {
        return((ActivityDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected ActivityDMW(ActivityDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1115)
    public CamelCaseName getObjectName(){
        return(((ActivityDMO) core).getActivityName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ActivityDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ActivityDMW){
            return( getObjectName().equals( ((ActivityDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Boolean isAbstractActivity(){
        return(((ActivityDMO) core).isAbstractActivity());
    }

    /**
     * Sets abstractActivity to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setAbstractActivity(Object value) throws DmcValueException {
        ((ActivityDMO) core).setAbstractActivity(value);
    }

    /**
     * Sets abstractActivity to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setAbstractActivity(Boolean value){
        ((ActivityDMO) core).setAbstractActivity(value);
    }

    /**
     * Removes the abstractActivity attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remAbstractActivity(){
        ((ActivityDMO) core).remAbstractActivity();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public CamelCaseName getActivityName(){
        return(((ActivityDMO) core).getActivityName());
    }

    /**
     * Sets activityName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setActivityName(Object value) throws DmcValueException {
        ((ActivityDMO) core).setActivityName(value);
    }

    /**
     * Sets activityName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setActivityName(CamelCaseName value){
        ((ActivityDMO) core).setActivityName(value);
    }

    /**
     * Removes the activityName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remActivityName(){
        ((ActivityDMO) core).remActivityName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Boolean isCodeSplit(){
        return(((ActivityDMO) core).isCodeSplit());
    }

    /**
     * Sets codeSplit to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setCodeSplit(Object value) throws DmcValueException {
        ((ActivityDMO) core).setCodeSplit(value);
    }

    /**
     * Sets codeSplit to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setCodeSplit(Boolean value){
        ((ActivityDMO) core).setCodeSplit(value);
    }

    /**
     * Removes the codeSplit attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remCodeSplit(){
        ((ActivityDMO) core).remCodeSplit();
    }

    /**
     * @return The number of Presenter items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1489)
    public int getInstantiatesPresenterSize(){
        return(((ActivityDMO) core).getInstantiatesPresenterSize());
    }

    /**
     * @return true if there are no PresenterDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1497)
    public boolean getInstantiatesPresenterIsEmpty(){
        if (((ActivityDMO) core).getInstantiatesPresenterSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any PresenterDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1507)
    public boolean getInstantiatesPresenterHasValue(){
        if (((ActivityDMO) core).getInstantiatesPresenterSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of PresenterDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public PresenterIterableDMW getInstantiatesPresenterIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null)
            return(PresenterIterableDMW.emptyList);
        
        return(new PresenterIterableDMW(((ActivityDMO) core).getInstantiatesPresenter()));
    }

    /**
     * Adds another instantiatesPresenter value.
     * @param value A value compatible with Presenter
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1591)
    public DmcAttribute<?> addInstantiatesPresenter(Presenter value){
        DmcAttribute<?> attr = ((ActivityDMO) core).addInstantiatesPresenter(((PresenterDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a instantiatesPresenter value.
     * @param value The Presenter to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1641)
    public void delInstantiatesPresenter(Presenter value){
        ((ActivityDMO) core).delInstantiatesPresenter(value.getDMO());
    }

    /**
     * @return A COPY of the collection of Presenter objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1703)
    public ArrayList<Presenter> getInstantiatesPresenterCopy(){
        DmcAttribute<?> attr = ((ActivityDMO) core).get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null)
            return(new ArrayList<Presenter>());
        
        ArrayList<Presenter> rc = new ArrayList<Presenter>(attr.getMVSize());
        
        PresenterIterableDMW it = getInstantiatesPresenterIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the instantiatesPresenter attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2106)
    public void remInstantiatesPresenter(){
        ((ActivityDMO) core).remInstantiatesPresenter();
    }

    /**
     * @return The number of View items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1489)
    public int getManagesViewSize(){
        return(((ActivityDMO) core).getManagesViewSize());
    }

    /**
     * @return true if there are no ViewDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1497)
    public boolean getManagesViewIsEmpty(){
        if (((ActivityDMO) core).getManagesViewSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ViewDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1507)
    public boolean getManagesViewHasValue(){
        if (((ActivityDMO) core).getManagesViewSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ViewDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public ViewIterableDMW getManagesViewIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__managesView);
        if (attr == null)
            return(ViewIterableDMW.emptyList);
        
        return(new ViewIterableDMW(((ActivityDMO) core).getManagesView()));
    }

    /**
     * Adds another managesView value.
     * @param value A value compatible with View
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1591)
    public DmcAttribute<?> addManagesView(View value){
        DmcAttribute<?> attr = ((ActivityDMO) core).addManagesView(((ViewDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a managesView value.
     * @param value The View to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1641)
    public void delManagesView(View value){
        ((ActivityDMO) core).delManagesView(value.getDMO());
    }

    /**
     * @return A COPY of the collection of View objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1703)
    public ArrayList<View> getManagesViewCopy(){
        DmcAttribute<?> attr = ((ActivityDMO) core).get(MvwDMSAG.__managesView);
        if (attr == null)
            return(new ArrayList<View>());
        
        ArrayList<View> rc = new ArrayList<View>(attr.getMVSize());
        
        ViewIterableDMW it = getManagesViewIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the managesView attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2106)
    public void remManagesView(){
        ((ActivityDMO) core).remManagesView();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public String getUseBaseClass(){
        return(((ActivityDMO) core).getUseBaseClass());
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setUseBaseClass(Object value) throws DmcValueException {
        ((ActivityDMO) core).setUseBaseClass(value);
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setUseBaseClass(String value){
        ((ActivityDMO) core).setUseBaseClass(value);
    }

    /**
     * Removes the useBaseClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remUseBaseClass(){
        ((ActivityDMO) core).remUseBaseClass();
    }

    /**
     * @return The number of Controller items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1489)
    public int getUsesControllerSize(){
        return(((ActivityDMO) core).getUsesControllerSize());
    }

    /**
     * @return true if there are no ControllerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1497)
    public boolean getUsesControllerIsEmpty(){
        if (((ActivityDMO) core).getUsesControllerSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ControllerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1507)
    public boolean getUsesControllerHasValue(){
        if (((ActivityDMO) core).getUsesControllerSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ControllerDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public ControllerIterableDMW getUsesControllerIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__usesController);
        if (attr == null)
            return(ControllerIterableDMW.emptyList);
        
        return(new ControllerIterableDMW(((ActivityDMO) core).getUsesController()));
    }

    /**
     * Adds another usesController value.
     * @param value A value compatible with Controller
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1591)
    public DmcAttribute<?> addUsesController(Controller value){
        DmcAttribute<?> attr = ((ActivityDMO) core).addUsesController(((ControllerDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a usesController value.
     * @param value The Controller to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1641)
    public void delUsesController(Controller value){
        ((ActivityDMO) core).delUsesController(value.getDMO());
    }

    /**
     * @return A COPY of the collection of Controller objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1703)
    public ArrayList<Controller> getUsesControllerCopy(){
        DmcAttribute<?> attr = ((ActivityDMO) core).get(MvwDMSAG.__usesController);
        if (attr == null)
            return(new ArrayList<Controller>());
        
        ArrayList<Controller> rc = new ArrayList<Controller>(attr.getMVSize());
        
        ControllerIterableDMW it = getUsesControllerIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the usesController attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2106)
    public void remUsesController(){
        ((ActivityDMO) core).remUsesController();
    }


}
