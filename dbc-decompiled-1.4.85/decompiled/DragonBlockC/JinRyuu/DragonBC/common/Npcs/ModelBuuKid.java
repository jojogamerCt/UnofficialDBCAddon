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

public class ModelBuuKid
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegR;
    public ModelRenderer LegL;
    public ModelRenderer Head2;
    public ModelRenderer Head3;
    public ModelRenderer Body2;
    public ModelRenderer Neck;
    public ModelRenderer Chest;
    public ModelRenderer Hip;
    public ModelRenderer FeetR;
    public ModelRenderer FeetL;

    public ModelBuuKid() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ArmR = new ModelRenderer((ModelBase)this, 30, 26);
        this.ArmR.setRotationPoint(-3.8f, 4.8f, 0.4f);
        this.ArmR.addBox(-2.8f, -2.0f, -2.0f, 4, 11, 4, -0.6f);
        this.FeetR = new ModelRenderer((ModelBase)this, 17, 48);
        this.FeetR.mirror = true;
        this.FeetR.setRotationPoint(0.4f, 0.0f, 0.0f);
        this.FeetR.addBox(-1.5f, -0.2f, -1.5f, 3, 11, 3, 0.0f);
        this.FeetL = new ModelRenderer((ModelBase)this, 17, 48);
        this.FeetL.mirror = true;
        this.FeetL.setRotationPoint(-0.4f, 0.0f, 0.0f);
        this.FeetL.addBox(-1.5f, -0.2f, -1.5f, 3, 11, 3, 0.0f);
        this.Chest = new ModelRenderer((ModelBase)this, 24, 21);
        this.Chest.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Chest.addBox(-3.0f, 0.4f, -1.7f, 6, 2, 1, 0.0f);
        this.setRotateAngle(this.Chest, -0.057595864f, 0.0f, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 4, 32);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-2.5f, 1.5f, -1.6f, 5, 6, 3, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 49);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(1.9f, 13.5f, 0.0f);
        this.LegL.addBox(-2.4f, 0.8f, -2.0f, 4, 6, 4, -0.2f);
        this.Head2 = new ModelRenderer((ModelBase)this, 26, 1);
        this.Head2.setRotationPoint(0.0f, -5.5f, -1.9f);
        this.Head2.addBox(-1.0f, -4.0f, -1.1f, 2, 4, 2, 0.0f);
        this.setRotateAngle(this.Head2, -0.5462881f, 0.0f, 0.0f);
        this.Neck = new ModelRenderer((ModelBase)this, 7, 17);
        this.Neck.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Neck.addBox(-2.0f, -0.7f, -1.3f, 4, 2, 3, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 3, 23);
        this.Body.setRotationPoint(0.0f, 3.3f, 0.0f);
        this.Body.addBox(-3.5f, 0.0f, -1.1f, 7, 5, 3, 0.0f);
        this.ArmL = new ModelRenderer((ModelBase)this, 30, 26);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(3.8f, 4.8f, 0.4f);
        this.ArmL.addBox(-1.2f, -2.0f, -2.0f, 4, 11, 4, -0.6f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 49);
        this.LegR.setRotationPoint(-1.9f, 13.5f, 0.0f);
        this.LegR.addBox(-1.8f, 0.8f, -2.0f, 4, 6, 4, -0.2f);
        this.Head3 = new ModelRenderer((ModelBase)this, 36, 0);
        this.Head3.setRotationPoint(0.0f, -3.8f, -0.2f);
        this.Head3.addBox(-0.5f, -3.6f, -0.7f, 1, 4, 1, 0.0f);
        this.setRotateAngle(this.Head3, -0.7285004f, 0.0f, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 2.9f, 0.1f);
        this.Head.addBox(-4.0f, -7.2f, -4.0f, 8, 8, 8, -0.7f);
        this.Hip = new ModelRenderer((ModelBase)this, 3, 42);
        this.Hip.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Hip.addBox(-3.0f, 7.0f, -1.5f, 6, 3, 3, 0.0f);
        this.LegR.addChild(this.FeetR);
        this.LegL.addChild(this.FeetL);
        this.Body.addChild(this.Chest);
        this.Body.addChild(this.Body2);
        this.Head.addChild(this.Head2);
        this.Body.addChild(this.Neck);
        this.Head2.addChild(this.Head3);
        this.Body2.addChild(this.Hip);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.LegL.render(f5);
        this.Head.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.Body.render(f5);
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
        this.LegL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.ArmR.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

