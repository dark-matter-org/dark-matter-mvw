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

import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.gwt.event.shared.UmbrellaException;
import com.google.web.bindery.event.shared.Event;
import com.google.web.bindery.event.shared.SimpleEventBus;

/**
 * The MvwEventBus extends the usual SimpleEventBus to handle the incredibly annoying
 * behaviour of throwing an UmbrellaException when something goes wrong when calling
 * event handlers. The UmbrellaException concept is fine, since there could be multiple
 * exceptions thrown when an event is handled by multiple components, but, in actual
 * usage, you want to be able to easily see where an exception came from.
 * <p />
 * So, the MvwEventBus will catch the UmbrellaException and rethrow the first exception
 * it contains, which will usually make it obvious where things screwed up, and it will
 * dump a SEVERE log.
 */
public class MvwEventBus extends SimpleEventBus {
	
	
	
	public MvwEventBus(){
		super();
	}

	@Override
	public void fireEvent(Event<?> event) {
		try{
			super.fireEvent(event);
		}
		catch(UmbrellaException umbrella){
//			int index = 1;
			for(Throwable t: umbrella.getCauses()){
				dumpThrowable(t);
//				System.out.println("EXCEPTION " + index + ":\n" + t.getMessage() + "\n" + extractTheStack(t) + "\n\n");
			}
		}
	}
	
	void dumpThrowable(Throwable throwable){
		if (throwable instanceof UmbrellaException){
			UmbrellaException umbrella = (UmbrellaException) throwable;
			for(Throwable t: umbrella.getCauses()){
				dumpThrowable(t);
			}
		}
		else{
			Logger logger = Logger.getLogger("dark-matter-mvw");
			logger.log(Level.SEVERE, "EXCEPTION :" + throwable.getMessage() + "\n" + extractTheStack(throwable) + "\n\n");
//			System.out.println("EXCEPTION :" + throwable.getMessage() + "\n" + extractTheStack(throwable) + "\n\n");			
		}
	}
	
	@Override
	public void fireEventFromSource(Event<?> event, Object source) {
		try{
			super.fireEventFromSource(event,source);
		}
		catch(UmbrellaException umbrella){
//			int index = 1;
			for(Throwable t: umbrella.getCauses()){
				dumpThrowable(t);
//				System.out.println("EXCEPTION " + index + ":\n" + extractTheStack(t) + "\n\n");
			}
		}
	}
	
    /**
     * A convenience function to extract the stack from an exception as a string.
     */
    private String extractTheStack(Throwable ex){
    	StringBuilder sb = new StringBuilder();
    	StackTraceElement[] elements =  ex.getStackTrace();
    	for(int i=0; i<elements.length; i++){
    		sb.append(elements[i].toString() + "\n");
    	}
        return(sb.toString());
    }


}
