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
package JinRyuu.DragonBC.common.Npcs.dbtournament;

import JinRyuu.JRMCore.client.JGRenderHelper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGiran
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer tail1;
    public ModelRenderer Head2;
    public ModelRenderer Nose;
    public ModelRenderer Head3;
    public ModelRenderer NoseHorn;
    public ModelRenderer Body2;
    public ModelRenderer Chest;
    public ModelRenderer WingR;
    public ModelRenderer WingL;
    public ModelRenderer Body3;
    public ModelRenderer WingR_1;
    public ModelRenderer WingL_1;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmL2;
    public ModelRenderer LegR2;
    public ModelRenderer LegL2;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer tail4;
    public ModelRenderer tail5;

    public ModelGiran() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.tail5 = new ModelRenderer((ModelBase)this, 111, 109);
        this.tail5.setRotationPoint(0.0f, 0.0f, 5.9f);
        this.tail5.addBox(-1.0f, -1.0f, 0.0f, 2, 2, 5, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 90, 19);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.8f, 7.1f, -0.3f);
        this.ArmL2.addBox(-2.8f, -0.5f, -2.5f, 6, 9, 6, 0.0f);
        this.setRotateAngle(this.ArmL2, -0.4098033f, 0.0f, 0.08726646f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 46);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-9.0f, 7.0f, -4.1f, 18, 11, 11, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 26);
        this.Body1.setRotationPoint(0.0f, -2.9f, 0.0f);
        this.Body1.addBox(-8.0f, 0.0f, -2.4f, 16, 7, 9, 0.0f);
        this.Head3 = new ModelRenderer((ModelBase)this, 76, 4);
        this.Head3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head3.addBox(-0.5f, -3.6f, 0.8f, 1, 2, 4, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 91, 64);
        this.LegR2.setRotationPoint(0.0f, 10.0f, 1.9f);
        this.LegR2.addBox(-3.5f, 0.0f, -5.8f, 7, 3, 9, 0.0f);
        this.tail2 = new ModelRenderer((ModelBase)this, 67, 116);
        this.tail2.setRotationPoint(0.0f, -0.2f, 5.9f);
        this.tail2.addBox(-2.5f, -2.5f, 0.0f, 5, 5, 5, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 91, 64);
        this.LegL2.setRotationPoint(0.0f, 10.0f, 1.9f);
        this.LegL2.addBox(-3.5f, 0.0f, -5.8f, 7, 3, 9, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 53, 43);
        this.Chest.setRotationPoint(0.0f, 4.2f, -1.7f);
        this.Chest.addBox(-7.0f, -2.1f, -1.4f, 14, 5, 2, 0.0f);
        this.setRotateAngle(this.Chest, -0.091106184f, 0.0f, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 92, 3);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(8.8f, 0.0f, 2.0f);
        this.ArmL.addBox(-1.5f, -2.0f, -2.5f, 5, 9, 5, 0.0f);
        this.setRotateAngle(this.ArmL, 0.0f, 0.0f, -0.38397244f);
        this.tail3 = new ModelRenderer((ModelBase)this, 88, 116);
        this.tail3.setRotationPoint(0.0f, 0.0f, 4.9f);
        this.tail3.addBox(-2.0f, -2.0f, 0.0f, 4, 4, 6, 0.0f);
        this.tail4 = new ModelRenderer((ModelBase)this, 109, 117);
        this.tail4.setRotationPoint(0.0f, 0.0f, 5.9f);
        this.tail4.addBox(-1.5f, -1.5f, 0.0f, 3, 3, 6, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 91, 43);
        this.LegR.setRotationPoint(-7.2f, 11.0f, 1.0f);
        this.LegR.addBox(-3.5f, 0.0f, -3.5f, 7, 10, 8, 0.0f);
        this.tail1 = new ModelRenderer((ModelBase)this, 42, 114);
        this.tail1.setRotationPoint(0.0f, 11.5f, 6.5f);
        this.tail1.addBox(-3.0f, -3.0f, 0.0f, 6, 6, 6, 0.0f);
        this.Nose = new ModelRenderer((ModelBase)this, 35, 2);
        this.Nose.setRotationPoint(0.0f, -2.4f, -2.5f);
        this.Nose.addBox(-3.0f, -1.0f, -6.1f, 6, 4, 6, 0.0f);
        this.Head2 = new ModelRenderer((ModelBase)this, 61, 2);
        this.Head2.setRotationPoint(0.0f, -6.3f, 2.7f);
        this.Head2.addBox(-0.5f, -3.6f, -5.2f, 1, 4, 6, 0.0f);
        this.setRotateAngle(this.Head2, 0.4553564f, 0.0f, 0.0f);
        this.WingL_1 = new ModelRenderer((ModelBase)this, 2, 88);
        this.WingL_1.mirror = true;
        this.WingL_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.WingL_1.addBox(0.0f, -10.9f, 0.01f, 19, 19, 0, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 90, 19);
        this.ArmR2.setRotationPoint(-0.6f, 7.1f, -0.3f);
        this.ArmR2.addBox(-3.5f, -0.5f, -2.5f, 6, 9, 6, 0.0f);
        this.setRotateAngle(this.ArmR2, -0.4098033f, 0.0f, -0.08726646f);
        this.ArmR = new ModelRenderer((ModelBase)this, 92, 3);
        this.ArmR.setRotationPoint(-8.8f, 0.0f, 2.0f);
        this.ArmR.addBox(-3.5f, -2.0f, -2.5f, 5, 9, 5, 0.0f);
        this.setRotateAngle(this.ArmR, 0.0f, 0.0f, 0.38397244f);
        this.WingR_1 = new ModelRenderer((ModelBase)this, 2, 88);
        this.WingR_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.WingR_1.addBox(-19.0f, -10.9f, 0.01f, 19, 19, 0, 0.0f);
        this.NoseHorn = new ModelRenderer((ModelBase)this, 32, 2);
        this.NoseHorn.setRotationPoint(0.0f, -0.3f, -3.8f);
        this.NoseHorn.addBox(-0.5f, -3.0f, -0.5f, 1, 3, 1, 0.0f);
        this.WingR = new ModelRenderer((ModelBase)this, 2, 107);
        this.WingR.setRotationPoint(-2.9f, 4.0f, 6.9f);
        this.WingR.addBox(-19.0f, -10.7f, 0.0f, 19, 19, 0, 0.0f);
        this.setRotateAngle(this.WingR, 0.0f, 0.17453292f, 0.0f);
        this.WingL = new ModelRenderer((ModelBase)this, 2, 107);
        this.WingL.mirror = true;
        this.WingL.setRotationPoint(2.9f, 4.0f, 6.9f);
        this.WingL.addBox(0.0f, -10.7f, 0.0f, 19, 19, 0, 0.0f);
        this.setRotateAngle(this.WingL, 0.0f, -0.17453292f, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 91, 43);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(7.2f, 11.0f, 1.0f);
        this.LegL.addBox(-3.5f, 0.0f, -3.5f, 7, 10, 8, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -2.2f, 0.2f);
        this.Head.addBox(-4.5f, -7.2f, -4.0f, 9, 7, 8, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 73);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-7.0f, 18.0f, -3.2f, 14, 2, 9, 0.0f);
        this.tail4.addChild(this.tail5);
        this.ArmL.addChild(this.ArmL2);
        this.Body1.addChild(this.Body2);
        this.Head2.addChild(this.Head3);
        this.LegR.addChild(this.LegR2);
        this.tail1.addChild(this.tail2);
        this.LegL.addChild(this.LegL2);
        this.Body1.addChild(this.Chest);
        this.tail2.addChild(this.tail3);
        this.tail3.addChild(this.tail4);
        this.Head.addChild(this.Nose);
        this.Head.addChild(this.Head2);
        this.WingL.addChild(this.WingL_1);
        this.ArmR.addChild(this.ArmR2);
        this.WingR.addChild(this.WingR_1);
        this.Nose.addChild(this.NoseHorn);
        this.Body1.addChild(this.WingR);
        this.Body1.addChild(this.WingL);
        this.Body2.addChild(this.Body3);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float F = 1.5f;
        JGRenderHelper.modelScalePositionHelper((float)1.5f);
        this.Head.render(f5);
        this.Body1.render(f5);
        this.ArmR.render(f5);
        this.ArmL.render(f5);
        this.LegL.render(f5);
        this.LegR.render(f5);
        this.tail1.render(f5);
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
        this.tail1.rotateAngleX = 0.2f;
        this.tail1.rotateAngleX += r4 / 2.0f;
        this.tail2.rotateAngleX = 0.2f;
        this.tail2.rotateAngleX += r4 / 2.0f;
        this.tail3.rotateAngleX = 0.2f;
        this.tail3.rotateAngleX += r4 / 2.0f;
        this.tail4.rotateAngleX = 0.2f;
        this.tail4.rotateAngleX += r4 / 2.0f;
        this.tail5.rotateAngleY = 0.2f;
        this.tail5.rotateAngleY += r4;
        this.LegR.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
    }
}

