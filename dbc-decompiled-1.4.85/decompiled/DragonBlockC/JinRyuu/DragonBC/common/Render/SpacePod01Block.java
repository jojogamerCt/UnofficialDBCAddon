/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockContainer
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Render.SpacePod01TileEntity;
import JinRyuu.DragonBC.common.mod_DragonBC;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class SpacePod01Block
extends BlockContainer {
    private Class SpacePod01TileEntity;
    int port1 = 0;

    public SpacePod01Block() {
        super(Material.tnt);
        float var4 = 0.4f;
        this.setBlockBounds(-0.5f, 0.0f, -0.5f, 1.5f, 2.0f, 1.5f);
        this.SpacePod01TileEntity = SpacePod01TileEntity.class;
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }

    public void registerIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }

    public int quanityDropped(Random random) {
        return 1;
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

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k) {
        return null;
    }

    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity entity) {
        if (entity.ridingEntity == null && entity.riddenByEntity == null && entity instanceof EntityPlayerMP) {
            EntityPlayerMP thePlayer = (EntityPlayerMP)entity;
            ++this.port1;
        }
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g, float t) {
        TileEntity tile_entity = world.getTileEntity(x, y, z);
        if (tile_entity == null || player.isSneaking()) {
            return false;
        }
        player.inventory.addItemStackToInventory(new ItemStack(ItemsDBC.SpacePod01Item, 1));
        player.openGui((Object)mod_DragonBC.instance, 0, world, x, y, z);
        return true;
    }

    private void dropItems(World world, int x, int y, int z) {
        Random rand = new Random();
        TileEntity tile_entity = world.getTileEntity(x, y, z);
        if (!(tile_entity instanceof IInventory)) {
            return;
        }
        IInventory inventory = (IInventory)tile_entity;
        for (int i = 0; i < inventory.getSizeInventory(); ++i) {
            ItemStack item = inventory.getStackInSlot(i);
            if (item == null || item.stackSize <= 0) continue;
            float rx = rand.nextFloat() * 0.6f + 0.1f;
            float ry = rand.nextFloat() * 0.6f + 0.1f;
            float rz = rand.nextFloat() * 0.6f + 0.1f;
            EntityItem entity_item = new EntityItem(world, (double)((float)x + rx), (double)((float)y + ry), (double)((float)z + rz), item);
            if (item.hasTagCompound()) {
                item.setTagCompound((NBTTagCompound)item.getTagCompound().copy());
            }
            float factor = 0.5f;
            entity_item.motionX = rand.nextGaussian() * (double)factor;
            entity_item.motionY = rand.nextGaussian() * (double)factor + (double)0.2f;
            entity_item.motionZ = rand.nextGaussian() * (double)factor;
            world.spawnEntityInWorld((Entity)entity_item);
            item.stackSize = 0;
        }
    }

    public TileEntity createNewTileEntity(World world, int i) {
        return new SpacePod01TileEntity();
    }
}

