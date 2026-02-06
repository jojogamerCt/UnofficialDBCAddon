/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.biome.BiomeGenBase
 *  net.minecraft.world.gen.layer.GenLayer
 *  net.minecraft.world.gen.layer.IntCache
 */
package JinRyuu.DragonBC.common.Worlds;

import JinRyuu.DragonBC.common.Worlds.BiomeGenBaseDBC;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class x1GenLayerOWBiomes
extends GenLayer {
    protected BiomeGenBase[] allowedBiomes = new BiomeGenBase[]{BiomeGenBaseDBC.OtherW, BiomeGenBaseDBC.OtherW2, BiomeGenBaseDBC.OtherW3, BiomeGenBaseDBC.OtherW4};

    public x1GenLayerOWBiomes(long seed) {
        super(seed);
    }

    public x1GenLayerOWBiomes(long seed, GenLayer genlayer) {
        super(seed);
        this.parent = genlayer;
    }

    public int[] getInts(int x, int z, int width, int depth) {
        int[] dest = IntCache.getIntCache((int)(width * depth));
        for (int dz = 0; dz < depth; ++dz) {
            for (int dx = 0; dx < width; ++dx) {
                this.initChunkSeed(dx + x, dz + z);
                dest[dx + dz * width] = this.allowedBiomes[this.nextInt((int)this.allowedBiomes.length)].biomeID;
            }
        }
        return dest;
    }
}

