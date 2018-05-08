package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1911)
import java.util.Iterator;                                                       // Beacuse we're iterating - (GenUtility.java:1904)
import org.dmd.dmw.DmwMVIterator;                                                // The base multi-value iterator - (GenUtility.java:1905)
import org.dmd.mvw.tools.mvwgenerator.generated.enums.RequestOptionEnum;         // This is the type we're iterating - (GenUtility.java:1908)


/**
 * The RequestOptionEnumIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1927)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:124)
 */
public class RequestOptionEnumIterableDMW extends DmwMVIterator<RequestOptionEnum> {

    public final static RequestOptionEnumIterableDMW emptyList = new RequestOptionEnumIterableDMW();

    protected RequestOptionEnumIterableDMW(){
        super();
    }

    public RequestOptionEnumIterableDMW(Iterator<RequestOptionEnum> it){
        super(it);
    }

}

