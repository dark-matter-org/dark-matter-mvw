package org.dmd.mvw.tools.mvwgenerator.generated.types.adapters;

import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeComponentREFMAP;

@SuppressWarnings("serial")
// org.dmd.dms.util.AdapterFormatter.dumpAdapter(AdapterFormatter.java:59)
// Called from: org.dmd.dms.util.AdapterFormatter.dumpAdapterMAP(AdapterFormatter.java:24)
public class ComponentREFMAPAdapter extends DmcTypeComponentREFMAP implements DmcAdapterIF {

    transient DmcTypeComponentREFMAP existingValue;

    public ComponentREFMAPAdapter(DmcAttributeInfo ai){
    	   super(ai);
    }

    public void setEmpty(){
    	   value = null;
    }

    public boolean hasValue(){
    	   if (value == null)
    		   return(false);
    	   return(true);
    }

    public void resetToExisting() {
    	if (existingValue == null)
    		value = null;
    	else
    		value = existingValue.getMVCopy();
    }

    public void setExisting(DmcAttribute<?> attr) {
    	existingValue = (DmcTypeComponentREFMAP) attr;
    	if (existingValue != null)
    		value = existingValue.getMVCopy();
    }

    public boolean valueChanged(){
    	   return(valueChangedMV(existingValue, this));
    }

    public void addMods(DmcTypeModifierMV mods){
    	   addModsMV(mods, existingValue, this);
    }

    public DmcAttribute<?> getExisting() {
    	   return(existingValue);
    }

    public Object getValue() {
    	   return(value);
    }

}

