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

public class ModelTien2
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Chest;
    public ModelRenderer Eye;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer CapeBase;
    public ModelRenderer Cape;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmL2;

    public ModelTien2() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Chest = new ModelRenderer((ModelBase)this, 26, 17);
        this.Chest.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Chest.addBox(-3.5f, 0.0f, -2.0f, 7, 5, 4, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 47, 36);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 29, 36);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Cape = new ModelRenderer((ModelBase)this, 1, 46);
        this.Cape.setRotationPoint(0.0f, 1.3f, 2.3f);
        this.Cape.addBox(-4.0f, 0.0f, 0.0f, 8, 16, 0, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 47, 24);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.0f, 4, 5, 4, 0.1f);
        this.Body2 = new ModelRenderer((ModelBase)this, 1, 29);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.5f, 7.0f, -1.5f, 7, 1, 3, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 47, 24);
        this.ArmR.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.ArmR.addBox(-3.0f, -2.0f, -2.0f, 4, 5, 4, 0.1f);
        this.Eye = new ModelRenderer((ModelBase)this, 0, 0);
        this.Eye.setRotationPoint(0.0f, -5.9f, -4.1f);
        this.Eye.addBox(-1.5f, -0.5f, 0.0f, 3, 1, 0, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 29, 36);
        this.LegR.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 1, 35);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-4.0f, 8.0f, -2.0f, 8, 4, 4, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 1, 17);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addBox(-4.0f, 0.0f, -2.0f, 8, 7, 4, 0.2f);
        this.CapeBase = new ModelRenderer((ModelBase)this, 19, 55);
        this.CapeBase.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.CapeBase.addBox(-3.5f, -0.6f, -2.5f, 7, 2, 5, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 47, 36);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL2.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f);
        this.Body.addChild(this.Chest);
        this.ArmR.addChild(this.ArmR2);
        this.CapeBase.addChild(this.Cape);
        this.Body.addChild(this.Body2);
        this.Head.addChild(this.Eye);
        this.Body.addChild(this.Body3);
        this.Body.addChild(this.CapeBase);
        this.ArmL.addChild(this.ArmL2);
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
        this.Cape.rotateAngleX = -0.15f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        if (0.0f > this.Cape.rotateAngleX) {
            this.Cape.rotateAngleX *= -1.0f;
        }
        this.Cape.rotateAngleY = 0.0f;
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

