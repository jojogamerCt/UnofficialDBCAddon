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

public class ModelAngelAwamo
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer NeckRing;
    public ModelRenderer Hair1;
    public ModelRenderer Hair2;
    public ModelRenderer Hair3;
    public ModelRenderer Hair4;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer ClothF;
    public ModelRenderer ClothB;
    public ModelRenderer ShoulderR;
    public ModelRenderer ShoulderArmorR;
    public ModelRenderer ShoulderL;
    public ModelRenderer ShoulderArmorL;
    public ModelRenderer LegR2;
    public ModelRenderer LegR3;
    public ModelRenderer LegL2;
    public ModelRenderer LegL3;
    public ModelRenderer NeckRing_1;
    public ModelRenderer NeckRing_2;
    public ModelRenderer NeckRing_3;
    public ModelRenderer NeckRing_4;
    public ModelRenderer NeckRing_5;
    public ModelRenderer NeckRing_6;
    public ModelRenderer NeckRing_7;

    public ModelAngelAwamo() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Hair1 = new ModelRenderer((ModelBase)this, 30, 0);
        this.Hair1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair1.addBox(-2.5f, -8.2f, -3.2f, 5, 2, 4, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 29, 36);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-5.9f, 10.1f, -4.1f, 12, 3, 8, 0.0f);
        this.LegL3 = new ModelRenderer((ModelBase)this, 17, 41);
        this.LegL3.mirror = true;
        this.LegL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL3.addBox(-1.3f, 10.0f, -4.0f, 3, 2, 2, 0.0f);
        this.Hair2 = new ModelRenderer((ModelBase)this, 49, 0);
        this.Hair2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair2.addBox(-2.0f, -9.6f, -3.5f, 3, 2, 3, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 42);
        this.LegR.setRotationPoint(-2.6f, 12.0f, 0.0f);
        this.LegR.addBox(-1.5f, 6.0f, -2.0f, 3, 6, 4, 0.0f);
        this.NeckRing_2 = new ModelRenderer((ModelBase)this, 19, 54);
        this.NeckRing_2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.NeckRing_2.addBox(-8.7f, -3.0f, -3.9f, 2, 1, 9, 0.0f);
        this.setRotateAngle(this.NeckRing_2, 0.0f, -0.82833326f, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 82, 21);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(6.2f, 1.5f, -0.2f);
        this.ArmL.addBox(-0.9f, -1.7f, -1.8f, 3, 11, 4, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -0.8f, 0.0f);
        this.Head.addBox(-4.0f, -6.7f, -4.0f, 8, 7, 8, -0.4f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 42);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.4f, 12.0f, 0.0f);
        this.LegL.addBox(-1.3f, 6.0f, -2.0f, 3, 6, 4, 0.0f);
        this.ShoulderL = new ModelRenderer((ModelBase)this, 81, 12);
        this.ShoulderL.mirror = true;
        this.ShoulderL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderL.addBox(-1.2f, -2.1f, -1.9f, 4, 4, 4, 0.0f);
        this.LegR3 = new ModelRenderer((ModelBase)this, 17, 41);
        this.LegR3.mirror = true;
        this.LegR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR3.addBox(-1.5f, 10.0f, -4.0f, 3, 2, 2, 0.0f);
        this.Hair4 = new ModelRenderer((ModelBase)this, 71, 0);
        this.Hair4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair4.addBox(-0.3f, -12.0f, -4.5f, 1, 1, 2, 0.0f);
        this.ShoulderR = new ModelRenderer((ModelBase)this, 81, 12);
        this.ShoulderR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderR.addBox(-2.8f, -2.1f, -1.7f, 4, 4, 4, 0.0f);
        this.NeckRing_1 = new ModelRenderer((ModelBase)this, 0, 56);
        this.NeckRing_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.NeckRing_1.addBox(-9.7f, -3.0f, -2.9f, 2, 1, 7, 0.0f);
        this.setRotateAngle(this.NeckRing_1, 0.0f, 0.8342674f, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 32, 9);
        this.Body1.setRotationPoint(0.0f, -1.0f, 0.0f);
        this.Body1.addBox(-5.0f, 0.1f, -3.7f, 10, 5, 7, 0.0f);
        this.NeckRing_6 = new ModelRenderer((ModelBase)this, 19, 54);
        this.NeckRing_6.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.NeckRing_6.addBox(-8.3f, -3.0f, -5.5f, 2, 1, 9, 0.0f);
        this.setRotateAngle(this.NeckRing_6, 0.0f, -0.7696902f, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 30, 22);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-5.5f, 5.1f, -4.2f, 11, 5, 8, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 82, 21);
        this.ArmR.setRotationPoint(-6.2f, 1.5f, -0.2f);
        this.ArmR.addBox(-2.1f, -1.7f, -1.8f, 3, 11, 4, 0.0f);
        this.NeckRing_3 = new ModelRenderer((ModelBase)this, 0, 56);
        this.NeckRing_3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.NeckRing_3.addBox(-8.7f, -3.0f, -3.2f, 2, 1, 7, 0.0f);
        this.setRotateAngle(this.NeckRing_3, 0.0f, -0.8290314f, 0.0f);
        this.ShoulderArmorR = new ModelRenderer((ModelBase)this, 78, 3);
        this.ShoulderArmorR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderArmorR.addBox(-3.7f, -2.5f, -3.0f, 5, 2, 6, 0.0f);
        this.setRotateAngle(this.ShoulderArmorR, 0.0f, 0.0f, 0.1134464f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 0, 23);
        this.LegR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegR2.addBox(-3.3f, 0.1f, -3.5f, 6, 8, 7, 0.0f);
        this.NeckRing_4 = new ModelRenderer((ModelBase)this, 0, 56);
        this.NeckRing_4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.NeckRing_4.addBox(-8.5f, -3.0f, -3.3f, 2, 1, 7, 0.0f);
        this.setRotateAngle(this.NeckRing_4, 0.0f, -0.7382743f, 0.0f);
        this.ClothB = new ModelRenderer((ModelBase)this, 33, 52);
        this.ClothB.setRotationPoint(0.0f, 10.4f, 3.8f);
        this.ClothB.addBox(-4.6f, -0.3f, 0.2f, 9, 9, 0, 0.0f);
        this.setRotateAngle(this.ClothB, 0.11868239f, 0.0f, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 0, 23);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.LegL2.addBox(-2.4f, 0.1f, -3.5f, 6, 8, 7, 0.0f);
        this.NeckRing_5 = new ModelRenderer((ModelBase)this, 0, 56);
        this.NeckRing_5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.NeckRing_5.addBox(-8.3f, -3.0f, -3.3f, 2, 1, 7, 0.0f);
        this.setRotateAngle(this.NeckRing_5, 0.0f, -0.7841764f, 0.0f);
        this.ClothF = new ModelRenderer((ModelBase)this, 33, 52);
        this.ClothF.setRotationPoint(0.0f, 10.4f, -3.5f);
        this.ClothF.addBox(-4.5f, -0.3f, -0.7f, 9, 9, 0, 0.0f);
        this.setRotateAngle(this.ClothF, -0.11868239f, 0.0f, 0.0f);
        this.NeckRing_7 = new ModelRenderer((ModelBase)this, 0, 56);
        this.NeckRing_7.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.NeckRing_7.addBox(-9.6f, -3.0f, -4.2f, 2, 1, 7, 0.0f);
        this.setRotateAngle(this.NeckRing_7, 0.0f, -0.8609709f, 0.0f);
        this.Hair3 = new ModelRenderer((ModelBase)this, 62, 0);
        this.Hair3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair3.addBox(-1.8f, -11.8f, -3.8f, 2, 3, 2, 0.0f);
        this.ShoulderArmorL = new ModelRenderer((ModelBase)this, 78, 3);
        this.ShoulderArmorL.mirror = true;
        this.ShoulderArmorL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderArmorL.addBox(-1.3f, -2.5f, -3.0f, 5, 2, 6, 0.0f);
        this.setRotateAngle(this.ShoulderArmorL, 0.0f, 0.0f, -0.1134464f);
        this.NeckRing = new ModelRenderer((ModelBase)this, 0, 53);
        this.NeckRing.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.NeckRing.addBox(-3.5f, -3.0f, 7.9f, 7, 1, 2, 0.0f);
        this.setRotateAngle(this.NeckRing, 0.36669368f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair1);
        this.Body2.addChild(this.Body3);
        this.LegL.addChild(this.LegL3);
        this.Hair1.addChild(this.Hair2);
        this.NeckRing_1.addChild(this.NeckRing_2);
        this.ArmL.addChild(this.ShoulderL);
        this.LegR.addChild(this.LegR3);
        this.Hair3.addChild(this.Hair4);
        this.ArmR.addChild(this.ShoulderR);
        this.NeckRing.addChild(this.NeckRing_1);
        this.NeckRing_5.addChild(this.NeckRing_6);
        this.Body1.addChild(this.Body2);
        this.NeckRing_2.addChild(this.NeckRing_3);
        this.ArmR.addChild(this.ShoulderArmorR);
        this.LegR.addChild(this.LegR2);
        this.NeckRing_3.addChild(this.NeckRing_4);
        this.Body3.addChild(this.ClothB);
        this.LegL.addChild(this.LegL2);
        this.NeckRing_4.addChild(this.NeckRing_5);
        this.Body3.addChild(this.ClothF);
        this.NeckRing_6.addChild(this.NeckRing_7);
        this.Hair2.addChild(this.Hair3);
        this.ArmL.addChild(this.ShoulderArmorL);
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
        this.ClothF.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.ClothB.rotateAngleX = 0.15f + this.LegL.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

