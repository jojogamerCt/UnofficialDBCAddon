/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockContainer
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Blocks.DBCMaterial;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDragon;
import JinRyuu.DragonBC.common.Render.DragonBlock01TileEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class DragonBlock01Block
extends BlockContainer {
    private Class DragonBlock01TileEntity = DragonBlock01TileEntity.class;
    int port1 = 0;

    public DragonBlock01Block() {
        super(DBCMaterial.dragonblock);
        this.setTickRandomly(true);
        this.setHardness(0.1f);
        float var4 = 0.2f;
        this.setBlockBounds(0.5f - var4, 0.2f - var4, 0.5f - var4, 0.5f + var4, 0.2f + var4, 0.5f + var4);
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }

    public void registerIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }

    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
        Item item = ItemsDBC.ItemDragonBlock;
        DragonBlock01Block block = item instanceof ItemBlock && !this.isFlowerPot() ? Block.getBlockFromItem((Item)item) : this;
        return new ItemStack(item, 1, block.getDamageValue(world, x, y, z));
    }

    @SideOnly(value=Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
        return ItemsDBC.ItemDragonBlock;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return ItemsDBC.ItemDragonBlock;
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

    public int tickRate() {
        return 1;
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    }

    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity entity) {
        if (entity.ridingEntity == null && entity.riddenByEntity == null && entity instanceof EntityPlayerMP) {
            EntityPlayerMP thePlayer = (EntityPlayerMP)entity;
            ++this.port1;
        }
    }

    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int i, float f, float g, float t) {
        TileEntity tile_entity = par1World.getTileEntity(par2, par3, par4);
        if (tile_entity == null || player.isSneaking()) {
            return false;
        }
        if (!par1World.isRemote) {
            if (par1World.getBlock(par2 + 1, par3, par4) == this) {
                if (par1World.getBlock(par2 + 1, par3, par4 + 1) == this && par1World.getBlock(par2 + 1, par3, par4 - 1) == this && par1World.getBlock(par2 - 1, par3, par4) == this && par1World.getBlock(par2 - 1, par3, par4 - 1) == this && par1World.getBlock(par2 - 1, par3, par4 + 1) == this) {
                    if (!par1World.isRemote) {
                        EntityDragon Dragon = new EntityDragon(par1World);
                        Dragon.setLocationAndAngles(par2, par3, par4, f, 0.0f);
                        par1World.spawnEntityInWorld((Entity)Dragon);
                        par1World.playSoundEffect((double)par2, (double)par3, (double)par4, "jinryuudragonbc:dragon.makeone", 1.0f, 1.0f);
                    }
                    par1World.setBlock(par2 + 1, par3, par4, Blocks.air);
                    par1World.setBlock(par2 + 1, par3, par4 + 1, Blocks.air);
                    par1World.setBlock(par2 + 1, par3, par4 - 1, Blocks.air);
                    par1World.setBlock(par2 - 1, par3, par4, Blocks.air);
                    par1World.setBlock(par2 - 1, par3, par4 - 1, Blocks.air);
                    par1World.setBlock(par2 - 1, par3, par4 + 1, Blocks.air);
                    par1World.setBlock(par2, par3, par4, Blocks.air);
                }
            } else if (par1World.getBlock(par2, par3, par4 + 1) == this && par1World.getBlock(par2 + 1, par3, par4 + 1) == this && par1World.getBlock(par2 + 1, par3, par4 - 1) == this && par1World.getBlock(par2, par3, par4 - 1) == this && par1World.getBlock(par2 - 1, par3, par4 - 1) == this && par1World.getBlock(par2 - 1, par3, par4 + 1) == this) {
                if (!par1World.isRemote) {
                    EntityDragon Dragon = new EntityDragon(par1World);
                    Dragon.setLocationAndAngles(par2, par3, par4, f, 0.0f);
                    par1World.spawnEntityInWorld((Entity)Dragon);
                    par1World.playSoundEffect((double)par2, (double)par3, (double)par4, "jinryuudragonbc:dragon.makeone", 1.0f, 1.0f);
                }
                par1World.setBlock(par2, par3, par4 + 1, Blocks.air);
                par1World.setBlock(par2 + 1, par3, par4 + 1, Blocks.air);
                par1World.setBlock(par2 + 1, par3, par4 - 1, Blocks.air);
                par1World.setBlock(par2, par3, par4 - 1, Blocks.air);
                par1World.setBlock(par2 - 1, par3, par4 - 1, Blocks.air);
                par1World.setBlock(par2 - 1, par3, par4 + 1, Blocks.air);
                par1World.setBlock(par2, par3, par4, Blocks.air);
            }
        }
        return true;
    }

    public void breakBlock(World world, int x, int y, int z, Block i, int j) {
        super.breakBlock(world, x, y, z, i, j);
    }

    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new DragonBlock01TileEntity();
    }
}

