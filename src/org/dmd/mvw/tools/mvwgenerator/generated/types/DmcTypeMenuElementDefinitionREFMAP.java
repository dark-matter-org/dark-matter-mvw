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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

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
import org.dmd.dmc.types.CamelCaseName;    // key type import
/**
 * The DmcTypeMenuElementDefinitionREFMAP provides storage for a map of MenuElementDefinitionREF
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3024)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:538)
 */
@SuppressWarnings("serial")
// public class DmcTypeMenuElementDefinitionREFMAP extends DmcTypeMenuElementDefinitionREF<MenuElementDefinitionREF,CamelCaseName> {
public class DmcTypeMenuElementDefinitionREFMAP extends DmcTypeMenuElementDefinitionREF implements Serializable {
    
    private final static Iterator<MenuElementDefinitionREF> emptyList = (new HashMap<CamelCaseName,MenuElementDefinitionREF>()).values().iterator();
    
    protected Map<CamelCaseName,MenuElementDefinitionREF> value;
    
    public DmcTypeMenuElementDefinitionREFMAP(){
        value = null;
    }
    
    public DmcTypeMenuElementDefinitionREFMAP(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
            value = new HashMap<CamelCaseName,MenuElementDefinitionREF>();
        else
            value = new TreeMap<CamelCaseName,MenuElementDefinitionREF>();
    }
    
    public CamelCaseName firstKey(){
        if (getAttributeInfo().valueType == ValueTypeEnum.TREEMAPPED){
            if (value == null)
                return(null);
            TreeMap<CamelCaseName,MenuElementDefinitionREF> map = (TreeMap<CamelCaseName,MenuElementDefinitionREF>)value;
            return(map.firstKey());
        }
        throw(new IllegalStateException("Attribute " + getAttributeInfo().name + " is HASHMAPPED and doesn't support firstKey()"));
    }
    
    @Override
    public DmcTypeMenuElementDefinitionREFMAP getNew(){
        return(new DmcTypeMenuElementDefinitionREFMAP(getAttributeInfo()));
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3081)
    public DmcAttribute<MenuElementDefinitionREF> cloneIt(){
        synchronized(this){
            DmcTypeMenuElementDefinitionREFMAP rc = getNew();
    
            if (value == null)
                return(rc);
    
            for(MenuElementDefinitionREF val: value.values())
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
    public MenuElementDefinitionREF add(Object v) throws DmcValueException {
        synchronized(this){
            MenuElementDefinitionREF newval = typeCheck(v);
            if (value == null)
                initValue();
            CamelCaseName key = (CamelCaseName)((DmcMappedAttributeIF)newval).getKey();
            MenuElementDefinitionREF oldval = value.put(key,newval);
            
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
    public MenuElementDefinitionREF del(Object key){
        synchronized(this){
    
            if (value == null)
                return(null);
    
           if (key instanceof CamelCaseName)
                return(value.remove(key));
            else
                throw(new IllegalStateException("Incompatible key type: " + key.getClass().getName() + " passed to del():" + getName()));
        }
    }
    
    @Override
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3138)
    public Iterator<MenuElementDefinitionREF> getMV(){
        synchronized(this){
    
            if (value == null)
                return(emptyList);
    
            Map<CamelCaseName,MenuElementDefinitionREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED)
                clone = new HashMap<CamelCaseName,MenuElementDefinitionREF>(value);
            else
                clone = new TreeMap<CamelCaseName,MenuElementDefinitionREF>(value);
            return(clone.values().iterator());
        }
    }
    
    // org.dmd.dms.util.GenUtility.dumpMAPType(GenUtility.java:3155)
    public Map<CamelCaseName,MenuElementDefinitionREF> getMVCopy(){
        synchronized(this){
            Map<CamelCaseName,MenuElementDefinitionREF> clone = null;
            if (getAttributeInfo().valueType == ValueTypeEnum.HASHMAPPED){
                if (value == null)
                    clone = new HashMap<CamelCaseName,MenuElementDefinitionREF>();
                else
                    clone = new HashMap<CamelCaseName,MenuElementDefinitionREF>(value);
            }
            else{
                if (value == null)
                    clone = new TreeMap<CamelCaseName,MenuElementDefinitionREF>();
                else
                    clone = new TreeMap<CamelCaseName,MenuElementDefinitionREF>(value);
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
    public MenuElementDefinitionREF getByKey(Object key){
        synchronized(this){
           if (value == null)
               return(null);
    
            if (key instanceof CamelCaseName)
                return(value.get((CamelCaseName) key));
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
                MenuElementDefinitionREF val = typeCheck(v);
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
    
           if (key instanceof CamelCaseName)
                return(value.containsKey(key));
            return(false);
        }
    }
    
}

