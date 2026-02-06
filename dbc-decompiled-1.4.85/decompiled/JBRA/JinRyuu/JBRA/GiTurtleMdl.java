/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.entity.ModelBipedBody
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.JBRA;

import JinRyuu.JRMCore.entity.ModelBipedBody;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class GiTurtleMdl
extends ModelBipedBody {
    ModelRenderer leftarmshoulder;
    ModelRenderer rightarmshoulder = new ModelRenderer((ModelBase)this, 40, 32);
    ModelRenderer cape;
    ModelRenderer c20;
    ModelRenderer c19;

    public GiTurtleMdl(float s) {
        super(s, 0.0f, 128, 64);
        this.rightarmshoulder.addBox(-3.0f, -5.0f, -3.0f, 7, 4, 6, s);
        this.rightarmshoulder.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.rightarmshoulder.setTextureSize(128, 64);
        this.setRotation(this.rightarmshoulder, 0.0f, 0.0f, 0.1570796f);
        this.leftarmshoulder = new ModelRenderer((ModelBase)this, 40, 32);
        this.leftarmshoulder.mirror = true;
        this.leftarmshoulder.addBox(-4.0f, -5.0f, -3.0f, 7, 4, 6, s);
        this.leftarmshoulder.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.leftarmshoulder.setTextureSize(128, 64);
        this.setRotation(this.leftarmshoulder, 0.0f, 0.0f, -0.1570796f);
        this.cape = new ModelRenderer((ModelBase)this, 100, 0);
        this.cape.addBox(-7.0f, 1.0f, 3.0f, 14, 20, 0, s);
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
        this.body.addChild(this.cape);
        this.bipedLeftArm.addChild(this.leftarmshoulder);
        this.bipedRightArm.addChild(this.rightarmshoulder);
        this.leftarm.addChild(this.leftarmshoulder);
        this.rightarm.addChild(this.rightarmshoulder);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
        float s = 0.1070796f;
        if (this.cape != null) {
            if (y == 1) {
                float s2 = MathHelper.cos((float)(par1 * 0.6662f)) * 1.0f * par2;
                float s3 = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.0f * par2;
                this.cape.rotateAngleX = s3 + s > s ? s3 + s : (s2 + s > s ? s2 + s : s);
            } else {
                this.cape.rotateAngleX = s;
            }
        }
    }
}

