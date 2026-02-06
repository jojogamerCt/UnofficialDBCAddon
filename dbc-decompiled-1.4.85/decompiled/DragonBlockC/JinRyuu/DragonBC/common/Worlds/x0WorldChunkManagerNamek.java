/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.crash.CrashReport
 *  net.minecraft.crash.CrashReportCategory
 *  net.minecraft.util.ReportedException
 *  net.minecraft.world.ChunkPosition
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldType
 *  net.minecraft.world.biome.BiomeCache
 *  net.minecraft.world.biome.BiomeGenBase
 *  net.minecraft.world.biome.WorldChunkManager
 *  net.minecraft.world.gen.layer.GenLayer
 *  net.minecraft.world.gen.layer.IntCache
 */
package JinRyuu.DragonBC.common.Worlds;

import JinRyuu.DragonBC.common.Worlds.x0GenLayerDBCNamek;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class x0WorldChunkManagerNamek
extends WorldChunkManager {
    private GenLayer genBiomes;
    private GenLayer biomeIndexLayer;
    private BiomeCache biomeCache = new BiomeCache((WorldChunkManager)this);
    private List<BiomeGenBase> biomesToSpawnIn = new ArrayList<BiomeGenBase>();

    public x0WorldChunkManagerNamek() {
        this.biomesToSpawnIn.addAll(allowedBiomes);
    }

    public x0WorldChunkManagerNamek(long seed, WorldType worldType) {
        this();
        GenLayer[] agenlayer = x0GenLayerDBCNamek.makeTheWorld(seed, worldType);
        agenlayer = this.getModdedBiomeGenerators(worldType, seed, agenlayer);
        this.genBiomes = agenlayer[0];
        this.biomeIndexLayer = agenlayer[1];
    }

    public x0WorldChunkManagerNamek(World world) {
        this(world.getSeed(), world.getWorldInfo().getTerrainType());
    }

    public List<BiomeGenBase> getBiomesToSpawnIn() {
        return this.biomesToSpawnIn;
    }

    public BiomeGenBase getBiomeGenAt(int x, int z) {
        return this.biomeCache.getBiomeGenAt(x, z);
    }

    public float[] getRainfall(float[] listToReuse, int x, int z, int width, int length) {
        IntCache.resetIntCache();
        if (listToReuse == null || listToReuse.length < width * length) {
            listToReuse = new float[width * length];
        }
        int[] aint = this.biomeIndexLayer.getInts(x, z, width, length);
        for (int i1 = 0; i1 < width * length; ++i1) {
            try {
                float f = (float)BiomeGenBase.getBiome((int)aint[i1]).getIntRainfall() / 65536.0f;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                listToReuse[i1] = f;
                continue;
            }
            catch (Throwable throwable) {
                CrashReport crashreport = CrashReport.makeCrashReport((Throwable)throwable, (String)"Invalid Biome id");
                CrashReportCategory crashreportcategory = crashreport.makeCategory("DownfallBlock");
                crashreportcategory.addCrashSection("biome id", (Object)i1);
                crashreportcategory.addCrashSection("downfalls[] size", (Object)listToReuse.length);
                crashreportcategory.addCrashSection("x", (Object)x);
                crashreportcategory.addCrashSection("z", (Object)z);
                crashreportcategory.addCrashSection("w", (Object)width);
                crashreportcategory.addCrashSection("h", (Object)length);
                throw new ReportedException(crashreport);
            }
        }
        return listToReuse;
    }

    @SideOnly(value=Side.CLIENT)
    public float getTemperatureAtHeight(float par1, int par2) {
        return par1;
    }

    public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] par1ArrayOfBiomeGenBase, int par2, int par3, int par4, int par5) {
        IntCache.resetIntCache();
        if (par1ArrayOfBiomeGenBase == null || par1ArrayOfBiomeGenBase.length < par4 * par5) {
            par1ArrayOfBiomeGenBase = new BiomeGenBase[par4 * par5];
        }
        int[] aint = this.genBiomes.getInts(par2, par3, par4, par5);
        try {
            for (int i = 0; i < par4 * par5; ++i) {
                par1ArrayOfBiomeGenBase[i] = BiomeGenBase.getBiome((int)aint[i]);
            }
            return par1ArrayOfBiomeGenBase;
        }
        catch (Throwable throwable) {
            CrashReport crashreport = CrashReport.makeCrashReport((Throwable)throwable, (String)"Invalid Biome id");
            CrashReportCategory crashreportcategory = crashreport.makeCategory("RawBiomeBlock");
            crashreportcategory.addCrashSection("biomes[] size", (Object)par1ArrayOfBiomeGenBase.length);
            crashreportcategory.addCrashSection("x", (Object)par2);
            crashreportcategory.addCrashSection("z", (Object)par3);
            crashreportcategory.addCrashSection("w", (Object)par4);
            crashreportcategory.addCrashSection("h", (Object)par5);
            throw new ReportedException(crashreport);
        }
    }

    public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase[] oldBiomeList, int x, int z, int width, int depth) {
        return this.getBiomeGenAt(oldBiomeList, x, z, width, depth, true);
    }

    public BiomeGenBase[] getBiomeGenAt(BiomeGenBase[] listToReuse, int x, int y, int width, int length, boolean cacheFlag) {
        IntCache.resetIntCache();
        if (listToReuse == null || listToReuse.length < width * length) {
            listToReuse = new BiomeGenBase[width * length];
        }
        if (cacheFlag && width == 16 && length == 16 && (x & 0xF) == 0 && (y & 0xF) == 0) {
            BiomeGenBase[] abiomegenbase1 = this.biomeCache.getCachedBiomes(x, y);
            System.arraycopy(abiomegenbase1, 0, listToReuse, 0, width * length);
            return listToReuse;
        }
        int[] aint = this.biomeIndexLayer.getInts(x, y, width, length);
        for (int i = 0; i < width * length; ++i) {
            listToReuse[i] = BiomeGenBase.getBiome((int)aint[i]);
        }
        return listToReuse;
    }

    public boolean areBiomesViable(int x, int y, int z, List par4List) {
        IntCache.resetIntCache();
        int l = x - z >> 2;
        int i1 = y - z >> 2;
        int j1 = x + z >> 2;
        int k1 = y + z >> 2;
        int l1 = j1 - l + 1;
        int i2 = k1 - i1 + 1;
        int[] aint = this.genBiomes.getInts(l, i1, l1, i2);
        try {
            for (int j2 = 0; j2 < l1 * i2; ++j2) {
                BiomeGenBase biomegenbase = BiomeGenBase.getBiome((int)aint[j2]);
                if (par4List.contains(biomegenbase)) continue;
                return false;
            }
            return true;
        }
        catch (Throwable throwable) {
            CrashReport crashreport = CrashReport.makeCrashReport((Throwable)throwable, (String)"Invalid Biome id");
            CrashReportCategory crashreportcategory = crashreport.makeCategory("Layer");
            crashreportcategory.addCrashSection("Layer", (Object)this.genBiomes.toString());
            crashreportcategory.addCrashSection("x", (Object)x);
            crashreportcategory.addCrashSection("z", (Object)y);
            crashreportcategory.addCrashSection("radius", (Object)z);
            crashreportcategory.addCrashSection("allowed", (Object)par4List);
            throw new ReportedException(crashreport);
        }
    }

    public ChunkPosition findBiomePosition(int x, int y, int z, List par4List, Random random) {
        IntCache.resetIntCache();
        int l = x - z >> 2;
        int i1 = y - z >> 2;
        int j1 = x + z >> 2;
        int k1 = y + z >> 2;
        int l1 = j1 - l + 1;
        int i2 = k1 - i1 + 1;
        int[] aint = this.genBiomes.getInts(l, i1, l1, i2);
        ChunkPosition chunkposition = null;
        int j2 = 0;
        for (int k2 = 0; k2 < l1 * i2; ++k2) {
            int l2 = l + k2 % l1 << 2;
            int i3 = i1 + k2 / l1 << 2;
            BiomeGenBase biomegenbase = BiomeGenBase.getBiome((int)aint[k2]);
            if (!par4List.contains(biomegenbase) || chunkposition != null && random.nextInt(j2 + 1) != 0) continue;
            chunkposition = new ChunkPosition(l2, 0, i3);
            ++j2;
        }
        return chunkposition;
    }

    public void cleanupCache() {
        this.biomeCache.cleanupCache();
    }
}

