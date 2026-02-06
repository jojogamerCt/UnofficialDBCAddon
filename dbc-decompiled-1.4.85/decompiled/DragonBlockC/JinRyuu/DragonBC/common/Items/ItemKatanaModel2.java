/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package JinRyuu.DragonBC.common.Items;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ItemKatanaModel2
extends ModelBase {
    public ModelRenderer Hilt;
    public ModelRenderer PommelDeco1;
    public ModelRenderer Guard1;
    public ModelRenderer Edge1;
    public ModelRenderer PommelDeco2;
    public ModelRenderer GuardSide1;
    public ModelRenderer GuardSide2;
    public ModelRenderer Edge2;
    public ModelRenderer Edge3;
    public ModelRenderer Edge4;
    public ModelRenderer Edge5;

    public ItemKatanaModel2() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.PommelDeco1 = new ModelRenderer((ModelBase)this, 0, 15);
        this.PommelDeco1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.PommelDeco1.addBox(-1.5f, 4.9f, -1.5f, 3, 1, 3, 0.0f);
        this.GuardSide2 = new ModelRenderer((ModelBase)this, 37, 3);
        this.GuardSide2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.GuardSide2.addBox(4.6f, -3.8f, -1.0f, 3, 1, 2, 0.0f);
        this.setRotateAngle(this.GuardSide2, 0.0f, 0.0f, -0.31869712f);
        this.PommelDeco2 = new ModelRenderer((ModelBase)this, 0, 20);
        this.PommelDeco2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.PommelDeco2.addBox(-0.5f, 5.8f, -0.5f, 1, 1, 1, 0.0f);
        this.Edge4 = new ModelRenderer((ModelBase)this, 36, 19);
        this.Edge4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Edge4.addBox(-1.5f, -27.7f, -0.5f, 3, 8, 1, 0.0f);
        this.Guard1 = new ModelRenderer((ModelBase)this, 18, 0);
        this.Guard1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Guard1.addBox(-3.5f, -5.1f, -1.5f, 7, 1, 3, 0.0f);
        this.Edge3 = new ModelRenderer((ModelBase)this, 25, 17);
        this.Edge3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Edge3.addBox(-2.0f, -19.7f, -0.5f, 4, 11, 1, 0.0f);
        this.Hilt = new ModelRenderer((ModelBase)this, 0, 0);
        this.Hilt.setRotationPoint(0.0f, 13.0f, 0.0f);
        this.Hilt.addBox(-1.0f, -5.7f, -1.0f, 2, 12, 2, 0.0f);
        this.Edge5 = new ModelRenderer((ModelBase)this, 45, 18);
        this.Edge5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Edge5.addBox(-1.0f, -37.7f, -0.5f, 2, 10, 1, 0.0f);
        this.Edge1 = new ModelRenderer((ModelBase)this, 8, 24);
        this.Edge1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Edge1.addBox(-1.0f, -7.7f, -0.5f, 2, 2, 1, 0.0f);
        this.Edge2 = new ModelRenderer((ModelBase)this, 16, 25);
        this.Edge2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Edge2.addBox(-1.5f, -8.7f, -0.5f, 3, 1, 1, 0.0f);
        this.GuardSide1 = new ModelRenderer((ModelBase)this, 9, 3);
        this.GuardSide1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.GuardSide1.addBox(-7.6f, -3.8f, -1.0f, 3, 1, 2, 0.0f);
        this.setRotateAngle(this.GuardSide1, 0.0f, 0.0f, 0.31869712f);
        this.Hilt.addChild(this.PommelDeco1);
        this.Guard1.addChild(this.GuardSide2);
        this.PommelDeco1.addChild(this.PommelDeco2);
        this.Edge3.addChild(this.Edge4);
        this.Hilt.addChild(this.Guard1);
        this.Edge2.addChild(this.Edge3);
        this.Edge4.addChild(this.Edge5);
        this.Hilt.addChild(this.Edge1);
        this.Edge1.addChild(this.Edge2);
        this.Guard1.addChild(this.GuardSide1);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Hilt.render(f5);
    }

    public void render() {
        float par1 = 0.0625f;
        this.Hilt.render(par1);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

