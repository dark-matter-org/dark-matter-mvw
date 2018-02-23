//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                                  // Always required - (GenUtility.java:220)
import java.util.*;                                                           // Always required if we have any MV attributes - (GenUtility.java:215)
import org.dmd.dmc.DmcAttribute;                                              // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object - (GenUtility.java:371)
import org.dmd.dmc.DmcSliceInfo;                                              // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                                         // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.CamelCaseName;                                       // Naming attribute type - (GenUtility.java:366)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                          // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                    // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                          // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dms.generated.types.DmcTypeStringSET;                          // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type - (GenUtility.java:324)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Base class - (GenUtility.java:351)

/**
 * The RunContextItem allows for the generation of an overall RunContext
 * for\n a WebApplication or WebSite.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class RunContextItemDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "RunContextItem";


    static {
    }

    public RunContextItemDMO() {
        super("RunContextItem");
    }

    protected RunContextItemDMO(String oc) {
        super(oc);
    }

    @Override
    public RunContextItemDMO getNew(){
        RunContextItemDMO rc = new RunContextItemDMO();
        return(rc);
    }

    @Override
    public RunContextItemDMO getSlice(DmcSliceInfo info){
        RunContextItemDMO rc = new RunContextItemDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public RunContextItemDMO(DmcTypeModifierMV mods) {
        super("RunContextItem");
        modrec(true);
        setModifier(mods);
    }

    public RunContextItemDMO getModificationRecorder(){
        RunContextItemDMO rc = new RunContextItemDMO();
        rc.setItemName(getItemName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__itemName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:761)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__itemName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public boolean equals(Object obj){
        if (obj instanceof RunContextItemDMO){
            return( getObjectName().equals( ((RunContextItemDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remItemOrder(){
         rem(MvwDMSAG.__itemOrder);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getContextImpl(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__contextImpl);
        if (attr == null)
            return("Default");

        return(attr.getSV());
    }

    /**
     * Sets contextImpl to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setContextImpl(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__contextImpl);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__contextImpl);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__contextImpl,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets contextImpl to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setContextImpl(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__contextImpl);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__contextImpl);
        
        attr.set(value);
        set(MvwDMSAG.__contextImpl,attr);
    }

    /**
     * Removes the contextImpl attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remContextImpl(){
         rem(MvwDMSAG.__contextImpl);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1102)
    public Iterator<String> getImportThis(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__importThis);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1114)
    public String getNthImportThis(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__importThis);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another importThis to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> addImportThis(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__importThis);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__importThis,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1203)
    public boolean importThisContains(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addImportThis(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__importThis);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__importThis,attr);
        return(attr);
    }

    /**
     * Returns the number of values in importThis
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getImportThisSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        if (attr == null){
            if (MvwDMSAG.__importThis.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__importThis.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a importThis value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delImportThis(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__importThis), value);
        else
            attr = del(MvwDMSAG.__importThis, value);
        
        return(attr);
    }

    /**
     * Deletes a importThis from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public DmcAttribute<?> delImportThis(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__importThis), value);
        else
            attr = del(MvwDMSAG.__importThis, value);
        
        return(attr);
    }

    /**
     * Removes the importThis attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remImportThis(){
         rem(MvwDMSAG.__importThis);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Boolean isCreateOnDemand(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__createOnDemand);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets createOnDemand to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setCreateOnDemand(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__createOnDemand);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__createOnDemand);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__createOnDemand,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets createOnDemand to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setCreateOnDemand(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__createOnDemand);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__createOnDemand);
        
        attr.set(value);
        set(MvwDMSAG.__createOnDemand,attr);
    }

    /**
     * Removes the createOnDemand attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remCreateOnDemand(){
         rem(MvwDMSAG.__createOnDemand);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Boolean isSingleton(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__singleton);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets singleton to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setSingleton(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__singleton);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__singleton);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__singleton,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets singleton to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setSingleton(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__singleton);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__singleton);
        
        attr.set(value);
        set(MvwDMSAG.__singleton,attr);
    }

    /**
     * Removes the singleton attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remSingleton(){
         rem(MvwDMSAG.__singleton);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public Boolean isAutoCreated(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__autoCreated);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets autoCreated to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setAutoCreated(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__autoCreated);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__autoCreated);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__autoCreated,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets autoCreated to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setAutoCreated(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__autoCreated);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__autoCreated);
        
        attr.set(value);
        set(MvwDMSAG.__autoCreated,attr);
    }

    /**
     * Removes the autoCreated attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remAutoCreated(){
         rem(MvwDMSAG.__autoCreated);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public CamelCaseName getItemName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__itemName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets itemName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setItemName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__itemName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__itemName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__itemName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets itemName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setItemName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__itemName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__itemName);
        
        attr.set(value);
        set(MvwDMSAG.__itemName,attr);
    }

    /**
     * Removes the itemName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remItemName(){
         rem(MvwDMSAG.__itemName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getUseClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__useClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setUseClass(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__useClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useClass);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__useClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setUseClass(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__useClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useClass);
        
        attr.set(value);
        set(MvwDMSAG.__useClass,attr);
    }

    /**
     * Removes the useClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remUseClass(){
         rem(MvwDMSAG.__useClass);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public String getConstruction(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__construction);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets construction to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setConstruction(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__construction);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__construction);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__construction,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets construction to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setConstruction(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__construction);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__construction);
        
        attr.set(value);
        set(MvwDMSAG.__construction,attr);
    }

    /**
     * Removes the construction attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remConstruction(){
         rem(MvwDMSAG.__construction);
    }




}