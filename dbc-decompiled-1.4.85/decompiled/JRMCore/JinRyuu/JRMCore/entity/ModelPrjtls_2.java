/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package JinRyuu.JRMCore.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPrjtls_2
extends ModelBase {
    public ModelRenderer Base;
    public ModelRenderer Front;
    public ModelRenderer Back;
    public ModelRenderer Front_1;
    public ModelRenderer Front_2;
    public ModelRenderer Back_1;
    public ModelRenderer Back_2;
    public ModelRenderer Back_3;
    public ModelRenderer Back_4;
    public ModelRenderer Back_5;
    public ModelRenderer Back_6;
    public ModelRenderer Back_7;
    public ModelRenderer Back_8;
    public ModelRenderer Back_9;

    public ModelPrjtls_2() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Front_2 = new ModelRenderer((ModelBase)this, 56, 13);
        this.Front_2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Front_2.addBox(-1.5f, -1.7f, -9.7f, 3, 3, 1, 0.0f);
        this.Back_2 = new ModelRenderer((ModelBase)this, 31, 0);
        this.Back_2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back_2.addBox(-0.5f, -4.15f, 4.2f, 1, 2, 9, 0.0f);
        this.Back_7 = new ModelRenderer((ModelBase)this, 29, 0);
        this.Back_7.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back_7.addBox(-0.5f, 1.35f, 13.2f, 1, 4, 3, 0.0f);
        this.Back_5 = new ModelRenderer((ModelBase)this, 40, 13);
        this.Back_5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back_5.addBox(-3.7f, -0.7f, 4.2f, 2, 1, 9, 0.0f);
        this.Back = new ModelRenderer((ModelBase)this, 0, 19);
        this.Back.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back.addBox(-2.5f, -2.7f, 4.1f, 5, 5, 7, 0.0f);
        this.Back_4 = new ModelRenderer((ModelBase)this, 40, 13);
        this.Back_4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back_4.addBox(1.8f, -0.7f, 4.2f, 2, 1, 9, 0.0f);
        this.Base = new ModelRenderer((ModelBase)this, 0, 0);
        this.Base.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base.addBox(-3.0f, -3.1f, -7.2f, 6, 6, 12, 0.0f);
        this.Back_3 = new ModelRenderer((ModelBase)this, 31, 0);
        this.Back_3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back_3.addBox(-0.5f, 1.55f, 4.2f, 1, 2, 9, 0.0f);
        this.Front = new ModelRenderer((ModelBase)this, 52, 0);
        this.Front.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Front.addBox(-2.5f, -2.7f, -8.1f, 5, 5, 1, 0.0f);
        this.Back_1 = new ModelRenderer((ModelBase)this, 25, 22);
        this.Back_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back_1.addBox(-2.0f, -2.25f, 10.6f, 4, 4, 5, 0.0f);
        this.Back_8 = new ModelRenderer((ModelBase)this, 47, 25);
        this.Back_8.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back_8.addBox(1.8f, -0.7f, 13.2f, 4, 1, 3, 0.0f);
        this.Front_1 = new ModelRenderer((ModelBase)this, 54, 7);
        this.Front_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Front_1.addBox(-2.0f, -2.25f, -9.0f, 4, 4, 1, 0.0f);
        this.Back_6 = new ModelRenderer((ModelBase)this, 29, 0);
        this.Back_6.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back_6.addBox(-0.5f, -5.85f, 13.2f, 1, 4, 3, 0.0f);
        this.Back_9 = new ModelRenderer((ModelBase)this, 47, 25);
        this.Back_9.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Back_9.addBox(-5.6f, -0.7f, 13.2f, 4, 1, 3, 0.0f);
        this.Front_1.addChild(this.Front_2);
        this.Back_1.addChild(this.Back_2);
        this.Back_3.addChild(this.Back_7);
        this.Back_1.addChild(this.Back_5);
        this.Base.addChild(this.Back);
        this.Back_1.addChild(this.Back_4);
        this.Back_1.addChild(this.Back_3);
        this.Base.addChild(this.Front);
        this.Back.addChild(this.Back_1);
        this.Back_4.addChild(this.Back_8);
        this.Front.addChild(this.Front_1);
        this.Back_2.addChild(this.Back_6);
        this.Back_5.addChild(this.Back_9);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Base.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

