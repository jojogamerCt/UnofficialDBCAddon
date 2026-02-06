/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.ChunkCoordinates
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldProvider
 *  net.minecraft.world.chunk.IChunkProvider
 *  net.minecraftforge.common.DimensionManager
 */
package JinRyuu.DragonBC.common.Worlds;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Worlds.x0ChunkProviderNamek;
import JinRyuu.DragonBC.common.Worlds.x0WorldChunkManagerNamek;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;

public class x0WorldProviderNamek
extends WorldProvider {
    public IChunkProvider createChunkGenerator() {
        return new x0ChunkProviderNamek(this.worldObj, this.worldObj.getSeed(), true);
    }

    public void registerWorldChunkManager() {
        this.worldChunkMgr = new x0WorldChunkManagerNamek(this.worldObj.getSeed(), this.terrainType);
        this.dimensionId = DBCConfig.planetNamek;
    }

    public static WorldProvider getProviderForDimension(int id) {
        return DimensionManager.createProviderFor((int)DBCConfig.planetNamek);
    }

    public String getDimensionName() {
        return "Namek";
    }

    public String getSaveFolder() {
        return this.getDimensionName();
    }

    public float calculateCelestialAngle(long par1, float par3) {
        return 1.0f;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean renderStars() {
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    public double getMovementFactor() {
        return 0.1;
    }

    @SideOnly(value=Side.CLIENT)
    public float getStarBrightness(World world, float f) {
        return 1.0f;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean renderClouds() {
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean renderVoidFog() {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public boolean renderEndSky() {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public float setSunSize() {
        return 0.25f;
    }

    @SideOnly(value=Side.CLIENT)
    public float setMoonSize() {
        return 4.0f;
    }

    @SideOnly(value=Side.CLIENT)
    public Vec3 getSkyColor(Entity cameraEntity, float partialTicks) {
        return this.worldObj.getSkyColorBody(cameraEntity, partialTicks);
    }

    @SideOnly(value=Side.CLIENT)
    public boolean isSkyColored() {
        return true;
    }

    public boolean canRespawnHere() {
        return true;
    }

    public boolean isSurfaceWorld() {
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    public float getCloudHeight() {
        return this.terrainType.getCloudHeight();
    }

    public ChunkCoordinates getEntrancePortalLocation() {
        return new ChunkCoordinates(50, 5, 0);
    }

    protected void generateLightBrightnessTable() {
        float f = 0.0f;
        for (int i = 0; i <= 15; ++i) {
            float f1 = 1.0f - (float)i / 15.0f;
            this.lightBrightnessTable[i] = (1.0f - f1) / (f1 * 3.0f + 1.0f) * (1.0f - f) + f;
        }
    }

    @SideOnly(value=Side.CLIENT)
    public String getWelcomeMessage() {
        return "Entering Planet Namek";
    }

    @SideOnly(value=Side.CLIENT)
    public String getDepartMessage() {
        return "Leaving Planet Namek";
    }

    public Vec3 drawClouds(float partialTicks) {
        return super.drawClouds(partialTicks);
    }

    @SideOnly(value=Side.CLIENT)
    public Vec3 getFogColor(float par1, float par2) {
        float f2 = MathHelper.cos((float)(par1 * (float)Math.PI * 2.0f)) * 2.0f + 0.5f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f3 = 0.7529412f;
        float f4 = 0.84705883f;
        float f5 = 1.0f;
        return Vec3.createVectorHelper((double)(f3 *= f2 * 0.94f + 0.06f), (double)(f4 *= f2 * 0.94f + 0.06f), (double)(f5 *= f2 * 0.91f + 0.09f));
    }
}

