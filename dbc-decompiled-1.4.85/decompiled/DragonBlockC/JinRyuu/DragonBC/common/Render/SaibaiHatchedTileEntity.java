/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.AxisAlignedBB
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.DragonBC.common.Npcs.EntitySaibaiman;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class SaibaiHatchedTileEntity
extends TileEntity {
    private int spawnDelay = 100;
    private String mobID = "Saibaman";
    public double field_98287_c;
    public double field_98284_d = 0.0;
    private int minSpawnDelay = 150;
    private int maxSpawnDelay = 600;
    private int spawnCount = 1;
    private Entity field_98291_j;
    private int maxNearbyEntities = 1;
    private int activatingRangeFromPlayer = 4;
    private int spawnRange = 8;

    public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readFromNBT(par1NBTTagCompound);
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeToNBT(par1NBTTagCompound);
    }

    public void updateEntity() {
        super.updateEntity();
    }

    private boolean canRun() {
        return this.worldObj.getClosestPlayer((double)this.xCoord + 0.5, (double)this.yCoord + 0.5, (double)this.zCoord + 0.5, (double)this.activatingRangeFromPlayer) != null;
    }

    private void updateSpawner() {
        int n = 4;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)((double)this.xCoord - (double)n), (double)((double)this.yCoord - (double)n), (double)((double)this.zCoord - (double)n), (double)((double)this.xCoord + (double)n), (double)((double)this.yCoord + (double)n), (double)((double)this.zCoord + (double)n));
        int p = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb).size();
        if (this.canRun() && this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb).size() > 0) {
            if (this.worldObj.isRemote) {
                double d1 = (float)this.xCoord + this.worldObj.rand.nextFloat();
                double d2 = (float)this.yCoord + this.worldObj.rand.nextFloat();
                double d0 = (float)this.zCoord + this.worldObj.rand.nextFloat();
                if (this.spawnDelay > 0) {
                    --this.spawnDelay;
                }
                this.field_98284_d = this.field_98287_c;
                this.field_98287_c = (this.field_98287_c + (double)(1000.0f / ((float)this.spawnDelay + 200.0f))) % 360.0;
            } else {
                if (this.spawnDelay == -1) {
                    this.resetTimer();
                }
                if (this.spawnDelay > 0) {
                    --this.spawnDelay;
                    return;
                }
                boolean flag = false;
                for (int i = 0; i < 1; ++i) {
                    EntitySaibaiman entity = new EntitySaibaiman(this.worldObj);
                    n = 16;
                    aabb = AxisAlignedBB.getBoundingBox((double)((double)this.xCoord - (double)n), (double)((double)this.yCoord - (double)n), (double)((double)this.zCoord - (double)n), (double)((double)this.xCoord + (double)n), (double)((double)this.yCoord + (double)n), (double)((double)this.zCoord + (double)n));
                    int j = this.worldObj.getEntitiesWithinAABB(EntityDBC.class, aabb).size();
                    if (this.worldObj.getEntitiesWithinAABB(EntityDBC.class, aabb).size() == 0) {
                        this.resetTimer();
                        return;
                    }
                    double d0 = (double)this.xCoord + (this.worldObj.rand.nextDouble() - this.worldObj.rand.nextDouble()) * (double)this.spawnRange;
                    double d3 = this.yCoord + this.worldObj.rand.nextInt(3) - 1;
                    double d4 = (double)this.zCoord + (this.worldObj.rand.nextDouble() - this.worldObj.rand.nextDouble()) * (double)this.spawnRange;
                    EntityLiving entityliving = entity instanceof EntityLiving ? (EntityLiving)entity : null;
                    entity.setLocationAndAngles(d0, d3, d4, this.worldObj.rand.nextFloat() * 360.0f, 0.0f);
                    if (entityliving != null && !entityliving.getCanSpawnHere()) continue;
                    this.func_98265_a((Entity)entity);
                    this.worldObj.playAuxSFX(2004, this.xCoord, this.yCoord, this.zCoord, 0);
                    if (entityliving != null) {
                        entityliving.spawnExplosionParticle();
                    }
                    flag = true;
                }
                if (flag) {
                    this.resetTimer();
                }
            }
        }
    }

    private Entity func_98265_a(Entity par1Entity) {
        if (par1Entity instanceof EntityLiving && par1Entity.worldObj != null) {
            this.worldObj.spawnEntityInWorld(par1Entity);
        }
        return par1Entity;
    }

    private void resetTimer() {
        if (this.maxSpawnDelay <= this.minSpawnDelay) {
            this.spawnDelay = this.minSpawnDelay;
        } else {
            int i = this.maxSpawnDelay - this.minSpawnDelay;
            this.spawnDelay = this.minSpawnDelay + this.worldObj.rand.nextInt(i);
        }
        this.func_98267_a(1);
    }

    private void func_98267_a(int par1) {
        this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, BlocksDBC.SaibaiHatched, par1, 0);
    }

    private boolean setDelayToMin(int par1) {
        if (par1 == 1 && this.worldObj.isRemote) {
            this.spawnDelay = this.minSpawnDelay;
            return true;
        }
        return false;
    }

    public boolean receiveClientEvent(int par1, int par2) {
        return this.setDelayToMin(par1) ? true : super.receiveClientEvent(par1, par2);
    }
}

