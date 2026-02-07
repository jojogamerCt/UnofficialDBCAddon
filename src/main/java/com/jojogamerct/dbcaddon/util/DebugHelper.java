package com.jojogamerct.dbcaddon.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import com.jojogamerct.dbcaddon.UnofficialDBCAddon;
import com.jojogamerct.dbcaddon.config.DebugConfig;

/**
 * Centralized debug logging utility.
 * All debug output is gated behind DebugConfig toggles.
 * Messages go to the mod logger and optionally to in-game chat.
 */
public class DebugHelper {

    private static final String PREFIX = "[DBCAddon Debug] ";

    /**
     * Log a debug message if the master toggle and the specific subsystem are enabled.
     */
    public static void log(boolean subsystemEnabled, String message) {
        if (!DebugConfig.debugEnabled || !subsystemEnabled) return;
        UnofficialDBCAddon.LOG.info(PREFIX + message);
    }

    /**
     * Log a debug message and optionally send it to the player's chat.
     */
    public static void log(boolean subsystemEnabled, EntityPlayer player, String message) {
        if (!DebugConfig.debugEnabled || !subsystemEnabled) return;
        UnofficialDBCAddon.LOG.info(PREFIX + message);
        if (DebugConfig.debugChatOutput && player != null) {
            player.addChatMessage(
                new ChatComponentText(EnumChatFormatting.AQUA + PREFIX + EnumChatFormatting.GRAY + message));
        }
    }

    // --- Convenience methods for each subsystem ---

    public static void logNBT(String message) {
        log(DebugConfig.debugNBTReads, message);
    }

    public static void logNBT(EntityPlayer player, String message) {
        log(DebugConfig.debugNBTReads, player, message);
    }

    public static void logActivation(String message) {
        log(DebugConfig.debugTransformationActivation, message);
    }

    public static void logActivation(EntityPlayer player, String message) {
        log(DebugConfig.debugTransformationActivation, player, message);
    }

    public static void logTick(String message) {
        log(DebugConfig.debugTransformationTick, message);
    }

    public static void logDamage(String message) {
        log(DebugConfig.debugDamageEvents, message);
    }

    public static void logDamage(EntityPlayer player, String message) {
        log(DebugConfig.debugDamageEvents, player, message);
    }

    public static void logNetwork(String message) {
        log(DebugConfig.debugNetworkPackets, message);
    }

    /**
     * Dumps all DBC player data for diagnostics. Useful for identifying NBT issues.
     */
    public static void dumpPlayerData(EntityPlayer player) {
        if (!DebugConfig.debugEnabled || !DebugConfig.debugNBTReads) return;

        String name = player.getCommandSenderName();
        log(true, player, "=== DBC Player Data Dump for " + name + " ===");
        log(
            true,
            player,
            "Race: " + DBCPlayerHelper.getRace(player)
                + " (Saiyan/HalfSaiyan: "
                + DBCPlayerHelper.isSaiyanOrHalfSaiyan(player)
                + ")");

        int[] attrs = DBCPlayerHelper.getAllAttributes(player);
        int attrSum = 0;
        String[] attrNames = { "STR", "DEX", "CON", "WIL", "MND", "CNC" };
        for (int i = 0; i < attrs.length; i++) {
            log(true, player, "  " + attrNames[i] + ": " + attrs[i]);
            attrSum += attrs[i];
        }
        log(true, player, "  Attribute Sum: " + attrSum);
        log(true, player, "  Calculated Level: " + DBCPlayerHelper.getLevel(player));

        log(true, player, "TP: " + DBCPlayerHelper.getTP(player));
        log(
            true,
            player,
            "Ki: " + DBCPlayerHelper.getCurrentEnergy(player) + " / " + DBCPlayerHelper.getMaxEnergy(player));
        log(
            true,
            player,
            "Stamina: " + DBCPlayerHelper.getCurrentStamina(player) + " / " + DBCPlayerHelper.getMaxStamina(player));
        log(
            true,
            player,
            "Body: " + DBCPlayerHelper.getCurrentBody(player) + " / " + DBCPlayerHelper.getMaxBody(player));
        log(
            true,
            player,
            "State: " + DBCPlayerHelper.getState(player) + " State2: " + DBCPlayerHelper.getState2(player));
        log(true, player, "Release: " + DBCPlayerHelper.getRelease(player));
        log(true, player, "Status Effects: " + DBCPlayerHelper.getStatusEffects(player));
        log(true, player, "=== End Data Dump ===");
    }
}
