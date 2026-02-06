/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.JRMCoreHJYC
 *  JinRyuu.JRMCore.entity.ModelBipedBody
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JBRA;

import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHJYC;
import JinRyuu.JRMCore.entity.ModelBipedBody;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class DBC_GiTurtleMdl
extends ModelBipedBody {
    private final int VANITY_ANDROID_21_COAT = 0;
    private final int VANITY_ANDROID_21_BOOT = 1;
    private final int VANITY_HALO = 2;
    private final int VANITY_ANGEL_HALO = 3;
    private final int VANITY_BARRIER_OF_LIGHT = 4;
    public int id = -1;
    public ModelRenderer Rarm;
    public ModelRenderer tail;
    public ModelRenderer body;
    public ModelRenderer Larm;
    public ModelRenderer RRolledSleeve;
    public ModelRenderer LRolledSleee;
    public ModelRenderer Rleg;
    public ModelRenderer Lleg;
    public ModelRenderer halo;
    public ModelRenderer halo1;
    public ModelRenderer halo2;
    public ModelRenderer halo3;
    public ModelRenderer halo4;
    public ModelRenderer NeckRing;
    public ModelRenderer NeckRing_1;
    public ModelRenderer NeckRing_2;
    public ModelRenderer NeckRing_3;
    public ModelRenderer NeckRing_4;
    public ModelRenderer NeckRing_5;
    public ModelRenderer NeckRing_6;
    public ModelRenderer NeckRing_7;
    public ModelRenderer BoL_Base;
    public ModelRenderer BoL_Top;
    public ModelRenderer BoL_InnerTop;
    public ModelRenderer BoL_LBase;
    public ModelRenderer BoL_RBase;
    public ModelRenderer SpikeTop;
    public ModelRenderer SpikeBottom;
    public ModelRenderer BoL_InnerL;
    public ModelRenderer BoL_InnerR;
    public ModelRenderer BoL_InnerLB;
    public ModelRenderer BoL_InnerLT;
    public ModelRenderer SpikeL;
    public ModelRenderer BoL_InnerLT2;
    public ModelRenderer BoL_InnerRB;
    public ModelRenderer BoL_InnerRT;
    public ModelRenderer SpikeR;
    public ModelRenderer BoL_InnerRT2;
    public ModelRenderer BoL_LBase2;
    public ModelRenderer BoL_LTBase2;
    public ModelRenderer BoL_LBase3;
    public ModelRenderer BoL_LTBase3;
    public ModelRenderer BoL_RBase2;
    public ModelRenderer BoL_RTBase2;
    public ModelRenderer BoL_RBase3;
    public ModelRenderer BoL_RTBase3;
    private float size = 1.0f;

    public DBC_GiTurtleMdl(int id) {
        super(0.1f);
        this.id = id;
        if (id == 0) {
            this.textureWidth = 64;
            this.textureHeight = 32;
            this.RRolledSleeve = new ModelRenderer((ModelBase)this, 21, 12);
            this.RRolledSleeve.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.RRolledSleeve.addBox(-3.8f, 1.7f, -2.5f, 5, 3, 5, 0.05f);
            this.Larm = new ModelRenderer((ModelBase)this, 42, 1);
            this.Larm.setRotationPoint(5.0f, 2.0f, 0.0f);
            this.Larm.addBox(-1.0f, -2.1f, -2.0f, 4, 5, 4, 0.3f);
            this.tail = new ModelRenderer((ModelBase)this, 0, 17);
            this.tail.setRotationPoint(0.0f, 11.8f, 1.9f);
            this.tail.addBox(-4.0f, -1.0f, 0.2f, 8, 10, 1, 0.5f);
            this.setRotateAngle(this.tail, 0.18203785f, 0.0f, 0.0f);
            this.body = new ModelRenderer((ModelBase)this, 0, 0);
            this.body.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.body.addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.1f);
            this.LRolledSleee = new ModelRenderer((ModelBase)this, 43, 12);
            this.LRolledSleee.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.LRolledSleee.addBox(-1.2f, 1.7f, -2.5f, 5, 3, 5, 0.05f);
            this.Rarm = new ModelRenderer((ModelBase)this, 25, 1);
            this.Rarm.setRotationPoint(-5.0f, 2.0f, 0.0f);
            this.Rarm.addBox(-3.0f, -2.1f, -2.0f, 4, 5, 4, 0.3f);
            this.Rarm.addChild(this.RRolledSleeve);
            this.Larm.addChild(this.LRolledSleee);
            this.body.addChild(this.tail);
        } else if (id == 1) {
            this.textureWidth = 32;
            this.textureHeight = 16;
            this.Rleg = new ModelRenderer((ModelBase)this, 0, 0);
            this.Rleg.setRotationPoint(-1.9f, 12.0f, 0.01f);
            this.Rleg.addBox(-2.0f, 9.0f, -2.0f, 4, 3, 4, 0.4f);
            this.Lleg = new ModelRenderer((ModelBase)this, 16, 0);
            this.Lleg.setRotationPoint(1.9f, 12.0f, 0.0f);
            this.Lleg.addBox(-2.0f, 9.0f, -2.0f, 4, 3, 4, 0.41f);
        } else if (id == 2) {
            this.halo = new ModelRenderer((ModelBase)this, 0, 40);
            this.halo.addBox(-0.0f, -0.0f, -0.0f, 0, 0, 0);
            this.halo.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.setRotation(this.halo, 0.0f, 0.0f, 0.0f);
            this.halo1 = new ModelRenderer((ModelBase)this, 0, 40);
            this.halo1.addBox(-4.0f, -13.0f, -5.0f, 9, 1, 1);
            this.halo1.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.setRotation(this.halo1, 0.0f, 0.0f, 0.0f);
            this.halo2 = new ModelRenderer((ModelBase)this, 0, 40);
            this.halo2.addBox(-5.0f, -13.0f, -5.0f, 1, 1, 9);
            this.halo2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.setRotation(this.halo2, 0.0f, 0.0f, 0.0f);
            this.halo3 = new ModelRenderer((ModelBase)this, 0, 40);
            this.halo3.addBox(4.0f, -13.0f, -4.0f, 1, 1, 9);
            this.halo3.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.setRotation(this.halo3, 0.0f, 0.0f, 0.0f);
            this.halo4 = new ModelRenderer((ModelBase)this, 0, 40);
            this.halo4.addBox(-5.0f, -13.0f, 4.0f, 9, 1, 1);
            this.halo4.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.setRotation(this.halo4, 0.0f, 0.0f, 0.0f);
            this.halo.addChild(this.halo1);
            this.halo.addChild(this.halo2);
            this.halo.addChild(this.halo3);
            this.halo.addChild(this.halo4);
        } else if (id == 3) {
            this.NeckRing_3 = new ModelRenderer((ModelBase)this, 0, 0);
            this.NeckRing_3.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.NeckRing_3.addBox(-8.7f, -3.2f, -3.2f, 2, 1, 7, 0.0f);
            this.setRotateAngle(this.NeckRing_3, 0.0f, -0.8290314f, 0.0f);
            this.NeckRing_5 = new ModelRenderer((ModelBase)this, 0, 0);
            this.NeckRing_5.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.NeckRing_5.addBox(-8.3f, -3.2f, -3.3f, 2, 1, 7, 0.0f);
            this.setRotateAngle(this.NeckRing_5, 0.0f, -0.7841764f, 0.0f);
            this.NeckRing = new ModelRenderer((ModelBase)this, 0, 10);
            this.NeckRing.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.NeckRing.addBox(-3.5f, -3.2f, 7.9f, 7, 1, 2, 0.0f);
            this.setRotateAngle(this.NeckRing, 0.59184116f, 0.0f, 0.0f);
            this.NeckRing_2 = new ModelRenderer((ModelBase)this, 19, 0);
            this.NeckRing_2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.NeckRing_2.addBox(-8.7f, -3.2f, -3.9f, 2, 1, 9, 0.0f);
            this.setRotateAngle(this.NeckRing_2, 0.0f, -0.82833326f, 0.0f);
            this.NeckRing_1 = new ModelRenderer((ModelBase)this, 0, 0);
            this.NeckRing_1.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.NeckRing_1.addBox(-9.7f, -3.2f, -2.9f, 2, 1, 7, 0.0f);
            this.setRotateAngle(this.NeckRing_1, 0.0f, 0.8342674f, 0.0f);
            this.NeckRing_7 = new ModelRenderer((ModelBase)this, 0, 0);
            this.NeckRing_7.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.NeckRing_7.addBox(-9.6f, -3.2f, -4.2f, 2, 1, 7, 0.0f);
            this.setRotateAngle(this.NeckRing_7, 0.0f, -0.8609709f, 0.0f);
            this.NeckRing_4 = new ModelRenderer((ModelBase)this, 0, 0);
            this.NeckRing_4.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.NeckRing_4.addBox(-8.5f, -3.2f, -3.3f, 2, 1, 7, 0.0f);
            this.setRotateAngle(this.NeckRing_4, 0.0f, -0.7382743f, 0.0f);
            this.NeckRing_6 = new ModelRenderer((ModelBase)this, 19, 0);
            this.NeckRing_6.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.NeckRing_6.addBox(-8.3f, -3.2f, -5.5f, 2, 1, 9, 0.0f);
            this.setRotateAngle(this.NeckRing_6, 0.0f, -0.7696902f, 0.0f);
            this.NeckRing_2.addChild(this.NeckRing_3);
            this.NeckRing_4.addChild(this.NeckRing_5);
            this.NeckRing_1.addChild(this.NeckRing_2);
            this.NeckRing.addChild(this.NeckRing_1);
            this.NeckRing_6.addChild(this.NeckRing_7);
            this.NeckRing_3.addChild(this.NeckRing_4);
            this.NeckRing_5.addChild(this.NeckRing_6);
        } else if (id == 4) {
            this.BoL_RBase3 = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_RBase3.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_RBase3.addBox(-10.1f, -5.1f, 10.0f, 2, 6, 1, 0.0f);
            this.setRotateAngle(this.BoL_RBase3, 0.0f, 0.0f, 0.4464552f);
            this.BoL_Top = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_Top.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_Top.addBox(-3.0f, -12.7f, 10.0f, 6, 2, 1, 0.0f);
            this.BoL_LBase3 = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_LBase3.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_LBase3.addBox(8.0f, -5.1f, 10.0f, 2, 6, 1, 0.0f);
            this.setRotateAngle(this.BoL_LBase3, 0.0f, 0.0f, -0.4464552f);
            this.BoL_InnerRB = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_InnerRB.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_InnerRB.addBox(-7.9f, -2.6f, 10.0f, 2, 6, 1, 0.0f);
            this.setRotateAngle(this.BoL_InnerRB, 0.0f, 0.0f, -0.6806784f);
            this.BoL_RBase = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_RBase.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_RBase.addBox(-11.2f, -4.5f, 10.0f, 2, 6, 1, 0.0f);
            this.SpikeTop = new ModelRenderer((ModelBase)this, 0, 0);
            this.SpikeTop.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.SpikeTop.addBox(-0.6f, -19.8f, 10.0f, 1, 13, 1, 0.0f);
            this.BoL_InnerLB = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_InnerLB.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_InnerLB.addBox(5.7f, -2.4f, 10.0f, 2, 6, 1, 0.0f);
            this.setRotateAngle(this.BoL_InnerLB, 0.0f, 0.0f, 0.6806784f);
            this.BoL_InnerL = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_InnerL.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_InnerL.addBox(5.4f, -2.0f, 10.0f, 2, 5, 1, 0.0f);
            this.BoL_InnerRT = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_InnerRT.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_InnerRT.addBox(-7.6f, -2.1f, 10.0f, 2, 4, 1, 0.0f);
            this.setRotateAngle(this.BoL_InnerRT, 0.0f, 0.0f, 0.48694685f);
            this.BoL_RBase2 = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_RBase2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_RBase2.addBox(-9.4f, -3.8f, 10.0f, 2, 6, 1, 0.0f);
            this.setRotateAngle(this.BoL_RBase2, 0.0f, 0.0f, -1.0471976f);
            this.BoL_InnerLT2 = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_InnerLT2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_InnerLT2.addBox(5.5f, -1.8f, 10.0f, 2, 4, 1, 0.0f);
            this.setRotateAngle(this.BoL_InnerLT2, 0.0f, 0.0f, -0.54454273f);
            this.BoL_InnerTop = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_InnerTop.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_InnerTop.addBox(-2.5f, -7.3f, 10.0f, 5, 2, 1, 0.0f);
            this.BoL_InnerR = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_InnerR.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_InnerR.addBox(-7.7f, -2.0f, 10.0f, 2, 5, 1, 0.0f);
            this.SpikeR = new ModelRenderer((ModelBase)this, 0, 0);
            this.SpikeR.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.SpikeR.addBox(-16.6f, -0.2f, 10.0f, 9, 1, 1, 0.0f);
            this.BoL_LBase2 = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_LBase2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_LBase2.addBox(7.4f, -3.8f, 10.0f, 2, 6, 1, 0.0f);
            this.setRotateAngle(this.BoL_LBase2, 0.0f, 0.0f, 1.0471976f);
            this.BoL_LBase = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_LBase.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_LBase.addBox(9.2f, -4.5f, 10.0f, 2, 6, 1, 0.0f);
            this.SpikeL = new ModelRenderer((ModelBase)this, 0, 0);
            this.SpikeL.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.SpikeL.addBox(7.4f, -0.2f, 10.0f, 9, 1, 1, 0.0f);
            this.SpikeBottom = new ModelRenderer((ModelBase)this, 0, 0);
            this.SpikeBottom.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.SpikeBottom.addBox(-0.6f, 8.8f, 10.0f, 1, 7, 1, 0.0f);
            this.BoL_InnerLT = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_InnerLT.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_InnerLT.addBox(5.5f, -2.3f, 10.0f, 2, 4, 1, 0.0f);
            this.setRotateAngle(this.BoL_InnerLT, 0.0f, 0.0f, -0.47298422f);
            this.BoL_RTBase2 = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_RTBase2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_RTBase2.addBox(-12.5f, -3.8f, 10.0f, 2, 6, 1, 0.0f);
            this.setRotateAngle(this.BoL_RTBase2, 0.0f, 0.0f, 1.0471976f);
            this.BoL_InnerRT2 = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_InnerRT2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_InnerRT2.addBox(-7.5f, -1.8f, 10.0f, 2, 4, 1, 0.0f);
            this.setRotateAngle(this.BoL_InnerRT2, 0.0f, 0.0f, 0.54454273f);
            this.BoL_LTBase2 = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_LTBase2.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_LTBase2.addBox(10.5f, -4.0f, 10.0f, 2, 6, 1, 0.0f);
            this.setRotateAngle(this.BoL_LTBase2, 0.0f, 0.0f, -1.0227629f);
            this.BoL_LTBase3 = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_LTBase3.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_LTBase3.addBox(9.9f, -4.5f, 10.0f, 2, 6, 1, 0.0f);
            this.setRotateAngle(this.BoL_LTBase3, 0.0f, 0.0f, 0.51975906f);
            this.BoL_Base = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_Base.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_Base.addBox(-3.0f, 6.2f, 10.0f, 6, 3, 1, 0.0f);
            this.setRotateAngle(this.BoL_Base, (float)(-Math.PI) / 90, 0.0f, 0.0f);
            this.BoL_RTBase3 = new ModelRenderer((ModelBase)this, 0, 0);
            this.BoL_RTBase3.setRotationPoint(0.0f, 0.0f, 0.0f);
            this.BoL_RTBase3.addBox(-11.9f, -4.2f, 10.0f, 2, 6, 1, 0.0f);
            this.setRotateAngle(this.BoL_RTBase3, 0.0f, 0.0f, -0.5145231f);
            this.BoL_RBase2.addChild(this.BoL_RBase3);
            this.BoL_Base.addChild(this.BoL_Top);
            this.BoL_LBase2.addChild(this.BoL_LBase3);
            this.BoL_InnerR.addChild(this.BoL_InnerRB);
            this.BoL_Base.addChild(this.BoL_RBase);
            this.BoL_Base.addChild(this.SpikeTop);
            this.BoL_InnerL.addChild(this.BoL_InnerLB);
            this.BoL_InnerTop.addChild(this.BoL_InnerL);
            this.BoL_InnerR.addChild(this.BoL_InnerRT);
            this.BoL_RBase.addChild(this.BoL_RBase2);
            this.BoL_InnerLT.addChild(this.BoL_InnerLT2);
            this.BoL_Base.addChild(this.BoL_InnerTop);
            this.BoL_InnerTop.addChild(this.BoL_InnerR);
            this.BoL_InnerR.addChild(this.SpikeR);
            this.BoL_LBase.addChild(this.BoL_LBase2);
            this.BoL_Base.addChild(this.BoL_LBase);
            this.BoL_InnerL.addChild(this.SpikeL);
            this.BoL_Base.addChild(this.SpikeBottom);
            this.BoL_InnerL.addChild(this.BoL_InnerLT);
            this.BoL_RBase.addChild(this.BoL_RTBase2);
            this.BoL_InnerRT.addChild(this.BoL_InnerRT2);
            this.BoL_LBase.addChild(this.BoL_LTBase2);
            this.BoL_LTBase2.addChild(this.BoL_LTBase3);
            this.BoL_RTBase2.addChild(this.BoL_RTBase3);
        }
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        float fx6;
        float scale;
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        float f6 = this.size;
        boolean sneak = entity.isSneaking();
        if (JRMCoreH.JYC()) {
            float age = JRMCoreHJYC.JYCAge((EntityPlayer)((EntityPlayer)entity));
            float childScl = JRMCoreHJYC.JYCsizeBasedOnAge((EntityPlayer)((EntityPlayer)entity));
            this.size = childScl = 3.0f - childScl * 2.0f;
        }
        if (this.id == 0) {
            scale = g <= 1 ? 1.03f : 0.8f;
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)0.0f);
            GL11.glPushMatrix();
            GL11.glScalef((float)scale, (float)scale, (float)scale);
            this.Larm.render(f5);
            this.body.render(f5);
            this.Rarm.render(f5);
            GL11.glPopMatrix();
        } else if (this.id == 1) {
            scale = 1.03f;
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)(0.0f + (sneak && g > 1 ? -0.075f : 0.0f)));
            GL11.glPushMatrix();
            GL11.glScalef((float)scale, (float)scale, (float)scale);
            this.Rleg.render(f5);
            this.Lleg.render(f5);
            GL11.glPopMatrix();
        } else if (this.id == 2) {
            fx6 = 1.0f;
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.3f), (float)0.0f);
            GL11.glPushMatrix();
            GL11.glScalef((float)((0.5f + 0.5f / fx6) * (g <= 1 ? 1.0f : 0.85f)), (float)(0.5f + 0.5f / fx6), (float)((0.5f + 0.5f / fx6) * (g <= 1 ? 1.0f : 0.85f)));
            GL11.glTranslatef((float)0.0f, (float)((fx6 - 1.0f) / fx6 * (2.0f - (fx6 >= 1.5f && fx6 <= 2.0f ? (2.0f - fx6) / 2.5f : (fx6 < 1.5f && fx6 >= 1.0f ? (fx6 * 2.0f - 2.0f) * 0.2f : 0.0f)))), (float)0.0f);
            this.halo.rotateAngleY = this.bipedHead.rotateAngleY;
            this.halo.rotateAngleX = this.bipedHead.rotateAngleX;
            this.halo.rotationPointX = this.bipedHead.rotationPointX;
            this.halo.rotationPointY = this.bipedHead.rotationPointY;
            this.halo.render(0.0625f);
            GL11.glPopMatrix();
        } else if (this.id == 3) {
            fx6 = 1.0f;
            GL11.glScalef((float)(1.0f / f6), (float)(1.0f / f6), (float)(1.0f / f6));
            GL11.glTranslatef((float)0.0f, (float)((f6 - 1.0f) * 1.5f), (float)0.0f);
            GL11.glPushMatrix();
            GL11.glScalef((float)((0.5f + 0.5f / fx6) * (g <= 1 ? 1.0f : 0.85f)), (float)(0.5f + 0.5f / fx6), (float)((0.5f + 0.5f / fx6) * (g <= 1 ? 1.0f : 0.85f)));
            GL11.glTranslatef((float)0.0f, (float)((fx6 - 1.0f) / fx6 * (2.0f - (fx6 >= 1.5f && fx6 <= 2.0f ? (2.0f - fx6) / 2.5f : (fx6 < 1.5f && fx6 >= 1.0f ? (fx6 * 2.0f - 2.0f) * 0.2f : 0.0f)))), (float)0.0f);
            this.NeckRing.rotateAngleY = this.B.rotateAngleY;
            this.NeckRing.rotateAngleX = this.B.rotateAngleX + 0.59184116f;
            this.NeckRing.rotationPointX = this.B.rotationPointX;
            this.NeckRing.rotationPointY = this.B.rotationPointY;
            this.NeckRing.render(f5);
            GL11.glPopMatrix();
        } else if (this.id == 4) {
            this.BoL_Base.render(f5);
        }
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
        if (this.id == 0) {
            this.Larm.rotationPointZ = this.LA.rotationPointZ;
            this.Larm.rotationPointY = this.LA.rotationPointY;
            this.Larm.rotationPointX = this.LA.rotationPointX;
            this.Larm.rotateAngleZ = this.LA.rotateAngleZ;
            this.Larm.rotateAngleY = this.LA.rotateAngleY;
            this.Larm.rotateAngleX = this.LA.rotateAngleX;
            this.Rarm.rotationPointZ = this.RA.rotationPointZ;
            this.Rarm.rotationPointY = this.RA.rotationPointY;
            this.Rarm.rotationPointX = this.RA.rotationPointX;
            this.Rarm.rotateAngleZ = this.RA.rotateAngleZ;
            this.Rarm.rotateAngleY = this.RA.rotateAngleY;
            this.Rarm.rotateAngleX = this.RA.rotateAngleX;
            this.body.rotationPointZ = this.B.rotationPointZ;
            this.body.rotationPointY = this.B.rotationPointY;
            this.body.rotationPointX = this.B.rotationPointX;
            this.body.rotateAngleZ = this.B.rotateAngleZ;
            this.body.rotateAngleY = this.B.rotateAngleY;
            this.body.rotateAngleX = this.B.rotateAngleX;
            if (y != 1) {
                float s = 0.0f;
                float s2 = MathHelper.cos((float)(par1 * 0.6662f)) * 1.0f * par2;
                float s3 = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.0f * par2;
                this.tail.rotateAngleX = (s3 + s > s ? s3 + s : (s2 + s > s ? s2 + s : s)) + 0.1f;
            } else {
                float s = 0.0f;
                float s2 = MathHelper.cos((float)(par1 * 0.6662f)) * 1.0f * par2;
                float s3 = MathHelper.cos((float)(par1 * 0.6662f + (float)Math.PI)) * 1.0f * par2;
                this.tail.rotateAngleX = (s3 + s > s ? s3 + s : (s2 + s > s ? s2 + s : s)) * 2.0f + 0.1f;
            }
        } else if (this.id == 1) {
            float ff1 = 1.0f;
            this.Rleg.rotationPointZ = this.RL.rotationPointZ * ff1;
            this.Rleg.rotationPointY = this.RL.rotationPointY * ff1;
            this.Rleg.rotationPointX = this.RL.rotationPointX * ff1;
            this.Rleg.rotateAngleZ = this.RL.rotateAngleZ * ff1;
            this.Rleg.rotateAngleY = this.RL.rotateAngleY * ff1;
            this.Rleg.rotateAngleX = this.RL.rotateAngleX * ff1;
            this.Lleg.rotationPointZ = this.LL.rotationPointZ * ff1;
            this.Lleg.rotationPointY = this.LL.rotationPointY * ff1;
            this.Lleg.rotationPointX = this.LL.rotationPointX * ff1;
            this.Lleg.rotateAngleZ = this.LL.rotateAngleZ * ff1;
            this.Lleg.rotateAngleY = this.LL.rotateAngleY * ff1;
            this.Lleg.rotateAngleX = this.LL.rotateAngleX * ff1;
        } else if (this.id == 2 || this.id == 3 || this.id == 4) {
            // empty if block
        }
    }
}

