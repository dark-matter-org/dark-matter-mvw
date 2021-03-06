package org.dmd.dmt.client.generated.mvw.forms;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:76)
import java.util.ArrayList;                                                               // To store the complete set of editors - (FormBindingFormatter.java:46)
import java.util.Iterator;                                                                // To access the complete set of editors - (FormBindingFormatter.java:47)
import org.dmd.dmc.DmcNamedObjectIF;                                                      // Used when testing if an object named - (FormBindingFormatter.java:49)
import org.dmd.dmc.DmcValueException;                                                     // Required if we have modification errors - (FormBindingFormatter.java:50)
import org.dmd.dmc.DmcValueExceptionSet;                                                  // Required if we have modification errors - (FormBindingFormatter.java:51)
import org.dmd.dmc.presentation.DmcPresentationIF;                                        // To access the complete set of editors - (FormBindingFormatter.java:48)
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;                                 // Presentation tracker - (FormBindingFormatter.java:62)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                               // Required when edit object has no name - (FormBindingFormatter.java:52)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                     // Required when edit object has no name - (FormBindingFormatter.java:53)
import org.dmd.dmt.client.editors.DMTBasicObjectField;                                    // Editor - (FormBindingFormatter.java:65)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                         // Required schema - (FormBindingFormatter.java:67)
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;                     // For the object we're editting - (FormBindingFormatter.java:72)
import org.dmd.dmt.shared.generated.types.adapters.TestBasicObjectFixedMVAdapter;         // Adapter for mvIdxUnnamedObj - (FormBindingFormatter.java:64)
import org.dmd.mvw.client.mvwforms.base.MvwFormBindingIF;                                 // Standard interface for bindings - (FormBindingFormatter.java:54)


// org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:78)
public class TestBasicNamedObjectFixedBinding implements MvwFormBindingIF {

    private TestBasicNamedObjectFixedDMO dmo;

    private Integer labelWidth;

    // If the object set on the binding doesn't have a name, it is considered a new object
    private boolean isNewObject;

    // The complete set of editors
    private ArrayList<DmcPresentationIF>	editors;

    private DmcPresentationTrackerIF	tracker;

    private DMTBasicObjectField mvIdxUnnamedObj0;
    private TestBasicObjectFixedMVAdapter mvIdxUnnamedObjAdapter0;

    private DMTBasicObjectField mvIdxUnnamedObj1;
    private TestBasicObjectFixedMVAdapter mvIdxUnnamedObjAdapter1;

    private DMTBasicObjectField mvIdxUnnamedObj2;
    private TestBasicObjectFixedMVAdapter mvIdxUnnamedObjAdapter2;

    private DMTBasicObjectField mvIdxUnnamedObj3;
    private TestBasicObjectFixedMVAdapter mvIdxUnnamedObjAdapter3;

    private DMTBasicObjectField mvIdxUnnamedObj4;
    private TestBasicObjectFixedMVAdapter mvIdxUnnamedObjAdapter4;

    private DMTBasicObjectField mvIdxUnnamedObj5;
    private TestBasicObjectFixedMVAdapter mvIdxUnnamedObjAdapter5;

    private DMTBasicObjectField mvIdxUnnamedObj6;
    private TestBasicObjectFixedMVAdapter mvIdxUnnamedObjAdapter6;

    private DMTBasicObjectField mvIdxUnnamedObj7;
    private TestBasicObjectFixedMVAdapter mvIdxUnnamedObjAdapter7;

    private DMTBasicObjectField mvIdxUnnamedObj8;
    private TestBasicObjectFixedMVAdapter mvIdxUnnamedObjAdapter8;

    private DMTBasicObjectField mvIdxUnnamedObj9;
    private TestBasicObjectFixedMVAdapter mvIdxUnnamedObjAdapter9;


    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:98)
    public TestBasicNamedObjectFixedBinding(){

        isNewObject = false;

        editors = new ArrayList<>();

        mvIdxUnnamedObj0 = new DMTBasicObjectField();
        mvIdxUnnamedObj0.setValueIndex(0);
        mvIdxUnnamedObj0.setLabel("Basic Objects");
        mvIdxUnnamedObj0.setMandatory(true);
        mvIdxUnnamedObjAdapter0 = new TestBasicObjectFixedMVAdapter(DmtDMSAG.__mvIdxUnnamedObj);
        mvIdxUnnamedObj0.setAdapter(mvIdxUnnamedObjAdapter0);
        editors.add(mvIdxUnnamedObj0);

        mvIdxUnnamedObj1 = new DMTBasicObjectField();
        mvIdxUnnamedObj1.setValueIndex(1);
        mvIdxUnnamedObj1.setLabel("Basic Objects");
        mvIdxUnnamedObj1.setMandatory(true);
        mvIdxUnnamedObjAdapter1 = new TestBasicObjectFixedMVAdapter(DmtDMSAG.__mvIdxUnnamedObj);
        mvIdxUnnamedObj1.setAdapter(mvIdxUnnamedObjAdapter1);
        editors.add(mvIdxUnnamedObj1);

        mvIdxUnnamedObj2 = new DMTBasicObjectField();
        mvIdxUnnamedObj2.setValueIndex(2);
        mvIdxUnnamedObj2.setLabel("Basic Objects");
        mvIdxUnnamedObj2.setMandatory(true);
        mvIdxUnnamedObjAdapter2 = new TestBasicObjectFixedMVAdapter(DmtDMSAG.__mvIdxUnnamedObj);
        mvIdxUnnamedObj2.setAdapter(mvIdxUnnamedObjAdapter2);
        editors.add(mvIdxUnnamedObj2);

        mvIdxUnnamedObj3 = new DMTBasicObjectField();
        mvIdxUnnamedObj3.setValueIndex(3);
        mvIdxUnnamedObj3.setLabel("Basic Objects");
        mvIdxUnnamedObj3.setMandatory(true);
        mvIdxUnnamedObjAdapter3 = new TestBasicObjectFixedMVAdapter(DmtDMSAG.__mvIdxUnnamedObj);
        mvIdxUnnamedObj3.setAdapter(mvIdxUnnamedObjAdapter3);
        editors.add(mvIdxUnnamedObj3);

        mvIdxUnnamedObj4 = new DMTBasicObjectField();
        mvIdxUnnamedObj4.setValueIndex(4);
        mvIdxUnnamedObj4.setLabel("Basic Objects");
        mvIdxUnnamedObj4.setMandatory(true);
        mvIdxUnnamedObjAdapter4 = new TestBasicObjectFixedMVAdapter(DmtDMSAG.__mvIdxUnnamedObj);
        mvIdxUnnamedObj4.setAdapter(mvIdxUnnamedObjAdapter4);
        editors.add(mvIdxUnnamedObj4);

        mvIdxUnnamedObj5 = new DMTBasicObjectField();
        mvIdxUnnamedObj5.setValueIndex(5);
        mvIdxUnnamedObj5.setLabel("Basic Objects");
        mvIdxUnnamedObj5.setMandatory(true);
        mvIdxUnnamedObjAdapter5 = new TestBasicObjectFixedMVAdapter(DmtDMSAG.__mvIdxUnnamedObj);
        mvIdxUnnamedObj5.setAdapter(mvIdxUnnamedObjAdapter5);
        editors.add(mvIdxUnnamedObj5);

        mvIdxUnnamedObj6 = new DMTBasicObjectField();
        mvIdxUnnamedObj6.setValueIndex(6);
        mvIdxUnnamedObj6.setLabel("Basic Objects");
        mvIdxUnnamedObj6.setMandatory(true);
        mvIdxUnnamedObjAdapter6 = new TestBasicObjectFixedMVAdapter(DmtDMSAG.__mvIdxUnnamedObj);
        mvIdxUnnamedObj6.setAdapter(mvIdxUnnamedObjAdapter6);
        editors.add(mvIdxUnnamedObj6);

        mvIdxUnnamedObj7 = new DMTBasicObjectField();
        mvIdxUnnamedObj7.setValueIndex(7);
        mvIdxUnnamedObj7.setLabel("Basic Objects");
        mvIdxUnnamedObj7.setMandatory(true);
        mvIdxUnnamedObjAdapter7 = new TestBasicObjectFixedMVAdapter(DmtDMSAG.__mvIdxUnnamedObj);
        mvIdxUnnamedObj7.setAdapter(mvIdxUnnamedObjAdapter7);
        editors.add(mvIdxUnnamedObj7);

        mvIdxUnnamedObj8 = new DMTBasicObjectField();
        mvIdxUnnamedObj8.setValueIndex(8);
        mvIdxUnnamedObj8.setLabel("Basic Objects");
        mvIdxUnnamedObj8.setMandatory(true);
        mvIdxUnnamedObjAdapter8 = new TestBasicObjectFixedMVAdapter(DmtDMSAG.__mvIdxUnnamedObj);
        mvIdxUnnamedObj8.setAdapter(mvIdxUnnamedObjAdapter8);
        editors.add(mvIdxUnnamedObj8);

        mvIdxUnnamedObj9 = new DMTBasicObjectField();
        mvIdxUnnamedObj9.setValueIndex(9);
        mvIdxUnnamedObj9.setLabel("Basic Objects");
        mvIdxUnnamedObj9.setMandatory(true);
        mvIdxUnnamedObjAdapter9 = new TestBasicObjectFixedMVAdapter(DmtDMSAG.__mvIdxUnnamedObj);
        mvIdxUnnamedObj9.setAdapter(mvIdxUnnamedObjAdapter9);
        editors.add(mvIdxUnnamedObj9);

    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:119)
    public boolean isNewObject(){
        return(isNewObject);
    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:126)
    public void setObject(TestBasicNamedObjectFixedDMO obj){
        dmo = obj;

        if (obj instanceof DmcNamedObjectIF){
            if (((DmcNamedObjectIF)obj).getObjectName() == null)
                isNewObject = true;
            else
                isNewObject = false;
        }
        mvIdxUnnamedObj0.setDMO(dmo);
        mvIdxUnnamedObj1.setDMO(dmo);
        mvIdxUnnamedObj2.setDMO(dmo);
        mvIdxUnnamedObj3.setDMO(dmo);
        mvIdxUnnamedObj4.setDMO(dmo);
        mvIdxUnnamedObj5.setDMO(dmo);
        mvIdxUnnamedObj6.setDMO(dmo);
        mvIdxUnnamedObj7.setDMO(dmo);
        mvIdxUnnamedObj8.setDMO(dmo);
        mvIdxUnnamedObj9.setDMO(dmo);

        mvIdxUnnamedObjAdapter0.setEmpty();
        if (dmo == null)
            mvIdxUnnamedObjAdapter0.setExisting(null);
        else
            mvIdxUnnamedObjAdapter0.setExisting(dmo.get(DmtDMSAG.__mvIdxUnnamedObj));
        mvIdxUnnamedObj0.setAdapter(mvIdxUnnamedObjAdapter0);

        mvIdxUnnamedObjAdapter1.setEmpty();
        if (dmo == null)
            mvIdxUnnamedObjAdapter1.setExisting(null);
        else
            mvIdxUnnamedObjAdapter1.setExisting(dmo.get(DmtDMSAG.__mvIdxUnnamedObj));
        mvIdxUnnamedObj1.setAdapter(mvIdxUnnamedObjAdapter1);

        mvIdxUnnamedObjAdapter2.setEmpty();
        if (dmo == null)
            mvIdxUnnamedObjAdapter2.setExisting(null);
        else
            mvIdxUnnamedObjAdapter2.setExisting(dmo.get(DmtDMSAG.__mvIdxUnnamedObj));
        mvIdxUnnamedObj2.setAdapter(mvIdxUnnamedObjAdapter2);

        mvIdxUnnamedObjAdapter3.setEmpty();
        if (dmo == null)
            mvIdxUnnamedObjAdapter3.setExisting(null);
        else
            mvIdxUnnamedObjAdapter3.setExisting(dmo.get(DmtDMSAG.__mvIdxUnnamedObj));
        mvIdxUnnamedObj3.setAdapter(mvIdxUnnamedObjAdapter3);

        mvIdxUnnamedObjAdapter4.setEmpty();
        if (dmo == null)
            mvIdxUnnamedObjAdapter4.setExisting(null);
        else
            mvIdxUnnamedObjAdapter4.setExisting(dmo.get(DmtDMSAG.__mvIdxUnnamedObj));
        mvIdxUnnamedObj4.setAdapter(mvIdxUnnamedObjAdapter4);

        mvIdxUnnamedObjAdapter5.setEmpty();
        if (dmo == null)
            mvIdxUnnamedObjAdapter5.setExisting(null);
        else
            mvIdxUnnamedObjAdapter5.setExisting(dmo.get(DmtDMSAG.__mvIdxUnnamedObj));
        mvIdxUnnamedObj5.setAdapter(mvIdxUnnamedObjAdapter5);

        mvIdxUnnamedObjAdapter6.setEmpty();
        if (dmo == null)
            mvIdxUnnamedObjAdapter6.setExisting(null);
        else
            mvIdxUnnamedObjAdapter6.setExisting(dmo.get(DmtDMSAG.__mvIdxUnnamedObj));
        mvIdxUnnamedObj6.setAdapter(mvIdxUnnamedObjAdapter6);

        mvIdxUnnamedObjAdapter7.setEmpty();
        if (dmo == null)
            mvIdxUnnamedObjAdapter7.setExisting(null);
        else
            mvIdxUnnamedObjAdapter7.setExisting(dmo.get(DmtDMSAG.__mvIdxUnnamedObj));
        mvIdxUnnamedObj7.setAdapter(mvIdxUnnamedObjAdapter7);

        mvIdxUnnamedObjAdapter8.setEmpty();
        if (dmo == null)
            mvIdxUnnamedObjAdapter8.setExisting(null);
        else
            mvIdxUnnamedObjAdapter8.setExisting(dmo.get(DmtDMSAG.__mvIdxUnnamedObj));
        mvIdxUnnamedObj8.setAdapter(mvIdxUnnamedObjAdapter8);

        mvIdxUnnamedObjAdapter9.setEmpty();
        if (dmo == null)
            mvIdxUnnamedObjAdapter9.setExisting(null);
        else
            mvIdxUnnamedObjAdapter9.setExisting(dmo.get(DmtDMSAG.__mvIdxUnnamedObj));
        mvIdxUnnamedObj9.setAdapter(mvIdxUnnamedObjAdapter9);


        tracker.reset();
    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:154)
    public void setTracker(DmcPresentationTrackerIF t){
        tracker = t;

        tracker.track(mvIdxUnnamedObj0);
        tracker.track(mvIdxUnnamedObj1);
        tracker.track(mvIdxUnnamedObj2);
        tracker.track(mvIdxUnnamedObj3);
        tracker.track(mvIdxUnnamedObj4);
        tracker.track(mvIdxUnnamedObj5);
        tracker.track(mvIdxUnnamedObj6);
        tracker.track(mvIdxUnnamedObj7);
        tracker.track(mvIdxUnnamedObj8);
        tracker.track(mvIdxUnnamedObj9);
    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:165)
    public void setEnabledAll(boolean enabled){
        mvIdxUnnamedObj0.setEnabled(enabled);
        mvIdxUnnamedObj1.setEnabled(enabled);
        mvIdxUnnamedObj2.setEnabled(enabled);
        mvIdxUnnamedObj3.setEnabled(enabled);
        mvIdxUnnamedObj4.setEnabled(enabled);
        mvIdxUnnamedObj5.setEnabled(enabled);
        mvIdxUnnamedObj6.setEnabled(enabled);
        mvIdxUnnamedObj7.setEnabled(enabled);
        mvIdxUnnamedObj8.setEnabled(enabled);
        mvIdxUnnamedObj9.setEnabled(enabled);
    }

    public Iterator<DmcPresentationIF>    getEditors(){
        return(editors.iterator());
    }

    public Integer    getLabelWidth(){
        return(labelWidth);
    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:218)
    public TestBasicNamedObjectFixedDMO getModRec(){
        if (dmo == null)
            return(null);

        if (isNewObject)
            throw(new IllegalStateException("You are dealing with a new object, call getModifiedObject(), not getModRec()"));

        TestBasicNamedObjectFixedDMO modrec = dmo.getModificationRecorder();

        if (mvIdxUnnamedObjAdapter0.valueChanged())
            mvIdxUnnamedObjAdapter0.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter1.valueChanged())
            mvIdxUnnamedObjAdapter1.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter2.valueChanged())
            mvIdxUnnamedObjAdapter2.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter3.valueChanged())
            mvIdxUnnamedObjAdapter3.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter4.valueChanged())
            mvIdxUnnamedObjAdapter4.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter5.valueChanged())
            mvIdxUnnamedObjAdapter5.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter6.valueChanged())
            mvIdxUnnamedObjAdapter6.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter7.valueChanged())
            mvIdxUnnamedObjAdapter7.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter8.valueChanged())
            mvIdxUnnamedObjAdapter8.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter9.valueChanged())
            mvIdxUnnamedObjAdapter9.addMods(modrec.getModifier());

        return(modrec);
    }

    // org.dmd.mvw.tools.mvwgenerator.util.FormBindingFormatter.formatFormBinding(FormBindingFormatter.java:238)
    public TestBasicNamedObjectFixedDMO getModifiedObject(){
        if (dmo == null)
            return(null);

        TestBasicNamedObjectFixedDMO modrec = (TestBasicNamedObjectFixedDMO) dmo.getNew();
        modrec.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));

        if (mvIdxUnnamedObjAdapter0.valueChanged())
            mvIdxUnnamedObjAdapter0.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter1.valueChanged())
            mvIdxUnnamedObjAdapter1.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter2.valueChanged())
            mvIdxUnnamedObjAdapter2.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter3.valueChanged())
            mvIdxUnnamedObjAdapter3.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter4.valueChanged())
            mvIdxUnnamedObjAdapter4.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter5.valueChanged())
            mvIdxUnnamedObjAdapter5.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter6.valueChanged())
            mvIdxUnnamedObjAdapter6.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter7.valueChanged())
            mvIdxUnnamedObjAdapter7.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter8.valueChanged())
            mvIdxUnnamedObjAdapter8.addMods(modrec.getModifier());
        if (mvIdxUnnamedObjAdapter9.valueChanged())
            mvIdxUnnamedObjAdapter9.addMods(modrec.getModifier());

        TestBasicNamedObjectFixedDMO rc = (TestBasicNamedObjectFixedDMO) dmo.cloneIt();

        try {
            rc.applyModifier(modrec.getModifier());
        } catch(DmcValueExceptionSet ex){
            throw(new IllegalStateException("Your form should not permit invalid data", ex));
        } catch(DmcValueException ex){
            throw(new IllegalStateException("Your form should not permit invalid data", ex));
        }
        
        return(rc);
    }

    public DMTBasicObjectField getMvIdxUnnamedObj0(){
        return(mvIdxUnnamedObj0);
    }

    public DMTBasicObjectField getMvIdxUnnamedObj1(){
        return(mvIdxUnnamedObj1);
    }

    public DMTBasicObjectField getMvIdxUnnamedObj2(){
        return(mvIdxUnnamedObj2);
    }

    public DMTBasicObjectField getMvIdxUnnamedObj3(){
        return(mvIdxUnnamedObj3);
    }

    public DMTBasicObjectField getMvIdxUnnamedObj4(){
        return(mvIdxUnnamedObj4);
    }

    public DMTBasicObjectField getMvIdxUnnamedObj5(){
        return(mvIdxUnnamedObj5);
    }

    public DMTBasicObjectField getMvIdxUnnamedObj6(){
        return(mvIdxUnnamedObj6);
    }

    public DMTBasicObjectField getMvIdxUnnamedObj7(){
        return(mvIdxUnnamedObj7);
    }

    public DMTBasicObjectField getMvIdxUnnamedObj8(){
        return(mvIdxUnnamedObj8);
    }

    public DMTBasicObjectField getMvIdxUnnamedObj9(){
        return(mvIdxUnnamedObj9);
    }

}

