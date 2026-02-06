/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.config.Configuration
 *  net.minecraftforge.common.config.Property
 */
package JinRyuu.JRMCore.server.config.dbc;

import JinRyuu.JRMCore.server.config.JGConfigBase;
import java.util.HashMap;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class JGConfigDBCInstantTransmission
extends JGConfigBase {
    public static final String CATEGORY_SERVERSIDED_MAIN = "main";
    public static final String CATEGORY_SERVERSIDED_SHORT = "short distance mode only";
    public static final String CATEGORY_SERVERSIDED_LONG = "long distance mode only";
    public static final String CATEGORY_SERVERSIDED_COMMON = "both distance modes";
    public static final String[] TP_MODES = new String[]{"Short Distance Teleportation", "Long Distance Teleportation"};
    public static final String[] SHORT_MODES = new String[]{"To Target", "In-front Target", "Behind Target"};
    public static final String[] SURROUND_MODES = new String[]{"Alone", "Group Members", "All Players"};
    public static final int MAX_LEVELS = 10;
    public static final int SHORT_TP = 0;
    public static final int LONG_TP = 1;
    public static final int FLAT_COST = 0;
    public static final int PERCENTAGE_COST = 1;
    public static boolean CONFIG_INSTANT_TRANSMISSION_NOTIFY_SERVER_ENABLED;
    public static final int MODES = 2;
    public static boolean[] CCONFIG_INSTANT_TRANSMISSION_ENABLED;
    public static boolean[] CONFIG_INSTANT_TRANSMISSION_ENABLED;
    public static byte[] CONFIG_INSTANT_TRANSMISSION_UNLOCK_SKILL_LEVEL;
    public static float[][][] CONFIG_INSTANT_TRANSMISSION_COST;
    public static byte[] CONFIG_INSTANT_TRANSMISSION_KI_SENSE_REQUIREMENT;
    static final int MODES_SHORT = 3;
    public static boolean[] CONFIG_INSTANT_TRANSMISSION_ENABLED_SHORT;
    public static boolean CONFIG_INSTANT_TRANSMISSION_SHORT_GO_THROUGH_BLOCKS_ENABLED;
    public static double CONFIG_INSTANT_TRANSMISSION_SHORT_TARGET_FINDER_RANGE;
    static final int MODES_SURROUND = 3;
    public static boolean[] CONFIG_INSTANT_TRANSMISSION_ENABLED_SURROUND;
    public static int[][] CONFIG_INSTANT_TRANSMISSION_SURROUND_PLAYER_LIMIT_SKILL_LEVEL;
    public static double CONFIG_INSTANT_TRANSMISSION_SURROUND_TARGET_FINDER_RANGE;
    public static float[][] CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER;
    public static boolean CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_TP_ENABLED;
    public static float[][] CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST;
    public static HashMap<Integer, Boolean> CONFIG_INSTANT_TRANSMISSION_DIMENSION_BLACKLIST;
    public static int[] CONFIG_INSTANT_TRANSMISSION_SHORT_MAX_RANGE;
    public static int[][] CONFIG_INSTANT_TRANSMISSION_COOLDOWN;
    public static boolean[] CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_RELEASE_SENSE_REQUIRED_ENABLED;

    public static void init(Configuration config) {
        config.load();
        JGConfigDBCInstantTransmission.init_instantTransmission(config);
        config.save();
    }

    private static void init_instantTransmission(Configuration config) {
        String line;
        int j;
        String[] data;
        String[] defaultStringArray;
        int max;
        int min;
        Property property;
        String description;
        String title;
        boolean defaultB;
        int i;
        String name = "";
        String nameShort = "Short Distance";
        String nameLong = "Long Distance";
        String CATEGORY = CATEGORY_SERVERSIDED_MAIN;
        String percentage = " (Percentage)";
        String warning = " Change only to your own responsibility! Having too high multiplier will cause glitches!";
        String server = "Server Sided!";
        String[] titles = TP_MODES;
        for (i = 0; i < 2; ++i) {
            String[] stringArray;
            String[] stringArray2;
            String line2;
            int j2;
            String[] stringArray3;
            String modeName = i == 0 ? "Short Distance" : "Long Distance";
            defaultB = true;
            title = "Teleport Mode: '" + modeName + "' Enabled";
            description = "(true = Enabled, false = Disabled) (Default: " + defaultB + ")";
            property = config.get(CATEGORY, "" + title, defaultB);
            property.comment = "Server Sided! " + description;
            JGConfigDBCInstantTransmission.CCONFIG_INSTANT_TRANSMISSION_ENABLED[i] = property.getBoolean();
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_ENABLED[i] = CCONFIG_INSTANT_TRANSMISSION_ENABLED[i];
            defaultB = true;
            title = "Teleport Mode: '" + modeName + "' Release Level Required Enabled";
            description = "Teleport player targets must have a release level above 0%. (true = Enabled, false = Disabled) (Default: " + defaultB + ")";
            property = config.get(CATEGORY, "" + title, defaultB);
            property.comment = "Server Sided! " + description;
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_RELEASE_SENSE_REQUIRED_ENABLED[i] = property.getBoolean();
            min = 1;
            max = 10;
            title = "Teleport Mode: '" + modeName + "' Unlock level";
            description = "Set which Instant Transmission Skill Level unlocks this Mode" + JGConfigDBCInstantTransmission.getDefault("" + min, "" + max);
            property = config.get(CATEGORY, title, 1);
            property.comment = "Server Sided! " + description;
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_UNLOCK_SKILL_LEVEL[i] = (byte)property.getInt();
            if (CONFIG_INSTANT_TRANSMISSION_UNLOCK_SKILL_LEVEL[i] < min) {
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_UNLOCK_SKILL_LEVEL[i] = (byte)min;
            } else if (CONFIG_INSTANT_TRANSMISSION_UNLOCK_SKILL_LEVEL[i] > max) {
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_UNLOCK_SKILL_LEVEL[i] = (byte)max;
            }
            min = 0;
            max = 1000000000;
            if (i == 0) {
                String[] stringArray4 = new String[10];
                stringArray4[0] = "500 9.5";
                stringArray4[1] = "500 9";
                stringArray4[2] = "500 8.5";
                stringArray4[3] = "500 8";
                stringArray4[4] = "500 7.5";
                stringArray4[5] = "500 7";
                stringArray4[6] = "500 6.5";
                stringArray4[7] = "500 6";
                stringArray4[8] = "500 5.5";
                stringArray3 = stringArray4;
                stringArray4[9] = "500 5";
            } else {
                String[] stringArray5 = new String[10];
                stringArray5[0] = "500 9.5";
                stringArray5[1] = "500 9";
                stringArray5[2] = "500 8.5";
                stringArray5[3] = "500 8";
                stringArray5[4] = "500 7.5";
                stringArray5[5] = "500 7";
                stringArray5[6] = "500 6.5";
                stringArray5[7] = "500 6";
                stringArray5[8] = "500 5.5";
                stringArray3 = stringArray5;
                stringArray5[9] = "500 5";
            }
            defaultStringArray = stringArray3;
            title = "Teleport Mode: '" + modeName + "' Ki Cost";
            description = "Set the Ki Cost of using the Skill per level (FlatCost PercentageCost)" + JGConfigDBCInstantTransmission.getDefault("" + min, "" + max);
            property = config.get(CATEGORY, title, defaultStringArray, "Server Sided! " + description);
            data = property.getStringList();
            for (j2 = 0; j2 < 10; ++j2) {
                line2 = data[j2];
                String[] values = line2.split(" ");
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COST[i][0][j2] = Float.parseFloat(values[0]);
                if (CONFIG_INSTANT_TRANSMISSION_COST[i][0][j2] < (float)min) {
                    JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COST[i][0][j2] = min;
                } else if (CONFIG_INSTANT_TRANSMISSION_COST[i][0][j2] > (float)max) {
                    JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COST[i][0][j2] = max;
                }
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COST[i][1][j2] = Float.parseFloat(values[1]);
                if (CONFIG_INSTANT_TRANSMISSION_COST[i][1][j2] < (float)min) {
                    JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COST[i][1][j2] = min;
                    continue;
                }
                if (!(CONFIG_INSTANT_TRANSMISSION_COST[i][1][j2] > (float)max)) continue;
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COST[i][1][j2] = max;
            }
            min = -1;
            max = 1000000000;
            if (i == 0) {
                String[] stringArray6 = new String[10];
                stringArray6[0] = "0";
                stringArray6[1] = "1";
                stringArray6[2] = "2";
                stringArray6[3] = "4";
                stringArray6[4] = "6";
                stringArray6[5] = "9";
                stringArray6[6] = "12";
                stringArray6[7] = "16";
                stringArray6[8] = "20";
                stringArray2 = stringArray6;
                stringArray6[9] = "25";
            } else {
                String[] stringArray7 = new String[10];
                stringArray7[0] = "0";
                stringArray7[1] = "1";
                stringArray7[2] = "2";
                stringArray7[3] = "4";
                stringArray7[4] = "6";
                stringArray7[5] = "9";
                stringArray7[6] = "12";
                stringArray7[7] = "16";
                stringArray7[8] = "20";
                stringArray2 = stringArray7;
                stringArray7[9] = "25";
            }
            defaultStringArray = stringArray2;
            title = "Teleport Mode: '" + modeName + "' 'Surround' Player Limit";
            description = "Set the MAX number of Nearby Players the 'Surround' Mode can Teleport with the user per level. (-1 = No Limit)" + JGConfigDBCInstantTransmission.getDefault("" + min, "" + max);
            property = config.get(CATEGORY, title, defaultStringArray, "Server Sided! " + description);
            data = property.getStringList();
            for (j2 = 0; j2 < 10; ++j2) {
                line2 = data[j2];
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_PLAYER_LIMIT_SKILL_LEVEL[i][j2] = Integer.parseInt(line2);
                if (CONFIG_INSTANT_TRANSMISSION_SURROUND_PLAYER_LIMIT_SKILL_LEVEL[i][j2] < min) {
                    JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_PLAYER_LIMIT_SKILL_LEVEL[i][j2] = min;
                    continue;
                }
                if (CONFIG_INSTANT_TRANSMISSION_SURROUND_PLAYER_LIMIT_SKILL_LEVEL[i][j2] <= max) continue;
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_PLAYER_LIMIT_SKILL_LEVEL[i][j2] = max;
            }
            min = 0;
            max = 9;
            title = "Teleport Mode: '" + modeName + "' Ki Sense Skill Level Requirement";
            description = "Required level of Ki Sense in order to this teleportation mode" + JGConfigDBCInstantTransmission.getDefault("" + min, "" + max);
            property = config.get(CATEGORY, title, i == 0 ? 1 : 3, "Server Sided! " + description);
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_KI_SENSE_REQUIREMENT[i] = (byte)property.getInt();
            if (CONFIG_INSTANT_TRANSMISSION_KI_SENSE_REQUIREMENT[i] < min) {
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_KI_SENSE_REQUIREMENT[i] = (byte)min;
            } else if (CONFIG_INSTANT_TRANSMISSION_KI_SENSE_REQUIREMENT[i] > max) {
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_KI_SENSE_REQUIREMENT[i] = (byte)max;
            }
            min = 0;
            max = 1000000000;
            if (i == 0) {
                String[] stringArray8 = new String[10];
                stringArray8[0] = "2";
                stringArray8[1] = "2";
                stringArray8[2] = "2";
                stringArray8[3] = "2";
                stringArray8[4] = "1";
                stringArray8[5] = "1";
                stringArray8[6] = "1";
                stringArray8[7] = "1";
                stringArray8[8] = "0";
                stringArray = stringArray8;
                stringArray8[9] = "0";
            } else {
                String[] stringArray9 = new String[10];
                stringArray9[0] = "12";
                stringArray9[1] = "11";
                stringArray9[2] = "10";
                stringArray9[3] = "9";
                stringArray9[4] = "8";
                stringArray9[5] = "7";
                stringArray9[6] = "6";
                stringArray9[7] = "5";
                stringArray9[8] = "4";
                stringArray = stringArray9;
                stringArray9[9] = "3";
            }
            defaultStringArray = stringArray;
            title = "Teleport Mode: '" + modeName + "' Cooldown";
            description = "Cooldown timer. Result is ConfigValue multiplied by 5 Seconds! Timer until the Skill can be used again" + JGConfigDBCInstantTransmission.getDefault("" + min, "" + max);
            property = config.get(CATEGORY, title, defaultStringArray, "Server Sided! " + description);
            data = property.getStringList();
            for (j2 = 0; j2 < 10; ++j2) {
                line2 = data[j2];
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COOLDOWN[i][j2] = Integer.parseInt(line2);
                if (CONFIG_INSTANT_TRANSMISSION_COOLDOWN[i][j2] < min) {
                    JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COOLDOWN[i][j2] = min;
                    continue;
                }
                if (CONFIG_INSTANT_TRANSMISSION_COOLDOWN[i][j2] <= max) continue;
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_COOLDOWN[i][j2] = max;
            }
        }
        CATEGORY = CATEGORY_SERVERSIDED_LONG;
        defaultB = false;
        title = "Long Teleport Mode: Notify Server if someone Teleported Enabled";
        description = "(true = Enabled, false = Disabled) (Default: " + defaultB + ")";
        property = config.get(CATEGORY, "" + title, defaultB);
        property.comment = "Server Sided! " + description;
        CONFIG_INSTANT_TRANSMISSION_NOTIFY_SERVER_ENABLED = property.getBoolean();
        defaultB = true;
        title = "Long Teleport Mode: Dimensional Teleport Enabled";
        description = "(true = Enabled, false = Disabled) (Default: " + defaultB + ")";
        property = config.get(CATEGORY, "" + title, defaultB);
        property.comment = "Server Sided! " + description;
        CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_TP_ENABLED = property.getBoolean();
        min = 0;
        max = 1000000000;
        defaultStringArray = new String[]{"500 9.5", "500 9", "500 8.5", "500 8", "500 7.5", "500 7", "500 6.5", "500 6", "500 5.5", "500 5"};
        title = "Long Teleport Mode: Dimensional Teleport Ki Cost";
        description = "Set the Ki Cost of using the Skill per level (FlatCost PercentageCost)" + JGConfigDBCInstantTransmission.getDefault("" + min, "" + max);
        property = config.get(CATEGORY, title, defaultStringArray, "Server Sided! " + description);
        data = property.getStringList();
        for (j = 0; j < 10; ++j) {
            line = data[j];
            String[] values = line.split(" ");
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[0][j] = Float.parseFloat(values[0]);
            if (CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[0][j] < (float)min) {
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[0][j] = min;
            } else if (CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[0][j] > (float)max) {
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[0][j] = max;
            }
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[1][j] = Float.parseFloat(values[1]);
            if (CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[1][j] < (float)min) {
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[1][j] = min;
                continue;
            }
            if (!(CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[1][j] > (float)max)) continue;
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST[1][j] = max;
        }
        min = 0;
        max = 1000000000;
        defaultStringArray = new String[]{""};
        title = "Long Teleport Mode: Dimensional Blacklist";
        description = "List of Dimension IDs where you can't use OR go into with Dimensional Teleportation.";
        property = config.get(CATEGORY, title, defaultStringArray, "Server Sided! " + description);
        data = property.getStringList();
        for (j = 0; j < data.length; ++j) {
            line = data[j];
            if (line == null || line.length() <= 0) continue;
            int value = Integer.parseInt(line);
            if (value < min) {
                value = min;
            } else if (value > max) {
                value = max;
            }
            CONFIG_INSTANT_TRANSMISSION_DIMENSION_BLACKLIST.put(value, true);
        }
        CATEGORY = CATEGORY_SERVERSIDED_SHORT;
        defaultB = true;
        title = "Short Teleport Mode: Target Finder can go through blocks Enabled";
        description = "(true = Enabled, false = Disabled) (Default: " + defaultB + ")";
        property = config.get(CATEGORY, "" + title, defaultB);
        property.comment = "Server Sided! " + description;
        CONFIG_INSTANT_TRANSMISSION_SHORT_GO_THROUGH_BLOCKS_ENABLED = property.getBoolean();
        min = 0;
        max = 1000;
        title = "Short Teleport Mode: Target Finder Range per Update";
        description = "Block Radius around Target Finder. (Higher number = More Lagg)" + JGConfigDBCInstantTransmission.getDefault("" + min, "" + max);
        property = config.get(CATEGORY, "" + title, 1);
        property.comment = "Server Sided! " + description;
        CONFIG_INSTANT_TRANSMISSION_SHORT_TARGET_FINDER_RANGE = property.getDouble();
        if (CONFIG_INSTANT_TRANSMISSION_SHORT_TARGET_FINDER_RANGE < (double)min) {
            CONFIG_INSTANT_TRANSMISSION_SHORT_TARGET_FINDER_RANGE = min;
        } else if (CONFIG_INSTANT_TRANSMISSION_SHORT_TARGET_FINDER_RANGE > (double)max) {
            CONFIG_INSTANT_TRANSMISSION_SHORT_TARGET_FINDER_RANGE = max;
        }
        min = 0;
        max = 1000000;
        defaultStringArray = new String[]{"55", "60", "65", "70", "75", "80", "85", "90", "95", "100"};
        title = "Short Teleport Mode: Target Finder Distance Range";
        description = "(Higher number = More Lagg)" + JGConfigDBCInstantTransmission.getDefault("" + min, "" + max);
        property = config.get(CATEGORY, title, defaultStringArray, "Server Sided! " + description);
        data = property.getStringList();
        for (j = 0; j < 10; ++j) {
            line = data[j];
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SHORT_MAX_RANGE[j] = Integer.parseInt(line);
            if (CONFIG_INSTANT_TRANSMISSION_SHORT_MAX_RANGE[j] < min) {
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SHORT_MAX_RANGE[j] = min;
                continue;
            }
            if (CONFIG_INSTANT_TRANSMISSION_SHORT_MAX_RANGE[j] <= max) continue;
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SHORT_MAX_RANGE[j] = max;
        }
        titles = SHORT_MODES;
        for (i = 0; i < 3; ++i) {
            defaultB = true;
            title = "Short Teleport Mode: '" + titles[i] + "' Enabled";
            description = "(true = Enabled, false = Disabled) (Default: " + defaultB + ")";
            property = config.get(CATEGORY, "" + title, defaultB);
            property.comment = "Server Sided! " + description;
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_ENABLED_SHORT[i] = property.getBoolean();
        }
        CATEGORY = CATEGORY_SERVERSIDED_COMMON;
        titles = SURROUND_MODES;
        for (i = 0; i < 3; ++i) {
            defaultB = true;
            title = "Surround Teleport Mode: '" + titles[i] + "' Enabled";
            description = "(true = Enabled, false = Disabled) (Default: " + defaultB + ")";
            property = config.get(CATEGORY, "" + title, defaultB);
            property.comment = "Server Sided! " + description;
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_ENABLED_SURROUND[i] = property.getBoolean();
        }
        min = 0;
        max = 1000000000;
        defaultStringArray = new String[]{"50 0.275", "50 0.25", "50 0.225", "50 0.2", "50 0.175", "50 0.15", "50 0.125", "50 0.1", "50 0.075", "50 0.05"};
        title = "Surround Teleport Mode: Ki Cost per Player";
        description = "Set the Ki Cost of using the Skill per level (FlatCost PercentageCost)" + JGConfigDBCInstantTransmission.getDefault("" + min, "" + max);
        property = config.get(CATEGORY, title, defaultStringArray, "Server Sided! " + description);
        data = property.getStringList();
        for (j = 0; j < 10; ++j) {
            line = data[j];
            String[] values = line.split(" ");
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[0][j] = Float.parseFloat(values[0]);
            if (CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[0][j] < (float)min) {
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[0][j] = min;
            } else if (CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[0][j] > (float)max) {
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[0][j] = max;
            }
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[1][j] = Float.parseFloat(values[1]);
            if (CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[1][j] < (float)min) {
                JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[1][j] = min;
                continue;
            }
            if (!(CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[1][j] > (float)max)) continue;
            JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER[1][j] = max;
        }
        min = 0;
        max = 1000;
        title = "Surround Teleport Mode: Target(s) Finder Range";
        description = "Block Radius around Target(s) Finder. (Higher number = More Lagg)" + JGConfigDBCInstantTransmission.getDefault("" + min, "" + max);
        property = config.get(CATEGORY, "" + title, 3);
        property.comment = "Server Sided! " + description;
        CONFIG_INSTANT_TRANSMISSION_SURROUND_TARGET_FINDER_RANGE = property.getDouble();
        if (CONFIG_INSTANT_TRANSMISSION_SURROUND_TARGET_FINDER_RANGE < (double)min) {
            CONFIG_INSTANT_TRANSMISSION_SURROUND_TARGET_FINDER_RANGE = min;
        } else if (CONFIG_INSTANT_TRANSMISSION_SURROUND_TARGET_FINDER_RANGE > (double)max) {
            CONFIG_INSTANT_TRANSMISSION_SURROUND_TARGET_FINDER_RANGE = max;
        }
    }

    static {
        CCONFIG_INSTANT_TRANSMISSION_ENABLED = new boolean[2];
        CONFIG_INSTANT_TRANSMISSION_ENABLED = new boolean[2];
        CONFIG_INSTANT_TRANSMISSION_UNLOCK_SKILL_LEVEL = new byte[2];
        CONFIG_INSTANT_TRANSMISSION_COST = new float[2][2][10];
        CONFIG_INSTANT_TRANSMISSION_KI_SENSE_REQUIREMENT = new byte[2];
        CONFIG_INSTANT_TRANSMISSION_ENABLED_SHORT = new boolean[3];
        CONFIG_INSTANT_TRANSMISSION_ENABLED_SURROUND = new boolean[3];
        CONFIG_INSTANT_TRANSMISSION_SURROUND_PLAYER_LIMIT_SKILL_LEVEL = new int[2][10];
        CONFIG_INSTANT_TRANSMISSION_SURROUND_COST_PER_PLAYER = new float[2][10];
        CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_COST = new float[2][10];
        CONFIG_INSTANT_TRANSMISSION_DIMENSION_BLACKLIST = new HashMap();
        CONFIG_INSTANT_TRANSMISSION_SHORT_MAX_RANGE = new int[10];
        CONFIG_INSTANT_TRANSMISSION_COOLDOWN = new int[2][10];
        CONFIG_INSTANT_TRANSMISSION_DIMENSIONAL_RELEASE_SENSE_REQUIRED_ENABLED = new boolean[2];
    }
}

