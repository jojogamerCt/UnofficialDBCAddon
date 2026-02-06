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

public class ModelGodMosco
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
    public ModelRenderer LegL1;
    public ModelRenderer LegR1;
    public ModelRenderer HeadSpike1;
    public ModelRenderer HeadSideR;
    public ModelRenderer HeadSideL;
    public ModelRenderer HeadFront;
    public ModelRenderer HeadSpike2;
    public ModelRenderer FrontDoor;
    public ModelRenderer Body2;
    public ModelRenderer ClothF;
    public ModelRenderer Body3;
    public ModelRenderer Body4;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer ArmR4;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;
    public ModelRenderer ArmL4;
    public ModelRenderer LegL2;
    public ModelRenderer LegL3;
    public ModelRenderer LegL4;
    public ModelRenderer LegR2;
    public ModelRenderer LegR3;
    public ModelRenderer LegR4;

    public ModelGodMosco() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.ArmR3 = new ModelRenderer((ModelBase)this, 53, 23);
        this.ArmR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR3.addBox(-4.7f, 6.1f, -3.0f, 5, 5, 6, 0.0f);
        this.setRotateAngle(this.ArmR3, 0.0f, 0.0f, -0.06981317f);
        this.HeadSideL = new ModelRenderer((ModelBase)this, 33, 0);
        this.HeadSideL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadSideL.addBox(3.9f, -4.1f, -1.9f, 1, 4, 3, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 81, 12);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL2.addBox(-1.5f, 1.1f, -2.0f, 3, 5, 4, 0.0f);
        this.setRotateAngle(this.LegL2, 0.0f, 0.0f, -0.054105207f);
        this.FrontDoor = new ModelRenderer((ModelBase)this, 0, 14);
        this.FrontDoor.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FrontDoor.addBox(-2.5f, 5.1f, -6.2f, 5, 4, 1, 0.0f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 53, 23);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL3.addBox(-0.4f, 6.1f, -3.0f, 5, 5, 6, 0.0f);
        this.setRotateAngle(this.ArmL3, 0.0f, 0.0f, 0.06981317f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 57, 13);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL2.addBox(0.0f, 1.7f, -2.0f, 3, 5, 4, 0.0f);
        this.setRotateAngle(this.ArmL2, 0.0f, 0.0f, -0.1308997f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 51, 2);
        this.ArmL1.mirror = true;
        this.ArmL1.setRotationPoint(6.6f, -0.8f, -0.8f);
        this.ArmL1.addBox(-0.6f, -2.2f, -3.0f, 4, 4, 6, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 1, 47);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-6.0f, 12.0f, -5.0f, 12, 2, 9, 0.0f);
        this.ArmR4 = new ModelRenderer((ModelBase)this, 57, 35);
        this.ArmR4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR4.addBox(-4.1f, 10.8f, -2.4f, 4, 4, 5, 0.0f);
        this.setRotateAngle(this.ArmR4, 0.0f, 0.0f, -0.013962634f);
        this.HeadFront = new ModelRenderer((ModelBase)this, 32, 8);
        this.HeadFront.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadFront.addBox(-1.5f, -3.7f, -4.7f, 3, 3, 1, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -2.9f, 0.0f);
        this.Head.addBox(-4.0f, -5.1f, -3.9f, 8, 5, 7, 0.0f);
        this.HeadSpike2 = new ModelRenderer((ModelBase)this, 26, 4);
        this.HeadSpike2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadSpike2.addBox(-0.5f, -7.1f, -0.8f, 1, 1, 1, 0.0f);
        this.LegR1 = new ModelRenderer((ModelBase)this, 79, 2);
        this.LegR1.setRotationPoint(-4.1f, 12.0f, -0.6f);
        this.LegR1.addBox(-2.0f, -1.3f, -2.6f, 4, 3, 5, 0.0f);
        this.setRotateAngle(this.LegR1, 0.0f, 0.0f, 0.18203785f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 51, 2);
        this.ArmR1.setRotationPoint(-6.6f, -0.8f, -0.8f);
        this.ArmR1.addBox(-3.4f, -2.2f, -3.0f, 4, 4, 6, 0.0f);
        this.ClothF = new ModelRenderer((ModelBase)this, 60, 47);
        this.ClothF.setRotationPoint(0.0f, 12.0f, -5.0f);
        this.ClothF.addBox(-2.5f, 0.0f, -0.3f, 5, 8, 0, 0.0f);
        this.setRotateAngle(this.ClothF, -0.04363323f, 0.0f, 0.0f);
        this.HeadSideR = new ModelRenderer((ModelBase)this, 33, 0);
        this.HeadSideR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadSideR.addBox(-4.8f, -4.1f, -1.9f, 1, 4, 3, 0.0f);
        this.ArmL4 = new ModelRenderer((ModelBase)this, 57, 35);
        this.ArmL4.mirror = true;
        this.ArmL4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL4.addBox(0.0f, 10.8f, -2.4f, 4, 4, 5, 0.0f);
        this.setRotateAngle(this.ArmL4, 0.0f, 0.0f, 0.013962634f);
        this.LegL1 = new ModelRenderer((ModelBase)this, 79, 2);
        this.LegL1.mirror = true;
        this.LegL1.setRotationPoint(4.1f, 12.0f, -0.6f);
        this.LegL1.addBox(-2.0f, -1.3f, -2.6f, 4, 3, 5, 0.0f);
        this.setRotateAngle(this.LegL1, 0.0f, 0.0f, -0.18203785f);
        this.LegL3 = new ModelRenderer((ModelBase)this, 80, 22);
        this.LegL3.mirror = true;
        this.LegL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL3.addBox(-1.0f, 5.0f, -3.0f, 5, 7, 6, 0.0f);
        this.setRotateAngle(this.LegL3, 0.0f, 0.0f, 0.23387411f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 81, 12);
        this.LegR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR2.addBox(-1.5f, 1.1f, -2.0f, 3, 5, 4, 0.0f);
        this.setRotateAngle(this.LegR2, 0.0f, 0.0f, 0.054105207f);
        this.LegR4 = new ModelRenderer((ModelBase)this, 82, 36);
        this.LegR4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR4.addBox(-3.3f, 9.9f, -5.0f, 4, 2, 2, 0.0f);
        this.LegL4 = new ModelRenderer((ModelBase)this, 82, 36);
        this.LegL4.mirror = true;
        this.LegL4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL4.addBox(-0.6f, 9.9f, -5.0f, 4, 2, 2, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 5, 14);
        this.Body1.setRotationPoint(0.0f, -3.0f, 0.0f);
        this.Body1.addBox(-6.0f, 0.0f, -4.8f, 12, 5, 9, 0.0f);
        this.HeadSpike1 = new ModelRenderer((ModelBase)this, 24, 0);
        this.HeadSpike1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadSpike1.addBox(-1.0f, -6.1f, -1.3f, 2, 1, 2, 0.0f);
        this.Body4 = new ModelRenderer((ModelBase)this, 36, 51);
        this.Body4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body4.addBox(-3.0f, 13.8f, -5.0f, 6, 2, 8, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 57, 13);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-3.1f, 1.7f, -2.0f, 3, 5, 4, 0.0f);
        this.setRotateAngle(this.ArmR2, 0.0f, 0.0f, 0.1308997f);
        this.LegR3 = new ModelRenderer((ModelBase)this, 80, 22);
        this.LegR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR3.addBox(-3.9f, 5.0f, -3.0f, 5, 7, 6, 0.0f);
        this.setRotateAngle(this.LegR3, 0.0f, 0.0f, -0.23387411f);
        this.Body2 = new ModelRenderer((ModelBase)this, 2, 29);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-6.0f, 5.0f, -5.4f, 12, 7, 10, 0.0f);
        this.ArmR2.addChild(this.ArmR3);
        this.Head.addChild(this.HeadSideL);
        this.LegL1.addChild(this.LegL2);
        this.Body1.addChild(this.FrontDoor);
        this.ArmL2.addChild(this.ArmL3);
        this.ArmL1.addChild(this.ArmL2);
        this.Body2.addChild(this.Body3);
        this.ArmR3.addChild(this.ArmR4);
        this.Head.addChild(this.HeadFront);
        this.HeadSpike1.addChild(this.HeadSpike2);
        this.Body1.addChild(this.ClothF);
        this.Head.addChild(this.HeadSideR);
        this.ArmL3.addChild(this.ArmL4);
        this.LegL2.addChild(this.LegL3);
        this.LegR1.addChild(this.LegR2);
        this.LegR3.addChild(this.LegR4);
        this.LegL3.addChild(this.LegL4);
        this.Head.addChild(this.HeadSpike1);
        this.Body3.addChild(this.Body4);
        this.ArmR1.addChild(this.ArmR2);
        this.LegR2.addChild(this.LegR3);
        this.Body1.addChild(this.Body2);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float F = 1.5f;
        JGRenderHelper.modelScalePositionHelper((float)1.5f);
        this.LegL1.render(f5);
        this.Head.render(f5);
        this.ArmL1.render(f5);
        this.ArmR1.render(f5);
        this.Body1.render(f5);
        this.LegR1.render(f5);
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
        this.LegR1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmR1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR1.rotateAngleY = 0.0f;
        this.LegL1.rotateAngleY = 0.0f;
        this.ArmR1.rotateAngleY = 0.0f;
        this.ArmL1.rotateAngleY = 0.0f;
        this.ClothF.rotateAngleX = -0.15f + this.LegR1.rotateAngleX * (float)(this.LegR1.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

