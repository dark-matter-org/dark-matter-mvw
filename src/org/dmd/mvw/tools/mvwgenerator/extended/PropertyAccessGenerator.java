//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2018 dark-matter-data committers
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
package org.dmd.mvw.tools.mvwgenerator.extended;

import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PropertyAccessGeneratorDMW;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.mvw.tools.mvwgenerator.interfaces.MvwPropertyAccessGeneratorIF;
import org.dmd.util.exceptions.ResultException;


public class PropertyAccessGenerator extends PropertyAccessGeneratorDMW {
	
	MvwPropertyAccessGeneratorIF	generator;

    public PropertyAccessGenerator(){
        super();
    }
    
    public void formatPropertyAccess(String outdir, PropertyAccess access) throws IOException {
    	generator.formatPropertyAccess(outdir, access);
    }

	public void init() throws ResultException {
		if (generator == null){
			Class<?> 	objclass 	= null;
			Object 		gen			= null;
			
			try {
				objclass = Class.forName(getPropertyAccessGeneratorClass());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				ResultException ex = new ResultException("Could not load java class for enum mapping generator: " + getPropertyAccessGeneratorClass());
				throw(ex);
			};

			try {
				gen = objclass.newInstance();
			} catch (Exception e) {
				ResultException ex = new ResultException("Could not instantiate java class for enum mapping generator: " + getPropertyAccessGeneratorClass());
				throw(ex);
			}
			
			try {
				generator = (MvwPropertyAccessGeneratorIF)gen;
			} catch (Exception e) {
				ResultException ex = new ResultException("This class does not implement the MvwPropertyAccessGeneratorIF interface: " + getPropertyAccessGeneratorClass());
				throw(ex);
			}
		}
	}

}

