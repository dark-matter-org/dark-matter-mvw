package org.dmd.mvw.client.mvwcomms.generated.mvw.controllers;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:157)
import de.novanic.eventservice.client.event.RemoteEventService;                         // Used by eventService - (RunContextItem.java:430)
import org.dmd.dmc.DmcOmni;                                                             // Support for schema loading - (Component.java:245)
import org.dmd.dmp.client.DMPServiceAsync;                                              // Used by dmpConnection - (RunContextItem.java:430)
import org.dmd.dmp.client.ErrorOptionsEnum;                                             // DMP communications - (Component.java:393)
import org.dmd.dmp.client.ResponseHandlerIF;                                            // DMP communications - (Component.java:392)
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;                               // Component sends ActionRequests - (Component.java:257)
import org.dmd.dmp.shared.generated.dmo.ActionResponseDMO;                              // Component receives ActionResponses - (Component.java:258)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                                       // Attribute schema - (Component.java:249)
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                                     // DMP communications - (Component.java:394)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                                    // DMP communications - (Component.java:395)
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;                             // DMP communications - (Component.java:396)
import org.dmd.dms.extended.ActionTriggerInfo;                                          // Sends action requests - (Component.java:276)
import org.dmd.mvw.client.mvw.MvwEventBus;                                              // Used by eventBus - (RunContextItem.java:430)
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                            // Mvw run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvwcomms.extended.CommsController;                            // Used by commsController - (RunContextItem.java:430)
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                  // Mvwcomms run context - (RunContextItem.java:405)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.CommsSessionFailed;             // Required by CommsSessionFailed - (Event.java:198)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.CommsSessionReady;              // Required by CommsSessionReady - (Event.java:198)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.ForceCommsReset;                // Required by ForceCommsReset - (Event.java:205)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.ForceCommsResetHandler;         // Required by ForceCommsReset - (Event.java:206)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LoginCompleteEvent;             // Required by LoginCompleteEvent - (Event.java:198)
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutCompleteEvent;            // Required by LogoutCompleteEvent - (Event.java:198)


// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ControllerFormatter.formatControllerBaseImpl(ControllerFormatter.java:44)
abstract public class CommsControllerBaseImpl implements ResponseHandlerIF {

    protected final CommsController commsController;
    protected final DMPServiceAsync dmpConnection;
    protected final MvwEventBus eventBus;
    protected final RemoteEventService eventService;

    private final int PRIMEEVENTCHANNELACTIONCALLBACK = 0;

    public CommsControllerBaseImpl(MvwRunContextIF rc){
        commsController = ((MvwcommsRunContextIF)rc).getCommsController();
        dmpConnection = ((MvwcommsRunContextIF)rc).getDmpConnection();
        eventBus = ((MvwRunContextIF)rc).getEventBus();
        eventService = ((MvwcommsRunContextIF)rc).getEventService();

        DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());

        eventBus.addHandler(ForceCommsReset.TYPE,
            new ForceCommsResetHandler() {
                public void handleForceCommsReset(ForceCommsReset event) {
                    onForceCommsReset();
                }
            });


    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:227)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:422)
    protected void fireCommsSessionFailed(String reason){
        eventBus.fireEvent(new CommsSessionFailed(reason));
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:227)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:422)
    protected void fireCommsSessionReady(){
        eventBus.fireEvent(new CommsSessionReady());
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:227)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:422)
    protected void fireLoginCompleteEvent(){
        eventBus.fireEvent(new LoginCompleteEvent());
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:227)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:422)
    protected void fireLogoutCompleteEvent(){
        eventBus.fireEvent(new LogoutCompleteEvent());
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:485)
    protected void sendPrimeEventChannelRequest(ActionRequestDMO request){
        commsController.sendActionRequest(request,this,ErrorOptionsEnum.CENTRAL,ErrorOptionsEnum.LOCAL);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addSendRequestFunction(Component.java:526)
    protected ActionRequestDMO getPrimeEventChannelRequest(ActionTriggerInfo ati){
        ActionRequestDMO request = commsController.getActionRequest(ati);
        request.setHandlerID(PRIMEEVENTCHANNELACTIONCALLBACK);
        request.setNotifyOriginator(true);
        return(request);
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:290)
    @Override
    final public void handleResponse(ResponseDMO response){
        if (response.getResponseType() == ResponseTypeEnum.ERROR){
            switch(response.getHandlerID()){
            case PRIMEEVENTCHANNELACTIONCALLBACK:
                handlePrimeEventChannelResponseError((ActionResponseDMO)response);
                break;
            }
        }
        else{
            switch(response.getHandlerID()){
            case PRIMEEVENTCHANNELACTIONCALLBACK:
                handlePrimeEventChannelResponse((ActionResponseDMO)response);
                break;
            }
        }
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:324)
    @Override
    final public void handleRPCFailure(Throwable caught, RequestDMO request){
        switch(request.getHandlerID()){
        case PRIMEEVENTCHANNELACTIONCALLBACK:
            throw(new IllegalStateException("RPC errors for PrimeEventChannel are supposed to be centrally handled!"));
        }
    }

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Event.initialize(Event.java:120)
    abstract public void onForceCommsReset();

    abstract protected void handlePrimeEventChannelResponseError(ActionResponseDMO response);

    // Generated from: org.dmd.mvw.tools.mvwgenerator.extended.Component$CommsHandler.addHandlers(Component.java:612)
    abstract protected void handlePrimeEventChannelResponse(ActionResponseDMO response);

}

