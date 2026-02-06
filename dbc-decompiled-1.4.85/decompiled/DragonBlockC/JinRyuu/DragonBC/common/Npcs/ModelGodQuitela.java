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

public class ModelGodQuitela
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer tail;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer EarL;
    public ModelRenderer EarR;
    public ModelRenderer Snout1;
    public ModelRenderer Snout2;
    public ModelRenderer Neck;
    public ModelRenderer Body3;
    public ModelRenderer Cloth1;
    public ModelRenderer tail_1;
    public ModelRenderer tail_2;
    public ModelRenderer tail_3;
    public ModelRenderer tail_4;
    public ModelRenderer LegR2;
    public ModelRenderer LegL2;

    public ModelGodQuitela() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.tail = new ModelRenderer((ModelBase)this, 42, 1);
        this.tail.setRotationPoint(0.0f, 10.3f, 1.5f);
        this.tail.addBox(-0.5f, -0.3f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail, 1.0011208f, 0.0f, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 27, 0);
        this.EarR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarR.addBox(-8.5f, -10.9f, 1.9f, 6, 6, 1, 0.0f);
        this.setRotateAngle(this.EarR, 0.10995574f, 0.0f, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 50, 16);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-2.0f, -2.0f, -1.8f, 3, 12, 4, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 27, 0);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.EarL.addBox(2.5f, -10.9f, 1.9f, 6, 6, 1, 0.0f);
        this.setRotateAngle(this.EarL, 0.10995574f, 0.0f, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 50, 16);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -1.8f, 3, 12, 4, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 33);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.3f, 1.4f, -2.0f, 4, 6, 4, 0.3f);
        this.tail_2 = new ModelRenderer((ModelBase)this, 42, 1);
        this.tail_2.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail_2.addBox(-0.5f, -0.1f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail_2, -0.18203785f, 0.0f, 0.0f);
        this.Neck = new ModelRenderer((ModelBase)this, 40, 6);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.addBox(-2.0f, -1.3f, -1.5f, 4, 2, 3, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -0.6f, 0.0f);
        this.Head.addBox(-4.5f, -8.0f, -4.0f, 9, 8, 8, 0.0f);
        this.tail_3 = new ModelRenderer((ModelBase)this, 42, 1);
        this.tail_3.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail_3.addBox(-0.5f, -0.1f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail_3, 0.27314404f, 0.0f, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Cloth1 = new ModelRenderer((ModelBase)this, 54, 0);
        this.Cloth1.setRotationPoint(0.0f, 10.0f, -1.6f);
        this.Cloth1.addBox(-2.5f, 0.0f, -0.5f, 5, 10, 0, 0.0f);
        this.setRotateAngle(this.Cloth1, -0.090757124f, 0.0f, 0.0f);
        this.tail_4 = new ModelRenderer((ModelBase)this, 42, 1);
        this.tail_4.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail_4.addBox(-0.5f, -0.1f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail_4, 0.27314404f, 0.0f, 0.0f);
        this.Snout1 = new ModelRenderer((ModelBase)this, 41, 14);
        this.Snout1.setRotationPoint(0.0f, 0.0f, 0.3f);
        this.Snout1.addBox(-1.5f, -3.4f, -5.4f, 3, 3, 2, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 20, 18);
        this.Body1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body1.addBox(-4.0f, 0.0f, -2.1f, 8, 8, 4, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 33);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-1.8f, 1.4f, -2.0f, 4, 6, 4, 0.3f);
        this.Snout2 = new ModelRenderer((ModelBase)this, 42, 11);
        this.Snout2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Snout2.addBox(-0.5f, 1.1f, -5.4f, 1, 2, 1, 0.0f);
        this.setRotateAngle(this.Snout2, -1.0927507f, 0.0f, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 20, 37);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-4.0f, 8.0f, -2.0f, 8, 4, 4, 0.0f);
        this.tail_1 = new ModelRenderer((ModelBase)this, 42, 1);
        this.tail_1.setRotationPoint(0.0f, 2.6f, 0.0f);
        this.tail_1.addBox(-0.5f, -0.1f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.tail_1, -0.18203785f, 0.0f, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Head.addChild(this.EarR);
        this.Head.addChild(this.EarL);
        this.tail_1.addChild(this.tail_2);
        this.Body1.addChild(this.Neck);
        this.tail_2.addChild(this.tail_3);
        this.LegL.addChild(this.LegL2);
        this.Body1.addChild(this.Cloth1);
        this.tail_3.addChild(this.tail_4);
        this.Head.addChild(this.Snout1);
        this.Snout1.addChild(this.Snout2);
        this.Body1.addChild(this.Body3);
        this.tail.addChild(this.tail_1);
        this.LegR.addChild(this.LegR2);
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

