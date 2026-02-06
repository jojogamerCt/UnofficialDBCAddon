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

public class JGConfigMiniGameConcentration
extends JGConfigBase {
    public static final String CATEGORY_MINIGAME_SERVERSIDED = "MiniGame";
    public static final String CATEGORY_MINIGAME_CONCENTRATION_SERVERSIDED = "MiniGame Concentration";
    public static boolean TPGainOn;
    public static boolean cTPGainOn;
    public static float TPlimitIncreasesWithPlayerLevel;
    public static float cTPlimitIncreasesWithPlayerLevel;
    public static float TPMultiplier;
    public static float cTPMultiplier;
    public static int TPDailyLimit;
    public static int cTPDailyLimit;
    public static float ComboTimer;
    public static float cComboTimer;
    public static boolean ConstantClickOn;
    public static boolean cConstantClickOn;
    public static int RandomMovementSpeed;
    public static int cRandomMovementSpeed;

    public static void init(Configuration config) {
        config.load();
        JGConfigMiniGameConcentration.init_minigame(config);
        config.save();
    }

    private static void init_minigame(Configuration config) {
        String name = "";
        String CATEGORY = CATEGORY_MINIGAME_CONCENTRATION_SERVERSIDED;
        String percentage = " (Percentage)";
        String SERVERSIDE = "Server Sided! ";
        String defaultValue = ". (true).";
        String title = "TP Gain On";
        String description = "If this is 'true' then from this minigame the TP gain feature will be enabled, if 'false' then players can't earn TP";
        Property property = config.get(CATEGORY, "" + title, true);
        property.comment = "Server Sided! " + description + defaultValue;
        TPGainOn = cTPGainOn = property.getBoolean();
        int min = 0;
        int max = 100000;
        defaultValue = "" + JGConfigMiniGameConcentration.getDefault("" + min, "" + max);
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
        defaultValue = "" + JGConfigMiniGameConcentration.getDefault("" + min, "" + max);
        title = "TP Multiplier";
        description = "TP gain reward multiplier";
        property = config.get(CATEGORY, "" + title, 0.02);
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
        defaultValue = "" + JGConfigMiniGameConcentration.getDefault("" + min, "" + max);
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
        max = 100000;
        defaultValue = "" + JGConfigMiniGameConcentration.getDefault("" + min, "" + max);
        title = "Combo Timer";
        description = "Combo Timer in seconds";
        property = config.get(CATEGORY, "" + title, 3.0);
        property.comment = "Server Sided! " + description + defaultValue;
        cComboTimer = (float)property.getDouble();
        if (cComboTimer < (float)min) {
            cComboTimer = min;
        } else if (cComboTimer > (float)max) {
            cComboTimer = max;
        }
        ComboTimer = cComboTimer;
        defaultValue = ". (true).";
        title = "Constant Click On";
        description = "If this is 'true' then Constant clicking in the minigame is enabled";
        property = config.get(CATEGORY, "" + title, true);
        property.comment = "Server Sided! " + description + defaultValue;
        ConstantClickOn = cConstantClickOn = property.getBoolean();
        min = 0;
        max = 1000;
        defaultValue = "" + JGConfigMiniGameConcentration.getDefault("" + min, "" + max);
        title = "Energy Random Movement Speed";
        description = "Energy Balls Random Movement Speed from Value to -Value";
        property = config.get(CATEGORY, "" + title, 1);
        property.comment = "Server Sided! " + description + defaultValue;
        cRandomMovementSpeed = property.getInt();
        if (cRandomMovementSpeed < min) {
            cRandomMovementSpeed = min;
        } else if (cRandomMovementSpeed > max) {
            cRandomMovementSpeed = max;
        }
        RandomMovementSpeed = cRandomMovementSpeed;
    }
}

