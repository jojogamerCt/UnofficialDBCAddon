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
package JinRyuu.DragonBC.common.Npcs.dbredribbon;

import JinRyuu.JRMCore.client.JGRenderHelper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelMajorMetallitron
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Hair;
    public ModelRenderer Body2;
    public ModelRenderer RoboticsNeck;
    public ModelRenderer Body3;
    public ModelRenderer Chest;
    public ModelRenderer Body4;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer RoboticsArmR;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;
    public ModelRenderer RoboticsArmL;
    public ModelRenderer LegR2;
    public ModelRenderer LegL2;

    public ModelMajorMetallitron() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 48);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-6.0f, 12.0f, -3.0f, 12, 5, 6, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 34);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-5.5f, 6.2f, -2.9f, 11, 6, 6, 0.0f);
        this.Body4 = new ModelRenderer((ModelBase)this, 72, 12);
        this.Body4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body4.addBox(-6.0f, 7.0f, -3.4f, 12, 5, 7, 0.0f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 92, 27);
        this.ArmL1.mirror = true;
        this.ArmL1.setRotationPoint(7.5f, -5.2f, 0.2f);
        this.ArmL1.addBox(-1.0f, -3.0f, -3.0f, 6, 6, 6, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 35, 33);
        this.Chest.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Chest.addBox(-6.0f, 2.0f, -3.4f, 12, 5, 1, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 66, 0);
        this.LegL2.setRotationPoint(3.1f, 2.1f, 0.0f);
        this.LegL2.addBox(-1.0f, -2.0f, -2.5f, 2, 5, 5, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 92, 40);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(1.7f, 2.0f, 0.0f);
        this.ArmL2.addBox(-2.3f, 0.4f, -2.5f, 5, 4, 5, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 66, 0);
        this.LegR2.setRotationPoint(-3.2f, 2.1f, 0.0f);
        this.LegR2.addBox(-1.0f, -2.0f, -2.5f, 2, 5, 5, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -7.8f, -0.5f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, -0.2f);
        this.LegR = new ModelRenderer((ModelBase)this, 41, 42);
        this.LegR.setRotationPoint(-3.0f, 9.0f, 0.0f);
        this.LegR.addBox(-3.0f, 0.0f, -3.0f, 6, 15, 6, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 41, 42);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(3.0f, 9.0f, 0.0f);
        this.LegL.addBox(-3.0f, 0.0f, -3.0f, 6, 15, 6, 0.0f);
        this.RoboticsArmR = new ModelRenderer((ModelBase)this, 81, 1);
        this.RoboticsArmR.setRotationPoint(-0.5f, 0.5f, 0.5f);
        this.RoboticsArmR.addBox(-2.0f, 0.2f, -2.0f, 4, 3, 4, 0.0f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 93, 50);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(0.0f, 4.2f, -0.5f);
        this.ArmL3.addBox(-2.1f, 0.0f, -1.8f, 5, 8, 5, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 67, 40);
        this.ArmR2.setRotationPoint(-1.7f, 2.0f, 0.0f);
        this.ArmR2.addBox(-2.7f, 0.4f, -2.5f, 5, 4, 5, 0.0f);
        this.Hair = new ModelRenderer((ModelBase)this, 32, 0);
        this.Hair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.RoboticsNeck = new ModelRenderer((ModelBase)this, 81, 1);
        this.RoboticsNeck.setRotationPoint(0.0f, 0.5f, 0.5f);
        this.RoboticsNeck.addBox(-2.0f, -1.1f, -2.0f, 4, 3, 4, 0.0f);
        this.ArmR3 = new ModelRenderer((ModelBase)this, 67, 50);
        this.ArmR3.setRotationPoint(0.0f, 4.2f, -0.5f);
        this.ArmR3.addBox(-2.9f, 0.0f, -1.9f, 5, 8, 5, 0.0f);
        this.RoboticsArmL = new ModelRenderer((ModelBase)this, 97, 1);
        this.RoboticsArmL.setRotationPoint(0.4f, 0.5f, 0.5f);
        this.RoboticsArmL.addBox(-2.0f, 0.2f, -2.0f, 4, 3, 4, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 17);
        this.Body1.setRotationPoint(0.0f, -8.0f, 0.0f);
        this.Body1.addBox(-6.5f, 0.0f, -2.5f, 13, 8, 6, 0.0f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 66, 27);
        this.ArmR1.setRotationPoint(-7.5f, -5.2f, 0.2f);
        this.ArmR1.addBox(-5.0f, -3.0f, -3.0f, 6, 6, 6, 0.0f);
        this.Body2.addChild(this.Body3);
        this.Body1.addChild(this.Body2);
        this.Body2.addChild(this.Body4);
        this.Body2.addChild(this.Chest);
        this.LegL.addChild(this.LegL2);
        this.ArmL1.addChild(this.ArmL2);
        this.LegR.addChild(this.LegR2);
        this.ArmR3.addChild(this.RoboticsArmR);
        this.ArmL2.addChild(this.ArmL3);
        this.ArmR1.addChild(this.ArmR2);
        this.Head.addChild(this.Hair);
        this.Body1.addChild(this.RoboticsNeck);
        this.ArmR2.addChild(this.ArmR3);
        this.ArmL3.addChild(this.RoboticsArmL);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float F = 2.0f;
        JGRenderHelper.modelScalePositionHelper((float)2.0f);
        this.Head.render(f5);
        this.Body1.render(f5);
        this.ArmR1.render(f5);
        this.ArmL1.render(f5);
        this.LegL.render(f5);
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
    }
}

