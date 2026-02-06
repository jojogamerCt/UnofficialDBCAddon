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

public class ModelColonelSilver
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Hair;
    public ModelRenderer Head2;
    public ModelRenderer Hair2;
    public ModelRenderer Hair3;
    public ModelRenderer Hair4;
    public ModelRenderer Hair5;
    public ModelRenderer shape28;
    public ModelRenderer Ribbon;

    public ModelColonelSilver() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Hair5 = new ModelRenderer((ModelBase)this, 17, 56);
        this.Hair5.setRotationPoint(4.1f, -6.8f, -1.2f);
        this.Hair5.addBox(-1.4f, -2.8f, -1.9f, 2, 3, 4, 0.0f);
        this.setRotateAngle(this.Hair5, -0.045553092f, 0.091106184f, -0.3642502f);
        this.Hair = new ModelRenderer((ModelBase)this, 0, 0);
        this.Hair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hair.addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 40, 16);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 16, 16);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegR.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 40, 16);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Hair2 = new ModelRenderer((ModelBase)this, 52, 55);
        this.Hair2.setRotationPoint(-3.0f, -5.8f, -0.6f);
        this.Hair2.addBox(-1.4f, -3.8f, -3.3f, 2, 4, 4, 0.0f);
        this.setRotateAngle(this.Hair2, 0.024085544f, 0.045553092f, 0.51749015f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Hair4 = new ModelRenderer((ModelBase)this, 30, 56);
        this.Hair4.setRotationPoint(3.9f, -5.3f, 2.4f);
        this.Hair4.addBox(-1.4f, -3.4f, -1.5f, 2, 5, 2, 0.0f);
        this.setRotateAngle(this.Hair4, -0.13665928f, -0.13665928f, -0.31869712f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.Ribbon = new ModelRenderer((ModelBase)this, 25, 1);
        this.Ribbon.setRotationPoint(0.0f, 1.5f, -2.0f);
        this.Ribbon.addBox(-3.5f, 0.0f, 0.0f, 7, 5, 0, 0.0f);
        this.setRotateAngle(this.Ribbon, -0.18203785f, 0.0f, 0.0f);
        this.Head2 = new ModelRenderer((ModelBase)this, 0, 32);
        this.Head2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head2.addBox(-4.5f, -8.9f, -4.5f, 9, 9, 9, 0.0f);
        this.shape28 = new ModelRenderer((ModelBase)this, 49, 50);
        this.shape28.setRotationPoint(0.0f, -7.3f, -4.0f);
        this.shape28.addBox(-3.6f, 0.0f, 0.0f, 7, 4, 0, 0.0f);
        this.setRotateAngle(this.shape28, -0.13543755f, 0.0f, 0.0f);
        this.Hair3 = new ModelRenderer((ModelBase)this, 39, 55);
        this.Hair3.setRotationPoint(-3.3f, -6.7f, 0.9f);
        this.Hair3.addBox(-1.4f, -4.3f, -1.5f, 3, 5, 3, 0.0f);
        this.setRotateAngle(this.Hair3, 0.045553092f, 0.091106184f, 0.59184116f);
        this.Hair.addChild(this.Hair5);
        this.Head.addChild(this.Hair);
        this.Hair.addChild(this.Hair2);
        this.Hair.addChild(this.Hair4);
        this.Body.addChild(this.Ribbon);
        this.Head.addChild(this.Head2);
        this.Hair.addChild(this.shape28);
        this.Hair.addChild(this.Hair3);
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

