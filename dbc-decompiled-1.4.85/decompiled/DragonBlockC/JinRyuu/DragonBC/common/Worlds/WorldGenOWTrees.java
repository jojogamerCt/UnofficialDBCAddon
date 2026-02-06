/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.init.Blocks
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.feature.WorldGenerator
 */
package JinRyuu.DragonBC.common.Worlds;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenOWTrees
extends WorldGenerator {
    private final int minTreeHeight;
    private final boolean growVines;
    private final int metaWood;
    private final int metaLeaves;

    public WorldGenOWTrees(boolean par1) {
        this(par1, 8, 0, 0, false);
    }

    public WorldGenOWTrees(boolean par1, int par2, int par3, int par4, boolean par5) {
        super(par1);
        this.minTreeHeight = par2;
        this.metaWood = par3;
        this.metaLeaves = par4;
        this.growVines = par5;
    }

    public boolean generate(World world, Random rand, int i, int j, int k) {
        int height = 4 + rand.nextInt(4);
        int sizex = 3 + rand.nextInt(5);
        int sizez = 3 + rand.nextInt(5);
        int sxh = sizex / 2;
        int szh = sizez / 2;
        if (world.isAirBlock(i, j, k) && !world.isAirBlock(i, j - 1, k)) {
            int sizey = 4 + rand.nextInt(4);
            for (int i2 = 0; i2 < sizex; ++i2) {
                for (int j2 = 0; j2 < sizez; ++j2) {
                    for (int k2 = 0; k2 < sizey; ++k2) {
                        this.setBlock(world, i + i2 - sxh, j + height - 3 + k2, k + j2 - szh, (Block)Blocks.leaves);
                    }
                }
            }
            for (int k2 = 0; k2 < height; ++k2) {
                this.setBlock(world, i + 0, j + k2, k + 0, Blocks.log);
            }
        }
        return true;
    }

    private void setBlock(World world, int i, int j, int k, Block b) {
        if (world.checkChunksExist(i, j, k, i, j, k)) {
            this.setBlockAndNotifyAdequately(world, i, j, k, b, 0);
        }
    }

    protected boolean func_150523_a(Block p_150523_1_) {
        return p_150523_1_.getMaterial() == Material.air || p_150523_1_.getMaterial() == Material.leaves || p_150523_1_ == BlocksDBC.BlockNamekGrass || p_150523_1_ == BlocksDBC.BlockNamekGrass || p_150523_1_ == BlocksDBC.BlockNamekLog || p_150523_1_ == BlocksDBC.BlockNamekLog || p_150523_1_ == Blocks.sapling || p_150523_1_ == Blocks.vine;
    }

    public void func_150524_b(World p_150524_1_, Random p_150524_2_, int p_150524_3_, int p_150524_4_, int p_150524_5_) {
    }

    protected boolean isReplaceable(World world, int x, int y, int z) {
        Block block = world.getBlock(x, y, z);
        return block.isAir((IBlockAccess)world, x, y, z) || block.isLeaves((IBlockAccess)world, x, y, z) || block.isWood((IBlockAccess)world, x, y, z) || this.func_150523_a(block);
    }
}

