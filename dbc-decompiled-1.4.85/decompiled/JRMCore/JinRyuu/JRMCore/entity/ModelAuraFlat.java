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

public class ModelAuraFlat
extends ModelBase {
    public ModelRenderer box;

    public ModelAuraFlat() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.box = new ModelRenderer((ModelBase)this, 0, 0);
        this.box.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.box.addBox(-5.0f, -5.0f, 0.0f, 10, 10, 0, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.box.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

