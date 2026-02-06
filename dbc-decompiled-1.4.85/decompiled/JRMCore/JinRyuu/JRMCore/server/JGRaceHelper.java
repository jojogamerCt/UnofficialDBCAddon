/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTTagCompound
 */
package JinRyuu.JRMCore.server;

import JinRyuu.JRMCore.JRMCoreH;
import net.minecraft.nbt.NBTTagCompound;

public class JGRaceHelper {
    public static int[][] RACIAL_SKILL_MAX = new int[][]{{0, 0, 0, 0, 0, 0, 0}, {5, 7, 7, 5, 6, 5, 5}, {9, 9, 9, 9, 9, 9, 9}, {0, 0, 0, 0, 0, 0, 0}};

    public static boolean isAboveMaxRacialSkill(byte current, boolean dbc, boolean nc, byte race) {
        return current > JGRaceHelper.getMaxRacialSkillLevel(dbc, nc, race);
    }

    public static boolean isAboveMaxRacialSkill(NBTTagCompound nbt) {
        byte max;
        byte current = JGRaceHelper.getRacialSkillLevel(nbt);
        return current > (max = JGRaceHelper.getMaxRacialSkillLevel(nbt));
    }

    public static byte getRacialSkillLevel(NBTTagCompound nbt) {
        String key;
        boolean dbc = nbt.getByte("jrmcPwrtyp") == 1;
        boolean nc = nbt.getByte("jrmcPwrtyp") == 2;
        byte race = nbt.getByte("jrmcRace");
        boolean currentLevel = false;
        String string = key = dbc ? "jrmcSSltX" : "jrmcSSltY";
        if (nbt.hasKey(key) && !nbt.getString(key).contains("pty") && nbt.getString(key).length() > 1 && (!nc || !nbt.getString("jrmcSSltY").contains("Sai") && race != 1 && race != 2)) {
            return Byte.parseByte(nbt.getString(key).substring(2));
        }
        return -1;
    }

    public static byte getMaxRacialSkillLevel(NBTTagCompound nbt) {
        boolean dbc = nbt.getByte("jrmcPwrtyp") == 1;
        boolean nc = nbt.getByte("jrmcPwrtyp") == 2;
        byte race = nbt.getByte("jrmcRace");
        return JGRaceHelper.getMaxRacialSkillLevel(dbc, nc, race);
    }

    public static byte getMaxRacialSkillLevel(boolean dbc, boolean nc, byte race) {
        if (dbc) {
            if (JRMCoreH.rSai(race)) {
                return 7;
            }
            if (JRMCoreH.isRaceArcosian(race)) {
                return 6;
            }
            return 5;
        }
        if (nc) {
            return 9;
        }
        return 0;
    }

    public static void setRacialSkillToMax(NBTTagCompound nbt) {
        boolean dbc = nbt.getByte("jrmcPwrtyp") == 1;
        boolean nc = nbt.getByte("jrmcPwrtyp") == 2;
        byte race = nbt.getByte("jrmcRace");
        JGRaceHelper.setRacialSkill(nbt, JGRaceHelper.getMaxRacialSkillLevel(dbc, nc, race), dbc, nc, race);
    }

    public static void setRacialSkill(NBTTagCompound nbt, byte value) {
        boolean dbc = nbt.getByte("jrmcPwrtyp") == 1;
        boolean nc = nbt.getByte("jrmcPwrtyp") == 2;
        byte race = nbt.getByte("jrmcRace");
        JGRaceHelper.setRacialSkill(nbt, value, dbc, nc, race);
    }

    public static void setRacialSkill(NBTTagCompound nbt, byte value, boolean dbc, boolean nc, byte race) {
        if (dbc || nc) {
            String key = dbc ? "jrmcSSltX" : "jrmcSSltY";
            nbt.setString(key, (dbc ? JRMCoreH.vlblRSkls[0] : JRMCoreH.ncCSkls[nbt.getByte("jrmcClass")]) + value);
        }
    }
}

