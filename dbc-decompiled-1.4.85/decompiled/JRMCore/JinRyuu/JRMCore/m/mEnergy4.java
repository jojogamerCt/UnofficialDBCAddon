/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package JinRyuu.JRMCore.m;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class mEnergy4
extends ModelBase {
    public ModelRenderer Spine1;
    public ModelRenderer Spine2;
    public ModelRenderer Spine3;
    public ModelRenderer Spine4;
    public ModelRenderer Spine5;
    public ModelRenderer FootRubble1;
    public ModelRenderer FootRubble2;
    public ModelRenderer FootRubble3;
    public ModelRenderer HeadRubble1;
    public ModelRenderer HeadRubble2;
    public ModelRenderer FootRubble4;
    public ModelRenderer FootRubble5;
    public ModelRenderer HeadRubble3;

    public mEnergy4() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.FootRubble3 = new ModelRenderer((ModelBase)this, 0, 72);
        this.FootRubble3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootRubble3.addBox(-3.4f, 19.3f, -9.6f, 12, 5, 15, 0.0f);
        this.setRotateAngle(this.FootRubble3, 0.08552113f, -0.17296213f, 0.0f);
        this.FootRubble2 = new ModelRenderer((ModelBase)this, 0, 55);
        this.FootRubble2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootRubble2.addBox(-2.1f, 14.8f, -7.5f, 7, 8, 8, 0.0f);
        this.setRotateAngle(this.FootRubble2, 0.091106184f, -0.18203785f, -0.13665928f);
        this.Spine3 = new ModelRenderer((ModelBase)this, 70, 57);
        this.Spine3.setRotationPoint(0.0f, 0.0f, -0.1f);
        this.Spine3.addBox(-6.7f, -2.7f, 1.6f, 13, 7, 3, 0.0f);
        this.setRotateAngle(this.Spine3, 0.1605703f, 0.0f, 0.0f);
        this.FootRubble4 = new ModelRenderer((ModelBase)this, 0, 36);
        this.FootRubble4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootRubble4.addBox(8.3f, 18.4f, -8.5f, 7, 9, 9, 0.0f);
        this.setRotateAngle(this.FootRubble4, 0.0f, -0.18203785f, 0.091106184f);
        this.Spine1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Spine1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Spine1.addBox(-6.1f, -7.9f, -3.6f, 12, 28, 7, 0.0f);
        this.setRotateAngle(this.Spine1, -0.13788101f, 0.0f, 0.0f);
        this.Spine4 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Spine4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Spine4.addBox(0.7f, 0.0f, -4.0f, 12, 28, 7, 0.0f);
        this.setRotateAngle(this.Spine4, 0.0017453292f, -0.2443461f, -0.108210415f);
        this.FootRubble5 = new ModelRenderer((ModelBase)this, 0, 55);
        this.FootRubble5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootRubble5.addBox(-13.6f, 19.0f, -6.1f, 7, 8, 8, 0.0f);
        this.setRotateAngle(this.FootRubble5, 0.0f, 0.0f, -0.13665928f);
        this.HeadRubble2 = new ModelRenderer((ModelBase)this, 84, 43);
        this.HeadRubble2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadRubble2.addBox(0.5f, -13.6f, 0.6f, 5, 9, 3, 0.0f);
        this.setRotateAngle(this.HeadRubble2, -0.06283186f, 0.0f, -0.091106184f);
        this.HeadRubble1 = new ModelRenderer((ModelBase)this, 80, 30);
        this.HeadRubble1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadRubble1.addBox(-6.5f, -12.7f, -0.1f, 8, 7, 4, 0.0f);
        this.setRotateAngle(this.HeadRubble1, -0.06283186f, 0.0f, 0.108210415f);
        this.Spine5 = new ModelRenderer((ModelBase)this, 70, 0);
        this.Spine5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Spine5.addBox(-16.0f, 4.7f, -2.5f, 14, 22, 7, 0.0f);
        this.setRotateAngle(this.Spine5, -0.03141593f, 0.18849556f, 0.11868239f);
        this.HeadRubble3 = new ModelRenderer((ModelBase)this, 80, 30);
        this.HeadRubble3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HeadRubble3.addBox(-13.3f, -3.8f, -1.8f, 8, 7, 4, 0.0f);
        this.setRotateAngle(this.HeadRubble3, -0.045553092f, 0.091106184f, -0.22759093f);
        this.Spine2 = new ModelRenderer((ModelBase)this, 70, 0);
        this.Spine2.setRotationPoint(0.0f, 0.0f, -0.1f);
        this.Spine2.addBox(-7.1f, 3.2f, -1.7f, 14, 22, 7, 0.0f);
        this.setRotateAngle(this.Spine2, 0.08726646f, 0.0f, 0.0f);
        this.FootRubble1 = new ModelRenderer((ModelBase)this, 0, 36);
        this.FootRubble1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootRubble1.addBox(-6.2f, 16.7f, -5.8f, 7, 9, 9, 0.0f);
        this.setRotateAngle(this.FootRubble1, 0.019198623f, 0.17104226f, 0.06632251f);
        this.Spine1.addChild(this.FootRubble3);
        this.Spine1.addChild(this.FootRubble2);
        this.Spine4.addChild(this.FootRubble4);
        this.Spine5.addChild(this.FootRubble5);
        this.Spine2.addChild(this.HeadRubble2);
        this.Spine2.addChild(this.HeadRubble1);
        this.FootRubble5.addChild(this.HeadRubble3);
        this.Spine1.addChild(this.FootRubble1);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Spine3.render(f5);
        this.Spine1.render(f5);
        this.Spine4.render(f5);
        this.Spine5.render(f5);
        this.Spine2.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

