/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  cpw.mods.fml.common.registry.GameRegistry
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.ISidedInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemHoe
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.item.ItemTool
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.S35PacketUpdateTileEntity
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.AxisAlignedBB
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.Render.ArtGravDevBlock;
import JinRyuu.JRMCore.JRMCoreH;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class ArtGravDevTileEntity
extends TileEntity
implements ISidedInventory {
    private static final int[] slotsBottom = new int[]{0};
    private ItemStack[] furnaceItemStacks = new ItemStack[1];
    public int furnaceBurnTime;
    public int currentItemBurnTime;
    private String tileEntityName;
    public static final int itemFuel = 0;
    private float gravity = 1.0f;
    public int gravityDevCB;

    public boolean canUpdate() {
        return true;
    }

    private void writeSyncableDataToNBT(NBTTagCompound syncData) {
        syncData.setFloat("gravity", this.gravity);
    }

    private void readSyncableDataFromNBT(NBTTagCompound par1) {
        this.gravity = par1.getFloat("gravity");
    }

    public float getGravity() {
        return this.gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public Packet getDescriptionPacket() {
        NBTTagCompound syncData = new NBTTagCompound();
        this.writeSyncableDataToNBT(syncData);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, syncData);
    }

    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        this.readSyncableDataFromNBT(pkt.func_148857_g());
    }

    public int getSizeInventory() {
        return this.furnaceItemStacks.length;
    }

    public ItemStack getStackInSlot(int p_70301_1_) {
        return this.furnaceItemStacks[p_70301_1_];
    }

    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
        if (this.furnaceItemStacks[p_70298_1_] != null) {
            if (this.furnaceItemStacks[p_70298_1_].stackSize <= p_70298_2_) {
                ItemStack itemstack = this.furnaceItemStacks[p_70298_1_];
                this.furnaceItemStacks[p_70298_1_] = null;
                return itemstack;
            }
            ItemStack itemstack = this.furnaceItemStacks[p_70298_1_].splitStack(p_70298_2_);
            if (this.furnaceItemStacks[p_70298_1_].stackSize == 0) {
                this.furnaceItemStacks[p_70298_1_] = null;
            }
            return itemstack;
        }
        return null;
    }

    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
        if (this.furnaceItemStacks[p_70304_1_] != null) {
            ItemStack itemstack = this.furnaceItemStacks[p_70304_1_];
            this.furnaceItemStacks[p_70304_1_] = null;
            return itemstack;
        }
        return null;
    }

    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
        this.furnaceItemStacks[p_70299_1_] = p_70299_2_;
        if (p_70299_2_ != null && p_70299_2_.stackSize > this.getInventoryStackLimit()) {
            p_70299_2_.stackSize = this.getInventoryStackLimit();
        }
    }

    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.tileEntityName : BlocksDBC.ArtGravDevBlock.getUnlocalizedName() + ".name";
    }

    public boolean hasCustomInventoryName() {
        return this.tileEntityName != null && this.tileEntityName.length() > 0;
    }

    public void func_145951_a(String p_145951_1_) {
        this.tileEntityName = p_145951_1_;
    }

    public void readFromNBT(NBTTagCompound p_145839_1_) {
        super.readFromNBT(p_145839_1_);
        this.readSyncableDataFromNBT(p_145839_1_);
        NBTTagList nbttaglist = p_145839_1_.getTagList("Items", 10);
        this.furnaceItemStacks = new ItemStack[this.getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); ++i) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");
            if (b0 < 0 || b0 >= this.furnaceItemStacks.length) continue;
            this.furnaceItemStacks[b0] = ItemStack.loadItemStackFromNBT((NBTTagCompound)nbttagcompound1);
        }
        this.furnaceBurnTime = p_145839_1_.getShort("BurnTime");
        this.currentItemBurnTime = ArtGravDevTileEntity.getItemBurnTime(this.furnaceItemStacks[0]);
        if (p_145839_1_.hasKey("CustomName", 8)) {
            this.tileEntityName = p_145839_1_.getString("CustomName");
        }
    }

    public void writeToNBT(NBTTagCompound p_145841_1_) {
        super.writeToNBT(p_145841_1_);
        this.writeSyncableDataToNBT(p_145841_1_);
        p_145841_1_.setShort("BurnTime", (short)this.furnaceBurnTime);
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < this.furnaceItemStacks.length; ++i) {
            if (this.furnaceItemStacks[i] == null) continue;
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            nbttagcompound1.setByte("Slot", (byte)i);
            this.furnaceItemStacks[i].writeToNBT(nbttagcompound1);
            nbttaglist.appendTag((NBTBase)nbttagcompound1);
        }
        p_145841_1_.setTag("Items", (NBTBase)nbttaglist);
        if (this.hasCustomInventoryName()) {
            p_145841_1_.setString("CustomName", this.tileEntityName);
        }
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    @SideOnly(value=Side.CLIENT)
    public int getBurnTimeRemainingScaled(int p_145955_1_) {
        if (this.currentItemBurnTime == 0) {
            this.currentItemBurnTime = 200;
        }
        return this.furnaceBurnTime * p_145955_1_ / this.currentItemBurnTime;
    }

    public boolean isBurning() {
        return this.furnaceBurnTime > 0;
    }

    public void updateEntity() {
        boolean flag = this.furnaceBurnTime > 0;
        boolean flag1 = false;
        if (this.furnaceBurnTime > 0) {
            --this.furnaceBurnTime;
        }
        if (!this.worldObj.isRemote) {
            if (this.gravity > 1.0f && this.isBurning()) {
                --this.gravityDevCB;
                if (this.gravityDevCB <= 0) {
                    this.gravityDevCB = 20;
                    int n = 10;
                    AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)((double)this.xCoord - (double)n), (double)((double)this.yCoord - (double)n), (double)((double)this.zCoord - (double)n), (double)((double)this.xCoord + (double)n), (double)((double)this.yCoord + (double)n), (double)((double)this.zCoord + (double)n));
                    List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
                    if (!list.isEmpty()) {
                        for (int i = 0; i < list.size(); ++i) {
                            EntityPlayer player = (EntityPlayer)list.get(i);
                            int epoch = (int)(System.currentTimeMillis() / 1000L) + 1;
                            JRMCoreH.setInt((int)epoch, (EntityPlayer)player, (String)"jrmcGravZoneLast");
                            float G = JRMCoreH.getFloat((EntityPlayer)player, (String)"jrmcGravForce");
                            if (!(this.gravity > G)) continue;
                            JRMCoreH.setFloat((float)this.gravity, (EntityPlayer)player, (String)"jrmcGravForce");
                        }
                    }
                }
            }
            if ((this.furnaceBurnTime != 0 || this.furnaceItemStacks[0] != null) && this.furnaceBurnTime == 0 && this.canSmelt()) {
                this.currentItemBurnTime = this.furnaceBurnTime = ArtGravDevTileEntity.getItemBurnTime(this.furnaceItemStacks[0]);
                if (this.furnaceBurnTime > 0) {
                    flag1 = true;
                    if (this.furnaceItemStacks[0] != null) {
                        --this.furnaceItemStacks[0].stackSize;
                        if (this.furnaceItemStacks[0].stackSize == 0) {
                            this.furnaceItemStacks[0] = this.furnaceItemStacks[0].getItem().getContainerItem(this.furnaceItemStacks[0]);
                        }
                    }
                }
            }
            if (flag != this.furnaceBurnTime > 0) {
                flag1 = true;
                ArtGravDevBlock.updateFurnaceBlockState(this.furnaceBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
        if (flag1) {
            this.markDirty();
        }
    }

    private boolean canSmelt() {
        if (this.furnaceItemStacks[0] == null) {
            return false;
        }
        return this.gravity > 1.0f;
    }

    public void smeltItem() {
        if (this.canSmelt() && this.gravity > 1.0f) {
            --this.gravityDevCB;
            if (this.gravityDevCB <= 0) {
                this.gravityDevCB = 20;
                int n = 10;
                AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)((double)this.xCoord - (double)n), (double)((double)this.yCoord - (double)n), (double)((double)this.zCoord - (double)n), (double)((double)this.xCoord + (double)n), (double)((double)this.yCoord + (double)n), (double)((double)this.zCoord + (double)n));
                List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
                if (!list.isEmpty()) {
                    for (int i = 0; i < list.size(); ++i) {
                        EntityPlayer player = (EntityPlayer)list.get(i);
                        int epoch = (int)(System.currentTimeMillis() / 1000L) + 1;
                        JRMCoreH.setInt((int)epoch, (EntityPlayer)player, (String)"jrmcGravZoneLast");
                        float G = JRMCoreH.getFloat((EntityPlayer)player, (String)"jrmcGravForce");
                        if (!(this.gravity > G)) continue;
                        JRMCoreH.setFloat((float)this.gravity, (EntityPlayer)player, (String)"jrmcGravForce");
                    }
                }
            }
        }
    }

    public static int getItemBurnTime(ItemStack p_145952_0_) {
        if (p_145952_0_ == null) {
            return 0;
        }
        Item item = p_145952_0_.getItem();
        if (item instanceof ItemBlock && Block.getBlockFromItem((Item)item) != Blocks.air) {
            Block block = Block.getBlockFromItem((Item)item);
            if (block == Blocks.wooden_slab) {
                return 150;
            }
            if (block.getMaterial() == Material.wood) {
                return 300;
            }
            if (block == Blocks.coal_block) {
                return 16000;
            }
        }
        if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) {
            return 200;
        }
        if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) {
            return 200;
        }
        if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD")) {
            return 200;
        }
        if (item == Items.stick) {
            return 100;
        }
        if (item == Items.coal) {
            return 1600;
        }
        if (item == Items.lava_bucket) {
            return 20000;
        }
        if (item == Item.getItemFromBlock((Block)Blocks.sapling)) {
            return 100;
        }
        if (item == Items.blaze_rod) {
            return 2400;
        }
        return GameRegistry.getFuelValue((ItemStack)p_145952_0_);
    }

    public static boolean isItemFuel(ItemStack p_145954_0_) {
        return ArtGravDevTileEntity.getItemBurnTime(p_145954_0_) > 0;
    }

    public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : p_70300_1_.getDistanceSq((double)this.xCoord + 0.5, (double)this.yCoord + 0.5, (double)this.zCoord + 0.5) <= 64.0;
    }

    public void openInventory() {
    }

    public void closeInventory() {
    }

    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return p_94041_1_ == 2 ? false : (p_94041_1_ == 1 ? ArtGravDevTileEntity.isItemFuel(p_94041_2_) : true);
    }

    public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
        return slotsBottom;
    }

    public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
        return this.isItemValidForSlot(p_102007_1_, p_102007_2_);
    }

    public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
        return p_102008_3_ != 0 || p_102008_1_ != 1 || p_102008_2_.getItem() == Items.bucket;
    }
}

