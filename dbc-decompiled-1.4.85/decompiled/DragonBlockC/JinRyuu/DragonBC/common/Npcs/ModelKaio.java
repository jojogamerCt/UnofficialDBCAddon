/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.client.JGRenderHelper
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.JRMCore.client.JGRenderHelper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelKaio
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ShoulderR;
    public ModelRenderer ShoulderL;
    public ModelRenderer AntennaR;
    public ModelRenderer AntennaL;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer WhiskerR;
    public ModelRenderer WhiskerL;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer Body4;
    public ModelRenderer FeetR;
    public ModelRenderer FeetL;
    public ModelRenderer ArmR;
    public ModelRenderer HandR;
    public ModelRenderer ArmL;
    public ModelRenderer HandL;

    public ModelKaio() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.HandR = new ModelRenderer((ModelBase)this, 72, 66);
        this.HandR.setRotationPoint(0.1f, 8.8f, 0.0f);
        this.HandR.addBox(-1.5f, -0.5f, -2.5f, 3, 2, 5, 0.0f);
        this.FeetL = new ModelRenderer((ModelBase)this, 16, 106);
        this.FeetL.mirror = true;
        this.FeetL.setRotationPoint(5.0f, 5.0f, 0.0f);
        this.FeetL.addBox(-2.0f, 0.0f, -4.4f, 4, 3, 6, 0.0f);
        this.setRotateAngle(this.FeetL, 0.0f, -0.090757124f, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 1, 66);
        this.Body3.setRotationPoint(0.0f, 5.0f, 0.0f);
        this.Body3.addBox(-9.5f, 0.0f, -6.0f, 19, 5, 12, 0.0f);
        this.FeetR = new ModelRenderer((ModelBase)this, 16, 106);
        this.FeetR.setRotationPoint(-5.0f, 5.0f, 0.0f);
        this.FeetR.addBox(-2.0f, 0.0f, -4.4f, 4, 3, 6, 0.0f);
        this.setRotateAngle(this.FeetR, 0.0f, 0.090757124f, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 1, 34);
        this.Body1.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.Body1.addBox(-7.0f, 0.0f, -4.0f, 14, 5, 8, 0.0f);
        this.AntennaR = new ModelRenderer((ModelBase)this, 53, 1);
        this.AntennaR.setRotationPoint(-1.9f, -6.5f, -5.2f);
        this.AntennaR.addBox(0.0f, -3.9f, -12.9f, 0, 5, 13, 0.0f);
        this.setRotateAngle(this.AntennaR, 0.0f, 0.35604715f, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 38, 14);
        this.EarR.setRotationPoint(-4.9f, -2.0f, -1.3f);
        this.EarR.addBox(-3.1f, -4.2f, 0.0f, 3, 5, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.9546951f, 0.0f);
        this.ShoulderL = new ModelRenderer((ModelBase)this, 69, 31);
        this.ShoulderL.mirror = true;
        this.ShoulderL.setRotationPoint(7.0f, 3.1f, 0.0f);
        this.ShoulderL.addBox(0.0f, -2.5f, -4.0f, 8, 6, 7, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 8, 12);
        this.Head.setRotationPoint(0.0f, 1.3f, 0.0f);
        this.Head.addBox(-5.0f, -7.4f, -5.3f, 10, 8, 8, 0.0f);
        this.Body4 = new ModelRenderer((ModelBase)this, 1, 85);
        this.Body4.setRotationPoint(0.0f, 5.0f, 0.0f);
        this.Body4.addBox(-10.0f, 0.0f, -6.5f, 20, 5, 13, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 72, 46);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(4.5f, 0.6f, -0.5f);
        this.ArmL.addBox(-2.5f, -2.6f, -3.0f, 5, 11, 6, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 38, 14);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(5.0f, -2.0f, -1.3f);
        this.EarL.addBox(0.0f, -4.2f, 0.0f, 3, 5, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.9546951f, 0.0f);
        this.WhiskerL = new ModelRenderer((ModelBase)this, 46, 23);
        this.WhiskerL.mirror = true;
        this.WhiskerL.setRotationPoint(4.0f, -1.7f, -5.2f);
        this.WhiskerL.addBox(0.0f, -0.5f, -0.6f, 4, 1, 0, 0.0f);
        this.setRotateAngle(this.WhiskerL, 0.0f, 0.19547687f, 0.2268928f);
        this.AntennaL = new ModelRenderer((ModelBase)this, 53, 1);
        this.AntennaL.mirror = true;
        this.AntennaL.setRotationPoint(1.3f, -6.5f, -4.0f);
        this.AntennaL.addBox(0.0f, -3.9f, -14.8f, 0, 5, 13, 0.0f);
        this.setRotateAngle(this.AntennaL, 0.0f, -0.35604715f, 0.0f);
        this.WhiskerR = new ModelRenderer((ModelBase)this, 46, 23);
        this.WhiskerR.setRotationPoint(-4.0f, -1.7f, -5.2f);
        this.WhiskerR.addBox(-4.0f, -0.5f, -0.1f, 4, 1, 0, 0.0f);
        this.setRotateAngle(this.WhiskerR, 0.0f, -0.19547687f, -0.2268928f);
        this.ArmR = new ModelRenderer((ModelBase)this, 72, 46);
        this.ArmR.setRotationPoint(-4.5f, 0.6f, -0.5f);
        this.ArmR.addBox(-2.5f, -2.6f, -3.0f, 5, 11, 6, 0.0f);
        this.HandL = new ModelRenderer((ModelBase)this, 72, 66);
        this.HandL.mirror = true;
        this.HandL.setRotationPoint(0.0f, 8.8f, 0.0f);
        this.HandL.addBox(-1.5f, -0.5f, -2.5f, 3, 2, 5, 0.0f);
        this.ShoulderR = new ModelRenderer((ModelBase)this, 69, 31);
        this.ShoulderR.setRotationPoint(-7.0f, 3.1f, 0.0f);
        this.ShoulderR.addBox(-8.0f, -2.5f, -4.0f, 8, 6, 7, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 49);
        this.Body2.setRotationPoint(0.0f, 5.0f, 0.0f);
        this.Body2.addBox(-9.0f, 0.0f, -5.0f, 18, 5, 10, 0.0f);
        this.ArmR.addChild(this.HandR);
        this.Body4.addChild(this.FeetL);
        this.Body2.addChild(this.Body3);
        this.Body4.addChild(this.FeetR);
        this.Head.addChild(this.AntennaR);
        this.Head.addChild(this.EarR);
        this.Body3.addChild(this.Body4);
        this.ShoulderL.addChild(this.ArmL);
        this.Head.addChild(this.EarL);
        this.Head.addChild(this.WhiskerL);
        this.Head.addChild(this.AntennaL);
        this.Head.addChild(this.WhiskerR);
        this.ShoulderR.addChild(this.ArmR);
        this.ArmL.addChild(this.HandL);
        this.Body1.addChild(this.Body2);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        float F = 0.6f;
        JGRenderHelper.modelScalePositionHelper((float)0.6f);
        float n4 = f3;
        float n5 = f4;
        float r2 = 180.0f;
        this.Head.rotateAngleY = n4 / (r2 / (float)Math.PI);
        this.Head.rotateAngleX = n5 / (r2 / (float)Math.PI) - 0.2f;
        this.Body1.render(f5);
        this.ShoulderL.render(f5);
        this.Head.render(f5);
        this.ShoulderR.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

