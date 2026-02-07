package com.jojogamerct.dbcaddon.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

/**
 * Configuration for the addon's debug system.
 * All debug options are toggled independently so specific subsystems can be diagnosed.
 */
public class DebugConfig {

    // Master toggle
    public static boolean debugEnabled = false;

    // Subsystem toggles
    public static boolean debugNBTReads = false;
    public static boolean debugTransformationActivation = false;
    public static boolean debugTransformationTick = false;
    public static boolean debugDamageEvents = false;
    public static boolean debugNetworkPackets = false;

    // In-game chat debug messages (in addition to log file output)
    public static boolean debugChatOutput = false;

    private static Configuration config;

    public static void loadConfig(File configFile) {
        config = new Configuration(configFile);
        config.load();

        String cat = "debug";

        debugEnabled = config.getBoolean(
            "debugEnabled",
            cat,
            debugEnabled,
            "Master toggle for all debug logging. When false, no debug messages are output.");

        debugNBTReads = config.getBoolean(
            "debugNBTReads",
            cat,
            debugNBTReads,
            "Log all NBT data reads (race, level, TP, Ki, stamina, attributes)");

        debugTransformationActivation = config.getBoolean(
            "debugTransformationActivation",
            cat,
            debugTransformationActivation,
            "Log detailed activation/deactivation steps for transformations");

        debugTransformationTick = config.getBoolean(
            "debugTransformationTick",
            cat,
            debugTransformationTick,
            "Log per-tick transformation data (Ki drain, stamina drain, battle damage decay). WARNING: Very verbose!");

        debugDamageEvents = config.getBoolean(
            "debugDamageEvents",
            cat,
            debugDamageEvents,
            "Log damage dealt and received calculations while transformation is active");

        debugNetworkPackets = config
            .getBoolean("debugNetworkPackets", cat, debugNetworkPackets, "Log network packet sends and receives");

        debugChatOutput = config.getBoolean(
            "debugChatOutput",
            cat,
            debugChatOutput,
            "Also send debug messages to the player's chat (in addition to log file)");

        if (config.hasChanged()) {
            config.save();
        }
    }
}
