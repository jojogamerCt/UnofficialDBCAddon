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

public class ModelJackieChun2
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer Hair1;
    public ModelRenderer Hair2;
    public ModelRenderer Beard;
    public ModelRenderer Beard2;
    public ModelRenderer Body2;
    public ModelRenderer Chest;
    public ModelRenderer Body3;
    public ModelRenderer ArmR2;
    public ModelRenderer ArmR3;
    public ModelRenderer ArmL2;
    public ModelRenderer ArmL3;
    public ModelRenderer FeetL;
    public ModelRenderer FeetR;

    public ModelJackieChun2() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -2.7f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, -0.7f);
        this.ArmL = new ModelRenderer((ModelBase)this, 62, 17);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(6.7f, -2.2f, 0.5f);
        this.ArmL.addBox(-1.5f, -2.0f, -2.5f, 6, 4, 5, 0.0f);
        this.ArmL3 = new ModelRenderer((ModelBase)this, 61, 39);
        this.ArmL3.mirror = true;
        this.ArmL3.setRotationPoint(1.4f, 6.4f, -0.8f);
        this.ArmL3.addBox(-2.5f, 0.0f, -1.9f, 5, 6, 5, 0.0f);
        this.setRotateAngle(this.ArmL3, -0.18203785f, 0.0f, 0.0f);
        this.ArmR = new ModelRenderer((ModelBase)this, 62, 17);
        this.ArmR.setRotationPoint(-6.7f, -2.2f, 0.5f);
        this.ArmR.addBox(-4.5f, -2.0f, -2.5f, 6, 4, 5, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 62, 27);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-4.1f, 1.5f, -2.7f, 5, 5, 5, 0.0f);
        this.Hair1 = new ModelRenderer((ModelBase)this, 45, 1);
        this.Hair1.setRotationPoint(0.0f, -5.3f, 2.7f);
        this.Hair1.addBox(-3.5f, -2.5f, -2.1f, 7, 4, 3, 0.0f);
        this.FeetL = new ModelRenderer((ModelBase)this, 34, 50);
        this.FeetL.mirror = true;
        this.FeetL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FeetL.addBox(-2.0f, 12.0f, -3.3f, 4, 2, 5, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 33, 32);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.5f, 10.0f, 0.0f);
        this.LegL.addBox(-2.5f, 0.0f, -2.5f, 5, 12, 5, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 62, 27);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL2.addBox(-0.9f, 1.5f, -2.7f, 5, 5, 5, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 34, 16);
        this.Chest.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Chest.addBox(-5.0f, 1.0f, -2.5f, 10, 4, 1, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 0, 17);
        this.Body.setRotationPoint(0.0f, -3.5f, 0.0f);
        this.Body.addBox(-6.0f, 0.0f, -1.9f, 12, 7, 5, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 0, 42);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-5.0f, 9.5f, -2.4f, 10, 4, 5, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 33, 32);
        this.LegR.setRotationPoint(-2.5f, 10.0f, 0.0f);
        this.LegR.addBox(-2.5f, 0.0f, -2.5f, 5, 12, 5, 0.0f);
        this.Beard = new ModelRenderer((ModelBase)this, 27, 2);
        this.Beard.setRotationPoint(0.0f, -2.0f, -3.4f);
        this.Beard.addBox(-3.0f, -1.1f, 0.0f, 6, 4, 0, 0.0f);
        this.Beard2 = new ModelRenderer((ModelBase)this, 33, 9);
        this.Beard2.setRotationPoint(0.0f, 0.7f, 0.15f);
        this.Beard2.addBox(-2.0f, -0.6f, -0.1f, 4, 4, 0, 0.0f);
        this.Hair2 = new ModelRenderer((ModelBase)this, 66, 1);
        this.Hair2.setRotationPoint(0.0f, -6.0f, 0.0f);
        this.Hair2.addBox(-2.0f, -2.7f, -3.6f, 4, 3, 5, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 0, 31);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-4.5f, 5.0f, -2.0f, 9, 5, 4, 0.0f);
        this.ArmR3 = new ModelRenderer((ModelBase)this, 61, 39);
        this.ArmR3.setRotationPoint(-1.4f, 6.4f, -0.8f);
        this.ArmR3.addBox(-2.5f, 0.0f, -1.9f, 5, 6, 5, 0.0f);
        this.setRotateAngle(this.ArmR3, -0.22759093f, 0.0f, 0.0f);
        this.FeetR = new ModelRenderer((ModelBase)this, 34, 50);
        this.FeetR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.FeetR.addBox(-2.0f, 12.0f, -3.3f, 4, 2, 5, 0.0f);
        this.ArmL2.addChild(this.ArmL3);
        this.ArmR.addChild(this.ArmR2);
        this.Head.addChild(this.Hair1);
        this.LegL.addChild(this.FeetL);
        this.ArmL.addChild(this.ArmL2);
        this.Body.addChild(this.Chest);
        this.Body2.addChild(this.Body3);
        this.Head.addChild(this.Beard);
        this.Beard.addChild(this.Beard2);
        this.Head.addChild(this.Hair2);
        this.Body.addChild(this.Body2);
        this.ArmR2.addChild(this.ArmR3);
        this.LegR.addChild(this.FeetR);
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

