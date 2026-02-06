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

public class ModelPaparoni
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Hair1;
    public ModelRenderer EarR;
    public ModelRenderer EarL;
    public ModelRenderer Beard;
    public ModelRenderer Hair2;
    public ModelRenderer HairR1;
    public ModelRenderer HairL1;
    public ModelRenderer HairR2;
    public ModelRenderer HairR3;
    public ModelRenderer HairL2;
    public ModelRenderer HairL3;
    public ModelRenderer Body3;
    public ModelRenderer Body2;
    public ModelRenderer Body4;
    public ModelRenderer Neckerchief;

    public ModelPaparoni() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Body1 = new ModelRenderer((ModelBase)this, 0, 17);
        this.Body1.setRotationPoint(0.0f, -2.0f, 0.0f);
        this.Body1.addBox(-4.0f, 0.0f, -2.0f, 8, 7, 4, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 1, 29);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-3.5f, 7.0f, -1.6f, 7, 3, 3, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 26, 36);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(4.6f, -0.5f, 0.0f);
        this.ArmL.addBox(-1.0f, -1.8f, -2.0f, 4, 14, 4, -0.3f);
        this.HairR2 = new ModelRenderer((ModelBase)this, 56, 13);
        this.HairR2.setRotationPoint(0.0f, 2.8f, 0.0f);
        this.HairR2.addBox(-0.7f, -0.3f, -0.8f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.HairR2, -0.13665928f, 0.0f, 0.045553092f);
        this.ArmR = new ModelRenderer((ModelBase)this, 26, 36);
        this.ArmR.setRotationPoint(-4.6f, -0.5f, 0.0f);
        this.ArmR.addBox(-3.0f, -1.8f, -2.0f, 4, 14, 4, -0.3f);
        this.HairR3 = new ModelRenderer((ModelBase)this, 57, 18);
        this.HairR3.setRotationPoint(0.0f, 1.9f, 0.0f);
        this.HairR3.addBox(-0.6f, -0.3f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.HairR3, -0.13665928f, 0.0f, 0.045553092f);
        this.LegL = new ModelRenderer((ModelBase)this, 1, 45);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.0f, 11.0f, 0.0f);
        this.LegL.addBox(-2.0f, 0.0f, -2.0f, 4, 13, 4, 0.0f);
        this.HairL3 = new ModelRenderer((ModelBase)this, 57, 18);
        this.HairL3.setRotationPoint(0.0f, 1.9f, 0.0f);
        this.HairL3.addBox(-0.6f, -0.3f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.HairL3, -0.13665928f, 0.0f, -0.045553092f);
        this.HairL1 = new ModelRenderer((ModelBase)this, 57, 8);
        this.HairL1.setRotationPoint(4.2f, 2.8f, -0.7f);
        this.HairL1.addBox(-0.6f, -0.3f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.HairL1, -0.13665928f, 0.0f, -0.045553092f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -2.0f, 0.0f);
        this.Head.addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.Hair2 = new ModelRenderer((ModelBase)this, 50, 1);
        this.Hair2.setRotationPoint(0.0f, 0.0f, -3.9f);
        this.Hair2.addBox(-1.5f, -1.4f, -2.9f, 3, 3, 3, 0.0f);
        this.HairL2 = new ModelRenderer((ModelBase)this, 56, 13);
        this.HairL2.setRotationPoint(0.0f, 2.8f, 0.0f);
        this.HairL2.addBox(-0.5f, -0.3f, -0.8f, 1, 2, 2, 0.0f);
        this.setRotateAngle(this.HairL2, -0.13665928f, 0.0f, -0.045553092f);
        this.EarL = new ModelRenderer((ModelBase)this, 27, 3);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(3.6f, -3.5f, -0.5f);
        this.EarL.addBox(-0.5f, -1.5f, 0.0f, 5, 3, 0, 0.0f);
        this.setRotateAngle(this.EarL, 0.0f, -0.43633232f, -0.2268928f);
        this.Neckerchief = new ModelRenderer((ModelBase)this, 28, 29);
        this.Neckerchief.setRotationPoint(0.0f, 0.0f, -1.4f);
        this.Neckerchief.addBox(-1.5f, -0.1f, -0.2f, 3, 5, 0, 0.0f);
        this.setRotateAngle(this.Neckerchief, -0.06981317f, 0.0f, 0.0f);
        this.Beard = new ModelRenderer((ModelBase)this, 33, 12);
        this.Beard.setRotationPoint(0.0f, -0.7f, -4.1f);
        this.Beard.addBox(-1.5f, 0.0f, 0.0f, 3, 2, 0, 0.0f);
        this.setRotateAngle(this.Beard, -0.02094395f, 0.0f, 0.0f);
        this.EarR = new ModelRenderer((ModelBase)this, 27, 3);
        this.EarR.setRotationPoint(-3.6f, -3.5f, -0.5f);
        this.EarR.addBox(-4.4f, -1.5f, 0.0f, 5, 3, 0, 0.0f);
        this.setRotateAngle(this.EarR, 0.0f, 0.43633232f, 0.2268928f);
        this.Hair1 = new ModelRenderer((ModelBase)this, 33, 1);
        this.Hair1.setRotationPoint(0.0f, -8.0f, 0.0f);
        this.Hair1.addBox(-2.0f, -2.8f, -4.0f, 4, 3, 7, 0.0f);
        this.HairR1 = new ModelRenderer((ModelBase)this, 57, 8);
        this.HairR1.setRotationPoint(-4.0f, 2.8f, -0.7f);
        this.HairR1.addBox(-0.6f, -0.3f, -0.5f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.HairR1, -0.13665928f, 0.0f, 0.045553092f);
        this.Body2 = new ModelRenderer((ModelBase)this, 25, 18);
        this.Body2.setRotationPoint(0.0f, 0.0f, -0.2f);
        this.Body2.addBox(-3.5f, 0.0f, -1.5f, 7, 7, 3, 0.0f);
        this.LegR = new ModelRenderer((ModelBase)this, 1, 45);
        this.LegR.setRotationPoint(-2.0f, 11.0f, 0.0f);
        this.LegR.addBox(-2.0f, 0.0f, -2.0f, 4, 13, 4, 0.0f);
        this.Body4 = new ModelRenderer((ModelBase)this, 0, 36);
        this.Body4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body4.addBox(-4.0f, 10.0f, -2.0f, 8, 3, 4, 0.0f);
        this.Body1.addChild(this.Body3);
        this.HairR1.addChild(this.HairR2);
        this.HairR2.addChild(this.HairR3);
        this.HairL2.addChild(this.HairL3);
        this.Hair1.addChild(this.HairL1);
        this.Hair1.addChild(this.Hair2);
        this.HairL1.addChild(this.HairL2);
        this.Head.addChild(this.EarL);
        this.Body2.addChild(this.Neckerchief);
        this.Head.addChild(this.Beard);
        this.Head.addChild(this.EarR);
        this.Head.addChild(this.Hair1);
        this.Hair1.addChild(this.HairR1);
        this.Body1.addChild(this.Body2);
        this.Body3.addChild(this.Body4);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Body1.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.LegL.render(f5);
        this.Head.render(f5);
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
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

