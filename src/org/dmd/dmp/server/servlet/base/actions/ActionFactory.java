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
import org.dmd.dmp.server.servlet.base.cache.CacheIF;
import org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF;
import org.dmd.dms.extended.ActionTriggerInfo;

/**
 * The ActionFactory allows an action manager to determine the action trigger info
 * associated with an ActionHandler and instantiate new ActionHandlers.
 * @param <ACTION> an ActionHandler
 * @param <INFO> the name/parameters of the action
 */
public abstract class ActionFactory<ACTION extends ActionHandler, INFO extends ActionTriggerInfo> {
	
	// We hang to this so that we can be identified by the action name it contains
	private INFO ati;
	
	/**
	 * 
	 */
	public ActionFactory() {
		ati = createNewATI();
	}

	/**
	 * Derived classes overload this to instantiate a new ActionHandler that
	 * can service the specified request.
	 * @param serverActionID the unique identifier for this action.
	 * @param request the request to be processed.
	 * @param actionManager the overall action manager.
	 * @param cache handle to the cache.
	 * @param requestTracker the asynchronous request tracker that allows comms to the client.
	 * @return the action handler that will dealt with it.
	 */
	abstract public ACTION newHandler(Integer serverActionID, ActionRequest request, ActionManagerIF actionManager, CacheIF cache, RequestTrackerIF requestTracker);
	
	/**
	 * Derived classes override this to create a representative ATI with the name of the
	 * action they handle.
	 * @return a new action trigger info instance.
	 */
	abstract protected INFO createNewATI();
	
	/**
	 * @return the action trigger info for the action we handle.
	 */
	public INFO actionTriggerInfo() {
		return(ati);
	};
}
