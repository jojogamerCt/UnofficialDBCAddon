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

public class SaibaiHatchedModel
extends ModelBase {
    ModelRenderer bottom;
    ModelRenderer side1;
    ModelRenderer side2;
    ModelRenderer side3;
    ModelRenderer side4;
    ModelRenderer a1;
    ModelRenderer a2;
    ModelRenderer a3;
    ModelRenderer a4;

    public SaibaiHatchedModel() {
        this.textureWidth = 128;
        this.textureHeight = 32;
        this.bottom = new ModelRenderer((ModelBase)this, 0, 0);
        this.bottom.addBox(-8.0f, -8.0f, -8.0f, 16, 8, 16);
        this.bottom.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.bottom.setTextureSize(64, 32);
        this.bottom.mirror = true;
        this.setRotation(this.bottom, 0.0f, 0.0f, 0.0f);
        this.side1 = new ModelRenderer((ModelBase)this, 64, 0);
        this.side1.addBox(-8.0f, -7.0f, -8.0f, 16, 8, 1);
        this.side1.setRotationPoint(0.0f, 15.0f, 0.0f);
        this.side1.setTextureSize(64, 32);
        this.side1.mirror = true;
        this.setRotation(this.side1, 0.0f, 0.0f, 0.0f);
        this.side2 = new ModelRenderer((ModelBase)this, 64, 0);
        this.side2.addBox(-8.0f, -7.0f, -8.0f, 16, 8, 1);
        this.side2.setRotationPoint(0.0f, 15.0f, 15.0f);
        this.side2.setTextureSize(64, 32);
        this.side2.mirror = true;
        this.setRotation(this.side2, 0.0f, 0.0f, 0.0f);
        this.side3 = new ModelRenderer((ModelBase)this, 98, 0);
        this.side3.addBox(-8.0f, -7.0f, -8.0f, 1, 8, 14);
        this.side3.setRotationPoint(15.0f, 15.0f, 1.0f);
        this.side3.setTextureSize(64, 32);
        this.side3.mirror = true;
        this.setRotation(this.side3, 0.0f, 0.0f, 0.0f);
        this.side4 = new ModelRenderer((ModelBase)this, 98, 0);
        this.side4.addBox(-8.0f, -7.0f, -8.0f, 1, 8, 14);
        this.side4.setRotationPoint(0.0f, 15.0f, 1.0f);
        this.side4.setTextureSize(64, 32);
        this.side4.mirror = true;
        this.setRotation(this.side4, 0.0f, 0.0f, 0.0f);
        this.a1 = new ModelRenderer((ModelBase)this, 50, 10);
        this.a1.addBox(0.0f, 0.0f, 0.0f, 14, 0, 14);
        this.a1.setRotationPoint(-7.0f, 8.0f, -7.0f);
        this.a1.setTextureSize(64, 32);
        this.a1.mirror = true;
        this.setRotation(this.a1, -0.7853982f, 0.0f, 0.0f);
        this.a2 = new ModelRenderer((ModelBase)this, 50, 10);
        this.a2.addBox(-14.0f, 0.0f, 0.0f, 14, 0, 14);
        this.a2.setRotationPoint(7.0f, 8.0f, -7.0f);
        this.a2.setTextureSize(64, 32);
        this.a2.mirror = true;
        this.setRotation(this.a2, 0.0f, 0.0f, -0.7853982f);
        this.a3 = new ModelRenderer((ModelBase)this, 50, 10);
        this.a3.addBox(-14.0f, 0.0f, -14.0f, 14, 0, 14);
        this.a3.setRotationPoint(7.0f, 8.0f, 7.0f);
        this.a3.setTextureSize(64, 32);
        this.a3.mirror = true;
        this.setRotation(this.a3, 0.7853982f, 0.0f, 0.0f);
        this.a4 = new ModelRenderer((ModelBase)this, 50, 10);
        this.a4.addBox(0.0f, 0.0f, -14.0f, 14, 0, 14);
        this.a4.setRotationPoint(-7.0f, 8.0f, 7.0f);
        this.a4.setTextureSize(64, 32);
        this.a4.mirror = true;
        this.setRotation(this.a4, 0.0f, 0.0f, 0.7853982f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5);
        this.bottom.render(f5);
        this.side1.render(f5);
        this.side2.render(f5);
        this.side3.render(f5);
        this.side4.render(f5);
        this.a1.render(f5);
        this.a2.render(f5);
        this.a3.render(f5);
        this.a4.render(f5);
    }

    public void renderModel(float f5) {
        this.bottom.render(f5);
        this.side1.render(f5);
        this.side2.render(f5);
        this.side3.render(f5);
        this.side4.render(f5);
        this.a1.render(f5);
        this.a2.render(f5);
        this.a3.render(f5);
        this.a4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    }
}

