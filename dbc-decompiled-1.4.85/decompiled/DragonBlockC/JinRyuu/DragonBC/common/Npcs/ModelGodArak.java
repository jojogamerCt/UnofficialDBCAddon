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

public class ModelGodArak
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer Hair;
    public ModelRenderer WhiskersR1;
    public ModelRenderer WhiskersR1_1;
    public ModelRenderer WhiskersR2;
    public ModelRenderer WhiskersR3;
    public ModelRenderer WhiskersR4;
    public ModelRenderer WhiskersR2_1;
    public ModelRenderer WhiskersR3_1;
    public ModelRenderer WhiskersR4_1;
    public ModelRenderer Neck;
    public ModelRenderer Body2;
    public ModelRenderer Cloth1;
    public ModelRenderer Body3;
    public ModelRenderer LegR2;
    public ModelRenderer LegL2;
    public ModelRenderer ArmRingR1;
    public ModelRenderer ArmRingR2;
    public ModelRenderer ArmRingL1;
    public ModelRenderer ArmRingL2;

    public ModelGodArak() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.WhiskersR1_1 = new ModelRenderer((ModelBase)this, 31, 1);
        this.WhiskersR1_1.setRotationPoint(3.8f, -3.1f, -0.7f);
        this.WhiskersR1_1.addBox(-0.6f, 0.0f, -0.2f, 1, 3, 0, 0.0f);
        this.setRotateAngle(this.WhiskersR1_1, 0.27314404f, -0.4553564f, -1.1383038f);
        this.ArmR = new ModelRenderer((ModelBase)this, 50, 16);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-2.0f, -2.0f, -1.8f, 3, 12, 4, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 23, 29);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.5f, 5.0f, -3.1f, 7, 3, 5, 0.0f);
        this.ArmRingL2 = new ModelRenderer((ModelBase)this, 25, 51);
        this.ArmRingL2.mirror = true;
        this.ArmRingL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmRingL2.addBox(-0.4f, 7.4f, -2.3f, 4, 1, 5, 0.0f);
        this.setRotateAngle(this.ArmRingL2, 0.0f, 0.0f, 0.10471976f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 33);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-1.8f, 1.4f, -2.0f, 4, 6, 4, 0.3f);
        this.Hair = new ModelRenderer((ModelBase)this, 0, 45);
        this.Hair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.addBox(-3.5f, -11.8f, -2.6f, 7, 5, 6, 0.0f);
        this.setRotateAngle(this.Hair, (float)(-Math.PI) / 90, 0.0f, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 20, 18);
        this.Body1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body1.addBox(-4.0f, 0.0f, -2.0f, 8, 5, 4, 0.0f);
        this.WhiskersR3 = new ModelRenderer((ModelBase)this, 31, 1);
        this.WhiskersR3.setRotationPoint(0.8f, 0.0f, -0.2f);
        this.WhiskersR3.addBox(-0.6f, 0.0f, -0.2f, 1, 3, 0, 0.0f);
        this.setRotateAngle(this.WhiskersR3, 0.0f, 0.091106184f, -0.13665928f);
        this.ArmRingL1 = new ModelRenderer((ModelBase)this, 25, 51);
        this.ArmRingL1.mirror = true;
        this.ArmRingL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmRingL1.addBox(-1.3f, 6.4f, -2.3f, 4, 1, 5, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 21, 38);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-3.5f, 8.0f, -2.9f, 7, 4, 5, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 33);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.3f, 1.4f, -2.0f, 4, 6, 4, 0.3f);
        this.Neck = new ModelRenderer((ModelBase)this, 42, 6);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.addBox(-2.0f, -1.6f, -0.8f, 4, 2, 2, 0.0f);
        this.WhiskersR1 = new ModelRenderer((ModelBase)this, 31, 1);
        this.WhiskersR1.setRotationPoint(-3.8f, -3.1f, -0.7f);
        this.WhiskersR1.addBox(-0.6f, 0.0f, -0.2f, 1, 3, 0, 0.0f);
        this.setRotateAngle(this.WhiskersR1, 0.27314404f, 0.4553564f, 1.1383038f);
        this.Cloth1 = new ModelRenderer((ModelBase)this, 47, 51);
        this.Cloth1.setRotationPoint(0.0f, 9.9f, -2.5f);
        this.Cloth1.addBox(-2.5f, 0.0f, -0.5f, 5, 8, 0, 0.0f);
        this.setRotateAngle(this.Cloth1, -0.057595864f, 0.0f, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -1.2f, 0.0f);
        this.Head.addBox(-4.0f, -7.0f, -4.3f, 8, 7, 8, 0.0f);
        this.WhiskersR3_1 = new ModelRenderer((ModelBase)this, 31, 1);
        this.WhiskersR3_1.setRotationPoint(-0.9f, 0.0f, -0.2f);
        this.WhiskersR3_1.addBox(-0.6f, 0.0f, -0.2f, 1, 3, 0, 0.0f);
        this.setRotateAngle(this.WhiskersR3_1, 0.0f, 0.098087505f, 0.12967797f);
        this.ArmL = new ModelRenderer((ModelBase)this, 50, 16);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -1.8f, 3, 12, 4, 0.0f);
        this.WhiskersR2 = new ModelRenderer((ModelBase)this, 31, 1);
        this.WhiskersR2.setRotationPoint(1.2f, 0.5f, 0.1f);
        this.WhiskersR2.addBox(-0.7f, -0.1f, -0.3f, 1, 3, 0, 0.0f);
        this.setRotateAngle(this.WhiskersR2, 0.0f, 0.045553092f, -0.091106184f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR2.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.WhiskersR4 = new ModelRenderer((ModelBase)this, 31, 1);
        this.WhiskersR4.setRotationPoint(1.0f, 0.0f, -0.1f);
        this.WhiskersR4.addBox(-0.6f, 0.1f, -0.2f, 1, 3, 0, 0.0f);
        this.setRotateAngle(this.WhiskersR4, 0.0f, 0.0f, -0.18203785f);
        this.WhiskersR4_1 = new ModelRenderer((ModelBase)this, 31, 1);
        this.WhiskersR4_1.setRotationPoint(-0.8f, 0.0f, -0.1f);
        this.WhiskersR4_1.addBox(-0.6f, 0.1f, -0.2f, 1, 3, 0, 0.0f);
        this.setRotateAngle(this.WhiskersR4_1, 0.0f, 0.0f, 0.12618731f);
        this.WhiskersR2_1 = new ModelRenderer((ModelBase)this, 31, 1);
        this.WhiskersR2_1.setRotationPoint(-0.9f, 0.3f, 0.1f);
        this.WhiskersR2_1.addBox(-0.7f, -0.1f, -0.3f, 1, 3, 0, 0.0f);
        this.setRotateAngle(this.WhiskersR2_1, 0.0f, -0.026005406f, 0.06667158f);
        this.ArmRingR2 = new ModelRenderer((ModelBase)this, 25, 51);
        this.ArmRingR2.mirror = true;
        this.ArmRingR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmRingR2.addBox(-3.6f, 7.4f, -2.3f, 4, 1, 5, 0.0f);
        this.setRotateAngle(this.ArmRingR2, 0.0f, 0.0f, -0.10471976f);
        this.ArmRingR1 = new ModelRenderer((ModelBase)this, 25, 51);
        this.ArmRingR1.mirror = true;
        this.ArmRingR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmRingR1.addBox(-2.7f, 6.4f, -2.3f, 4, 1, 5, 0.0f);
        this.Head.addChild(this.WhiskersR1_1);
        this.Body1.addChild(this.Body2);
        this.ArmRingL1.addChild(this.ArmRingL2);
        this.Head.addChild(this.Hair);
        this.LegL.addChild(this.LegL2);
        this.WhiskersR2.addChild(this.WhiskersR3);
        this.ArmL.addChild(this.ArmRingL1);
        this.Body2.addChild(this.Body3);
        this.Body1.addChild(this.Neck);
        this.Head.addChild(this.WhiskersR1);
        this.Body1.addChild(this.Cloth1);
        this.WhiskersR2_1.addChild(this.WhiskersR3_1);
        this.WhiskersR1.addChild(this.WhiskersR2);
        this.LegR.addChild(this.LegR2);
        this.WhiskersR3.addChild(this.WhiskersR4);
        this.WhiskersR3_1.addChild(this.WhiskersR4_1);
        this.WhiskersR1_1.addChild(this.WhiskersR2_1);
        this.ArmRingR1.addChild(this.ArmRingR2);
        this.ArmR.addChild(this.ArmRingR1);
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
        this.Cloth1.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

