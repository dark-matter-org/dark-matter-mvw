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
// Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:101)
import java.io.Serializable;                                                                  // To prevent serialization warnings - (ComplexTypeFormatter.java:70)
import org.dmd.dmc.DmcInputStreamIF;                                                          // Standard serialization techniques - (ComplexTypeFormatter.java:71)
import org.dmd.dmc.DmcOutputStreamIF;                                                         // Standard serialization techniques - (ComplexTypeFormatter.java:72)
import org.dmd.dmc.DmcValueException;                                                         // Standard value exception - (ComplexTypeFormatter.java:94)
import org.dmd.dmc.types.IntegerVar;                                                          // To support getNextField() - (ComplexTypeFormatter.java:73)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                                       // Standard type - (ComplexTypeFormatter.java:460)
import org.dmd.mvw.tools.mvwgenerator.generated.enums.EventScopeEnum;                         // Primitive type - (ComplexTypeFormatter.java:442)
import org.dmd.mvw.tools.mvwgenerator.generated.enums.SelectionTypeEnum;                      // Primitive type - (ComplexTypeFormatter.java:442)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeEventScopeEnumSTATIC;            // Internally generated type - (ComplexTypeFormatter.java:460)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeSelectionTypeEnumSTATIC;         // Internally generated type - (ComplexTypeFormatter.java:460)
@SuppressWarnings("serial")
/**
 * The EventSpec class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:108)
 */
public class EventSpec implements Serializable {

    // A variable name previously defined, usually in a displayData attribute
    String varName;

    // Indicates whether the data is single or multi-valued
    SelectionTypeEnum cardinality;

    // The scope of the event
    EventScopeEnum scope;

    /**
     * Default constructor.
     */
    public EventSpec(){
    }

    /**
     * Copy constructor.
     */
    public EventSpec(EventSpec original){
        varName = original.varName;
        cardinality = original.cardinality;
        scope = original.scope;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:135)
     */
    public EventSpec(String f1, SelectionTypeEnum f2, EventScopeEnum f3) throws DmcValueException {
        varName = DmcTypeStringSTATIC.instance.typeCheck(f1);
        cardinality = DmcTypeSelectionTypeEnumSTATIC.instance.typeCheck(f2);
        scope = DmcTypeEventScopeEnumSTATIC.instance.typeCheck(f3);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:175)
     */
    public EventSpec(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        String input = initialInput.trim();
        input = input.replaceAll("(\\s)+", " ");
        varName = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"varName",false));
        cardinality = DmcTypeSelectionTypeEnumSTATIC.instance.typeCheck(getNextField(input,seppos,"cardinality",false));
        scope = DmcTypeEventScopeEnumSTATIC.instance.typeCheck(getNextField(input,seppos,"scope",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:207)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeStringSTATIC.instance.serializeValue(dos, varName);
        DmcTypeSelectionTypeEnumSTATIC.instance.serializeValue(dos, cardinality);
        DmcTypeEventScopeEnumSTATIC.instance.serializeValue(dos, scope);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:224)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        varName = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        cardinality = DmcTypeSelectionTypeEnumSTATIC.instance.deserializeValue(dis);
        scope = DmcTypeEventScopeEnumSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     */
    public String toString(){
        return(varName.toString() + " " + cardinality.toString() + " " + scope.toString());
    }

    public String getVarName(){
        return(varName);
    }

    public SelectionTypeEnum getCardinality(){
        return(cardinality);
    }

    public EventScopeEnum getScope(){
        return(scope);
    }

    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length())
    		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: EventSpec"));

    	   if (last){
    	       rc = input.substring(start+1);
    	   }
    	   else{
    	       int pos = -1;
    	       if (start > 0)
    		       pos = input.indexOf(" ", start+1);
    	       else
    		       pos = input.indexOf(" ");

    	       if (pos == -1)
    		       throw (new DmcValueException("Missing value for field: " + fn + " in complex type: EventSpec"));

    		   while(pos < (input.length()-1)){
    		       if ( input.charAt(pos+1) == ' ')
    		           pos++;
    		       else
    		           break;
    		   }

    	       rc = input.substring(start+1, pos).trim();

    	       seppos.set(pos);
        }

        return(rc);
    }

}
