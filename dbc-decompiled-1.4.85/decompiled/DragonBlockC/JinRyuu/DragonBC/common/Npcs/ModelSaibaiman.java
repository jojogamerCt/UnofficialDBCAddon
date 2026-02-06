/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelSaibaiman
extends ModelBiped {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;

    public ModelSaibaiman() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        float var1 = 8.0f;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.head.setRotationPoint(0.0f, 0.0f + var1, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 16, 16);
        this.body.addBox(-4.0f, 0.0f, -2.0f, 8, 8, 4, 0.0f);
        this.body.setRotationPoint(0.0f, 8.0f, 0.0f);
        this.rightarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.rightarm.addBox(-3.0f, -2.0f, -2.0f, 4, 8, 4, 0.0f);
        this.rightarm.setRotationPoint(-5.0f, 10.0f, 0.0f);
        this.leftarm = new ModelRenderer((ModelBase)this, 40, 16);
        this.leftarm.addBox(-1.0f, -2.0f, -2.0f, 4, 8, 4, 0.0f);
        this.leftarm.setRotationPoint(5.0f, 10.0f, 0.0f);
        this.leftarm.mirror = true;
        this.rightleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.rightleg.addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4, 0.0f);
        this.rightleg.setRotationPoint(-2.0f, 16.0f, 0.0f);
        this.leftleg = new ModelRenderer((ModelBase)this, 0, 16);
        this.leftleg.addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4, 0.0f);
        this.leftleg.setRotationPoint(2.0f, 16.0f, 0.0f);
        this.leftleg.mirror = true;
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.isChild) {
            float var8 = 2.0f;
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.5f / var8), (float)(1.5f / var8), (float)(1.5f / var8));
            GL11.glTranslatef((float)0.0f, (float)(16.0f * f5), (float)0.0f);
            this.head.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / var8), (float)(1.0f / var8), (float)(1.0f / var8));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f5), (float)0.0f);
            this.body.render(f5);
            this.rightarm.render(f5);
            this.leftarm.render(f5);
            this.rightleg.render(f5);
            this.leftleg.render(f5);
            GL11.glPopMatrix();
        } else {
            this.head.render(f5);
            this.body.render(f5);
            this.rightarm.render(f5);
            this.leftarm.render(f5);
            this.rightleg.render(f5);
            this.leftleg.render(f5);
        }
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        this.head.rotateAngleY = par4 / 57.295776f;
        this.head.rotateAngleX = par5 / 57.295776f;
        this.rightarm.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 2.0f * par2 * 0.5f;
        this.leftarm.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 2.0f * par2 * 0.5f;
        this.rightarm.rotateAngleZ = 0.0f;
        this.leftarm.rotateAngleZ = 0.0f;
        this.rightleg.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 1.4f * par2;
        this.leftleg.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.4f * par2;
        this.rightleg.rotateAngleY = 0.0f;
        this.leftleg.rotateAngleY = 0.0f;
        if (this.isRiding) {
            this.rightarm.rotateAngleX += -0.62831855f;
            this.leftarm.rotateAngleX += -0.62831855f;
            this.rightleg.rotateAngleX = -1.2566371f;
            this.leftleg.rotateAngleX = -1.2566371f;
            this.rightleg.rotateAngleY = 0.31415927f;
            this.leftleg.rotateAngleY = -0.31415927f;
        }
        if (this.heldItemLeft != 0) {
            this.leftarm.rotateAngleX = this.leftarm.rotateAngleX * 0.5f - 0.31415927f * (float)this.heldItemLeft;
        }
        if (this.heldItemRight != 0) {
            this.rightarm.rotateAngleX = this.rightarm.rotateAngleX * 0.5f - 0.31415927f * (float)this.heldItemRight;
        }
        this.rightarm.rotateAngleY = 0.0f;
        this.leftarm.rotateAngleY = 0.0f;
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
            var8 = 1.0f - this.onGround;
            var8 *= var8;
            var8 *= var8;
            var8 = 1.0f - var8;
            float var9 = MathHelper.sin((float)(var8 * (float)Math.PI));
            float var10 = MathHelper.sin((float)(this.onGround * (float)Math.PI)) * -(this.head.rotateAngleX - 0.7f) * 0.75f;
            this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)var9 * 1.2 + (double)var10));
            this.rightarm.rotateAngleY += this.body.rotateAngleY * 2.0f;
            this.rightarm.rotateAngleZ = MathHelper.sin((float)(this.onGround * (float)Math.PI)) * -0.4f;
        }
        this.rightarm.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
        this.leftarm.rotateAngleZ -= MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
        this.rightarm.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        this.leftarm.rotateAngleX -= MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
    }
}

