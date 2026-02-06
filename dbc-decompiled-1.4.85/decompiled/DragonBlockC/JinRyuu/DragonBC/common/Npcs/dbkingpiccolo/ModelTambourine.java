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

public class ModelTambourine
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Head2;
    public ModelRenderer EarL;
    public ModelRenderer EarR;
    public ModelRenderer Cloth;
    public ModelRenderer WingL;
    public ModelRenderer WingR;
    public ModelRenderer Cloth2;

    public ModelTambourine() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Cloth2 = new ModelRenderer((ModelBase)this, 41, 0);
        this.Cloth2.setRotationPoint(0.0f, 8.5f, -2.1f);
        this.Cloth2.addBox(-3.5f, 0.0f, 0.0f, 7, 6, 0, 0.0f);
        this.setRotateAngle(this.Cloth2, -0.05235988f, 0.0f, 0.0f);
        this.Cloth = new ModelRenderer((ModelBase)this, 55, 3);
        this.Cloth.setRotationPoint(0.0f, 9.0f, 0.4f);
        this.Cloth.addBox(-4.5f, 0.0f, -2.3f, 9, 6, 4, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 27, 17);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.WingR = new ModelRenderer((ModelBase)this, 29, 39);
        this.WingR.setRotationPoint(-3.0f, 3.0f, 2.6f);
        this.WingR.addBox(-19.0f, -14.0f, 0.0f, 21, 22, 0, 0.0f);
        this.setRotateAngle(this.WingR, 0.0f, 0.17453292f, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 32, 1);
        this.EarR.setRotationPoint(-3.5f, -4.4f, -1.0f);
        this.EarR.addBox(-3.5f, -2.4f, 0.0f, 3, 5, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.87266463f, -0.04363323f);
        this.Head2 = new ModelRenderer((ModelBase)this, 35, -1);
        this.Head2.setRotationPoint(0.0f, -4.8f, 0.9f);
        this.Head2.addBox(0.0f, -4.0f, -4.0f, 0, 8, 8, 0.0f);
        this.WingL = new ModelRenderer((ModelBase)this, 29, 39);
        this.WingL.mirror = true;
        this.WingL.setRotationPoint(1.0f, 3.0f, 2.6f);
        this.WingL.addBox(0.0f, -14.0f, 0.0f, 21, 22, 0, 0.0f);
        this.setRotateAngle(this.WingL, 0.0f, -0.17453292f, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 27, 17);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 2, 39);
        this.LegR.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 2, 39);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 32, 1);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(3.8f, -4.4f, -1.0f);
        this.EarL.addBox(0.0f, -2.4f, 0.0f, 3, 5, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.87266463f, 0.04363323f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 1, 19);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f);
        this.Body.addChild(this.Cloth2);
        this.Body.addChild(this.Cloth);
        this.Body.addChild(this.WingR);
        this.Head.addChild(this.EarR);
        this.Head.addChild(this.Head2);
        this.Body.addChild(this.WingL);
        this.Head.addChild(this.EarL);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Head.render(f5);
        this.Body.render(f5);
        this.ArmR.render(f5);
        this.ArmL.render(f5);
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
        this.ArmR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
        this.Cloth2.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth.rotateAngleX = 0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth.rotateAngleX = 0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth.rotateAngleX = 0.15f + this.LegL.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth.rotateAngleX = 0.15f + this.LegL.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

