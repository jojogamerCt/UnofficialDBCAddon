/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldProvider
 *  net.minecraft.world.biome.WorldChunkManagerHell
 *  net.minecraft.world.chunk.Chunk
 *  net.minecraft.world.chunk.IChunkProvider
 */
package JinRyuu.DragonBC.common.Worlds;

import JinRyuu.DragonBC.common.Worlds.BiomeGenBaseDBC;
import JinRyuu.DragonBC.common.Worlds.x2ChunkProviderTC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

public class x2WorldProviderTC
extends WorldProvider {
    public int registerWorld() {
        return 23;
    }

    public boolean renderClouds() {
        return false;
    }

    public boolean renderEndSky() {
        return false;
    }

    public boolean renderVoidFog() {
        return true;
    }

    public float setMoonSize() {
        return 0.0f;
    }

    public float setSunSize() {
        return 0.0f;
    }

    public String getSunTexture() {
        return "jinryuudragonbc:sun.png";
    }

    public String getMoonTexture() {
        return "jinryuudragonbc:moon_phases.png";
    }

    public boolean renderStars() {
        return true;
    }

    public boolean darkenSkyDuringRain() {
        return false;
    }

    public String getRespawnMessage() {
        return " Leaving Time Chamber";
    }

    public boolean hasMultipleBiomes() {
        return false;
    }

    public void registerWorldChunkManager() {
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBaseDBC.TC, 0.8f);
    }

    public IChunkProvider createChunkGenerator() {
        return new x2ChunkProviderTC(this.worldObj, this.worldObj.getSeed(), false);
    }

    public boolean canRespawnHere() {
        return true;
    }

    public float calculateCelestialAngle(long par1, float par3) {
        return 1.0f;
    }

    public String getSaveFolder() {
        return this.getDimensionName();
    }

    public String getDimensionName() {
        return "TimeChamber";
    }

    @SideOnly(value=Side.CLIENT)
    public float getCloudHeight() {
        return this.getCloudHeight_();
    }

    public int getAverageGroundLevel() {
        return this.getMinimumSpawnHeight(this.worldObj);
    }

    @SideOnly(value=Side.CLIENT)
    public boolean getWorldHasVoidParticles() {
        return this.hasVoidParticles(this.hasNoSky);
    }

    @SideOnly(value=Side.CLIENT)
    public double getVoidFogYFactor() {
        return this.voidFadeMagnitude();
    }

    public double getHorizon() {
        return this.getHorizon(this.worldObj);
    }

    public int getMinimumSpawnHeight(World world) {
        return 4;
    }

    public float getCloudHeight_() {
        return 98.0f;
    }

    public double getHorizon(World world) {
        return 0.0;
    }

    public boolean hasVoidParticles(boolean flag) {
        return false;
    }

    public double voidFadeMagnitude() {
        return 1.0;
    }

    public boolean canDoLightning(Chunk chunk) {
        return true;
    }

    public boolean canDoRainSnowIce(Chunk chunk) {
        return true;
    }
}

