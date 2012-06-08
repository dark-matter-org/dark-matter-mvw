//	---------------------------------------------------------------------------
//	dark-matter-mvw
//	Copyright (c) 2012 dark-matter-mvw committers
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
package org.dmd.mvw.client.mvw;

/**
 * The MvwAsyncErrorHandlerIF interface defines a component that can handle error
 * indications that result from failure to dynamically load code segments using
 * GWT's code splitting mechanisms.
 * <p/>
 * If any MVW component sets the codeSplit flag to true, then there must be a Controller
 * that sets its centralAsyncErrorHandler flag to true. That Controller's base implementation
 * will be generated to implement this interface.
 */
public interface MvwAsyncErrorHandlerIF {

	/**
	 * Implementors should do something useful when called ;-)
	 * @param error indicates the class we were trying to instantiate dynamically.
	 * @param reason the reason for the error.
	 */
	public void handleAsyncCodeError(String error, Throwable reason);
}
