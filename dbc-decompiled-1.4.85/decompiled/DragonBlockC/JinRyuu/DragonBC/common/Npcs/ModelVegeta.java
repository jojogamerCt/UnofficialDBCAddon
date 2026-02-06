/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelVegeta
extends ModelBiped {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer leftarmshoulder;
    ModelRenderer rightarmshoulder;
    ModelRenderer hair1;
    ModelRenderer hair2;
    ModelRenderer hair3;
    ModelRenderer hair4;
    ModelRenderer hea5;
    ModelRenderer hea6;

    public ModelVegeta() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
        this.head.setRotationPoint(0.0f, 2.0f, 0.0f);
        this.head.setTextureSize(128, 64);
        this.body = new ModelRenderer((ModelBase)this, 16, 16);
        this.body.addBox(-4.0f, 0.0f, -2.0f, 8, 11, 4);
        this.body.setRotationPoint(0.0f, 2.0f, 0.0f);
        this.body.setTextureSize(128, 64);
        this.rightarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.rightarm.addBox(-3.0f, -2.0f, -2.0f, 4, 11, 4);
        this.rightarm.setRotationPoint(-5.0f, 4.0f, 0.0f);
        this.rightarm.setTextureSize(128, 64);
        this.leftarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.leftarm.mirror = true;
        this.leftarm.addBox(-1.0f, -2.0f, -2.0f, 4, 11, 4);
        this.leftarm.setRotationPoint(5.0f, 4.0f, 0.0f);
        this.leftarm.setTextureSize(128, 64);
        this.rightleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.rightleg.addBox(-2.0f, 0.0f, -2.0f, 4, 11, 4);
        this.rightleg.setRotationPoint(-2.0f, 13.0f, 0.0f);
        this.rightleg.setTextureSize(128, 64);
        this.leftleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.leftleg.mirror = true;
        this.leftleg.addBox(-2.0f, 0.0f, -2.0f, 4, 11, 4);
        this.leftleg.setRotationPoint(2.0f, 13.0f, 0.0f);
        this.leftleg.setTextureSize(128, 64);
        this.rightarmshoulder = new ModelRenderer((ModelBase)this, 40, 32);
        this.rightarmshoulder.addBox(-6.0f, -3.0f, -3.0f, 7, 4, 6);
        this.rightarmshoulder.setRotationPoint(-5.0f, 4.0f, 0.0f);
        this.rightarmshoulder.setTextureSize(128, 64);
        this.leftarmshoulder = new ModelRenderer((ModelBase)this, 40, 32);
        this.leftarmshoulder.mirror = true;
        this.leftarmshoulder.addBox(-1.0f, -3.0f, -3.0f, 7, 4, 6);
        this.leftarmshoulder.setRotationPoint(5.0f, 4.0f, 0.0f);
        this.leftarmshoulder.setTextureSize(128, 64);
        this.hair1 = new ModelRenderer((ModelBase)this, 32, 0);
        this.hair1.addBox(-4.0f, -10.0f, -6.0f, 8, 4, 8);
        this.hair1.setRotationPoint(0.0f, 2.0f, 0.0f);
        this.hair1.setTextureSize(128, 64);
        this.hair2 = new ModelRenderer((ModelBase)this, 64, 0);
        this.hair2.addBox(-3.0f, -12.0f, -7.0f, 6, 4, 6);
        this.hair2.setRotationPoint(0.0f, 2.0f, 0.0f);
        this.hair2.setTextureSize(128, 64);
        this.hair3 = new ModelRenderer((ModelBase)this, 88, 0);
        this.hair3.addBox(-2.0f, -13.0f, -8.0f, 4, 4, 4);
        this.hair3.setRotationPoint(0.0f, 2.0f, 0.0f);
        this.hair3.setTextureSize(128, 64);
        this.hair4 = new ModelRenderer((ModelBase)this, 104, 0);
        this.hair4.addBox(-1.0f, -15.0f, -7.0f, 2, 4, 2);
        this.hair4.setRotationPoint(0.0f, 2.0f, 0.0f);
        this.hair4.setTextureSize(128, 64);
        this.hea5 = new ModelRenderer((ModelBase)this, 112, 0);
        this.hea5.addBox(-1.0f, -15.5f, 3.5f, 2, 8, 2);
        this.hea5.setRotationPoint(0.0f, 2.0f, 0.0f);
        this.hea5.setTextureSize(128, 64);
        this.hea6 = new ModelRenderer((ModelBase)this, 56, 12);
        this.hea6.addBox(-5.0f, -6.0f, -7.0f, 10, 2, 8);
        this.hea6.setRotationPoint(0.0f, 2.0f, 0.0f);
        this.hea6.setTextureSize(128, 64);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.head.render(f5);
        this.body.render(f5);
        this.rightarm.render(f5);
        this.leftarm.render(f5);
        this.rightleg.render(f5);
        this.leftleg.render(f5);
        this.leftarmshoulder.render(f5);
        this.rightarmshoulder.render(f5);
        this.hair1.render(f5);
        this.hair2.render(f5);
        this.hair3.render(f5);
        this.hair4.render(f5);
        this.hea5.render(f5);
        this.hea6.render(f5);
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        this.head.rotateAngleY = par4 / 57.295776f;
        this.head.rotateAngleX = par5 / 57.295776f;
        this.hair1.rotateAngleY = this.head.rotateAngleY;
        this.hair1.rotateAngleX = -0.296706f + this.head.rotateAngleX;
        this.hair2.rotateAngleY = this.head.rotateAngleY;
        this.hair2.rotateAngleX = -0.4537856f + this.head.rotateAngleX;
        this.hair3.rotateAngleY = this.head.rotateAngleY;
        this.hair3.rotateAngleX = -0.6108652f + this.head.rotateAngleX;
        this.hair4.rotateAngleY = this.head.rotateAngleY;
        this.hair4.rotateAngleX = -0.5934119f + this.head.rotateAngleX;
        this.hea5.rotateAngleY = this.head.rotateAngleY;
        this.hea5.rotateAngleX = 0.1047198f + this.head.rotateAngleX;
        this.hea6.rotateAngleY = this.head.rotateAngleY;
        this.hea6.rotateAngleX = -0.5585054f + this.head.rotateAngleX;
        this.rightarmshoulder.rotateAngleX = this.rightarm.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 2.0f * par2 * 0.5f;
        this.leftarmshoulder.rotateAngleX = this.leftarm.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 2.0f * par2 * 0.5f;
        this.rightarmshoulder.rotateAngleZ = this.rightarm.rotateAngleZ = 0.0f;
        this.leftarmshoulder.rotateAngleZ = this.leftarm.rotateAngleZ = 0.0f;
        this.rightleg.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.leftleg.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
        this.rightleg.rotateAngleY = 0.0f;
        this.leftleg.rotateAngleY = 0.0f;
        if (this.isRiding) {
            this.rightarm.rotateAngleX += -0.62831855f;
            this.rightarmshoulder.rotateAngleX = this.rightarm.rotateAngleX;
            this.leftarm.rotateAngleX += -0.62831855f;
            this.leftarmshoulder.rotateAngleX = this.leftarm.rotateAngleX;
            this.rightleg.rotateAngleX = -1.2566371f;
            this.leftleg.rotateAngleX = -1.2566371f;
            this.rightleg.rotateAngleY = 0.31415927f;
            this.leftleg.rotateAngleY = -0.31415927f;
        }
        this.rightarmshoulder.rotateAngleY = this.rightarm.rotateAngleY = 0.0f;
        this.leftarmshoulder.rotateAngleY = this.leftarm.rotateAngleY = 0.0f;
        if (this.onGround > -9990.0f) {
            float var8 = this.onGround;
            this.body.rotateAngleY = MathHelper.sin((float)(MathHelper.sqrt_float((float)var8) * (float)Math.PI * 2.0f)) * 0.2f;
            this.rightarm.rotationPointZ = MathHelper.sin((float)this.body.rotateAngleY) * 5.0f;
            this.rightarm.rotationPointX = -MathHelper.cos((float)this.body.rotateAngleY) * 5.0f;
            this.leftarm.rotationPointZ = -MathHelper.sin((float)this.body.rotateAngleY) * 5.0f;
            this.leftarm.rotationPointX = MathHelper.cos((float)this.body.rotateAngleY) * 5.0f;
            this.rightarm.rotateAngleY += this.body.rotateAngleY;
            this.leftarm.rotateAngleY += this.body.rotateAngleY;
            this.leftarm.rotateAngleX += this.body.rotateAngleY;
            this.rightarmshoulder.rotationPointZ = MathHelper.sin((float)this.body.rotateAngleY) * 5.0f;
            this.rightarmshoulder.rotationPointX = -MathHelper.cos((float)this.body.rotateAngleY) * 5.0f;
            this.leftarmshoulder.rotationPointZ = -MathHelper.sin((float)this.body.rotateAngleY) * 5.0f;
            this.leftarmshoulder.rotationPointX = MathHelper.cos((float)this.body.rotateAngleY) * 5.0f;
            this.rightarmshoulder.rotateAngleY += this.body.rotateAngleY;
            this.leftarmshoulder.rotateAngleY += this.body.rotateAngleY;
            this.leftarmshoulder.rotateAngleX += this.body.rotateAngleY;
            var8 = 1.0f - this.onGround;
            var8 *= var8;
            var8 *= var8;
            var8 = 1.0f - var8;
            float var9 = MathHelper.sin((float)(var8 * (float)Math.PI));
            float var10 = MathHelper.sin((float)(this.onGround * (float)Math.PI)) * -(this.head.rotateAngleX - 0.7f) * 0.75f;
            this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)var9 * 1.2 + (double)var10));
            this.rightarm.rotateAngleY += this.body.rotateAngleY * 2.0f;
            this.rightarm.rotateAngleZ = MathHelper.sin((float)(this.onGround * (float)Math.PI)) * -0.4f;
            this.rightarmshoulder.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)var9 * 1.2 + (double)var10));
            this.rightarmshoulder.rotateAngleY += this.body.rotateAngleY * 2.0f;
            this.rightarmshoulder.rotateAngleZ = MathHelper.sin((float)(this.onGround * (float)Math.PI)) * -0.4f;
        }
        this.rightarm.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
        this.rightarmshoulder.rotateAngleZ = this.rightarm.rotateAngleZ;
        this.leftarm.rotateAngleZ -= MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
        this.leftarmshoulder.rotateAngleZ = this.leftarm.rotateAngleZ;
        this.rightarm.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        this.rightarmshoulder.rotateAngleX = this.rightarm.rotateAngleX;
        this.leftarm.rotateAngleX -= MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        this.leftarmshoulder.rotateAngleX = this.leftarm.rotateAngleX;
    }
}

