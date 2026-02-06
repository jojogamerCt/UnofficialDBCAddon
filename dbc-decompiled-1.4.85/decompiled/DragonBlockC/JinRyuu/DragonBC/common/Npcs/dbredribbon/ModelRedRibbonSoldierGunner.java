/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbredribbon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRedRibbonSoldierGunner
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer Hat;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer Gun1;
    public ModelRenderer Gun2;
    public ModelRenderer Gun4;
    public ModelRenderer Gun3;
    public ModelRenderer Barrel;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;
    public ModelRenderer Ribbon;

    public ModelRedRibbonSoldierGunner() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.Barrel = new ModelRenderer((ModelBase)this, 58, 59);
        this.Barrel.setRotationPoint(0.0f, 3.5f, -0.3f);
        this.Barrel.addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 0, 32);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-3.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmR2, 0.5462881f, -0.22759093f, 0.091106184f);
        this.ArmR = new ModelRenderer((ModelBase)this, 0, 0);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 17, 43);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(1.0f, 4.0f, 0.0f);
        this.ArmL3.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmL3, -0.13665928f, 0.0f, 0.0f);
        this.Gun2 = new ModelRenderer((ModelBase)this, 55, 51);
        this.Gun2.setRotationPoint(0.0f, 5.0f, 0.0f);
        this.Gun2.addBox(-1.0f, -1.6f, -1.3f, 2, 5, 2, 0.0f);
        this.Gun4 = new ModelRenderer((ModelBase)this, 53, 35);
        this.Gun4.setRotationPoint(0.0f, -0.9f, 0.4f);
        this.Gun4.addBox(-0.5f, -1.1f, -1.2f, 1, 2, 4, 0.0f);
        this.setRotateAngle(this.Gun4, 0.7285004f, 0.0f, 0.0f);
        this.Gun1 = new ModelRenderer((ModelBase)this, 53, 42);
        this.Gun1.setRotationPoint(0.5f, 5.8f, -3.2f);
        this.Gun1.addBox(-1.0f, -1.4f, -1.6f, 2, 5, 3, 0.0f);
        this.setRotateAngle(this.Gun1, -0.10471976f, -0.2268928f, 0.4712389f);
        this.ArmR3 = new ModelRenderer((ModelBase)this, 17, 32);
        this.ArmR3.setRotationPoint(-1.0f, 4.4f, -1.7f);
        this.ArmR3.addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmR3, -2.048842f, -0.31869712f, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 0, 43);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL2.addBox(-1.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f);
        this.setRotateAngle(this.ArmL2, -1.1838568f, 0.8196066f, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegR.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Gun3 = new ModelRenderer((ModelBase)this, 50, 51);
        this.Gun3.setRotationPoint(0.0f, 1.7f, -1.5f);
        this.Gun3.addBox(-0.5f, -1.9f, -0.5f, 1, 5, 1, 0.0f);
        this.Ribbon = new ModelRenderer((ModelBase)this, 41, 20);
        this.Ribbon.setRotationPoint(2.8f, 0.9f, 0.0f);
        this.Ribbon.addBox(0.0f, -1.9f, 0.0f, 6, 5, 0, 0.0f);
        this.setRotateAngle(this.Ribbon, 0.0f, -0.95609134f, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 16, 16);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 0, 0);
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f);
        this.Hat = new ModelRenderer((ModelBase)this, 24, 2);
        this.Hat.setRotationPoint(0.0f, -5.0f, -4.4f);
        this.Hat.addBox(-4.0f, 0.0f, -1.6f, 8, 0, 2, 0.0f);
        this.setRotateAngle(this.Hat, 0.22759093f, 0.0f, 0.0f);
        this.Gun2.addChild(this.Barrel);
        this.ArmR.addChild(this.ArmR2);
        this.ArmL2.addChild(this.ArmL3);
        this.Gun1.addChild(this.Gun2);
        this.Gun1.addChild(this.Gun4);
        this.ArmR3.addChild(this.Gun1);
        this.ArmR2.addChild(this.ArmR3);
        this.ArmL.addChild(this.ArmL2);
        this.Gun1.addChild(this.Gun3);
        this.ArmL2.addChild(this.Ribbon);
        this.Head.addChild(this.Hat);
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
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
    }
}

