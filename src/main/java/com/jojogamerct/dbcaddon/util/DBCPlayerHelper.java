package com.jojogamerct.dbcaddon.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Helper class to read and write DBC player data via NBT.
 * Uses direct NBT access to avoid compile-time dependency on DBC/JRMCore classes.
 */
public class DBCPlayerHelper {

    // DBC Race IDs
    public static final int RACE_HUMAN = 0;
    public static final int RACE_SAIYAN = 1;
    public static final int RACE_HALF_SAIYAN = 2;
    public static final int RACE_NAMEKIAN = 3;
    public static final int RACE_ARCOSIAN = 4;
    public static final int RACE_MAJIN = 5;

    // DBC NBT Keys
    private static final String NBT_RACE = "jrmcRace";
    private static final String NBT_STATE = "jrmcState";
    private static final String NBT_STATE2 = "jrmcState2";
    private static final String NBT_STATUS_EFFECTS = "jrmcStatusEff";
    private static final String NBT_LEVEL = "jrmcLvl";
    private static final String NBT_BODY = "jrmcBdy";
    private static final String NBT_BODY_MAX = "jrmcBdyMax";
    private static final String NBT_ENERGY = "jrmcEnrgy";
    private static final String NBT_ENERGY_MAX = "jrmcEnrgyMax";
    private static final String NBT_STAMINA = "jrmcStamina";
    private static final String NBT_STAMINA_MAX = "jrmcStaminaMax";
    private static final String NBT_TP = "jrmcTP";
    private static final String NBT_RELEASE = "jrmcRelease";

    // DBC Attribute NBT Keys (integer format)
    private static final String[] ATTR_KEYS = {
        "jrmcStrI", "jrmcDexI", "jrmcCnsI", "jrmcWilI", "jrmcIntI", "jrmcCncI"
    };

    // Attribute indices
    public static final int ATTR_STR = 0;
    public static final int ATTR_DEX = 1;
    public static final int ATTR_CON = 2;
    public static final int ATTR_WIL = 3;
    public static final int ATTR_MND = 4;
    public static final int ATTR_CNC = 5;

    // Status Effect codes (from JRMCoreH.StusEfcts array)
    public static final String SE_KAIOKEN = "K";
    public static final String SE_MYSTIC = "C";
    public static final String SE_ULTRA_INSTINCT = "N";
    public static final String SE_GOD_OF_DESTRUCTION = "G";

    /**
     * Gets the player's persisted NBT data (where DBC stores player info).
     */
    public static NBTTagCompound getPersistedData(EntityPlayer player) {
        NBTTagCompound entityData = player.getEntityData();
        if (!entityData.hasKey("PlayerPersisted")) {
            entityData.setTag("PlayerPersisted", new NBTTagCompound());
        }
        return entityData.getCompoundTag("PlayerPersisted");
    }

    public static int getRace(EntityPlayer player) {
        return getPersistedData(player).getByte(NBT_RACE);
    }

    public static boolean isSaiyanOrHalfSaiyan(EntityPlayer player) {
        int race = getRace(player);
        return race == RACE_SAIYAN || race == RACE_HALF_SAIYAN;
    }

    public static int getState(EntityPlayer player) {
        return getPersistedData(player).getByte(NBT_STATE);
    }

    public static int getState2(EntityPlayer player) {
        return getPersistedData(player).getByte(NBT_STATE2);
    }

    public static String getStatusEffects(EntityPlayer player) {
        return getPersistedData(player).getString(NBT_STATUS_EFFECTS);
    }

    public static boolean hasStatusEffect(EntityPlayer player, String effectCode) {
        return getStatusEffects(player).contains(effectCode);
    }

    public static boolean isGodOfDestructionActive(EntityPlayer player) {
        return hasStatusEffect(player, SE_GOD_OF_DESTRUCTION);
    }

    public static boolean isUltraInstinctActive(EntityPlayer player) {
        return hasStatusEffect(player, SE_ULTRA_INSTINCT);
    }

    public static int getLevel(EntityPlayer player) {
        return getPersistedData(player).getInteger(NBT_LEVEL);
    }

    public static int getAttribute(EntityPlayer player, int attrIndex) {
        if (attrIndex < 0 || attrIndex >= ATTR_KEYS.length) return 0;
        return getPersistedData(player).getInteger(ATTR_KEYS[attrIndex]);
    }

    public static int getStrength(EntityPlayer player) {
        return getAttribute(player, ATTR_STR);
    }

    public static int getWillpower(EntityPlayer player) {
        return getAttribute(player, ATTR_WIL);
    }

    public static long getCurrentBody(EntityPlayer player) {
        return getPersistedData(player).getLong(NBT_BODY);
    }

    public static long getMaxBody(EntityPlayer player) {
        return getPersistedData(player).getLong(NBT_BODY_MAX);
    }

    public static long getCurrentEnergy(EntityPlayer player) {
        return getPersistedData(player).getLong(NBT_ENERGY);
    }

    public static long getMaxEnergy(EntityPlayer player) {
        return getPersistedData(player).getLong(NBT_ENERGY_MAX);
    }

    public static void setCurrentEnergy(EntityPlayer player, long energy) {
        getPersistedData(player).setLong(NBT_ENERGY, energy);
    }

    public static long getCurrentStamina(EntityPlayer player) {
        return getPersistedData(player).getLong(NBT_STAMINA);
    }

    public static long getMaxStamina(EntityPlayer player) {
        return getPersistedData(player).getLong(NBT_STAMINA_MAX);
    }

    public static void setCurrentStamina(EntityPlayer player, long stamina) {
        getPersistedData(player).setLong(NBT_STAMINA, stamina);
    }

    public static int getRelease(EntityPlayer player) {
        return getPersistedData(player).getByte(NBT_RELEASE);
    }

    public static long getTP(EntityPlayer player) {
        return getPersistedData(player).getLong(NBT_TP);
    }

    public static void setTP(EntityPlayer player, long tp) {
        getPersistedData(player).setLong(NBT_TP, tp);
    }
}
