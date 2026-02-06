/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbtournament;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTien
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmL;
    public ModelRenderer ArmR;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Eye;
    public ModelRenderer Head2;
    public ModelRenderer Cloth;

    public ModelTien() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Body = new ModelRenderer((ModelBase)this, 16, 16);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 40, 16);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Cloth = new ModelRenderer((ModelBase)this, 24, 0);
        this.Cloth.setRotationPoint(2.5f, 9.8f, -2.0f);
        this.Cloth.addBox(-1.5f, 0.0f, 0.0f, 3, 8, 0, 0.0f);
        this.setRotateAngle(this.Cloth, -0.045378562f, 0.0f, 0.0f);
        this.Head2 = new ModelRenderer((ModelBase)this, 0, 1);
        this.Head2.setRotationPoint(0.0f, -7.8f, 0.4f);
        this.Head2.addBox(-1.0f, -1.8f, -1.1f, 2, 2, 2, 0.0f);
        this.Eye = new ModelRenderer((ModelBase)this, 0, 0);
        this.Eye.setRotationPoint(0.0f, -5.5f, -4.1f);
        this.Eye.addBox(-1.5f, -0.5f, 0.0f, 3, 1, 0, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 40, 16);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegR.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 16);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Body.addChild(this.Cloth);
        this.Head.addChild(this.Head2);
        this.Head.addChild(this.Eye);
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
        this.Cloth.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
    }
}

