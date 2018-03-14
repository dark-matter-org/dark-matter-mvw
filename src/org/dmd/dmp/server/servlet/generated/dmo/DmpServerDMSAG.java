package org.dmd.dmp.server.servlet.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1232)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:1147)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:1146)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:1148)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1149)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:1150)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Naming attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1191)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1154)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1155)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1160)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1200)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:145)
public class DmpServerDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmpServer";


    static int schemaBaseID = 700;


    static int schemaIDRange = 50;


    static int schemaMaxID = 750;

    public final static DmcAttributeInfo __idRI = new DmcAttributeInfo("dmpServer", "idRI", 705, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __pluginClass = new DmcAttributeInfo("dmpServer", "pluginClass", 703, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __pluginName = new DmcAttributeInfo("dmpServer", "pluginName", 701, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __runnable = new DmcAttributeInfo("dmpServer", "runnable", 709, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __sessionHostRI = new DmcAttributeInfo("dmpServer", "sessionHostRI", 707, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __sessionIDRI = new DmcAttributeInfo("dmpServer", "sessionIDRI", 706, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __startOrder = new DmcAttributeInfo("dmpServer", "startOrder", 702, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __useSchemaClass = new DmcAttributeInfo("dmpServer", "useSchemaClass", 704, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __userRefRI = new DmcAttributeInfo("dmpServer", "userRefRI", 708, "UserRI", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:191)
    public final static DmcTypeInfo __type_PluginConfig = new DmcTypeInfo("PluginConfig", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_SessionFolderRI = new DmcTypeInfo("SessionFolderRI", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_SessionRI = new DmcTypeInfo("SessionRI", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_UserFolderRI = new DmcTypeInfo("UserFolderRI", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_UserRI = new DmcTypeInfo("UserRI", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
    public final static DmcClassInfo __PluginConfig = new DmcClassInfo("PluginConfig","org.dmd.dmp.server.servlet.generated.dmo.PluginConfigDMO", 1401, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __SessionFolderRI = new DmcClassInfo("SessionFolderRI","org.dmd.dmp.server.servlet.generated.dmo.SessionFolderRIDMO", 1404, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__dotName);
    public final static DmcClassInfo __SessionRI = new DmcClassInfo("SessionRI","org.dmd.dmp.server.servlet.generated.dmo.SessionRIDMO", 1405, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__dotName);
    public final static DmcClassInfo __UserFolderRI = new DmcClassInfo("UserFolderRI","org.dmd.dmp.server.servlet.generated.dmo.UserFolderRIDMO", 1402, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__dotName);
    public final static DmcClassInfo __UserRI = new DmcClassInfo("UserRI","org.dmd.dmp.server.servlet.generated.dmo.UserRIDMO", 1403, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__dotName);

    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  HashMap<String, DmcTypeInfo> _TImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _TImAp = new HashMap<String, DmcTypeInfo>();

        _RmAp = new ArrayList<RuleIF>();

        DmpServerDMSAGAMAP.initSmAp(_SmAp);

        DmpServerDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:315)
    static {


        DmpServerDMSAG_INIT_1.initDefinitions();
    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:372)
    static {


    }

    static  DmpServerDMSAG instance;

    protected DmpServerDMSAG (){
    }

    public synchronized static DmpServerDMSAG instance(){
        if (instance == null)
            instance = new DmpServerDMSAG();
        
        return(instance);
    }


    public DmcClassInfo getClassInfo(Integer id){
        return(_CmAp.get(id));
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getAttributeInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcClassInfo> getClassInfo(){
        return(_CmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcFilterBuilderIF> getFilterBuilders(){
        return(_FmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public Iterator<DmcTypeInfo> getTypeInfo(){
        return(_TImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


    public int getSchemaBaseID(){
        return(schemaBaseID);
    }


    public int getSchemaIDRange(){
        return(schemaIDRange);
    }


    public int getSchemaMaxID(){
        return(schemaMaxID);
    }


    public Iterator<RuleIF> getRules(){
        return(_RmAp.iterator());
    }


}

