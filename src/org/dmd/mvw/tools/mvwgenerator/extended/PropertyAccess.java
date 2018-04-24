package org.dmd.mvw.tools.mvwgenerator.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:277)
import org.dmd.dms.ClassDefinition;                                            // Used in derived constructors - (DMWGenerator.java:271)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PropertyAccessDMO;         // The wrapper we're extending - (DMWGenerator.java:270)
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.PropertyAccessDMW;         // The wrapper we're extending - (DMWGenerator.java:269)


public class PropertyAccess extends PropertyAccessDMW {

    public PropertyAccess(){
        super();
    }

    public PropertyAccess(PropertyAccessDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

}

