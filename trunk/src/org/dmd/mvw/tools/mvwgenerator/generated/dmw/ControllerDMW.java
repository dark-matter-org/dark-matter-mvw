package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import java.util.ArrayList;                                                           // To support getMVCopy() - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dmc.*;                                                                 // If any attributes - (BaseDMWGeneratorNewest.java:905)
import org.dmd.dmc.types.CamelCaseName;                                               // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dms.ClassDefinition;                                                   // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:889)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:894)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:893)
import org.dmd.mvw.tools.mvwgenerator.extended.Component;                             // Derived class - (BaseDMWGeneratorNewest.java:1066)
import org.dmd.mvw.tools.mvwgenerator.extended.Controller;                            // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:898)
import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;                             // Is reference type - (BaseDMWGeneratorNewest.java:925)
import org.dmd.mvw.tools.mvwgenerator.extended.menus.ActionBinding;                   // Is reference type - (BaseDMWGeneratorNewest.java:925)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActionBindingDMO;                 // For multi-valued adds of ActionBinding - (BaseDMWGeneratorNewest.java:1585)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ControllerDMO;                    // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1070)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                         // Attribute implementsAction from the mvw schema - (BaseDMWGeneratorNewest.java:720)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PresenterDMO;                     // For multi-valued adds of Presenter - (BaseDMWGeneratorNewest.java:1585)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ActionBindingIterableDMW;         // For multi-valued ActionBinding - (BaseDMWGeneratorNewest.java:1527)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PresenterIterableDMW;             // For multi-valued Presenter - (BaseDMWGeneratorNewest.java:1527)


/**
 * The Controller represents a behavioural component that lives throughout\n
 * the entire lifecycle of an WebApplication or WebSite. Generally, it
 * manages the Presenters\n and Views that are displayed, but may also
 * provide behind the scenes management of things\n like communications,
 * security, menu structure etc. Controllers do not implement Presenter\n
 * interfaces i.e. they do not interact directly with Views; that is the role
 * of Presenters.\n <p />\n Because of their implied lifetime, Controllers
 * are made part of the overall RunContext for\n an application and are
 * constructed during initialization of the application. There is no\n need
 * to instantiate Controllers separately. The RunContextItem created for a
 * controller\n has the same name as the Controller itself with RCI appended.
 * You may specify an itemOrder\n for the Controller to control when it is
 * instantiated in the RunContext; use this option\n only if you know what
 * you're doing! The default itemOrder is 50, most base related
 * functionality\n starts in itemOrder 20 or lower.\n <p />\n Controllers
 * should not communicate with other Controllers directly; this type of
 * communication\n should be performed using events. So, although it is
 * possible to get the handle to another\n Controller via the RunContext, it
 * is discouraged.\n <p />
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class ControllerDMW extends Component implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public ControllerDMW() {
        super(new ControllerDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Controller);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public ControllerDMW(DmcTypeModifierMV mods) {
        super(new ControllerDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Controller);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public Controller getModificationRecorder(){
        Controller rc = new Controller();
        rc.setControllerName(getControllerName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public ControllerDMW(ControllerDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Controller);
    }

    public Controller cloneIt() {
        Controller rc = new Controller();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ControllerDMO getDMO() {
        return((ControllerDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected ControllerDMW(ControllerDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1115)
    public CamelCaseName getObjectName(){
        return(((ControllerDMO) core).getControllerName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ControllerDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ControllerDMW){
            return( getObjectName().equals( ((ControllerDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Boolean isAddedToRunContext(){
        return(((ControllerDMO) core).isAddedToRunContext());
    }

    /**
     * Sets addedToRunContext to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setAddedToRunContext(Object value) throws DmcValueException {
        ((ControllerDMO) core).setAddedToRunContext(value);
    }

    /**
     * Sets addedToRunContext to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setAddedToRunContext(Boolean value){
        ((ControllerDMO) core).setAddedToRunContext(value);
    }

    /**
     * Removes the addedToRunContext attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remAddedToRunContext(){
        ((ControllerDMO) core).remAddedToRunContext();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Boolean isCentralAsyncErrorHandler(){
        return(((ControllerDMO) core).isCentralAsyncErrorHandler());
    }

    /**
     * Sets centralAsyncErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setCentralAsyncErrorHandler(Object value) throws DmcValueException {
        ((ControllerDMO) core).setCentralAsyncErrorHandler(value);
    }

    /**
     * Sets centralAsyncErrorHandler to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setCentralAsyncErrorHandler(Boolean value){
        ((ControllerDMO) core).setCentralAsyncErrorHandler(value);
    }

    /**
     * Removes the centralAsyncErrorHandler attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remCentralAsyncErrorHandler(){
        ((ControllerDMO) core).remCentralAsyncErrorHandler();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Boolean isCentralDMPErrorHandler(){
        return(((ControllerDMO) core).isCentralDMPErrorHandler());
    }

    /**
     * Sets centralDMPErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setCentralDMPErrorHandler(Object value) throws DmcValueException {
        ((ControllerDMO) core).setCentralDMPErrorHandler(value);
    }

    /**
     * Sets centralDMPErrorHandler to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setCentralDMPErrorHandler(Boolean value){
        ((ControllerDMO) core).setCentralDMPErrorHandler(value);
    }

    /**
     * Removes the centralDMPErrorHandler attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remCentralDMPErrorHandler(){
        ((ControllerDMO) core).remCentralDMPErrorHandler();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Boolean isCentralRPCErrorHandler(){
        return(((ControllerDMO) core).isCentralRPCErrorHandler());
    }

    /**
     * Sets centralRPCErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setCentralRPCErrorHandler(Object value) throws DmcValueException {
        ((ControllerDMO) core).setCentralRPCErrorHandler(value);
    }

    /**
     * Sets centralRPCErrorHandler to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setCentralRPCErrorHandler(Boolean value){
        ((ControllerDMO) core).setCentralRPCErrorHandler(value);
    }

    /**
     * Removes the centralRPCErrorHandler attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remCentralRPCErrorHandler(){
        ((ControllerDMO) core).remCentralRPCErrorHandler();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public CamelCaseName getControllerName(){
        return(((ControllerDMO) core).getControllerName());
    }

    /**
     * Sets controllerName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setControllerName(Object value) throws DmcValueException {
        ((ControllerDMO) core).setControllerName(value);
    }

    /**
     * Sets controllerName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setControllerName(CamelCaseName value){
        ((ControllerDMO) core).setControllerName(value);
    }

    /**
     * Removes the controllerName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remControllerName(){
        ((ControllerDMO) core).remControllerName();
    }

    /**
     * @return The number of ActionBinding items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1489)
    public int getImplementsActionSize(){
        return(((ControllerDMO) core).getImplementsActionSize());
    }

    /**
     * @return true if there are no ActionBindingDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1497)
    public boolean getImplementsActionIsEmpty(){
        if (((ControllerDMO) core).getImplementsActionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ActionBindingDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1507)
    public boolean getImplementsActionHasValue(){
        if (((ControllerDMO) core).getImplementsActionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ActionBindingDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1534)
    public ActionBindingIterableDMW getImplementsActionIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__implementsAction);
        if (attr == null)
            return(ActionBindingIterableDMW.emptyList);
        
        return(new ActionBindingIterableDMW(((ControllerDMO) core).getImplementsAction()));
    }

    /**
     * Adds another implementsAction value.
     * @param value A value compatible with ActionBinding
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1591)
    public DmcAttribute<?> addImplementsAction(ActionBinding value){
        DmcAttribute<?> attr = ((ControllerDMO) core).addImplementsAction(((ActionBindingDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a implementsAction value.
     * @param value The ActionBinding to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1641)
    public void delImplementsAction(ActionBinding value){
        ((ControllerDMO) core).delImplementsAction(value.getDMO());
    }

    /**
     * @return A COPY of the collection of ActionBinding objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1703)
    public ArrayList<ActionBinding> getImplementsActionCopy(){
        DmcAttribute<?> attr = ((ControllerDMO) core).get(MvwDMSAG.__implementsAction);
        if (attr == null)
            return(new ArrayList<ActionBinding>());
        
        ArrayList<ActionBinding> rc = new ArrayList<ActionBinding>(attr.getMVSize());
        
        ActionBindingIterableDMW it = getImplementsActionIterable();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Removes the implementsAction attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2106)
    public void remImplementsAction(){
        ((ControllerDMO) core).remImplementsAction();
    }

    /**
     * @return The number of Presenter items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1489)
    public int getInstantiatesPresenterSize(){
        return(((ControllerDMO) core).getInstantiatesPresenterSize());
    }

    /**
     * @return true if there are no PresenterDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1497)
    public boolean getInstantiatesPresenterIsEmpty(){
        if (((ControllerDMO) core).getInstantiatesPresenterSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any PresenterDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1507)
    public boolean getInstantiatesPresenterHasValue(){
        if (((ControllerDMO) core).getInstantiatesPresenterSize() == 0)
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
        
        return(new PresenterIterableDMW(((ControllerDMO) core).getInstantiatesPresenter()));
    }

    /**
     * Adds another instantiatesPresenter value.
     * @param value A value compatible with Presenter
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1591)
    public DmcAttribute<?> addInstantiatesPresenter(Presenter value){
        DmcAttribute<?> attr = ((ControllerDMO) core).addInstantiatesPresenter(((PresenterDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a instantiatesPresenter value.
     * @param value The Presenter to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1641)
    public void delInstantiatesPresenter(Presenter value){
        ((ControllerDMO) core).delInstantiatesPresenter(value.getDMO());
    }

    /**
     * @return A COPY of the collection of Presenter objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1703)
    public ArrayList<Presenter> getInstantiatesPresenterCopy(){
        DmcAttribute<?> attr = ((ControllerDMO) core).get(MvwDMSAG.__instantiatesPresenter);
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
        ((ControllerDMO) core).remInstantiatesPresenter();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public Integer getItemOrder(){
        return(((ControllerDMO) core).getItemOrder());
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1402)
    public void setItemOrder(Object value) throws DmcValueException {
        ((ControllerDMO) core).setItemOrder(value);
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setItemOrder(Integer value){
        ((ControllerDMO) core).setItemOrder(value);
    }

    /**
     * Removes the itemOrder attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1437)
    public void remItemOrder(){
        ((ControllerDMO) core).remItemOrder();
    }


}
