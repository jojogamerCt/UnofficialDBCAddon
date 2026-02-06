/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.S35PacketUpdateTileEntity
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.AxisAlignedBB
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.JRMCore.JRMCoreH;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class ArtGravDevTileEntity_bkp
extends TileEntity {
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

    public void updateEntity() {
        super.updateEntity();
        if (this.gravity > 1.0f) {
            --this.gravityDevCB;
            if (this.gravityDevCB <= 0) {
                int n;
                AxisAlignedBB aabb;
                List list;
                this.gravityDevCB = 20;
                if (!this.worldObj.isRemote && !(list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb = AxisAlignedBB.getBoundingBox((double)((double)this.xCoord - (double)(n = 10)), (double)((double)this.yCoord - (double)n), (double)((double)this.zCoord - (double)n), (double)((double)this.xCoord + (double)n), (double)((double)this.yCoord + (double)n), (double)((double)this.zCoord + (double)n)))).isEmpty()) {
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

    public void writeToNBT(NBTTagCompound par1) {
        super.writeToNBT(par1);
        this.writeSyncableDataToNBT(par1);
    }

    public void readFromNBT(NBTTagCompound par1) {
        super.readFromNBT(par1);
        this.readSyncableDataFromNBT(par1);
    }

    public Packet getDescriptionPacket() {
        NBTTagCompound syncData = new NBTTagCompound();
        this.writeSyncableDataToNBT(syncData);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, syncData);
    }

    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        this.readSyncableDataFromNBT(pkt.func_148857_g());
    }
}

