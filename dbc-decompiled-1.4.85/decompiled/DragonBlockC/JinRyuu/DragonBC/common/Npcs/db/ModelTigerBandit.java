/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.client.JGRenderHelper
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs.db;

import JinRyuu.JRMCore.client.JGRenderHelper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelTigerBandit
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Nose;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer MuttonchopsR;
    public ModelRenderer MuttonchopsL;
    public ModelRenderer Body2;
    public ModelRenderer Armor;
    public ModelRenderer Sheat;
    public ModelRenderer ArmR2;
    public ModelRenderer ShoulderSpikeR;
    public ModelRenderer Sword1;
    public ModelRenderer Hilt1;
    public ModelRenderer ArmL2;
    public ModelRenderer ShoulderSpikeL;

    public ModelTigerBandit() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.MuttonchopsL = new ModelRenderer((ModelBase)this, 55, 8);
        this.MuttonchopsL.mirror = true;
        this.MuttonchopsL.setRotationPoint(3.5f, -3.5f, -0.8f);
        this.MuttonchopsL.addBox(0.0f, -0.2f, 0.0f, 2, 4, 0, 0.0f);
        this.setRotateAngle(this.MuttonchopsL, 0.0f, -0.6981317f, -0.08726646f);
        this.Sheat = new ModelRenderer((ModelBase)this, 48, 18);
        this.Sheat.setRotationPoint(7.3f, 13.0f, 1.0f);
        this.Sheat.addBox(0.0f, -2.6f, -5.2f, 1, 5, 15, 0.0f);
        this.setRotateAngle(this.Sheat, -0.3642502f, -0.03508112f, 0.0f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 92, 1);
        this.ArmL1.mirror = true;
        this.ArmL1.setRotationPoint(8.8f, -3.2f, 1.7f);
        this.ArmL1.addBox(-1.5f, -2.0f, -2.5f, 5, 8, 5, 0.0f);
        this.setRotateAngle(this.ArmL1, 0.0f, 0.0f, -0.20943952f);
        this.ShoulderSpikeR = new ModelRenderer((ModelBase)this, 89, 1);
        this.ShoulderSpikeR.setRotationPoint(-1.0f, -1.6f, 0.0f);
        this.ShoulderSpikeR.addBox(-1.5f, -3.3f, 0.0f, 3, 3, 0, 0.0f);
        this.ShoulderSpikeL = new ModelRenderer((ModelBase)this, 89, 1);
        this.ShoulderSpikeL.mirror = true;
        this.ShoulderSpikeL.setRotationPoint(1.0f, -1.6f, 0.0f);
        this.ShoulderSpikeL.addBox(-1.5f, -3.3f, 0.0f, 3, 3, 0, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 18);
        this.Body1.setRotationPoint(0.0f, -5.0f, 0.0f);
        this.Body1.addBox(-7.5f, 0.0f, -2.4f, 15, 8, 8, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 38);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-7.5f, 8.0f, -3.1f, 15, 7, 9, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 90, 15);
        this.ArmR2.setRotationPoint(-0.6f, 5.3f, -0.3f);
        this.ArmR2.addBox(-3.5f, -0.5f, -2.5f, 6, 9, 6, 0.0f);
        this.setRotateAngle(this.ArmR2, -0.4098033f, 0.0f, -0.08726646f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -4.5f, 0.6f);
        this.Head.addBox(-4.0f, -6.0f, -4.0f, 8, 6, 8, 0.0f);
        this.MuttonchopsR = new ModelRenderer((ModelBase)this, 55, 8);
        this.MuttonchopsR.setRotationPoint(-3.5f, -3.5f, -0.8f);
        this.MuttonchopsR.addBox(-2.0f, -0.4f, 0.0f, 2, 4, 0, 0.0f);
        this.setRotateAngle(this.MuttonchopsR, 0.0f, 0.6981317f, 0.08726646f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 92, 1);
        this.ArmR1.setRotationPoint(-8.8f, -3.2f, 1.7f);
        this.ArmR1.addBox(-3.5f, -2.0f, -2.5f, 5, 8, 5, 0.0f);
        this.setRotateAngle(this.ArmR1, 0.0f, 0.0f, 0.20943952f);
        this.Sword1 = new ModelRenderer((ModelBase)this, 46, -6);
        this.Sword1.setRotationPoint(0.0f, 6.9f, -0.6f);
        this.Sword1.addBox(0.0f, -2.6f, -13.8f, 0, 5, 19, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 90, 15);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.6f, 5.3f, -0.3f);
        this.ArmL2.addBox(-2.5f, -0.5f, -2.5f, 6, 9, 6, 0.0f);
        this.setRotateAngle(this.ArmL2, -0.4098033f, 0.0f, 0.08726646f);
        this.LegL = new ModelRenderer((ModelBase)this, 91, 36);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(3.6f, 10.0f, 1.0f);
        this.LegL.addBox(-3.5f, 0.0f, -3.5f, 7, 14, 8, 0.1f);
        this.Nose = new ModelRenderer((ModelBase)this, 46, 0);
        this.Nose.setRotationPoint(0.0f, -2.0f, -2.1f);
        this.Nose.addBox(-2.0f, -1.0f, -4.6f, 4, 3, 4, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 47, 8);
        this.EarR.setRotationPoint(-3.8f, -5.4f, -1.0f);
        this.EarR.addBox(-2.5f, -1.5f, 0.0f, 3, 2, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.34906584f, 0.34906584f);
        this.Armor = new ModelRenderer((ModelBase)this, 49, 42);
        this.Armor.setRotationPoint(0.0f, 15.0f, -3.1f);
        this.Armor.addBox(-3.5f, 0.0f, 0.0f, 7, 6, 0, 0.0f);
        this.EarL = new ModelRenderer((ModelBase)this, 47, 8);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(3.2f, -5.4f, -1.0f);
        this.EarL.addBox(0.0f, -1.5f, 0.0f, 3, 2, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.34906584f, -0.34906584f);
        this.Hilt1 = new ModelRenderer((ModelBase)this, 48, 25);
        this.Hilt1.setRotationPoint(0.0f, 0.2f, -2.2f);
        this.Hilt1.addBox(-2.5f, -2.8f, 0.0f, 5, 5, 0, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 91, 36);
        this.LegR.setRotationPoint(-3.6f, 10.0f, 1.0f);
        this.LegR.addBox(-3.5f, 0.0f, -3.5f, 7, 14, 8, 0.1f);
        this.Head.addChild(this.MuttonchopsL);
        this.Body2.addChild(this.Sheat);
        this.ArmR1.addChild(this.ShoulderSpikeR);
        this.ArmL1.addChild(this.ShoulderSpikeL);
        this.Body1.addChild(this.Body2);
        this.ArmR1.addChild(this.ArmR2);
        this.Head.addChild(this.MuttonchopsR);
        this.ArmR2.addChild(this.Sword1);
        this.ArmL1.addChild(this.ArmL2);
        this.Head.addChild(this.Nose);
        this.Head.addChild(this.EarR);
        this.Body2.addChild(this.Armor);
        this.Head.addChild(this.EarL);
        this.Sword1.addChild(this.Hilt1);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float F = 1.5f;
        JGRenderHelper.modelScalePositionHelper((float)1.5f);
        this.Head.render(f5);
        this.Body1.render(f5);
        this.ArmR1.render(f5);
        this.ArmL1.render(f5);
        this.LegL.render(f5);
        this.LegR.render(f5);
        GL11.glPopMatrix();
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
        this.Armor.rotateAngleX = -0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
    }
}

