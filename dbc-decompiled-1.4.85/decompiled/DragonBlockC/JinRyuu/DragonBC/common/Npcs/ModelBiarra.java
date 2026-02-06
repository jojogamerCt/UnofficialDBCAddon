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

public class ModelBiarra
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
    public ModelRenderer LegR1;
    public ModelRenderer LegL1;
    public ModelRenderer EarL;
    public ModelRenderer EarR;
    public ModelRenderer Head2;
    public ModelRenderer Body2;
    public ModelRenderer ChestJewelL;
    public ModelRenderer ChestJewelR;
    public ModelRenderer Body3;
    public ModelRenderer Body3_1;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer ArmJewelR;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;
    public ModelRenderer ArmJewelL;
    public ModelRenderer LegR2;
    public ModelRenderer LegR3;
    public ModelRenderer LegL2;
    public ModelRenderer LegL3;

    public ModelBiarra() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 48);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-5.5f, 15.0f, -2.9f, 11, 6, 7, 0.0f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 101, 2);
        this.ArmL1.mirror = true;
        this.ArmL1.setRotationPoint(7.0f, -11.5f, 0.5f);
        this.ArmL1.addBox(0.0f, -3.0f, -3.0f, 6, 6, 6, 0.0f);
        this.setRotateAngle(this.ArmL1, 0.04363323f, 0.0f, 0.0f);
        this.ChestJewelR = new ModelRenderer((ModelBase)this, 38, 0);
        this.ChestJewelR.setRotationPoint(-5.6f, 8.8f, -3.3f);
        this.ChestJewelR.addBox(-1.0f, -0.9f, -1.0f, 2, 2, 1, 0.0f);
        this.ArmJewelL = new ModelRenderer((ModelBase)this, 29, 0);
        this.ArmJewelL.mirror = true;
        this.ArmJewelL.setRotationPoint(2.8f, 4.7f, 0.4f);
        this.ArmJewelL.addBox(0.0f, -0.9f, -1.0f, 1, 2, 2, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 66, 17);
        this.LegL2.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.LegL2.addBox(-3.0f, 0.0f, -2.6f, 6, 9, 6, 0.0f);
        this.setRotateAngle(this.LegL2, 0.04363323f, 0.0f, 0.02617994f);
        this.ChestJewelL = new ModelRenderer((ModelBase)this, 38, 0);
        this.ChestJewelL.setRotationPoint(5.6f, 8.8f, -3.3f);
        this.ChestJewelL.addBox(-1.0f, -0.9f, -1.0f, 2, 2, 1, 0.0f);
        this.LegR1 = new ModelRenderer((ModelBase)this, 67, 3);
        this.LegR1.setRotationPoint(-3.2f, 6.5f, 0.0f);
        this.LegR1.addBox(-2.5f, 0.0f, -2.5f, 5, 7, 6, 0.0f);
        this.setRotateAngle(this.LegR1, -0.04363323f, 0.0f, 0.05235988f);
        this.LegR3 = new ModelRenderer((ModelBase)this, 61, 35);
        this.LegR3.setRotationPoint(0.0f, 8.9f, 0.0f);
        this.LegR3.addBox(-2.5f, 0.0f, -6.0f, 5, 2, 10, 0.0f);
        this.setRotateAngle(this.LegR3, 0.0f, 0.0f, -0.02617994f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 102, 15);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(3.0f, 2.9f, 0.0f);
        this.ArmL2.addBox(-2.2f, -0.1f, -2.5f, 5, 8, 5, 0.0f);
        this.setRotateAngle(this.ArmL2, 0.0f, 0.0f, -0.06981317f);
        this.LegL3 = new ModelRenderer((ModelBase)this, 61, 35);
        this.LegL3.setRotationPoint(0.0f, 8.9f, 0.0f);
        this.LegL3.addBox(-2.5f, 0.0f, -6.0f, 5, 2, 10, 0.0f);
        this.setRotateAngle(this.LegL3, 0.0f, 0.0f, 0.02617994f);
        this.LegL1 = new ModelRenderer((ModelBase)this, 67, 3);
        this.LegL1.mirror = true;
        this.LegL1.setRotationPoint(3.2f, 6.5f, 0.0f);
        this.LegL1.addBox(-2.5f, 0.0f, -2.5f, 5, 7, 6, 0.0f);
        this.setRotateAngle(this.LegL1, -0.04363323f, 0.0f, -0.05235988f);
        this.Body3_1 = new ModelRenderer((ModelBase)this, 32, 48);
        this.Body3_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3_1.addBox(-4.0f, 11.8f, -3.6f, 8, 4, 1, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 13);
        this.Body1.setRotationPoint(0.0f, -14.5f, 0.0f);
        this.Body1.addBox(-7.0f, 0.0f, -3.8f, 14, 12, 9, 0.0f);
        this.Head2 = new ModelRenderer((ModelBase)this, 45, 4);
        this.Head2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head2.addBox(-1.0f, -5.4f, -2.8f, 2, 1, 7, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 102, 15);
        this.ArmR2.setRotationPoint(-3.0f, 2.9f, 0.0f);
        this.ArmR2.addBox(-2.7f, -0.1f, -2.5f, 5, 8, 5, 0.0f);
        this.setRotateAngle(this.ArmR2, 0.0f, 0.0f, 0.06981317f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 101, 29);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(0.0f, 7.3f, -0.5f);
        this.ArmL3.addBox(-2.7f, 0.0f, -2.4f, 6, 13, 6, 0.0f);
        this.setRotateAngle(this.ArmL3, -0.2617994f, 0.0f, (float)Math.PI / 90);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -14.5f, -0.3f);
        this.Head.addBox(-3.5f, -5.0f, -2.3f, 7, 5, 6, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 29, 5);
        this.EarR.setRotationPoint(-3.5f, -3.0f, 0.4f);
        this.EarR.addBox(-1.0f, -0.9f, -1.0f, 1, 2, 2, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 66, 17);
        this.LegR2.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.LegR2.addBox(-3.0f, 0.0f, -2.6f, 6, 9, 6, 0.0f);
        this.setRotateAngle(this.LegR2, 0.04363323f, 0.0f, -0.02617994f);
        this.ArmR3 = new ModelRenderer((ModelBase)this, 101, 29);
        this.ArmR3.setRotationPoint(0.0f, 7.3f, -0.5f);
        this.ArmR3.addBox(-3.2f, 0.0f, -2.4f, 6, 13, 6, 0.0f);
        this.setRotateAngle(this.ArmR3, -0.2617994f, 0.0f, (float)(-Math.PI) / 90);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 36);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-6.0f, 12.0f, -3.0f, 12, 3, 7, 0.0f);
        this.ArmJewelR = new ModelRenderer((ModelBase)this, 29, 0);
        this.ArmJewelR.setRotationPoint(-2.8f, 4.7f, 0.4f);
        this.ArmJewelR.addBox(-1.0f, -0.9f, -1.0f, 1, 2, 2, 0.0f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 101, 2);
        this.ArmR1.setRotationPoint(-7.0f, -11.5f, 0.5f);
        this.ArmR1.addBox(-6.0f, -3.0f, -3.0f, 6, 6, 6, 0.0f);
        this.setRotateAngle(this.ArmR1, 0.04363323f, 0.0f, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 29, 5);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(3.5f, -3.0f, 0.4f);
        this.EarL.addBox(0.0f, -0.9f, -1.0f, 1, 2, 2, 0.0f);
        this.Body2.addChild(this.Body3);
        this.Body1.addChild(this.ChestJewelR);
        this.ArmL3.addChild(this.ArmJewelL);
        this.LegL1.addChild(this.LegL2);
        this.Body1.addChild(this.ChestJewelL);
        this.LegR2.addChild(this.LegR3);
        this.ArmL1.addChild(this.ArmL2);
        this.LegL2.addChild(this.LegL3);
        this.Body3.addChild(this.Body3_1);
        this.Head.addChild(this.Head2);
        this.ArmR1.addChild(this.ArmR2);
        this.ArmL2.addChild(this.ArmL3);
        this.Head.addChild(this.EarR);
        this.LegR1.addChild(this.LegR2);
        this.ArmR2.addChild(this.ArmR3);
        this.Body1.addChild(this.Body2);
        this.ArmR3.addChild(this.ArmJewelR);
        this.Head.addChild(this.EarL);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL1.render(f5);
        this.Head.render(f5);
        this.ArmL1.render(f5);
        this.ArmR1.render(f5);
        this.Body1.render(f5);
        this.LegR1.render(f5);
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
        this.LegR1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmR1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR1.rotateAngleY = 0.0f;
        this.LegL1.rotateAngleY = 0.0f;
        this.ArmR1.rotateAngleY = 0.0f;
        this.ArmL1.rotateAngleY = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

