/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockContainer
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Npcs.EntitySaibaiman;
import JinRyuu.DragonBC.common.Render.SaibaiHatchedTileEntity;
import JinRyuu.DragonBC.common.mod_DragonBC;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class SaibaiHatchedBlock
extends BlockContainer {
    private Class SaibaiHatchedTileEntity = SaibaiHatchedTileEntity.class;
    int port1 = 0;

    public SaibaiHatchedBlock() {
        super(Material.rock);
        this.setTickRandomly(true);
        this.setCreativeTab(mod_DragonBC.DragonBlockC);
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }

    public void registerIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }

    public int idDropped(int i, Random random, int j) {
        return 0;
    }

    public int quanityDropped(Random random) {
        return 0;
    }

    public int getRenderType() {
        return -1;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    }

    public int tickRate(World par1World) {
        return 1;
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g, float t) {
        if (player.capabilities.isCreativeMode) {
            EntitySaibaiman Saibaiman = new EntitySaibaiman(world);
            Saibaiman.setLocationAndAngles((double)x + 0.5, y + 1, (double)z + 0.5, 0.0f, 0.0f);
            if (!world.isRemote) {
                world.spawnEntityInWorld((Entity)Saibaiman);
            }
        }
        return true;
    }

    public TileEntity createNewTileEntity(World world, int i) {
        return new SaibaiHatchedTileEntity();
    }
}

