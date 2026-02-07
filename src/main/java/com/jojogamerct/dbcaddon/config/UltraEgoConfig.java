package com.jojogamerct.dbcaddon.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class UltraEgoConfig {

    // Activation requirements
    public static int requiredLevel = 200;
    public static long tpCost = 75000;

    // Stat multipliers (percentage-based, applied to all combat stats)
    public static double baseAttributeMultiplier = 3.5;
    public static double maxAttributeMultiplier = 5.5;

    // Damage-taken scaling: how much the multiplier increases per hit
    // The "battle damage" counter increases by (damage / maxBody) * battleDamageScaling
    public static double battleDamageScaling = 0.15;
    public static double maxBattleDamageBonus = 2.0;
    public static int battleDamageDecayTicks = 600; // 30 seconds to start decaying
    public static double battleDamageDecayRate = 0.005; // per tick after decay starts

    // Ki/Stamina drain
    public static double kiDrainPercentPerSecond = 1.5;
    public static double staminaDrainPercentPerSecond = 0.8;

    // Damage reduction while in Ultra Ego (Vegeta takes hits willingly but is tougher)
    public static double damageReductionBase = 0.15;

    // Hakai effect: bonus destruction damage multiplier added to attacks
    public static double hakaiDamageBonus = 0.25;

    private static Configuration config;

    public static void loadConfig(File configFile) {
        config = new Configuration(configFile);

        config.load();

        requiredLevel = config.getInt(
            "requiredLevel", "ultra_ego", requiredLevel, 1, 10000,
            "Minimum DBC level required to activate Ultra Ego");

        tpCost = config.getInt(
            "tpCost", "ultra_ego", (int) tpCost, 0, Integer.MAX_VALUE,
            "Training Points cost to unlock Ultra Ego");

        baseAttributeMultiplier = config.getFloat(
            "baseAttributeMultiplier", "ultra_ego", (float) baseAttributeMultiplier, 1.0f, 20.0f,
            "Base stat multiplier when Ultra Ego is active");

        maxAttributeMultiplier = config.getFloat(
            "maxAttributeMultiplier", "ultra_ego", (float) maxAttributeMultiplier, 1.0f, 30.0f,
            "Maximum stat multiplier at full battle damage bonus");

        battleDamageScaling = config.getFloat(
            "battleDamageScaling", "ultra_ego", (float) battleDamageScaling, 0.01f, 1.0f,
            "How fast the battle damage bonus increases when taking hits");

        maxBattleDamageBonus = config.getFloat(
            "maxBattleDamageBonus", "ultra_ego", (float) maxBattleDamageBonus, 0.0f, 20.0f,
            "Maximum additional multiplier from battle damage");

        battleDamageDecayTicks = config.getInt(
            "battleDamageDecayTicks", "ultra_ego", battleDamageDecayTicks, 0, 72000,
            "Ticks before battle damage bonus starts decaying (20 ticks = 1 second)");

        battleDamageDecayRate = config.getFloat(
            "battleDamageDecayRate", "ultra_ego", (float) battleDamageDecayRate, 0.0f, 1.0f,
            "Rate at which battle damage bonus decays per tick after decay starts");

        kiDrainPercentPerSecond = config.getFloat(
            "kiDrainPercentPerSecond", "ultra_ego", (float) kiDrainPercentPerSecond, 0.0f, 100.0f,
            "Percentage of max Ki drained per second while Ultra Ego is active");

        staminaDrainPercentPerSecond = config.getFloat(
            "staminaDrainPercentPerSecond", "ultra_ego", (float) staminaDrainPercentPerSecond, 0.0f, 100.0f,
            "Percentage of max Stamina drained per second while Ultra Ego is active");

        damageReductionBase = config.getFloat(
            "damageReductionBase", "ultra_ego", (float) damageReductionBase, 0.0f, 0.95f,
            "Base damage reduction while in Ultra Ego form");

        hakaiDamageBonus = config.getFloat(
            "hakaiDamageBonus", "ultra_ego", (float) hakaiDamageBonus, 0.0f, 5.0f,
            "Bonus destruction damage multiplier added to attacks");

        if (config.hasChanged()) {
            config.save();
        }
    }
}
