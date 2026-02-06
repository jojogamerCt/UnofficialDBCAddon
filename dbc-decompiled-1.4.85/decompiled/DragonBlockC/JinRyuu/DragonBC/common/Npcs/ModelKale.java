/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelKale
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer HairBand;
    public ModelRenderer HairFront1;
    public ModelRenderer Hair2;
    public ModelRenderer HairFront2;
    public ModelRenderer Hair3;
    public ModelRenderer Hair4;
    public ModelRenderer Body2;
    public ModelRenderer Boobs;
    public ModelRenderer Body3;

    public ModelKale() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ArmL = new ModelRenderer((ModelBase)this, 32, 29);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(4.3f, 2.5f, 0.0f);
        this.ArmL.addBox(-1.3f, -1.4f, -1.8f, 3, 12, 4, -0.3f);
        this.setRotateAngle(this.ArmL, 0.0f, 0.0f, -0.06981317f);
        this.Boobs = new ModelRenderer((ModelBase)this, 19, 27);
        this.Boobs.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Boobs.addBox(-3.0f, 1.8f, -0.7f, 6, 3, 2, 0.0f);
        this.setRotateAngle(this.Boobs, -0.59184116f, 0.0f, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 35);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-3.5f, 7.9f, -2.0f, 7, 3, 4, 0.0f);
        this.HairFront1 = new ModelRenderer((ModelBase)this, 54, 1);
        this.HairFront1.setRotationPoint(1.3f, 0.4f, -3.0f);
        this.HairFront1.addBox(-1.0f, -0.3f, -0.8f, 2, 1, 1, 0.0f);
        this.setRotateAngle(this.HairFront1, 0.27314404f, -0.3000221f, -0.22759093f);
        this.Hair2 = new ModelRenderer((ModelBase)this, 37, 0);
        this.Hair2.setRotationPoint(-0.4f, -4.2f, 1.6f);
        this.Hair2.addBox(-1.2f, -5.4f, -2.0f, 2, 5, 3, 0.0f);
        this.setRotateAngle(this.Hair2, -0.3642502f, -0.13665928f, -0.091106184f);
        this.HairFront2 = new ModelRenderer((ModelBase)this, 54, 5);
        this.HairFront2.setRotationPoint(0.1f, 0.1f, -0.8f);
        this.HairFront2.addBox(-1.0f, -0.3f, -0.8f, 2, 4, 1, 0.0f);
        this.setRotateAngle(this.HairFront2, 0.0f, 0.0f, -0.31869712f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 27);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.0f, 4.3f, -1.6f, 6, 4, 3, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 17);
        this.Body1.setRotationPoint(0.0f, 1.2f, 0.0f);
        this.Body1.addBox(-3.5f, 0.0f, -2.0f, 7, 5, 4, -0.2f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 46);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.6f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Hair4 = new ModelRenderer((ModelBase)this, 48, 11);
        this.Hair4.setRotationPoint(-0.7f, -2.0f, 0.0f);
        this.Hair4.addBox(-1.2f, -4.1f, -0.9f, 2, 4, 2, 0.0f);
        this.setRotateAngle(this.Hair4, -0.8651597f, 0.0f, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 1.4f, 0.0f);
        this.Head.addBox(-4.0f, -7.5f, -4.0f, 8, 8, 8, -0.5f);
        this.ArmR = new ModelRenderer((ModelBase)this, 32, 29);
        this.ArmR.setRotationPoint(-4.3f, 2.5f, 0.0f);
        this.ArmR.addBox(-1.7f, -1.4f, -1.8f, 3, 12, 4, -0.3f);
        this.setRotateAngle(this.ArmR, 0.0f, 0.0f, 0.06981317f);
        this.Hair3 = new ModelRenderer((ModelBase)this, 37, 9);
        this.Hair3.setRotationPoint(1.2f, 0.6f, -0.2f);
        this.Hair3.addBox(-1.2f, -5.4f, -2.0f, 2, 5, 3, 0.0f);
        this.setRotateAngle(this.Hair3, -0.3642502f, 0.13665928f, 0.18203785f);
        this.HairBand = new ModelRenderer((ModelBase)this, 26, 0);
        this.HairBand.setRotationPoint(0.0f, -4.6f, -1.1f);
        this.HairBand.addBox(-1.5f, -5.0f, 1.0f, 3, 2, 2, 0.0f);
        this.setRotateAngle(this.HairBand, -0.7285004f, 0.045553092f, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 46);
        this.LegR.setRotationPoint(-1.6f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Body1.addChild(this.Boobs);
        this.Body2.addChild(this.Body3);
        this.HairBand.addChild(this.HairFront1);
        this.HairBand.addChild(this.Hair2);
        this.HairFront1.addChild(this.HairFront2);
        this.Body1.addChild(this.Body2);
        this.Hair3.addChild(this.Hair4);
        this.Hair2.addChild(this.Hair3);
        this.Head.addChild(this.HairBand);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.Body1.render(f5);
        this.LegR.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        int calc = par7Entity.ticksExisted;
        if (calc > 100) {
            calc -= 100;
        }
        float r = 360.0f;
        float r2 = 180.0f;
        float n4 = par4;
        float n5 = par5;
        this.Head.rotateAngleY = n4 / (r2 / (float)Math.PI);
        this.Head.rotateAngleX = n5 / (r2 / (float)Math.PI);
        float ex = par7Entity.ticksExisted;
        float r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        float r4 = MathHelper.cos((float)(ex / 8.0f)) / 5.0f + 0.1f;
        r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        r4 = MathHelper.cos((float)(ex / 8.0f)) / 3.0f - 0.2f;
        this.LegR.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

