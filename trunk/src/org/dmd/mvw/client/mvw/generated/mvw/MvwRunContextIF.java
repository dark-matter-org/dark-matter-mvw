package org.dmd.mvw.client.mvw.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:52)
import com.google.gwt.activity.shared.ActivityManager;          // Used by activityManager - (RunContextItem.java:382)
import com.google.gwt.place.shared.PlaceHistoryHandler;         // Used by historyHandler - (RunContextItem.java:382)
import org.dmd.mvw.client.mvw.MvwActivityMapper;                // Used by activityMapper - (RunContextItem.java:382)
import org.dmd.mvw.client.mvw.MvwAsyncErrorHandlerIF;           // Used by centralAsyncErrorHandler - (RunContextItem.java:382)
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;          // Used by placeController - (RunContextItem.java:382)
import org.dmd.mvw.client.mvw.MvwEventBus;                      // Used by eventBus - (RunContextItem.java:382)


// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:55)
public interface MvwRunContextIF {

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public MvwEventBus             getEventBus();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public MvwAsyncPlaceController getPlaceController();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public MvwActivityMapper       getActivityMapper();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public ActivityManager         getActivityManager();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public PlaceHistoryHandler     getHistoryHandler();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public MvwAsyncErrorHandlerIF  getCentralAsyncErrorHandler();

}

