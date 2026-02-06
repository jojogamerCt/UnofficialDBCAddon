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

public class ModelNinjaMurasaki
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Hair1;
    public ModelRenderer Hair2;
    public ModelRenderer Sword1;
    public ModelRenderer Body2;
    public ModelRenderer Sword2;
    public ModelRenderer Body3;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmR2;
    public ModelRenderer LegL2;
    public ModelRenderer LegR2;

    public ModelNinjaMurasaki() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.LegL = new ModelRenderer((ModelBase)this, 28, 34);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 10, 4, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 46, 29);
        this.ArmR2.setRotationPoint(-1.1f, 5.0f, 0.0f);
        this.ArmR2.addBox(-1.4f, 0.0f, -1.5f, 3, 4, 3, 0.0f);
        this.Hair1 = new ModelRenderer((ModelBase)this, 28, 1);
        this.Hair1.setRotationPoint(0.0f, -7.3f, 2.9f);
        this.Hair1.addBox(-0.5f, -4.0f, -0.5f, 1, 4, 1, 0.0f);
        this.setRotateAngle(this.Hair1, -0.8651597f, 0.0f, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 43, 16);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 3.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 7, 4, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 46, 29);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.9f, 5.0f, 0.0f);
        this.ArmL2.addBox(-1.4f, 0.0f, -1.5f, 3, 4, 3, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 28, 49);
        this.LegR2.setRotationPoint(-0.1f, 10.0f, 0.0f);
        this.LegR2.addBox(-1.4f, 0.0f, -2.9f, 3, 2, 5, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 1, 19);
        this.Body.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 8, 4, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.5f, -4.0f, 8, 9, 8, -0.5f);
        this.Body2 = new ModelRenderer((ModelBase)this, 1, 32);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.5f, 8.0f, -1.5f, 7, 1, 3, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 28, 34);
        this.LegR.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 10, 4, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 1, 38);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-4.0f, 9.0f, -2.0f, 8, 2, 4, 0.0f);
        this.Sword2 = new ModelRenderer((ModelBase)this, 17, 57);
        this.Sword2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Sword2.addBox(-2.8f, -2.0f, -0.7f, 0, 4, 2, 0.0f);
        this.Sword1 = new ModelRenderer((ModelBase)this, 22, 60);
        this.Sword1.setRotationPoint(-2.5f, 2.6f, 2.6f);
        this.Sword1.addBox(-8.8f, -1.0f, 0.2f, 21, 2, 0, 0.0f);
        this.setRotateAngle(this.Sword1, 0.0f, (float)Math.PI / 90, 0.7740535f);
        this.ArmR = new ModelRenderer((ModelBase)this, 43, 16);
        this.ArmR.setRotationPoint(-5.0f, 3.0f, 0.0f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 7, 4, 0.0f);
        this.LegL2 = new ModelRenderer((ModelBase)this, 28, 49);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(0.0f, 10.0f, 0.0f);
        this.LegL2.addBox(-1.4f, 0.0f, -2.9f, 3, 2, 5, 0.0f);
        this.Hair2 = new ModelRenderer((ModelBase)this, 35, 1);
        this.Hair2.setRotationPoint(0.0f, -4.1f, 0.0f);
        this.Hair2.addBox(-3.0f, -3.1f, 0.0f, 6, 6, 0, 0.0f);
        this.setRotateAngle(this.Hair2, 1.5707964f, 0.0f, 0.0f);
        this.ArmR.addChild(this.ArmR2);
        this.Head.addChild(this.Hair1);
        this.ArmL.addChild(this.ArmL2);
        this.LegR.addChild(this.LegR2);
        this.Body.addChild(this.Body2);
        this.Body2.addChild(this.Body3);
        this.Sword1.addChild(this.Sword2);
        this.Body.addChild(this.Sword1);
        this.LegL.addChild(this.LegL2);
        this.Hair1.addChild(this.Hair2);
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

