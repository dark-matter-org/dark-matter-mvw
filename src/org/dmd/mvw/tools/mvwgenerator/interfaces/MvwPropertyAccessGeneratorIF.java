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
package org.dmd.mvw.tools.mvwgenerator.interfaces;

import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.PropertyAccess;

/**
 * The MvwPropertyAccessGeneratorIF defines a object that can generate a
 * mechanism that allows for access to the properties of a dark-matter object (DMO)
 * within the context of a particular widget set.
 */
public interface MvwPropertyAccessGeneratorIF {

	public void formatPropertyAccess(String outdir, PropertyAccess access) throws IOException;
}
