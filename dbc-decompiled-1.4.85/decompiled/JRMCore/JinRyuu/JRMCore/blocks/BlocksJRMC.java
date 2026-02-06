/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.GameRegistry
 *  net.minecraft.block.Block
 */
package JinRyuu.JRMCore.blocks;

import JinRyuu.JRMCore.blocks.BlockBarrier;
import JinRyuu.JRMCore.blocks.BlockBorder;
import JinRyuu.JRMCore.blocks.BlockColorablePattern;
import JinRyuu.JRMCore.blocks.BlockColoredStone;
import JinRyuu.JRMCore.blocks.BlockJRMCFence;
import JinRyuu.JRMCore.blocks.BlockJRMCHalfSlab;
import JinRyuu.JRMCore.blocks.BlockJRMCStairs;
import JinRyuu.JRMCore.blocks.BlockJRMCStep;
import JinRyuu.JRMCore.blocks.ItemBlockColoredStone;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlocksJRMC {
    public static BlockJRMCHalfSlab stoneSingleSlab;
    public static BlockJRMCHalfSlab stoneDoubleSlab;
    public static Block BlockColoredStone;
    public static Block BlockFence;
    public static Block BlockStairs;
    public static Block BlockColoredStone2;
    public static BlockJRMCHalfSlab stoneSingleSlab2;
    public static Block BlockFence2;
    public static Block BlockStairs2;
    private static final int BlockColorableStonePattern_number = 5;
    public static BlockJRMCHalfSlab[][] BlockColorableStonePattern_slab;
    public static Block[][] BlockColorableStonePattern_fence;
    public static Block[][] BlockColorableStonePattern_stairs;
    public static Block[][] BlockColorableStonePattern;
    public static String mod;
    public static Block BlockBarrier;
    public static Block BlockBorder;

    public static void init() {
        BlockColoredStone = new BlockColoredStone("BlockColoredStone").setStepSound(Block.soundTypeStone).setBlockName("BlockColoredStone").setBlockTextureName(mod + "BlockColoredStone");
        stoneSingleSlab = (BlockJRMCHalfSlab)new BlockJRMCStep(false, "BlockColoredStone_8", "BlockColoredStoneS_8").setStepSound(Block.soundTypeStone).setBlockName("stoneSingleSlab").setBlockTextureName(mod + "stoneSingleSlab");
        BlockFence = new BlockJRMCFence("BlockColoredStone_0").setStepSound(Block.soundTypeStone).setBlockName("BlockFence").setBlockTextureName(mod + "BlockFence");
        BlockStairs = new BlockJRMCStairs(BlockColoredStone, 0, "BlockColoredStone_0").setStepSound(Block.soundTypeStone).setBlockName("BlockStairs").setBlockTextureName(mod + "BlockStairs");
        BlockColoredStone2 = new BlockColoredStone("BlockColoredStone2").setStepSound(Block.soundTypeStone).setBlockName("BlockColoredStone2").setBlockTextureName(mod + "BlockColoredStone2");
        stoneSingleSlab2 = (BlockJRMCHalfSlab)new BlockJRMCStep(false, "BlockColoredStone2_8", "BlockColoredStone2S_8").setStepSound(Block.soundTypeStone).setBlockName("stoneSingleSlab2").setBlockTextureName(mod + "stoneSingleSlab2");
        BlockFence2 = new BlockJRMCFence("BlockColoredStone2_0").setStepSound(Block.soundTypeStone).setBlockName("BlockFence2").setBlockTextureName(mod + "BlockFence2");
        BlockStairs2 = new BlockJRMCStairs(BlockColoredStone2, 0, "BlockColoredStone2_0").setStepSound(Block.soundTypeStone).setBlockName("BlockStairs2").setBlockTextureName(mod + "BlockStairs2");
        for (int i = 0; i < 5; ++i) {
            int j;
            String name = "Colorable Stone Pattern" + (i + 1);
            for (j = 0; j < 16; ++j) {
                name = "Colorable Stone Pattern" + (i + 1) + "_" + j;
                BlocksJRMC.BlockColorableStonePattern[i][j] = new BlockColorablePattern(name).setStepSound(Block.soundTypeStone).setBlockName(name).setBlockTextureName(mod + name);
                BlocksJRMC.BlockColorableStonePattern_slab[i][j] = (BlockJRMCHalfSlab)new BlockJRMCStep(false, name, name).setStepSound(Block.soundTypeStone).setBlockName(name + "Slab").setBlockTextureName(mod + name);
            }
            for (j = 0; j < 16; ++j) {
                name = "Colorable Stone Pattern" + (i + 1) + "_" + j;
                BlocksJRMC.BlockColorableStonePattern[i][j] = new BlockColorablePattern(name).setStepSound(Block.soundTypeStone).setBlockName(name).setBlockTextureName(mod + name);
                BlocksJRMC.BlockColorableStonePattern_fence[i][j] = new BlockJRMCFence(name).setStepSound(Block.soundTypeStone).setBlockName(name + "Fence").setBlockTextureName(mod + name);
            }
            for (j = 0; j < 16; ++j) {
                name = "Colorable Stone Pattern" + (i + 1) + "_" + j;
                BlocksJRMC.BlockColorableStonePattern[i][j] = new BlockColorablePattern(name).setStepSound(Block.soundTypeStone).setBlockName(name).setBlockTextureName(mod + name);
                BlocksJRMC.BlockColorableStonePattern_stairs[i][j] = new BlockJRMCStairs(BlockColorableStonePattern[i][j], 0, name).setStepSound(Block.soundTypeStone).setBlockName(name + "Stairs").setBlockTextureName(mod + name);
            }
        }
        BlockBarrier = new BlockBarrier().setBlockUnbreakable().setStepSound(Block.soundTypeStone).setBlockName("BlockBarrier").setBlockTextureName(mod + "BlockBarrier");
        BlockBorder = new BlockBorder().setBlockUnbreakable().setStepSound(Block.soundTypeStone).setBlockName("BlockBorder").setBlockTextureName(mod + "BlockBorder");
    }

    public static void register() {
        GameRegistry.registerBlock((Block)BlockColoredStone, ItemBlockColoredStone.class, (String)BlockColoredStone.getUnlocalizedName());
        GameRegistry.registerBlock((Block)stoneSingleSlab, (String)stoneSingleSlab.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockFence, (String)BlockFence.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockStairs, (String)BlockStairs.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockColoredStone2, ItemBlockColoredStone.class, (String)BlockColoredStone2.getUnlocalizedName());
        GameRegistry.registerBlock((Block)stoneSingleSlab2, (String)stoneSingleSlab2.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockFence2, (String)BlockFence2.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockStairs2, (String)BlockStairs2.getUnlocalizedName());
        for (int i = 0; i < 5; ++i) {
            int j;
            for (j = 0; j < 16; ++j) {
                GameRegistry.registerBlock((Block)BlockColorableStonePattern[i][j], (String)BlockColorableStonePattern[i][j].getUnlocalizedName());
            }
            for (j = 0; j < 16; ++j) {
                GameRegistry.registerBlock((Block)BlockColorableStonePattern_slab[i][j], (String)BlockColorableStonePattern_slab[i][j].getUnlocalizedName());
            }
            for (j = 0; j < 16; ++j) {
                GameRegistry.registerBlock((Block)BlockColorableStonePattern_fence[i][j], (String)BlockColorableStonePattern_fence[i][j].getUnlocalizedName());
            }
            for (j = 0; j < 16; ++j) {
                GameRegistry.registerBlock((Block)BlockColorableStonePattern_stairs[i][j], (String)BlockColorableStonePattern_stairs[i][j].getUnlocalizedName());
            }
        }
        GameRegistry.registerBlock((Block)BlockBarrier, (String)BlockBarrier.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockBorder, (String)BlockBorder.getUnlocalizedName());
    }

    static {
        BlockColorableStonePattern_slab = new BlockJRMCHalfSlab[5][16];
        BlockColorableStonePattern_fence = new Block[5][16];
        BlockColorableStonePattern_stairs = new Block[5][16];
        BlockColorableStonePattern = new Block[5][16];
        mod = "jinryuumodscore:tile.";
    }
}

