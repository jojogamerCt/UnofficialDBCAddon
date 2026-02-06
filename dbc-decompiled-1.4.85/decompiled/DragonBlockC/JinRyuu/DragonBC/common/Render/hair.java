/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package JinRyuu.DragonBC.common.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class hair
extends ModelBase {
    ModelRenderer Shape1;
    ModelRenderer Shape5;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;

    public hair() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Shape1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape1.addBox(0.0f, 0.0f, 0.0f, 16, 16, 16);
        this.Shape1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Shape1.setTextureSize(128, 128);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
        this.Shape5 = new ModelRenderer((ModelBase)this, 0, 32);
        this.Shape5.addBox(0.0f, 0.0f, 0.0f, 7, 7, 10);
        this.Shape5.setRotationPoint(6.0f, 0.0f, 9.0f);
        this.Shape5.setTextureSize(128, 128);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 1.27409f, 0.3141593f, 0.0f);
        this.Shape3 = new ModelRenderer((ModelBase)this, 64, 0);
        this.Shape3.addBox(0.0f, 0.0f, 0.0f, 5, 5, 10);
        this.Shape3.setRotationPoint(8.0f, 4.0f, -6.0f);
        this.Shape3.setTextureSize(128, 128);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, -0.2268928f, -0.2617994f, 0.0f);
        this.Shape3.mirror = false;
        this.Shape4 = new ModelRenderer((ModelBase)this, 64, 0);
        this.Shape4.addBox(0.0f, 0.0f, 0.0f, 5, 5, 10);
        this.Shape4.setRotationPoint(7.0f, 10.0f, -7.0f);
        this.Shape4.setTextureSize(128, 128);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, -0.1047198f, -0.1396263f, 0.0f);
        this.Shape6 = new ModelRenderer((ModelBase)this, 0, 32);
        this.Shape6.addBox(0.0f, 0.0f, 0.0f, 7, 7, 10);
        this.Shape6.setRotationPoint(6.0f, 2.0f, 12.0f);
        this.Shape6.setTextureSize(128, 128);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0.5410521f, 0.296706f, 0.0f);
        this.Shape7 = new ModelRenderer((ModelBase)this, 0, 49);
        this.Shape7.addBox(0.0f, 0.0f, 0.0f, 5, 5, 8);
        this.Shape7.setRotationPoint(6.0f, 8.0f, 15.0f);
        this.Shape7.setTextureSize(128, 128);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 0.0698132f, 0.296706f, 0.0f);
        this.Shape8 = new ModelRenderer((ModelBase)this, 0, 62);
        this.Shape8.addBox(0.0f, 0.0f, 0.0f, 4, 4, 8);
        this.Shape8.setRotationPoint(8.0f, -8.0f, 12.0f);
        this.Shape8.setTextureSize(128, 128);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 0.8028515f, 0.296706f, 0.0f);
        this.Shape9 = new ModelRenderer((ModelBase)this, 0, 62);
        this.Shape9.addBox(0.0f, 0.0f, 0.0f, 4, 4, 8);
        this.Shape9.setRotationPoint(10.0f, -2.0f, 19.0f);
        this.Shape9.setTextureSize(128, 128);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, 0.2094395f, 0.296706f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Shape1.render(f5);
        this.Shape5.render(f5);
        this.Shape3.render(f5);
        this.Shape4.render(f5);
        this.Shape6.render(f5);
        this.Shape7.render(f5);
        this.Shape8.render(f5);
        this.Shape9.render(f5);
    }

    public void renderModel(float f1) {
        this.Shape1.render(f1);
        this.Shape3.render(f1);
        this.Shape4.render(f1);
        this.Shape5.render(f1);
        this.Shape6.render(f1);
        this.Shape7.render(f1);
        this.Shape8.render(f1);
        this.Shape9.render(f1);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}

