/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.blocks.BlockJRMCCrops
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.util.IIcon
 */
package JinRyuu.DragonBC.common.Blocks;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.blocks.BlockJRMCCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockWildMedMoss
extends BlockJRMCCrops {
    public BlockWildMedMoss() {
        this.maxGrowthStage = 1;
        this.setBlockTextureName(JRMCoreH.tjdbcAssts + ":BlockCropMedMoss2");
    }

    protected boolean canPlaceBlockOn(Block parBlock) {
        return parBlock == Blocks.grass || parBlock == BlocksDBC.BlockNamekGrass;
    }

    public int quantityDropped(int parMetadata, int parFortune, Random parRand) {
        return parRand.nextInt(2) + 1;
    }

    public Item getItemDropped(int parMetadata, Random parRand, int parFortune) {
        return ItemsDBC.ItemMedMoss;
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister) {
        this.iIcon = new IIcon[this.maxGrowthStage + 1];
        this.iIcon[0] = parIIconRegister.registerIcon(JRMCoreH.tjdbcAssts + ":BlockCropMedMoss2");
        this.iIcon[1] = parIIconRegister.registerIcon(JRMCoreH.tjdbcAssts + ":BlockCropMedMoss3");
    }
}

