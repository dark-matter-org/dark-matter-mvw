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
package org.dmd.mvw.client.mvwmenus.base;

import org.dmd.dmc.DmcClassInfo;

/**
 * 
 */
abstract public class MvwPopupMenu extends MvwMenu {
	
	DmcClassInfo	_forClass;

	protected MvwPopupMenu(String n, DmcClassInfo forClass) {
		super(n);
		_forClass = forClass;
	}
	
	public DmcClassInfo getForClass(){
		return(_forClass);
	}

}
