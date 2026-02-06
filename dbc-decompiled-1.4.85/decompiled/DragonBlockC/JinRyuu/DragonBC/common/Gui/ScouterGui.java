/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.i.ExtendedPlayer
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityClientPlayerMP
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiIngame
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityCreature
 *  net.minecraft.entity.monster.EntityBlaze
 *  net.minecraft.entity.monster.EntityCaveSpider
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.entity.monster.EntityGhast
 *  net.minecraft.entity.monster.EntityGiantZombie
 *  net.minecraft.entity.monster.EntityMagmaCube
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.monster.EntityPigZombie
 *  net.minecraft.entity.monster.EntitySilverfish
 *  net.minecraft.entity.monster.EntitySkeleton
 *  net.minecraft.entity.monster.EntitySlime
 *  net.minecraft.entity.monster.EntitySpider
 *  net.minecraft.entity.monster.EntityWitch
 *  net.minecraft.entity.monster.EntityZombie
 *  net.minecraft.entity.passive.EntityWolf
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.Vec3
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.DragonBC.common.Blocks.DBCMaterial;
import JinRyuu.DragonBC.common.DBCClient;
import JinRyuu.DragonBC.common.DBCClientTickHandler;
import JinRyuu.DragonBC.common.DBCKiAttacks;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDBC;
import JinRyuu.DragonBC.common.Npcs.EntityHell01;
import JinRyuu.DragonBC.common.Npcs.EntityHell02;
import JinRyuu.DragonBC.common.Npcs.EntityMasterEnma;
import JinRyuu.DragonBC.common.Npcs.EntityNamekian01;
import JinRyuu.DragonBC.common.Npcs.EntitySaiyan01;
import JinRyuu.DragonBC.common.Npcs.EntitySaiyan02;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.GL11;

public class ScouterGui
extends Gui {
    protected FontRenderer fontRenderer;
    private Minecraft mc;
    private DBCClientTickHandler tick;
    private GuiIngame Guiingame;
    public static int count = 0;
    public static int warn = 0;
    public static int startcount = 0;
    public static int soundFunc2 = 0;
    int otherPlayerValue;
    public static int soundFunc3 = 0;
    protected String entiBP;
    protected String entiLoc;
    private String textureFile;

    public ScouterGui() {
        this.fontRenderer = DBCClient.mc.fontRenderer;
        this.mc = DBCClient.mc;
        this.otherPlayerValue = 0;
        this.entiBP = "\u00a7e";
        this.entiLoc = "\u00a7e";
        this.textureFile = "jinryuudragonbc:misc/scouterjelzo.png";
    }

    public void initGui() {
    }

    public void ScFunctionsInit(int var6, int var7, int Tier) {
        this.ScouterRenderBlur(var6, var7);
        if (DBCClientTickHandler.ScFunc00 == 1) {
            this.ScouterIntro(var6, var7, Tier);
            this.textureFile = "jinryuudragonbc:misc/intro.png";
            this.ScouterRenderBlur(var6, var7);
        }
        if (DBCClientTickHandler.ScFunc01 == 1) {
            this.ScouterFunction1(var6, var7, Tier);
            this.textureFile = "jinryuudragonbc:misc/func1.png";
            this.ScouterRenderBlur(var6, var7);
        }
        if (DBCClientTickHandler.ScFunc02 == 1) {
            this.ScouterFunc2(var6, var7, Tier);
            this.textureFile = "jinryuudragonbc:misc/func2.png";
            this.ScouterRenderBlur(var6, var7);
        }
        if (DBCClientTickHandler.ScFunc03 == 1) {
            this.ScouterFunc3(var6, var7, Tier);
            this.textureFile = "jinryuudragonbc:misc/func3.png";
            this.ScouterRenderBlur(var6, var7);
        }
        if (DBCClientTickHandler.ScFunc04 == 1) {
            this.ScouterFunc2MP(var6, var7, Tier);
            this.textureFile = "jinryuudragonbc:misc/func2mp.png";
            this.ScouterRenderBlur(var6, var7);
        }
        if (DBCClientTickHandler.ScFunc05 == 1) {
            this.ScouterFunc3MP(var6, var7, Tier);
            this.textureFile = "jinryuudragonbc:misc/func3mp.png";
            this.ScouterRenderBlur(var6, var7);
        }
    }

    public void renderKAC1() {
        ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = this.mc.fontRenderer;
        this.mc.entityRenderer.setupOverlayRendering();
        this.textureFile = "jinryuudragonbc:misc/KAC1.png";
        this.ScouterRenderBlur(var6, var7);
    }

    public void renderKAC2() {
        ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = this.mc.fontRenderer;
        this.mc.entityRenderer.setupOverlayRendering();
        this.textureFile = "jinryuudragonbc:misc/KAC2.png";
        this.ScouterRenderBlur(var6, var7);
    }

    public void renderKAC3() {
        ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = this.mc.fontRenderer;
        this.mc.entityRenderer.setupOverlayRendering();
        this.textureFile = "jinryuudragonbc:misc/KAC3.png";
        this.ScouterRenderBlur(var6, var7);
    }

    public void renderKAC4() {
        ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = this.mc.fontRenderer;
        this.mc.entityRenderer.setupOverlayRendering();
        this.textureFile = "jinryuudragonbc:misc/KAC4.png";
        this.ScouterRenderBlur(var6, var7);
    }

    public void renderKAC5() {
        ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = this.mc.fontRenderer;
        this.mc.entityRenderer.setupOverlayRendering();
        this.textureFile = "jinryuudragonbc:misc/KAC5.png";
        this.ScouterRenderBlur(var6, var7);
    }

    public void renderScouter() {
        ItemStack stackhead;
        ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = this.mc.fontRenderer;
        this.mc.entityRenderer.setupOverlayRendering();
        ItemStack var9s = stackhead = ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).inventory.getStackInSlot(2);
        if (var9s != null) {
            Item var9 = var9s.getItem();
            int Tier = 0;
            if (JRMCoreH.armTypScoutOn((ItemStack)var9s)) {
                Tier = 1;
            }
            if (JRMCoreH.armTypScoutAOn((ItemStack)var9s)) {
                Tier = 2;
            }
            if (JRMCoreH.armTypScoutBOn((ItemStack)var9s)) {
                Tier = 3;
            }
            if (var9 == ItemsDBC.BattleArmorHelmet00 || var9 == ItemsDBC.BattleArmorHelmet00a || var9 == ItemsDBC.BattleArmorHelmet00b) {
                this.textureFile = "jinryuudragonbc:misc/scoutery0.png";
                this.ScFunctionsInit(var6, var7, Tier);
            }
            if (var9 == ItemsDBC.BattleArmorHelmet01 || var9 == ItemsDBC.BattleArmorHelmet01a || var9 == ItemsDBC.BattleArmorHelmet01b) {
                this.textureFile = "jinryuudragonbc:misc/scouterr0.png";
                this.ScFunctionsInit(var6, var7, Tier);
            }
            if (var9 == ItemsDBC.BattleArmorHelmet02 || var9 == ItemsDBC.BattleArmorHelmet02a || var9 == ItemsDBC.BattleArmorHelmet02b) {
                this.textureFile = "jinryuudragonbc:misc/scouterp0.png";
                this.ScFunctionsInit(var6, var7, Tier);
            }
            if (var9 == ItemsDBC.BattleArmorHelmet03 || var9 == ItemsDBC.BattleArmorHelmet03a || var9 == ItemsDBC.BattleArmorHelmet03b) {
                this.textureFile = "jinryuudragonbc:misc/scouterb0.png";
                this.ScFunctionsInit(var6, var7, Tier);
            }
            if (var9 == ItemsDBC.BattleArmorHelmet04 || var9 == ItemsDBC.BattleArmorHelmet04a || var9 == ItemsDBC.BattleArmorHelmet04b) {
                this.textureFile = "jinryuudragonbc:misc/scouterg0.png";
                this.ScFunctionsInit(var6, var7, Tier);
            }
            if (var9 == ItemsDBC.BattleArmorHelmet05 || var9 == ItemsDBC.BattleArmorHelmet05a || var9 == ItemsDBC.BattleArmorHelmet05b) {
                this.textureFile = "jinryuudragonbc:misc/scouterpi0.png";
                this.ScFunctionsInit(var6, var7, Tier);
            }
            if (JRMCoreH.armTypScoutAllOn((ItemStack)var9s)) {
                if (var9.getDamage(var9s) > 100) {
                    this.textureFile = "jinryuudragonbc:misc/crack1.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (var9.getDamage(var9s) > 160) {
                    this.textureFile = "jinryuudragonbc:misc/crack2.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (var9.getDamage(var9s) > 210) {
                    this.textureFile = "jinryuudragonbc:misc/crack3.png";
                    this.ScouterRenderBlur(var6, var7);
                }
            }
        }
        double MXZ = 8.0;
        double MY = 8.0;
        double XZ = 32.0;
        double Y = 32.0;
        double XZ1 = 16.0;
        double Y1 = 16.0;
        double XZ2 = 12.0;
        double Y2 = 12.0;
        double XZ3 = 4.0;
        double Y3 = 4.0;
        double XZ4 = 2.0;
        double Y4 = 2.0;
    }

    public void ScouterFunction1(int var6, int var7, int Tier) {
        double MXZ = 8.0 * (double)Tier;
        double MY = 8.0 * (double)Tier;
        double M2XZ = 8.0 * (double)Tier;
        double M2Y = 8.0 * (double)Tier;
        double XZ = 32.0 * (double)Tier;
        double Y = 32.0 * (double)Tier;
        double XZ1 = 16.0 * (double)Tier;
        double Y1 = 16.0 * (double)Tier;
        double XZ2 = 12.0 * (double)Tier;
        double Y2 = 12.0 * (double)Tier;
        double XZ3 = 4.0 * (double)Tier;
        double Y3 = 4.0 * (double)Tier;
        double XZ4 = 2.0 * (double)Tier;
        double Y4 = 2.0 * (double)Tier;
        double AXZ = 32.0 * (double)Tier;
        double AY = 16.0 * (double)Tier;
        double par12 = this.mc.thePlayer.posX;
        double par22 = this.mc.thePlayer.posY;
        double par32 = this.mc.thePlayer.posZ;
        double par42 = this.mc.thePlayer.rotationYaw;
        float par52 = this.mc.thePlayer.rotationPitch;
        AxisAlignedBB AABB = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - MY), (double)(par32 - MXZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + MXZ));
        AxisAlignedBB AABBAll = AxisAlignedBB.getBoundingBox((double)(par12 - AXZ), (double)(par22 - AY), (double)(par32 - AXZ), (double)(par12 + AXZ), (double)(par22 + AY), (double)(par32 + AXZ));
        AxisAlignedBB AABBfent = AxisAlignedBB.getBoundingBox((double)(par12 - XZ4), (double)(par22 - Y4), (double)(par32 - XZ4), (double)(par12 + XZ4), (double)(par22 + Y1), (double)(par32 + XZ4));
        AxisAlignedBB AABBlent = AxisAlignedBB.getBoundingBox((double)(par12 - XZ4), (double)(par22 - Y1), (double)(par32 - XZ4), (double)(par12 + XZ4), (double)(par22 + Y4), (double)(par32 + XZ4));
        Class<EntityCreature> mobok = EntityCreature.class;
        Class<EntityBlaze> b = EntityBlaze.class;
        Class<EntityCaveSpider> c = EntityCaveSpider.class;
        Class<EntityCreeper> a = EntityCreeper.class;
        Class<EntityZombie> z = EntityZombie.class;
        Class<EntityGiantZombie> z2 = EntityGiantZombie.class;
        Class<EntityPigZombie> z3 = EntityPigZombie.class;
        Class<EntityGhast> g = EntityGhast.class;
        Class<EntityMagmaCube> m = EntityMagmaCube.class;
        Class<EntitySilverfish> i = EntitySilverfish.class;
        Class<EntitySkeleton> k = EntitySkeleton.class;
        Class<EntitySlime> l = EntitySlime.class;
        Class<EntitySpider> p = EntitySpider.class;
        Class<EntityPlayerMP> j = EntityPlayerMP.class;
        Class<EntityWitch> w = EntityWitch.class;
        Class<EntityEnderman> h = EntityEnderman.class;
        List korul = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok, AxisAlignedBB.getBoundingBox((double)(par12 - XZ1), (double)(par22 - Y4), (double)(par32 - XZ1), (double)(par12 + XZ1), (double)(par22 + Y4), (double)(par32 + XZ1)));
        List fent = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok, AABBfent);
        List lent = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok, AABBlent);
        List sarok = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok, AxisAlignedBB.getBoundingBox((double)(par12 - XZ2), (double)(par22 - Y2), (double)(par32 - XZ2), (double)(par12 + XZ2), (double)(par22 + Y2), (double)(par32 + XZ2)));
        List blaz = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(b, AABB);
        List cavs = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(c, AABB);
        List cree = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(a, AABB);
        List zomb = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(z, AABB);
        List zomv = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(z2, AABB);
        List zomp = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(z3, AABB);
        List ghas = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(g, AxisAlignedBB.getBoundingBox((double)(par12 - M2XZ), (double)(par22 - M2Y), (double)(par32 - M2XZ), (double)(par12 + M2XZ), (double)(par22 + M2Y), (double)(par32 + M2XZ)));
        List magm = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(m, AABB);
        List silv = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(i, AABB);
        List skel = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(k, AABB);
        List slim = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(l, AABB);
        List spid = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(p, AABB);
        List play = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(j, AABB);
        List witc = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(w, AABB);
        List ende = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(h, AABB);
        if (!sarok.isEmpty()) {
            this.textureFile = "jinryuudragonbc:misc/scouterjelzo.png";
            this.ScouterRenderBlur(var6, var7);
            warn = 1;
            Class<EntityCreature> mobok1 = EntityCreature.class;
            List mobListAll = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok1, AABBAll);
            List mobListfent = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok1, AABBfent);
            List mobListlent = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok1, AABBlent);
            Entity mobAll = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(mobok1, AABBAll, (Entity)this.mc.thePlayer);
            Entity mobfent = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(mobok1, AABBfent, (Entity)this.mc.thePlayer);
            Entity moblent = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(mobok1, AABBlent, (Entity)this.mc.thePlayer);
            if (!mobListAll.isEmpty()) {
                double var301;
                double var30;
                double var28 = mobAll.posX - par12;
                double var32 = mobAll.posZ - par32;
                double var27 = 0.0;
                double field_76868_i = var27 = (par42 - 90.0) * Math.PI / 180.0 - Math.atan2(var32, var28);
                double field_76866_j = 0.0;
                for (var30 = var27 - field_76868_i; var30 < -Math.PI; var30 += Math.PI * 2) {
                }
                while (var30 >= Math.PI) {
                    var30 -= Math.PI * 2;
                }
                if (var30 < -1.0) {
                    var30 = -1.0;
                }
                if (var30 > 1.0) {
                    var30 = 1.0;
                }
                field_76866_j += var30 * 0.1;
                var30 = Math.sin(field_76868_i += (field_76866_j *= 0.8));
                double var31 = Math.cos(field_76868_i);
                double var421 = mobAll.posY - par22 + 1.0;
                float par421 = par52;
                double dist = this.mc.thePlayer.getDistanceToEntity(mobAll);
                double var271 = 0.0;
                double field_76868_i1 = var271 = (double)par421 * Math.PI / 180.0 - Math.atan2(dist, var421);
                double field_76866_j1 = 0.0;
                for (var301 = var271 - field_76868_i1; var301 < -Math.PI; var301 += Math.PI * 2) {
                }
                while (var301 >= Math.PI) {
                    var301 -= Math.PI * 2;
                }
                if (var301 < -1.0) {
                    var301 = -1.0;
                }
                if (var301 > 1.0) {
                    var301 = 1.0;
                }
                field_76866_j1 += var301 * 0.1;
                var301 = Math.sin(field_76868_i1 += (field_76866_j1 *= 0.8));
                double var311 = Math.cos(field_76868_i1);
                if (var31 < -0.5) {
                    this.textureFile = "jinryuudragonbc:misc/eszak.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (var31 > 0.5) {
                    this.textureFile = "jinryuudragonbc:misc/del.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (var30 < -0.5) {
                    this.textureFile = "jinryuudragonbc:misc/bal.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (var30 > 0.5) {
                    this.textureFile = "jinryuudragonbc:misc/jobb.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (var311 > 0.1) {
                    this.textureFile = "jinryuudragonbc:misc/scouterfent.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (var311 < -0.1) {
                    this.textureFile = "jinryuudragonbc:misc/scouterlent.png";
                    this.ScouterRenderBlur(var6, var7);
                }
            }
            if (!blaz.isEmpty()) {
                this.textureFile = "jinryuudragonbc:misc/scouterB.png";
                this.ScouterRenderBlur(var6, var7);
            }
            if (!cavs.isEmpty()) {
                this.textureFile = "jinryuudragonbc:misc/scouterC.png";
                this.ScouterRenderBlur(var6, var7);
            }
            if (!cree.isEmpty()) {
                this.textureFile = "jinryuudragonbc:misc/scouterA.png";
                this.ScouterRenderBlur(var6, var7);
                this.textureFile = "jinryuudragonbc:misc/scouteregyeb.png";
                this.ScouterRenderBlur(var6, var7);
            }
            if (!(zomb.isEmpty() && zomv.isEmpty() && zomp.isEmpty())) {
                this.textureFile = "jinryuudragonbc:misc/scouterZ.png";
                this.ScouterRenderBlur(var6, var7);
            }
            if (!magm.isEmpty()) {
                this.textureFile = "jinryuudragonbc:misc/scouterM.png";
                this.ScouterRenderBlur(var6, var7);
            }
            if (!silv.isEmpty()) {
                this.textureFile = "jinryuudragonbc:misc/scouterI.png";
                this.ScouterRenderBlur(var6, var7);
            }
            if (!skel.isEmpty()) {
                this.textureFile = "jinryuudragonbc:misc/scouterK.png";
                this.ScouterRenderBlur(var6, var7);
            }
            if (!spid.isEmpty()) {
                this.textureFile = "jinryuudragonbc:misc/scouterP.png";
                this.ScouterRenderBlur(var6, var7);
            }
            if (!play.isEmpty()) {
                this.textureFile = "jinryuudragonbc:misc/scouterJ.png";
                this.ScouterRenderBlur(var6, var7);
                count = 1;
            }
            if (!witc.isEmpty()) {
                this.textureFile = "jinryuudragonbc:misc/scouterW.png";
                this.ScouterRenderBlur(var6, var7);
            }
            if (!ende.isEmpty()) {
                this.textureFile = "jinryuudragonbc:misc/scouterH.png";
                this.ScouterRenderBlur(var6, var7);
            }
        }
        if (!slim.isEmpty()) {
            this.textureFile = "jinryuudragonbc:misc/scouterL.png";
            this.ScouterRenderBlur(var6, var7);
            startcount = 1;
        }
        if (!ghas.isEmpty()) {
            this.textureFile = "jinryuudragonbc:misc/scouterG.png";
            this.ScouterRenderBlur(var6, var7);
            startcount = 1;
        }
        if (sarok.isEmpty()) {
            warn = 0;
            count = 0;
            startcount = 0;
        }
    }

    public void ScouterSearch(int var6, int var7) {
    }

    public void ScouterFunc2(int var6, int var7, int Tier) {
        Class<?> EntityClass;
        double MXZ = 16.0 * (double)Tier;
        double MY = 2.0 * (double)Tier;
        double M2XZ = 2.0 * (double)Tier;
        double M2Y = 16.0 * (double)Tier;
        double AXZ = 32.0 * (double)Tier;
        double AY = 16.0 * (double)Tier;
        double GXZ = 32.0 * (double)Tier;
        double GY = 32.0 * (double)Tier;
        double par12 = this.mc.thePlayer.posX;
        double par22 = this.mc.thePlayer.posY;
        double par32 = this.mc.thePlayer.posZ;
        double par42 = this.mc.thePlayer.rotationYaw;
        AxisAlignedBB AABBAll = AxisAlignedBB.getBoundingBox((double)(par12 - AXZ), (double)(par22 - AY), (double)(par32 - AXZ), (double)(par12 + AXZ), (double)(par22 + AY), (double)(par32 + AXZ));
        AxisAlignedBB AABB = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - MY), (double)(par32 - MXZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + MXZ));
        AxisAlignedBB AABBNear = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - M2Y), (double)(par32 - MXZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + MXZ));
        Class n = EntityMob.class;
        Class<EntityNamekian01> nam = EntityNamekian01.class;
        Class<EntitySaiyan01> sa01 = EntitySaiyan01.class;
        Class<EntitySaiyan02> sa02 = EntitySaiyan02.class;
        Class<EntityHell01> he01 = EntityHell01.class;
        Class<EntityHell02> he02 = EntityHell02.class;
        Class<EntityMasterEnma> enm = EntityMasterEnma.class;
        Class<EntityCreature> mobok = EntityCreature.class;
        List mobListAll = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok, AABBAll);
        Entity mobAll = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(mobok, AABBAll, (Entity)this.mc.thePlayer);
        if (!mobListAll.isEmpty()) {
            EntityClass = mobAll.getClass();
            if (EntityClass == nam) {
                n = nam;
            }
            if (EntityClass == sa01) {
                n = sa01;
            }
            if (EntityClass == sa02) {
                n = sa02;
            }
            if (EntityClass == he01) {
                n = he01;
            }
            if (EntityClass == he02) {
                n = he02;
            }
            if (EntityClass == enm) {
                n = enm;
            }
        }
        if (!mobListAll.isEmpty()) {
            String entiNamStr;
            EntityClass = mobAll.getClass();
            soundFunc2 = 1;
            double entiNam = this.mc.thePlayer.getDistanceSqToEntity(mobAll);
            int entiNamInt = (int)entiNam;
            ((Object)((Object)this)).toString();
            this.entiLoc = entiNamStr = String.valueOf(entiNamInt);
            this.textureFile = "jinryuudragonbc:misc/tavolsag.png";
            this.ScouterRenderBlur(var6, var7);
            this.Func2TAV();
        }
    }

    public void ScouterFunc3(int var6, int var7, int Tier) {
        Vec3 look = this.mc.thePlayer.getLookVec();
        double MXZ = 16.0 * (double)Tier;
        double MY = 2.0 * (double)Tier;
        double M2XZ = 2.0 * (double)Tier;
        double M2Y = 16.0 * (double)Tier;
        double par12 = this.mc.thePlayer.posX;
        double par22 = this.mc.thePlayer.posY;
        double par32 = this.mc.thePlayer.posZ;
        double par42 = this.mc.thePlayer.rotationYaw;
        AxisAlignedBB AABBX0 = AxisAlignedBB.getBoundingBox((double)(par12 - M2XZ), (double)(par22 - MY), (double)(par32 - MXZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + MXZ));
        AxisAlignedBB AABBX1 = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - MY), (double)(par32 - MXZ), (double)(par12 + M2XZ), (double)(par22 + MY), (double)(par32 + MXZ));
        AxisAlignedBB AABBZ0 = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - MY), (double)(par32 - M2XZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + MXZ));
        AxisAlignedBB AABBZ1 = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - MY), (double)(par32 - MXZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + M2XZ));
        AxisAlignedBB AABBY0 = AxisAlignedBB.getBoundingBox((double)(par12 - M2XZ), (double)(par22 - M2Y), (double)(par32 - M2XZ), (double)(par12 + M2XZ), (double)(par22 + MY), (double)(par32 + M2XZ));
        AxisAlignedBB AABBY1 = AxisAlignedBB.getBoundingBox((double)(par12 - M2XZ), (double)(par22 - MY), (double)(par32 - M2XZ), (double)(par12 + M2XZ), (double)(par22 + M2Y), (double)(par32 + M2XZ));
        AxisAlignedBB AABBNear = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - M2Y), (double)(par32 - MXZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + MXZ));
        Class<EntityBlaze> b = EntityBlaze.class;
        Class<EntityCaveSpider> c = EntityCaveSpider.class;
        Class<EntityCreeper> a = EntityCreeper.class;
        Class<EntityZombie> z = EntityZombie.class;
        Class<EntityGiantZombie> z2 = EntityGiantZombie.class;
        Class<EntityPigZombie> z3 = EntityPigZombie.class;
        Class<EntityGhast> g = EntityGhast.class;
        Class<EntityMagmaCube> m = EntityMagmaCube.class;
        Class<EntitySilverfish> i = EntitySilverfish.class;
        Class<EntitySkeleton> k = EntitySkeleton.class;
        Class<EntitySlime> l = EntitySlime.class;
        Class<EntitySpider> p = EntitySpider.class;
        Class<EntityPlayerMP> j = EntityPlayerMP.class;
        Class<EntityWitch> w = EntityWitch.class;
        Class<EntityEnderman> h = EntityEnderman.class;
        Class<EntityMob> n = EntityMob.class;
        Class<EntityMob> n2 = EntityMob.class;
        Class<EntityCreature> mobok = EntityCreature.class;
        List mobNear = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok, AABBNear);
        Entity entMobok = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(mobok, AABBNear, (Entity)this.mc.thePlayer);
        if (!mobNear.isEmpty()) {
            Class<?> EntityClass = entMobok.getClass();
            if (EntityClass == b) {
                n2 = b;
            }
            if (EntityClass == c) {
                n2 = c;
            }
            if (EntityClass == a) {
                n2 = a;
            }
            if (EntityClass == z) {
                n2 = z;
            }
            if (EntityClass == z2) {
                n2 = z2;
            }
            if (EntityClass == z3) {
                n2 = z3;
            }
            if (EntityClass == g) {
                n2 = g;
            }
            if (EntityClass == m) {
                n2 = m;
            }
            if (EntityClass == i) {
                n2 = i;
            }
            if (EntityClass == k) {
                n2 = k;
            }
            if (EntityClass == l) {
                n2 = l;
            }
            if (EntityClass == p) {
                n2 = p;
            }
            if (EntityClass == j) {
                n2 = j;
            }
            if (EntityClass == w) {
                n2 = w;
            }
            if (EntityClass == h) {
                n2 = h;
            }
        }
        List nameX0 = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(n, AABBX0);
        List nameX1 = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(n, AABBX1);
        List nameZ0 = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(n, AABBZ0);
        List nameZ1 = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(n, AABBZ1);
        List nameY0 = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(n, AABBY0);
        List nameY1 = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(n, AABBY1);
        Entity namek = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(n, AABBNear, (Entity)this.mc.thePlayer);
        if (!mobNear.isEmpty()) {
            List mobListAll = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok, AABBNear);
            List mobListfent = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok, AABBY1);
            List mobListlent = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok, AABBY0);
            Entity mobAll = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(mobok, AABBNear, (Entity)this.mc.thePlayer);
            Entity mobfent = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(mobok, AABBY1, (Entity)this.mc.thePlayer);
            Entity moblent = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(mobok, AABBY0, (Entity)this.mc.thePlayer);
            if (!mobListAll.isEmpty()) {
                double var30;
                double var28 = mobAll.posX - par12;
                double var32 = mobAll.posZ - par32;
                double var27 = 0.0;
                double field_76868_i = var27 = (par42 - 90.0) * Math.PI / 180.0 - Math.atan2(var32, var28);
                double field_76866_j = 0.0;
                for (var30 = var27 - field_76868_i; var30 < -Math.PI; var30 += Math.PI * 2) {
                }
                while (var30 >= Math.PI) {
                    var30 -= Math.PI * 2;
                }
                if (var30 < -1.0) {
                    var30 = -1.0;
                }
                if (var30 > 1.0) {
                    var30 = 1.0;
                }
                field_76866_j += var30 * 0.1;
                var30 = Math.sin(field_76868_i += (field_76866_j *= 0.8));
                double var31 = Math.cos(field_76868_i);
                if (var31 < -0.5) {
                    this.textureFile = "jinryuudragonbc:misc/BPeszak.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (var31 > 0.5) {
                    this.textureFile = "jinryuudragonbc:misc/BPdel.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (var30 < -0.5) {
                    this.textureFile = "jinryuudragonbc:misc/BPbal.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (var30 > 0.5) {
                    this.textureFile = "jinryuudragonbc:misc/BPjobb.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (!mobListfent.isEmpty()) {
                    this.textureFile = "jinryuudragonbc:misc/BPfent.png";
                    this.ScouterRenderBlur(var6, var7);
                }
                if (!mobListlent.isEmpty()) {
                    this.textureFile = "jinryuudragonbc:misc/BPlent.png";
                    this.ScouterRenderBlur(var6, var7);
                }
            }
        }
        String entiNam = "0";
        int exp = 0;
        Random rand = new Random();
        if (!mobNear.isEmpty()) {
            Entity dbc;
            Class<?> EntityClass = entMobok.getClass();
            if (EntityClass == null) {
                entiNam = "Error";
            }
            if (EntityClass == n2) {
                entiNam = "" + JRMCoreH.bpc((Entity)entMobok);
                warn = 1;
            }
            if (EntityClass != n2 && EntityClass != null) {
                exp = (int)(((EntityCreature)entMobok).getHealth() * 50.0f);
                warn = 1;
                if (exp <= 500 && EntityClass != EntityWolf.class) {
                    exp = (int)(((EntityCreature)entMobok).getHealth() / 2.0f);
                    warn = 0;
                }
                entiNam = "" + JRMCoreH.bpc((Entity)entMobok);
            }
            if ((dbc = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(EntityDBC.class, AABBNear, (Entity)this.mc.thePlayer)) instanceof EntityDBC) {
                entiNam = "" + JRMCoreH.bpc((Entity)dbc);
                warn = 1;
            }
        }
        if (!mobNear.isEmpty()) {
            soundFunc3 = 1;
            long s = Long.parseLong(entiNam);
            String bc = "" + JRMCoreH.numSepShort((long)s);
            entiNam = "" + bc;
            if (Tier == 1 && s > 10000L || Tier == 2 && s > 1000000L) {
                DBCKiAttacks.dbctick(-2);
                DBCKiAttacks.scouterRem((EntityPlayer)this.mc.thePlayer);
            }
            this.entiBP = bc;
            this.textureFile = "jinryuudragonbc:misc/battlepower.png";
            this.ScouterRenderBlur(var6, var7);
            this.Func3BP();
        }
        if (mobNear.isEmpty()) {
            warn = 0;
            count = 0;
            startcount = 0;
        }
    }

    public void ScouterFunc2MP(int var6, int var7, int Tier) {
        double MXZ = 16.0 * (double)Tier;
        double MY = 2.0 * (double)Tier;
        double M2XZ = 2.0 * (double)Tier;
        double M2Y = 16.0 * (double)Tier;
        double AXZ = 32.0 * (double)Tier;
        double AY = 16.0 * (double)Tier;
        double GXZ = 32.0 * (double)Tier;
        double GY = 32.0 * (double)Tier;
        double par12 = this.mc.thePlayer.posX;
        double par22 = this.mc.thePlayer.posY;
        double par32 = this.mc.thePlayer.posZ;
        AxisAlignedBB AABBAll = AxisAlignedBB.getBoundingBox((double)(par12 - AXZ), (double)(par22 - AY), (double)(par32 - AXZ), (double)(par12 + AXZ), (double)(par22 + AY), (double)(par32 + AXZ));
        AxisAlignedBB AABB = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - MY), (double)(par32 - MXZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + MXZ));
        AxisAlignedBB AABBNear = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - M2Y), (double)(par32 - MXZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + MXZ));
        Class<EntityPlayer> mobok = EntityPlayer.class;
        List mobListAll = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok, AABBAll);
        Entity mobAll = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(mobok, AABBAll, (Entity)this.mc.thePlayer);
        if (!mobListAll.isEmpty() && mobAll != null) {
            String entiNamStr;
            Class<?> EntityClass = mobAll.getClass();
            if (mobAll == this.mc.thePlayer) {
                return;
            }
            soundFunc2 = 1;
            double entiNam = this.mc.thePlayer.getDistanceSqToEntity(mobAll);
            int entiNamInt = (int)entiNam;
            ((Object)((Object)this)).toString();
            this.entiLoc = entiNamStr = String.valueOf(entiNamInt);
            this.Func2TAV();
            this.textureFile = "jinryuudragonbc:misc/tavolsag.png";
            this.ScouterRenderBlur(var6, var7);
        }
    }

    public void ScouterFunc3MP(int var6, int var7, int Tier) {
        double MXZ = 16.0 * (double)Tier;
        double M2Y = 16.0 * (double)Tier;
        double par12 = this.mc.thePlayer.posX;
        double par22 = this.mc.thePlayer.posY;
        double par32 = this.mc.thePlayer.posZ;
        AxisAlignedBB AABBNear = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - M2Y), (double)(par32 - MXZ), (double)(par12 + MXZ), (double)(par22 + M2Y), (double)(par32 + MXZ));
        Class<EntityPlayer> mobok = EntityPlayer.class;
        List mobNear = this.mc.thePlayer.worldObj.getEntitiesWithinAABB(mobok, AABBNear);
        Entity entMobok = this.mc.thePlayer.worldObj.findNearestEntityWithinAABB(mobok, AABBNear, (Entity)this.mc.thePlayer);
        if (!mobNear.isEmpty() && entMobok != null && entMobok != this.mc.thePlayer) {
            String entiNam;
            soundFunc3 = 1;
            String m = ((EntityPlayer)entMobok).getCommandSenderName();
            long s = JRMCoreH.bpc((EntityPlayer)((EntityPlayer)entMobok), (String)m, (byte)JRMCoreH.Pwrtyp);
            s = JRMCoreH.gkap((long)s, (String)m);
            String bc = "" + JRMCoreH.numSepShort((long)s);
            if (Tier == 1 && s > 100000L || Tier == 2 && s > 1000000L) {
                DBCKiAttacks.dbctick(-2);
                DBCKiAttacks.scouterRem((EntityPlayer)this.mc.thePlayer);
            }
            this.entiBP = entiNam = bc;
            this.textureFile = "jinryuudragonbc:misc/battlepower.png";
            this.ScouterRenderBlur(var6, var7);
            this.Func3BP();
        }
        if (mobNear.isEmpty()) {
            warn = 0;
            count = 0;
            startcount = 0;
        }
    }

    public void Func3BP() {
        this.initGui();
        Minecraft minecraft = this.mc;
        WorldClient world = minecraft.theWorld;
        EntityClientPlayerMP entityplayersp = minecraft.thePlayer;
        ScaledResolution scaledresolution = new ScaledResolution(minecraft, minecraft.displayWidth, minecraft.displayHeight);
        int width = scaledresolution.getScaledWidth();
        int height = scaledresolution.getScaledHeight();
        int widthplus = 8;
        minecraft.entityRenderer.setupOverlayRendering();
        RenderHelper.enableStandardItemLighting();
        RenderHelper.disableStandardItemLighting();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.drawCenteredString(this.fontRenderer, this.entiBP, width / 8, height / 40 * 16, 16768306);
    }

    public void Func2TAV() {
        this.initGui();
        EntityClientPlayerMP entityplayersp = this.mc.thePlayer;
        ScaledResolution scaledresolution = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int width = scaledresolution.getScaledWidth();
        int height = scaledresolution.getScaledHeight();
        int widthplus = 8;
        FontRenderer fontRender = this.mc.fontRenderer;
        this.mc.entityRenderer.setupOverlayRendering();
        RenderHelper.enableStandardItemLighting();
        RenderHelper.disableStandardItemLighting();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.drawCenteredString(fontRender, this.entiLoc, width / 400 * 120, height / 40 * 15, 16768306);
    }

    public void ScouterDBRadar(int var6, int var7) {
        double MXZ = 32.0;
        double MY = 8.0;
        double M2XZ = 8.0;
        double par12 = this.mc.thePlayer.posX;
        double par22 = this.mc.thePlayer.posY;
        double par32 = this.mc.thePlayer.posZ;
        AxisAlignedBB AABBX0 = AxisAlignedBB.getBoundingBox((double)(par12 - M2XZ), (double)(par22 - MY), (double)(par32 - MXZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + MXZ));
        AxisAlignedBB AABBX1 = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - MY), (double)(par32 - MXZ), (double)(par12 + M2XZ), (double)(par22 + MY), (double)(par32 + MXZ));
        AxisAlignedBB AABBZ0 = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - MY), (double)(par32 - M2XZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + MXZ));
        AxisAlignedBB AABBZ1 = AxisAlignedBB.getBoundingBox((double)(par12 - MXZ), (double)(par22 - MY), (double)(par32 - MXZ), (double)(par12 + MXZ), (double)(par22 + MY), (double)(par32 + M2XZ));
        boolean DBX0 = this.mc.thePlayer.worldObj.isAABBInMaterial(AABBX0, DBCMaterial.dragonblock);
        boolean DBX1 = this.mc.thePlayer.worldObj.isAABBInMaterial(AABBX1, DBCMaterial.dragonblock);
        boolean DBZ0 = this.mc.thePlayer.worldObj.isAABBInMaterial(AABBZ0, DBCMaterial.dragonblock);
        boolean DBZ1 = this.mc.thePlayer.worldObj.isAABBInMaterial(AABBZ1, DBCMaterial.dragonblock);
        DBX0 = true;
        if (true) {
            this.textureFile = "jinryuudragonbc:misc/TAVjobb.png";
            this.ScouterRenderBlur(var6, var7);
        }
        DBX1 = true;
        if (true) {
            this.textureFile = "jinryuudragonbc:misc/TAVbal.png";
            this.ScouterRenderBlur(var6, var7);
        }
        DBZ0 = true;
        if (true) {
            this.textureFile = "jinryuudragonbc:misc/TAVeszak.png";
            this.ScouterRenderBlur(var6, var7);
        }
        DBZ1 = true;
        if (true) {
            this.textureFile = "jinryuudragonbc:misc/TAVdel.png";
            this.ScouterRenderBlur(var6, var7);
        }
    }

    public void ScouterIntro(int var6, int var7, int tier2) {
        this.textureFile = "jinryuudragonbc:misc/intro.png";
        this.ScouterRenderBlur(var6, var7);
    }

    public void ScouterRenderBlur(int par1, int par2) {
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.zLevel = -600.0f;
        ResourceLocation tx = new ResourceLocation(this.textureFile);
        this.mc.renderEngine.bindTexture(tx);
        Tessellator var3 = Tessellator.instance;
        var3.startDrawingQuads();
        var3.addVertexWithUV(0.0, (double)par2, (double)this.zLevel, 0.0, 1.0);
        var3.addVertexWithUV((double)par1, (double)par2, (double)this.zLevel, 1.0, 1.0);
        var3.addVertexWithUV((double)par1, 0.0, (double)this.zLevel, 1.0, 0.0);
        var3.addVertexWithUV(0.0, 0.0, (double)this.zLevel, 0.0, 0.0);
        var3.draw();
        GL11.glDisable((int)3042);
    }
}

