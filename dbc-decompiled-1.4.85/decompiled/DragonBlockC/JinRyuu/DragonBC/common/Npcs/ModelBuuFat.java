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

public class ModelBuuFat
extends ModelBiped {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer body2;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer headtail1;
    ModelRenderer headtail2;
    ModelRenderer headtail3;
    ModelRenderer cape;
    private float F = 1.0f;

    public ModelBuuFat(float f) {
        this();
        this.F = f;
    }

    public ModelBuuFat() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.head = new ModelRenderer((ModelBase)this, 0, 0);
        this.head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
        this.head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        this.body = new ModelRenderer((ModelBase)this, 0, 16);
        this.body.addBox(-6.0f, 0.0f, -3.0f, 12, 8, 6);
        this.body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
        this.body2 = new ModelRenderer((ModelBase)this, 0, 30);
        this.body2.addBox(-7.0f, 8.0f, -4.0f, 14, 8, 8);
        this.body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.body2, 0.0f, 0.0f, 0.0f);
        this.rightarm = new ModelRenderer((ModelBase)this, 36, 16);
        this.rightarm.addBox(-5.0f, -2.0f, -2.0f, 4, 10, 4);
        this.rightarm.setRotationPoint(-6.0f, 2.0f, 0.0f);
        this.setRotation(this.rightarm, 0.0f, 0.0f, 0.1745329f);
        this.leftarm = new ModelRenderer((ModelBase)this, 36, 16);
        this.leftarm.addBox(1.0f, -2.0f, -2.0f, 4, 10, 4);
        this.leftarm.setRotationPoint(6.0f, 2.0f, 0.0f);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0f, 0.0f, -0.1745329f);
        this.rightleg = new ModelRenderer((ModelBase)this, 0, 46);
        this.rightleg.addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4);
        this.rightleg.setRotationPoint(-4.0f, 16.0f, 0.0f);
        this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
        this.leftleg = new ModelRenderer((ModelBase)this, 0, 46);
        this.leftleg.addBox(0.0f, 0.0f, -2.0f, 4, 8, 4);
        this.leftleg.setRotationPoint(2.0f, 16.0f, 0.0f);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
        this.headtail1 = new ModelRenderer((ModelBase)this, 52, 0);
        this.headtail1.addBox(-2.0f, -10.0f, -6.0f, 4, 5, 4);
        this.headtail1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.headtail1, -0.6283185f, 0.0f, 0.0f);
        this.headtail2 = new ModelRenderer((ModelBase)this, 40, 0);
        this.headtail2.addBox(-1.5f, -12.0f, -8.0f, 3, 4, 3);
        this.headtail2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.headtail2, -0.8901179f, 0.0f, 0.0f);
        this.headtail3 = new ModelRenderer((ModelBase)this, 32, 0);
        this.headtail3.addBox(-1.0f, -12.0f, -11.0f, 2, 4, 2);
        this.headtail3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.headtail3, -1.22173f, 0.0f, 0.0f);
        this.cape = new ModelRenderer((ModelBase)this, 44, 30);
        this.cape.addBox(-7.0f, 1.0f, 3.0f, 14, 20, 0);
        this.cape.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotation(this.cape, 0.2268928f, 0.0f, 0.0f);
        this.head.addChild(this.headtail1);
        this.head.addChild(this.headtail2);
        this.head.addChild(this.headtail3);
        this.body.addChild(this.cape);
        this.body.addChild(this.body2);
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
        float rota;
        this.head.rotateAngleY = par4 / 57.295776f;
        this.head.rotateAngleX = par5 / 57.295776f;
        this.rightarm.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 2.0f * par2 * 0.5f;
        this.leftarm.rotateAngleX = MathHelper.cos((float)(par1 * 0.6662f)) * 2.0f * par2 * 0.5f;
        this.rightarm.rotateAngleZ = 0.1745329f;
        this.leftarm.rotateAngleZ = -0.1745329f;
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
        }
        if ((rota = -MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2) > 0.0f) {
            rota *= -1.0f;
        }
        this.cape.rotateAngleX = -0.23f + rota;
        if (0.0f > this.cape.rotateAngleX) {
            this.cape.rotateAngleX *= -1.0f;
        }
        this.cape.rotateAngleY = 0.0f;
        this.rightarm.rotateAngleZ += MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
        this.leftarm.rotateAngleZ -= MathHelper.cos((float)(par3 * 0.09f)) * 0.05f + 0.05f;
        this.rightarm.rotateAngleX += MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
        this.leftarm.rotateAngleX -= MathHelper.sin((float)(par3 * 0.067f)) * 0.05f;
    }
}

