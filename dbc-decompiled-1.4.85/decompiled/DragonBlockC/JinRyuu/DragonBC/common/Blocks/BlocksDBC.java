/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.GameRegistry
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraftforge.fluids.Fluid
 *  net.minecraftforge.fluids.FluidRegistry
 */
package JinRyuu.DragonBC.common.Blocks;

import JinRyuu.DragonBC.common.Blocks.BlockAlienCobbleStone;
import JinRyuu.DragonBC.common.Blocks.BlockAlienStone;
import JinRyuu.DragonBC.common.Blocks.BlockAnyBase;
import JinRyuu.DragonBC.common.Blocks.BlockAnyBase2;
import JinRyuu.DragonBC.common.Blocks.BlockCropMedMoss;
import JinRyuu.DragonBC.common.Blocks.BlockDBCSaplings;
import JinRyuu.DragonBC.common.Blocks.BlockHealingPods;
import JinRyuu.DragonBC.common.Blocks.BlockNamekDirt;
import JinRyuu.DragonBC.common.Blocks.BlockNamekGrass;
import JinRyuu.DragonBC.common.Blocks.BlockNamekLeaves;
import JinRyuu.DragonBC.common.Blocks.BlockNamekLog;
import JinRyuu.DragonBC.common.Blocks.BlockNamekStone;
import JinRyuu.DragonBC.common.Blocks.BlockOreDBC;
import JinRyuu.DragonBC.common.Blocks.BlockOreWrenai;
import JinRyuu.DragonBC.common.Blocks.BlockTCFloor;
import JinRyuu.DragonBC.common.Blocks.BlockTCPort;
import JinRyuu.DragonBC.common.Blocks.BlockWildMedMoss;
import JinRyuu.DragonBC.common.Blocks.BlockYellowCloud;
import JinRyuu.DragonBC.common.Blocks.ItemDBCSaplingsTex;
import JinRyuu.DragonBC.common.Blocks.m.ModdedBlocks;
import JinRyuu.DragonBC.common.Render.ArtGravDevBlock;
import JinRyuu.DragonBC.common.Render.DragonBlock01Block;
import JinRyuu.DragonBC.common.Render.DragonBlockNS01Block;
import JinRyuu.DragonBC.common.Render.DragonBlockNamek01Block;
import JinRyuu.DragonBC.common.Render.DragonBlockS01Block;
import JinRyuu.DragonBC.common.Render.MedPodDoor1Block;
import JinRyuu.DragonBC.common.Render.SaibaiHatchedBlock;
import JinRyuu.DragonBC.common.Render.SpacePod01Block;
import JinRyuu.DragonBC.common.Render.namekian_throneBlock;
import JinRyuu.DragonBC.common.Render.ppBlock;
import JinRyuu.DragonBC.common.mod_DragonBC;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class BlocksDBC {
    public static Block BlockAlienStone;
    public static Block BlockAlienCobbleStone;
    public static Block BlockNamekDragonBallStone;
    public static Block BlockNamekDragonBall;
    public static Block BlockDragonBallStone;
    public static Block BlockDragonBall;
    public static Block BlockOreWrenai;
    public static Block BlockNamekGrass;
    public static Block BlockNamekDirt;
    public static Block BlockNamekStone;
    public static Block BlockNamekLog;
    public static Block BlockNamekLeaves;
    public static Block BlockKiFire;
    public static Block AuraDyn;
    public static Block BlockHellStone;
    public static Block BlockYellowCloud;
    public static Block BlockInvisWall;
    public static Block BlockTCPort;
    public static Block BlockTCFloor;
    public static Fluid medicalLiquid;
    public static Block BlockHealingPods;
    public static Block BlockHealingPodDoor;
    public static Block BlockCropMedMoss;
    public static Block BlockWildMedMoss;
    public static Block SpacePod01Block;
    public static Block SaibaiHatched;
    public static Block ArtGravDevBlock;
    public static BlockDBCSaplings BlockNamekSapling;
    public static Block DBCmobSpawner;
    public static String mod;
    public static Block ppBlock;
    public static Block BlockOreJJay;
    public static Block BlockOreDlog;
    public static Block BlockOreLehnori;
    public static Block BlockOreDnomaid;
    public static String[] BlockOWnams;
    public static Block[] BlockOWtyps;
    public static Block[] BlockOW;
    public static final int BlockJJay = 0;
    public static final int BlockDlog = 1;
    public static final int BlockLehnori = 2;
    public static final int BlockDnomaid = 3;
    public static Block namekian_throneBlock;
    private static int BlockKachiKachin_n;
    public static Block[] BlockKachiKachin;
    private static int BlockKachin_n;
    public static Block[] BlockKachin;

    public static void init() {
        int i;
        FluidRegistry.registerFluid((Fluid)medicalLiquid);
        BlockAlienStone = new BlockAlienStone().setBlockName("BlockAlienStone").setBlockTextureName(mod + "BlockAlienStone");
        BlockAlienCobbleStone = new BlockAlienCobbleStone().setBlockName("BlockAlienCobbleStone").setBlockTextureName(mod + "BlockAlienCobbleStone");
        BlockNamekDragonBallStone = new DragonBlockNS01Block().setBlockName("BlockNamekDragonBallStone").setBlockTextureName(mod + "BlockNamekDragonBallStone");
        BlockNamekDragonBall = new DragonBlockNamek01Block().setBlockName("BlockNamekDragonBall").setBlockTextureName(mod + "BlockNamekDragonBall");
        BlockDragonBallStone = new DragonBlockS01Block().setBlockName("BlockDragonBallStone").setBlockTextureName(mod + "BlockDragonBallStone");
        BlockDragonBall = new DragonBlock01Block().setBlockName("BlockDragonBall").setBlockTextureName(mod + "BlockDragonBall");
        BlockOreWrenai = new BlockOreWrenai().setBlockName("BlockOreWrenai").setBlockTextureName(mod + "BlockOreWrenai");
        BlockNamekGrass = new BlockNamekGrass().setHardness(0.6f).setStepSound(Block.soundTypeGrass).setBlockName("BlockNamekGrass").setBlockTextureName(mod + "BlockNamekGrass");
        BlockNamekDirt = new BlockNamekDirt().setHardness(0.5f).setStepSound(Block.soundTypeGravel).setBlockName("BlockNamekDirt").setBlockTextureName(mod + "BlockNamekDirt");
        BlockNamekStone = new BlockNamekStone().setHardness(1.5f).setStepSound(Block.soundTypeStone).setBlockName("BlockNamekStone").setBlockTextureName(mod + "BlockNamekStone");
        BlockNamekLog = new BlockNamekLog().setHardness(2.0f).setStepSound(Block.soundTypeWood).setBlockName("BlockNamekLog").setBlockTextureName(mod + "BlockNamekLog");
        BlockNamekLeaves = new BlockNamekLeaves(52).setHardness(0.2f).setLightOpacity(1).setStepSound(Block.soundTypeGrass).setBlockName("BlockNamekLeaves").setBlockTextureName(mod + "BlockNamekLeaves");
        BlockNamekSapling = (BlockDBCSaplings)new BlockDBCSaplings().setHardness(0.0f).setStepSound(Block.soundTypeGrass).setBlockName("Sapling");
        BlockOreJJay = new BlockOreDBC(Item.ToolMaterial.WOOD.getHarvestLevel()).setBlockName("JJayore").setBlockTextureName(mod + "JJayore");
        BlockOreDlog = new BlockOreDBC(Item.ToolMaterial.STONE.getHarvestLevel()).setBlockName("Dlogore").setBlockTextureName(mod + "Dlogore");
        BlockOreLehnori = new BlockOreDBC(Item.ToolMaterial.STONE.getHarvestLevel()).setBlockName("Lehnoriore").setBlockTextureName(mod + "Lehnoriore");
        BlockOreDnomaid = new BlockOreDBC(Item.ToolMaterial.IRON.getHarvestLevel()).setBlockName("Dnomaidore").setBlockTextureName(mod + "Dnomaidore");
        for (i = 0; i < BlockOW.length; ++i) {
            BlocksDBC.BlockOW[i] = BlockOWtyps[i].setBlockName(BlockOWnams[i]).setBlockTextureName(mod + BlockOWnams[i]);
        }
        BlockYellowCloud = new BlockYellowCloud().setHardness(5.0f).setStepSound(Block.soundTypeGrass).setBlockName("BlockYellowCloud").setBlockTextureName(mod + "BlockYellowCloud");
        BlockTCPort = new BlockTCPort().setBlockName("BlockTCPort").setBlockTextureName(mod + "BlockTCPort");
        BlockTCFloor = new BlockTCFloor().setHardness(50.0f).setResistance(2000.0f).setStepSound(Block.soundTypeStone).setBlockName("BlockTCFloor").setBlockTextureName(mod + "BlockTCFloor");
        BlockHealingPods = new BlockHealingPods(medicalLiquid, Material.water).setBlockName("BlockHealingPods");
        BlockHealingPodDoor = new MedPodDoor1Block().setHardness(50.0f).setResistance(2000.0f).setBlockName("BlockHealingPodDoor");
        BlockCropMedMoss = new BlockCropMedMoss().setBlockName("BlockCropMedMoss");
        BlockWildMedMoss = new BlockWildMedMoss().setBlockName("BlockWildMedMoss");
        SpacePod01Block = new SpacePod01Block().setHardness(0.2f).setLightOpacity(1).setStepSound(Block.soundTypeGrass).setBlockName("SpacePod01Block").setBlockTextureName(mod + "SpacePod01Block");
        SaibaiHatched = new SaibaiHatchedBlock().setHardness(0.2f).setLightOpacity(5).setStepSound(Block.soundTypeGrass).setBlockName("SaibaiHatched").setBlockTextureName(mod + "SaibaiHatched");
        ArtGravDevBlock = new ArtGravDevBlock().setHardness(0.2f).setLightOpacity(5).setStepSound(Block.soundTypeMetal).setBlockName("ArtGravDevBlock").setBlockTextureName(mod + "ArtGravDevBlock");
        ppBlock = new ppBlock().setStepSound(Block.soundTypeMetal).setBlockName("ppBlock").setBlockTextureName(mod + "ppBlock");
        namekian_throneBlock = new namekian_throneBlock().setBlockName("namekian_throneBlock").setBlockTextureName(mod + "namekian_throneBlock").setCreativeTab(mod_DragonBC.DragonBlockC);
        for (i = 0; i < BlockKachin_n; ++i) {
            BlocksDBC.BlockKachin[i] = new BlockAnyBase2(-1).setHardness(50.0f).setResistance(2000.0f).setBlockName("katchin_block" + i).setBlockTextureName(mod + "katchin_block" + i);
        }
        for (i = 0; i < BlockKachiKachin_n; ++i) {
            BlocksDBC.BlockKachiKachin[i] = new BlockAnyBase2(-1).setHardness(-1.0f).setResistance(6000000.0f).setBlockName("kachi_katchin_block" + i).setBlockTextureName(mod + "kachi_katchin_block" + i);
        }
    }

    public static void register() {
        int i;
        GameRegistry.registerBlock((Block)BlockTCPort, (String)BlockTCPort.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockTCFloor, (String)BlockTCFloor.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockYellowCloud, (String)BlockYellowCloud.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockAlienStone, (String)BlockAlienStone.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockAlienCobbleStone, (String)BlockAlienCobbleStone.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockNamekDragonBallStone, (String)BlockNamekDragonBallStone.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockNamekDragonBall, (String)BlockNamekDragonBall.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockDragonBallStone, (String)BlockDragonBallStone.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockDragonBall, (String)BlockDragonBall.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockOreWrenai, (String)BlockOreWrenai.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockNamekGrass, (String)BlockNamekGrass.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockNamekLog, (String)BlockNamekLog.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockNamekDirt, (String)BlockNamekDirt.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockNamekStone, (String)BlockNamekStone.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockNamekLeaves, (String)BlockNamekLeaves.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockNamekSapling, ItemDBCSaplingsTex.class, (String)BlockNamekSapling.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockOreJJay, (String)BlockOreJJay.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockOreDlog, (String)BlockOreDlog.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockOreLehnori, (String)BlockOreLehnori.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockOreDnomaid, (String)BlockOreDnomaid.getUnlocalizedName());
        for (i = 0; i < BlockOW.length; ++i) {
            GameRegistry.registerBlock((Block)BlockOW[i], (String)BlockOW[i].getUnlocalizedName());
        }
        GameRegistry.registerBlock((Block)BlockHealingPods, (String)BlockHealingPods.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockHealingPodDoor, (String)BlockHealingPodDoor.getUnlocalizedName());
        GameRegistry.registerBlock((Block)SpacePod01Block, (String)SpacePod01Block.getUnlocalizedName());
        GameRegistry.registerBlock((Block)SaibaiHatched, (String)SaibaiHatched.getUnlocalizedName());
        GameRegistry.registerBlock((Block)ArtGravDevBlock, (String)ArtGravDevBlock.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockCropMedMoss, (String)BlockCropMedMoss.getUnlocalizedName());
        GameRegistry.registerBlock((Block)BlockWildMedMoss, (String)BlockWildMedMoss.getUnlocalizedName());
        GameRegistry.registerBlock((Block)ppBlock, (String)ppBlock.getUnlocalizedName());
        GameRegistry.registerBlock((Block)namekian_throneBlock, (String)namekian_throneBlock.getUnlocalizedName());
        for (i = 0; i < BlockKachin_n; ++i) {
            GameRegistry.registerBlock((Block)BlockKachin[i], (String)BlockKachin[i].getUnlocalizedName());
        }
        for (i = 0; i < BlockKachiKachin_n; ++i) {
            GameRegistry.registerBlock((Block)BlockKachiKachin[i], (String)BlockKachiKachin[i].getUnlocalizedName());
        }
        ModdedBlocks.init();
    }

    static {
        medicalLiquid = new Fluid("medicalliquid");
        mod = "jinryuudragonbc:tile.";
        BlockOWnams = new String[]{"JJayblock", "Dlogblock", "Lehnoriblock", "Dnomaidblock"};
        BlockOWtyps = new Block[]{new BlockAnyBase(Item.ToolMaterial.WOOD.getHarvestLevel()), new BlockAnyBase(Item.ToolMaterial.STONE.getHarvestLevel()), new BlockAnyBase(Item.ToolMaterial.STONE.getHarvestLevel()), new BlockAnyBase(Item.ToolMaterial.IRON.getHarvestLevel())};
        BlockOW = new Block[BlockOWnams.length];
        BlockKachiKachin_n = 16;
        BlockKachiKachin = new Block[BlockKachiKachin_n];
        BlockKachin_n = 3;
        BlockKachin = new Block[BlockKachin_n];
    }
}

