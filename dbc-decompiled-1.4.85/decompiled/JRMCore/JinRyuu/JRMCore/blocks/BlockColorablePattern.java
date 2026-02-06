/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.IIcon
 *  net.minecraft.world.IBlockAccess
 */
package JinRyuu.JRMCore.blocks;

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.mod_JRMCore;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockColorablePattern
extends Block {
    @SideOnly(value=Side.CLIENT)
    private IIcon icon;
    private String tex;

    public BlockColorablePattern(String tex) {
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
        return this.icon;
    }

    public int damageDropped(int par1) {
        return par1;
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.icon = par1IconRegister.registerIcon("jinryuumodscore:" + this.tex);
    }
}

