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
package org.dmd.mvw.tools.mvwgenerator.generated.enums;

import java.util.*;

import org.dmd.dmc.DmcEnumIF;

/**
 * The SelectionTypeEnum indicates the selection mode of operations\n
 * associated with object selection or object deletion.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.DmoEnumFormatter.dumpEnum(DmoEnumFormatter.java:100)
 */
public enum SelectionTypeEnum implements DmcEnumIF
{
    SINGLE(0,"Single selection supported."),

    MULTI(1,"Multi-selection supported.");

    // Maps our integer value to the enumeration value
    private static final Map<Integer,SelectionTypeEnum> lookup = new HashMap<Integer,SelectionTypeEnum>();

    static {
        for(SelectionTypeEnum s : EnumSet.allOf(SelectionTypeEnum.class))
            lookup.put(s.intValue(), s);
    }

    // Maps our enumeration (string) value to the enumeration value
    private static final Map<String,SelectionTypeEnum> lookupString = new HashMap<String, SelectionTypeEnum>();

    static {
        for(SelectionTypeEnum s : EnumSet.allOf(SelectionTypeEnum.class))
            lookupString.put(s.name(), s);
    }

    // Our current value as an int - normally, this isn't available in an enum
    private int ival;

    // Our current display value as a String
    private String dval;

    /**
     * This private constructor allows us to access our int value when required.
     */
    private SelectionTypeEnum(int i, String d){
        ival = i;
        dval = d;
    }

    /**
     * Returns the value of this enum value as an int.
     */
    public int intValue(){
        return(ival);
    }

    /**
     * Returns the display value of this enum value as a String.
     */
    public String displayValue(){
        return(dval);
    }

    /**
     * Returns the enum value of the specified int or null if it's not valid.
     */
    public static SelectionTypeEnum get(int code) {
        return(lookup.get(code));
    }

    /**
     * Returns a value for this enum or throws an exception if the String value isn't
     * a valid member of this enum.
     */
    public static SelectionTypeEnum get(String str) {
        return(lookupString.get(str.toUpperCase()));
    }

}