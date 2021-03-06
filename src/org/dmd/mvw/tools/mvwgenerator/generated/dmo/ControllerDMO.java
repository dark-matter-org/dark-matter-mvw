//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2018 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                             // Always required - (GenUtility.java:227)
import java.util.*;                                                                      // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                                         // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                                     // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                                              // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                                         // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                                    // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.CamelCaseName;                                                  // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                              // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                                     // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                               // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                                     // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                    // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActionBindingDMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;                        // Base class - (GenUtility.java:367)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PresenterDMO;                        // Type specific set/add - (GenUtility.java:318)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ActionBindingREF;                  // Helper class - (GenUtility.java:346)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeActionBindingREFMV;         // Reference type - (GenUtility.java:311)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypePresenterREFMV;             // Reference type - (GenUtility.java:311)
import org.dmd.mvw.tools.mvwgenerator.generated.types.PresenterREF;                      // Helper class - (GenUtility.java:346)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
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
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ControllerDMO  extends ComponentDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Controller";


    static {
    }

    public ControllerDMO() {
        super("Controller");
    }

    protected ControllerDMO(String oc) {
        super(oc);
    }

    @Override
    public ControllerDMO getNew(){
        ControllerDMO rc = new ControllerDMO();
        return(rc);
    }

    @Override
    public ControllerDMO getSlice(DmcSliceInfo info){
        ControllerDMO rc = new ControllerDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ControllerDMO(DmcTypeModifierMV mods) {
        super("Controller");
        modrec(true);
        setModifier(mods);
    }

    public ControllerDMO getModificationRecorder(){
        ControllerDMO rc = new ControllerDMO();
        rc.setControllerName(getControllerName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__controllerName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__controllerName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof ControllerDMO){
            return( getObjectName().equals( ((ControllerDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:784)
    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Boolean isCentralDMPErrorHandler(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__centralDMPErrorHandler);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets centralDMPErrorHandler to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setCentralDMPErrorHandler(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__centralDMPErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__centralDMPErrorHandler);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__centralDMPErrorHandler,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets centralDMPErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setCentralDMPErrorHandler(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__centralDMPErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__centralDMPErrorHandler);
        
        attr.set(value);
        set(MvwDMSAG.__centralDMPErrorHandler,attr);
    }

    /**
     * Removes the centralDMPErrorHandler attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remCentralDMPErrorHandler(){
         rem(MvwDMSAG.__centralDMPErrorHandler);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Boolean isCentralRPCErrorHandler(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__centralRPCErrorHandler);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets centralRPCErrorHandler to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setCentralRPCErrorHandler(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__centralRPCErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__centralRPCErrorHandler);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__centralRPCErrorHandler,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets centralRPCErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setCentralRPCErrorHandler(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__centralRPCErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__centralRPCErrorHandler);
        
        attr.set(value);
        set(MvwDMSAG.__centralRPCErrorHandler,attr);
    }

    /**
     * Removes the centralRPCErrorHandler attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remCentralRPCErrorHandler(){
         rem(MvwDMSAG.__centralRPCErrorHandler);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Boolean isCentralAsyncErrorHandler(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__centralAsyncErrorHandler);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets centralAsyncErrorHandler to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setCentralAsyncErrorHandler(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__centralAsyncErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__centralAsyncErrorHandler);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__centralAsyncErrorHandler,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets centralAsyncErrorHandler to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setCentralAsyncErrorHandler(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__centralAsyncErrorHandler);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__centralAsyncErrorHandler);
        
        attr.set(value);
        set(MvwDMSAG.__centralAsyncErrorHandler,attr);
    }

    /**
     * Removes the centralAsyncErrorHandler attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remCentralAsyncErrorHandler(){
         rem(MvwDMSAG.__centralAsyncErrorHandler);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Boolean isAddedToRunContext(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__addedToRunContext);
        if (attr == null)
            return(true);

        return(attr.getSV());
    }

    /**
     * Sets addedToRunContext to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setAddedToRunContext(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__addedToRunContext);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__addedToRunContext);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__addedToRunContext,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets addedToRunContext to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setAddedToRunContext(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__addedToRunContext);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__addedToRunContext);
        
        attr.set(value);
        set(MvwDMSAG.__addedToRunContext,attr);
    }

    /**
     * Removes the addedToRunContext attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remAddedToRunContext(){
         rem(MvwDMSAG.__addedToRunContext);
    }

    /**
     * @return An Iterator of PresenterDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1136)
    public Iterator<PresenterREF> getInstantiatesPresenter(){
        DmcTypePresenterREFMV attr = (DmcTypePresenterREFMV) get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null)
            return( ((List<PresenterREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<PresenterREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of PresenterREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1156)
    public Iterator<PresenterREF> getInstantiatesPresenterREFs(){
        DmcTypePresenterREFMV attr = (DmcTypePresenterREFMV) get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null)
            return( ((List<PresenterREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another instantiatesPresenter to the specified value.
     * @param value Presenter
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1170)
    public DmcAttribute<?> addInstantiatesPresenter(PresenterDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null)
            attr = new DmcTypePresenterREFMV(MvwDMSAG.__instantiatesPresenter);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__instantiatesPresenter,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another instantiatesPresenter value.
     * @param value A value compatible with Presenter
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1411)
    public DmcAttribute<?> addInstantiatesPresenter(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null)
            attr = new DmcTypePresenterREFMV(MvwDMSAG.__instantiatesPresenter);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__instantiatesPresenter,attr);
        return(attr);
    }

    /**
     * Returns the number of values in instantiatesPresenter
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1428)
    public int getInstantiatesPresenterSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesPresenter);
        if (attr == null){
            if (MvwDMSAG.__instantiatesPresenter.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__instantiatesPresenter.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a instantiatesPresenter value.
     * @param value The Presenter to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1467)
    public DmcAttribute<?> delInstantiatesPresenter(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesPresenter);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypePresenterREFMV(MvwDMSAG.__instantiatesPresenter), value);
        else
            attr = del(MvwDMSAG.__instantiatesPresenter, value);
        
        return(attr);
    }

    /**
     * Removes the instantiatesPresenter attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1521)
    public void remInstantiatesPresenter(){
         rem(MvwDMSAG.__instantiatesPresenter);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public Integer getItemOrder(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MvwDMSAG.__itemOrder);
        if (attr == null)
            return(50);

        return(attr.getSV());
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setItemOrder(Integer value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__itemOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MvwDMSAG.__itemOrder);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__itemOrder,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets itemOrder to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setItemOrder(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(MvwDMSAG.__itemOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MvwDMSAG.__itemOrder);
        
        attr.set(value);
        set(MvwDMSAG.__itemOrder,attr);
    }

    /**
     * Removes the itemOrder attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remItemOrder(){
         rem(MvwDMSAG.__itemOrder);
    }

    /**
     * @return An Iterator of ActionBindingDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1136)
    public Iterator<ActionBindingREF> getImplementsAction(){
        DmcTypeActionBindingREFMV attr = (DmcTypeActionBindingREFMV) get(MvwDMSAG.__implementsAction);
        if (attr == null)
            return( ((List<ActionBindingREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ActionBindingREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ActionBindingREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1156)
    public Iterator<ActionBindingREF> getImplementsActionREFs(){
        DmcTypeActionBindingREFMV attr = (DmcTypeActionBindingREFMV) get(MvwDMSAG.__implementsAction);
        if (attr == null)
            return( ((List<ActionBindingREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another implementsAction to the specified value.
     * @param value ActionBinding
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1170)
    public DmcAttribute<?> addImplementsAction(ActionBindingDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__implementsAction);
        if (attr == null)
            attr = new DmcTypeActionBindingREFMV(MvwDMSAG.__implementsAction);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__implementsAction,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another implementsAction value.
     * @param value A value compatible with ActionBinding
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1411)
    public DmcAttribute<?> addImplementsAction(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__implementsAction);
        if (attr == null)
            attr = new DmcTypeActionBindingREFMV(MvwDMSAG.__implementsAction);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__implementsAction,attr);
        return(attr);
    }

    /**
     * Returns the number of values in implementsAction
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1428)
    public int getImplementsActionSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__implementsAction);
        if (attr == null){
            if (MvwDMSAG.__implementsAction.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__implementsAction.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a implementsAction value.
     * @param value The ActionBinding to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1467)
    public DmcAttribute<?> delImplementsAction(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__implementsAction);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeActionBindingREFMV(MvwDMSAG.__implementsAction), value);
        else
            attr = del(MvwDMSAG.__implementsAction, value);
        
        return(attr);
    }

    /**
     * Removes the implementsAction attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1521)
    public void remImplementsAction(){
         rem(MvwDMSAG.__implementsAction);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public CamelCaseName getControllerName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__controllerName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets controllerName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setControllerName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__controllerName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__controllerName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__controllerName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets controllerName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setControllerName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__controllerName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__controllerName);
        
        attr.set(value);
        set(MvwDMSAG.__controllerName,attr);
    }

    /**
     * Removes the controllerName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remControllerName(){
         rem(MvwDMSAG.__controllerName);
    }




}
