/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.WorldProvider
 *  net.minecraft.world.biome.WorldChunkManagerHell
 *  net.minecraft.world.chunk.IChunkProvider
 */
package JinRyuu.DragonBC.common.Worlds;

import JinRyuu.DragonBC.common.Worlds.BiomeGenBaseDBC;
import JinRyuu.DragonBC.common.Worlds.x0ChunkProviderNamek;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class x3WorldProviderVegeta
extends WorldProvider {
    public int registerWorld() {
        return 21;
    }

    public boolean renderClouds() {
        return true;
    }

    public boolean renderEndSky() {
        return false;
    }

    public boolean renderVoidFog() {
        return true;
    }

    public float setMoonSize() {
        return 5.0f;
    }

    public float setSunSize() {
        return 4.0f;
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
        return true;
    }

    public String getRespawnMessage() {
        return " Leaving Planet Vegeta ";
    }

    public boolean hasMultipleBiomes() {
        return true;
    }

    public void registerWorldChunkManager() {
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBaseDBC.Vegeta, 0.8f);
    }

    public IChunkProvider createChunkGenerator() {
        return new x0ChunkProviderNamek(this.worldObj, this.worldObj.getSeed(), true);
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
        return "Vegeta";
    }
}

