/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelFrog
extends ModelBase {
    public ModelRenderer Body1;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL1;
    public ModelRenderer LegR1;
    public ModelRenderer Body2;
    public ModelRenderer Head1;
    public ModelRenderer Body3;
    public ModelRenderer Tail1;
    public ModelRenderer Tail2;
    public ModelRenderer Head2;
    public ModelRenderer AntennaR;
    public ModelRenderer AntennaL;
    public ModelRenderer Head3;
    public ModelRenderer AntennaR_1;
    public ModelRenderer AntennaR_2;
    public ModelRenderer AntennaL_1;
    public ModelRenderer AntennaR_3;
    public ModelRenderer LegL2;
    public ModelRenderer LegR2;

    public ModelFrog() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ArmR = new ModelRenderer((ModelBase)this, 30, 8);
        this.ArmR.mirror = true;
        this.ArmR.setRotationPoint(-3.1f, 17.8f, -3.4f);
        this.ArmR.addBox(-2.3f, -1.0f, -0.9f, 2, 8, 3, 0.0f);
        this.setRotateAngle(this.ArmR, -0.3630285f, 0.0f, 0.23387411f);
        this.Tail1 = new ModelRenderer((ModelBase)this, 0, 37);
        this.Tail1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Tail1.addBox(-2.5f, 2.2f, 11.4f, 5, 3, 2, 0.0f);
        this.setRotateAngle(this.Tail1, 0.071733035f, 0.0f, 0.0f);
        this.Head1 = new ModelRenderer((ModelBase)this, 42, 2);
        this.Head1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head1.addBox(-3.0f, 0.2f, -10.0f, 6, 5, 4, 0.0f);
        this.setRotateAngle(this.Head1, 0.13665928f, 0.0f, 0.0f);
        this.Tail2 = new ModelRenderer((ModelBase)this, 0, 43);
        this.Tail2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Tail2.addBox(-1.5f, 3.4f, 13.2f, 3, 2, 4, 0.0f);
        this.setRotateAngle(this.Tail2, 0.045553092f, 0.0f, 0.0f);
        this.AntennaR = new ModelRenderer((ModelBase)this, 31, 0);
        this.AntennaR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.AntennaR.addBox(-3.1f, -5.4f, -5.0f, 1, 1, 4, 0.0f);
        this.setRotateAngle(this.AntennaR, 0.8552113f, -0.090757124f, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.5f, -0.3f, -6.2f, 7, 6, 6, 0.0f);
        this.setRotateAngle(this.Body2, 0.13665928f, 0.0f, 0.0f);
        this.AntennaL = new ModelRenderer((ModelBase)this, 31, 0);
        this.AntennaL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.AntennaL.addBox(2.2f, -5.4f, -5.0f, 1, 1, 4, 0.0f);
        this.setRotateAngle(this.AntennaL, 0.8552113f, 0.090757124f, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 13);
        this.Body1.setRotationPoint(0.0f, 14.7f, 0.0f);
        this.Body1.addBox(-4.5f, -0.4f, -0.2f, 9, 6, 9, 0.0f);
        this.setRotateAngle(this.Body1, -0.091106184f, 0.0f, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 29);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-3.0f, 0.8f, 8.7f, 6, 4, 3, 0.0f);
        this.setRotateAngle(this.Body3, -0.15009831f, 0.0f, 0.0f);
        this.AntennaR_2 = new ModelRenderer((ModelBase)this, 31, 0);
        this.AntennaR_2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.AntennaR_2.addBox(-3.1f, -4.7f, -0.2f, 1, 1, 4, 0.0f);
        this.setRotateAngle(this.AntennaR_2, -0.22759093f, 0.0f, 0.0f);
        this.AntennaL_1 = new ModelRenderer((ModelBase)this, 31, 0);
        this.AntennaL_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.AntennaL_1.addBox(2.2f, -4.6f, -3.1f, 1, 1, 4, 0.0f);
        this.setRotateAngle(this.AntennaL_1, -0.4098033f, 0.0f, 0.0f);
        this.LegR1 = new ModelRenderer((ModelBase)this, 20, 31);
        this.LegR1.mirror = true;
        this.LegR1.setRotationPoint(-3.9f, 18.6f, 7.4f);
        this.LegR1.addBox(-3.8f, -2.3f, -7.2f, 3, 4, 8, 0.0f);
        this.setRotateAngle(this.LegR1, -0.13665928f, 0.18203785f, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 22, 47);
        this.LegL2.setRotationPoint(1.4f, 1.3f, -6.0f);
        this.LegL2.addBox(-0.9f, -0.8f, -0.3f, 2, 2, 7, 0.0f);
        this.setRotateAngle(this.LegL2, -0.59166664f, 0.0f, 0.0f);
        this.Head2 = new ModelRenderer((ModelBase)this, 43, 12);
        this.Head2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head2.addBox(-2.5f, 2.1f, -12.7f, 5, 3, 4, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 30, 8);
        this.ArmL.setRotationPoint(3.6f, 17.8f, -3.4f);
        this.ArmL.addBox(-0.3f, -1.0f, -0.9f, 2, 8, 3, 0.0f);
        this.setRotateAngle(this.ArmL, -0.3642502f, 0.0f, -0.22759093f);
        this.AntennaR_1 = new ModelRenderer((ModelBase)this, 31, 0);
        this.AntennaR_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.AntennaR_1.addBox(-3.1f, -4.6f, -3.1f, 1, 1, 4, 0.0f);
        this.setRotateAngle(this.AntennaR_1, -0.4098033f, 0.0f, 0.0f);
        this.Head3 = new ModelRenderer((ModelBase)this, 45, 20);
        this.Head3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head3.addBox(-2.0f, -5.4f, -12.4f, 4, 2, 4, 0.0f);
        this.setRotateAngle(this.Head3, 0.59184116f, 0.0f, 0.0f);
        this.AntennaR_3 = new ModelRenderer((ModelBase)this, 31, 0);
        this.AntennaR_3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.AntennaR_3.addBox(2.2f, -4.7f, -0.2f, 1, 1, 4, 0.0f);
        this.setRotateAngle(this.AntennaR_3, -0.22759093f, 0.0f, 0.0f);
        this.LegL1 = new ModelRenderer((ModelBase)this, 20, 31);
        this.LegL1.setRotationPoint(4.7f, 18.6f, 7.4f);
        this.LegL1.addBox(0.0f, -2.3f, -7.2f, 3, 4, 8, 0.0f);
        this.setRotateAngle(this.LegL1, -0.13665928f, -0.18203785f, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 22, 47);
        this.LegR2.mirror = true;
        this.LegR2.setRotationPoint(-2.3f, 1.3f, -6.0f);
        this.LegR2.addBox(-1.0f, -0.8f, -0.3f, 2, 2, 7, 0.0f);
        this.setRotateAngle(this.LegR2, -0.59166664f, 0.0f, 0.0f);
        this.Body3.addChild(this.Tail1);
        this.Body1.addChild(this.Head1);
        this.Tail1.addChild(this.Tail2);
        this.Head1.addChild(this.AntennaR);
        this.Body1.addChild(this.Body2);
        this.Head1.addChild(this.AntennaL);
        this.Body2.addChild(this.Body3);
        this.AntennaR_1.addChild(this.AntennaR_2);
        this.AntennaL.addChild(this.AntennaL_1);
        this.LegL1.addChild(this.LegL2);
        this.Head1.addChild(this.Head2);
        this.AntennaR.addChild(this.AntennaR_1);
        this.Head2.addChild(this.Head3);
        this.AntennaL_1.addChild(this.AntennaR_3);
        this.LegR1.addChild(this.LegR2);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        if (entity.onGround && entity.motionY < 0.2) {
            this.LegL1.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.2f * f1;
            this.LegR1.rotateAngleX = MathHelper.cos((float)(f * 0.6662f)) * 1.2f * f1;
            this.setRotateAngle(this.LegL2, -0.59166664f, 0.0f, 0.0f);
            this.setRotateAngle(this.LegR2, -0.59166664f, 0.0f, 0.0f);
        } else {
            this.LegL1.rotateAngleX = 2.3f;
            this.LegR1.rotateAngleX = 2.3f;
            this.LegL2.rotateAngleX = -3.0f;
            this.LegR2.rotateAngleX = -3.0f;
        }
        GL11.glPushMatrix();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        GL11.glTranslatef((float)0.0f, (float)1.4f, (float)0.0f);
        this.ArmR.render(f5);
        this.Body1.render(f5);
        this.LegR1.render(f5);
        this.ArmL.render(f5);
        this.LegL1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

