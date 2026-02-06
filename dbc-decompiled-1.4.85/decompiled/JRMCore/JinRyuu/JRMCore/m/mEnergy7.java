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

public class mEnergy7
extends ModelBase {
    public ModelRenderer Base;
    public ModelRenderer BaseFront;
    public ModelRenderer BaseBack;
    public ModelRenderer BaseSide_Ball;
    public ModelRenderer BaseSide_Jobb;
    public ModelRenderer BaseTop;
    public ModelRenderer BaseBottom;
    public ModelRenderer Tail2;
    public ModelRenderer Tail1;

    public mEnergy7() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Tail1 = new ModelRenderer((ModelBase)this, 22, 0);
        this.Tail1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Tail1.addBox(3.1f, -1.0f, -1.0f, 2, 2, 2, 0.0f);
        this.BaseFront = new ModelRenderer((ModelBase)this, 0, 9);
        this.BaseFront.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BaseFront.addBox(-3.4f, -1.5f, -1.5f, 1, 3, 3, 0.0f);
        this.Base = new ModelRenderer((ModelBase)this, 0, 0);
        this.Base.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Base.addBox(-2.6f, -1.9f, -2.0f, 5, 4, 4, 0.0f);
        this.Tail2 = new ModelRenderer((ModelBase)this, 15, 0);
        this.Tail2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Tail2.addBox(4.6f, -0.7f, -0.5f, 2, 1, 1, 0.0f);
        this.BaseBottom = new ModelRenderer((ModelBase)this, 20, 15);
        this.BaseBottom.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BaseBottom.addBox(-2.0f, 1.4f, -1.5f, 3, 1, 3, 0.0f);
        this.BaseSide_Jobb = new ModelRenderer((ModelBase)this, 11, 15);
        this.BaseSide_Jobb.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BaseSide_Jobb.addBox(-2.0f, -1.5f, 1.4f, 3, 3, 1, 0.0f);
        this.BaseTop = new ModelRenderer((ModelBase)this, 20, 10);
        this.BaseTop.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BaseTop.addBox(-2.0f, -2.2f, -1.5f, 3, 1, 3, 0.0f);
        this.BaseBack = new ModelRenderer((ModelBase)this, 0, 16);
        this.BaseBack.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BaseBack.addBox(2.2f, -1.5f, -1.5f, 1, 3, 3, 0.0f);
        this.BaseSide_Ball = new ModelRenderer((ModelBase)this, 11, 10);
        this.BaseSide_Ball.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.BaseSide_Ball.addBox(-2.0f, -1.5f, -2.4f, 3, 3, 1, 0.0f);
        this.Tail2.addChild(this.Tail1);
        this.Base.addChild(this.BaseFront);
        this.BaseBack.addChild(this.Tail2);
        this.Base.addChild(this.BaseBottom);
        this.Base.addChild(this.BaseSide_Jobb);
        this.Base.addChild(this.BaseTop);
        this.Base.addChild(this.BaseBack);
        this.Base.addChild(this.BaseSide_Ball);
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

