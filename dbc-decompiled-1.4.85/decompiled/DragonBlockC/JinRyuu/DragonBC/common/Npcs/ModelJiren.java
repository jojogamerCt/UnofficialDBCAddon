/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelJiren
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer EarL;
    public ModelRenderer EarR;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer Chest;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;

    public ModelJiren() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.EarR = new ModelRenderer((ModelBase)this, 33, 8);
        this.EarR.setRotationPoint(-4.0f, -4.2f, 0.4f);
        this.EarR.addBox(-1.0f, -1.5f, -1.6f, 1, 3, 3, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 41, 42);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(3.0f, 9.0f, 0.0f);
        this.LegL.addBox(-3.0f, 0.0f, -3.0f, 6, 15, 6, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 35, 33);
        this.Chest.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Chest.addBox(-6.0f, 1.8f, -4.1f, 12, 5, 1, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 33, 8);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(4.0f, -4.2f, 0.4f);
        this.EarL.addBox(0.0f, -1.5f, -1.6f, 1, 3, 3, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -8.0f, -0.5f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 48);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-6.0f, 12.0f, -3.0f, 12, 5, 6, 0.0f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 63, 28);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(0.0f, 4.1f, -0.5f);
        this.ArmL3.addBox(-2.7f, 0.0f, -1.8f, 5, 9, 5, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 64, 18);
        this.ArmR2.setRotationPoint(-2.0f, 2.0f, 0.0f);
        this.ArmR2.addBox(-2.7f, 0.4f, -2.5f, 5, 4, 5, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 64, 18);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(2.0f, 2.0f, 0.0f);
        this.ArmL2.addBox(-2.3f, 0.4f, -2.5f, 5, 4, 5, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 17);
        this.Body1.setRotationPoint(0.0f, -8.0f, 0.0f);
        this.Body1.addBox(-7.0f, 0.0f, -3.3f, 14, 8, 7, 0.0f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 63, 5);
        this.ArmR1.setRotationPoint(-7.5f, -4.7f, 0.0f);
        this.ArmR1.addBox(-5.0f, -3.0f, -3.0f, 6, 6, 6, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 34);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-5.5f, 6.2f, -3.5f, 11, 6, 6, 0.0f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 63, 5);
        this.ArmL1.mirror = true;
        this.ArmL1.setRotationPoint(7.5f, -4.7f, 0.0f);
        this.ArmL1.addBox(-1.0f, -3.0f, -3.0f, 6, 6, 6, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 41, 42);
        this.LegR.setRotationPoint(-3.0f, 9.0f, 0.0f);
        this.LegR.addBox(-3.0f, 0.0f, -3.0f, 6, 15, 6, 0.0f);
        this.ArmR3 = new ModelRenderer((ModelBase)this, 63, 28);
        this.ArmR3.setRotationPoint(0.0f, 4.1f, -0.5f);
        this.ArmR3.addBox(-2.3f, 0.0f, -1.9f, 5, 9, 5, 0.0f);
        this.Head.addChild(this.EarR);
        this.Body2.addChild(this.Chest);
        this.Head.addChild(this.EarL);
        this.Body2.addChild(this.Body3);
        this.ArmL2.addChild(this.ArmL3);
        this.ArmR1.addChild(this.ArmR2);
        this.ArmL1.addChild(this.ArmL2);
        this.Body1.addChild(this.Body2);
        this.ArmR2.addChild(this.ArmR3);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL1.render(f5);
        this.ArmR1.render(f5);
        this.Body1.render(f5);
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
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

