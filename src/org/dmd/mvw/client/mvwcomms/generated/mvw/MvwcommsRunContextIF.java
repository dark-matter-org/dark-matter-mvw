package org.dmd.mvw.client.mvwcomms.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:52)
import de.novanic.eventservice.client.event.RemoteEventService;         // Used by eventService - (RunContextItem.java:382)
import org.dmd.dmp.client.DMPServiceAsync;                              // Used by dmpConnection - (RunContextItem.java:382)
import org.dmd.mvw.client.mvwcomms.extended.CommsController;            // Used by commsController - (RunContextItem.java:382)



// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:55)
public interface MvwcommsRunContextIF {

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public DMPServiceAsync         getDmpConnection();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public RemoteEventService      getEventService();

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem.getInterfaceMethod(RunContextItem.java:217)
    public CommsController         getCommsController();

}

