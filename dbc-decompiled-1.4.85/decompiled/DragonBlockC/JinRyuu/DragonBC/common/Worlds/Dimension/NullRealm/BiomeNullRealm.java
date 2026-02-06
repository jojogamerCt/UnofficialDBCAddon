/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.ColorizerFoliage
 *  net.minecraft.world.biome.BiomeGenBase
 */
package JinRyuu.DragonBC.common.Worlds.Dimension.NullRealm;

import JinRyuu.DragonBC.common.Worlds.BiomeGenBaseDBC;
import JinRyuu.DragonBC.common.Worlds.Dimension.NullRealm.x2WorldProviderNullRealm;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeNullRealm
extends BiomeGenBaseDBC {
    public BiomeNullRealm(int par1) {
        super(par1);
        this.setBiomeName("Null Realm");
        this.topBlock = Blocks.air;
        this.fillerBlock = Blocks.air;
        this.setDisableRain();
        this.setColor(0xFFFFFF);
        this.setMinMaxHeight(0.0f, 0.0f);
        this.setTemperatureRainfall(0.8f, 0.9f);
        this.temperature = 0.5f;
        this.waterColorMultiplier = 10631373;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
    }

    public BiomeGenBase setTemperatureRainfall(float par1, float par2) {
        if (par1 > 0.1f && par1 < 0.2f) {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        }
        this.temperature = par1;
        this.rainfall = par2;
        return this;
    }

    public BiomeGenBase setMinMaxHeight(float par1, float par2) {
        this.rootHeight = par1;
        this.heightVariation = par2;
        return this;
    }

    public final int getIntTemperature2() {
        return (int)(this.temperature * 65536.0f);
    }

    public final float getFloatTemperature2() {
        return this.temperature;
    }

    public int getSkyColorByTemp(float par1) {
        return x2WorldProviderNullRealm.getBGColor();
    }

    public int getBiomeFoliageColor() {
        double var1 = MathHelper.clamp_float((float)this.getFloatTemperature2(), (float)0.0f, (float)1.0f);
        double var3 = MathHelper.clamp_float((float)this.getFloatRainfall(), (float)0.0f, (float)1.0f);
        return ColorizerFoliage.getFoliageColor((double)var1, (double)var3);
    }
}

