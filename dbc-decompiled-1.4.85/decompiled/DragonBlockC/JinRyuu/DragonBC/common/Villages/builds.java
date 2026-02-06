/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.blocks.BlocksJRMC
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.feature.WorldGenerator
 */
package JinRyuu.DragonBC.common.Villages;

import JinRyuu.JRMCore.blocks.BlocksJRMC;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class builds
extends WorldGenerator {
    protected boolean notComplete = false;
    protected int x = 0;
    protected int y = 0;
    protected int z = 0;
    protected int r = 0;
    protected int flp = 0;
    protected boolean check = false;
    public static int SizeX = 0;
    public static int SizeZ = 0;
    public static int SizeY = 0;
    public static int MidPointX = 0;
    public static int MidPointZ = 0;
    protected Block air = Blocks.air;
    protected Block b56 = BlocksJRMC.stoneSingleSlab2;
    protected Block b97 = Blocks.planks;
    protected Block c = BlocksJRMC.BlockColoredStone2;
    protected Block c2 = BlocksJRMC.BlockColoredStone2;
    protected Block s = BlocksJRMC.stoneSingleSlab2;
    protected Block f = BlocksJRMC.BlockFence2;
    protected Block stairCompactCobblestone = Blocks.stone_stairs;
    protected Block stairCompactPlanks = Blocks.oak_stairs;
    protected Block stoneSingleSlab = Blocks.stone_slab;
    protected Block woodSingleSlab = Blocks.wooden_slab;
    protected Block fence = Blocks.fence;
    protected Block planks = Blocks.planks;
    protected Block leaves = Blocks.leaves;
    protected Block glass = Blocks.glass;
    protected Block wood = Blocks.log;
    protected Block stone = Blocks.stone;
    protected Block sand = Blocks.sand;
    protected Block sandstone = Blocks.sandstone;
    protected Block grass = Blocks.grass;
    protected Block dirt = Blocks.dirt;
    protected Block oak_stairs = Blocks.oak_stairs;
    protected Block doorWood = Blocks.wooden_door;
    protected Block iron_door = Blocks.iron_door;
    protected Block iron_block = Blocks.iron_block;
    protected Block torchWood = Blocks.air;
    protected Block glowStone = Blocks.glowstone;
    protected Block bookShelf = Blocks.bookshelf;
    protected Block stoneDoubleSlab = Blocks.stonebrick;
    protected Block signWall = Blocks.wall_sign;
    protected Block blockSteel = Blocks.iron_block;
    protected Block ladder = Blocks.ladder;
    protected Block stoneBrick = Blocks.stonebrick;
    protected Block woodDoubleSlab = Blocks.planks;
    protected Block sandStone = Blocks.sandstone;
    protected Block b116 = Blocks.flower_pot;
    protected Block b121 = BlocksJRMC.BlockStairs2;
    protected Block b113 = Blocks.anvil;
    protected World w;
    protected boolean respawn = false;

    public void b(int par2, int par3, int par4, Block par5) {
        this.b(par2, par3, par4, par5, 0);
    }

    protected void b(int par2, int par3, int par4, Block par5, int par6) {
        this.setBlockAndNotifyAdequately(this.w, par2, par3, par4, par5, par6);
    }

    public boolean getNotComplete() {
        return this.notComplete;
    }

    public void setR(int i) {
        this.r = i;
    }

    public void setFlp(int i) {
        this.flp = i;
    }

    public void setCheck(boolean b) {
        this.check = b;
    }

    protected Block[] GetValidSpawnBlocks() {
        return new Block[]{Blocks.grass};
    }

    public boolean LocationIsValidSpawn(World world, int i, int j, int k) {
        this.w = world;
        int distanceToAir = 0;
        Block checkID = world.getBlock(i, j, k);
        while (checkID != Blocks.air) {
            checkID = world.getBlock(i, j + ++distanceToAir, k);
        }
        if (distanceToAir > 6) {
            return false;
        }
        Block blockID = world.getBlock(i, j += distanceToAir - 1, k);
        Block blockIDAbove = world.getBlock(i, j + 1, k);
        Block blockIDBelow = world.getBlock(i, j - 1, k);
        for (Block x : this.GetValidSpawnBlocks()) {
            if (blockIDAbove != Blocks.air) {
                return false;
            }
            if (blockID == x) {
                return true;
            }
            if (blockID != Blocks.snow || blockIDBelow != x) continue;
            return true;
        }
        return false;
    }

    public boolean generate(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_) {
        return false;
    }

    public void setWorld(World world) {
        this.w = world;
    }

    public boolean generateBuilding(World world, Random random, int i, int j, int k) {
        return false;
    }

    public void setRespawn(boolean b) {
        this.respawn = b;
    }
}

