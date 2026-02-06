/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBuuSuper_Piccolo
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Head2;
    public ModelRenderer Head3;
    public ModelRenderer Head4;
    public ModelRenderer Head5;
    public ModelRenderer Head6;
    public ModelRenderer Hips;
    public ModelRenderer Torso;
    public ModelRenderer Cape;
    public ModelRenderer CapeNeck;
    public ModelRenderer CapeBack;
    public ModelRenderer CapeR;
    public ModelRenderer CapeL;
    public ModelRenderer FootL;
    public ModelRenderer FootR;

    public ModelBuuSuper_Piccolo() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Head5 = new ModelRenderer((ModelBase)this, 37, 10);
        this.Head5.setRotationPoint(0.0f, -4.7f, -0.3f);
        this.Head5.addBox(-0.5f, -6.0f, -0.6f, 1, 6, 2, 0.0f);
        this.setRotateAngle(this.Head5, -0.63739425f, 0.0f, 0.0f);
        this.Head6 = new ModelRenderer((ModelBase)this, 44, 11);
        this.Head6.setRotationPoint(0.0f, -5.6f, 0.3f);
        this.Head6.addBox(-0.5f, -6.0f, -0.6f, 1, 6, 1, 0.0f);
        this.setRotateAngle(this.Head6, -0.46251225f, 0.0f, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 46, 30);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.3f, -2.0f, 0.3f);
        this.ArmL.addBox(-1.2f, -1.3f, -1.8f, 4, 12, 4, -0.2f);
        this.Body = new ModelRenderer((ModelBase)this, 22, 29);
        this.Body.setRotationPoint(0.0f, -3.2f, 0.0f);
        this.Body.addBox(-3.5f, 3.0f, -1.9f, 7, 7, 4, 0.0f);
        this.Head4 = new ModelRenderer((ModelBase)this, 49, 1);
        this.Head4.setRotationPoint(0.0f, -5.5f, 0.1f);
        this.Head4.addBox(-1.0f, -5.1f, -0.8f, 2, 5, 2, 0.0f);
        this.setRotateAngle(this.Head4, -0.7285004f, 0.0f, 0.0f);
        this.Cape = new ModelRenderer((ModelBase)this, 75, 14);
        this.Cape.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Cape.addBox(-4.0f, 0.0f, -2.4f, 8, 4, 2, 0.0f);
        this.CapeL = new ModelRenderer((ModelBase)this, 50, 18);
        this.CapeL.mirror = true;
        this.CapeL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.CapeL.addBox(-1.9f, -1.4f, -2.3f, 7, 3, 5, 0.0f);
        this.CapeBack = new ModelRenderer((ModelBase)this, 75, 22);
        this.CapeBack.setRotationPoint(0.0f, 1.1f, 2.8f);
        this.CapeBack.addBox(-5.5f, -0.3f, 0.2f, 11, 19, 0, 0.0f);
        this.setRotateAngle(this.CapeBack, 0.0418879f, 0.0f, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 28);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 9.0f, 0.0f);
        this.LegL.addBox(-2.0f, 2.0f, -2.3f, 4, 7, 5, 0.3f);
        this.FootR = new ModelRenderer((ModelBase)this, 0, 43);
        this.FootR.mirror = true;
        this.FootR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootR.addBox(-2.0f, 0.0f, -2.3f, 4, 15, 5, 0.0f);
        this.FootL = new ModelRenderer((ModelBase)this, 0, 43);
        this.FootL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootL.addBox(-2.0f, 0.0f, -2.3f, 4, 15, 5, 0.0f);
        this.Torso = new ModelRenderer((ModelBase)this, 21, 19);
        this.Torso.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Torso.addBox(-4.5f, 0.6f, -1.2f, 9, 5, 4, 0.0f);
        this.CapeNeck = new ModelRenderer((ModelBase)this, 71, 4);
        this.CapeNeck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.CapeNeck.addBox(-3.5f, -0.7f, -3.1f, 7, 2, 7, 0.0f);
        this.Head2 = new ModelRenderer((ModelBase)this, 25, 0);
        this.Head2.setRotationPoint(0.0f, -6.5f, -2.3f);
        this.Head2.addBox(-1.5f, -4.2f, -1.0f, 3, 4, 3, 0.0f);
        this.setRotateAngle(this.Head2, -0.49392816f, 0.0f, 0.0f);
        this.Head3 = new ModelRenderer((ModelBase)this, 38, 1);
        this.Head3.setRotationPoint(0.0f, -3.8f, -0.6f);
        this.Head3.addBox(-1.5f, -6.1f, -0.5f, 3, 6, 2, 0.0f);
        this.setRotateAngle(this.Head3, -0.68294734f, 0.0f, 0.0f);
        this.Hips = new ModelRenderer((ModelBase)this, 19, 41);
        this.Hips.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hips.addBox(-4.0f, 9.2f, -2.3f, 8, 3, 5, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -3.2f, 0.4f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, -0.7f);
        this.ArmR = new ModelRenderer((ModelBase)this, 46, 30);
        this.ArmR.setRotationPoint(-5.3f, -2.0f, 0.3f);
        this.ArmR.addBox(-3.0f, -1.3f, -1.8f, 4, 12, 4, -0.1f);
        this.CapeR = new ModelRenderer((ModelBase)this, 50, 18);
        this.CapeR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.CapeR.addBox(-5.1f, -1.4f, -2.3f, 7, 3, 5, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 28);
        this.LegR.setRotationPoint(-2.0f, 9.0f, 0.0f);
        this.LegR.addBox(-2.0f, 2.0f, -2.3f, 4, 7, 5, 0.3f);
        this.Head4.addChild(this.Head5);
        this.Head5.addChild(this.Head6);
        this.Head3.addChild(this.Head4);
        this.Body.addChild(this.Cape);
        this.ArmL.addChild(this.CapeL);
        this.Cape.addChild(this.CapeBack);
        this.LegR.addChild(this.FootR);
        this.LegL.addChild(this.FootL);
        this.Body.addChild(this.Torso);
        this.Body.addChild(this.CapeNeck);
        this.Head.addChild(this.Head2);
        this.Head2.addChild(this.Head3);
        this.Body.addChild(this.Hips);
        this.ArmR.addChild(this.CapeR);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.Body.render(f5);
        this.LegR.render(f5);
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
        this.CapeBack.rotateAngleX = -0.15f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        if (0.0f > this.CapeBack.rotateAngleX) {
            this.CapeBack.rotateAngleX *= -1.0f;
        }
        this.CapeBack.rotateAngleY = 0.0f;
        this.LegR.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.ArmR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

