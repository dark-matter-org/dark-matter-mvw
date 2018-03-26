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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3123)
import java.io.Serializable;                  // Marker interface for serialization - (GenUtility.java:3104)
import java.util.Iterator;                    // For JSON formatting - (GenUtility.java:3105)
import org.dmd.dmc.DmcAttribute;              // Derivation base - (GenUtility.java:3121)
import org.dmd.dmc.DmcAttributeInfo;          // Constructor support - (GenUtility.java:3109)
import org.dmd.dmc.DmcInputStreamIF;          // To support serialization - (GenUtility.java:3106)
import org.dmd.dmc.DmcOutputStreamIF;         // To support serialization - (GenUtility.java:3107)
import org.dmd.dmc.DmcValueException;         // Type checking - (GenUtility.java:3110)



@SuppressWarnings("serial")
/**
 * The DmcTypeEventSpec class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3130)
 *    Called from: Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:1036)
 */
abstract public class DmcTypeEventSpec extends DmcAttribute<EventSpec> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeEventSpec(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeEventSpec(DmcAttributeInfo ai){
        super(ai);
    }

    @Override
    protected void formatValueAsJSON(StringBuffer sb, int padding, String indent) {
        if (getMVSize() == 0){
            getSV().toJSON(sb,padding,indent);
        }
        else {
            Iterator<EventSpec> it = getMV();
            while(it.hasNext()){
                EventSpec value = it.next();
                value.toJSON(sb,padding,indent);
                if (it.hasNext())
                    sb.append(", \n");                    
            }
        }
    }

    protected EventSpec typeCheck(Object value) throws DmcValueException {
        EventSpec rc = null;

        if (value instanceof EventSpec){
            rc = (EventSpec)value;
        }
        else if (value instanceof String){
            rc = new EventSpec((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with EventSpec expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public EventSpec cloneValue(EventSpec val){
        return(new EventSpec(val));
    }

    /**
     * Writes a EventSpec.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, EventSpec value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a EventSpec.
     */
    @Override
    public EventSpec deserializeValue(DmcInputStreamIF dis) throws Exception {
        EventSpec rc = new EventSpec();
        rc.deserializeIt(dis);
        return(rc);
    }



}
