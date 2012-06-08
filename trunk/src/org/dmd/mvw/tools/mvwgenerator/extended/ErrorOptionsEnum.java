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
package org.dmd.mvw.tools.mvwgenerator.extended;

/**
 * The ErrorOptionsEnum indicates, for DMP or PC errors how the error
 * handling will be performed.
 * <ul>
 * <li> CENTRAL - send the error to the central error handler only</li>
 * <li> CENTRALANDLOCAL - send the error to the central handler first and then the local</li>
 * <li> LOCAL - send the error only to the local handler</li>
 * </ul>
 */
public enum ErrorOptionsEnum {
	CENTRAL,
	CENTRALANDLOCAL,
	LOCAL
}
