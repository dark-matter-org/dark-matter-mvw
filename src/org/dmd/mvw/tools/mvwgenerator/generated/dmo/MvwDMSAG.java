package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:860)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:794)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:793)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:795)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:796)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:797)
import org.dmd.dmg.generated.dmo.DmgDMSAG;                   // Required attribute from DmgDMSAG - (DmoCompactSchemaFormatter.java:813)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:813)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:801)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:802)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:807)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:828)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:124)
public class MvwDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "mvw";


    static int schemaBaseID = 800;


    static int schemaIDRange = 200;


    static int schemaMaxID = 1000;

    public final static DmcAttributeInfo __abstractActivity = new DmcAttributeInfo("abstractActivity", 858, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __actionBindingName = new DmcAttributeInfo("actionBindingName", 874, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __activityName = new DmcAttributeInfo("activityName", 840, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __addToMenu = new DmcAttributeInfo("addToMenu", 870, "Menu", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __addedToRunContext = new DmcAttributeInfo("addedToRunContext", 859, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __alternateMenuBar = new DmcAttributeInfo("alternateMenuBar", 867, "MenuElementTypeAndComment", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __alternateMenuItem = new DmcAttributeInfo("alternateMenuItem", 879, "MenuElementTypeAndComment", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __alternateSubMenu = new DmcAttributeInfo("alternateSubMenu", 877, "MenuElementTypeAndComment", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __alwaysEnabled = new DmcAttributeInfo("alwaysEnabled", 871, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __appName = new DmcAttributeInfo("appName", 833, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __argVector = new DmcAttributeInfo("argVector", 803, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __autoCreated = new DmcAttributeInfo("autoCreated", 897, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __bindingName = new DmcAttributeInfo("bindingName", 885, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __broadcast = new DmcAttributeInfo("broadcast", 822, "Event", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __broadcastOnly = new DmcAttributeInfo("broadcastOnly", 823, "Event", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __centralAsyncErrorHandler = new DmcAttributeInfo("centralAsyncErrorHandler", 901, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __centralDMPErrorHandler = new DmcAttributeInfo("centralDMPErrorHandler", 851, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __centralRPCErrorHandler = new DmcAttributeInfo("centralRPCErrorHandler", 852, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __clickEvent = new DmcAttributeInfo("clickEvent", 819, "OperationSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __codeSplit = new DmcAttributeInfo("codeSplit", 900, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __componentName = new DmcAttributeInfo("componentName", 811, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __configName = new DmcAttributeInfo("configName", 865, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __construction = new DmcAttributeInfo("construction", 828, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __contextImpl = new DmcAttributeInfo("contextImpl", 830, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __controllerName = new DmcAttributeInfo("controllerName", 834, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __createEvent = new DmcAttributeInfo("createEvent", 821, "OperationSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __createOnDemand = new DmcAttributeInfo("createOnDemand", 861, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __defaultMenuBar = new DmcAttributeInfo("defaultMenuBar", 866, "MenuElementTypeAndComment", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __defaultMenuItem = new DmcAttributeInfo("defaultMenuItem", 878, "MenuElementTypeAndComment", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __defaultPlace = new DmcAttributeInfo("defaultPlace", 857, "Place", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __defaultSeparator = new DmcAttributeInfo("defaultSeparator", 882, "MenuElementTypeAndComment", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __defaultSubMenu = new DmcAttributeInfo("defaultSubMenu", 876, "MenuElementTypeAndComment", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule", 800, "Module", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __deleteEvent = new DmcAttributeInfo("deleteEvent", 818, "EventSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependsOnModule = new DmcAttributeInfo("dependsOnModule", 805, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __displayDMO = new DmcAttributeInfo("displayDMO", 816, "DisplayDataSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __displayLabel = new DmcAttributeInfo("displayLabel", 873, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __displayLabelI18N = new DmcAttributeInfo("displayLabelI18N", 884, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __editField = new DmcAttributeInfo("editField", 887, "EditField", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __editObject = new DmcAttributeInfo("editObject", 886, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __editorName = new DmcAttributeInfo("editorName", 888, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __elementName = new DmcAttributeInfo("elementName", 868, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __enumGeneratorClass = new DmcAttributeInfo("enumGeneratorClass", 903, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __eventName = new DmcAttributeInfo("eventName", 809, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __firedInThisModule = new DmcAttributeInfo("firedInThisModule", 899, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent", 801, "Event", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent", 802, "Event", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __implementedBy = new DmcAttributeInfo("implementedBy", 881, "Component", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __implementsAction = new DmcAttributeInfo("implementsAction", 880, "ActionBinding", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __importThis = new DmcAttributeInfo("importThis", 831, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __instantiatesPresenter = new DmcAttributeInfo("instantiatesPresenter", 860, "Presenter", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __instantiatesView = new DmcAttributeInfo("instantiatesView", 862, "View", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __itemName = new DmcAttributeInfo("itemName", 827, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __itemOrder = new DmcAttributeInfo("itemOrder", 829, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __local = new DmcAttributeInfo("local", 832, "Event", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __localEvent = new DmcAttributeInfo("localEvent", 814, "EventWithArgs", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __managesView = new DmcAttributeInfo("managesView", 841, "View", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mappingGenerator = new DmcAttributeInfo("mappingGenerator", 902, "EnumMappingGenerator", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __mappingName = new DmcAttributeInfo("mappingName", 890, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __menuImplementation = new DmcAttributeInfo("menuImplementation", 883, "MenuImplementationConfig", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __menuOrder = new DmcAttributeInfo("menuOrder", 872, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __modifyEvent = new DmcAttributeInfo("modifyEvent", 820, "OperationSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __moduleName = new DmcAttributeInfo("moduleName", 810, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __parentPlace = new DmcAttributeInfo("parentPlace", 856, "Place", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __placeName = new DmcAttributeInfo("placeName", 853, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __placePrefix = new DmcAttributeInfo("placePrefix", 854, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __presenterImport = new DmcAttributeInfo("presenterImport", 836, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __presenterMethod = new DmcAttributeInfo("presenterMethod", 824, "MethodWithArgs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __presenterName = new DmcAttributeInfo("presenterName", 839, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __runsActivity = new DmcAttributeInfo("runsActivity", 855, "Activity", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __selectEvent = new DmcAttributeInfo("selectEvent", 817, "EventSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __selectedDMO = new DmcAttributeInfo("selectedDMO", 806, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sendsRequest = new DmcAttributeInfo("sendsRequest", 896, "RequestTypeWithOptions", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __sharedImport = new DmcAttributeInfo("sharedImport", 838, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __singleton = new DmcAttributeInfo("singleton", 863, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __skipEnumValue = new DmcAttributeInfo("skipEnumValue", 895, "String", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __strictlyChecked = new DmcAttributeInfo("strictlyChecked", 889, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __tipsFromI18N = new DmcAttributeInfo("tipsFromI18N", 894, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __triggersAction = new DmcAttributeInfo("triggersAction", 875, "ActionBinding", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __unsetValue = new DmcAttributeInfo("unsetValue", 891, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __useBaseClass = new DmcAttributeInfo("useBaseClass", 807, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __useClass = new DmcAttributeInfo("useClass", 826, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __useI18NConfig = new DmcAttributeInfo("useI18NConfig", 893, "I18NConfig", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __useImpl = new DmcAttributeInfo("useImpl", 869, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __useNameAsLabel = new DmcAttributeInfo("useNameAsLabel", 892, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __useSchema = new DmcAttributeInfo("useSchema", 843, "SchemaDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __useSingleEditor = new DmcAttributeInfo("useSingleEditor", 898, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __userDataImport = new DmcAttributeInfo("userDataImport", 804, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __usesController = new DmcAttributeInfo("usesController", 842, "Controller", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __usesRunContextItem = new DmcAttributeInfo("usesRunContextItem", 835, "RunContextItem", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __usingStandardSubpackages = new DmcAttributeInfo("usingStandardSubpackages", 864, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __viewImport = new DmcAttributeInfo("viewImport", 837, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __viewMethod = new DmcAttributeInfo("viewMethod", 825, "MethodWithArgs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __viewName = new DmcAttributeInfo("viewName", 812, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __widget = new DmcAttributeInfo("widget", 813, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:162)
    public final static DmcTypeInfo __type_ActionBinding = new DmcTypeInfo("ActionBinding", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Activity = new DmcTypeInfo("Activity", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Component = new DmcTypeInfo("Component", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Controller = new DmcTypeInfo("Controller", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_DisplayDataSpec = new DmcTypeInfo("DisplayDataSpec", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_EditField = new DmcTypeInfo("EditField", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_EnumMapping = new DmcTypeInfo("EnumMapping", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_EnumMappingGenerator = new DmcTypeInfo("EnumMappingGenerator", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Event = new DmcTypeInfo("Event", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_EventScopeEnum = new DmcTypeInfo("EventScopeEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_EventSpec = new DmcTypeInfo("EventSpec", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_EventWithArgs = new DmcTypeInfo("EventWithArgs", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_FieldEditorDefinition = new DmcTypeInfo("FieldEditorDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_FormBindingDefinition = new DmcTypeInfo("FormBindingDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_FormImplementationConfig = new DmcTypeInfo("FormImplementationConfig", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_GetWithOptions = new DmcTypeInfo("GetWithOptions", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_I18NConfig = new DmcTypeInfo("I18NConfig", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Menu = new DmcTypeInfo("Menu", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_MenuBar = new DmcTypeInfo("MenuBar", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_MenuElementDefinition = new DmcTypeInfo("MenuElementDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_MenuElementTypeAndComment = new DmcTypeInfo("MenuElementTypeAndComment", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_MenuImplementationConfig = new DmcTypeInfo("MenuImplementationConfig", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_MenuItem = new DmcTypeInfo("MenuItem", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_MethodWithArgs = new DmcTypeInfo("MethodWithArgs", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_Module = new DmcTypeInfo("Module", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_MvwDefinition = new DmcTypeInfo("MvwDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_OperationSpec = new DmcTypeInfo("OperationSpec", OriginalTypeEnum.COMPLEXTYPE);
    public final static DmcTypeInfo __type_Place = new DmcTypeInfo("Place", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_Presenter = new DmcTypeInfo("Presenter", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_RequestOptionEnum = new DmcTypeInfo("RequestOptionEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_RequestTypeWithOptions = new DmcTypeInfo("RequestTypeWithOptions", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_RequestWithOptions = new DmcTypeInfo("RequestWithOptions", OriginalTypeEnum.TYPE);
    public final static DmcTypeInfo __type_RunContextItem = new DmcTypeInfo("RunContextItem", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_SelectionTypeEnum = new DmcTypeInfo("SelectionTypeEnum", OriginalTypeEnum.ENUM);
    public final static DmcTypeInfo __type_Separator = new DmcTypeInfo("Separator", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_SubMenu = new DmcTypeInfo("SubMenu", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_SubPlace = new DmcTypeInfo("SubPlace", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_View = new DmcTypeInfo("View", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_WebApplication = new DmcTypeInfo("WebApplication", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:203)
    public final static DmcClassInfo __MvwDefinition = new DmcClassInfo("MvwDefinition","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO", 801, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __ActionBinding = new DmcClassInfo("ActionBinding","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActionBindingDMO", 822, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__actionBindingName);
    public final static DmcClassInfo __Component = new DmcClassInfo("Component","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO", 805, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__componentName);
    public final static DmcClassInfo __Activity = new DmcClassInfo("Activity","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActivityDMO", 810, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Component,MvwDMSAG.__activityName);
    public final static DmcClassInfo __Controller = new DmcClassInfo("Controller","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ControllerDMO", 806, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Component,MvwDMSAG.__controllerName);
    public final static DmcClassInfo __Presenter = new DmcClassInfo("Presenter","org.dmd.mvw.tools.mvwgenerator.generated.dmo.PresenterDMO", 807, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Component,MvwDMSAG.__presenterName);
    public final static DmcClassInfo __EnumMapping = new DmcClassInfo("EnumMapping","org.dmd.mvw.tools.mvwgenerator.generated.dmo.EnumMappingDMO", 826, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__mappingName);
    public final static DmcClassInfo __EnumMappingGenerator = new DmcClassInfo("EnumMappingGenerator","org.dmd.mvw.tools.mvwgenerator.generated.dmo.EnumMappingGeneratorDMO", 827, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __Event = new DmcClassInfo("Event","org.dmd.mvw.tools.mvwgenerator.generated.dmo.EventDMO", 802, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__eventName);
    public final static DmcClassInfo __FieldEditorDefinition = new DmcClassInfo("FieldEditorDefinition","org.dmd.mvw.tools.mvwgenerator.generated.dmo.FieldEditorDefinitionDMO", 824, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__editorName);
    public final static DmcClassInfo __FormBindingDefinition = new DmcClassInfo("FormBindingDefinition","org.dmd.mvw.tools.mvwgenerator.generated.dmo.FormBindingDefinitionDMO", 823, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__bindingName);
    public final static DmcClassInfo __FormImplementationConfig = new DmcClassInfo("FormImplementationConfig","org.dmd.mvw.tools.mvwgenerator.generated.dmo.FormImplementationConfigDMO", 825, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__configName);
    public final static DmcClassInfo __MenuElementDefinition = new DmcClassInfo("MenuElementDefinition","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuElementDefinitionDMO", 816, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__elementName);
    public final static DmcClassInfo __Menu = new DmcClassInfo("Menu","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuDMO", 817, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__MenuElementDefinition,MvwDMSAG.__elementName);
    public final static DmcClassInfo __MenuBar = new DmcClassInfo("MenuBar","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuBarDMO", 818, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Menu,MvwDMSAG.__elementName);
    public final static DmcClassInfo __SubMenu = new DmcClassInfo("SubMenu","org.dmd.mvw.tools.mvwgenerator.generated.dmo.SubMenuDMO", 819, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Menu,MvwDMSAG.__elementName);
    public final static DmcClassInfo __MenuItem = new DmcClassInfo("MenuItem","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuItemDMO", 820, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MenuElementDefinition,MvwDMSAG.__elementName);
    public final static DmcClassInfo __Separator = new DmcClassInfo("Separator","org.dmd.mvw.tools.mvwgenerator.generated.dmo.SeparatorDMO", 821, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MenuElementDefinition,MvwDMSAG.__elementName);
    public final static DmcClassInfo __MenuImplementationConfig = new DmcClassInfo("MenuImplementationConfig","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuImplementationConfigDMO", 815, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__configName);
    public final static DmcClassInfo __Module = new DmcClassInfo("Module","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ModuleDMO", 803, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__moduleName);
    public final static DmcClassInfo __Place = new DmcClassInfo("Place","org.dmd.mvw.tools.mvwgenerator.generated.dmo.PlaceDMO", 808, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__placeName);
    public final static DmcClassInfo __SubPlace = new DmcClassInfo("SubPlace","org.dmd.mvw.tools.mvwgenerator.generated.dmo.SubPlaceDMO", 809, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Place,MvwDMSAG.__placeName);
    public final static DmcClassInfo __RunContextItem = new DmcClassInfo("RunContextItem","org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO", 811, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__itemName);
    public final static DmcClassInfo __I18NConfig = new DmcClassInfo("I18NConfig","org.dmd.mvw.tools.mvwgenerator.generated.dmo.I18NConfigDMO", 814, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__RunContextItem,MvwDMSAG.__itemName);
    public final static DmcClassInfo __View = new DmcClassInfo("View","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO", 804, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__viewName);
    public final static DmcClassInfo __WebApplication = new DmcClassInfo("WebApplication","org.dmd.mvw.tools.mvwgenerator.generated.dmo.WebApplicationDMO", 812, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__appName);

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

        _SmAp.put(__abstractActivity.id,__abstractActivity);
        _SmAp.put(__actionBindingName.id,__actionBindingName);
        _SmAp.put(__activityName.id,__activityName);
        _SmAp.put(__addToMenu.id,__addToMenu);
        _SmAp.put(__addedToRunContext.id,__addedToRunContext);
        _SmAp.put(__alternateMenuBar.id,__alternateMenuBar);
        _SmAp.put(__alternateMenuItem.id,__alternateMenuItem);
        _SmAp.put(__alternateSubMenu.id,__alternateSubMenu);
        _SmAp.put(__alwaysEnabled.id,__alwaysEnabled);
        _SmAp.put(__appName.id,__appName);
        _SmAp.put(__argVector.id,__argVector);
        _SmAp.put(__autoCreated.id,__autoCreated);
        _SmAp.put(__bindingName.id,__bindingName);
        _SmAp.put(__broadcast.id,__broadcast);
        _SmAp.put(__broadcastOnly.id,__broadcastOnly);
        _SmAp.put(__centralAsyncErrorHandler.id,__centralAsyncErrorHandler);
        _SmAp.put(__centralDMPErrorHandler.id,__centralDMPErrorHandler);
        _SmAp.put(__centralRPCErrorHandler.id,__centralRPCErrorHandler);
        _SmAp.put(__clickEvent.id,__clickEvent);
        _SmAp.put(__codeSplit.id,__codeSplit);
        _SmAp.put(__componentName.id,__componentName);
        _SmAp.put(__configName.id,__configName);
        _SmAp.put(__construction.id,__construction);
        _SmAp.put(__contextImpl.id,__contextImpl);
        _SmAp.put(__controllerName.id,__controllerName);
        _SmAp.put(__createEvent.id,__createEvent);
        _SmAp.put(__createOnDemand.id,__createOnDemand);
        _SmAp.put(__defaultMenuBar.id,__defaultMenuBar);
        _SmAp.put(__defaultMenuItem.id,__defaultMenuItem);
        _SmAp.put(__defaultPlace.id,__defaultPlace);
        _SmAp.put(__defaultSeparator.id,__defaultSeparator);
        _SmAp.put(__defaultSubMenu.id,__defaultSubMenu);
        _SmAp.put(__definedInModule.id,__definedInModule);
        _SmAp.put(__deleteEvent.id,__deleteEvent);
        _SmAp.put(__dependsOnModule.id,__dependsOnModule);
        _SmAp.put(__displayDMO.id,__displayDMO);
        _SmAp.put(__displayLabel.id,__displayLabel);
        _SmAp.put(__displayLabelI18N.id,__displayLabelI18N);
        _SmAp.put(__editField.id,__editField);
        _SmAp.put(__editObject.id,__editObject);
        _SmAp.put(__editorName.id,__editorName);
        _SmAp.put(__elementName.id,__elementName);
        _SmAp.put(__enumGeneratorClass.id,__enumGeneratorClass);
        _SmAp.put(__eventName.id,__eventName);
        _SmAp.put(__firedInThisModule.id,__firedInThisModule);
        _SmAp.put(__firesEvent.id,__firesEvent);
        _SmAp.put(__handlesEvent.id,__handlesEvent);
        _SmAp.put(__implementedBy.id,__implementedBy);
        _SmAp.put(__implementsAction.id,__implementsAction);
        _SmAp.put(__importThis.id,__importThis);
        _SmAp.put(__instantiatesPresenter.id,__instantiatesPresenter);
        _SmAp.put(__instantiatesView.id,__instantiatesView);
        _SmAp.put(__itemName.id,__itemName);
        _SmAp.put(__itemOrder.id,__itemOrder);
        _SmAp.put(__local.id,__local);
        _SmAp.put(__localEvent.id,__localEvent);
        _SmAp.put(__managesView.id,__managesView);
        _SmAp.put(__mappingGenerator.id,__mappingGenerator);
        _SmAp.put(__mappingName.id,__mappingName);
        _SmAp.put(__menuImplementation.id,__menuImplementation);
        _SmAp.put(__menuOrder.id,__menuOrder);
        _SmAp.put(__modifyEvent.id,__modifyEvent);
        _SmAp.put(__moduleName.id,__moduleName);
        _SmAp.put(__parentPlace.id,__parentPlace);
        _SmAp.put(__placeName.id,__placeName);
        _SmAp.put(__placePrefix.id,__placePrefix);
        _SmAp.put(__presenterImport.id,__presenterImport);
        _SmAp.put(__presenterMethod.id,__presenterMethod);
        _SmAp.put(__presenterName.id,__presenterName);
        _SmAp.put(__runsActivity.id,__runsActivity);
        _SmAp.put(__selectEvent.id,__selectEvent);
        _SmAp.put(__selectedDMO.id,__selectedDMO);
        _SmAp.put(__sendsRequest.id,__sendsRequest);
        _SmAp.put(__sharedImport.id,__sharedImport);
        _SmAp.put(__singleton.id,__singleton);
        _SmAp.put(__skipEnumValue.id,__skipEnumValue);
        _SmAp.put(__strictlyChecked.id,__strictlyChecked);
        _SmAp.put(__tipsFromI18N.id,__tipsFromI18N);
        _SmAp.put(__triggersAction.id,__triggersAction);
        _SmAp.put(__unsetValue.id,__unsetValue);
        _SmAp.put(__useBaseClass.id,__useBaseClass);
        _SmAp.put(__useClass.id,__useClass);
        _SmAp.put(__useI18NConfig.id,__useI18NConfig);
        _SmAp.put(__useImpl.id,__useImpl);
        _SmAp.put(__useNameAsLabel.id,__useNameAsLabel);
        _SmAp.put(__useSchema.id,__useSchema);
        _SmAp.put(__useSingleEditor.id,__useSingleEditor);
        _SmAp.put(__userDataImport.id,__userDataImport);
        _SmAp.put(__usesController.id,__usesController);
        _SmAp.put(__usesRunContextItem.id,__usesRunContextItem);
        _SmAp.put(__usingStandardSubpackages.id,__usingStandardSubpackages);
        _SmAp.put(__viewImport.id,__viewImport);
        _SmAp.put(__viewMethod.id,__viewMethod);
        _SmAp.put(__viewName.id,__viewName);
        _SmAp.put(__widget.id,__widget);
        _CmAp.put(__ActionBinding.id,__ActionBinding);
        _CmAp.put(__Activity.id,__Activity);
        _CmAp.put(__Component.id,__Component);
        _CmAp.put(__Controller.id,__Controller);
        _CmAp.put(__EnumMapping.id,__EnumMapping);
        _CmAp.put(__EnumMappingGenerator.id,__EnumMappingGenerator);
        _CmAp.put(__Event.id,__Event);
        _CmAp.put(__FieldEditorDefinition.id,__FieldEditorDefinition);
        _CmAp.put(__FormBindingDefinition.id,__FormBindingDefinition);
        _CmAp.put(__FormImplementationConfig.id,__FormImplementationConfig);
        _CmAp.put(__I18NConfig.id,__I18NConfig);
        _CmAp.put(__Menu.id,__Menu);
        _CmAp.put(__MenuBar.id,__MenuBar);
        _CmAp.put(__MenuElementDefinition.id,__MenuElementDefinition);
        _CmAp.put(__MenuImplementationConfig.id,__MenuImplementationConfig);
        _CmAp.put(__MenuItem.id,__MenuItem);
        _CmAp.put(__Module.id,__Module);
        _CmAp.put(__MvwDefinition.id,__MvwDefinition);
        _CmAp.put(__Place.id,__Place);
        _CmAp.put(__Presenter.id,__Presenter);
        _CmAp.put(__RunContextItem.id,__RunContextItem);
        _CmAp.put(__Separator.id,__Separator);
        _CmAp.put(__SubMenu.id,__SubMenu);
        _CmAp.put(__SubPlace.id,__SubPlace);
        _CmAp.put(__View.id,__View);
        _CmAp.put(__WebApplication.id,__WebApplication);

        __MvwDefinition.addMust(MetaDMSAG.__camelCaseName);
        __MvwDefinition.addMust(__definedInModule);
        __MvwDefinition.addMay(MetaDMSAG.__file);
        __MvwDefinition.addMay(MetaDMSAG.__lineNumber);
        __MvwDefinition.addMay(MetaDMSAG.__description);

        __Event.addMust(__eventName);
        __Event.addMay(__argVector);
        __Event.addMay(__importThis);
        __Event.addMay(__firedInThisModule);

        __Module.addMust(__moduleName);
        __Module.addMust(DmgDMSAG.__genPackage);
        __Module.addMay(__dependsOnModule);
        __Module.addMay(MetaDMSAG.__dependsOnSchema);
        __Module.addMay(__usingStandardSubpackages);

        __View.addMust(__viewName);
        __View.addMay(__codeSplit);
        __View.addMay(__useBaseClass);
        __View.addMay(__local);
        __View.addMay(__broadcast);
        __View.addMay(__broadcastOnly);
        __View.addMay(__viewImport);
        __View.addMay(__presenterImport);
        __View.addMay(__sharedImport);
        __View.addMay(MetaDMSAG.__subpackage);
        __View.addMay(__usesRunContextItem);
        __View.addMay(__widget);
        __View.addMay(MetaDMSAG.__extendsInterface);
        __View.addMay(__presenterMethod);
        __View.addMay(__viewMethod);
        __View.addMay(__displayDMO);
        __View.addMay(__selectEvent);
        __View.addMay(__deleteEvent);
        __View.addMay(__clickEvent);
        __View.addMay(__modifyEvent);
        __View.addMay(__createEvent);

        __Component.addMust(__componentName);
        __Component.addMay(__firesEvent);
        __Component.addMay(__handlesEvent);
        __Component.addMay(__useSchema);
        __Component.addMay(__useBaseClass);
        __Component.addMay(__usesRunContextItem);
        __Component.addMay(__sendsRequest);
        __Component.addMay(MetaDMSAG.__subpackage);
        __Component.addMay(__instantiatesView);

        __Controller.addMust(__controllerName);
        __Controller.addMay(__centralDMPErrorHandler);
        __Controller.addMay(__centralRPCErrorHandler);
        __Controller.addMay(__centralAsyncErrorHandler);
        __Controller.addMay(__addedToRunContext);
        __Controller.addMay(__instantiatesPresenter);
        __Controller.addMay(__itemOrder);
        __Controller.addMay(__implementsAction);

        __Presenter.addMust(__presenterName);
        __Presenter.addMust(__managesView);
        __Presenter.addMay(__codeSplit);
        __Presenter.addMay(__singleton);
        __Presenter.addMay(__instantiatesPresenter);

        __Place.addMust(__placeName);
        __Place.addMust(__placePrefix);
        __Place.addMust(__runsActivity);

        __SubPlace.addMust(__placeName);
        __SubPlace.addMust(__placePrefix);
        __SubPlace.addMust(__parentPlace);

        __Activity.addMust(__activityName);
        __Activity.addMay(__useBaseClass);
        __Activity.addMay(__abstractActivity);
        __Activity.addMay(__usesController);
        __Activity.addMay(__managesView);
        __Activity.addMay(__instantiatesPresenter);
        __Activity.addMay(__codeSplit);

        __RunContextItem.addMust(__itemName);
        __RunContextItem.addMust(__useClass);
        __RunContextItem.addMust(__construction);
        __RunContextItem.addMay(__itemOrder);
        __RunContextItem.addMay(__contextImpl);
        __RunContextItem.addMay(__importThis);
        __RunContextItem.addMay(__createOnDemand);
        __RunContextItem.addMay(__singleton);
        __RunContextItem.addMay(__autoCreated);

        __WebApplication.addMust(__appName);
        __WebApplication.addMust(__defaultPlace);
        __WebApplication.addMay(__usesController);
        __WebApplication.addMay(__menuImplementation);

        __I18NConfig.addMust(__itemName);

        __MenuImplementationConfig.addMust(__configName);
        __MenuImplementationConfig.addMust(__useClass);
        __MenuImplementationConfig.addMust(__defaultMenuBar);
        __MenuImplementationConfig.addMust(__defaultSubMenu);
        __MenuImplementationConfig.addMust(__defaultMenuItem);
        __MenuImplementationConfig.addMust(__defaultSeparator);
        __MenuImplementationConfig.addMay(__alternateMenuBar);
        __MenuImplementationConfig.addMay(__alternateSubMenu);
        __MenuImplementationConfig.addMay(__alternateMenuItem);

        __MenuElementDefinition.addMust(__elementName);
        __MenuElementDefinition.addMay(__useImpl);

        __Menu.addMust(__elementName);

        __MenuBar.addMust(__elementName);
        __MenuBar.addMay(__useImpl);

        __SubMenu.addMust(__elementName);
        __SubMenu.addMust(__addToMenu);
        __SubMenu.addMust(__menuOrder);
        __SubMenu.addMay(__displayLabel);
        __SubMenu.addMay(__displayLabelI18N);
        __SubMenu.addMay(__useImpl);

        __MenuItem.addMust(__elementName);
        __MenuItem.addMust(__triggersAction);
        __MenuItem.addMust(__addToMenu);
        __MenuItem.addMust(__menuOrder);
        __MenuItem.addMay(__displayLabel);
        __MenuItem.addMay(__displayLabelI18N);
        __MenuItem.addMay(__useImpl);

        __Separator.addMust(__elementName);
        __Separator.addMust(__addToMenu);
        __Separator.addMust(__menuOrder);
        __Separator.addMay(__useImpl);

        __ActionBinding.addMust(__actionBindingName);
        __ActionBinding.addMay(__implementedBy);

        __FormBindingDefinition.addMust(__bindingName);
        __FormBindingDefinition.addMust(__editObject);
        __FormBindingDefinition.addMust(__editField);
        __FormBindingDefinition.addMay(__strictlyChecked);
        __FormBindingDefinition.addMay(__useI18NConfig);
        __FormBindingDefinition.addMay(__tipsFromI18N);

        __FieldEditorDefinition.addMust(__editorName);
        __FieldEditorDefinition.addMust(__useClass);
        __FieldEditorDefinition.addMay(__useSingleEditor);

        __FormImplementationConfig.addMust(__configName);

        __EnumMapping.addMust(__mappingName);
        __EnumMapping.addMust(MetaDMSAG.__enumName);
        __EnumMapping.addMust(__unsetValue);
        __EnumMapping.addMust(__mappingGenerator);
        __EnumMapping.addMay(__useNameAsLabel);
        __EnumMapping.addMay(__skipEnumValue);

        __EnumMappingGenerator.addMust(MetaDMSAG.__camelCaseName);
        __EnumMappingGenerator.addMust(__enumGeneratorClass);


    }

    static  MvwDMSAG instance;

    protected MvwDMSAG (){
    }

    public synchronized static MvwDMSAG instance(){
        if (instance == null)
            instance = new MvwDMSAG();
        
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

