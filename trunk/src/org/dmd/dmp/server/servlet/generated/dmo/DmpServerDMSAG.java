package org.dmd.dmp.server.servlet.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:860)
import java.util.ArrayList;                                        // For storage of schema info - (DmoCompactSchemaFormatter.java:794)
import java.util.HashMap;                                          // For storage of schema info - (DmoCompactSchemaFormatter.java:793)
import java.util.Iterator;                                         // For access of schema info - (DmoCompactSchemaFormatter.java:795)
import org.dmd.dmc.*;                                              // Basic DMC stuff - (DmoCompactSchemaFormatter.java:796)
import org.dmd.dmc.rules.RuleIF;                                   // For rule info - (DmoCompactSchemaFormatter.java:797)
import org.dmd.dmr.shared.base.generated.dmo.DmrBaseDMSAG;         // Required attribute from DmrBaseDMSAG - (DmoCompactSchemaFormatter.java:813)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:813)
import org.dmd.dms.generated.enums.ClassTypeEnum;                  // Have class definitions - (DmoCompactSchemaFormatter.java:801)
import org.dmd.dms.generated.enums.DataTypeEnum;                   // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:802)
import org.dmd.dms.generated.enums.OriginalTypeEnum;               // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:807)
import org.dmd.dms.generated.enums.ValueTypeEnum;                  // Have attribute definitions - (DmoCompactSchemaFormatter.java:828)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:124)
public class DmpServerDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmp.server";


    static int schemaBaseID = 700;


    static int schemaIDRange = 50;


    static int schemaMaxID = 750;

    public final static DmcAttributeInfo __idRI = new DmcAttributeInfo("idRI", 705, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __pluginClass = new DmcAttributeInfo("pluginClass", 703, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __pluginName = new DmcAttributeInfo("pluginName", 701, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __runnable = new DmcAttributeInfo("runnable", 709, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sessionHostRI = new DmcAttributeInfo("sessionHostRI", 707, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sessionIDRI = new DmcAttributeInfo("sessionIDRI", 706, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __startOrder = new DmcAttributeInfo("startOrder", 702, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __useSchemaClass = new DmcAttributeInfo("useSchemaClass", 704, "String", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __userRefRI = new DmcAttributeInfo("userRefRI", 708, "UserRI", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:162)
    public final static DmcTypeInfo __type_PluginConfig = new DmcTypeInfo("PluginConfig", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_SessionFolderRI = new DmcTypeInfo("SessionFolderRI", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_SessionRI = new DmcTypeInfo("SessionRI", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_UserFolderRI = new DmcTypeInfo("UserFolderRI", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_UserRI = new DmcTypeInfo("UserRI", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:203)
    public final static DmcClassInfo __PluginConfig = new DmcClassInfo("PluginConfig","org.dmd.dmp.server.servlet.generated.dmo.PluginConfigDMO", 701, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __SessionFolderRI = new DmcClassInfo("SessionFolderRI","org.dmd.dmp.server.servlet.generated.dmo.SessionFolderRIDMO", 704, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__dotName);
    public final static DmcClassInfo __SessionRI = new DmcClassInfo("SessionRI","org.dmd.dmp.server.servlet.generated.dmo.SessionRIDMO", 705, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__dotName);
    public final static DmcClassInfo __UserFolderRI = new DmcClassInfo("UserFolderRI","org.dmd.dmp.server.servlet.generated.dmo.UserFolderRIDMO", 702, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__dotName);
    public final static DmcClassInfo __UserRI = new DmcClassInfo("UserRI","org.dmd.dmp.server.servlet.generated.dmo.UserRIDMO", 703, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__dotName);

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

        _SmAp.put(__idRI.id,__idRI);
        _SmAp.put(__pluginClass.id,__pluginClass);
        _SmAp.put(__pluginName.id,__pluginName);
        _SmAp.put(__runnable.id,__runnable);
        _SmAp.put(__sessionHostRI.id,__sessionHostRI);
        _SmAp.put(__sessionIDRI.id,__sessionIDRI);
        _SmAp.put(__startOrder.id,__startOrder);
        _SmAp.put(__useSchemaClass.id,__useSchemaClass);
        _SmAp.put(__userRefRI.id,__userRefRI);
        _CmAp.put(__PluginConfig.id,__PluginConfig);
        _CmAp.put(__SessionFolderRI.id,__SessionFolderRI);
        _CmAp.put(__SessionRI.id,__SessionRI);
        _CmAp.put(__UserFolderRI.id,__UserFolderRI);
        _CmAp.put(__UserRI.id,__UserRI);

        __PluginConfig.addMust(MetaDMSAG.__camelCaseName);
        __PluginConfig.addMust(__pluginName);
        __PluginConfig.addMust(__pluginClass);
        __PluginConfig.addMay(__startOrder);
        __PluginConfig.addMay(__runnable);
        __PluginConfig.addMay(MetaDMSAG.__description);
        __PluginConfig.addMay(MetaDMSAG.__lineNumber);
        __PluginConfig.addMay(MetaDMSAG.__file);

        __UserFolderRI.addMust(MetaDMSAG.__dotName);

        __UserRI.addMust(MetaDMSAG.__dotName);
        __UserRI.addMust(__idRI);
        __UserRI.addMust(DmrBaseDMSAG.__userName);
        __UserRI.addMust(DmrBaseDMSAG.__password);

        __SessionFolderRI.addMust(MetaDMSAG.__dotName);

        __SessionRI.addMust(MetaDMSAG.__dotName);
        __SessionRI.addMust(__sessionIDRI);
        __SessionRI.addMust(__sessionHostRI);
        __SessionRI.addMust(__userRefRI);


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
