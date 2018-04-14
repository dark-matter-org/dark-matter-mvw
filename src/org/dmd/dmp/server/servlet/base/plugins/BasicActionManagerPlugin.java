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
package org.dmd.dmp.server.servlet.base.plugins;

import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmp.server.extended.ActionCancelRequest;
import org.dmd.dmp.server.extended.ActionCancelResponse;
import org.dmd.dmp.server.extended.ActionRequest;
import org.dmd.dmp.server.extended.ActionResponse;
import org.dmd.dmp.server.extended.DMPMessage;
import org.dmd.dmp.server.extended.Request;
import org.dmd.dmp.server.servlet.base.DmpServletPlugin;
import org.dmd.dmp.server.servlet.base.actions.ActionFactory;
import org.dmd.dmp.server.servlet.base.actions.ActionHandler;
import org.dmd.dmp.server.servlet.base.actions.ActionManagerIF;
import org.dmd.dmp.server.servlet.base.interfaces.DmpRequestProcessorIF;
import org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF;
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The BasicActionManagerPlugin provides an extensible mechanism for adding action
 * support to your application. Unlike basic CRUD mechanisms, actions are inherently
 * asynchronous and take a nondeterministic amount of time to complete. Application
 * specific plug-ins can register derivatives of the ActionFactory to instantiate
 * ActionImplementation derivatives that perform the actual behaviour associated
 * with the action.
 */
public class BasicActionManagerPlugin extends DmpServletPlugin implements Runnable, ActionManagerIF {

    private RequestTrackerIF							requestTracker;

    // A place to dump logs
    private Logger									logger = LoggerFactory.getLogger(getClass());
    
    // The thread in which we process Action requests
    Thread											ourThread;

    private LinkedBlockingQueue<DMPMessage>			inputQueue;
    
    private TreeMap<String,ActionFactory<?,?>>		registeredActions;
    
    // Current action ID, incremented as actions are started
    private int										actionID;
    private TreeMap<Integer,RunningActionWrapper>	runningActions;
    
    // For now, we're just using a precanned Executor, limited to 10 threads
    private static int	THREADS = 10;
	private Executor		executor;

    
    public BasicActionManagerPlugin() {
		super();
	}
    
    ///////////////////////////////////////////////////////////////////////////
    // ActionManagerIF

	@Override
	public void registerAction(ActionFactory<?, ?> factory) throws ResultException {
		ActionFactory<?,?> existing = registeredActions.get(factory.actionTriggerInfo().getActionName());
		
		if (existing == null) {
			registeredActions.put(factory.actionTriggerInfo().getActionName(), factory);
		}
		else {
			ResultException ex = new ResultException("Duplicate action handler for: " + existing.actionTriggerInfo().toOIF());
			throw(ex);
		}
		
	}
    
	/**
	 * An action handler has thrown an exception (which it shouldn't really).
	 * So we'll send a final error response on its behalf.
	 */
	@Override
	public void actionFailed(ActionHandler actionHandler, Exception ex) {
		synchronized (runningActions) {
			ActionResponse response = (ActionResponse) actionHandler.request().getErrorResponse();
			response.setServerActionID(actionHandler.serverActionID());
			response.setLastResponse(true);
			response.setResponseText(ex.getMessage() + "\n" + DebugInfo.extractTheStack(ex));
			
			// TODO cancel the heartbeat timer for the action
			logger.debug("Failure of action: " + actionHandler.serverActionID());
		
			runningActions.remove(actionHandler.serverActionID());
			
			requestTracker.processResponse(response);
		}
	}

	@Override
	public void actionComplete(ActionHandler actionHandler) {
		synchronized (runningActions) {
			logger.debug("Action complete for action: " + actionHandler.serverActionID());
			runningActions.remove(actionHandler.serverActionID());
		}
	}

    ///////////////////////////////////////////////////////////////////////////
    // DmpServletPlugin
    
    @Override
    public void preInit() throws ResultException, DmcValueException {
		logger.debug("action manager");
    	
    }    
    
	@Override
	public void init()  throws ResultException, DmcValueException, DmcRuleExceptionSet, DmcNameClashException {

		logger.debug("action manager");
		
		inputQueue	= new LinkedBlockingQueue<DMPMessage>();
		
		executor = Executors.newFixedThreadPool(THREADS);
		
		registeredActions = new TreeMap<>();
		
		actionID			= 1;
		runningActions	= new TreeMap<>();

		requestTracker = pluginManager.getRequestTracker();
		
		requestTracker.bindRequestProcessor(ActionRequest.class, new DmpRequestProcessorIF() {
			
			public void processRequest(Request request) {
				ActionRequest newRequest = (ActionRequest) request;
				
				ActionFactory<?,?> factory = registeredActions.get(newRequest.getActionName());
				
				if (factory == null) {
					ActionResponse response = newRequest.getResponse();
					response.setResponseType(ResponseTypeEnum.ERROR);
					response.setLastResponse(true);
					response.setResponseText("No action handler registered for action trigger info: " + newRequest.getActionName());
					requestTracker.processResponse(response);
				}
				else {
					queueRequest(request);
				}
			}
			
			public boolean acceptRequest(Request request) {
				return true;
			}
		}
		);
		
		requestTracker.bindRequestProcessor(ActionCancelRequest.class, new DmpRequestProcessorIF() {
			
			public void processRequest(Request request) {
				ActionCancelRequest newRequest = (ActionCancelRequest) request;
				
				if (newRequest.getServerActionID() == null) {
					ActionCancelResponse response = (ActionCancelResponse) newRequest.getErrorResponse();
					response.setResponseText("Missing serverActionID attribute");
					requestTracker.processResponse(response);
				}
				else {
					if (runningActions.get(newRequest.getServerActionID()) == null) {
						ActionCancelResponse response = (ActionCancelResponse) newRequest.getErrorResponse();
						response.setResponseText("There is no running action with serverActionID: " + newRequest.getServerActionID());
						requestTracker.processResponse(response);
					}
				}
				queueRequest(request);
				
			}
			
			public boolean acceptRequest(Request request) {
				return true;
			}
		}
		);
	}

	@Override
	public void start() throws ResultException, DmcValueException {
		ourThread = new Thread(this);
		ourThread.start();
	}
	
	@Override
	public void shutdown(){
		ourThread.interrupt();
	}
	
    ///////////////////////////////////////////////////////////////////////////

	/**
	 * Queues the specified request for subsequent processing
	 * @param request the request
	 */
	private void queueRequest(Request request) {
		addToQueue(request);
	}
	
	/**
	 * We add the specified message to our input queue. In our run() method,
	 * we pull messages from the queue when they're available and process them.
	 * @param msg the message to be queued.
	 */
    private void addToQueue(DMPMessage msg) {
        try
        {
            inputQueue.put(msg);
        }
        catch (Exception e)
        {
            logger.error("Caught Exception", e);
        }
    }


    /**
     * This is called from our run() method to handle a particular action. We have
     * the associated action factory create an action handler, wrap that action handler
     * in a RunningActionWrapper and start it up.
     * @param request the request to be processed
     */
	private void processActionRequest(ActionRequest request) {
		synchronized (runningActions) {			
			if (request.isTrackingEnabled())
				logger.info("processActionRequest: \n" + request);

			
			// NOTE: We'll always have a factory because we check that we have a handler
			// for the action when we first receive the request.
			ActionFactory<?,?> factory = registeredActions.get(request.getActionName());
			
			ActionHandler	handler = factory.newHandler(actionID++, request, this, cache, requestTracker);
			
			// Check that the action can proceed
			ActionResponse errorResponse = handler.canProceed();
			
			if (errorResponse != null) {
				errorResponse.setLastResponse(true);
				requestTracker.processResponse(errorResponse);
				return;
			}
			
			// We wrap the handler to allow for catching exceptions
			RunningActionWrapper runnable = new RunningActionWrapper(handler);
			
			// Hang on to the action so that it can be cancelled if required
			runningActions.put(handler.serverActionID(), runnable);
			
			logger.debug("Action running: " + handler.serverActionID() + "  runningActions.size(): " + runningActions.size());
			
			executor.execute(runnable);
//			runnable.run();
		}
		
	}
	
	/**
	 * This method is called from our run() method to cancel a currently running request.
	 * At the time the message was received, the action with the specified serverActionID
	 * was running.
	 * @param request the cancel action request
	 */
	private void processActionCancelRequest(ActionCancelRequest request){
		synchronized (runningActions) {
			if (request.isTrackingEnabled()) {
				logger.debug("Running actions size: " + runningActions.size());
				logger.info("processActionCancelRequest: \n" + request);
			}

			RunningActionWrapper runnable = runningActions.get(request.getServerActionID());
			
			if (runnable == null) {
				logger.debug("Couldn't cancel action: " + request.getServerActionID());
				
				// It must have finished since we got the message
				ActionCancelResponse response = request.getResponse();
				response.setResponseText("Action finished before we could cancel.");
				response.setResponseType(ResponseTypeEnum.SUCCESS);
				response.setLastResponse(true);
				requestTracker.processResponse(response);
			}
			else {
				logger.debug("Cancelling action: " + request.getServerActionID());

				runnable.theAction.cancel();
			
				// Indicate that the cancellation is pending - the action will return with
				// ResponseTypeEnum of CANCELLED
				ActionCancelResponse response = request.getResponse();
				response.setResponseText("Action cancel pending.");
				response.setResponseType(ResponseTypeEnum.SUCCESS);
				response.setLastResponse(true);
				requestTracker.processResponse(response);
			}
			
		}
	}
    
    ///////////////////////////////////////////////////////////////////////////
    // Runnable
    
    @Override
	public void run() {
		while(true) {
			DMPMessage message = null;
			try {
				// Grab the next message to be processed
				message = inputQueue.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (message instanceof ActionRequest) {
				processActionRequest((ActionRequest)message);
			}
			else if (message instanceof ActionCancelRequest){
				processActionCancelRequest((ActionCancelRequest)message);
			}
			else {
				// For now we're not handling events from other sources, but, in
				// the case where our web application is fronting another data
				// source or application, we may have to update our view of the
				// data with these events
				logger.error("Unknown message type was queued!!! \n" + message.toOIF());				
			}
		}
	}

    ///////////////////////////////////////////////////////////////////////////
    // Utility classes

    /**
     * We use this class to wrap our action handlers so that, if they throw
     * an exception from their run() method, we can catch it and notify the
     * action manager.
     */
	private class RunningActionWrapper implements Runnable {
		private ActionHandler theAction;

		public RunningActionWrapper(ActionHandler theRunnable) {
			super();
			this.theAction = theRunnable;
		} 

		@Override
		public void run() {
			try {
				theAction.run();
			} catch (Exception ex) {
				theAction.actionManager().actionFailed(theAction,ex);
			}
			
			// When the action exits its run() method we notify the action manager
			theAction.actionManager().actionComplete(theAction);
		}
	}

}
