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

public class ModelGodRumsshi
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer tail;
    public ModelRenderer Trunk1;
    public ModelRenderer TuskR1;
    public ModelRenderer TuskL1;
    public ModelRenderer EarR1;
    public ModelRenderer EarL1;
    public ModelRenderer Trunk2;
    public ModelRenderer Trunk3;
    public ModelRenderer Trunk4;
    public ModelRenderer TuskR2;
    public ModelRenderer TuskR3;
    public ModelRenderer TuskL2;
    public ModelRenderer TuskL3;
    public ModelRenderer EarR2;
    public ModelRenderer EarR3;
    public ModelRenderer EarL2;
    public ModelRenderer Earing;
    public ModelRenderer EarL3;
    public ModelRenderer Neck;
    public ModelRenderer Body2;
    public ModelRenderer Cloth1;
    public ModelRenderer Body3;
    public ModelRenderer LegR2;
    public ModelRenderer LegL2;
    public ModelRenderer ArmR_1;
    public ModelRenderer ArmL_1;
    public ModelRenderer tail_1;
    public ModelRenderer tail_2;
    public ModelRenderer tail_3;
    public ModelRenderer tail_4;

    public ModelGodRumsshi() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ArmL = new ModelRenderer((ModelBase)this, 49, 18);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -1.8f, 3, 10, 4, 0.0f);
        this.Trunk3 = new ModelRenderer((ModelBase)this, 24, 48);
        this.Trunk3.setRotationPoint(0.0f, 0.0f, -1.5f);
        this.Trunk3.addBox(-0.9f, -0.8f, -2.9f, 2, 3, 3, 0.0f);
        this.setRotateAngle(this.Trunk3, 0.22759093f, 0.0f, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -1.2f, 0.0f);
        this.Head.addBox(-3.5f, -7.0f, -4.3f, 7, 7, 8, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 49, 18);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-2.0f, -2.0f, -1.8f, 3, 10, 4, 0.0f);
        this.tail_2 = new ModelRenderer((ModelBase)this, 38, 1);
        this.tail_2.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail_2.addBox(-0.5f, -0.1f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail_2, -0.18203785f, 0.0f, 0.0f);
        this.tail_4 = new ModelRenderer((ModelBase)this, 43, 1);
        this.tail_4.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail_4.addBox(-1.0f, -0.1f, -0.5f, 2, 2, 1, 0.0f);
        this.setRotateAngle(this.tail_4, 0.27314404f, 0.0f, 0.0f);
        this.EarL1 = new ModelRenderer((ModelBase)this, 24, 54);
        this.EarL1.mirror = true;
        this.EarL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL1.addBox(-4.5f, -7.7f, -1.4f, 6, 2, 1, 0.0f);
        this.setRotateAngle(this.EarL1, 0.0f, 0.091106184f, 1.0471976f);
        this.Body3 = new ModelRenderer((ModelBase)this, 21, 38);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-3.5f, 8.0f, -2.9f, 7, 4, 5, 0.0f);
        this.EarR3 = new ModelRenderer((ModelBase)this, 24, 60);
        this.EarR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarR3.addBox(-1.9f, -4.2f, -2.0f, 4, 2, 1, 0.0f);
        this.setRotateAngle(this.EarR3, 0.0f, 0.0f, -0.19128808f);
        this.tail_1 = new ModelRenderer((ModelBase)this, 38, 1);
        this.tail_1.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail_1.addBox(-0.5f, -0.1f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail_1, -0.18203785f, 0.0f, 0.0f);
        this.EarL2 = new ModelRenderer((ModelBase)this, 24, 57);
        this.EarL2.mirror = true;
        this.EarL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL2.addBox(-4.1f, -6.0f, -1.6f, 6, 2, 1, 0.0f);
        this.setRotateAngle(this.EarL2, 0.0f, 0.0f, 0.073303826f);
        this.EarR2 = new ModelRenderer((ModelBase)this, 24, 57);
        this.EarR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarR2.addBox(-2.1f, -5.8f, -1.6f, 6, 2, 1, 0.0f);
        this.setRotateAngle(this.EarR2, 0.0f, 0.0f, -0.073303826f);
        this.tail_3 = new ModelRenderer((ModelBase)this, 38, 1);
        this.tail_3.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail_3.addBox(-0.5f, -0.1f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail_3, 0.27314404f, 0.0f, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 33);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-1.8f, 1.4f, -2.0f, 4, 6, 4, 0.3f);
        this.ArmL_1 = new ModelRenderer((ModelBase)this, 46, 33);
        this.ArmL_1.mirror = true;
        this.ArmL_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL_1.addBox(-1.5f, 8.0f, -2.3f, 4, 3, 5, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.TuskR1 = new ModelRenderer((ModelBase)this, 1, 54);
        this.TuskR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.TuskR1.addBox(-1.9f, -0.1f, -5.8f, 2, 3, 2, 0.0f);
        this.setRotateAngle(this.TuskR1, -0.68294734f, 0.18203785f, 0.0f);
        this.TuskR2 = new ModelRenderer((ModelBase)this, 10, 54);
        this.TuskR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.TuskR2.addBox(-1.6f, 2.8f, -5.7f, 1, 3, 2, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 23, 29);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.5f, 5.0f, -3.1f, 7, 3, 5, 0.0f);
        this.Trunk4 = new ModelRenderer((ModelBase)this, 35, 48);
        this.Trunk4.setRotationPoint(0.0f, 0.4f, -2.5f);
        this.Trunk4.addBox(-0.9f, -0.8f, -2.6f, 2, 2, 3, 0.0f);
        this.setRotateAngle(this.Trunk4, -0.5009095f, 0.0f, 0.0f);
        this.Cloth1 = new ModelRenderer((ModelBase)this, 54, 0);
        this.Cloth1.setRotationPoint(0.0f, 9.9f, -2.7f);
        this.Cloth1.addBox(-2.5f, 0.0f, -0.3f, 5, 10, 0, 0.0f);
        this.setRotateAngle(this.Cloth1, -0.04712389f, 0.0f, 0.0f);
        this.TuskL2 = new ModelRenderer((ModelBase)this, 10, 54);
        this.TuskL2.mirror = true;
        this.TuskL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.TuskL2.addBox(0.6f, 2.8f, -5.7f, 1, 3, 2, 0.0f);
        this.TuskL1 = new ModelRenderer((ModelBase)this, 1, 54);
        this.TuskL1.mirror = true;
        this.TuskL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.TuskL1.addBox(-0.1f, -0.1f, -5.8f, 2, 3, 2, 0.0f);
        this.setRotateAngle(this.TuskL1, -0.68294734f, -0.18203785f, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Neck = new ModelRenderer((ModelBase)this, 42, 6);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.addBox(-2.0f, -1.6f, -0.8f, 4, 2, 2, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 33);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.3f, 1.4f, -2.0f, 4, 6, 4, 0.3f);
        this.Trunk2 = new ModelRenderer((ModelBase)this, 13, 49);
        this.Trunk2.setRotationPoint(0.0f, 0.2f, -2.4f);
        this.Trunk2.addBox(-1.5f, -0.8f, -1.7f, 3, 3, 2, 0.0f);
        this.setRotateAngle(this.Trunk2, 0.4098033f, 0.0f, 0.0f);
        this.Earing = new ModelRenderer((ModelBase)this, 28, 0);
        this.Earing.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Earing.addBox(-1.0f, -7.9f, -1.9f, 1, 1, 2, 0.0f);
        this.tail = new ModelRenderer((ModelBase)this, 38, 1);
        this.tail.setRotationPoint(0.0f, 10.3f, 1.9f);
        this.tail.addBox(-0.5f, -0.3f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail, 1.0011208f, 0.0f, 0.0f);
        this.Trunk1 = new ModelRenderer((ModelBase)this, 0, 48);
        this.Trunk1.setRotationPoint(0.0f, -3.1f, -4.3f);
        this.Trunk1.addBox(-1.5f, -0.7f, -2.5f, 3, 2, 3, 0.0f);
        this.setRotateAngle(this.Trunk1, 0.95609134f, 0.0f, 0.0f);
        this.EarR1 = new ModelRenderer((ModelBase)this, 24, 54);
        this.EarR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarR1.addBox(-1.5f, -7.6f, -1.4f, 6, 2, 1, 0.0f);
        this.setRotateAngle(this.EarR1, 0.0f, -0.091106184f, -1.0471976f);
        this.Body1 = new ModelRenderer((ModelBase)this, 20, 18);
        this.Body1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body1.addBox(-4.0f, 0.0f, -2.0f, 8, 5, 4, 0.0f);
        this.TuskL3 = new ModelRenderer((ModelBase)this, 17, 55);
        this.TuskL3.mirror = true;
        this.TuskL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.TuskL3.addBox(0.6f, 6.7f, -3.1f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.TuskL3, -0.4098033f, 0.0f, 0.0f);
        this.EarL3 = new ModelRenderer((ModelBase)this, 24, 60);
        this.EarL3.mirror = true;
        this.EarL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL3.addBox(-2.6f, -4.4f, -2.0f, 4, 2, 1, 0.0f);
        this.setRotateAngle(this.EarL3, 0.0f, 0.0f, 0.19128808f);
        this.ArmR_1 = new ModelRenderer((ModelBase)this, 46, 33);
        this.ArmR_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR_1.addBox(-2.5f, 8.0f, -2.3f, 4, 3, 5, 0.0f);
        this.TuskR3 = new ModelRenderer((ModelBase)this, 17, 55);
        this.TuskR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.TuskR3.addBox(-1.6f, 6.7f, -3.1f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.TuskR3, -0.4098033f, 0.0f, 0.0f);
        this.Trunk2.addChild(this.Trunk3);
        this.tail_1.addChild(this.tail_2);
        this.tail_3.addChild(this.tail_4);
        this.Head.addChild(this.EarL1);
        this.Body2.addChild(this.Body3);
        this.EarR2.addChild(this.EarR3);
        this.tail.addChild(this.tail_1);
        this.EarL1.addChild(this.EarL2);
        this.EarR1.addChild(this.EarR2);
        this.tail_2.addChild(this.tail_3);
        this.ArmL.addChild(this.ArmL_1);
        this.LegL.addChild(this.LegL2);
        this.Head.addChild(this.TuskR1);
        this.TuskR1.addChild(this.TuskR2);
        this.Body1.addChild(this.Body2);
        this.Trunk3.addChild(this.Trunk4);
        this.Body1.addChild(this.Cloth1);
        this.TuskL1.addChild(this.TuskL2);
        this.Head.addChild(this.TuskL1);
        this.LegR.addChild(this.LegR2);
        this.Body1.addChild(this.Neck);
        this.Trunk1.addChild(this.Trunk2);
        this.EarL1.addChild(this.Earing);
        this.Head.addChild(this.Trunk1);
        this.Head.addChild(this.EarR1);
        this.TuskL2.addChild(this.TuskL3);
        this.EarL2.addChild(this.EarL3);
        this.ArmR.addChild(this.ArmR_1);
        this.TuskR2.addChild(this.TuskR3);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float F = 1.2f;
        JGRenderHelper.modelScalePositionHelper((float)1.2f);
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

