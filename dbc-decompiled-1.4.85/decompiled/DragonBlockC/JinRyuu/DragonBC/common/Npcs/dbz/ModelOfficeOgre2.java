/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbz;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelOfficeOgre2
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer HornM1;
    public ModelRenderer HornR1;
    public ModelRenderer HornL1;
    public ModelRenderer Glasses;
    public ModelRenderer HornM2;
    public ModelRenderer HornR2;
    public ModelRenderer HornL2;
    public ModelRenderer Tie;

    public ModelOfficeOgre2() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.Glasses = new ModelRenderer((ModelBase)this, 29, 19);
        this.Glasses.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Glasses.addBox(-4.5f, -5.3f, -4.3f, 9, 3, 7, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 35);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 18, 35);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 3, 12, 4, 0.0f);
        this.Tie = new ModelRenderer((ModelBase)this, 1, 0);
        this.Tie.setRotationPoint(0.0f, 0.0f, -2.2f);
        this.Tie.addBox(-1.0f, 0.0f, 0.0f, 2, 7, 0, 0.0f);
        this.setRotateAngle(this.Tie, (float)(-Math.PI) / 180, 0.0f, 0.0f);
        this.HornM1 = new ModelRenderer((ModelBase)this, 25, 4);
        this.HornM1.setRotationPoint(0.0f, -8.0f, 0.0f);
        this.HornM1.addBox(-1.0f, -2.0f, -1.0f, 2, 2, 2, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 18, 35);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-2.0f, -2.0f, -2.0f, 3, 12, 4, 0.0f);
        this.HornM2 = new ModelRenderer((ModelBase)this, 34, 4);
        this.HornM2.setRotationPoint(0.0f, -1.7f, 0.0f);
        this.HornM2.addBox(-0.5f, -2.0f, -0.5f, 1, 2, 1, 0.0f);
        this.HornR1 = new ModelRenderer((ModelBase)this, 25, 0);
        this.HornR1.setRotationPoint(-3.0f, -7.4f, 0.0f);
        this.HornR1.addBox(-1.0f, -2.0f, -1.0f, 2, 2, 2, 0.0f);
        this.setRotateAngle(this.HornR1, 0.0f, 0.0f, -0.4537856f);
        this.HornR2 = new ModelRenderer((ModelBase)this, 34, 0);
        this.HornR2.setRotationPoint(0.0f, -1.7f, 0.0f);
        this.HornR2.addBox(-0.5f, -2.0f, -0.5f, 1, 2, 1, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 35);
        this.LegR.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.HornL2 = new ModelRenderer((ModelBase)this, 34, 0);
        this.HornL2.setRotationPoint(0.0f, -1.7f, 0.0f);
        this.HornL2.addBox(-0.5f, -2.0f, -0.5f, 1, 2, 1, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 0, 17);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f);
        this.HornL1 = new ModelRenderer((ModelBase)this, 25, 0);
        this.HornL1.setRotationPoint(3.0f, -7.4f, 0.0f);
        this.HornL1.addBox(-1.0f, -2.0f, -1.0f, 2, 2, 2, 0.0f);
        this.setRotateAngle(this.HornL1, 0.0f, 0.0f, 0.4537856f);
        this.Head.addChild(this.Glasses);
        this.Body.addChild(this.Tie);
        this.Head.addChild(this.HornM1);
        this.HornM1.addChild(this.HornM2);
        this.Head.addChild(this.HornR1);
        this.HornR1.addChild(this.HornR2);
        this.HornL1.addChild(this.HornL2);
        this.Head.addChild(this.HornL1);
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
    }
}

