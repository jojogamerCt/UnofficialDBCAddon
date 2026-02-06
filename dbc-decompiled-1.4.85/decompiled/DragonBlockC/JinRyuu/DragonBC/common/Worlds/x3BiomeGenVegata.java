/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.ColorizerFoliage
 *  net.minecraft.world.biome.BiomeGenBase
 *  net.minecraft.world.biome.BiomeGenBase$SpawnListEntry
 */
package JinRyuu.DragonBC.common.Worlds;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Npcs.EntitySaiyan01;
import JinRyuu.DragonBC.common.Npcs.EntitySaiyan02;
import JinRyuu.DragonBC.common.Worlds.BiomeDecoratorDBC;
import JinRyuu.DragonBC.common.Worlds.BiomeGenBaseDBC;
import java.awt.Color;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.biome.BiomeGenBase;

public class x3BiomeGenVegata
extends BiomeGenBaseDBC {
    BiomeDecoratorDBC customBiomeDecorator;
    final float HUE = Color.RGBtoHSB(255, 102, 102, null)[0];

    public x3BiomeGenVegata(int par1) {
        super(par1);
        this.setBiomeName("Vegeta");
        this.topBlock = BlocksDBC.BlockNamekDirt;
        this.fillerBlock = BlocksDBC.BlockAlienStone;
        this.theBiomeDecorator = new BiomeDecoratorDBC();
        this.customBiomeDecorator = (BiomeDecoratorDBC)this.theBiomeDecorator;
        this.setColor(8368696);
        this.setMinMaxHeight(0.0f, 0.7f);
        this.setTemperatureRainfall(0.8f, 0.9f);
        this.temperature = 0.5f;
        this.waterColorMultiplier = 0xFF0000;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        if (DBCConfig.spwnrt_syn > 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntitySaiyan01.class, DBCConfig.spwnrt_syn, 1, 3));
        }
        if (DBCConfig.spwnrt_syn2 > 0) {
            this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntitySaiyan02.class, DBCConfig.spwnrt_syn2, 1, 3));
        }
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

    public BiomeGenBase setColor(int par1) {
        this.color = Color.getHSBColor(0.42f - (float)par1 * 0.05f, 0.5f + (float)par1 * 0.1f, 1.0f).getRGB();
        return this;
    }

    public int getSkyColorByTemp(float par1) {
        if ((par1 /= 3.0f) < -1.0f) {
            par1 = -1.0f;
        }
        if (par1 > 1.0f) {
            par1 = 1.0f;
        }
        return Color.getHSBColor(this.HUE, 0.5f + par1 * 0.1f, 1.0f).getRGB();
    }

    public int getBiomeFoliageColor() {
        double var1 = MathHelper.clamp_float((float)this.getFloatTemperature2(), (float)0.0f, (float)1.0f);
        double var3 = MathHelper.clamp_float((float)this.getFloatRainfall(), (float)0.0f, (float)1.0f);
        return ColorizerFoliage.getFoliageColor((double)var1, (double)var3);
    }
}

