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
package org.dmd.dmp.server.servlet.base.actions;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.types.LongVar;
import org.dmd.dmp.server.extended.ActionRequest;
import org.dmd.dmp.server.extended.ActionResponse;
import org.dmd.dmp.server.servlet.base.cache.CacheIF;
import org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF;
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;
import org.dmd.util.BooleanVar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The ActionImplementation serves as a common base for all actions that can be
 * run in an asynchronous manner and cancelled if required.
 */
abstract public class ActionHandler implements Runnable {
	
	public final static long DEFAULT_HEARTBEAT_MS = 3000;
	
	// The request we're servicing
	protected ActionRequest		request;
	
	// The overall action manager
	protected ActionManagerIF	actionManager;
	
	// A handle to the cache if we need it
	protected CacheIF			cache;
	
	// The last time that a response was sent
	private LongVar					responseSendTime;
	
	// The unique identifier provided by the actionManager
	protected final Integer		serverActionID;
	
	// Our handle to the request tracker. We force derivatives of this class
	// to call sendResponse() so that we can keep track of the last time
	// a response was sent - and, if necessary send heartbeat messages.
	private RequestTrackerIF		requestTracker;
	
	// This flag will be set if the action is cancelled by the action manager
	// Derived classes should perform a synchronized check against this flag
	// within their run() method and exit the loop gracefully
	protected volatile BooleanVar cancelled;
	
	// Used to schedule our heartbeat task
	private final ScheduledExecutorService	ses;
	
	// Handle to the heartbeat
	private final ScheduledFuture<?>			heartbeatTask;
	
	// This is set to true when send() is used to send the last response
	// so that we can prevent sending a heartbeat after the last response
	private boolean							lastResponseSent;
	
    protected Logger							logger = LoggerFactory.getLogger(getClass());


	public ActionHandler(Integer serverActionID, ActionRequest request, ActionManagerIF actionManager, CacheIF cache, RequestTrackerIF requestTracker) {
		this.serverActionID = serverActionID;
		this.request			= request;
		this.actionManager	= actionManager;
		this.cache			= cache;
		this.requestTracker	= requestTracker;
		cancelled = new BooleanVar(false);
		
		ses = Executors.newSingleThreadScheduledExecutor();
		heartbeatTask = ses.scheduleWithFixedDelay(new HeartbeatTask(this), 500, DEFAULT_HEARTBEAT_MS, TimeUnit.MILLISECONDS);
		responseSendTime = new LongVar();
		lastResponseSent	= false;
	}
	
	/**
	 * @return our associated action manager.
	 */
	public ActionManagerIF actionManager() {
		return(actionManager);
	}
	
	/**
	 * @return the request being serviced.
	 */
	public ActionRequest request() {
		return(request);
	}
	
	/**
	 * @return our unique action identifier.
	 */
	public Integer serverActionID() {
		return(serverActionID);
	}
		
	/**
	 * We set the cancelled flag to true. We don't know exactly when the action
	 * will stop, so we let the heartbeat timer continue.
	 * 
	 */
	public void cancel() {
		synchronized (cancelled) {
			cancelled.set(true);
			
			// TODO: should we take this approach or allow for gracefully checking of the cancelled flag?
//			Thread.currentThread().interrupt();
		}
	}
	
	public boolean cancelled() {
		synchronized (cancelled) {
			return(cancelled.booleanValue());
		}
	}
	
	/**
	 * Call this to send associated responses back to the client.
	 * <p/>
	 * Note: this automatically adds the serverActionID that uniquely identifies the
	 * action running on the server.
	 * @param response the response to be sent.
	 */
	protected void sendResponse(ActionResponse response) {
		synchronized (requestTracker) {
			// If, for some reason the last response was already sent, just ignore this
			if (lastResponseSent)
				return;
			
			logger.debug("sending response");

			response.setServerActionID(serverActionID);
			lastResponseTime(System.currentTimeMillis());
			requestTracker.processResponse(response);

			if (response.isLastResponse()) {
				logger.debug("Last response - cancelling heartbeat");
				// Cancel the heartbeat and prevent further responses
				lastResponseSent = true;
				heartbeatTask.cancel(true);
			}
		}
	}
	
	protected long lastResponseTime() {
		synchronized (responseSendTime) {
			return(responseSendTime.longValue());
		}
	}
	
	protected void lastResponseTime(long time) {
		synchronized (responseSendTime) {
			responseSendTime.set(time);
		}
	}
	
	/**
	 * Derived implementations should overload this method to validate the parameters
	 * to the action or perform any other contextual checks to see if the action can
	 * proceed.
	 * @return an ActionResponse with a type of ERROR if a problem was found and null otherwise.
	 */
	abstract public ActionResponse canProceed();
	
	///////////////////////////////////////////////////////////////////////////
	
	public class HeartbeatTask implements Runnable {
		
		ActionHandler handler;
		
		public HeartbeatTask(ActionHandler handler) {
			this.handler = handler;
		}

		@Override
		public void run() {
			handler.logger.debug("Heartbeat triggered");
			
			ActionResponse response = handler.request.getResponse();
			response.setResponseType(ResponseTypeEnum.HEARTBEAT);
			
			long delta = System.currentTimeMillis() - lastResponseTime();
			
			// We only send a heartbeat if there hasn't been a response for more than
			// the heartbeat interval
			if (delta > DEFAULT_HEARTBEAT_MS) {
				if (handler.cancelled())
					response.setResponseText("Cancel pending");
				else
					response.setResponseText("Still running");
				
				response.setLastResponse(false);
				
				handler.sendResponse(response);
			}
		}

	}

	///////////////////////////////////////////////////////////////////////////
	// Convenience methods
	
	/**
	 * Sends a PROGRESSOBJECTS message with a single object.
	 * @param objects the objects to be sent
	 */
	protected void sendProgressObject(DmcObject object) {
		ActionResponse response = (ActionResponse) request.getResponse();
		response.setResponseType(ResponseTypeEnum.PROGRESSOBJECTS);
		response.addObjectList(object);
		response.setLastResponse(false);
		sendResponse(response);
	}
	
	/**
	 * Sends a PROGRESSOBJECTS message with multiple objects.
	 * @param objects the objects to be sent
	 */
	protected void sendProgressObjects(ArrayList<DmcObject> objects) {
		ActionResponse response = (ActionResponse) request.getResponse();
		response.setResponseType(ResponseTypeEnum.PROGRESSOBJECTS);
		for(DmcObject obj: objects)
			response.addObjectList(obj);
		response.setLastResponse(false);
		sendResponse(response);
	}
	
	/**
	 * Sends a PROGRESSTEXT message.
	 * @param message the progress message.
	 */
	protected void sendProgressText(String message) {
		ActionResponse response = (ActionResponse) request.getResponse();
		response.setResponseType(ResponseTypeEnum.PROGRESSTEXT);
		response.setResponseText(message);
		response.setLastResponse(false);
		sendResponse(response);
	}

	/**
	 * This method sends an ActionResponse of type ERROR and sets it to be the last response.
	 * YOU SHOULD IMMEDIATELY RETURN FROM YOUR ACTION AFTER CALLING THIS!
	 * @param message the error message.
	 */
	protected void sendError(String message) {
		ActionResponse response = (ActionResponse) request.getErrorResponse();
		response.setResponseText(message);
		response.setLastResponse(true);
		sendResponse(response);
	}

	

}
