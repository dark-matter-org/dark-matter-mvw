package org.dmd.mvw.tools.mvwgenerator.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1754)
import java.util.Iterator;                                          // Beacuse we're iterating - (GenUtility.java:1747)
import org.dmd.dmw.DmwMVIterator;                                   // The base multi-value iterator - (GenUtility.java:1748)
import org.dmd.mvw.tools.mvwgenerator.types.MethodWithArgs;         // This is the type we're iterating - (GenUtility.java:1751)


/**
 * The MethodWithArgsIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1770)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:113)
 */
public class MethodWithArgsIterableDMW extends DmwMVIterator<MethodWithArgs> {

    public final static MethodWithArgsIterableDMW emptyList = new MethodWithArgsIterableDMW();

    protected MethodWithArgsIterableDMW(){
        super();
    }

    public MethodWithArgsIterableDMW(Iterator<MethodWithArgs> it){
        super(it);
    }

}

