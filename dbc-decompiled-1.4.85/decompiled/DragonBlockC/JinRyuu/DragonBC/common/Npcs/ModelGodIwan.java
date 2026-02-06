/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.client.JGRenderHelper
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.JRMCore.client.JGRenderHelper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGodIwan
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Hat;
    public ModelRenderer earL;
    public ModelRenderer earR;
    public ModelRenderer BeardNeck;
    public ModelRenderer Body2;
    public ModelRenderer Cloth1;
    public ModelRenderer Body3;
    public ModelRenderer LegL2;
    public ModelRenderer LegR2;

    public ModelGodIwan() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Body2 = new ModelRenderer((ModelBase)this, 37, 29);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-6.0f, 5.0f, -4.7f, 12, 5, 9, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 38, 14);
        this.Body1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body1.addBox(-5.5f, 0.0f, -4.0f, 11, 5, 8, 0.0f);
        this.earL = new ModelRenderer((ModelBase)this, 1, 1);
        this.earL.mirror = true;
        this.earL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.earL.addBox(1.1f, -7.5f, -0.5f, 2, 3, 1, 0.0f);
        this.setRotateAngle(this.earL, 0.0f, -0.13613568f, 0.5462881f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-4.5f, -5.1f, -4.6f, 9, 5, 8, 0.0f);
        this.Hat = new ModelRenderer((ModelBase)this, 37, 4);
        this.Hat.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hat.addBox(-2.5f, -7.9f, -2.4f, 5, 3, 5, 0.0f);
        this.Cloth1 = new ModelRenderer((ModelBase)this, 83, 24);
        this.Cloth1.setRotationPoint(0.0f, 9.9f, -4.5f);
        this.Cloth1.addBox(-3.5f, 0.0f, -0.1f, 7, 11, 0, 0.0f);
        this.setRotateAngle(this.Cloth1, -0.057595864f, 0.0f, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 39, 44);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-5.5f, 9.1f, -4.1f, 11, 3, 8, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 0, 37);
        this.LegR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR2.addBox(-3.5f, 0.1f, -3.5f, 6, 8, 7, 0.0f);
        this.earR = new ModelRenderer((ModelBase)this, 1, 1);
        this.earR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.earR.addBox(-3.1f, -7.5f, -0.5f, 2, 3, 1, 0.0f);
        this.setRotateAngle(this.earR, 0.0f, 0.13613568f, -0.5462881f);
        this.ArmL = new ModelRenderer((ModelBase)this, 70, 5);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(6.4f, 1.7f, -0.2f);
        this.ArmL.addBox(-0.9f, -1.7f, -1.8f, 4, 11, 4, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 70, 5);
        this.ArmR.setRotationPoint(-6.4f, 1.7f, -0.2f);
        this.ArmR.addBox(-3.1f, -1.7f, -1.8f, 4, 11, 4, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 53);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.4f, 12.0f, 0.0f);
        this.LegL.addBox(-2.1f, 6.0f, -2.6f, 5, 6, 5, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 53);
        this.LegR.setRotationPoint(-2.6f, 12.0f, 0.0f);
        this.LegR.addBox(-2.9f, 6.0f, -2.5f, 5, 6, 5, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 0, 37);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL2.addBox(-2.5f, 0.1f, -3.5f, 6, 8, 7, 0.0f);
        this.BeardNeck = new ModelRenderer((ModelBase)this, 6, 20);
        this.BeardNeck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BeardNeck.addBox(-4.5f, -0.1f, -5.3f, 9, 5, 3, 0.0f);
        this.Body1.addChild(this.Body2);
        this.Head.addChild(this.earL);
        this.Head.addChild(this.Hat);
        this.Body1.addChild(this.Cloth1);
        this.Body2.addChild(this.Body3);
        this.LegR.addChild(this.LegR2);
        this.Head.addChild(this.earR);
        this.LegL.addChild(this.LegL2);
        this.Head.addChild(this.BeardNeck);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float F = 0.65f;
        JGRenderHelper.modelScalePositionHelper((float)0.65f);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.Body1.render(f5);
        this.LegR.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        int calc = par7Entity.ticksExisted;
        if (calc > 100) {
            calc -= 100;
        }
        float r = 360.0f;
        float r2 = 180.0f;
        float n4 = par4;
        float n5 = par5;
        this.Head.rotateAngleY = n4 / (r2 / (float)Math.PI);
        this.Head.rotateAngleX = n5 / (r2 / (float)Math.PI);
        float ex = par7Entity.ticksExisted;
        float r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        float r4 = MathHelper.cos((float)(ex / 8.0f)) / 5.0f + 0.1f;
        r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        r4 = MathHelper.cos((float)(ex / 8.0f)) / 3.0f - 0.2f;
        this.LegR.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
        this.Cloth1.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

