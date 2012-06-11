package org.dmd.mvw.tools.mvwgenerator.extended;

import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.forms.EnumMapping;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.EnumMappingGeneratorDMW;
import org.dmd.mvw.tools.mvwgenerator.interfaces.MvwEnumMappingGeneratorIF;
import org.dmd.util.exceptions.ResultException;

public class EnumMappingGenerator extends EnumMappingGeneratorDMW {
	
	MvwEnumMappingGeneratorIF	generator;
	
	public EnumMappingGenerator(){
		
	}
	
	public void formatEnumMapping(String outdir, EnumMapping mapping) throws IOException {
		generator.formatEnumMapping(outdir, mapping);
	}

	public void init() throws ResultException {
		if (generator == null){
			Class<?> 	objclass 	= null;
			Object 		gen			= null;
			
			try {
				objclass = Class.forName(getEnumGeneratorClass());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				ResultException ex = new ResultException("Could not load java class for enum mapping generator: " + getEnumGeneratorClass());
				throw(ex);
			};

			try {
				gen = objclass.newInstance();
			} catch (Exception e) {
				ResultException ex = new ResultException("Could not instantiate java class for enum mapping generator: " + getEnumGeneratorClass());
				throw(ex);
			}
			
			try {
				generator = (MvwEnumMappingGeneratorIF)gen;
			} catch (Exception e) {
				ResultException ex = new ResultException("This class does not implement the MvwEnumMappingGeneratorIF interface: " + getEnumGeneratorClass());
				throw(ex);
			}
		}
	}
}
