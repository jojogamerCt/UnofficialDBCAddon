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

public class mEnergy6
extends ModelBase {
    public ModelRenderer Spine1;
    public ModelRenderer Spine2;
    public ModelRenderer Spine3;
    public ModelRenderer FootRubble2;
    public ModelRenderer FootRubble1;
    public ModelRenderer FootRubble2_1;
    public ModelRenderer FootRubble3;
    public ModelRenderer FootRubble2_2;
    public ModelRenderer FootRubble3_1;

    public mEnergy6() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.FootRubble2 = new ModelRenderer((ModelBase)this, 0, 55);
        this.FootRubble2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootRubble2.addBox(-2.1f, 4.5f, -2.9f, 7, 13, 4, 0.0f);
        this.setRotateAngle(this.FootRubble2, 0.13665928f, -0.091106184f, -0.045553092f);
        this.Spine2 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Spine2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Spine2.addBox(5.3f, -14.2f, 0.0f, 14, 40, 6, 0.0f);
        this.setRotateAngle(this.Spine2, 0.0f, -0.11920599f, 0.0f);
        this.FootRubble1 = new ModelRenderer((ModelBase)this, 0, 10);
        this.FootRubble1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootRubble1.addBox(-9.6f, 8.5f, -3.2f, 7, 17, 4, 0.0f);
        this.setRotateAngle(this.FootRubble1, 0.019198623f, 0.17104226f, 0.06632251f);
        this.Spine1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Spine1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Spine1.addBox(-7.4f, -18.8f, 0.0f, 14, 45, 7, 0.0f);
        this.FootRubble2_2 = new ModelRenderer((ModelBase)this, 0, 10);
        this.FootRubble2_2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootRubble2_2.addBox(10.4f, 14.0f, 1.0f, 7, 13, 4, 0.0f);
        this.setRotateAngle(this.FootRubble2_2, -0.18203785f, -0.091106184f, -0.045553092f);
        this.FootRubble3_1 = new ModelRenderer((ModelBase)this, 0, 16);
        this.FootRubble3_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootRubble3_1.addBox(-22.6f, 20.0f, -0.5f, 12, 5, 6, 0.0f);
        this.setRotateAngle(this.FootRubble3_1, -0.091106184f, 0.045553092f, -0.091106184f);
        this.FootRubble3 = new ModelRenderer((ModelBase)this, 0, 16);
        this.FootRubble3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootRubble3.addBox(-3.5f, 19.3f, -4.3f, 12, 5, 6, 0.0f);
        this.setRotateAngle(this.FootRubble3, 0.08552113f, -0.17296213f, 0.0f);
        this.Spine3 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Spine3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Spine3.addBox(-19.9f, -14.2f, 0.0f, 14, 40, 6, 0.0f);
        this.setRotateAngle(this.Spine3, 0.0f, 0.091106184f, 0.0f);
        this.FootRubble2_1 = new ModelRenderer((ModelBase)this, 0, 10);
        this.FootRubble2_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FootRubble2_1.addBox(-2.1f, 4.5f, -2.9f, 7, 13, 4, 0.0f);
        this.setRotateAngle(this.FootRubble2_1, 0.13665928f, -0.091106184f, -0.045553092f);
        this.Spine1.addChild(this.FootRubble1);
        this.Spine2.addChild(this.FootRubble2_2);
        this.Spine3.addChild(this.FootRubble3_1);
        this.Spine1.addChild(this.FootRubble3);
        this.Spine1.addChild(this.FootRubble2_1);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.FootRubble2.render(f5);
        this.Spine2.render(f5);
        this.Spine1.render(f5);
        this.Spine3.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

