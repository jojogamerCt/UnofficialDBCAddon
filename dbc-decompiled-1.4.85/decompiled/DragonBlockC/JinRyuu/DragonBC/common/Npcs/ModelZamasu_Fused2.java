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

public class ModelZamasu_Fused2
extends ModelBase {
    public ModelRenderer Head;
    public ModelRenderer ArmR1;
    public ModelRenderer Body1;
    public ModelRenderer ArmL;
    public ModelRenderer LegL;
    public ModelRenderer LegR;
    public ModelRenderer HairBase;
    public ModelRenderer earR;
    public ModelRenderer earL;
    public ModelRenderer HairR;
    public ModelRenderer HairL;
    public ModelRenderer HairB1;
    public ModelRenderer HairF1;
    public ModelRenderer HairM1;
    public ModelRenderer HairB2;
    public ModelRenderer HairB3;
    public ModelRenderer HairB4;
    public ModelRenderer HairF2;
    public ModelRenderer HairF3;
    public ModelRenderer HairF4;
    public ModelRenderer HairF6;
    public ModelRenderer HairF5;
    public ModelRenderer HairM2;
    public ModelRenderer earR2;
    public ModelRenderer earL2;
    public ModelRenderer ArmR2;
    public ModelRenderer ShoulderR;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer ShoulderL;
    private float F = 1.0f;

    public ModelZamasu_Fused2() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ArmR1 = new ModelRenderer((ModelBase)this, 35, 53);
        this.ArmR1.setRotationPoint(-5.0f, -0.1f, 0.0f);
        this.ArmR1.addBox(-2.0f, -0.9f, -1.8f, 3, 7, 4, -0.1f);
        this.HairB3 = new ModelRenderer((ModelBase)this, 47, 26);
        this.HairB3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairB3.addBox(-2.8f, -7.0f, -0.1f, 5, 3, 3, 0.0f);
        this.setRotateAngle(this.HairB3, 0.0f, 0.0f, 0.59184116f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 45);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.1f, 11.0f, 0.0f);
        this.LegL.addBox(-2.1f, 0.0f, -2.0f, 4, 13, 4, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -1.2f, 0.0f);
        this.Head.addBox(-4.0f, -7.3f, -4.0f, 8, 8, 8, -0.5f);
        this.ArmL = new ModelRenderer((ModelBase)this, 0, 27);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, -0.1f, 0.0f);
        this.ArmL.addBox(-1.2f, -0.8f, -1.8f, 3, 12, 4, -0.1f);
        this.HairB4 = new ModelRenderer((ModelBase)this, 47, 26);
        this.HairB4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairB4.addBox(-1.9f, -7.3f, -0.1f, 5, 3, 3, 0.0f);
        this.setRotateAngle(this.HairB4, 0.0f, 0.0f, -0.3577925f);
        this.earR = new ModelRenderer((ModelBase)this, 0, 1);
        this.earR.setRotationPoint(-3.2f, -1.9f, -1.5f);
        this.earR.addBox(-4.2f, -2.1f, 0.0f, 4, 3, 0, 0.0f);
        this.setRotateAngle(this.earR, 0.1134464f, 0.5235988f, 0.34906584f);
        this.Body1 = new ModelRenderer((ModelBase)this, 20, 23);
        this.Body1.setRotationPoint(0.0f, -1.0f, 0.0f);
        this.Body1.addBox(-4.0f, 0.0f, -1.8f, 8, 7, 4, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 17, 51);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-2.7f, 5.9f, -2.4f, 4, 8, 5, 0.0f);
        this.HairM2 = new ModelRenderer((ModelBase)this, 38, 12);
        this.HairM2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairM2.addBox(-3.3f, -12.8f, -3.3f, 2, 7, 3, 0.0f);
        this.setRotateAngle(this.HairM2, 0.0f, 0.0f, 0.040142573f);
        this.HairL = new ModelRenderer((ModelBase)this, 49, 13);
        this.HairL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairL.addBox(1.8f, -11.5f, -3.9f, 2, 7, 5, 0.0f);
        this.setRotateAngle(this.HairL, 0.0f, 0.045378562f, 0.07853982f);
        this.ShoulderL = new ModelRenderer((ModelBase)this, 3, 18);
        this.ShoulderL.mirror = true;
        this.ShoulderL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderL.addBox(-1.0f, -0.9f, -1.8f, 6, 4, 4, 0.0f);
        this.HairF1 = new ModelRenderer((ModelBase)this, 53, 33);
        this.HairF1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF1.addBox(-3.3f, -9.8f, -5.4f, 2, 4, 3, 0.0f);
        this.setRotateAngle(this.HairF1, 0.0f, 0.0f, -0.13665928f);
        this.HairBase = new ModelRenderer((ModelBase)this, 33, 0);
        this.HairBase.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairBase.addBox(-2.9f, -11.1f, -4.0f, 6, 5, 7, 0.0f);
        this.setRotateAngle(this.HairBase, -0.18203785f, 0.0f, 0.0f);
        this.HairM1 = new ModelRenderer((ModelBase)this, 49, 53);
        this.HairM1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairM1.addBox(-0.6f, -14.1f, -2.4f, 3, 3, 4, 0.0f);
        this.HairF2 = new ModelRenderer((ModelBase)this, 53, 33);
        this.HairF2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF2.addBox(1.0f, -8.7f, -5.5f, 2, 3, 3, 0.0f);
        this.setRotateAngle(this.HairF2, 0.0f, 0.0f, 0.22759093f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 45);
        this.LegR.setRotationPoint(-2.1f, 11.0f, 0.0f);
        this.LegR.addBox(-1.9f, 0.0f, -2.0f, 4, 13, 4, 0.0f);
        this.ShoulderR = new ModelRenderer((ModelBase)this, 3, 18);
        this.ShoulderR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderR.addBox(-5.0f, -0.9f, -1.8f, 6, 4, 4, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 20, 43);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-4.0f, 9.0f, -2.0f, 8, 3, 4, 0.0f);
        this.HairF5 = new ModelRenderer((ModelBase)this, 56, 46);
        this.HairF5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF5.addBox(-4.0f, -7.1f, -6.1f, 2, 5, 1, 0.0f);
        this.setRotateAngle(this.HairF5, 0.27314404f, 0.0f, 0.0f);
        this.earL2 = new ModelRenderer((ModelBase)this, 30, 1);
        this.earL2.mirror = true;
        this.earL2.setRotationPoint(0.3f, 1.2f, 0.0f);
        this.earL2.addBox(-0.5f, -0.4f, -0.5f, 1, 1, 1, 0.0f);
        this.setRotateAngle(this.earL2, 0.0f, 0.34906584f, 0.34906584f);
        this.HairF6 = new ModelRenderer((ModelBase)this, 56, 46);
        this.HairF6.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF6.addBox(1.5f, -7.3f, -6.1f, 2, 3, 1, 0.0f);
        this.setRotateAngle(this.HairF6, 0.14137167f, 0.0f, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 23, 36);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.5f, 7.0f, -1.7f, 7, 2, 3, 0.0f);
        this.HairB2 = new ModelRenderer((ModelBase)this, 38, 12);
        this.HairB2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairB2.addBox(1.5f, -12.2f, -0.4f, 2, 7, 3, 0.0f);
        this.setRotateAngle(this.HairB2, 0.0f, 0.0f, 0.2268928f);
        this.HairR = new ModelRenderer((ModelBase)this, 49, 13);
        this.HairR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairR.addBox(-3.7f, -11.4f, -3.3f, 2, 7, 5, 0.0f);
        this.setRotateAngle(this.HairR, 0.0f, -0.045378562f, -0.08028515f);
        this.earR2 = new ModelRenderer((ModelBase)this, 30, 1);
        this.earR2.setRotationPoint(-0.5f, 1.2f, 0.0f);
        this.earR2.addBox(-0.4f, -0.4f, -0.5f, 1, 1, 1, 0.0f);
        this.setRotateAngle(this.earR2, 0.0f, -0.34906584f, -0.34906584f);
        this.earL = new ModelRenderer((ModelBase)this, 0, 4);
        this.earL.setRotationPoint(3.2f, -1.9f, -1.5f);
        this.earL.addBox(0.2f, -2.1f, 0.0f, 4, 3, 0, 0.0f);
        this.setRotateAngle(this.earL, 0.1134464f, -0.5235988f, -0.34906584f);
        this.HairF4 = new ModelRenderer((ModelBase)this, 55, 41);
        this.HairF4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF4.addBox(-3.3f, -6.2f, -6.9f, 2, 2, 2, 0.0f);
        this.setRotateAngle(this.HairF4, -0.17453292f, 0.0f, 0.31869712f);
        this.HairB1 = new ModelRenderer((ModelBase)this, 38, 12);
        this.HairB1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairB1.addBox(-2.8f, -12.3f, -0.3f, 2, 7, 3, 0.0f);
        this.setRotateAngle(this.HairB1, 0.0f, 0.0f, -0.13665928f);
        this.HairF3 = new ModelRenderer((ModelBase)this, 55, 41);
        this.HairF3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF3.addBox(0.8f, -7.3f, -6.2f, 2, 2, 2, 0.0f);
        this.HairB1.addChild(this.HairB3);
        this.HairB1.addChild(this.HairB4);
        this.Head.addChild(this.earR);
        this.ArmR1.addChild(this.ArmR2);
        this.HairM1.addChild(this.HairM2);
        this.HairBase.addChild(this.HairL);
        this.ArmL.addChild(this.ShoulderL);
        this.HairBase.addChild(this.HairF1);
        this.Head.addChild(this.HairBase);
        this.HairBase.addChild(this.HairM1);
        this.HairF1.addChild(this.HairF2);
        this.ArmR1.addChild(this.ShoulderR);
        this.Body2.addChild(this.Body3);
        this.HairF4.addChild(this.HairF5);
        this.earL.addChild(this.earL2);
        this.HairF3.addChild(this.HairF6);
        this.Body1.addChild(this.Body2);
        this.HairB1.addChild(this.HairB2);
        this.HairBase.addChild(this.HairR);
        this.earR.addChild(this.earR2);
        this.Head.addChild(this.earL);
        this.HairF1.addChild(this.HairF4);
        this.HairBase.addChild(this.HairB1);
        this.HairF1.addChild(this.HairF3);
    }

    public ModelZamasu_Fused2(float f) {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ArmR1 = new ModelRenderer((ModelBase)this, 35, 53);
        this.ArmR1.setRotationPoint(-5.0f, -0.1f, 0.0f);
        this.ArmR1.addBox(-2.0f, -0.9f, -1.8f, 3, 7, 4, -0.1f);
        this.HairB3 = new ModelRenderer((ModelBase)this, 47, 26);
        this.HairB3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairB3.addBox(-2.8f, -7.0f, -0.1f, 5, 3, 3, 0.0f);
        this.setRotateAngle(this.HairB3, 0.0f, 0.0f, 0.59184116f);
        this.LegL = new ModelRenderer((ModelBase)this, 0, 45);
        this.LegL.mirror = true;
        this.LegL.setRotationPoint(2.1f, 11.0f, 0.0f);
        this.LegL.addBox(-2.1f, 0.0f, -2.0f, 4, 13, 4, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 0, 0);
        this.Head.setRotationPoint(0.0f, -1.2f, 0.0f);
        this.Head.addBox(-4.0f, -7.3f, -4.0f, 8, 8, 8, -0.5f);
        this.ArmL = new ModelRenderer((ModelBase)this, 0, 27);
        this.ArmL.mirror = true;
        this.ArmL.setRotationPoint(5.0f, -0.1f, 0.0f);
        this.ArmL.addBox(-1.2f, -0.8f, -1.8f, 3, 12, 4, -0.1f);
        this.HairB4 = new ModelRenderer((ModelBase)this, 47, 26);
        this.HairB4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairB4.addBox(-1.9f, -7.3f, -0.1f, 5, 3, 3, 0.0f);
        this.setRotateAngle(this.HairB4, 0.0f, 0.0f, -0.3577925f);
        this.earR = new ModelRenderer((ModelBase)this, 0, 1);
        this.earR.setRotationPoint(-3.2f, -1.9f, -1.5f);
        this.earR.addBox(-4.2f, -2.1f, 0.0f, 4, 3, 0, 0.0f);
        this.setRotateAngle(this.earR, 0.1134464f, 0.5235988f, 0.34906584f);
        this.Body1 = new ModelRenderer((ModelBase)this, 20, 23);
        this.Body1.setRotationPoint(0.0f, -1.0f, 0.0f);
        this.Body1.addBox(-4.0f, 0.0f, -1.8f, 8, 7, 4, 0.0f);
        this.ArmR2 = new ModelRenderer((ModelBase)this, 17, 51);
        this.ArmR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ArmR2.addBox(-2.7f, 5.9f, -2.4f, 4, 8, 5, 0.0f);
        this.HairM2 = new ModelRenderer((ModelBase)this, 38, 12);
        this.HairM2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairM2.addBox(-3.3f, -12.8f, -3.3f, 2, 7, 3, 0.0f);
        this.setRotateAngle(this.HairM2, 0.0f, 0.0f, 0.040142573f);
        this.HairL = new ModelRenderer((ModelBase)this, 49, 13);
        this.HairL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairL.addBox(1.8f, -11.5f, -3.9f, 2, 7, 5, 0.0f);
        this.setRotateAngle(this.HairL, 0.0f, 0.045378562f, 0.07853982f);
        this.ShoulderL = new ModelRenderer((ModelBase)this, 3, 18);
        this.ShoulderL.mirror = true;
        this.ShoulderL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderL.addBox(-1.0f, -0.9f, -1.8f, 6, 4, 4, 0.0f);
        this.HairF1 = new ModelRenderer((ModelBase)this, 53, 33);
        this.HairF1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF1.addBox(-3.3f, -9.8f, -5.4f, 2, 4, 3, 0.0f);
        this.setRotateAngle(this.HairF1, 0.0f, 0.0f, -0.13665928f);
        this.HairBase = new ModelRenderer((ModelBase)this, 33, 0);
        this.HairBase.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairBase.addBox(-2.9f, -11.1f, -4.0f, 6, 5, 7, 0.0f);
        this.setRotateAngle(this.HairBase, -0.18203785f, 0.0f, 0.0f);
        this.HairM1 = new ModelRenderer((ModelBase)this, 49, 53);
        this.HairM1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairM1.addBox(-0.6f, -14.1f, -2.4f, 3, 3, 4, 0.0f);
        this.HairF2 = new ModelRenderer((ModelBase)this, 53, 33);
        this.HairF2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF2.addBox(1.0f, -8.7f, -5.5f, 2, 3, 3, 0.0f);
        this.setRotateAngle(this.HairF2, 0.0f, 0.0f, 0.22759093f);
        this.LegR = new ModelRenderer((ModelBase)this, 0, 45);
        this.LegR.setRotationPoint(-2.1f, 11.0f, 0.0f);
        this.LegR.addBox(-1.9f, 0.0f, -2.0f, 4, 13, 4, 0.0f);
        this.ShoulderR = new ModelRenderer((ModelBase)this, 3, 18);
        this.ShoulderR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ShoulderR.addBox(-5.0f, -0.9f, -1.8f, 6, 4, 4, 0.0f);
        this.Body3 = new ModelRenderer((ModelBase)this, 20, 43);
        this.Body3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body3.addBox(-4.0f, 9.0f, -2.0f, 8, 3, 4, 0.0f);
        this.HairF5 = new ModelRenderer((ModelBase)this, 56, 46);
        this.HairF5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF5.addBox(-4.0f, -7.1f, -6.1f, 2, 5, 1, 0.0f);
        this.setRotateAngle(this.HairF5, 0.27314404f, 0.0f, 0.0f);
        this.earL2 = new ModelRenderer((ModelBase)this, 30, 1);
        this.earL2.mirror = true;
        this.earL2.setRotationPoint(0.3f, 1.2f, 0.0f);
        this.earL2.addBox(-0.5f, -0.4f, -0.5f, 1, 1, 1, 0.0f);
        this.setRotateAngle(this.earL2, 0.0f, 0.34906584f, 0.34906584f);
        this.HairF6 = new ModelRenderer((ModelBase)this, 56, 46);
        this.HairF6.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF6.addBox(1.5f, -7.3f, -6.1f, 2, 3, 1, 0.0f);
        this.setRotateAngle(this.HairF6, 0.14137167f, 0.0f, 0.0f);
        this.Body2 = new ModelRenderer((ModelBase)this, 23, 36);
        this.Body2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body2.addBox(-3.5f, 7.0f, -1.7f, 7, 2, 3, 0.0f);
        this.HairB2 = new ModelRenderer((ModelBase)this, 38, 12);
        this.HairB2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairB2.addBox(1.5f, -12.2f, -0.4f, 2, 7, 3, 0.0f);
        this.setRotateAngle(this.HairB2, 0.0f, 0.0f, 0.2268928f);
        this.HairR = new ModelRenderer((ModelBase)this, 49, 13);
        this.HairR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairR.addBox(-3.7f, -11.4f, -3.3f, 2, 7, 5, 0.0f);
        this.setRotateAngle(this.HairR, 0.0f, -0.045378562f, -0.08028515f);
        this.earR2 = new ModelRenderer((ModelBase)this, 30, 1);
        this.earR2.setRotationPoint(-0.5f, 1.2f, 0.0f);
        this.earR2.addBox(-0.4f, -0.4f, -0.5f, 1, 1, 1, 0.0f);
        this.setRotateAngle(this.earR2, 0.0f, -0.34906584f, -0.34906584f);
        this.earL = new ModelRenderer((ModelBase)this, 0, 4);
        this.earL.setRotationPoint(3.2f, -1.9f, -1.5f);
        this.earL.addBox(0.2f, -2.1f, 0.0f, 4, 3, 0, 0.0f);
        this.setRotateAngle(this.earL, 0.1134464f, -0.5235988f, -0.34906584f);
        this.HairF4 = new ModelRenderer((ModelBase)this, 55, 41);
        this.HairF4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF4.addBox(-3.3f, -6.2f, -6.9f, 2, 2, 2, 0.0f);
        this.setRotateAngle(this.HairF4, -0.17453292f, 0.0f, 0.31869712f);
        this.HairB1 = new ModelRenderer((ModelBase)this, 38, 12);
        this.HairB1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairB1.addBox(-2.8f, -12.3f, -0.3f, 2, 7, 3, 0.0f);
        this.setRotateAngle(this.HairB1, 0.0f, 0.0f, -0.13665928f);
        this.HairF3 = new ModelRenderer((ModelBase)this, 55, 41);
        this.HairF3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.HairF3.addBox(0.8f, -7.3f, -6.2f, 2, 2, 2, 0.0f);
        this.HairB1.addChild(this.HairB3);
        this.HairB1.addChild(this.HairB4);
        this.Head.addChild(this.earR);
        this.ArmR1.addChild(this.ArmR2);
        this.HairM1.addChild(this.HairM2);
        this.HairBase.addChild(this.HairL);
        this.ArmL.addChild(this.ShoulderL);
        this.HairBase.addChild(this.HairF1);
        this.Head.addChild(this.HairBase);
        this.HairBase.addChild(this.HairM1);
        this.HairF1.addChild(this.HairF2);
        this.ArmR1.addChild(this.ShoulderR);
        this.Body2.addChild(this.Body3);
        this.HairF4.addChild(this.HairF5);
        this.earL.addChild(this.earL2);
        this.HairF3.addChild(this.HairF6);
        this.Body1.addChild(this.Body2);
        this.HairB1.addChild(this.HairB2);
        this.HairBase.addChild(this.HairR);
        this.earR.addChild(this.earR2);
        this.Head.addChild(this.earL);
        this.HairF1.addChild(this.HairF4);
        this.HairBase.addChild(this.HairB1);
        this.HairF1.addChild(this.HairF3);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.F != 1.0f) {
            GL11.glPushMatrix();
            this.F -= 0.1f;
            GL11.glScalef((float)this.F, (float)this.F, (float)this.F);
            GL11.glTranslatef((float)0.0f, (float)((this.F - 1.0f) * -0.74f - 0.1f), (float)0.0f);
        }
        this.Head.render(f5);
        if (this.F != 1.0f) {
            GL11.glPopMatrix();
        }
        if (this.F != 1.0f) {
            GL11.glPushMatrix();
            this.F += 0.1f;
            GL11.glScalef((float)(this.F * 1.2f), (float)this.F, (float)(this.F * 1.2f));
            GL11.glTranslatef((float)0.0f, (float)((this.F - 1.0f) * -0.74f), (float)0.0f);
        }
        this.LegL.render(f5);
        this.ArmL.render(f5);
        this.ArmR1.render(f5);
        this.Body1.render(f5);
        this.LegR.render(f5);
        if (this.F != 1.0f) {
            GL11.glPopMatrix();
        }
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
        this.LegR.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.LegL.rotateAngleX = -0.0f - MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.ArmR1.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f)) * 1.2f * par2;
        this.ArmL.rotateAngleX = -0.0f + MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.2f * par2;
        this.LegR.rotateAngleY = 0.0f;
        this.LegL.rotateAngleY = 0.0f;
        this.ArmR1.rotateAngleY = 0.0f;
        this.ArmL.rotateAngleY = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}

