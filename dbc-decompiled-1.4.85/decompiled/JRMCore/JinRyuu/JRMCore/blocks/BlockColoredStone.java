/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.IBlockAccess
 */
package JinRyuu.JRMCore.blocks;

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.mod_JRMCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockColoredStone
extends Block {
    @SideOnly(value=Side.CLIENT)
    private IIcon[] iconArray;
    private IIcon[] iconArrayS;
    private String tex;

    public BlockColoredStone(String tex) {
        super(Material.iron);
        this.setBlockUnbreakable();
        this.setResistance(6000000.0f);
        this.setCreativeTab(mod_JRMCore.JRMCore);
        this.tex = tex;
    }

    @SideOnly(value=Side.CLIENT)
    public int getRenderBlockPass() {
        return 0;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return JRMCoreConfig.BuildingBlocksRenderAsNormalBlock;
    }

    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        return par1 == 1 ? this.iconArray[par2 % this.iconArray.length] : (par1 == 0 ? this.iconArray[par2 % this.iconArray.length] : (par1 != 2 && par1 != 4 ? this.iconArray[par2 % this.iconArray.length] : this.iconArrayS[par2 % this.iconArrayS.length]));
    }

    public int damageDropped(int par1) {
        return par1;
    }

    public static int getBlockFromDye(int par0) {
        return ~par0 & 0xF;
    }

    public static int getDyeFromBlock(int par0) {
        return ~par0 & 0xF;
    }

    @SideOnly(value=Side.CLIENT)
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
        for (int j = 0; j < 16; ++j) {
            par3List.add(new ItemStack(par1, 1, j));
        }
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.iconArray = new IIcon[16];
        this.iconArrayS = new IIcon[16];
        for (int i = 0; i < this.iconArray.length; ++i) {
            this.iconArray[i] = par1IconRegister.registerIcon("jinryuumodscore:" + this.tex + "_" + i);
            this.iconArrayS[i] = par1IconRegister.registerIcon("jinryuumodscore:" + this.tex + "S_" + i);
        }
    }
}

