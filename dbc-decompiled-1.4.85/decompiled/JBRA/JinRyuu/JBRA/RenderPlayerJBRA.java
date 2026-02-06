/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.DragonBC.common.Items.ItemsDBC
 *  JinRyuu.FamilyC.FamilyCConfig
 *  JinRyuu.JRMCore.FamilyCH
 *  JinRyuu.JRMCore.JRMCoreClient
 *  JinRyuu.JRMCore.JRMCoreConfig
 *  JinRyuu.JRMCore.JRMCoreGuiScreen
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.JRMCoreHC
 *  JinRyuu.JRMCore.JRMCoreHDBC
 *  JinRyuu.JRMCore.JRMCoreHJBRA
 *  JinRyuu.JRMCore.JRMCoreHJYC
 *  JinRyuu.JRMCore.JRMCoreHSAC
 *  JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings
 *  JinRyuu.JRMCore.i.ExtendedPlayer
 *  JinRyuu.JRMCore.items.ItemVanity
 *  JinRyuu.JRMCore.server.config.dbc.JGConfigRaces
 *  JinRyuu.JRMCore.server.config.dbc.JGConfigUltraInstinct
 *  JinRyuu.JYearsC.JYearsCConfig
 *  com.mojang.authlib.GameProfile
 *  cpw.mods.fml.common.eventhandler.Event
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.entity.EntityClientPlayerMP
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.model.ModelBox
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderBlocks
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.entity.RenderBiped
 *  net.minecraft.client.renderer.entity.RenderPlayer
 *  net.minecraft.client.renderer.entity.RendererLivingEntity
 *  net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.projectile.EntityArrow
 *  net.minecraft.init.Items
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTUtil
 *  net.minecraft.scoreboard.Score
 *  net.minecraft.scoreboard.ScoreObjective
 *  net.minecraft.scoreboard.Scoreboard
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.StringUtils
 *  net.minecraftforge.client.IItemRenderer
 *  net.minecraftforge.client.IItemRenderer$ItemRenderType
 *  net.minecraftforge.client.IItemRenderer$ItemRendererHelper
 *  net.minecraftforge.client.MinecraftForgeClient
 *  net.minecraftforge.client.event.RenderLivingEvent$Specials$Post
 *  net.minecraftforge.client.event.RenderLivingEvent$Specials$Pre
 *  net.minecraftforge.client.event.RenderPlayerEvent$Post
 *  net.minecraftforge.client.event.RenderPlayerEvent$Pre
 *  net.minecraftforge.client.event.RenderPlayerEvent$Specials$Post
 *  net.minecraftforge.client.event.RenderPlayerEvent$Specials$Pre
 *  net.minecraftforge.common.MinecraftForge
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JBRA;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.FamilyC.FamilyCConfig;
import JinRyuu.JBRA.JBRAClient;
import JinRyuu.JBRA.JBRAH;
import JinRyuu.JBRA.ModelBipedDBC;
import JinRyuu.JRMCore.FamilyCH;
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreGuiScreen;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHC;
import JinRyuu.JRMCore.JRMCoreHDBC;
import JinRyuu.JRMCore.JRMCoreHJBRA;
import JinRyuu.JRMCore.JRMCoreHJYC;
import JinRyuu.JRMCore.JRMCoreHSAC;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.items.ItemVanity;
import JinRyuu.JRMCore.server.config.dbc.JGConfigRaces;
import JinRyuu.JRMCore.server.config.dbc.JGConfigUltraInstinct;
import JinRyuu.JYearsC.JYearsCConfig;
import com.mojang.authlib.GameProfile;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class RenderPlayerJBRA
extends RenderPlayer {
    private static final boolean KO_CAMERA = false;
    private static final ResourceLocation steveTextures = new ResourceLocation("textures/entity/steve.png");
    private static final ResourceLocation fem = new ResourceLocation("jinryuufamilyc:fem.png");
    private static ResourceLocation curSkin = null;
    private static boolean curSkinUp = false;
    public ModelBipedDBC modelMain;
    private int pl;
    public static HashMap<String, Integer> state = new HashMap();
    public static HashMap<String, Integer> stateChange = new HashMap();
    public static HashMap<String, Integer> state2Change = new HashMap();
    public static HashMap<String, Integer> auratype = new HashMap();
    public static HashMap<String, Integer> auratime = new HashMap();
    public static HashMap<String, Integer> bendtime = new HashMap();
    private static float childScl = 1.0f;
    private static float age = 0.0f;
    private static int gen = 1;
    private static int preg = 0;
    private static int breast = 0;
    private String tailAnim;
    private final int number_of_lightVerts = 10;
    private long[] lightVert = new long[10];
    private int lightLivingTime;
    private final int lvnm = 10;
    private float[][] lightVertRotation = new float[10][3];
    private static String dns = JRMCoreH.dns;
    private static boolean kk2 = false;
    public static int kk = 0;
    public static float r = 0.0f;
    public static float g = 0.0f;
    public static float b = 0.0f;
    public static float r2 = 0.0f;
    public static float g2 = 0.0f;
    public static float b2 = 0.0f;

    byte b(int n) {
        return (byte)n;
    }

    byte b(String n) {
        return Byte.parseByte(n);
    }

    int i(String n) {
        return Integer.parseInt(n);
    }

    public RenderPlayerJBRA() {
        this.modelMain = new ModelBipedDBC(0.0f);
        this.mainModel = this.modelMain;
    }

    private int JFCgetConfigpt() {
        return FamilyCConfig.pt;
    }

    private float JYCgetConfigpgut() {
        return JYearsCConfig.pgut;
    }

    protected void func_82408_c(AbstractClientPlayer p_82408_1_, int p_82408_2_, float p_82408_3_) {
        Item item;
        ItemStack itemstack = p_82408_1_.inventory.armorItemInSlot(3 - p_82408_2_);
        if (itemstack != null && (item = itemstack.getItem()) instanceof ItemArmor) {
            this.bindTexture(RenderBiped.getArmorResource((Entity)p_82408_1_, (ItemStack)itemstack, (int)p_82408_2_, (String)"overlay"));
            GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
        }
    }

    public static float childSclGet() {
        return childScl;
    }

    public static float genGet() {
        return gen;
    }

    public void func_130009_a(AbstractClientPlayer par1AbstractClientPlayer, double par2, double par4, double par6, float par8, float par9) {
        if (JRMCoreH.JYC()) {
            age = JRMCoreHJYC.JYCAge((EntityPlayer)par1AbstractClientPlayer);
            childScl = JRMCoreHJYC.JYCsizeBasedOnAge((EntityPlayer)par1AbstractClientPlayer);
            childScl = 3.0f - childScl * 2.0f;
        }
        if (JRMCoreH.JFC()) {
            Object s;
            int pl;
            if (JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && !par1AbstractClientPlayer.isInvisible() && JRMCoreH.dnn((int)1)) {
                for (pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    boolean saiOozar;
                    byte State;
                    int pwr;
                    if (!JRMCoreH.plyrs[pl].equals(par1AbstractClientPlayer.getCommandSenderName()) || JRMCoreH.data1.length < JRMCoreH.plyrs.length) continue;
                    s = JRMCoreH.data1[pl].split(";");
                    String dns = s[1];
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
                    if ((pwr = Integer.parseInt((String)s[2])) != 1 || A <= 1 || !JRMCoreH.dnn((int)2)) continue;
                    int race = Integer.parseInt((String)s[0]);
                    String[] dummy = new String[]{"0", "0", "0", "0"};
                    String[] state = JRMCoreH.data2 == null ? dummy : JRMCoreH.data2[pl].split(";");
                    byte by = State = pwr == 2 || race == 0 ? (byte)0 : this.b(state[0]);
                    boolean bl = JRMCoreH.rSai((int)race) ? State == 7 || State == 8 : (saiOozar = false);
                    if (!saiOozar) continue;
                    gen = 1;
                }
            }
            if (JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && !par1AbstractClientPlayer.isInvisible() && JRMCoreH.dnn((int)30)) {
                for (pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(par1AbstractClientPlayer.getCommandSenderName()) || JRMCoreH.preg.length < JRMCoreH.plyrs.length) continue;
                    s = JRMCoreH.preg[pl];
                    int i = ((String)s).matches("[0-9]+") ? Integer.parseInt((String)s) : 0;
                    int def = this.JFCgetConfigpt() * 120;
                    if (i > 1) {
                        preg = (int)(((float)i - (float)def / 2.0f) / ((float)def / 2.0f * 0.01f));
                        preg = (preg = 100 - preg) > 100 ? 100 : (preg < 0 ? 0 : preg);
                        continue;
                    }
                    preg = 0;
                }
            }
            if (JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && !par1AbstractClientPlayer.isInvisible() && JRMCoreH.dnn((int)1)) {
                for (pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                    if (!JRMCoreH.plyrs[pl].equals(par1AbstractClientPlayer.getCommandSenderName()) || JRMCoreH.data1.length < JRMCoreH.plyrs.length) continue;
                    s = JRMCoreH.data1[pl].split(";");
                    Object dns = s[1];
                    breast = JRMCoreH.dnsBreast((String)dns);
                }
            }
        }
        ModelBipedDBC.g = gen;
        ModelBipedDBC.f = childScl;
        ModelBipedDBC.p = preg;
        this.modelMain.b = breast;
        float var10 = 1.0f;
        GL11.glColor3f((float)(var10 + RenderPlayerJBRA.getR()), (float)(var10 + RenderPlayerJBRA.getG()), (float)(var10 + RenderPlayerJBRA.getB()));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ItemStack var11 = par1AbstractClientPlayer.inventory.getCurrentItem();
        this.modelMain.heldItemRight = var11 != null ? JRMCoreHSAC.ah((Item)var11.getItem(), (int)1) : 0;
        this.modelArmor.heldItemRight = this.modelMain.heldItemRight;
        this.modelArmorChestplate.heldItemRight = this.modelMain.heldItemRight;
        if (var11 != null && par1AbstractClientPlayer.getItemInUseCount() > 0) {
            EnumAction var12 = var11.getItemUseAction();
            if (var12 == EnumAction.block) {
                this.modelMain.heldItemRight = 3;
                this.modelArmor.heldItemRight = 3;
                this.modelArmorChestplate.heldItemRight = 3;
            } else if (var12 == EnumAction.bow) {
                this.modelMain.aimedBow = true;
                this.modelArmor.aimedBow = true;
                this.modelArmorChestplate.aimedBow = true;
            }
        }
        this.modelArmor.isSneak = this.modelMain.isSneak = par1AbstractClientPlayer.isSneaking();
        this.modelArmorChestplate.isSneak = this.modelMain.isSneak;
        double var14 = par4;
        super.doRender(par1AbstractClientPlayer, par2, var14, par6, par8, par9);
        this.modelMain.aimedBow = false;
        this.modelArmor.aimedBow = false;
        this.modelArmorChestplate.aimedBow = false;
        this.modelMain.isSneak = false;
        this.modelArmor.isSneak = false;
        this.modelArmorChestplate.isSneak = false;
        this.modelMain.heldItemRight = 0;
        this.modelArmor.heldItemRight = 0;
        this.modelArmorChestplate.heldItemRight = 0;
    }

    public void doRender(AbstractClientPlayer p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
        this.modelBipedMain = this.modelMain;
        this.modelBipedMain.bipedHead = this.modelMain.bipedHead;
        this.modelBipedMain.bipedHeadwear = this.modelMain.bipedHeadwear;
        this.modelBipedMain.bipedLeftArm = this.modelMain.LA;
        this.modelBipedMain.bipedRightArm = this.modelMain.RA;
        this.modelBipedMain.bipedLeftLeg = this.modelMain.LL;
        this.modelBipedMain.bipedRightLeg = this.modelMain.RL;
        this.modelBipedMain.bipedBody = this.modelMain.B;
        if (MinecraftForge.EVENT_BUS.post((Event)new RenderPlayerEvent.Pre((EntityPlayer)p_76986_1_, (RenderPlayer)this, p_76986_9_))) {
            return;
        }
        this.func_130009_a(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
        MinecraftForge.EVENT_BUS.post((Event)new RenderPlayerEvent.Post((EntityPlayer)p_76986_1_, (RenderPlayer)this, p_76986_9_));
    }

    protected ResourceLocation getEntityTexture(AbstractClientPlayer p_110775_1_) {
        return p_110775_1_.getLocationSkin();
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void renderEquippedItemsJBRA(AbstractClientPlayer abstractClientPlayer, float par2) {
        int pl;
        boolean doit;
        Object data;
        block142: {
            ItemStack itemstack;
            block141: {
                block139: {
                    ItemStack hair;
                    block140: {
                        data = null;
                        if (JBRAH.JHDS()) {
                            Object temp = JBRAH.skinData((EntityPlayer)abstractClientPlayer);
                            data = temp != null ? temp : null;
                        }
                        itemstack = abstractClientPlayer.inventory.armorItemInSlot(3);
                        doit = true;
                        hair = abstractClientPlayer.inventory.armorItemInSlot(3);
                        if (hair == null) break block139;
                        if (!JRMCoreH.DBC()) break block140;
                        doit = true;
                        break block141;
                    }
                    if (JRMCoreH.NC() && itemstack.getItem() instanceof ItemArmor) {
                        if (hair.getItem().getUnlocalizedName().endsWith("Headband")) {
                            doit = false;
                        }
                        if (hair.getItem().getUnlocalizedName().replaceAll("item.", "").startsWith("akatsuki")) {
                            doit = true;
                        }
                        break block141;
                    } else {
                        doit = true;
                    }
                    break block141;
                }
                doit = true;
            }
            boolean dbc = JRMCoreH.DBC();
            boolean nc = JRMCoreH.NC();
            boolean saoc = JRMCoreH.SAOC();
            if (JRMCoreH.plyrs == null || JRMCoreH.plyrs.length <= 0 || abstractClientPlayer.isInvisible() || !JRMCoreH.dnn((int)1) || (!JRMCoreH.dnn((int)2) || !JRMCoreH.dnn((int)4) || !JRMCoreH.dnn((int)5) || !JRMCoreH.dnn((int)19)) && (dbc || saoc || nc)) break block142;
            for (pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                boolean mj;
                int eyes;
                byte stY;
                int weight;
                int classID;
                int race;
                int powerType;
                block146: {
                    String[] absorptionData2;
                    int[] slot_van;
                    String[][] slot_vanity_num;
                    boolean vanity_head;
                    boolean helmet;
                    boolean scouter;
                    String dnsH;
                    int Hair;
                    int haircol;
                    boolean saiOozar;
                    int st;
                    int rg;
                    block144: {
                        int bodyc1;
                        int bodytype;
                        int skintype;
                        block138: {
                            boolean dhhwho;
                            float h1;
                            block151: {
                                boolean bc;
                                int j;
                                int tailCol;
                                boolean isAprilFoolsFalseSSJ;
                                byte ts;
                                int suphcol;
                                boolean ultra_instinct_color;
                                int hc;
                                boolean gd;
                                boolean l;
                                int gen;
                                String[] s;
                                block149: {
                                    block137: {
                                        block150: {
                                            ResourceLocation bdyskn;
                                            int supecolr;
                                            int supecoll;
                                            int eyec2;
                                            int eyec1;
                                            int facem;
                                            int facen;
                                            int bodycm;
                                            String[] state;
                                            block148: {
                                                boolean lg;
                                                block147: {
                                                    int plyrSpc;
                                                    boolean msk;
                                                    boolean v;
                                                    int bodyc3;
                                                    int bodyc2;
                                                    block145: {
                                                        block143: {
                                                            boolean majinPure;
                                                            String[] stringArray;
                                                            if (!JRMCoreH.plyrs[pl].equals(abstractClientPlayer.getCommandSenderName())) continue;
                                                            this.pl = abstractClientPlayer.getEntityId();
                                                            s = JRMCoreH.data1[pl].split(";");
                                                            String[] dummy = new String[]{"0", "0", "0"};
                                                            rg = JRMCoreH.data4 == null ? 0 : Integer.parseInt(JRMCoreH.data4[pl].split(";")[0]);
                                                            state = JRMCoreH.data2 == null ? dummy : JRMCoreH.data2[pl].split(";");
                                                            String dns = s[1];
                                                            powerType = Integer.parseInt(s[2]);
                                                            race = Integer.parseInt(s[0]);
                                                            classID = Integer.parseInt(s[3]);
                                                            weight = Integer.parseInt(s[5].split(",")[0]);
                                                            st = JRMCoreH.rc_arc((int)race) && JRMCoreGuiScreen.ufc ? 6 : (powerType == 2 || race == 0 ? 0 : (int)this.b(state[0]));
                                                            stY = this.b(state[0]);
                                                            saiOozar = JRMCoreH.rSai((int)race) ? st == 7 || st == 8 : false;
                                                            gen = JRMCoreH.dnsGender((String)dns);
                                                            haircol = JRMCoreH.dnsHairC((String)dns);
                                                            int hairback = JRMCoreH.dnsHairB((String)dns);
                                                            int breast = JRMCoreH.dnsBreast((String)dns);
                                                            skintype = JRMCoreH.dnsSkinT((String)dns);
                                                            boolean iau = JRMCoreH.rc_arc((int)race) && st == 6;
                                                            String dnsau = JRMCoreH.data((int)pl, (int)16, (String)"");
                                                            dnsau = dnsau.contains(";") ? dnsau.substring(1) : (JRMCoreH.plyrs[pl].equals(JBRAClient.mc.thePlayer.getCommandSenderName()) ? dnsau : "");
                                                            int n = bodytype = skintype == 0 ? JRMCoreH.dnsBodyC1_0((String)dns) : JRMCoreH.dnsBodyT((String)dns);
                                                            int n2 = skintype == 0 ? 0 : (bodycm = iau ? JRMCoreH.dnsauCM((String)dnsau) : JRMCoreH.dnsBodyCM((String)dns));
                                                            int n3 = skintype == 0 ? 0 : (bodyc1 = iau ? JRMCoreH.dnsauC1((String)dnsau) : JRMCoreH.dnsBodyC1((String)dns));
                                                            int n4 = skintype == 0 ? 0 : (bodyc2 = iau ? JRMCoreH.dnsauC2((String)dnsau) : JRMCoreH.dnsBodyC2((String)dns));
                                                            bodyc3 = skintype == 0 ? 0 : (iau ? JRMCoreH.dnsauC3((String)dnsau) : JRMCoreH.dnsBodyC3((String)dns));
                                                            facen = skintype == 0 ? 0 : JRMCoreH.dnsFaceN((String)dns);
                                                            facem = skintype == 0 ? 0 : JRMCoreH.dnsFaceM((String)dns);
                                                            eyes = skintype == 0 ? 0 : JRMCoreH.dnsEyes((String)dns);
                                                            eyec1 = skintype == 0 ? 0 : JRMCoreH.dnsEyeC1((String)dns);
                                                            eyec2 = skintype == 0 ? 0 : JRMCoreH.dnsEyeC2((String)dns);
                                                            String[] dat5 = JRMCoreH.data5 == null ? dummy : JRMCoreH.data5[pl].split(";");
                                                            lg = JRMCoreH.lgndb((int)pl, (int)race, (int)st);
                                                            v = JRMCoreH.StusEfctsClient((int)17, (int)pl);
                                                            l = JRMCoreH.StusEfctsClient((int)19, (int)pl);
                                                            gd = JRMCoreH.StusEfctsClient((int)20, (int)pl);
                                                            hc = haircol;
                                                            Hair = hairback;
                                                            int ultra_instinct_level = 0;
                                                            ultra_instinct_color = false;
                                                            if (JRMCoreH.DBC() && l && JGConfigUltraInstinct.CONFIG_UI_LEVELS > 0) {
                                                                byte id = JGConfigUltraInstinct.CONFIG_UI_LEVELS < this.b(state[1]) ? JGConfigUltraInstinct.CONFIG_UI_LEVELS : this.b(state[1]);
                                                                ultra_instinct_level = JRMCoreH.state2UltraInstinct((boolean)false, (byte)id);
                                                                ultra_instinct_color = JGConfigUltraInstinct.CONFIG_UI_HAIR_WHITE[ultra_instinct_level];
                                                            }
                                                            suphcol = (JRMCoreH.rc_sai((int)race) || gd) && dbc ? JRMCoreHDBC.getPlayerColor((int)0, (int)0, (int)powerType, (int)race, (int)st, (boolean)v, (boolean)lg, (boolean)l, (boolean)ultra_instinct_color, (boolean)gd) : (dbc && l && ultra_instinct_color ? JRMCoreHDBC.getPlayerColor((int)0, (int)0, (int)powerType, (int)race, (int)st, (boolean)v, (boolean)lg, (boolean)l, (boolean)ultra_instinct_color, (boolean)gd) : 0);
                                                            supecoll = dbc ? JRMCoreHDBC.getPlayerColor2((int)1, (int)eyec1, (int)powerType, (int)race, (int)stY, (boolean)v, (boolean)lg, (boolean)l, (boolean)gd) : eyec1;
                                                            supecolr = dbc ? JRMCoreHDBC.getPlayerColor2((int)1, (int)eyec2, (int)powerType, (int)race, (int)stY, (boolean)v, (boolean)lg, (boolean)l, (boolean)gd) : eyec2;
                                                            String[] StE = JRMCoreH.dat19 == null ? dummy : JRMCoreH.dat19[pl].split(";");
                                                            ts = Byte.parseByte(StE[0]);
                                                            mj = JRMCoreH.StusEfctsClient((int)12, (int)pl);
                                                            msk = JRMCoreH.StusEfctsClient((int)6, (int)pl);
                                                            ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)abstractClientPlayer);
                                                            dnsH = props.getHairCode().length() > 5 ? props.getHairCode() : "";
                                                            dnsH = JRMCoreH.dnsHairG1toG2((String)dnsH);
                                                            int n5 = skintype == 0 ? 0 : (JRMCoreH.RaceCustomSkin[race] == 0 ? 0 : (plyrSpc = bodytype >= JRMCoreH.Specials[race] ? JRMCoreH.Specials[race] - 1 : bodytype));
                                                            if (JRMCoreH.DBC()) {
                                                                kk2 = JRMCoreH.StusEfctsMe((int)5);
                                                                kk = this.b(state[1]) + 1;
                                                                if (kk2) {
                                                                    r = (float)kk / 15.0f;
                                                                    g = -((float)kk / 15.0f);
                                                                    b = -((float)kk / 15.0f);
                                                                    if (r > 1.0f) {
                                                                        r = 1.0f;
                                                                    }
                                                                    if (g < 0.0f) {
                                                                        r = 0.0f;
                                                                    }
                                                                    if (b < 0.0f) {
                                                                        r = 0.0f;
                                                                    }
                                                                } else {
                                                                    r = 0.0f;
                                                                    g = 0.0f;
                                                                    b = 0.0f;
                                                                }
                                                            }
                                                            GL11.glPushMatrix();
                                                            if (race != 5 || !dbc) break block143;
                                                            String[] playerData13 = JRMCoreH.data((String)JRMCoreH.plyrs[pl], (int)13, (String)"0;0;0;0,0,0+0").split(";");
                                                            String[] absorptionData = playerData13.length > 3 ? playerData13[3].split(",") : "0;0;0;0,0,0+0".split(",");
                                                            if (absorptionData[1].contains("+")) {
                                                                stringArray = absorptionData[1].split("+");
                                                            } else {
                                                                String[] stringArray2 = new String[1];
                                                                stringArray = stringArray2;
                                                                stringArray2[0] = absorptionData[1];
                                                            }
                                                            String[] absorptionVisuals = stringArray;
                                                            boolean majinEvil = st == 1;
                                                            boolean bl = majinPure = st == 3 && JGConfigRaces.CONFIG_MAJIN_PURE_PINK_SKIN;
                                                            if (majinEvil) {
                                                                bodycm = 12561588;
                                                                haircol = 12561588;
                                                            } else if (majinPure) {
                                                                bodycm = 16757199;
                                                                haircol = 16757199;
                                                            }
                                                            ResourceLocation bdyskn2 = new ResourceLocation("jinryuudragonbc:cc/majin/" + (gen == 1 ? "f" : "") + "majin.png");
                                                            if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                                if (curSkin == null) {
                                                                    curSkin = bdyskn2;
                                                                }
                                                            }
                                                            this.bindTexture(bdyskn2);
                                                            RenderPlayerJBRA.glColor3f(bodycm);
                                                            this.modelMain.renderBody(0.0625f);
                                                            int absorbedRace = Integer.parseInt(absorptionVisuals[0]);
                                                            if (JRMCoreH.isRaceArcosian((int)absorbedRace) || JRMCoreH.isRaceNamekian((int)absorbedRace)) {
                                                                bdyskn2 = new ResourceLocation("jinryuudragonbc:cc/majin/" + (gen == 1 ? "f" : "") + "majin_" + (JRMCoreH.isRaceArcosian((int)absorbedRace) ? "arco" : "namek") + ".png");
                                                                this.bindTexture(bdyskn2);
                                                                RenderPlayerJBRA.glColor3f(bodycm);
                                                                this.modelMain.renderBody(0.0625f);
                                                            }
                                                            this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/majin/" + (gen == 1 ? "f" : "") + "majinn" + facen + ".png"));
                                                            RenderPlayerJBRA.glColor3f(bodycm);
                                                            this.modelMain.renderHairs(0.0625f, "FACENOSE");
                                                            this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/majin/" + (gen == 1 ? "f" : "") + "majinm" + facem + ".png"));
                                                            RenderPlayerJBRA.glColor3f(bodycm);
                                                            this.modelMain.renderHairs(0.0625f, "FACEMOUTH");
                                                            this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/majin/" + (gen == 1 ? "f" : "") + "majinb" + eyes + ".png"));
                                                            GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                                                            this.modelMain.renderHairs(0.0625f, "EYEBASE");
                                                            if (supecoll > 0) {
                                                                this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/majin/" + (gen == 1 ? "f" : "") + "majinl" + eyes + ".png"));
                                                                RenderPlayerJBRA.glColor3f(dbc && (JRMCoreH.isRaceMajin((int)race) || gd || JRMCoreHDBC.godKiUserBase((int)race, (int)stY) || l) ? supecoll : eyec1);
                                                                this.modelMain.renderHairs(0.0625f, "EYELEFT");
                                                            }
                                                            if (supecolr > 0) {
                                                                this.bindTexture(new ResourceLocation(JRMCoreH.tjdbcAssts, "cc/majin/" + (gen == 1 ? "f" : "") + "majinr" + eyes + ".png"));
                                                                RenderPlayerJBRA.glColor3f(dbc && (JRMCoreH.isRaceMajin((int)race) || gd || JRMCoreHDBC.godKiUserBase((int)race, (int)stY) || l) ? supecolr : eyec2);
                                                                this.modelMain.renderHairs(0.0625f, "EYERIGHT");
                                                            }
                                                            RenderPlayerJBRA.glColor3f(hc);
                                                            scouter = false;
                                                            helmet = false;
                                                            if (itemstack != null) {
                                                                Item item = itemstack.getItem();
                                                                if (JRMCoreH.DBC() && item instanceof ItemArmor) {
                                                                    ItemArmor itemarmor = (ItemArmor)item;
                                                                    helmet = true;
                                                                }
                                                            }
                                                            vanity_head = false;
                                                            slot_vanity_num = new String[8][];
                                                            slot_van = new int[8];
                                                            for (int i = 0; i < 8; ++i) {
                                                                slot_vanity_num[i] = s[8 + i].split(",");
                                                                slot_van[i] = Integer.parseInt(slot_vanity_num[i][0]);
                                                                if (vanity_head || slot_van[i] <= 0) continue;
                                                                new Item();
                                                                Item vanity_check = Item.getItemById((int)slot_van[i]);
                                                                if (!(vanity_check instanceof ItemVanity) || ((ItemVanity)vanity_check).armorType != 5) continue;
                                                                if (slot_van[i] == Item.getIdFromItem((Item)ItemsDBC.Coat_2)) continue;
                                                                if (slot_van[i] == Item.getIdFromItem((Item)ItemsDBC.Coat)) continue;
                                                                vanity_head = true;
                                                            }
                                                            slot_vanity_num = new String[8][];
                                                            slot_van = new int[8];
                                                            absorptionData2 = absorptionData[2].split("-");
                                                            if (absorptionData2.length > 0) {
                                                                for (int i = 0; i < absorptionData2.length; ++i) {
                                                                    if (!absorptionData2[i].contains("+")) continue;
                                                                    slot_vanity_num[i] = absorptionData2[i].split("\\+");
                                                                    slot_van[i] = Integer.parseInt(slot_vanity_num[i][0]);
                                                                }
                                                            }
                                                            break block144;
                                                        }
                                                        if (race != 3 || !dbc) break block145;
                                                        boolean ssg = JRMCoreHDBC.godKiUserBase((int)race, (int)st);
                                                        if (ssg && v) {
                                                            bodycm = 16744999;
                                                            bodyc1 = 15524763;
                                                            bodyc2 = 12854822;
                                                            bodyc3 = 0;
                                                            eyec2 = 13636110;
                                                            eyec1 = 13636110;
                                                        }
                                                        this.bindTexture(new ResourceLocation("jinryuudragonbc:gui/allw.png"));
                                                        float h12 = 1.0f;
                                                        RenderPlayerJBRA.glColor3f(bodycm);
                                                        this.modelMain.renderHairs(0.0625f, "N");
                                                        ResourceLocation bdyskn3 = new ResourceLocation("jinryuudragonbc:cc/nam/0nam" + plyrSpc + ".png");
                                                        if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                            if (curSkin == null) {
                                                                curSkin = bdyskn3;
                                                            }
                                                        }
                                                        this.bindTexture(bdyskn3);
                                                        RenderPlayerJBRA.glColor3f(bodycm);
                                                        this.modelMain.renderBody(0.0625f);
                                                        bdyskn3 = new ResourceLocation("jinryuudragonbc:cc/nam/1nam" + plyrSpc + ".png");
                                                        if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                            if (curSkin == null) {
                                                                curSkin = bdyskn3;
                                                            }
                                                        }
                                                        this.bindTexture(bdyskn3);
                                                        RenderPlayerJBRA.glColor3f(bodyc1);
                                                        this.modelMain.renderBody(0.0625f);
                                                        bdyskn3 = new ResourceLocation("jinryuudragonbc:cc/nam/2nam" + plyrSpc + ".png");
                                                        if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                            if (curSkin == null) {
                                                                curSkin = bdyskn3;
                                                            }
                                                        }
                                                        this.bindTexture(bdyskn3);
                                                        RenderPlayerJBRA.glColor3f(bodyc2);
                                                        this.modelMain.renderBody(0.0625f);
                                                        bdyskn3 = new ResourceLocation("jinryuudragonbc:cc/nam/3nam" + plyrSpc + ".png");
                                                        if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                            if (curSkin == null) {
                                                                curSkin = bdyskn3;
                                                            }
                                                        }
                                                        this.bindTexture(bdyskn3);
                                                        GL11.glColor3f((float)(h12 + RenderPlayerJBRA.getR()), (float)(h12 + RenderPlayerJBRA.getG()), (float)(h12 + RenderPlayerJBRA.getB()));
                                                        this.modelMain.renderBody(0.0625f);
                                                        this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/nam/4namn" + facen + ".png"));
                                                        RenderPlayerJBRA.glColor3f(bodycm);
                                                        this.modelMain.renderHairs(0.0625f, "FACENOSE");
                                                        this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/nam/4namm" + facem + ".png"));
                                                        RenderPlayerJBRA.glColor3f(bodycm);
                                                        this.modelMain.renderHairs(0.0625f, "FACEMOUTH");
                                                        this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/nam/4namb" + eyes + ".png"));
                                                        GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                                                        this.modelMain.renderHairs(0.0625f, "EYEBASE");
                                                        this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/nam/4naml" + eyes + ".png"));
                                                        RenderPlayerJBRA.glColor3f(JRMCoreH.rc_sai((int)race) || gd || JRMCoreHDBC.godKiUserBase((int)race, (int)stY) || l ? supecoll : eyec1);
                                                        this.modelMain.renderHairs(0.0625f, "EYELEFT");
                                                        this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/nam/4namr" + eyes + ".png"));
                                                        RenderPlayerJBRA.glColor3f(JRMCoreH.rc_sai((int)race) || gd || JRMCoreHDBC.godKiUserBase((int)race, (int)stY) || l ? supecolr : eyec2);
                                                        this.modelMain.renderHairs(0.0625f, "EYERIGHT");
                                                        this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/nam/4namw" + eyes + ".png"));
                                                        RenderPlayerJBRA.glColor3f(bodycm);
                                                        this.modelMain.renderHairs(0.0625f, "EYEBROW");
                                                        break block146;
                                                    }
                                                    if (race != 4 || !dbc) break block147;
                                                    boolean ssg = JRMCoreHDBC.godKiUserBase((int)race, (int)st);
                                                    if (ssg && v) {
                                                        st = 6;
                                                        bodycm = 0x545454;
                                                        bodyc1 = 0xC3C3C3;
                                                        bodyc3 = 0x171717;
                                                    }
                                                    this.bindTexture(new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/0B" + JRMCoreH.TransFrSkn2[st] + plyrSpc + ".png"));
                                                    RenderPlayerJBRA.glColor3f(bodycm);
                                                    this.modelMain.renderHairs(0.0625f, (ts == 4 ? "n" : "") + "FR" + JRMCoreH.TransFrHrn[st]);
                                                    this.bindTexture(new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/1B" + JRMCoreH.TransFrSkn2[st] + plyrSpc + ".png"));
                                                    RenderPlayerJBRA.glColor3f(bodyc1);
                                                    this.modelMain.renderHairs(0.0625f, (ts == 4 ? "n" : "") + "FR" + JRMCoreH.TransFrHrn[st]);
                                                    ResourceLocation bdyskn4 = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/1A" + JRMCoreH.TransFrSkn[st] + plyrSpc + ".png");
                                                    if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                        if (curSkin == null) {
                                                            curSkin = bdyskn4;
                                                        }
                                                    }
                                                    this.bindTexture(bdyskn4);
                                                    RenderPlayerJBRA.glColor3f(bodyc1);
                                                    this.modelMain.renderBody(0.0625f);
                                                    this.bindTexture(new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/2B" + JRMCoreH.TransFrSkn2[st] + plyrSpc + ".png"));
                                                    RenderPlayerJBRA.glColor3f(bodyc2);
                                                    this.modelMain.renderHairs(0.0625f, (ts == 4 ? "n" : "") + "FR" + JRMCoreH.TransFrHrn[st]);
                                                    bdyskn4 = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/2A" + JRMCoreH.TransFrSkn[st] + plyrSpc + ".png");
                                                    if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                        if (curSkin == null) {
                                                            curSkin = bdyskn4;
                                                        }
                                                    }
                                                    this.bindTexture(bdyskn4);
                                                    RenderPlayerJBRA.glColor3f(bodyc2);
                                                    this.modelMain.renderBody(0.0625f);
                                                    this.bindTexture(new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/3B" + JRMCoreH.TransFrSkn2[st] + plyrSpc + ".png"));
                                                    RenderPlayerJBRA.glColor3f(bodyc3);
                                                    this.modelMain.renderHairs(0.0625f, (ts == 4 ? "n" : "") + "FR" + JRMCoreH.TransFrHrn[st]);
                                                    bdyskn4 = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/3A" + JRMCoreH.TransFrSkn[st] + plyrSpc + ".png");
                                                    if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                        if (curSkin == null) {
                                                            curSkin = bdyskn4;
                                                        }
                                                    }
                                                    this.bindTexture(bdyskn4);
                                                    RenderPlayerJBRA.glColor3f(bodyc3);
                                                    this.modelMain.renderBody(0.0625f);
                                                    bdyskn4 = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/0A" + JRMCoreH.TransFrSkn[st] + plyrSpc + ".png");
                                                    if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                        if (curSkin == null) {
                                                            curSkin = bdyskn4;
                                                        }
                                                    }
                                                    this.bindTexture(bdyskn4);
                                                    RenderPlayerJBRA.glColor3f(bodycm);
                                                    this.modelMain.renderBody(0.0625f);
                                                    this.bindTexture(new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/4B" + JRMCoreH.TransFrSkn2[st] + plyrSpc + ".png"));
                                                    float h13 = 1.0f;
                                                    GL11.glColor3f((float)(h13 + RenderPlayerJBRA.getR()), (float)(h13 + RenderPlayerJBRA.getG()), (float)(h13 + RenderPlayerJBRA.getB()));
                                                    this.modelMain.renderHairs(0.0625f, (ts == 4 ? "n" : "") + "FR" + JRMCoreH.TransFrHrn[st]);
                                                    bdyskn4 = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/4A" + JRMCoreH.TransFrSkn[st] + plyrSpc + ".png");
                                                    if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                        if (curSkin == null) {
                                                            curSkin = bdyskn4;
                                                        }
                                                    }
                                                    this.bindTexture(bdyskn4);
                                                    GL11.glColor3f((float)(h13 + RenderPlayerJBRA.getR()), (float)(h13 + RenderPlayerJBRA.getG()), (float)(h13 + RenderPlayerJBRA.getB()));
                                                    this.modelMain.renderBody(0.0625f);
                                                    this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/arc/" + (gen == 1 ? "f" : "m") + "/4A" + JRMCoreH.TransFrSkn[st] + plyrSpc + "n" + facen + ".png"));
                                                    RenderPlayerJBRA.glColor3f(bodyc1);
                                                    this.modelMain.renderHairs(0.0625f, "FACENOSE");
                                                    if (st == 5 && msk) {
                                                        this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/arc/" + (gen == 1 ? "f" : "m") + "/0A" + JRMCoreH.TransFrSkn[st] + plyrSpc + "a.png"));
                                                        RenderPlayerJBRA.glColor3f(bodycm);
                                                        this.modelMain.renderHairs(0.0625f, "FACEMOUTH");
                                                    } else {
                                                        this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/arc/" + (gen == 1 ? "f" : "m") + "/4A" + JRMCoreH.TransFrSkn[st] + plyrSpc + "m" + facem + ".png"));
                                                        RenderPlayerJBRA.glColor3f(bodyc1);
                                                        this.modelMain.renderHairs(0.0625f, "FACEMOUTH");
                                                    }
                                                    this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/arc/" + (gen == 1 ? "f" : "m") + "/4A" + JRMCoreH.TransFrSkn[st] + plyrSpc + "b" + eyes + ".png"));
                                                    GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                                                    this.modelMain.renderHairs(0.0625f, "EYEBASE");
                                                    this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/arc/" + (gen == 1 ? "f" : "m") + "/4A" + JRMCoreH.TransFrSkn[st] + plyrSpc + "l" + eyes + ".png"));
                                                    RenderPlayerJBRA.glColor3f(JRMCoreH.rc_sai((int)race) || gd || JRMCoreHDBC.godKiUserBase((int)race, (int)stY) || l ? supecoll : eyec1);
                                                    this.modelMain.renderHairs(0.0625f, "EYELEFT");
                                                    this.bindTexture(new ResourceLocation("jinryuudragonbc", "cc/arc/" + (gen == 1 ? "f" : "m") + "/4A" + JRMCoreH.TransFrSkn[st] + plyrSpc + "r" + eyes + ".png"));
                                                    RenderPlayerJBRA.glColor3f(JRMCoreH.rc_sai((int)race) || gd || JRMCoreHDBC.godKiUserBase((int)race, (int)stY) || l ? supecolr : eyec2);
                                                    this.modelMain.renderHairs(0.0625f, "EYERIGHT");
                                                    break block146;
                                                }
                                                boolean bl = JRMCoreH.isRaceSaiyan((int)race) && st == 1 && JRMCoreH.isAprilFoolsModeOn() ? true : (isAprilFoolsFalseSSJ = false);
                                                if (!saiOozar) break block148;
                                                bdyskn = new ResourceLocation("jinryuudragonbc:cc/oozaru1.png");
                                                if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                    if (curSkin == null) {
                                                        curSkin = bdyskn;
                                                    }
                                                }
                                                this.bindTexture(bdyskn);
                                                RenderPlayerJBRA.glColor3f(skintype != 0 ? bodycm : 11374471);
                                                this.modelMain.renderBody(0.0625f);
                                                int n = tailCol = race == 2 || bodytype != 0 ? bodytype : 6498048;
                                                j = st == 0 || st == 7 ? (skintype == 1 ? bodyc1 : tailCol) : (lg ? 0x99FF66 : 16574610);
                                                bdyskn = new ResourceLocation("jinryuudragonbc:cc/oozaru2.png");
                                                this.bindTexture(bdyskn);
                                                RenderPlayerJBRA.glColor3f(j);
                                                this.modelMain.renderBody(0.0625f);
                                                this.bindTexture(new ResourceLocation("jinryuudragonbc:cc/oozaru0.png"));
                                                GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                                                this.modelMain.renderHairs(0.0625f, "EYEBASE");
                                                RenderPlayerJBRA.glColor3f(skintype != 0 ? bodycm : 11374471);
                                                this.modelMain.renderHairs(0.0625f, "OOZARU");
                                                break block149;
                                            }
                                            if (skintype == 0) break block149;
                                            bdyskn = new ResourceLocation("jinryuumodscore:cc/" + (gen == 1 ? "f" : "") + "hum.png");
                                            if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                                if (curSkin == null) {
                                                    curSkin = bdyskn;
                                                }
                                            }
                                            this.bindTexture(bdyskn);
                                            RenderPlayerJBRA.glColor3f(bodycm);
                                            this.modelMain.renderBody(0.0625f);
                                            this.bindTexture(new ResourceLocation("jinryuumodscore", "cc/" + (gen == 1 ? "f" : "") + "humn" + facen + ".png"));
                                            RenderPlayerJBRA.glColor3f(bodycm);
                                            this.modelMain.renderHairs(0.0625f, "FACENOSE");
                                            this.bindTexture(new ResourceLocation("jinryuumodscore", "cc/" + (gen == 1 ? "f" : "") + "humm" + facem + ".png"));
                                            RenderPlayerJBRA.glColor3f(bodycm);
                                            this.modelMain.renderHairs(0.0625f, "FACEMOUTH");
                                            this.bindTexture(new ResourceLocation("jinryuumodscore", "cc/" + (gen == 1 ? "f" : "") + "humb" + eyes + ".png"));
                                            GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                                            this.modelMain.renderHairs(0.0625f, "EYEBASE");
                                            if (supecoll > 0 && !isAprilFoolsFalseSSJ) {
                                                if (powerType == 2 && classID == 1) {
                                                    this.bindTexture(new ResourceLocation(JRMCoreH.tjnc, "cc/cl" + classID + "/" + (gen == 1 ? "f" : "") + "huml" + eyes + ".png"));
                                                    RenderPlayerJBRA.glColor3f(15590377);
                                                } else if (powerType == 2 && classID == 2 && stY > 0) {
                                                    this.bindTexture(new ResourceLocation(JRMCoreH.tjnc, "cc/cl" + classID + "/" + (gen == 1 ? "f" : "") + "huml" + eyes + ".png"));
                                                    RenderPlayerJBRA.glColor3f(0xD30000);
                                                } else {
                                                    this.bindTexture(new ResourceLocation("jinryuumodscore", "cc/" + (gen == 1 ? "f" : "") + "huml" + eyes + ".png"));
                                                    RenderPlayerJBRA.glColor3f(dbc && (JRMCoreH.rc_sai((int)race) || gd || JRMCoreHDBC.godKiUserBase((int)race, (int)stY) || l) ? supecoll : eyec1);
                                                }
                                                this.modelMain.renderHairs(0.0625f, "EYELEFT");
                                            }
                                            if (supecolr > 0 && !isAprilFoolsFalseSSJ) {
                                                if (powerType == 2 && classID == 1) {
                                                    this.bindTexture(new ResourceLocation(JRMCoreH.tjnc, "cc/cl" + classID + "/" + (gen == 1 ? "f" : "") + "humr" + eyes + ".png"));
                                                    RenderPlayerJBRA.glColor3f(15590377);
                                                } else if (powerType == 2 && classID == 2 && stY > 0) {
                                                    this.bindTexture(new ResourceLocation(JRMCoreH.tjnc, "cc/cl" + classID + "/" + (gen == 1 ? "f" : "") + "humr" + eyes + ".png"));
                                                    RenderPlayerJBRA.glColor3f(0xD30000);
                                                } else {
                                                    this.bindTexture(new ResourceLocation(JRMCoreH.tjjrmc, "cc/" + (gen == 1 ? "f" : "") + "humr" + eyes + ".png"));
                                                    RenderPlayerJBRA.glColor3f(dbc && (JRMCoreH.rc_sai((int)race) || gd || JRMCoreHDBC.godKiUserBase((int)race, (int)stY) || l) ? supecolr : eyec2);
                                                }
                                                this.modelMain.renderHairs(0.0625f, "EYERIGHT");
                                            }
                                            boolean b3 = gd ? true : (race == 1 || race == 2 ? Integer.parseInt(state[0]) == 6 : false);
                                            this.bindTexture(new ResourceLocation("jinryuumodscore", "cc/" + (b3 ? "ssj3eyebrow/" : "") + (gen == 1 ? "f" : "") + "humw" + eyes + ".png"));
                                            if (b3) break block150;
                                            if (l && ultra_instinct_color) {
                                                RenderPlayerJBRA.glColor3f(0xF0F0F0, age);
                                                break block137;
                                            } else if (JRMCoreH.isRaceSaiyan((int)race) && st != 0 && st != 14 && !isAprilFoolsFalseSSJ) {
                                                RenderPlayerJBRA.glColor3f(suphcol);
                                                break block137;
                                            } else {
                                                RenderPlayerJBRA.glColor3f(haircol, age);
                                            }
                                            break block137;
                                        }
                                        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
                                    }
                                    this.modelMain.renderHairs(0.0625f, "EYEBROW");
                                }
                                if (JRMCoreH.rc_sai((int)race) && dbc) {
                                    float h14 = 1.0f;
                                    int n = tailCol = race == 2 || bodytype != 0 ? bodytype : 6498048;
                                    int n6 = (st == 0 || st == 7 || st == 14 || isAprilFoolsFalseSSJ) && !gd ? (skintype == 1 ? bodyc1 : tailCol) : (j = suphcol);
                                    if (JRMCoreH.rSai((int)race)) {
                                        if (j == 6498048 && st == 14) {
                                            j = JRMCoreH.isAprilFoolsModeOn() ? 13292516 : 14292268;
                                        } else if (st != 14 && l && ultra_instinct_color) {
                                            j = 0xF0F0F0;
                                        }
                                    }
                                    this.bindTexture(new ResourceLocation("jinryuudragonbc:gui/allw.png"));
                                    RenderPlayerJBRA.glColor3f(j);
                                    this.modelMain.renderHairs(0.0625f, ts == 0 || ts == -1 ? "SJT1" : (ts == 1 ? "SJT2" : ""));
                                }
                                h1 = 1.0f;
                                if (!saiOozar) {
                                    if (skintype == 0 && gen >= 1) {
                                        ResourceLocation bdyskn;
                                        ResourceLocation resourceLocation = bdyskn = abstractClientPlayer.getLocationSkin().equals((Object)steveTextures) ? fem : abstractClientPlayer.getLocationSkin();
                                        if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
                                            if (curSkin == null) {
                                                curSkin = bdyskn;
                                            }
                                        }
                                        if (JBRAH.JHDS() && JBRAH.getSkinHas(data)) {
                                            this.bindTexture(JBRAH.getSkinLoc(data));
                                        } else {
                                            this.bindTexture(bdyskn);
                                        }
                                        GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                                        this.modelMain.renderBody(0.0625f);
                                    } else if (JBRAH.JHDS() && JBRAH.getSkinHas(data) && skintype == 0) {
                                        GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                                        this.bindTexture(JBRAH.getSkinLoc(data));
                                        this.modelMain.renderBody(0.0625f);
                                        curSkin = null;
                                    }
                                }
                                boolean bl = gd || (l ? ultra_instinct_color : st != 0) && st != 14 && !isAprilFoolsFalseSSJ ? true : (bc = false);
                                if (!(Hair != 8 && Hair != 9 || st != 0 && st != 1)) {
                                    hc = bc ? suphcol : hc;
                                    String s1 = Hair == 8 ? "c2" : "c1";
                                    this.bindTexture(new ResourceLocation("jinryuumodscore:gui/" + s1 + ".png"));
                                } else if (Hair >= 0 && Hair <= 12) {
                                    hc = bc ? suphcol : (st == 14 && JRMCoreH.isAprilFoolsModeOn() ? 13292516 : hc);
                                    String s1 = st == 0 ? "normall" : "superall";
                                    this.bindTexture(new ResourceLocation("jinryuumodscore:gui/" + s1 + ".png"));
                                }
                                if (bc) {
                                    RenderPlayerJBRA.glColor3f(hc);
                                } else {
                                    RenderPlayerJBRA.glColor3f(hc, age);
                                }
                                boolean scouter2 = false;
                                boolean helmet2 = false;
                                if (itemstack != null) {
                                    Item item = itemstack.getItem();
                                    if (JRMCoreH.DBC() && item instanceof ItemArmor) {
                                        ItemArmor itemarmor = (ItemArmor)item;
                                        helmet2 = true;
                                    }
                                }
                                boolean vanity_head2 = false;
                                String[][] slot_vanity_num2 = new String[8][];
                                int[] slot_van2 = new int[8];
                                for (int i = 0; i < 8; ++i) {
                                    slot_vanity_num2[i] = s[8 + i].split(",");
                                    slot_van2[i] = Integer.parseInt(slot_vanity_num2[i][0]);
                                    if (vanity_head2 || slot_van2[i] <= 0) continue;
                                    new Item();
                                    Item vanity_check = Item.getItemById((int)slot_van2[i]);
                                    if (!(vanity_check instanceof ItemVanity) || ((ItemVanity)vanity_check).armorType != 5) continue;
                                    if (slot_van2[i] == Item.getIdFromItem((Item)ItemsDBC.Coat_2)) continue;
                                    if (slot_van2[i] == Item.getIdFromItem((Item)ItemsDBC.Coat)) continue;
                                    vanity_head2 = true;
                                }
                                if (saiOozar) break block146;
                                boolean bl2 = JRMCoreConfig.HHWHO ? !helmet2 && !vanity_head2 || scouter2 : (dhhwho = true);
                                if (Hair != 12 || !dhhwho || dnsH.length() <= 3) break block151;
                                this.bindTexture(new ResourceLocation("jinryuumodscore:gui/normall.png"));
                                if (abstractClientPlayer == JBRAClient.mc.thePlayer && JRMCoreGuiScreen.hairPreview > 0) {
                                    st = JRMCoreGuiScreen.hairPreviewStates[JRMCoreGuiScreen.hairPreview];
                                }
                                if (st == 6) {
                                    this.modelMain.renderHairs(0.0625f, "" + JRMCoreH.HairsT[6] + JRMCoreH.Hairs[0]);
                                    break block138;
                                } else if (st == 14) {
                                    this.modelMain.renderHairsV2(0.0625f, "373852546750347428545480193462285654801934283647478050340147507467501848505072675018255250726750183760656580501822475071675018255050716750189730327158501802475071675018973225673850189765616160501820414547655019545654216550195754542165501920475027655019943669346576193161503065231900475030655019406534276538199465393460501997654138655019976345453950189760494941501897615252415018976354563850189763494736501897614949395018976152523950189763525234501897584749395018976150493850189760545234501897585250415018885445474550189754475041501897545250435018885454523950185143607861501897415874585018514369196150185147768078391865525680565018974356806150188843567861501868396374615018975056805650189750568056501885582374615018975823726150187149568054501877495680565018774950785650189163236961501820", 0.0f, 0, 0, pl, race, this, abstractClientPlayer);
                                    break block138;
                                } else {
                                    this.modelMain.renderHairsV2(0.0625f, dnsH, 0.0f, st, rg, pl, race, this, abstractClientPlayer);
                                }
                                break block138;
                            }
                            if (Hair == 10) {
                                GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                                if (JBRAH.JHDS() && JBRAH.getSkinHas(data)) {
                                    this.bindTexture(JBRAH.getSkinLoc(data));
                                } else {
                                    this.bindTexture(abstractClientPlayer.getLocationSkin());
                                }
                                this.modelMain.renderHeadwear(0.0625f);
                            } else if (dhhwho) {
                                if (st == 14) {
                                    this.modelMain.renderHairsV2(0.0625f, "373852546750347428545480193462285654801934283647478050340147507467501848505072675018255250726750183760656580501822475071675018255050716750189730327158501802475071675018973225673850189765616160501820414547655019545654216550195754542165501920475027655019943669346576193161503065231900475030655019406534276538199465393460501997654138655019976345453950189760494941501897615252415018976354563850189763494736501897614949395018976152523950189763525234501897584749395018976150493850189760545234501897585250415018885445474550189754475041501897545250435018885454523950185143607861501897415874585018514369196150185147768078391865525680565018974356806150188843567861501868396374615018975056805650189750568056501885582374615018975823726150187149568054501877495680565018774950785650189163236961501820", 0.0f, 0, 0, pl, race, this, abstractClientPlayer);
                                } else {
                                    this.modelMain.renderHairs(0.0625f, "" + JRMCoreH.HairsT[st] + JRMCoreH.Hairs[Hair]);
                                }
                            }
                        }
                        if (st == 14) {
                            int jx;
                            int tailCol = race == 2 || bodytype != 0 ? bodytype : 6498048;
                            tailCol = JRMCoreH.isAprilFoolsModeOn() ? 13292516 : tailCol;
                            int n = jx = skintype == 1 ? bodyc1 : tailCol;
                            if (JRMCoreH.rSai((int)race) && jx == 6498048 && st == 14) {
                                jx = JRMCoreH.isAprilFoolsModeOn() ? 13292516 : 14292268;
                            }
                            this.bindTexture(new ResourceLocation("jinryuudragonbc:cc/ss4" + (skintype == 0 ? "a" : "b") + ".png"));
                            RenderPlayerJBRA.glColor3f(jx);
                            this.modelMain.renderBody(0.0625f);
                        }
                        break block146;
                    }
                    for (int i = 0; i < absorptionData2.length; ++i) {
                        if (absorptionData2.length <= 0) continue;
                        slot_vanity_num[i] = i <= absorptionData2.length ? absorptionData2[i].split("\\+") : "0+0".split("\\+");
                        slot_van[i] = Integer.parseInt(slot_vanity_num[i][0]);
                        if (vanity_head || slot_van[i] <= 0) continue;
                        new Item();
                        Item vanity_check = Item.getItemById((int)slot_van[i]);
                        if (!(vanity_check instanceof ItemVanity) || ((ItemVanity)vanity_check).armorType != 5) continue;
                        if (slot_van[i] == Item.getIdFromItem((Item)ItemsDBC.Coat_2)) continue;
                        if (slot_van[i] == Item.getIdFromItem((Item)ItemsDBC.Coat)) continue;
                        vanity_head = true;
                    }
                    if (!saiOozar) {
                        boolean dhhwho;
                        boolean bl = JRMCoreConfig.HHWHO ? !helmet && !vanity_head || scouter : (dhhwho = true);
                        if (Hair == 12 && dhhwho && dnsH.length() > 3) {
                            this.bindTexture(new ResourceLocation("jinryuumodscore:gui/normallmajin.png"));
                            if (abstractClientPlayer == JBRAClient.mc.thePlayer && JRMCoreGuiScreen.hairPreview > 0) {
                                st = JRMCoreGuiScreen.hairPreviewStates[JRMCoreGuiScreen.hairPreview];
                            }
                            RenderPlayerJBRA.glColor3f(haircol);
                            this.modelMain.renderHairsV2(0.0625f, dnsH, 0.0f, st, rg, pl, race, this, abstractClientPlayer);
                        } else if (Hair == 10) {
                            this.bindTexture(new ResourceLocation("jinryuumodscore:gui/normallmajin.png"));
                            RenderPlayerJBRA.glColor3f(haircol);
                            this.modelMain.renderHairsV2(0.0625f, "005050555050000050505550500000505055505000005050455050000050505250500000505052505000005050555050000050505450500000505052505000005050525050000150433450500000505055505000005050525050000054395050500000505045505000005050475050000050504750500000505047505000015043655050000050504750500000505047505000005050475050000050504750500000544545505000005250505050000052505050500000525050505000005250505050000050505050500000505050505000005050505050000052505050500000525050505000005250505050000052505050500000525050505000005245505050000054505050500000525050505000005252505050000070505050500000705050505000007050505050000070505050500000705050505000347050505050003470505050500000705050505000007050505050000069505050500000695050505000007050505050000070505050500000705050505000007050505050000070505050500020", 0.0f, 0, 0, pl, race, this, abstractClientPlayer);
                        } else if (Hair == 11) {
                            this.bindTexture(new ResourceLocation("jinryuumodscore:gui/normallmajin.png"));
                            RenderPlayerJBRA.glColor3f(haircol);
                            this.modelMain.renderHairsV2(0.0625f, "345052545050001250545650500023505041505000345056455050000150505250500001505052505000015050555050000150505450500001505052505000015050525050000150433450500001505055505000015050525050000154395050500001505045505000015050475050000150504750500001505047505000015043655050000150504750500001505047505000015050475050000150504750500001544545505000015250505050003450505050500034505050505000015250505050000150505050500001505050505000015050505050000150505050500001525050505000015050505050000150505050500001525050505000235250505050003450505050500034505050505000235250505050000180501850500034695050505000346950505050000180501950500001805019505000345850505050003463505050500001805018505000018050185050003476505050500034765050505000018050195050003480501850500034505050505000345050505050003480501950500020", 0.0f, 0, 0, pl, race, this, abstractClientPlayer);
                        } else if (!dhhwho) {
                            // empty if block
                        }
                    }
                }
                if (mj) {
                    this.bindTexture(new ResourceLocation("jinryuudragonbc", "textures/misc/m.png"));
                    GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                    this.modelMain.renderHairs(0.0625f, "EYERIGHT");
                }
                if (dbc) {
                    int w = weight;
                    String[] wnam = new String[]{"wshell", "whandleg"};
                    if (w >= 0 && w < wnam.length) {
                        String[] wloc = new String[]{"roshiShell", "weightBands"};
                        this.bindTexture(new ResourceLocation("jinryuudragonbc:textures/misc/" + wloc[w] + ".png"));
                        GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                        this.modelMain.renderHairs(0.0625f, wnam[w]);
                    }
                }
                if (JGConfigClientSettings.CLIENT_DA19 && (JRMCoreH.DBC() || JRMCoreH.NC())) {
                    float one;
                    GL11.glPushMatrix();
                    GL11.glEnable((int)3042);
                    GL11.glDisable((int)2896);
                    GL11.glBlendFunc((int)770, (int)771);
                    GL11.glAlphaFunc((int)516, (float)0.003921569f);
                    GL11.glDepthMask((boolean)false);
                    int[] PlyrAttrbts = new int[JRMCoreH.PlyrAttrbts.length];
                    String[] stri = JRMCoreH.dat14[pl].split(",");
                    for (int i = 0; i < PlyrAttrbts.length; ++i) {
                        PlyrAttrbts[i] = Integer.parseInt(stri[i]);
                    }
                    int maxBody = JRMCoreH.stat((Entity)abstractClientPlayer, (int)2, (int)powerType, (int)2, (int)PlyrAttrbts[2], (int)race, (int)classID, (float)0.0f);
                    int curBody = Integer.parseInt(JRMCoreH.data((String)abstractClientPlayer.getCommandSenderName(), (int)8, (String)"200"));
                    int perc = (int)((float)curBody / (one = (float)maxBody / 100.0f));
                    if (perc < 70) {
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                        this.bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises1.png"));
                        this.modelMain.renderBody(0.0625f);
                    }
                    if (perc < 55) {
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                        this.bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises2.png"));
                        this.modelMain.renderBody(0.0625f);
                    }
                    if (perc < 35) {
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                        this.bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises3.png"));
                        this.modelMain.renderBody(0.0625f);
                    }
                    if (perc < 20) {
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                        this.bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises4.png"));
                        this.modelMain.renderBody(0.0625f);
                    }
                    GL11.glDepthMask((boolean)true);
                    GL11.glEnable((int)2896);
                    GL11.glDisable((int)3042);
                    GL11.glPopMatrix();
                    if (JRMCoreH.NC() && powerType == 2) {
                        if (classID == 1 && stY > 0) {
                            this.bindTexture(new ResourceLocation("jinryuunarutoc", "misc/dojutsu/byakugan1_" + eyes + ".png"));
                            GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                            this.modelMain.renderHairs(0.0625f, "EYERIGHT");
                        } else if (classID == 2 && stY > 0) {
                            int doujutsuID = (stY - 1) / 3 + 1;
                            if (doujutsuID < 1) {
                                doujutsuID = 1;
                            } else if (doujutsuID > 3) {
                                doujutsuID = 3;
                            }
                            this.bindTexture(new ResourceLocation("jinryuunarutoc", "misc/dojutsu/sharingan" + doujutsuID + "_" + eyes + ".png"));
                            GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                            this.modelMain.renderHairs(0.0625f, "EYERIGHT");
                        }
                    }
                }
                GL11.glPopMatrix();
                doit = false;
                break;
            }
        }
        if (JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && !abstractClientPlayer.isInvisible() && JRMCoreH.dnn((int)13)) {
            for (pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                if (!JRMCoreH.plyrs[pl].equals(abstractClientPlayer.getCommandSenderName()) || !JRMCoreH.aliveState((int)pl)) continue;
                GL11.glPushMatrix();
                this.bindTexture(new ResourceLocation("jinryuudragonbc:armor/halo.png"));
                GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                this.modelMain.renderHalo(0.0625f);
                GL11.glPopMatrix();
                break;
            }
        }
        if (doit && !abstractClientPlayer.isInvisible() && abstractClientPlayer.func_152123_o()) {
            if (JBRAH.JHDS() && JBRAH.getSkinHas(data)) {
                this.bindTexture(JBRAH.getSkinLoc(data));
            } else {
                this.bindTexture(abstractClientPlayer.getLocationSkin());
            }
            GL11.glPushMatrix();
            this.modelMain.renderHeadwear(0.0625f);
            GL11.glPopMatrix();
        }
        if (abstractClientPlayer.getEntityId() == JBRAClient.mc.thePlayer.getEntityId()) {
            if (curSkin == null) {
                curSkin = JBRAH.JHDS() && JBRAH.getSkinHas(data) ? JBRAH.getSkinLoc(data) : abstractClientPlayer.getLocationSkin();
            }
        }
        if (!curSkinUp) {
            curSkinUp = true;
        }
    }

    public static void glColor3f(int c) {
        float h2 = (float)(c >> 16 & 0xFF) / 255.0f;
        float h3 = (float)(c >> 8 & 0xFF) / 255.0f;
        float h4 = (float)(c & 0xFF) / 255.0f;
        float h1 = 1.0f;
        float r = h1 * h2;
        float g = h1 * h3;
        float b = h1 * h4;
        GL11.glColor3f((float)(r + RenderPlayerJBRA.getR()), (float)(g + RenderPlayerJBRA.getG()), (float)(b + RenderPlayerJBRA.getB()));
    }

    public static void glColor3f(int c, float a) {
        float h2 = (float)(c >> 16 & 0xFF) / 255.0f;
        float h3 = (float)(c >> 8 & 0xFF) / 255.0f;
        float h4 = (float)(c & 0xFF) / 255.0f;
        float h1 = 1.0f;
        if (JRMCoreH.JYC() && a > (float)(JRMCoreHJYC.JYCgetConfigpls() / 2)) {
            float lifespan = (float)JRMCoreHJYC.JYCgetConfigpls() * 0.25f;
            float age = a - (float)JRMCoreHJYC.JYCgetConfigpls() * 0.5f;
            float grey = 0.8627451f;
            float percentComplete = age / lifespan;
            percentComplete = percentComplete > 1.0f ? 1.0f : percentComplete;
            float percentGone = 1.0f - percentComplete;
            float red = h2 * percentGone + grey * percentComplete;
            float green = h3 * percentGone + grey * percentComplete;
            float blue = h4 * percentGone + grey * percentComplete;
            h2 = red;
            h3 = green;
            h4 = blue;
        }
        float r = h1 * h2;
        float g = h1 * h3;
        float b = h1 * h4;
        GL11.glColor3f((float)(r + RenderPlayerJBRA.getR()), (float)(g + RenderPlayerJBRA.getG()), (float)(b + RenderPlayerJBRA.getB()));
    }

    protected void renderEquippedItems(AbstractClientPlayer p_77029_1_, float p_77029_2_) {
        ItemStack itemstack1;
        float f2;
        RenderPlayerEvent.Specials.Pre event = new RenderPlayerEvent.Specials.Pre((EntityPlayer)p_77029_1_, (RenderPlayer)this, p_77029_2_);
        if (MinecraftForge.EVENT_BUS.post((Event)event)) {
            return;
        }
        GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
        this.renderArrowsStuckInEntity((EntityLivingBase)p_77029_1_, p_77029_2_);
        ItemStack itemstack = p_77029_1_.inventory.armorItemInSlot(3);
        if (itemstack != null && event.renderHelmet) {
            float f1;
            GL11.glPushMatrix();
            this.modelMain.bipedHead.postRender(0.0625f);
            if (itemstack.getItem() instanceof ItemBlock) {
                boolean is3D;
                IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer((ItemStack)itemstack, (IItemRenderer.ItemRenderType)IItemRenderer.ItemRenderType.EQUIPPED);
                boolean bl = is3D = customRenderer != null && customRenderer.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, itemstack, IItemRenderer.ItemRendererHelper.BLOCK_3D);
                if (is3D || RenderBlocks.renderItemIn3d((int)Block.getBlockFromItem((Item)itemstack.getItem()).getRenderType())) {
                    f1 = 0.625f;
                    GL11.glTranslatef((float)0.0f, (float)-0.25f, (float)0.0f);
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glScalef((float)f1, (float)(-f1), (float)(-f1));
                }
                this.renderManager.itemRenderer.renderItem((EntityLivingBase)p_77029_1_, itemstack, 0);
            } else if (itemstack.getItem() == Items.skull) {
                f1 = 1.0625f;
                GL11.glScalef((float)f1, (float)(-f1), (float)(-f1));
                GameProfile gameprofile = null;
                if (itemstack.hasTagCompound()) {
                    NBTTagCompound nbttagcompound = itemstack.getTagCompound();
                    if (nbttagcompound.hasKey("SkullOwner", 10)) {
                        gameprofile = NBTUtil.func_152459_a((NBTTagCompound)nbttagcompound.getCompoundTag("SkullOwner"));
                    } else if (nbttagcompound.hasKey("SkullOwner", 8) && !StringUtils.isNullOrEmpty((String)nbttagcompound.getString("SkullOwner"))) {
                        gameprofile = new GameProfile((UUID)null, nbttagcompound.getString("SkullOwner"));
                    }
                }
                TileEntitySkullRenderer.field_147536_b.func_152674_a(-0.5f, 0.0f, -0.5f, 1, 180.0f, itemstack.getItemDamage(), gameprofile);
            }
            GL11.glPopMatrix();
        }
        this.renderEquippedItemsJBRA(p_77029_1_, p_77029_2_);
        if (p_77029_1_.getCommandSenderName().equals("deadmau5") && p_77029_1_.func_152123_o()) {
            this.bindTexture(p_77029_1_.getLocationSkin());
            for (int j = 0; j < 2; ++j) {
                float f9 = p_77029_1_.prevRotationYaw + (p_77029_1_.rotationYaw - p_77029_1_.prevRotationYaw) * p_77029_2_ - (p_77029_1_.prevRenderYawOffset + (p_77029_1_.renderYawOffset - p_77029_1_.prevRenderYawOffset) * p_77029_2_);
                float f10 = p_77029_1_.prevRotationPitch + (p_77029_1_.rotationPitch - p_77029_1_.prevRotationPitch) * p_77029_2_;
                GL11.glPushMatrix();
                GL11.glRotatef((float)f9, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)f10, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glTranslatef((float)(0.375f * (float)(j * 2 - 1)), (float)0.0f, (float)0.0f);
                GL11.glTranslatef((float)0.0f, (float)-0.375f, (float)0.0f);
                GL11.glRotatef((float)(-f10), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-f9), (float)0.0f, (float)1.0f, (float)0.0f);
                f2 = 1.3333334f;
                GL11.glScalef((float)f2, (float)f2, (float)f2);
                this.modelBipedMain.renderEars(0.0625f);
                GL11.glPopMatrix();
            }
        }
        boolean flag = p_77029_1_.func_152122_n();
        boolean bl = flag = event.renderCape && flag;
        if (flag && !p_77029_1_.isInvisible() && !p_77029_1_.getHideCape()) {
            this.bindTexture(p_77029_1_.getLocationCape());
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.125f);
            double d3 = p_77029_1_.field_71091_bM + (p_77029_1_.field_71094_bP - p_77029_1_.field_71091_bM) * (double)p_77029_2_ - (p_77029_1_.prevPosX + (p_77029_1_.posX - p_77029_1_.prevPosX) * (double)p_77029_2_);
            double d4 = p_77029_1_.field_71096_bN + (p_77029_1_.field_71095_bQ - p_77029_1_.field_71096_bN) * (double)p_77029_2_ - (p_77029_1_.prevPosY + (p_77029_1_.posY - p_77029_1_.prevPosY) * (double)p_77029_2_);
            double d0 = p_77029_1_.field_71097_bO + (p_77029_1_.field_71085_bR - p_77029_1_.field_71097_bO) * (double)p_77029_2_ - (p_77029_1_.prevPosZ + (p_77029_1_.posZ - p_77029_1_.prevPosZ) * (double)p_77029_2_);
            float f4 = p_77029_1_.prevRenderYawOffset + (p_77029_1_.renderYawOffset - p_77029_1_.prevRenderYawOffset) * p_77029_2_;
            double d1 = MathHelper.sin((float)(f4 * (float)Math.PI / 180.0f));
            double d2 = -MathHelper.cos((float)(f4 * (float)Math.PI / 180.0f));
            float f5 = (float)d4 * 10.0f;
            if (f5 < -6.0f) {
                f5 = -6.0f;
            }
            if (f5 > 32.0f) {
                f5 = 32.0f;
            }
            float f6 = (float)(d3 * d1 + d0 * d2) * 100.0f;
            float f7 = (float)(d3 * d2 - d0 * d1) * 100.0f;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            float f8 = p_77029_1_.prevCameraYaw + (p_77029_1_.cameraYaw - p_77029_1_.prevCameraYaw) * p_77029_2_;
            f5 += MathHelper.sin((float)((p_77029_1_.prevDistanceWalkedModified + (p_77029_1_.distanceWalkedModified - p_77029_1_.prevDistanceWalkedModified) * p_77029_2_) * 6.0f)) * 32.0f * f8;
            if (p_77029_1_.isSneaking()) {
                f5 += 25.0f;
            }
            GL11.glRotatef((float)(6.0f + f6 / 2.0f + f5), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(f7 / 2.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(-f7 / 2.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            this.modelMain.renderCloak(0.0625f);
            GL11.glPopMatrix();
        }
        boolean m = (itemstack1 = p_77029_1_.inventory.getCurrentItem()) != null && event.renderItem;
        String s = JRMCoreH.data((String)p_77029_1_.getCommandSenderName(), (int)1, (String)"0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0").split(";")[16];
        if (m) {
            IItemRenderer customRenderer;
            boolean is3D;
            GL11.glPushMatrix();
            float fm = 0.0f;
            if (gen <= 1) {
                GL11.glScalef((float)(1.0f / childScl), (float)(1.0f / childScl), (float)(1.0f / childScl));
                GL11.glTranslatef((float)0.0f, (float)((childScl - 1.0f) * 1.5f), (float)0.0f);
                this.modelMain.RA.postRender(0.0625f);
                fm = 0.0f;
            }
            if (gen >= 2) {
                GL11.glScalef((float)(1.0f / childScl * (gen <= 1 ? 1.0f : 0.7f)), (float)(1.0f / childScl), (float)(1.0f / childScl * (gen <= 1 ? 1.0f : 0.7f)));
                GL11.glTranslatef((float)0.0f, (float)((childScl - 1.0f) * 1.5f), (float)0.0f);
                this.modelMain.RA.postRender(0.0625f);
                fm = 0.1f;
            }
            float d0 = childScl;
            GL11.glTranslatef((float)-0.0625f, (float)0.4375f, (float)0.0625f);
            if (p_77029_1_.fishEntity != null) {
                itemstack1 = new ItemStack(Items.stick);
            }
            EnumAction enumaction = null;
            if (p_77029_1_.getItemInUseCount() > 0) {
                enumaction = itemstack1.getItemUseAction();
            }
            boolean bl2 = is3D = (customRenderer = MinecraftForgeClient.getItemRenderer((ItemStack)itemstack1, (IItemRenderer.ItemRenderType)IItemRenderer.ItemRenderType.EQUIPPED)) != null && customRenderer.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, itemstack1, IItemRenderer.ItemRendererHelper.BLOCK_3D);
            if (is3D || itemstack1.getItem() instanceof ItemBlock && RenderBlocks.renderItemIn3d((int)Block.getBlockFromItem((Item)itemstack1.getItem()).getRenderType())) {
                f2 = 0.5f;
                GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)-0.3125f);
                GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)(-(f2 *= 0.75f)), (float)(-f2), (float)f2);
            } else if (itemstack1.getItem() == Items.bow) {
                f2 = 0.625f;
                GL11.glTranslatef((float)0.0f, (float)0.125f, (float)0.3125f);
                GL11.glRotatef((float)-20.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)f2, (float)(-f2), (float)f2);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else if (itemstack1.getItem().isFull3D()) {
                f2 = 0.625f;
                if (itemstack1.getItem().shouldRotateAroundWhenRendering()) {
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)0.0f, (float)-0.125f, (float)0.0f);
                }
                if (p_77029_1_.getItemInUseCount() > 0 && enumaction == EnumAction.block) {
                    GL11.glTranslatef((float)0.05f, (float)0.0f, (float)-0.1f);
                    GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)-10.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                }
                GL11.glTranslatef((float)0.0f, (float)0.1875f, (float)0.0f);
                GL11.glScalef((float)f2, (float)(-f2), (float)f2);
                GL11.glRotatef((float)-100.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                f2 = 0.375f;
                GL11.glTranslatef((float)0.25f, (float)0.1875f, (float)-0.1875f);
                GL11.glScalef((float)f2, (float)f2, (float)f2);
                GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (itemstack1.getItem().requiresMultipleRenderPasses()) {
                for (int k = 0; k < itemstack1.getItem().getRenderPasses(itemstack1.getItemDamage()); ++k) {
                    int i = itemstack1.getItem().getColorFromItemStack(itemstack1, k);
                    float f12 = (float)(i >> 16 & 0xFF) / 255.0f;
                    float f3 = (float)(i >> 8 & 0xFF) / 255.0f;
                    float f4 = (float)(i & 0xFF) / 255.0f;
                    GL11.glColor4f((float)f12, (float)f3, (float)f4, (float)1.0f);
                    this.renderManager.itemRenderer.renderItem((EntityLivingBase)p_77029_1_, itemstack1, k);
                }
            } else {
                int k = itemstack1.getItem().getColorFromItemStack(itemstack1, 0);
                float f11 = (float)(k >> 16 & 0xFF) / 255.0f;
                float f12 = (float)(k >> 8 & 0xFF) / 255.0f;
                float f3 = (float)(k & 0xFF) / 255.0f;
                GL11.glColor4f((float)f11, (float)f12, (float)f3, (float)1.0f);
                this.renderManager.itemRenderer.renderItem((EntityLivingBase)p_77029_1_, itemstack1, 0);
            }
            GL11.glPopMatrix();
        }
        MinecraftForge.EVENT_BUS.post((Event)new RenderPlayerEvent.Specials.Post((EntityPlayer)p_77029_1_, (RenderPlayer)this, p_77029_2_));
    }

    private void func_aam(ModelRenderer ra, ModelRenderer la, int id, boolean fp) {
        if (id == 0 || id == 6) {
            if (id == 0 ? JGConfigClientSettings.CLIENT_DA18 : JGConfigClientSettings.instantTransmissionFirstPerson) {
                GL11.glPushMatrix();
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glAlphaFunc((int)516, (float)0.003921569f);
                GL11.glDepthMask((boolean)false);
                GL11.glTranslatef((float)-0.5f, (float)-0.1f, (float)-0.1f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)-1.0f);
                GL11.glRotatef((float)80.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(id == 0 ? -20 : 30), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            ra.render(0.0625f);
            if (id == 0 ? JGConfigClientSettings.CLIENT_DA18 : JGConfigClientSettings.instantTransmissionFirstPerson) {
                GL11.glPopMatrix();
            }
        } else if (id == 2 || id == 3) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)-0.2f, (float)0.0f, (float)-0.1f);
            GL11.glRotatef((float)10.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)-1.0f);
            ra.render(0.0625f);
            GL11.glPopMatrix();
        } else if (id == 4 || id == 5) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)-0.2f, (float)0.4f, (float)-0.1f);
            GL11.glRotatef((float)10.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)-1.0f);
            GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            ra.render(0.0625f);
            GL11.glPopMatrix();
        }
    }

    private void func_aam2(ModelRenderer ra, ModelRenderer la, int id, boolean fp) {
        if (id == 0) {
            if (JGConfigClientSettings.CLIENT_DA18) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)-0.2f, (float)-0.4f, (float)-0.8f);
                GL11.glRotatef((float)50.0f, (float)1.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                la.render(0.0625f);
                GL11.glPopMatrix();
            }
        } else if (id == 3) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)0.1f, (float)-0.2f, (float)-0.5f);
            GL11.glTranslatef((float)-0.2f, (float)0.0f, (float)-0.1f);
            GL11.glRotatef((float)10.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)-1.0f);
            GL11.glRotatef((float)115.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            la.render(0.0625f);
            GL11.glPopMatrix();
        } else if (id == 5) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)-0.2f, (float)-0.4f, (float)-0.8f);
            GL11.glTranslatef((float)-0.4f, (float)0.1f, (float)-0.1f);
            GL11.glRotatef((float)42.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)115.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.6f, (float)0.08f, (float)0.3f);
            la.render(0.0625f);
            GL11.glPopMatrix();
        }
    }

    private void func_aam(int id, boolean s, boolean fp) {
        if (s) {
            if (id == 0 || id == 6) {
                if (id == 0 ? JGConfigClientSettings.CLIENT_DA18 : JGConfigClientSettings.instantTransmissionFirstPerson) {
                    GL11.glEnable((int)3042);
                    GL11.glBlendFunc((int)770, (int)771);
                    GL11.glAlphaFunc((int)516, (float)0.003921569f);
                    GL11.glDepthMask((boolean)false);
                    GL11.glTranslatef((float)-0.5f, (float)-0.1f, (float)-0.1f);
                    GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)-1.0f);
                    GL11.glRotatef((float)80.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)(id == 0 ? -20 : 30), (float)0.0f, (float)0.0f, (float)1.0f);
                }
            } else if (id == 1) {
                GL11.glTranslatef((float)-0.2f, (float)-0.4f, (float)-0.8f);
                GL11.glRotatef((float)50.0f, (float)1.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else if (id == 2 || id == 3) {
                GL11.glTranslatef((float)-0.2f, (float)0.0f, (float)-0.1f);
                GL11.glRotatef((float)10.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)-1.0f);
            } else if (id == 4 || id == 5) {
                GL11.glTranslatef((float)-0.2f, (float)0.4f, (float)-0.1f);
                GL11.glRotatef((float)10.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)-1.0f);
                GL11.glRotatef((float)40.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
        } else if (id == 0) {
            if (JGConfigClientSettings.CLIENT_DA18) {
                GL11.glTranslatef((float)-0.2f, (float)-0.4f, (float)-0.8f);
                GL11.glRotatef((float)50.0f, (float)1.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            }
        } else if (id == 3) {
            GL11.glTranslatef((float)0.1f, (float)-0.2f, (float)-0.5f);
            GL11.glTranslatef((float)-0.2f, (float)0.0f, (float)-0.1f);
            GL11.glRotatef((float)10.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)20.0f, (float)0.0f, (float)0.0f, (float)-1.0f);
            GL11.glRotatef((float)115.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        } else if (id == 5) {
            GL11.glTranslatef((float)-0.2f, (float)-0.4f, (float)-0.8f);
            GL11.glTranslatef((float)-0.4f, (float)0.1f, (float)-0.1f);
            GL11.glRotatef((float)42.0f, (float)-1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)115.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.6f, (float)0.08f, (float)0.3f);
        }
    }

    public void chakra(Entity e, int id) {
        GL11.glPushMatrix();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2977);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)2896);
        int height = 112;
        int width = 32;
        int u = 0;
        int v = 0;
        float x2 = -66.0f;
        float y2 = -16.0f;
        float z2 = -16.0f;
        GL11.glTranslatef((float)0.29f, (float)0.73f, (float)0.0f);
        boolean k1 = false;
        float sc = 0.0f;
        sc = id;
        sc = sc < 0.0f ? 0.0f : (sc /= 800.0f);
        float par = 0.015f;
        if (sc > par) {
            sc = par;
        }
        GL11.glScalef((float)sc, (float)sc, (float)sc);
        float alpha = 1.0f;
        GL11.glColor4f((float)0.5f, (float)0.7f, (float)1.0f, (float)(1.3f - alpha));
        ResourceLocation tx = new ResourceLocation("jinryuunarutoc:chakra_trail.png");
        JRMCoreClient.mc.getTextureManager().bindTexture(tx);
        GL11.glRotated((double)-20.0, (double)1.0, (double)0.0, (double)0.0);
        int i_max = 4;
        GL11.glRotated((double)((float)e.ticksExisted * 15.0f), (double)0.0, (double)0.0, (double)1.0);
        GL11.glRotated((double)30.0, (double)1.0, (double)0.0, (double)0.0);
        for (int i = 0; i < i_max; ++i) {
            GL11.glRotated((double)(i * (360 / i_max)), (double)0.0, (double)0.0, (double)1.0);
            float f = 0.00390625f;
            float f1 = 0.00390625f;
            Tessellator tessellator = Tessellator.instance;
            tessellator.startDrawingQuads();
            tessellator.addVertexWithUV((double)x2, (double)(y2 + 0.0f), (double)z2, (double)((float)(u + 0) * f), (double)((float)(v + 0) * f1));
            tessellator.addVertexWithUV((double)x2, (double)(y2 + (float)height), (double)z2, (double)((float)(u + 0) * f), (double)((float)(v + height) * f1));
            tessellator.addVertexWithUV((double)(x2 + (float)width), (double)(y2 + (float)height), (double)z2, (double)((float)(u + width) * f), (double)((float)(v + height) * f1));
            tessellator.addVertexWithUV((double)(x2 + (float)width), (double)(y2 + 0.0f), (double)z2, (double)((float)(u + width) * f), (double)((float)(v + 0) * f1));
            tessellator.draw();
        }
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2977);
        GL11.glDisable((int)2896);
        GL11.glPopMatrix();
    }

    public void lightning(Entity e, int id) {
        GL11.glPushMatrix();
        Tessellator tessellator2 = Tessellator.instance;
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)1);
        double[] adouble = new double[8];
        double[] adouble1 = new double[8];
        double d3 = 0.0;
        double d4 = 0.0;
        GL11.glTranslatef((float)0.29f, (float)0.73f, (float)0.0f);
        boolean k1 = false;
        float sc = 0.0f;
        sc = (float)id / 50.0f;
        float par = 0.4f;
        if (sc > par) {
            sc = par;
        }
        GL11.glScalef((float)sc, (float)sc, (float)sc);
        for (int i = 0; i < 10; ++i) {
            if (!JRMCoreClient.mc.isGamePaused()) {
                this.lightVertRotation[i][0] = (int)(Math.random() * 11.0) * 36;
                this.lightVertRotation[i][1] = (float)(Math.random() * 2.0) - 1.0f;
                this.lightVertRotation[i][2] = (float)(Math.random() * 2.0) - 1.0f;
            }
            GL11.glRotated((double)(i * 36), (double)0.0, (double)0.0, (double)1.0);
            GL11.glRotatef((float)this.lightVertRotation[i][0], (float)this.lightVertRotation[i][1], (float)this.lightVertRotation[i][2], (float)0.0f);
            Random random1 = new Random(this.lightVert[i]);
            for (int j = 0; j < 3; ++j) {
                int k = 7;
                int l = 0;
                if (j > 0) {
                    k = 7 - j;
                }
                if (j > 0) {
                    l = k - 2;
                }
                double d5 = adouble[k] - d3;
                double d6 = adouble1[k] - d4;
                for (int i1 = k; i1 >= l; --i1) {
                    double d7 = d5;
                    double d8 = d6;
                    d5 += (double)(random1.nextInt(31) - 15) * (double)0.07f;
                    d6 += (double)(random1.nextInt(31) - 15) * (double)0.07f;
                    tessellator2.startDrawing(5);
                    float f2 = 0.5f;
                    tessellator2.setColorRGBA_F(0.9f * f2, 0.9f * f2, 1.0f * f2, 0.3f);
                    double d9 = 0.1 + (double)k1 * 0.2;
                    double d10 = 0.1 + (double)k1 * 0.2;
                    for (int j1 = 0; j1 < 5; ++j1) {
                        double d11 = 0.0 - d9;
                        double d12 = 0.0 - d9;
                        if (j1 == 1 || j1 == 2) {
                            d11 += d9 * 2.0 * (double)sc;
                        }
                        if (j1 == 2 || j1 == 3) {
                            d12 += d9 * 2.0 * (double)sc;
                        }
                        double d13 = 0.0 - d10;
                        double d14 = 0.0 - d10;
                        if (j1 == 1 || j1 == 2) {
                            d13 += d10 * 2.0 * (double)sc;
                        }
                        if (j1 == 2 || j1 == 3) {
                            d14 += d10 * 2.0 * (double)sc;
                        }
                        if (i1 >= 8) continue;
                        tessellator2.addVertex(d13 + d5 * (double)sc, -((double)(i1 * 1 - 7)) * (double)sc, d14 + d6 * (double)sc);
                        tessellator2.addVertex(d11 + d7 * (double)sc, -((double)((i1 + 1) * 1 - 7)) * (double)sc, d12 + d8 * (double)sc);
                    }
                    tessellator2.draw();
                }
            }
        }
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)3553);
        GL11.glPopMatrix();
    }

    public static void hndff(Entity e, boolean b, int id, int idd2) {
        int id2 = id == 1 ? 0 : -1;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glDisable((int)2896);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glAlphaFunc((int)516, (float)0.003921569f);
        GL11.glDepthMask((boolean)true);
        GL11.glTranslatef((float)0.25f, (float)0.7f, (float)0.0f);
        float sc = idd2;
        sc = sc < 0.0f ? 0.0f : (sc /= 100.0f);
        float par = 0.2f;
        if (sc > par) {
            sc = par;
        }
        GL11.glScalef((float)sc, (float)sc, (float)sc);
        float red = 1.0f;
        float green = 1.0f;
        float blue = 1.0f;
        if (b) {
            JRMCoreClient.mc.renderEngine.bindTexture(new ResourceLocation(JRMCoreH.tjjrmc + ":allw.png"));
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
        } else {
            JRMCoreClient.mc.renderEngine.bindTexture(new ResourceLocation(JRMCoreH.tjjrmc + ":allw.png"));
        }
        float ex = e.ticksExisted;
        float r4 = (MathHelper.cos((float)(ex / 2.0f)) / 3.0f - 0.2f) / 8.0f;
        if (gen == 2) {
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }
        GL11.glRotatef((float)((float)e.ticksExisted * 45.0f), (float)1.0f, (float)1.0f, (float)1.0f);
        if (id == 1) {
            GL11.glColor4f((float)0.7f, (float)0.9f, (float)1.0f, (float)0.6f);
            JRMCoreHJBRA.model1.render();
        }
        if (id == 2) {
            float sc2 = 2.6f;
            GL11.glScalef((float)sc2, (float)sc2, (float)sc2);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.8f);
        } else if (id == 1) {
            float sc2 = 2.6f;
            GL11.glScalef((float)sc2, (float)sc2, (float)sc2);
            GL11.glColor4f((float)0.7f, (float)0.9f, (float)1.0f, (float)0.3f);
        }
        JRMCoreHJBRA.model1.render();
        GL11.glEnable((int)2896);
        GL11.glDepthMask((boolean)true);
        GL11.glPopMatrix();
    }

    public static void kss(Entity e, boolean b, int id, int kf, int ki) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glDisable((int)2896);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glAlphaFunc((int)516, (float)0.003921569f);
        GL11.glDepthMask((boolean)true);
        float scale = 1.0f;
        GL11.glScalef((float)scale, (float)scale, (float)scale);
        float red = 1.0f;
        float green = 1.0f;
        float blue = 1.0f;
        String seee = JRMCoreH.StusEfctsClient((EntityPlayer)((EntityPlayer)e));
        String[] dat5 = JRMCoreH.data((String)e.getCommandSenderName(), (int)5, (String)"50;0").split(";");
        int aaa = Integer.parseInt(dat5[0]);
        int ccc = Integer.parseInt(dat5[1]);
        String[] a = JRMCoreH.data((String)e.getCommandSenderName(), (int)1, (String)"0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0").split(";");
        int rrr = Integer.parseInt(a[0]);
        String[] st = JRMCoreH.data((String)e.getCommandSenderName(), (int)2, (String)"0;0").split(";");
        int sss = Integer.parseInt(st[0]);
        ccc = ccc > 0 ? ccc : JRMCoreH.Algnmnt_rc((int)aaa);
        boolean vvv = JRMCoreH.StusEfcts((int)17, (String)seee);
        boolean lsaaa = JRMCoreH.lgndb((String)seee, (int)rrr, (int)sss);
        boolean ultraInstinctOn = JRMCoreH.StusEfcts((int)19, (String)seee);
        boolean GodOfDestructionOn = JRMCoreH.StusEfcts((int)20, (String)seee);
        int color = JRMCoreHDBC.getPlayerColor2((int)2, (int)ccc, (int)1, (int)rrr, (int)sss, (boolean)vvv, (boolean)lsaaa, (boolean)ultraInstinctOn, (boolean)GodOfDestructionOn);
        float alfa = 0.6f;
        float h1 = 1.0f;
        float h2 = (float)(color >> 16 & 0xFF) / 255.0f;
        float h3 = (float)(color >> 8 & 0xFF) / 255.0f;
        float h4 = (float)(color & 0xFF) / 255.0f;
        red = h1 * h2;
        green = h1 * h3;
        blue = h1 * h4;
        if (red > 1.0f) {
            red = 1.0f;
        }
        if (green > 1.0f) {
            green = 1.0f;
        }
        if (blue > 1.0f) {
            blue = 1.0f;
        }
        GL11.glTranslatef((float)-0.06f, (float)-0.05f, (float)0.0f);
        JRMCoreClient.mc.renderEngine.bindTexture(new ResourceLocation(JRMCoreH.tjjrmc + ":allw.png"));
        if (gen == 2) {
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }
        if (id == 0) {
            float scl = (float)kf * 0.02f + (float)ki * 0.02f;
            GL11.glTranslatef((float)0.0f, (float)(-scl * 0.7f), (float)0.0f);
            GL11.glScalef((float)1.0f, (float)(1.0f + scl), (float)1.0f);
            float ex = e.ticksExisted;
            float r4 = (MathHelper.cos((float)(ex / 2.0f)) / 3.0f - 0.2f) / 8.0f;
            GL11.glTranslatef((float)0.0f, (float)(-r4), (float)0.0f);
            GL11.glColor4f((float)red, (float)green, (float)blue, (float)alfa);
            GL11.glRotatef((float)(ex * 25.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            JRMCoreHJBRA.model2.render(0.0625f, id);
            GL11.glTranslatef((float)0.0f, (float)-0.12f, (float)0.0f);
            GL11.glScalef((float)(scale * 1.3f), (float)(scale * 1.18f), (float)(scale * 1.3f));
            GL11.glColor4f((float)(red * 0.8f), (float)(green * 0.8f), (float)(blue * 0.8f), (float)(alfa * 0.8f));
            JRMCoreHJBRA.model2.render(0.0625f, id);
        }
        if (id == 1) {
            GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f);
            GL11.glColor4f((float)red, (float)green, (float)blue, (float)alfa);
            GL11.glRotatef((float)-3.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)5.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            JRMCoreHJBRA.model2.render(0.0625f, id);
        }
        GL11.glEnable((int)2896);
        GL11.glDepthMask((boolean)true);
        GL11.glPopMatrix();
    }

    public static void ow(boolean b) {
        GL11.glPushMatrix();
        float scale = 1.0f;
        GL11.glScalef((float)scale, (float)scale, (float)scale);
        float f1 = 0.0020714286f;
        GL11.glScalef((float)f1, (float)f1, (float)f1);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (b) {
            JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation("jinryuujyearsc:watch/hw0.png"));
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
        } else {
            JRMCoreClient.mc.renderEngine.bindTexture(new ResourceLocation("jinryuujyearsc:watch/hw0.png"));
        }
        if (gen == 2) {
            GL11.glRotatef((float)7.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }
        GL11.glTranslatef((float)-33.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glTranslatef((float)32.0f, (float)0.0f, (float)0.0f);
        GL11.glTranslatef((float)0.0f, (float)150.0f, (float)0.0f);
        JRMCoreHC.dtm((float)-96.0f, (float)0.0f, (int)0, (int)0, (float)128.0f, (float)128.0f, (float)-64.0f);
        GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        JRMCoreHC.dtm((float)-64.0f, (float)0.0f, (int)128, (int)0, (float)128.0f, (float)128.0f, (float)-32.0f);
        GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        JRMCoreHC.dtm((float)-32.0f, (float)0.0f, (int)128, (int)0, (float)128.0f, (float)128.0f, (float)-64.0f);
        GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        JRMCoreHC.dtm((float)-64.0f, (float)0.0f, (int)128, (int)0, (float)128.0f, (float)128.0f, (float)-96.0f);
        GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glTranslatef((float)-104.0f, (float)-70.0f, (float)-65.0f);
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        scale = 2.0f;
        float scaley = 4.0f;
        GL11.glScalef((float)scale, (float)scaley, (float)scale);
        int s = (int)(JRMCoreClient.mc.thePlayer.worldObj.getWorldTime() % 24000L / 1000L) + 6;
        int w = s > 24 ? s - 24 : s;
        w = w == 24 ? 0 : w;
        int m = (int)(JRMCoreClient.mc.thePlayer.worldObj.getWorldTime() % 24000L - (long)((int)(JRMCoreClient.mc.thePlayer.worldObj.getWorldTime() % 24000L / 1000L) * 1000));
        float mi = (float)m / 16.67f;
        int min = (int)mi;
        String var34 = (w < 10 ? "0" + w : Integer.valueOf(w)) + ":" + (min < 10 ? "0" + min : Integer.valueOf(min));
        FontRenderer fontRenderer = JRMCoreClient.mc.fontRenderer;
        String n = "" + var34;
        int nw = fontRenderer.getStringWidth(n);
        fontRenderer.drawString(n, (int)(-96.0f / scale), -((int)(150.0f / scaley)), 0);
        GL11.glPopMatrix();
    }

    protected void preRenderCallback(AbstractClientPlayer p, float p_77041_2_) {
        boolean noC;
        float f1 = 0.9375f;
        float f2 = 1.0f;
        float f3 = 1.0f;
        boolean bl = noC = !JRMCoreH.DBC();
        if (gen <= 1) {
            f1 = 0.73f + (noC ? 0.2f : 0.0f);
        }
        if (gen >= 2) {
            f1 = 0.7f + (noC ? 0.2f : 0.0f);
        }
        if (JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && !p.isInvisible() && JRMCoreH.dnn((int)2) && JRMCoreH.dnn((int)1) && JRMCoreH.dnn((int)3) && JRMCoreH.dnn((int)14) && JRMCoreH.dnn((int)10)) {
            for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                boolean w;
                if (!JRMCoreH.plyrs[pl].equals(p.getCommandSenderName()) || JRMCoreH.dat14.length < JRMCoreH.plyrs.length) continue;
                if (JRMCoreH.StusEfctsClient((int)11, (EntityPlayer)p)) {
                    GL11.glScalef((float)0.01f, (float)0.01f, (float)0.01f);
                    return;
                }
                String[] s = JRMCoreH.data1[pl].split(";");
                String[] s2 = JRMCoreH.data2[pl].split(";");
                String s3 = JRMCoreH.data3[pl];
                String[] s14 = JRMCoreH.dat14[pl].split(",");
                int[] PlyrAttrbts = new int[JRMCoreH.PlyrAttrbts.length];
                float f1r = f1;
                for (int i = 0; i < PlyrAttrbts.length; ++i) {
                    PlyrAttrbts[i] = Integer.parseInt(s14[i]);
                }
                if (JRMCoreH.DBC()) {
                    float f1ao;
                    float f3a;
                    f1 += JRMCoreHDBC.DBCsizeBasedOnCns2((int[])PlyrAttrbts);
                    int pwr = Integer.parseInt(s[2]);
                    if (!JRMCoreH.isPowerTypeChakra((int)pwr)) {
                        int race = Integer.parseInt(s[0]);
                        boolean divine = race == 3 ? JRMCoreH.StusEfctsClient((int)17, (int)pl) : false;
                        f2 = JRMCoreHDBC.DBCsizeBasedOnRace((int)this.b(s[0]), (int)this.b(s2[0]), (boolean)divine);
                        f3 = JRMCoreHDBC.DBCsizeBasedOnRace2((int)this.b(s[0]), (int)this.b(s2[0]), (boolean)divine);
                    }
                    int cr = Integer.parseInt(JRMCoreH.dat10[pl].split(";")[0]);
                    if (JRMCoreH.rSai((int)this.b(s[0])) && (this.b(s2[0]) == 7 || this.b(s2[0]) == 8)) {
                        cr = 50;
                        f1 = f1r;
                    }
                    f3 = (f3a = (f3 - 1.0f) * (float)cr * 0.02f + 1.0f) > f3 ? f3 : (f3 > 1.0f ? f3a : f3);
                    float f2a = (f2 - 1.0f) * (float)cr * 0.02f + 1.0f;
                    f2 = f2 > 1.0f ? f2a : f2;
                    float f1a1 = (f1 - f1r) * (cr <= 50 ? 0.25f : 0.5f);
                    float f1ac = f1a1 * (float)cr * 0.02f;
                    f1 = f1ao = f1 - f1r - f1a1 + f1ac + f1r;
                }
                if (JRMCoreH.PlyrPwr((EntityPlayer)p) != 1) break;
                String[] d4 = JRMCoreH.data((int)pl, (int)4, (String)"0;0;0").split(";");
                boolean oks = Integer.parseInt(d4[2]) == 1;
                boolean bl2 = w = JRMCoreH.StusEfctsClient((int)7, (EntityPlayer)p) || JRMCoreH.StusEfctsClient((int)9, (EntityPlayer)p) && s3.contains("1") && !JRMCoreH.StusEfctsClient((int)4, (EntityPlayer)p);
                if (oks) {
                    p.rotationPitch = 0.0f;
                    p.rotationYaw = 0.0f;
                    GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glTranslatef((float)0.0f, (float)0.8f, (float)-0.1f);
                    ModelBipedDBC.y = 3;
                    break;
                }
                if (p != null && p instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer)p).getUIAnim() != 0) {
                    float diff = 0.3f;
                    int animation_id = ExtendedPlayer.get((EntityPlayer)p).getUIAnimID();
                    if (animation_id == 0) {
                        GL11.glRotatef((float)-80.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.3f);
                    } else if (animation_id == 1) {
                        GL11.glRotatef((float)80.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.3f);
                    } else if (animation_id == 2) {
                        GL11.glRotatef((float)-40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.3f);
                    } else if (animation_id == 3) {
                        GL11.glRotatef((float)40.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.3f);
                    }
                    ModelBipedDBC.y = 4 + animation_id;
                    ModelBipedDBC.animation = ExtendedPlayer.get((EntityPlayer)p).getUIAnim();
                    break;
                }
                if ((w || s3.contains("1")) && !p.onGround) {
                    GL11.glTranslatef((float)0.0f, (float)-1.5f, (float)0.0f);
                    if (w) {
                        GL11.glRotatef((float)(p.rotationPitch + 90.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                    } else {
                        GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    }
                    ModelBipedDBC.y = 2;
                    break;
                }
                ModelBipedDBC.y = 1;
                break;
            }
        }
        GL11.glScalef((float)(f1 * f2 * f3), (float)(f1 * f3), (float)(f1 * f2 * f3));
    }

    protected void func_96449_a(AbstractClientPlayer p_96449_1_, double p_96449_2_, double p_96449_4_, double p_96449_6_, String p_96449_8_, float p_96449_9_, double p_96449_10_) {
        Scoreboard scoreboard;
        ScoreObjective scoreobjective;
        if (p_96449_10_ < 100.0 && (scoreobjective = (scoreboard = p_96449_1_.getWorldScoreboard()).func_96539_a(2)) != null) {
            Score score = scoreboard.func_96529_a(p_96449_1_.getCommandSenderName(), scoreobjective);
            if (p_96449_1_.isPlayerSleeping()) {
                this.func_147906_a((Entity)p_96449_1_, score.getScorePoints() + " " + scoreobjective.getDisplayName(), p_96449_2_, p_96449_4_ - 1.5, p_96449_6_, 64);
            } else {
                this.func_147906_a((Entity)p_96449_1_, score.getScorePoints() + " " + scoreobjective.getDisplayName(), p_96449_2_, p_96449_4_, p_96449_6_, 64);
            }
            p_96449_4_ += (double)((float)this.getFontRendererFromRenderManager().FONT_HEIGHT * 1.15f * p_96449_9_);
        }
        super.func_96449_a(p_96449_1_, p_96449_2_, p_96449_4_, p_96449_6_, p_96449_8_, p_96449_9_, p_96449_10_);
    }

    public void renderFirstPersonArm(EntityPlayer par1EntityPlayer) {
        EntityClientPlayerMP acp = JBRAClient.mc.thePlayer;
        Object data = null;
        if (JBRAH.JHDS()) {
            Object temp = JBRAH.skinData((EntityPlayer)acp);
            data = temp != null ? temp : null;
        }
        float f = 1.0f;
        GL11.glColor3f((float)(f + RenderPlayerJBRA.getR()), (float)(f + RenderPlayerJBRA.getG()), (float)(f + RenderPlayerJBRA.getB()));
        GL11.glPushMatrix();
        int tick = acp.ticksExisted;
        float swing = acp.getSwingProgress((float)tick);
        float swing2 = MathHelper.sin((float)(swing * (float)Math.PI));
        float swing3 = MathHelper.sin((float)(MathHelper.sqrt_float((float)swing) * (float)Math.PI));
        this.modelMain.onGround = 0.0f;
        this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
        dns = JRMCoreH.dns;
        if (dns.length() > 3) {
            Item item;
            ItemStack itemstack;
            boolean v;
            String[] s;
            int pwr;
            int id;
            boolean instantTransmission;
            int bodyc3;
            int bodyc2;
            int bodyc1;
            int bodycm;
            int bodytype;
            int State = JRMCoreH.State;
            int race = JRMCoreH.dnsRace((String)dns);
            boolean saiOozar = JRMCoreH.rSai((int)race) ? State == 7 || State == 8 : false;
            int gen = JRMCoreH.dnsGender((String)dns);
            int haircol = JRMCoreH.dnsHairC((String)dns);
            int hairback = JRMCoreH.dnsHairB((String)dns);
            int breast = JRMCoreH.dnsBreast((String)dns);
            int skintype = JRMCoreH.dnsSkinT((String)dns);
            boolean lg = JRMCoreH.lgndb((EntityPlayer)par1EntityPlayer, (int)race, (int)State);
            boolean iau = JRMCoreH.rc_arc((int)race) && State == 6;
            String dnsau = JRMCoreH.data((int)16, (String)"");
            dnsau = dnsau.contains(";") ? dnsau.substring(1) : (par1EntityPlayer.getCommandSenderName().equals(JBRAClient.mc.thePlayer.getCommandSenderName()) ? dnsau : "");
            int n = bodytype = skintype == 0 ? JRMCoreH.dnsBodyC1_0((String)dns) : JRMCoreH.dnsBodyT((String)dns);
            int n2 = skintype == 0 ? 0 : (bodycm = iau ? JRMCoreH.dnsauCM((String)dnsau) : JRMCoreH.dnsBodyCM((String)dns));
            int n3 = skintype == 0 ? 0 : (bodyc1 = iau ? JRMCoreH.dnsauC1((String)dnsau) : JRMCoreH.dnsBodyC1((String)dns));
            int n4 = skintype == 0 ? 0 : (bodyc2 = iau ? JRMCoreH.dnsauC2((String)dnsau) : JRMCoreH.dnsBodyC2((String)dns));
            int n5 = skintype == 0 ? 0 : (bodyc3 = iau ? JRMCoreH.dnsauC3((String)dnsau) : JRMCoreH.dnsBodyC3((String)dns));
            int plyrSpc = skintype == 0 ? 0 : (JRMCoreH.RaceCustomSkin[race] == 0 ? 0 : (bodytype >= JRMCoreH.Specials[race] ? JRMCoreH.Specials[race] - 1 : bodytype));
            int[] an = new int[]{1, 0, 2, 0, 0, 3, 0, 1, 1};
            boolean bl = instantTransmission = ExtendedPlayer.get((EntityPlayer)acp).getBlocking() == 2;
            int n6 = ExtendedPlayer.get((EntityPlayer)acp).getBlocking() != 0 ? (instantTransmission ? 6 : 0) : (id = ExtendedPlayer.get((EntityPlayer)acp).getAnimKiShoot() != 0 ? an[ExtendedPlayer.get((EntityPlayer)acp).getAnimKiShoot() - 1] + 2 : -1);
            if (!JGConfigClientSettings.CLIENT_DA4) {
                id = -1;
            }
            if (JRMCoreH.DBC()) {
                kk2 = JRMCoreH.StusEfctsMe((int)5);
                kk = JRMCoreH.State2 + 1;
                if (kk2) {
                    r = (float)kk / 15.0f;
                    g = -((float)kk / 15.0f);
                    b = -((float)kk / 15.0f);
                    if (r > 1.0f) {
                        r = 1.0f;
                    }
                    if (g < 0.0f) {
                        r = 0.0f;
                    }
                    if (b < 0.0f) {
                        r = 0.0f;
                    }
                } else {
                    r = 0.0f;
                    g = 0.0f;
                    b = 0.0f;
                }
            }
            if (JRMCoreH.NC()) {
                int idd = ExtendedPlayer.get((EntityPlayer)acp).getHandEffect();
                int idd2 = ExtendedPlayer.get((EntityPlayer)acp).getEffect_used();
                if (idd2 == -1) {
                    idd2 = 0;
                }
                if (idd == 1) {
                    GL11.glPushMatrix();
                    if (id > -1) {
                        this.func_aam(id, true, true);
                    }
                    GL11.glTranslatef((float)-0.7f, (float)0.2f, (float)0.0f);
                    this.chakra((Entity)acp, idd2);
                    RenderPlayerJBRA.hndff((Entity)acp, false, idd, idd2);
                    GL11.glPopMatrix();
                }
                if (idd == 2) {
                    GL11.glPushMatrix();
                    if (id > -1) {
                        this.func_aam(id, true, true);
                    }
                    GL11.glTranslatef((float)-0.7f, (float)0.2f, (float)0.0f);
                    this.lightning((Entity)acp, idd2);
                    RenderPlayerJBRA.hndff((Entity)acp, false, idd, idd2);
                    GL11.glPopMatrix();
                }
            }
            if (JRMCoreH.DBC() && (pwr = Integer.parseInt((s = JRMCoreH.data((String)acp.getCommandSenderName(), (int)1, (String)"0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0").split(";"))[2])) == 1) {
                String[] PlyrSkills = JRMCoreH.PlyrSkills((EntityPlayer)acp);
                int sklkf = JRMCoreH.SklLvl((int)12, (String[])PlyrSkills);
                int skf = JRMCoreH.SklLvl((int)15, (String[])PlyrSkills);
                String ss = s[17];
                boolean v2 = JRMCoreH.DBC() && !ss.equals("-1");
                GL11.glPushMatrix();
                if (v2 && (sklkf > 0 || skf > 0)) {
                    if (id > -1) {
                        this.func_aam(id, true, true);
                    }
                    GL11.glRotatef((float)6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslatef((float)-0.29f, (float)0.15f, (float)0.0f);
                    RenderPlayerJBRA.kss((Entity)acp, false, Integer.parseInt(ss), sklkf, skf);
                }
                GL11.glPopMatrix();
            }
            float h1 = 1.0f;
            if (race == 5 && JRMCoreH.DBC()) {
                String[] stringArray;
                boolean majinPure;
                boolean majinEvil = State == 1;
                boolean bl2 = majinPure = State == 3 && JGConfigRaces.CONFIG_MAJIN_PURE_PINK_SKIN;
                if (majinEvil) {
                    bodycm = 12561588;
                    haircol = 12561588;
                } else if (majinPure) {
                    bodycm = 16757199;
                    haircol = 16757199;
                }
                ResourceLocation bdyskn = new ResourceLocation("jinryuudragonbc:cc/majin/" + (gen == 1 ? "f" : "") + "majin.png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodycm);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id == -1) {
                    this.modelMain.RA.render(0.0625f);
                } else {
                    this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                String[] playerData13 = JRMCoreH.data((String)par1EntityPlayer.getCommandSenderName(), (int)13, (String)"0;0;0;0,0,0+0").split(";");
                String[] absorptionData = playerData13.length > 3 ? playerData13[3].split(",") : "0;0;0;0,0,0+0".split(",");
                if (absorptionData[1].contains("+")) {
                    stringArray = absorptionData[1].split("+");
                } else {
                    String[] stringArray2 = new String[1];
                    stringArray = stringArray2;
                    stringArray2[0] = absorptionData[1];
                }
                String[] absorptionVisuals = stringArray;
                int absorbedRace = Integer.parseInt(absorptionVisuals[0]);
                if (JRMCoreH.isRaceArcosian((int)absorbedRace) || JRMCoreH.isRaceNamekian((int)absorbedRace)) {
                    bdyskn = new ResourceLocation("jinryuudragonbc:cc/majin/" + (gen == 1 ? "f" : "") + "majin_" + (JRMCoreH.isRaceArcosian((int)absorbedRace) ? "arco" : "namek") + ".png");
                    this.bindTexture(bdyskn);
                    RenderPlayerJBRA.glColor3f(bodycm);
                    this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                    if (id == -1) {
                        this.modelMain.RA.render(0.0625f);
                    } else {
                        this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                }
                if (!saiOozar) {
                    if (skintype == 0) {
                        ResourceLocation resourceLocation = acp.getLocationSkin().equals((Object)steveTextures) ? (gen >= 1 ? fem : steveTextures) : (bdyskn = acp.getLocationSkin());
                        if (JBRAH.JHDS() && JBRAH.getSkinHas(data)) {
                            JRMCoreClient.mc.getTextureManager().bindTexture(JBRAH.getSkinLoc(data));
                        } else {
                            JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                        }
                        GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                        this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                        if (id == -1) {
                            this.modelMain.RA.render(0.0625f);
                        } else {
                            this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                        }
                    } else if (JBRAH.JHDS() && JBRAH.getSkinHas(data) && skintype == 0) {
                        GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                        JRMCoreClient.mc.getTextureManager().bindTexture(JBRAH.getSkinLoc(data));
                        this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                        if (id == -1) {
                            this.modelMain.RA.render(0.0625f);
                        } else {
                            this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                        }
                    }
                }
            } else if (race == 3 && JRMCoreH.DBC()) {
                v = JRMCoreH.StusEfctsMe((int)17);
                boolean ssg = JRMCoreHDBC.godKiUserBase((int)race, (int)State);
                if (ssg && v) {
                    bodycm = 16744999;
                    bodyc1 = 15524763;
                    bodyc2 = 12854822;
                    bodyc3 = 0;
                }
                ResourceLocation bdyskn = new ResourceLocation("jinryuudragonbc:cc/nam/0nam" + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodycm);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id == -1) {
                    this.modelMain.RA.render(0.0625f);
                } else {
                    this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/nam/1nam" + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodyc1);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id == -1) {
                    this.modelMain.RA.render(0.0625f);
                } else {
                    this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/nam/2nam" + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodyc2);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id == -1) {
                    this.modelMain.RA.render(0.0625f);
                } else {
                    this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/nam/3nam" + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id == -1) {
                    this.modelMain.RA.render(0.0625f);
                } else {
                    this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                }
            } else if (race == 4 && JRMCoreH.DBC()) {
                v = JRMCoreH.StusEfctsMe((int)17);
                boolean ssg = JRMCoreHDBC.godKiUserBase((int)race, (int)State);
                if (ssg && v) {
                    State = 6;
                    bodycm = 0x545454;
                    bodyc1 = 0xC3C3C3;
                    bodyc3 = 0x171717;
                }
                ResourceLocation bdyskn = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/0A" + JRMCoreH.TransFrSkn[State] + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodycm);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id == -1) {
                    this.modelMain.RA.render(0.0625f);
                } else {
                    this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/1A" + JRMCoreH.TransFrSkn[State] + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodyc1);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id == -1) {
                    this.modelMain.RA.render(0.0625f);
                } else {
                    this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/2A" + JRMCoreH.TransFrSkn[State] + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodyc2);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id == -1) {
                    this.modelMain.RA.render(0.0625f);
                } else {
                    this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/3A" + JRMCoreH.TransFrSkn[State] + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodyc3);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id == -1) {
                    this.modelMain.RA.render(0.0625f);
                } else {
                    this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/4A" + JRMCoreH.TransFrSkn[State] + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id == -1) {
                    this.modelMain.RA.render(0.0625f);
                } else {
                    this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                }
            } else {
                if (saiOozar) {
                    int tailCol;
                    ResourceLocation bdyskn = new ResourceLocation("jinryuudragonbc:cc/oozaru1.png");
                    JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                    RenderPlayerJBRA.glColor3f(skintype != 0 ? bodycm : 11374471);
                    this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                    if (id == -1) {
                        this.modelMain.RA.render(0.0625f);
                    } else {
                        this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                    int n7 = tailCol = race == 2 || bodytype != 0 ? bodytype : 6498048;
                    int j = State == 0 || State == 7 ? (skintype == 1 ? bodyc1 : tailCol) : (lg ? 0x99FF66 : 16574610);
                    bdyskn = new ResourceLocation("jinryuudragonbc:cc/oozaru2.png");
                    JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                    RenderPlayerJBRA.glColor3f(j);
                    this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                    if (id == -1) {
                        this.modelMain.RA.render(0.0625f);
                    } else {
                        this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                } else if (skintype != 0) {
                    ResourceLocation bdyskn = new ResourceLocation("jinryuumodscore:cc/" + (gen == 1 ? "f" : "") + "hum.png");
                    JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                    RenderPlayerJBRA.glColor3f(bodycm);
                    this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                    if (id == -1) {
                        this.modelMain.RA.render(0.0625f);
                    } else {
                        this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                }
                if (!saiOozar) {
                    if (skintype == 0) {
                        ResourceLocation bdyskn;
                        ResourceLocation resourceLocation = acp.getLocationSkin().equals((Object)steveTextures) ? (gen >= 1 ? fem : steveTextures) : (bdyskn = acp.getLocationSkin());
                        if (JBRAH.JHDS() && JBRAH.getSkinHas(data)) {
                            JRMCoreClient.mc.getTextureManager().bindTexture(JBRAH.getSkinLoc(data));
                        } else {
                            JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                        }
                        GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                        this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                        if (id == -1) {
                            this.modelMain.RA.render(0.0625f);
                        } else {
                            this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                        }
                    } else if (JBRAH.JHDS() && JBRAH.getSkinHas(data) && skintype == 0) {
                        GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                        JRMCoreClient.mc.getTextureManager().bindTexture(JBRAH.getSkinLoc(data));
                        this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                        if (id == -1) {
                            this.modelMain.RA.render(0.0625f);
                        } else {
                            this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                        }
                    }
                    if (State == 14) {
                        int jx;
                        int tailCol = race == 2 || bodytype != 0 ? bodytype : 6498048;
                        tailCol = JRMCoreH.isAprilFoolsModeOn() ? 13292516 : tailCol;
                        int n8 = jx = skintype == 1 ? bodyc1 : tailCol;
                        if (JRMCoreH.rSai((int)race) && jx == 6498048 && State == 14) {
                            jx = JRMCoreH.isAprilFoolsModeOn() ? 13292516 : 14292268;
                        }
                        JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation("jinryuudragonbc:cc/ss4" + (skintype == 0 ? "a" : "b") + ".png"));
                        RenderPlayerJBRA.glColor3f(jx);
                        this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                        if (id == -1) {
                            this.modelMain.RA.render(0.0625f);
                        } else {
                            this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                        }
                    }
                }
            }
            if (JGConfigClientSettings.CLIENT_DA19 && (JRMCoreH.DBC() || JRMCoreH.NC())) {
                GL11.glPushMatrix();
                GL11.glEnable((int)3042);
                GL11.glDisable((int)2896);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glAlphaFunc((int)516, (float)0.003921569f);
                GL11.glDepthMask((boolean)false);
                int maxBody = JRMCoreH.stat((Entity)par1EntityPlayer, (int)2, (int)JRMCoreH.Pwrtyp, (int)2, (int)JRMCoreH.PlyrAttrbts[2], (int)race, (int)JRMCoreH.Class, (float)0.0f);
                int curBody = Integer.parseInt(JRMCoreH.data((String)par1EntityPlayer.getCommandSenderName(), (int)8, (String)"200"));
                float one = (float)maxBody / 100.0f;
                int perc = (int)((float)curBody / one);
                if (perc < 70) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises1.png"));
                    if (id == -1) {
                        this.modelMain.RA.render(0.0625f);
                    } else {
                        this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                }
                if (perc < 55) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises2.png"));
                    if (id == -1) {
                        this.modelMain.RA.render(0.0625f);
                    } else {
                        this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                }
                if (perc < 35) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises3.png"));
                    if (id == -1) {
                        this.modelMain.RA.render(0.0625f);
                    } else {
                        this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                }
                if (perc < 20) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises4.png"));
                    if (id == -1) {
                        this.modelMain.RA.render(0.0625f);
                    } else {
                        this.func_aam(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                }
                GL11.glDepthMask((boolean)true);
                GL11.glEnable((int)2896);
                GL11.glDisable((int)3042);
                GL11.glPopMatrix();
            }
            if (JRMCoreH.JYC() && par1EntityPlayer.inventory.hasItem(JRMCoreHJYC.JYCgetItemWatch())) {
                GL11.glPushMatrix();
                if (id > -1) {
                    this.func_aam(id, true, true);
                }
                GL11.glRotatef((float)6.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glTranslatef((float)-0.29f, (float)0.15f, (float)0.0f);
                RenderPlayerJBRA.ow(true);
                GL11.glPopMatrix();
            }
            if ((itemstack = par1EntityPlayer.inventory.armorItemInSlot(2)) != null && (item = itemstack.getItem()) instanceof ItemArmor) {
                ItemArmor itemarmor = (ItemArmor)item;
                GL11.glPushMatrix();
                String dbcarmor = itemarmor.getArmorTexture(itemstack, (Entity)par1EntityPlayer, 2, null);
                ResourceLocation mcarmor = RenderBiped.getArmorResource((Entity)par1EntityPlayer, (ItemStack)itemstack, (int)1, null);
                if (dbcarmor != null) {
                    dbcarmor = dbcarmor.replace("jbra", "").replace("_dam", "");
                }
                ResourceLocation armor = dbcarmor != null ? new ResourceLocation(dbcarmor) : mcarmor;
                JRMCoreClient.mc.getTextureManager().bindTexture(armor);
                GL11.glPushMatrix();
                if (id > -1) {
                    this.func_aam(id, true, true);
                }
                GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                GL11.glScalef((float)1.0001f, (float)1.0001f, (float)1.0001f);
                if (dbcarmor != null) {
                    this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                    this.modelMain.textureHeight = 64;
                    this.modelMain.textureWidth = 128;
                    this.modelMain.RA.render(0.0625f);
                } else {
                    this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                    this.modelMain.RA.render(0.0625f);
                }
                GL11.glPopMatrix();
                GL11.glPopMatrix();
            }
            if (race == 3 && JRMCoreH.DBC()) {
                ResourceLocation bdyskn = new ResourceLocation("jinryuudragonbc:cc/nam/0nam" + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodycm);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id != -1) {
                    this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/nam/1nam" + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodyc1);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id != -1) {
                    this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/nam/2nam" + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodyc2);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id != -1) {
                    this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/nam/3nam" + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id != -1) {
                    this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                }
            } else if (race == 4 && JRMCoreH.DBC()) {
                ResourceLocation bdyskn = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/0A" + JRMCoreH.TransFrSkn[State] + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodycm);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id != -1) {
                    this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/1A" + JRMCoreH.TransFrSkn[State] + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodyc1);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id != -1) {
                    this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/2A" + JRMCoreH.TransFrSkn[State] + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodyc2);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id != -1) {
                    this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/3A" + JRMCoreH.TransFrSkn[State] + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                RenderPlayerJBRA.glColor3f(bodyc3);
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id != -1) {
                    this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                }
                bdyskn = new ResourceLocation("jinryuudragonbc:cc/arc/" + (gen == 1 ? "f" : "m") + "/4A" + JRMCoreH.TransFrSkn[State] + plyrSpc + ".png");
                JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                if (id != -1) {
                    this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                }
            } else {
                if (saiOozar) {
                    int tailCol;
                    ResourceLocation bdyskn = new ResourceLocation("jinryuudragonbc:cc/oozaru1.png");
                    JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                    RenderPlayerJBRA.glColor3f(skintype != 0 ? bodycm : 11374471);
                    this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                    if (id != -1) {
                        this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                    int n9 = tailCol = race == 2 || bodytype != 0 ? bodytype : 6498048;
                    int j = State == 0 || State == 7 ? (skintype == 1 ? bodyc1 : tailCol) : (lg ? 0x99FF66 : 16574610);
                    bdyskn = new ResourceLocation("jinryuudragonbc:cc/oozaru2.png");
                    JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                    RenderPlayerJBRA.glColor3f(j);
                    this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                    if (id != -1) {
                        this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                } else if (skintype != 0) {
                    ResourceLocation bdyskn = new ResourceLocation("jinryuumodscore:cc/" + (gen == 1 ? "f" : "") + "hum.png");
                    JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                    RenderPlayerJBRA.glColor3f(bodycm);
                    this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                    if (id != -1) {
                        this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                }
                if (!saiOozar) {
                    if (skintype == 0) {
                        ResourceLocation bdyskn;
                        ResourceLocation resourceLocation = acp.getLocationSkin().equals((Object)steveTextures) ? (gen >= 1 ? fem : steveTextures) : (bdyskn = acp.getLocationSkin());
                        if (JBRAH.JHDS() && JBRAH.getSkinHas(data)) {
                            JRMCoreClient.mc.getTextureManager().bindTexture(JBRAH.getSkinLoc(data));
                        } else {
                            JRMCoreClient.mc.getTextureManager().bindTexture(bdyskn);
                        }
                        GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                        this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                        if (id != -1) {
                            this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                        }
                    } else if (JBRAH.JHDS() && JBRAH.getSkinHas(data) && skintype == 0) {
                        GL11.glColor3f((float)(h1 + RenderPlayerJBRA.getR()), (float)(h1 + RenderPlayerJBRA.getG()), (float)(h1 + RenderPlayerJBRA.getB()));
                        JRMCoreClient.mc.getTextureManager().bindTexture(JBRAH.getSkinLoc(data));
                        this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                        if (id != -1) {
                            this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                        }
                    }
                    if (State == 14) {
                        int jx;
                        int tailCol = race == 2 || bodytype != 0 ? bodytype : 6498048;
                        tailCol = JRMCoreH.isAprilFoolsModeOn() ? 13292516 : tailCol;
                        int n10 = jx = skintype == 1 ? bodyc1 : tailCol;
                        if (JRMCoreH.rSai((int)race) && jx == 6498048 && State == 14) {
                            jx = JRMCoreH.isAprilFoolsModeOn() ? 13292516 : 14292268;
                        }
                        JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation("jinryuudragonbc:cc/ss4" + (skintype == 0 ? "a" : "b") + ".png"));
                        RenderPlayerJBRA.glColor3f(jx);
                        this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                        if (id != -1) {
                            this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                        }
                    }
                }
            }
            if (JGConfigClientSettings.CLIENT_DA19) {
                GL11.glPushMatrix();
                GL11.glEnable((int)3042);
                GL11.glDisable((int)2896);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glAlphaFunc((int)516, (float)0.003921569f);
                GL11.glDepthMask((boolean)false);
                int maxBody = JRMCoreH.stat((Entity)par1EntityPlayer, (int)2, (int)JRMCoreH.Pwrtyp, (int)2, (int)JRMCoreH.PlyrAttrbts[2], (int)race, (int)JRMCoreH.Class, (float)0.0f);
                int curBody = Integer.parseInt(JRMCoreH.data((String)par1EntityPlayer.getCommandSenderName(), (int)8, (String)"200"));
                float one = (float)maxBody / 100.0f;
                int perc = (int)((float)curBody / one);
                if (perc < 70) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises1.png"));
                    if (id != -1) {
                        this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                }
                if (perc < 55) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises2.png"));
                    if (id != -1) {
                        this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                }
                if (perc < 35) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises3.png"));
                    if (id != -1) {
                        this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                }
                if (perc < 20) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    JRMCoreClient.mc.getTextureManager().bindTexture(new ResourceLocation("jinryuumodscore:cc/bruises4.png"));
                    if (id != -1) {
                        this.func_aam2(this.modelMain.RA, this.modelMain.LA, id, true);
                    }
                }
                GL11.glDepthMask((boolean)true);
                GL11.glEnable((int)2896);
                GL11.glDisable((int)3042);
                GL11.glPopMatrix();
            }
            if (itemstack != null && (item = itemstack.getItem()) instanceof ItemArmor) {
                ItemArmor itemarmor = (ItemArmor)item;
                GL11.glPushMatrix();
                String dbcarmor = itemarmor.getArmorTexture(itemstack, (Entity)par1EntityPlayer, 2, null);
                ResourceLocation mcarmor = RenderBiped.getArmorResource((Entity)par1EntityPlayer, (ItemStack)itemstack, (int)1, null);
                if (dbcarmor != null) {
                    dbcarmor = dbcarmor.replace("jbra", "").replace("_dam", "");
                }
                ResourceLocation armor = dbcarmor != null ? new ResourceLocation(dbcarmor) : mcarmor;
                JRMCoreClient.mc.getTextureManager().bindTexture(armor);
                if (id == 0 || id == 3 || id == 5) {
                    if (id == 0) {
                        if (JGConfigClientSettings.CLIENT_DA18) {
                            GL11.glPushMatrix();
                            this.func_aam(id, false, true);
                            GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                            GL11.glScalef((float)1.0001f, (float)1.0001f, (float)1.0001f);
                            if (dbcarmor != null) {
                                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                                this.modelMain.textureHeight = 64;
                                this.modelMain.textureWidth = 128;
                                this.modelMain.LA.render(0.0625f);
                            } else {
                                this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                                this.modelMain.LA.render(0.0625f);
                            }
                            GL11.glPopMatrix();
                        }
                    } else {
                        GL11.glPushMatrix();
                        this.func_aam(id, false, true);
                        GL11.glColor3f((float)(1.0f + RenderPlayerJBRA.getR()), (float)(1.0f + RenderPlayerJBRA.getG()), (float)(1.0f + RenderPlayerJBRA.getB()));
                        GL11.glScalef((float)1.0001f, (float)1.0001f, (float)1.0001f);
                        if (dbcarmor != null) {
                            this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                            this.modelMain.textureHeight = 64;
                            this.modelMain.textureWidth = 128;
                            this.modelMain.LA.render(0.0625f);
                        } else {
                            this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
                            this.modelMain.LA.render(0.0625f);
                        }
                        GL11.glPopMatrix();
                    }
                }
                GL11.glPopMatrix();
            }
        } else {
            this.modelMain.setRotationAngles(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)par1EntityPlayer);
            this.modelMain.RA.render(0.0625f);
        }
        GL11.glPopMatrix();
    }

    protected void renderArrowsStuckInEntity(EntityLivingBase par1EntityLivingBase, float par2) {
        int i = par1EntityLivingBase.getArrowCountInEntity();
        if (i > 0) {
            EntityArrow entityarrow = new EntityArrow(par1EntityLivingBase.worldObj, par1EntityLivingBase.posX, par1EntityLivingBase.posY, par1EntityLivingBase.posZ);
            Random random = new Random(par1EntityLivingBase.getEntityId());
            RenderHelper.disableStandardItemLighting();
            for (int j = 0; j < i; ++j) {
                GL11.glPushMatrix();
                ModelRenderer modelrenderer = this.modelMain.getRandomModelBox(random);
                ModelBox modelbox = (ModelBox)modelrenderer.cubeList.get(random.nextInt(modelrenderer.cubeList.size()));
                modelrenderer.postRender(0.0625f);
                float f1 = random.nextFloat();
                float f2 = random.nextFloat();
                float f3 = random.nextFloat();
                float f4 = (modelbox.posX1 + (modelbox.posX2 - modelbox.posX1) * f1) / 16.0f;
                float f5 = (modelbox.posY1 + (modelbox.posY2 - modelbox.posY1) * f2) / 16.0f;
                float f6 = (modelbox.posZ1 + (modelbox.posZ2 - modelbox.posZ1) * f3) / 16.0f;
                GL11.glTranslatef((float)f4, (float)f5, (float)f6);
                f1 = f1 * 2.0f - 1.0f;
                f2 = f2 * 2.0f - 1.0f;
                f3 = f3 * 2.0f - 1.0f;
                float f7 = MathHelper.sqrt_float((float)((f1 *= -1.0f) * f1 + (f3 *= -1.0f) * f3));
                entityarrow.prevRotationYaw = entityarrow.rotationYaw = (float)(Math.atan2(f1, f3) * 180.0 / Math.PI);
                entityarrow.prevRotationPitch = entityarrow.rotationPitch = (float)(Math.atan2(f2 *= -1.0f, f7) * 180.0 / Math.PI);
                double d0 = 0.0;
                double d1 = 0.0;
                double d2 = 0.0;
                float f8 = 0.0f;
                GL11.glPopMatrix();
            }
            RenderHelper.enableStandardItemLighting();
        }
    }

    protected void passSpecialRender(EntityLivingBase p_77033_1_, double p_77033_2_, double p_77033_4_, double p_77033_6_) {
        if (MinecraftForge.EVENT_BUS.post((Event)new RenderLivingEvent.Specials.Pre(p_77033_1_, (RendererLivingEntity)this, p_77033_2_, p_77033_4_, p_77033_6_))) {
            return;
        }
        GL11.glAlphaFunc((int)516, (float)0.1f);
        if (this.func_110813_b(p_77033_1_)) {
            float f2;
            float f = 1.6f;
            float f1 = 0.016666668f * f;
            double d3 = p_77033_1_.getDistanceSqToEntity((Entity)this.renderManager.livingPlayer);
            float f3 = f2 = p_77033_1_.isSneaking() ? NAME_TAG_RANGE_SNEAK : NAME_TAG_RANGE;
            if (d3 < (double)(f2 * f2)) {
                String s = p_77033_1_.func_145748_c_().getFormattedText();
                if (JRMCoreH.JFC() && JRMCoreH.plyrs != null && FamilyCH.famNams != null && FamilyCH.famNams.length >= JRMCoreH.plyrs.length) {
                    for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                        String[] s2;
                        if (!JRMCoreH.plyrs[pl].equals(p_77033_1_.getCommandSenderName()) || FamilyCH.famNams[pl].length() <= 2) continue;
                        String s1 = FamilyCH.famNams[pl];
                        String[] stringArray = s2 = s1.contains(",") ? s1.toString().split(",") : null;
                        if (s2 == null) continue;
                        int i = Integer.parseInt(s2[1]);
                        s = (i == 0 ? s2[0] + " " : "") + s + (i == 1 ? " " + s2[0] : "");
                    }
                }
                if (JRMCoreH.DBC()) {
                    String[] d18 = JRMCoreH.data((String)p_77033_1_.getCommandSenderName(), (int)18, (String)"0;0;0;0;0;0;0;0;0").split(";");
                    String[] fuse = d18[2].split(",");
                    if (fuse.length == 3 && (fuse[0].equalsIgnoreCase(p_77033_1_.getCommandSenderName()) || fuse[1].equalsIgnoreCase(p_77033_1_.getCommandSenderName()))) {
                        s = JRMCoreHDBC.f_namgen((String)fuse[0], (String)fuse[1]);
                    }
                    if (p_77033_1_ instanceof EntityPlayer && JRMCoreH.StusEfctsClient((int)11, (EntityPlayer)((EntityPlayer)p_77033_1_))) {
                        s = "";
                    }
                }
                if (s.length() > 0) {
                    if (p_77033_1_.isSneaking()) {
                        FontRenderer fontrenderer = this.getFontRendererFromRenderManager();
                        GL11.glPushMatrix();
                        GL11.glTranslatef((float)((float)p_77033_2_ + 0.0f), (float)((float)p_77033_4_ + p_77033_1_.height + 0.5f), (float)((float)p_77033_6_));
                        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                        GL11.glRotatef((float)(-this.renderManager.playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
                        GL11.glRotatef((float)this.renderManager.playerViewX, (float)1.0f, (float)0.0f, (float)0.0f);
                        GL11.glScalef((float)(-f1), (float)(-f1), (float)f1);
                        GL11.glDisable((int)2896);
                        GL11.glTranslatef((float)0.0f, (float)(0.25f / f1), (float)0.0f);
                        GL11.glDepthMask((boolean)false);
                        GL11.glEnable((int)3042);
                        OpenGlHelper.glBlendFunc((int)770, (int)771, (int)1, (int)0);
                        Tessellator tessellator = Tessellator.instance;
                        GL11.glDisable((int)3553);
                        tessellator.startDrawingQuads();
                        int i = fontrenderer.getStringWidth(s) / 2;
                        tessellator.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.25f);
                        tessellator.addVertex((double)(-i - 1), -1.0, 0.0);
                        tessellator.addVertex((double)(-i - 1), 8.0, 0.0);
                        tessellator.addVertex((double)(i + 1), 8.0, 0.0);
                        tessellator.addVertex((double)(i + 1), -1.0, 0.0);
                        tessellator.draw();
                        GL11.glEnable((int)3553);
                        GL11.glDepthMask((boolean)true);
                        fontrenderer.drawString(s, -fontrenderer.getStringWidth(s) / 2, 0, 0x20FFFFFF);
                        GL11.glEnable((int)2896);
                        GL11.glDisable((int)3042);
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                        GL11.glPopMatrix();
                    } else {
                        this.func_96449_a(p_77033_1_, p_77033_2_, p_77033_4_, p_77033_6_, s, f1, d3);
                    }
                }
            }
        }
        MinecraftForge.EVENT_BUS.post((Event)new RenderLivingEvent.Specials.Post(p_77033_1_, (RendererLivingEntity)this, p_77033_2_, p_77033_4_, p_77033_6_));
    }

    protected void renderLivingAt(AbstractClientPlayer p_77039_1_, double p_77039_2_, double p_77039_4_, double p_77039_6_) {
        if (p_77039_1_.isEntityAlive() && p_77039_1_.isPlayerSleeping()) {
            super.renderLivingAt(p_77039_1_, p_77039_2_ + (double)p_77039_1_.field_71079_bU, p_77039_4_ + (double)p_77039_1_.field_71082_cx, p_77039_6_ + (double)p_77039_1_.field_71089_bV);
        } else {
            super.renderLivingAt(p_77039_1_, p_77039_2_, p_77039_4_, p_77039_6_);
        }
    }

    protected void rotateCorpse(AbstractClientPlayer p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_) {
        if (p_77043_1_.isEntityAlive() && p_77043_1_.isPlayerSleeping()) {
            GL11.glRotatef((float)p_77043_1_.getBedOrientationInDegrees(), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)this.getDeathMaxRotation((EntityLivingBase)p_77043_1_), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)270.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        } else {
            super.rotateCorpse(p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
        }
    }

    protected void func_96449_a(EntityLivingBase p_96449_1_, double p_96449_2_, double p_96449_4_, double p_96449_6_, String p_96449_8_, float p_96449_9_, double p_96449_10_) {
        this.func_96449_a((AbstractClientPlayer)p_96449_1_, p_96449_2_, p_96449_4_, p_96449_6_, p_96449_8_, p_96449_9_, p_96449_10_);
    }

    protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_) {
        this.preRenderCallback((AbstractClientPlayer)p_77041_1_, p_77041_2_);
    }

    protected void func_82408_c(EntityLivingBase p_82408_1_, int p_82408_2_, float p_82408_3_) {
        this.func_82408_c((AbstractClientPlayer)p_82408_1_, p_82408_2_, p_82408_3_);
    }

    protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_) {
        return this.shouldRenderPass((AbstractClientPlayer)p_77032_1_, p_77032_2_, p_77032_3_);
    }

    protected void renderEquippedItems(EntityLivingBase p_77029_1_, float p_77029_2_) {
        this.renderEquippedItems((AbstractClientPlayer)p_77029_1_, p_77029_2_);
    }

    protected void rotateCorpse(EntityLivingBase p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_) {
        this.rotateCorpse((AbstractClientPlayer)p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
    }

    protected void renderLivingAt(EntityLivingBase p_77039_1_, double p_77039_2_, double p_77039_4_, double p_77039_6_) {
        this.renderLivingAt((AbstractClientPlayer)p_77039_1_, p_77039_2_, p_77039_4_, p_77039_6_);
    }

    public void doRender(EntityLivingBase p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
        this.doRender((AbstractClientPlayer)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return this.getEntityTexture((AbstractClientPlayer)p_110775_1_);
    }

    public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
        this.doRender((AbstractClientPlayer)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
    }

    public int getState(String pl) {
        return state.get(pl) == null ? 0 : state.get(pl);
    }

    public void setState(int state, String pl) {
        RenderPlayerJBRA.state.put(pl, state);
    }

    public int getStateChange(String pl) {
        return stateChange.get(pl) == null ? 0 : stateChange.get(pl);
    }

    public void setStateChange(int stateChange, String pl) {
        RenderPlayerJBRA.stateChange.put(pl, stateChange);
    }

    public int getState2Change(String pl) {
        return state2Change.get(pl) == null ? 0 : state2Change.get(pl);
    }

    public void setState2Change(int state2Change, String pl) {
        RenderPlayerJBRA.state2Change.put(pl, state2Change);
    }

    public int getAuratype(String pl) {
        return auratype.get(pl) == null ? 0 : auratype.get(pl);
    }

    public void setAuratype(int auratype, String pl) {
        RenderPlayerJBRA.auratype.put(pl, auratype);
    }

    public int getAuratime(String pl) {
        return auratime.get(pl) == null ? 0 : auratime.get(pl);
    }

    public void setAuratime(int auratime, String pl) {
        RenderPlayerJBRA.auratime.put(pl, auratime);
    }

    public int getBendtime(String pl) {
        return bendtime.get(pl) == null ? 0 : bendtime.get(pl);
    }

    public void setBendtime(int bendtime, String pl) {
        RenderPlayerJBRA.bendtime.put(pl, bendtime);
    }

    private static float getR() {
        return r + r2;
    }

    private static float getG() {
        return g + g2;
    }

    private static float getB() {
        return b + b2;
    }
}

