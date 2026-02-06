/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package JinRyuu.DragonBC.common.Npcs.dbsbroly;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDBSBrolyNormal
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer Body1;
    public ModelRenderer ArmR;
    public ModelRenderer ArmL;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer HairBack1;
    public ModelRenderer Hair;
    public ModelRenderer HairBack2;
    public ModelRenderer Hair1;
    public ModelRenderer Hair2;
    public ModelRenderer Hair3;
    public ModelRenderer Hair4;
    public ModelRenderer Hair5;
    public ModelRenderer Hair6;
    public ModelRenderer Hair7;
    public ModelRenderer Hair8;
    public ModelRenderer Hair9;
    public ModelRenderer Hair11;
    public ModelRenderer Hair12;
    public ModelRenderer Hair13;
    public ModelRenderer Hair14;
    public ModelRenderer Hair15;
    public ModelRenderer Hair16;
    public ModelRenderer Body2;
    public ModelRenderer Chest;
    public ModelRenderer Body3;
    public ModelRenderer Cloth;
    public ModelRenderer ArmR2;
    public ModelRenderer ShoulderR;
    public ModelRenderer ArmL2;
    public ModelRenderer ShoulderL;

    public ModelDBSBrolyNormal() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Hair9 = new ModelRenderer((ModelBase)this, 39, 0);
        this.Hair9.setRotationPoint(-2.7f, -3.0f, 1.5f);
        this.Hair9.addBox(-1.1f, 0.0f, -0.7f, 2, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair9, 0.27314404f, 0.0f, 0.8196066f);
        this.Hair15 = new ModelRenderer((ModelBase)this, 37, 6);
        this.Hair15.setRotationPoint(0.8f, -6.6f, 0.7f);
        this.Hair15.addBox(-4.7f, -1.6f, -0.8f, 4, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair15, -0.2565634f, 0.5522222f, 0.043284167f);
        this.Hair13 = new ModelRenderer((ModelBase)this, 64, 7);
        this.Hair13.setRotationPoint(-0.9f, -6.2f, -3.9f);
        this.Hair13.addBox(-1.0f, -3.4f, -0.8f, 2, 4, 1, 0.0f);
        this.setRotateAngle(this.Hair13, 2.438225f, 0.27314404f, -0.045553092f);
        this.Chest = new ModelRenderer((ModelBase)this, 52, 19);
        this.Chest.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Chest.addBox(-4.0f, 1.0f, -2.5f, 8, 4, 1, 0.0f);
        this.Hair6 = new ModelRenderer((ModelBase)this, 75, 0);
        this.Hair6.setRotationPoint(-1.3f, -6.6f, -1.4f);
        this.Hair6.addBox(-1.1f, -3.4f, -1.9f, 3, 4, 4, 0.0f);
        this.setRotateAngle(this.Hair6, -0.091106184f, 0.31939524f, -0.7285004f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 43);
        this.LegR.setRotationPoint(-2.4f, 10.6f, 0.0f);
        this.LegR.addBox(-2.5f, 0.0f, -2.5f, 5, 14, 5, -0.1f);
        this.ArmL = new ModelRenderer((ModelBase)this, 0, 17);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.8f, -1.0f, 0.5f);
        this.ArmL.addBox(-1.0f, -2.0f, -2.5f, 5, 4, 5, -0.1f);
        this.Hair11 = new ModelRenderer((ModelBase)this, 50, 8);
        this.Hair11.setRotationPoint(2.8f, -7.3f, -2.3f);
        this.Hair11.addBox(-1.0f, -0.7f, -0.8f, 3, 2, 3, 0.0f);
        this.setRotateAngle(this.Hair11, 0.0f, 0.0f, 0.0991347f);
        this.ShoulderL = new ModelRenderer((ModelBase)this, 74, 25);
        this.ShoulderL.mirror = true;
        this.ShoulderL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderL.addBox(-1.0f, -2.0f, -2.5f, 6, 4, 5, 0.0f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 43);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.4f, 10.6f, 0.0f);
        this.LegL.addBox(-2.5f, 0.0f, -2.5f, 5, 14, 5, -0.1f);
        this.Hair5 = new ModelRenderer((ModelBase)this, 39, 0);
        this.Hair5.setRotationPoint(3.4f, -5.6f, 0.2f);
        this.Hair5.addBox(-1.0f, -0.2f, -0.8f, 2, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair5, 0.0f, 0.0f, -0.7876671f);
        this.Hair8 = new ModelRenderer((ModelBase)this, 39, 0);
        this.Hair8.setRotationPoint(3.2f, -3.0f, 1.5f);
        this.Hair8.addBox(-1.0f, 0.0f, -0.8f, 2, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair8, 0.17453292f, 0.0f, -0.8651597f);
        this.Hair2 = new ModelRenderer((ModelBase)this, 37, 6);
        this.Hair2.setRotationPoint(-1.7f, -6.5f, -0.5f);
        this.Hair2.addBox(-4.7f, -1.6f, -0.8f, 4, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair2, 0.0f, -0.47403142f, 0.043284167f);
        this.ArmR = new ModelRenderer((ModelBase)this, 0, 17);
        this.ArmR.setRotationPoint(-5.8f, -1.0f, 0.5f);
        this.ArmR.addBox(-4.0f, -2.0f, -2.5f, 5, 4, 5, -0.1f);
        this.HairBack2 = new ModelRenderer((ModelBase)this, 55, 36);
        this.HairBack2.setRotationPoint(0.0f, 2.9f, 0.6f);
        this.HairBack2.addBox(-2.9f, 0.0f, -0.5f, 6, 2, 1, 0.0f);
        this.setRotateAngle(this.HairBack2, -0.15236725f, 0.0f, 0.0f);
        this.Hair7 = new ModelRenderer((ModelBase)this, 32, 0);
        this.Hair7.setRotationPoint(1.3f, -7.3f, 1.5f);
        this.Hair7.addBox(-0.5f, -3.3f, -0.8f, 1, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair7, 0.0f, -0.25254914f, 0.6920887f);
        this.Hair12 = new ModelRenderer((ModelBase)this, 27, 1);
        this.Hair12.setRotationPoint(1.9f, -5.7f, -3.6f);
        this.Hair12.addBox(-0.7f, -2.8f, -0.3f, 1, 3, 1, 0.0f);
        this.setRotateAngle(this.Hair12, 2.7317894f, -0.31869712f, -0.31869712f);
        this.Hair1 = new ModelRenderer((ModelBase)this, 62, 1);
        this.Hair1.setRotationPoint(-3.3f, -5.9f, -3.4f);
        this.Hair1.addBox(-1.0f, -0.4f, -3.6f, 2, 1, 4, 0.0f);
        this.setRotateAngle(this.Hair1, 0.84788096f, 0.378911f, 0.17139134f);
        this.Body2 = new ModelRenderer((ModelBase)this, 23, 31);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-4.0f, 4.7f, -2.0f, 8, 5, 4, 0.0f);
        this.Hair4 = new ModelRenderer((ModelBase)this, 39, 0);
        this.Hair4.setRotationPoint(2.3f, -6.9f, 1.9f);
        this.Hair4.addBox(-1.0f, -2.6f, -0.8f, 2, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair4, -0.22965898f, -0.23751295f, 0.93466526f);
        this.Hair = new ModelRenderer((ModelBase)this, 0, 0);
        this.Hair.setRotationPoint(0.0f, -1.2f, 0.0f);
        this.Hair.addBox(-0.5f, -3.0f, 0.0f, 1, 1, 1, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 22, 44);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-5.0f, 9.7f, -2.4f, 10, 4, 5, 0.0f);
        this.ArmL2 = new ModelRenderer((ModelBase)this, 0, 27);
        this.ArmL2.mirror = true;
        this.ArmL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmL2.addBox(-0.6f, 1.8f, -2.0f, 4, 10, 4, 0.0f);
        this.ShoulderR = new ModelRenderer((ModelBase)this, 74, 25);
        this.ShoulderR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderR.addBox(-5.0f, -2.0f, -2.5f, 6, 4, 5, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 0, 27);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-3.4f, 1.8f, -2.0f, 4, 10, 4, 0.0f);
        this.HairBack1 = new ModelRenderer((ModelBase)this, 51, 29);
        this.HairBack1.setRotationPoint(0.0f, -1.8f, 2.8f);
        this.HairBack1.addBox(-4.5f, 0.0f, -0.5f, 9, 3, 2, 0.0f);
        this.setRotateAngle(this.HairBack1, 0.16318828f, -0.013788101f, 0.0f);
        this.Hair14 = new ModelRenderer((ModelBase)this, 64, 7);
        this.Hair14.setRotationPoint(3.6f, -5.8f, -3.9f);
        this.Hair14.addBox(-1.0f, -2.6f, -0.8f, 2, 3, 1, 0.0f);
        this.setRotateAngle(this.Hair14, 2.5057693f, -0.6588618f, 0.045553092f);
        this.Cloth = new ModelRenderer((ModelBase)this, 54, 46);
        this.Cloth.setRotationPoint(0.0f, 12.7f, -0.4f);
        this.Cloth.addBox(-5.0f, 0.0f, -1.0f, 10, 10, 4, 0.0f);
        this.Hair16 = new ModelRenderer((ModelBase)this, 75, 0);
        this.Hair16.setRotationPoint(0.0f, -6.7f, -0.9f);
        this.Hair16.addBox(-1.0f, -3.4f, -1.8f, 3, 4, 4, 0.0f);
        this.setRotateAngle(this.Hair16, -0.091106184f, -0.4886922f, 0.7285004f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -2.8f, 0.0f);
        this.Head.addBox(-4.0f, -8.2f, -4.0f, 8, 8, 8, 0.0f);
        this.Body1 = new ModelRenderer((ModelBase)this, 22, 17);
        this.Body1.setRotationPoint(0.0f, -3.0f, 0.0f);
        this.Body1.addBox(-5.0f, 0.0f, -1.4f, 10, 7, 4, 0.0f);
        this.Hair3 = new ModelRenderer((ModelBase)this, 39, 0);
        this.Hair3.setRotationPoint(-3.2f, -5.6f, -0.2f);
        this.Hair3.addBox(-1.1f, 0.0f, -0.7f, 2, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair3, 0.0f, 0.0f, 0.6953392f);
        this.Hair.addChild(this.Hair9);
        this.Hair.addChild(this.Hair15);
        this.Hair.addChild(this.Hair13);
        this.Body1.addChild(this.Chest);
        this.Hair.addChild(this.Hair6);
        this.Hair.addChild(this.Hair11);
        this.ArmL.addChild(this.ShoulderL);
        this.Hair.addChild(this.Hair5);
        this.Hair.addChild(this.Hair8);
        this.Hair.addChild(this.Hair2);
        this.HairBack1.addChild(this.HairBack2);
        this.Hair.addChild(this.Hair7);
        this.Hair.addChild(this.Hair12);
        this.Hair.addChild(this.Hair1);
        this.Body1.addChild(this.Body2);
        this.Hair.addChild(this.Hair4);
        this.Head.addChild(this.Hair);
        this.Body2.addChild(this.Body3);
        this.ArmL.addChild(this.ArmL2);
        this.ArmR.addChild(this.ShoulderR);
        this.ArmR.addChild(this.ArmR2);
        this.Head.addChild(this.HairBack1);
        this.Hair.addChild(this.Hair14);
        this.Body3.addChild(this.Cloth);
        this.Hair.addChild(this.Hair16);
        this.Hair.addChild(this.Hair3);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Body1.render(f5);
        this.ArmR.render(f5);
        this.ArmL.render(f5);
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
        this.Cloth.rotateAngleX = 0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth.rotateAngleX = 0.15f + this.LegR.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth.rotateAngleX = 0.15f + this.LegL.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        this.Cloth.rotateAngleX = 0.15f + this.LegL.rotateAngleX * (float)(this.LegR.rotateAngleX >= 0.0f ? -1 : 1) * 1.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

