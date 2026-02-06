/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  cpw.mods.fml.common.FMLCommonHandler
 *  cpw.mods.fml.common.registry.IEntityAdditionalSpawnData
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.DamageSource
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.DragonBC.common.Npcs.EntitySaiyan01;
import JinRyuu.DragonBC.common.Npcs.EntitySaiyan02;
import JinRyuu.JRMCore.JRMCoreH;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityDBCEvil
extends EntityDBC
implements IEntityAdditionalSpawnData {
    private Entity spwner = null;
    protected Entity target = null;
    private int noSpwnr = DBCConfig.mdat;

    public EntityDBCEvil(World par1World) {
        super(par1World);
    }

    protected NBTTagCompound nbt(EntityPlayer p, String s) {
        NBTTagCompound nbt;
        if (s.contains("pres")) {
            if (!p.getEntityData().hasKey("PlayerPersisted")) {
                nbt = new NBTTagCompound();
                p.getEntityData().setTag("PlayerPersisted", (NBTBase)nbt);
            } else {
                nbt = p.getEntityData().getCompoundTag("PlayerPersisted");
            }
        } else {
            nbt = p.getEntityData();
        }
        return nbt;
    }

    public void setSpwner(Entity e) {
        this.spwner = e;
    }

    public Entity getSpwner() {
        return this.spwner;
    }

    public void settarget(Entity e) {
        this.target = e;
    }

    public Entity gettarget() {
        return this.target;
    }

    public void setETA(Entity par1Entity) {
        this.entityToAttack = par1Entity;
    }

    @Override
    protected Entity findPlayerToAttack() {
        return this.target != null ? this.target : super.findPlayerToAttack();
    }

    @Override
    public void onDeath(DamageSource par1DamageSource) {
        Entity var3 = par1DamageSource.getEntity();
        super.onDeath(par1DamageSource);
    }

    @Override
    public void onUpdate() {
        if (!(this instanceof EntitySaiyan01) && !(this instanceof EntitySaiyan02)) {
            double r = DBCConfig.mdal;
            if (this.spwner != null && r != 0.0) {
                AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)(this.posX - r), (double)(this.posY - r), (double)(this.posZ - r), (double)(this.posX + r), (double)(this.posY + r), (double)(this.posZ + r));
                List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
                boolean b = false;
                int j = 0;
                int sgid = JRMCoreH.getInt((EntityPlayer)((EntityPlayer)this.spwner), (String)"JRMCGID");
                for (int i = 0; i < list.size(); ++i) {
                    EntityPlayer entity2 = (EntityPlayer)list.get(i);
                    int ogid = JRMCoreH.getInt((EntityPlayer)entity2, (String)"JRMCGID");
                    if (this.spwner.getEntityId() != entity2.getEntityId() && (sgid == 0 || sgid != ogid)) continue;
                    ++j;
                }
                if (this.getEntityId() == this.spwner.getEntityId()) {
                    ++j;
                }
                if (j == 0) {
                    --this.noSpwnr;
                    if (this.noSpwnr <= 0) {
                        this.setDead();
                    }
                } else if (this.noSpwnr != DBCConfig.mdat) {
                    this.noSpwnr = DBCConfig.mdat;
                }
            }
            if (!this.worldObj.isRemote && this.spwner == null) {
                this.setDead();
            }
        }
        super.onUpdate();
    }

    @Override
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
        if (!super.attackEntityFrom(par1DamageSource, par2)) {
            return false;
        }
        if (this.spwner != null) {
            MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
            EntityPlayer spwnr = (EntityPlayer)this.spwner;
            Entity atckr = par1DamageSource.getEntity();
            if (atckr instanceof EntityPlayer) {
                int sgid = JRMCoreH.getInt((EntityPlayer)spwnr, (String)"JRMCGID");
                if (sgid != 0) {
                    this.setTarget(atckr);
                    this.settarget(atckr);
                    EntityLivingBase entitylivingbase = this.getAttackTarget();
                    if (entitylivingbase == null && this.getEntityToAttack() instanceof EntityLivingBase) {
                        entitylivingbase = (EntityLivingBase)this.getEntityToAttack();
                    }
                    if (entitylivingbase == null && par1DamageSource.getEntity() instanceof EntityLivingBase) {
                        entitylivingbase = (EntityLivingBase)par1DamageSource.getEntity();
                    }
                    return true;
                }
                if (spwnr.getEntityId() == atckr.getEntityId()) {
                    this.setTarget(atckr);
                    this.settarget(atckr);
                    EntityLivingBase entitylivingbase = this.getAttackTarget();
                    if (entitylivingbase == null && this.getEntityToAttack() instanceof EntityLivingBase) {
                        entitylivingbase = (EntityLivingBase)this.getEntityToAttack();
                    }
                    if (entitylivingbase == null && par1DamageSource.getEntity() instanceof EntityLivingBase) {
                        entitylivingbase = (EntityLivingBase)par1DamageSource.getEntity();
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        EntityLivingBase entitylivingbase = this.getAttackTarget();
        if (entitylivingbase == null && this.getEntityToAttack() instanceof EntityLivingBase) {
            entitylivingbase = (EntityLivingBase)this.getEntityToAttack();
        }
        if (entitylivingbase == null && par1DamageSource.getEntity() instanceof EntityLivingBase) {
            entitylivingbase = (EntityLivingBase)par1DamageSource.getEntity();
        }
        return true;
    }

    public void writeSpawnData(ByteBuf data) {
        data.writeInt(this.spwner == null ? 0 : this.spwner.getEntityId());
        data.writeInt(this.target == null ? 0 : this.target.getEntityId());
        data.writeInt(this.entityToAttack == null ? 0 : this.entityToAttack.getEntityId());
    }

    public void readSpawnData(ByteBuf data) {
        int e1 = data.readInt();
        int e2 = data.readInt();
        int e3 = data.readInt();
        this.spwner = e1 == 0 ? this.spwner : this.worldObj.getEntityByID(e1);
        this.target = e2 == 0 ? this.target : this.worldObj.getEntityByID(e2);
        this.entityToAttack = e3 == 0 ? this.entityToAttack : this.worldObj.getEntityByID(e3);
    }
}

