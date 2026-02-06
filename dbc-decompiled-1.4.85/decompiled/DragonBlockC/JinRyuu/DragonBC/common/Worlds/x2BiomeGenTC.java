/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.ColorizerFoliage
 *  net.minecraft.world.biome.BiomeGenBase
 */
package JinRyuu.DragonBC.common.Worlds;

import JinRyuu.DragonBC.common.Worlds.BiomeDecoratorDBC;
import JinRyuu.DragonBC.common.Worlds.BiomeGenBaseDBC;
import java.awt.Color;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.biome.BiomeGenBase;

public class x2BiomeGenTC
extends BiomeGenBaseDBC {
    BiomeDecoratorDBC customBiomeDecorator;
    final float HUE = Color.RGBtoHSB(255, 255, 255, null)[0];

    public x2BiomeGenTC(int par1) {
        super(par1);
        this.setBiomeName("Time Chamber");
        this.topBlock = Blocks.air;
        this.fillerBlock = Blocks.air;
        this.setDisableRain();
        this.setColor(0xFFFFFF);
        this.setMinMaxHeight(0.0f, 0.0f);
        this.setTemperatureRainfall(0.8f, 0.9f);
        this.temperature = 0.5f;
        this.waterColorMultiplier = 0xFFFFFF;
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
        if ((par1 /= 3.0f) < -1.0f) {
            par1 = -1.0f;
        }
        if (par1 > 1.0f) {
            par1 = 1.0f;
        }
        return Color.WHITE.getRGB();
    }

    public int getBiomeFoliageColor() {
        double var1 = MathHelper.clamp_float((float)this.getFloatTemperature2(), (float)0.0f, (float)1.0f);
        double var3 = MathHelper.clamp_float((float)this.getFloatRainfall(), (float)0.0f, (float)1.0f);
        return ColorizerFoliage.getFoliageColor((double)var1, (double)var3);
    }
}

