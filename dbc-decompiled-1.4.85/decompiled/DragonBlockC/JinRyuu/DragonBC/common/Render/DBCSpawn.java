/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityList
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.DragonBC.common.Npcs.EntitySaibaiman;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public abstract class DBCSpawn {
    public int spawnDelay = 100;
    private String mobID = "Saibaman";
    public double field_98287_c;
    public double field_98284_d = 0.0;
    private int minSpawnDelay = 200;
    private int maxSpawnDelay = 800;
    private int spawnCount = 1;
    private Entity field_98291_j;
    private int maxNearbyEntities = 1;
    private int activatingRangeFromPlayer = 8;
    private int spawnRange = 8;

    public String getEntityNameToSpawn() {
        return this.mobID;
    }

    public void setMobID(String par1Str) {
        this.mobID = par1Str;
    }

    public boolean canRun() {
        return this.getSpawnerWorld().getClosestPlayer((double)this.getSpawnerX() + 0.5, (double)this.getSpawnerY() + 0.5, (double)this.getSpawnerZ() + 0.5, (double)this.activatingRangeFromPlayer) != null;
    }

    public void updateSpawner() {
        int n = 4;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)((double)this.getSpawnerX() - (double)n), (double)((double)this.getSpawnerY() - (double)n), (double)((double)this.getSpawnerZ() - (double)n), (double)((double)this.getSpawnerX() + (double)n), (double)((double)this.getSpawnerY() + (double)n), (double)((double)this.getSpawnerZ() + (double)n));
        int p = this.getSpawnerWorld().getEntitiesWithinAABB(EntityPlayer.class, aabb).size();
        if (this.canRun() && p != 0) {
            if (this.getSpawnerWorld().isRemote) {
                double d1 = (float)this.getSpawnerX() + this.getSpawnerWorld().rand.nextFloat();
                double d2 = (float)this.getSpawnerY() + this.getSpawnerWorld().rand.nextFloat();
                double d0 = (float)this.getSpawnerZ() + this.getSpawnerWorld().rand.nextFloat();
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
                for (int i = 0; i < this.spawnCount; ++i) {
                    EntitySaibaiman entity = new EntitySaibaiman(this.getSpawnerWorld());
                    n = 16;
                    aabb = AxisAlignedBB.getBoundingBox((double)((double)this.getSpawnerX() - (double)n), (double)((double)this.getSpawnerY() - (double)n), (double)((double)this.getSpawnerZ() - (double)n), (double)((double)this.getSpawnerX() + (double)n), (double)((double)this.getSpawnerY() + (double)n), (double)((double)this.getSpawnerZ() + (double)n));
                    int j = this.getSpawnerWorld().getEntitiesWithinAABB(EntityDBC.class, aabb).size();
                    if (j >= 1) {
                        this.resetTimer();
                        return;
                    }
                    double d0 = (double)this.getSpawnerX() + (this.getSpawnerWorld().rand.nextDouble() - this.getSpawnerWorld().rand.nextDouble()) * (double)this.spawnRange;
                    double d3 = this.getSpawnerY() + this.getSpawnerWorld().rand.nextInt(3) - 1;
                    double d4 = (double)this.getSpawnerZ() + (this.getSpawnerWorld().rand.nextDouble() - this.getSpawnerWorld().rand.nextDouble()) * (double)this.spawnRange;
                    EntityLiving entityliving = entity instanceof EntityLiving ? (EntityLiving)entity : null;
                    entity.setLocationAndAngles(d0, d3, d4, this.getSpawnerWorld().rand.nextFloat() * 360.0f, 0.0f);
                    if (entityliving != null && !entityliving.getCanSpawnHere()) continue;
                    this.func_98265_a((Entity)entity);
                    this.getSpawnerWorld().playAuxSFX(2004, this.getSpawnerX(), this.getSpawnerY(), this.getSpawnerZ(), 0);
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

    public Entity func_98265_a(Entity par1Entity) {
        if (par1Entity instanceof EntityLiving && par1Entity.worldObj != null) {
            this.getSpawnerWorld().spawnEntityInWorld(par1Entity);
        }
        return par1Entity;
    }

    private void resetTimer() {
        if (this.maxSpawnDelay <= this.minSpawnDelay) {
            this.spawnDelay = this.minSpawnDelay;
        } else {
            int i = this.maxSpawnDelay - this.minSpawnDelay;
            this.spawnDelay = this.minSpawnDelay + this.getSpawnerWorld().rand.nextInt(i);
        }
        this.func_98267_a(1);
    }

    public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
        this.mobID = par1NBTTagCompound.getString("EntityId");
        this.spawnDelay = par1NBTTagCompound.getShort("Delay");
        if (par1NBTTagCompound.hasKey("MinSpawnDelay")) {
            this.minSpawnDelay = par1NBTTagCompound.getShort("MinSpawnDelay");
            this.maxSpawnDelay = par1NBTTagCompound.getShort("MaxSpawnDelay");
            this.spawnCount = par1NBTTagCompound.getShort("SpawnCount");
        }
        if (par1NBTTagCompound.hasKey("MaxNearbyEntities")) {
            this.maxNearbyEntities = par1NBTTagCompound.getShort("MaxNearbyEntities");
            this.activatingRangeFromPlayer = par1NBTTagCompound.getShort("RequiredPlayerRange");
        }
        if (par1NBTTagCompound.hasKey("SpawnRange")) {
            this.spawnRange = par1NBTTagCompound.getShort("SpawnRange");
        }
        if (this.getSpawnerWorld() != null && this.getSpawnerWorld().isRemote) {
            this.field_98291_j = null;
        }
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        par1NBTTagCompound.setString("EntityId", this.getEntityNameToSpawn());
        par1NBTTagCompound.setShort("Delay", (short)this.spawnDelay);
        par1NBTTagCompound.setShort("MinSpawnDelay", (short)this.minSpawnDelay);
        par1NBTTagCompound.setShort("MaxSpawnDelay", (short)this.maxSpawnDelay);
        par1NBTTagCompound.setShort("SpawnCount", (short)this.spawnCount);
        par1NBTTagCompound.setShort("MaxNearbyEntities", (short)this.maxNearbyEntities);
        par1NBTTagCompound.setShort("RequiredPlayerRange", (short)this.activatingRangeFromPlayer);
        par1NBTTagCompound.setShort("SpawnRange", (short)this.spawnRange);
    }

    public boolean setDelayToMin(int par1) {
        if (par1 == 1 && this.getSpawnerWorld().isRemote) {
            this.spawnDelay = this.minSpawnDelay;
            return true;
        }
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public Entity func_98281_h() {
        if (this.field_98291_j == null) {
            Entity entity = EntityList.createEntityByName((String)this.getEntityNameToSpawn(), (World)null);
            this.field_98291_j = entity = this.func_98265_a(entity);
        }
        return this.field_98291_j;
    }

    public abstract void func_98267_a(int var1);

    public abstract World getSpawnerWorld();

    public abstract int getSpawnerX();

    public abstract int getSpawnerY();

    public abstract int getSpawnerZ();
}

