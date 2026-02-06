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

public class ModelMercenaryTao
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Hair;
    public ModelRenderer Cloth1;
    public ModelRenderer Cloth2;

    public ModelMercenaryTao() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Cloth1 = new ModelRenderer((ModelBase)this, 0, 52);
        this.Cloth1.setRotationPoint(0.0f, 10.0f, -1.2f);
        this.Cloth1.addBox(-4.5f, 0.0f, -1.0f, 9, 9, 2, 0.0f);
        this.setRotateAngle(this.Cloth1, -0.045378562f, 0.0f, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 26, 19);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 26, 19);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 35);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 0, 17);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 35);
        this.LegR.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Cloth2 = new ModelRenderer((ModelBase)this, 23, 52);
        this.Cloth2.setRotationPoint(0.0f, 10.1f, 1.2f);
        this.Cloth2.addBox(-4.5f, 0.0f, -1.0f, 9, 9, 2, 0.0f);
        this.setRotateAngle(this.Cloth2, 0.045378562f, 0.0f, 0.0f);
        this.Hair = new ModelRenderer((ModelBase)this, 35, 3);
        this.Hair.setRotationPoint(0.0f, -1.2f, 4.0f);
        this.Hair.addBox(-1.5f, 0.0f, 0.0f, 3, 10, 0, 0.0f);
        this.setRotateAngle(this.Hair, 0.045553092f, 0.0f, 0.0f);
        this.Body.addChild(this.Cloth1);
        this.Body.addChild(this.Cloth2);
        this.Head.addChild(this.Hair);
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
        this.Hair.rotateAngleX = 0.15f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.5f * par2;
        if (0.0f > this.Hair.rotateAngleX) {
            this.Hair.rotateAngleX *= -1.0f;
        }
        this.Hair.rotateAngleY = 0.0f;
        this.LegR.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
        this.Cloth1.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth2.rotateAngleX = 0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? 1 : -1) * 1.0f;
    }
}

