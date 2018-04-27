package org.dmd.dmp.server.servlet.base.cache;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmp.server.extended.DMPEvent;
import org.dmd.dmp.server.servlet.base.SessionIF;
import org.dmd.dms.ClassDefinition;

/**
 * The CacheListenerManager maintains collections of the various types of cache
 * listeners. The manager maintains weak references to the various listeners in
 * order to prevent memory leaks associated with listeners that are no longer
 * active because of things like timed out sessions.
 */
public class CacheListenerManager {
	
	// Listeners for all cache events
	ListenerSet<CacheFullListener>			fullListeners	= new ListenerSet<CacheFullListener>();
	
	// Listeners to particular class indices
	HashMap<DmcClassInfo,IndexListenerSet>	indexListeners = new HashMap<DmcClassInfo, IndexListenerSet>();
	
    private Logger                 			logger = LoggerFactory.getLogger(getClass());

    public CacheListenerManager(){
		
	}

	/**
	 * Adds a new cache listener.
	 * @param listener the listener to be added.
	 */
	public void addListener(CacheListener listener){
		synchronized (this) {
			if (listener instanceof CacheFullListener)
				fullListeners.add((CacheFullListener) listener);
			else if (listener instanceof CacheIndexListener){
				CacheIndexListener cil = (CacheIndexListener) listener;
				IndexListenerSet set = indexListeners.get(cil.getClassInfo());
				if (set == null){
					set = new IndexListenerSet(cil.getClassInfo());
					indexListeners.put(cil.getClassInfo(), set);
				}
				set.add(cil);
			}
			
			logger.trace("Added listener: " + listener.getTraceInfo());
		}
	}
	
	/**
	 * Clears all existing listeners.
	 */
	public void removeAllListeners() {
		fullListeners	= new ListenerSet<CacheFullListener>();
		indexListeners = new HashMap<DmcClassInfo, IndexListenerSet>();	}
	
	/**
	 * Removes a cache listener.
	 * @param listener the listener to be removed.
	 */
	public void removeListener(CacheListener listener){
		synchronized (this) {
			if (listener instanceof CacheFullListener){
				fullListeners.remove((CacheFullListener) listener);
			}
			else if (listener instanceof CacheIndexListener){
				CacheIndexListener cil = (CacheIndexListener) listener;
				IndexListenerSet set = indexListeners.get(cil.getClassInfo());
				if (set == null){
					logger.trace("Tried removing listener but no listeners found for the index: " + listener.getTraceInfo());
					return;
				}
				else
					set.remove(cil);
			}
			
			logger.trace("Removed listener: " + listener.getTraceInfo());
		}
	}
	
	/**
	 * Removes all listeners associated with the specified session.
	 * @param sessionID
	 */
	public void removeListenersForSession(SessionIF session) {
		synchronized (this) {
			ArrayList<CacheFullListener> fl = new ArrayList<>();
			for(CacheFullListener cfl: fullListeners.getListeners()) {
				if (cfl.session().sessionID().equals(session.sessionID()))
					fl.add(cfl);
			}
			for(CacheFullListener cfl: fl) {
				fullListeners.remove(cfl);
			}
			
			for(DmcClassInfo dci : indexListeners.keySet()) {
				IndexListenerSet set = indexListeners.get(dci);
				
				ArrayList<CacheIndexListener> listeners = new ArrayList<>();
				for(CacheIndexListener cil: set.getListeners()) {
					if (cil.session().sessionID().equals(session.sessionID()))
						listeners.add(cil);
				}
				for(CacheIndexListener cil: listeners) {
					set.remove(cil);
				}
			}
		}
	}
	
	/**
	 * Based on the contents of the event, we build a set of listeners that
	 * want to be notified.
	 * @param event the event that might be of interest.
	 * @return a collection of interested listeners.
	 */
	public Collection<CacheListener> getInterestedListeners(DMPEvent event){
		
		synchronized (this) {
			LinkedList<CacheListener> 	listeners = new LinkedList<CacheListener>();
			ListenerSet<?>				listenerSet = null;
			
			listeners.addAll(fullListeners.getListeners());
			
			ClassDefinition cd = (ClassDefinition) event.getSourceObjectClass();
			
			// Index listeners
			listenerSet = indexListeners.get(cd.getClassInfo());
			if (listenerSet != null)
				listeners.addAll(listenerSet.getListeners());
			
			return(listeners);			
		}
		
	}
	
	/**
	 * The ListenerSet maintains a set of weak references to listeners.
	 */
	private class ListenerSet<E extends CacheListener> {
		
		LinkedList<WeakReference<E>>	listeners;
		
		protected ListenerSet() {
			listeners = new LinkedList<WeakReference<E>>();
		}
		
        void add(E listener)
        {
            synchronized (this)
            {
                listeners.add(new WeakReference<E>(listener));
            }
        }

        
		/**
		 * @return the listeners in this set with any garbage collected listeners removed.
		 */
        Collection<E> getListeners() {
            synchronized (this)
            {
                LinkedList<E> listenersToNotify = new LinkedList<E>();
                if (listeners == null) return listenersToNotify;
                Iterator<WeakReference<E>> listenerIt = listeners.iterator();
                while (listenerIt.hasNext())
                {
                    WeakReference<E> ref = listenerIt.next();
                    E listener = ref.get();
                    if (listener == null)
                    {
                        listenerIt.remove();
                        continue;
                    }
                    listenersToNotify.add(listener);
                }
                return listenersToNotify;
            }
        }
        
        /**
         * Removes the specified listener from the set.
         * @param listener the listener to remove.
         */
        void remove(E listener){
            synchronized (this)
            {
                Iterator<WeakReference<E>> refIt = listeners.iterator();
                while (refIt.hasNext())
                {
                	CacheListener test = refIt.next().get();
                    if (test == listener)
                    {
                        refIt.remove();
                        break;
                    }
                }
            }
        }


//        /**
//         * @return true if there are no valid listeners in this set.
//         */
//        boolean isEmpty(){
//            synchronized (this)
//            {
//                return listeners.isEmpty();
//            }
//        }
        
	}
	
	private class IndexListenerSet extends ListenerSet<CacheIndexListener> {
		
		@SuppressWarnings("unused")
		final DmcClassInfo	classInfo;
		
		IndexListenerSet(DmcClassInfo dci){
			classInfo = dci;
		}
	}
}
