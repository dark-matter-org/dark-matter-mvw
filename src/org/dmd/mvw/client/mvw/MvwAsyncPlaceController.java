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

import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;

/**
 * The MvwAsyncPlaceController provides standard support for GWT code splitting
 * based on the Activities that run in Places. By specifying the codeSplit flag
 * on an Activity, the MVW code generation will create the code that will allow
 * for asynchronous loading of the Activity's code. Activities that don't specify
 * the codeSplit flag will be use the normal instantiation mechanisms.
 */
public class MvwAsyncPlaceController extends PlaceController {
	
	final MvwRunContextIF	runContext;

	public MvwAsyncPlaceController(MvwRunContextIF rc, EventBus eventBus) {
		super(eventBus);
		runContext = rc;
	}

	public MvwAsyncPlaceController(MvwRunContextIF rc, EventBus eventBus, Delegate delegate) {
		super(eventBus, delegate);
		runContext = rc;
	}

	@Override
	public void goTo(Place place){
		if (place instanceof MvwAsyncPlace){
			// we call initActivity which will asynchronously initialize the Activity
			// code segment. When that's complete, we will be called back at asyncPlaceReady()
			((MvwAsyncPlace)place).initActivity(this, runContext);
		}
		else{
			super.goTo(place);
		}
	}
	
	public void asyncPlaceReady(MvwAsyncPlace place){
		super.goTo(place);
	}
}
