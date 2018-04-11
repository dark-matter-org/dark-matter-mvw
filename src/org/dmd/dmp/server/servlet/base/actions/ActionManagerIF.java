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

import org.dmd.util.exceptions.ResultException;

/**
 * The ActionManagerIF should be implemented by plugins that allow for
 * the registration of handlers for ActionRequests
 */
public interface ActionManagerIF {

	/**
	 * Registers a factory for a particular action trigger.
	 * @param factory the factory that creates handlers for the action
	 * @throws ResultException if we already have a registered handle for the action
	 */
	abstract public void registerAction(ActionFactory<?,?> factory) throws ResultException;
	
	/**
	 * This method allows for use of an "action handler wrapper" that
	 * will catch any exceptions thrown from an action handler's run()
	 * method. The associated ActionMangerIF can then be notified of the
	 * failure.
	 * @param actionHandler the action handler that failed.
	 * @param ex the exception that was caught.
	 */
	abstract public void actionFailed(ActionHandler actionHandler, Exception ex);
	
	/**
	 * Again, this method can be used by an "action handler wrapper" to
	 * notify the action manager when an action handler exits its run() method
	 * normally. The action manager can then perform cleanup if required.
	 * @param actionHandler
	 */
	abstract public void actionComplete(ActionHandler actionHandler);
}
