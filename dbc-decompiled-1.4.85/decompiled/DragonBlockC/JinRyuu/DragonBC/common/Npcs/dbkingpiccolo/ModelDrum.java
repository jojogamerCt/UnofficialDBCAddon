/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbkingpiccolo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDrum
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer Head_1;
    public ModelRenderer Body2;
    public ModelRenderer Chest;
    public ModelRenderer Cloth2;
    public ModelRenderer Cloth;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmL2;

    public ModelDrum() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.LegL = new ModelRenderer((ModelBase)this, 96, 33);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(3.6f, 10.0f, 1.0f);
        this.LegL.addBox(-3.5f, 0.0f, -3.5f, 7, 14, 8, 0.1f);
        this.Cloth2 = new ModelRenderer((ModelBase)this, 50, 42);
        this.Cloth2.setRotationPoint(0.0f, 12.0f, -3.1f);
        this.Cloth2.addBox(-3.5f, 0.0f, 0.0f, 7, 6, 0, 0.0f);
        this.setRotateAngle(this.Cloth2, -0.05235988f, 0.0f, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 32, 1);
        this.EarR.setRotationPoint(-3.5f, -4.4f, -1.0f);
        this.EarR.addBox(-3.5f, -2.4f, 0.0f, 3, 5, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.87266463f, -0.04363323f);
        this.Chest = new ModelRenderer((ModelBase)this, 47, 31);
        this.Chest.setRotationPoint(0.0f, 4.2f, -1.5f);
        this.Chest.addBox(-7.0f, -2.1f, -1.4f, 14, 5, 2, 0.0f);
        this.setRotateAngle(this.Chest, -0.05235988f, 0.0f, 0.0f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 92, 1);
        this.ArmL1.mirror = true;
        this.ArmL1.setRotationPoint(8.8f, -2.5f, 1.7f);
        this.ArmL1.addBox(-1.5f, -2.0f, -2.5f, 5, 8, 5, 0.0f);
        this.setRotateAngle(this.ArmL1, 0.0f, 0.0f, -0.20943952f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -4.4f, 0.3f);
        this.Head.addBox(-4.0f, -6.0f, -4.0f, 8, 6, 8, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 96, 33);
        this.LegR.setRotationPoint(-3.6f, 10.0f, 1.0f);
        this.LegR.addBox(-3.5f, 0.0f, -3.5f, 7, 14, 8, 0.1f);
        this.Head_1 = new ModelRenderer((ModelBase)this, 35, 0);
        this.Head_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head_1.addBox(0.0f, -7.5f, -3.1f, 0, 6, 8, 0.0f);
        this.Cloth = new ModelRenderer((ModelBase)this, 2, 51);
        this.Cloth.setRotationPoint(0.0f, 12.9f, 3.0f);
        this.Cloth.addBox(-8.0f, -0.9f, -2.9f, 16, 7, 6, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 90, 15);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.6f, 5.3f, -0.3f);
        this.ArmL2.addBox(-2.5f, -0.5f, -2.5f, 6, 9, 6, 0.0f);
        this.setRotateAngle(this.ArmL2, -0.4098033f, 0.0f, 0.08726646f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 90, 15);
        this.ArmR2.setRotationPoint(-0.6f, 5.3f, -0.3f);
        this.ArmR2.addBox(-3.5f, -0.5f, -2.5f, 6, 9, 6, 0.0f);
        this.setRotateAngle(this.ArmR2, -0.4098033f, 0.0f, -0.08726646f);
        this.EarL = new ModelRenderer((ModelBase)this, 32, 1);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(3.8f, -4.4f, -1.0f);
        this.EarL.addBox(0.0f, -2.4f, 0.0f, 3, 5, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.87266463f, 0.04363323f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 34);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-7.5f, 8.0f, -3.1f, 15, 7, 9, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 16);
        this.Body1.setRotationPoint(0.0f, -5.0f, 0.0f);
        this.Body1.addBox(-7.5f, 0.0f, -2.4f, 15, 8, 8, 0.0f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 92, 1);
        this.ArmR1.setRotationPoint(-8.8f, -2.5f, 1.7f);
        this.ArmR1.addBox(-3.5f, -2.0f, -2.5f, 5, 8, 5, 0.0f);
        this.setRotateAngle(this.ArmR1, 0.0f, 0.0f, 0.20943952f);
        this.Body2.addChild(this.Cloth2);
        this.Head.addChild(this.EarR);
        this.Body1.addChild(this.Chest);
        this.Head.addChild(this.Head_1);
        this.Body2.addChild(this.Cloth);
        this.ArmL1.addChild(this.ArmL2);
        this.ArmR1.addChild(this.ArmR2);
        this.Head.addChild(this.EarL);
        this.Body1.addChild(this.Body2);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Head.render(f5);
        this.Body1.render(f5);
        this.ArmR1.render(f5);
        this.ArmL1.render(f5);
        this.LegL.render(f5);
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
        this.ArmR1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR1.rotateAngleY = 0.0f;
        this.ArmL1.rotateAngleY = 0.0f;
        this.Cloth2.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth.rotateAngleX = 0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth.rotateAngleX = 0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth.rotateAngleX = 0.15f + this.LegL.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth.rotateAngleX = 0.15f + this.LegL.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

