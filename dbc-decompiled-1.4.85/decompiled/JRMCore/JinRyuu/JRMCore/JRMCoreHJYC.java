/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JYearsC.JYearsCConfig
 *  JinRyuu.JYearsC.JYearsCItems
 *  JinRyuu.JYearsC.mod_JYearsC
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JYearsCH;
import JinRyuu.JYearsC.JYearsCConfig;
import JinRyuu.JYearsC.JYearsCItems;
import JinRyuu.JYearsC.mod_JYearsC;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;

public class JRMCoreHJYC {
    public static void openGui(int id, EntityPlayer pl) {
        pl.openGui((Object)mod_JYearsC.instance, id, pl.worldObj, (int)pl.posX, (int)pl.posY, (int)pl.posZ);
    }

    public static int JYCgetConfigcpgut() {
        return JYearsCConfig.cpgut;
    }

    public static float JYCAge(EntityPlayer plyr) {
        float yc = 100.0f;
        if (JYearsCH.p != null && JYearsCH.p.length > 0) {
            int id = 0;
            for (String n : JYearsCH.p) {
                String[] m = n.split(";");
                if (plyr.getCommandSenderName().equals(m[0])) {
                    yc = Float.parseFloat(m[1]);
                }
                ++id;
            }
        }
        return yc;
    }

    public static float JYCsizeBasedOnAge(EntityPlayer plyr) {
        boolean ssj4;
        boolean saiOozar;
        int State2;
        float yc = 1.0f;
        if (JYearsCH.p != null && JYearsCH.p.length > 0) {
            for (String n : JYearsCH.p) {
                String[] m = n.split(";");
                if (!plyr.getCommandSenderName().equals(m[0])) continue;
                float A = Float.parseFloat(m[1]);
                float gu = JYearsCConfig.pgut;
                if (A <= 5.0f) {
                    yc = 0.5f;
                }
                if (A > 5.0f && A <= gu) {
                    yc = 0.5f + (A - 5.0f) / (gu - 5.0f) * 0.5f;
                }
                if (A > gu) {
                    yc = 1.0f;
                }
                yc = yc < 0.5531915f ? 0.5531915f : yc;
            }
        }
        String[] state = JRMCoreH.data(plyr.getCommandSenderName(), 2, "0;0").split(";");
        String[] s = JRMCoreH.data(plyr.getCommandSenderName(), 1, "0;0;0;0;0;0").split(";");
        int pwr = Integer.parseInt(s[2]);
        int race = Integer.parseInt(s[0]);
        int n = State2 = pwr == 2 || race == 0 ? 0 : Integer.parseInt(state[0]);
        boolean bl = JRMCoreH.rSai(race) ? State2 == 7 || State2 == 8 : (saiOozar = false);
        boolean bl2 = JRMCoreH.rSai(race) ? State2 == 14 : (ssj4 = false);
        return ssj4 ? 1.0f : (saiOozar ? 1.0f : yc);
    }

    public static void JYCsetConfigpgut(int pgut) {
        JYearsCConfig.pgut = pgut;
    }

    public static Item JYCgetItemWatch() {
        return JYearsCItems.ItemWatch;
    }

    public static int JYCgetConfigpls() {
        return JYearsCConfig.pls;
    }
}

