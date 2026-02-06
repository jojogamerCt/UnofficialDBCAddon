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

public class ModelBeerusMonaka
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer earR;
    public ModelRenderer earL;
    public ModelRenderer Neck;
    public ModelRenderer Body2;
    public ModelRenderer Belt;
    public ModelRenderer NeckCape;
    public ModelRenderer CapeBase;
    public ModelRenderer LegR2;
    public ModelRenderer LegL2;

    public ModelBeerusMonaka() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.earR = new ModelRenderer((ModelBase)this, 33, 4);
        this.earR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.earR.addBox(-6.5f, -4.5f, -2.2f, 3, 2, 1, 0.0f);
        this.setRotateAngle(this.earR, 0.0f, 0.4098033f, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -0.6f, 0.0f);
        this.Head.addBox(-4.1f, -7.7f, -4.0f, 8, 8, 8, 0.0f);
        this.NeckCape = new ModelRenderer((ModelBase)this, 37, 8);
        this.NeckCape.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.NeckCape.addBox(-4.5f, -2.7f, 0.1f, 9, 3, 4, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 39);
        this.LegR.setRotationPoint(-2.1f, 12.0f, 0.0f);
        this.LegR.addBox(-2.1f, -0.5f, -2.0f, 4, 11, 4, -0.4f);
        this.Belt = new ModelRenderer((ModelBase)this, 40, 36);
        this.Belt.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Belt.addBox(-2.0f, 4.9f, -2.6f, 4, 4, 1, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 2, 20);
        this.ArmR.setRotationPoint(-4.8f, 1.5f, 0.0f);
        this.ArmR.addBox(-2.0f, -1.6f, -1.8f, 3, 12, 4, -0.2f);
        this.Body2 = new ModelRenderer((ModelBase)this, 17, 37);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-4.0f, 8.0f, -2.3f, 8, 4, 5, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 0, 55);
        this.LegR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR2.addBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 2, 20);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(4.8f, 1.5f, 0.0f);
        this.ArmL.addBox(-1.0f, -1.6f, -1.8f, 3, 12, 4, -0.2f);
        this.Neck = new ModelRenderer((ModelBase)this, 23, 17);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.addBox(-2.0f, -1.0f, -0.8f, 4, 2, 2, 0.0f);
        this.CapeBase = new ModelRenderer((ModelBase)this, 43, 16);
        this.CapeBase.setRotationPoint(0.0f, 0.3f, 2.3f);
        this.CapeBase.addBox(-4.5f, 0.0f, -0.4f, 9, 15, 1, 0.0f);
        this.setRotateAngle(this.CapeBase, 0.090757124f, 0.0f, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 0, 55);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL2.addBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 18, 23);
        this.Body1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body1.addBox(-4.0f, 0.0f, -1.8f, 8, 8, 4, 0.0f);
        this.earL = new ModelRenderer((ModelBase)this, 33, 4);
        this.earL.mirror = true;
        this.earL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.earL.addBox(3.3f, -4.5f, -2.2f, 3, 2, 1, 0.0f);
        this.setRotateAngle(this.earL, 0.0f, -0.4098033f, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 39);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.1f, 12.0f, 0.0f);
        this.LegL.addBox(-1.9f, -0.5f, -2.0f, 4, 11, 4, -0.4f);
        this.Head.addChild(this.earR);
        this.Body1.addChild(this.NeckCape);
        this.Body1.addChild(this.Belt);
        this.Body1.addChild(this.Body2);
        this.LegR.addChild(this.LegR2);
        this.Body1.addChild(this.Neck);
        this.NeckCape.addChild(this.CapeBase);
        this.LegL.addChild(this.LegL2);
        this.Head.addChild(this.earL);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.Body1.render(f5);
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
        this.CapeBase.rotateAngleX = -0.15f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        if (0.0f > this.CapeBase.rotateAngleX) {
            this.CapeBase.rotateAngleX *= -1.0f;
        }
        this.CapeBase.rotateAngleY = 0.0f;
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

