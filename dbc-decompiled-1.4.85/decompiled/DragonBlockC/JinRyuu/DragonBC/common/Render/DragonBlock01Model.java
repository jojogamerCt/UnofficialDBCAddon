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

public class DragonBlock01Model
extends ModelBase {
    ModelRenderer starblock;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape110;
    ModelRenderer Shape111;
    ModelRenderer Shape112;
    ModelRenderer Shape113;
    ModelRenderer Shape114;
    ModelRenderer Shape115;
    ModelRenderer Shape116;
    ModelRenderer Shape117;
    ModelRenderer Shape118;
    ModelRenderer Shape119;
    ModelRenderer Shape120;
    ModelRenderer Shape121;
    ModelRenderer Shape122;
    ModelRenderer Shape123;
    ModelRenderer Shape124;
    ModelRenderer Shape125;
    ModelRenderer Shape126;
    ModelRenderer Shape127;
    ModelRenderer Shape128;
    ModelRenderer Shape129;
    ModelRenderer Shape130;
    ModelRenderer Shape131;

    public DragonBlock01Model() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.starblock = new ModelRenderer((ModelBase)this, 16, 0);
        this.starblock.addBox(-1.0f, -4.0f, -1.0f, 2, 2, 2);
        this.starblock.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.starblock.setTextureSize(64, 32);
        this.starblock.mirror = true;
        this.setRotation(this.starblock, 0.0f, 0.0f, 0.0f);
        this.Shape11 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape11.addBox(3.0f, -5.0f, -2.0f, 0, 4, 4);
        this.Shape11.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape11.setTextureSize(64, 32);
        this.Shape11.mirror = true;
        this.setRotation(this.Shape11, 0.0f, 0.0f, 0.0f);
        this.Shape12 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape12.addBox(-2.0f, 0.0f, -2.0f, 4, 0, 4);
        this.Shape12.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape12.setTextureSize(64, 32);
        this.Shape12.mirror = true;
        this.setRotation(this.Shape12, 0.0f, 0.0f, 0.0f);
        this.Shape13 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape13.addBox(-2.0f, -5.0f, 3.0f, 4, 4, 0);
        this.Shape13.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape13.setTextureSize(64, 32);
        this.Shape13.mirror = true;
        this.setRotation(this.Shape13, 0.0f, 0.0f, 0.0f);
        this.Shape14 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape14.addBox(-3.0f, -5.0f, -2.0f, 0, 4, 4);
        this.Shape14.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape14.setTextureSize(64, 32);
        this.Shape14.mirror = true;
        this.setRotation(this.Shape14, 0.0f, 0.0f, 0.0f);
        this.Shape15 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape15.addBox(-2.0f, -1.0f, 2.0f, 4, 0, 1);
        this.Shape15.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape15.setTextureSize(64, 32);
        this.Shape15.mirror = true;
        this.setRotation(this.Shape15, 0.0f, 0.0f, 0.0f);
        this.Shape16 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape16.addBox(-2.0f, -1.0f, 2.0f, 4, 1, 0);
        this.Shape16.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape16.setTextureSize(64, 32);
        this.Shape16.mirror = true;
        this.setRotation(this.Shape16, 0.0f, 0.0f, 0.0f);
        this.Shape17 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape17.addBox(2.0f, -6.0f, -2.0f, 0, 1, 4);
        this.Shape17.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape17.setTextureSize(64, 32);
        this.Shape17.mirror = true;
        this.setRotation(this.Shape17, 0.0f, 0.0f, 0.0f);
        this.Shape18 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape18.addBox(2.0f, -5.0f, -3.0f, 0, 4, 1);
        this.Shape18.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape18.setTextureSize(64, 32);
        this.Shape18.mirror = true;
        this.setRotation(this.Shape18, 0.0f, 0.0f, 0.0f);
        this.Shape19 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape19.addBox(-2.0f, -1.0f, -2.0f, 0, 1, 4);
        this.Shape19.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape19.setTextureSize(64, 32);
        this.Shape19.mirror = true;
        this.setRotation(this.Shape19, 0.0f, 0.0f, 0.0f);
        this.Shape110 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape110.addBox(2.0f, -1.0f, -2.0f, 0, 1, 4);
        this.Shape110.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape110.setTextureSize(64, 32);
        this.Shape110.mirror = true;
        this.setRotation(this.Shape110, 0.0f, 0.0f, 0.0f);
        this.Shape111 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape111.addBox(-3.0f, -5.0f, 2.0f, 1, 4, 0);
        this.Shape111.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape111.setTextureSize(64, 32);
        this.Shape111.mirror = true;
        this.setRotation(this.Shape111, 0.0f, 0.0f, 0.0f);
        this.Shape112 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape112.addBox(-2.0f, -6.0f, -2.0f, 4, 1, 0);
        this.Shape112.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape112.setTextureSize(64, 32);
        this.Shape112.mirror = true;
        this.setRotation(this.Shape112, 0.0f, 0.0f, 0.0f);
        this.Shape113 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape113.addBox(-2.0f, -6.0f, 2.0f, 4, 1, 0);
        this.Shape113.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape113.setTextureSize(64, 32);
        this.Shape113.mirror = true;
        this.setRotation(this.Shape113, 0.0f, 0.0f, 0.0f);
        this.Shape114 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape114.addBox(-2.0f, -6.0f, 2.0f, 4, 1, 0);
        this.Shape114.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape114.setTextureSize(64, 32);
        this.Shape114.mirror = true;
        this.setRotation(this.Shape114, 0.0f, 0.0f, 0.0f);
        this.Shape115 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape115.addBox(-2.0f, -1.0f, -2.0f, 4, 1, 0);
        this.Shape115.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape115.setTextureSize(64, 32);
        this.Shape115.mirror = true;
        this.setRotation(this.Shape115, 0.0f, 0.0f, 0.0f);
        this.Shape116 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape116.addBox(-2.0f, -6.0f, -2.0f, 0, 1, 4);
        this.Shape116.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape116.setTextureSize(64, 32);
        this.Shape116.mirror = true;
        this.setRotation(this.Shape116, 0.0f, 0.0f, 0.0f);
        this.Shape117 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape117.addBox(-2.0f, -5.0f, -3.0f, 0, 4, 1);
        this.Shape117.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape117.setTextureSize(64, 32);
        this.Shape117.mirror = true;
        this.setRotation(this.Shape117, 0.0f, 0.0f, 0.0f);
        this.Shape118 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape118.addBox(-2.0f, -5.0f, 2.0f, 0, 4, 1);
        this.Shape118.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape118.setTextureSize(64, 32);
        this.Shape118.mirror = true;
        this.setRotation(this.Shape118, 0.0f, 0.0f, 0.0f);
        this.Shape119 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape119.addBox(2.0f, -5.0f, 2.0f, 0, 4, 1);
        this.Shape119.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape119.setTextureSize(64, 32);
        this.Shape119.mirror = true;
        this.setRotation(this.Shape119, 0.0f, 0.0f, 0.0f);
        this.Shape120 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape120.addBox(-2.0f, -5.0f, -3.0f, 4, 4, 0);
        this.Shape120.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape120.setTextureSize(64, 32);
        this.Shape120.mirror = true;
        this.setRotation(this.Shape120, 0.0f, 0.0f, 0.0f);
        this.Shape121 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape121.addBox(-3.0f, -5.0f, -2.0f, 1, 4, 0);
        this.Shape121.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape121.setTextureSize(64, 32);
        this.Shape121.mirror = true;
        this.setRotation(this.Shape121, 0.0f, 0.0f, 0.0f);
        this.Shape122 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape122.addBox(2.0f, -5.0f, -2.0f, 1, 4, 0);
        this.Shape122.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape122.setTextureSize(64, 32);
        this.Shape122.mirror = true;
        this.setRotation(this.Shape122, 0.0f, 0.0f, 0.0f);
        this.Shape123 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape123.addBox(2.0f, -5.0f, 2.0f, 1, 4, 0);
        this.Shape123.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape123.setTextureSize(64, 32);
        this.Shape123.mirror = true;
        this.setRotation(this.Shape123, 0.0f, 0.0f, 0.0f);
        this.Shape124 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape124.addBox(-2.0f, -6.0f, -2.0f, 4, 0, 4);
        this.Shape124.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape124.setTextureSize(64, 32);
        this.Shape124.mirror = true;
        this.setRotation(this.Shape124, 0.0f, 0.0f, 0.0f);
        this.Shape125 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape125.addBox(-3.0f, -5.0f, -2.0f, 1, 0, 4);
        this.Shape125.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape125.setTextureSize(64, 32);
        this.Shape125.mirror = true;
        this.setRotation(this.Shape125, 0.0f, 0.0f, 0.0f);
        this.Shape126 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape126.addBox(-3.0f, -1.0f, -2.0f, 1, 0, 4);
        this.Shape126.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape126.setTextureSize(64, 32);
        this.Shape126.mirror = true;
        this.setRotation(this.Shape126, 0.0f, 0.0f, 0.0f);
        this.Shape127 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape127.addBox(2.0f, -1.0f, -2.0f, 1, 0, 4);
        this.Shape127.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape127.setTextureSize(64, 32);
        this.Shape127.mirror = true;
        this.setRotation(this.Shape127, 0.0f, 0.0f, 0.0f);
        this.Shape128 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape128.addBox(2.0f, -5.0f, -2.0f, 1, 0, 4);
        this.Shape128.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape128.setTextureSize(64, 32);
        this.Shape128.mirror = true;
        this.setRotation(this.Shape128, 0.0f, 0.0f, 0.0f);
        this.Shape129 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape129.addBox(-2.0f, -5.0f, 2.0f, 4, 0, 1);
        this.Shape129.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape129.setTextureSize(64, 32);
        this.Shape129.mirror = true;
        this.setRotation(this.Shape129, 0.0f, 0.0f, 0.0f);
        this.Shape130 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape130.addBox(-2.0f, -1.0f, -3.0f, 4, 0, 1);
        this.Shape130.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape130.setTextureSize(64, 32);
        this.Shape130.mirror = true;
        this.setRotation(this.Shape130, 0.0f, 0.0f, 0.0f);
        this.Shape131 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Shape131.addBox(-2.0f, -5.0f, -3.0f, 4, 0, 1);
        this.Shape131.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Shape131.setTextureSize(64, 32);
        this.Shape131.mirror = true;
        this.setRotation(this.Shape131, 0.0f, 0.0f, 0.0f);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.starblock.render(f5);
        this.Shape11.render(f5);
        this.Shape12.render(f5);
        this.Shape13.render(f5);
        this.Shape14.render(f5);
        this.Shape15.render(f5);
        this.Shape16.render(f5);
        this.Shape17.render(f5);
        this.Shape18.render(f5);
        this.Shape19.render(f5);
        this.Shape110.render(f5);
        this.Shape111.render(f5);
        this.Shape112.render(f5);
        this.Shape113.render(f5);
        this.Shape114.render(f5);
        this.Shape115.render(f5);
        this.Shape116.render(f5);
        this.Shape117.render(f5);
        this.Shape118.render(f5);
        this.Shape119.render(f5);
        this.Shape120.render(f5);
        this.Shape121.render(f5);
        this.Shape122.render(f5);
        this.Shape123.render(f5);
        this.Shape124.render(f5);
        this.Shape125.render(f5);
        this.Shape126.render(f5);
        this.Shape127.render(f5);
        this.Shape128.render(f5);
        this.Shape129.render(f5);
        this.Shape130.render(f5);
        this.Shape131.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7Entity) {
    }

    public void renderModel(float f) {
        this.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f);
    }

    public void render() {
        this.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
    }
}

