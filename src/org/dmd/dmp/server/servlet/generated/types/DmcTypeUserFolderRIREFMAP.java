//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dmp.server.servlet.generated.types;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.types.DotName;    // key type import
/**
 * The DmcTypeUserFolderRIREFMAP provides storage for a map of UserFolderRIREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3024)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:538)
 */
@SuppressWarnings("serial")
// public class DmcTypeUserFolderRIREFMAP extends DmcTypeUserFolderRIREF<UserFolderRIREF,DotName> {
public class DmcTypeUserFolderRIREFMAP extends DmcTypeUserFolderRIREF implements Serializable {
    
    private final static Iterator<UserFolderRIREF> emptyList = (new HashMap<DotName,UserFolderRIREF>()).values().iterator();
    
    protected Map<DotName,UserFolderRIREF> value;
    
    public DmcTypeUserFolderRIREFMAP(){
        value = null;
    }
    
    public DmcTypeUserFolderRIREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<DotName,UserFolderRIREF>();
        else
            value = new TreeMap<DotName,UserFolderRIREF>();
    }
    
    public DotName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<DotName,UserFolderRIREF> map = (TreeMap<DotName,UserFolderRIREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeUserFolderRIREFMAP getNew(){
        return(new DmcTypeUserFolderRIREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3081)
    public DmcAttribute<UserFolderRIREF> cloneIt(){
        synchronized(this){
            DmcTypeUserFolderRIREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(UserFolderRIREF val: value.values())
            try {
                rc.add(val);
            } catch (DmcValueException e) {
                throw(new IllegalStateException("typeCheck() should never fail here!",e));
            }
            return(rc);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3101)
    public UserFolderRIREF add(Object v) throws DmcValueException {
        synchronized(this){
            UserFolderRIREF newval = typeCheck(v);
            if (value == null)
                initValue();
            DotName key = (DotName)((DmcMappedAttributeIF)newval).getKey();
            UserFolderRIREF oldval = value.put(key,newval);
            
            if (oldval != null){
                // We had a value with this key, ensure that the value actually changed
                if (oldval.valuesAreEqual(newval))
                    newval = null;
            }
            
            return(newval);
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3122)
    public UserFolderRIREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof DotName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3138)
    public Iterator<UserFolderRIREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<DotName,UserFolderRIREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<DotName,UserFolderRIREF>(value);
            else
                clone = new TreeMap<DotName,UserFolderRIREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3155)
    public Map<DotName,UserFolderRIREF> getMVCopy(){
        synchronized(this){
            Map<DotName,UserFolderRIREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<DotName,UserFolderRIREF>();
                else
                    clone = new HashMap<DotName,UserFolderRIREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<DotName,UserFolderRIREF>();
                else
                    clone = new TreeMap<DotName,UserFolderRIREF>(value);
            }
            return(clone);
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3176)
    @Override
    public int getMVSize(){
        synchronized(this){
            if (value == null)
                return(0);
            return(value.size());
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3188)
    public UserFolderRIREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof DotName)
                return(value.get((DotName) key));
            else
                throw(new IllegalStateException("Incompatible type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3203)
    public boolean contains(Object v){
        synchronized(this){
           if (value == null)
               return(false);
    
            try {
                UserFolderRIREF val = typeCheck(v);
                return(value.containsValue(val));
            } catch (DmcValueException e) {
                return(false);
            }
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3220)
    public boolean containsKey(Object key){
        synchronized(this){
           if (value == null)
               return(false);
    
           if (key instanceof DotName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

