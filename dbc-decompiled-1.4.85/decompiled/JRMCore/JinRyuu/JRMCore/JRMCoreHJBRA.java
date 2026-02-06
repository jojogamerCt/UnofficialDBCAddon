/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.FamilyC.FamilyCConfig
 *  JinRyuu.JBRA.DBC_GiTurtleMdl
 *  JinRyuu.JBRA.GiTurtleMdl
 *  JinRyuu.JBRA.JRMC_GiTurtleMdl
 *  JinRyuu.JBRA.NC_GiTurtleMdl
 *  JinRyuu.JYearsC.JYearsCConfig
 *  net.minecraft.client.model.ModelBiped
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.ItemStack
 */
package JinRyuu.JRMCore;

import JinRyuu.FamilyC.FamilyCConfig;
import JinRyuu.JBRA.DBC_GiTurtleMdl;
import JinRyuu.JBRA.GiTurtleMdl;
import JinRyuu.JBRA.JRMC_GiTurtleMdl;
import JinRyuu.JBRA.NC_GiTurtleMdl;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHJFC;
import JinRyuu.JRMCore.JRMCoreHJYC;
import JinRyuu.JRMCore.JRMCoreHSAC;
import JinRyuu.JRMCore.entity.ModelBipedBody;
import JinRyuu.JRMCore.entity.ModelKB;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.m.mEnergy5;
import JinRyuu.JYearsC.JYearsCConfig;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;

public class JRMCoreHJBRA {
    public static final ModelBiped GiTurtleMdl1 = new GiTurtleMdl(0.201f);
    public static final ModelBiped GiTurtleMdl2 = new GiTurtleMdl(0.11f);
    public static final ModelBiped GiTurtleMdl3 = new GiTurtleMdl(0.056f);
    public static final ModelBiped GiTurtleMdl4 = new ModelBipedBody(0.198f);
    public static final ModelBiped GiTurtleMdl5 = new ModelBipedBody(0.5f);
    public static final ModelBiped GiTurtleMdl3_1 = new GiTurtleMdl(0.056f);
    public static final ModelBiped[] JRMC_GiTurtleMdl2 = new ModelBiped[]{new JRMC_GiTurtleMdl(0), new JRMC_GiTurtleMdl(1), new JRMC_GiTurtleMdl(2), new JRMC_GiTurtleMdl(3), new JRMC_GiTurtleMdl(4)};
    public static final ModelBiped[] DBC_GiTurtleMdl2 = new ModelBiped[]{new DBC_GiTurtleMdl(0), new DBC_GiTurtleMdl(1), new DBC_GiTurtleMdl(2), new DBC_GiTurtleMdl(3), new DBC_GiTurtleMdl(4)};
    public static final ModelBiped[] NC_GiTurtleMdl2 = new ModelBiped[]{new NC_GiTurtleMdl(0), new NC_GiTurtleMdl(1)};
    public static final mEnergy5 model1 = new mEnergy5();
    public static final ModelKB model2 = new ModelKB();

    public static final ModelBiped ModelBipedBody(float s) {
        return new ModelBipedBody(s);
    }

    private static int JFCgetConfigpt() {
        return FamilyCConfig.pt;
    }

    private static float JYCgetConfigpgut() {
        return JYearsCConfig.pgut;
    }

    public static ModelBiped showModel(ModelBiped m, EntityLivingBase entityLiving, ItemStack is, int par2) {
        ModelBipedBody mdl = (ModelBipedBody)m;
        JRMCoreHJBRA.modelHelper(entityLiving, mdl);
        if (JRMCoreH.JFC()) {
            JRMCoreHJFC.modelHelper(entityLiving, mdl);
        }
        boolean bl = mdl.bipedHead.showModel = par2 == 0 || par2 == 5;
        if (par2 == 5) {
            par2 = 1;
        }
        if (ModelBipedBody.g >= 2) {
            mdl.body.showModel = par2 == 1 || par2 == 2 || par2 == 4;
            mdl.hip.showModel = par2 == 1 || par2 == 2 || par2 == 4;
            mdl.hip2.showModel = par2 == 1 || par2 == 2 || par2 == 4;
            mdl.waist.showModel = par2 == 1 || par2 == 2 || par2 == 4;
            mdl.bottom.showModel = par2 == 1 || par2 == 2 || par2 == 4;
            mdl.bottom2.showModel = par2 == 1 || par2 == 2 || par2 == 4;
            mdl.Bbreast.showModel = par2 == 1 || par2 == 2 || par2 == 4;
            mdl.Bbreast2.showModel = par2 == 1 || par2 == 2 || par2 == 4;
            mdl.Brightarm.showModel = par2 == 1 || par2 == 4;
            mdl.Bleftarm.showModel = par2 == 1 || par2 == 4;
            mdl.rightleg.showModel = par2 == 2 || par2 == 3 || par2 == 4;
            mdl.leftleg.showModel = par2 == 2 || par2 == 3 || par2 == 4;
        } else {
            mdl.bipedBody.showModel = par2 == 1 || par2 == 2 || par2 == 4;
            mdl.bipedRightArm.showModel = par2 == 1 || par2 == 4;
            mdl.bipedLeftArm.showModel = par2 == 1 || par2 == 4;
            mdl.bipedRightLeg.showModel = par2 == 2 || par2 == 3 || par2 == 4;
            mdl.bipedLeftLeg.showModel = par2 == 2 || par2 == 3 || par2 == 4;
        }
        mdl.isSneak = entityLiving.isSneaking();
        mdl.onGround = 0.0f;
        mdl.isRiding = entityLiving.isRiding();
        mdl.isChild = entityLiving.isChild();
        mdl.isSneak = entityLiving.isSneaking();
        return mdl;
    }

    private static void modelHelper(EntityLivingBase entityLiving, ModelBipedBody mdl) {
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer ply = (EntityPlayer)entityLiving;
            float childScl = 1.0f;
            float age = 0.0f;
            int gen = 1;
            int preg = 0;
            int breast = 0;
            if (JRMCoreH.JYC()) {
                age = JRMCoreHJYC.JYCAge(ply);
                childScl = JRMCoreHJYC.JYCsizeBasedOnAge(ply);
                childScl = 3.0f - childScl * 2.0f;
            }
            if (JRMCoreH.JFC()) {
                Object dns;
                Object s;
                if (JRMCoreH.dnn(1) && JRMCoreH.dnn(2)) {
                    int pwr;
                    s = JRMCoreH.data(ply.getCommandSenderName(), 1, "0;0;0;0;0;0").split(";");
                    dns = s[1];
                    int A = JRMCoreH.dnsGender((String)dns) + 1;
                    if (A >= 1) {
                        gen = 1;
                    }
                    if (A == 2) {
                        gen = 2;
                    }
                    if (A == 3) {
                        gen = 3;
                    }
                    if ((pwr = Integer.parseInt((String)s[2])) == 1 && A > 1) {
                        boolean saiOozar;
                        int State2;
                        int race = Integer.parseInt((String)s[0]);
                        String[] dummy = new String[]{"0", "0", "0"};
                        String[] state = JRMCoreH.data(ply.getCommandSenderName(), 2, "0;0;0").split(";");
                        int n = State2 = pwr == 2 || race == 0 ? 0 : Integer.parseInt(state[0]);
                        boolean bl = JRMCoreH.rSai(race) ? State2 == 7 || State2 == 8 : (saiOozar = false);
                        if (saiOozar) {
                            gen = 1;
                        }
                    }
                }
                if (JRMCoreH.dnn(30) && !ply.isInvisible() && JRMCoreH.dnn(30)) {
                    s = JRMCoreH.data(ply.getCommandSenderName(), 30, "0");
                    int i = ((String)s).matches("[0-9]+") ? Integer.parseInt((String)s) : 0;
                    int def = JRMCoreHJBRA.JFCgetConfigpt() * 120;
                    if (i > 1) {
                        preg = (int)(((float)i - (float)def / 2.0f) / ((float)def / 2.0f * 0.01f));
                        preg = (preg = 100 - preg) > 100 ? 100 : (preg < 0 ? 0 : preg);
                    } else {
                        preg = 0;
                    }
                }
                if (JRMCoreH.dnn(1) && JRMCoreH.dnn(2)) {
                    s = JRMCoreH.data(ply.getCommandSenderName(), 1, "0;0;0;0;0;0").split(";");
                    dns = s[1];
                    breast = JRMCoreH.dnsBreast((String)dns);
                }
            }
            ModelBipedBody.g = gen;
            ModelBipedBody.f = childScl;
            ModelBipedBody.p = preg;
            mdl.b = breast;
            ExtendedPlayer props = ExtendedPlayer.get(ply);
            boolean block = props.getBlocking() == 1;
            boolean instantTransmissionOn = props.getBlocking() == 2;
            int kishoot = props.getAnimKiShoot();
            mdl.blk = block;
            mdl.instantTransmission = instantTransmissionOn;
            mdl.KiAttack = kishoot;
            ItemStack var11 = ply.inventory.getCurrentItem();
            int n = mdl.heldItemRight = var11 != null ? JRMCoreHSAC.ah(var11.getItem(), 1) : 0;
            if (var11 != null && ply.getItemInUseCount() > 0) {
                EnumAction var12 = var11.getItemUseAction();
                if (var12 == EnumAction.block) {
                    mdl.heldItemRight = 3;
                } else if (var12 == EnumAction.bow) {
                    mdl.aimedBow = true;
                }
            }
        }
    }
}

