package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.mvw.tools.mvwgenerator.generated.types.I18NConfigREF;
import org.dmd.mvw.tools.mvwgenerator.extended.I18NConfig;
/**
 * The I18NConfigIteratorDMW will cast from an underlying I18NConfigREF class to 
 * the associated wrapper class: I18NConfig when accessing object references in a wrapper context.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:323)
 */
public class I18NConfigIterableDMW extends DmwContainerIterator<I18NConfig,I18NConfigREF> {

    public final static I18NConfigIterableDMW emptyList = new I18NConfigIterableDMW();

    protected I18NConfigIterableDMW(){
        super();
    }

    public I18NConfigIterableDMW(Iterator<I18NConfigREF> it){
        super(it);
    }

}

