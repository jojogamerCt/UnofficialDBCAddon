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

public class ModelYakon
extends ModelBiped {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer body2;
    ModelRenderer leftarm;
    ModelRenderer leftarm1;
    ModelRenderer leftarm2;
    ModelRenderer leftarm3;
    ModelRenderer rightarm;
    ModelRenderer rightarm1;
    ModelRenderer rightarm2;
    ModelRenderer rightarm3;
    ModelRenderer leftleg;
    ModelRenderer leftleg1;
    ModelRenderer leftleg2;
    ModelRenderer leftleg3;
    ModelRenderer rightleg;
    ModelRenderer rightleg1;
    ModelRenderer rightleg2;
    ModelRenderer rightleg3;
    ModelRenderer back1;
    ModelRenderer back2;
    ModelRenderer back3;
    ModelRenderer back4;
    ModelRenderer tail;
    private float F = 1.0f;

    public ModelYakon(float f) {
        this();
        this.F = f;
    }

    public ModelYakon() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.addBox(-4.0f, -4.0f, -5.0f, 8, 8, 5);
        this.head.setRotationPoint(0.0f, -6.0f, -4.0f);
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 0, 29);
        this.body.addBox(-4.0f, 8.0f, -2.0f, 8, 8, 4);
        this.body.setRotationPoint(0.0f, -8.0f, 0.0f);
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.body2 = new ModelRenderer((ModelBase)this, 0, 13);
        this.body2.addBox(-6.0f, 0.0f, -4.0f, 12, 8, 8);
        this.body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.body2, 0.0f, 0.0f, 0.0f);
        this.leftarm = new ModelRenderer((ModelBase)this, 40, 0);
        this.leftarm.addBox(0.0f, -3.0f, -3.0f, 6, 6, 6);
        this.leftarm.setRotationPoint(6.0f, -5.0f, 0.0f);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
        this.leftarm1 = new ModelRenderer((ModelBase)this, 40, 12);
        this.leftarm1.addBox(0.0f, 3.0f, -2.0f, 4, 7, 4);
        this.leftarm1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftarm1.mirror = true;
        this.setRotation(this.leftarm1, 0.0f, 0.0f, 0.0f);
        this.leftarm2 = new ModelRenderer((ModelBase)this, 64, 0);
        this.leftarm2.addBox(0.0f, 6.0f, -12.0f, 4, 4, 10);
        this.leftarm2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftarm2.mirror = true;
        this.setRotation(this.leftarm2, 0.0f, 0.0f, 0.0f);
        this.leftarm3 = new ModelRenderer((ModelBase)this, 56, 14);
        this.leftarm3.addBox(1.0f, 7.0f, -13.0f, 2, 2, 8);
        this.leftarm3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftarm3.mirror = true;
        this.setRotation(this.leftarm3, -0.1745329f, 0.0f, 0.0f);
        this.rightarm = new ModelRenderer((ModelBase)this, 40, 0);
        this.rightarm.addBox(-6.0f, -3.0f, -3.0f, 6, 6, 6);
        this.rightarm.setRotationPoint(-6.0f, -5.0f, 0.0f);
        this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
        this.rightarm1 = new ModelRenderer((ModelBase)this, 40, 12);
        this.rightarm1.addBox(-4.0f, 3.0f, -2.0f, 4, 7, 4);
        this.rightarm1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.rightarm1, 0.0f, 0.0f, 0.0f);
        this.rightarm2 = new ModelRenderer((ModelBase)this, 64, 0);
        this.rightarm2.addBox(-4.0f, 6.0f, -12.0f, 4, 4, 10);
        this.rightarm2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.rightarm2, 0.0f, 0.0f, 0.0f);
        this.rightarm3 = new ModelRenderer((ModelBase)this, 56, 14);
        this.rightarm3.addBox(-3.0f, 7.0f, -13.0f, 2, 2, 8);
        this.rightarm3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.rightarm3, -0.1745329f, 0.0f, 0.0f);
        this.leftleg = new ModelRenderer((ModelBase)this, 0, 41);
        this.leftleg.addBox(0.0f, -2.0f, -10.0f, 4, 4, 12);
        this.leftleg.setRotationPoint(4.0f, 8.0f, 0.0f);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
        this.leftleg1 = new ModelRenderer((ModelBase)this, 22, 47);
        this.leftleg1.addBox(0.0f, 4.0f, -9.0f, 4, 4, 10);
        this.leftleg1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftleg1.mirror = true;
        this.setRotation(this.leftleg1, -0.3490659f, 0.0f, 0.0174533f);
        this.leftleg2 = new ModelRenderer((ModelBase)this, 40, 42);
        this.leftleg2.addBox(0.0f, 4.0f, 1.0f, 4, 11, 4);
        this.leftleg2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftleg2.mirror = true;
        this.setRotation(this.leftleg2, -0.3665191f, 0.0f, 0.0174533f);
        this.leftleg3 = new ModelRenderer((ModelBase)this, 20, 39);
        this.leftleg3.addBox(0.0f, 14.0f, -8.0f, 4, 2, 6);
        this.leftleg3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftleg3.mirror = true;
        this.setRotation(this.leftleg3, 0.0f, 0.0f, 0.0174533f);
        this.rightleg = new ModelRenderer((ModelBase)this, 0, 41);
        this.rightleg.addBox(-4.0f, -2.0f, -10.0f, 4, 4, 12);
        this.rightleg.setRotationPoint(-4.0f, 8.0f, 0.0f);
        this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
        this.rightleg1 = new ModelRenderer((ModelBase)this, 22, 47);
        this.rightleg1.addBox(-4.0f, 4.0f, -9.0f, 4, 4, 10);
        this.rightleg1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.rightleg1, -0.3490659f, 0.0f, 0.0174533f);
        this.rightleg2 = new ModelRenderer((ModelBase)this, 40, 42);
        this.rightleg2.addBox(-4.0f, 4.0f, 1.0f, 4, 11, 4);
        this.rightleg2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.rightleg2, -0.3665191f, 0.0f, 0.0174533f);
        this.rightleg3 = new ModelRenderer((ModelBase)this, 20, 39);
        this.rightleg3.addBox(-4.0f, 14.0f, -8.0f, 4, 2, 6);
        this.rightleg3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.rightleg3, 0.0f, 0.0f, 0.0174533f);
        this.back1 = new ModelRenderer((ModelBase)this, 40, 32);
        this.back1.addBox(1.0f, 1.0f, 1.0f, 4, 4, 6);
        this.back1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.back1, 0.5235988f, 0.2617994f, 0.0f);
        this.back2 = new ModelRenderer((ModelBase)this, 40, 32);
        this.back2.addBox(-5.0f, 1.0f, 1.0f, 4, 4, 6);
        this.back2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.back2, 0.5235988f, -0.2617994f, 0.0f);
        this.back3 = new ModelRenderer((ModelBase)this, 40, 23);
        this.back3.addBox(1.0f, 5.0f, 1.0f, 3, 3, 6);
        this.back3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.back3, 0.2617994f, 0.2617994f, 0.0f);
        this.back4 = new ModelRenderer((ModelBase)this, 40, 23);
        this.back4.addBox(-4.0f, 5.0f, 2.0f, 3, 3, 6);
        this.back4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.back4, 0.2617994f, -0.2617994f, 0.0f);
        this.tail = new ModelRenderer((ModelBase)this, 56, 38);
        this.tail.addBox(-2.0f, 8.0f, -3.0f, 4, 12, 4);
        this.tail.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.tail, 0.3316126f, 0.0f, 0.0f);
        this.leftarm.addChild(this.leftarm1);
        this.leftarm.addChild(this.leftarm2);
        this.leftarm.addChild(this.leftarm3);
        this.rightarm.addChild(this.rightarm1);
        this.rightarm.addChild(this.rightarm2);
        this.rightarm.addChild(this.rightarm3);
        this.leftleg.addChild(this.leftleg1);
        this.leftleg.addChild(this.leftleg2);
        this.leftleg.addChild(this.leftleg3);
        this.rightleg.addChild(this.rightleg1);
        this.rightleg.addChild(this.rightleg2);
        this.rightleg.addChild(this.rightleg3);
        this.body.addChild(this.body2);
        this.body.addChild(this.back1);
        this.body.addChild(this.back2);
        this.body.addChild(this.back3);
        this.body.addChild(this.back4);
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

