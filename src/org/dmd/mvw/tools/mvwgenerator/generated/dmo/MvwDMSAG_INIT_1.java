package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:527)
import org.dmd.dmg.generated.dmo.DmgDMSAG;                            // Required attribute from DmgDMSAG - (DmoCompactSchemaFormatter.java:562)
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // For Meta references - (DmoCompactSchemaFormatter.java:552)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;         // Required attribute from MvwDMSAG - (DmoCompactSchemaFormatter.java:562)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:531)
public class MvwDMSAG_INIT_1 {

    static protected void initDefinitions(){
    // 1 -- MvwDefinition
        MvwDMSAG.__MvwDefinition.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__MvwDefinition.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__MvwDefinition.addMay(MetaDMSAG.__description);
        MvwDMSAG.__MvwDefinition.addMay(MetaDMSAG.__file);
        MvwDMSAG.__MvwDefinition.addMay(MetaDMSAG.__lineNumber);

    // 2 -- Event
        MvwDMSAG.__Event.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__Event.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__Event.addMust(MvwDMSAG.__eventName);
        MvwDMSAG.__Event.addMay(MvwDMSAG.__argVector);
        MvwDMSAG.__Event.addMay(MetaDMSAG.__description);
        MvwDMSAG.__Event.addMay(MetaDMSAG.__file);
        MvwDMSAG.__Event.addMay(MvwDMSAG.__firedInThisModule);
        MvwDMSAG.__Event.addMay(MvwDMSAG.__importThis);
        MvwDMSAG.__Event.addMay(MetaDMSAG.__lineNumber);

    // 3 -- Module
        MvwDMSAG.__Module.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__Module.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__Module.addMust(DmgDMSAG.__genPackage);
        MvwDMSAG.__Module.addMust(MvwDMSAG.__moduleName);
        MvwDMSAG.__Module.addMay(MvwDMSAG.__dependsOnModule);
        MvwDMSAG.__Module.addMay(MetaDMSAG.__dependsOnSchema);
        MvwDMSAG.__Module.addMay(MetaDMSAG.__description);
        MvwDMSAG.__Module.addMay(MetaDMSAG.__file);
        MvwDMSAG.__Module.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__Module.addMay(MvwDMSAG.__usingStandardSubpackages);

    // 4 -- View
        MvwDMSAG.__View.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__View.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__View.addMust(MvwDMSAG.__viewName);
        MvwDMSAG.__View.addMay(MvwDMSAG.__broadcast);
        MvwDMSAG.__View.addMay(MvwDMSAG.__broadcastOnly);
        MvwDMSAG.__View.addMay(MvwDMSAG.__clickEvent);
        MvwDMSAG.__View.addMay(MvwDMSAG.__codeSplit);
        MvwDMSAG.__View.addMay(MvwDMSAG.__createEvent);
        MvwDMSAG.__View.addMay(MvwDMSAG.__deleteEvent);
        MvwDMSAG.__View.addMay(MetaDMSAG.__description);
        MvwDMSAG.__View.addMay(MvwDMSAG.__displayDMO);
        MvwDMSAG.__View.addMay(MetaDMSAG.__extendsInterface);
        MvwDMSAG.__View.addMay(MetaDMSAG.__file);
        MvwDMSAG.__View.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__View.addMay(MvwDMSAG.__local);
        MvwDMSAG.__View.addMay(MvwDMSAG.__modifyEvent);
        MvwDMSAG.__View.addMay(MvwDMSAG.__presenterImport);
        MvwDMSAG.__View.addMay(MvwDMSAG.__presenterMethod);
        MvwDMSAG.__View.addMay(MvwDMSAG.__selectEvent);
        MvwDMSAG.__View.addMay(MvwDMSAG.__sharedImport);
        MvwDMSAG.__View.addMay(MetaDMSAG.__subpackage);
        MvwDMSAG.__View.addMay(MvwDMSAG.__useBaseClass);
        MvwDMSAG.__View.addMay(MvwDMSAG.__usesRunContextItem);
        MvwDMSAG.__View.addMay(MvwDMSAG.__viewImport);
        MvwDMSAG.__View.addMay(MvwDMSAG.__viewMethod);
        MvwDMSAG.__View.addMay(MvwDMSAG.__widget);

    // 5 -- Component
        MvwDMSAG.__Component.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__Component.addMust(MvwDMSAG.__componentName);
        MvwDMSAG.__Component.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__Component.addMay(MetaDMSAG.__description);
        MvwDMSAG.__Component.addMay(MetaDMSAG.__file);
        MvwDMSAG.__Component.addMay(MvwDMSAG.__firesEvent);
        MvwDMSAG.__Component.addMay(MvwDMSAG.__handlesEvent);
        MvwDMSAG.__Component.addMay(MvwDMSAG.__instantiatesView);
        MvwDMSAG.__Component.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__Component.addMay(MvwDMSAG.__sendsRequest);
        MvwDMSAG.__Component.addMay(MetaDMSAG.__subpackage);
        MvwDMSAG.__Component.addMay(MvwDMSAG.__useBaseClass);
        MvwDMSAG.__Component.addMay(MvwDMSAG.__useSchema);
        MvwDMSAG.__Component.addMay(MvwDMSAG.__usesRunContextItem);

    // 6 -- Controller
        MvwDMSAG.__Controller.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__Controller.addMust(MvwDMSAG.__componentName);
        MvwDMSAG.__Controller.addMust(MvwDMSAG.__controllerName);
        MvwDMSAG.__Controller.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__addedToRunContext);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__centralAsyncErrorHandler);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__centralDMPErrorHandler);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__centralRPCErrorHandler);
        MvwDMSAG.__Controller.addMay(MetaDMSAG.__description);
        MvwDMSAG.__Controller.addMay(MetaDMSAG.__file);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__firesEvent);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__handlesEvent);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__implementsAction);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__instantiatesPresenter);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__instantiatesView);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__itemOrder);
        MvwDMSAG.__Controller.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__sendsRequest);
        MvwDMSAG.__Controller.addMay(MetaDMSAG.__subpackage);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__useBaseClass);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__useSchema);
        MvwDMSAG.__Controller.addMay(MvwDMSAG.__usesRunContextItem);

    // 7 -- Presenter
        MvwDMSAG.__Presenter.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__Presenter.addMust(MvwDMSAG.__componentName);
        MvwDMSAG.__Presenter.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__Presenter.addMust(MvwDMSAG.__managesView);
        MvwDMSAG.__Presenter.addMust(MvwDMSAG.__presenterName);
        MvwDMSAG.__Presenter.addMay(MvwDMSAG.__codeSplit);
        MvwDMSAG.__Presenter.addMay(MetaDMSAG.__description);
        MvwDMSAG.__Presenter.addMay(MetaDMSAG.__file);
        MvwDMSAG.__Presenter.addMay(MvwDMSAG.__firesEvent);
        MvwDMSAG.__Presenter.addMay(MvwDMSAG.__handlesEvent);
        MvwDMSAG.__Presenter.addMay(MvwDMSAG.__instantiatesPresenter);
        MvwDMSAG.__Presenter.addMay(MvwDMSAG.__instantiatesView);
        MvwDMSAG.__Presenter.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__Presenter.addMay(MvwDMSAG.__sendsRequest);
        MvwDMSAG.__Presenter.addMay(MvwDMSAG.__singleton);
        MvwDMSAG.__Presenter.addMay(MetaDMSAG.__subpackage);
        MvwDMSAG.__Presenter.addMay(MvwDMSAG.__useBaseClass);
        MvwDMSAG.__Presenter.addMay(MvwDMSAG.__useSchema);
        MvwDMSAG.__Presenter.addMay(MvwDMSAG.__usesRunContextItem);

    // 8 -- Place
        MvwDMSAG.__Place.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__Place.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__Place.addMust(MvwDMSAG.__placeName);
        MvwDMSAG.__Place.addMust(MvwDMSAG.__placePrefix);
        MvwDMSAG.__Place.addMust(MvwDMSAG.__runsActivity);
        MvwDMSAG.__Place.addMay(MetaDMSAG.__description);
        MvwDMSAG.__Place.addMay(MetaDMSAG.__file);
        MvwDMSAG.__Place.addMay(MetaDMSAG.__lineNumber);

    // 9 -- SubPlace
        MvwDMSAG.__SubPlace.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__SubPlace.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__SubPlace.addMust(MvwDMSAG.__parentPlace);
        MvwDMSAG.__SubPlace.addMust(MvwDMSAG.__placeName);
        MvwDMSAG.__SubPlace.addMust(MvwDMSAG.__placePrefix);
        MvwDMSAG.__SubPlace.addMust(MvwDMSAG.__runsActivity);
        MvwDMSAG.__SubPlace.addMay(MetaDMSAG.__description);
        MvwDMSAG.__SubPlace.addMay(MetaDMSAG.__file);
        MvwDMSAG.__SubPlace.addMay(MetaDMSAG.__lineNumber);

    // 10 -- Activity
        MvwDMSAG.__Activity.addMust(MvwDMSAG.__activityName);
        MvwDMSAG.__Activity.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__Activity.addMust(MvwDMSAG.__componentName);
        MvwDMSAG.__Activity.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__abstractActivity);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__codeSplit);
        MvwDMSAG.__Activity.addMay(MetaDMSAG.__description);
        MvwDMSAG.__Activity.addMay(MetaDMSAG.__file);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__firesEvent);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__handlesEvent);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__instantiatesPresenter);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__instantiatesView);
        MvwDMSAG.__Activity.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__managesView);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__sendsRequest);
        MvwDMSAG.__Activity.addMay(MetaDMSAG.__subpackage);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__useBaseClass);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__useSchema);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__usesController);
        MvwDMSAG.__Activity.addMay(MvwDMSAG.__usesRunContextItem);

    // 11 -- RunContextItem
        MvwDMSAG.__RunContextItem.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__RunContextItem.addMust(MvwDMSAG.__construction);
        MvwDMSAG.__RunContextItem.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__RunContextItem.addMust(MvwDMSAG.__itemName);
        MvwDMSAG.__RunContextItem.addMust(MvwDMSAG.__useClass);
        MvwDMSAG.__RunContextItem.addMay(MvwDMSAG.__autoCreated);
        MvwDMSAG.__RunContextItem.addMay(MvwDMSAG.__contextImpl);
        MvwDMSAG.__RunContextItem.addMay(MvwDMSAG.__createOnDemand);
        MvwDMSAG.__RunContextItem.addMay(MetaDMSAG.__description);
        MvwDMSAG.__RunContextItem.addMay(MetaDMSAG.__file);
        MvwDMSAG.__RunContextItem.addMay(MvwDMSAG.__importThis);
        MvwDMSAG.__RunContextItem.addMay(MvwDMSAG.__itemOrder);
        MvwDMSAG.__RunContextItem.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__RunContextItem.addMay(MvwDMSAG.__singleton);

    // 12 -- WebApplication
        MvwDMSAG.__WebApplication.addMust(MvwDMSAG.__appName);
        MvwDMSAG.__WebApplication.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__WebApplication.addMust(MvwDMSAG.__defaultPlace);
        MvwDMSAG.__WebApplication.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__WebApplication.addMay(MetaDMSAG.__description);
        MvwDMSAG.__WebApplication.addMay(MetaDMSAG.__file);
        MvwDMSAG.__WebApplication.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__WebApplication.addMay(MvwDMSAG.__menuImplementation);
        MvwDMSAG.__WebApplication.addMay(MvwDMSAG.__usesController);

    // 13 -- I18NConfig
        MvwDMSAG.__I18NConfig.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__I18NConfig.addMust(MvwDMSAG.__construction);
        MvwDMSAG.__I18NConfig.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__I18NConfig.addMust(MvwDMSAG.__itemName);
        MvwDMSAG.__I18NConfig.addMust(MvwDMSAG.__useClass);
        MvwDMSAG.__I18NConfig.addMay(MvwDMSAG.__autoCreated);
        MvwDMSAG.__I18NConfig.addMay(MvwDMSAG.__contextImpl);
        MvwDMSAG.__I18NConfig.addMay(MvwDMSAG.__createOnDemand);
        MvwDMSAG.__I18NConfig.addMay(MetaDMSAG.__description);
        MvwDMSAG.__I18NConfig.addMay(MetaDMSAG.__file);
        MvwDMSAG.__I18NConfig.addMay(MvwDMSAG.__importThis);
        MvwDMSAG.__I18NConfig.addMay(MvwDMSAG.__itemOrder);
        MvwDMSAG.__I18NConfig.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__I18NConfig.addMay(MvwDMSAG.__singleton);

    // 14 -- MenuImplementationConfig
        MvwDMSAG.__MenuImplementationConfig.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__MenuImplementationConfig.addMust(MvwDMSAG.__configName);
        MvwDMSAG.__MenuImplementationConfig.addMust(MvwDMSAG.__defaultMenuBar);
        MvwDMSAG.__MenuImplementationConfig.addMust(MvwDMSAG.__defaultMenuItem);
        MvwDMSAG.__MenuImplementationConfig.addMust(MvwDMSAG.__defaultSeparator);
        MvwDMSAG.__MenuImplementationConfig.addMust(MvwDMSAG.__defaultSubMenu);
        MvwDMSAG.__MenuImplementationConfig.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__MenuImplementationConfig.addMust(MvwDMSAG.__useClass);
        MvwDMSAG.__MenuImplementationConfig.addMay(MvwDMSAG.__alternateMenuBar);
        MvwDMSAG.__MenuImplementationConfig.addMay(MvwDMSAG.__alternateMenuItem);
        MvwDMSAG.__MenuImplementationConfig.addMay(MvwDMSAG.__alternateSubMenu);
        MvwDMSAG.__MenuImplementationConfig.addMay(MetaDMSAG.__description);
        MvwDMSAG.__MenuImplementationConfig.addMay(MetaDMSAG.__file);
        MvwDMSAG.__MenuImplementationConfig.addMay(MetaDMSAG.__lineNumber);

    // 15 -- MenuElementDefinition
        MvwDMSAG.__MenuElementDefinition.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__MenuElementDefinition.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__MenuElementDefinition.addMust(MvwDMSAG.__elementName);
        MvwDMSAG.__MenuElementDefinition.addMay(MetaDMSAG.__description);
        MvwDMSAG.__MenuElementDefinition.addMay(MetaDMSAG.__file);
        MvwDMSAG.__MenuElementDefinition.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__MenuElementDefinition.addMay(MvwDMSAG.__useImpl);

    // 16 -- Menu
        MvwDMSAG.__Menu.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__Menu.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__Menu.addMust(MvwDMSAG.__elementName);
        MvwDMSAG.__Menu.addMay(MetaDMSAG.__description);
        MvwDMSAG.__Menu.addMay(MetaDMSAG.__file);
        MvwDMSAG.__Menu.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__Menu.addMay(MvwDMSAG.__useImpl);

    // 17 -- MenuBar
        MvwDMSAG.__MenuBar.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__MenuBar.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__MenuBar.addMust(MvwDMSAG.__elementName);
        MvwDMSAG.__MenuBar.addMay(MetaDMSAG.__description);
        MvwDMSAG.__MenuBar.addMay(MetaDMSAG.__file);
        MvwDMSAG.__MenuBar.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__MenuBar.addMay(MvwDMSAG.__useImpl);

    // 18 -- SubMenu
        MvwDMSAG.__SubMenu.addMust(MvwDMSAG.__addToMenu);
        MvwDMSAG.__SubMenu.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__SubMenu.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__SubMenu.addMust(MvwDMSAG.__elementName);
        MvwDMSAG.__SubMenu.addMust(MvwDMSAG.__menuOrder);
        MvwDMSAG.__SubMenu.addMay(MetaDMSAG.__description);
        MvwDMSAG.__SubMenu.addMay(MvwDMSAG.__displayLabel);
        MvwDMSAG.__SubMenu.addMay(MvwDMSAG.__displayLabelI18N);
        MvwDMSAG.__SubMenu.addMay(MetaDMSAG.__file);
        MvwDMSAG.__SubMenu.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__SubMenu.addMay(MvwDMSAG.__useImpl);

    // 19 -- MenuItem
        MvwDMSAG.__MenuItem.addMust(MvwDMSAG.__addToMenu);
        MvwDMSAG.__MenuItem.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__MenuItem.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__MenuItem.addMust(MvwDMSAG.__elementName);
        MvwDMSAG.__MenuItem.addMust(MvwDMSAG.__menuOrder);
        MvwDMSAG.__MenuItem.addMust(MvwDMSAG.__triggersAction);
        MvwDMSAG.__MenuItem.addMay(MetaDMSAG.__description);
        MvwDMSAG.__MenuItem.addMay(MvwDMSAG.__displayLabel);
        MvwDMSAG.__MenuItem.addMay(MvwDMSAG.__displayLabelI18N);
        MvwDMSAG.__MenuItem.addMay(MetaDMSAG.__file);
        MvwDMSAG.__MenuItem.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__MenuItem.addMay(MvwDMSAG.__useImpl);

    // 20 -- Separator
        MvwDMSAG.__Separator.addMust(MvwDMSAG.__addToMenu);
        MvwDMSAG.__Separator.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__Separator.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__Separator.addMust(MvwDMSAG.__elementName);
        MvwDMSAG.__Separator.addMust(MvwDMSAG.__menuOrder);
        MvwDMSAG.__Separator.addMay(MetaDMSAG.__description);
        MvwDMSAG.__Separator.addMay(MetaDMSAG.__file);
        MvwDMSAG.__Separator.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__Separator.addMay(MvwDMSAG.__useImpl);

    // 21 -- ActionBinding
        MvwDMSAG.__ActionBinding.addMust(MvwDMSAG.__actionBindingName);
        MvwDMSAG.__ActionBinding.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__ActionBinding.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__ActionBinding.addMay(MetaDMSAG.__description);
        MvwDMSAG.__ActionBinding.addMay(MetaDMSAG.__file);
        MvwDMSAG.__ActionBinding.addMay(MvwDMSAG.__implementedBy);
        MvwDMSAG.__ActionBinding.addMay(MetaDMSAG.__lineNumber);

    // 22 -- FormBindingDefinition
        MvwDMSAG.__FormBindingDefinition.addMust(MvwDMSAG.__bindingName);
        MvwDMSAG.__FormBindingDefinition.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__FormBindingDefinition.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__FormBindingDefinition.addMust(MvwDMSAG.__editField);
        MvwDMSAG.__FormBindingDefinition.addMust(MvwDMSAG.__editObject);
        MvwDMSAG.__FormBindingDefinition.addMay(MetaDMSAG.__description);
        MvwDMSAG.__FormBindingDefinition.addMay(MetaDMSAG.__file);
        MvwDMSAG.__FormBindingDefinition.addMay(MvwDMSAG.__labelWidth);
        MvwDMSAG.__FormBindingDefinition.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__FormBindingDefinition.addMay(MvwDMSAG.__strictlyChecked);
        MvwDMSAG.__FormBindingDefinition.addMay(MvwDMSAG.__tipsFromI18N);
        MvwDMSAG.__FormBindingDefinition.addMay(MvwDMSAG.__useI18NConfig);

    // 23 -- FieldEditorDefinition
        MvwDMSAG.__FieldEditorDefinition.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__FieldEditorDefinition.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__FieldEditorDefinition.addMust(MvwDMSAG.__editorName);
        MvwDMSAG.__FieldEditorDefinition.addMust(MvwDMSAG.__useClass);
        MvwDMSAG.__FieldEditorDefinition.addMay(MetaDMSAG.__description);
        MvwDMSAG.__FieldEditorDefinition.addMay(MetaDMSAG.__file);
        MvwDMSAG.__FieldEditorDefinition.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__FieldEditorDefinition.addMay(MvwDMSAG.__useSingleEditor);

    // 24 -- FormImplementationConfig
        MvwDMSAG.__FormImplementationConfig.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__FormImplementationConfig.addMust(MvwDMSAG.__configName);
        MvwDMSAG.__FormImplementationConfig.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__FormImplementationConfig.addMay(MetaDMSAG.__description);
        MvwDMSAG.__FormImplementationConfig.addMay(MetaDMSAG.__file);
        MvwDMSAG.__FormImplementationConfig.addMay(MetaDMSAG.__lineNumber);

    // 25 -- EnumMapping
        MvwDMSAG.__EnumMapping.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__EnumMapping.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__EnumMapping.addMust(MetaDMSAG.__enumName);
        MvwDMSAG.__EnumMapping.addMust(MvwDMSAG.__mappingGenerator);
        MvwDMSAG.__EnumMapping.addMust(MvwDMSAG.__mappingName);
        MvwDMSAG.__EnumMapping.addMust(MvwDMSAG.__unsetValue);
        MvwDMSAG.__EnumMapping.addMay(MetaDMSAG.__description);
        MvwDMSAG.__EnumMapping.addMay(MvwDMSAG.__emptyText);
        MvwDMSAG.__EnumMapping.addMay(MetaDMSAG.__file);
        MvwDMSAG.__EnumMapping.addMay(MetaDMSAG.__lineNumber);
        MvwDMSAG.__EnumMapping.addMay(MvwDMSAG.__skipEnumValue);
        MvwDMSAG.__EnumMapping.addMay(MvwDMSAG.__useNameAsLabel);

    // 26 -- EnumMappingGenerator
        MvwDMSAG.__EnumMappingGenerator.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__EnumMappingGenerator.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__EnumMappingGenerator.addMust(MvwDMSAG.__enumGeneratorClass);
        MvwDMSAG.__EnumMappingGenerator.addMay(MetaDMSAG.__description);
        MvwDMSAG.__EnumMappingGenerator.addMay(MetaDMSAG.__file);
        MvwDMSAG.__EnumMappingGenerator.addMay(MetaDMSAG.__lineNumber);

    // 27 -- PropertyAccessGenerator
        MvwDMSAG.__PropertyAccessGenerator.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__PropertyAccessGenerator.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__PropertyAccessGenerator.addMust(MvwDMSAG.__propertyAccessGeneratorClass);
        MvwDMSAG.__PropertyAccessGenerator.addMay(MetaDMSAG.__description);
        MvwDMSAG.__PropertyAccessGenerator.addMay(MetaDMSAG.__file);
        MvwDMSAG.__PropertyAccessGenerator.addMay(MetaDMSAG.__lineNumber);

    // 28 -- PropertyAccess
        MvwDMSAG.__PropertyAccess.addMust(MvwDMSAG.__accessFor);
        MvwDMSAG.__PropertyAccess.addMust(MvwDMSAG.__accessGenerator);
        MvwDMSAG.__PropertyAccess.addMust(MetaDMSAG.__camelCaseName);
        MvwDMSAG.__PropertyAccess.addMust(MvwDMSAG.__definedInModule);
        MvwDMSAG.__PropertyAccess.addMust(MvwDMSAG.__propertyAccessName);
        MvwDMSAG.__PropertyAccess.addMay(MetaDMSAG.__description);
        MvwDMSAG.__PropertyAccess.addMay(MetaDMSAG.__file);
        MvwDMSAG.__PropertyAccess.addMay(MetaDMSAG.__lineNumber);


    }

}

