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

public class ModelMajora
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
    public ModelRenderer EarR1;
    public ModelRenderer Snout1;
    public ModelRenderer SideFurR1;
    public ModelRenderer EarL1;
    public ModelRenderer SideFurL1;
    public ModelRenderer EarR2;
    public ModelRenderer EarR3;
    public ModelRenderer Earing1;
    public ModelRenderer Earing2;
    public ModelRenderer Snout2;
    public ModelRenderer SnoutSideR;
    public ModelRenderer SnoutSideL;
    public ModelRenderer SideFurR2;
    public ModelRenderer EarL2;
    public ModelRenderer EarL3;
    public ModelRenderer SideFurL2;
    public ModelRenderer Body2;
    public ModelRenderer Neck;
    public ModelRenderer Body3;
    public ModelRenderer Cloth1;
    public ModelRenderer Cloth2;
    public ModelRenderer LegR2;
    public ModelRenderer LegL2;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmL2;

    public ModelMajora() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.SnoutSideR = new ModelRenderer((ModelBase)this, 47, 8);
        this.SnoutSideR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.SnoutSideR.addBox(-0.2f, -2.6f, -4.9f, 2, 2, 1, 0.0f);
        this.setRotateAngle(this.SnoutSideR, 0.0f, 0.5934119f, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 47, 48);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-3.0f, 6.7f, -2.0f, 4, 7, 4, 0.0f);
        this.SnoutSideL = new ModelRenderer((ModelBase)this, 47, 8);
        this.SnoutSideL.mirror = true;
        this.SnoutSideL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.SnoutSideL.addBox(-1.7f, -2.6f, -4.9f, 2, 2, 1, 0.0f);
        this.setRotateAngle(this.SnoutSideL, 0.0f, -0.5934119f, 0.0f);
        this.Cloth1 = new ModelRenderer((ModelBase)this, 28, 21);
        this.Cloth1.setRotationPoint(0.0f, 8.8f, -2.0f);
        this.Cloth1.addBox(-2.5f, 0.0f, 0.0f, 5, 10, 0, 0.0f);
        this.setRotateAngle(this.Cloth1, -0.090757124f, 0.0f, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 47, 48);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL2.addBox(-1.0f, 6.7f, -2.0f, 4, 7, 4, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -0.8f, 0.0f);
        this.Head.addBox(-3.5f, -6.7f, -4.0f, 7, 7, 8, -0.2f);
        this.EarR1 = new ModelRenderer((ModelBase)this, 70, 11);
        this.EarR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarR1.addBox(-4.4f, -9.8f, 1.0f, 4, 4, 1, 0.0f);
        this.setRotateAngle(this.EarR1, 0.18675023f, 0.07853982f, 0.0f);
        this.Earing1 = new ModelRenderer((ModelBase)this, 26, 3);
        this.Earing1.setRotationPoint(-3.5f, -10.0f, 1.6f);
        this.Earing1.addBox(-2.4f, 0.0f, -1.4f, 3, 0, 3, 0.0f);
        this.setRotateAngle(this.Earing1, 0.1605703f, 0.0f, -0.4553564f);
        this.EarR3 = new ModelRenderer((ModelBase)this, 81, 7);
        this.EarR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarR3.addBox(-3.3f, -11.2f, 2.7f, 2, 6, 1, 0.0f);
        this.setRotateAngle(this.EarR3, 0.13665928f, 0.0f, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 26, 37);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-1.8f, 1.1f, -2.0f, 4, 5, 4, 0.3f);
        this.SideFurR2 = new ModelRenderer((ModelBase)this, 58, 10);
        this.SideFurR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.SideFurR2.addBox(-4.6f, -1.7f, -1.4f, 1, 2, 3, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 26, 47);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 47, 34);
        this.ArmR1.setRotationPoint(-4.7f, 0.7f, 0.0f);
        this.ArmR1.addBox(-2.9f, -1.0f, -2.0f, 4, 8, 4, -0.3f);
        this.setRotateAngle(this.ArmR1, 0.0f, 0.0f, 0.0418879f);
        this.EarR2 = new ModelRenderer((ModelBase)this, 71, 5);
        this.EarR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarR2.addBox(-3.9f, -12.8f, 1.0f, 3, 3, 1, 0.0f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 47, 34);
        this.ArmL1.mirror = true;
        this.ArmL1.setRotationPoint(4.7f, 0.7f, 0.0f);
        this.ArmL1.addBox(-1.1f, -1.0f, -2.0f, 4, 8, 4, -0.3f);
        this.setRotateAngle(this.ArmL1, 0.0f, 0.0f, -0.0418879f);
        this.SideFurR1 = new ModelRenderer((ModelBase)this, 56, 1);
        this.SideFurR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.SideFurR1.addBox(-4.2f, -2.8f, -3.2f, 1, 3, 5, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 32);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.5f, 6.0f, -1.9f, 7, 3, 3, 0.0f);
        this.Snout2 = new ModelRenderer((ModelBase)this, 42, 8);
        this.Snout2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Snout2.addBox(-0.5f, 1.1f, -4.5f, 1, 2, 1, 0.0f);
        this.setRotateAngle(this.Snout2, -1.0927507f, 0.0f, 0.0f);
        this.EarL3 = new ModelRenderer((ModelBase)this, 81, 7);
        this.EarL3.mirror = true;
        this.EarL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL3.addBox(1.3f, -11.2f, 2.7f, 2, 6, 1, 0.0f);
        this.setRotateAngle(this.EarL3, 0.13665928f, 0.0f, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 26, 47);
        this.LegR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 26, 37);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.3f, 1.1f, -2.0f, 4, 5, 4, 0.3f);
        this.Earing2 = new ModelRenderer((ModelBase)this, 26, 3);
        this.Earing2.setRotationPoint(-4.0f, -8.8f, 1.6f);
        this.Earing2.addBox(-2.4f, 0.0f, -1.4f, 3, 0, 3, 0.0f);
        this.setRotateAngle(this.Earing2, 0.21293017f, 0.0f, -0.64385194f);
        this.SideFurL2 = new ModelRenderer((ModelBase)this, 58, 10);
        this.SideFurL2.mirror = true;
        this.SideFurL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.SideFurL2.addBox(3.8f, -1.7f, -1.4f, 1, 2, 3, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 41);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-4.0f, 9.0f, -2.0f, 8, 3, 4, 0.0f);
        this.Neck = new ModelRenderer((ModelBase)this, 5, 16);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.addBox(-2.0f, -0.9f, -0.8f, 4, 1, 2, 0.0f);
        this.EarL2 = new ModelRenderer((ModelBase)this, 71, 5);
        this.EarL2.mirror = true;
        this.EarL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL2.addBox(1.0f, -12.8f, 1.0f, 3, 3, 1, 0.0f);
        this.Cloth2 = new ModelRenderer((ModelBase)this, 41, 20);
        this.Cloth2.setRotationPoint(0.0f, 9.0f, 2.0f);
        this.Cloth2.addBox(-4.5f, 0.0f, 0.0f, 9, 12, 0, 0.0f);
        this.setRotateAngle(this.Cloth2, 0.090757124f, 0.0f, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 20);
        this.Body1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body1.addBox(-4.0f, 0.0f, -2.2f, 8, 6, 4, 0.0f);
        this.EarL1 = new ModelRenderer((ModelBase)this, 70, 11);
        this.EarL1.mirror = true;
        this.EarL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL1.addBox(0.5f, -9.8f, 1.0f, 4, 4, 1, 0.0f);
        this.setRotateAngle(this.EarL1, 0.18675023f, -0.07853982f, 0.0f);
        this.SideFurL1 = new ModelRenderer((ModelBase)this, 56, 1);
        this.SideFurL1.mirror = true;
        this.SideFurL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.SideFurL1.addBox(3.2f, -2.8f, -3.2f, 1, 3, 5, 0.0f);
        this.Snout1 = new ModelRenderer((ModelBase)this, 41, 1);
        this.Snout1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Snout1.addBox(-1.5f, -2.7f, -5.8f, 3, 3, 2, 0.0f);
        this.Snout1.addChild(this.SnoutSideR);
        this.ArmR1.addChild(this.ArmR2);
        this.Snout1.addChild(this.SnoutSideL);
        this.Body3.addChild(this.Cloth1);
        this.ArmL1.addChild(this.ArmL2);
        this.Head.addChild(this.EarR1);
        this.EarR1.addChild(this.Earing1);
        this.EarR1.addChild(this.EarR3);
        this.SideFurR1.addChild(this.SideFurR2);
        this.LegL.addChild(this.LegL2);
        this.EarR1.addChild(this.EarR2);
        this.Head.addChild(this.SideFurR1);
        this.Body1.addChild(this.Body2);
        this.Snout1.addChild(this.Snout2);
        this.EarL1.addChild(this.EarL3);
        this.LegR.addChild(this.LegR2);
        this.EarR1.addChild(this.Earing2);
        this.SideFurL1.addChild(this.SideFurL2);
        this.Body2.addChild(this.Body3);
        this.Body1.addChild(this.Neck);
        this.EarL1.addChild(this.EarL2);
        this.Body3.addChild(this.Cloth2);
        this.Head.addChild(this.EarL1);
        this.Head.addChild(this.SideFurL1);
        this.Head.addChild(this.Snout1);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.ArmL1.render(f5);
        this.Head.render(f5);
        this.ArmR1.render(f5);
        this.Body1.render(f5);
        this.LegL.render(f5);
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
        float ex = par7Entity.ticksExisted;
        float r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        float r4 = MathHelper.cos((float)(ex / 8.0f)) / 5.0f + 0.1f;
        r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        r4 = MathHelper.cos((float)(ex / 8.0f)) / 3.0f - 0.2f;
        this.LegR.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmR1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR1.rotateAngleY = 0.0f;
        this.ArmL1.rotateAngleY = 0.0f;
        this.Cloth1.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth1.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth2.rotateAngleX = 0.15f + this.LegL.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth2.rotateAngleX = 0.15f + this.LegL.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

