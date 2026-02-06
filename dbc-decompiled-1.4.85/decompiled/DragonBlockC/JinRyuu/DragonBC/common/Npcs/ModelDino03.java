/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelDino03
extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Body_1;
    public ModelRenderer Head;
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer FronRightLeg;
    public ModelRenderer BackLeftLeg;
    public ModelRenderer BackRightLeg;
    public ModelRenderer Tail1;
    public ModelRenderer Mouth;
    public ModelRenderer Head2;
    public ModelRenderer Head3;
    public ModelRenderer Head4;
    public ModelRenderer LHorn;
    public ModelRenderer RHorn;
    public ModelRenderer Horn;
    public ModelRenderer LHorn2;
    public ModelRenderer LHorn4;
    public ModelRenderer RHorn2;
    public ModelRenderer RHorn4;
    public ModelRenderer FrontLeftLeg2;
    public ModelRenderer FrontRightLeg2;
    public ModelRenderer FrontLeftLeg2_1;
    public ModelRenderer FrontRightLeg2_1;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4;
    public ModelRenderer Tail5;
    public ModelRenderer Tail6;
    public ModelRenderer Tail7;

    public ModelDino03() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.FrontLeftLeg2_1 = new ModelRenderer((ModelBase)this, 90, 65);
        this.FrontLeftLeg2_1.mirror = true;
        this.FrontLeftLeg2_1.setRotationPoint(2.5f, 6.9f, -0.1f);
        this.FrontLeftLeg2_1.addBox(-2.5f, 0.1f, -2.5f, 5, 7, 5, 0.0f);
        this.setRotation(this.FrontLeftLeg2_1, 0.4098033f, 0.0f, 0.0f);
        this.Tail1 = new ModelRenderer((ModelBase)this, 0, 61);
        this.Tail1.setRotationPoint(0.0f, 4.1f, 16.4f);
        this.Tail1.addBox(-4.0f, -4.0f, 0.0f, 8, 8, 7, 0.0f);
        this.setRotation(this.Tail1, -0.3642502f, 0.0f, 0.0f);
        this.Body = new ModelRenderer((ModelBase)this, 0, 29);
        this.Body.setRotationPoint(0.0f, 5.4f, -7.0f);
        this.Body.addBox(-6.0f, 0.0f, 0.0f, 12, 10, 18, 0.0f);
        this.Body_1 = new ModelRenderer((ModelBase)this, 43, 25);
        this.Body_1.setRotationPoint(0.0f, 10.4f, 8.4f);
        this.Body_1.addBox(-5.0f, -0.8f, -7.0f, 10, 2, 16, 0.0f);
        this.RHorn4 = new ModelRenderer((ModelBase)this, 48, 18);
        this.RHorn4.setRotationPoint(-0.3f, -3.4f, 0.0f);
        this.RHorn4.addBox(-0.5f, -4.0f, -0.5f, 1, 4, 1, 0.0f);
        this.setRotation(this.RHorn4, 0.0f, 0.0f, 0.31869712f);
        this.Tail3 = new ModelRenderer((ModelBase)this, 0, 100);
        this.Tail3.setRotationPoint(0.0f, 0.0f, 5.8f);
        this.Tail3.addBox(-3.5f, -3.5f, 0.0f, 7, 7, 7, 0.0f);
        this.setRotation(this.Tail3, -0.22759093f, 0.0f, 0.0f);
        this.FrontLeftLeg2 = new ModelRenderer((ModelBase)this, 65, 65);
        this.FrontLeftLeg2.mirror = true;
        this.FrontLeftLeg2.setRotationPoint(2.5f, 4.9f, -0.3f);
        this.FrontLeftLeg2.addBox(-2.5f, 0.1f, -2.5f, 5, 7, 5, 0.0f);
        this.setRotation(this.FrontLeftLeg2, 0.4098033f, 0.0f, 0.0f);
        this.Head3 = new ModelRenderer((ModelBase)this, 70, 0);
        this.Head3.mirror = true;
        this.Head3.setRotationPoint(4.5f, -2.5f, 0.0f);
        this.Head3.addBox(0.0f, -10.0f, -0.5f, 10, 14, 1, 0.0f);
        this.setRotation(this.Head3, -0.22759093f, -0.13665928f, 0.22759093f);
        this.RHorn = new ModelRenderer((ModelBase)this, 26, 18);
        this.RHorn.setRotationPoint(-4.2f, -3.9f, -3.2f);
        this.RHorn.addBox(-1.0f, -4.0f, -1.0f, 2, 4, 2, 0.0f);
        this.setRotation(this.RHorn, 0.0f, 0.0f, -0.68294734f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, 1.0f, -1.0f);
        this.Head.addBox(-5.0f, -4.5f, -6.0f, 10, 9, 7, 0.0f);
        this.Tail2 = new ModelRenderer((ModelBase)this, 0, 80);
        this.Tail2.setRotationPoint(0.0f, 0.0f, 5.8f);
        this.Tail2.addBox(-4.0f, -4.0f, 0.0f, 8, 8, 7, 0.0f);
        this.setRotation(this.Tail2, -0.22759093f, 0.0f, 0.0f);
        this.Head2 = new ModelRenderer((ModelBase)this, 37, 0);
        this.Head2.setRotationPoint(0.0f, -2.2f, -0.4f);
        this.Head2.addBox(-7.0f, -13.0f, 0.0f, 14, 13, 1, 0.0f);
        this.setRotation(this.Head2, -0.18203785f, 0.0f, 0.0f);
        this.FrontRightLeg2_1 = new ModelRenderer((ModelBase)this, 90, 65);
        this.FrontRightLeg2_1.setRotationPoint(-2.5f, 6.9f, -0.1f);
        this.FrontRightLeg2_1.addBox(-2.5f, 0.1f, -2.5f, 5, 7, 5, 0.0f);
        this.setRotation(this.FrontRightLeg2_1, 0.4098033f, 0.0f, 0.0f);
        this.Tail7 = new ModelRenderer((ModelBase)this, 86, 96);
        this.Tail7.setRotationPoint(0.0f, 0.0f, 5.3f);
        this.Tail7.addBox(-2.0f, -2.0f, 0.0f, 4, 4, 7, 0.0f);
        this.setRotation(this.Tail7, 0.13665928f, 0.0f, 0.0f);
        this.RHorn2 = new ModelRenderer((ModelBase)this, 37, 18);
        this.RHorn2.setRotationPoint(-0.3f, -3.4f, 0.0f);
        this.RHorn2.addBox(-1.0f, -4.0f, -1.0f, 2, 4, 2, 0.0f);
        this.setRotation(this.RHorn2, 0.0f, 0.0f, 0.59184116f);
        this.LHorn2 = new ModelRenderer((ModelBase)this, 37, 18);
        this.LHorn2.setRotationPoint(0.3f, -3.4f, 0.0f);
        this.LHorn2.addBox(-1.0f, -4.0f, -1.0f, 2, 4, 2, 0.0f);
        this.setRotation(this.LHorn2, 0.0f, 0.0f, -0.59184116f);
        this.Head4 = new ModelRenderer((ModelBase)this, 70, 0);
        this.Head4.setRotationPoint(-4.5f, -2.5f, 0.0f);
        this.Head4.addBox(-10.0f, -10.0f, -0.5f, 10, 14, 1, 0.0f);
        this.setRotation(this.Head4, -0.22759093f, 0.13665928f, -0.22759093f);
        this.LHorn = new ModelRenderer((ModelBase)this, 26, 18);
        this.LHorn.setRotationPoint(4.2f, -3.9f, -3.2f);
        this.LHorn.addBox(-1.0f, -4.0f, -1.0f, 2, 4, 2, 0.0f);
        this.setRotation(this.LHorn, 0.0f, 0.0f, 0.68294734f);
        this.LHorn4 = new ModelRenderer((ModelBase)this, 48, 18);
        this.LHorn4.setRotationPoint(0.3f, -3.4f, 0.0f);
        this.LHorn4.addBox(-0.5f, -4.0f, -0.5f, 1, 4, 1, 0.0f);
        this.setRotation(this.LHorn4, 0.0f, 0.0f, -0.31869712f);
        this.Tail4 = new ModelRenderer((ModelBase)this, 31, 112);
        this.Tail4.setRotationPoint(0.0f, 0.0f, 5.3f);
        this.Tail4.addBox(-3.5f, -3.5f, 0.0f, 7, 7, 7, 0.0f);
        this.setRotation(this.Tail4, 0.5009095f, 0.0f, 0.0f);
        this.Tail6 = new ModelRenderer((ModelBase)this, 86, 112);
        this.Tail6.setRotationPoint(0.0f, 0.0f, 5.3f);
        this.Tail6.addBox(-3.0f, -3.0f, 0.0f, 6, 6, 7, 0.0f);
        this.setRotation(this.Tail6, 0.13665928f, 0.0f, 0.0f);
        this.Mouth = new ModelRenderer((ModelBase)this, 0, 17);
        this.Mouth.setRotationPoint(0.0f, 1.7f, -5.8f);
        this.Mouth.addBox(-2.5f, -2.5f, -5.0f, 5, 5, 5, 0.0f);
        this.FrontRightLeg2 = new ModelRenderer((ModelBase)this, 65, 65);
        this.FrontRightLeg2.setRotationPoint(-2.5f, 4.9f, -0.3f);
        this.FrontRightLeg2.addBox(-2.5f, 0.1f, -2.5f, 5, 7, 5, 0.0f);
        this.setRotation(this.FrontRightLeg2, 0.4098033f, 0.0f, 0.0f);
        this.FronRightLeg = new ModelRenderer((ModelBase)this, 65, 50);
        this.FronRightLeg.setRotationPoint(-6.0f, 7.4f, 3.3f);
        this.FronRightLeg.addBox(-5.0f, -0.9f, -2.5f, 5, 7, 5, 0.0f);
        this.setRotation(this.FronRightLeg, -0.4098033f, 0.0f, 0.0f);
        this.Horn = new ModelRenderer((ModelBase)this, 60, 18);
        this.Horn.setRotationPoint(0.0f, -2.2f, -3.2f);
        this.Horn.addBox(-1.0f, -3.0f, -1.0f, 2, 3, 2, 0.0f);
        this.setRotation(this.Horn, -0.091106184f, 0.0f, 0.0f);
        this.FrontLeftLeg = new ModelRenderer((ModelBase)this, 65, 50);
        this.FrontLeftLeg.mirror = true;
        this.FrontLeftLeg.setRotationPoint(6.0f, 7.4f, 3.3f);
        this.FrontLeftLeg.addBox(0.0f, -0.9f, -2.5f, 5, 7, 5, 0.0f);
        this.setRotation(this.FrontLeftLeg, -0.4098033f, 0.0f, 0.0f);
        this.BackLeftLeg = new ModelRenderer((ModelBase)this, 90, 50);
        this.BackLeftLeg.mirror = true;
        this.BackLeftLeg.setRotationPoint(6.0f, 5.6f, 14.6f);
        this.BackLeftLeg.addBox(0.0f, -0.9f, -2.5f, 5, 9, 6, 0.0f);
        this.setRotation(this.BackLeftLeg, -0.4098033f, 0.0f, 0.0f);
        this.BackRightLeg = new ModelRenderer((ModelBase)this, 90, 50);
        this.BackRightLeg.setRotationPoint(-6.0f, 5.6f, 14.6f);
        this.BackRightLeg.addBox(-5.0f, -0.9f, -2.5f, 5, 9, 6, 0.0f);
        this.setRotation(this.BackRightLeg, -0.4098033f, 0.0f, 0.0f);
        this.Tail5 = new ModelRenderer((ModelBase)this, 59, 112);
        this.Tail5.setRotationPoint(0.0f, 0.0f, 5.3f);
        this.Tail5.addBox(-3.0f, -3.0f, 0.0f, 6, 6, 7, 0.0f);
        this.setRotation(this.Tail5, 0.13665928f, 0.0f, 0.0f);
        this.BackLeftLeg.addChild(this.FrontLeftLeg2_1);
        this.Body.addChild(this.Tail1);
        this.Body.addChild(this.Body_1);
        this.RHorn2.addChild(this.RHorn4);
        this.Tail2.addChild(this.Tail3);
        this.FrontLeftLeg.addChild(this.FrontLeftLeg2);
        this.Head.addChild(this.Head3);
        this.Head.addChild(this.RHorn);
        this.Body.addChild(this.Head);
        this.Tail1.addChild(this.Tail2);
        this.Head.addChild(this.Head2);
        this.BackRightLeg.addChild(this.FrontRightLeg2_1);
        this.Tail6.addChild(this.Tail7);
        this.RHorn.addChild(this.RHorn2);
        this.LHorn.addChild(this.LHorn2);
        this.Head.addChild(this.Head4);
        this.Head.addChild(this.LHorn);
        this.LHorn2.addChild(this.LHorn4);
        this.Tail3.addChild(this.Tail4);
        this.Tail5.addChild(this.Tail6);
        this.Head.addChild(this.Mouth);
        this.FronRightLeg.addChild(this.FrontRightLeg2);
        this.Body.addChild(this.FronRightLeg);
        this.Mouth.addChild(this.Horn);
        this.Body.addChild(this.FrontLeftLeg);
        this.Body.addChild(this.BackLeftLeg);
        this.Body.addChild(this.BackRightLeg);
        this.Tail4.addChild(this.Tail5);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        GL11.glTranslatef((float)0.0f, (float)-0.74f, (float)0.0f);
        this.Body.render(f5);
        GL11.glPopMatrix();
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        float r = 360.0f;
        float r2 = 180.0f;
        float n4 = par4;
        float n5 = par5;
        this.Head.rotateAngleY = n4 / (r2 / (float)Math.PI);
        this.Head.rotateAngleX = n5 / (r2 / (float)Math.PI);
        this.FronRightLeg.rotateAngleX = -0.4f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.FrontLeftLeg.rotateAngleX = -0.4f - MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.BackRightLeg.rotateAngleX = -0.4f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.BackLeftLeg.rotateAngleX = -0.4f + MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.FronRightLeg.rotateAngleY = 0.0f;
        this.FrontLeftLeg.rotateAngleY = 0.0f;
        this.BackRightLeg.rotateAngleY = 0.0f;
        this.BackLeftLeg.rotateAngleY = 0.0f;
        float ex = par7Entity.ticksExisted;
        float r3 = MathHelper.cos((float)(ex * 0.14f)) * 0.1f;
        float r4 = MathHelper.cos((float)(ex / 8.0f)) / 4.0f - 0.2f;
        this.Tail1.rotateAngleY = 0.2f;
        this.Tail1.rotateAngleY += r4;
        this.Tail2.rotateAngleY = 0.2f;
        this.Tail2.rotateAngleY += r4;
        this.Tail3.rotateAngleY = 0.2f;
        this.Tail3.rotateAngleY += r4;
        this.Tail4.rotateAngleY = 0.2f;
        this.Tail4.rotateAngleY += r4;
        this.Tail5.rotateAngleY = 0.2f;
        this.Tail5.rotateAngleY += r4;
        this.Tail6.rotateAngleY = 0.2f;
        this.Tail6.rotateAngleY += r4;
        this.Tail7.rotateAngleY = 0.2f;
        this.Tail7.rotateAngleY += r4;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

