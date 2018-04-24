package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.PropertyAccessGeneratorREF;
import org.dmd.mvw.tools.mvwgenerator.extended.PropertyAccessGenerator;
/**
 * The PropertyAccessGeneratorIteratorDMW will cast from an underlying PropertyAccessGeneratorREF class to 
 * the associated wrapper class: PropertyAccessGenerator when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:323)
 */
public class PropertyAccessGeneratorIterableDMW extends DmwContainerIterator<PropertyAccessGenerator,PropertyAccessGeneratorREF> {

    public final static PropertyAccessGeneratorIterableDMW emptyList = new PropertyAccessGeneratorIterableDMW();

    protected PropertyAccessGeneratorIterableDMW(){
        super();
    }

    public PropertyAccessGeneratorIterableDMW(Iterator<PropertyAccessGeneratorREF> it){
        super(it);
    }

}

