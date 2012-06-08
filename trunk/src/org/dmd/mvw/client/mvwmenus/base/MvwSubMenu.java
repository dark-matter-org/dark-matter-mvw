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

import org.dmd.mvw.client.mvwmenus.interfaces.MenuSubItemIF;

abstract public class MvwSubMenu extends MvwMenu implements MenuSubItemIF {

	String 	_menuOrder;
	String 	_addToMenu;
	boolean	_dynamic;

	protected MvwSubMenu(String itemName, String menuOrder, String addToMenu, boolean dynamic) {
		super(itemName);
		
		_menuOrder 	= menuOrder;
		_addToMenu 	= addToMenu;
		_dynamic	= dynamic;
	}

	@Override
	public String getMenuOrder() {
		return(_menuOrder);
	}

	@Override
	public String getAddToMenu(){
		return(_addToMenu);
	}
	
	@Override
	public boolean isDynamic() {
		return(_dynamic);
	}
	
}
