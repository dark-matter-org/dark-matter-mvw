package org.dmd.mvw.client.mvwforms.base;

import java.util.Iterator;

import org.dmd.dmc.presentation.DmcPresentationIF;

/**
 * The MvwFormBindingIF is implemented by classes generated via the FormBindingDefinition
 * specification mechanisms.
 */
public interface MvwFormBindingIF {

	/**
	 * @return the label width.
	 */
	public Integer getLabelWidth();
	
	/**
	 * @return the editors associated with this form binding.
	 */
	public Iterator<DmcPresentationIF> getEditors();
	

}
