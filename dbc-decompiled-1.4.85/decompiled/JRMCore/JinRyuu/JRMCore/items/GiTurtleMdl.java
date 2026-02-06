/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 */
package JinRyuu.JRMCore.items;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GiTurtleMdl
extends ModelBiped {
    ModelRenderer leftarmshoulder;
    ModelRenderer rightarmshoulder = new ModelRenderer((ModelBase)this, 40, 32);
    ModelRenderer cape;
    ModelRenderer c20;
    ModelRenderer c19;

    public GiTurtleMdl(float s) {
        super(s, 0.0f, 128, 64);
        this.rightarmshoulder.addBox(-3.0f, -5.0f, -3.0f, 7, 4, 6);
        this.rightarmshoulder.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.rightarmshoulder.setTextureSize(128, 64);
        this.setRotation(this.rightarmshoulder, 0.0f, 0.0f, 0.1570796f);
        this.leftarmshoulder = new ModelRenderer((ModelBase)this, 40, 32);
        this.leftarmshoulder.mirror = true;
        this.leftarmshoulder.addBox(-4.0f, -5.0f, -3.0f, 7, 4, 6);
        this.leftarmshoulder.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.leftarmshoulder.setTextureSize(128, 64);
        this.setRotation(this.leftarmshoulder, 0.0f, 0.0f, -0.1570796f);
        this.cape = new ModelRenderer((ModelBase)this, 100, 0);
        this.cape.addBox(-7.0f, 1.0f, 2.0f, 14, 20, 0, s);
        this.cape.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.cape.setTextureSize(128, 64);
        this.setRotation(this.cape, 0.1570796f, 0.0f, 0.0f);
        this.c20 = new ModelRenderer((ModelBase)this, 76, 35);
        this.c20.addBox(-4.0f, -12.0f, -4.0f, 8, 4, 8, s);
        this.c20.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.c20.setTextureSize(128, 64);
        this.c20.mirror = true;
        this.setRotation(this.c20, 0.0f, 0.0f, 0.0f);
        this.c19 = new ModelRenderer((ModelBase)this, 106, 29);
        this.c19.addBox(-1.0f, -11.0f, -0.5f, 2, 4, 2, s);
        this.c19.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.c19.setTextureSize(128, 64);
        this.c19.mirror = true;
        this.setRotation(this.c19, 0.0f, 0.0f, 0.0f);
        this.bipedHead.addChild(this.c20);
        this.bipedHead.addChild(this.c19);
        this.bipedBody.addChild(this.cape);
        this.bipedLeftArm.addChild(this.leftarmshoulder);
        this.bipedRightArm.addChild(this.rightarmshoulder);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationPub(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}

