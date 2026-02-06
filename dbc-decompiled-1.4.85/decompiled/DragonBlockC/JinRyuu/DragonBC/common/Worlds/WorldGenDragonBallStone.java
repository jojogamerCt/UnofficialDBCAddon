/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.feature.WorldGenerator
 */
package JinRyuu.DragonBC.common.Worlds;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenDragonBallStone
extends WorldGenerator {
    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5) {
        int var9;
        int var8;
        int var7 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
        if (par1World.isAirBlock(var7, var8 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4), var9 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8)) && par1World.getBlock(var7, var8 - 1, var9) == Blocks.grass && BlocksDBC.BlockDragonBallStone.canPlaceBlockAt(par1World, var7, var8, var9)) {
            par1World.setBlock(var7, var8, var9, BlocksDBC.BlockDragonBallStone, 10, 4);
        }
        return true;
    }
}

