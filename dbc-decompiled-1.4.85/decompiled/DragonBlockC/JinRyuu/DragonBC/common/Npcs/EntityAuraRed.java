/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.Entity
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.DragonBC.common.DBCKiAttacks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityAuraRed
extends Entity {
    public int randomSoundDelay = 0;
    public int tex = 4;
    private Entity mot;
    int Age;
    int MaxAge = 20;

    public EntityAuraRed(World par1World) {
        super(par1World);
    }

    public EntityAuraRed(World par1World, Entity other) {
        super(par1World);
        this.mot = other;
    }

    @SideOnly(value=Side.CLIENT)
    public float getShadowSize() {
        return 0.0f;
    }

    public void onUpdate() {
        if (this.mot != null) {
            this.motionX = this.mot.motionX;
            this.motionY = this.mot.motionY;
            this.motionZ = this.mot.motionZ;
        }
        boolean doit = false;
        int x = 0;
        int y = 0;
        int z = 0;
        if (this.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ - 1).getMaterial() == Material.air) {
            doit = true;
            x = (int)this.posX;
            y = (int)this.posY;
            z = (int)this.posZ;
        }
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.Age++ >= this.MaxAge) {
            if (doit) {
                // empty if block
            }
            this.setDead();
        }
        this.motionY += 0.0;
        if (this.posY == this.prevPosY) {
            this.motionX *= 1.0;
            this.motionZ *= 1.0;
        }
        if (!this.onGround) {
            this.motionX *= DBCKiAttacks.motX;
            this.motionZ *= DBCKiAttacks.motZ;
            this.motionY *= DBCKiAttacks.motY;
        }
        this.moveEntity(this.motionX * 2.0, this.motionY * 2.0, this.motionZ * 2.0);
    }

    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        String textura = "";
        if (this.tex == 1) {
            textura = "jinryuudragonbc:aurab.png";
        }
        if (this.tex == 2) {
            textura = "jinryuudragonbc:auras.png";
        }
        if (this.tex == 3) {
            textura = "jinryuudragonbc:aurap.png";
        }
        if (this.tex == 4) {
            textura = "jinryuudragonbc:aurar.png";
        }
        return textura;
    }

    public boolean getCanSpawnHere() {
        return !this.worldObj.checkNoEntityCollision(this.boundingBox);
    }

    public void onLivingUpdate() {
    }

    protected void entityInit() {
    }

    protected void readEntityFromNBT(NBTTagCompound var1) {
    }

    protected void writeEntityToNBT(NBTTagCompound var1) {
    }
}

