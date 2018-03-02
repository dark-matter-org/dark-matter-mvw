package org.dmd.dmp.server.servlet.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:527)
import org.dmd.dmp.server.servlet.generated.dmo.DmpServerDMSAG;         // Required attribute from DmpServerDMSAG - (DmoCompactSchemaFormatter.java:562)
import org.dmd.dmr.shared.base.generated.dmo.DmrbaseDMSAG;              // Required attribute from DmrbaseDMSAG - (DmoCompactSchemaFormatter.java:562)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // For Meta references - (DmoCompactSchemaFormatter.java:552)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:531)
public class DmpServerDMSAG_INIT_1 {

    static protected void initDefinitions(){
    // 1 -- PluginConfig
        DmpServerDMSAG.__PluginConfig.addMust(MetaDMSAG.__camelCaseName);
        DmpServerDMSAG.__PluginConfig.addMust(DmpServerDMSAG.__pluginClass);
        DmpServerDMSAG.__PluginConfig.addMust(DmpServerDMSAG.__pluginName);
        DmpServerDMSAG.__PluginConfig.addMay(MetaDMSAG.__description);
        DmpServerDMSAG.__PluginConfig.addMay(MetaDMSAG.__file);
        DmpServerDMSAG.__PluginConfig.addMay(MetaDMSAG.__lineNumber);
        DmpServerDMSAG.__PluginConfig.addMay(DmpServerDMSAG.__runnable);
        DmpServerDMSAG.__PluginConfig.addMay(DmpServerDMSAG.__startOrder);

    // 2 -- UserFolderRI
        DmpServerDMSAG.__UserFolderRI.addMust(MetaDMSAG.__dotName);

    // 3 -- UserRI
        DmpServerDMSAG.__UserRI.addMust(MetaDMSAG.__dotName);
        DmpServerDMSAG.__UserRI.addMust(DmpServerDMSAG.__idRI);
        DmpServerDMSAG.__UserRI.addMust(DmrbaseDMSAG.__password);
        DmpServerDMSAG.__UserRI.addMust(DmrbaseDMSAG.__userName);

    // 4 -- SessionFolderRI
        DmpServerDMSAG.__SessionFolderRI.addMust(MetaDMSAG.__dotName);

    // 5 -- SessionRI
        DmpServerDMSAG.__SessionRI.addMust(MetaDMSAG.__dotName);
        DmpServerDMSAG.__SessionRI.addMust(DmpServerDMSAG.__sessionHostRI);
        DmpServerDMSAG.__SessionRI.addMust(DmpServerDMSAG.__sessionIDRI);
        DmpServerDMSAG.__SessionRI.addMust(DmpServerDMSAG.__userRefRI);


    }

}

