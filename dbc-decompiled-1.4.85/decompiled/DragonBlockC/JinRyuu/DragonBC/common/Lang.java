/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.StatCollector
 */
package JinRyuu.DragonBC.common;

import net.minecraft.util.StatCollector;

public class Lang {
    public String BigBangName = StatCollector.translateToLocal((String)"dbc.KABigBang.name");
    public String BlastName = StatCollector.translateToLocal((String)"dbc.KABlast.name");
    public String BurningAttName = StatCollector.translateToLocal((String)"dbc.KABurningAtt.name");
    public String DeathBeamName = StatCollector.translateToLocal((String)"dbc.KADeathBeam.name");
    public String DodonName = StatCollector.translateToLocal((String)"dbc.KADodon.name");
    public String EnergyDiskName = StatCollector.translateToLocal((String)"dbc.KAEnergyDisk.name");
    public String FinalFlashName = StatCollector.translateToLocal((String)"dbc.KAFinalFlash.name");
    public String FingerLeserName = StatCollector.translateToLocal((String)"dbc.KAFingerLeser.name");
    public String GalicGunName = StatCollector.translateToLocal((String)"dbc.KAGalicGun.name");
    public String HameName = StatCollector.translateToLocal((String)"dbc.KAHame.name");
    public String Hame10xName = StatCollector.translateToLocal((String)"dbc.KAHame10x.name");
    public String MakankoName = StatCollector.translateToLocal((String)"dbc.KAMakanko.name");
    public String MasenkoName = StatCollector.translateToLocal((String)"dbc.KAMasenko.name");
    public String PlanetDestName = StatCollector.translateToLocal((String)"dbc.KAPlanetDest.name");
    public String SpiritbombName = StatCollector.translateToLocal((String)"dbc.KASpiritbomb.name");

    public static void init() {
    }

    public String KAName(int par1) {
        String ret = "";
        int selct = par1;
        if (selct == 1) {
            ret = this.BigBangName;
        }
        if (selct == 2) {
            ret = this.BlastName;
        }
        if (selct == 3) {
            ret = this.BurningAttName;
        }
        if (selct == 4) {
            ret = this.DeathBeamName;
        }
        if (selct == 5) {
            ret = this.DodonName;
        }
        if (selct == 6) {
            ret = this.EnergyDiskName;
        }
        if (selct == 7) {
            ret = this.FinalFlashName;
        }
        if (selct == 8) {
            ret = this.FingerLeserName;
        }
        if (selct == 9) {
            ret = this.GalicGunName;
        }
        if (selct == 10) {
            ret = this.HameName;
        }
        if (selct == 11) {
            ret = this.Hame10xName;
        }
        if (selct == 12) {
            ret = this.MakankoName;
        }
        if (selct == 13) {
            ret = this.MasenkoName;
        }
        if (selct == 14) {
            ret = this.PlanetDestName;
        }
        if (selct == 15) {
            ret = this.SpiritbombName;
        }
        return ret;
    }
}

