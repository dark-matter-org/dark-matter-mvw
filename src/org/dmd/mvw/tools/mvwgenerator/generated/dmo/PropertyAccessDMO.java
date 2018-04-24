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
import java.io.Serializable;                                                                       // Always required - (GenUtility.java:227)
import java.util.*;                                                                                // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                                                   // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                                               // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                                                        // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                                                   // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                                              // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.CamelCaseName;                                                            // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;                                               // Type specific set/add - (GenUtility.java:318)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                        // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.ClassDefinitionREF;                                             // Helper class - (GenUtility.java:346)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                                         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSET;                                   // Reference type - (GenUtility.java:311)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                              // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;                              // Base class - (GenUtility.java:367)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PropertyAccessGeneratorDMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypePropertyAccessGeneratorREFSV;         // Reference type - (GenUtility.java:311)
import org.dmd.mvw.tools.mvwgenerator.generated.types.PropertyAccessGeneratorREF;                  // Helper class - (GenUtility.java:346)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The PropertyAccess class allows for the specification of a set of
 * classes\n for which you'd like to invoke the specified property access
 * generator that creates\n property access mechanisms.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class PropertyAccessDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "PropertyAccess";


    static {
    }

    public PropertyAccessDMO() {
        super("PropertyAccess");
    }

    protected PropertyAccessDMO(String oc) {
        super(oc);
    }

    @Override
    public PropertyAccessDMO getNew(){
        PropertyAccessDMO rc = new PropertyAccessDMO();
        return(rc);
    }

    @Override
    public PropertyAccessDMO getSlice(DmcSliceInfo info){
        PropertyAccessDMO rc = new PropertyAccessDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public PropertyAccessDMO(DmcTypeModifierMV mods) {
        super("PropertyAccess");
        modrec(true);
        setModifier(mods);
    }

    public PropertyAccessDMO getModificationRecorder(){
        PropertyAccessDMO rc = new PropertyAccessDMO();
        rc.setPropertyAccessName(getPropertyAccessName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__propertyAccessName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__propertyAccessName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof PropertyAccessDMO){
            return( getObjectName().equals( ((PropertyAccessDMO) obj).getObjectName()) );
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:796)
    public CamelCaseName getPropertyAccessName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__propertyAccessName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets propertyAccessName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
    public void setPropertyAccessName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__propertyAccessName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__propertyAccessName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__propertyAccessName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets propertyAccessName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setPropertyAccessName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__propertyAccessName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__propertyAccessName);
        
        attr.set(value);
        set(MvwDMSAG.__propertyAccessName,attr);
    }

    /**
     * Removes the propertyAccessName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remPropertyAccessName(){
         rem(MvwDMSAG.__propertyAccessName);
    }

    /**
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:982)
    public Iterator<ClassDefinitionREF> getAccessFor(){
        DmcTypeClassDefinitionREFSET attr = (DmcTypeClassDefinitionREFSET) get(MvwDMSAG.__accessFor);
        if (attr == null)
            return( ((List<ClassDefinitionREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ClassDefinitionREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ClassDefinitionREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1002)
    public Iterator<ClassDefinitionREF> getAccessForREFs(){
        DmcTypeClassDefinitionREFSET attr = (DmcTypeClassDefinitionREFSET) get(MvwDMSAG.__accessFor);
        if (attr == null)
            return( ((List<ClassDefinitionREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another accessFor to the specified value.
     * @param value ClassDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1016)
    public DmcAttribute<?> addAccessFor(ClassDefinitionDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__accessFor);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSET(MvwDMSAG.__accessFor);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__accessFor,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another accessFor value.
     * @param value A value compatible with ClassDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1257)
    public DmcAttribute<?> addAccessFor(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__accessFor);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSET(MvwDMSAG.__accessFor);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__accessFor,attr);
        return(attr);
    }

    /**
     * Returns the number of values in accessFor
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
    public int getAccessForSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__accessFor);
        if (attr == null){
            if (MvwDMSAG.__accessFor.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__accessFor.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a accessFor value.
     * @param value The ClassDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1313)
    public DmcAttribute<?> delAccessFor(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__accessFor);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeClassDefinitionREFSET(MvwDMSAG.__accessFor), value);
        else
            attr = del(MvwDMSAG.__accessFor, value);
        
        return(attr);
    }

    /**
     * Removes the accessFor attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1367)
    public void remAccessFor(){
         rem(MvwDMSAG.__accessFor);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:667)
    public PropertyAccessGeneratorREF getAccessGenerator(){
        DmcTypePropertyAccessGeneratorREFSV attr = (DmcTypePropertyAccessGeneratorREFSV) get(MvwDMSAG.__accessGenerator);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to PropertyAccessGenerator without attempting lazy resolution (if turned on).
     */
    public PropertyAccessGeneratorREF getAccessGeneratorREF(){
        DmcTypePropertyAccessGeneratorREFSV attr = (DmcTypePropertyAccessGeneratorREFSV) get(MvwDMSAG.__accessGenerator);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets accessGenerator to the specified value.
     * @param value PropertyAccessGeneratorDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
    public void setAccessGenerator(PropertyAccessGeneratorDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__accessGenerator);
        if (attr == null)
            attr = new DmcTypePropertyAccessGeneratorREFSV(MvwDMSAG.__accessGenerator);
        else
            ((DmcTypePropertyAccessGeneratorREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(MvwDMSAG.__accessGenerator,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets accessGenerator to the specified value.
     * @param value A value compatible with DmcTypePropertyAccessGeneratorREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setAccessGenerator(Object value) throws DmcValueException {
        DmcTypePropertyAccessGeneratorREFSV attr  = (DmcTypePropertyAccessGeneratorREFSV) get(MvwDMSAG.__accessGenerator);
        if (attr == null)
            attr = new DmcTypePropertyAccessGeneratorREFSV(MvwDMSAG.__accessGenerator);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(MvwDMSAG.__accessGenerator,attr);
    }

    /**
     * Removes the accessGenerator attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remAccessGenerator(){
         rem(MvwDMSAG.__accessGenerator);
    }




}
