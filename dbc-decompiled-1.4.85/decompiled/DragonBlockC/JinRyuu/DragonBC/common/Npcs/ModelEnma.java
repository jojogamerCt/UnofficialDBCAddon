/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.client.JGRenderHelper
 *  JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Npcs;

import JinRyuu.JRMCore.client.JGRenderHelper;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelEnma
extends ModelBase {
    public ModelRenderer Chair1;
    public ModelRenderer YemmaBody1;
    public ModelRenderer Desk1;
    public ModelRenderer Chair2;
    public ModelRenderer ChairBack1;
    public ModelRenderer ChairBack2;
    public ModelRenderer ChairBack3;
    public ModelRenderer ChairSideL1;
    public ModelRenderer ChairSideR1;
    public ModelRenderer ChairLeg1;
    public ModelRenderer ChairLeg2;
    public ModelRenderer ChairLeg3;
    public ModelRenderer ChairLeg4;
    public ModelRenderer ChairLegFoot1;
    public ModelRenderer ChairLegFoot2;
    public ModelRenderer ChairLegFoot3;
    public ModelRenderer ChairLegFoot4;
    public ModelRenderer ChairSideL2;
    public ModelRenderer ChairSideL3;
    public ModelRenderer ChairSideR2;
    public ModelRenderer ChairSideR3;
    public ModelRenderer YemmaBody2;
    public ModelRenderer YLeg1R;
    public ModelRenderer YLeg1L;
    public ModelRenderer YemmaBody3;
    public ModelRenderer YArm1L;
    public ModelRenderer YArm1R;
    public ModelRenderer Body4;
    public ModelRenderer YArm2L;
    public ModelRenderer YArm2R;
    public ModelRenderer Pen;
    public ModelRenderer Head;
    public ModelRenderer Beard1;
    public ModelRenderer Horn1L;
    public ModelRenderer Hair1;
    public ModelRenderer Horn1R;
    public ModelRenderer Beard2R;
    public ModelRenderer Beard3L;
    public ModelRenderer Horn2L;
    public ModelRenderer Hair2;
    public ModelRenderer Horn2R;
    public ModelRenderer YLeg2R;
    public ModelRenderer YLeg3R;
    public ModelRenderer YLeg2L;
    public ModelRenderer YLeg3L;
    public ModelRenderer Desk2;
    public ModelRenderer DeskLegFR;
    public ModelRenderer DeskLegFL;
    public ModelRenderer DeskLegBR;
    public ModelRenderer DeskLegBL;
    private float animationPen1 = 0.0f;
    private float animationPen2 = 0.0f;

    public ModelEnma() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.ChairBack3 = new ModelRenderer((ModelBase)this, 227, 40);
        this.ChairBack3.setRotationPoint(0.0f, -5.8f, 6.0f);
        this.ChairBack3.addBox(-6.0f, -6.6f, -0.8f, 12, 7, 2, 0.0f);
        this.setRotateAngle(this.ChairBack3, (float)(-Math.PI) / 90, 0.0f, 0.0f);
        this.DeskLegBL = new ModelRenderer((ModelBase)this, 134, 103);
        this.DeskLegBL.mirror = true;
        this.DeskLegBL.setRotationPoint(16.3f, 1.5f, 2.8f);
        this.DeskLegBL.addBox(-1.5f, 0.0f, -1.5f, 3, 15, 3, 0.0f);
        this.YLeg2L = new ModelRenderer((ModelBase)this, 32, 98);
        this.YLeg2L.mirror = true;
        this.YLeg2L.setRotationPoint(0.3f, -0.2f, -3.9f);
        this.YLeg2L.addBox(-2.6f, 0.1f, -2.2f, 5, 8, 4, 0.0f);
        this.setRotateAngle(this.YLeg2L, -0.2443461f, 0.0f, 0.0f);
        this.YArm2L = new ModelRenderer((ModelBase)this, 62, 57);
        this.YArm2L.mirror = true;
        this.YArm2L.setRotationPoint(0.0f, 4.6f, 0.0f);
        this.YArm2L.addBox(-0.2f, 0.1f, -1.2f, 3, 9, 3, 0.0f);
        this.setRotateAngle(this.YArm2L, -0.9669124f, 0.04886922f, 0.2687807f);
        this.Beard2R = new ModelRenderer((ModelBase)this, 60, 30);
        this.Beard2R.setRotationPoint(0.0f, -0.6f, 0.0f);
        this.Beard2R.addBox(-5.0f, 1.5f, -1.0f, 4, 2, 2, 0.0f);
        this.ChairLegFoot2 = new ModelRenderer((ModelBase)this, 241, 87);
        this.ChairLegFoot2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ChairLegFoot2.addBox(-1.0f, 1.0f, 5.8f, 2, 2, 2, 0.0f);
        this.setRotateAngle(this.ChairLegFoot2, 0.108210415f, 0.0f, 0.0f);
        this.Body4 = new ModelRenderer((ModelBase)this, 8, 32);
        this.Body4.setRotationPoint(0.0f, -4.0f, -1.1f);
        this.Body4.addBox(-6.0f, -0.4f, -2.3f, 12, 2, 6, 0.0f);
        this.ChairSideL1 = new ModelRenderer((ModelBase)this, 206, 52);
        this.ChairSideL1.setRotationPoint(7.1f, 1.4f, 1.6f);
        this.ChairSideL1.addBox(-0.5f, -5.7f, -0.5f, 1, 6, 1, 0.0f);
        this.setRotateAngle(this.ChairSideL1, 0.0f, 0.0f, 0.13962634f);
        this.Beard1 = new ModelRenderer((ModelBase)this, 59, 23);
        this.Beard1.setRotationPoint(0.0f, 0.2f, -2.3f);
        this.Beard1.addBox(-4.5f, -2.2f, -0.9f, 9, 4, 2, 0.0f);
        this.setRotateAngle(this.Beard1, -0.68294734f, 0.0f, 0.0f);
        this.Hair1 = new ModelRenderer((ModelBase)this, 22, 6);
        this.Hair1.setRotationPoint(0.0f, -2.5f, 3.2f);
        this.Hair1.addBox(-4.5f, 0.0f, -1.8f, 9, 4, 3, 0.0f);
        this.setRotateAngle(this.Hair1, 0.54454273f, 0.0f, 0.0f);
        this.Chair1 = new ModelRenderer((ModelBase)this, 203, 51);
        this.Chair1.setRotationPoint(0.0f, 14.5f, 14.0f);
        this.Chair1.addBox(-7.0f, 0.0f, -7.1f, 14, 2, 12, 0.0f);
        this.ChairSideL2 = new ModelRenderer((ModelBase)this, 206, 52);
        this.ChairSideL2.setRotationPoint(0.0f, 0.0f, -5.2f);
        this.ChairSideL2.addBox(-0.5f, -5.7f, -0.5f, 1, 6, 1, 0.0f);
        this.Chair2 = new ModelRenderer((ModelBase)this, 240, 66);
        this.Chair2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Chair2.addBox(-1.0f, 2.0f, -1.0f, 2, 4, 2, 0.0f);
        this.ChairLegFoot4 = new ModelRenderer((ModelBase)this, 241, 87);
        this.ChairLegFoot4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ChairLegFoot4.addBox(-1.0f, 1.0f, 5.8f, 2, 2, 2, 0.0f);
        this.setRotateAngle(this.ChairLegFoot4, 0.108210415f, 0.0f, 0.0f);
        this.Desk2 = new ModelRenderer((ModelBase)this, 137, 73);
        this.Desk2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Desk2.addBox(-18.5f, 1.9f, -19.0f, 36, 2, 23, 0.0f);
        this.YArm1R = new ModelRenderer((ModelBase)this, 62, 44);
        this.YArm1R.setRotationPoint(-8.7f, -1.5f, 0.0f);
        this.YArm1R.addBox(-1.2f, -1.7f, -2.0f, 4, 7, 4, 0.0f);
        this.setRotateAngle(this.YArm1R, -0.62831855f, (float)Math.PI / 180, 0.2687807f);
        this.YLeg3R = new ModelRenderer((ModelBase)this, 52, 101);
        this.YLeg3R.setRotationPoint(0.3f, 8.0f, -0.5f);
        this.YLeg3R.addBox(-2.6f, 0.1f, -4.0f, 4, 3, 6, 0.0f);
        this.setRotateAngle(this.YLeg3R, 0.04712389f, 0.0f, 0.0f);
        this.Horn2R = new ModelRenderer((ModelBase)this, 48, 3);
        this.Horn2R.setRotationPoint(-1.9f, 0.3f, 0.0f);
        this.Horn2R.addBox(-2.7f, -0.8f, -0.5f, 3, 2, 2, 0.0f);
        this.setRotateAngle(this.Horn2R, 0.0f, 0.0f, 1.1838568f);
        this.Horn1R = new ModelRenderer((ModelBase)this, 47, 9);
        this.Horn1R.setRotationPoint(-3.7f, -5.7f, 0.0f);
        this.Horn1R.addBox(-2.7f, -0.8f, -0.5f, 4, 2, 2, 0.0f);
        this.setRotateAngle(this.Horn1R, 0.0f, 0.0f, 0.4712389f);
        this.Beard3L = new ModelRenderer((ModelBase)this, 60, 30);
        this.Beard3L.mirror = true;
        this.Beard3L.setRotationPoint(0.0f, -0.6f, 0.0f);
        this.Beard3L.addBox(1.1f, 1.5f, -1.0f, 4, 2, 2, 0.0f);
        this.ChairLeg3 = new ModelRenderer((ModelBase)this, 234, 74);
        this.ChairLeg3.setRotationPoint(0.0f, 6.5f, 0.0f);
        this.ChairLeg3.addBox(-1.0f, -0.7f, -0.5f, 2, 1, 8, 0.0f);
        this.setRotateAngle(this.ChairLeg3, -0.108210415f, 2.3675392f, 0.0f);
        this.ChairSideR1 = new ModelRenderer((ModelBase)this, 206, 52);
        this.ChairSideR1.setRotationPoint(-7.1f, 1.4f, 1.6f);
        this.ChairSideR1.addBox(-0.5f, -5.7f, -0.5f, 1, 6, 1, 0.0f);
        this.setRotateAngle(this.ChairSideR1, 0.0f, 0.0f, -0.13962634f);
        this.DeskLegFL = new ModelRenderer((ModelBase)this, 134, 103);
        this.DeskLegFL.mirror = true;
        this.DeskLegFL.setRotationPoint(16.3f, 1.5f, -17.8f);
        this.DeskLegFL.addBox(-1.5f, 0.0f, -1.5f, 3, 15, 3, 0.0f);
        this.ChairSideR2 = new ModelRenderer((ModelBase)this, 206, 52);
        this.ChairSideR2.setRotationPoint(0.0f, 0.0f, -5.2f);
        this.ChairSideR2.addBox(-0.5f, -5.7f, -0.5f, 1, 6, 1, 0.0f);
        this.Horn2L = new ModelRenderer((ModelBase)this, 48, 3);
        this.Horn2L.mirror = true;
        this.Horn2L.setRotationPoint(2.4f, 0.5f, 0.0f);
        this.Horn2L.addBox(-2.7f, -0.8f, -0.5f, 3, 2, 2, 0.0f);
        this.setRotateAngle(this.Horn2L, 0.0f, 0.0f, 1.9488347f);
        this.ChairLeg1 = new ModelRenderer((ModelBase)this, 234, 74);
        this.ChairLeg1.setRotationPoint(0.0f, 6.5f, 0.0f);
        this.ChairLeg1.addBox(-1.0f, -0.7f, -0.5f, 2, 1, 8, 0.0f);
        this.setRotateAngle(this.ChairLeg1, -0.108210415f, 1.2217305f, 0.0f);
        this.YArm1L = new ModelRenderer((ModelBase)this, 62, 44);
        this.YArm1L.mirror = true;
        this.YArm1L.setRotationPoint(7.2f, -1.5f, 0.0f);
        this.YArm1L.addBox(-1.2f, -1.7f, -2.0f, 4, 7, 4, 0.0f);
        this.setRotateAngle(this.YArm1L, -0.62831855f, (float)Math.PI / 180, -0.2687807f);
        this.ChairLeg2 = new ModelRenderer((ModelBase)this, 234, 74);
        this.ChairLeg2.setRotationPoint(0.0f, 6.5f, 0.0f);
        this.ChairLeg2.addBox(-1.0f, -0.7f, -0.5f, 2, 1, 8, 0.0f);
        this.setRotateAngle(this.ChairLeg2, -0.108210415f, -1.2217305f, 0.0f);
        this.Head = new ModelRenderer((ModelBase)this, 53, 8);
        this.Head.setRotationPoint(0.0f, -0.6f, -0.1f);
        this.Head.addBox(-4.0f, -7.5f, -3.0f, 8, 8, 7, 0.0f);
        this.YLeg3L = new ModelRenderer((ModelBase)this, 52, 101);
        this.YLeg3L.mirror = true;
        this.YLeg3L.setRotationPoint(0.3f, 8.0f, -0.5f);
        this.YLeg3L.addBox(-2.6f, 0.1f, -4.0f, 4, 3, 6, 0.0f);
        this.setRotateAngle(this.YLeg3L, 0.04712389f, 0.0f, 0.0f);
        this.ChairSideL3 = new ModelRenderer((ModelBase)this, 199, 38);
        this.ChairSideL3.setRotationPoint(-0.2f, -6.0f, 0.0f);
        this.ChairSideL3.addBox(-0.5f, -0.5f, -2.2f, 2, 1, 9, 0.0f);
        this.setRotateAngle(this.ChairSideL3, 0.0f, 0.0f, -0.10471976f);
        this.Horn1L = new ModelRenderer((ModelBase)this, 47, 9);
        this.Horn1L.mirror = true;
        this.Horn1L.setRotationPoint(3.6f, -5.8f, 0.0f);
        this.Horn1L.addBox(-1.2f, -0.8f, -0.5f, 4, 2, 2, 0.0f);
        this.setRotateAngle(this.Horn1L, 0.0f, 0.0f, -0.4712389f);
        this.Desk1 = new ModelRenderer((ModelBase)this, 123, 99);
        this.Desk1.setRotationPoint(0.0f, 7.4f, 0.0f);
        this.Desk1.addBox(-20.5f, -0.1f, -20.4f, 40, 2, 26, 0.0f);
        this.ChairBack2 = new ModelRenderer((ModelBase)this, 246, 50);
        this.ChairBack2.setRotationPoint(3.0f, 1.1f, 5.1f);
        this.ChairBack2.addBox(-1.0f, -6.6f, -0.3f, 2, 7, 1, 0.0f);
        this.setRotateAngle(this.ChairBack2, -0.13962634f, 0.0f, 0.0f);
        this.YLeg1R = new ModelRenderer((ModelBase)this, 5, 100);
        this.YLeg1R.setRotationPoint(-3.8f, 0.0f, -4.6f);
        this.YLeg1R.addBox(-2.6f, -1.9f, -5.8f, 6, 4, 6, 0.0f);
        this.setRotateAngle(this.YLeg1R, 0.20071286f, (float)Math.PI / 90, 0.0f);
        this.YemmaBody1 = new ModelRenderer((ModelBase)this, 7, 79);
        this.YemmaBody1.setRotationPoint(0.0f, 12.5f, 12.2f);
        this.YemmaBody1.addBox(-6.5f, -2.0f, -5.0f, 13, 4, 12, 0.0f);
        this.ChairSideR3 = new ModelRenderer((ModelBase)this, 199, 38);
        this.ChairSideR3.setRotationPoint(-0.2f, -6.0f, 0.0f);
        this.ChairSideR3.addBox(-1.0f, -0.5f, -2.2f, 2, 1, 9, 0.0f);
        this.setRotateAngle(this.ChairSideR3, 0.0f, 0.0f, 0.10471976f);
        this.YLeg1L = new ModelRenderer((ModelBase)this, 5, 100);
        this.YLeg1L.mirror = true;
        this.YLeg1L.setRotationPoint(3.4f, 0.0f, -4.6f);
        this.YLeg1L.addBox(-3.0f, -1.9f, -5.8f, 6, 4, 6, 0.0f);
        this.setRotateAngle(this.YLeg1L, 0.20071286f, (float)(-Math.PI) / 90, 0.0f);
        this.ChairLegFoot3 = new ModelRenderer((ModelBase)this, 241, 87);
        this.ChairLegFoot3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ChairLegFoot3.addBox(-1.0f, 1.0f, 5.8f, 2, 2, 2, 0.0f);
        this.setRotateAngle(this.ChairLegFoot3, 0.108210415f, 0.0f, 0.0f);
        this.YemmaBody3 = new ModelRenderer((ModelBase)this, 5, 41);
        this.YemmaBody3.setRotationPoint(0.0f, -5.0f, -0.4f);
        this.YemmaBody3.addBox(-6.5f, -3.2f, -5.6f, 13, 5, 11, 0.0f);
        this.YArm2R = new ModelRenderer((ModelBase)this, 62, 57);
        this.YArm2R.setRotationPoint(0.0f, 4.6f, 0.0f);
        this.YArm2R.addBox(-1.0f, 0.1f, -1.2f, 3, 9, 3, 0.0f);
        this.setRotateAngle(this.YArm2R, -0.9669124f, 0.04886922f, -0.2687807f);
        this.Pen = new ModelRenderer((ModelBase)this, 63, 69);
        this.Pen.setRotationPoint(1.2f, 7.9f, -1.2f);
        this.Pen.addBox(-0.5f, -0.5f, -2.3f, 1, 1, 5, 0.0f);
        this.setRotateAngle(this.Pen, 0.0f, 0.30543262f, 0.0f);
        this.YLeg2R = new ModelRenderer((ModelBase)this, 32, 98);
        this.YLeg2R.setRotationPoint(0.3f, -0.2f, -3.9f);
        this.YLeg2R.addBox(-2.6f, 0.1f, -2.2f, 5, 8, 4, 0.0f);
        this.setRotateAngle(this.YLeg2R, -0.2443461f, 0.0f, 0.0f);
        this.ChairBack1 = new ModelRenderer((ModelBase)this, 246, 50);
        this.ChairBack1.setRotationPoint(-3.0f, 1.1f, 5.1f);
        this.ChairBack1.addBox(-1.0f, -6.6f, -0.3f, 2, 7, 1, 0.0f);
        this.setRotateAngle(this.ChairBack1, -0.13962634f, 0.0f, 0.0f);
        this.DeskLegBR = new ModelRenderer((ModelBase)this, 134, 103);
        this.DeskLegBR.setRotationPoint(-17.3f, 1.5f, 2.8f);
        this.DeskLegBR.addBox(-1.5f, 0.0f, -1.5f, 3, 15, 3, 0.0f);
        this.ChairLegFoot1 = new ModelRenderer((ModelBase)this, 241, 87);
        this.ChairLegFoot1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ChairLegFoot1.addBox(-1.0f, 1.0f, 5.8f, 2, 2, 2, 0.0f);
        this.setRotateAngle(this.ChairLegFoot1, 0.108210415f, 0.0f, 0.0f);
        this.YemmaBody2 = new ModelRenderer((ModelBase)this, 6, 59);
        this.YemmaBody2.setRotationPoint(0.0f, -3.7f, 0.6f);
        this.YemmaBody2.addBox(-7.0f, -3.2f, -7.1f, 14, 5, 13, 0.0f);
        this.ChairLeg4 = new ModelRenderer((ModelBase)this, 234, 74);
        this.ChairLeg4.setRotationPoint(0.0f, 6.5f, 0.0f);
        this.ChairLeg4.addBox(-1.0f, -0.7f, -0.5f, 2, 1, 8, 0.0f);
        this.setRotateAngle(this.ChairLeg4, -0.108210415f, -2.3675392f, 0.0f);
        this.Hair2 = new ModelRenderer((ModelBase)this, 3, 7);
        this.Hair2.setRotationPoint(0.0f, 3.6f, 0.4f);
        this.Hair2.addBox(-3.5f, 0.0f, -0.9f, 7, 3, 2, 0.0f);
        this.setRotateAngle(this.Hair2, -0.24609143f, 0.0f, 0.0f);
        this.DeskLegFR = new ModelRenderer((ModelBase)this, 134, 103);
        this.DeskLegFR.setRotationPoint(-17.3f, 1.5f, -17.8f);
        this.DeskLegFR.addBox(-1.5f, 0.0f, -1.5f, 3, 15, 3, 0.0f);
        this.Chair1.addChild(this.ChairBack3);
        this.Desk2.addChild(this.DeskLegBL);
        this.YLeg1L.addChild(this.YLeg2L);
        this.YArm1L.addChild(this.YArm2L);
        this.Beard1.addChild(this.Beard2R);
        this.ChairLeg2.addChild(this.ChairLegFoot2);
        this.YemmaBody3.addChild(this.Body4);
        this.Chair1.addChild(this.ChairSideL1);
        this.Head.addChild(this.Beard1);
        this.Head.addChild(this.Hair1);
        this.ChairSideL1.addChild(this.ChairSideL2);
        this.Chair1.addChild(this.Chair2);
        this.ChairLeg4.addChild(this.ChairLegFoot4);
        this.Desk1.addChild(this.Desk2);
        this.YemmaBody3.addChild(this.YArm1R);
        this.YLeg2R.addChild(this.YLeg3R);
        this.Horn1R.addChild(this.Horn2R);
        this.Head.addChild(this.Horn1R);
        this.Beard1.addChild(this.Beard3L);
        this.Chair2.addChild(this.ChairLeg3);
        this.Chair1.addChild(this.ChairSideR1);
        this.Desk2.addChild(this.DeskLegFL);
        this.ChairSideR1.addChild(this.ChairSideR2);
        this.Horn1L.addChild(this.Horn2L);
        this.Chair2.addChild(this.ChairLeg1);
        this.YemmaBody3.addChild(this.YArm1L);
        this.Chair2.addChild(this.ChairLeg2);
        this.Body4.addChild(this.Head);
        this.YLeg2L.addChild(this.YLeg3L);
        this.ChairSideL2.addChild(this.ChairSideL3);
        this.Head.addChild(this.Horn1L);
        this.Chair1.addChild(this.ChairBack2);
        this.YemmaBody1.addChild(this.YLeg1R);
        this.ChairSideR2.addChild(this.ChairSideR3);
        this.YemmaBody1.addChild(this.YLeg1L);
        this.ChairLeg3.addChild(this.ChairLegFoot3);
        this.YemmaBody2.addChild(this.YemmaBody3);
        this.YArm1R.addChild(this.YArm2R);
        this.YArm2R.addChild(this.Pen);
        this.YLeg1R.addChild(this.YLeg2R);
        this.Chair1.addChild(this.ChairBack1);
        this.Desk2.addChild(this.DeskLegBR);
        this.ChairLeg1.addChild(this.ChairLegFoot1);
        this.YemmaBody1.addChild(this.YemmaBody2);
        this.Chair2.addChild(this.ChairLeg4);
        this.Hair1.addChild(this.Hair2);
        this.Desk2.addChild(this.DeskLegFR);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        float n4 = f3;
        float n5 = f4;
        float r2 = 180.0f;
        float headY = n4 / (r2 / (float)Math.PI);
        float headX = n5 / (r2 / (float)Math.PI) * 0.3f;
        int tick = entity.ticksExisted;
        int animation = tick / 100;
        int animationTick = tick - animation * 100;
        if (!Minecraft.getMinecraft().isGamePaused()) {
            if (animationTick < 50) {
                this.animationPen1 += (-0.0f - MathHelper.cos((float)((float)tick * 1.0f)) * 1.2f) * 0.02f;
                this.animationPen2 += (-0.0f - MathHelper.cos((float)((float)tick * 0.4f)) * 1.2f) * 0.02f;
            } else {
                if (this.animationPen1 != 0.0f) {
                    this.animationPen1 += -(this.animationPen1 / 10.0f);
                }
                if (this.animationPen2 != 0.0f) {
                    this.animationPen2 += -(this.animationPen2 / 10.0f);
                }
            }
            this.Pen.rotateAngleX = this.animationPen1;
            this.YArm2R.rotateAngleY = 0.04886922f + -this.animationPen2 * 0.1f;
            this.YArm2R.rotateAngleZ = -0.2687807f + -this.animationPen2 * 0.1f;
        }
        if (animationTick < 50) {
            this.Head.rotateAngleX = 0.2f;
            this.Head.rotateAngleY = 0.0f;
        } else {
            this.Head.rotateAngleX = headX;
            this.Head.rotateAngleY = headY;
        }
        this.Beard1.rotateAngleX = this.Head.rotateAngleX > 0.0f ? -0.68294734f - this.Head.rotateAngleX * 3.0f : -0.68294734f;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-1.0f);
        float F = entity.height / 2.0f;
        JGRenderHelper.modelScalePositionHelper((float)F);
        this.Chair1.render(f5);
        this.YemmaBody1.render(f5);
        if (JGConfigClientSettings.CLIENT_DA22) {
            this.Desk1.render(f5);
        }
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

