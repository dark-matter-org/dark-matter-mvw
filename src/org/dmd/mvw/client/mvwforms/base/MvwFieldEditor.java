package org.dmd.mvw.client.mvwforms.base;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * The creation of forms and binding them to DMOs is based on the the DmcPresentationIF.
 * Many of the basic methods required by that interface require information that would
 * have to be duplicated in each editor implementation. The MvwFieldEditor 
 */
abstract public class MvwFieldEditor implements DmcPresentationIF, IsWidget {
	
	// Our Unique ID assigned by the tracker
	protected int						ID;
	
	// Whether or not we're mandatory
	protected boolean 					mandatory;
	
	// Our attribute value adapter that also contains the original value (if any)
	protected DmcAdapterIF				adapter;

	// The thing that may be tracking our state of readiness
	protected DmcPresentationTrackerIF	tracker;
	
	// This is only set if we're handling an indexed attribute, otherwise it's -1
	protected int						attrIndex;
	
	// The label to be used for this field
	protected String						label;
	
	// The object being edited
	protected DmcObject					DMO;
	
	public MvwFieldEditor() {
		attrIndex = -1;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return(label);
	}

//	public void setToolTip(String tooltip);

//	public void setMandatory(boolean mandatory) {
//		this.mandatory = mandatory;
//	}

//	public void setReadOnly(boolean readonly);

//  Not overloaded because you usually want to populate your display widget with the value
//  that's in the adapter.
//	public void setAdapter(DmcAdapterIF adapter);

	@Override
	public DmcAdapterIF getAdapter() {
		return(adapter);
	}

//	public boolean isReady();

	/**
	 * Sets the presentation tracker and the unique identifier for this editor.
	 */
	public void setTracker(DmcPresentationTrackerIF t, int id) {
		tracker = t;
		ID = id;
	}

	/**
	 * Returns the identifier by which the presentation tracker tracks this editor.
	 */
	public int getID() {
		return(ID);
	}

//	public void resetToExisting();

//	public boolean valueChanged();
	
//	public void setEnabled(boolean flag);

	/**
	 * You may need to override this since some value types aren't supported as indexed values.
	 */
	public void setValueIndex(int index) {
		attrIndex = index;
	}

	/**
	 * Sets the object being edited.
	 */
	public void setDMO(DmcObject dmo) {
		DMO = dmo;
	}

	/**
	 * Gets the object being edited.
	 */
	public DmcObject getDMO() {
		return(DMO);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * A cheap mechanism for debugging your editors.
	 * @param msg
	 */
	protected void DEBUG(String msg){
		if ( (tracker != null))
			tracker.debug(msg);
	}
	
	/**
	 * If a tracker has been set, we notify it that we're "ready".
	 */
	protected void READY(){
		if (tracker != null)
			tracker.isReady(this);
	}
	
	/**
	 * If a tracker has been set, we notify it that we're not "ready"
	 */
	protected void NOTREADY(){
		if (tracker != null)
			tracker.isNotReady(this);
	}

	/**
	 * Derived classes should attempt to force focus on their associated widget.
	 */
	abstract public void focus();


}
