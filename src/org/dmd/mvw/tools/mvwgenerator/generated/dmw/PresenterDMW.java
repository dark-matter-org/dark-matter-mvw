package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                       // To support getMVCopy() - (BaseDMWGenerator.java:1071)
import org.dmd.dmc.*;                                                             // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.CamelCaseName;                                           // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                                               // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                       // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                             // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.mvw.tools.mvwgenerator.extended.Component;                         // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;                         // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.mvw.tools.mvwgenerator.extended.View;                              // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;                     // Attribute instantiatesPresenter from the mvw schema - (BaseDMWGenerator.java:910)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PresenterDMO;                 // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;                      // For multi-valued adds of View - (BaseDMWGenerator.java:1657)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PresenterIterableDMW;         // For multi-valued Presenter - (BaseDMWGenerator.java:1599)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ViewIterableDMW;              // For multi-valued View - (BaseDMWGenerator.java:1599)



/**
 * The Presenter is a behavioural component that manages one or more Views
 * and\n thus implements the Presenter interface of any View it manages.
 * Presenters populate and\n potentially update Views with data. This will
 * often involve interacting with the communications\n interface(s)
 * associated with an application. If a View allows the creation or
 * alteration\n of data, those behaviours are usually handled directly by the
 * View's Presenter.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class PresenterDMW extends Component implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public PresenterDMW() {
        super(new PresenterDMO(), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Presenter);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public PresenterDMW(DmcTypeModifierMV mods) {
        super(new PresenterDMO(mods), org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Presenter);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public Presenter getModificationRecorder(){
        Presenter rc = new Presenter();
        rc.setPresenterName(getPresenterName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public PresenterDMW(PresenterDMO obj) {
        super(obj, org.dmd.mvw.tools.mvwgenerator.generated.MvwSchemaAG._Presenter);
    }

    public Presenter cloneIt() {
        Presenter rc = new Presenter();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public PresenterDMO getDMO() {
        return((PresenterDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected PresenterDMW(PresenterDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public CamelCaseName getObjectName(){
        return(((PresenterDMO) core).getPresenterName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((PresenterDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof PresenterDMW){
            return( getObjectName().equals( ((PresenterDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isCodeSplit(){
        return(((PresenterDMO) core).isCodeSplit());
    }

    /**
     * Sets codeSplit to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setCodeSplit(Object value) throws DmcValueException {
        ((PresenterDMO) core).setCodeSplit(value);
    }

    /**
     * Sets codeSplit to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setCodeSplit(Boolean value){
        ((PresenterDMO) core).setCodeSplit(value);
    }

    /**
     * Removes the codeSplit attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remCodeSplit(){
        ((PresenterDMO) core).remCodeSplit();
    }

    /**
     * @return The number of Presenter items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getInstantiatesPresenterSize(){
        return(((PresenterDMO) core).getInstantiatesPresenterSize());
    }

    /**
     * @return true if there are no PresenterDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getInstantiatesPresenterIsEmpty(){
        if (((PresenterDMO) core).getInstantiatesPresenterSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any PresenterDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getInstantiatesPresenterHasValue(){
        if (((PresenterDMO) core).getInstantiatesPresenterSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of PresenterDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1606)
    public PresenterIterableDMW getInstantiatesPresenterIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null)
            return(PresenterIterableDMW.emptyList);
        
        return(new PresenterIterableDMW(((PresenterDMO) core).getInstantiatesPresenter()));
    }

    /**
     * Adds another instantiatesPresenter value.
     * @param value A value compatible with Presenter
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1663)
    public DmcAttribute<?> addInstantiatesPresenter(Presenter value){
        DmcAttribute<?> attr = ((PresenterDMO) core).addInstantiatesPresenter(((PresenterDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a instantiatesPresenter value.
     * @param value The Presenter to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1713)
    public void delInstantiatesPresenter(Presenter value){
        ((PresenterDMO) core).delInstantiatesPresenter(value.getDMO());
    }

    /**
     * @return A COPY of the collection of Presenter objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1777)
    public ArrayList<Presenter> getInstantiatesPresenterCopy(){
        DmcAttribute<?> attr = ((PresenterDMO) core).get(MvwDMSAG.__instantiatesPresenter);
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remInstantiatesPresenter(){
        ((PresenterDMO) core).remInstantiatesPresenter();
    }

    /**
     * @return The number of View items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getManagesViewSize(){
        return(((PresenterDMO) core).getManagesViewSize());
    }

    /**
     * @return true if there are no ViewDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getManagesViewIsEmpty(){
        if (((PresenterDMO) core).getManagesViewSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ViewDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getManagesViewHasValue(){
        if (((PresenterDMO) core).getManagesViewSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of ViewDMO objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1606)
    public ViewIterableDMW getManagesViewIterable(){
        DmcAttribute<?> attr = core.get(MvwDMSAG.__managesView);
        if (attr == null)
            return(ViewIterableDMW.emptyList);
        
        return(new ViewIterableDMW(((PresenterDMO) core).getManagesView()));
    }

    /**
     * Adds another managesView value.
     * @param value A value compatible with View
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1663)
    public DmcAttribute<?> addManagesView(View value){
        DmcAttribute<?> attr = ((PresenterDMO) core).addManagesView(((ViewDMO)value.getDmcObject()));
        return(attr);
    }

    /**
     * Deletes a managesView value.
     * @param value The View to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1713)
    public void delManagesView(View value){
        ((PresenterDMO) core).delManagesView(value.getDMO());
    }

    /**
     * @return A COPY of the collection of View objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1777)
    public ArrayList<View> getManagesViewCopy(){
        DmcAttribute<?> attr = ((PresenterDMO) core).get(MvwDMSAG.__managesView);
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remManagesView(){
        ((PresenterDMO) core).remManagesView();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public CamelCaseName getPresenterName(){
        return(((PresenterDMO) core).getPresenterName());
    }

    /**
     * Sets presenterName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setPresenterName(Object value) throws DmcValueException {
        ((PresenterDMO) core).setPresenterName(value);
    }

    /**
     * Sets presenterName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setPresenterName(CamelCaseName value){
        ((PresenterDMO) core).setPresenterName(value);
    }

    /**
     * Removes the presenterName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remPresenterName(){
        ((PresenterDMO) core).remPresenterName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Boolean isSingleton(){
        return(((PresenterDMO) core).isSingleton());
    }

    /**
     * Sets singleton to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setSingleton(Object value) throws DmcValueException {
        ((PresenterDMO) core).setSingleton(value);
    }

    /**
     * Sets singleton to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setSingleton(Boolean value){
        ((PresenterDMO) core).setSingleton(value);
    }

    /**
     * Removes the singleton attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remSingleton(){
        ((PresenterDMO) core).remSingleton();
    }


}
