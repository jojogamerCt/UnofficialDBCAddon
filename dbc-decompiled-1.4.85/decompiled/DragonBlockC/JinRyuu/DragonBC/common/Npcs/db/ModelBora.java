/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.db;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBora
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Hair;
    public ModelRenderer Body2;
    public ModelRenderer Chest;
    public ModelRenderer Body3;

    public ModelBora() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.LegR = new ModelRenderer((ModelBase)this, 0, 43);
        this.LegR.setRotationPoint(-2.4f, 10.1f, 0.0f);
        this.LegR.addBox(-2.5f, 0.0f, -2.5f, 5, 14, 5, -0.1f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -3.4f, 0.0f);
        this.Head.addBox(-4.0f, -8.2f, -4.0f, 8, 8, 8, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 22, 44);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-5.0f, 9.7f, -2.5f, 10, 4, 5, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 0, 17);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.8f, -1.7f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.5f, 5, 14, 5, -0.2f);
        this.Chest = new ModelRenderer((ModelBase)this, 54, 19);
        this.Chest.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Chest.addBox(-5.0f, 1.0f, -2.7f, 10, 4, 1, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 43);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.4f, 10.1f, 0.0f);
        this.LegL.addBox(-2.5f, 0.0f, -2.5f, 5, 14, 5, -0.1f);
        this.ArmR = new ModelRenderer((ModelBase)this, 0, 17);
        this.ArmR.setRotationPoint(-5.8f, -1.7f, 0.0f);
        this.ArmR.addBox(-4.0f, -2.0f, -2.5f, 5, 14, 5, -0.2f);
        this.Body = new ModelRenderer((ModelBase)this, 22, 17);
        this.Body.setRotationPoint(0.0f, -3.5f, 0.0f);
        this.Body.addBox(-5.0f, 0.0f, -2.0f, 10, 7, 5, 0.1f);
        this.Hair = new ModelRenderer((ModelBase)this, 33, 0);
        this.Hair.setRotationPoint(0.0f, -1.2f, 4.0f);
        this.Hair.addBox(-2.0f, 0.0f, 0.0f, 4, 6, 0, 0.0f);
        this.setRotateAngle(this.Hair, 0.04712389f, 0.0f, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 23, 31);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-4.5f, 4.7f, -2.4f, 9, 5, 5, 0.0f);
        this.Body2.addChild(this.Body3);
        this.Body.addChild(this.Chest);
        this.Head.addChild(this.Hair);
        this.Body.addChild(this.Body2);
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
        this.Hair.rotateAngleX = -0.15f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
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
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

