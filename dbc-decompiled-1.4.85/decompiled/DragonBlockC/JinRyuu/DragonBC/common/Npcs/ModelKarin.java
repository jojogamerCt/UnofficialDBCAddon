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

public class ModelKarin
extends ModelBiped {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer staff;
    ModelRenderer staff2;
    ModelRenderer ear1;
    ModelRenderer ear2;
    ModelRenderer tail;
    private float F = 1.0f;

    public ModelKarin(float f) {
        this();
        this.F = f;
    }

    public ModelKarin() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.addBox(-4.0f, -6.0f, -3.0f, 8, 6, 6);
        this.head.setRotationPoint(0.0f, 15.0f, 0.0f);
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 20, 16);
        this.body.addBox(-4.0f, 0.0f, -3.0f, 8, 8, 6);
        this.body.setRotationPoint(0.0f, 15.0f, 0.0f);
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.rightarm = new ModelRenderer((ModelBase)this, 32, 0);
        this.rightarm.addBox(-2.0f, -2.0f, -5.0f, 3, 3, 8);
        this.rightarm.setRotationPoint(-5.0f, 17.0f, 0.0f);
        this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
        this.leftarm = new ModelRenderer((ModelBase)this, 48, 16);
        this.leftarm.mirror = true;
        this.leftarm.addBox(-1.0f, -2.0f, -1.0f, 3, 7, 3);
        this.leftarm.setRotationPoint(5.0f, 17.0f, 0.0f);
        this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
        this.rightleg = new ModelRenderer((ModelBase)this, 0, 25);
        this.rightleg.addBox(-2.0f, 0.0f, -4.0f, 4, 1, 6);
        this.rightleg.setRotationPoint(-2.0f, 23.0f, 0.0f);
        this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
        this.leftleg = new ModelRenderer((ModelBase)this, 0, 25);
        this.leftleg.mirror = true;
        this.leftleg.addBox(-2.0f, 0.0f, -4.0f, 4, 1, 6);
        this.leftleg.setRotationPoint(2.0f, 23.0f, 0.0f);
        this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
        this.staff = new ModelRenderer((ModelBase)this, 60, 0);
        this.staff.addBox(-1.0f, -8.0f, -4.0f, 1, 15, 1);
        this.staff.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.staff, 0.0f, 0.0f, 0.0f);
        this.staff2 = new ModelRenderer((ModelBase)this, 48, 0);
        this.staff2.addBox(0.0f, -8.0f, -6.0f, 1, 1, 5);
        this.staff2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.staff2, 0.0f, 0.3141593f, 0.0174533f);
        this.ear1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.ear1.mirror = true;
        this.ear1.addBox(1.0f, -7.3f, -1.0f, 2, 2, 1);
        this.ear1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.ear1, 0.0f, 0.0f, -0.7853982f);
        this.ear2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.ear2.addBox(-3.0f, -7.333333f, -1.0f, 2, 2, 1);
        this.ear2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.ear2, 0.0f, 0.0f, 0.7853982f);
        this.tail = new ModelRenderer((ModelBase)this, 0, 22);
        this.tail.addBox(3.0f, -4.666667f, 5.333333f, 1, 8, 1);
        this.tail.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.tail, -0.6632251f, 0.0f, 0.4712389f);
        this.head.addChild(this.ear1);
        this.head.addChild(this.ear2);
        this.rightarm.addChild(this.staff);
        this.rightarm.addChild(this.staff2);
        this.body.addChild(this.tail);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        GL11.glScalef((float)this.F, (float)this.F, (float)this.F);
        GL11.glTranslatef((float)0.0f, (float)((this.F - 1.0f) * -0.74f), (float)0.0f);
        this.head.render(f5);
        this.body.render(f5);
        this.rightarm.render(f5);
        this.leftarm.render(f5);
        this.rightleg.render(f5);
        this.leftleg.render(f5);
        GL11.glPopMatrix();
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

