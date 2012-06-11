package org.dmd.mvw.tools.mvwgenerator.interfaces;

import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.forms.GxtEnumMapping;

/**
 * The MvwEnumMappingGeneratorIF interface defines an object that generate the appropriate
 * enum mapping code for a particular widget set
 * @author pstrong
 *
 */
public interface MvwEnumMappingGeneratorIF {

	public void formatEnumMapping(String outdir, GxtEnumMapping mapping) throws IOException;
	
}
