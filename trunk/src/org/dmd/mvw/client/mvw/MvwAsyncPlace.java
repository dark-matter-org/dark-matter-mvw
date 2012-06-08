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

import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;

import com.google.gwt.activity.shared.Activity;

/**
 * The MvwAsynchPlace allows for asynchronous initialization of Activity code sections.
 * 
 */
abstract public class MvwAsyncPlace extends MvwPlace {
	
	protected Activity	activity;

	public MvwAsyncPlace(String t) {
		super(t);
	}

	@Override
	public Activity getActivity(MvwRunContextIF runContext) {
		return(activity);
	}
	
	abstract public void initActivity(MvwAsyncPlaceController apc, MvwRunContextIF runContext);

}
