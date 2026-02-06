/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.play.server.S35PacketUpdateTileEntity
 *  net.minecraft.tileentity.TileEntity
 */
package JinRyuu.DragonBC.common.Render;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class ppTileEntity
extends TileEntity {
    private boolean f = false;
    private float gravity = 1.0f;

    public boolean getF() {
        return this.f;
    }

    public void setF() {
        this.f = true;
    }

    public boolean canUpdate() {
        return true;
    }

    private void writeSyncableDataToNBT(NBTTagCompound syncData) {
        syncData.setBoolean("f", this.f);
    }

    private void readSyncableDataFromNBT(NBTTagCompound par1) {
        this.f = par1.getBoolean("f");
    }

    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        this.readSyncableDataFromNBT(pkt.func_148857_g());
    }

    public void readFromNBT(NBTTagCompound p_145839_1_) {
        super.readFromNBT(p_145839_1_);
        this.readSyncableDataFromNBT(p_145839_1_);
    }

    public void writeToNBT(NBTTagCompound p_145841_1_) {
        super.writeToNBT(p_145841_1_);
        this.writeSyncableDataToNBT(p_145841_1_);
    }

    public void updateEntity() {
        boolean flag1 = false;
        if (flag1) {
            this.markDirty();
        }
    }
}

