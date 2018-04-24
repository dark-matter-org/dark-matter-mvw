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
import java.io.Serializable;                                                          // Always required - (GenUtility.java:227)
import org.dmd.dmc.DmcAttribute;                                                      // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                                  // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcValueException;                                                 // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.CamelCaseName;                                               // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                            // Required type - (GenUtility.java:339)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuElementDefinitionDMO;         // Base class - (GenUtility.java:367)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The Menu is a common base for all definitions associated with\n the
 * definition of menus of different types e.g. toolbars, menubars, popups etc.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
abstract public class MenuDMO  extends MenuElementDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Menu";


    static {
    }

    public MenuDMO() {
        super("Menu");
    }

    protected MenuDMO(String oc) {
        super(oc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__elementName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__elementName);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof MenuDMO){
            return( getObjectName().equals( ((MenuDMO) obj).getObjectName()) );
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
    public CamelCaseName getElementName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__elementName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:836)
    public void setElementName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__elementName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__elementName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__elementName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:889)
    public void setElementName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__elementName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__elementName);
        
        attr.set(value);
        set(MvwDMSAG.__elementName,attr);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:909)
    public void remElementName(){
         rem(MvwDMSAG.__elementName);
    }




}
