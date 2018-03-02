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
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:148)
import java.io.Serializable;                                                               // To prevent serialization warnings - (NewComplexTypeFormatter.java:113)
import java.util.ArrayList;                                                                // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:120)
import org.dmd.dmc.DmcAttributeInfo;                                                       // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcInputStreamIF;                                                       // Standard serialization techniques - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcOutputStreamIF;                                                      // Standard serialization techniques - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.DmcValueException;                                                      // Standard value exception - (NewComplexTypeFormatter.java:143)
import org.dmd.dmc.util.ComplexTypeSplitter;                                               // For parsing initial input - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.util.JSONUtil;                                                          // To perform escaping of things in JSON - (NewComplexTypeFormatter.java:122)
import org.dmd.dmc.util.ParsedNameValuePair;                                               // To store values parsed from initial input - (NewComplexTypeFormatter.java:121)
import org.dmd.dms.generated.enums.DataTypeEnum;                                           // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:116)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                          // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:117)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                                    // Standard type - (NewComplexTypeFormatter.java:1141)
import org.dmd.mvw.tools.mvwgenerator.generated.enums.EventScopeEnum;                      // Primitive type - (NewComplexTypeFormatter.java:1124)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeEventScopeEnumSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:1141)



@SuppressWarnings("serial")
/**
 * The OperationSpec class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:155)
 */
public class OperationSpec implements Serializable {

    final static int requiredParts = 2;

    // A variable name previously defined, usually in a displayData attribute
    String varNameV;

    final static DmcAttributeInfo varNameAI = new DmcAttributeInfo("varName",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // The scope of the event
    EventScopeEnum scopeV;

    final static DmcAttributeInfo scopeAI = new DmcAttributeInfo("scope",0,"EventScopeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    /**
     * Default constructor.
     */
    public OperationSpec(){
    }

    /**
     * Copy constructor.
     */
    public OperationSpec(OperationSpec original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1078)
        varNameV =  original.varNameV;
        scopeV =  original.scopeV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:186)
     */
    public OperationSpec(String varName_, EventScopeEnum scope_) throws DmcValueException {
        varNameV = DmcTypeStringSTATIC.instance.typeCheck(varName_);
        scopeV = DmcTypeEventScopeEnumSTATIC.instance.typeCheck(scope_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:269)
     */
    public OperationSpec(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:277)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: OperationSpec\nValue: " + initialInput));

        varNameV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(0).getValue());
        scopeV = DmcTypeEventScopeEnumSTATIC.instance.typeCheck(nvp.get(1).getValue());
    }

    /**
     * Serialization.
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        dos.writeUTF(toString());
    }

    /**
     * Deserialization.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        initialize(dis.readUTF());
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:403)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(varNameV.toString());
        sb.append(' ');
        sb.append(scopeV.toString());
        return(sb.toString());
    }

    /**
     * JSON form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:504)
     */
    public void toJSON(StringBuffer sb, int padding, String indent){
        sb.append(indent + "{\n");
        sb.append(indent + "  \"varName\": \"" + JSONUtil.escape(varNameV.toString()) + "\",\n");
        sb.append(indent + "  \"scope\": \"" + JSONUtil.escape(scopeV.toString()) + "\"");
        sb.append("\n" + indent + "}");
    }

    public String getVarName(){
        return(varNameV);
    }

    public EventScopeEnum getScope(){
        return(scopeV);
    }

}
