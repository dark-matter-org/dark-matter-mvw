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
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:148)
import java.io.Serializable;                                                                  // To prevent serialization warnings - (NewComplexTypeFormatter.java:113)
import java.util.ArrayList;                                                                   // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:120)
import org.dmd.dmc.DmcAttributeInfo;                                                          // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcContainerIF;                                                            // To support object references - (NewComplexTypeFormatter.java:131)
import org.dmd.dmc.DmcInputStreamIF;                                                          // Standard serialization techniques - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcNameClashResolverIF;                                                    // To support possible clashing object references - (NewComplexTypeFormatter.java:135)
import org.dmd.dmc.DmcNameResolverIF;                                                         // To support object references - (NewComplexTypeFormatter.java:128)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                                         // To support possible clashing object references - (NewComplexTypeFormatter.java:133)
import org.dmd.dmc.DmcNamedObjectIF;                                                          // To support object references - (NewComplexTypeFormatter.java:129)
import org.dmd.dmc.DmcNamedObjectREF;                                                         // To support object references - (NewComplexTypeFormatter.java:130)
import org.dmd.dmc.DmcObject;                                                                 // To support possible clashing object references - (NewComplexTypeFormatter.java:136)
import org.dmd.dmc.DmcOmni;                                                                   // To enable back reference tracking - (NewComplexTypeFormatter.java:138)
import org.dmd.dmc.DmcOutputStreamIF;                                                         // Standard serialization techniques - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.DmcValueException;                                                         // Standard value exception - (NewComplexTypeFormatter.java:143)
import org.dmd.dmc.DmcValueExceptionSet;                                                      // To support possible clashing object references - (NewComplexTypeFormatter.java:137)
import org.dmd.dmc.types.Modifier;                                                            // To enable back reference tracking - (NewComplexTypeFormatter.java:139)
import org.dmd.dmc.util.ComplexTypeSplitter;                                                  // For parsing initial input - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.util.JSONUtil;                                                             // To perform escaping of things in JSON - (NewComplexTypeFormatter.java:122)
import org.dmd.dmc.util.ParsedNameValuePair;                                                  // To store values parsed from initial input - (NewComplexTypeFormatter.java:121)
import org.dmd.dms.generated.enums.DataTypeEnum;                                              // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:116)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                             // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:117)
import org.dmd.dms.generated.types.ClassDefinitionREF;                                        // Object reference - (NewComplexTypeFormatter.java:1116)
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSTATIC;                           // Internally generated type - (NewComplexTypeFormatter.java:1141)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                                       // Standard type - (NewComplexTypeFormatter.java:1141)
import org.dmd.mvw.tools.mvwgenerator.generated.enums.SelectionTypeEnum;                      // Primitive type - (NewComplexTypeFormatter.java:1124)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeSelectionTypeEnumSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:1141)



@SuppressWarnings("serial")
/**
 * The DisplayDataSpec class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:155)
 */
public class DisplayDataSpec implements Serializable {

    final static int requiredParts = 3;

    // The class of object to be displayed
    ClassDefinitionREF dataClassV;

    final static DmcAttributeInfo dataClassAI = new DmcAttributeInfo("dataClass",0,"ClassDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // Indicates whether the data is single or multi-valued
    SelectionTypeEnum cardinalityV;

    final static DmcAttributeInfo cardinalityAI = new DmcAttributeInfo("cardinality",0,"SelectionTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // The variable name used to indicate this piece of data
    String varNameV;

    final static DmcAttributeInfo varNameAI = new DmcAttributeInfo("varName",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    /**
     * Default constructor.
     */
    public DisplayDataSpec(){
    }

    /**
     * Copy constructor.
     */
    public DisplayDataSpec(DisplayDataSpec original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1078)
        dataClassV =  original.dataClassV;
        cardinalityV =  original.cardinalityV;
        varNameV =  original.varNameV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:186)
     */
    public DisplayDataSpec(ClassDefinitionREF dataClass_, SelectionTypeEnum cardinality_, String varName_) throws DmcValueException {
        dataClassV = DmcTypeClassDefinitionREFSTATIC.instance.typeCheck(dataClass_);
        cardinalityV = DmcTypeSelectionTypeEnumSTATIC.instance.typeCheck(cardinality_);
        varNameV = DmcTypeStringSTATIC.instance.typeCheck(varName_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:269)
     */
    public DisplayDataSpec(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:277)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: DisplayDataSpec\nValue: " + initialInput));

        dataClassV = DmcTypeClassDefinitionREFSTATIC.instance.typeCheck(nvp.get(0).getValue());
        cardinalityV = DmcTypeSelectionTypeEnumSTATIC.instance.typeCheck(nvp.get(1).getValue());
        varNameV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(2).getValue());
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
        sb.append(dataClassV.toString());
        sb.append(' ');
        sb.append(cardinalityV.toString());
        sb.append(' ');
        sb.append(varNameV.toString());
        return(sb.toString());
    }

    /**
     * JSON form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:504)
     */
    public void toJSON(StringBuffer sb, int padding, String indent){
        sb.append(indent + "{\n");
        sb.append(indent + "  \"dataClass\": \"" + JSONUtil.escape(dataClassV.toString()) + "\",\n");
        sb.append(indent + "  \"cardinality\": \"" + JSONUtil.escape(cardinalityV.toString()) + "\",\n");
        sb.append(indent + "  \"varName\": \"" + JSONUtil.escape(varNameV.toString()) + "\"");
        sb.append("\n" + indent + "}");
    }

    public ClassDefinitionREF getDataClass(){
        return(dataClassV);
    }

    public SelectionTypeEnum getCardinality(){
        return(cardinalityV);
    }

    public String getVarName(){
        return(varNameV);
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:692)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if ((dataClassV != null) && (!dataClassV.isResolved())){
            obj = resolver.findNamedObject(dataClassV.getObjectName());
            if (dataClassAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + dataClassV.getObjectName() + "(part: dataClass - of type: ClassDefinition) via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)dataClassV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)dataClassV).setObject(obj);
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:763)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if ((dataClassV != null) && (!dataClassV.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, dataClassV.getObjectName(), ncr, dataClassAI);
            if (dataClassAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + dataClassV.getObjectName() + "(part: dataClass - of type: ClassDefinition) via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)dataClassV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)dataClassV).setObject(obj);
        
            if (DmcOmni.instance().backRefTracking()){
                Modifier backrefMod = new Modifier("dataClass", object, dataClassV, ai.id);
                if (obj instanceof DmcContainerIF)
                    ((DmcContainerIF)obj).getDmcObject().addBackref(backrefMod);
                else
                    ((DmcObject)obj).addBackref(backrefMod);
                dataClassV.setBackrefModifier(backrefMod);
            }
        }
        
    }

}
