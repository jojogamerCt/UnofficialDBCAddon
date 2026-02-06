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
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.JRMCore.client.JGRenderHelper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelAniraza
extends ModelBase {
    public ModelRenderer Head1;
    public ModelRenderer Body1;
    public ModelRenderer ShoulderR;
    public ModelRenderer ShoulderL;
    public ModelRenderer LegR1;
    public ModelRenderer LegL1;
    public ModelRenderer HeadExtra1;
    public ModelRenderer HeadExtra1_1;
    public ModelRenderer HeadExtra2;
    public ModelRenderer HeadExtra3;
    public ModelRenderer HeadExtra2_1;
    public ModelRenderer HeadExtra3_1;
    public ModelRenderer Neck1;
    public ModelRenderer Body2;
    public ModelRenderer Chest;
    public ModelRenderer Neck2;
    public ModelRenderer Neck3;
    public ModelRenderer Abs;
    public ModelRenderer Body3;
    public ModelRenderer Body4;
    public ModelRenderer BicepR;
    public ModelRenderer ForeArmR;
    public ModelRenderer BicepL;
    public ModelRenderer ForeArmL;
    public ModelRenderer LegR2;
    public ModelRenderer LegR3;
    public ModelRenderer FootR;
    public ModelRenderer LegL2;
    public ModelRenderer LegL3;
    public ModelRenderer FootL;

    public ModelAniraza() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.HeadExtra1 = new ModelRenderer((ModelBase)this, 43, 1);
        this.HeadExtra1.setRotationPoint(-4.6f, -6.0f, -0.5f);
        this.HeadExtra1.addBox(-4.0f, -1.5f, -2.0f, 4, 3, 4, 0.0f);
        this.setRotateAngle(this.HeadExtra1, 0.0f, 0.0f, -0.19198622f);
        this.ShoulderR = new ModelRenderer((ModelBase)this, 144, 54);
        this.ShoulderR.setRotationPoint(-12.3f, -54.5f, 4.0f);
        this.ShoulderR.addBox(-11.1f, -3.6f, -5.5f, 11, 10, 11, 0.0f);
        this.Neck2 = new ModelRenderer((ModelBase)this, 62, 27);
        this.Neck2.setRotationPoint(0.0f, 0.0f, -1.0f);
        this.Neck2.addBox(-7.0f, -4.1f, 0.3f, 14, 6, 4, 0.0f);
        this.Body4 = new ModelRenderer((ModelBase)this, 2, 131);
        this.Body4.setRotationPoint(0.0f, 9.4f, 1.0f);
        this.Body4.addBox(-10.0f, -2.7f, -6.9f, 20, 7, 12, 0.0f);
        this.BicepR = new ModelRenderer((ModelBase)this, 146, 78);
        this.BicepR.setRotationPoint(-6.1f, 5.7f, 0.0f);
        this.BicepR.addBox(-4.5f, 0.0f, -5.0f, 9, 14, 10, 0.0f);
        this.setRotateAngle(this.BicepR, 0.06632251f, 0.0f, 0.08726646f);
        this.HeadExtra2_1 = new ModelRenderer((ModelBase)this, 43, 9);
        this.HeadExtra2_1.mirror = true;
        this.HeadExtra2_1.setRotationPoint(3.5f, -0.4f, 0.0f);
        this.HeadExtra2_1.addBox(0.1f, -0.9f, -1.5f, 4, 2, 3, 0.0f);
        this.setRotateAngle(this.HeadExtra2_1, (float)(-Math.PI) / 90, 0.0f, (float)Math.PI / 90);
        this.Body3 = new ModelRenderer((ModelBase)this, 4, 106);
        this.Body3.setRotationPoint(0.0f, 8.0f, 1.2f);
        this.Body3.addBox(-9.0f, -3.0f, -6.4f, 18, 11, 12, 0.0f);
        this.HeadExtra3 = new ModelRenderer((ModelBase)this, 43, 15);
        this.HeadExtra3.setRotationPoint(-4.0f, 0.1f, 0.0f);
        this.HeadExtra3.addBox(-4.2f, -0.8f, -2.0f, 4, 2, 4, 0.0f);
        this.setRotateAngle(this.HeadExtra3, -0.05235988f, 0.0f, 0.0f);
        this.LegL3 = new ModelRenderer((ModelBase)this, 49, 157);
        this.LegL3.mirror = true;
        this.LegL3.setRotationPoint(0.0f, 6.5f, 0.9f);
        this.LegL3.addBox(-6.0f, -4.8f, -5.1f, 12, 11, 10, 0.0f);
        this.ForeArmR = new ModelRenderer((ModelBase)this, 149, 105);
        this.ForeArmR.setRotationPoint(0.0f, 13.8f, 0.0f);
        this.ForeArmR.addBox(-5.0f, -0.5f, -4.2f, 10, 18, 10, 0.0f);
        this.setRotateAngle(this.ForeArmR, -0.14660765f, 0.0f, -0.05235988f);
        this.ShoulderL = new ModelRenderer((ModelBase)this, 144, 54);
        this.ShoulderL.mirror = true;
        this.ShoulderL.setRotationPoint(12.3f, -54.5f, 4.0f);
        this.ShoulderL.addBox(0.1f, -3.6f, -5.5f, 11, 10, 11, 0.0f);
        this.HeadExtra1_1 = new ModelRenderer((ModelBase)this, 43, 1);
        this.HeadExtra1_1.mirror = true;
        this.HeadExtra1_1.setRotationPoint(4.6f, -6.0f, -0.5f);
        this.HeadExtra1_1.addBox(0.0f, -1.5f, -2.0f, 4, 3, 4, 0.0f);
        this.setRotateAngle(this.HeadExtra1_1, 0.0f, 0.0f, 0.19198622f);
        this.FootR = new ModelRenderer((ModelBase)this, 89, 193);
        this.FootR.setRotationPoint(0.0f, 15.7f, -0.3f);
        this.FootR.addBox(-5.5f, 0.1f, -9.2f, 11, 5, 14, 0.0f);
        this.setRotateAngle(this.FootR, -0.05235988f, 0.0f, (float)(-Math.PI) / 180);
        this.Neck1 = new ModelRenderer((ModelBase)this, 0, 27);
        this.Neck1.setRotationPoint(0.0f, -1.9f, 5.3f);
        this.Neck1.addBox(-11.0f, -1.1f, -5.1f, 22, 3, 7, 0.0f);
        this.FootL = new ModelRenderer((ModelBase)this, 89, 193);
        this.FootL.mirror = true;
        this.FootL.setRotationPoint(0.0f, 15.7f, -0.3f);
        this.FootL.addBox(-5.5f, 0.1f, -9.2f, 11, 5, 14, 0.0f);
        this.setRotateAngle(this.FootL, -0.05235988f, 0.0f, (float)Math.PI / 180);
        this.LegL2 = new ModelRenderer((ModelBase)this, 94, 157);
        this.LegL2.mirror = true;
        this.LegL2.setRotationPoint(-0.1f, 20.0f, -0.8f);
        this.LegL2.addBox(-5.0f, 0.0f, -5.0f, 10, 24, 10, 0.0f);
        this.setRotateAngle(this.LegL2, 0.12217305f, 0.0f, (float)Math.PI / 180);
        this.Neck3 = new ModelRenderer((ModelBase)this, 100, 26);
        this.Neck3.setRotationPoint(0.0f, 0.0f, -1.0f);
        this.Neck3.addBox(-4.5f, -1.5f, -4.4f, 9, 4, 7, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 42);
        this.Body1.setRotationPoint(0.0f, -58.0f, 0.0f);
        this.Body1.addBox(-13.0f, 0.0f, -2.0f, 26, 16, 13, 0.0f);
        this.LegR2 = new ModelRenderer((ModelBase)this, 94, 157);
        this.LegR2.setRotationPoint(-0.1f, 20.0f, -0.8f);
        this.LegR2.addBox(-5.0f, 0.0f, -5.0f, 10, 24, 10, 0.0f);
        this.setRotateAngle(this.LegR2, 0.12217305f, 0.0f, (float)(-Math.PI) / 180);
        this.LegL1 = new ModelRenderer((ModelBase)this, 93, 122);
        this.LegL1.mirror = true;
        this.LegL1.setRotationPoint(6.0f, -23.0f, 2.7f);
        this.LegL1.addBox(-5.5f, 0.0f, -6.0f, 11, 20, 12, 0.0f);
        this.setRotateAngle(this.LegL1, -0.06981317f, 0.0f, (float)(-Math.PI) / 90);
        this.Chest = new ModelRenderer((ModelBase)this, 68, 73);
        this.Chest.setRotationPoint(0.0f, 6.2f, -1.7f);
        this.Chest.addBox(-10.0f, -3.7f, -3.5f, 20, 8, 4, 0.0f);
        this.BicepL = new ModelRenderer((ModelBase)this, 146, 78);
        this.BicepL.mirror = true;
        this.BicepL.setRotationPoint(6.1f, 5.7f, 0.0f);
        this.BicepL.addBox(-4.5f, 0.0f, -5.0f, 9, 14, 10, 0.0f);
        this.setRotateAngle(this.BicepL, 0.06632251f, 0.0f, -0.08726646f);
        this.HeadExtra2 = new ModelRenderer((ModelBase)this, 43, 9);
        this.HeadExtra2.setRotationPoint(-3.5f, -0.4f, 0.0f);
        this.HeadExtra2.addBox(-4.1f, -0.9f, -1.5f, 4, 2, 3, 0.0f);
        this.setRotateAngle(this.HeadExtra2, (float)(-Math.PI) / 90, 0.0f, (float)(-Math.PI) / 90);
        this.ForeArmL = new ModelRenderer((ModelBase)this, 149, 105);
        this.ForeArmL.mirror = true;
        this.ForeArmL.setRotationPoint(0.0f, 13.8f, 0.0f);
        this.ForeArmL.addBox(-4.5f, -0.5f, -4.2f, 10, 18, 10, 0.0f);
        this.setRotateAngle(this.ForeArmL, -0.14660765f, 0.0f, 0.05235988f);
        this.Head1 = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head1.setRotationPoint(0.0f, -63.2f, 2.7f);
        this.Head1.addBox(-5.0f, -9.0f, -6.0f, 10, 11, 10, 0.0f);
        this.Abs = new ModelRenderer((ModelBase)this, 76, 88);
        this.Abs.setRotationPoint(0.0f, 0.0f, -5.7f);
        this.Abs.addBox(-6.0f, -2.7f, -0.5f, 12, 11, 1, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 1, 73);
        this.Body2.setRotationPoint(0.0f, 13.0f, 1.2f);
        this.Body2.addBox(-11.0f, -11.9f, -5.5f, 22, 17, 14, 0.0f);
        this.LegR1 = new ModelRenderer((ModelBase)this, 93, 122);
        this.LegR1.setRotationPoint(-6.0f, -23.0f, 2.7f);
        this.LegR1.addBox(-5.5f, 0.0f, -6.0f, 11, 20, 12, 0.0f);
        this.setRotateAngle(this.LegR1, -0.06981317f, 0.0f, (float)Math.PI / 90);
        this.LegR3 = new ModelRenderer((ModelBase)this, 49, 157);
        this.LegR3.setRotationPoint(0.0f, 6.5f, 0.9f);
        this.LegR3.addBox(-6.0f, -4.8f, -5.1f, 12, 11, 10, 0.0f);
        this.HeadExtra3_1 = new ModelRenderer((ModelBase)this, 43, 15);
        this.HeadExtra3_1.mirror = true;
        this.HeadExtra3_1.setRotationPoint(4.0f, 0.1f, 0.0f);
        this.HeadExtra3_1.addBox(0.2f, -0.8f, -2.0f, 4, 2, 4, 0.0f);
        this.setRotateAngle(this.HeadExtra3_1, -0.05235988f, 0.0f, 0.0f);
        this.Head1.addChild(this.HeadExtra1);
        this.Neck1.addChild(this.Neck2);
        this.Body3.addChild(this.Body4);
        this.ShoulderR.addChild(this.BicepR);
        this.HeadExtra1_1.addChild(this.HeadExtra2_1);
        this.Body2.addChild(this.Body3);
        this.HeadExtra2.addChild(this.HeadExtra3);
        this.LegL2.addChild(this.LegL3);
        this.BicepR.addChild(this.ForeArmR);
        this.Head1.addChild(this.HeadExtra1_1);
        this.LegR3.addChild(this.FootR);
        this.Body1.addChild(this.Neck1);
        this.LegL3.addChild(this.FootL);
        this.LegL1.addChild(this.LegL2);
        this.Neck2.addChild(this.Neck3);
        this.LegR1.addChild(this.LegR2);
        this.Body1.addChild(this.Chest);
        this.ShoulderL.addChild(this.BicepL);
        this.HeadExtra1.addChild(this.HeadExtra2);
        this.BicepL.addChild(this.ForeArmL);
        this.Body2.addChild(this.Abs);
        this.Body1.addChild(this.Body2);
        this.LegR2.addChild(this.LegR3);
        this.HeadExtra2_1.addChild(this.HeadExtra3_1);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float F = 2.5f;
        JGRenderHelper.modelScalePositionHelper((float)2.5f);
        this.LegL1.render(f5);
        this.Head1.render(f5);
        this.ShoulderL.render(f5);
        this.ShoulderR.render(f5);
        this.Body1.render(f5);
        this.LegR1.render(f5);
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
        this.Head1.rotateAngleY = n4 / (r2 / (float)Math.PI);
        this.Head1.rotateAngleX = n5 / (r2 / (float)Math.PI);
        float ex = par7Entity.ticksExisted;
        float r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        float r4 = MathHelper.cos((float)(ex / 8.0f)) / 5.0f + 0.1f;
        r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        r4 = MathHelper.cos((float)(ex / 8.0f)) / 3.0f - 0.2f;
        this.LegR1.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ShoulderR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ShoulderL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegR1.rotateAngleY = 0.0f;
        this.LegL1.rotateAngleY = 0.0f;
        this.ShoulderR.rotateAngleY = 0.0f;
        this.ShoulderL.rotateAngleY = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

