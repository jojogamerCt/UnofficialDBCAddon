/*
 * Decompiled with CFR 0.152.
 */
package JinRyuu.JRMCore.server.config.dbc;

import java.util.ArrayList;

public class FormMastery {
    public ArrayList<Object[]> data = new ArrayList();

    public void addData(Object ... data) {
        this.data.add(data);
    }

    public String getString(int arrayID, int dataID) {
        if (this.data.size() > arrayID && this.data.get(arrayID).length > dataID) {
            return (String)this.data.get(arrayID)[dataID];
        }
        return "";
    }

    public double getDouble(int arrayID, int dataID) {
        if (this.data.size() > arrayID && this.data.get(arrayID).length > dataID) {
            String[] doubleData = (String[])this.data.get(arrayID);
            return Double.parseDouble(doubleData[dataID]);
        }
        return 0.0;
    }
}

