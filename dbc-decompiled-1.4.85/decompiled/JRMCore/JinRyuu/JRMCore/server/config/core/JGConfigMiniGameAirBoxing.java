/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.config.Configuration
 *  net.minecraftforge.common.config.Property
 */
package JinRyuu.JRMCore.server.config.core;

import JinRyuu.JRMCore.server.config.JGConfigBase;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class JGConfigMiniGameAirBoxing
extends JGConfigBase {
    public static final String CATEGORY_MINIGAME_SERVERSIDED = "MiniGame";
    public static final String CATEGORY_MINIGAME_AIRBOXING_SERVERSIDED = "MiniGame AirBoxing";
    public static final String CATEGORY_MINIGAME_MODE_SERVERSIDED = "MiniGame Mode";
    public static boolean TPGainOn;
    public static boolean cTPGainOn;
    public static float TPlimitIncreasesWithPlayerLevel;
    public static float cTPlimitIncreasesWithPlayerLevel;
    public static float TPMultiplier;
    public static float cTPMultiplier;
    public static int TPDailyLimit;
    public static int cTPDailyLimit;
    public static final int MODES = 4;
    public static int StartLife;
    public static int cStartLife;
    public static float[] KeySpawnSpeed;
    public static float[] cKeySpawnSpeed;
    public static float[] KeySpeed;
    public static float[] cKeySpeed;
    public static int[] KeyLifeTaken;
    public static int[] cKeyLifeTaken;
    public static int[][] KeyTypeIDs;
    public static int[][] cKeyTypeIDs;

    public static void init(Configuration config) {
        config.load();
        JGConfigMiniGameAirBoxing.init_minigame(config);
        config.save();
    }

    private static void init_minigame(Configuration config) {
        String name = "";
        String CATEGORY = CATEGORY_MINIGAME_AIRBOXING_SERVERSIDED;
        String percentage = " (Percentage)";
        String SERVERSIDE = "Server Sided! ";
        String defaultValue = ". (true).";
        String title = "TP Gain On";
        String description = "If 'true' then from this minigame the TP gain feature will be enabled, if 'false' then players can't earn TP";
        Property property = config.get(CATEGORY, "" + title, true);
        property.comment = "Server Sided! " + description + defaultValue;
        TPGainOn = cTPGainOn = property.getBoolean();
        int min = 0;
        int max = 100000;
        defaultValue = "" + JGConfigMiniGameAirBoxing.getDefault("" + min, "" + max);
        title = "TP Limit Increases With Player Level Multiplier";
        description = "If value is above 0 then the minigame's TP daily limit will increase based on the player's level multiplied with the config. Setting it to 0 disables this";
        property = config.get(CATEGORY, "" + title, 1.0);
        property.comment = "Server Sided! " + description + defaultValue;
        cTPlimitIncreasesWithPlayerLevel = (float)property.getDouble();
        if (cTPlimitIncreasesWithPlayerLevel < (float)min) {
            cTPlimitIncreasesWithPlayerLevel = min;
        } else if (cTPlimitIncreasesWithPlayerLevel > (float)max) {
            cTPlimitIncreasesWithPlayerLevel = max;
        }
        TPlimitIncreasesWithPlayerLevel = cTPlimitIncreasesWithPlayerLevel;
        min = 0;
        max = 100000;
        defaultValue = "" + JGConfigMiniGameAirBoxing.getDefault("" + min, "" + max);
        title = "TP Multiplier";
        description = "TP gain reward multiplier";
        property = config.get(CATEGORY, "" + title, 0.035);
        property.comment = "Server Sided! " + description + defaultValue;
        cTPMultiplier = (float)property.getDouble();
        if (cTPMultiplier < (float)min) {
            cTPMultiplier = min;
        } else if (cTPMultiplier > (float)max) {
            cTPMultiplier = max;
        }
        TPMultiplier = cTPMultiplier;
        min = 0;
        max = 1000000000;
        defaultValue = "" + JGConfigMiniGameAirBoxing.getDefault("" + min, "" + max);
        title = "TP Daily Limit";
        description = "TP daily reward limitation";
        property = config.get(CATEGORY, "" + title, 20);
        property.comment = "Server Sided! " + description + defaultValue;
        cTPDailyLimit = property.getInt();
        if (cTPDailyLimit < min) {
            cTPDailyLimit = min;
        } else if (cTPDailyLimit > max) {
            cTPDailyLimit = max;
        }
        TPDailyLimit = cTPDailyLimit;
        min = 0;
        max = 1000000;
        defaultValue = "" + JGConfigMiniGameAirBoxing.getDefault("" + min, "" + max);
        title = "Starting Life";
        description = "Starting Life points";
        property = config.get(CATEGORY, "" + title, 1);
        property.comment = "Server Sided! " + description + defaultValue;
        cStartLife = property.getInt();
        if (cStartLife < min) {
            cStartLife = min;
        } else if (cStartLife > max) {
            cStartLife = max;
        }
        StartLife = cStartLife;
        double[] KeySpawnSpeed2 = new double[]{1.0, 0.8, 0.7, 1.0};
        double[] KeySpeed2 = new double[]{0.09, 0.085, 0.08, 0.1};
        int[] KeyLifeTaken2 = new int[]{0, 0, 0, 0};
        String[][] KeyTypeIDs2 = new String[][]{{"W"}, {"W", "A"}, {"W", "A", "S"}, {"W", "A", "S", "D"}};
        for (int i = 0; i < 4; ++i) {
            CATEGORY = CATEGORY_MINIGAME_MODE_SERVERSIDED + i;
            min = 0;
            max = 1000;
            defaultValue = "" + JGConfigMiniGameAirBoxing.getDefault("" + min, "" + max);
            title = "Key Spawn Timer";
            description = "Key Spawn Speed in seconds";
            property = config.get(CATEGORY, "" + title, KeySpawnSpeed2[i]);
            property.comment = "Server Sided! " + description + defaultValue;
            JGConfigMiniGameAirBoxing.cKeySpawnSpeed[i] = (float)property.getDouble();
            if (cKeySpawnSpeed[i] < (float)min) {
                JGConfigMiniGameAirBoxing.cKeySpawnSpeed[i] = min;
            } else if (cKeySpawnSpeed[i] > (float)max) {
                JGConfigMiniGameAirBoxing.cKeySpawnSpeed[i] = max;
            }
            JGConfigMiniGameAirBoxing.KeySpawnSpeed[i] = cKeySpawnSpeed[i];
            min = 0;
            max = 1000;
            defaultValue = "" + JGConfigMiniGameAirBoxing.getDefault("" + min, "" + max);
            title = "Key Movement Speed";
            description = "Key Movement Speed value";
            property = config.get(CATEGORY, "" + title, KeySpeed2[i]);
            property.comment = "Server Sided! " + description + defaultValue;
            JGConfigMiniGameAirBoxing.cKeySpeed[i] = (float)property.getDouble();
            if (cKeySpeed[i] < (float)min) {
                JGConfigMiniGameAirBoxing.cKeySpeed[i] = min;
            } else if (cKeySpeed[i] > (float)max) {
                JGConfigMiniGameAirBoxing.cKeySpeed[i] = max;
            }
            JGConfigMiniGameAirBoxing.KeySpeed[i] = cKeySpeed[i];
            min = 0;
            max = 1000;
            defaultValue = "" + JGConfigMiniGameAirBoxing.getDefault("" + min, "" + max);
            title = "Life Taken on Miss";
            description = "Life lost on Key Miss";
            property = config.get(CATEGORY, "" + title, KeyLifeTaken2[i]);
            property.comment = "Server Sided! " + description + defaultValue;
            JGConfigMiniGameAirBoxing.cKeyLifeTaken[i] = property.getInt();
            if (cKeyLifeTaken[i] < min) {
                JGConfigMiniGameAirBoxing.cKeyLifeTaken[i] = min;
            } else if (cKeyLifeTaken[i] > max) {
                JGConfigMiniGameAirBoxing.cKeyLifeTaken[i] = max;
            }
            JGConfigMiniGameAirBoxing.KeyLifeTaken[i] = cKeyLifeTaken[i];
            min = 0;
            max = 4;
            defaultValue = ". (W A S D).";
            String[] defaultValueS = KeyTypeIDs2[i];
            title = "Key Types";
            description = "Key Types in the mode";
            property = config.get(CATEGORY, "" + title, defaultValueS, "Server Sided! " + description + defaultValue);
            String text = property.getString();
            String[] keyValues = property.getStringList();
            JGConfigMiniGameAirBoxing.cKeyTypeIDs[i] = new int[keyValues.length];
            JGConfigMiniGameAirBoxing.KeyTypeIDs[i] = new int[keyValues.length];
            for (int j = 0; j < keyValues.length; ++j) {
                JGConfigMiniGameAirBoxing.cKeyTypeIDs[i][j] = JGConfigMiniGameAirBoxing.keyToId(keyValues[j]);
                if (cKeyTypeIDs[i][j] < min) {
                    JGConfigMiniGameAirBoxing.cKeyTypeIDs[i][j] = min;
                } else if (cKeyTypeIDs[i][j] > max) {
                    JGConfigMiniGameAirBoxing.cKeyTypeIDs[i][j] = max;
                }
                JGConfigMiniGameAirBoxing.KeyTypeIDs[i][j] = cKeyTypeIDs[i][j];
            }
        }
    }

    public static int keyToId(String s) {
        if (s.equals("W")) {
            return 0;
        }
        if (s.equals("A")) {
            return 1;
        }
        if (s.equals("S")) {
            return 2;
        }
        return 3;
    }

    static {
        KeySpawnSpeed = new float[4];
        cKeySpawnSpeed = new float[4];
        KeySpeed = new float[4];
        cKeySpeed = new float[4];
        KeyLifeTaken = new int[4];
        cKeyLifeTaken = new int[4];
        KeyTypeIDs = new int[4][];
        cKeyTypeIDs = new int[4][];
    }
}

