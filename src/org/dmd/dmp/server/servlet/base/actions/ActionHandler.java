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

import org.dmd.dmp.server.extended.ActionRequest;
import org.dmd.dmp.server.extended.ActionResponse;
import org.dmd.dmp.server.servlet.base.cache.CacheIF;
import org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF;
import org.dmd.util.BooleanVar;

/**
 * The ActionImplementation serves as a common base for all actions that can be
 * run in an asynchronous manner and cancelled if required.
 */
abstract public class ActionHandler implements Runnable {
	
	// The request we're servicing
	protected ActionRequest		request;
	
	// The overall action manager
	protected ActionManagerIF	actionManager;
	
	// A handle to the cache if we need it
	protected CacheIF			cache;
	
	// The last time that a response was sent
	private long					responseSendTime;
	
	// The unique identifier provided by the actionManager
	protected final Integer		serverActionID;
	
	// Our handle to the request tracker. We force derivatives of this class
	// to call sendResponse() so that we can keep track of the last time
	// a response was sent - and, if necessary send heartbeat messages.
	private RequestTrackerIF		requestTracker;
	
	// This flag will be set if the action is cancelled by the action manager
	// Derived classes should perform a synchronized check against this flag
	// within their run() method and exit the loop gracefully
	protected BooleanVar			cancelled;

	public ActionHandler(Integer serverActionID, ActionRequest request, ActionManagerIF actionManager, CacheIF cache, RequestTrackerIF requestTracker) {
		this.serverActionID = serverActionID;
		this.request			= request;
		this.actionManager	= actionManager;
		this.cache			= cache;
		this.requestTracker	= requestTracker;
		cancelled = new BooleanVar(false);
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
	 * We set the cancelled flag to true and halt the heartbeat timer.
	 * 
	 */
	public void cancel() {
		synchronized (cancelled) {
			cancelled.set(true);
			
			// TODO stop the heartbeat timer
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
		response.setServerActionID(serverActionID);
		responseSendTime = System.currentTimeMillis();
		requestTracker.processResponse(response);
	}
}
