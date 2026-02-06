/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.nbt.NBTTagCompound
 */
package JinRyuu.JRMCore.server;

import JinRyuu.JRMCore.JRMCoreH;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;

public class JGPlayerMP {
    public EntityPlayer player;
    private NBTTagCompound nbt;

    public JGPlayerMP(EntityPlayer player) {
        this.player = player;
    }

    public JGPlayerMP(EntityPlayerMP player) {
        this.player = player;
    }

    public NBTTagCompound getNBT() {
        return this.nbt;
    }

    public void setNBT(NBTTagCompound nbt) {
        this.nbt = nbt;
    }

    public NBTTagCompound connectBaseNBT() {
        this.nbt = JRMCoreH.nbt((Entity)this.player, "pres");
        return this.nbt;
    }

    public int[] getAttributes() {
        return JRMCoreH.PlyrAttrbts(this.player);
    }

    public String[] getSkills() {
        return JRMCoreH.PlyrSkills(this.player);
    }

    public String getSkillsX() {
        return this.nbt.getString("jrmcSSltX");
    }

    public String getSkillsY() {
        return this.nbt.getString("jrmcSSltY");
    }

    public int getLevel(int[] playerAttributes) {
        return JRMCoreH.getPlayerLevel(playerAttributes);
    }

    public byte getRace() {
        return this.nbt.getByte("jrmcRace");
    }

    public byte getClassID() {
        return this.nbt.getByte("jrmcClass");
    }

    public byte getPowerType() {
        return this.nbt.getByte("jrmcPwrtyp");
    }

    public int getAlignment() {
        return this.nbt.getByte("jrmcAlign");
    }

    public byte getState() {
        return this.nbt.getByte("jrmcState");
    }

    public void setState(int value) {
        this.nbt.setByte("jrmcState", (byte)value);
    }

    public byte getState2() {
        return this.nbt.getByte("jrmcState2");
    }

    public void setState2(int value) {
        this.nbt.setByte("jrmcState2", (byte)value);
    }

    public byte getRelease() {
        return this.nbt.getByte("jrmcRelease");
    }

    public void setRelease(int value) {
        this.nbt.setByte("jrmcRelease", (byte)value);
    }

    public int getReserve() {
        return this.nbt.getInteger("jrmcArcRsrv");
    }

    public void setReserve(int value) {
        this.nbt.setInteger("jrmcArcRsrv", value);
    }

    public String getAbsorption() {
        return this.nbt.getString("jrmcMajinAbsorptionData");
    }

    public void setAbsorption(String value) {
        this.nbt.setString("jrmcMajinAbsorptionData", value);
    }

    public int getTransformationMeter() {
        return this.nbt.getByte("jrmcSaiRg");
    }

    public void setTransformationMeter(int value) {
        this.nbt.setByte("jrmcSaiRg", (byte)value);
    }

    public void setStateAndTransformationMeter(int valueSt, int valueTr) {
        this.setState(valueSt);
        this.setTransformationMeter(valueTr);
    }

    public int getStat(byte race, byte classID, int attributeID, int stat, byte powerType, int attribute) {
        return this.getStat(race, classID, attributeID, stat, powerType, attribute, 0.0f);
    }

    public String getStatusEffects() {
        return this.nbt.getString("jrmcStatusEff");
    }

    public boolean hasStatusEffect(int statusEffectID, String statusEffects) {
        return JRMCoreH.StusEfcts(statusEffectID, statusEffects);
    }

    public String getPlayerSettings() {
        return this.nbt.getString("jrmcSettings");
    }

    public int getStat(byte race, byte classID, int attributeID, int stat, byte powerType, int[] playerAttributes) {
        return this.getStat(race, classID, attributeID, stat, powerType, playerAttributes[attributeID], 0.0f);
    }

    public int getStat(byte race, byte classID, int attributeID, int stat, byte powerType, int[] playerAttributes, float skillBonus) {
        return this.getStat(race, classID, attributeID, stat, powerType, playerAttributes[attributeID], skillBonus);
    }

    public int getStat(byte race, byte classID, int attributeID, int stat, byte powerType, int attribute, float skillBonus) {
        return JRMCoreH.stat((Entity)this.player, attributeID, powerType, stat, attribute, race, classID, skillBonus);
    }

    public int getHealth() {
        return JRMCoreH.getInt(this.player, "jrmcBdy");
    }

    public int getHealthMax(byte race, byte classID, byte powerType, int[] playerAttributes) {
        return this.getStat(race, classID, 2, 2, powerType, playerAttributes);
    }

    public int getHealthRegen(byte race, byte classID, byte powerType) {
        return this.getStat(race, classID, -1, 8, powerType, 100);
    }

    public int getEnergy() {
        return JRMCoreH.getInt(this.player, "jrmcEnrgy");
    }

    public int getEnergyMax(byte race, byte classID, byte powerType, int[] playerAttributes, float skillBonus) {
        return this.getStat(race, classID, 5, 5, powerType, playerAttributes, skillBonus);
    }

    public int getEnergyRegen(byte race, byte classID, byte powerType) {
        return this.getStat(race, classID, -1, 10, powerType, 100);
    }

    public int getStamina() {
        return JRMCoreH.getInt(this.player, "jrmcStamina");
    }

    public int getStaminaMax(byte race, byte classID, byte powerType, int[] playerAttributes) {
        return this.getStat(race, classID, 2, 3, powerType, playerAttributes);
    }

    public int getStaminaRegen(byte race, byte classID, byte powerType) {
        return this.getStat(race, classID, -1, 9, powerType, 100);
    }

    public int getEnergyPower() {
        return this.getEnergyPower(this.getRace(), this.getClassID(), this.getPowerType());
    }

    public int getEnergyPower(byte race, byte classID, byte powerType) {
        return this.getStat(race, classID, 3, 4, powerType, this.getAttribute(3), 0.0f);
    }

    public int getAttribute(int attributeID) {
        byte powerType = this.getPowerType();
        byte race = this.getRace();
        byte state = this.getState();
        byte state2 = this.getState2();
        byte classID = this.getClassID();
        byte release = this.getRelease();
        int reserve = this.getReserve();
        String absorption = this.getAbsorption();
        int[] attributes = this.getAttributes();
        String skillsX = this.getSkillsX();
        String[] skills = this.getSkills();
        String statusEffects = this.getStatusEffects();
        boolean hasLegendary = this.hasStatusEffect(14, statusEffects);
        boolean hasMajin = this.hasStatusEffect(12, statusEffects);
        boolean hasKaioken = this.hasStatusEffect(5, statusEffects);
        boolean hasMystic = this.hasStatusEffect(13, statusEffects);
        boolean hasUltraInstinct = this.hasStatusEffect(19, statusEffects);
        boolean hasGodOfDestruction = this.hasStatusEffect(20, statusEffects);
        boolean hasFusion = this.hasStatusEffect(10, statusEffects) || this.hasStatusEffect(11, statusEffects);
        return JRMCoreH.getPlayerAttribute(this.player, attributes, attributeID, state, state2, race, skillsX, release, reserve, hasLegendary, hasMajin, hasKaioken, hasMystic, hasUltraInstinct, hasGodOfDestruction, powerType, skills, hasFusion, absorption);
    }
}

