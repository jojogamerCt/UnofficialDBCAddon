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

public class mBoard
extends ModelBase {
    public ModelRenderer shape1;

    public mBoard() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        int size = 30;
        this.shape1 = new ModelRenderer((ModelBase)this, 0, -30);
        this.shape1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.shape1.addBox(0.0f, -5.0f, -30.0f, 0, 10, 30, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shape1.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void render(ModelRenderer a, Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        a.render(f5);
    }

    public void renderModel(byte type, Entity entity, float par8, float par9, float f, float r, boolean b) {
        this.render(this.shape1, entity, 0.0f, 0.0f, r, par8, par9, f);
    }
}

