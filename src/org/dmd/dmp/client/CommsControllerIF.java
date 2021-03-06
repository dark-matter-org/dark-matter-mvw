//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.dmp.client;

import org.dmd.dmp.shared.generated.dmo.ResponseDMO;

/**
 * The CommsControllerIF defines a component that centralizes the handling of all
 * Dark Matter Protocol messages. 
 */
public interface CommsControllerIF {

	public void handleResponse(ResponseCallback cb, ResponseDMO response);
	
	public void handleFailure(ResponseCallback cb, Throwable caught);
	
	public void useCentralDMPErrorHandler(CentralDMPErrorHandlerIF handler);
	
	public void useCentralRPCErrorHandler(CentralRPCErrorHandlerIF handler);
}
