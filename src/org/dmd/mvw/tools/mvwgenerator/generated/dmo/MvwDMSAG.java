package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

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
public class MvwDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "mvw";


    static int schemaBaseID = 800;


    static int schemaIDRange = 200;


    static int schemaMaxID = 1000;

    public final static DmcAttributeInfo __abstractActivity = new DmcAttributeInfo("mvw", "abstractActivity", 858, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __accessFor = new DmcAttributeInfo("mvw", "accessFor", 905, "ClassDefinition", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __accessGenerator = new DmcAttributeInfo("mvw", "accessGenerator", 906, "PropertyAccessGenerator", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __actionBindingName = new DmcAttributeInfo("mvw", "actionBindingName", 874, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __activityName = new DmcAttributeInfo("mvw", "activityName", 840, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __addToMenu = new DmcAttributeInfo("mvw", "addToMenu", 870, "Menu", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __addedToRunContext = new DmcAttributeInfo("mvw", "addedToRunContext", 859, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __alternateMenuBar = new DmcAttributeInfo("mvw", "alternateMenuBar", 867, "MenuElementTypeAndComment", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __alternateMenuItem = new DmcAttributeInfo("mvw", "alternateMenuItem", 879, "MenuElementTypeAndComment", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __alternateSubMenu = new DmcAttributeInfo("mvw", "alternateSubMenu", 877, "MenuElementTypeAndComment", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __alwaysEnabled = new DmcAttributeInfo("mvw", "alwaysEnabled", 871, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __appName = new DmcAttributeInfo("mvw", "appName", 833, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __argVector = new DmcAttributeInfo("mvw", "argVector", 803, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __autoCreated = new DmcAttributeInfo("mvw", "autoCreated", 897, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __bindingName = new DmcAttributeInfo("mvw", "bindingName", 885, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __broadcast = new DmcAttributeInfo("mvw", "broadcast", 822, "Event", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __broadcastOnly = new DmcAttributeInfo("mvw", "broadcastOnly", 823, "Event", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __centralAsyncErrorHandler = new DmcAttributeInfo("mvw", "centralAsyncErrorHandler", 901, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __centralDMPErrorHandler = new DmcAttributeInfo("mvw", "centralDMPErrorHandler", 851, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __centralRPCErrorHandler = new DmcAttributeInfo("mvw", "centralRPCErrorHandler", 852, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __clickEvent = new DmcAttributeInfo("mvw", "clickEvent", 819, "OperationSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __codeSplit = new DmcAttributeInfo("mvw", "codeSplit", 900, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __componentName = new DmcAttributeInfo("mvw", "componentName", 811, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __configName = new DmcAttributeInfo("mvw", "configName", 865, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __construction = new DmcAttributeInfo("mvw", "construction", 828, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __contextImpl = new DmcAttributeInfo("mvw", "contextImpl", 830, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __controllerName = new DmcAttributeInfo("mvw", "controllerName", 834, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __createEvent = new DmcAttributeInfo("mvw", "createEvent", 821, "OperationSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __createOnDemand = new DmcAttributeInfo("mvw", "createOnDemand", 861, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __defaultMenuBar = new DmcAttributeInfo("mvw", "defaultMenuBar", 866, "MenuElementTypeAndComment", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __defaultMenuItem = new DmcAttributeInfo("mvw", "defaultMenuItem", 878, "MenuElementTypeAndComment", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __defaultPlace = new DmcAttributeInfo("mvw", "defaultPlace", 857, "Place", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __defaultSeparator = new DmcAttributeInfo("mvw", "defaultSeparator", 882, "MenuElementTypeAndComment", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __defaultSubMenu = new DmcAttributeInfo("mvw", "defaultSubMenu", 876, "MenuElementTypeAndComment", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("mvw", "definedInModule", 800, "Module", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __deleteEvent = new DmcAttributeInfo("mvw", "deleteEvent", 818, "EventSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __dependsOnModule = new DmcAttributeInfo("mvw", "dependsOnModule", 805, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __displayDMO = new DmcAttributeInfo("mvw", "displayDMO", 816, "DisplayDataSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __displayLabel = new DmcAttributeInfo("mvw", "displayLabel", 873, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __displayLabelI18N = new DmcAttributeInfo("mvw", "displayLabelI18N", 884, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __editField = new DmcAttributeInfo("mvw", "editField", 887, "EditField", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __editObject = new DmcAttributeInfo("mvw", "editObject", 886, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __editorName = new DmcAttributeInfo("mvw", "editorName", 888, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __elementName = new DmcAttributeInfo("mvw", "elementName", 868, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __emptyText = new DmcAttributeInfo("mvw", "emptyText", 908, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __enumGeneratorClass = new DmcAttributeInfo("mvw", "enumGeneratorClass", 903, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __eventName = new DmcAttributeInfo("mvw", "eventName", 809, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __firedInThisModule = new DmcAttributeInfo("mvw", "firedInThisModule", 899, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("mvw", "firesEvent", 801, "Event", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("mvw", "handlesEvent", 802, "Event", ValueTypeEnum.TREEMAPPED, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __implementedBy = new DmcAttributeInfo("mvw", "implementedBy", 881, "Component", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __implementsAction = new DmcAttributeInfo("mvw", "implementsAction", 880, "ActionBinding", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __importThis = new DmcAttributeInfo("mvw", "importThis", 831, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __instantiatesPresenter = new DmcAttributeInfo("mvw", "instantiatesPresenter", 860, "Presenter", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __instantiatesView = new DmcAttributeInfo("mvw", "instantiatesView", 862, "View", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __itemName = new DmcAttributeInfo("mvw", "itemName", 827, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __itemOrder = new DmcAttributeInfo("mvw", "itemOrder", 829, "Integer", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __local = new DmcAttributeInfo("mvw", "local", 832, "Event", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __localEvent = new DmcAttributeInfo("mvw", "localEvent", 814, "EventWithArgs", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __managesView = new DmcAttributeInfo("mvw", "managesView", 841, "View", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mappingGenerator = new DmcAttributeInfo("mvw", "mappingGenerator", 902, "EnumMappingGenerator", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __mappingName = new DmcAttributeInfo("mvw", "mappingName", 890, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __menuImplementation = new DmcAttributeInfo("mvw", "menuImplementation", 883, "MenuImplementationConfig", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __menuOrder = new DmcAttributeInfo("mvw", "menuOrder", 872, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __modifyEvent = new DmcAttributeInfo("mvw", "modifyEvent", 820, "OperationSpec", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __moduleName = new DmcAttributeInfo("mvw", "moduleName", 810, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __parentPlace = new DmcAttributeInfo("mvw", "parentPlace", 856, "Place", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __placeName = new DmcAttributeInfo("mvw", "placeName", 853, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __placePrefix = new DmcAttributeInfo("mvw", "placePrefix", 854, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __presenterImport = new DmcAttributeInfo("mvw", "presenterImport", 836, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __presenterMethod = new DmcAttributeInfo("mvw", "presenterMethod", 824, "MethodWithArgs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __presenterName = new DmcAttributeInfo("mvw", "presenterName", 839, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __propertyAccessGeneratorClass = new DmcAttributeInfo("mvw", "propertyAccessGeneratorClass", 904, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __propertyAccessName = new DmcAttributeInfo("mvw", "propertyAccessName", 907, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __runsActivity = new DmcAttributeInfo("mvw", "runsActivity", 855, "Activity", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __selectEvent = new DmcAttributeInfo("mvw", "selectEvent", 817, "EventSpec", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __selectedDMO = new DmcAttributeInfo("mvw", "selectedDMO", 806, "ClassDefinition", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __sendsRequest = new DmcAttributeInfo("mvw", "sendsRequest", 896, "RequestTypeWithOptions", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __sharedImport = new DmcAttributeInfo("mvw", "sharedImport", 838, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __singleton = new DmcAttributeInfo("mvw", "singleton", 863, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __skipEnumValue = new DmcAttributeInfo("mvw", "skipEnumValue", 895, "String", ValueTypeEnum.HASHSET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __strictlyChecked = new DmcAttributeInfo("mvw", "strictlyChecked", 889, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __tipsFromI18N = new DmcAttributeInfo("mvw", "tipsFromI18N", 894, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __triggersAction = new DmcAttributeInfo("mvw", "triggersAction", 875, "ActionBinding", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __unsetValue = new DmcAttributeInfo("mvw", "unsetValue", 891, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __useBaseClass = new DmcAttributeInfo("mvw", "useBaseClass", 807, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __useClass = new DmcAttributeInfo("mvw", "useClass", 826, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __useI18NConfig = new DmcAttributeInfo("mvw", "useI18NConfig", 893, "I18NConfig", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __useImpl = new DmcAttributeInfo("mvw", "useImpl", 869, "String", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __useNameAsLabel = new DmcAttributeInfo("mvw", "useNameAsLabel", 892, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __useSchema = new DmcAttributeInfo("mvw", "useSchema", 843, "SchemaDefinition", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __useSingleEditor = new DmcAttributeInfo("mvw", "useSingleEditor", 898, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __userDataImport = new DmcAttributeInfo("mvw", "userDataImport", 804, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __usesController = new DmcAttributeInfo("mvw", "usesController", 842, "Controller", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __usesRunContextItem = new DmcAttributeInfo("mvw", "usesRunContextItem", 835, "RunContextItem", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __usingStandardSubpackages = new DmcAttributeInfo("mvw", "usingStandardSubpackages", 864, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __viewImport = new DmcAttributeInfo("mvw", "viewImport", 837, "String", ValueTypeEnum.TREESET, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __viewMethod = new DmcAttributeInfo("mvw", "viewMethod", 825, "MethodWithArgs", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __viewName = new DmcAttributeInfo("mvw", "viewName", 812, "CamelCaseName", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);
    public final static DmcAttributeInfo __widget = new DmcAttributeInfo("mvw", "widget", 813, "Boolean", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT, 0, false);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:191)
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
    public final static DmcTypeInfo __type_PropertyAccess = new DmcTypeInfo("PropertyAccess", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_PropertyAccessGenerator = new DmcTypeInfo("PropertyAccessGenerator", OriginalTypeEnum.REFERENCE);
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

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:232)
    public final static DmcClassInfo __MvwDefinition = new DmcClassInfo("MvwDefinition","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO", 1601, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,null,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __ActionBinding = new DmcClassInfo("ActionBinding","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActionBindingDMO", 1622, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__actionBindingName);
    public final static DmcClassInfo __Component = new DmcClassInfo("Component","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO", 1605, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__componentName);
    public final static DmcClassInfo __Activity = new DmcClassInfo("Activity","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActivityDMO", 1610, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Component,MvwDMSAG.__activityName);
    public final static DmcClassInfo __Controller = new DmcClassInfo("Controller","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ControllerDMO", 1606, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Component,MvwDMSAG.__controllerName);
    public final static DmcClassInfo __Presenter = new DmcClassInfo("Presenter","org.dmd.mvw.tools.mvwgenerator.generated.dmo.PresenterDMO", 1607, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Component,MvwDMSAG.__presenterName);
    public final static DmcClassInfo __EnumMapping = new DmcClassInfo("EnumMapping","org.dmd.mvw.tools.mvwgenerator.generated.dmo.EnumMappingDMO", 1626, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__mappingName);
    public final static DmcClassInfo __EnumMappingGenerator = new DmcClassInfo("EnumMappingGenerator","org.dmd.mvw.tools.mvwgenerator.generated.dmo.EnumMappingGeneratorDMO", 1627, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __Event = new DmcClassInfo("Event","org.dmd.mvw.tools.mvwgenerator.generated.dmo.EventDMO", 1602, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__eventName);
    public final static DmcClassInfo __FieldEditorDefinition = new DmcClassInfo("FieldEditorDefinition","org.dmd.mvw.tools.mvwgenerator.generated.dmo.FieldEditorDefinitionDMO", 1624, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__editorName);
    public final static DmcClassInfo __FormBindingDefinition = new DmcClassInfo("FormBindingDefinition","org.dmd.mvw.tools.mvwgenerator.generated.dmo.FormBindingDefinitionDMO", 1623, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__bindingName);
    public final static DmcClassInfo __FormImplementationConfig = new DmcClassInfo("FormImplementationConfig","org.dmd.mvw.tools.mvwgenerator.generated.dmo.FormImplementationConfigDMO", 1625, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__configName);
    public final static DmcClassInfo __MenuElementDefinition = new DmcClassInfo("MenuElementDefinition","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuElementDefinitionDMO", 1616, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__elementName);
    public final static DmcClassInfo __Menu = new DmcClassInfo("Menu","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuDMO", 1617, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,__MenuElementDefinition,MvwDMSAG.__elementName);
    public final static DmcClassInfo __MenuBar = new DmcClassInfo("MenuBar","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuBarDMO", 1618, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Menu,MvwDMSAG.__elementName);
    public final static DmcClassInfo __SubMenu = new DmcClassInfo("SubMenu","org.dmd.mvw.tools.mvwgenerator.generated.dmo.SubMenuDMO", 1619, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Menu,MvwDMSAG.__elementName);
    public final static DmcClassInfo __MenuItem = new DmcClassInfo("MenuItem","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuItemDMO", 1620, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MenuElementDefinition,MvwDMSAG.__elementName);
    public final static DmcClassInfo __Separator = new DmcClassInfo("Separator","org.dmd.mvw.tools.mvwgenerator.generated.dmo.SeparatorDMO", 1621, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MenuElementDefinition,MvwDMSAG.__elementName);
    public final static DmcClassInfo __MenuImplementationConfig = new DmcClassInfo("MenuImplementationConfig","org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuImplementationConfigDMO", 1615, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__configName);
    public final static DmcClassInfo __Module = new DmcClassInfo("Module","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ModuleDMO", 1603, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__moduleName);
    public final static DmcClassInfo __Place = new DmcClassInfo("Place","org.dmd.mvw.tools.mvwgenerator.generated.dmo.PlaceDMO", 1608, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__placeName);
    public final static DmcClassInfo __SubPlace = new DmcClassInfo("SubPlace","org.dmd.mvw.tools.mvwgenerator.generated.dmo.SubPlaceDMO", 1609, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__Place,MvwDMSAG.__placeName);
    public final static DmcClassInfo __PropertyAccess = new DmcClassInfo("PropertyAccess","org.dmd.mvw.tools.mvwgenerator.generated.dmo.PropertyAccessDMO", 1629, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__propertyAccessName);
    public final static DmcClassInfo __PropertyAccessGenerator = new DmcClassInfo("PropertyAccessGenerator","org.dmd.mvw.tools.mvwgenerator.generated.dmo.PropertyAccessGeneratorDMO", 1628, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MetaDMSAG.__camelCaseName);
    public final static DmcClassInfo __RunContextItem = new DmcClassInfo("RunContextItem","org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO", 1611, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__itemName);
    public final static DmcClassInfo __I18NConfig = new DmcClassInfo("I18NConfig","org.dmd.mvw.tools.mvwgenerator.generated.dmo.I18NConfigDMO", 1614, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__RunContextItem,MvwDMSAG.__itemName);
    public final static DmcClassInfo __View = new DmcClassInfo("View","org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO", 1604, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__viewName);
    public final static DmcClassInfo __WebApplication = new DmcClassInfo("WebApplication","org.dmd.mvw.tools.mvwgenerator.generated.dmo.WebApplicationDMO", 1612, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__MvwDefinition,MvwDMSAG.__appName);

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

        MvwDMSAGAMAP.initSmAp(_SmAp);

        MvwDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:315)
    static {


        MvwDMSAG_INIT_1.initDefinitions();
    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:372)
    static {


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

