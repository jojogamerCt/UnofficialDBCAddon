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
package JinRyuu.DragonBC.common.Npcs.dbtournament;

import JinRyuu.JRMCore.client.JGRenderHelper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBacterian
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR1;
    public ModelRenderer ArmL1;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer HairSideR;
    public ModelRenderer HairSideL;
    public ModelRenderer hair;
    public ModelRenderer HairBack1;
    public ModelRenderer Hair1;
    public ModelRenderer Hair2;
    public ModelRenderer Hair3;
    public ModelRenderer HairBack2;
    public ModelRenderer Body2;
    public ModelRenderer Chest;
    public ModelRenderer Body3;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmL2;

    public ModelBacterian() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 16);
        this.Body1.setRotationPoint(0.0f, -6.5f, 0.0f);
        this.Body1.addBox(-8.0f, 0.0f, -2.4f, 16, 7, 9, 0.0f);
        this.hair = new ModelRenderer((ModelBase)this, 0, 0);
        this.hair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.hair.addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 90, 19);
        this.ArmR2.setRotationPoint(-0.6f, 7.9f, -0.3f);
        this.ArmR2.addBox(-3.5f, -0.5f, -2.5f, 6, 10, 6, 0.0f);
        this.setRotateAngle(this.ArmR2, -0.4098033f, 0.0f, -0.08726646f);
        this.ArmR1 = new ModelRenderer((ModelBase)this, 92, 3);
        this.ArmR1.setRotationPoint(-8.2f, -4.3f, 2.0f);
        this.ArmR1.addBox(-3.5f, -2.0f, -2.5f, 5, 10, 5, 0.0f);
        this.setRotateAngle(this.ArmR1, 0.0f, 0.0f, 0.38397244f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 90, 19);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.8f, 7.9f, -0.3f);
        this.ArmL2.addBox(-2.8f, -0.5f, -2.5f, 6, 10, 6, 0.0f);
        this.setRotateAngle(this.ArmL2, -0.4098033f, 0.0f, 0.08726646f);
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 52);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-8.0f, 16.0f, -3.2f, 16, 3, 9, 0.0f);
        this.HairBack1 = new ModelRenderer((ModelBase)this, 44, 0);
        this.HairBack1.setRotationPoint(0.0f, -2.7f, 2.7f);
        this.HairBack1.addBox(-5.0f, 0.0f, -0.5f, 10, 4, 2, 0.0f);
        this.setRotateAngle(this.HairBack1, 0.62587506f, 0.0f, 0.0f);
        this.Hair1 = new ModelRenderer((ModelBase)this, 37, 1);
        this.Hair1.setRotationPoint(0.6f, -6.5f, -3.4f);
        this.Hair1.addBox(-0.5f, -2.6f, -0.4f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.Hair1, 2.4130921f, 0.307527f, 0.18203785f);
        this.HairSideR = new ModelRenderer((ModelBase)this, 37, 0);
        this.HairSideR.setRotationPoint(-3.4f, -1.7f, -2.1f);
        this.HairSideR.addBox(-1.2f, -0.4f, 0.0f, 2, 4, 1, 0.0f);
        this.setRotateAngle(this.HairSideR, -0.6981317f, 0.17453292f, 0.31869712f);
        this.Hair2 = new ModelRenderer((ModelBase)this, 37, 1);
        this.Hair2.setRotationPoint(-3.5f, -6.6f, -3.9f);
        this.Hair2.addBox(-1.0f, -2.6f, -0.8f, 2, 3, 1, 0.0f);
        this.setRotateAngle(this.Hair2, 2.5953045f, 0.091106184f, 0.18203785f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 32);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-9.0f, 7.0f, -4.1f, 18, 9, 11, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 52, 23);
        this.Chest.setRotationPoint(0.0f, 3.7f, -1.7f);
        this.Chest.addBox(-7.0f, -2.1f, -1.4f, 14, 5, 2, 0.0f);
        this.setRotateAngle(this.Chest, -0.091106184f, 0.0f, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 91, 43);
        this.LegR.setRotationPoint(-4.8f, 11.0f, 1.0f);
        this.LegR.addBox(-3.5f, 0.0f, -3.5f, 7, 13, 7, 0.0f);
        this.HairBack2 = new ModelRenderer((ModelBase)this, 43, 7);
        this.HairBack2.setRotationPoint(0.0f, 3.7f, 0.9f);
        this.HairBack2.addBox(-4.0f, 0.0f, -0.5f, 8, 4, 1, 0.0f);
        this.setRotateAngle(this.HairBack2, -0.48223448f, 0.0f, 0.0f);
        this.HairSideL = new ModelRenderer((ModelBase)this, 37, 0);
        this.HairSideL.mirror = true;
        this.HairSideL.setRotationPoint(3.6f, -1.8f, -2.1f);
        this.HairSideL.addBox(-1.1f, -0.2f, 0.0f, 2, 4, 1, 0.0f);
        this.setRotateAngle(this.HairSideL, -0.6981317f, -0.17453292f, -0.31869712f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -6.2f, 0.9f);
        this.Head.addBox(-4.5f, -7.2f, -4.0f, 9, 7, 8, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 91, 43);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(4.8f, 11.0f, 1.0f);
        this.LegL.addBox(-3.5f, 0.0f, -3.5f, 7, 13, 7, 0.0f);
        this.ArmL1 = new ModelRenderer((ModelBase)this, 92, 3);
        this.ArmL1.mirror = true;
        this.ArmL1.setRotationPoint(8.2f, -4.3f, 2.0f);
        this.ArmL1.addBox(-1.5f, -2.0f, -2.5f, 5, 10, 5, 0.0f);
        this.setRotateAngle(this.ArmL1, 0.0f, 0.0f, -0.38397244f);
        this.Hair3 = new ModelRenderer((ModelBase)this, 37, 1);
        this.Hair3.setRotationPoint(3.7f, -6.6f, -3.9f);
        this.Hair3.addBox(-0.5f, -2.6f, -0.4f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.Hair3, 2.7317894f, -0.091106184f, -0.18203785f);
        this.Head.addChild(this.hair);
        this.ArmR1.addChild(this.ArmR2);
        this.ArmL1.addChild(this.ArmL2);
        this.Body2.addChild(this.Body3);
        this.hair.addChild(this.HairBack1);
        this.hair.addChild(this.Hair1);
        this.Head.addChild(this.HairSideR);
        this.hair.addChild(this.Hair2);
        this.Body1.addChild(this.Body2);
        this.Body1.addChild(this.Chest);
        this.HairBack1.addChild(this.HairBack2);
        this.Head.addChild(this.HairSideL);
        this.hair.addChild(this.Hair3);
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
    }
}

