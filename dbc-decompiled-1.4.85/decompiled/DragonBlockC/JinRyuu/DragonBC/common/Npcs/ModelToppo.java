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

public class ModelToppo
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Moustache;
    public ModelRenderer Nose;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;

    public ModelToppo() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.ArmR3 = new ModelRenderer((ModelBase)this, 63, 38);
        this.ArmR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR3.addBox(-4.4f, 2.9f, -3.0f, 6, 9, 6, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -4.3f, -0.9f);
        this.Head.addBox(-4.0f, -6.6f, -4.0f, 8, 8, 8, 0.1f);
        this.Body1 = new ModelRenderer((ModelBase)this, 20, 16);
        this.Body1.setRotationPoint(0.0f, -4.8f, 0.0f);
        this.Body1.addBox(-6.5f, 0.0f, -3.4f, 13, 6, 7, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 19, 46);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-6.5f, 13.0f, -3.2f, 13, 4, 7, 0.0f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 62, 16);
        this.ArmL1.mirror = true;
        this.ArmL1.setRotationPoint(7.1f, -2.0f, 0.0f);
        this.ArmL1.addBox(-1.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmL1, 0.0f, 0.0f, -0.5009095f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 62, 16);
        this.ArmR1.setRotationPoint(-6.9f, -2.0f, 0.0f);
        this.ArmR1.addBox(-3.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmR1, 0.0f, 0.0f, 0.5009095f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.5f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.5f, 5, 12, 5, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 63, 27);
        this.ArmR2.setRotationPoint(0.0f, 3.5f, 0.0f);
        this.ArmR2.addBox(-3.7f, -0.7f, -2.5f, 5, 4, 5, 0.0f);
        this.setRotateAngle(this.ArmR2, 0.0f, 0.0f, -0.4098033f);
        this.EarL = new ModelRenderer((ModelBase)this, 33, 8);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(4.0f, -3.0f, -1.1f);
        this.EarL.addBox(-0.5f, -3.0f, 0.0f, 2, 4, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.68294734f, 0.31869712f);
        this.Nose = new ModelRenderer((ModelBase)this, 0, 0);
        this.Nose.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Nose.addBox(-1.0f, -2.4f, -5.2f, 2, 2, 2, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegR.setRotationPoint(-2.5f, 12.0f, 0.0f);
        this.LegR.addBox(-3.0f, 0.0f, -2.5f, 5, 12, 5, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 33, 8);
        this.EarR.setRotationPoint(-4.0f, -3.0f, -1.1f);
        this.EarR.addBox(-1.4f, -3.0f, 0.0f, 2, 4, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.68294734f, -0.31869712f);
        this.Body2 = new ModelRenderer((ModelBase)this, 18, 30);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-7.0f, 6.0f, -4.1f, 14, 7, 8, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 63, 27);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.0f, 3.5f, 0.0f);
        this.ArmL2.addBox(-1.5f, -0.7f, -2.5f, 5, 4, 5, 0.0f);
        this.setRotateAngle(this.ArmL2, 0.0f, 0.0f, 0.4098033f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 63, 38);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL3.addBox(-1.7f, 2.9f, -3.0f, 6, 9, 6, 0.0f);
        this.Moustache = new ModelRenderer((ModelBase)this, 26, 0);
        this.Moustache.setRotationPoint(0.0f, -1.1f, -4.2f);
        this.Moustache.addBox(-4.5f, 0.0f, 0.0f, 9, 6, 0, 0.0f);
        this.ArmR2.addChild(this.ArmR3);
        this.Body2.addChild(this.Body3);
        this.ArmR1.addChild(this.ArmR2);
        this.Head.addChild(this.EarL);
        this.Head.addChild(this.Nose);
        this.Head.addChild(this.EarR);
        this.Body1.addChild(this.Body2);
        this.ArmL1.addChild(this.ArmL2);
        this.ArmL2.addChild(this.ArmL3);
        this.Head.addChild(this.Moustache);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float F = 1.4f;
        JGRenderHelper.modelScalePositionHelper((float)1.4f);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL1.render(f5);
        this.ArmR1.render(f5);
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
        this.ArmR1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR1.rotateAngleY = 0.0f;
        this.ArmL1.rotateAngleY = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

