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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3277)
import java.io.Serializable;                                  // Marker interface for serialization - (GenUtility.java:3258)
import java.util.Iterator;                                    // For JSON formatting - (GenUtility.java:3259)
import org.dmd.dmc.DmcAttributeInfo;                          // Constructor support - (GenUtility.java:3263)
import org.dmd.dmc.DmcInputStreamIF;                          // To support serialization - (GenUtility.java:3260)
import org.dmd.dmc.DmcNameClashResolverIF;                    // Ambiguous reference resolution - (GenUtility.java:3269)
import org.dmd.dmc.DmcNameResolverIF;                         // Reference resolution - (GenUtility.java:3270)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;         // Ambiguous reference resolution - (GenUtility.java:3268)
import org.dmd.dmc.DmcObject;                                 // Ambiguous reference resolution - (GenUtility.java:3271)
import org.dmd.dmc.DmcOutputStreamIF;                         // To support serialization - (GenUtility.java:3261)
import org.dmd.dmc.DmcValueException;                         // Type checking - (GenUtility.java:3264)
import org.dmd.dmc.DmcValueExceptionSet;                      // Ambiguous reference resolution - (GenUtility.java:3272)
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;          // Derivation base - (GenUtility.java:3267)



@SuppressWarnings("serial")
/**
 * The DmcTypeDisplayDataSpec class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3284)
 *    Called from: Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:1036)
 */
abstract public class DmcTypeDisplayDataSpec extends DmcTypeComplexTypeWithRefs<DisplayDataSpec> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeDisplayDataSpec(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeDisplayDataSpec(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected void formatValueAsJSON(StringBuffer sb, int padding, String indent) {
        if (getMVSize() == 0){
            getSV().toJSON(sb,padding,indent);
        }
        else {
            Iterator<DisplayDataSpec> it = getMV();
            while(it.hasNext()){
                DisplayDataSpec value = it.next();
                value.toJSON(sb,padding,indent);
                if (it.hasNext())
                    sb.append(", \n");                    
            }
        }
    }

    protected DisplayDataSpec typeCheck(Object value) throws DmcValueException {
        DisplayDataSpec rc = null;

        if (value instanceof DisplayDataSpec){
            rc = (DisplayDataSpec)value;
        }
        else if (value instanceof String){
            rc = new DisplayDataSpec((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DisplayDataSpec expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public DisplayDataSpec cloneValue(DisplayDataSpec val){
        return(new DisplayDataSpec(val));
    }

    /**
     * Writes a DisplayDataSpec.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, DisplayDataSpec value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a DisplayDataSpec.
     */
    @Override
    public DisplayDataSpec deserializeValue(DmcInputStreamIF dis) throws Exception {
        DisplayDataSpec rc = new DisplayDataSpec();
        rc.deserializeIt(dis);
        return(rc);
    }

    /**
     * Resolves a DisplayDataSpec.
     */
    @Override
    public void resolveValue(DmcNameResolverIF resolver, DisplayDataSpec value, String attrName) throws DmcValueException {
        value.resolve(resolver,attrName);
    }

    /**
     * Resolves a DisplayDataSpec.
     */
    @Override
    public void resolveValue(DmcNameResolverWithClashSupportIF resolver, DisplayDataSpec value, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        value.resolve(resolver,object,ncr,ai);
    }



}
