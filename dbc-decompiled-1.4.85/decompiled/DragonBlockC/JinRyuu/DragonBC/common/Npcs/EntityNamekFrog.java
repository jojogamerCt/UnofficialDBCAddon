/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityAgeable
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityNamekFrog
extends EntityAnimal {
    private boolean j;

    public EntityNamekFrog(World par1World) {
        super(par1World);
        this.experienceValue = 0;
        this.setHealth(2.0f);
        this.setSize(1.0f, 1.0f);
    }

    @SideOnly(value=Side.CLIENT)
    public float getShadowSize() {
        return 0.0f;
    }

    public void onUpdate() {
        if (this.j && this.onGround && !this.isJumping) {
            this.j = false;
        }
        if (!this.j && !this.isJumping && (int)(Math.random() * 10.0) == 0 && this.ticksExisted % 100 == 0) {
            this.jump();
        }
        if (!this.j && this.isJumping) {
            this.motionX = Math.random() * 1.0 - 0.5;
            this.motionY = Math.random() * 1.0;
            this.motionZ = Math.random() * 1.0 - 0.5;
            float min = 0.2f;
            float min2 = -0.2f;
            if (this.motionX > 0.0) {
                if (this.motionX < (double)min) {
                    this.motionX += (double)min;
                }
            } else if (this.motionX < 0.0 && this.motionX > (double)min2) {
                this.motionX += (double)min2;
            }
            if (this.motionY > 0.0) {
                if (this.motionY < (double)min) {
                    this.motionY += (double)min;
                }
            } else if (this.motionY < 0.0 && this.motionY > (double)min2) {
                this.motionY += (double)min2;
            }
            this.velocityChanged = true;
            this.j = true;
        }
        super.onUpdate();
    }

    protected void fall(float p_70069_1_) {
    }

    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/NamekFrog.png";
    }

    public boolean getCanSpawnHere() {
        return this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes((Entity)this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }

    protected void dropFewItems(boolean par1, int par2) {
    }

    public boolean interact(EntityPlayer par1EntityPlayer) {
        return false;
    }

    protected boolean canDespawn() {
        return false;
    }

    public EntityAgeable createChild(EntityAgeable p_90011_1_) {
        return null;
    }
}

