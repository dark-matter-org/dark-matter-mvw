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
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

/**
 * The MvwActivityMapper is a generic activity mapper that's used in conjunction
 * with the Model View Whatever (MVW) framework. This works because of a couple
 * of design choices: 1. Places map one-to-one with Activities and 2. All places
 * are derived from a common MvwPlace which knows how to construct the Activity
 * associated with it. 
 */
public class MvwActivityMapper implements ActivityMapper {

	private final MvwRunContextIF	runContext;
	
	public MvwActivityMapper(MvwRunContextIF rc){
		runContext = rc;
	}

	@Override
	public Activity getActivity(Place place) {
		return( ((MvwPlace)place).getActivity(runContext) );
	}
}
