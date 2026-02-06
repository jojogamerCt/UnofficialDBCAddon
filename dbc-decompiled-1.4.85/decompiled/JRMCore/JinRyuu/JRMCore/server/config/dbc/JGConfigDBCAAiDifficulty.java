/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.config.Configuration
 *  net.minecraftforge.common.config.Property
 */
package JinRyuu.JRMCore.server.config.dbc;

import JinRyuu.JRMCore.server.config.JGConfigBase;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class JGConfigDBCAAiDifficulty
extends JGConfigBase {
    public static final String[] DIFFICULTIES = new String[]{"Easy", "Medium", "Hard", "Insane"};
    public static final String[] AAIs = new String[]{"Ground Dash", "Jump", "Flying Dash", "Ki Attack Charge", "Teleport"};
    public static double[] SpeedMulti = new double[DIFFICULTIES.length];
    public static double[] GroundDashSpeedMulti = new double[DIFFICULTIES.length];
    public static double[] GroundDashSpeedMulti2 = new double[DIFFICULTIES.length];
    public static double[] GroundDashLimit = new double[DIFFICULTIES.length];
    public static double[] JumpMulti = new double[DIFFICULTIES.length];
    public static double[] JumpMulti2 = new double[DIFFICULTIES.length];
    public static double[] JumpLimit = new double[DIFFICULTIES.length];
    public static double[] JumpLimit2 = new double[DIFFICULTIES.length];
    public static double[] JumpRate = new double[DIFFICULTIES.length];
    public static double[] FlyingDashMulti = new double[DIFFICULTIES.length];
    public static double[] FlyingDashLimit = new double[DIFFICULTIES.length];
    public static double[] KiAttackChargeMulti = new double[DIFFICULTIES.length];
    public static double[] KiAttackChargeLimit = new double[DIFFICULTIES.length];
    public static int[] TeleportRateMin = new int[DIFFICULTIES.length];
    public static int[] TeleportRateMax = new int[DIFFICULTIES.length];
    public static double[] cSpeedMulti = new double[DIFFICULTIES.length];
    public static double[] cGroundDashSpeedMulti = new double[DIFFICULTIES.length];
    public static double[] cGroundDashSpeedMulti2 = new double[DIFFICULTIES.length];
    public static double[] cGroundDashLimit = new double[DIFFICULTIES.length];
    public static double[] cJumpMulti = new double[DIFFICULTIES.length];
    public static double[] cJumpMulti2 = new double[DIFFICULTIES.length];
    public static double[] cJumpLimit = new double[DIFFICULTIES.length];
    public static double[] cJumpLimit2 = new double[DIFFICULTIES.length];
    public static double[] cJumpRate = new double[DIFFICULTIES.length];
    public static double[] cFlyingDashMulti = new double[DIFFICULTIES.length];
    public static double[] cFlyingDashLimit = new double[DIFFICULTIES.length];
    public static double[] cKiAttackChargeMulti = new double[DIFFICULTIES.length];
    public static double[] cKiAttackChargeLimit = new double[DIFFICULTIES.length];
    public static int[] cTeleportRateMin = new int[DIFFICULTIES.length];
    public static int[] cTeleportRateMax = new int[DIFFICULTIES.length];

    public static void init(Configuration config, byte difficultyID) {
        config.load();
        JGConfigDBCAAiDifficulty.init_difficulty(config, difficultyID);
        config.save();
    }

    private static void init_difficulty(Configuration config, byte difficultyID) {
        String name = "DBC " + DIFFICULTIES[difficultyID];
        String percentage = " (Percentage)";
        String server = "Server Sided! ";
        String CATEGORY = "Main Settings";
        int min = 0;
        int max = 10000;
        String title = CATEGORY + " Speed Multiplier";
        Property property = config.get(CATEGORY, title, (new double[]{-1.0, 1.3, 1.8, 2.3})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cSpeedMulti[difficultyID] = property.getDouble();
        if (cSpeedMulti[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cSpeedMulti[difficultyID] = min;
        } else if (cSpeedMulti[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cSpeedMulti[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.SpeedMulti[difficultyID] = cSpeedMulti[difficultyID];
        CATEGORY = AAIs[0];
        min = 0;
        max = 10000;
        title = CATEGORY + " Speed Multiplier";
        property = config.get(CATEGORY, title, (new double[]{1.2, 1.3, 1.4, 1.5})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cGroundDashSpeedMulti[difficultyID] = property.getDouble();
        if (cGroundDashSpeedMulti[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cGroundDashSpeedMulti[difficultyID] = min;
        } else if (cGroundDashSpeedMulti[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cGroundDashSpeedMulti[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.GroundDashSpeedMulti[difficultyID] = cGroundDashSpeedMulti[difficultyID];
        min = 0;
        max = 10000;
        title = CATEGORY + " Position Difference Speed Multiplier";
        property = config.get(CATEGORY, title, (new double[]{0.3, 0.4, 0.5, 0.8})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cGroundDashSpeedMulti2[difficultyID] = property.getDouble();
        if (cGroundDashSpeedMulti2[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cGroundDashSpeedMulti2[difficultyID] = min;
        } else if (cGroundDashSpeedMulti2[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cGroundDashSpeedMulti2[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.GroundDashSpeedMulti2[difficultyID] = cGroundDashSpeedMulti2[difficultyID];
        min = 0;
        max = 10000;
        title = CATEGORY + " Speed Limit";
        property = config.get(CATEGORY, title, (new double[]{0.2, 0.3, 0.4, 0.5})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cGroundDashLimit[difficultyID] = property.getDouble();
        if (cGroundDashLimit[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cGroundDashLimit[difficultyID] = min;
        } else if (cGroundDashLimit[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cGroundDashLimit[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.GroundDashLimit[difficultyID] = cGroundDashLimit[difficultyID];
        CATEGORY = AAIs[1];
        min = 0;
        max = 10000;
        title = CATEGORY + " Upwards Multiplier";
        property = config.get(CATEGORY, title, (new double[]{0.9, 0.9, 0.9, 0.9})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cJumpMulti[difficultyID] = property.getDouble();
        if (cJumpMulti[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cJumpMulti[difficultyID] = min;
        } else if (cJumpMulti[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cJumpMulti[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.JumpMulti[difficultyID] = cJumpMulti[difficultyID];
        min = 0;
        max = 10000;
        title = CATEGORY + " Sideways Multiplier";
        property = config.get(CATEGORY, title, (new double[]{0.5, 0.8, 1.0, 1.2})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cJumpMulti2[difficultyID] = property.getDouble();
        if (cJumpMulti2[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cJumpMulti2[difficultyID] = min;
        } else if (cJumpMulti2[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cJumpMulti2[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.JumpMulti2[difficultyID] = cJumpMulti2[difficultyID];
        min = 0;
        max = 10000;
        title = CATEGORY + " Sideways Limit";
        property = config.get(CATEGORY, title, (new double[]{2.5, 4.0, -1.0, -1.0})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cJumpLimit[difficultyID] = property.getDouble();
        if (cJumpLimit[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cJumpLimit[difficultyID] = min;
        } else if (cJumpLimit[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cJumpLimit[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.JumpLimit[difficultyID] = cJumpLimit[difficultyID];
        min = 0;
        max = 10000;
        title = CATEGORY + " Upwards Limit";
        property = config.get(CATEGORY, title, (new double[]{2.0, 3.0, 7.0, 7.0})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cJumpLimit2[difficultyID] = property.getDouble();
        if (cJumpLimit2[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cJumpLimit2[difficultyID] = min;
        } else if (cJumpLimit2[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cJumpLimit2[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.JumpLimit2[difficultyID] = cJumpLimit2[difficultyID];
        min = 0;
        max = 10000;
        title = CATEGORY + " Rate";
        property = config.get(CATEGORY, title, (new double[]{0.6, 0.8, 0.9, 0.9})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cJumpRate[difficultyID] = property.getDouble();
        if (cJumpRate[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cJumpRate[difficultyID] = min;
        } else if (cJumpRate[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cJumpRate[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.JumpRate[difficultyID] = cJumpRate[difficultyID];
        CATEGORY = AAIs[2];
        min = 0;
        max = 10000;
        title = CATEGORY + " Speed Multiplier";
        property = config.get(CATEGORY, title, (new double[]{1.0, 2.0, 4.0, 6.0})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cFlyingDashMulti[difficultyID] = property.getDouble();
        if (cFlyingDashMulti[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cFlyingDashMulti[difficultyID] = min;
        } else if (cFlyingDashMulti[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cFlyingDashMulti[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.FlyingDashMulti[difficultyID] = cFlyingDashMulti[difficultyID];
        min = 0;
        max = 10000;
        title = CATEGORY + " Speed Limit";
        property = config.get(CATEGORY, title, (new double[]{0.15, 0.2, 0.8, 1.0})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cFlyingDashLimit[difficultyID] = property.getDouble();
        if (cFlyingDashLimit[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cFlyingDashLimit[difficultyID] = min;
        } else if (cFlyingDashLimit[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cFlyingDashLimit[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.FlyingDashLimit[difficultyID] = cFlyingDashLimit[difficultyID];
        CATEGORY = AAIs[3];
        min = 0;
        max = 10000;
        title = CATEGORY + " Runaway Speed Multiplier";
        property = config.get(CATEGORY, title, (new double[]{0.6, 0.7, 0.9, 1.1})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cKiAttackChargeMulti[difficultyID] = property.getDouble();
        if (cKiAttackChargeMulti[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cKiAttackChargeMulti[difficultyID] = min;
        } else if (cKiAttackChargeMulti[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cKiAttackChargeMulti[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.KiAttackChargeMulti[difficultyID] = cKiAttackChargeMulti[difficultyID];
        min = 0;
        max = 10000;
        title = CATEGORY + " Runaway Speed Limit";
        property = config.get(CATEGORY, title, (new double[]{0.2, 0.4, 0.7, 1.0})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cKiAttackChargeLimit[difficultyID] = property.getDouble();
        if (cKiAttackChargeLimit[difficultyID] < (double)min) {
            JGConfigDBCAAiDifficulty.cKiAttackChargeLimit[difficultyID] = min;
        } else if (cKiAttackChargeLimit[difficultyID] > (double)max) {
            JGConfigDBCAAiDifficulty.cKiAttackChargeLimit[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.KiAttackChargeLimit[difficultyID] = cKiAttackChargeLimit[difficultyID];
        CATEGORY = AAIs[4];
        min = 0;
        max = 10000;
        title = CATEGORY + " Minimum Rate";
        property = config.get(CATEGORY, title, (new int[]{120, 100, 90, 75})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cTeleportRateMin[difficultyID] = property.getInt();
        if (cTeleportRateMin[difficultyID] < min) {
            JGConfigDBCAAiDifficulty.cTeleportRateMin[difficultyID] = min;
        } else if (cTeleportRateMin[difficultyID] > max) {
            JGConfigDBCAAiDifficulty.cTeleportRateMin[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.TeleportRateMin[difficultyID] = cTeleportRateMin[difficultyID];
        min = 0;
        max = 10000;
        title = CATEGORY + " Maximum Rate";
        property = config.get(CATEGORY, title, (new int[]{50, 50, 45, 45})[difficultyID]);
        property.comment = "Server Sided! " + title + JGConfigDBCAAiDifficulty.getDefault("" + min, "" + max);
        JGConfigDBCAAiDifficulty.cTeleportRateMax[difficultyID] = property.getInt();
        if (cTeleportRateMax[difficultyID] < min) {
            JGConfigDBCAAiDifficulty.cTeleportRateMax[difficultyID] = min;
        } else if (cTeleportRateMax[difficultyID] > max) {
            JGConfigDBCAAiDifficulty.cTeleportRateMax[difficultyID] = max;
        }
        JGConfigDBCAAiDifficulty.TeleportRateMax[difficultyID] = cTeleportRateMax[difficultyID];
    }
}

