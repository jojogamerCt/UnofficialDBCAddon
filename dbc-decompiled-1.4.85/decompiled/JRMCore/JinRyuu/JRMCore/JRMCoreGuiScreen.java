/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.NarutoC.common.NCKeyHandler
 *  com.google.common.collect.Multimap
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityClientPlayerMP
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiConfirmOpenLink
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.client.gui.GuiYesNoCallback
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.crash.CrashReport
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureAttribute
 *  net.minecraft.entity.ai.attributes.AttributeModifier
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.item.crafting.IRecipe
 *  net.minecraft.item.crafting.ShapedRecipes
 *  net.minecraft.item.crafting.ShapelessRecipes
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraft.util.ReportedException
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.StatCollector
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreEH;
import JinRyuu.JRMCore.JRMCoreGuiButtonC;
import JinRyuu.JRMCore.JRMCoreGuiButtonC1;
import JinRyuu.JRMCore.JRMCoreGuiButtons00;
import JinRyuu.JRMCore.JRMCoreGuiButtons00MS;
import JinRyuu.JRMCore.JRMCoreGuiButtons01;
import JinRyuu.JRMCore.JRMCoreGuiButtons01MS;
import JinRyuu.JRMCore.JRMCoreGuiButtons02;
import JinRyuu.JRMCore.JRMCoreGuiButtons03;
import JinRyuu.JRMCore.JRMCoreGuiButtonsA1;
import JinRyuu.JRMCore.JRMCoreGuiButtonsA2;
import JinRyuu.JRMCore.JRMCoreGuiButtonsA3;
import JinRyuu.JRMCore.JRMCoreGuiButtonsMG0;
import JinRyuu.JRMCore.JRMCoreGuiButtonsTab;
import JinRyuu.JRMCore.JRMCoreGuiSlider00;
import JinRyuu.JRMCore.JRMCoreGuiSlider01;
import JinRyuu.JRMCore.JRMCoreGuiSlider02;
import JinRyuu.JRMCore.JRMCoreGuiSliderX00;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreH2;
import JinRyuu.JRMCore.JRMCoreHC;
import JinRyuu.JRMCore.JRMCoreHDBC;
import JinRyuu.JRMCore.JRMCoreHJFC;
import JinRyuu.JRMCore.JRMCoreHJYC;
import JinRyuu.JRMCore.JRMCoreHNC;
import JinRyuu.JRMCore.JRMCoreHSAC;
import JinRyuu.JRMCore.JRMCoreKeyHandler;
import JinRyuu.JRMCore.JRMCoreM;
import JinRyuu.JRMCore.JRMCoreMsn;
import JinRyuu.JRMCore.Version;
import JinRyuu.JRMCore.client.JGRecipeHandler;
import JinRyuu.JRMCore.client.JGRenderHelper;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigsClient;
import JinRyuu.JRMCore.client.minigame.MiniGame;
import JinRyuu.JRMCore.client.minigame.MiniGameAirBoxing;
import JinRyuu.JRMCore.client.minigame.MiniGameConcentration;
import JinRyuu.JRMCore.client.notification.JGNotificationGUI;
import JinRyuu.JRMCore.entity.EntityAuraFlat;
import JinRyuu.JRMCore.entity.EntityNull;
import JinRyuu.JRMCore.items.ItemBarberSnC;
import JinRyuu.JRMCore.mod_JRMCore;
import JinRyuu.JRMCore.p.DBC.DBCPacketHandlerClient;
import JinRyuu.JRMCore.p.DBC.DBCPdri;
import JinRyuu.JRMCore.p.JRMCorePData2;
import JinRyuu.JRMCore.p.PD;
import JinRyuu.JRMCore.server.config.core.JGConfigMiniGameAirBoxing;
import JinRyuu.JRMCore.server.config.core.JGConfigMiniGameConcentration;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCFormMastery;
import JinRyuu.JRMCore.server.config.dbc.JGConfigRaces;
import JinRyuu.NarutoC.common.NCKeyHandler;
import com.google.common.collect.Multimap;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.URI;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiConfirmOpenLink;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.crash.CrashReport;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class JRMCoreGuiScreen
extends GuiScreen
implements ClipboardOwner,
GuiYesNoCallback {
    public static final int ID_APPERANCE = 0;
    public static final int ID_APPERANCE_ARCO = 19;
    public static final int ID_COLOR_PICKER = 1;
    public static final int ID_POWER_CLASS_SELECT = 2;
    public static final int ID_FINALIZING = 3;
    public static final int ID_BARBER = 8;
    public static final int ID_ATTRIBUTES = 10;
    public static final int ID_SKILLS = 11;
    public static final int ID_TECHNIQUES = 12;
    public static final int ID_ATTACK_CREATOR = 13;
    public static final int ID_DIFFICULTY = 14;
    public static final int ID_LEARN_ATTACKS_AND_JUTSUS = 15;
    public static final int ID_LEARN_SKILLS = 16;
    public static final int ID_TRAINING = 17;
    public static final int ID_MINIGAME_CONCENTRATION = 18;
    public static final int ID_NEWS = 30;
    public static final int ID_NO_CONNECTION = 31;
    public static final int ID_SERVER_INFO = 40;
    public static final int ID_UPDATE_INFO = 50;
    public static final int ID_MISSION_SYSTEM_MIN = 60;
    public static final int ID_MISSION_SYSTEM_MAX = 70;
    public static final int ID_MAIN_MISSION = 60;
    public static final int ID_SIDE_MISSION = 61;
    public static final int ID_GROUP_SYSTEM = 70;
    public static final int ID_SERVER_DONATION = 80;
    public static final int ID_CLIENT_SETTINGS = 10000;
    public static final int ID_HELP = 10001;
    public static final int ID_MINIGAME_AIRBOXING = 10002;
    public static final int ID_INSTANT_TRANSMISSION_GROUP_PICK = 10100;
    public static final int ID_NOTIFICATIONS = 10011;
    private static final int cs_mode_GRAPHIC_SETTINGS = 0;
    private static final int cs_mode_USER_INTERFACE = 1;
    private static final Logger logger = LogManager.getLogger();
    public static final String News = "News";
    public static Minecraft mc = Minecraft.getMinecraft();
    public static JRMCoreGuiScreen instance;
    public MiniGameConcentration miniGameConcentration = new MiniGameConcentration();
    public MiniGameAirBoxing miniGameAirBoxing = new MiniGameAirBoxing();
    private EntityNull entityTest;
    private ArrayList<EntityAuraFlat> entityTests2;
    private Instant timer;
    public boolean guiUp = false;
    public int guiID = 0;
    public int guiIDprev = 0;
    public int guiIDprev2 = 0;
    public int guiIDprev3 = 0;
    public int guiLeft;
    public int guiTop;
    public int xSize = 256;
    public int ySize = 159;
    public float xSize_lo;
    public float ySize_lo;
    public List Modsnews;
    public int site = 0;
    public int sip = 0;
    private int diff = 0;
    private int attCrtPg = 0;
    private int attViwPg = 0;
    private int pgSkls = 0;
    private int smd;
    private int ipg;
    private int inv;
    private int lp;
    private int sscl;
    private int[] hbt;
    private int[] dfa = new int[5];
    private URI clickedURI;
    private int mcu = 0;
    public static String urlToOpen;
    private static float ptch;
    public static float scrollSide;
    public static int hairPreview;
    public static int[] hairPreviewStates;
    private static boolean headRoton;
    private static int headRotX;
    private static int headRotY;
    private static int headRotZ;
    private static final int gui_help_descs = 13;
    private static final int help_guides = 13;
    private static int help_page_id;
    private static int help_mode;
    private static final int[] cs_pages;
    private static int cs_page;
    private static int cs_mode;
    public static boolean CanRace;
    public static boolean CanGender;
    public static boolean CanYears;
    public static boolean CanHair;
    public static boolean CanColor;
    public static boolean canCustom;
    public static boolean CanSpecial;
    public static boolean CanPwr;
    public static boolean CanClass;
    private static boolean[] CanUpgrade;
    public static byte EnAttNum;
    public static String name;
    public static int acquired;
    public static String owner;
    public static int type;
    public static int speed;
    public static int dam;
    public static int effect;
    public static int cost;
    public static int casttime;
    public static int cooldown;
    public static int color;
    public static int density;
    public static int sincantation;
    public static int sfire;
    public static int smove;
    public static int[] techCrt;
    public static String button1;
    public static String button2;
    public static String wish;
    public static String guiBG2;
    public static String pc;
    public static String gui_help_tabs;
    public static String wishsep;
    public static String icons;
    String SideMsn = "";
    int ss = -1;
    boolean ssb = false;
    public static int colorType;
    public static int StateSlcted;
    public static int RaceSlcted;
    public static int GenderSlcted;
    public static int YearsSlcted;
    public static int HairSlcted;
    public static int Hair2Slcted;
    public static int ColorSlcted;
    public static int BreastSizeSlcted;
    public static int SkinTypeSlcted;
    public static int BodyTypeSlcted;
    public static int BodyColPresetSlcted;
    public static int BodyColMainSlcted;
    public static int BodyColSub1Slcted;
    public static int BodyColSub2Slcted;
    public static int BodyColSub3Slcted;
    public static int FaceNoseSlcted;
    public static int FaceMouthSlcted;
    public static int EyesSlcted;
    public static int EyeColPresetSlcted;
    public static int EyeCol1Slcted;
    public static int EyeCol2Slcted;
    public static int BodyauColMainSlcted;
    public static int BodyauColSub1Slcted;
    public static int BodyauColSub2Slcted;
    public static int BodyauColSub3Slcted;
    public static int HairPrstsSlcted;
    public static boolean canSavePreset;
    public static float BrghtSlcted;
    public static int PwrtypSlcted;
    public static int ClassSlcted;
    public static boolean tail;
    public static int KiColorSlcted;
    public static ArrayList<String> PresetList;
    private static int tick;
    private static String dnsau;
    private static String dns;
    private static String dnsSent;
    private static String dnsOrig;
    private static String dnsH;
    private static String dnsHbu;
    private static String dnsHSent;
    private static String dnsHOrig;
    protected static List detailList;
    public int x = 0;
    public int y = 0;
    private byte pwr = 0;
    public int scroll;
    public int scrollMouseJump = 1;
    public boolean mousePressed;
    private int IDtoProcessConfirmFor = -1;
    private boolean confirmationWindow = false;
    private int kdf;
    private static String ssc;
    private static int sscr;
    public static boolean ufc;
    final byte HELP_MODE_SELECT = 0;
    final byte HELP_GUIDE_PICK = 1;
    final byte HELP_CRAFTING = (byte)2;
    final byte HELP_GUIDE = (byte)3;
    private int gui_recipe_mod = -1;
    private int gui_recipe_category = 0;
    private int text = 0;
    protected GuiTextField inputField;
    protected GuiTextField[] inputField2 = new GuiTextField[3];
    private String defaultInputFieldText = "Attack";
    private boolean inputField2Ch = false;
    private int inputField2Cl = 0;
    protected static final ResourceLocation field_110408_a;
    ModelRenderer[] hairall;
    public static int count;
    public static int warn;
    public static int startcount;
    private String Process = "Something is Wrong";
    private int wid = 0;
    private int hei = 0;
    private String textureFile = "jinryuudragonbc:sagas.png";
    private int curPage = 0;
    private int[] hcl = new int[]{0, 4, 14, 24, 40, 56};
    public static int scrlld;

    public boolean isGUIOpen(int id) {
        return id == this.guiID;
    }

    public JRMCoreGuiScreen(int w) {
        String bpmd;
        JRMCoreGuiSliderX00.sliderValue = 0.0f;
        this.scroll = 0;
        scrollSide = 0.0f;
        this.guiIDprev = this.guiID = w;
        ssc = "";
        this.confirmationWindow = false;
        this.guiUp = false;
        if (JRMCoreConfig.ssc.contains("http://")) {
            JRMCoreH.turih.remove(JRMCoreConfig.ssc);
            JRMCoreH.tur(JRMCoreConfig.ssc);
        }
        JRMCoreH.BPMode = (bpmd = JRMCoreH.rld("BPMode", "jinryuujrmcore.dat")).equalsIgnoreCase("Normal") ? 0 : (bpmd.equalsIgnoreCase("High") ? 1 : 0);
    }

    private static String ntl(int i) {
        return JRMCoreH.numToLet(i);
    }

    private static String ntl5(int i) {
        return JRMCoreH.numToLet5(i);
    }

    public void initGui() {
        int[] techCrtN;
        int smove;
        int sfire;
        int sincantation;
        int density;
        int color;
        int cooldown;
        int casttime;
        int cost;
        int effect;
        int dam;
        int speed;
        int type;
        this.guiUp = false;
        for (int i = 0; i < this.inputField2.length; ++i) {
            this.inputField2[i] = new GuiTextField(JRMCoreGuiScreen.mc.fontRenderer, 0, 0, 50, 12);
            this.inputField2[i].setText("255");
        }
        wish = JRMCoreH.tjjrmc + ":gui.png";
        pc = JRMCoreH.tjjrmc + ":gui_pc.png";
        button1 = JRMCoreH.tjjrmc + ":button1.png";
        icons = JRMCoreH.tjjrmc + ":icons.png";
        instance = this;
        if (JRMCoreH.Pwrtyp == 2) {
            type = JRMCoreH.techNCBase[3];
            speed = JRMCoreH.techNCBase[4];
            dam = JRMCoreH.techNCBase[5];
            effect = JRMCoreH.techNCBase[6];
            cost = JRMCoreH.techNCBase[7];
            casttime = JRMCoreH.techNCBase[8];
            cooldown = JRMCoreH.techNCBase[9];
            color = JRMCoreH.techNCBase[10];
            density = JRMCoreH.techNCBase[11];
            sincantation = JRMCoreH.techNCBase[12];
            sfire = JRMCoreH.techNCBase[13];
            smove = JRMCoreH.techNCBase[14];
            techCrtN = new int[]{1, acquired, 1, type, speed, dam, effect, cost, casttime, cooldown, color, density, sincantation, sfire, smove};
            techCrt = techCrtN;
        }
        if (JRMCoreH.Pwrtyp == 1) {
            type = JRMCoreH.techBase[3];
            speed = JRMCoreH.techBase[4];
            dam = JRMCoreH.techBase[5];
            effect = JRMCoreH.techBase[6];
            cost = JRMCoreH.techBase[7];
            casttime = JRMCoreH.techBase[8];
            cooldown = JRMCoreH.techBase[9];
            color = JRMCoreH.techBase[10];
            density = JRMCoreH.techBase[11];
            sincantation = JRMCoreH.techBase[12];
            sfire = JRMCoreH.techBase[13];
            smove = JRMCoreH.techBase[14];
            techCrtN = new int[]{1, acquired, 1, type, speed, dam, effect, cost, casttime, cooldown, color, density, sincantation, sfire, smove};
            techCrt = techCrtN;
        }
        this.buttonList.clear();
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        int posX = this.width / 2;
        int posY = this.height / 2;
        JRMCoreGuiSliderX00.sliderValue = 0.0f;
        this.scroll = 0;
        scrollSide = 0.0f;
        this.SideMsn = "";
        this.site = 0;
        JRMCoreH.jrmct(1);
        JRMCoreH.jrmct(3);
        this.smd = 0;
        this.ipg = 0;
        this.inv = 0;
        if (JRMCoreH.Accepted == 2) {
            this.guiID = 31;
        }
        if (!(JRMCoreH.Accepted != 1 || this.guiID <= 50 && this.guiID >= 30 || this.guiID == 8 || this.guiID == 10001 || this.guiID == 10010 || this.guiID >= 60 && this.guiID <= 70 || this.guiID == 10100)) {
            this.guiID = 10;
        }
        if (JRMCoreH.Accepted == 0 && this.guiID == 8) {
            this.guiID = 0;
        }
        if (this.guiID == 8) {
            if (JRMCoreH.JFC() && ItemBarberSnC.barberTarget != null) {
                if (JRMCoreHJFC.isChildNPC(ItemBarberSnC.barberTarget)) {
                    dns = JRMCoreHJFC.childDNS(ItemBarberSnC.barberTarget);
                    dnsH = JRMCoreHJFC.childDNSH(ItemBarberSnC.barberTarget);
                    dnsOrig = JRMCoreHJFC.childDNS(ItemBarberSnC.barberTarget);
                    dnsHOrig = JRMCoreHJFC.childDNSH(ItemBarberSnC.barberTarget);
                    RaceSlcted = JRMCoreH.Race;
                    HairSlcted = JRMCoreH.dnsHairB(dns);
                    Hair2Slcted = JRMCoreH.dnsHairF(dns);
                    ColorSlcted = JRMCoreH.dnsHairC(dns);
                }
            } else {
                dns = JRMCoreH.dns;
                dnsH = JRMCoreH.dnsH;
                dnsOrig = JRMCoreH.dns;
                dnsHOrig = JRMCoreH.dnsH;
                RaceSlcted = JRMCoreH.Race;
                HairSlcted = JRMCoreH.dnsHairB(dns);
                Hair2Slcted = JRMCoreH.dnsHairF(dns);
                ColorSlcted = JRMCoreH.dnsHairC(dns);
            }
        }
        if (this.guiID <= 50 && this.guiID >= 30) {
            JRMCoreClient.JFCGui.checkVersion();
            JRMCoreClient.JFCGui.checkText();
        }
        if (this.guiID == 0) {
            RaceSlcted = JRMCoreH.Race;
            if (JRMCoreH.dns.length() > 3) {
                dns = JRMCoreH.dns;
            } else {
                JRMCoreGuiScreen.setchangerace();
            }
            if (JRMCoreH.dnsH.length() > 3) {
                dnsH = JRMCoreH.dnsH;
            }
            dnsOrig = JRMCoreH.dns;
            dnsHOrig = JRMCoreH.dnsH;
            GenderSlcted = JRMCoreH.dnsGender(dns);
            HairSlcted = JRMCoreH.dnsHairB(dns);
            Hair2Slcted = JRMCoreH.dnsHairF(dns);
            ColorSlcted = JRMCoreH.dnsHairC(dns);
            BreastSizeSlcted = JRMCoreH.dnsBreast(dns);
            SkinTypeSlcted = JRMCoreH.dnsSkinT(dns);
            BodyTypeSlcted = JRMCoreH.dnsBodyT(dns);
            BodyColMainSlcted = JRMCoreH.dnsBodyCM(dns);
            BodyColSub1Slcted = JRMCoreH.dnsBodyC1(dns);
            BodyColSub2Slcted = JRMCoreH.dnsBodyC2(dns);
            FaceNoseSlcted = JRMCoreH.dnsFaceN(dns);
            FaceMouthSlcted = JRMCoreH.dnsFaceM(dns);
            EyesSlcted = JRMCoreH.dnsEyes(dns);
            EyeCol1Slcted = JRMCoreH.dnsEyeC1(dns);
            EyeCol2Slcted = JRMCoreH.dnsEyeC2(dns);
        }
        JRMCoreGuiScreen.csau_d();
        String s = JRMCoreH.rld("HairPresets", "jinryuujrmcore.dat");
        List<String> stooges = Arrays.asList(new String[0]);
        if (s.length() > 3) {
            stooges = Arrays.asList(s.split(","));
        }
        ArrayList<String> saves = new ArrayList<String>(stooges);
        ArrayList<String> defpres = new ArrayList<String>();
        ArrayList<String> presets = new ArrayList<String>();
        for (String def : JRMCoreH.defHairPrsts) {
            defpres.add(def);
        }
        saves.removeAll(defpres);
        presets.addAll(defpres);
        presets.addAll(saves);
        PresetList = presets;
        for (int i = 0; i < PresetList.size(); ++i) {
            if (!PresetList.get(i).equals(dnsH)) continue;
            HairPrstsSlcted = i;
            break;
        }
        if (JRMCoreH.SAOC()) {
            JRMCoreHSAC.initGui();
        }
    }

    public void urlOpenWithConfirm(String url) {
        this.clickedURI = URI.create(url);
        this.guiIDprev2 = this.guiID;
        mc.displayGuiScreen((GuiScreen)new GuiConfirmOpenLink((GuiYesNoCallback)this, url, 0, false));
    }

    public void confirmClicked(boolean p_73878_1_, int p_73878_2_) {
        if (p_73878_2_ == 0) {
            if (p_73878_1_) {
                this.func_146407_a(this.clickedURI);
            }
            this.clickedURI = null;
            mc.displayGuiScreen((GuiScreen)this);
        }
    }

    private void func_146407_a(URI p_146407_1_) {
        try {
            Desktop.getDesktop().browse(p_146407_1_);
        }
        catch (Throwable throwable) {
            logger.error("Couldn't open link", throwable);
        }
    }

    public Object actionPerformed(int par1, int par2, int par3, int par4, int par5, String par6Str) {
        int selct = par1 - 20;
        boolean KA = false;
        JRMCoreGuiButtons00 ret = KA ? new JRMCoreGuiButtons00(par1, par2, par3, par4, par5, par6Str, 0) : new JRMCoreGuiButtons00(par1, par2, par3, par4, par5, par6Str, 0);
        return ret;
    }

    public void actionPerformed(GuiButton button) {
        byte i;
        byte i2;
        int i3;
        int i4;
        int id = button.id;
        if (this.confirmationWindow) {
            this.confirmationWindow = false;
        }
        if (button.id == 10001) {
            this.guiID = 10001;
            help_mode = 0;
            help_page_id = 0;
        }
        if (button.id == 10003 && help_page_id > 0) {
            --help_page_id;
        }
        if (button.id == 10004) {
            if (help_mode == 2) {
                ++help_page_id;
            } else if (help_mode == 3 && help_page_id < 13) {
                ++help_page_id;
            }
        }
        if (button.id == 10005) {
            help_mode = 1;
            help_page_id = 0;
        }
        if (button.id == 10006) {
            help_mode = 2;
            help_page_id = 0;
        }
        if (button.id == 10007) {
            help_mode = 0;
            help_page_id = 0;
        }
        if (button.id == 10008) {
            this.guiID = 10;
            help_mode = 0;
            help_page_id = 0;
        }
        if (button.id >= 10009 && button.id < 10009 + JGRecipeHandler.recipelistmods.length) {
            this.gui_recipe_mod = button.id - 10009;
            this.gui_recipe_category = JGRecipeHandler.getFirstRecipeCategory(this.gui_recipe_mod);
            help_page_id = 0;
        }
        if (button.id >= 10013 && button.id < 10013 + JGRecipeHandler.recipelistcategories.length) {
            this.gui_recipe_category = button.id - 10013;
            help_page_id = 0;
        }
        if (button.id == 10019) {
            this.gui_recipe_mod = -1;
        }
        if (button.id == -10) {
            this.mcu = this.mcu >= 3 ? 0 : ++this.mcu;
        }
        if (button.id == 4890) {
            this.inputField.setText(JRMCoreH2.kiAttNamGen() + " " + JRMCoreH.techDBCTypes[techCrt[3]]);
        }
        if (button.id == 4900 && JRMCoreH.DBC()) {
            JRMCoreHDBC.openGui(0, (EntityPlayer)JRMCoreClient.mc.thePlayer);
        }
        if (button.id == 4901 && JRMCoreH.NC()) {
            JRMCoreHNC.openGui(0, (EntityPlayer)JRMCoreClient.mc.thePlayer);
        }
        if (button.id == 4902 && JRMCoreH.JYC()) {
            JRMCoreHJYC.openGui(1, (EntityPlayer)JRMCoreClient.mc.thePlayer);
        }
        if (button.id == 4903 && JRMCoreH.JFC()) {
            JRMCoreHJFC.openGui(1, (EntityPlayer)JRMCoreClient.mc.thePlayer);
        }
        if (button.id == 4904 && JRMCoreH.SAOC()) {
            JRMCoreHSAC.openGui(0, (EntityPlayer)JRMCoreClient.mc.thePlayer);
        }
        if (button.id == 0) {
            int n = this.guiIDprev == 8 ? this.guiIDprev : (this.guiID = this.guiIDprev == 19 ? this.guiIDprev : 0);
        }
        if (button.id == 1) {
            JRMCoreGuiScreen.RaceSlctF();
            JRMCoreH.Char((byte)0, (byte)RaceSlcted);
            JRMCoreGuiScreen.setchangerace();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == -1) {
            JRMCoreGuiScreen.RaceSlctB();
            JRMCoreH.Char((byte)0, (byte)RaceSlcted);
            JRMCoreGuiScreen.setchangerace();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == 4999) {
            JRMCoreGuiScreen.StateViewF();
            JRMCoreH.Char((byte)106, (byte)StateSlcted);
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == -4999) {
            JRMCoreGuiScreen.StateViewB();
            JRMCoreH.Char((byte)106, (byte)StateSlcted);
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == 8) {
            JRMCoreGuiScreen.YearsSlctF();
            JRMCoreGuiScreen.setdns();
            JRMCoreH.Char((byte)7, (byte)YearsSlcted);
        }
        if (button.id == -8) {
            JRMCoreGuiScreen.YearsSlctB();
            JRMCoreGuiScreen.setdns();
            JRMCoreH.Char((byte)7, (byte)YearsSlcted);
        }
        if (button.id == 2) {
            JRMCoreGuiScreen.GenderSlctF();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == -2) {
            JRMCoreGuiScreen.GenderSlctF();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == 3) {
            JRMCoreGuiScreen.HairSlctF();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == -3) {
            JRMCoreGuiScreen.HairSlctB();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == 5000) {
            JRMCoreGuiScreen.Hair2SlctF();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == -5000) {
            JRMCoreGuiScreen.Hair2SlctB();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == 5011) {
            EyeCol2Slcted = EyeCol1Slcted;
            JRMCoreGuiScreen.setdns();
        }
        if (id == 4 || id == 5003 || id == 5004 || id == 5005 || id == 5009 || id == 5010 || id == 5014 || id == 5015 || id == 5016 || id == 5017 || id == 5018 || id == 5019) {
            this.inputField2Cl = id;
            this.guiIDprev = this.guiID;
            this.guiID = 1;
            colorType = button.id;
        }
        if (button.id == -4) {
            int col = ((JRMCoreGuiButtonC)button).getBgCol();
            switch (colorType) {
                case 4: {
                    ColorSlcted = col;
                    break;
                }
                case 5015: {
                    KiColorSlcted = col;
                    break;
                }
                case 5003: {
                    BodyColMainSlcted = col;
                    break;
                }
                case 5004: {
                    BodyColSub1Slcted = col;
                    break;
                }
                case 5005: {
                    BodyColSub2Slcted = col;
                    break;
                }
                case 5014: {
                    BodyColSub3Slcted = col;
                    break;
                }
                case 5009: {
                    EyeCol1Slcted = col;
                    break;
                }
                case 5010: {
                    EyeCol2Slcted = col;
                    break;
                }
                case 5016: {
                    BodyauColMainSlcted = col;
                    JRMCoreGuiScreen.setdnsau();
                    JRMCoreH.jrmcDataFC(3, dnsau);
                    break;
                }
                case 5017: {
                    BodyauColSub1Slcted = col;
                    JRMCoreGuiScreen.setdnsau();
                    JRMCoreH.jrmcDataFC(3, dnsau);
                    break;
                }
                case 5018: {
                    BodyauColSub2Slcted = col;
                    JRMCoreGuiScreen.setdnsau();
                    JRMCoreH.jrmcDataFC(3, dnsau);
                    break;
                }
                case 5019: {
                    BodyauColSub3Slcted = col;
                    JRMCoreGuiScreen.setdnsau();
                    JRMCoreH.jrmcDataFC(3, dnsau);
                }
            }
            if (this.guiIDprev == 8 || this.guiIDprev == 0 || this.guiIDprev == 2 || this.guiIDprev == 19) {
                this.guiID = this.guiIDprev;
            }
            colorType = 0;
            if (this.guiIDprev == 8) {
                JRMCoreGuiScreen.setdnsForHair();
            } else {
                JRMCoreGuiScreen.setdns();
            }
            this.updateMajinHairToBodyColor();
        }
        if (button.id == -5016) {
            JRMCoreGuiScreen.csau_df();
            JRMCoreGuiScreen.setdnsau();
            JRMCoreH.jrmcDataFC(3, dnsau);
        }
        if (button.id == 5001) {
            BreastSizeSlcted = (int)(((JRMCoreGuiSlider01)button).sliderValue * 10.0f);
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == 5002) {
            SkinTypeSlcted = JRMCoreGuiScreen.SlctF(SkinTypeSlcted, 2);
            JRMCoreGuiScreen.setchangerace();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == -5002) {
            SkinTypeSlcted = JRMCoreGuiScreen.SlctB(SkinTypeSlcted, 2);
            JRMCoreGuiScreen.setchangerace();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == 5) {
            BodyTypeSlcted = JRMCoreGuiScreen.SlctF(BodyTypeSlcted, JRMCoreH.customSknLimits[RaceSlcted][0]);
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == -5) {
            BodyTypeSlcted = JRMCoreGuiScreen.SlctB(BodyTypeSlcted, JRMCoreH.customSknLimits[RaceSlcted][0]);
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == 5006) {
            FaceNoseSlcted = JRMCoreGuiScreen.SlctF(FaceNoseSlcted, JRMCoreH.customSknLimits[RaceSlcted][2]);
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == -5006) {
            FaceNoseSlcted = JRMCoreGuiScreen.SlctB(FaceNoseSlcted, JRMCoreH.customSknLimits[RaceSlcted][2]);
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == 5007) {
            FaceMouthSlcted = JRMCoreGuiScreen.SlctF(FaceMouthSlcted, JRMCoreH.customSknLimits[RaceSlcted][3]);
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == -5007) {
            FaceMouthSlcted = JRMCoreGuiScreen.SlctB(FaceMouthSlcted, JRMCoreH.customSknLimits[RaceSlcted][3]);
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == 5008) {
            EyesSlcted = JRMCoreGuiScreen.SlctF(EyesSlcted, JRMCoreH.customSknLimits[RaceSlcted][4]);
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == -5008) {
            EyesSlcted = JRMCoreGuiScreen.SlctB(EyesSlcted, JRMCoreH.customSknLimits[RaceSlcted][4]);
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == 5012) {
            BodyColPresetSlcted = JRMCoreGuiScreen.SlctF(BodyColPresetSlcted, JRMCoreH.customSknLimitsBCP[RaceSlcted]);
            JRMCoreGuiScreen.setchangebodycol();
            JRMCoreGuiScreen.setdns();
            this.updateMajinHairToBodyColor();
        }
        if (button.id == -5012) {
            BodyColPresetSlcted = JRMCoreGuiScreen.SlctB(BodyColPresetSlcted, JRMCoreH.customSknLimitsBCP[RaceSlcted]);
            JRMCoreGuiScreen.setchangebodycol();
            JRMCoreGuiScreen.setdns();
            this.updateMajinHairToBodyColor();
        }
        if (button.id == 5013) {
            EyeColPresetSlcted = JRMCoreGuiScreen.SlctF(EyeColPresetSlcted, JRMCoreH.defeyecols.length);
            JRMCoreGuiScreen.setchangeeyecol();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id == -5013) {
            EyeColPresetSlcted = JRMCoreGuiScreen.SlctB(EyeColPresetSlcted, JRMCoreH.defeyecols.length);
            JRMCoreGuiScreen.setchangeeyecol();
            JRMCoreGuiScreen.setdns();
        }
        if (button.id >= 5100 && button.id <= 5104) {
            this.guiIDprev = this.guiID;
            dnsH = JRMCoreH.dnsH;
            this.guiID = button.id - 5080;
        }
        if (button.id == 5199) {
            dnsH = PresetList.get(HairPrstsSlcted);
        }
        if (button.id == 5150) {
            ++this.guiID;
        }
        if (button.id == 5151) {
            --this.guiID;
        }
        if (button.id == 5152 && (this.guiIDprev == 0 || this.guiIDprev == 8)) {
            this.guiID = this.guiIDprev;
        }
        if (button.id == 5153) {
            this.setClipboardContents(dnsH);
        }
        if (button.id == 5154) {
            String newDnsH;
            dnsH = newDnsH = this.getClipboardContents();
        }
        if (button.id == 5155) {
            JRMCoreGuiScreen.HairCstmNextPreset();
        }
        if (button.id == -5155) {
            JRMCoreGuiScreen.HairCstmPrevPreset();
        }
        if (button.id == 5156) {
            JRMCoreGuiScreen.HairCstmSaveAsPreset();
        }
        if (button.id == 5157) {
            JRMCoreGuiScreen.HairCstmDelPreset();
        }
        if (button.id == 5158) {
            JRMCoreGuiScreen.HairCstmResetPreset();
        }
        if (button.id == 5159) {
            String url = "http://hairsalon.jingames.net";
            this.urlOpenWithConfirm(url);
        }
        if (button.id == 5160) {
            headRotX += 10;
        }
        if (button.id == 5161) {
            headRotX -= 10;
        }
        if (button.id == 5162) {
            headRotY += 10;
        }
        if (button.id == 5163) {
            headRotY -= 10;
        }
        if (button.id == 5164) {
            headRotZ += 10;
        }
        if (button.id == 5165) {
            headRotZ -= 10;
        }
        if (button.id == 5166) {
            headRotX = 0;
            headRotY = 0;
            headRotZ = 0;
        }
        if (button.id == 5167) {
            boolean bl = headRoton = !headRoton;
        }
        if (button.id == 5168) {
            int n = ++hairPreview > 3 ? 3 : (hairPreview = hairPreview);
        }
        if (button.id == 5169) {
            hairPreview = 0;
        }
        if (button.id >= 5200 && button.id <= 6000 && dnsH.length() > 3) {
            dnsHbu = dnsH;
            int buttonID = button.id - 5200;
            int hid = 0;
            boolean pidh = false;
            boolean pidv = false;
            this.hbt = this.hbt == null ? new int[56] : this.hbt;
            for (int face = 0; face < 56; ++face) {
                int l = JRMCoreH.dnsHair2(dnsH, face * 14);
                if (buttonID / 10 == hid) {
                    int tempID = buttonID - hid * 10;
                    switch (tempID) {
                        case 0: {
                            int temp = (int)(((JRMCoreGuiSlider02)button).sliderValue * 100.0f / 1.56f) + 18;
                            temp = temp > 82 ? 82 : (temp < 18 ? 18 : temp);
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 2, temp + "");
                            if (dnsH.length() != 786) {
                                dnsH = dnsHbu;
                            }
                            if (this.dfa[this.curPage] != 1 || this.hcl[this.curPage] * 14 + 2 != face * 14 + 2) break;
                            for (int i5 = this.hcl[this.curPage] + 1; i5 < this.hcl[this.curPage + 1]; ++i5) {
                                if ((dnsH = JRMCoreH.dnsHair2set(dnsH, i5 * 14 + 2, temp + "")).length() == 786) continue;
                                dnsH = dnsHbu;
                            }
                            break;
                        }
                        case 1: {
                            int temp = (int)(((JRMCoreGuiSlider02)button).sliderValue * 100.0f / 1.56f) + 18;
                            temp = temp > 82 ? 82 : (temp < 18 ? 18 : temp);
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 4, temp + "");
                            if (dnsH.length() != 786) {
                                dnsH = dnsHbu;
                            }
                            if (this.dfa[this.curPage] != 1 || this.hcl[this.curPage] * 14 + 4 != face * 14 + 4) break;
                            for (int i6 = this.hcl[this.curPage] + 1; i6 < this.hcl[this.curPage + 1]; ++i6) {
                                if ((dnsH = JRMCoreH.dnsHair2set(dnsH, i6 * 14 + 4, temp + "")).length() == 786) continue;
                                dnsH = dnsHbu;
                            }
                            break;
                        }
                        case 2: {
                            int temp = (int)(((JRMCoreGuiSlider02)button).sliderValue * 100.0f / 1.56f) + 18;
                            temp = temp > 82 ? 82 : (temp < 18 ? 18 : temp);
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 6, temp + "");
                            if (dnsH.length() != 786) {
                                dnsH = dnsHbu;
                            }
                            if (this.dfa[this.curPage] != 1 || this.hcl[this.curPage] * 14 + 6 != face * 14 + 6) break;
                            for (int i7 = this.hcl[this.curPage] + 1; i7 < this.hcl[this.curPage + 1]; ++i7) {
                                if ((dnsH = JRMCoreH.dnsHair2set(dnsH, i7 * 14 + 6, temp + "")).length() == 786) continue;
                                dnsH = dnsHbu;
                            }
                            break;
                        }
                        case 3: {
                            int temp = (int)(((JRMCoreGuiSlider02)button).sliderValue * 100.0f);
                            temp = temp > 99 ? 99 : (temp < 1 ? 1 : temp);
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14, temp < 10 ? "0" + temp : "" + temp);
                            if (dnsH.length() != 786) {
                                dnsH = dnsHbu;
                            }
                            if (this.dfa[this.curPage] != 1 || this.hcl[this.curPage] * 14 != face * 14) break;
                            for (int i8 = this.hcl[this.curPage] + 1; i8 < this.hcl[this.curPage + 1]; ++i8) {
                                if ((dnsH = JRMCoreH.dnsHair2set(dnsH, i8 * 14, temp < 10 ? "0" + temp : "" + temp)).length() == 786) continue;
                                dnsH = dnsHbu;
                            }
                            break;
                        }
                        case 4: {
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14, l != 0 ? "00" : "01");
                            if (dnsH.length() != 786) {
                                dnsH = dnsHbu;
                            }
                            if (this.dfa[this.curPage] != 1 || this.hcl[this.curPage] * 14 != face * 14) break;
                            for (int i9 = this.hcl[this.curPage] + 1; i9 < this.hcl[this.curPage + 1]; ++i9) {
                                if ((dnsH = JRMCoreH.dnsHair2set(dnsH, i9 * 14, l != 0 ? "00" : "01")).length() == 786) continue;
                                dnsH = dnsHbu;
                            }
                            break;
                        }
                        case 5: {
                            String dnsHdef = PresetList.get(HairPrstsSlcted);
                            int L = JRMCoreH.dnsHair2(dnsHdef, face * 14);
                            int X = JRMCoreH.dnsHair2(dnsHdef, face * 14 + 2);
                            int Y = JRMCoreH.dnsHair2(dnsHdef, face * 14 + 4);
                            int Z = JRMCoreH.dnsHair2(dnsHdef, face * 14 + 6);
                            int B = JRMCoreH.dnsHair2(dnsHdef, face * 14 + 8);
                            int P = JRMCoreH.dnsHair2(dnsHdef, face * 14 + 10);
                            int T = JRMCoreH.dnsHair2(dnsHdef, face * 14 + 12);
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14, L + "");
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 2, X + "");
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 4, Y + "");
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 6, Z + "");
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 8, B + "");
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 10, P + "");
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 12, T + "");
                            if (dnsH.length() == 786) break;
                            dnsH = dnsHbu;
                            break;
                        }
                        case 6: {
                            int i10;
                            int now = this.hbt[face];
                            int n = this.hbt[face] = now < 1 ? now + 1 : 0;
                            if (this.dfa[this.curPage] != 1 || this.hcl[this.curPage] + 8 != face + 8) break;
                            for (i10 = this.hcl[this.curPage] + 1; i10 < this.hcl[this.curPage + 1]; ++i10) {
                                this.hbt[i10] = now < 1 ? now + 1 : 0;
                            }
                            break;
                        }
                        case 7: {
                            int i10;
                            int temp = (int)(((JRMCoreGuiSlider02)button).sliderValue * 100.0f / 1.56f) + 18;
                            temp = temp > 82 ? 82 : (temp < 18 ? 18 : temp);
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 8, temp + "");
                            if (dnsH.length() != 786) {
                                dnsH = dnsHbu;
                            }
                            if (this.dfa[this.curPage] != 1 || this.hcl[this.curPage] * 14 + 8 != face * 14 + 8) break;
                            for (i10 = this.hcl[this.curPage] + 1; i10 < this.hcl[this.curPage + 1]; ++i10) {
                                if ((dnsH = JRMCoreH.dnsHair2set(dnsH, i10 * 14 + 8, temp + "")).length() == 786) continue;
                                dnsH = dnsHbu;
                            }
                            break;
                        }
                        case 8: {
                            int i10;
                            int temp = (int)(((JRMCoreGuiSlider02)button).sliderValue * 100.0f / 1.56f) + 18;
                            temp = temp > 82 ? 82 : (temp < 18 ? 18 : temp);
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 10, temp + "");
                            if (dnsH.length() != 786) {
                                dnsH = dnsHbu;
                            }
                            if (this.dfa[this.curPage] != 1 || this.hcl[this.curPage] * 14 + 10 != face * 14 + 10) break;
                            for (i10 = this.hcl[this.curPage] + 1; i10 < this.hcl[this.curPage + 1]; ++i10) {
                                if ((dnsH = JRMCoreH.dnsHair2set(dnsH, i10 * 14 + 10, temp + "")).length() == 786) continue;
                                dnsH = dnsHbu;
                            }
                            break;
                        }
                        case 9: {
                            int i10;
                            int temp = (int)(((JRMCoreGuiSlider02)button).sliderValue * 100.0f / 1.56f) + 18;
                            temp = temp > 82 ? 82 : (temp < 18 ? 18 : temp);
                            dnsH = JRMCoreH.dnsHair2set(dnsH, face * 14 + 12, temp + "");
                            if (dnsH.length() != 786) {
                                dnsH = dnsHbu;
                            }
                            if (this.dfa[this.curPage] != 1 || this.hcl[this.curPage] * 14 + 12 != face * 14 + 12) break;
                            for (i10 = this.hcl[this.curPage] + 1; i10 < this.hcl[this.curPage + 1]; ++i10) {
                                if ((dnsH = JRMCoreH.dnsHair2set(dnsH, i10 * 14 + 12, temp + "")).length() == 786) continue;
                                dnsH = dnsHbu;
                            }
                            break;
                        }
                    }
                }
                ++hid;
            }
            if (button.id == 5999) {
                int cur = this.dfa[this.curPage];
                int n = this.dfa[this.curPage] = cur == 0 ? 1 : 0;
            }
        }
        if (button.id == 6) {
            PwrtypSlcted = JRMCoreGuiScreen.Slct("F", PwrtypSlcted, JRMCoreH.PwrtypAllow);
        }
        if (button.id == -6) {
            PwrtypSlcted = JRMCoreGuiScreen.Slct("B", PwrtypSlcted, JRMCoreH.PwrtypAllow);
        }
        if (button.id == 7) {
            ClassSlcted = JRMCoreGuiScreen.Slct2("F", ClassSlcted, JRMCoreH.PwrtypAllow, PwrtypSlcted, JRMCoreGuiScreen.cl());
        }
        if (button.id == -7) {
            ClassSlcted = JRMCoreGuiScreen.Slct2("B", ClassSlcted, JRMCoreH.PwrtypAllow, PwrtypSlcted, JRMCoreGuiScreen.cl());
        }
        if (button.id == 20) {
            BrghtSlcted = ((JRMCoreGuiSlider00)button).sliderValue;
        }
        if (button.id == 10) {
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == 11) {
            this.guiID = 2;
        }
        if (button.id == 12) {
            this.guiID = 3;
        }
        if (button.id == 13) {
            JRMCoreGuiScreen.setdns();
            JRMCoreH.jrmcDataFC(0, dns);
            JRMCoreH.jrmcDataFC(1, dnsH);
            JRMCoreH.jrmcDataFC(2, KiColorSlcted + "");
            JRMCoreH.Char((byte)7, (byte)YearsSlcted);
            JRMCoreH.Char((byte)0, (byte)RaceSlcted);
            JRMCoreH.Char((byte)2, (byte)PwrtypSlcted);
            JRMCoreH.Char((byte)3, (byte)ClassSlcted);
            JRMCoreH.Char((byte)4, (byte)1);
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == 14) {
            JRMCoreGuiScreen.setdnsForHair();
            if (JRMCoreH.JFC() && ItemBarberSnC.barberTarget != null) {
                if (JRMCoreHJFC.isChildNPC(ItemBarberSnC.barberTarget)) {
                    JRMCoreHJFC.childDNSset(ItemBarberSnC.barberTarget, dns);
                    JRMCoreHJFC.childDNSHset(ItemBarberSnC.barberTarget, dnsH);
                }
            } else {
                JRMCoreH.jrmcDataFC(0, dns);
                JRMCoreH.jrmcDataFC(1, dnsH);
            }
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == -14) {
            dns = dnsOrig;
            dnsH = dnsHOrig;
            if (JRMCoreH.JFC() && ItemBarberSnC.barberTarget != null) {
                if (JRMCoreHJFC.isChildNPC(ItemBarberSnC.barberTarget)) {
                    JRMCoreHJFC.childDNSset(ItemBarberSnC.barberTarget, dns);
                    JRMCoreHJFC.childDNSHset(ItemBarberSnC.barberTarget, dnsH);
                }
            } else {
                JRMCoreH.jrmcDataFC(0, dns);
                JRMCoreH.jrmcDataFC(1, dnsH);
            }
            RaceSlcted = JRMCoreH.Race;
            HairSlcted = JRMCoreH.dnsHairB(dns);
            Hair2Slcted = JRMCoreH.dnsHairF(dns);
            ColorSlcted = JRMCoreH.dnsHairC(dns);
        }
        if (button.id == 15) {
            JRMCoreGuiScreen.HairSlctF();
            JRMCoreGuiScreen.setdnsForHair();
        }
        if (button.id == -15) {
            JRMCoreGuiScreen.HairSlctB();
            JRMCoreGuiScreen.setdnsForHair();
        }
        if (button.id == 16) {
            JRMCoreGuiScreen.setdnsau();
            JRMCoreH.jrmcDataFC(4, dnsau);
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == 31) {
            this.guiID = 30;
        }
        if (button.id == 32) {
            this.guiID = 40;
        }
        if (button.id == 33) {
            this.guiID = 50;
        }
        if (button.id == 41) {
            --this.site;
        }
        if (button.id == 42) {
            ++this.site;
        }
        if (button.id == 43) {
            this.scroll -= 3;
        }
        if (button.id == 44) {
            this.scroll += 3;
        }
        if (button.id == 50) {
            this.sip = 0;
        }
        if (button.id == 51) {
            this.sip = 1;
        }
        if (button.id == 60) {
            this.guiID = 60;
        }
        if (button.id == 61) {
            this.guiID = 61;
        }
        if (button.id == 62) {
            this.guiID = 70;
        }
        if (button.id == 63 || button.id == 64 || button.id == 65) {
            i4 = button.id - 62;
            this.dri(JRMCoreH.SagaProg - i4);
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == 66) {
            i4 = button.id - 62;
            this.dri(JRMCoreH.SagaProg + 100 - i4 - 1);
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == 67) {
            i4 = button.id - 62;
            this.dri(JRMCoreH.SagaProg + 100 - i4 - 1);
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == 68) {
            this.dri(3990);
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == 69) {
            this.dri(100);
        }
        if (button.id == 73 || button.id == 74 || button.id == 75) {
            i4 = button.id - 72;
            int i0 = JRMCoreH.SagaSideProg - i4;
            int i1 = i0 / 10000;
            int i22 = i0 / 100 - i1 * 100;
            int i32 = i0 - i1 * 10000 - i22 * 100;
            JRMCoreH.quad(2, i1, i22, i32);
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == 80) {
            JRMCoreH.quad(3, 1, 0, 0);
            this.ipg = 0;
            this.inv = 0;
        }
        if (button.id == 81) {
            JRMCoreH.quad(3, 2, 0, 0);
            this.ipg = 0;
            this.inv = 0;
        }
        if (button.id == 82) {
            JRMCoreH.quad(3, 3, 0, 0);
            this.ipg = 0;
            this.inv = 0;
        }
        if (button.id == 83) {
            this.inv = 1;
        }
        if (button.id == 84) {
            this.inv = 3;
        }
        if (button.id == 85) {
            this.inv = 2;
        }
        if (button.id == 86) {
            JRMCoreH.quad(3, 4, 0, 0);
            this.ipg = 0;
            this.inv = 0;
        }
        if (button.id == 87) {
            JRMCoreH.quad(3, 5, 0, 0);
            this.ipg = 0;
            this.inv = 0;
        }
        if (button.id == 88) {
            ++this.ipg;
            ++this.lp;
        }
        if (button.id == 89) {
            --this.ipg;
            --this.lp;
        }
        if (button.id == 90) {
            this.ipg = 0;
            this.inv = 0;
        }
        if (button.id == -30) {
            JRMCoreH.quad(10, 0, 0, 0);
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == -31) {
            this.guiID = 18;
            JRMCoreH.quad(10, 1, 0, this.miniGameConcentration.score);
        }
        if (button.id == -32 && this.guiID != 18) {
            String s = JRMCoreH.rld("BPMode", "jinryuujrmcore.dat").equalsIgnoreCase("Normal") ? "High" : "Normal";
            JRMCoreH.wld(s, "BPMode", "jinryuujrmcore.dat", false);
            int n = s.equalsIgnoreCase("Normal") ? 0 : (JRMCoreH.BPMode = s.equalsIgnoreCase("High") ? 1 : 0);
        }
        if (button.id == -33) {
            JRMCoreH.quad(10, 1, 1, this.miniGameConcentration.score);
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == -34) {
            this.guiID = 10002;
            JRMCoreH.quad(10, 2, 0, this.miniGameConcentration.score);
        }
        if (button.id == -35 && this.miniGameAirBoxing != null) {
            this.miniGameAirBoxing.endAnimationStart = true;
        }
        if (button.id == -36) {
            JRMCoreH.quad(10, 2, 1, this.miniGameAirBoxing.score);
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        if (button.id == 100) {
            this.guiID = 10;
        }
        if (button.id == 101) {
            this.guiID = 11;
        }
        if (button.id == 102) {
            this.guiID = 12;
        }
        if (button.id == 104) {
            this.guiID = 14;
        }
        if (button.id == 109) {
            this.guiID = 10000;
        }
        if (button.id == 50011) {
            this.guiID = 10011;
        }
        if (button.id == 10000) {
            JGConfigClientSettings.init_client(JGConfigsClient.clientSettings, false, false);
        }
        if (button.id == 11000 && (JGConfigClientSettings.CLIENT_hud0x -= JGConfigClientSettings.addMore) < -100) {
            JGConfigClientSettings.CLIENT_hud0x = -100;
        }
        if (button.id == 11001) {
            JGConfigClientSettings.CLIENT_hud0x += JGConfigClientSettings.addMore;
        }
        if (button.id == 11002 && (JGConfigClientSettings.CLIENT_hud0y -= JGConfigClientSettings.addMore) < -100) {
            JGConfigClientSettings.CLIENT_hud0y = -100;
        }
        if (button.id == 11003) {
            JGConfigClientSettings.CLIENT_hud0y += JGConfigClientSettings.addMore;
        }
        if (button.id == 11004 && JGConfigClientSettings.CLIENT_hud0 > 0) {
            --JGConfigClientSettings.CLIENT_hud0;
        }
        if (button.id == 11005 && JGConfigClientSettings.CLIENT_hud0 + 1 < JGConfigClientSettings.BENS_CONFIG_HUD_SIZES_POS.length) {
            ++JGConfigClientSettings.CLIENT_hud0;
        }
        if (button.id == 11006) {
            JGConfigClientSettings.hud_lockon_take();
        }
        if (button.id == 11007) {
            JGConfigClientSettings.hud_lockon_add();
        }
        if (button.id == 11008) {
            JGConfigClientSettings.init_client(JGConfigsClient.clientSettings, false, true);
        }
        if (button.id == 11009) {
            JGConfigClientSettings.settings_addmore();
        }
        if (button.id == 11010 && (JGConfigClientSettings.CLIENT_hud1x -= JGConfigClientSettings.addMore) < -10000) {
            JGConfigClientSettings.CLIENT_hud1x = 0;
        }
        if (button.id == 11011) {
            JGConfigClientSettings.CLIENT_hud1x += JGConfigClientSettings.addMore;
        }
        if (button.id == 11012 && (JGConfigClientSettings.CLIENT_hud1y -= JGConfigClientSettings.addMore) < -10000) {
            JGConfigClientSettings.CLIENT_hud1y = 0;
        }
        if (button.id == 11013) {
            JGConfigClientSettings.CLIENT_hud1y += JGConfigClientSettings.addMore;
        }
        if (button.id == 11014 && JGConfigClientSettings.CLIENT_hud1 > 0) {
            --JGConfigClientSettings.CLIENT_hud1;
        }
        if (button.id == 11015 && JGConfigClientSettings.CLIENT_hud1 + 1 < JGConfigClientSettings.BENS_CONFIG_HUD_1_SIZES_X.length) {
            ++JGConfigClientSettings.CLIENT_hud1;
        }
        if (button.id == 11016 && cs_page > 0) {
            --cs_page;
            this.guiUp = false;
        }
        if (button.id == 11017 && cs_page < cs_pages[cs_mode] - 1) {
            ++cs_page;
            this.guiUp = true;
        }
        if (button.id == 11018) {
            boolean bl = JGConfigClientSettings.CLIENT_GR0 = !JGConfigClientSettings.CLIENT_GR0;
        }
        if (button.id == 11019) {
            boolean bl = JGConfigClientSettings.CLIENT_GR1 = !JGConfigClientSettings.CLIENT_GR1;
        }
        if (button.id == 11020) {
            boolean bl = JGConfigClientSettings.CLIENT_GR2 = !JGConfigClientSettings.CLIENT_GR2;
        }
        if (button.id == 11021) {
            boolean bl = JGConfigClientSettings.CLIENT_GR3 = !JGConfigClientSettings.CLIENT_GR3;
        }
        if (button.id == 11022) {
            boolean bl = JGConfigClientSettings.CLIENT_GR4 = !JGConfigClientSettings.CLIENT_GR4;
        }
        if (button.id == 11023) {
            boolean bl = JGConfigClientSettings.CLIENT_GR5 = !JGConfigClientSettings.CLIENT_GR5;
        }
        if (button.id == 11024) {
            boolean bl = JGConfigClientSettings.CLIENT_GR6 = !JGConfigClientSettings.CLIENT_GR6;
        }
        if (button.id == 11025) {
            boolean bl = JGConfigClientSettings.CLIENT_GR7 = !JGConfigClientSettings.CLIENT_GR7;
        }
        if (button.id == 11026) {
            boolean bl = JGConfigClientSettings.CLIENT_GR8 = !JGConfigClientSettings.CLIENT_GR8;
        }
        if (button.id == 11027) {
            boolean bl = JGConfigClientSettings.CLIENT_GR9 = !JGConfigClientSettings.CLIENT_GR9;
        }
        if (button.id == 11028) {
            boolean bl = JGConfigClientSettings.CLIENT_GR10 = !JGConfigClientSettings.CLIENT_GR10;
        }
        if (button.id == 11029) {
            boolean bl = JGConfigClientSettings.CLIENT_GR11 = !JGConfigClientSettings.CLIENT_GR11;
        }
        if (button.id == 11030 && --JGConfigClientSettings.CLIENT_DA1 < -1) {
            JGConfigClientSettings.CLIENT_DA1 = -1;
        }
        if (button.id == 11031) {
            ++JGConfigClientSettings.CLIENT_DA1;
        }
        if (button.id == 11032 && --JGConfigClientSettings.CLIENT_DA2 < 0) {
            JGConfigClientSettings.CLIENT_DA2 = 0;
        }
        if (button.id == 11033) {
            ++JGConfigClientSettings.CLIENT_DA2;
        }
        if (button.id == 11034 && JGConfigClientSettings.CLIENT_DA3 < 10) {
            ++JGConfigClientSettings.CLIENT_DA3;
        }
        if (button.id == 11035 && JGConfigClientSettings.CLIENT_DA3 > 0) {
            --JGConfigClientSettings.CLIENT_DA3;
        }
        if (button.id == 11036) {
            boolean bl = JGConfigClientSettings.CLIENT_DA4 = !JGConfigClientSettings.CLIENT_DA4;
        }
        if (button.id == 11037) {
            boolean bl = JGConfigClientSettings.CLIENT_DA5 = !JGConfigClientSettings.CLIENT_DA5;
        }
        if (button.id == 11038) {
            boolean bl = JGConfigClientSettings.CLIENT_DA6 = !JGConfigClientSettings.CLIENT_DA6;
        }
        if (button.id == 11039) {
            boolean bl = JGConfigClientSettings.CLIENT_DA7 = !JGConfigClientSettings.CLIENT_DA7;
        }
        if (button.id == 11040) {
            boolean bl = JGConfigClientSettings.CLIENT_DA8 = !JGConfigClientSettings.CLIENT_DA8;
        }
        if (button.id == 11041) {
            boolean bl = JGConfigClientSettings.CLIENT_DA9 = !JGConfigClientSettings.CLIENT_DA9;
        }
        if (button.id == 11042) {
            boolean bl = JGConfigClientSettings.CLIENT_DA10 = !JGConfigClientSettings.CLIENT_DA10;
        }
        if (button.id == 11043) {
            boolean bl = JGConfigClientSettings.CLIENT_DA11 = !JGConfigClientSettings.CLIENT_DA11;
        }
        if (button.id == 11044) {
            boolean bl = JGConfigClientSettings.CLIENT_DA12 = !JGConfigClientSettings.CLIENT_DA12;
        }
        if (button.id == 11045) {
            boolean bl = JGConfigClientSettings.CLIENT_DA13 = !JGConfigClientSettings.CLIENT_DA13;
        }
        if (button.id == 11046) {
            boolean bl = JGConfigClientSettings.CLIENT_DA14 = !JGConfigClientSettings.CLIENT_DA14;
        }
        if (button.id == 11047) {
            boolean bl = JGConfigClientSettings.CLIENT_DA15 = !JGConfigClientSettings.CLIENT_DA15;
        }
        if (button.id == 11048) {
            boolean bl = JGConfigClientSettings.CLIENT_DA16 = !JGConfigClientSettings.CLIENT_DA16;
        }
        if (button.id == 11049) {
            JGConfigClientSettings.CLIENT_hud2 = !JGConfigClientSettings.CLIENT_hud2;
            cs_page = 0;
        }
        if (button.id == 11050) {
            boolean bl = JGConfigClientSettings.CLIENT_DA17 = !JGConfigClientSettings.CLIENT_DA17;
        }
        if (button.id == 11051) {
            boolean bl = JGConfigClientSettings.CLIENT_DA18 = !JGConfigClientSettings.CLIENT_DA18;
        }
        if (button.id == 11052) {
            boolean bl = JGConfigClientSettings.CLIENT_DA20 = !JGConfigClientSettings.CLIENT_DA20;
        }
        if (button.id == 11053) {
            boolean bl = JGConfigClientSettings.CLIENT_DA19 = !JGConfigClientSettings.CLIENT_DA19;
        }
        if (button.id == 11054 && JGConfigClientSettings.CLIENT_DA21 < 10) {
            ++JGConfigClientSettings.CLIENT_DA21;
        }
        if (button.id == 11055 && JGConfigClientSettings.CLIENT_DA21 > 0) {
            --JGConfigClientSettings.CLIENT_DA21;
        }
        if (button.id == 11056) {
            boolean bl = JGConfigClientSettings.CLIENT_GR12 = !JGConfigClientSettings.CLIENT_GR12;
        }
        if (button.id == 11057) {
            boolean bl = JGConfigClientSettings.CLIENT_GR13 = !JGConfigClientSettings.CLIENT_GR13;
        }
        if (button.id == 11058) {
            String cont;
            JGConfigClientSettings.CLIENT_hud2_2 = cont = this.getClipboardContents();
        }
        if (button.id == 11059) {
            JGConfigClientSettings.CLIENT_DA22 = !JGConfigClientSettings.CLIENT_DA22;
        }
        int max_scale = 10000;
        if (button.id == 11060 && JGConfigClientSettings.CLIENT_Ki_Visibility > 0) {
            JGConfigClientSettings.CLIENT_Ki_Visibility = (byte)(JGConfigClientSettings.CLIENT_Ki_Visibility - 1);
        }
        if (button.id == 11061 && JGConfigClientSettings.CLIENT_Ki_Visibility < 10) {
            JGConfigClientSettings.CLIENT_Ki_Visibility = (byte)(JGConfigClientSettings.CLIENT_Ki_Visibility + 1);
        }
        if (button.id == 11062 && JGConfigClientSettings.CLIENT_Ki_Scale > 0) {
            --JGConfigClientSettings.CLIENT_Ki_Scale;
        }
        if (button.id == 11063 && JGConfigClientSettings.CLIENT_Ki_Scale < 10000) {
            ++JGConfigClientSettings.CLIENT_Ki_Scale;
        }
        if (button.id == 11067 && JGConfigClientSettings.CLIENT_Ki_Charge_Visibility > 0) {
            JGConfigClientSettings.CLIENT_Ki_Charge_Visibility = (byte)(JGConfigClientSettings.CLIENT_Ki_Charge_Visibility - 1);
        }
        if (button.id == 11068 && JGConfigClientSettings.CLIENT_Ki_Charge_Visibility < 10) {
            JGConfigClientSettings.CLIENT_Ki_Charge_Visibility = (byte)(JGConfigClientSettings.CLIENT_Ki_Charge_Visibility + 1);
        }
        if (button.id == 11069 && JGConfigClientSettings.CLIENT_Ki_Charge_Scale > 0) {
            --JGConfigClientSettings.CLIENT_Ki_Charge_Scale;
        }
        if (button.id == 11070 && JGConfigClientSettings.CLIENT_Ki_Charge_Scale < 10000) {
            ++JGConfigClientSettings.CLIENT_Ki_Charge_Scale;
        }
        if (button.id == 11074 && JGConfigClientSettings.CLIENT_Jutsu_Visibility > 0) {
            JGConfigClientSettings.CLIENT_Jutsu_Visibility = (byte)(JGConfigClientSettings.CLIENT_Jutsu_Visibility - 1);
        }
        if (button.id == 11075 && JGConfigClientSettings.CLIENT_Jutsu_Visibility < 10) {
            JGConfigClientSettings.CLIENT_Jutsu_Visibility = (byte)(JGConfigClientSettings.CLIENT_Jutsu_Visibility + 1);
        }
        if (button.id == 11076 && JGConfigClientSettings.CLIENT_Jutsu_Scale > 0) {
            --JGConfigClientSettings.CLIENT_Jutsu_Scale;
        }
        if (button.id == 11077 && JGConfigClientSettings.CLIENT_Jutsu_Scale < 10000) {
            ++JGConfigClientSettings.CLIENT_Jutsu_Scale;
        }
        if (button.id == 11300) {
            boolean bl = JGConfigClientSettings.tipNotificationsOn = !JGConfigClientSettings.tipNotificationsOn;
        }
        if (button.id == 11301) {
            boolean bl = JGConfigClientSettings.errorNotificationsOn = !JGConfigClientSettings.errorNotificationsOn;
        }
        if (button.id > 11079 && button.id < 11089) {
            boolean bl = JGConfigClientSettings.CLIENT_Ki_3d[button.id - 11080] = !JGConfigClientSettings.CLIENT_Ki_3d[button.id - 11080];
        }
        if (button.id > 11088 && button.id < 11098) {
            boolean bl = JGConfigClientSettings.CLIENT_Ki_Charge_3d[button.id - 11089] = !JGConfigClientSettings.CLIENT_Ki_Charge_3d[button.id - 11089];
        }
        if (button.id > 11097 && button.id < 11101) {
            boolean bl = JGConfigClientSettings.CLIENT_Jutsu_3d[button.id - 11098] = !JGConfigClientSettings.CLIENT_Jutsu_3d[button.id - 11098];
        }
        if (button.id == 11101) {
            boolean bl = JGConfigClientSettings.renderEnergyOutsideView = !JGConfigClientSettings.renderEnergyOutsideView;
        }
        if (button.id == 11200) {
            boolean bl = JGConfigClientSettings.concentrationAnimatedTexturesOn = !JGConfigClientSettings.concentrationAnimatedTexturesOn;
        }
        if (button.id == 11201) {
            boolean bl = JGConfigClientSettings.concentrationAnimatedColorOn = !JGConfigClientSettings.concentrationAnimatedColorOn;
        }
        if (button.id == 11202) {
            boolean bl = JGConfigClientSettings.airboxing3DCharacterOn = !JGConfigClientSettings.airboxing3DCharacterOn;
        }
        if (button.id == 11203) {
            boolean bl = JGConfigClientSettings.airboxing3DAuraOn = !JGConfigClientSettings.airboxing3DAuraOn;
        }
        if (button.id == 11204) {
            boolean bl = JGConfigClientSettings.airboxingAnimatedColorOn = !JGConfigClientSettings.airboxingAnimatedColorOn;
        }
        if (button.id == 11205 && (JGConfigClientSettings.renderdistanceMultiplierBarrierBlock -= JGConfigClientSettings.addMore) < 0) {
            JGConfigClientSettings.renderdistanceMultiplierBarrierBlock = 0;
        }
        if (button.id == 11206 && (JGConfigClientSettings.renderdistanceMultiplierBarrierBlock = (int)((double)JGConfigClientSettings.renderdistanceMultiplierBarrierBlock + (double)JGConfigClientSettings.addMore)) > 100) {
            JGConfigClientSettings.renderdistanceMultiplierBarrierBlock = 100;
        }
        if (button.id == 11207 && (JGConfigClientSettings.renderdistanceMultiplierParticles -= JGConfigClientSettings.addMore) < 0) {
            JGConfigClientSettings.renderdistanceMultiplierParticles = 0;
        }
        if (button.id == 11208 && (JGConfigClientSettings.renderdistanceMultiplierParticles += JGConfigClientSettings.addMore) > 10000) {
            JGConfigClientSettings.renderdistanceMultiplierParticles = 10000;
        }
        if (button.id == 11209 && (JGConfigClientSettings.renderdistanceMultiplierKiAttackCharge -= JGConfigClientSettings.addMore) < 0) {
            JGConfigClientSettings.renderdistanceMultiplierKiAttackCharge = 0;
        }
        if (button.id == 11210 && (JGConfigClientSettings.renderdistanceMultiplierKiAttackCharge += JGConfigClientSettings.addMore) > 10000) {
            JGConfigClientSettings.renderdistanceMultiplierKiAttackCharge = 10000;
        }
        if (button.id == 11211 && (JGConfigClientSettings.renderdistanceMultiplierAuras -= JGConfigClientSettings.addMore) < 0) {
            JGConfigClientSettings.renderdistanceMultiplierAuras = 0;
        }
        if (button.id == 11212 && (JGConfigClientSettings.renderdistanceMultiplierAuras += JGConfigClientSettings.addMore) > 10000) {
            JGConfigClientSettings.renderdistanceMultiplierAuras = 10000;
        }
        if (button.id == 11213) {
            boolean bl = JGConfigClientSettings.kiAttackChargePercentageOn = !JGConfigClientSettings.kiAttackChargePercentageOn;
        }
        if (button.id == 11214) {
            boolean bl = JGConfigClientSettings.dbcFastFusionSpectatorCameraFollowOn = !JGConfigClientSettings.dbcFastFusionSpectatorCameraFollowOn;
        }
        if (button.id == 11215) {
            boolean bl = JGConfigClientSettings.safeZoneUIModeOn = !JGConfigClientSettings.safeZoneUIModeOn;
        }
        if (button.id == 11216) {
            boolean bl = JGConfigClientSettings.instantTransmissionFirstPerson = !JGConfigClientSettings.instantTransmissionFirstPerson;
        }
        if (button.id == 11217) {
            JGConfigClientSettings.instantTransmissionParticles = !JGConfigClientSettings.instantTransmissionParticles;
        }
        JGNotificationGUI.checkButtons(button.id);
        if (button.id == 10101) {
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        for (i3 = 0; i3 < 20; ++i3) {
            if (button.id != 10102 + i3) continue;
            DBCPacketHandlerClient.selectGroupTeleport(i3);
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
            break;
        }
        if (button.id == 12000) {
            cs_mode = 0;
            cs_page = 0;
        }
        if (button.id == 12001) {
            cs_mode = 1;
            cs_page = 0;
        }
        for (int xx = 0; xx < 13; ++xx) {
            if (button.id != 12002 + xx) continue;
            help_mode = 3;
            help_page_id = xx;
        }
        if (button.id == 33000) {
            String[] s = new String[this.inputField2.length];
            for (int idd = 0; idd < this.inputField2.length; ++idd) {
                s[idd] = this.inputField2[idd].getText();
            }
            int[] n = new int[this.inputField2.length];
            try {
                for (int idd = 0; idd < this.inputField2.length; ++idd) {
                    n[idd] = Integer.parseInt(s[idd]);
                    if (n[idd] < 0) {
                        n[idd] = 0;
                    }
                    if (n[idd] <= 255) continue;
                    n[idd] = 255;
                }
                int col = n[0];
                col = (col << 8) + n[1];
                col = (col << 8) + n[2];
                switch (colorType) {
                    case 4: {
                        ColorSlcted = col;
                        break;
                    }
                    case 5015: {
                        KiColorSlcted = col;
                        break;
                    }
                    case 5003: {
                        BodyColMainSlcted = col;
                        break;
                    }
                    case 5004: {
                        BodyColSub1Slcted = col;
                        break;
                    }
                    case 5005: {
                        BodyColSub2Slcted = col;
                        break;
                    }
                    case 5014: {
                        BodyColSub3Slcted = col;
                        break;
                    }
                    case 5009: {
                        EyeCol1Slcted = col;
                        break;
                    }
                    case 5010: {
                        EyeCol2Slcted = col;
                        break;
                    }
                    case 5016: {
                        BodyauColMainSlcted = col;
                        JRMCoreGuiScreen.setdnsau();
                        JRMCoreH.jrmcDataFC(3, dnsau);
                        break;
                    }
                    case 5017: {
                        BodyauColSub1Slcted = col;
                        JRMCoreGuiScreen.setdnsau();
                        JRMCoreH.jrmcDataFC(3, dnsau);
                        break;
                    }
                    case 5018: {
                        BodyauColSub2Slcted = col;
                        JRMCoreGuiScreen.setdnsau();
                        JRMCoreH.jrmcDataFC(3, dnsau);
                        break;
                    }
                    case 5019: {
                        BodyauColSub3Slcted = col;
                        JRMCoreGuiScreen.setdnsau();
                        JRMCoreH.jrmcDataFC(3, dnsau);
                    }
                }
                if (this.guiIDprev == 8 || this.guiIDprev == 0 || this.guiIDprev == 2 || this.guiIDprev == 19) {
                    this.guiID = this.guiIDprev;
                }
                colorType = 0;
                if (this.guiIDprev == 8) {
                    JRMCoreGuiScreen.setdnsForHair();
                } else {
                    JRMCoreGuiScreen.setdns();
                }
            }
            catch (Exception col) {
                // empty catch block
            }
            this.inputField2Ch = false;
            this.updateMajinHairToBodyColor();
        }
        if (button.id == 105) {
            JRMCoreH.Char((byte)102, (byte)0);
        }
        if (button.id == 106) {
            tail = !tail;
            JRMCoreH.Char((byte)103, tail ? (byte)1 : 0);
        }
        if (button.id == 107) {
            JRMCoreH.Skll((byte)5, (byte)(JRMCoreH.StusEfctsMe(6) ? 1 : 0), (byte)6);
        }
        if (button.id == 108) {
            this.guiID = 17;
        }
        if (button.id == -101) {
            this.diff = 0;
        }
        if (button.id == -102) {
            this.diff = 1;
        }
        if (button.id == -103) {
            this.diff = 2;
        }
        if (button.id == -104) {
            this.guiID = 10;
            JRMCoreH.Char((byte)5, (byte)this.diff);
        }
        if (!JRMCoreH.isFused()) {
            for (i3 = 0; i3 < JRMCoreH.PlyrAttrbts.length; ++i3) {
                if (button.id != 110 + i3) continue;
                JRMCoreH.Upg((byte)(i3 + this.mcu * 6));
            }
        }
        for (i3 = 0; i3 < 3; i3 = (int)((byte)(i3 + 1))) {
            if (button.id != 120 + i3) continue;
            this.attCrtPg = i3;
            this.attViwPg = i3;
            this.pgSkls = i3;
        }
        for (i3 = 0; i3 < JRMCoreH.techDBCstatmods.length; i3 = (int)((byte)(i3 + 1))) {
            if (button.id == 130 + i3) {
                JRMCoreH.Tech((byte)0, "ug;;;" + i3);
            }
            if (button.id == 140 + i3) {
                JRMCoreH.Tech((byte)1, "ug;;;" + i3);
            }
            if (button.id == 150 + i3) {
                JRMCoreH.Tech((byte)2, "ug;;;" + i3);
            }
            if (button.id != 160 + i3) continue;
            JRMCoreH.Tech((byte)3, "ug;;;" + i3);
        }
        for (i3 = 0; i3 < 3; i3 = (int)((byte)(i3 + 1))) {
            if (button.id != 190 + i3) continue;
            JRMCoreGuiScreen.sndPly(i3, 0);
        }
        if (button.id == 195) {
            JRMCoreGuiScreen.sndPly(5, 0);
        }
        if (button.id == 196) {
            ptch = ((JRMCoreGuiSlider00)button).sliderValue;
            JRMCoreGuiScreen.sndPly(0, 1);
        }
        if (button.id == 197) {
            JRMCoreH.Char((byte)6, (byte)(ptch * 100.0f));
        }
        if (button.id == 198) {
            String url = urlToOpen.substring(urlToOpen.indexOf("http"));
            this.urlOpenWithConfirm(url);
        }
        if (button.id == 199) {
            try {
                String url = "http://main.jingames.net";
                Desktop.getDesktop().browse(URI.create(url));
            }
            catch (IOException e) {
                mod_JRMCore.logger.error(e.getMessage());
            }
        }
        if (button.id == -200) {
            this.guiID = 16;
        }
        for (i2 = 0; i2 < 4; i2 = (byte)(i2 + 1)) {
            int idFrom;
            if (button.id == 200 + i2) {
                this.guiID = this.attViwPg == 0 ? 13 : 15;
                EnAttNum = i2;
            }
            if (button.id == 240 + i2) {
                idFrom = i2 + this.attViwPg * 4;
                int idTo = idFrom == this.attViwPg * 4 ? (this.attViwPg + 1) * 4 - 1 : idFrom - 1;
                JRMCoreH.Tech((byte)(i2 + this.attViwPg * 4), "up;;;");
                JRMCoreH.jrmct(-1);
                JRMCoreH.swapCD((byte)idFrom, (byte)idTo);
            }
            if (button.id == 244 + i2) {
                int techID = i2 + this.attViwPg * 4;
                JRMCoreH.resetCD((byte)techID);
                JRMCoreH.Tech((byte)techID, " ");
                JRMCoreH.jrmct(-1);
            }
            if (button.id == 248 + i2) {
                idFrom = i2 + this.attViwPg * 4;
                int idTo = idFrom == (this.attViwPg + 1) * 4 - 1 ? this.attViwPg * 4 : idFrom + 1;
                JRMCoreH.Tech((byte)(i2 + this.attViwPg * 4), "dn;;;");
                JRMCoreH.jrmct(-1);
                JRMCoreH.swapCD((byte)idFrom, (byte)idTo);
            }
            if (button.id != 252 + i2) continue;
            JRMCoreH.Tech((byte)(i2 + this.attViwPg * 4), "te;;;");
            JRMCoreH.jrmct(-1);
        }
        if (button.id == 210) {
            JRMCoreH.Tech(EnAttNum, name + ";" + techCrt[1] + ";" + owner + ";" + techCrt[3] + ";" + techCrt[4] + ";" + techCrt[5] / (techCrt[3] == 6 ? 5 : 1) + ";" + techCrt[6] + ";" + techCrt[7] + ";" + techCrt[8] + ";" + techCrt[9] + ";" + techCrt[10] + ";" + techCrt[11] + ";" + techCrt[12] + ";" + techCrt[13] + ";" + techCrt[14]);
            JRMCoreH.jrmct(-1);
            this.guiID = 12;
        }
        for (i2 = 0; i2 < 15; i2 = (byte)(i2 + 1)) {
            if (button.id == -220 - i2 || button.id == 220 + i2) {
                JRMCoreGuiScreen.EnAt(i2, button.id, 1);
                if (i2 == 3 && this.pwr == 1) {
                    this.inputField.setText(JRMCoreH2.kiAttNamGen() + " " + JRMCoreH.trl("dbc", JRMCoreH.techDBCTypes[techCrt[3]]));
                }
                if (i2 == 3 && this.pwr == 2) {
                    this.inputField.setText(JRMCoreH2.kiAttNamGen() + " " + JRMCoreH.trl("nc", JRMCoreH.techNCTypes[techCrt[3]]));
                }
            }
            if (button.id == -260 - i2 || button.id == 260 + i2) {
                JRMCoreGuiScreen.EnAt(i2, button.id, 5);
            }
            if (button.id != -280 - i2 && button.id != 280 + i2) continue;
            JRMCoreGuiScreen.EnAt(i2, button.id, 100);
        }
        if (!JRMCoreH.isFused()) {
            for (i2 = 0; i2 < JRMCoreH.PlyrSkills.length; i2 = (byte)(i2 + 1)) {
                if (button.id != 300 + i2) continue;
                JRMCoreH.Skll((byte)2, i2);
                JRMCoreH.jrmct(3);
            }
            for (i2 = 0; i2 < JRMCoreH.PlyrSkills.length; i2 = (byte)(i2 + 1)) {
                if (button.id != 330 + i2) continue;
                JRMCoreH.Skll((byte)3, i2);
                JRMCoreH.jrmct(3);
            }
            for (i2 = 0; i2 < JRMCoreH.PlyrSkills.length; i2 = (byte)((byte)(i2 + 1))) {
                if (button.id != 360 + i2) continue;
                this.confirmationWindow = true;
                this.IDtoProcessConfirmFor = i2;
            }
            if (button.id == 399) {
                this.confirmationWindow = false;
            }
            if (button.id == 390) {
                JRMCoreH.Skll((byte)3, (byte)100);
                JRMCoreH.jrmct(3);
            }
            if (button.id == 391) {
                JRMCoreH.Skll((byte)3, (byte)101);
                JRMCoreH.jrmct(3);
            }
        }
        if (button.id == 392) {
            this.guiID = 19;
        }
        for (i2 = 0; i2 < 10; i2 = (byte)((byte)(i2 + 1))) {
            if (button.id == 1000 + i2) {
                this.smd = i2;
            }
            if (button.id != -1000 - i2) continue;
            this.smd = i2;
            JRMCoreH.quad(2, i2, 0, 0);
        }
        for (i2 = 0; i2 < 10; i2 = (byte)((byte)(i2 + 1))) {
            if (button.id == -2010 - i2) {
                JRMCoreH.quad(3, 7, i2, 0);
                this.inv = 0;
            }
            if (button.id != -2000 - i2) continue;
            JRMCoreH.quad(3, 8, i2, 0);
            this.inv = 0;
        }
        for (i2 = 0; i2 < (JRMCoreH.plyrs != null ? JRMCoreH.plyrs.length : (byte)10); ++i2) {
            if (button.id != 2000 + i2) continue;
            int i23 = i2 / 100;
            int i33 = i2 - i23 * 100;
            JRMCoreH.quad(3, 6, i23, i33);
            this.inv = 0;
        }
        if (button.id == 3199 && JRMCoreConfig.ssurl2.contains("ttp:/")) {
            try {
                String url = JRMCoreConfig.ssurl2;
                Desktop.getDesktop().browse(URI.create(url));
            }
            catch (IOException e) {
                mod_JRMCore.logger.error(e.getMessage());
            }
        }
        for (int i11 = 0; i11 < this.sscl; i11 = (int)((byte)(i11 + 1))) {
            if (button.id == 3000 + i11) {
                this.ss = i11;
                this.ssb = true;
            }
            if (button.id != 3200 + i11) continue;
            this.ss = i11;
            this.ssb = false;
        }
        if (button.id == 3099) {
            this.guiID = 80;
            JRMCoreH.jrmcDataFC(80, "q");
        }
        if (button.id == 3098) {
            JRMCoreEH.aw = true;
            this.kdf = 0;
        }
        if (button.id == 3097) {
            boolean bl = JRMCoreEH.gk = !JRMCoreEH.gk;
        }
        if (button.id == 3096) {
            String url = "http://dbcserver1710.jingames.net";
            this.urlOpenWithConfirm(url);
        }
        if (button.id == 3100) {
            if (this.ssb) {
                JRMCoreH.jrmcDataFC(80, "r" + this.ss);
                this.sscl = 0;
            }
            JRMCoreGuiScreen.mc.thePlayer.closeScreen();
        }
        for (i = 0; i < (JRMCoreH.Pwrtyp == 2 ? JRMCoreH.NCSkillNames : JRMCoreH.DBCSkillNames).length; i = (byte)(i + 1)) {
            if (button.id != 4000 + i) continue;
            JRMCoreH.Skll((byte)1, i);
            this.guiID = 11;
            this.ipg = 0;
        }
        for (i = 0; i < (JRMCoreH.Pwrtyp == 2 ? JRMCoreH.pmj : JRMCoreH.pmdbc).length; i = (byte)(i + 1)) {
            if (button.id != 4200 + i) continue;
            JRMCoreH.Tech((byte)(EnAttNum + 4), "" + i);
            this.guiID = 12;
            this.attViwPg = 1;
            this.ipg = 0;
        }
        if (button instanceof JRMCoreGuiButtons00MS && button.id == 6000) {
            JRMCoreGuiButtons00MS btn = (JRMCoreGuiButtons00MS)button;
            if (btn.d2.equals("-1")) {
                JRMCoreGuiScreen.mc.thePlayer.closeScreen();
            }
            JRMCoreGuiScreen.dataSend(btn.d1, btn.d2);
        }
        if (button instanceof JRMCoreGuiButtons01MS && button.id == 6001) {
            JRMCoreGuiButtons01MS btn = (JRMCoreGuiButtons01MS)button;
            this.SideMsn = btn.d1;
        }
        if (button.id == 6002) {
            this.SideMsn = "";
        }
        if (JRMCoreH.SAOC()) {
            JRMCoreHSAC.actionPerformed(button);
        }
        this.nuller();
    }

    public static String[] cl() {
        return JRMCoreH.cl(PwrtypSlcted);
    }

    public static String[] clDesc(int pwr) {
        String[] cl = JRMCoreH.PwrtypAllow[pwr].contains("DBC") ? JRMCoreH.ClassesDBCDesc : (JRMCoreH.PwrtypAllow[pwr].contains("NC") ? JRMCoreH.ClansDesc : JRMCoreH.ClassesDesc);
        return cl;
    }

    public static String[] clDesc() {
        return JRMCoreGuiScreen.clDesc(PwrtypSlcted);
    }

    public static void sndPly(int b, int t) {
        String snd = "";
        String snd2 = "";
        if (t == 0) {
            b += 12;
            int[] crt = new int[techCrt.length];
            for (int i = 0; i < techCrt.length; ++i) {
                crt[i] = techCrt[i];
            }
            if (JRMCoreH.Pwrtyp == 1) {
                if (crt[3] == 0 || crt[3] == 1 || crt[3] == 5 || crt[3] == 4 || crt[3] == 6 || crt[3] == 7 || crt[3] == 8) {
                    if (b == 12) {
                        snd = JRMCoreH.techSndIncBeam[crt[12]];
                    }
                    if (b == 13) {
                        snd = JRMCoreH.techSndFireBeam[crt[13]];
                    }
                    if (b == 14) {
                        snd = JRMCoreH.techSndMoveBeam[crt[14]];
                    }
                }
                if (crt[3] == 2) {
                    if (b == 12) {
                        snd = JRMCoreH.techSndIncDisk[crt[12]];
                    }
                    if (b == 13) {
                        snd = JRMCoreH.techSndFireDisk[crt[13]];
                    }
                    if (b == 14) {
                        snd = JRMCoreH.techSndMoveDisk[crt[14]];
                    }
                }
                if (crt[3] == 3 && b == 13) {
                    snd = JRMCoreH.techSndFireLeser[crt[13]];
                }
                JRMCoreClient.mc.thePlayer.playSound("jinryuudragonbc:DBC4." + snd, 1.0f, 1.0f);
            } else if (JRMCoreH.Pwrtyp == 2) {
                if (crt[11] == 1) {
                    if (JRMCoreH.techNCSndIncAff.length > crt[6]) {
                        snd = JRMCoreH.techNCSndIncAff[crt[6]];
                    }
                    if (JRMCoreH.techNCSndIncTyp.length > crt[3]) {
                        snd2 = JRMCoreH.techNCSndIncTyp[crt[3]];
                    }
                }
                if (crt[11] == 2 && JRMCoreH.techNCSndIncCls.length > crt[11]) {
                    snd2 = JRMCoreH.techNCSndIncCls[crt[11]];
                }
                if (crt[11] == 4) {
                    if (JRMCoreH.techNCSndIncAff.length > crt[6]) {
                        snd = JRMCoreH.techNCSndIncAff[crt[6]];
                    }
                    if (JRMCoreH.techNCSndIncCls.length > crt[11]) {
                        snd2 = JRMCoreH.techNCSndIncCls[crt[11]];
                    }
                }
                float p = JRMCoreH.PtchVc == 0 ? 1.0f : 0.8f + 0.006f * (float)JRMCoreH.PtchVc;
                JRMCoreClient.mc.thePlayer.playSound("jinryuunarutoc:NC2." + snd, 1.0f, p);
                JRMCoreClient.mc.thePlayer.playSound("jinryuunarutoc:NC2." + snd2, 1.0f, p);
            }
        } else if (t == 1 && JRMCoreH.Pwrtyp == 2) {
            Random r = new Random();
            int ir = r.nextInt(JRMCoreH.techNCSndIncAff.length);
            snd = JRMCoreH.techNCSndIncAff[ir];
            float p = 0.8f + 0.6f * ptch;
            JRMCoreClient.mc.thePlayer.playSound("jinryuunarutoc:NC2." + snd, 1.0f, p);
        }
    }

    public void nuller() {
        JRMCoreH.ask = null;
        JRMCoreH.targ = null;
        if (this.guiID != this.guiIDprev3) {
            this.guiIDprev3 = this.guiID;
            JRMCoreGuiSliderX00.sliderValue = 0.0f;
            this.scroll = 0;
            scrollSide = 0.0f;
        }
    }

    public void player() {
    }

    public static void EnAt(byte b, int n, int t) {
        int[] techUpg;
        int[] techMax;
        int[] techMin;
        boolean chkr;
        boolean bl = chkr = JRMCoreH.Pwrtyp == 2;
        if (chkr) {
            techMin = JRMCoreH.techNCMin;
            techMax = JRMCoreH.techNCMax;
            techUpg = JRMCoreH.techNCUpg;
        } else {
            techMin = JRMCoreH.techMin;
            techMax = JRMCoreH.techMax;
            techUpg = JRMCoreH.techUpg;
        }
        if (b > 2 && (chkr || b != 7)) {
            int[] crt = new int[techCrt.length];
            for (int i = 0; i < techCrt.length; ++i) {
                crt[i] = techCrt[i];
            }
            crt[b] = crt[b] + (n > 0 ? techUpg[b] * t : -techUpg[b] * t);
            if (b < 12) {
                if (crt[b] > techMax[b]) {
                    crt[b] = techMax[b];
                } else if (crt[b] < techMin[b]) {
                    crt[b] = techMin[b];
                }
                if (crt[3] != techCrt[3]) {
                    crt[12] = 0;
                    crt[13] = 0;
                    crt[14] = 0;
                }
                if (b == 3 && (crt[b] == 7 || crt[b] == 8)) {
                    crt[4] = 1;
                }
            } else {
                if (crt[3] == 0 || crt[3] == 1 || crt[3] == 5 || crt[3] == 4 || crt[3] == 6 || crt[3] == 7 || crt[3] == 8) {
                    if (b == 12) {
                        if (crt[b] > JRMCoreH.techSndIncBeam.length - 1) {
                            crt[b] = JRMCoreH.techSndIncBeam.length - 1;
                        } else if (crt[b] < techMin[b]) {
                            crt[b] = techMin[b];
                        }
                    }
                    if (b == 13) {
                        if (crt[b] > JRMCoreH.techSndFireBeam.length - 1) {
                            crt[b] = JRMCoreH.techSndFireBeam.length - 1;
                        } else if (crt[b] < techMin[b]) {
                            crt[b] = techMin[b];
                        }
                    }
                    if (b == 14) {
                        if (crt[b] > JRMCoreH.techSndMoveBeam.length - 1) {
                            crt[b] = JRMCoreH.techSndMoveBeam.length - 1;
                        } else if (crt[b] < techMin[b]) {
                            crt[b] = techMin[b];
                        }
                    }
                }
                if (crt[3] == 2) {
                    if (b == 12) {
                        if (crt[b] > JRMCoreH.techSndIncDisk.length - 1) {
                            crt[b] = JRMCoreH.techSndIncDisk.length - 1;
                        } else if (crt[b] < techMin[b]) {
                            crt[b] = techMin[b];
                        }
                    }
                    if (b == 13) {
                        if (crt[b] > JRMCoreH.techSndFireDisk.length - 1) {
                            crt[b] = JRMCoreH.techSndFireDisk.length - 1;
                        } else if (crt[b] < techMin[b]) {
                            crt[b] = techMin[b];
                        }
                    }
                    if (b == 14) {
                        if (crt[b] > JRMCoreH.techSndMoveDisk.length - 1) {
                            crt[b] = JRMCoreH.techSndMoveDisk.length - 1;
                        } else if (crt[b] < techMin[b]) {
                            crt[b] = techMin[b];
                        }
                    }
                }
                if (crt[3] == 3) {
                    if (b == 12) {
                        if (crt[b] > 0) {
                            crt[b] = 0;
                        } else if (crt[b] < techMin[b]) {
                            crt[b] = techMin[b];
                        }
                    }
                    if (b == 13) {
                        if (crt[b] > JRMCoreH.techSndFireLeser.length - 1) {
                            crt[b] = JRMCoreH.techSndFireLeser.length - 1;
                        } else if (crt[b] < techMin[b]) {
                            crt[b] = techMin[b];
                        }
                    }
                    if (b == 14) {
                        if (crt[b] > 0) {
                            crt[b] = 0;
                        } else if (crt[b] < techMin[b]) {
                            crt[b] = techMin[b];
                        }
                    }
                }
            }
            techCrt = crt;
        }
    }

    public static void setchangebodycol() {
        int[][] pres = JRMCoreH.defbodycols[BodyColPresetSlcted];
        BodyColMainSlcted = pres[RaceSlcted].length > 0 ? pres[RaceSlcted][0] : 0;
        BodyColSub1Slcted = pres[RaceSlcted].length > 1 ? pres[RaceSlcted][1] : 0;
        BodyColSub2Slcted = pres[RaceSlcted].length > 2 ? pres[RaceSlcted][2] : 0;
        BodyColSub3Slcted = pres[RaceSlcted].length > 3 ? pres[RaceSlcted][3] : 0;
    }

    public static void setchangeeyecol() {
        int[] preseyes = JRMCoreH.defeyecols[EyeColPresetSlcted];
        EyeCol1Slcted = preseyes[RaceSlcted];
        EyeCol2Slcted = preseyes[RaceSlcted];
    }

    public static void setchangerace() {
        GenderSlcted = JRMCoreH.RaceGenders[RaceSlcted] == 1 ? 0 : GenderSlcted;
        StateSlcted = RaceSlcted == 4 ? 4 : 0;
        int bt = JRMCoreH.customSknLimits[RaceSlcted][0];
        BodyTypeSlcted = BodyTypeSlcted > bt - 1 ? bt - 1 : BodyTypeSlcted;
        JRMCoreGuiScreen.setchangebodycol();
        bt = JRMCoreH.customSknLimits[RaceSlcted][2];
        FaceNoseSlcted = FaceNoseSlcted > bt - 1 ? bt - 1 : FaceNoseSlcted;
        bt = JRMCoreH.customSknLimits[RaceSlcted][3];
        FaceMouthSlcted = FaceMouthSlcted > bt - 1 ? bt - 1 : FaceMouthSlcted;
        bt = JRMCoreH.customSknLimits[RaceSlcted][4];
        EyesSlcted = EyesSlcted > bt - 1 ? bt - 1 : EyesSlcted;
        JRMCoreGuiScreen.setchangeeyecol();
        JRMCoreGuiScreen.setdns();
    }

    public static void csau_d() {
        String dnsau = JRMCoreH.data(JRMCoreClient.mc.thePlayer.getCommandSenderName(), 16, "");
        dnsau = dnsau.contains(";") ? dnsau.substring(1) : dnsau;
        BodyauColMainSlcted = JRMCoreH.dnsauCM(dnsau);
        BodyauColSub1Slcted = JRMCoreH.dnsauC1(dnsau);
        BodyauColSub2Slcted = JRMCoreH.dnsauC2(dnsau);
        BodyauColSub3Slcted = JRMCoreH.dnsauC3(dnsau);
    }

    public static void csau_df() {
        BodyauColMainSlcted = 14208118;
        BodyauColSub1Slcted = 10317733;
        BodyauColSub2Slcted = 6966676;
        BodyauColSub3Slcted = 11045420;
    }

    public static void setdnsau() {
        String BCM = JRMCoreGuiScreen.ntl5(BodyauColMainSlcted);
        String BC1 = JRMCoreGuiScreen.ntl5(BodyauColSub1Slcted);
        String BC2 = JRMCoreGuiScreen.ntl5(BodyauColSub2Slcted);
        String BC3 = JRMCoreGuiScreen.ntl5(BodyauColSub3Slcted);
        dnsau = BCM + BC1 + BC2 + BC3;
    }

    public static void setdns() {
        int n = GenderSlcted > 9 ? 9 : (GenderSlcted = GenderSlcted < 0 ? 0 : GenderSlcted);
        int n2 = BreastSizeSlcted > 9 ? 9 : (BreastSizeSlcted = BreastSizeSlcted < 0 ? 0 : BreastSizeSlcted);
        SkinTypeSlcted = SkinTypeSlcted > 9 ? 9 : (SkinTypeSlcted < 0 ? 0 : SkinTypeSlcted);
        String R = JRMCoreGuiScreen.ntl(RaceSlcted);
        String G = GenderSlcted + "";
        String H1 = JRMCoreGuiScreen.ntl(HairSlcted);
        String H2 = JRMCoreGuiScreen.ntl(Hair2Slcted);
        String HC = JRMCoreGuiScreen.ntl5(ColorSlcted);
        String BS = BreastSizeSlcted + "";
        String ST = SkinTypeSlcted + "";
        String BT = JRMCoreGuiScreen.ntl(BodyTypeSlcted);
        String BCM = JRMCoreGuiScreen.ntl5(BodyColMainSlcted);
        String BC1 = JRMCoreGuiScreen.ntl5(BodyColSub1Slcted);
        String BC2 = JRMCoreGuiScreen.ntl5(BodyColSub2Slcted);
        String BC3 = JRMCoreGuiScreen.ntl5(BodyColSub3Slcted);
        String FN = JRMCoreGuiScreen.ntl(FaceNoseSlcted);
        String FM = JRMCoreGuiScreen.ntl(FaceMouthSlcted);
        String ET = JRMCoreGuiScreen.ntl(EyesSlcted);
        String EC1 = JRMCoreGuiScreen.ntl5(EyeCol1Slcted);
        String EC2 = JRMCoreGuiScreen.ntl5(EyeCol2Slcted);
        dns = SkinTypeSlcted == 0 ? R + G + H1 + H2 + HC + BS + ST + BC1 : R + G + H1 + H2 + HC + BS + ST + BT + BCM + BC1 + BC2 + BC3 + FN + FM + ET + EC1 + EC2;
    }

    public static void setdnsForHair() {
        dns = JRMCoreH.dnsHairBSet(dns, HairSlcted);
        dns = JRMCoreH.dnsHairFSet(dns, Hair2Slcted);
        dns = JRMCoreH.dnsHairCSet(dns, ColorSlcted);
    }

    public static void HairCstmNextPreset() {
        int selct = HairPrstsSlcted + 1;
        HairPrstsSlcted = selct < PresetList.size() ? selct : 0;
        dnsH = PresetList.get(HairPrstsSlcted);
    }

    public static void HairCstmPrevPreset() {
        int selct = HairPrstsSlcted - 1;
        HairPrstsSlcted = selct >= 0 ? selct : PresetList.size() - 1;
        dnsH = PresetList.get(HairPrstsSlcted);
    }

    public static void HairCstmSaveAsPreset() {
        String s = JRMCoreH.rld("HairPresets", "jinryuujrmcore.dat");
        List<String> stooges = Arrays.asList(new String[0]);
        if (s.length() > 3) {
            stooges = Arrays.asList(s.split(","));
        }
        ArrayList<String> saves = new ArrayList<String>(stooges);
        ArrayList<String> defpres = new ArrayList<String>();
        ArrayList<String> presets = new ArrayList<String>();
        for (String def : JRMCoreH.defHairPrsts) {
            defpres.add(def);
        }
        saves.add(dnsH);
        saves.removeAll(defpres);
        String listString = "";
        for (String strng : saves) {
            listString = listString + "," + strng;
        }
        if (listString.length() > 2) {
            listString = listString.substring(1);
        }
        presets.addAll(defpres);
        presets.addAll(saves);
        PresetList = presets;
        dnsH = PresetList.get(PresetList.size() - 1);
        JRMCoreH.wld(listString, "HairPresets", "jinryuujrmcore.dat", false);
        HairPrstsSlcted = PresetList.size() - 1;
        dnsH = PresetList.get(HairPrstsSlcted);
    }

    public static void HairCstmDelPreset() {
        if (HairPrstsSlcted > JRMCoreH.defHairPrsts.length - 1) {
            String s = JRMCoreH.rld("HairPresets", "jinryuujrmcore.dat");
            List<String> stooges = Arrays.asList(new String[0]);
            if (s.length() > 3) {
                stooges = Arrays.asList(s.split(","));
            }
            ArrayList<String> saves = new ArrayList<String>(stooges);
            ArrayList<String> defpres = new ArrayList<String>();
            ArrayList<String> presets = new ArrayList<String>();
            for (String def : JRMCoreH.defHairPrsts) {
                defpres.add(def);
            }
            if (saves.size() > HairPrstsSlcted - JRMCoreH.defHairPrsts.length) {
                saves.remove(HairPrstsSlcted - JRMCoreH.defHairPrsts.length);
            }
            String listString = "";
            for (String strng : saves) {
                listString = listString + "," + strng;
            }
            if (listString.length() > 2) {
                listString = listString.substring(1);
            }
            presets.addAll(defpres);
            presets.addAll(saves);
            PresetList = presets;
            JRMCoreH.wld(listString, "HairPresets", "jinryuujrmcore.dat", false);
            dnsH = PresetList.get(--HairPrstsSlcted);
        }
    }

    public static void HairCstmResetPreset() {
        dnsH = PresetList.get(HairPrstsSlcted);
    }

    public static void StateViewF() {
        StateSlcted = RaceSlcted == JRMCoreH.RACES ? (++StateSlcted > JRMCoreH.RACES + 1 ? 0 : StateSlcted) : 0;
    }

    public static void StateViewB() {
        StateSlcted = RaceSlcted == JRMCoreH.RACES ? (--StateSlcted < 0 ? JRMCoreH.RACES + 1 : StateSlcted) : 0;
    }

    public static void RaceSlctF() {
        int selct;
        if (JRMCoreH.isRaceArcosian(RaceSlcted) && !JGConfigRaces.CONFIG_MAJIN_ENABLED) {
            RaceSlcted = 5;
        }
        for (selct = 1; selct < JRMCoreH.Races.length; ++selct) {
            if (RaceSlcted >= selct || (!JRMCoreH.RaceAllow[selct].contains("DBC") || !JRMCoreH.DBC()) && (!JRMCoreH.RaceAllow[selct].contains("HHC") || !JRMCoreH.HHC())) continue;
            RaceSlcted = selct;
            return;
        }
        selct = 0;
        if (RaceSlcted > selct || JRMCoreH.isRaceMajin(RaceSlcted) && !JGConfigRaces.CONFIG_MAJIN_ENABLED) {
            RaceSlcted = selct;
            return;
        }
    }

    public static void RaceSlctB() {
        int selct;
        if (JRMCoreH.isRaceHuman(RaceSlcted) && !JGConfigRaces.CONFIG_MAJIN_ENABLED) {
            RaceSlcted = 5;
        }
        for (selct = JRMCoreH.Races.length - 1; selct >= 0; --selct) {
            if (RaceSlcted <= selct || !JRMCoreH.Allow(JRMCoreH.RaceAllow[selct])) continue;
            RaceSlcted = selct;
            return;
        }
        for (selct = JRMCoreH.Races.length - 1; selct >= 0; --selct) {
            if (RaceSlcted >= selct || !JRMCoreH.Allow(JRMCoreH.RaceAllow[selct])) continue;
            RaceSlcted = selct;
            return;
        }
    }

    public static void GenderSlctF() {
        int selct = GenderSlcted + 1;
        GenderSlcted = selct < JRMCoreH.Genders.length && JRMCoreH.Allow(JRMCoreH.GenderAllow[selct]) ? selct : 0;
    }

    public static void YearsSlctF() {
        int selct = YearsSlcted + 1;
        YearsSlcted = selct < JRMCoreH.YearsD.length ? selct : 0;
    }

    public static void YearsSlctB() {
        int selct = YearsSlcted - 1;
        YearsSlcted = selct >= 0 ? selct : JRMCoreH.YearsD.length - 1;
    }

    public static void HairSlctF() {
        int selct = HairSlcted + 1;
        HairSlcted = selct < JRMCoreH.Hairs.length ? selct : (JRMCoreH.isRaceMajin(RaceSlcted) ? 10 : 0);
    }

    public static void HairSlctB() {
        int selct = HairSlcted - 1;
        HairSlcted = selct >= 0 ? selct : JRMCoreH.Hairs.length - 1;
    }

    public static void Hair2SlctF() {
        int selct = Hair2Slcted + 1;
        Hair2Slcted = selct < JRMCoreH.Hairs2.length ? selct : 0;
    }

    public static void Hair2SlctB() {
        int selct = Hair2Slcted - 1;
        Hair2Slcted = selct >= 0 ? selct : JRMCoreH.Hairs2.length - 1;
    }

    public static int SlctF(int s, int l) {
        int selct = s + 1;
        if (selct < l) {
            return selct;
        }
        return 0;
    }

    public static int SlctB(int s, int l) {
        int selct = s - 1;
        if (selct >= 0) {
            return selct;
        }
        return l - 1;
    }

    public static int Slct(String dir, int Select, String[] allow) {
        if (dir.contains("B")) {
            int selct = Select - 1;
            boolean loop = true;
            while (loop) {
                if (JRMCoreH.RaceCanHavePwr[RaceSlcted].contains("" + selct) && selct < allow.length && JRMCoreH.Allow(allow[selct])) {
                    Select = selct;
                    loop = false;
                    break;
                }
                if (--selct > 0) continue;
                selct = allow.length - 1;
            }
        } else {
            int selct = Select + 1;
            boolean loop = true;
            while (loop) {
                if (JRMCoreH.RaceCanHavePwr[RaceSlcted].contains("" + selct) && selct < allow.length && JRMCoreH.Allow(allow[selct])) {
                    Select = selct;
                    loop = false;
                    break;
                }
                if (++selct < allow.length) continue;
                selct = 0;
            }
        }
        return Select;
    }

    public static int Slct2(String dir, int Select, String[] allow, int allowsel, String[] cur) {
        int selct;
        Select = dir.contains("B") ? ((selct = Select - 1) >= 0 && JRMCoreH.Allow(allow[allowsel]) ? selct : cur.length - 1) : ((selct = Select + 1) < cur.length && JRMCoreH.Allow(allow[allowsel]) ? selct : 0);
        return Select;
    }

    public static int SlctCol(String dir, int Select, String[] allow) {
        int selct;
        Select = dir.contains("B") ? ((selct = Select - 1) >= 0 ? selct : allow.length - 1) : ((selct = Select + 1) < allow.length ? selct : 0);
        return Select;
    }

    public static int SlctSpec(String dir, int Select, int[] allow) {
        if (dir.contains("B")) {
            int selct = Select - 1;
            int max = allow[RaceSlcted];
            Select = selct >= 0 ? selct : max - 1;
        } else {
            int selct = Select + 1;
            int max = allow[RaceSlcted];
            Select = selct < max ? selct : 0;
        }
        return Select;
    }

    /*
     * Opcode count of 28530 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    public void drawScreen(int x, int y, float f) {
        int WIL;
        int guiLeft;
        int ySize;
        int xSize;
        int sw;
        ResourceLocation guiLocation;
        int guiTop;
        int guiLeft2;
        int ySize2;
        int xSize2;
        int ar = 2000;
        if (this.kdf < ar) {
            ++this.kdf;
        }
        if (Mouse.isButtonDown((int)0)) {
            this.mousePressed = true;
            scrollSide = JRMCoreGuiSliderX00.sliderValue;
        } else {
            this.mousePressed = false;
            while (Mouse.next()) {
                int mw = Mouse.getEventDWheel();
                if (mw == 0) continue;
                if (mw < 0) {
                    this.scroll += this.scrollMouseJump;
                } else if (mw > 0 && this.scroll > 0) {
                    this.scroll -= this.scrollMouseJump;
                }
                this.scrollMouseJump = 1;
            }
        }
        if (JRMCoreH.Accepted == 0 && this.guiID == 10) {
            this.guiID = 0;
        }
        this.x = x;
        this.y = y;
        if (this.guiID == 31 && JRMCoreH.Accepted != 2) {
            this.guiID = 30;
        }
        if (this.guiIDprev2 != 0) {
            this.guiID = this.guiIDprev2;
            this.guiIDprev2 = 0;
        }
        if (dns.length() > 1 && !dns.equals(dnsSent)) {
            dnsSent = dns;
            if (JRMCoreH.JFC() && ItemBarberSnC.barberTarget != null) {
                if (JRMCoreHJFC.isChildNPC(ItemBarberSnC.barberTarget)) {
                    JRMCoreHJFC.childDNSset(ItemBarberSnC.barberTarget, dnsSent);
                }
            } else {
                JRMCoreH.jrmcDataFC(0, dnsSent);
            }
        }
        if (dnsH.length() != 786 && !dnsH.equals(dnsHSent)) {
            dnsH = JRMCoreH.dnsHairG1toG2(dnsH);
        }
        if (dnsH.length() == 786 && !dnsH.equals(dnsHSent)) {
            dnsHSent = dnsH;
            if (JRMCoreH.JFC() && ItemBarberSnC.barberTarget != null) {
                if (JRMCoreHJFC.isChildNPC(ItemBarberSnC.barberTarget)) {
                    JRMCoreHJFC.childDNSHset(ItemBarberSnC.barberTarget, dnsHSent);
                }
            } else {
                JRMCoreH.jrmcDataFC(1, dnsHSent);
            }
        }
        if (dnsH.length() < 3) {
            if (JRMCoreH.JFC() && ItemBarberSnC.barberTarget != null) {
                if (JRMCoreHJFC.isChildNPC(ItemBarberSnC.barberTarget)) {
                    dnsH = JRMCoreHJFC.childDNSH(ItemBarberSnC.barberTarget);
                }
            } else {
                dnsH = JRMCoreH.dnsH;
            }
        }
        if (dns.length() < 3) {
            if (JRMCoreH.JFC() && ItemBarberSnC.barberTarget != null) {
                if (JRMCoreHJFC.isChildNPC(ItemBarberSnC.barberTarget)) {
                    dns = JRMCoreHJFC.childDNS(ItemBarberSnC.barberTarget);
                }
            } else {
                dns = JRMCoreH.dns;
            }
        }
        this.xSize_lo = x;
        this.ySize_lo = y;
        ScaledResolution var5 = new ScaledResolution(mc, JRMCoreGuiScreen.mc.displayWidth, JRMCoreGuiScreen.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = JRMCoreGuiScreen.mc.fontRenderer;
        this.buttonList.clear();
        if (++tick >= 20) {
            tick = 0;
            JRMCoreH.jrmct(1);
            JRMCoreH.jrmct(3);
        }
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        int posX = this.width / 2;
        int posY = this.height / 2;
        this.pwr = JRMCoreH.Pwrtyp;
        if (this.isGUIOpen(80)) {
            xSize2 = 256;
            ySize2 = 159;
            guiLeft2 = (this.width - xSize2) / 2;
            guiTop = (this.height - ySize2) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            guiLocation = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation);
            this.drawTexturedModalRect(guiLeft2, guiTop, 0, 0, xSize2, ySize2);
            this.buttonList.add(new JRMCoreGuiButtons00(100, guiLeft2 + xSize2 / 2 - 150, guiTop + ySize2 / 2 + 65, 20, 20, "X", 0));
            int curtp = JRMCoreH.curTP;
            int cursp = JRMCoreH.ServerPoints;
            int l = 0;
            String ssc = JRMCoreConfig.ssc;
            if (ssc.contains("http://")) {
                String string = JRMCoreGuiScreen.ssc.length() > 0 ? JRMCoreGuiScreen.ssc : (JRMCoreGuiScreen.ssc = JRMCoreH.turihr(JRMCoreConfig.ssc));
                ssc = string;
            }
            String[] s1 = ssc.split(";");
            String[] sn = new String[s1.length];
            int[] sc = new int[s1.length];
            for (int i = 0; i < s1.length; ++i) {
                if (!s1[i].contains("=")) continue;
                String[] s2 = s1[i].split("=");
                sn[i] = s2[0];
                sc[i] = Integer.parseInt(s2[1]);
            }
            this.sscl = s1.length;
            String s = "Click here to donate for points";
            int sw2 = this.fontRendererObj.getStringWidth(s);
            this.buttonList.add(new JRMCoreGuiButtons00(3199, guiLeft2 + 5 + 1, guiTop + 162, sw2 + 8, 20, s, JRMCoreH.techNCCol[0]));
            s = "Server Points";
            sw2 = this.fontRendererObj.getStringWidth(s);
            var8.drawString(s + ": \u00a78" + cursp + "P", guiLeft2 + 5, guiTop + 5 + l * 8, 0);
            ++l;
            s = "Point Cost";
            sw2 = this.fontRendererObj.getStringWidth(s);
            if (this.ss >= 0) {
                var8.drawString(s + ": \u00a78" + sc[this.ss] + "P", guiLeft2 + 5, guiTop + 5 + l * 8, 0);
                ++l;
            }
            if (ssc.equals("loading")) {
                s = "LOADING";
                sw2 = this.fontRendererObj.getStringWidth(s);
                var8.drawString("LOADING", guiLeft2 + 250 - sw2, guiTop + 5, 0);
            } else if (ssc.equals("error")) {
                s = "CONNECTION ERROR";
                sw2 = this.fontRendererObj.getStringWidth(s);
                var8.drawString("CONNECTION ERROR", guiLeft2 + 250 - sw2, guiTop + 5, 0);
            } else if (ssc.contains("=")) {
                int ppr;
                if (this.ss >= 0 && sn[this.ss].startsWith("TP")) {
                    int ptpr = Integer.parseInt(sn[this.ss].substring(2)) + curtp;
                    int ppr2 = cursp - sc[this.ss];
                    int n = ptpr = ptpr > JRMCoreH.getMaxTP() ? JRMCoreH.getMaxTP() : ptpr;
                    if (ptpr <= JRMCoreH.getMaxTP() && ppr2 >= 0) {
                        s = "Point Result";
                        sw2 = this.fontRendererObj.getStringWidth(s);
                        var8.drawString(s + ": \u00a78" + JRMCoreH.numSep(ppr2) + "P", guiLeft2 + 5, guiTop + 5 + l * 8, 0);
                        s = "TP Current";
                        sw2 = this.fontRendererObj.getStringWidth(s);
                        var8.drawString(s + ": \u00a78" + JRMCoreH.numSep(curtp) + "TP", guiLeft2 + 5, guiTop + 5 + ++l * 8, 0);
                        s = "TP Result";
                        sw2 = this.fontRendererObj.getStringWidth(s);
                        var8.drawString(s + ": \u00a78" + JRMCoreH.numSep(ptpr) + "TP", guiLeft2 + 5, guiTop + 5 + ++l * 8, 0);
                        ++l;
                    }
                } else if ((this.ss >= 0 && sn[this.ss].startsWith("IT") || this.ss >= 0 && sn[this.ss].startsWith("CM")) && (ppr = cursp - sc[this.ss]) >= 0) {
                    s = "Point Result";
                    sw2 = this.fontRendererObj.getStringWidth(s);
                    var8.drawString(s + ": \u00a78" + ppr + "P", guiLeft2 + 5, guiTop + 5 + l * 8, 0);
                    ++l;
                }
                if (this.ss >= 0 && sc[this.ss] == 0) {
                    s = JRMCoreH.cldg + "Its for FREE!";
                    sw2 = this.fontRendererObj.getStringWidth(s);
                    var8.drawString(s, guiLeft2 + 5, guiTop + 5 + l * 8, 0);
                    ++l;
                }
                int m = s1.length;
                float m2 = 5.0f;
                int sz = 7;
                this.scrollMouseJump = 2;
                if (m > sz) {
                    if ((float)m - m2 < (float)this.scroll) {
                        this.scroll = (int)((float)m - m2);
                    } else if (this.scroll < 0) {
                        this.scroll = 0;
                    }
                    if (this.mousePressed && !JRMCoreGuiButtonsA1.clicked) {
                        this.scroll = (int)JRMCoreH.round(((float)m - m2) * scrollSide, 0);
                    } else {
                        scrollSide = JRMCoreGuiSliderX00.sliderValue = (float)this.scroll / ((float)m - m2);
                    }
                } else {
                    this.scroll = 0;
                }
                int d = -1;
                for (int i = this.scroll; i < (m > this.scroll + sz ? this.scroll + sz : m); ++i) {
                    ++d;
                    String it = null;
                    String itn = "";
                    String[] ssa = null;
                    if (sn[i].startsWith("IT")) {
                        if (sn[i].contains("||")) {
                            ssa = sn[i].split("\\|\\|");
                            it = ssa[0].substring(2);
                        } else {
                            String n1 = "";
                            int n2 = 1;
                            int n3 = 0;
                            String[] s2 = sn[i].split(",");
                            if (s2.length > 1) {
                                n2 = Integer.parseInt(s2[1]);
                                itn = n2 + " ";
                            }
                            if (s2[0].contains("::")) {
                                String[] s3 = s2[0].split("::");
                                n1 = s3[0].substring(2);
                                n3 = Integer.parseInt(s3[1]);
                            } else {
                                n1 = s2[0].substring(2);
                            }
                            Item item = JRMCoreH.getItemByText(n1);
                            if (item != null) {
                                ItemStack is = new ItemStack(item, 1, n3);
                                it = item.getItemStackDisplayName(is);
                            }
                        }
                    } else if (sn[i].startsWith("TP")) {
                        it = sn[i].substring(2) + "TP";
                    } else if (sn[i].startsWith("CM")) {
                        if (sn[i].contains("||")) {
                            ssa = sn[i].split("\\|\\|");
                            it = ssa[0].substring(2);
                        } else {
                            it = sn[i].split("!")[0].substring(2);
                        }
                    }
                    if (it == null) continue;
                    s = itn + it;
                    sw2 = this.fontRendererObj.getStringWidth(s);
                    if (cursp - sc[i] >= 0) {
                        this.buttonList.add(new JRMCoreGuiButtons00(3000 + i, guiLeft2 + xSize2 / 2 + 110 - sw2, guiTop + (ySize2 + 1) / 2 - 75 + d * 21, sw2 + 8, 20, s, this.ss == i ? 160000 : 100000));
                    } else {
                        this.buttonList.add(new JRMCoreGuiButtons00(3200 + i, guiLeft2 + xSize2 / 2 + 110 - sw2, guiTop + (ySize2 + 1) / 2 - 75 + d * 21, sw2 + 8, 20, s, 0x2F2F2F));
                    }
                    if (ssa == null || this.ss != i) continue;
                    String prev = "";
                    int i22 = 0;
                    for (int i2 = 0; i2 < ssa.length; ++i2) {
                        String nam = ssa[i2];
                        if (i2 > 0) {
                            if (sn[i].startsWith("IT")) {
                                String n1 = "";
                                int n2 = 1;
                                int n3 = 0;
                                String[] s2 = nam.split(",");
                                if (s2.length > 1) {
                                    n2 = Integer.parseInt(s2[1]);
                                    itn = n2 + " ";
                                }
                                if (s2[0].contains("::")) {
                                    String[] s3 = s2[0].split("::");
                                    n1 = s3[0];
                                    n3 = Integer.parseInt(s3[1]);
                                } else {
                                    n1 = s2[0];
                                }
                                Item item = JRMCoreH.getItemByText(n1);
                                if (item != null) {
                                    ItemStack is = new ItemStack(item, 1, n3);
                                    it = "\u00a78" + itn + item.getItemStackDisplayName(is);
                                }
                            }
                            if (sn[i].startsWith("CM")) {
                                it = "\u00a78" + nam.split("!")[0];
                            }
                        } else {
                            it = nam.substring(2);
                        }
                        if (prev.equals(it)) continue;
                        s = it;
                        sw2 = this.fontRendererObj.getStringWidth(s);
                        var8.drawString(s, guiLeft2 + 5, guiTop + 5 + 52 + i22 * 10, 0);
                        prev = it;
                        ++i22;
                    }
                }
                if (m > sz) {
                    if (scrollSide > 0.0f) {
                        this.buttonList.add(new JRMCoreGuiButtonsA1(43, guiLeft2 + xSize2 / 2 + 110 + 18, guiTop + (ySize2 + 1) / 2 - 70, "i"));
                    }
                    if (scrollSide < 1.0f) {
                        this.buttonList.add(new JRMCoreGuiButtonsA1(44, guiLeft2 + xSize2 / 2 + 110 + 18, guiTop + (ySize2 + 1) / 2 + 60, "v"));
                    }
                    this.buttonList.add(new JRMCoreGuiSliderX00(1000000, guiLeft2 + xSize2 / 2 + 110 + 18, guiTop + 25, this.mousePressed, scrollSide, 1.0f));
                }
            }
            s = "Checkout";
            sw2 = this.fontRendererObj.getStringWidth(s);
            this.buttonList.add(new JRMCoreGuiButtons00(3100, guiLeft2 + xSize2 / 2 + 100 - sw2 / 2, guiTop + (ySize2 + 1) / 2 - 50 + 131, sw2 + 8, 20, s, 0));
        }
        if (this.guiID <= 50 && this.guiID >= 30) {
            xSize2 = 256;
            ySize2 = 159;
            guiLeft2 = (this.width - xSize2) / 2;
            guiTop = (this.height - ySize2) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            guiLocation = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation);
            this.drawTexturedModalRect(guiLeft2, guiTop, 0, 0, xSize2, ySize2);
            if (this.isGUIOpen(50)) {
                this.buttonList.add(new JRMCoreGuiButtonsTab(31, guiLeft2 + xSize2 / 2 - 110, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", News), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(32, guiLeft2 + xSize2 / 2 - 60, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Server"), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(33, guiLeft2 + xSize2 / 2 - 10, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Update"), 1));
                this.menuButtons(News);
                String j = "Read more at JinGames.net";
                int jw = var8.getStringWidth(j);
                this.buttonList.add(new JRMCoreGuiButtons01(199, guiLeft2 + 128 - jw / 2, guiTop + 5, jw, j, 0xFFFFFF));
                if (Version.ammv != null) {
                    if (Version.ammv.length() > 0) {
                        String[] a = Version.ammv.split(";");
                        int i = 0;
                        for (String n : a) {
                            String mcer;
                            String ver;
                            ++i;
                            String[] m = n.split("::");
                            String col = "\u00a72";
                            String name = "";
                            String tell = "";
                            String tell2 = "";
                            boolean next = false;
                            if ("jinryuujrmcore".equals(m[0].toLowerCase().replace("_", ""))) {
                                ver = m[1];
                                mcer = m[2];
                                name = "JinRyuu's JRMCore";
                                tell = "1.3.51";
                                if (!tell.equals(ver)) {
                                    tell2 = tell2 + "Update to new version: " + ver;
                                    col = "\u00a74";
                                    next = true;
                                }
                            } else {
                                ver = m[1];
                                mcer = m[2];
                                name = JRMCoreH.Nams(m[0].toLowerCase().replace("_", ""));
                                tell = JRMCoreH.Vers(m[0].toLowerCase().replace("_", ""));
                                if (tell == null) {
                                    tell = ver;
                                    col = "\u00a78";
                                } else if (!tell.equals(ver)) {
                                    tell2 = "Update to new version: " + ver;
                                    col = "\u00a74";
                                    next = true;
                                }
                            }
                            var8.drawString(col + name + " v" + tell, guiLeft2 + 5, guiTop + 8 + i * 10, 0);
                            if (!next) continue;
                            var8.drawString("  " + col + tell2, guiLeft2 + 5, guiTop + 8 + ++i * 10, 0);
                        }
                    }
                } else {
                    var8.drawString("Connection Problems", guiLeft2 + 5, guiTop + 8, 0);
                }
            }
            if (this.isGUIOpen(40)) {
                this.buttonList.add(new JRMCoreGuiButtonsTab(31, guiLeft2 + xSize2 / 2 - 110, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", News), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(33, guiLeft2 + xSize2 / 2 - 10, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Update"), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(32, guiLeft2 + xSize2 / 2 - 60, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Server"), 1));
                this.menuButtons("Server");
                boolean regen = JRMCoreConfig.regen;
                String regenRate = JRMCoreConfig.regenRate;
                boolean hregen = JRMCoreConfig.hregen;
                String hRegenRate = JRMCoreConfig.hRegenRate;
                boolean release = JRMCoreConfig.release;
                int SklMedCat = JRMCoreConfig.SklMedCat;
                float SklMedRate = JRMCoreConfig.SklMedRate;
                int tpgn = (int)((float)JRMCoreConfig.tpgn * JRMCoreConfig.TPGainRace[JRMCoreH.Race]);
                boolean sizes = JRMCoreConfig.sizes;
                boolean expGriOff = JRMCoreConfig.expGriOff;
                this.buttonList.add(new JRMCoreGuiButtons00(50, guiLeft2 + xSize2 / 2 - 120, guiTop + (ySize2 + 1) / 2 - 75, 40, 20, "Core", 8046079));
                int k = 25;
                if (this.sip == 0) {
                    var8.drawString("\u00a79" + JRMCoreH.trl("jrmc", "CoreServerConfigurations") + "\u00a70", guiLeft2 + 5, guiTop + 5 + k, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "EnergyRegeneration") + ": \u00a78" + (regen ? JRMCoreH.trl("jrmc", "Enabled") + ", " + JRMCoreH.trl("jrmc", "Speed") + ": " + regenRate : JRMCoreH.trl("jrmc", "Disabled")), guiLeft2 + 5, guiTop + 15 + k, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "HealthRegeneration") + ": \u00a78" + (hregen ? JRMCoreH.trl("jrmc", "Enabled") + ", " + JRMCoreH.trl("jrmc", "Speed") + ": " + hRegenRate : JRMCoreH.trl("jrmc", "Disabled")), guiLeft2 + 5, guiTop + 25 + k, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "PowerRelease") + ": \u00a78" + (release ? JRMCoreH.trl("jrmc", "Enabled") : JRMCoreH.trl("jrmc", "Off")), guiLeft2 + 5, guiTop + 35 + k, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "MediSkillCategory") + ": \u00a78" + (SklMedCat == 0 ? JRMCoreH.trl("jrmc", "Active") : JRMCoreH.trl("jrmc", "Passive")) + ", " + JRMCoreH.trl("jrmc", "Rate") + ": " + (int)(SklMedRate * 100.0f) + "%", guiLeft2 + 5, guiTop + 45 + k, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "TrainingPointGain") + ": \u00a78" + tpgn, guiLeft2 + 5, guiTop + 55 + k, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "AttributeBasedSizeChange") + ": \u00a78" + (sizes ? JRMCoreH.trl("jrmc", "Enabled") : JRMCoreH.trl("jrmc", "Disabled")), guiLeft2 + 5, guiTop + 65 + k, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Explosions") + ": \u00a78" + (!expGriOff ? JRMCoreH.trl("jrmc", "Enabled") : JRMCoreH.trl("jrmc", "Disabled")), guiLeft2 + 5, guiTop + 75 + k, 0);
                }
                if (JRMCoreH.DBC()) {
                    this.buttonList.add(new JRMCoreGuiButtons00(51, guiLeft2 + xSize2 / 2 - 75, guiTop + (ySize2 + 1) / 2 - 75, 40, 20, "DBC", 8046079));
                    if (this.sip == 1) {
                        boolean plntVegeta = JRMCoreHDBC.DBCgetConfigplntVegeta();
                        boolean flyAnyLvl = JRMCoreHDBC.DBCgetConfigflyAnyLvl();
                        int eDBrate = JRMCoreHDBC.DBCgetConfigeDBrate();
                        int nDBrate = JRMCoreHDBC.DBCgetConfignDBrate();
                        boolean DeathSystemOff = JRMCoreHDBC.DBCgetConfigDeathSystemOff();
                        boolean DBSpawnEnabled = JRMCoreHDBC.DBCgetConfigDBSpawnEnabled();
                        String DBSpawnTime = JRMCoreHDBC.DBCgetConfigDBSpawnTime();
                        boolean sagasystemOn = JRMCoreHDBC.DBCgetConfigSagaSystemOn();
                        var8.drawString("\u00a79" + JRMCoreH.trl("dbc", "DBCServerConfigurations") + "\u00a70", guiLeft2 + 5, guiTop + 5 + k, 0);
                        var8.drawString(JRMCoreH.trl("dbc", "PlanetVegeta") + ": \u00a78" + (plntVegeta ? JRMCoreH.trl("jrmc", "Enabled") : JRMCoreH.trl("jrmc", "Disabled")), guiLeft2 + 5, guiTop + 15 + k, 0);
                        var8.drawString(JRMCoreH.trl("dbc", "flyneedsskilllevel") + ": \u00a78" + (flyAnyLvl ? "0" : "1"), guiLeft2 + 5, guiTop + 25 + k, 0);
                        var8.drawString(JRMCoreH.trl("dbc", "DBSpawn") + ": \u00a78" + (DBSpawnEnabled ? DBSpawnTime + ", \u00a70" + JRMCoreH.trl("dbc", "Earthrate") + ": \u00a781:" + eDBrate + " \u00a70" + JRMCoreH.trl("dbc", "Namekrate") + ": \u00a781:" + nDBrate : JRMCoreH.trl("jrmc", "Disabled")), guiLeft2 + 5, guiTop + 35 + k, 0);
                        var8.drawString(JRMCoreH.trl("dbc", "SagaSystem") + ": \u00a78" + (sagasystemOn ? JRMCoreH.trl("jrmc", "Enabled") : JRMCoreH.trl("jrmc", "Disabled")), guiLeft2 + 5, guiTop + 45 + k, 0);
                        var8.drawString(JRMCoreH.trl("dbc", "DeathSystem") + ": \u00a78" + (!DeathSystemOff ? JRMCoreH.trl("jrmc", "Enabled") : JRMCoreH.trl("jrmc", "Disabled")), guiLeft2 + 5, guiTop + 55 + k, 0);
                    }
                }
            } else if (this.sip != 0) {
                this.sip = 0;
            }
            if (this.isGUIOpen(30)) {
                this.buttonList.add(new JRMCoreGuiButtonsTab(33, guiLeft2 + xSize2 / 2 - 10, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Update"), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(32, guiLeft2 + xSize2 / 2 - 60, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Server"), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(31, guiLeft2 + xSize2 / 2 - 110, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", News), 1));
                this.menuButtons(News);
                String j = "Read more at JinGames.net";
                int jw = var8.getStringWidth(j);
                this.buttonList.add(new JRMCoreGuiButtons01(199, guiLeft2 + 128 - jw / 2, guiTop + 5, jw, j, 0xFFFFFF));
                int i = 0;
                if (Version.news != null && Version.news.length() > 0) {
                    List lt = JRMCoreGuiScreen.mc.fontRenderer.listFormattedStringToWidth(Version.news.replaceAll("/n", "\n"), 230);
                    Iterator iterator = lt.iterator();
                    int m = lt.size();
                    float m2 = 5.0f;
                    int sz = 10;
                    this.scrollMouseJump = 3;
                    if (m > sz) {
                        if ((float)m - m2 < (float)this.scroll) {
                            this.scroll = (int)((float)m - m2);
                        } else if (this.scroll < 0) {
                            this.scroll = 0;
                        }
                        if (this.mousePressed && !JRMCoreGuiButtonsA1.clicked) {
                            this.scroll = (int)(((float)m - m2) * scrollSide);
                        } else {
                            scrollSide = JRMCoreGuiSliderX00.sliderValue = (float)this.scroll / ((float)m - m2);
                        }
                    } else {
                        this.scroll = 0;
                    }
                    while (iterator.hasNext()) {
                        Matcher matcher;
                        String s1 = (String)iterator.next();
                        if (++i > this.scroll + 14 || i <= this.scroll) continue;
                        EnumChatFormatting col = EnumChatFormatting.BLACK;
                        if (i == 1) {
                            col = EnumChatFormatting.UNDERLINE;
                        }
                        if (i == 2) {
                            if (s1.contains("min") || s1.contains("hour") || s1.contains("day")) {
                                col = EnumChatFormatting.DARK_GREEN;
                            } else if (s1.contains("week")) {
                                col = EnumChatFormatting.DARK_RED;
                            } else if (s1.contains("month") || s1.contains("year")) {
                                col = EnumChatFormatting.GRAY;
                            }
                        }
                        if ((matcher = JRMCoreHC.paturl.matcher(s1)).find()) {
                            int matchStart = matcher.start(1);
                            int matchEnd = matcher.end();
                            urlToOpen = matcher.group();
                            j = s1;
                            jw = var8.getStringWidth(j);
                            if (s1.contains("youtu")) {
                                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                                String image = JRMCoreH.tjjrmc + ":yt.png";
                                ResourceLocation tx2 = new ResourceLocation(image);
                                JRMCoreGuiScreen.mc.renderEngine.bindTexture(tx2);
                                JRMCoreHC.dtr(guiLeft2 + 5, guiTop + 8 - 3 + i * 10 - this.scroll * 10, 0, 0, 20.0f, 15.0f, this.zLevel);
                            }
                            this.buttonList.add(new JRMCoreGuiButtons01(198, guiLeft2 + 25, guiTop + 8 + i * 10 - this.scroll * 10, jw, j, JRMCoreH.techCol[1]));
                            continue;
                        }
                        var8.drawString(col + s1, guiLeft2 + 6, guiTop + 8 + i * 10 - this.scroll * 10, 0);
                    }
                    if (i <= 13 + this.scroll && i > this.scroll) {
                        j = "Click here to Read More";
                        jw = var8.getStringWidth(j);
                        this.buttonList.add(new JRMCoreGuiButtons01(199, guiLeft2 + 5, guiTop + 10 + 8 + i * 10 - this.scroll * 10, jw, j, 0xFFFFFF));
                    }
                }
                if (scrollSide > 0.0f) {
                    this.buttonList.add(new JRMCoreGuiButtonsA1(43, guiLeft2 + xSize2 / 2 + 110, guiTop + (ySize2 + 1) / 2 - 70, "i"));
                }
                if (scrollSide < 1.0f) {
                    this.buttonList.add(new JRMCoreGuiButtonsA1(44, guiLeft2 + xSize2 / 2 + 110, guiTop + (ySize2 + 1) / 2 + 60, "v"));
                }
                this.buttonList.add(new JRMCoreGuiSliderX00(1000000, guiLeft2 + xSize2 / 2 + 110, guiTop + 25, this.mousePressed, scrollSide, 1.0f));
            } else if (this.site != 0) {
                this.site = 0;
            }
            if (this.isGUIOpen(31)) {
                String j = "Click here to open JinGames.net";
                int jw = var8.getStringWidth(j);
                this.buttonList.add(new JRMCoreGuiButtons01(199, guiLeft2 + 65, guiTop + 5, jw, j, 0xFFFFFF));
                int nr = 2;
                nr += JRMCoreH.txt("Waiting for Server Data!", "\u00a78", 0, true, guiLeft2 + 6, guiTop + 5 + nr * 10, 0);
                nr += JRMCoreH.txt("Wait for the server to send the data (should be few seconds),", "\u00a75", 5, true, guiLeft2 + 6, guiTop + 5 + nr * 10, 0);
                nr += JRMCoreH.txt("IF you see this for long time the server might not have the required installed!", "\u00a74", 0, true, guiLeft2 + 6, guiTop + 5 + nr * 10, 0);
            }
        }
        if (this.guiID >= 60 && this.guiID <= 70) {
            xSize2 = 256;
            ySize2 = 159;
            guiLeft2 = (this.width - xSize2) / 2;
            guiTop = (this.height - ySize2) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            guiLocation = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation);
            this.drawTexturedModalRect(guiLeft2, guiTop, 0, 0, xSize2, ySize2);
            if (this.isGUIOpen(60)) {
                this.buttonList.add(new JRMCoreGuiButtonsTab(62, guiLeft2 + xSize2 / 2 - 10, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Group") + (JRMCoreH.GMN > 1 ? " " + JRMCoreH.GMN : ""), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(61, guiLeft2 + xSize2 / 2 - 60, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Side"), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(60, guiLeft2 + xSize2 / 2 - 110, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Main"), 1));
                this.menuButtons("Journal");
                if (this.pwr == 1) {
                    this.msys("mainDBC", guiLeft2 + 6, guiTop + 5);
                } else if (this.pwr == 2) {
                    this.msys("mainNC", guiLeft2 + 6, guiTop + 5);
                } else if (JRMCoreH.Accepted == 0) {
                    int j = JRMCoreH.txt(JRMCoreH.trl("jrmc", "selectpwratcreator"), "\u00a78", 0, true, guiLeft2 + 6, guiTop + 5, 0);
                }
            }
            if (this.isGUIOpen(61)) {
                this.buttonList.add(new JRMCoreGuiButtonsTab(62, guiLeft2 + xSize2 / 2 - 10, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Group") + (JRMCoreH.GMN > 1 ? " " + JRMCoreH.GMN : ""), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(60, guiLeft2 + xSize2 / 2 - 110, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Main"), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(61, guiLeft2 + xSize2 / 2 - 60, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Side"), 1));
                this.menuButtons("Journal");
                if (this.pwr == 1 || this.pwr == 2 || this.pwr == 3) {
                    if (this.SideMsn.length() < 1) {
                        int i = 0;
                        for (String n : JRMCoreM.missionsC.keySet()) {
                            JRMCoreMsn m = JRMCoreM.missionsC.get(n);
                            ArrayList<String> d = JRMCoreM.missionsCD.get(n);
                            String ns = JRMCoreH.trl(d.get(1));
                            if (!(this.pwr == 1 ? !n.equalsIgnoreCase("mainDBC") : this.pwr != 2 || !n.equalsIgnoreCase("mainNC"))) continue;
                            String md = JRMCoreH.trl(d.get(5));
                            String[] mds = md.split(",");
                            for (int j = 0; j < mds.length; ++j) {
                                if ((mds.length != 1 || mds[j].length() != 0) && !mds[j].equalsIgnoreCase(this.pwr == 1 ? "DBC" : (this.pwr == 2 ? "NC" : (this.pwr == 3 ? "SAOC" : "MC")))) continue;
                                String dc = JRMCoreH.trl(d.get(2));
                                String at = JRMCoreH.trl(d.get(3));
                                String vr = JRMCoreH.trl(d.get(4));
                                String rp = JRMCoreH.trl(d.get(6));
                                String ul = d.size() > 7 ? JRMCoreH.trl(d.get(7)) : "";
                                String nsds = "";
                                String[] syncMdaV = JRMCoreM.getMda(JRMCoreH.MSDV, n);
                                boolean unlocked = true;
                                if (ul.length() > 0) {
                                    int k;
                                    String[] sidd = ul.split(",");
                                    for (k = 0; k < sidd.length && (unlocked = JRMCoreM.isUnlocked(sidd[k], JRMCoreH.MSD, JRMCoreH.MSDV)); ++k) {
                                    }
                                    for (k = 0; k < sidd.length; ++k) {
                                        unlocked = JRMCoreM.isUnlocked(sidd[k], JRMCoreH.MSD, JRMCoreH.MSDV);
                                        if (sidd[k].contains(":")) {
                                            String[] nmd = sidd[k].split(":");
                                            ArrayList<String> dd = JRMCoreM.missionsCD.get(nmd[0]);
                                            if (dd == null) continue;
                                            String nsd = JRMCoreH.trl(dd.get(1));
                                            if (unlocked) continue;
                                            nsds = nsds + "/n" + nsd + " (ID: " + nmd[1] + ")";
                                            continue;
                                        }
                                        ArrayList<String> dd = JRMCoreM.missionsCD.get(sidd[k]);
                                        if (dd == null) continue;
                                        String nsd = JRMCoreH.trl(dd.get(1));
                                        if (unlocked) continue;
                                        nsds = nsds + "/n" + nsd;
                                    }
                                }
                                if (i < 14 + this.site * 14 && i >= 0 + this.site * 14) {
                                    String mrw;
                                    int rpi = Integer.parseInt(rp);
                                    String rp2 = rpi > 0 ? "Every " + rp + " min" + (rpi > 1 ? "s" : "") : (rpi == -1 ? "No" : "Yes");
                                    String[] sydaV = JRMCoreM.getMda(JRMCoreH.MSDV, n);
                                    String rpv = JRMCoreM.getSydaV(sydaV, 2);
                                    rpi = Integer.parseInt(rpv) * 5;
                                    String string = mrw = rpi > 0 ? JRMCoreH.trl("jrmc", "missionRepeat.wait", JRMCoreH.format_lz2(rpi / 1 % 60), JRMCoreH.format_lz2(rpi / 60 % 60), JRMCoreH.format_lz2(rpi / 3600 % 24), JRMCoreH.format_lz2(rpi / 86400)) : "";
                                    String rp3 = rpi > 0 ? mrw + "/n" : (rpi < 0 ? JRMCoreH.trl("jrmc", "missionRepeat.not") + "/n" : "");
                                    String lkd = unlocked ? "" : JRMCoreH.trl("jrmc", "missionUnlock") + nsds;
                                    String lkd1 = rpi > 0 || rpi < 0 ? rp3 : "";
                                    boolean lck = !unlocked || rpi > 0 || rpi < 0;
                                    String lkd2 = lck ? JRMCoreH.cldr + "Locked!/n" + lkd + lkd1 : "";
                                    int nw = var8.getStringWidth(ns);
                                    JRMCoreGuiScreen.drawDetails(dc + "\n\nAuthors: " + at + "\nVersion: " + vr + "\nRepeatable: " + rp2 + "\n" + lkd2, guiLeft2 + 5 + 10, guiTop + 5 + 2 + i * 10 - this.site * 14 * 10, nw, 8, x, y, var8);
                                    int cl = lck ? JRMCoreH.techCol[8] : (m.getId() > 0 ? JRMCoreH.techCol[6] : 0);
                                    this.buttonList.add(new JRMCoreGuiButtons01MS(6001, guiLeft2 + 5 + 10, guiTop + 5 + i * 10 - this.site * 14 * 10, this.fontRendererObj.getStringWidth(ns), ns, cl, n, "0"));
                                }
                                ++i;
                            }
                        }
                        if (this.site != 0) {
                            String p = JRMCoreH.trl("jrmc", "Prev");
                            int pw = this.fontRendererObj.getStringWidth(p) + 8;
                            this.buttonList.add(new JRMCoreGuiButtons00(41, guiLeft2 + xSize2 / 2 - 130 - pw, guiTop + ySize2 - 40, pw, 20, p, 0));
                        }
                        if (i > (this.site + 1) * 14) {
                            String n = JRMCoreH.trl("jrmc", "Next");
                            this.buttonList.add(new JRMCoreGuiButtons00(42, guiLeft2 + xSize2 / 2 + 130, guiTop + ySize2 - 40, this.fontRendererObj.getStringWidth(n) + 8, 20, n, 0));
                        }
                    } else {
                        if (this.site != 0) {
                            this.site = 0;
                        }
                        this.msys(this.SideMsn, guiLeft2 + 6, guiTop + 5);
                        JRMCoreMsn m = JRMCoreM.missionsC.get(this.SideMsn);
                        String ns = JRMCoreH.trl("jrmc", "Back");
                        this.buttonList.add(new JRMCoreGuiButtons00(6002, guiLeft2 + xSize2 + 2, guiTop + ySize2 + 0, this.fontRendererObj.getStringWidth(ns) + 8, 20, ns, 0));
                    }
                } else if (JRMCoreH.Accepted == 0) {
                    int m = JRMCoreH.txt(JRMCoreH.trl("jrmc", "selectpwratcreator"), "\u00a78", 0, true, guiLeft2 + 6, guiTop + 5, 0);
                }
            }
            if (this.isGUIOpen(70)) {
                this.buttonList.add(new JRMCoreGuiButtonsTab(60, guiLeft2 + xSize2 / 2 - 110, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Main"), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(61, guiLeft2 + xSize2 / 2 - 60, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Side"), 0));
                this.buttonList.add(new JRMCoreGuiButtonsTab(62, guiLeft2 + xSize2 / 2 - 10, guiTop + (ySize2 + 1) / 2 - 99, 60, 20, JRMCoreH.trl("jrmc", "Group") + (JRMCoreH.GMN > 1 ? " " + JRMCoreH.GMN : ""), 1));
                this.menuButtons("Group");
                if (this.pwr == 1) {
                    if (JRMCoreH.GID == 0) {
                        if (JRMCoreH.GIDi.length() > 1) {
                            for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                                EntityPlayer e = JRMCoreGuiScreen.mc.theWorld.getPlayerEntityByName(JRMCoreH.plyrs[pl]);
                                if (e == null || !e.getCommandSenderName().equalsIgnoreCase(JRMCoreH.GIDi)) continue;
                                String n = e.getCommandSenderName();
                                String s = JRMCoreH.trl("jrmc", "recivedinv") + " " + n;
                                var8.drawString(s, guiLeft2 + 5, guiTop + 5, 0);
                                String a = JRMCoreH.trl("jrmc", "Accept");
                                this.buttonList.add(new JRMCoreGuiButtons00(81, guiLeft2 + xSize2 / 2 + 10, guiTop + (ySize2 + 1) / 2 - 50, this.fontRendererObj.getStringWidth(a) + 8, 20, a, 0));
                                break;
                            }
                            String d = JRMCoreH.trl("jrmc", "decline");
                            this.buttonList.add(new JRMCoreGuiButtons00(82, guiLeft2 + xSize2 / 2 + 10, guiTop + (ySize2 + 1) / 2 - 30, this.fontRendererObj.getStringWidth(d) + 8, 20, d, 0));
                        } else {
                            this.buttonList.add(new JRMCoreGuiButtons00(80, guiLeft2 + xSize2 / 2 - 85, guiTop + (ySize2 + 1) / 2 + 35, 170, 20, JRMCoreH.trl("jrmc", "form"), 0));
                        }
                    }
                    if (JRMCoreH.GID != 0) {
                        if (this.inv == 3) {
                            int i = 0;
                            if (JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && JRMCoreH.GIDs != null) {
                                for (int pl = 0; pl < (JRMCoreH.plyrs.length < JRMCoreH.GIDs.length ? JRMCoreH.plyrs.length : JRMCoreH.GIDs.length); ++pl) {
                                    EntityPlayer e;
                                    if (JRMCoreH.GIDs[pl] != JRMCoreH.GID || (e = JRMCoreGuiScreen.mc.theWorld.getPlayerEntityByName(JRMCoreH.plyrs[pl])) == null) continue;
                                    String n = e.getCommandSenderName();
                                    this.buttonList.add(new JRMCoreGuiButtons01(-2010 - i, guiLeft2 + xSize2 / 2 - 122, guiTop + (ySize2 + 1) / 2 - 74 + i * 10 - this.ipg * 14 * 10, this.fontRendererObj.getStringWidth(n), n, 0));
                                    ++i;
                                }
                            }
                        }
                        if (this.inv == 2) {
                            int i = 0;
                            if (JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && JRMCoreH.GIDs != null) {
                                for (int pl = 0; pl < (JRMCoreH.plyrs.length < JRMCoreH.GIDs.length ? JRMCoreH.plyrs.length : JRMCoreH.GIDs.length); ++pl) {
                                    if (JRMCoreH.GIDs[pl] != JRMCoreH.GID) continue;
                                    EntityPlayer e = JRMCoreGuiScreen.mc.theWorld.getPlayerEntityByName(JRMCoreH.plyrs[pl]);
                                    String n = JRMCoreH.plyrs[pl];
                                    this.buttonList.add(new JRMCoreGuiButtons01(-2000 - i, guiLeft2 + xSize2 / 2 - 122, guiTop + (ySize2 + 1) / 2 - 74 + i * 10 - this.ipg * 14 * 10, this.fontRendererObj.getStringWidth(n), n, e != null ? 0 : JRMCoreH.techCol[4]));
                                    ++i;
                                }
                            }
                        }
                        if (this.inv == 1) {
                            int i2 = 0;
                            boolean gn = false;
                            boolean gp = false;
                            if (JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && JRMCoreH.GIDs != null) {
                                for (int i = 0; i < (JRMCoreH.plyrs.length < JRMCoreH.GIDs.length ? JRMCoreH.plyrs.length : JRMCoreH.GIDs.length); ++i) {
                                    EntityPlayer e;
                                    if (i2 > 14 + this.ipg * 14 || i2 < 0 + this.ipg * 14 || JRMCoreH.GIDs[i] != 0 || (e = JRMCoreGuiScreen.mc.theWorld.getPlayerEntityByName(JRMCoreH.plyrs[i])) == null) continue;
                                    String n = e.getCommandSenderName();
                                    this.buttonList.add(new JRMCoreGuiButtons01(2000 + i, guiLeft2 + xSize2 / 2 - 122, guiTop + (ySize2 + 1) / 2 - 74 + i2 * 10 - this.ipg * 14 * 10, this.fontRendererObj.getStringWidth(n), n, 0));
                                    ++i2;
                                }
                            }
                            if (JRMCoreH.plyrs.length > 14 + this.ipg * 14) {
                                String n = JRMCoreH.trl("jrmc", "Next");
                                this.buttonList.add(new JRMCoreGuiButtons00(88, guiLeft2 + xSize2 / 2 + 130, guiTop + (ySize2 + 1) / 2 + 15, this.fontRendererObj.getStringWidth(n) + 8, 20, n, 0));
                            }
                            if (this.ipg != 0) {
                                String p = JRMCoreH.trl("jrmc", "Prev");
                                int pw = this.fontRendererObj.getStringWidth(p) + 8;
                                this.buttonList.add(new JRMCoreGuiButtons00(89, guiLeft2 + xSize2 / 2 - 130 - pw, guiTop + (ySize2 + 1) / 2 + 15, pw, 20, p, 0));
                            }
                        }
                        String ln = JRMCoreH.trl("jrmc", "leader");
                        if (this.inv == 0) {
                            int i = 0;
                            if (JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && JRMCoreH.GIDs != null) {
                                for (int pl = 0; pl < (JRMCoreH.plyrs.length < JRMCoreH.GIDs.length ? JRMCoreH.plyrs.length : JRMCoreH.GIDs.length); ++pl) {
                                    if (JRMCoreH.GIDs[pl] != JRMCoreH.GID) continue;
                                    EntityPlayer e = JRMCoreGuiScreen.mc.theWorld.getPlayerEntityByName(JRMCoreH.plyrs[pl]);
                                    String n = (e != null ? "" : JRMCoreH.cldr) + JRMCoreH.plyrs[pl] + (JRMCoreH.plyrs[pl].equalsIgnoreCase(JRMCoreH.GLID) ? " " + JRMCoreH.cly + ln : "");
                                    var8.drawString(n, guiLeft2 + 5, guiTop + 6 + i * 10, 0);
                                    ++i;
                                }
                            }
                            if (JRMCoreGuiScreen.mc.thePlayer.getCommandSenderName().equalsIgnoreCase(JRMCoreH.GLID)) {
                                if (JRMCoreH.GMN < 10) {
                                    String in = JRMCoreH.trl("jrmc", "invite");
                                    int inw = this.fontRendererObj.getStringWidth(in) + 8;
                                    this.buttonList.add(new JRMCoreGuiButtons00(83, guiLeft2 + xSize2 / 2 + 10 + 60 - inw / 2, guiTop + (ySize2 + 1) / 2 - 70, this.fontRendererObj.getStringWidth(in) + 8, 20, in, 0));
                                }
                                String s = JRMCoreH.trl("jrmc", "setleader");
                                int sw3 = this.fontRendererObj.getStringWidth(s) + 8;
                                this.buttonList.add(new JRMCoreGuiButtons00(84, guiLeft2 + xSize2 / 2 + 10 + 60 - sw3 / 2, guiTop + (ySize2 + 1) / 2 - 50 + 1, this.fontRendererObj.getStringWidth(s) + 8, 20, s, 0));
                                String k = JRMCoreH.trl("jrmc", "kick");
                                int kw = this.fontRendererObj.getStringWidth(k) + 8;
                                this.buttonList.add(new JRMCoreGuiButtons00(85, guiLeft2 + xSize2 / 2 + 10 + 60 - kw / 2, guiTop + (ySize2 + 1) / 2 - 30 + 2, this.fontRendererObj.getStringWidth(k) + 8, 20, k, 0));
                                String d = JRMCoreH.trl("jrmc", "disband");
                                int dw = this.fontRendererObj.getStringWidth(d) + 8;
                                this.buttonList.add(new JRMCoreGuiButtons00(86, guiLeft2 + xSize2 / 2 + 10 + 60 - dw / 2, guiTop + (ySize2 + 1) / 2 - 10 + 3, this.fontRendererObj.getStringWidth(d) + 8, 20, d, 0));
                            }
                            String l = JRMCoreH.trl("jrmc", "leave");
                            int lw = this.fontRendererObj.getStringWidth(l) + 8;
                            this.buttonList.add(new JRMCoreGuiButtons00(87, guiLeft2 + xSize2 / 2 + 10 + 60 - lw / 2, guiTop + (ySize2 + 1) / 2 + 10 + 4, this.fontRendererObj.getStringWidth(l) + 8, 20, l, 0));
                        }
                        if (this.inv != 0) {
                            String s = JRMCoreH.trl("jrmc", "Back");
                            int sw4 = this.fontRendererObj.getStringWidth(s) + 8;
                            this.buttonList.add(new JRMCoreGuiButtons00(90, guiLeft2 + xSize2 / 2 - 130 - sw4, guiTop + (ySize2 + 1) / 2 + 40, sw4, 20, s, 0));
                        }
                        String s = JRMCoreH.cldg + JRMCoreH.trl("jrmc", "msnshare");
                        int sw5 = this.fontRendererObj.getStringWidth(s);
                        var8.drawString(s, guiLeft2 + 250 - sw5, guiTop + 145, 0);
                    }
                } else if (JRMCoreH.Accepted == 0) {
                    int ln = JRMCoreH.txt(JRMCoreH.trl("jrmc", "selectpwratcreator"), "\u00a78", 0, true, guiLeft2 + 6, guiTop + 5, 0);
                }
            }
        }
        if (this.isGUIOpen(0)) {
            xSize2 = 256;
            ySize2 = 159;
            guiLeft2 = (this.width - xSize2) / 2;
            guiTop = (this.height - ySize2) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            guiLocation = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation);
            this.drawTexturedModalRect(guiLeft2, guiTop, 0, 0, xSize2, ySize2);
            this.buttonList.add(new JRMCoreGuiButtons00(10, posX - 150, posY + 65, 20, 20, "X", 0));
            String n = JRMCoreH.trl("jrmc", "Next");
            int nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(11, posX + 130, posY + 65, nw, 20, n, 0));
            int race = JRMCoreH.dnsRace("dns");
            if (JRMCoreH.Allow(JRMCoreH.RaceAllow[RaceSlcted])) {
                CanRace = true;
            } else {
                CanRace = false;
                if (RaceSlcted != 0) {
                    RaceSlcted = 0;
                    JRMCoreH.Char((byte)0, (byte)RaceSlcted);
                }
            }
            if (JRMCoreH.Allow(JRMCoreH.GenderAllow[GenderSlcted]) && JRMCoreH.RaceGenders[RaceSlcted] != 1) {
                CanGender = true;
            } else {
                CanGender = false;
                if (GenderSlcted != 0) {
                    GenderSlcted = 0;
                }
            }
            if (JRMCoreH.Allow("JYC")) {
                CanYears = true;
            } else {
                CanYears = false;
                if (YearsSlcted != 0) {
                    YearsSlcted = 0;
                }
            }
            if (JRMCoreH.RaceCanHaveHair[RaceSlcted].contains("H")) {
                CanHair = true;
            } else {
                CanHair = false;
                if (HairSlcted != 10) {
                    HairSlcted = 10;
                }
            }
            if (JRMCoreH.isRaceMajin(RaceSlcted)) {
                this.updateMajinHairToBodyColor();
                CanColor = false;
                if (HairSlcted < 10) {
                    HairSlcted = 12;
                    JRMCoreGuiScreen.setdnsForHair();
                }
            } else if (JRMCoreH.RaceCanHaveHair[RaceSlcted].contains("H") && JRMCoreH.RaceHairColor[RaceSlcted] == -1) {
                CanColor = true;
            } else {
                ColorSlcted = JRMCoreH.RaceHairColor[RaceSlcted] != -1 ? JRMCoreH.RaceHairColor[RaceSlcted] : 0;
                CanColor = false;
            }
            if (JRMCoreH.RaceCustomSkin[RaceSlcted] == 2) {
                canCustom = true;
            } else if (JRMCoreH.RaceCustomSkin[RaceSlcted] == 1) {
                canCustom = false;
                if (SkinTypeSlcted != 1) {
                    SkinTypeSlcted = 1;
                    JRMCoreGuiScreen.setdns();
                }
            } else {
                canCustom = false;
                if (SkinTypeSlcted != 0) {
                    SkinTypeSlcted = 0;
                    JRMCoreGuiScreen.setdns();
                }
            }
            String Race = JRMCoreH.trl("jrmc", JRMCoreH.Races[RaceSlcted]);
            String Gender = JRMCoreH.trl("jrmc", JRMCoreH.Genders[GenderSlcted]);
            String Years = JRMCoreH.trl("jrmc", JRMCoreH.Years[YearsSlcted]);
            String TRState = JRMCoreH.trl("jrmc", "TRState");
            String Hair = JRMCoreH.trl("jrmc", "Hair") + " " + (HairSlcted + 1);
            String Color2 = "" + ColorSlcted;
            String SkinTyp = JRMCoreH.trl("jrmc", JRMCoreH.skinTyps[SkinTypeSlcted]);
            String Tail = JRMCoreH.trl("jrmc", "Tail");
            int i = 0;
            if (CanRace) {
                this.buttonList.add(new JRMCoreGuiButtonsA2(-1, guiLeft2 + 130, guiTop + 5 + i * 10, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(1, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
            }
            var8.drawString(Race, guiLeft2 + 190 - var8.getStringWidth(Race) / 2, guiTop + 5 + i * 10, 0);
            ++i;
            if (CanGender) {
                this.buttonList.add(new JRMCoreGuiButtonsA2(-2, guiLeft2 + 130, guiTop + 5 + i * 10, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(2, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
                var8.drawString(Gender, guiLeft2 + 190 - var8.getStringWidth(Gender) / 2, guiTop + 5 + i * 10, 0);
            }
            ++i;
            if (CanHair) {
                this.buttonList.add(new JRMCoreGuiButtonsA2(-3, guiLeft2 + 130, guiTop + 5 + i * 10, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(3, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
                if (HairSlcted != 12) {
                    var8.drawString(Hair, guiLeft2 + 190 - var8.getStringWidth(Hair) / 2, guiTop + 5 + i * 10, 0);
                }
                String s = JRMCoreH.trl("jrmc", "CustomHair");
                sw = this.fontRendererObj.getStringWidth(s) / 2;
                if (HairSlcted == 12) {
                    this.buttonList.add(new JRMCoreGuiButtons01(5100, guiLeft2 + 190 - sw, guiTop + 5 + i * 10, sw, s, JRMCoreH.techNCCol[1]).setShadow(false));
                }
            }
            ++i;
            if (CanColor) {
                String s = JRMCoreH.trl("jrmc", "Color");
                sw = this.fontRendererObj.getStringWidth(s) / 2;
                this.buttonList.add(new JRMCoreGuiButtons01(4, guiLeft2 + 190 - sw, guiTop + 5 + i * 10, sw, s, JRMCoreH.techNCCol[1]).setShadow(false));
            }
            if (RaceSlcted != 4 && RaceSlcted != 3) {
                float h2 = (float)(ColorSlcted >> 16 & 0xFF) / 255.0f;
                float h3 = (float)(ColorSlcted >> 8 & 0xFF) / 255.0f;
                float h4 = (float)(ColorSlcted & 0xFF) / 255.0f;
                float h1 = 1.0f;
                GL11.glColor4f((float)(h1 * h2), (float)(h1 * h3), (float)(h1 * h4), (float)1.0f);
                JRMCoreGuiScreen.mc.renderEngine.bindTexture(new ResourceLocation(button1));
                this.drawTexturedModalRect(guiLeft2 + 190 - 25, guiTop + 4 + i * 10, 0, 0, 50, 10);
            } else if (RaceSlcted == 4) {
                String TransNms = TRState + ": " + JRMCoreH.cldgy + JRMCoreH.trl("jrmc", JRMCoreH.TransNms[RaceSlcted][JRMCoreH.State]);
                this.buttonList.add(new JRMCoreGuiButtonsA2(-4999, guiLeft2 + 130, guiTop + 5 + i * 10 - 1, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(4999, guiLeft2 + 240, guiTop + 5 + i * 10 - 1, ">"));
                var8.drawString(TransNms, guiLeft2 + 190 - var8.getStringWidth(TransNms) / 2, guiTop + 5 + i * 10, 0);
            }
            ++i;
            if (GenderSlcted == 1) {
                this.buttonList.add(new JRMCoreGuiSlider01(5001, guiLeft2 + 190 - 25, guiTop + 4 + i * 10, 50, 10, "", (float)BreastSizeSlcted * 0.1f, 1.0f));
            }
            ++i;
            if (CanYears) {
                this.buttonList.add(new JRMCoreGuiButtonsA2(-8, guiLeft2 + 130, guiTop + 5 + i * 10, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(8, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
                var8.drawString(Years, guiLeft2 + 190 - var8.getStringWidth(Years) / 2, guiTop + 5 + i * 10, 0);
            }
            ++i;
            if (RaceSlcted == 2) {
                String s = Tail + " " + (tail ? JRMCoreH.trl("jrmc", "Enabled") : JRMCoreH.trl("jrmc", "Disabled"));
                int sw6 = this.fontRendererObj.getStringWidth(s) / 2;
                this.buttonList.add(new JRMCoreGuiButtons01(106, guiLeft2 + 190 - sw6, guiTop + 5 + i * 10, sw6, s, tail ? 3452672 : 0x404040).setShadow(false));
            }
            ++i;
            if (canCustom) {
                this.buttonList.add(new JRMCoreGuiButtonsA2(-5002, guiLeft2 + 130, guiTop + 5 + i * 10, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(5002, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
            }
            var8.drawString(SkinTyp, guiLeft2 + 190 - var8.getStringWidth(SkinTyp) / 2, guiTop + 5 + i * 10, 0);
            ++i;
            boolean fc = false;
            if (SkinTypeSlcted == 1) {
                if (SkinTypeSlcted == 1) {
                    String Special = JRMCoreH.trl("jrmc", "BodyType") + " " + (BodyTypeSlcted + 1);
                    var8.drawString(Special, guiLeft2 + 190 - var8.getStringWidth(Special) / 2, guiTop + 5 + i * 10, 0);
                    this.buttonList.add(new JRMCoreGuiButtonsA2(-5, guiLeft2 + 130, guiTop + 5 + i * 10, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(5, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(-5012, guiLeft2 + 130, guiTop + 5 + ++i * 10, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(5012, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
                    int cls = JRMCoreH.customSknLimits[RaceSlcted][1];
                    if (cls >= 1) {
                        this.buttonList.add(new JRMCoreGuiButtonC1(5003, guiLeft2 + 190 - 10 + ((cls - 1) * -10 - (cls > 1 ? cls - 2 : 0)), guiTop + 5 - 1 + i * 10, 20, 10, "", BodyColMainSlcted));
                    }
                    if (cls >= 2) {
                        this.buttonList.add(new JRMCoreGuiButtonC1(5004, guiLeft2 + 190 - 10 + ((cls - 1) * -10 - (cls > 1 ? cls - 2 : 0) + 21), guiTop + 5 - 1 + i * 10, 20, 10, "", BodyColSub1Slcted));
                    }
                    if (cls >= 3) {
                        this.buttonList.add(new JRMCoreGuiButtonC1(5005, guiLeft2 + 190 - 10 + ((cls - 1) * -10 - (cls > 1 ? cls - 2 : 0) + 42), guiTop + 5 - 1 + i * 10, 20, 10, "", BodyColSub2Slcted));
                    }
                    if (cls >= 4) {
                        this.buttonList.add(new JRMCoreGuiButtonC1(5014, guiLeft2 + 190 - 10 + ((cls - 1) * -10 - (cls > 1 ? cls - 2 : 0) + 63), guiTop + 5 - 1 + i * 10, 20, 10, "", BodyColSub3Slcted));
                    }
                    int fcs = ++i;
                    this.buttonList.add(new JRMCoreGuiButtonsA2(-5006, guiLeft2 + 130, guiTop + 5 + i * 10, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(5006, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
                    String Special2 = JRMCoreH.trl("jrmc", "Nose") + " " + (FaceNoseSlcted + 1);
                    var8.drawString(Special2, guiLeft2 + 190 - var8.getStringWidth(Special2) / 2, guiTop + 5 + i * 10, 0);
                    Special2 = JRMCoreH.trl("jrmc", "Mouth") + " " + (FaceMouthSlcted + 1);
                    var8.drawString(Special2, guiLeft2 + 190 - var8.getStringWidth(Special2) / 2, guiTop + 5 + ++i * 10, 0);
                    this.buttonList.add(new JRMCoreGuiButtonsA2(-5007, guiLeft2 + 130, guiTop + 5 + i * 10, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(5007, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
                    Special2 = JRMCoreH.trl("jrmc", "Eyes") + " " + (EyesSlcted + 1);
                    var8.drawString(Special2, guiLeft2 + 190 - var8.getStringWidth(Special2) / 2, guiTop + 5 + ++i * 10, 0);
                    this.buttonList.add(new JRMCoreGuiButtonsA2(-5008, guiLeft2 + 130, guiTop + 5 + i * 10, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(5008, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
                    ++i;
                    cls = JRMCoreH.customSknLimits[RaceSlcted][5];
                    if (cls != 0) {
                        this.buttonList.add(new JRMCoreGuiButtonsA2(-5013, guiLeft2 + 130, guiTop + 5 + i * 10, "<"));
                        this.buttonList.add(new JRMCoreGuiButtonsA2(5013, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
                    }
                    if (cls >= 1) {
                        this.buttonList.add(new JRMCoreGuiButtonC1(5009, guiLeft2 + 190 - 10 + ((cls - 1) * -10 - (cls > 1 ? cls - 2 : 0)), guiTop + 5 - 1 + i * 10, 20, 10, "", EyeCol1Slcted));
                    }
                    if (cls >= 2) {
                        this.buttonList.add(new JRMCoreGuiButtonC1(5010, guiLeft2 + 190 - 10 + ((cls - 1) * -10 - (cls > 1 ? cls - 2 : 0) + 21), guiTop + 5 - 1 + i * 10, 20, 10, "", EyeCol2Slcted));
                        String s = JRMCoreH.trl("jrmc", "Match");
                        int sw7 = this.fontRendererObj.getStringWidth(s) / 2;
                        this.buttonList.add(new JRMCoreGuiButtons01(5011, guiLeft2 + 190 - sw7, guiTop + 5 + ++i * 10, sw7, s, JRMCoreH.techNCCol[1]).setShadow(false));
                    }
                    fc = JRMCoreGuiScreen.hovered(x, y, guiLeft2 + 130, guiTop + 5 + fcs * 10 + 2, 120, 7 + ++i * 3);
                }
            } else {
                int cls = JRMCoreH.customSknLimits[RaceSlcted][1];
                if (cls >= 2) {
                    this.buttonList.add(new JRMCoreGuiButtonC1(5004, guiLeft2 + 190 - 10 + ((cls - 0) * -10 - (cls > 1 ? cls - 1 : 0) + 21), guiTop + 5 - 1 + i * 10, 20, 10, "", BodyColSub1Slcted));
                }
            }
            if (RaceSlcted == 1 && !tail) {
                tail = true;
                JRMCoreH.Char((byte)103, tail ? (byte)1 : 0);
            }
            int k = guiLeft2;
            int l = guiTop;
            JRMCoreClient.mc.mouseHelper.mouseXYChange();
            float posXm = (float)Mouse.getX() * 1.0f / ((float)JRMCoreClient.mc.displayWidth * 1.0f);
            float posYm = (float)Mouse.getY() * 1.0f / ((float)JRMCoreClient.mc.displayHeight * 1.0f);
            int mouseX = (int)((float)var6 * posXm);
            int mouseY = var7 - (int)((float)var7 * posYm);
            if (fc) {
                JRMCoreGuiScreen.func_110423_a(k + 51, l + 155 + 190, 180, (float)(k + 51) - this.xSize_lo, (float)(l + 80) - this.ySize_lo, (EntityLivingBase)JRMCoreGuiScreen.mc.thePlayer, false, false, false);
            } else {
                JRMCoreGuiScreen.func_110423_a_I(k + 51, l + 155, 60, (float)(k + 51) - this.xSize_lo, (float)(l + 80) - this.ySize_lo, (EntityLivingBase)JRMCoreGuiScreen.mc.thePlayer);
            }
            String s = JRMCoreH.trl("jrmc", "Appearance");
            int sw8 = this.fontRendererObj.getStringWidth(s) / 2;
            var8.drawString(s, guiLeft2 + 7, guiTop + 5, 0);
        }
        ufc = false;
        if (this.isGUIOpen(19)) {
            xSize2 = 256;
            ySize2 = 159;
            guiLeft2 = (this.width - xSize2) / 2;
            guiTop = (this.height - ySize2) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            guiLocation = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation);
            this.drawTexturedModalRect(guiLeft2, guiTop, 0, 0, xSize2, ySize2);
            this.buttonList.add(new JRMCoreGuiButtons00(10, posX - 150, posY + 65, 20, 20, "X", 0));
            String n = JRMCoreH.trl("jrmc", "Accept");
            int nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(16, posX + 130, posY + 65, nw, 20, n, 0));
            boolean fc = false;
            int i = 0;
            int fcs = ++i;
            int cls = 4;
            this.buttonList.add(new JRMCoreGuiButtonsA2(-5016, guiLeft2 + 130, guiTop + 5 + i * 10, "<"));
            this.buttonList.add(new JRMCoreGuiButtonsA2(-5016, guiLeft2 + 240, guiTop + 5 + i * 10, ">"));
            this.buttonList.add(new JRMCoreGuiButtonC1(5016, guiLeft2 + 190 - 10 + ((cls - 1) * -10 - (cls > 1 ? cls - 2 : 0)), guiTop + 5 - 1 + i * 10, 20, 10, "", BodyauColMainSlcted));
            this.buttonList.add(new JRMCoreGuiButtonC1(5017, guiLeft2 + 190 - 10 + ((cls - 1) * -10 - (cls > 1 ? cls - 2 : 0) + 21), guiTop + 5 - 1 + i * 10, 20, 10, "", BodyauColSub1Slcted));
            this.buttonList.add(new JRMCoreGuiButtonC1(5018, guiLeft2 + 190 - 10 + ((cls - 1) * -10 - (cls > 1 ? cls - 2 : 0) + 42), guiTop + 5 - 1 + i * 10, 20, 10, "", BodyauColSub2Slcted));
            this.buttonList.add(new JRMCoreGuiButtonC1(5019, guiLeft2 + 190 - 10 + ((cls - 1) * -10 - (cls > 1 ? cls - 2 : 0) + 63), guiTop + 5 - 1 + i * 10, 20, 10, "", BodyauColSub3Slcted));
            fc = JRMCoreGuiScreen.hovered(x, y, guiLeft2 + 130, guiTop + 5 + fcs * 10 + 2, 120, 7 + ++i * 3);
            ufc = true;
            int k = guiLeft2;
            int l = guiTop;
            JRMCoreClient.mc.mouseHelper.mouseXYChange();
            float posXm = (float)Mouse.getX() * 1.0f / ((float)JRMCoreClient.mc.displayWidth * 1.0f);
            float posYm = (float)Mouse.getY() * 1.0f / ((float)JRMCoreClient.mc.displayHeight * 1.0f);
            int mouseX = (int)((float)var6 * posXm);
            int mouseY = var7 - (int)((float)var7 * posYm);
            if (fc) {
                JRMCoreGuiScreen.func_110423_a(k + 51, l + 155 + 190, 180, (float)(k + 51) - this.xSize_lo, (float)(l + 80) - this.ySize_lo, (EntityLivingBase)JRMCoreGuiScreen.mc.thePlayer, false, false, false);
            } else {
                JRMCoreGuiScreen.func_110423_a_I(k + 51, l + 155, 60, (float)(k + 51) - this.xSize_lo, (float)(l + 80) - this.ySize_lo, (EntityLivingBase)JRMCoreGuiScreen.mc.thePlayer);
            }
            String s = JRMCoreH.trl("jrmc", "ArcosianUltimateColor");
            sw = this.fontRendererObj.getStringWidth(s) / 2;
            var8.drawString(s, guiLeft2 + 7, guiTop + 5, 0);
        }
        String[] hcp = new String[]{JRMCoreH.trl("jrmc", "FrontHead"), JRMCoreH.trl("jrmc", "RightHead"), JRMCoreH.trl("jrmc", "LeftHead"), JRMCoreH.trl("jrmc", "BackHead"), JRMCoreH.trl("jrmc", "TopHead")};
        if (this.guiID >= 20 && this.guiID <= 24) {
            this.curPage = this.guiID - 20;
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop2 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation2 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation2);
            this.drawTexturedModalRect(guiLeft, guiTop2, 0, 0, xSize, ySize);
            int i = 0;
            int k = guiLeft;
            int l2 = guiTop2;
            JRMCoreGuiScreen.hairCheck(k + 25 - 25, l2 + 220 + 45, 80, (float)(k + 150) - this.xSize_lo, (float)(l2 + 80) - this.ySize_lo, (EntityLivingBase)(ItemBarberSnC.barberTarget == null ? JRMCoreGuiScreen.mc.thePlayer : ItemBarberSnC.barberTarget), this.curPage);
            var8.drawString(hcp[this.curPage], guiLeft + 7, guiTop2 + 5, 0);
            if (!headRoton) {
                String n = JRMCoreH.trl("jrmc", "Yaw");
                int nw = this.fontRendererObj.getStringWidth(n) + 8;
                var8.drawString(n, guiLeft + 15 + 4, guiTop2 + 15 + 2 + i * 10, 0);
                this.buttonList.add(new JRMCoreGuiButtonsA2(5160, guiLeft + 5, guiTop2 + 15 + i * 11, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(5161, guiLeft + 15 + nw, guiTop2 + 15 + i * 11, ">"));
                n = JRMCoreH.trl("jrmc", "Pitch");
                nw = this.fontRendererObj.getStringWidth(n) + 8;
                var8.drawString(n, guiLeft + 15 + 4, guiTop2 + 15 + 2 + ++i * 10, 0);
                this.buttonList.add(new JRMCoreGuiButtonsA2(5164, guiLeft + 5, guiTop2 + 15 + i * 11, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(5165, guiLeft + 15 + nw, guiTop2 + 15 + i * 11, ">"));
                ++i;
            }
            if (JRMCoreH.DBC()) {
                String n = JRMCoreH.trl("jrmc", "Preview");
                int nw = this.fontRendererObj.getStringWidth(n) + 8;
                var8.drawString(n, guiLeft + 15 + 4, guiTop2 + 15 + 2 + i * 10, 0);
                this.buttonList.add(new JRMCoreGuiButtonsA2(5169, guiLeft + 5, guiTop2 + 15 + i * 11, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(5168, guiLeft + 15 + nw, guiTop2 + 15 + i * 11, ">"));
            }
            ++i;
            if (!headRoton) {
                this.buttonList.add(new JRMCoreGuiButtonsA1(5166, guiLeft + 25, guiTop2 + 15 + i * 11, "x"));
            }
            this.buttonList.add(new JRMCoreGuiButtonsA1(5167, guiLeft + 5, guiTop2 + 15 + i * 11, "o"));
            int[][] posH = new int[][]{{0, 1, 2, 3, 0, 1, 2, 0, 1, 0}, {0, 1, 2, 3, 1, 2, 3, 2, 3, 3}, {3, 2, 1, 0, 3, 2, 1, 0, 3, 2, 1, 0, 3, 2, 1, 0}, {0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3}};
            int[][] posV = new int[][]{{0, 0, 0, 0, 1, 1, 1, 2, 2, 3}, {0, 0, 0, 0, 1, 1, 1, 2, 2, 3}, {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, {3, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0, 0}};
            String rot = JRMCoreH.trl("jrmc", "hairRotations");
            String xax = JRMCoreH.trl("jrmc", "hairXaxis");
            String yax = JRMCoreH.trl("jrmc", "hairYaxis");
            String zax = JRMCoreH.trl("jrmc", "hairZaxis");
            String len = JRMCoreH.trl("jrmc", "hairLength");
            String ben = JRMCoreH.trl("jrmc", "hairBend");
            String bpo = JRMCoreH.trl("jrmc", "hairBendpoint");
            String trf = JRMCoreH.trl("jrmc", "hairTransf");
            String tir = JRMCoreH.trl("jrmc", "hairTier");
            String trd = JRMCoreH.trl("jrmc", "hairTierDesc");
            String hde = JRMCoreH.trl("jrmc", "hairHide");
            String shw = JRMCoreH.trl("jrmc", "hairShow");
            String res = JRMCoreH.trl("jrmc", "hairReset");
            String dal = JRMCoreH.trl("jrmc", "hairDoAllOn");
            String dad = JRMCoreH.trl("jrmc", "hairDoAllDesc");
            String daf = JRMCoreH.trl("jrmc", "hairDoAllOff");
            if (dnsH.length() == 786) {
                int hid = this.hcl[this.curPage] * 10;
                int pidh = 0;
                int pidv = 0;
                int chid = 0;
                for (int face = this.hcl[this.curPage]; face < this.hcl[this.curPage + 1]; ++face) {
                    boolean now;
                    int l = JRMCoreH.dnsHair2(dnsH, face * 14);
                    int X = JRMCoreH.dnsHair2(dnsH, face * 14 + 2);
                    int Y = JRMCoreH.dnsHair2(dnsH, face * 14 + 4);
                    int Z = JRMCoreH.dnsHair2(dnsH, face * 14 + 6);
                    int B = JRMCoreH.dnsHair2(dnsH, face * 14 + 8);
                    int P = JRMCoreH.dnsHair2(dnsH, face * 14 + 10);
                    int T = JRMCoreH.dnsHair2(dnsH, face * 14 + 12);
                    int n = X > 82 ? 82 : (X = X < 18 ? 18 : X);
                    int n2 = Y > 82 ? 82 : (Y = Y < 18 ? 18 : Y);
                    int n3 = Z > 82 ? 82 : (Z = Z < 18 ? 18 : Z);
                    int n4 = B > 82 ? 82 : (B = B < 18 ? 18 : B);
                    int n5 = P > 82 ? 82 : (P = P < 18 ? 18 : P);
                    T = T > 82 ? 82 : (T < 18 ? 18 : T);
                    int x2 = X - 50;
                    int y2 = Y - 50;
                    int z2 = Z - 50;
                    int b2 = B - 50;
                    int p2 = P - 50;
                    int t2 = T - 50;
                    int L2 = (int)((float)l / 2.8f) + 1;
                    X = (int)((float)(X - 18) * 1.56f);
                    Y = (int)((float)(Y - 18) * 1.56f);
                    Z = (int)((float)(Z - 18) * 1.56f);
                    B = (int)((float)(B - 18) * 1.56f);
                    P = (int)((float)(P - 18) * 1.56f);
                    T = (int)((float)(T - 18) * 1.56f);
                    int pH = this.curPage == 0 ? pidh : posH[this.curPage - 1][chid];
                    int pV = this.curPage == 0 ? pidv : posV[this.curPage - 1][chid];
                    boolean bl = now = this.hbt == null || this.hbt[face] == 0;
                    if (now && l != 0) {
                        this.buttonList.add(new JRMCoreGuiSlider02(5200 + hid, guiLeft + 80 + 0 + pH * 45, guiTop2 + 5 + pV * 38, 5, 35, "", (float)X * 0.01f, 1.0f, this.dfa[this.curPage] == 1 && chid == 0 ? 0xE0E0E0 : 0));
                        JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(tir + " 1\n " + rot + "\n " + xax + ": " + x2, new Object[0]), guiLeft + 80 + 0 + pH * 45, guiTop2 + 5 + pV * 38 + 2, 5, 35, x, y, this.fontRendererObj);
                    }
                    ++hid;
                    if (now && l != 0) {
                        this.buttonList.add(new JRMCoreGuiSlider02(5200 + hid, guiLeft + 80 + 7 + pH * 45, guiTop2 + 5 + pV * 38, 5, 35, "", (float)Y * 0.01f, 1.0f, this.dfa[this.curPage] == 1 && chid == 0 ? 0xE0E0E0 : 0));
                        JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(tir + " 1\n " + rot + "\n " + yax + ": " + y2, new Object[0]), guiLeft + 80 + 7 + pH * 45, guiTop2 + 5 + pV * 38 + 2, 5, 35, x, y, this.fontRendererObj);
                    }
                    ++hid;
                    if (now && l != 0) {
                        this.buttonList.add(new JRMCoreGuiSlider02(5200 + hid, guiLeft + 80 + 14 + pH * 45, guiTop2 + 5 + pV * 38, 5, 35, "", (float)Z * 0.01f, 1.0f, this.dfa[this.curPage] == 1 && chid == 0 ? 0xE0E0E0 : 0));
                        JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(tir + " 1\n " + rot + "\n " + zax + ": " + z2, new Object[0]), guiLeft + 80 + 14 + pH * 45, guiTop2 + 5 + pV * 38 + 2, 5, 35, x, y, this.fontRendererObj);
                    }
                    ++hid;
                    if (now && l != 0) {
                        this.buttonList.add(new JRMCoreGuiSlider02(5200 + hid, guiLeft + 80 + 21 + pH * 45, guiTop2 + 5 + pV * 38, 5, 35, "", (float)l * 0.01f, 1.0f, this.dfa[this.curPage] == 1 && chid == 0 ? 0xE0E0E0 : 0));
                        JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(tir + " 1\n " + len + ": " + L2, new Object[0]), guiLeft + 80 + 21 + pH * 45, guiTop2 + 5 + pV * 38 + 2, 5, 35, x, y, this.fontRendererObj);
                    }
                    this.buttonList.add(new JRMCoreGuiButtonsA2(5200 + ++hid, guiLeft + 80 + 28 + pH * 45, guiTop2 + 5 + pV * 38, l != 0 ? "o" : "<"));
                    JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct((l != 0 ? hde : shw) + "\n" + face, new Object[0]), guiLeft + 80 + 28 + pH * 45, guiTop2 + 5 + pV * 38 + 2, 10, 9, x, y, this.fontRendererObj);
                    this.buttonList.add(new JRMCoreGuiButtonsA2(5200 + ++hid, guiLeft + 80 + 28 + pH * 45, guiTop2 + 31 + pV * 38, "x"));
                    JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(res, new Object[0]), guiLeft + 80 + 28 + pH * 45, guiTop2 + 31 + pV * 38 + 2, 10, 9, x, y, this.fontRendererObj);
                    ++hid;
                    if (l != 0) {
                        this.buttonList.add(new JRMCoreGuiButtonsA2(5200 + hid, guiLeft + 80 + 28 + pH * 45, guiTop2 + 18 + pV * 38, now ? "(|)" : "(||)"));
                        JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct((now ? tir + " 1" : tir + " 2") + "\n" + trd, new Object[0]), guiLeft + 80 + 28 + pH * 45, guiTop2 + 18 + pV * 38 + 2, 10, 9, x, y, this.fontRendererObj);
                    }
                    ++hid;
                    if (!now && l != 0) {
                        this.buttonList.add(new JRMCoreGuiSlider02(5200 + hid, guiLeft + 80 + 0 + pH * 45, guiTop2 + 5 + pV * 38, 5, 35, "", (float)B * 0.01f, 1.0f, this.dfa[this.curPage] == 1 && chid == 0 ? 0xE0E0E0 : 0));
                        JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(tir + " 2\n " + ben + ": " + b2, new Object[0]), guiLeft + 80 + 0 + pH * 45, guiTop2 + 5 + pV * 38 + 2, 5, 35, x, y, this.fontRendererObj);
                    }
                    ++hid;
                    if (!now && l != 0) {
                        this.buttonList.add(new JRMCoreGuiSlider02(5200 + hid, guiLeft + 80 + 7 + pH * 45, guiTop2 + 5 + pV * 38, 5, 35, "", (float)P * 0.01f, 1.0f, this.dfa[this.curPage] == 1 && chid == 0 ? 0xE0E0E0 : 0));
                        JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(tir + " 2\n " + bpo + ": " + p2, new Object[0]), guiLeft + 80 + 7 + pH * 45, guiTop2 + 5 + pV * 38 + 2, 5, 35, x, y, this.fontRendererObj);
                    }
                    ++hid;
                    if (!now && l != 0) {
                        this.buttonList.add(new JRMCoreGuiSlider02(5200 + hid, guiLeft + 80 + 14 + pH * 45, guiTop2 + 5 + pV * 38, 5, 35, "", (float)T * 0.01f, 1.0f, this.dfa[this.curPage] == 1 && chid == 0 ? 0xE0E0E0 : 0));
                        JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(tir + " 2\n " + trf + ": " + t2, new Object[0]), guiLeft + 80 + 14 + pH * 45, guiTop2 + 5 + pV * 38 + 2, 5, 35, x, y, this.fontRendererObj);
                    }
                    ++hid;
                    ++chid;
                    if (++pidh > 3) {
                        ++pidv;
                    }
                    pidh = pidh > 3 ? 0 : pidh;
                }
                this.buttonList.add(new JRMCoreGuiButtonsA2(5999, guiLeft + 80 - 12, guiTop2 + 5, this.dfa[this.curPage] != 0 ? "o" : ">"));
                JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct((this.dfa[this.curPage] != 0 ? dal : daf) + "\n" + dad, new Object[0]), guiLeft + 80 - 12, guiTop2 + 5 + 1, 10, 9, x, y, this.fontRendererObj);
                ++hid;
            } else {
                String n = JRMCoreH.trl("jrmc", "BaseHair");
                int nw = this.fontRendererObj.getStringWidth(n) + 8;
                this.buttonList.add(new JRMCoreGuiButtons00(5199, guiLeft - 2 - nw, guiTop2 + 10, nw, 20, n, 0));
            }
            if (this.curPage == 0) {
                if (!canSavePreset) {
                    canSavePreset = true;
                }
                for (String pres : PresetList) {
                    if (!pres.equals(dnsH)) continue;
                    canSavePreset = false;
                }
                i = 0;
                String s = JRMCoreH.trl("jrmc", "Preset") + " " + HairPrstsSlcted;
                int sw9 = this.fontRendererObj.getStringWidth(s);
                var8.drawString(s, guiLeft + 5 + 70 + 4, guiTop2 + 5 + 50 + i * 11, 0);
                this.buttonList.add(new JRMCoreGuiButtonsA2(-5155, guiLeft + 5 + 70 - 7, guiTop2 + 5 + 50 - 2 + i * 11, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(5155, guiLeft + 5 + 70 + 4 + sw9, guiTop2 + 5 + 50 - 2 + i * 11, ">"));
                var8.drawString("G" + JRMCoreH.dnsHairG(PresetList.get(HairPrstsSlcted)), guiLeft + 5 + 70 + 4 + sw9 + 12, guiTop2 + 5 + 50 + i * 11, 0);
                ++i;
                s = JRMCoreH.trl("jrmc", "SavePreset");
                sw9 = this.fontRendererObj.getStringWidth(s) / 2;
                if (canSavePreset) {
                    this.buttonList.add(new JRMCoreGuiButtons01(5156, guiLeft + 5 + 70, guiTop2 + 5 + 50 + i * 11, sw9, s, JRMCoreH.techNCCol[1]).setShadow(false));
                    ++i;
                }
                s = JRMCoreH.trl("jrmc", "DelPreset");
                sw9 = this.fontRendererObj.getStringWidth(s) / 2;
                if (HairPrstsSlcted > JRMCoreH.defHairPrsts.length - 1) {
                    this.buttonList.add(new JRMCoreGuiButtons01(5157, guiLeft + 5 + 70, guiTop2 + 5 + 60 + i * 11, sw9, s, JRMCoreH.techNCCol[1]).setShadow(false));
                    ++i;
                }
            }
            String n = JRMCoreH.trl("jrmc", "Back");
            int nw = this.fontRendererObj.getStringWidth(n) + 8;
            if (this.curPage != 0) {
                this.buttonList.add(new JRMCoreGuiButtons00(5151, guiLeft - 2 - nw, guiTop2 + 120, nw, 20, n, 0));
            }
            n = JRMCoreH.trl("jrmc", "Next");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            if (this.curPage < hcp.length - 1) {
                this.buttonList.add(new JRMCoreGuiButtons00(5150, guiLeft + 258, guiTop2 + 120, nw, 20, n, 0));
            }
            n = JRMCoreH.trl("jrmc", "Done");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(5152, guiLeft + 258, guiTop2 + 145, nw, 20, n, 0));
            String hsd = JRMCoreH.trl("jrmc", "HairSalonDesc");
            String hhd = JRMCoreH.trl("jrmc", "HairShareDesc");
            String hpd = JRMCoreH.trl("jrmc", "HairPasteDesc");
            String hrd = JRMCoreH.trl("jrmc", "HairResetDesc");
            i = 0;
            n = JRMCoreH.trl("jrmc", "HairSalon");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(5159, guiLeft + 258, guiTop2 + i * 25, nw, 20, n, 0));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(hsd, new Object[0]), guiLeft + 258, guiTop2 + i * 25 + 2, nw, 20, x, y, this.fontRendererObj);
            n = JRMCoreH.trl("jrmc", "Share");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(5153, guiLeft + 258, guiTop2 + ++i * 25, nw, 20, n, 0));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(hhd, new Object[0]), guiLeft + 258, guiTop2 + i * 25 + 2, nw, 20, x, y, this.fontRendererObj);
            n = JRMCoreH.trl("jrmc", "Paste");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(5154, guiLeft + 258, guiTop2 + ++i * 25, nw, 20, n, 0));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(hpd, new Object[0]), guiLeft + 258, guiTop2 + i * 25 + 2, nw, 20, x, y, this.fontRendererObj);
            n = JRMCoreH.trl("jrmc", "Reset");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(5158, guiLeft + 258, guiTop2 + ++i * 25, nw, 20, n, 0));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(hrd, new Object[0]), guiLeft + 258, guiTop2 + i * 25 + 2, nw, 20, x, y, this.fontRendererObj);
            ++i;
        }
        if (this.isGUIOpen(1)) {
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop3 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation3 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation3);
            this.drawTexturedModalRect(guiLeft, guiTop3, 0, 0, xSize, ySize);
            int a = 0;
            for (int X = 0; X < 128; ++X) {
                for (int Y = 0; Y < 128; ++Y) {
                    Color i = Color.getHSBColor((float)X * 2.0f / 255.0f, (float)Y * 2.0f / 255.0f, BrghtSlcted);
                    int cc = i.getRed() * 65536 + i.getGreen() * 256 + i.getBlue();
                    if (colorType == 5015 && cc == 0) {
                        a = 0xA8FFFF;
                        if (JRMCoreH.align <= 66 && JRMCoreH.align >= 33) {
                            a = 14526719;
                        }
                        if (JRMCoreH.align < 33) {
                            a = 0xFE0000;
                        }
                        this.buttonList.add(new JRMCoreGuiButtonC(-4, guiLeft + 5 + X, guiTop3 + 5 + Y, 1, 1, "", cc, a));
                        continue;
                    }
                    this.buttonList.add(new JRMCoreGuiButtonC(-4, guiLeft + 5 + X, guiTop3 + 5 + Y, 1, 1, "", cc));
                }
            }
            if (colorType == 5015 && BrghtSlcted == 0.0f) {
                var8.drawString(JRMCoreH.trl("jrmc", "AlignmentBased"), guiLeft + 5, guiTop3 + 140, 0);
            }
            this.buttonList.add(new JRMCoreGuiSlider00(20, guiLeft + 135, guiTop3 + 5, "", BrghtSlcted, 1.0f));
            int clr = 0;
            if (this.inputField2Cl == 4) {
                clr = ColorSlcted;
            } else if (this.inputField2Cl == 5015) {
                clr = KiColorSlcted;
            } else if (this.inputField2Cl == 5003) {
                clr = BodyColMainSlcted;
            } else if (this.inputField2Cl == 5004) {
                clr = BodyColSub1Slcted;
            } else if (this.inputField2Cl == 5005) {
                clr = BodyColSub2Slcted;
            } else if (this.inputField2Cl == 5014) {
                clr = BodyColSub3Slcted;
            } else if (this.inputField2Cl == 5009) {
                clr = EyeCol1Slcted;
            } else if (this.inputField2Cl == 5010) {
                clr = EyeCol2Slcted;
            } else if (this.inputField2Cl == 5016) {
                clr = BodyauColMainSlcted;
            } else if (this.inputField2Cl == 5017) {
                clr = BodyauColSub1Slcted;
            } else if (this.inputField2Cl == 5018) {
                clr = BodyauColSub2Slcted;
            } else if (this.inputField2Cl == 5019) {
                clr = BodyauColSub3Slcted;
            }
            float h2 = (float)(clr >> 16 & 0xFF) / 255.0f;
            float h3 = (float)(clr >> 8 & 0xFF) / 255.0f;
            float h4 = (float)(clr & 0xFF) / 255.0f;
            float h1 = 1.0f;
            GL11.glColor4f((float)(h1 * h2), (float)(h1 * h3), (float)(h1 * h4), (float)1.0f);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(new ResourceLocation(button1));
            this.drawTexturedModalRect(guiLeft + 180, guiTop3 + 65, 0, 0, 50, 10);
            String[] rgb = new String[]{"Red", "Green", "Blue"};
            for (int id = 0; id < this.inputField2.length; ++id) {
                String s = rgb[id] + ":";
                int sw10 = this.fontRendererObj.getStringWidth(s) / 2;
                var8.drawString(s, guiLeft + 158, guiTop3 + 15 + id * 15, 0);
                this.nametf(var8, id, 0, 0);
                if (this.inputField2[id] == null) continue;
                this.inputField2[id].xPosition = guiLeft + 195;
                this.inputField2[id].yPosition = guiTop3 + 15 + id * 15;
                this.inputField2[id].drawTextBox();
            }
            String s = "Get RGB Color";
            int sw11 = this.fontRendererObj.getStringWidth(s) / 2;
            this.buttonList.add(new JRMCoreGuiButtons01(33000, guiLeft + 205 - sw11, guiTop3 + 80, sw11, s, JRMCoreH.techNCCol[1]).setShadow(false));
            String n = JRMCoreH.trl("jrmc", "Back");
            int nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(0, posX - 130 - nw, posY + 65, nw, 20, n, 0));
        } else if (this.isGUIOpen(2)) {
            String AttrDesc;
            String startAttr;
            String statAttr;
            String Stat;
            String statNam;
            int stat;
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop4 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation4 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation4);
            this.drawTexturedModalRect(guiLeft, guiTop4, 0, 0, xSize, ySize);
            String n = JRMCoreH.trl("jrmc", "Back");
            int nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(0, posX - 130 - nw, posY + 65, nw, 20, n, 0));
            n = JRMCoreH.trl("jrmc", "Next");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(12, posX + 130, posY + 65, nw, 20, n, 0));
            if (JRMCoreH.Allow(JRMCoreH.PwrtypAllow[PwrtypSlcted])) {
                CanPwr = true;
            } else {
                PwrtypSlcted = 0;
                CanPwr = false;
            }
            if (JRMCoreH.Allow(JRMCoreH.PwrtypAllow[PwrtypSlcted]) && PwrtypSlcted != 3) {
                CanClass = true;
            } else {
                ClassSlcted = 0;
                CanClass = false;
            }
            if (JRMCoreGuiScreen.cl().length - 1 < ClassSlcted) {
                ClassSlcted = 0;
            }
            if (!JRMCoreH.RaceCanHavePwr[RaceSlcted].contains("" + PwrtypSlcted)) {
                PwrtypSlcted = JRMCoreGuiScreen.Slct("B", PwrtypSlcted, JRMCoreH.PwrtypAllow);
            }
            String Pwrtyp = JRMCoreH.trl("jrmc", JRMCoreH.Pwrtyps[PwrtypSlcted]);
            String Class2 = JRMCoreH.trl("jrmc", JRMCoreGuiScreen.cl()[ClassSlcted]);
            String ClassDesc2 = JRMCoreH.trl("jrmc", JRMCoreGuiScreen.clDesc()[ClassSlcted]);
            String Stats = JRMCoreH.trl("jrmc", "Stats");
            String StatIncreaseDesc = JRMCoreH.trl("jrmc", "StatIncreaseDesc");
            String StartAttr = JRMCoreH.trl("jrmc", "StartAttr");
            var8.drawString(JRMCoreH.trl("jrmc", "PowerType"), guiLeft + 5, guiTop4 + 5, 0);
            int i = 1;
            if (CanPwr) {
                boolean yes = false;
                if (JRMCoreH.DBC() || JRMCoreH.NC()) {
                    yes = true;
                } else if (JRMCoreH.SAOC()) {
                    yes = true;
                }
                if (yes) {
                    this.buttonList.add(new JRMCoreGuiButtonsA2(-6, guiLeft + 130 - 125, guiTop4 + 4 + i * 10, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(6, guiLeft + 240 - 125, guiTop4 + 4 + i * 10, ">"));
                }
                String desc = JRMCoreH.trl(PwrtypSlcted == 3 ? "saoc" : "jrmc", JRMCoreH.PwrtypDesc[PwrtypSlcted]);
                int wpos = var8.getStringWidth(Pwrtyp);
                int xpos = guiLeft + 64 - wpos / 2;
                int ypos = guiTop4 + 5 + i * 10;
                JRMCoreGuiScreen.drawDetails(Pwrtyp, desc, xpos, ypos, x, y, var8);
            }
            ++i;
            if (CanClass) {
                this.buttonList.add(new JRMCoreGuiButtonsA2(-7, guiLeft + 130 - 125, guiTop4 + 4 + i * 10, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(7, guiLeft + 240 - 125, guiTop4 + 4 + i * 10, ">"));
                int wpos = var8.getStringWidth(Class2);
                int xpos = guiLeft + 64 - wpos / 2;
                int ypos = guiTop4 + 5 + i * 10;
                JRMCoreGuiScreen.drawDetails(Class2, ClassDesc2, xpos, ypos, x, y, var8);
            }
            ++i;
            if (PwrtypSlcted == 1) {
                int col = KiColorSlcted > 0 ? KiColorSlcted : 0xA8FFFF;
                float h2 = (float)(col >> 16 & 0xFF) / 255.0f;
                float h3 = (float)(col >> 8 & 0xFF) / 255.0f;
                float h4 = (float)(col & 0xFF) / 255.0f;
                float h1 = 1.0f;
                GL11.glColor4f((float)(h1 * h2), (float)(h1 * h3), (float)(h1 * h4), (float)1.0f);
                JRMCoreGuiScreen.mc.renderEngine.bindTexture(new ResourceLocation(button1));
                this.drawTexturedModalRect(guiLeft + 64 - 50 + 1, guiTop4 + 4 + i * 10, 0, 0, 100, 10);
                String s = JRMCoreH.trl("jrmc", "AuraColor");
                int sw12 = this.fontRendererObj.getStringWidth(s) / 2;
                this.buttonList.add(new JRMCoreGuiButtons01(5015, guiLeft + 64 - sw12, guiTop4 + 5 + i * 10, sw12, s, JRMCoreH.techNCCol[1]).setShadow(false));
            }
            var8.drawString(Stats, guiLeft + 5, guiTop4 + 5 + ++i * 10, 0);
            var8.drawString(StartAttr, guiLeft + 5 + 128, guiTop4 + 5 + i * 10, 0);
            ++i;
            int STR = JRMCoreH.attributeStart(PwrtypSlcted, 0, RaceSlcted, ClassSlcted);
            int DEX = JRMCoreH.attributeStart(PwrtypSlcted, 1, RaceSlcted, ClassSlcted);
            int CON = JRMCoreH.attributeStart(PwrtypSlcted, 2, RaceSlcted, ClassSlcted);
            int WIL2 = JRMCoreH.attributeStart(PwrtypSlcted, 3, RaceSlcted, ClassSlcted);
            int MND = JRMCoreH.attributeStart(PwrtypSlcted, 4, RaceSlcted, ClassSlcted);
            int SPI = JRMCoreH.attributeStart(PwrtypSlcted, 5, RaceSlcted, ClassSlcted);
            if (PwrtypSlcted == 1 || PwrtypSlcted == 2) {
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 0, PwrtypSlcted, 0, STR, RaceSlcted, ClassSlcted, 0.0f);
                float inc = JRMCoreH.statInc(PwrtypSlcted, 0, 1, RaceSlcted, ClassSlcted, 0.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[PwrtypSlcted][0]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "STR";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, Float.valueOf(inc)), guiLeft + 5, guiTop4 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "STR: " + JRMCoreH.cldr + STR;
                AttrDesc = JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[PwrtypSlcted][0]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 128, guiTop4 + 5 + i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 1, PwrtypSlcted, 1, DEX, RaceSlcted, ClassSlcted, 0.0f);
                inc = JRMCoreH.statInc(PwrtypSlcted, 1, 1, RaceSlcted, ClassSlcted, 0.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[PwrtypSlcted][1]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "DEX";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, Float.valueOf(inc)), guiLeft + 5, guiTop4 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "DEX: " + JRMCoreH.cldr + DEX;
                AttrDesc = JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[PwrtypSlcted][1]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 128, guiTop4 + 5 + i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 2, PwrtypSlcted, 2, CON, RaceSlcted, ClassSlcted, 0.0f);
                inc = JRMCoreH.statInc(PwrtypSlcted, 2, 1, RaceSlcted, ClassSlcted, 0.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[PwrtypSlcted][2]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "CON";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, Float.valueOf(inc)), guiLeft + 5, guiTop4 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "CON: " + JRMCoreH.cldr + CON;
                AttrDesc = JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[PwrtypSlcted][2]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 128, guiTop4 + 5 + i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 2, PwrtypSlcted, 3, CON, RaceSlcted, ClassSlcted, 0.0f);
                inc = JRMCoreH.statInc(PwrtypSlcted, 3, 1, RaceSlcted, ClassSlcted, 0.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[PwrtypSlcted][3]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "CON";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, Float.valueOf(inc)), guiLeft + 5, guiTop4 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "WIL: " + JRMCoreH.cldr + WIL2;
                AttrDesc = JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[PwrtypSlcted][3]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 128, guiTop4 + 5 + i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 3, PwrtypSlcted, 4, WIL2, RaceSlcted, ClassSlcted, 0.0f);
                inc = JRMCoreH.statInc(PwrtypSlcted, 4, 1, RaceSlcted, ClassSlcted, 0.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[PwrtypSlcted][4]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "WIL";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, Float.valueOf(inc)), guiLeft + 5, guiTop4 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "MND: " + JRMCoreH.cldr + MND;
                AttrDesc = JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[PwrtypSlcted][4]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 128, guiTop4 + 5 + i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 5, PwrtypSlcted, 5, SPI, RaceSlcted, ClassSlcted, JRMCoreH.SklLvl_KiBs(this.pwr));
                inc = JRMCoreH.statInc(PwrtypSlcted, 5, 1, RaceSlcted, ClassSlcted, 0.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[PwrtypSlcted][5]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "SPI";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, Float.valueOf(inc)), guiLeft + 5, guiTop4 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "SPI: " + JRMCoreH.cldr + SPI;
                AttrDesc = JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[PwrtypSlcted][5]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 128, guiTop4 + 5 + i * 10, x, y, var8);
                ++i;
            } else if (PwrtypSlcted == 3) {
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 0, PwrtypSlcted, 0, STR, RaceSlcted, ClassSlcted, 0.0f);
                int inc = (int)JRMCoreH.statInc[PwrtypSlcted][0];
                statNam = JRMCoreH.trl("saoc", JRMCoreH.attrStat[PwrtypSlcted][0]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "STR";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, inc), guiLeft + 5, guiTop4 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "STR: " + JRMCoreH.cldr + STR;
                AttrDesc = JRMCoreH.trl("saoc", JRMCoreH.attrDsc[PwrtypSlcted][0]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 128, guiTop4 + 5 + i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 2, PwrtypSlcted, 2, CON, RaceSlcted, ClassSlcted, 0.0f);
                inc = (int)JRMCoreH.statInc[PwrtypSlcted][2];
                statNam = JRMCoreH.trl("saoc", JRMCoreH.attrStat[PwrtypSlcted][2]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "VIT";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, inc), guiLeft + 5, guiTop4 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "AGI: " + JRMCoreH.cldr + DEX;
                AttrDesc = JRMCoreH.trl("saoc", JRMCoreH.attrDsc[PwrtypSlcted][1]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 128, guiTop4 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "VIT: " + JRMCoreH.cldr + CON;
                AttrDesc = JRMCoreH.trl("saoc", JRMCoreH.attrDsc[PwrtypSlcted][2]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 128, guiTop4 + 5 + ++i * 10, x, y, var8);
                ++i;
            } else {
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 0, PwrtypSlcted, 0, STR, RaceSlcted, ClassSlcted, 0.0f);
                float inc = JRMCoreH.statInc[PwrtypSlcted][0];
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[PwrtypSlcted][0]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "STR";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, Float.valueOf(inc)), guiLeft + 5, guiTop4 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "STR: " + JRMCoreH.cldr + STR;
                AttrDesc = JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[PwrtypSlcted][0]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 128, guiTop4 + 5 + i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 2, PwrtypSlcted, 2, CON, RaceSlcted, ClassSlcted, 0.0f);
                inc = JRMCoreH.statInc[PwrtypSlcted][2];
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[PwrtypSlcted][2]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "CON";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, Float.valueOf(inc)), guiLeft + 5, guiTop4 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "CON: " + JRMCoreH.cldr + CON;
                AttrDesc = JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[PwrtypSlcted][2]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 128, guiTop4 + 5 + i * 10, x, y, var8);
                ++i;
            }
        } else if (this.isGUIOpen(3)) {
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop5 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation5 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation5);
            this.drawTexturedModalRect(guiLeft, guiTop5, 0, 0, xSize, ySize);
            String n = JRMCoreH.trl("jrmc", "Back");
            int nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(11, posX - 130 - nw, posY + 65, nw, 20, n, 0));
            n = JRMCoreH.trl("jrmc", "Accept");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(13, posX + 130, posY + 65, nw, 20, n, 0));
            String Race = JRMCoreH.trl("jrmc", JRMCoreH.Races[RaceSlcted]);
            String Gender = JRMCoreH.trl("jrmc", JRMCoreH.Genders[GenderSlcted]);
            String Hair = JRMCoreH.trl("jrmc", "Hair") + " " + (HairSlcted + 1);
            String Color3 = "" + ColorSlcted;
            String Special = JRMCoreH.trl("jrmc", "BodyType") + " " + (BodyTypeSlcted + 1);
            String Pwrtyp = JRMCoreH.trl("jrmc", JRMCoreH.Pwrtyps[PwrtypSlcted]);
            String Class3 = JRMCoreH.trl("jrmc", JRMCoreGuiScreen.cl()[ClassSlcted]);
            String className = JRMCoreH.trl("jrmc", JRMCoreH.ClassNames[PwrtypSlcted]);
            String SkinTyp = JRMCoreH.trl("jrmc", JRMCoreH.skinTyps[SkinTypeSlcted]);
            int i = 0;
            var8.drawString(JRMCoreH.trl("jrmc", "Race") + ": " + Race, guiLeft + 5, guiTop5 + 5 + i * 10, 0);
            var8.drawString(JRMCoreH.trl("jrmc", "Gender") + ": " + Gender, guiLeft + 5, guiTop5 + 5 + ++i * 10, 0);
            var8.drawString(JRMCoreH.trl("jrmc", "Hair") + ": " + Hair, guiLeft + 5, guiTop5 + 5 + ++i * 10, 0);
            var8.drawString(JRMCoreH.trl("jrmc", "Color") + ": ", guiLeft + 5, guiTop5 + 5 + ++i * 10, 0);
            var8.drawString(JRMCoreH.trl("jrmc", "BodyType") + ": " + SkinTyp, guiLeft + 5, guiTop5 + 5 + ++i * 10, 0);
            var8.drawString(JRMCoreH.trl("jrmc", "PowerType") + ": " + Pwrtyp, guiLeft + 5, guiTop5 + 5 + ++i * 10, 0);
            ++i;
            if (PwrtypSlcted != 3) {
                var8.drawString(className + ": " + Class3, guiLeft + 5, guiTop5 + 5 + i * 10, 0);
            }
            ++i;
            float h2 = (float)(ColorSlcted >> 16 & 0xFF) / 255.0f;
            float h3 = (float)(ColorSlcted >> 8 & 0xFF) / 255.0f;
            float h4 = (float)(ColorSlcted & 0xFF) / 255.0f;
            float h1 = 1.0f;
            GL11.glColor4f((float)(h1 * h2), (float)(h1 * h3), (float)(h1 * h4), (float)1.0f);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(new ResourceLocation(button1));
            this.drawTexturedModalRect(guiLeft + 5 + var8.getStringWidth("Color: "), guiTop5 + 3 + 30, 0, 0, 50, 10);
            int k = guiLeft + xSize / 2;
            int l = guiTop5;
            JRMCoreGuiScreen.func_110423_a_I(k + 51, l + 155, 60, (float)(k + 51) - this.xSize_lo, (float)(l + 120 - 40) - this.ySize_lo, (EntityLivingBase)JRMCoreGuiScreen.mc.thePlayer);
        } else if (this.isGUIOpen(8)) {
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop6 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation6 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation6);
            this.drawTexturedModalRect(guiLeft, guiTop6, 0, 0, xSize, ySize);
            int i = 0;
            if (CanHair) {
                this.buttonList.add(new JRMCoreGuiButtonsA2(-15, guiLeft + 130, guiTop6 + 5 + i * 10, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(15, guiLeft + 240, guiTop6 + 5 + i * 10, ">"));
                ++i;
            } else {
                ++i;
            }
            if (CanColor) {
                String s = JRMCoreH.trl("jrmc", "Color");
                int sw13 = this.fontRendererObj.getStringWidth(s) / 2;
                this.buttonList.add(new JRMCoreGuiButtons01(4, guiLeft + 190 - sw13, guiTop6 + 5 + i * 10, sw13, s, JRMCoreH.techNCCol[1]).setShadow(false));
            }
            ++i;
            if (JRMCoreH.isRaceMajin(RaceSlcted)) {
                BodyColMainSlcted = JRMCoreH.dnsBodyCM(dns);
                this.updateMajinHairToBodyColor();
                CanColor = false;
                if (HairSlcted < 10) {
                    HairSlcted = 12;
                    JRMCoreGuiScreen.setdnsForHair();
                }
            } else if (JRMCoreH.RaceCanHaveHair[RaceSlcted].contains("H") && JRMCoreH.RaceHairColor[RaceSlcted] == -1) {
                CanColor = true;
            } else {
                ColorSlcted = JRMCoreH.RaceHairColor[RaceSlcted] != -1 ? JRMCoreH.RaceHairColor[RaceSlcted] : 0;
                CanColor = false;
            }
            String Hair = JRMCoreH.trl("jrmc", "Hair") + " " + (HairSlcted + 1);
            String Color4 = "" + ColorSlcted;
            i = 0;
            if (CanHair) {
                if (HairSlcted != 12) {
                    var8.drawString(Hair, guiLeft + 190 - var8.getStringWidth(Hair) / 2, guiTop6 + 5 + i * 10, 0);
                }
                String s = JRMCoreH.trl("jrmc", "CustomHair");
                int sw14 = this.fontRendererObj.getStringWidth(s) / 2;
                if (HairSlcted == 12) {
                    this.buttonList.add(new JRMCoreGuiButtons01(5100, guiLeft + 190 - sw14, guiTop6 + 5 + i * 10, sw14, s, JRMCoreH.techNCCol[1]).setShadow(false));
                }
            }
            ++i;
            if (CanColor) {
                float h2 = (float)(ColorSlcted >> 16 & 0xFF) / 255.0f;
                float h3 = (float)(ColorSlcted >> 8 & 0xFF) / 255.0f;
                float h4 = (float)(ColorSlcted & 0xFF) / 255.0f;
                float h1 = 1.0f;
                GL11.glColor4f((float)(h1 * h2), (float)(h1 * h3), (float)(h1 * h4), (float)1.0f);
                JRMCoreGuiScreen.mc.renderEngine.bindTexture(new ResourceLocation(button1));
                this.drawTexturedModalRect(guiLeft + 190 - 25, guiTop6 + 4 + i * 10, 0, 0, 50, 10);
            }
            ++i;
            int k = guiLeft;
            int l = guiTop6;
            JRMCoreGuiScreen.func_110423_a(k + 51, l + 155, 60, (float)(k + 51) - this.xSize_lo, (float)(l + 80) - this.ySize_lo, (EntityLivingBase)(ItemBarberSnC.barberTarget == null ? JRMCoreGuiScreen.mc.thePlayer : ItemBarberSnC.barberTarget));
            if (!CanHair) {
                String s = JRMCoreH.trl("jrmc", "NoHairToEdit");
                int sw15 = this.fontRendererObj.getStringWidth(s) / 2;
                var8.drawString(s, guiLeft + 10, guiTop6 + 15, 0);
            }
            String s = JRMCoreH.trl("jrmc", "BarberMenu");
            int sw16 = this.fontRendererObj.getStringWidth(s) / 2;
            var8.drawString(s, guiLeft + 7, guiTop6 + 5, 0);
            String n = JRMCoreH.trl("jrmc", "Revert");
            int nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(-14, posX - 130 - nw, posY + 65, nw, 20, n, 0));
            n = JRMCoreH.trl("jrmc", "Done");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(14, posX + 130, posY + 65, nw, 20, n, 0));
        } else if (this.isGUIOpen(10000)) {
            this.drawHUD_clntsett(posX, posY, var5, var6, var8);
        } else if (this.isGUIOpen(10001)) {
            this.drawHUD_help(posX, posY, var5, var6, var8);
        } else if (this.isGUIOpen(10011)) {
            JGNotificationGUI.update(this.buttonList, this.width, this.height, posX, posY, var5, var6, var8);
        } else if (this.isGUIOpen(14)) {
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop7 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation7 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation7);
            this.drawTexturedModalRect(guiLeft, guiTop7, 0, 0, xSize, ySize);
            String n = JRMCoreH.trl("jrmc", "Back");
            int nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(100, posX - 130 - nw, posY + 65, nw, 20, n, 0));
            var8.drawString(JRMCoreH.trl("jrmc", "SelectedDifficulty") + ": " + JRMCoreH.DifficultyNames[this.diff], guiLeft + 5, guiTop7 + 5, 0);
            int i2 = 0;
            int c = 8046079;
            byte d = JRMCoreH.Dffclty;
            for (int i1 = 0; i1 < JRMCoreH.DifficultyNames.length; ++i1) {
                i2 += 2;
                c = d == i1 ? 3452672 : 8046079;
                if (d > i1) {
                    c = 0x404040;
                }
                this.buttonList.add(new JRMCoreGuiButtons00(-101 - i1, posX - 120, posY - 86 + i2 * 10, 60, 20, JRMCoreH.trl("jrmc", JRMCoreH.DifficultyNames[i1]), c));
                int t = JRMCoreH.expgnrt(JRMCoreH.Race, JRMCoreH.State, i1, (EntityPlayer)JRMCoreGuiScreen.mc.thePlayer);
                for (String s1 : JRMCoreGuiScreen.mc.fontRenderer.listFormattedStringToWidth(JRMCoreH.cct(JRMCoreH.trl("jrmc", JRMCoreH.DifficultyDesc[i1]), t + "%"), 245)) {
                    var8.drawString("\u00a70" + s1, guiLeft + 6, guiTop7 + 5 + ++i2 * 10, 0);
                }
            }
            if (d < this.diff) {
                this.buttonList.add(new JRMCoreGuiButtons00(-104, posX + 130, posY + 65, 40, 20, JRMCoreH.trl("jrmc", "Accept"), 0));
            } else if (d != this.diff) {
                var8.drawString(JRMCoreH.trl("jrmc", "KaioDiffRedLine"), guiLeft + 5, guiTop7 + 5 + 140, 0);
            }
        } else if (this.isGUIOpen(10)) {
            boolean c;
            int MNDo;
            int WILo;
            int DEXo;
            int STRo;
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop8 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation8 = new ResourceLocation(JRMCoreH.isPowerTypeSAO() ? JRMCoreH.tjsaoc + ":gui.png" : wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation8);
            this.drawTexturedModalRect(guiLeft, guiTop8, 0, 0, xSize, ySize);
            if (this.pwr != 3) {
                this.align(icons);
            }
            if (JRMCoreH.isPowerTypeKi()) {
                String n = JRMCoreH.trl("jrmc", "Difficulty");
                int nw = this.fontRendererObj.getStringWidth(n) + 8;
                this.buttonList.add(new JRMCoreGuiButtons00(104, posX + 90 - nw / 2, posY + 55, nw, 20, n, 8046079));
            }
            if (JRMCoreH.isPowerTypeKi()) {
                JRMCoreClient.bars.showSE(posX / 2, guiTop8 - 34 - 1, 0, 0);
            }
            this.menuButtons("CH");
            if (!JRMCoreConfig.ssurl.contains("empty") && JRMCoreConfig.ssurl.contains("ttp")) {
                String s = "Server Shop";
                int sw17 = this.fontRendererObj.getStringWidth(s);
                this.buttonList.add(new JRMCoreGuiButtons00(3099, guiLeft + 260, guiTop8 + 85, sw17 + 8, 20, s, 0));
            }
            if (!JRMCoreEH.aw && JRMCoreEH.dt && this.kdf >= ar) {
                String s = "Update vanity";
                int sw18 = this.fontRendererObj.getStringWidth(s);
                this.buttonList.add(new JRMCoreGuiButtons00(3098, guiLeft + 260, guiTop8 + 85 - 40 - 42, sw18 + 8, 20, s, 0));
            }
            if (JRMCoreEH.dt) {
                String s = (JRMCoreEH.gk ? "Hide" : "Show") + " own vanity";
                int sw19 = this.fontRendererObj.getStringWidth(s);
                this.buttonList.add(new JRMCoreGuiButtons00(3097, guiLeft + 260, guiTop8 + 85 - 40 - 21, sw19 + 8, 20, s, 0));
            }
            String s = "Official DBC Server's site";
            int sw20 = this.fontRendererObj.getStringWidth(s);
            this.buttonList.add(new JRMCoreGuiButtons00(3096, guiLeft + 260, guiTop8 + 85 - 40, sw20 + 8, 20, s, 0));
            int gender = JRMCoreH.dnsGender(JRMCoreH.dns);
            String powerType = JRMCoreH.trl("jrmc", JRMCoreH.Pwrtyps[JRMCoreH.Pwrtyp]);
            String raceName = JRMCoreH.trl("jrmc", "Race");
            String Race = JRMCoreH.trl("jrmc", JRMCoreH.Races[JRMCoreH.Race]);
            String className = JRMCoreH.trl("jrmc", JRMCoreH.ClassNames[JRMCoreH.Pwrtyp]);
            String Class4 = JRMCoreH.trl("jrmc", JRMCoreH.cl(JRMCoreH.Pwrtyp)[JRMCoreH.Class]);
            String ClassDesc3 = JRMCoreH.trl("jrmc", JRMCoreGuiScreen.clDesc(JRMCoreH.Pwrtyp)[JRMCoreH.Class]);
            String Level2 = JRMCoreH.trl("jrmc", "Level");
            String Stats = JRMCoreH.trl("jrmc", "Stats");
            String PowerRelease = JRMCoreH.trl("jrmc", "PowerRelease");
            String TRState = JRMCoreH.trl("jrmc", "TRState");
            String TransNms = JRMCoreH.trl("jrmc", JRMCoreH.getTransformationName(JRMCoreH.Race, JRMCoreH.isPowerTypeChakra() ? (byte)0 : JRMCoreH.State, JRMCoreH.StusEfctsMe(17), JRMCoreH.StusEfctsMe(13), JRMCoreH.StusEfctsMe(19), JRMCoreH.StusEfctsMe(20)));
            String StatIncreaseDesc = JRMCoreH.trl("jrmc", "StatIncreaseDesc");
            String StatIncreaseDesc2 = JRMCoreH.trl("jrmc", "StatIncreaseDesc2");
            String StatIncreaseDesc3 = JRMCoreH.trl("jrmc", "StatIncreaseDesc3");
            String StatIncreaseDesc4 = JRMCoreH.trl("jrmc", "StatIncreaseDesc4");
            String StatIncreaseDesc5 = JRMCoreH.trl("jrmc", "StatIncreaseDesc5");
            String Attributes = JRMCoreH.trl("jrmc", "Attributes");
            String TP = JRMCoreH.trl("jrmc", "TP");
            String TrainingPoints = JRMCoreH.trl("jrmc", "TrainingPoints");
            String RequiredTP = JRMCoreH.trl("jrmc", "RequiredTP");
            String Alignment = JRMCoreH.trl("jrmc", "Alignment");
            String AlignmentDesc = JRMCoreH.trl("jrmc", "AlignmentDesc");
            boolean max = JRMCoreH.getPlayerLevel(JRMCoreH.PlyrAttrbts) >= JRMCoreH.getPlayerLevel(JRMCoreGuiScreen.kqGW3Z(false) * 6);
            int i = 0;
            if (this.pwr != 3) {
                JRMCoreGuiScreen.drawDetails(Level2 + ": " + JRMCoreH.cldgy + JRMCoreH.numSep(JRMCoreH.getPlayerLevel(JRMCoreH.PlyrAttrbts)), JRMCoreH.cldgy + (max ? JRMCoreH.trl("jrmc", "LevelMax") : JRMCoreH.trl("jrmc", "LevelNext", JRMCoreH.cllr + JRMCoreH.attrLvlNext(JRMCoreH.PlyrAttrbts) + JRMCoreH.cldgy)), guiLeft + 5, guiTop8 + 5 + i * 10, x, y, var8);
                var8.drawString(PowerRelease + ": " + JRMCoreH.cldgy + JRMCoreH.curRelease + "%", guiLeft + 5 + 128, guiTop8 + 5 + i * 10, 0);
                ++i;
                var8.drawString(Stats, guiLeft + 5 + 128, guiTop8 + 5 + ++i * 10, 0);
                ++i;
            }
            int STR = STRo = JRMCoreH.PlyrAttrbts[0];
            int DEX = DEXo = JRMCoreH.PlyrAttrbts[1];
            int CON = JRMCoreH.PlyrAttrbts[2];
            WIL = WILo = JRMCoreH.PlyrAttrbts[3];
            int MND = MNDo = JRMCoreH.statMindC();
            int SPI = JRMCoreH.PlyrAttrbts[5];
            double per = 1.0;
            boolean st = JRMCoreH.Pwrtyp == 1 && ((JRMCoreH.State != 0 || JRMCoreH.State2 != 0) && JRMCoreH.Race != 4 || (JRMCoreH.State != 4 || JRMCoreH.State2 != 0) && JRMCoreH.Race == 4 || JRMCoreH.Race == 4 && JRMCoreH.State >= 4 && JRMCoreH.curRelease == 100 && JRMCoreH.getArcRsrv() > 0 || JRMCoreH.StusEfctsMe(12) || JRMCoreH.StusEfctsMe(13) || JRMCoreH.StusEfctsMe(20) || JRMCoreH.StusEfctsMe(19));
            String stc = JRMCoreH.StusEfctsMe(19) ? JRMCoreH.cllb : JRMCoreH.clgd;
            boolean bl = c = JRMCoreH.StusEfctsMe(10) || JRMCoreH.StusEfctsMe(11);
            if (JRMCoreH.Pwrtyp != 3 && JRMCoreH.Pwrtyp > 0) {
                STR = JRMCoreH.getPlayerAttribute((EntityPlayer)JRMCoreClient.mc.thePlayer, JRMCoreH.PlyrAttrbts, 0, JRMCoreH.State, JRMCoreH.State2, JRMCoreH.Race, JRMCoreH.PlyrSkillX, JRMCoreH.curRelease, JRMCoreH.getArcRsrv(), JRMCoreH.StusEfctsMe(14), JRMCoreH.StusEfctsMe(12), JRMCoreH.StusEfctsMe(5), JRMCoreH.StusEfctsMe(13), JRMCoreH.StusEfctsMe(19), JRMCoreH.StusEfctsMe(20), JRMCoreH.Pwrtyp, JRMCoreH.PlyrSkills, c, JRMCoreH.getMajinAbsorption());
                DEX = JRMCoreH.getPlayerAttribute((EntityPlayer)JRMCoreClient.mc.thePlayer, JRMCoreH.PlyrAttrbts, 1, JRMCoreH.State, JRMCoreH.State2, JRMCoreH.Race, JRMCoreH.PlyrSkillX, JRMCoreH.curRelease, JRMCoreH.getArcRsrv(), JRMCoreH.StusEfctsMe(14), JRMCoreH.StusEfctsMe(12), JRMCoreH.StusEfctsMe(5), JRMCoreH.StusEfctsMe(13), JRMCoreH.StusEfctsMe(19), JRMCoreH.StusEfctsMe(20), JRMCoreH.Pwrtyp, JRMCoreH.PlyrSkills, c, JRMCoreH.getMajinAbsorption());
                WIL = JRMCoreH.getPlayerAttribute((EntityPlayer)JRMCoreClient.mc.thePlayer, JRMCoreH.PlyrAttrbts, 3, JRMCoreH.State, JRMCoreH.State2, JRMCoreH.Race, JRMCoreH.PlyrSkillX, JRMCoreH.curRelease, JRMCoreH.getArcRsrv(), JRMCoreH.StusEfctsMe(14), JRMCoreH.StusEfctsMe(12), JRMCoreH.StusEfctsMe(5), JRMCoreH.StusEfctsMe(13), JRMCoreH.StusEfctsMe(19), JRMCoreH.StusEfctsMe(20), JRMCoreH.Pwrtyp, JRMCoreH.PlyrSkills, c, JRMCoreH.getMajinAbsorption());
                int maxCON = JRMCoreH.getPlayerAttribute((EntityPlayer)JRMCoreClient.mc.thePlayer, JRMCoreH.PlyrAttrbts, 2, JRMCoreH.State, JRMCoreH.State2, JRMCoreH.Race, JRMCoreH.PlyrSkillX, JRMCoreH.curRelease, JRMCoreH.getArcRsrv(), JRMCoreH.StusEfctsMe(14), JRMCoreH.StusEfctsMe(12), JRMCoreH.StusEfctsMe(5), JRMCoreH.StusEfctsMe(13), JRMCoreH.StusEfctsMe(19), JRMCoreH.StusEfctsMe(20), JRMCoreH.Pwrtyp, JRMCoreH.PlyrSkills, c, JRMCoreH.getMajinAbsorption());
                per = (double)(maxCON > CON ? maxCON : CON) / ((double)CON * 1.0);
            }
            float wDex = 1.0f;
            float wStr = 1.0f;
            boolean hasWeight = false;
            if ((int)JRMCoreH.WeightOn > 0) {
                hasWeight = true;
                wDex = JRMCoreH.weightPerc(1);
                wStr = JRMCoreH.weightPerc(0);
            }
            boolean isPowerTypeChakra = JRMCoreH.isPowerTypeChakra();
            if (JRMCoreH.isPowerTypeKi() || isPowerTypeChakra) {
                String mod;
                String[] sklsNms;
                String[] skls;
                float ncbonus = 0.0f;
                if (isPowerTypeChakra) {
                    int ta = JRMCoreH.SklLvl(0, 2, JRMCoreH.PlyrSkills);
                    ncbonus = (float)ta * 0.04f + (float)JRMCoreH.State * 0.25f;
                }
                int statSPI = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 5, JRMCoreH.Pwrtyp, 5, SPI, JRMCoreH.Race, JRMCoreH.Class, JRMCoreH.SklLvl_KiBs(this.pwr));
                int sklks = 0;
                if (JRMCoreH.Pwrtyp == 1) {
                    sklks = (int)((double)JRMCoreH.SklLvl(12) * 0.0025 * (double)statSPI * (double)JRMCoreH.curRelease * 0.01);
                }
                int stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 0, JRMCoreH.Pwrtyp, 0, STR, JRMCoreH.Race, JRMCoreH.Class, ncbonus);
                float inc = JRMCoreH.statInc(JRMCoreH.Pwrtyp, 0, 1, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                String statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][0]);
                int curAtr = (int)((double)stat * 0.01 * (double)JRMCoreH.curRelease * (double)JRMCoreH.weightPerc(0));
                long longValue = (long)curAtr + (long)sklks;
                if (longValue > Integer.MAX_VALUE) {
                    longValue = Integer.MAX_VALUE;
                }
                String Stat = JRMCoreH.cldgy + statNam + ": " + (st ? stc : JRMCoreH.cldr) + JRMCoreH.numSep(longValue);
                String statAttr = JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 0);
                String statAttrW = hasWeight ? "\n" + JRMCoreH.cldgy + JRMCoreH.trl("jrmc", "weightreduction") + ": " + JRMCoreH.cllr + (int)(100.0f - wStr * 100.0f) + "%" : "";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc + StatIncreaseDesc2 + (sklks > 0 ? StatIncreaseDesc4 : ""), statAttr, Float.valueOf(inc), JRMCoreH.numSep(stat), 0, JRMCoreH.numSep(sklks)) + statAttrW, guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                ++i;
                if (JRMCoreH.Pwrtyp == 1) {
                    sklks = (int)((double)JRMCoreH.SklLvl(11) * 0.005 * (double)statSPI * (double)JRMCoreH.curRelease * 0.01);
                }
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 1, JRMCoreH.Pwrtyp, 1, DEX, JRMCoreH.Race, JRMCoreH.Class, ncbonus);
                inc = JRMCoreH.statInc(JRMCoreH.Pwrtyp, 1, 1, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][1]);
                curAtr = (int)((double)stat * 0.01 * (double)JRMCoreH.curRelease * (double)JRMCoreH.weightPerc(1));
                longValue = (long)curAtr + (long)sklks;
                if (longValue > Integer.MAX_VALUE) {
                    longValue = Integer.MAX_VALUE;
                }
                Stat = JRMCoreH.cldgy + statNam + ": " + (st ? stc : JRMCoreH.cldr) + JRMCoreH.numSep(longValue);
                statAttr = JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 1);
                statAttrW = hasWeight ? "\n" + JRMCoreH.cldgy + JRMCoreH.trl("jrmc", "weightreduction") + ": " + JRMCoreH.cllr + (int)(100.0f - wDex * 100.0f) + "%" : "";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc + StatIncreaseDesc2 + StatIncreaseDesc3 + (sklks > 0 ? StatIncreaseDesc4 : ""), statAttr, Float.valueOf(inc), JRMCoreH.numSep(stat), JRMCoreH.numSep((int)((float)curAtr * ((float)JRMCoreConfig.StatPasDef * 0.01f))), JRMCoreH.numSep(sklks)) + statAttrW, guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                statNam = JRMCoreH.trl("jrmc", "Passive");
                Stat = JRMCoreH.cldgy + statNam + ": " + (st ? stc : JRMCoreH.cldr) + JRMCoreH.numSep((int)((float)curAtr * ((float)JRMCoreConfig.StatPasDef * 0.01f) + (float)sklks));
                statAttr = JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 1);
                statAttrW = hasWeight ? "\n" + JRMCoreH.cldgy + JRMCoreH.trl("jrmc", "weightreduction") + ": " + JRMCoreH.cllr + (int)(100.0f - wDex * 100.0f) + "%" : "";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc + StatIncreaseDesc2 + StatIncreaseDesc3 + (sklks > 0 ? StatIncreaseDesc4 : ""), statAttr, Float.valueOf(inc), JRMCoreH.numSep(stat), JRMCoreH.numSep((int)((float)curAtr * ((float)JRMCoreConfig.StatPasDef * 0.01f))), JRMCoreH.numSep(sklks)) + statAttrW, guiLeft + 5 + 128 + 5, guiTop8 + 5 + ++i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 2, JRMCoreH.Pwrtyp, 2, CON, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                inc = JRMCoreH.statInc(JRMCoreH.Pwrtyp, 2, 1, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][2]);
                int dr = (int)((1.0 - 1.0 / per) * 100.0);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + JRMCoreH.numSep(stat) + (JRMCoreH.round(per, 1) != 1.0 ? " R" + dr + "%" : "");
                statAttr = JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 2);
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc + (JRMCoreH.round(per, 1) != 1.0 ? StatIncreaseDesc5 : ""), statAttr, Float.valueOf(inc), dr), guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 2, JRMCoreH.Pwrtyp, 3, CON, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                inc = JRMCoreH.statInc(JRMCoreH.Pwrtyp, 3, 1, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][3]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + JRMCoreH.numSep(stat);
                statAttr = JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 2);
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, Float.valueOf(inc)), guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 3, JRMCoreH.Pwrtyp, 4, WIL, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                inc = JRMCoreH.statInc(JRMCoreH.Pwrtyp, 4, 1, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][4]);
                Stat = JRMCoreH.cldgy + statNam + ": " + (st ? stc : JRMCoreH.cldr) + JRMCoreH.numSep((int)((double)stat * 0.01 * (double)JRMCoreH.curRelease));
                statAttr = JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 3);
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc + StatIncreaseDesc2, statAttr, Float.valueOf(inc), JRMCoreH.numSep(stat)), guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 5, JRMCoreH.Pwrtyp, 5, SPI, JRMCoreH.Race, JRMCoreH.Class, JRMCoreH.SklLvl_KiBs(this.pwr));
                int statO = stat - JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 5, JRMCoreH.Pwrtyp, 5, SPI, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                inc = JRMCoreH.statInc(JRMCoreH.Pwrtyp, 5, 1, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][5]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + JRMCoreH.numSep(stat);
                statAttr = JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 5);
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc + (statO > 0 ? StatIncreaseDesc4 : ""), statAttr, Float.valueOf(inc), 0, 0, statO), guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                ++i;
                boolean isPowerTypeKi = JRMCoreH.isPowerTypeKi();
                if (JRMCoreH.isPowerTypeChakra()) {
                    skls = JRMCoreH.NCSkillIDs;
                    sklsNms = JRMCoreH.NCSkillNames;
                    mod = "nc";
                } else {
                    skls = JRMCoreH.DBCSkillsIDs;
                    sklsNms = JRMCoreH.DBCSkillNames;
                    mod = "dbc";
                }
                int st1 = JRMCoreH.Pwrtyp == 1 && JRMCoreH.StusEfctsMe(13) ? (JRMCoreH.rc_sai(JRMCoreH.Race) ? JRMCoreH.mstc_sai(JRMCoreH.SklLvlX(1, JRMCoreH.PlyrSkillX) - 1) : (JRMCoreH.rc_arc(JRMCoreH.Race) ? JRMCoreH.mstc_arc() : (JRMCoreH.rc_humNam(JRMCoreH.Race) ? JRMCoreH.mstc_humnam() : 1))) : JRMCoreH.State;
                inc = JRMCoreH.statInc(JRMCoreH.Pwrtyp, 7, 100, JRMCoreH.Race, JRMCoreH.Class, 0.0f) * 0.01f;
                stat = (int)(JRMCoreH.spdFrm(JRMCoreH.PlyrAttrbts(null)[1], JRMCoreH.SklLvl(isPowerTypeKi ? 2 : 0, JRMCoreH.Pwrtyp), 100.0f, true, false, st1, JRMCoreH.State2, inc) * 100.0f);
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][7]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat + "%";
                statAttr = JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 1);
                String skll = JRMCoreH.trl(mod, JRMCoreH.SklName(skls[isPowerTypeKi ? 2 : 0], skls, sklsNms));
                statAttrW = hasWeight ? "\n" + JRMCoreH.cldgy + JRMCoreH.trl("jrmc", "weightreduction") + ": " + JRMCoreH.cllr + (int)(100.0f - wDex * 100.0f) + "%" : "";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(JRMCoreH.trl("jrmc", "SpDBDesc"), JRMCoreH.cldg + stat + JRMCoreH.cldgy, JRMCoreH.cllr + statAttr + JRMCoreH.cldgy, JRMCoreH.clbe + skll + JRMCoreH.cldgy) + statAttrW, guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                ++i;
                if (JRMCoreH.isPowerTypeKi()) {
                    inc = JRMCoreH.statInc(JRMCoreH.Pwrtyp, 11, 100, JRMCoreH.Race, JRMCoreH.Class, 0.0f) * 0.01f;
                    stat = (int)(JRMCoreH.spdFrm(JRMCoreH.PlyrAttrbts(null)[4], JRMCoreH.SklLvl(3, (byte)1), 100.0f, true, true, st1, JRMCoreH.State2, inc) * 100.0f);
                    statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][11]);
                    Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat + "%";
                    statAttr = JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 4);
                    skll = JRMCoreH.trl("dbc", JRMCoreH.SklName(JRMCoreH.DBCSkillsIDs[3], JRMCoreH.DBCSkillsIDs, JRMCoreH.DBCSkillNames));
                    statAttrW = hasWeight ? "\n" + JRMCoreH.cldgy + JRMCoreH.trl("jrmc", "weightreduction") + ": " + JRMCoreH.cllr + (int)(100.0f - wDex * 100.0f) + "%" : "";
                    JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(JRMCoreH.trl("jrmc", "FSDBDesc"), JRMCoreH.cldg + stat + JRMCoreH.cldgy, JRMCoreH.cllr + statAttr + JRMCoreH.cldgy, JRMCoreH.clbe + skll + JRMCoreH.cldgy) + statAttrW, guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                    ++i;
                }
                i = 1;
                String requiredTP = JRMCoreH.cct(RequiredTP, JRMCoreH.cllr + JRMCoreH.numSep(JRMCoreH.attrCst(JRMCoreH.PlyrAttrbts, this.mcu)) + JRMCoreH.cldgy, "");
                JRMCoreGuiScreen.drawDetails(TP + ": " + JRMCoreH.cldgy + JRMCoreH.numSep(JRMCoreH.curTP), TrainingPoints + ",\n" + requiredTP, guiLeft + 5, guiTop8 + 5 + i * 10, x, y, var8);
                String cfr_ignored_0 = (JRMCoreH.StusEfctsMe(10) || JRMCoreH.StusEfctsMe(11) ? JRMCoreH.clpr : (JRMCoreH.StusEfctsMe(14) && JRMCoreH.lgndb() ? JRMCoreH.cldg : JRMCoreH.cldgy)) + TransNms;
                String textRace = raceName + ": " + JRMCoreH.cldgy + Race;
                var8.drawString(textRace, guiLeft + 5, guiTop8 + 5 + ++i * 10, 0);
                ++i;
                GL11.glPushMatrix();
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                ResourceLocation textureIcons = new ResourceLocation(JRMCoreH.tjjrmc + ":icons3.png");
                JRMCoreGuiScreen.mc.renderEngine.bindTexture(textureIcons);
                this.drawTexturedModalRect(guiLeft + 5 + this.fontRendererObj.getStringWidth(textRace), guiTop8 + 5 + (i - 1) * 10 - 3, 0, (8 - (gender >= 1 ? 1 : 0)) * 16, 16, 16);
                GL11.glPopMatrix();
                JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation8);
                String fullFormText = TRState + ": " + (JRMCoreH.StusEfctsMe(10) || JRMCoreH.StusEfctsMe(11) ? JRMCoreH.clpr : (JRMCoreH.StusEfctsMe(14) && JRMCoreH.lgndb() ? JRMCoreH.cldg : JRMCoreH.cldgy)) + TransNms;
                if (JGConfigDBCFormMastery.FM_Enabled && JRMCoreH.isPowerTypeKi()) {
                    boolean isInKaioken = JRMCoreH.StusEfctsMe(5);
                    int kaiokenID = JRMCoreH.getFormID("Kaioken", JRMCoreH.Race);
                    double formLevel2 = JRMCoreH.getFormMasteryValue((EntityPlayer)JRMCoreClient.mc.thePlayer, kaiokenID);
                    String[] formData = JRMCoreH.getFormMasteryData().split(",");
                    String currFormName = formData[0];
                    String currFormValue = formData[1];
                    DecimalFormat format = new DecimalFormat("#.##");
                    JRMCoreGuiScreen.drawDetails(fullFormText, TransNms + " Mastery Lvl: " + JRMCoreH.cldr + format.format(Double.parseDouble(currFormValue)) + (isInKaioken ? "\n" + JRMCoreH.cldgy + "Kaioken Mastery Lvl: " + JRMCoreH.cldr + format.format(formLevel2) : ""), guiLeft + 5, guiTop8 + 5 + i * 10, x, y, var8);
                    ++i;
                } else {
                    var8.drawString(fullFormText, guiLeft + 5, guiTop8 + 5 + i * 10, 0);
                    ++i;
                }
                JRMCoreGuiScreen.drawDetails(className + ": " + JRMCoreH.cldgy + Class4, ClassDesc3, guiLeft + 5, guiTop8 + 5 + i * 10, x, y, var8);
                JRMCoreGuiScreen.drawDetails(Alignment + ": " + JRMCoreH.algnCur(JRMCoreH.align), JRMCoreH.cct(AlignmentDesc, JRMCoreH.align + "%", ""), guiLeft + 5, guiTop8 + 5 + ++i * 10, x, y, var8);
                ++i;
                var8.drawString(Attributes, guiLeft + 5, guiTop8 + 5 + ++i * 10, 0);
                ++i;
                boolean fz = !JRMCoreH.StusEfctsMe(10) && !JRMCoreH.StusEfctsMe(11);
                boolean en = JRMCoreH.curTP >= cost;
                for (int i1 = 0; i1 < JRMCoreH.PlyrAttrbts.length; ++i1) {
                    boolean mxd = JRMCoreGuiScreen.kqGW3Z(c) > JRMCoreH.PlyrAttrbts[i1];
                    boolean b = CanUpgrade[i1] && en && mxd && fz;
                    int ypos = guiTop8 + i * 10 + 3 + i1 * 10;
                    this.buttonList.add(new JRMCoreGuiButtonsA3(110 + i1, guiLeft + 3, ypos, 10, 2, b));
                    String say = null;
                    if (!mxd) {
                        say = JRMCoreH.cct(JRMCoreH.trl("jrmc", "AttributeMaxed"), new Object[0]);
                    } else if (!fz) {
                        say = JRMCoreH.cct(JRMCoreH.trl("dbc", "cantupgradef"), new Object[0]);
                    }
                    if (say == null) continue;
                    JRMCoreGuiScreen.drawDetails(say, guiLeft + 3, ypos + 1, 10, 10, x, y, var8);
                }
                String attributeMulti = "  Race-Class Multiplier:";
                String startAttr = JRMCoreH.cldgy + "STR: " + (st ? stc : JRMCoreH.cldr) + JRMCoreH.numSep(STR) + (hasWeight ? JRMCoreH.cllr + " -" + (int)JRMCoreH.WeightOn : "");
                String AttrOrig = st ? JRMCoreH.trl("jrmc", "Modified") + ": " + JRMCoreH.clgd + STR + "\n" + JRMCoreH.cldgy + JRMCoreH.trl("jrmc", "Original") + ": " + JRMCoreH.cldr + STRo + "\n" : "";
                String AttrDesc = AttrOrig + JRMCoreH.cldgy + JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 0) + ", " + JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[JRMCoreH.Pwrtyp][0]) + (hasWeight ? "\n" + JRMCoreH.trl("jrmc", "trainingweightworn") + ": " + JRMCoreH.cllr + (int)JRMCoreH.WeightOn : "") + "\n  Race-Class Multiplier: " + JGConfigRaces.CONFIG_RACES_ATTRIBUTE_MULTI[JRMCoreH.Race][JRMCoreH.Class][0] + this.getAttributeBonusDescription(0);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 15, guiTop8 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "DEX: " + (st ? stc : JRMCoreH.cldr) + JRMCoreH.numSep(DEX) + (hasWeight ? JRMCoreH.cllr + " -" + (int)JRMCoreH.WeightOn : "");
                AttrOrig = st ? JRMCoreH.trl("jrmc", "Modified") + ": " + JRMCoreH.clgd + DEX + "\n" + JRMCoreH.cldgy + JRMCoreH.trl("jrmc", "Original") + ": " + JRMCoreH.cldr + DEXo + "\n" : "";
                AttrDesc = AttrOrig + JRMCoreH.cldgy + JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 1) + ", " + JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[JRMCoreH.Pwrtyp][1]) + (hasWeight ? "\n" + JRMCoreH.trl("jrmc", "trainingweightworn") + ": " + JRMCoreH.cllr + (int)JRMCoreH.WeightOn : "") + "\n  Race-Class Multiplier: " + JGConfigRaces.CONFIG_RACES_ATTRIBUTE_MULTI[JRMCoreH.Race][JRMCoreH.Class][1] + this.getAttributeBonusDescription(1);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 15, guiTop8 + 5 + ++i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "CON: " + JRMCoreH.cldr + JRMCoreH.numSep(CON) + (JRMCoreH.round(per, 1) != 1.0 ? " x" + JRMCoreH.round(per, 1) : "");
                AttrDesc = JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 2) + ", " + JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[JRMCoreH.Pwrtyp][2]) + "\n  Race-Class Multiplier: " + JGConfigRaces.CONFIG_RACES_ATTRIBUTE_MULTI[JRMCoreH.Race][JRMCoreH.Class][2] + this.getAttributeBonusDescription(2);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 15, guiTop8 + 5 + ++i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "WIL: " + (st ? stc : JRMCoreH.cldr) + JRMCoreH.numSep(WIL);
                AttrOrig = st ? JRMCoreH.trl("jrmc", "Modified") + ": " + JRMCoreH.clgd + WIL + "\n" + JRMCoreH.cldgy + JRMCoreH.trl("jrmc", "Original") + ": " + JRMCoreH.cldr + WILo + "\n" : "";
                AttrDesc = AttrOrig + JRMCoreH.cldgy + JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 3) + ", " + JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[JRMCoreH.Pwrtyp][3]) + "\n  Race-Class Multiplier: " + JGConfigRaces.CONFIG_RACES_ATTRIBUTE_MULTI[JRMCoreH.Race][JRMCoreH.Class][3] + this.getAttributeBonusDescription(3);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 15, guiTop8 + 5 + ++i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "MND: " + (MND != MNDo ? JRMCoreH.clgd : JRMCoreH.cldr) + JRMCoreH.numSep(MND);
                AttrOrig = MND != MNDo ? JRMCoreH.trl("jrmc", "Modified") + ": " + JRMCoreH.clgd + MND + "\n" + JRMCoreH.cldgy + JRMCoreH.trl("jrmc", "Original") + ": " + JRMCoreH.cldr + MNDo + "\n" : "";
                AttrDesc = AttrOrig + JRMCoreH.cldgy + JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 4) + ", " + JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[JRMCoreH.Pwrtyp][4]) + "\n  Race-Class Multiplier: " + JGConfigRaces.CONFIG_RACES_ATTRIBUTE_MULTI[JRMCoreH.Race][JRMCoreH.Class][4] + this.getAttributeBonusDescription(4);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 15, guiTop8 + 5 + ++i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "SPI: " + JRMCoreH.cldr + JRMCoreH.numSep(SPI);
                AttrDesc = JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 5) + ", " + JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[JRMCoreH.Pwrtyp][5]) + "\n  Race-Class Multiplier: " + JGConfigRaces.CONFIG_RACES_ATTRIBUTE_MULTI[JRMCoreH.Race][JRMCoreH.Class][5] + this.getAttributeBonusDescription(5);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 15, guiTop8 + 5 + ++i * 10, x, y, var8);
                this.buttonList.add(new JRMCoreGuiButtonsA3(-10, guiLeft + 7, guiTop8 + 0 + ++i * 10 + 3, 10, 2, true));
                int cost = JRMCoreH.attrCst(JRMCoreH.PlyrAttrbts, this.mcu);
                boolean xm = JRMCoreH.acm(JRMCoreH.PlyrAttrbts);
                String say = JRMCoreH.cct(RequiredTP, JRMCoreH.cldr + JRMCoreH.numSep(cost) + JRMCoreH.cldgy, "") + (!en ? "/n(" + JRMCoreH.trl("jrmc", "notenoughtp") + ")" : "");
                if (xm) {
                    say = JRMCoreH.cct(JRMCoreH.trl("jrmc", "AttributeAllMaxed"), new Object[0]);
                } else if (cost == 0) {
                    say = JRMCoreH.cct(JRMCoreH.trl("jrmc", "cantupgrade"), new Object[0]);
                } else if (!fz) {
                    say = JRMCoreH.cct(JRMCoreH.trl("dbc", "cantupgradef"), new Object[0]);
                }
                startAttr = JRMCoreH.cldgy + " UC: " + JRMCoreH.cldb + (cost <= 0 ? JRMCoreH.trl("jrmc", "LimitReached") : JRMCoreH.numSep(cost) + " TP" + (this.mcu > 0 ? " x" + JRMCoreH.attributeMultiplier(this.mcu) : ""));
                AttrDesc = JRMCoreH.trl("jrmc", "UCnam") + ", " + say + (x > 0 ? " x" + JRMCoreH.attributeMultiplier(this.mcu) : "");
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 15, guiTop8 + 5 + i * 10, x, y, var8);
                ++i;
                if (JRMCoreH.Pwrtyp == 2 && JRMCoreH.PtchVc == 0) {
                    this.buttonList.add(new JRMCoreGuiSlider00(196, guiLeft - 30, guiTop8 + 5 - 20, "", ptch, 1.0f));
                    this.buttonList.add(new JRMCoreGuiButtons00(197, guiLeft - 30, guiTop8 + 5 + 130 - 20, 20, 20, "Ok", 0));
                    var8.drawString(JRMCoreH.trl("jrmc", "Voice"), guiLeft - 30, guiTop8 + 5 - 30, JRMCoreH.techNCCol[1]);
                }
            } else if (this.pwr == 3) {
                String StatIncreaseDescStr = JRMCoreH.trl("saoc", "StatIncreaseDescStr");
                String StatIncreaseDescVit = JRMCoreH.trl("saoc", "StatIncreaseDescVit");
                int WeaponDamage = JRMCoreHSAC.getWeaponDamage(JRMCoreGuiScreen.mc.thePlayer.getCurrentEquippedItem(), STR);
                int STRwb = JRMCoreHSAC.getWeaponBonus(JRMCoreGuiScreen.mc.thePlayer.getCurrentEquippedItem(), 0);
                int AGIwb = JRMCoreHSAC.getWeaponBonus(JRMCoreGuiScreen.mc.thePlayer.getCurrentEquippedItem(), 1);
                int dmg = (int)JRMCoreHSAC.getDamage(WeaponDamage, STR, DEX);
                int requires = JRMCoreHSAC.getWeaponStatName(JRMCoreGuiScreen.mc.thePlayer.getCurrentEquippedItem(), "requires");
                int attackMin = JRMCoreHSAC.getWeaponStatName(JRMCoreGuiScreen.mc.thePlayer.getCurrentEquippedItem(), "attackMin");
                int attackMax = JRMCoreHSAC.getWeaponStatName(JRMCoreGuiScreen.mc.thePlayer.getCurrentEquippedItem(), "attackMax");
                int attackMinOrg = attackMin;
                int attackMaxOrg = attackMax;
                if (requires > 0 && requires <= STR && JRMCoreGuiScreen.mc.thePlayer.getCurrentEquippedItem() != null) {
                    attackMin = (int)JRMCoreHSAC.getDamage(attackMin, STR + STRwb, DEX);
                    attackMax = (int)JRMCoreHSAC.getDamage(attackMax, STR + AGIwb, DEX);
                } else if (JRMCoreGuiScreen.mc.thePlayer.getCurrentEquippedItem() != null) {
                    int d1 = JRMCoreGuiScreen.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword ? 4 : 0;
                    Multimap multimap = JRMCoreGuiScreen.mc.thePlayer.getCurrentEquippedItem().getAttributeModifiers();
                    if (!multimap.isEmpty()) {
                        for (Map.Entry entry : multimap.entries()) {
                            AttributeModifier attributemodifier = (AttributeModifier)entry.getValue();
                            double d0 = attributemodifier.getAmount();
                            if (attributemodifier.getID() == UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF")) {
                                d0 += (double)EnchantmentHelper.func_152377_a((ItemStack)JRMCoreGuiScreen.mc.thePlayer.getCurrentEquippedItem(), (EnumCreatureAttribute)EnumCreatureAttribute.UNDEFINED);
                            }
                            d1 = attributemodifier.getOperation() != 1 && attributemodifier.getOperation() != 2 ? (d1 += (int)d0) : (d1 += (int)(d0 * 100.0));
                            if (d0 > 0.0 || !(d0 < 0.0)) continue;
                            d1 = (int)((double)d1 * -1.0);
                        }
                    }
                    attackMin = 1 + d1;
                    attackMax = 2 + d1;
                } else {
                    attackMin = 1;
                    attackMax = 2;
                }
                max = JRMCoreH.sao_level >= 255;
                JRMCoreGuiScreen.drawDetails(Level2 + ": " + JRMCoreH.cldgy + JRMCoreH.sao_level, JRMCoreH.cldgy + (max ? JRMCoreH.trl("jrmc", "LevelMax") : "You need " + JRMCoreH.SAOexpNeeded(JRMCoreH.sao_level, JRMCoreH.sao_exp) + " to Level up"), guiLeft + 5, guiTop8 + 5 + i * 10, x, y, var8);
                JRMCoreGuiScreen.drawDetails("AreaLevel: " + JRMCoreHSAC.SAO_getLvlBasedOnDrop((Entity)JRMCoreClient.mc.thePlayer), "Current Level of an Area and mobs are probably around this level.", guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                String saostat = "EXP: " + JRMCoreH.cldgy + JRMCoreH.sao_exp + "/" + JRMCoreH.SAOexpNeeded(JRMCoreH.sao_level, JRMCoreH.sao_exp);
                String desc = JRMCoreH.trl("saoc", "expDesc");
                JRMCoreGuiScreen.drawDetails(saostat, desc, guiLeft + 5, guiTop8 + 5 + ++i * 10, x, y, var8);
                saostat = "COL: " + JRMCoreH.cldgy + JRMCoreH.sao_col;
                desc = JRMCoreH.trl("saoc", "colDesc");
                JRMCoreGuiScreen.drawDetails(saostat, desc, guiLeft + 5, guiTop8 + 5 + ++i * 10, x, y, var8);
                ++i;
                var8.drawString(Attributes, guiLeft + 5, guiTop8 + 5 + ++i * 10, 0);
                var8.drawString(Stats, guiLeft + 5 + 128, guiTop8 + 5 + i * 10, 0);
                int inc = (int)JRMCoreH.statInc[JRMCoreH.Pwrtyp][0];
                String statNam = JRMCoreH.trl("saoc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][0]);
                String Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + attackMin + "-" + attackMax;
                String statAttr = "STR";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDescStr + JRMCoreH.cldgy + "/nSAOC weapon damage " + JRMCoreH.cldr + attackMinOrg + "-" + attackMaxOrg, statAttr, inc), guiLeft + 5 + 128, guiTop8 + 5 + ++i * 10, x, y, var8);
                for (int i1 = 0; i1 < 3; ++i1) {
                    int cost = JRMCoreH.attrCst(JRMCoreH.PlyrAttrbts, 0);
                    boolean b = CanUpgrade[i1] && JRMCoreH.sao_ap > 0 && JRMCoreGuiScreen.kqGW3Z(c) > JRMCoreH.PlyrAttrbts[i1];
                    int ypos = guiTop8 + i * 10 + 3 + i1 * 10;
                    this.buttonList.add(new JRMCoreGuiButtonsA3(110 + i1, guiLeft + 3, ypos, 10, 2, b));
                    JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(RequiredTP, JRMCoreH.cllr + JRMCoreH.attrCst(JRMCoreH.PlyrAttrbts, 0) + JRMCoreH.cldgy, ""), guiLeft + 3, ypos + 1, 10, 10, x, y, var8);
                }
                String startAttr = JRMCoreH.cldgy + "STR: " + JRMCoreH.cldr + STR + (STRwb > 0 ? JRMCoreH.clgd + " +" + STRwb : "");
                String AttrDesc = JRMCoreH.trl("saoc", JRMCoreH.attrDsc[JRMCoreH.Pwrtyp][0]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 10, guiTop8 + 5 + i * 10, x, y, var8);
                ++i;
                int stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 2, JRMCoreH.Pwrtyp, 2, CON, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                inc = (int)JRMCoreH.statInc[JRMCoreH.Pwrtyp][2];
                statNam = JRMCoreH.trl("saoc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][2]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "VIT";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDescVit, statAttr, inc), guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "AGI: " + JRMCoreH.cldr + DEX + (AGIwb > 0 ? JRMCoreH.clgd + " +" + AGIwb : "");
                AttrDesc = JRMCoreH.trl("saoc", JRMCoreH.attrDsc[JRMCoreH.Pwrtyp][1]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 10, guiTop8 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "VIT: " + JRMCoreH.cldr + CON;
                AttrDesc = JRMCoreH.trl("saoc", JRMCoreH.attrDsc[JRMCoreH.Pwrtyp][2]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 10, guiTop8 + 5 + ++i * 10, x, y, var8);
                ++i;
                startAttr = JRMCoreH.sao_ap + JRMCoreH.cldgy + " AP";
                AttrDesc = JRMCoreH.trl("saoc", "AtrPoints");
                if (JRMCoreH.sao_ap > 0) {
                    JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5 + 10, guiTop8 + 5 + i * 10, x, y, var8);
                }
                ++i;
            } else {
                int stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 0, JRMCoreH.Pwrtyp, 0, STR, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                float inc = JRMCoreH.statInc[JRMCoreH.Pwrtyp][0];
                String statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][0]);
                String Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                String statAttr = "STR";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, Float.valueOf(inc)), guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                String startAttr = JRMCoreH.cldgy + "STR: " + JRMCoreH.cldr + STR;
                String AttrDesc = JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[JRMCoreH.Pwrtyp][0]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5, guiTop8 + 5 + i * 10, x, y, var8);
                ++i;
                stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 2, JRMCoreH.Pwrtyp, 2, CON, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                inc = JRMCoreH.statInc[JRMCoreH.Pwrtyp][2];
                statNam = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][2]);
                Stat = JRMCoreH.cldgy + statNam + ": " + JRMCoreH.cldr + stat;
                statAttr = "CON";
                JRMCoreGuiScreen.drawDetails(Stat, JRMCoreH.cct(StatIncreaseDesc, statAttr, Float.valueOf(inc)), guiLeft + 5 + 128, guiTop8 + 5 + i * 10, x, y, var8);
                startAttr = JRMCoreH.cldgy + "CON: " + JRMCoreH.cldr + CON;
                AttrDesc = JRMCoreH.trl("jrmc", JRMCoreH.attrDsc[JRMCoreH.Pwrtyp][2]);
                JRMCoreGuiScreen.drawDetails(startAttr, AttrDesc, guiLeft + 5, guiTop8 + 5 + i * 10, x, y, var8);
                ++i;
            }
        } else if (this.isGUIOpen(11)) {
            String name;
            String mod;
            int[][] sklsMR;
            String[] sklsNms;
            int[][] sklsLvl;
            int[] sklsUps;
            String[] skls;
            String[] cSklsNms;
            int[][] cSklsLvl;
            String[] cSkls;
            String[] rSklsNms;
            int[][] rSklsLvl;
            String[] rSkls;
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop9 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation9 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation9);
            this.drawTexturedModalRect(guiLeft, guiTop9, 0, 0, xSize, ySize);
            this.menuButtons("SK");
            if (JRMCoreH.isPowerTypeChakra()) {
                String l = JRMCoreH.trl("jrmc", "Learn");
                int lw = this.fontRendererObj.getStringWidth(l);
                this.buttonList.add(new JRMCoreGuiButtons01(-200, guiLeft + 250 + 10, guiTop9 + 5, lw, l, JRMCoreH.techNCCol[1]));
            }
            int[][] rSklsMR = null;
            int[][] cSklsMR = null;
            if (JRMCoreH.isPowerTypeChakra()) {
                rSkls = JRMCoreH.ncRSkls;
                rSklsLvl = JRMCoreH.ncRSklsLvl;
                rSklsNms = JRMCoreH.ncRSklsNms;
                cSkls = JRMCoreH.ncCSkls;
                cSklsLvl = JRMCoreH.NCRacialSkillTPCost;
                cSklsNms = JRMCoreH.NCRacialSkillAbilityNames;
                cSklsMR = JRMCoreH.NCRacialSkillMindCost;
                skls = JRMCoreH.NCSkillIDs;
                sklsUps = JRMCoreH.ncSklsUps;
                sklsLvl = JRMCoreH.NCSkillTPCost;
                sklsNms = JRMCoreH.NCSkillNames;
                sklsMR = JRMCoreH.NCSkillMindCost;
                mod = "nc";
            } else {
                rSkls = JRMCoreH.vlblRSkls;
                rSklsLvl = JRMCoreH.DBCRacialSkillTPCost;
                rSklsNms = JRMCoreH.vlblRSklsNms;
                rSklsMR = JRMCoreH.DBCRacialSkillMindCost;
                cSkls = JRMCoreH.vlblCSkls;
                cSklsLvl = JRMCoreH.vlblCSklsLvl;
                cSklsNms = JRMCoreH.vlblCSklsNms;
                skls = JRMCoreH.DBCSkillsIDs;
                sklsUps = JRMCoreH.vlblSklsUps;
                sklsLvl = JRMCoreH.DBCSkillTPCost;
                sklsNms = JRMCoreH.DBCSkillNames;
                sklsMR = JRMCoreH.DBCSkillMindCost;
                mod = "dbc";
            }
            int mindUsed = JRMCoreH.skillSlot_MindUsed();
            boolean canAffordMind = JRMCoreH.skillSlot_EnoughMindLeft();
            int mindLeft = JRMCoreH.skillSlot_AvailableMindLeft();
            boolean canAffordTP = true;
            int skillID = 0;
            if (JRMCoreH.PlyrSkillX != null && !JRMCoreH.PlyrSkillX.contains("pty") && JRMCoreH.PlyrSkillX.length() > 1) {
                String un = JRMCoreH.SklName(JRMCoreH.PlyrSkillX, rSkls, rSklsNms, JRMCoreH.Race);
                name = JRMCoreH.trl(mod, un);
                int skillLvl = Integer.parseInt(JRMCoreH.PlyrSkillX.substring(2));
                var8.drawString("\u00a70" + name + (skillLvl <= 9 ? " " + this.textLevel(skillLvl) : ""), guiLeft + 5, guiTop9 + 15 + ++skillID * 10, 0);
                int nw = this.fontRendererObj.getStringWidth(name);
                JRMCoreGuiScreen.drawDetails(JRMCoreH.trl(mod, un + "Desc"), guiLeft + 5, guiTop9 + 15 + skillID * 10 + 2, nw, 6, x, y, var8);
                int mindRequirement = JRMCoreH.skillMindRequirement_X(JRMCoreH.PlyrSkillX, JRMCoreH.Race, rSklsMR);
                int mindRequirementResult = mindUsed + mindRequirement;
                canAffordMind = JRMCoreH.canAffordSkill(JRMCoreH.statMindC(), mindRequirementResult);
                int tpCost = JRMCoreH.skillTPCost_X(JRMCoreH.PlyrSkillX, JRMCoreH.Race, rSklsLvl);
                if (JRMCoreConfig.dat5711 && tpCost != -1) {
                    if (JRMCoreH.rSai(JRMCoreH.Race) && skillLvl < 7) {
                        this.buttonList.add(new JRMCoreGuiButtonsA3(390, guiLeft - 10, guiTop9 + 13 + skillID * 10, 10, 2, canAffordMind));
                    } else if (JRMCoreH.Race == 4 && skillLvl < 6) {
                        this.buttonList.add(new JRMCoreGuiButtonsA3(390, guiLeft - 10, guiTop9 + 13 + skillID * 10, 10, 2, canAffordMind));
                    } else if (JRMCoreH.Race != 4 && skillLvl < 5) {
                        this.buttonList.add(new JRMCoreGuiButtonsA3(390, guiLeft - 10, guiTop9 + 13 + skillID * 10, 10, 2, canAffordMind));
                    }
                }
                if (JRMCoreH.Race == 4 && JRMCoreHDBC.auc(skillLvl) && !JRMCoreH.data(JRMCoreGuiScreen.mc.thePlayer.getCommandSenderName(), 16, "").contains(";")) {
                    this.buttonList.add(new JRMCoreGuiButtonsA3(392, guiLeft + 10 + var8.getStringWidth(name + (skillLvl < 7 ? this.textLevel(skillLvl) : "")), guiTop9 + 13 + skillID * 10, 20, 1));
                }
                String s = skillLvl < (JRMCoreH.Race == 1 || JRMCoreH.Race == 2 ? 7 : (JRMCoreH.Race == 4 ? 6 : 5)) ? (tpCost == -1 ? JRMCoreH.trl("jrmc", "UpgradeLocked") : "TP: " + JRMCoreH.numSep(tpCost) + " M: " + JRMCoreH.numSep(mindRequirement)) : JRMCoreH.trl("jrmc", "Maxed");
                var8.drawString(s, guiLeft + 250 - var8.getStringWidth(s), guiTop9 + 15 + skillID * 10, 0);
            }
            if (JRMCoreH.PlyrSkillY != null && !JRMCoreH.PlyrSkillY.contains("pty") && !JRMCoreH.PlyrSkillY.contains("Sai") && JRMCoreH.Race != 1 && JRMCoreH.Race != 2 && JRMCoreH.PlyrSkillY.length() > 1) {
                String un;
                name = un = JRMCoreH.SklName(JRMCoreH.PlyrSkillY, cSkls, cSklsNms);
                int n = Integer.parseInt(JRMCoreH.PlyrSkillY.substring(2));
                var8.drawString("\u00a70" + (JRMCoreH.Race == 1 || JRMCoreH.Race == 2 ? JRMCoreH.TransSaiUpNam[n] : name + this.textLevel(n + 1)), guiLeft + 5, guiTop9 + 15 + ++skillID * 10, 0);
                int nw = this.fontRendererObj.getStringWidth(name);
                JRMCoreGuiScreen.drawDetails(JRMCoreH.trl(mod, name + "Desc"), guiLeft + 5, guiTop9 + 15 + skillID * 10 + 2, nw, 6, x, y, var8);
                int mindRequirement = JRMCoreH.skillMindRequirement(JRMCoreH.PlyrSkillY, cSkls, cSklsMR);
                int mindRequirementResult = mindUsed + mindRequirement;
                canAffordMind = JRMCoreH.canAffordSkill(JRMCoreH.statMindC(), mindRequirementResult);
                int tpCost = JRMCoreH.skillTPCost_X(JRMCoreH.PlyrSkillY, JRMCoreH.Race, cSklsLvl);
                if (JRMCoreConfig.dat5711 && n <= 8 && tpCost != -1) {
                    this.buttonList.add(new JRMCoreGuiButtonsA3(391, guiLeft - 10, guiTop9 + 13 + skillID * 10, 10, 2, canAffordMind));
                }
                String s = n <= 8 ? (tpCost == -1 ? JRMCoreH.trl("jrmc", "UpgradeLocked") : "TP: " + JRMCoreH.numSep(tpCost) + " M: " + JRMCoreH.numSep(mindRequirement)) : JRMCoreH.trl("jrmc", "Maxed");
                var8.drawString(s, guiLeft + 250 - var8.getStringWidth(s), guiTop9 + 15 + skillID * 10, 0);
            }
            if (JRMCoreH.PlyrSkills != null) {
                int m1 = JRMCoreH.PlyrSkills.length;
                float m2 = 5.0f;
                int sz = 10;
                this.scrollMouseJump = 1;
                if (m1 > sz) {
                    if ((float)m1 - m2 < (float)this.scroll) {
                        this.scroll = (int)((float)m1 - m2);
                    } else if (this.scroll < 0) {
                        this.scroll = 0;
                    }
                    if (this.mousePressed && !JRMCoreGuiButtonsA1.clicked) {
                        this.scroll = (int)(((float)m1 - m2) * scrollSide);
                    } else {
                        scrollSide = JRMCoreGuiSliderX00.sliderValue = (float)this.scroll / ((float)m1 - m2);
                    }
                } else {
                    this.scroll = 0;
                }
                if (m1 > sz) {
                    if (scrollSide > 0.0f) {
                        this.buttonList.add(new JRMCoreGuiButtonsA1(43, guiLeft + xSize / 2 + 110 + 18, guiTop9 + 80 - 70, "i"));
                    }
                    if (scrollSide < 1.0f) {
                        this.buttonList.add(new JRMCoreGuiButtonsA1(44, guiLeft + xSize / 2 + 110 + 18, guiTop9 + 80 + 60, "v"));
                    }
                    this.buttonList.add(new JRMCoreGuiSliderX00(1000000, guiLeft + xSize / 2 + 110 + 18, guiTop9 + 25, this.mousePressed, scrollSide, 1.0f));
                }
                for (int i = this.scroll; i < (JRMCoreH.PlyrSkills.length > this.scroll + 10 ? this.scroll + 10 : JRMCoreH.PlyrSkills.length); ++i) {
                    int d;
                    String currentSkill = JRMCoreH.PlyrSkills[i];
                    if (currentSkill.contains("pty") || currentSkill.length() <= 2) continue;
                    ++skillID;
                    String un = JRMCoreH.SklName(currentSkill, skls, sklsNms);
                    String name2 = JRMCoreH.trl(mod, un);
                    int n = Integer.parseInt(currentSkill.substring(2));
                    n = d = JRMCoreH.isPowerTypeKi() && !JRMCoreH.rSai(JRMCoreH.Race) && currentSkill.contains(JRMCoreH.DBCSkillsIDs[9]) ? (n > 0 ? 0 : n) : JRMCoreH.SklLvl_m(currentSkill, skls, n);
                    String nm = "\u00a70" + name2 + " " + this.textLevel(n + 1);
                    var8.drawString(nm, guiLeft + 5, guiTop9 + 20 + skillID * 10, 0);
                    String a = "";
                    if (JRMCoreH.isPowerTypeKi()) {
                        switch (JRMCoreH.SklID(currentSkill, skls)) {
                            case 7: {
                                a = "" + JRMCoreConfig.SklMedCat;
                                break;
                            }
                        }
                    } else if (JRMCoreH.isPowerTypeChakra()) {
                        switch (JRMCoreH.SklID(currentSkill, skls)) {
                            case 11: {
                                a = "" + JRMCoreConfig.SklMedCat;
                                break;
                            }
                        }
                    }
                    int nw = this.fontRendererObj.getStringWidth(name2);
                    JRMCoreGuiScreen.drawDetails(JRMCoreH.trl(mod, un + "Desc" + a), guiLeft + 5, guiTop9 + 20 + skillID * 10 + 2, nw, 6, x, y, var8);
                    this.buttonList.add(new JRMCoreGuiButtonsA3(360 + i, guiLeft + 243, guiTop9 + 20 + skillID * 10 - 2, 10, 3));
                    int mindRequirement = JRMCoreH.skillMindRequirement(currentSkill, skls, sklsMR);
                    int mindRequirementResult = mindUsed + mindRequirement;
                    canAffordMind = JRMCoreH.canAffordSkill(JRMCoreH.statMindC(), mindRequirementResult);
                    d = JRMCoreH.isPowerTypeKi() && !JRMCoreH.rSai(JRMCoreH.Race) && currentSkill.contains(JRMCoreH.DBCSkillsIDs[9]) ? -1 : JRMCoreH.SklInit(currentSkill, skls, sklsUps);
                    int tpCost = JRMCoreH.skillTPCost(currentSkill, skls, sklsLvl);
                    if (n <= d && tpCost != -1) {
                        this.buttonList.add(new JRMCoreGuiButtonsA3(330 + i, guiLeft - 10, guiTop9 + 18 + skillID * 10, 10, 2, canAffordMind));
                    }
                    String st = n <= JRMCoreH.SklInit(currentSkill, skls, sklsUps) ? (tpCost == -1 ? JRMCoreH.trl("jrmc", "UpgradeLocked") : "TP: " + JRMCoreH.numSep(tpCost) + " M: " + JRMCoreH.numSep(mindRequirement)) : JRMCoreH.trl("jrmc", "Maxed");
                    var8.drawString(st, guiLeft + 240 - var8.getStringWidth(st), guiTop9 + 20 + skillID * 10, 0);
                }
            }
            var8.drawString(JRMCoreH.numSep(JRMCoreH.curTP) + " " + "Training Points" + " (TP)", guiLeft + 10, guiTop9 + 150, 0);
            String textCost = "TP and Mind Cost:";
            JRMCoreGuiScreen.drawStringWithBorder(var8, "TP and Mind Cost:", guiLeft + 250 - var8.getStringWidth("TP and Mind Cost:"), guiTop9 + 5 - 2, 16765738);
            JRMCoreGuiScreen.drawDetails("\u00a70" + JRMCoreH.trl("jrmc", "AvailableMind") + ": " + JRMCoreH.numSep(mindLeft), JRMCoreH.statMindC() >= JRMCoreGuiScreen.kqGW3Z(false) ? JRMCoreH.trl("jrmc", "SkillSysMax", JRMCoreH.clpr + JRMCoreH.PlyrSkills.length + JRMCoreH.cldgy) : JRMCoreH.trl("jrmc", "SkillSysNext", JRMCoreH.cllr + JRMCoreH.attrNms(JRMCoreH.Pwrtyp, 4) + JRMCoreH.cldgy, JRMCoreH.clpr + JRMCoreH.PlyrSkills.length + JRMCoreH.cldgy), guiLeft + 5, guiTop9 + 5, x, y, var8);
            if (this.confirmationWindow && this.IDtoProcessConfirmFor >= 0) {
                xSize = 140;
                ySize = 71;
                int wpx = 60;
                int wpy = 50;
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                guiLocation9 = new ResourceLocation(wish);
                JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation9);
                this.drawTexturedModalRect(guiLeft + wpx, guiTop9 + wpy, 0, 159, xSize, ySize);
                String curSkl = JRMCoreH.PlyrSkills[this.IDtoProcessConfirmFor];
                if (!curSkl.contains("pty") && curSkl.length() > 2) {
                    ++skillID;
                    String name3 = JRMCoreH.Pwrtyp == 1 ? JRMCoreH.trl("dbc", JRMCoreH.SklName(curSkl, skls, sklsNms)) : JRMCoreH.trl("nc", JRMCoreH.SklName(curSkl, skls, sklsNms));
                    JRMCoreH.txt(JRMCoreH.trl("jrmc", "delskillconfirm", name3), JRMCoreH.cldr, 0, true, guiLeft + wpx + 5, guiTop9 + wpy + 5, xSize - 10);
                    this.buttonList.add(new JRMCoreGuiButtons00(300 + this.IDtoProcessConfirmFor, guiLeft + 5 + wpx, guiTop9 + 45 + wpy, 40, 20, JRMCoreH.trl("jrmc", "Yes"), 0));
                }
                this.buttonList.add(new JRMCoreGuiButtons00(399, guiLeft + 95 + wpx, guiTop9 + 45 + wpy, 40, 20, JRMCoreH.trl("jrmc", "No"), 0));
            }
        }
        if (this.isGUIOpen(12)) {
            int sped;
            int costTp;
            int dmg;
            String[] techEffects;
            String[] techSpeed;
            String[] techAcquired;
            String[] techTypes;
            String[] techName;
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop10 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation10 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation10);
            this.drawTexturedModalRect(guiLeft, guiTop10, 0, 0, xSize, ySize);
            this.menuButtons("TE");
            if (JRMCoreH.Pwrtyp == 2) {
                techName = JRMCoreH.techNCName;
                techTypes = JRMCoreH.techNCTypes;
                techAcquired = JRMCoreH.techNCAcquired;
                techSpeed = JRMCoreH.techNCSpeed;
                techEffects = JRMCoreH.techNCEffects;
            } else {
                techName = JRMCoreH.techDBCName;
                techTypes = JRMCoreH.techDBCTypes;
                techAcquired = JRMCoreH.techDBCAcquired;
                techSpeed = JRMCoreH.techDBCSpeed;
                techEffects = JRMCoreH.techDBCEffects;
            }
            if (this.attViwPg == 0) {
                for (int i = 0; i < 4; i = (int)((byte)(i + 1))) {
                    if (JRMCoreH.tech(i) != null) {
                        String[] j = JRMCoreH.tech(i);
                        String name = j[0];
                        String acquired = j[1];
                        String owner = j[2];
                        String type = j[3];
                        String speed = j[4];
                        String dam = j[5];
                        String effect = j[6];
                        String cost = j[7];
                        String casttime = j[8];
                        String cooldown = j[9];
                        String color = j[10];
                        String density = j[11];
                        String sincantation = "";
                        String sfire = "";
                        String smove = "";
                        int exp = 0;
                        int lvl = 0;
                        int upg = 0;
                        byte[] sts = JRMCoreH.techDBCstatsDefault;
                        if (j.length > 12) {
                            sincantation = j[12];
                            sfire = j[13];
                            smove = j[14];
                        }
                        if (j.length > 16) {
                            exp = Integer.parseInt(j[16]);
                            lvl = Integer.parseInt(j[17]);
                            upg = Integer.parseInt(j[18]);
                            sts = JRMCoreH.tech_statmods(j[19]);
                        }
                        if (this.pwr == 1) {
                            int WILo;
                            JRMCoreClient.bars.renderEnSideBar();
                            boolean v = JRMCoreH.StusEfctsMe(10) || JRMCoreH.StusEfctsMe(11);
                            int WIL3 = WILo = JRMCoreH.PlyrAttrbts[3];
                            WIL3 = JRMCoreH.getPlayerAttribute((EntityPlayer)JRMCoreClient.mc.thePlayer, JRMCoreH.PlyrAttrbts, 3, JRMCoreH.State, JRMCoreH.State2, JRMCoreH.Race, JRMCoreH.PlyrSkillX, JRMCoreH.curRelease, JRMCoreH.getArcRsrv(), JRMCoreH.StusEfctsMe(14), JRMCoreH.StusEfctsMe(12), JRMCoreH.StusEfctsMe(5), JRMCoreH.StusEfctsMe(13), JRMCoreH.StusEfctsMe(19), JRMCoreH.StusEfctsMe(20), JRMCoreH.Pwrtyp, JRMCoreH.PlyrSkills, v, JRMCoreH.getMajinAbsorption());
                            int WIL2 = JRMCoreH.getPlayerAttribute((EntityPlayer)JRMCoreClient.mc.thePlayer, JRMCoreH.PlyrAttrbts, 3, 0, 0, JRMCoreH.Race, JRMCoreH.PlyrSkillX, JRMCoreH.curRelease, JRMCoreH.getArcRsrv(), JRMCoreH.StusEfctsMe(14), JRMCoreH.StusEfctsMe(12), JRMCoreH.StusEfctsMe(5), JRMCoreH.StusEfctsMe(13), JRMCoreH.StusEfctsMe(19), JRMCoreH.StusEfctsMe(20), JRMCoreH.Pwrtyp, JRMCoreH.PlyrSkills, v, JRMCoreH.getMajinAbsorption());
                            int stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 3, JRMCoreH.Pwrtyp, 4, WIL3, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                            int stat2 = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 3, JRMCoreH.Pwrtyp, 4, WIL2, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                            dmg = JRMCoreH.techDBCdmg(j, stat, sts);
                            String dam2 = "";
                            if (Integer.parseInt(type) == 6) {
                                dmg = (int)((float)dmg / 2.0f);
                            } else if (Integer.parseInt(type) == 7 || Integer.parseInt(type) == 8) {
                                dmg = (int)((float)dmg * 2.0f);
                                if (Integer.parseInt(type) == 8 && Integer.parseInt(effect) == 1) {
                                    dmg = (int)((float)dmg * 3.0f);
                                }
                            }
                            int costki = JRMCoreH.techDBCkic(j, stat2, sts);
                            costTp = JRMCoreH.techDBCtpc(j, false);
                            float cast = JRMCoreH.techDBCct(j, sts);
                            float cool = JRMCoreH.techDBCcd(j, sts);
                            String kipow = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][4]);
                            dmg = (int)((double)dmg * JRMCoreConfig.dat5696[Integer.parseInt(type)][1]);
                            costki = (int)((double)costki * JRMCoreConfig.dat5696[Integer.parseInt(type)][2]);
                            String c = JRMCoreH.clb;
                            int dmgPsbl = (int)((double)dmg * 0.01 * (double)JRMCoreH.curRelease);
                            var8.drawString(c + JRMCoreH.trl("dbc", techName[0]) + ": " + (JRMCoreConfig.dat5695[Integer.parseInt(type)] ? JRMCoreH.cldgy : JRMCoreH.cllr + "\u00a7m") + name, guiLeft + 5, guiTop10 + 15 + i * 35, 0);
                            var8.drawString(c + JRMCoreH.trl("dbc", techName[3]) + ": " + (JRMCoreConfig.dat5695[Integer.parseInt(type)] ? JRMCoreH.cldgy : JRMCoreH.cllr) + JRMCoreH.trl("dbc", techTypes[Integer.parseInt(type)]), guiLeft + 5, guiTop10 + 15 + 8 + i * 35, 0);
                            var8.drawString(c + JRMCoreH.trl("dbc", Integer.parseInt(type) != 7 ? techName[5] : "Shield") + ": \u00a78" + dmgPsbl + " (" + JRMCoreH.curRelease + "%)", guiLeft + 120, guiTop10 + 15 + 0 + i * 35, 0);
                            var8.drawString(c + JRMCoreH.trl("dbc", techName[7]) + ": \u00a78" + costki, guiLeft + 120, guiTop10 + 15 + 8 + i * 35, 0);
                            if (upg > 0) {
                                var8.drawString(c + JRMCoreH.trl("dbc", techName[18]) + ": \u00a78" + upg, guiLeft + 120, guiTop10 + 15 + 16 + i * 35, 0);
                            }
                            for (int k = 0; k < JRMCoreH.techDBCstatmods.length; ++k) {
                                boolean doit = true;
                                if (k == 0 && (Integer.parseInt(type) == 8 || Integer.parseInt(type) == 7)) {
                                    doit = false;
                                }
                                if (!doit) continue;
                                boolean b = upg > 0;
                                int ypos = guiTop10 + 32 + i * 35 + 0;
                                this.buttonList.add(new JRMCoreGuiButtonsA3(130 + i * 10 + k, guiLeft + 5 + k * 15, ypos, 10, 2, b));
                                String dat = JRMCoreH.techDBCstatmods[k];
                                if (k == 1 && Integer.parseInt(type) == 7) {
                                    dat = "ShieldInc";
                                }
                                String lines = JRMCoreH.trl("dbc", dat) + (sts[k] > 0 ? "\n " + (int)(JRMCoreH.tech_statmod(sts, k) * 100.0f) + "%%" : "");
                                JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(lines, JRMCoreH.cllr + JRMCoreH.attrCst(JRMCoreH.PlyrAttrbts, 0) + JRMCoreH.cldgy, ""), guiLeft + 5 + k * 15, ypos + 1, 10, 10, x, y, var8);
                            }
                            String exps = "EXP: " + JRMCoreH.cldgy + exp + "/" + JRMCoreH.tech_getexpFor(lvl);
                            String tt = (JRMCoreConfig.dat5695[Integer.parseInt(type)] ? "" : JRMCoreH.cllr + "\u00a7n\u00a7l" + JRMCoreH.trl("jrmc", "DisabledType") + "\n") + c + JRMCoreH.trl("dbc", techName[0]) + ": \u00a78" + name + "\n" + c + JRMCoreH.trl("dbc", techName[17]) + ": \u00a78" + lvl + " (" + (lvl < 10 ? exps : JRMCoreH.trl("jrmc", "Maxed")) + ")\n" + c + JRMCoreH.trl("dbc", techName[acquired.contains("1") ? 1 : 2]) + ": \u00a78" + (acquired.contains("1") ? JRMCoreH.trl("jrmc", techAcquired[Integer.parseInt(acquired)]) : owner) + "\n" + c + JRMCoreH.trl("dbc", techName[3]) + ": \u00a78" + JRMCoreH.trl("dbc", techTypes[Integer.parseInt(type)]) + " " + (sts[6] > 0 ? "(" + JRMCoreH.trl("dbc", JRMCoreH.techDBCstatmods[6]) + " +" + (int)(JRMCoreH.tech_statmod(sts, 6) * 100.0f) + "%%)" : "") + "\n" + c + JRMCoreH.trl("dbc", Integer.parseInt(type) != 7 ? techName[5] : "Shield") + ": \u00a78" + dmgPsbl + " (" + JRMCoreH.trl("dbc", "maxDmgDesc") + ")\n" + c + JRMCoreH.trl("dbc", Integer.parseInt(type) != 7 ? "potDmg" : "potShld") + ": \u00a78" + dmg + (sts[1] > 0 ? " (+" + (int)(JRMCoreH.tech_statmod(sts, 1) * 100.0f) + "%%)" : "") + "\n" + c + JRMCoreH.trl("dbc", techName[4]) + ": \u00a78" + JRMCoreH.trl("jrmc", techSpeed[Integer.parseInt(speed)]) + (sts[0] > 0 ? " (+" + (int)(JRMCoreH.tech_statmod(sts, 0) * 100.0f) + "%%)" : "") + "\n" + c + JRMCoreH.trl("dbc", techName[8]) + ": \u00a78" + JRMCoreH.round(cast, 1) + " sec" + (sts[3] > 0 ? " (" + (int)(JRMCoreH.tech_statmod(sts, 3) * 100.0f) + "%%)" : "") + "\n" + c + JRMCoreH.trl("dbc", techName[9]) + ": \u00a78" + JRMCoreH.round(cool, 1) + " sec" + (sts[4] > 0 ? " (" + (int)(JRMCoreH.tech_statmod(sts, 4) * 100.0f) + "%%)" : "") + "\n" + c + JRMCoreH.trl("dbc", techName[7]) + ": \u00a78" + JRMCoreH.techDBCkic(j, stat, sts) * (int)JRMCoreConfig.dat5696[Integer.parseInt(type)][2] + (sts[2] > 0 ? " (" + (int)(JRMCoreH.tech_statmod(sts, 2) * 100.0f) + "%%)" : "") + (sts[5] > 0 ? "\n" + c + JRMCoreH.trl("dbc", techName[11]) + ": \u00a78" + (int)JRMCoreH.tech_statmod(sts, 5) : "");
                            JRMCoreGuiScreen.drawDetails(tt, guiLeft + 5, guiTop10 + 15 + i * 35 + 1, 240, 20, x, y, this.fontRendererObj);
                        }
                        if (this.pwr == 2) {
                            int typ = Integer.parseInt(type);
                            sped = Integer.parseInt(speed);
                            int effe = Integer.parseInt(effect);
                            int costP = JRMCoreH.techNCCostP[Integer.parseInt(cost)];
                            int cst = (int)((double)costP * 0.01 * (double)JRMCoreH.maxEnergy);
                            cst = cst < 1 ? 1 : cst;
                            int dmg2 = (int)((float)cst - (float)cst * 0.25f * (float)sped + (typ == 0 ? (float)cst * 0.2f : 0.0f));
                            int ni = JRMCoreH.SklLvl(1, (byte)2);
                            int ge = JRMCoreH.SklLvl(2, (byte)2);
                            int afi = JRMCoreH.SklLvl(4, (byte)2);
                            int awi = JRMCoreH.SklLvl(5, (byte)2);
                            int ali = JRMCoreH.SklLvl(6, (byte)2);
                            int aea = JRMCoreH.SklLvl(7, (byte)2);
                            int awa = JRMCoreH.SklLvl(8, (byte)2);
                            int af = 0;
                            boolean may = false;
                            if (effe == 0 && afi > 0) {
                                may = true;
                                af = afi;
                            } else if (effe == 1 && awi > 0) {
                                may = true;
                                af = awi;
                            } else if (effe == 2 && ali > 0) {
                                may = true;
                                af = ali;
                            } else if (effe == 3 && aea > 0) {
                                may = true;
                                af = aea;
                            } else if (effe == 4 && awa > 0) {
                                may = true;
                                af = awa;
                            } else if (effe > 4) {
                                may = true;
                                af = ni;
                            }
                            double d = (float)dmg2 / 50.0f;
                            dmg2 = (int)(d * 20.0 + d * (double)((float)ni * 2.0f + (float)af));
                            dmg2 = dmg2 < 1 ? 1 : dmg2;
                            double cost1000 = (double)costP * 0.01 * 1000.0;
                            int dmg1000 = (int)(cost1000 - cost1000 * 0.25 * (double)sped + (typ == 0 ? cost1000 * (double)0.2f : 0.0));
                            int costTp2 = (int)(20.0 + cost1000 / 2.0);
                            String c = may ? "\u00a78" : "\u00a74";
                            String nameEffect = JRMCoreH.trl("nc", techEffects[effe]);
                            var8.drawString("\u00a70" + techName[0] + ": " + c + name, guiLeft + 5, guiTop10 + 15 + i * 35, 0);
                            var8.drawString("\u00a70" + techName[acquired.contains("1") ? 1 : 2] + ": " + c + (acquired.contains("1") ? techAcquired[Integer.parseInt(acquired)] : owner), guiLeft + 5, guiTop10 + 15 + 8 + i * 35, 0);
                            var8.drawString("\u00a70" + techName[3] + ": " + c + techTypes[typ], guiLeft + 5, guiTop10 + 15 + 16 + i * 35, 0);
                            var8.drawString("\u00a70" + techName[5] + ": " + c + (may ? dmg2 + " " + nameEffect + " " + JRMCoreH.techNCSpeed[sped + (typ == 2 ? 1 : 0)] : "No " + nameEffect + " Affinity!"), guiLeft + 120, guiTop10 + 15 + 0 + i * 35, 0);
                            var8.drawString("\u00a70" + techName[8] + ": " + c + JRMCoreH.techNCHS(j), guiLeft + 120, guiTop10 + 15 + 8 + i * 35, 0);
                            var8.drawString("\u00a70" + techName[7] + ": " + c + cst + " (" + costP + "%)", guiLeft + 120, guiTop10 + 15 + 16 + i * 35, 0);
                        }
                        this.buttonList.add(new JRMCoreGuiButtonsA2(240 + i, guiLeft - 10, guiTop10 + 10 + i * 35, "^"));
                        this.buttonList.add(new JRMCoreGuiButtons00(252 + i, guiLeft + 260, guiTop10 + 11 + i * 35, 60, 12, JRMCoreH.trl("jrmc", "Teach"), 0));
                        this.buttonList.add(new JRMCoreGuiButtons00(244 + i, guiLeft + 260, guiTop10 + 25 + i * 35, 60, 12, JRMCoreH.trl("jrmc", "Unlearn"), 0));
                        this.buttonList.add(new JRMCoreGuiButtonsA2(248 + i, guiLeft - 10, guiTop10 + 30 + i * 35, "v"));
                        continue;
                    }
                    this.buttonList.add(new JRMCoreGuiButtons00(200 + i, guiLeft + 85, guiTop10 + 25 + i * 35, 60, 20, JRMCoreH.trl("jrmc", "Create"), 0));
                }
                if (this.pwr == 2 || this.pwr == 1) {
                    String n = JRMCoreH.trl("jrmc", "Next");
                    int nw = this.fontRendererObj.getStringWidth(n) + 8;
                    this.buttonList.add(new JRMCoreGuiButtons00(120 + this.attViwPg + 1, posX + 122 - nw, posY - 100, nw, 20, n, 0));
                } else {
                    this.attViwPg = 0;
                }
            } else if (this.attViwPg == 1) {
                for (int i = 0; i < 4; i = (int)((byte)(i + 1))) {
                    if (JRMCoreH.techsPM(i) >= 0) {
                        String[] j = this.pwr == 2 ? JRMCoreH.pmj[JRMCoreH.techsPM(i)] : JRMCoreH.pmdbc[JRMCoreH.techsPM(i)];
                        String name = j[0];
                        String acquired = j[1];
                        int owner = Integer.parseInt(j[2]);
                        String type = j[3];
                        String speed = j[4];
                        String dam = j[5];
                        String effect = j[6];
                        String cost = j[7];
                        String casttime = j[8];
                        String cooldown = j[9];
                        String color = j[10];
                        String density = j[11];
                        String sincantation = "";
                        String sfire = "";
                        String smove = "";
                        if (j.length > 12) {
                            sincantation = j[12];
                            sfire = j[13];
                            smove = j[14];
                        }
                        int exp = 0;
                        int lvl = 0;
                        int upg = 0;
                        byte[] sts = JRMCoreH.techDBCstatsDefault;
                        if (j.length > 16) {
                            exp = Integer.parseInt(j[16]);
                            lvl = Integer.parseInt(j[17]);
                            upg = Integer.parseInt(j[18]);
                            sts = JRMCoreH.tech_statmods(j[19]);
                        }
                        if (this.pwr == 1) {
                            int WILo;
                            JRMCoreClient.bars.renderEnSideBar();
                            int dami = Integer.parseInt(dam);
                            int realDam = 0;
                            int realCst = (int)((float)(Integer.parseInt(cost) * JRMCoreH.curRelease) * 0.02f * (float)(JRMCoreH.State / 2 + 1));
                            if (Integer.parseInt(type) == 0) {
                                dami = (int)((float)dami * 0.5f);
                                realDam = (int)((float)realDam * 0.5f);
                            }
                            dami = dami < 1 ? 1 : dami;
                            realDam = realDam < 1 ? 1 : realDam;
                            boolean v = JRMCoreH.StusEfctsMe(10) || JRMCoreH.StusEfctsMe(11);
                            WIL = WILo = JRMCoreH.PlyrAttrbts[3];
                            WIL = JRMCoreH.getPlayerAttribute((EntityPlayer)JRMCoreClient.mc.thePlayer, JRMCoreH.PlyrAttrbts, 3, JRMCoreH.State, JRMCoreH.State2, JRMCoreH.Race, JRMCoreH.PlyrSkillX, JRMCoreH.curRelease, JRMCoreH.getArcRsrv(), JRMCoreH.StusEfctsMe(14), JRMCoreH.StusEfctsMe(12), JRMCoreH.StusEfctsMe(5), JRMCoreH.StusEfctsMe(13), JRMCoreH.StusEfctsMe(19), JRMCoreH.StusEfctsMe(20), JRMCoreH.Pwrtyp, JRMCoreH.PlyrSkills, v, JRMCoreH.getMajinAbsorption());
                            int stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 3, JRMCoreH.Pwrtyp, 4, WIL, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                            int dmg3 = JRMCoreH.techDBCdmg(j, stat, sts);
                            int costki = JRMCoreH.techDBCkic(j, stat, sts);
                            costTp = JRMCoreH.techDBCtpc(j, false);
                            float cast = JRMCoreH.techDBCct(j, sts);
                            float cool = JRMCoreH.techDBCcd(j, sts);
                            String kipow = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][4]);
                            String c = "\u00a70";
                            name = JRMCoreH.trl("dbc", name);
                            int dmgPsbl = (int)((double)dmg3 * 0.01 * (double)JRMCoreH.curRelease);
                            var8.drawString(c + JRMCoreH.trl("dbc", techName[0]) + ": \u00a78" + name, guiLeft + 5, guiTop10 + 15 + i * 35, 0);
                            var8.drawString(c + JRMCoreH.trl("dbc", techName[3]) + ": \u00a78" + techTypes[Integer.parseInt(type)], guiLeft + 5, guiTop10 + 15 + 8 + i * 35, 0);
                            var8.drawString(c + JRMCoreH.trl("dbc", techName[5]) + ": \u00a78" + dmgPsbl + " (" + JRMCoreH.curRelease + "%)", guiLeft + 120, guiTop10 + 15 + 0 + i * 35, 0);
                            var8.drawString(c + JRMCoreH.trl("dbc", techName[7]) + ": \u00a78" + JRMCoreH.techDBCkic(j, stat, sts), guiLeft + 120, guiTop10 + 15 + 8 + i * 35, 0);
                            String tt = c + JRMCoreH.trl("dbc", techName[0]) + ": \u00a78" + name + "\n" + c + JRMCoreH.trl("dbc", techName[acquired.contains("1") ? 1 : 2]) + ": \u00a78" + (acquired.contains("1") ? JRMCoreH.trl("jrmc", techAcquired[Integer.parseInt(acquired)]) : JRMCoreH.Masters[owner]) + "\n" + c + JRMCoreH.trl("dbc", techName[3]) + ": \u00a78" + JRMCoreH.trl("dbc", techTypes[Integer.parseInt(type)]) + "\n" + c + JRMCoreH.trl("dbc", techName[5]) + ": \u00a78" + dmgPsbl + " (" + JRMCoreH.trl("dbc", "maxDmgDesc") + ")\n" + c + JRMCoreH.trl("dbc", "potDmg") + ": \u00a78" + dmg3 + "\n" + c + JRMCoreH.trl("dbc", techName[4]) + ": \u00a78" + JRMCoreH.trl("jrmc", techSpeed[Integer.parseInt(speed)]) + "\n" + c + JRMCoreH.trl("dbc", techName[8]) + ": \u00a78" + JRMCoreH.round(cast, 1) + " sec\n" + c + JRMCoreH.trl("dbc", techName[9]) + ": \u00a78" + JRMCoreH.round(cool, 1) + " sec\n" + c + JRMCoreH.trl("dbc", techName[7]) + ": \u00a78" + JRMCoreH.techDBCkic(j, stat, sts);
                            JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(tt, new Object[0]), guiLeft + 5, guiTop10 + 15 + i * 35 + 1, 240, 20, x, y, this.fontRendererObj);
                        }
                        if (this.pwr == 2) {
                            int typ = Integer.parseInt(type);
                            sped = Integer.parseInt(speed);
                            int effe = Integer.parseInt(effect);
                            int dn = Integer.parseInt(density);
                            int costP = JRMCoreH.techNCCostP[Integer.parseInt(cost)];
                            int cst = (int)((double)costP * 0.01 * (double)JRMCoreH.maxEnergy);
                            cst = cst < 1 ? 1 : cst;
                            dmg = (int)((float)cst - (float)cst * 0.25f * (float)sped + (typ == 0 ? (float)cst * 0.2f : 0.0f));
                            int ni = JRMCoreH.SklLvl(1, (byte)2);
                            int ge = JRMCoreH.SklLvl(2, (byte)2);
                            int md = JRMCoreH.SklLvl(9, (byte)2);
                            int cc = JRMCoreH.SklLvl(3, (byte)2);
                            int afi = JRMCoreH.SklLvl(4, (byte)2);
                            int awi = JRMCoreH.SklLvl(5, (byte)2);
                            int ali = JRMCoreH.SklLvl(6, (byte)2);
                            int aea = JRMCoreH.SklLvl(7, (byte)2);
                            int awa = JRMCoreH.SklLvl(8, (byte)2);
                            int af = 0;
                            boolean may = false;
                            if (effe == 0 && afi > 0) {
                                may = true;
                                af = afi;
                            } else if (effe == 1 && awi > 0) {
                                may = true;
                                af = awi;
                            } else if (effe == 2 && ali > 0) {
                                may = true;
                                af = ali;
                            } else if (effe == 3 && aea > 0) {
                                may = true;
                                af = aea;
                            } else if (effe == 4 && awa > 0) {
                                may = true;
                                af = awa;
                            } else if (effe > 4) {
                                may = true;
                                af = ni;
                            }
                            if (dn == 1) {
                                double d = (float)dmg / 50.0f;
                                int n = dmg = (dmg = (int)(d * 20.0 + d * (double)((float)ni * 2.0f + (float)af))) < 1 ? 1 : dmg;
                            }
                            if (dn == 2) {
                                double d1;
                                String doujutsu = JRMCoreH.ncCSkls[JRMCoreH.Class];
                                int t = 0;
                                if (JRMCoreH.PlyrSkillY.contains(doujutsu) && doujutsu.equals("SG")) {
                                    t = Integer.parseInt(JRMCoreH.PlyrSkillY.replaceAll(doujutsu, ""));
                                }
                                dmg = (dmg = (int)((d1 = (double)((float)dmg / 15.0f)) * 5.0 + d1 * (double)ge)) < 1 ? 1 : dmg;
                                dmg = (int)((double)dmg * (1.0 + (double)t * 0.1));
                            }
                            if (dn == 4) {
                                double d1 = (float)dmg / 50.0f;
                                dmg = (int)(d1 * 20.0 + d1 * (double)((float)ni * 2.0f + (float)af));
                                dmg = (int)((double)dmg * (effe == 7 ? 1.0 : 0.5));
                                int n = dmg = dmg < 1 ? 1 : dmg;
                            }
                            if (dn == 5) {
                                double d1 = (float)dmg / 50.0f;
                                dmg = (dmg = (int)(d1 * 20.0 + d1 * (double)((float)md * 2.0f + (float)cc))) < 1 ? 1 : dmg;
                            }
                            String c = may ? "\u00a78" : "\u00a74";
                            double cost1000 = (double)costP * 0.01 * 1000.0;
                            int dmg1000 = (int)(cost1000 - cost1000 * 0.25 * (double)sped + (typ == 0 ? cost1000 * (double)0.2f : 0.0));
                            int costTp3 = (int)(20.0 + cost1000 / 2.0);
                            name = JRMCoreH.trl("nc", name);
                            String nameEffect = JRMCoreH.trl("nc", techEffects[effe]);
                            var8.drawString("\u00a70" + techName[0] + ": " + c + name, guiLeft + 5, guiTop10 + 15 + i * 35, 0);
                            var8.drawString("\u00a70" + techName[acquired.contains("1") ? 1 : 2] + ": " + c + (acquired.contains("1") ? techAcquired[Integer.parseInt(acquired)] : JRMCoreH.trl("nc", JRMCoreH.MastersNC[owner])), guiLeft + 5, guiTop10 + 15 + 8 + i * 35, 0);
                            var8.drawString("\u00a70" + techName[3] + ": " + c + techTypes[typ], guiLeft + 5, guiTop10 + 15 + 16 + i * 35, 0);
                            var8.drawString("\u00a70" + techName[5] + ": " + c + (may ? dmg + " " + nameEffect + " " + JRMCoreH.techNCSpeed[sped + (typ == 2 ? 1 : 0)] : "No " + nameEffect + " Affinity!"), guiLeft + 120, guiTop10 + 15 + 0 + i * 35, 0);
                            var8.drawString("\u00a70" + techName[8] + ": " + c + (casttime.equals("0") ? "Jutsu selector" : casttime), guiLeft + 120, guiTop10 + 15 + 8 + i * 35, 0);
                            var8.drawString("\u00a70" + techName[7] + ": " + c + cst + " (" + costP + "%)", guiLeft + 120, guiTop10 + 15 + 16 + i * 35, 0);
                            JRMCoreH.txt("Hover over and release " + Keyboard.getKeyName((int)NCKeyHandler.HandSeal1.getKeyCode()), JRMCoreH.cldgy, 0, true, 0, 0, 180);
                            String tt = JRMCoreH.cldr + techName[0] + ": " + c + name + "\n" + (casttime.equals("0") ? JRMCoreH.cldr + techName[8] + ": " + c + "None\n" + JRMCoreH.cldr + "Usage: " + JRMCoreH.cldg + "You must use the special jutsu selector on the right side.\n" + JRMCoreH.cldgy + JRMCoreH.cldr + "Keys: " + JRMCoreH.cldgy + "Press and Hold " + JRMCoreH.cllr + JRMCoreHC.getKey(JRMCoreKeyHandler.Fn.getKeyCode()) + ", " + JRMCoreH.cldgy + "then either press " + JRMCoreH.clpr + JRMCoreHC.getKey(JRMCoreGuiScreen.mc.gameSettings.keyBindPickBlock.getKeyCode()) + JRMCoreH.cldgy + " or use the Mouse Wheel to choose a special jutsu.\nTo Activate the selected jutsu Press " + JRMCoreH.clbe + JRMCoreHC.getKey(JRMCoreKeyHandler.KiAscend.getKeyCode()) + JRMCoreH.cldgy : JRMCoreH.cldr + techName[8] + ": " + c + casttime + "\n" + JRMCoreH.cldr + "Usage: " + JRMCoreH.cldg + "Combination of the \"Hand Seal\" keys\n" + JRMCoreH.cldr + "Keys: " + JRMCoreH.cldgy + JRMCoreH.cllr + JRMCoreHC.getKey(NCKeyHandler.HandSeal1.getKeyCode()) + JRMCoreH.cldgy + ", " + JRMCoreH.clpr + JRMCoreHC.getKey(NCKeyHandler.HandSeal2.getKeyCode()) + JRMCoreH.cldgy + ", " + JRMCoreH.clbe + JRMCoreHC.getKey(NCKeyHandler.HandSeal2.getKeyCode()));
                            JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(tt, new Object[0]), guiLeft + 5, guiTop10 + 15 + i * 35 + 1, 240, 20, x, y, this.fontRendererObj);
                        }
                        this.buttonList.add(new JRMCoreGuiButtonsA2(240 + i, guiLeft - 10, guiTop10 + 10 + i * 35, "^"));
                        this.buttonList.add(new JRMCoreGuiButtons00(244 + i, guiLeft + 260, guiTop10 + 25 + i * 35, 60, 20, JRMCoreH.trl("jrmc", "Unlearn"), 0));
                        this.buttonList.add(new JRMCoreGuiButtonsA2(248 + i, guiLeft - 10, guiTop10 + 30 + i * 35, "v"));
                        continue;
                    }
                    if (this.pwr != 2) continue;
                    this.buttonList.add(new JRMCoreGuiButtons00(200 + i, guiLeft + 85, guiTop10 + 25 + i * 35, 60, 20, JRMCoreH.trl("jrmc", "Learn"), 0));
                }
                if (this.pwr == 2 || this.pwr == 1) {
                    this.buttonList.add(new JRMCoreGuiButtons00(120 + this.attViwPg - 1, posX - 120, posY - 100, 40, 20, JRMCoreH.trl("jrmc", "Prev"), 0));
                } else {
                    this.attViwPg = 0;
                }
            }
        } else {
            this.attViwPg = 0;
        }
        if (this.isGUIOpen(13)) {
            String mod;
            String[] techEffects;
            String[] techSpeed;
            String[] techAcquired;
            String[] techTypes;
            String[] techName;
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop11 = (this.height - ySize) / 2;
            if (JRMCoreH.Pwrtyp == 2) {
                techName = JRMCoreH.techNCName;
                techTypes = JRMCoreH.techNCTypes;
                techAcquired = JRMCoreH.techNCAcquired;
                techSpeed = JRMCoreH.techNCSpeed;
                techEffects = JRMCoreH.techNCEffects;
                mod = "nc";
            } else {
                techName = JRMCoreH.techDBCName;
                techTypes = JRMCoreH.techDBCTypes;
                techAcquired = JRMCoreH.techDBCAcquired;
                techSpeed = JRMCoreH.techDBCSpeed;
                techEffects = JRMCoreH.techDBCEffects;
                mod = "dbc";
            }
            int xw = 0;
            if (this.pwr == 1) {
                xw = this.fontRendererObj.getStringWidth(JRMCoreH.trl("dbc", techName[0]));
            }
            ++this.text;
            if (this.text == 1 && this.attCrtPg == 0) {
                this.name(var8, guiLeft - (this.pwr == 1 ? 65 : 0) + xw, guiTop11 - (this.pwr == 1 ? 2 : 0));
                if (this.pwr == 1) {
                    this.inputField.setText(JRMCoreH2.kiAttNamGen() + " " + JRMCoreH.trl("dbc", JRMCoreH.techDBCTypes[techCrt[3]]));
                }
                if (this.pwr == 2) {
                    this.inputField.setText(JRMCoreH2.kiAttNamGen() + " " + JRMCoreH.trl("nc", JRMCoreH.techNCTypes[techCrt[3]]));
                }
            } else {
                this.text = 2;
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation11 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation11);
            this.drawTexturedModalRect(guiLeft, guiTop11, 0, 0, xSize, ySize);
            if (this.inputField != null && this.attCrtPg == 0) {
                this.inputField.drawTextBox();
                name = this.inputField.getText();
            }
            if (this.pwr == 1) {
                int WILo;
                int j;
                int n = this.attCrtPg == 0 ? 0 : (j = this.attCrtPg == 1 ? 12 : 13);
                while (j < (this.attCrtPg == 0 ? 12 : (this.attCrtPg == 1 ? 15 : 20))) {
                    boolean doit = true;
                    if (j == 4 && (techTypes[techCrt[3]].equals("Shield") || techTypes[techCrt[3]].equals("Explosion"))) {
                        doit = false;
                    }
                    if (doit) {
                        if (j > 2 && j != 7 && j != 8 && j != 9 && j != 11) {
                            this.buttonList.add(new JRMCoreGuiButtonsA2(-220 - j, guiLeft + 190 - 185, guiTop11 + 15 + (this.attCrtPg == 0 ? (j - 2) * 11 : (this.attCrtPg == 1 ? (j - 12) * 11 : 0)), "<"));
                        }
                        if (j > 2 && j != 7 && j != 8 && j != 9 && j != 11) {
                            this.buttonList.add(new JRMCoreGuiButtonsA2(220 + j, guiLeft + 200 - 185, guiTop11 + 15 + (this.attCrtPg == 0 ? (j - 2) * 11 : (this.attCrtPg == 1 ? (j - 12) * 11 : 0)), ">"));
                        }
                    }
                    ++j;
                }
                if (this.attCrtPg == 0) {
                    this.buttonList.add(new JRMCoreGuiButtonsA2(4890, guiLeft + 140 + xw, guiTop11 + 15 + 0, "<"));
                }
                if (this.attCrtPg == 1) {
                    for (j = 0; j < 3; ++j) {
                        if (techCrt[3] == 3) {
                            if (j != 1) continue;
                            this.buttonList.add(new JRMCoreGuiButtonsA2(190 + j, guiLeft + 215, guiTop11 + 15 + j * 11, ">"));
                            continue;
                        }
                        this.buttonList.add(new JRMCoreGuiButtonsA2(190 + j, guiLeft + 215, guiTop11 + 15 + j * 11, ">"));
                    }
                }
                int type = techCrt[3];
                int sped = techCrt[4];
                int effe = techCrt[6];
                String[] tech = new String[]{name, "" + techCrt[1], owner, "" + techCrt[3], "" + techCrt[4], "" + techCrt[5], "" + techCrt[6], "" + techCrt[7], "" + techCrt[8], "" + techCrt[9], "" + techCrt[10], "" + techCrt[11], "" + techCrt[12], "" + techCrt[13], "" + techCrt[14]};
                boolean v = JRMCoreH.StusEfctsMe(10) || JRMCoreH.StusEfctsMe(11);
                int WIL4 = WILo = JRMCoreH.PlyrAttrbts[3];
                WIL4 = JRMCoreH.getPlayerAttribute((EntityPlayer)JRMCoreClient.mc.thePlayer, JRMCoreH.PlyrAttrbts, 3, JRMCoreH.State, JRMCoreH.State2, JRMCoreH.Race, JRMCoreH.PlyrSkillX, JRMCoreH.curRelease, JRMCoreH.getArcRsrv(), JRMCoreH.StusEfctsMe(14), JRMCoreH.StusEfctsMe(12), JRMCoreH.StusEfctsMe(5), JRMCoreH.StusEfctsMe(13), JRMCoreH.StusEfctsMe(19), JRMCoreH.StusEfctsMe(20), JRMCoreH.Pwrtyp, JRMCoreH.PlyrSkills, v, JRMCoreH.getMajinAbsorption());
                int stat = JRMCoreH.stat((Entity)JRMCoreGuiScreen.mc.thePlayer, 3, JRMCoreH.Pwrtyp, 4, WIL4, JRMCoreH.Race, JRMCoreH.Class, 0.0f);
                byte[] sts = JRMCoreH.techDBCstatsDefault;
                int dmg = JRMCoreH.techDBCdmg(tech, stat, sts);
                int cost = JRMCoreH.techDBCkic(tech, stat, sts);
                int costTp = JRMCoreH.techDBCtpc(tech, false);
                float cast = JRMCoreH.techDBCct(tech, sts);
                float cool = JRMCoreH.techDBCcd(tech, sts);
                if (type == 6) {
                    dmg = (int)((float)((int)((float)((int)((float)dmg / 5.0f)) / 2.0f)) / 2.0f);
                    cost = (int)((float)cost / 5.0f);
                } else if (type == 7 || type == 8) {
                    dmg = (int)((float)dmg * 2.0f);
                    if (type == 8 && effe == 1) {
                        dmg = (int)((float)dmg * 3.0f);
                    }
                }
                dmg = (int)((double)dmg * JRMCoreConfig.dat5696[type][1]);
                cost = (int)((double)cost * JRMCoreConfig.dat5696[type][2]);
                String kipow = JRMCoreH.trl("jrmc", JRMCoreH.attrStat[JRMCoreH.Pwrtyp][4]);
                String c = "\u00a78";
                int px = 20;
                if (this.attCrtPg == 0) {
                    int i = 0;
                    var8.drawString(JRMCoreH.trl("dbc", techName[0]) + ": ", guiLeft + 10 + px, guiTop11 + 17 + i * 11, 0);
                    var8.drawString((JRMCoreConfig.dat5695[type] ? "" : JRMCoreH.cllr) + JRMCoreH.trl("dbc", techName[3]) + ": " + (JRMCoreConfig.dat5695[type] ? c : JRMCoreH.cllr) + JRMCoreH.trl("dbc", techTypes[techCrt[3]]), guiLeft + 10 + px, guiTop11 + 17 + ++i * 11, 0);
                    var8.drawString(JRMCoreH.trl("dbc", techName[4]) + ": " + c + JRMCoreH.trl("jrmc", JRMCoreH.techDBCSpeed[techCrt[4] + (type == 2 ? 1 : 0)]) + "", guiLeft + 10 + px, guiTop11 + 17 + ++i * 11, 0);
                    var8.drawString(JRMCoreH.trl("dbc", type != 7 ? techName[5] : "Shield") + ": " + c + dmg + " (" + kipow + " " + tech[5] + "%)", guiLeft + 10 + px, guiTop11 + 17 + ++i * 11, 0);
                    var8.drawString((JRMCoreConfig.dat5709[type] ? "" : JRMCoreH.cllr) + JRMCoreH.trl("dbc", techName[6]) + ": " + (JRMCoreConfig.dat5709[type] ? c : JRMCoreH.cllr) + JRMCoreH.trl("jrmc", techEffects[techCrt[6]]) + c, guiLeft + 10 + px, guiTop11 + 17 + ++i * 11, 0);
                    var8.drawString(JRMCoreH.trl("dbc", techName[7]) + ": " + c + cost + " ", guiLeft + 10 + px, guiTop11 + 17 + ++i * 11, 0);
                    var8.drawString(JRMCoreH.trl("dbc", techName[8]) + ": " + c + JRMCoreH.round(cast, 1) + " sec", guiLeft + 10 + px, guiTop11 + 17 + ++i * 11, 0);
                    var8.drawString(JRMCoreH.trl("dbc", techName[9]) + ": " + c + JRMCoreH.round(cool, 1) + " sec", guiLeft + 10 + px, guiTop11 + 17 + ++i * 11, 0);
                    var8.drawString(JRMCoreH.trl("dbc", techName[10]) + ": " + c + JRMCoreH.trl("jrmc", JRMCoreH.techColName[techCrt[10]]), guiLeft + 10 + px, guiTop11 + 17 + ++i * 11, 0);
                    ++i;
                    String n6 = JRMCoreH.trl("jrmc", "Next");
                    int nw = this.fontRendererObj.getStringWidth(n6) + 8;
                    this.buttonList.add(new JRMCoreGuiButtons00(120 + this.attCrtPg + 1, posX + 130, posY + 40, nw, 20, n6, 0));
                } else if (this.attCrtPg == 1) {
                    var8.drawString(JRMCoreH.trl("dbc", techName[12]) + ": \u00a78" + (Integer.parseInt(tech[12]) + 1), guiLeft + 10 + px, guiTop11 + 15 + 0, 0);
                    var8.drawString(JRMCoreH.trl("dbc", techName[13]) + ": \u00a78" + (Integer.parseInt(tech[13]) + 1), guiLeft + 10 + px, guiTop11 + 15 + 11, 0);
                    var8.drawString(JRMCoreH.trl("dbc", techName[14]) + ": \u00a78" + (Integer.parseInt(tech[14]) + 1), guiLeft + 10 + px, guiTop11 + 15 + 22, 0);
                    String n7 = JRMCoreH.trl("jrmc", "Prev");
                    int nw = this.fontRendererObj.getStringWidth(n7) + 8;
                    this.buttonList.add(new JRMCoreGuiButtons00(120 + this.attCrtPg - 1, posX - 130 - nw, posY + 40, nw, 20, n7, 0));
                }
                var8.drawString("TP Current/Cost: \u00a78" + JRMCoreH.numSep(JRMCoreH.curTP) + "/" + JRMCoreH.numSep(costTp), guiLeft + 10, guiTop11 + 15 + 121, 0);
                this.buttonList.add(new JRMCoreGuiButtons00(102, posX - 170, posY + 65, 40, 20, JRMCoreH.trl("jrmc", "Back"), 0));
                if (costTp <= JRMCoreH.curTP) {
                    this.buttonList.add(new JRMCoreGuiButtons00(210, posX + 130, posY + 65, 40, 20, JRMCoreH.trl("jrmc", "Accept"), 0));
                }
                if (this.attCrtPg == 0) {
                    int col;
                    String ic = "jinryuumodscore:icons5.png";
                    ResourceLocation tx = new ResourceLocation(ic);
                    JRMCoreGuiScreen.mc.renderEngine.bindTexture(tx);
                    type = techCrt[3];
                    int dam = techCrt[5];
                    int effect = techCrt[6];
                    int cd = techCrt[9];
                    int color = techCrt[10];
                    int den = techCrt[11];
                    int size = dam / 5;
                    int xSize22 = 9;
                    int ySize22 = 9;
                    guiLeft = guiLeft + xSize - xSize22 * 5;
                    guiTop11 = guiTop11 + ySize22 + 7;
                    if (effect == 1) {
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                        this.drawTexturedModalRect(guiLeft, guiTop11, 178, 0, xSize22, ySize22);
                    }
                    if ((col = color) == 0 && JRMCoreH.align > 66) {
                        col = 2;
                    }
                    if (col == 0 && JRMCoreH.align <= 66 && JRMCoreH.align >= 33) {
                        col = 3;
                    }
                    if (col == 0 && JRMCoreH.align < 33) {
                        col = 4;
                    }
                    col = JRMCoreH.techCol[col];
                    float h2 = (float)(col >> 16 & 0xFF) / 255.0f;
                    float h3 = (float)(col >> 8 & 0xFF) / 255.0f;
                    float h4 = (float)(col & 0xFF) / 255.0f;
                    GL11.glColor4f((float)h2, (float)h3, (float)h4, (float)1.0f);
                    this.drawTexturedModalRect(guiLeft, guiTop11, 187 + size / 5 * xSize22, type * ySize22, xSize22, ySize22);
                }
            }
            if (this.pwr == 2) {
                int j;
                int n = this.attCrtPg == 0 ? 0 : (j = this.attCrtPg == 1 ? 12 : 13);
                while (j < (this.attCrtPg == 0 ? 12 : (this.attCrtPg == 1 ? 15 : 20))) {
                    if (j > 2 && j != 5 && j != 8 && j != 9 && j != 10 && j != 11) {
                        this.buttonList.add(new JRMCoreGuiButtonsA2(-220 - j, guiLeft + 190 - 185, guiTop11 + 15 + (this.attCrtPg == 0 ? (j - 1) * 11 : (this.attCrtPg == 1 ? (j - 12) * 11 : 0)), "<"));
                    }
                    if (j > 2 && j != 5 && j != 8 && j != 9 && j != 10 && j != 11) {
                        this.buttonList.add(new JRMCoreGuiButtonsA2(220 + j, guiLeft + 200 - 185, guiTop11 + 15 + (this.attCrtPg == 0 ? (j - 1) * 11 : (this.attCrtPg == 1 ? (j - 12) * 11 : 0)), ">"));
                    }
                    ++j;
                }
                this.buttonList.add(new JRMCoreGuiButtonsA2(195, guiLeft + 215, guiTop11 + 15 + 0, ">"));
                if (this.attCrtPg == 1) {
                    for (j = 0; j < 3; ++j) {
                        this.buttonList.add(new JRMCoreGuiButtonsA2(190 + j, guiLeft + 215, guiTop11 + 15 + j * 11, ">"));
                    }
                }
                int type = techCrt[3];
                int sped = techCrt[4];
                int effe = techCrt[6];
                String[] tech = new String[]{name, "" + techCrt[1], owner, "" + techCrt[3], "" + techCrt[4], "" + techCrt[5], "" + techCrt[6], "" + techCrt[7], "" + techCrt[8], "" + techCrt[9], "" + techCrt[10], "" + techCrt[11], "" + techCrt[12], "" + techCrt[13], "" + techCrt[14]};
                int costP = JRMCoreH.techNCCostP[techCrt[7]];
                int cost = (int)((double)costP * 0.01 * (double)JRMCoreH.maxEnergy);
                cost = cost < 1 ? 1 : cost;
                int dmg = (int)((float)cost - (float)cost * 0.25f * (float)sped + (type == 0 ? (float)cost * 0.2f : 0.0f));
                int ni = JRMCoreH.SklLvl(1, (byte)2);
                int ge = JRMCoreH.SklLvl(2, (byte)2);
                int afi = JRMCoreH.SklLvl(4, (byte)2);
                int awi = JRMCoreH.SklLvl(5, (byte)2);
                int ali = JRMCoreH.SklLvl(6, (byte)2);
                int aea = JRMCoreH.SklLvl(7, (byte)2);
                int awa = JRMCoreH.SklLvl(8, (byte)2);
                int af = 0;
                boolean may = false;
                if (effe == 0 && afi > 0) {
                    may = true;
                    af = afi;
                } else if (effe == 1 && awi > 0) {
                    may = true;
                    af = awi;
                } else if (effe == 2 && ali > 0) {
                    may = true;
                    af = ali;
                } else if (effe == 3 && aea > 0) {
                    may = true;
                    af = aea;
                } else if (effe == 4 && awa > 0) {
                    may = true;
                    af = awa;
                } else if (effe > 4) {
                    may = true;
                    af = ni;
                }
                float d = (float)dmg / 50.0f;
                dmg = (int)(d * 20.0f + d * ((float)ni * 2.0f + (float)af));
                dmg = dmg < 1 ? 1 : dmg;
                String c = may ? "\u00a78" : "\u00a74";
                double cost1000 = (double)costP * 0.01 * 1000.0;
                int dmg1000 = (int)(cost1000 - cost1000 * 0.25 * (double)sped + (type == 0 ? cost1000 * (double)0.2f : 0.0));
                int costTp = (int)(20.0 + cost1000 / 2.0);
                int px = 20;
                if (this.attCrtPg == 0) {
                    var8.drawString(techName[0] + ": ", guiLeft + 10 + px, guiTop11 + 17 + 0, 0);
                    var8.drawString(techName[2] + ": " + c + owner, guiLeft + 10 + px, guiTop11 + 17 + 11, 0);
                    var8.drawString(techName[3] + ": " + c + techTypes[techCrt[3]], guiLeft + 10 + px, guiTop11 + 17 + 22, 0);
                    var8.drawString(techName[4] + ": " + c + JRMCoreH.techNCSpeed[techCrt[4] + (type == 2 ? 1 : 0)] + "", guiLeft + 10 + px, guiTop11 + 17 + 33, 0);
                    var8.drawString(techName[5] + ": " + c + (may ? dmg + " \u00a70->with 1000 Chakra: " + c + dmg1000 : "No Affinity!"), guiLeft + 10 + px, guiTop11 + 17 + 44, 0);
                    var8.drawString(techName[6] + ": " + c + JRMCoreH.trl(mod, techEffects[techCrt[6]]), guiLeft + 10 + px, guiTop11 + 17 + 55, 0);
                    var8.drawString(techName[7] + ": " + c + cost + " (" + costP + "%)", guiLeft + 10 + px, guiTop11 + 17 + 66, 0);
                    var8.drawString(techName[8] + ": " + c + JRMCoreH.techNCHS(tech) + "", guiLeft + 10 + px, guiTop11 + 17 + 77, 0);
                } else if (this.attCrtPg == 1) {
                    // empty if block
                }
                var8.drawString("TP Current/Cost: \u00a78" + JRMCoreH.numSep(JRMCoreH.curTP) + "/" + JRMCoreH.numSep(costTp), guiLeft + 10, guiTop11 + 15 + 121, 0);
                this.buttonList.add(new JRMCoreGuiButtons00(102, posX - 170, posY + 65, 40, 20, JRMCoreH.trl("jrmc", "Back"), 0));
                if (costTp <= JRMCoreH.curTP) {
                    this.buttonList.add(new JRMCoreGuiButtons00(210, posX + 130, posY + 65, 40, 20, JRMCoreH.trl("jrmc", "Accept"), 0));
                }
            }
        } else {
            this.text = 0;
            this.attCrtPg = 0;
        }
        if (this.isGUIOpen(15)) {
            String mod;
            String[][] PMA;
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop12 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation12 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation12);
            this.drawTexturedModalRect(guiLeft, guiTop12, 0, 0, xSize, ySize);
            this.buttonList.add(new JRMCoreGuiButtons00(10, posX - 150, posY + 65, 20, 20, "X", 0));
            if (this.pwr == 2) {
                PMA = JRMCoreH.pmj;
                mod = "nc";
            } else {
                PMA = JRMCoreH.pmdbc;
                mod = "dbc";
            }
            var8.drawString(JRMCoreH.numSep(JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop12 + 5, 0);
            int i2 = 0;
            int nms = PMA.length;
            for (int i = 0; i < nms; i = (int)((byte)(i + 1))) {
                if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                    String fn = JRMCoreH.trl(mod, PMA[i][0]);
                    int fnw = this.fontRendererObj.getStringWidth(fn);
                    var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop12 + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, 0);
                    String on = JRMCoreH.techOwnd(i, this.pwr) ? " " + JRMCoreH.trl("jrmc", "Owned") : "";
                    int onw = this.fontRendererObj.getStringWidth(on);
                    var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop12 + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                    if (!JRMCoreH.techOwnd(i, this.pwr)) {
                        int costP = JRMCoreH.techNCCostP[Integer.parseInt(PMA[i][7])];
                        double cost1000 = (double)costP * 0.01 * 1000.0;
                        int sped = Integer.parseInt(PMA[i][4]);
                        int type = Integer.parseInt(PMA[i][3]);
                        int dmg1000 = (int)(cost1000 - cost1000 * 0.25 * (double)sped + (type == 0 ? cost1000 * (double)0.2f : 0.0));
                        int costTp = (int)(20.0 + cost1000 / 2.0);
                        int cost = (int)((float)costTp * 1.5f);
                        String n = " " + cost + " tp";
                        int nw = this.fontRendererObj.getStringWidth(fn);
                        if (JRMCoreH.curTP >= cost) {
                            this.buttonList.add(new JRMCoreGuiButtons01(!JRMCoreH.techOwnd(i, this.pwr) ? 4200 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop12 + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, nw, n, JRMCoreH.techNCCol[1]));
                        } else {
                            var8.drawString(n, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop12 + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                        }
                    }
                }
                ++i2;
            }
            int NC_Page_Limit = 14;
            if (i2 > 14 + this.lp * 14) {
                String n = JRMCoreH.trl("jrmc", "Next");
                this.buttonList.add(new JRMCoreGuiButtons00(88, guiLeft + xSize / 2 + 130, guiTop12 + (ySize + 1) / 2 + 15, this.fontRendererObj.getStringWidth(n) + 8, 20, n, 0));
            }
            if (this.lp != 0) {
                String p = JRMCoreH.trl("jrmc", "Prev");
                int pw = this.fontRendererObj.getStringWidth(p) + 8;
                this.buttonList.add(new JRMCoreGuiButtons00(89, guiLeft + xSize / 2 - 130 - pw, guiTop12 + (ySize + 1) / 2 + 15, pw, 20, p, 0));
            }
        } else {
            this.lp = 0;
        }
        if (this.isGUIOpen(16)) {
            String mod;
            String[] Skls;
            int[][] SklsMR;
            int[][] SklsLvl;
            String[] SklsNms;
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop13 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation13 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation13);
            this.drawTexturedModalRect(guiLeft, guiTop13, 0, 0, xSize, ySize);
            this.buttonList.add(new JRMCoreGuiButtons00(10, posX - 150, posY + 65, 20, 20, "X", 0));
            if (this.pwr == 2) {
                SklsNms = JRMCoreH.NCSkillNames;
                SklsLvl = JRMCoreH.NCSkillTPCost;
                SklsMR = JRMCoreH.NCSkillMindCost;
                Skls = JRMCoreH.NCSkillIDs;
                mod = "nc";
            } else {
                SklsNms = JRMCoreH.DBCSkillNames;
                SklsLvl = JRMCoreH.DBCSkillTPCost;
                SklsMR = JRMCoreH.DBCSkillMindCost;
                Skls = JRMCoreH.DBCSkillsIDs;
                mod = "dbc";
            }
            var8.drawString(JRMCoreH.numSep(JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop13 + 5, 0);
            int i2 = 0;
            int nms = SklsNms.length;
            for (int i = 0; i < nms; i = (int)((byte)(i + 1))) {
                if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                    String fn = JRMCoreH.trl(mod, SklsNms[i]);
                    int fnw = this.fontRendererObj.getStringWidth(fn);
                    var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop13 + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, 0);
                    String on = JRMCoreH.SklLvl(i, this.pwr) < 1 ? "" : " " + JRMCoreH.trl("jrmc", "Owned");
                    int onw = this.fontRendererObj.getStringWidth(on);
                    var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop13 + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                    if (JRMCoreH.SklLvl(i, this.pwr) < 1) {
                        int tpCost = JRMCoreH.getSkillTPCost(i, 0, JRMCoreH.isPowerTypeKi());
                        String n = " " + tpCost + " tp";
                        int s = JRMCoreH.skillMindRequirement(Skls[i], Skls, SklsMR);
                        String n2 = " " + JRMCoreH.trl("jrmc", "Mind") + ": " + s;
                        int nw = this.fontRendererObj.getStringWidth(fn);
                        int mx = JRMCoreH.skillSlot_MindUsed() + s;
                        boolean ssm = JRMCoreH.canAffordSkill(JRMCoreH.statMindC(), mx);
                        if (tpCost != -1 && JRMCoreH.curTP >= tpCost && ssm) {
                            this.buttonList.add(new JRMCoreGuiButtons01(JRMCoreH.SklLvl(i, this.pwr) < 1 ? 4000 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop13 + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, nw, n, JRMCoreH.techNCCol[1]));
                        } else {
                            var8.drawString(n, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop13 + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                        }
                        var8.drawString(n2, guiLeft + xSize / 2 - 122 + fnw + onw + this.fontRendererObj.getStringWidth(n), guiTop13 + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, ssm ? 32768 : JRMCoreH.techNCCol[0]);
                    }
                }
                ++i2;
            }
            if (i2 > 13 + this.lp * 13) {
                String n = JRMCoreH.trl("jrmc", "Next");
                this.buttonList.add(new JRMCoreGuiButtons00(88, guiLeft + xSize / 2 + 130, guiTop13 + (ySize + 1) / 2 + 15, this.fontRendererObj.getStringWidth(n) + 8, 20, n, 0));
            }
            if (this.lp != 0) {
                String p = JRMCoreH.trl("jrmc", "Prev");
                int pw = this.fontRendererObj.getStringWidth(p) + 8;
                this.buttonList.add(new JRMCoreGuiButtons00(89, guiLeft + xSize / 2 - 130 - pw, guiTop13 + (ySize + 1) / 2 + 15, pw, 20, p, 0));
            }
        } else {
            this.lp = 0;
        }
        if (this.isGUIOpen(17)) {
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop14 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation14 = new ResourceLocation(wish);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation14);
            this.drawTexturedModalRect(guiLeft, guiTop14, 0, 0, xSize, ySize);
            this.menuButtons("TR");
            String sn = " " + JRMCoreH.trl("jrmc", "Start");
            int snw = this.fontRendererObj.getStringWidth(sn);
            int il = 0;
            boolean ir = false;
            String fn = JRMCoreH.trl("jrmc", "Training");
            String fd = JRMCoreH.trl("jrmc", "TrainingDesc");
            JRMCoreGuiScreen.drawDetails(fn, JRMCoreH.cct(fd, JRMCoreHC.BPC_ME2), guiLeft + 5, guiTop14 + 5 + il * 15, x, y, var8);
            fn = JRMCoreH.TrnngOptnsNam(0);
            fd = JRMCoreH.TrnngOptnsDesc(0);
            int fnw = this.fontRendererObj.getStringWidth(fn);
            this.buttonList.add(new JRMCoreGuiButtons01(-30, guiLeft + 5 + fnw, guiTop14 + 5 + ++il * 15, snw, sn, JRMCoreH.techNCCol[1]));
            JRMCoreGuiScreen.drawDetails(fn, JRMCoreH.cct(fd, new Object[0]), guiLeft + 5, guiTop14 + 5 + il * 15, x, y, var8);
            fn = JRMCoreH.TrnngOptnsNam(1);
            fd = JRMCoreH.TrnngOptnsDesc(1);
            fnw = this.fontRendererObj.getStringWidth(fn);
            this.buttonList.add(new JRMCoreGuiButtons01(-31, guiLeft + 5 + fnw, guiTop14 + 5 + ++il * 15, snw, sn, JRMCoreH.techNCCol[1]));
            JRMCoreGuiScreen.drawDetails(fn, JRMCoreH.cct(fd, new Object[0]), guiLeft + 5, guiTop14 + 5 + il * 15, x, y, var8);
            fn = JRMCoreH.TrnngOptnsNam(3);
            fd = JRMCoreH.TrnngOptnsDesc(3);
            fnw = this.fontRendererObj.getStringWidth(fn);
            this.buttonList.add(new JRMCoreGuiButtons01(-34, guiLeft + 5 + fnw, guiTop14 + 5 + ++il * 15, snw, sn, JRMCoreH.techNCCol[1]));
            JRMCoreGuiScreen.drawDetails(fn, JRMCoreH.cct(fd, new Object[0]), guiLeft + 5, guiTop14 + 5 + il * 15, x, y, var8);
            ++il;
        } else if (this.isGUIOpen(18)) {
            int actualReward;
            int possibleReward;
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop15 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation15 = new ResourceLocation(MiniGame.training1gui);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation15);
            this.drawTexturedModalRect(guiLeft, guiTop15, 0, 0, xSize, ySize);
            this.buttonList.add(new JRMCoreGuiButtons00(10, posX - 150, posY + 65, 20, 20, "X", 0));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            guiLocation15 = new ResourceLocation(MiniGame.training1);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation15);
            this.miniGameConcentration.stateManager(guiLeft += 5, guiTop15 += 5);
            this.buttonList.add(new JRMCoreGuiButtonsMG0(-32, guiLeft, guiTop15, 150, 150, "", 0));
            int i = 0;
            int COLOR_ID = 6;
            String[] stringArray = new String[5];
            stringArray[0] = MiniGameConcentration.States[this.miniGameConcentration.state];
            stringArray[1] = "Lives: " + this.miniGameConcentration.lives;
            stringArray[2] = "Level: " + this.miniGameConcentration.lvl;
            stringArray[3] = "Score: " + this.miniGameConcentration.score;
            stringArray[4] = this.miniGameConcentration.temporaryMessage;
            String[] texts = stringArray;
            int xPos = guiLeft + 155;
            for (String text : texts) {
                JRMCoreGuiScreen.drawStringWithBorder(var8, text, xPos, guiTop15 + 10 + i * 10, JRMCoreH.techNCCol[6]);
                ++i;
            }
            ++i;
            int limit = (int)((float)JGConfigMiniGameConcentration.TPDailyLimit * (JGConfigMiniGameConcentration.TPlimitIncreasesWithPlayerLevel > 0.0f ? (float)JRMCoreH.getPlayerLevel(JRMCoreH.PlyrAttrbts) * JGConfigMiniGameConcentration.TPlimitIncreasesWithPlayerLevel : 1.0f));
            if (JGConfigMiniGameConcentration.TPGainOn) {
                JRMCoreGuiScreen.drawStringWithBorder(var8, "Used limit: " + JRMCoreH.trngTPlmt + "/" + limit, xPos, guiTop15 + 10 + i * 10, JRMCoreH.techNCCol[6]);
                ++i;
            }
            if (this.miniGameConcentration.state == 3) {
                possibleReward = (int)((float)this.miniGameConcentration.score * JGConfigMiniGameConcentration.TPMultiplier);
                if (JGConfigMiniGameConcentration.TPGainOn && possibleReward > 0) {
                    actualReward = JRMCoreH.trngTPlmt + possibleReward;
                    int reward = possibleReward;
                    if (limit < actualReward) {
                        reward = possibleReward - (actualReward - limit);
                        actualReward = limit;
                    }
                    JRMCoreGuiScreen.drawStringWithBorder(var8, "Reward: " + reward + " TP", xPos, guiTop15 + 10 + i * 10, JRMCoreH.techNCCol[6]);
                    String buttonText = "Claim TP";
                    int buttonTextWidth = this.fontRendererObj.getStringWidth(buttonText);
                    this.buttonList.add(new JRMCoreGuiButtons00(-33, xPos + 10, guiTop15 + 10 + ++i * 10 + 10, buttonTextWidth + 10, 20, buttonText, 0));
                    ++i;
                }
            }
            if (this.miniGameConcentration.state == 2) {
                JRMCoreGuiScreen.drawStringWithBorder(var8, "TP gain: " + (JGConfigMiniGameConcentration.TPGainOn ? "Enabled" : "Disabled"), xPos, guiTop15 + 10 + i * 10, JRMCoreH.techNCCol[6]);
                ++i;
                possibleReward = (int)((float)this.miniGameConcentration.score * JGConfigMiniGameConcentration.TPMultiplier);
                if (JGConfigMiniGameConcentration.TPGainOn && possibleReward > 0) {
                    actualReward = JRMCoreH.trngTPlmt + possibleReward;
                    int reward = possibleReward;
                    if (limit < actualReward) {
                        reward = possibleReward - (actualReward - limit);
                        actualReward = limit;
                    }
                    JRMCoreGuiScreen.drawStringWithBorder(var8, "Reward: " + reward + " TP", xPos, guiTop15 + 10 + i * 10, JRMCoreH.techNCCol[6]);
                    String buttonText = "Claim TP";
                    int buttonTextWidth = this.fontRendererObj.getStringWidth(buttonText);
                    this.buttonList.add(new JRMCoreGuiButtons00(-33, xPos + 10, guiTop15 + 10 + ++i * 10 + 10, buttonTextWidth + 10, 20, buttonText, 0));
                    ++i;
                }
            }
        } else if (this.isGUIOpen(10002)) {
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            int guiTop16 = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation guiLocation16 = new ResourceLocation(MiniGame.training1gui);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation16);
            this.drawTexturedModalRect(guiLeft, guiTop16, 0, 0, xSize, ySize);
            if (JGConfigClientSettings.airboxing3DCharacterOn) {
                if (this.entityTest == null) {
                    this.entityTest = new EntityNull(null);
                }
                JRMCoreGuiScreen.func_110423_a(guiLeft + 35, guiTop16 + 23, 45, 0.0f, 0.0f, (EntityLivingBase)this.entityTest, false, false, false);
            } else if (this.entityTest != null) {
                this.entityTest = null;
            }
            int combo = this.miniGameAirBoxing.comboCounter;
            if (JGConfigClientSettings.airboxing3DAuraOn) {
                if (this.entityTests2 == null) {
                    this.entityTests2 = new ArrayList();
                    this.timer = Instant.now();
                }
                if (combo > 0) {
                    float f2 = Duration.between(this.timer, Instant.now()).toMillis();
                    int n = combo / 2 > 20 ? 20 : combo / 2 + 1;
                    if (!(!(f2 >= (float)(200 / n)) || JRMCoreClient.mc.thePlayer.worldObj.isRemote && JRMCoreClient.mc.isGamePaused())) {
                        int count;
                        this.timer = Instant.now();
                        int n8 = count = combo / 2 >= 20 ? combo / 50 + 1 : 1;
                        if (count > 5) {
                            count = 5;
                        }
                        for (int i = 0; i < count; ++i) {
                            this.entityTests2.add(new EntityAuraFlat(null));
                        }
                    }
                }
                for (int i = this.entityTests2.size() - 1; i >= 0; --i) {
                    JRMCoreGuiScreen.func_110423_a(guiLeft + 35, guiTop16 + 23, 45, 0.0f, 0.0f, (EntityLivingBase)this.entityTests2.get(i), false, false, false);
                    if (!this.entityTests2.get((int)i).isDead) continue;
                    this.entityTests2.remove(i);
                }
            } else if (this.entityTests2 != null) {
                this.entityTests2 = null;
                this.timer = null;
            }
            this.buttonList.add(new JRMCoreGuiButtons00(10, posX - 150, posY + 65, 20, 20, "X", 0));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            guiLocation16 = new ResourceLocation(MiniGame.training1);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation16);
            this.miniGameAirBoxing.stateManager(guiLeft += 5, guiTop16 += 5);
            int i = 0;
            int COLOR_ID = 6;
            guiTop16 = guiTop16 + 5 + 20;
            String[] stringArray = new String[5];
            stringArray[0] = MiniGameAirBoxing.States[this.miniGameAirBoxing.state];
            stringArray[1] = "Lives: " + this.miniGameAirBoxing.lives;
            stringArray[2] = "Level: " + this.miniGameAirBoxing.lvl;
            stringArray[3] = "Score: " + this.miniGameAirBoxing.score;
            stringArray[4] = combo > 0 ? combo + "x combo" : "";
            String[] texts = stringArray;
            int xPos = guiLeft + 145;
            for (String text : texts) {
                JRMCoreGuiScreen.drawStringWithBorder(var8, text, xPos, guiTop16 + i * 10, JRMCoreH.techNCCol[6]);
                ++i;
            }
            ++i;
            int limit = (int)((float)JGConfigMiniGameAirBoxing.TPDailyLimit * (JGConfigMiniGameAirBoxing.TPlimitIncreasesWithPlayerLevel > 0.0f ? (float)JRMCoreH.getPlayerLevel(JRMCoreH.PlyrAttrbts) * JGConfigMiniGameAirBoxing.TPlimitIncreasesWithPlayerLevel : 1.0f));
            if (JGConfigMiniGameAirBoxing.TPGainOn) {
                JRMCoreGuiScreen.drawStringWithBorder(var8, "Used limit: " + JRMCoreH.trngTPlmt2 + "/" + limit, xPos, guiTop16 + i * 10, JRMCoreH.techNCCol[6]);
                ++i;
            }
            if (this.miniGameAirBoxing.state == 2) {
                JRMCoreGuiScreen.drawStringWithBorder(var8, "TP gain: " + (JGConfigMiniGameAirBoxing.TPGainOn ? "Enabled" : "Disabled"), xPos, guiTop16 + i * 10, JRMCoreH.techNCCol[6]);
                ++i;
            }
            if (this.miniGameAirBoxing.state == 2 || this.miniGameAirBoxing.state == 3) {
                int possibleReward = (int)((float)this.miniGameAirBoxing.score * JGConfigMiniGameAirBoxing.TPMultiplier);
                if (JGConfigMiniGameAirBoxing.TPGainOn && possibleReward > 0) {
                    int actualReward = JRMCoreH.trngTPlmt2 + possibleReward;
                    int reward = possibleReward;
                    if (limit < actualReward) {
                        reward = possibleReward - (actualReward - limit);
                        actualReward = limit;
                    }
                    JRMCoreGuiScreen.drawStringWithBorder(var8, "Reward: " + reward + " TP", xPos, guiTop16 + i * 10, JRMCoreH.techNCCol[6]);
                    String buttonText = this.miniGameAirBoxing.state == 2 ? "End Game" : "Claim TP";
                    int buttonTextWidth = this.fontRendererObj.getStringWidth(buttonText);
                    this.buttonList.add(new JRMCoreGuiButtons00(this.miniGameAirBoxing.state == 2 ? -35 : -36, xPos + 10, guiTop16 + ++i * 10 + 5, buttonTextWidth + 10, 20, buttonText, 0));
                    ++i;
                }
            }
        } else if (this.isGUIOpen(10100)) {
            this.drawHUD_instantTransmissionPicker(posX, posY, var5, var6, var8);
        }
        if (JRMCoreH.SAOC()) {
            JRMCoreHSAC.drawScreen(x, y, f);
        }
        super.drawScreen(x, y, f);
        this.drawDetails(x, y, var8);
    }

    private void drawHUD_instantTransmissionPicker(int posX, int posY, ScaledResolution var5, int var6, FontRenderer var8) {
        int xSize = 256;
        int ySize = 159;
        int guiLeft = (this.width - xSize) / 2;
        int guiTop = (this.height - ySize) / 2;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation guiLocation = new ResourceLocation(pc);
        JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        String title = "Select a Group Member";
        var8.drawString(title, guiLeft + 5, guiTop + 5, 0);
        int i = 0;
        if (JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && JRMCoreH.GIDs != null) {
            for (int pl = 0; pl < (JRMCoreH.plyrs.length < JRMCoreH.GIDs.length ? JRMCoreH.plyrs.length : JRMCoreH.GIDs.length); ++pl) {
                String n;
                if (JRMCoreH.GIDs[pl] != JRMCoreH.GID) continue;
                EntityPlayer e = JRMCoreGuiScreen.mc.theWorld.getPlayerEntityByName(JRMCoreH.plyrs[pl]);
                if (JRMCoreH.plyrs[pl].equalsIgnoreCase(JRMCoreClient.mc.thePlayer.getCommandSenderName())) {
                    n = JRMCoreH.plyrs[pl];
                    var8.drawString(n, guiLeft + xSize / 2 - 120, guiTop + (ySize + 1) / 2 - 62 + i * 10 - this.ipg * 14 * 10, 0);
                } else {
                    n = JRMCoreH.plyrs[pl];
                    this.buttonList.add(new JRMCoreGuiButtons01(10102 + i, guiLeft + xSize / 2 - 120, guiTop + (ySize + 1) / 2 - 62 + i * 10 - this.ipg * 14 * 10, this.fontRendererObj.getStringWidth(n), n, 0));
                }
                ++i;
            }
        }
        String back = JRMCoreH.trl("jrmc", "Back");
        int sw = this.fontRendererObj.getStringWidth(back) + 8;
        this.buttonList.add(new JRMCoreGuiButtons00(10101, guiLeft + xSize / 2 - 130 - sw, guiTop + (ySize + 1) / 2 + 40, sw, 20, back, 0));
    }

    private void drawHUD_help(int posX, int posY, ScaledResolution var5, int var6, FontRenderer var8) {
        int xSize = 256;
        int ySize = 159;
        int guiLeft = (this.width - xSize) / 2;
        int guiTop = (this.height - ySize) / 2;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation guiLocation = new ResourceLocation(pc);
        JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        if (help_mode == 0) {
            this.drawHUD_helpgmodeselect(posX, posY, var5, var6, var8);
        } else if (help_mode == 1) {
            this.drawHUD_helpguidepick(posX, posY, var5, var6, var8);
        } else if (help_mode == 3) {
            this.drawHUD_helpguide(posX, posY, var5, var6, var8);
        } else if (help_mode == 2) {
            this.drawHUD_helpcraft(posX, posY, var5, var6, var8);
        }
    }

    private void drawHUD_helpgmodeselect(int posX, int posY, ScaledResolution var5, int var6, FontRenderer var8) {
        ResourceLocation gui_help_tab = new ResourceLocation(gui_help_tabs);
        JRMCoreGuiScreen.mc.renderEngine.bindTexture(gui_help_tab);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop + 18, 0, 0, this.xSize, this.ySize);
        var8.drawString(JRMCoreH.trl("jrmc", "help_main") + ": ", this.guiLeft + 10, this.guiTop + 5, 0);
        var8.drawString(JRMCoreH.trl("jrmc", "help_main1_1"), this.guiLeft + 80, this.guiTop + 25, 0);
        var8.drawString(JRMCoreH.trl("jrmc", "help_main1_2"), this.guiLeft + 75, this.guiTop + 35, 0);
        var8.drawString(JRMCoreH.trl("jrmc", "help_main2_1"), this.guiLeft + 80, this.guiTop + 93, 0);
        var8.drawString(JRMCoreH.trl("jrmc", "help_main2_2"), this.guiLeft + 75, this.guiTop + 103, 0);
        var8.drawString(JRMCoreH.trl("jrmc", "help_main2_3"), this.guiLeft + 75, this.guiTop + 113, 0);
        String n = JRMCoreH.trl("jrmc", "Exit");
        int nw = this.fontRendererObj.getStringWidth(n) + 8;
        this.buttonList.add(new JRMCoreGuiButtons00(10008, posX - 95 - nw, posY + 85, nw, 20, n, 4877291));
        n = JRMCoreH.trl("jrmc", "Guides");
        nw = this.fontRendererObj.getStringWidth(n) + 8;
        this.buttonList.add(new JRMCoreGuiButtons00(10005, posX + 50 - nw, posY - 20, nw, 20, n, 4877291));
        n = JRMCoreH.trl("jrmc", "Receipts");
        nw = this.fontRendererObj.getStringWidth(n) + 8;
        this.buttonList.add(new JRMCoreGuiButtons00(10006, posX + 50 - nw, posY + 48, nw, 20, n, 4877291));
    }

    private void drawHUD_helpguidepick(int posX, int posY, ScaledResolution var5, int var6, FontRenderer var8) {
        var8.drawString(JRMCoreH.trl("jrmc", "Guides") + ": ", this.guiLeft + 10, this.guiTop + 5, 0);
        String n = JRMCoreH.trl("jrmc", "Back2");
        int nw = this.fontRendererObj.getStringWidth(n) + 8;
        this.buttonList.add(new JRMCoreGuiButtons00(10007, posX - 95 - nw, posY + 85, nw, 20, n, 4877291));
        for (int xx = 0; xx < 13; ++xx) {
            var8.drawString(JRMCoreH.trl("jrmc", "help_guide_" + (xx + 1) + "_title"), this.guiLeft + 5, this.guiTop + 18 + xx * 10, 0);
        }
        this.guiTop += 16;
        int xpos = -10;
        int ypos = this.guiTop;
        for (int xx = 0; xx < 13; ++xx) {
            ypos = this.guiTop + xx * 10;
            this.buttonList.add(new JRMCoreGuiButtonsA3(12002 + xx, this.guiLeft + xpos, ypos, 10, 2, true));
        }
        this.guiTop -= 16;
    }

    private void drawHUD_helpguide(int posX, int posY, ScaledResolution var5, int var6, FontRenderer var8) {
        var8.drawString(JRMCoreH.trl("jrmc", "Guides") + ": ", this.guiLeft + 10, this.guiTop + 5, 0);
        String n = JRMCoreH.trl("jrmc", "Back2");
        int nw = this.fontRendererObj.getStringWidth(n) + 8;
        this.buttonList.add(new JRMCoreGuiButtons00(10005, posX - 95 - nw, posY + 85, nw, 20, n, 4877291));
        if (help_page_id - 1 >= 0) {
            n = JRMCoreH.trl("jrmc", "Back");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(10003, posX + 70 - nw, posY + 85, nw, 20, n, 4877291));
        }
        if (help_page_id + 1 < 13) {
            n = JRMCoreH.trl("jrmc", "Next");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(10004, posX + 120 - nw, posY + 85, nw, 20, n, 4877291));
        }
        if (help_page_id == 1) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            int kep_x = 0;
            int kep_y = 0;
            ResourceLocation kep = new ResourceLocation(JRMCoreH.tjjrmc + ":help/inv.png");
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(kep);
            kep_x = 168;
            kep_y = 78;
            this.drawTexturedModalRect(this.guiLeft + 40, this.guiTop + 75, 0, 0, kep_x, kep_y);
        }
        var8.drawString(JRMCoreH.trl("jrmc", "help_guide_" + (help_page_id + 1) + "_title") + ": ", this.guiLeft + 70, this.guiTop + 5, 0);
        String sdata1 = StatCollector.translateToLocal((String)("jinryuujrmcore.help_guide_" + (help_page_id + 1) + "_desc"));
        int nr = JRMCoreH.txt(JRMCoreH.trl(sdata1), "\u00a71", 0, true, this.guiLeft + 5, this.guiTop + 18, 0, 0, 0);
    }

    private void drawHUD_helpcraft(int posX, int posY, ScaledResolution var5, int var6, FontRenderer var8) {
        var8.drawString(JRMCoreH.trl("jrmc", "Receipts") + ": ", this.guiLeft + 10, this.guiTop + 5, 0);
        if (this.gui_recipe_mod == -1) {
            var8.drawString("Select mod: ", this.guiLeft + 10, this.guiTop + 25, 0);
            String n = JRMCoreH.trl("jrmc", "Back");
            int nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(10007, posX - 95 - nw, posY + 85, nw, 20, n, 4877291));
            int placement = 0;
            for (int i = 0; i < JGRecipeHandler.recipelistmods.length; ++i) {
                boolean render;
                boolean bl = i == 0 ? true : (i == 1 ? JRMCoreH.DBC() : (i == 2 ? JRMCoreH.NC() : (render = i == 3 ? JRMCoreH.JYC() : false)));
                if (!render) continue;
                n = JGRecipeHandler.recipelistmods[i];
                nw = this.fontRendererObj.getStringWidth(n) + 8;
                this.buttonList.add(new JRMCoreGuiButtons00(10009 + i, posX - nw / 2, posY - 40 + placement * 22, nw, 20, n, 4877291));
                ++placement;
            }
        } else if (this.gui_recipe_category > -1) {
            int k;
            int nw;
            String n;
            int AllRecipes = JGRecipeHandler.getRecipeCount(this.gui_recipe_mod, this.gui_recipe_category);
            int Recipes = JGRecipeHandler.getRecipeCount(this.gui_recipe_mod, this.gui_recipe_category) - help_page_id * 4;
            if (Recipes > 4) {
                Recipes = 4;
            }
            int placement = 0;
            for (int i = 0; i < JGRecipeHandler.recipelistcategories.length; ++i) {
                if (JGRecipeHandler.getRecipeCount(this.gui_recipe_mod, i) <= 0) continue;
                n = JRMCoreH.trl("jrmc", "guidehelp_" + JGRecipeHandler.recipelistcategories[i]);
                nw = this.fontRendererObj.getStringWidth(n) + 8;
                this.buttonList.add(new JRMCoreGuiButtons00(10013 + i, posX - 130 - nw, posY - 60 + placement * 22, nw, 20, n, i == this.gui_recipe_category ? 9819364 : 4877291));
                ++placement;
            }
            n = JRMCoreH.trl("jrmc", "Back");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(10019, posX - 95 - nw, posY + 85, nw, 20, n, 4877291));
            if (help_page_id - 1 >= 0) {
                n = JRMCoreH.trl("jrmc", "Back");
                nw = this.fontRendererObj.getStringWidth(n) + 8;
                this.buttonList.add(new JRMCoreGuiButtons00(10003, posX + 70 - nw, posY + 85, nw, 20, n, 5478826));
            }
            if (AllRecipes - (help_page_id + 1) * 4 > 0) {
                n = JRMCoreH.trl("jrmc", "Next");
                nw = this.fontRendererObj.getStringWidth(n) + 8;
                this.buttonList.add(new JRMCoreGuiButtons00(10004, posX + 120 - nw, posY + 85, nw, 20, n, 5478826));
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            int kep_x = 0;
            int kep_y = 0;
            for (k = 0; k < 4; ++k) {
                ResourceLocation kep = new ResourceLocation(JRMCoreH.tjjrmc + ":help/craft" + (k < Recipes ? "" : "empty") + ".png");
                JRMCoreGuiScreen.mc.renderEngine.bindTexture(kep);
                int i = k % 2;
                int j = k > 1 ? 1 : 0;
                kep_x = 241;
                kep_y = 136;
                this.drawTexturedModalRect(this.guiLeft + 6 + 122 * i, this.guiTop + 18 + 69 * j, 0, 0, kep_x, kep_y);
            }
            for (k = 0; k < Recipes; ++k) {
                int i;
                ItemStack[] recipeItems;
                ItemStack stack = JGRecipeHandler.recipelist.get(JGRecipeHandler.recipelistmods[this.gui_recipe_mod] + "." + JGRecipeHandler.recipelistcategories[this.gui_recipe_category] + (k + help_page_id * 4));
                if (stack == null) continue;
                IRecipe shape = JGRecipeHandler.getRecipe(stack.getItem());
                int stackSize = 0;
                if (shape != null) {
                    stackSize = shape instanceof ShapedRecipes ? ((ShapedRecipes)shape).getRecipeOutput().stackSize : ((ShapelessRecipes)shape).getRecipeOutput().stackSize;
                }
                int GUI_X = this.guiLeft + 5 + k % 2 * 122;
                int GUI_Y = this.guiTop + 15 + k / 2 * 69;
                int itemX = GUI_X + 99;
                int itemY = GUI_Y + 34;
                int description1 = -17;
                int description2 = -8;
                int description3 = 20;
                float scaleItem = 1.0f;
                float scaleRecipe = 1.0f;
                int itemPosX = itemX;
                int itemPosY = itemY;
                JGRenderHelper.drawItem(mc, this.zLevel, this.fontRendererObj, stack, itemPosX, itemPosY, 1.0f, stackSize);
                int itemWidth = 16;
                int itemHeight = 16;
                String name = stack.getDisplayName();
                JRMCoreGuiScreen.drawDetails(name, itemPosX, itemPosY, itemWidth, itemHeight, this.x, this.y, var8);
                String recipe = "";
                if (shape == null) continue;
                int recipeWidth = 3;
                if (shape instanceof ShapedRecipes) {
                    recipeItems = ((ShapedRecipes)shape).recipeItems;
                    recipeWidth = ((ShapedRecipes)shape).recipeWidth;
                } else {
                    recipeItems = new ItemStack[((ShapelessRecipes)shape).recipeItems.size()];
                    for (int i2 = 0; i2 < ((ShapelessRecipes)shape).recipeItems.size(); ++i2) {
                        recipeItems[i2] = (ItemStack)((ShapelessRecipes)shape).recipeItems.get(i2);
                    }
                }
                ItemStack[] recept2 = new ItemStack[recipeItems.length];
                ItemStack[] recept = recipeItems;
                for (i = 0; i < recipeItems.length; ++i) {
                    if (recipeItems[i] == null) continue;
                    recept2[i] = new ItemStack(Item.getItemById((int)Item.getIdFromItem((Item)recipeItems[i].getItem())));
                }
                for (i = 0; i < recept.length; ++i) {
                    if (recept[i] == null || recept2[i] == null) continue;
                    recept2[i] = JGRecipeHandler.colorFix(recept2[i], recept[i]);
                }
                for (i = 0; i < recept.length; ++i) {
                    if (recept[i] == null || recept2[i] == null) continue;
                    int recPosX = GUI_X + 4 + 1 + i % recipeWidth * 18;
                    int recPosY = GUI_Y + 14 + 3 + i / recipeWidth * 18;
                    recipe = recipe + recept[i].getDisplayName();
                    JGRenderHelper.drawItem(mc, this.zLevel, this.fontRendererObj, recept2[i], recPosX, recPosY, 1.0f, 0);
                    String recipeName = recept[i].getDisplayName();
                    itemWidth = 16;
                    itemHeight = 16;
                    JRMCoreGuiScreen.drawDetails(recipeName, recPosX, recPosY, itemWidth, itemHeight, this.x, this.y, var8);
                }
            }
        } else {
            this.gui_recipe_mod = -1;
            this.gui_recipe_category = 0;
        }
    }

    private void drawHUD_clntsett(int posX, int posY, ScaledResolution var5, int var6, FontRenderer var8) {
        int xSize = 256;
        int ySize = 159;
        int guiLeft = (this.width - xSize) / 2;
        int guiTop = (this.height - ySize) / 2;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation guiLocation = new ResourceLocation(wish);
        JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        String n = JRMCoreH.trl("jrmc", "Back");
        int nw = this.fontRendererObj.getStringWidth(n) + 8;
        this.buttonList.add(new JRMCoreGuiButtons00(100, posX - 155 - nw, posY + 65, nw, 20, n, 0));
        int num = 0;
        int cs_x = posX - 135;
        int cs_y = posY - 100 + num * 20;
        n = JRMCoreH.trl("jrmc", "Graphic Settings");
        this.buttonList.add(new JRMCoreGuiButtons00(12000, cs_x, cs_y, 135, 20, n, cs_mode == 0 ? 541552 : 4877291));
        cs_y = posY - 100;
        n = JRMCoreH.trl("jrmc", "User Interface");
        this.buttonList.add(new JRMCoreGuiButtons00(12001, cs_x += ++num * 135, cs_y, 135, 20, n, cs_mode == 1 ? 541552 : 4877291));
        ++num;
        num = 0;
        cs_x = posX + 145 - nw / 2;
        cs_y = posY - 20 - num * 25;
        n = JRMCoreH.trl("jrmc", "Reset");
        this.buttonList.add(new JRMCoreGuiButtons00(11008, cs_x, cs_y, 100, 20, n, 11022891));
        ++num;
        if (cs_mode == 1 || cs_mode == 0 && cs_page == 8) {
            cs_y = posY - 20 - num * 25;
            n = JRMCoreH.trl("jrmc", "Add more") + "(" + JGConfigClientSettings.addMore + ")";
            this.buttonList.add(new JRMCoreGuiButtons00(11009, cs_x, cs_y, 100, 20, n, 4877291));
            ++num;
        }
        cs_y = posY - 20 - num * 25;
        n = JRMCoreH.trl("jrmc", "Save");
        this.buttonList.add(new JRMCoreGuiButtons00(10000, cs_x, cs_y, 100, 20, n, 4437547));
        ++num;
        if (JGConfigClientSettings.CLIENT_hud2 && cs_mode == 1) {
            cs_y = posY + 80 - num * 25;
            n = JRMCoreH.trl("jrmc", "Paste");
            this.buttonList.add(new JRMCoreGuiButtons00(11058, cs_x, cs_y, 100, 20, n, 4437547));
            ++num;
            String hpd = JRMCoreH.trl("jrmc", "ClientPasteDesc");
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cldgy + JRMCoreH.cct(hpd, new Object[0]), cs_x, cs_y, 100, 20, this.x, this.y, this.fontRendererObj);
        }
        if (cs_page - 1 >= 0) {
            n = JRMCoreH.trl("jrmc", "Back");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(11016, posX + 70 - nw, posY + 85, nw, 20, n, 4877291));
        }
        if (cs_page + 1 < cs_pages[cs_mode]) {
            n = JRMCoreH.trl("jrmc", "Next");
            nw = this.fontRendererObj.getStringWidth(n) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(11017, posX + 120 - nw, posY + 85, nw, 20, n, 4877291));
        }
        if (cs_mode == 0) {
            int j;
            int xpos;
            int ypos;
            int j2;
            String[] names2;
            num = 0;
            guiTop += 7;
            if (cs_page == 0) {
                var8.drawString(JRMCoreH.trl("jrmc", "Client ParAmo") + ": " + JGConfigClientSettings.get_da1() + "x", guiLeft + 5, guiTop + num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client ParSpe") + ": " + JGConfigClientSettings.get_da2() + "x", guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Image0", JGConfigClientSettings.CLIENT_GR2), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Particles0", JGConfigClientSettings.CLIENT_GR0), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Particles1", JGConfigClientSettings.CLIENT_GR7), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Particles2", JGConfigClientSettings.CLIENT_GR1), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("SETT3D", JGConfigClientSettings.CLIENT_GR10), guiLeft + 205, guiTop + num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Particles3", JGConfigClientSettings.CLIENT_GR8), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("SETT3D", JGConfigClientSettings.CLIENT_GR11), guiLeft + 205, guiTop + num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Particles4", JGConfigClientSettings.CLIENT_GR9), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Particles5", JGConfigClientSettings.CLIENT_GR3), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Particles6", JGConfigClientSettings.CLIENT_GR4), guiLeft + 5, guiTop + ++num * 15, 0);
                ++num;
                num = 0;
                int ypos2 = guiTop - 2;
                int xpos2 = -10;
                this.buttonList.add(new JRMCoreGuiButtonsA2(11030, guiLeft + xpos2 - 13, ypos2 + 15 * num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11031, guiLeft + xpos2, ypos2 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11032, guiLeft + xpos2 - 13, ypos2 + 15 * ++num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11033, guiLeft + xpos2, ypos2 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11020, guiLeft + xpos2, ypos2 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11018, guiLeft + xpos2, ypos2 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11025, guiLeft + xpos2, ypos2 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11019, guiLeft + xpos2, ypos2 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11028, guiLeft + xpos2 - 13, ypos2 + 15 * num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11026, guiLeft + xpos2, ypos2 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11029, guiLeft + xpos2 - 13, ypos2 + 15 * num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11027, guiLeft + xpos2, ypos2 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11021, guiLeft + xpos2, ypos2 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11022, guiLeft + xpos2, ypos2 + 15 * ++num, 10, 2, true));
                ++num;
            } else if (cs_page == 1) {
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt21") + ": " + JGConfigClientSettings.CLIENT_DA21 * 10 + "%", guiLeft + 5, guiTop + num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt3") + ": " + JGConfigClientSettings.CLIENT_DA3 * 10 + "%", guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt19", JGConfigClientSettings.CLIENT_DA19), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt4", JGConfigClientSettings.CLIENT_DA4), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt5", JGConfigClientSettings.CLIENT_DA5), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt6", JGConfigClientSettings.CLIENT_DA6), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt7", JGConfigClientSettings.CLIENT_DA7), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt8", JGConfigClientSettings.CLIENT_DA8), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt9", JGConfigClientSettings.CLIENT_DA9), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt10", JGConfigClientSettings.CLIENT_DA10), guiLeft + 5, guiTop + ++num * 15, 0);
                ++num;
                num = 0;
                int ypos3 = guiTop - 2;
                int xpos3 = -10;
                this.buttonList.add(new JRMCoreGuiButtonsA2(11055, guiLeft + xpos3 - 13, ypos3 + 15 * num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11054, guiLeft + xpos3, ypos3 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11035, guiLeft + xpos3 - 13, ypos3 + 15 * ++num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11034, guiLeft + xpos3, ypos3 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11053, guiLeft + xpos3, ypos3 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11036, guiLeft + xpos3, ypos3 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11037, guiLeft + xpos3, ypos3 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11038, guiLeft + xpos3, ypos3 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11039, guiLeft + xpos3, ypos3 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11040, guiLeft + xpos3, ypos3 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11041, guiLeft + xpos3, ypos3 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11042, guiLeft + xpos3, ypos3 + 15 * ++num, 10, 2, true));
                ++num;
            } else if (cs_page == 2) {
                var8.drawString(this.getClientConfigText("Client Opt11", JGConfigClientSettings.CLIENT_DA11), guiLeft + 5, guiTop + num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt20", JGConfigClientSettings.CLIENT_DA20), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt12", JGConfigClientSettings.CLIENT_DA12), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt13", JGConfigClientSettings.CLIENT_DA13), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt14", JGConfigClientSettings.CLIENT_DA14), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt15", JGConfigClientSettings.CLIENT_DA15), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt16", JGConfigClientSettings.CLIENT_DA16), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt17", JGConfigClientSettings.CLIENT_DA17), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt18", JGConfigClientSettings.CLIENT_DA18), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt22", JGConfigClientSettings.CLIENT_DA22), guiLeft + 5, guiTop + ++num * 15, 0);
                ++num;
                num = 0;
                int ypos4 = guiTop - 2;
                int xpos4 = -10;
                this.buttonList.add(new JRMCoreGuiButtonsA3(11043, guiLeft + xpos4, ypos4 + 15 * num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11052, guiLeft + xpos4, ypos4 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11044, guiLeft + xpos4, ypos4 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11045, guiLeft + xpos4, ypos4 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11046, guiLeft + xpos4, ypos4 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11047, guiLeft + xpos4, ypos4 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11048, guiLeft + xpos4, ypos4 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11050, guiLeft + xpos4, ypos4 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11051, guiLeft + xpos4, ypos4 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11059, guiLeft + xpos4, ypos4 + 15 * ++num, 10, 2, true));
                ++num;
            } else if (cs_page == 3) {
                var8.drawString(this.getClientConfigText("Client Opt25", JGConfigClientSettings.renderEnergyOutsideView), guiLeft + 5, guiTop + num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt40", JGConfigClientSettings.instantTransmissionFirstPerson), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(this.getClientConfigText("Client Opt41", JGConfigClientSettings.instantTransmissionParticles), guiLeft + 5, guiTop + ++num * 15, 0);
                ++num;
                num = 0;
                int ypos5 = guiTop - 2;
                int xpos5 = -10;
                this.buttonList.add(new JRMCoreGuiButtonsA3(11101, guiLeft + xpos5, ypos5 + 15 * num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11216, guiLeft + xpos5, ypos5 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11217, guiLeft + xpos5, ypos5 + 15 * ++num, 10, 2, true));
                ++num;
            } else if (cs_page == 4) {
                String name = JRMCoreH.trl("jrmc", "Ki Attack") + " ";
                var8.drawString(name + JRMCoreH.trl("jrmc", "Client Opt23") + ": " + JGConfigClientSettings.CLIENT_Ki_Visibility * 10 + "% (" + JRMCoreH.trl("jrmc", "SETT2D") + ")", guiLeft + 5, guiTop + num * 15, 0);
                var8.drawString(name + JRMCoreH.trl("jrmc", "Client Opt24") + ": " + JGConfigClientSettings.CLIENT_Ki_Scale * 10 + "%", guiLeft + 5, guiTop + ++num * 15, 0);
                name = JRMCoreH.trl("jrmc", "Ki Attack Charge") + " ";
                var8.drawString(name + JRMCoreH.trl("jrmc", "Client Opt23") + ": " + JGConfigClientSettings.CLIENT_Ki_Charge_Visibility * 10 + "% (" + JRMCoreH.trl("jrmc", "SETT2D") + ")", guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(name + JRMCoreH.trl("jrmc", "Client Opt24") + ": " + JGConfigClientSettings.CLIENT_Ki_Charge_Scale * 10 + "%", guiLeft + 5, guiTop + ++num * 15, 0);
                name = JRMCoreH.trl("jrmc", "Jutsu") + " ";
                var8.drawString(name + JRMCoreH.trl("jrmc", "Client Opt23") + ": " + JGConfigClientSettings.CLIENT_Jutsu_Visibility * 10 + "% (" + JRMCoreH.trl("jrmc", "SETT2D") + ")", guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(name + JRMCoreH.trl("jrmc", "Client Opt24") + ": " + JGConfigClientSettings.CLIENT_Jutsu_Scale * 10 + "%", guiLeft + 5, guiTop + ++num * 15, 0);
                ++num;
                num = 0;
                int ypos6 = guiTop - 2;
                int xpos6 = -10;
                int xpos2 = -36;
                this.buttonList.add(new JRMCoreGuiButtonsA2(11060, guiLeft + xpos6 - 13, ypos6 + 15 * num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11061, guiLeft + xpos6, ypos6 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11062, guiLeft + xpos6 - 13, ypos6 + 15 * ++num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11063, guiLeft + xpos6, ypos6 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11067, guiLeft + xpos6 - 13, ypos6 + 15 * ++num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11068, guiLeft + xpos6, ypos6 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11069, guiLeft + xpos6 - 13, ypos6 + 15 * ++num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11070, guiLeft + xpos6, ypos6 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11074, guiLeft + xpos6 - 13, ypos6 + 15 * ++num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11075, guiLeft + xpos6, ypos6 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11076, guiLeft + xpos6 - 13, ypos6 + 15 * ++num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11077, guiLeft + xpos6, ypos6 + 15 * num, ">"));
                ++num;
            } else if (cs_page == 5) {
                if (JRMCoreH.DBC()) {
                    names2 = new String[]{"Wave", "Blast", "Disk", "Laser", "Spiral", "BigBlast", "Barrage", "Shield", "Explosion"};
                    String name = JRMCoreH.trl("jrmc", "Ki Attack") + " ";
                    for (j2 = 0; j2 < names2.length; ++j2) {
                        String text = JRMCoreH.trl("jrmc", "SETT3D") + " " + name + JRMCoreH.trl("dbc", names2[j2]) + ": " + (JGConfigClientSettings.CLIENT_Ki_3d[j2] ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF"));
                        var8.drawString(text, guiLeft + 5, guiTop + num * 15, 0);
                        ++num;
                    }
                    num = 0;
                    ypos = guiTop - 2;
                    xpos = -10;
                    for (j = 0; j < names2.length; ++j) {
                        this.buttonList.add(new JRMCoreGuiButtonsA3(11080 + j, guiLeft + xpos, ypos + 15 * num, 10, 2, true));
                        ++num;
                    }
                } else {
                    cs_page = this.guiUp ? cs_page + 1 : cs_page - 1;
                }
            } else if (cs_page == 6) {
                if (JRMCoreH.DBC()) {
                    names2 = new String[]{"Wave", "Blast", "Disk", "Laser", "Spiral", "BigBlast", "Barrage", "Shield", "Explosion"};
                    String name = JRMCoreH.trl("jrmc", "Ki Attack Charge") + " ";
                    for (j2 = 0; j2 < names2.length; ++j2) {
                        String text = JRMCoreH.trl("jrmc", "SETT3D") + " " + name + JRMCoreH.trl("dbc", names2[j2]) + ": " + (JGConfigClientSettings.CLIENT_Ki_Charge_3d[j2] ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF"));
                        var8.drawString(text, guiLeft + 5, guiTop + num * 15, 0);
                        ++num;
                    }
                    num = 0;
                    ypos = guiTop - 2;
                    xpos = -10;
                    for (j = 0; j < names2.length; ++j) {
                        this.buttonList.add(new JRMCoreGuiButtonsA3(11089 + j, guiLeft + xpos, ypos + 15 * num, 10, 2, true));
                        ++num;
                    }
                } else {
                    cs_page = this.guiUp ? cs_page + 1 : cs_page - 1;
                }
            } else if (cs_page == 7) {
                if (JRMCoreH.NC()) {
                    names2 = new String[]{"Wave", "Ball", "Disk"};
                    String name = JRMCoreH.trl("jrmc", "Jutsu") + " ";
                    for (j2 = 0; j2 < names2.length; ++j2) {
                        String text = JRMCoreH.trl("jrmc", "SETT3D") + " " + name + JRMCoreH.trl("nc", names2[j2]) + ": " + (JGConfigClientSettings.CLIENT_Jutsu_3d[j2] ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF"));
                        var8.drawString(text, guiLeft + 5, guiTop + num * 15, 0);
                        ++num;
                    }
                    num = 0;
                    ypos = guiTop - 2;
                    xpos = -10;
                    for (j = 0; j < names2.length; ++j) {
                        this.buttonList.add(new JRMCoreGuiButtonsA3(11098 + j, guiLeft + xpos, ypos + 15 * num, 10, 2, true));
                        ++num;
                    }
                } else {
                    cs_page = this.guiUp ? cs_page + 1 : cs_page - 1;
                }
            } else if (cs_page == 8) {
                int x = guiLeft + 5;
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt31") + ": " + JGConfigClientSettings.renderdistanceMultiplierBarrierBlock + "%", x, guiTop + num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt32") + ": " + JGConfigClientSettings.renderdistanceMultiplierParticles + "%", x, guiTop + ++num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt33") + ": " + JGConfigClientSettings.renderdistanceMultiplierKiAttackCharge + "%", x, guiTop + ++num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt34") + ": " + JGConfigClientSettings.renderdistanceMultiplierAuras + "%", x, guiTop + ++num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt38") + ": " + (JGConfigClientSettings.dbcFastFusionSpectatorCameraFollowOn ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt39") + ": " + (JGConfigClientSettings.safeZoneUIModeOn ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                ++num;
                num = 0;
                int ypos7 = guiTop - 2;
                int xpos7 = -10;
                this.buttonList.add(new JRMCoreGuiButtonsA2(11205, guiLeft + xpos7 - 13, ypos7 + 15 * num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11206, guiLeft + xpos7, ypos7 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11207, guiLeft + xpos7 - 13, ypos7 + 15 * ++num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11208, guiLeft + xpos7, ypos7 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11209, guiLeft + xpos7 - 13, ypos7 + 15 * ++num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11210, guiLeft + xpos7, ypos7 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11211, guiLeft + xpos7 - 13, ypos7 + 15 * ++num, "<"));
                this.buttonList.add(new JRMCoreGuiButtonsA2(11212, guiLeft + xpos7, ypos7 + 15 * num, ">"));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11214, guiLeft + xpos7, ypos7 + 15 * ++num, 10, 2, true));
                this.buttonList.add(new JRMCoreGuiButtonsA3(11215, guiLeft + xpos7, ypos7 + 15 * ++num, 10, 2, true));
                ++num;
            }
            guiTop -= 7;
        } else if (cs_mode == 1) {
            String na;
            num = 0;
            guiTop += 7;
            if (cs_page == 0) {
                if (JRMCoreH.pwr_ki(this.pwr)) {
                    String sn2 = " " + JRMCoreH.trl("jrmc", JRMCoreH.BPMode == 0 ? "BPNormal" : "BPHigh");
                    String fn = JRMCoreH.TrnngOptnsNam(2);
                    String fd = JRMCoreH.TrnngOptnsDesc(2);
                    int snw2 = this.fontRendererObj.getStringWidth(sn2);
                    int fnw = this.fontRendererObj.getStringWidth(fn);
                    this.buttonList.add(new JRMCoreGuiButtons01(-32, guiLeft + 5 + fnw, guiTop, snw2, sn2, JRMCoreH.techNCCol[1]));
                    JRMCoreGuiScreen.drawDetails(fn, JRMCoreH.cct(fd, JRMCoreH.numSepShort(JRMCoreHC.BPC_ME2)), guiLeft + 5, guiTop, this.x, this.y, var8);
                    ++num;
                }
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt36") + ": " + (JGConfigClientSettings.tipNotificationsOn ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt37") + ": " + (JGConfigClientSettings.errorNotificationsOn ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Custom Hud") + ": " + (JGConfigClientSettings.CLIENT_hud2 ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                ++num;
                if (JGConfigClientSettings.CLIENT_hud2) {
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Hud 2 X") + ": " + JGConfigClientSettings.CLIENT_hud0x, guiLeft + 5, guiTop + num * 15, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Hud 2 Y") + ": " + JGConfigClientSettings.CLIENT_hud0y, guiLeft + 5, guiTop + ++num * 15, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Health bar text style") + ": " + (JGConfigClientSettings.CLIENT_GR5 ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                    na = !JGConfigClientSettings.CLIENT_GR12 ? JRMCoreH.trl("jrmc", "On") + "/" + JRMCoreH.trl("jrmc", "Off") : JRMCoreH.trl("jrmc", "Enable") + "/" + JRMCoreH.trl("jrmc", "Disable");
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Action Menu Text Type") + ": " + na, guiLeft + 5, guiTop + ++num * 15, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Action Menu White") + ": " + (JGConfigClientSettings.CLIENT_GR13 ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                    ++num;
                } else {
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Hud X") + ": " + JGConfigClientSettings.CLIENT_hud0x, guiLeft + 5, guiTop + num * 15, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Hud Y") + ": " + JGConfigClientSettings.CLIENT_hud0y, guiLeft + 5, guiTop + ++num * 15, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Hud Style") + ": " + JGConfigClientSettings.CLIENT_hud0, guiLeft + 5, guiTop + ++num * 15, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Lockon Style") + ": " + JGConfigClientSettings.CLIENT_lockon, guiLeft + 5, guiTop + ++num * 15, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Hud 1 X") + ": " + JGConfigClientSettings.CLIENT_hud1x, guiLeft + 5, guiTop + ++num * 15, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Hud 1 Y") + ": " + JGConfigClientSettings.CLIENT_hud1y, guiLeft + 5, guiTop + ++num * 15, 0);
                    ++num;
                }
            } else if (cs_page == 1) {
                if (!JGConfigClientSettings.CLIENT_hud2) {
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Hud 1 Style") + ": " + JGConfigClientSettings.CLIENT_hud1, guiLeft + 5, guiTop + num * 15, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Health bar rotated") + ": " + (JGConfigClientSettings.CLIENT_GR6 ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                    na = !JGConfigClientSettings.CLIENT_GR12 ? JRMCoreH.trl("jrmc", "On") + "/" + JRMCoreH.trl("jrmc", "Off") : JRMCoreH.trl("jrmc", "Enable") + "/" + JRMCoreH.trl("jrmc", "Disable");
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Health bar text style") + ": " + (JGConfigClientSettings.CLIENT_GR5 ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Action Menu Text Type") + ": " + na, guiLeft + 5, guiTop + ++num * 15, 0);
                    var8.drawString(JRMCoreH.trl("jrmc", "Client Action Menu White") + ": " + (JGConfigClientSettings.CLIENT_GR13 ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                    ++num;
                }
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt26") + ": " + (JGConfigClientSettings.concentrationAnimatedTexturesOn ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt27") + ": " + (JGConfigClientSettings.concentrationAnimatedColorOn ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt28") + ": " + (JGConfigClientSettings.airboxing3DCharacterOn ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt29") + ": " + (JGConfigClientSettings.airboxing3DAuraOn ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt30") + ": " + (JGConfigClientSettings.airboxingAnimatedColorOn ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + ++num * 15, 0);
                ++num;
            } else if (cs_page == 2) {
                var8.drawString(JRMCoreH.trl("jrmc", "Client Opt35") + ": " + (JGConfigClientSettings.kiAttackChargePercentageOn ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF")), guiLeft + 5, guiTop + num * 15, 0);
                ++num;
            }
            guiTop -= 7;
            GL11.glPushMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            float size = 0.3f + (0.0f - (float)var6 / 240.0f / 25.0f);
            if (size < 0.0f) {
                size = 0.3f;
            }
            int guiWidth = (int)(256.0f * size);
            int guiHeight = (int)(256.0f * size);
            GL11.glTranslatef((float)(var6 / 2 - guiWidth / 2), (float)5.0f, (float)0.0f);
            GL11.glScalef((float)size, (float)size, (float)size);
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(new ResourceLocation(JRMCoreH.tjjrmc, "gui/lo/" + JGConfigClientSettings.get_hud_lockon() + ".png"));
            this.drawTexturedModalRect(0, 0, 0, 0, 256, 256);
            GL11.glPopMatrix();
            if (JGConfigClientSettings.CLIENT_hud2) {
                GL11.glPushMatrix();
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                JRMCoreClient.bars.renderCG(0);
                GL11.glPopMatrix();
            } else {
                byte pwr = JRMCoreH.Pwrtyp;
                ResourceLocation tx = new ResourceLocation((pwr == 1 ? "jinryuumodscore:" : (pwr == 2 ? "jinryuunarutoc:" : "jinryuumodscore:")) + "energy.png");
                JRMCoreGuiScreen.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(JGConfigClientSettings.CLIENT_hud0x + (pwr == 1 ? 10 : 0), JGConfigClientSettings.CLIENT_hud0y + (pwr == 1 ? 10 : 25), 0, 0 + (pwr == 1 ? JGConfigClientSettings.get_hud_pos(0) : 86), pwr == 1 ? JGConfigClientSettings.get_hud_x() + this.getx1() : 50, pwr == 1 ? JGConfigClientSettings.get_hud_y() + this.gety1() : 86);
                tx = new ResourceLocation("jinryuumodscore:health.png");
                JRMCoreGuiScreen.mc.renderEngine.bindTexture(tx);
                short img_height = JGConfigClientSettings.get_hud_1_height();
                int var_x = var5.getScaledWidth() + JGConfigClientSettings.CLIENT_hud1x;
                int var = (var5.getScaledHeight() - JGConfigClientSettings.CLIENT_hud1y) / 2 + 25;
                int g = var_x - (JGConfigClientSettings.get_hud_1_height() + 2);
                this.drawTexturedModalRect(g, var, JGConfigClientSettings.get_hud_1_pos(0), 0, JGConfigClientSettings.get_hud_1_height(), JGConfigClientSettings.get_hud_1_width());
            }
            num = 0;
            int ypos = guiTop += 5;
            int xpos = -10;
            ypos = guiTop + num * 15;
            if (cs_page == 0) {
                if (JRMCoreH.pwr_ki(this.pwr)) {
                    ypos = guiTop + ++num * 15;
                }
                this.buttonList.add(new JRMCoreGuiButtonsA3(11300, guiLeft + xpos, ypos, 10, 2, true));
                ypos = guiTop + ++num * 15;
                this.buttonList.add(new JRMCoreGuiButtonsA3(11301, guiLeft + xpos, ypos, 10, 2, true));
                ypos = guiTop + ++num * 15;
                this.buttonList.add(new JRMCoreGuiButtonsA3(11049, guiLeft + xpos, ypos, 10, 2, true));
                ++num;
                if (JGConfigClientSettings.CLIENT_hud2) {
                    ypos = guiTop + num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11000, guiLeft + xpos - 13, ypos, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11001, guiLeft + xpos, ypos, ">"));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11002, guiLeft + xpos - 13, ypos, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11003, guiLeft + xpos, ypos, ">"));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA3(11023, guiLeft + xpos, ypos, 10, 2, true));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA3(11056, guiLeft + xpos, ypos, 10, 2, true));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA3(11057, guiLeft + xpos, ypos, 10, 2, true));
                    ++num;
                } else {
                    ypos = guiTop + num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11000, guiLeft + xpos - 13, ypos, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11001, guiLeft + xpos, ypos, ">"));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11002, guiLeft + xpos - 13, ypos, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11003, guiLeft + xpos, ypos, ">"));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11004, guiLeft + xpos - 13, ypos, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11005, guiLeft + xpos, ypos, ">"));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11006, guiLeft + xpos - 13, ypos, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11007, guiLeft + xpos, ypos, ">"));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11010, guiLeft + xpos - 13, ypos, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11011, guiLeft + xpos, ypos, ">"));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11012, guiLeft + xpos - 13, ypos, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11013, guiLeft + xpos, ypos, ">"));
                    ++num;
                }
            } else if (cs_page == 1) {
                if (!JGConfigClientSettings.CLIENT_hud2) {
                    ypos = guiTop + num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11014, guiLeft + xpos - 13, ypos, "<"));
                    this.buttonList.add(new JRMCoreGuiButtonsA2(11015, guiLeft + xpos, ypos, ">"));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA3(11024, guiLeft + xpos, ypos, 10, 2, true));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA3(11023, guiLeft + xpos, ypos, 10, 2, true));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA3(11056, guiLeft + xpos, ypos, 10, 2, true));
                    ypos = guiTop + ++num * 15;
                    this.buttonList.add(new JRMCoreGuiButtonsA3(11057, guiLeft + xpos, ypos, 10, 2, true));
                    ++num;
                }
                ypos = guiTop + num * 15;
                this.buttonList.add(new JRMCoreGuiButtonsA3(11200, guiLeft + xpos, ypos, 10, 2, true));
                ypos = guiTop + ++num * 15;
                this.buttonList.add(new JRMCoreGuiButtonsA3(11201, guiLeft + xpos, ypos, 10, 2, true));
                ypos = guiTop + ++num * 15;
                this.buttonList.add(new JRMCoreGuiButtonsA3(11202, guiLeft + xpos, ypos, 10, 2, true));
                ypos = guiTop + ++num * 15;
                this.buttonList.add(new JRMCoreGuiButtonsA3(11203, guiLeft + xpos, ypos, 10, 2, true));
                ypos = guiTop + ++num * 15;
                this.buttonList.add(new JRMCoreGuiButtonsA3(11204, guiLeft + xpos, ypos, 10, 2, true));
                ++num;
            } else if (cs_page == 2) {
                ypos = guiTop + num * 15;
                this.buttonList.add(new JRMCoreGuiButtonsA3(11213, guiLeft + xpos, ypos, 10, 2, true));
                ++num;
            }
            guiTop -= 7;
        }
    }

    public static String getStringShortened(FontRenderer var8, int widthLimit, String text) {
        int width = var8.getStringWidth(text);
        if (width > widthLimit) {
            String newText = "";
            int length = text.length();
            for (int i = length - 1; i >= 0; --i) {
                newText = text.substring(0, i) + "...";
                if (var8.getStringWidth(newText) > widthLimit) continue;
                text = newText;
                break;
            }
        }
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    public void menuButtons(String st) {
        JRMCoreGuiScreen.menuButtons(st, this.buttonList, this.guiLeft, this.guiTop, this.ySize, this.x, this.y, this.fontRendererObj);
    }

    public static void menuButtons(String st, List buttonList, int guiLeft, int guiTop, int ySize, int x, int y, FontRenderer fontRendererObj) {
        int i = 0;
        int rid = 0;
        buttonList.add(new JRMCoreGuiButtons00(10, guiLeft - 22, guiTop + 145, 20, 20, "X", 0));
        String name = "";
        if (!JRMCoreConfig.ssurl.contains("empty") && JRMCoreConfig.ssurl.contains("ttp")) {
            name = "Server Shop";
            buttonList.add(new JRMCoreGuiButtons02(3099, guiLeft + i * 21, guiTop + ySize + 2, "$", st.equals("ST") ? 1 : 0, Color.GREEN.darker().darker().getRGB()));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + i * 21, guiTop + ySize + 2 + 1, 20, 20, x, y, fontRendererObj);
            ++i;
        }
        name = JRMCoreH.trl("jrmc", News);
        rid = 0;
        buttonList.add(new JRMCoreGuiButtons03(31, guiLeft + i * 21, guiTop + ySize + 2, name.substring(0, 2).toUpperCase(), st.equals(News) ? 1 : 0, 8046079, 0));
        JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + i * 21, guiTop + ySize + 2 + 1, 20, 20, x, y, fontRendererObj);
        ++i;
        int BONUS_X = 25;
        int tabX = -60 + (JRMCoreH.Pwrtyp == 2 && JRMCoreH.PtchVc == 0 ? 0 : 25);
        int tabY = -80;
        name = JRMCoreH.trl("jrmc", "Help");
        rid = 8;
        buttonList.add(new JRMCoreGuiButtons03(10001, guiLeft + tabX, guiTop + ySize + 2 + tabY, name.substring(0, 2).toUpperCase(), 0, 8046079, 8));
        JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + tabX, guiTop + ySize + 2 + 1 + tabY, 20, 20, x, y, fontRendererObj);
        tabY = -60;
        name = JRMCoreH.trl("jrmc", "CltSettings");
        rid = 9;
        buttonList.add(new JRMCoreGuiButtons03(109, guiLeft + tabX, guiTop + ySize + 2 + tabY, name.substring(0, 2).toUpperCase(), 0, 8046079, 9));
        JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + tabX, guiTop + ySize + 2 + 1 + tabY, 20, 20, x, y, fontRendererObj);
        tabY = -100;
        name = JRMCoreH.trl("jrmc", "Notifications");
        rid = 10;
        buttonList.add(new JRMCoreGuiButtons03(50011, guiLeft + tabX, guiTop + ySize + 2 + tabY, name.substring(0, 2).toUpperCase(), 0, 8046079, 10));
        JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + tabX, guiTop + ySize + 2 + 1 + tabY, 20, 20, x, y, fontRendererObj);
        if (JRMCoreH.Accepted != 0 && JRMCoreH.Accepted != 2) {
            name = JRMCoreH.trl("jrmc", "CharSheet");
            rid = 1;
            buttonList.add(new JRMCoreGuiButtons03(100, guiLeft + i * 21, guiTop + ySize + 2, name.substring(0, 2).toUpperCase(), st.equals("CH") ? 1 : 0, 8046079, 1));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + i * 21, guiTop + ySize + 2 + 1, 20, 20, x, y, fontRendererObj);
            ++i;
        }
        if (JRMCoreH.Pwrtyp != 0 && (JRMCoreH.isPowerTypeKi() || JRMCoreH.isPowerTypeChakra())) {
            name = JRMCoreH.trl("jrmc", "Skills");
            rid = 2;
            buttonList.add(new JRMCoreGuiButtons03(101, guiLeft + i * 21, guiTop + ySize + 2, name.substring(0, 2).toUpperCase(), st.equals("SK") ? 1 : 0, 8046079, 2));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + i * 21, guiTop + ySize + 2 + 1, 20, 20, x, y, fontRendererObj);
            name = JRMCoreH.Pwrtyp == 1 ? JRMCoreH.trl("jrmc", "KiTechniques") : JRMCoreH.trl("jrmc", "Jutsu");
            rid = 3;
            buttonList.add(new JRMCoreGuiButtons03(102, guiLeft + ++i * 21, guiTop + ySize + 2, name.substring(0, 2).toUpperCase(), st.equals("TE") ? 1 : 0, 8046079, 3));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + i * 21, guiTop + ySize + 2 + 1, 20, 20, x, y, fontRendererObj);
            name = JRMCoreH.trl("jrmc", "Training");
            rid = 6;
            buttonList.add(new JRMCoreGuiButtons03(108, guiLeft + ++i * 21, guiTop + ySize + 2, name.substring(0, 2).toUpperCase(), st.equals("TR") ? 1 : 0, 8046079, 6));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + i * 21, guiTop + ySize + 2 + 1, 20, 20, x, y, fontRendererObj);
            name = JRMCoreH.Pwrtyp == 1 ? JRMCoreH.trl("dbc", "SagaSystem") : (JRMCoreH.Pwrtyp == 2 ? JRMCoreH.trl("nc", "StorySystem") : JRMCoreH.trl("jrmc", "Story"));
            rid = 7;
            buttonList.add(new JRMCoreGuiButtons03(60, guiLeft + ++i * 21, guiTop + ySize + 2, name.substring(0, 2).toUpperCase(), st.equals("Journal") ? 1 : 0, 8046079, 7));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + i * 21, guiTop + ySize + 2 + 1, 20, 20, x, y, fontRendererObj);
            ++i;
        }
        if (JRMCoreH.isPowerTypeKi()) {
            name = JRMCoreH.trl("jrmc", "GroupManager");
            rid = 4;
            buttonList.add(new JRMCoreGuiButtons03(62, guiLeft + i * 21, guiTop + ySize + 2, name.substring(0, 2).toUpperCase(), st.equals("Group") ? 1 : 0, 8046079, 4));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + i * 21, guiTop + ySize + 2 + 1, 20, 20, x, y, fontRendererObj);
            ++i;
        }
        name = JRMCoreH.trl("jrmc", "ServerConfig");
        rid = 5;
        buttonList.add(new JRMCoreGuiButtons03(32, guiLeft + i * 21, guiTop + ySize + 2, name.substring(0, 2).toUpperCase(), st.equals("Server") ? 1 : 0, 8046079, 5));
        JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + i * 21, guiTop + ySize + 2 + 1, 20, 20, x, y, fontRendererObj);
        ++i;
        if (JRMCoreH.JYC()) {
            name = JRMCoreH.trl("jrmc", "Calendar");
            buttonList.add(new JRMCoreGuiButtons02(4902, guiLeft + i * 21, guiTop + ySize + 2, name.substring(0, 2).toUpperCase(), st.equals("Calendar") ? 1 : 0, 8046079));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + i * 21, guiTop + ySize + 2 + 1, 20, 20, x, y, fontRendererObj);
            ++i;
        }
        if (JRMCoreH.JFC()) {
            name = JRMCoreH.trl("jrmc", "Family");
            buttonList.add(new JRMCoreGuiButtons02(4903, guiLeft + i * 21, guiTop + ySize + 2, name.substring(0, 2).toUpperCase(), st.equals("Family") ? 1 : 0, 8046079));
            JRMCoreGuiScreen.drawDetails(JRMCoreH.cct(name, new Object[0]), guiLeft + i * 21, guiTop + ySize + 2 + 1, 20, 20, x, y, fontRendererObj);
            ++i;
        }
    }

    private static void drawDetails(String s1, String s2, int xpos, int ypos, int x, int y, FontRenderer var8) {
        int wpos = var8.getStringWidth(s1);
        var8.drawString(s1, xpos, ypos, 0);
        if (xpos < x && xpos + wpos > x && ypos - 3 < y && ypos + 10 > y) {
            int ll = 200;
            Object[] txt = new Object[]{s2, "\u00a78", 0, true, x + 5, y + 5, ll};
            detailList.add(txt);
        }
    }

    public static boolean hovered(int mX, int mY, int xpos, int ypos, int w, int h) {
        return xpos < mX && xpos + w > mX && ypos - 3 < mY && ypos + h > mY;
    }

    public static void drawDetails(String s1, int xpos, int ypos, int w, int h, int x, int y, FontRenderer var8) {
        if (JRMCoreGuiScreen.hovered(x, y, xpos, ypos, w, h)) {
            int ll = 200;
            Object[] txt = new Object[]{s1, "\u00a78", 0, true, x + 5, y + 5, ll};
            detailList.add(txt);
        }
    }

    private int getx1() {
        return JGConfigClientSettings.get_hud_start_x();
    }

    private int gety1() {
        return JGConfigClientSettings.get_hud_start_y();
    }

    private void drawDetails(int x, int y, FontRenderer var8) {
        if (!detailList.isEmpty()) {
            Object[] o = (Object[])detailList.get(0);
            String desc = (String)o[0];
            int ll = Integer.parseInt("" + o[6]);
            int descw = var8.getStringWidth(desc);
            int desch = 1 + var8.getStringWidth(desc) / ll;
            JRMCoreGuiScreen.mc.renderEngine.bindTexture(new ResourceLocation("jinryuumodscore:allw.png"));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.8f);
            desch = JRMCoreH.txt(desc, (String)o[1], Integer.parseInt("" + o[2]), false, 0, 0, ll);
            ScaledResolution var5 = new ScaledResolution(mc, JRMCoreGuiScreen.mc.displayWidth, JRMCoreGuiScreen.mc.displayHeight);
            int var6 = var5.getScaledWidth();
            int var7 = var5.getScaledHeight();
            int xp = 0;
            int yp = 0;
            if (var6 < x + (descw < ll ? descw : ll) + 10) {
                xp += var6 - (x + (descw < ll ? descw : ll)) - 10;
            }
            if (var7 < y + desch * 10 + 10) {
                yp = -(desch * 10 + 20);
            }
            this.drawTexturedModalRect(x + xp, y + 10 + yp, 5, 5, (descw < ll ? descw : ll) + 10, desch * 10 + 10);
            JRMCoreH.txt(desc, (String)o[1], Integer.parseInt("" + o[2]), Boolean.parseBoolean("" + o[3]), Integer.parseInt("" + o[4]) + xp, Integer.parseInt("" + o[5]) + 10 + yp, ll);
            detailList.clear();
        }
    }

    public static int y4NUu(String l) {
        String w = "0123456789ABCDEF";
        l = l.toUpperCase();
        int a = 0;
        for (int i = 0; i < l.length(); ++i) {
            char c = l.charAt(i);
            int d = w.indexOf(c);
            a = 16 * a + d;
        }
        return a;
    }

    public static int kqGW3Z(boolean n) {
        int b = JRMCoreConfig.tmx;
        String r = "64";
        String k = "3B9ACA00";
        return b > JRMCoreGuiScreen.y4NUu(k) ? JRMCoreGuiScreen.y4NUu(k) : (b < JRMCoreGuiScreen.y4NUu(r) ? 0 : b);
    }

    public static int r3W3mY(int b) {
        String k = "3B9ACA00";
        return b > JRMCoreGuiScreen.y4NUu(k) ? JRMCoreGuiScreen.y4NUu(k) : b;
    }

    private void align(String icons) {
        double maxperc;
        int var22;
        int ySize2 = this.ySize - 10;
        int guiLeft2 = (this.width - this.xSize) / 2;
        int guiTop2 = (this.height - ySize2) / 2;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation tx = new ResourceLocation(icons);
        JRMCoreGuiScreen.mc.renderEngine.bindTexture(tx);
        GL11.glPushMatrix();
        int alignment1 = 654591;
        int alignment2 = 0x5BFBFF;
        boolean evl = JRMCoreH.Algnmnt_Evil(JRMCoreH.align);
        if (JRMCoreH.Algnmnt_Good(JRMCoreH.align)) {
            alignment1 = 654591;
            alignment2 = 0x5BFBFF;
        } else if (JRMCoreH.Algnmnt_Neut(JRMCoreH.align)) {
            alignment1 = 9127101;
            alignment2 = 11042302;
        } else if (evl) {
            alignment1 = 16726090;
            alignment2 = 16544131;
        }
        float h2 = (float)(alignment1 >> 16 & 0xFF) / 255.0f;
        float h3 = (float)(alignment1 >> 8 & 0xFF) / 255.0f;
        float h4 = (float)(alignment1 & 0xFF) / 255.0f;
        float h1 = 1.0f;
        GL11.glColor4f((float)(h1 * h2), (float)(h1 * h3), (float)(h1 * h4), (float)0.5f);
        this.drawTexturedModalRect(guiLeft2 + 8, guiTop2 - 11, 8, 174, 241, 7);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
        this.drawTexturedModalRect(guiLeft2, guiTop2 - 10, 0, 169, this.xSize, 5);
        int max = this.xSize - 20;
        if (max < 1) {
            max = 1;
        }
        if ((var22 = (int)((maxperc = (double)max * 0.01) * (double)JRMCoreH.align)) > this.xSize) {
            var22 = this.xSize;
        }
        int xSize2 = 5;
        int ySize3 = this.ySize - 10;
        int guiLeft3 = (this.width - xSize2) / 2 - max / 2 + var22;
        int guiTop3 = guiTop2 - 1;
        h2 = (float)(alignment2 >> 16 & 0xFF) / 255.0f;
        h3 = (float)(alignment2 >> 8 & 0xFF) / 255.0f;
        h4 = (float)(alignment2 & 0xFF) / 255.0f;
        GL11.glColor4f((float)(h1 * h2), (float)(h1 * h3), (float)(h1 * h4), (float)1.0f);
        this.drawTexturedModalRect(guiLeft3 - 4, guiTop3 - 10 - 3, 0, 182, 11, 13);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private void name(FontRenderer var8, int i, int j) {
        this.inputField = new GuiTextField(var8, i + 100, j + 15 + 0, 100, 12);
        this.inputField.setMaxStringLength(20);
        this.inputField.setEnableBackgroundDrawing(true);
        this.inputField.setFocused(true);
        this.inputField.setText(this.defaultInputFieldText);
        this.inputField.setCanLoseFocus(true);
    }

    public void updateScreen() {
        if (this.inputField != null) {
            this.inputField.updateCursorCounter();
        }
        for (int id = 0; id < this.inputField2.length; ++id) {
            if (this.inputField2 == null || this.inputField2[id] == null) continue;
            this.inputField2[id].updateCursorCounter();
        }
    }

    protected void keyTyped(char c, int i) {
        super.keyTyped(c, i);
        if (this.inputField != null) {
            this.inputField.textboxKeyTyped(c, i);
        }
        for (int id = 0; id < this.inputField2.length; ++id) {
            if (this.inputField2 == null || this.inputField2[id] == null) continue;
            this.inputField2Ch = true;
            this.inputField2[id].textboxKeyTyped(c, i);
        }
    }

    protected void mouseClicked(int i, int j, int k) {
        super.mouseClicked(i, j, k);
        if (this.inputField != null) {
            this.inputField.mouseClicked(i, j, k);
        }
        for (int id = 0; id < this.inputField2.length; ++id) {
            if (this.inputField2 == null || this.inputField2[id] == null) continue;
            this.inputField2[id].mouseClicked(i, j, k);
        }
    }

    private void nametf(FontRenderer var8, int id, int i, int j) {
        this.inputField2[id].setMaxStringLength(3);
        this.inputField2[id].setEnableBackgroundDrawing(true);
        this.inputField2[id].setCanLoseFocus(true);
    }

    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        mc.getTextureManager().bindTexture(field_110408_a);
        int k = this.guiLeft;
        int l = this.guiTop;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        JRMCoreGuiScreen.func_110423_a(k + 51, l + 75, 30, (float)(k + 51) - this.xSize_lo, (float)(l + 75 - 50) - this.ySize_lo, (EntityLivingBase)JRMCoreGuiScreen.mc.thePlayer);
    }

    public static void head(int par0, int par1, int par2, float par3, float par4, EntityLivingBase par5EntityLivingBase) {
        GL11.glEnable((int)2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par0, (float)par1, (float)50.0f);
        GL11.glScalef((float)(-par2), (float)par2, (float)par2);
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        float f2 = par5EntityLivingBase.renderYawOffset;
        float f3 = par5EntityLivingBase.rotationYaw;
        float f4 = par5EntityLivingBase.rotationPitch;
        float f5 = par5EntityLivingBase.prevRotationYawHead;
        float f6 = par5EntityLivingBase.rotationYawHead;
        GL11.glRotatef((float)135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-((float)Math.atan(par4 / 40.0f)) * 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        par5EntityLivingBase.renderYawOffset = (float)Math.atan(par3 / 40.0f) * 20.0f;
        par5EntityLivingBase.rotationYaw = (float)Math.atan(par3 / 40.0f) * 40.0f;
        par5EntityLivingBase.rotationPitch = -((float)Math.atan(par4 / 40.0f)) * 20.0f;
        par5EntityLivingBase.rotationYawHead = par5EntityLivingBase.rotationYaw;
        par5EntityLivingBase.prevRotationYawHead = par5EntityLivingBase.rotationYaw;
        GL11.glTranslatef((float)0.0f, (float)par5EntityLivingBase.yOffset, (float)0.0f);
        RenderManager.instance.playerViewY = 180.0f;
        JRMCoreGuiScreen.renderEntityWithPosYaw((Entity)par5EntityLivingBase, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        par5EntityLivingBase.renderYawOffset = f2;
        par5EntityLivingBase.rotationYaw = f3;
        par5EntityLivingBase.rotationPitch = f4;
        par5EntityLivingBase.prevRotationYawHead = f5;
        par5EntityLivingBase.rotationYawHead = f6;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable((int)32826);
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GL11.glDisable((int)3553);
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    public static void renderEntityWithPosYaw(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
        block4: {
            Render render = null;
            try {
                render = RenderManager.instance.getEntityRenderObject(par1Entity);
                if (render == null || RenderManager.instance.renderEngine == null) break block4;
                try {
                    render.doRender(par1Entity, par2, par4, par6, par8, par9);
                }
                catch (Throwable throwable1) {
                    throw new ReportedException(CrashReport.makeCrashReport((Throwable)throwable1, (String)"Rendering entity in world"));
                }
            }
            catch (Throwable throwable3) {
                CrashReport crashreport = CrashReport.makeCrashReport((Throwable)throwable3, (String)"Rendering entity in world");
                throw new ReportedException(crashreport);
            }
        }
    }

    public static void func_110423_a_I(int par0, int par1, int scale, float par3, float par4, EntityLivingBase entity) {
        JRMCoreGuiScreen.func_110423_a(par0, par1, scale, par3, par4, entity, true, true, false);
    }

    public static void func_110423_a(int par0, int par1, int scale, float par3, float par4, EntityLivingBase entity) {
        JRMCoreGuiScreen.func_110423_a(par0, par1, scale, par3, par4, entity, true, true, true);
    }

    public static void func_110423_a(int par0, int par1, int scale, float par3, float par4, EntityLivingBase entity, boolean hr, boolean l, boolean i) {
        GL11.glEnable((int)2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par0, (float)par1, (float)50.0f);
        GL11.glScalef((float)(-scale), (float)scale, (float)scale);
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        float f2 = entity.renderYawOffset;
        float f3 = entity.rotationYaw;
        float f4 = entity.rotationPitch;
        float f5 = entity.prevRotationYawHead;
        float f6 = entity.rotationYawHead;
        GL11.glRotatef((float)135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        if (l) {
            RenderHelper.enableStandardItemLighting();
        }
        GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        if (hr) {
            GL11.glRotatef((float)(-((float)Math.atan(par4 / 40.0f)) * 20.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        float f = hr ? (float)(i ? -1 : 1) * (float)Math.atan(par3 / 40.0f) * 20.0f : (entity.renderYawOffset = 0.0f);
        entity.rotationYaw = hr ? (float)(i ? -1 : 1) * (float)Math.atan(par3 / 40.0f) * 40.0f : 0.0f;
        entity.rotationPitch = hr ? -((float)Math.atan(par4 / 40.0f)) * 20.0f : 0.0f;
        entity.rotationYawHead = hr ? entity.rotationYaw : 0.0f;
        entity.prevRotationYawHead = hr ? entity.rotationYaw : 0.0f;
        GL11.glTranslatef((float)0.0f, (float)entity.yOffset, (float)0.0f);
        RenderManager.instance.playerViewY = 180.0f;
        RenderManager.instance.renderEntityWithPosYaw((Entity)entity, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        entity.renderYawOffset = f2;
        entity.rotationYaw = f3;
        entity.rotationPitch = f4;
        entity.prevRotationYawHead = f5;
        entity.rotationYawHead = f6;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable((int)32826);
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GL11.glDisable((int)3553);
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    public static void hairCheck(int par0, int par1, int scale, float par3, float par4, EntityLivingBase par5EntityLivingBase, int side) {
        GL11.glEnable((int)2903);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par0, (float)((float)par1 - (side == 4 ? 20.0f : 0.0f)), (float)50.0f);
        GL11.glScalef((float)(-scale), (float)scale, (float)scale);
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        switch (side) {
            case 0: {
                break;
            }
            case 1: {
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                break;
            }
            case 2: {
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                break;
            }
            case 3: {
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                break;
            }
            case 4: {
                GL11.glRotatef((float)40.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
        }
        float f2 = par5EntityLivingBase.renderYawOffset;
        float f3 = par5EntityLivingBase.rotationYaw;
        float f4 = par5EntityLivingBase.rotationPitch;
        float f5 = par5EntityLivingBase.prevRotationYawHead;
        float f6 = par5EntityLivingBase.rotationYawHead;
        GL11.glRotatef((float)135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        par5EntityLivingBase.renderYawOffset = headRoton ? -((float)Math.atan(par3 / 40.0f)) * 20.0f : 0.0f;
        par5EntityLivingBase.rotationYaw = headRoton ? -((float)Math.atan(par3 / 40.0f)) * 40.0f : (float)headRotX;
        par5EntityLivingBase.rotationPitch = headRoton ? -((float)Math.atan(par4 / 40.0f)) * 20.0f : (float)headRotZ;
        par5EntityLivingBase.rotationYawHead = par5EntityLivingBase.rotationYaw;
        par5EntityLivingBase.prevRotationYawHead = par5EntityLivingBase.rotationYaw;
        GL11.glTranslatef((float)0.0f, (float)par5EntityLivingBase.yOffset, (float)0.0f);
        RenderManager.instance.playerViewY = 180.0f;
        RenderManager.instance.renderEntityWithPosYaw((Entity)par5EntityLivingBase, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        par5EntityLivingBase.renderYawOffset = f2;
        par5EntityLivingBase.rotationYaw = f3;
        par5EntityLivingBase.rotationPitch = f4;
        par5EntityLivingBase.prevRotationYawHead = f5;
        par5EntityLivingBase.rotationYawHead = f6;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable((int)32826);
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GL11.glDisable((int)3553);
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    @Override
    public void lostOwnership(Clipboard aClipboard, Transferable aContents) {
    }

    public void setClipboardContents(String aString) {
        StringSelection stringSelection = new StringSelection(aString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, this);
    }

    public String getClipboardContents() {
        boolean hasTransferableText;
        String result = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(null);
        boolean bl = hasTransferableText = contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        if (hasTransferableText) {
            try {
                result = (String)contents.getTransferData(DataFlavor.stringFlavor);
            }
            catch (UnsupportedFlavorException ex) {
                mod_JRMCore.logger.error((Object)ex);
                ex.printStackTrace();
            }
            catch (IOException ex) {
                mod_JRMCore.logger.error((Object)ex);
                ex.printStackTrace();
            }
        }
        return result;
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public boolean doesGuiPauseGame() {
        return false;
    }

    public void current(String var35, int posx, int posy, FontRenderer var8, int var6, int var7) {
        int wid = var8.getStringWidth(var35) / 2;
        int posX = var6 / 2 + posx - wid;
        int posY = var7 / 2 + posy;
        var8.drawString(var35, posX + 1, posY, 0);
        var8.drawString(var35, posX - 1, posY, 0);
        var8.drawString(var35, posX, posY + 1, 0);
        var8.drawString(var35, posX, posY - 1, 0);
        var8.drawString(var35, posX, posY, 8388564);
    }

    public void SagasPage(int var6, int var7) {
        this.textureFile = "jinryuudragonbc:sagas.png";
        this.ScouterRenderBlur(var6, var7);
    }

    public void SagasPrint() {
        this.initGui();
        Minecraft minecraft = JRMCoreClient.mc;
        WorldClient world = minecraft.theWorld;
        EntityClientPlayerMP entityplayersp = minecraft.thePlayer;
        ScaledResolution scaledresolution = new ScaledResolution(minecraft, minecraft.displayWidth, minecraft.displayHeight);
        int width = scaledresolution.getScaledWidth() / 2;
        int height = scaledresolution.getScaledHeight() / 2;
        int widthplus = 8;
        GL11.glEnable((int)3042);
        GL11.glEnable((int)32826);
        RenderHelper.enableStandardItemLighting();
        RenderHelper.disableStandardItemLighting();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.drawCenteredString(this.fontRendererObj, this.Process, width + this.wid, height + this.hei, 16768306);
        GL11.glDisable((int)32826);
        GL11.glDisable((int)3042);
    }

    public void SagasBack(int var6, int var7) {
        int width = var6;
        int height = var7;
        int xSize = 182;
        int ySize = 191;
        int guiLeft = (width - xSize) / 2;
        int guiTop = (height - ySize) / 2;
        String var4 = "jinryuudragonbc:sagas.png";
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation guiLocation = new ResourceLocation(var4);
        JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

    public void ScouterRenderBlur(int par1, int par2) {
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3008);
        ResourceLocation guiLocation = new ResourceLocation(this.textureFile);
        JRMCoreGuiScreen.mc.renderEngine.bindTexture(guiLocation);
        Tessellator var3 = Tessellator.instance;
        var3.startDrawingQuads();
        var3.addVertexWithUV(0.0, (double)par2, -90.0, 0.0, 1.0);
        var3.addVertexWithUV((double)par1, (double)par2, -90.0, 1.0, 1.0);
        var3.addVertexWithUV((double)par1, 0.0, -90.0, 1.0, 0.0);
        var3.addVertexWithUV(0.0, 0.0, -90.0, 0.0, 0.0);
        var3.draw();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3008);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public void sideSagas() {
        if ((int)((double)JRMCoreH.SagaSideProg * 0.01) == 101) {
            this.sideSaga(101, 1, this.guiLeft + 6, this.guiTop + 5, 1);
        } else {
            this.sideSaga(100, 4, this.guiLeft + 6, this.guiTop + 5, 1);
        }
    }

    public void sideSaga(int s, int type, int x, int y, int n) {
        int posX = this.width / 2;
        int posY = this.height / 2;
        int nr = 0;
        if (JRMCoreH.SagaSideProg >= s * 100 && JRMCoreH.SagaSideProg <= s * 100 + 99 || this.smd != 0 && this.smd == s / 100) {
            if (JRMCoreH.SagaSideProg == s * 100 + 99) {
                this.Process = JRMCoreH.trl("jrmc", "reward");
                nr += JRMCoreH.txt(this.Process, "\u00a70", 0, true, x, y + nr * 10, 0);
            } else {
                this.Process = StatCollector.translateToLocal((String)("dbc.sidesagas." + s / 100 * 100 + ".story"));
                nr += JRMCoreH.txt(this.Process, "\u00a71", 0, true, x, y + nr * 10, 0);
                this.Process = StatCollector.translateToLocal((String)("dbc.sidesagas." + s + ".title"));
                nr += JRMCoreH.txt(this.Process, "\u00a78", 5, true, x, y + nr * 10, 0);
                this.Process = StatCollector.translateToLocal((String)("dbc.sidesagas." + s + ".desc"));
                nr += JRMCoreH.txt(this.Process, "\u00a70", 10, true, x, y + nr * 10, 0);
                this.Process = StatCollector.translateToLocal((String)("dbc.sidesagas." + s + ".obj"));
                nr += JRMCoreH.txt(this.Process, "\u00a79", 5, true, x, y + nr * 10, 0);
                if (type != 1 && JRMCoreH.SagaSideProg != 0) {
                    boolean b = false;
                    if (type == 2) {
                        b = true;
                        if (JRMCoreH.SagaSideProg >= s * 100 + 10) {
                            this.Process = "" + (JRMCoreH.SagaSideProg - (s * 100 + 10) == 0 ? StatCollector.translateToLocal((String)"dbc.sagasystem.all.none") : StatCollector.translateToLocal((String)"dbc.sagasystem.all.one")) + " " + StatCollector.translateToLocal((String)"dbc.sagasystem.all.tk");
                        }
                    }
                    if (type == 3) {
                        b = true;
                        if (JRMCoreH.SagaSideProg >= s * 100 + 10) {
                            this.Process = "" + (JRMCoreH.SagaSideProg - (s * 100 + 10)) + " " + StatCollector.translateToLocal((String)"dbc.sagasystem.all.ak");
                        }
                    }
                    if (type == 4) {
                        b = true;
                        this.Process = "" + (JRMCoreH.SagaSideProg - s * 100) + " " + StatCollector.translateToLocal((String)"dbc.sagasystem.all.ak");
                    }
                    if (b) {
                        nr += JRMCoreH.txt(this.Process, "\u00a72", 5, true, x, y + nr * 10, 0);
                    }
                }
                if (JRMCoreH.SagaSideProg == 0) {
                    this.Process = JRMCoreH.trl("jrmc", "accept");
                    this.buttonList.add(new JRMCoreGuiButtons00(-1 * (1000 + s / 100), posX + 60, posY + 50, this.fontRendererObj.getStringWidth(this.Process) + 8, 20, this.Process, 0));
                    this.Process = JRMCoreH.trl("jrmc", "decline");
                    this.buttonList.add(new JRMCoreGuiButtons00(1000, posX - 60, posY + 50, this.fontRendererObj.getStringWidth(this.Process) + 8, 20, this.Process, 0));
                } else {
                    this.Process = JRMCoreH.trl("jrmc", "abandon");
                    this.buttonList.add(new JRMCoreGuiButtons00(-1000, posX - 60, posY + 50, this.fontRendererObj.getStringWidth(this.Process) + 8, 20, this.Process, 0));
                }
            }
        } else {
            this.Process = StatCollector.translateToLocal((String)("dbc.sidesagas." + s / 100 * 100 + ".story"));
            this.buttonList.add(new JRMCoreGuiButtons01(1000 + s / 100, posX - 122, posY - 74 + n * 10, this.fontRendererObj.getStringWidth(this.Process), this.Process, 0));
        }
    }

    public void mainSaga(int title, int saganum, int type, int x, int y) {
        int nr = 0;
        if (JRMCoreH.SagaProg >= saganum * 100 && JRMCoreH.SagaProg <= saganum * 100 + 99) {
            if (title == 1) {
                this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.saiyan");
            }
            if (title == 2) {
                this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.freeza");
            }
            if (title == 3) {
                this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.android");
            }
            if (title == 4) {
                this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.buu");
            }
            if (title == 5) {
                this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.beerus");
            }
            if (title == 6) {
                this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.gfreeza");
            }
            if (title == 7) {
                this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.universe6");
            }
            if (title == 8) {
                this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.cvegeta");
            }
            if (title == 9) {
                this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.dbsftrunks");
            }
            if (title == 99) {
                this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.credits");
            }
            nr += JRMCoreH.txt(this.Process, "\u00a71", 0, true, x, y + nr * 10, 0);
            int s = saganum;
            if (JRMCoreH.SagaProg == saganum * 100 + 99) {
                this.Process = JRMCoreH.trl("jrmc", "reward");
                nr += JRMCoreH.txt(this.Process, "\u00a70", 0, true, x, y + nr * 10, 0);
            } else {
                this.Process = StatCollector.translateToLocal((String)("dbc.sagasystem." + s + ".title"));
                nr += JRMCoreH.txt(this.Process, "\u00a78", 5, true, x, y + nr * 10, 0);
                this.Process = StatCollector.translateToLocal((String)("dbc.sagasystem." + s + ".desc"));
                nr += JRMCoreH.txt(this.Process, "\u00a70", 10, true, x, y + nr * 10, 0);
                this.Process = StatCollector.translateToLocal((String)("dbc.sagasystem." + s + ".obj"));
                nr += JRMCoreH.txt(this.Process, "\u00a79", 5, true, x, y + nr * 10, 0);
                if (type != 1) {
                    boolean b = false;
                    if (type == 2 && JRMCoreH.SagaProg >= saganum * 100 + 10) {
                        b = true;
                        this.Process = "" + (JRMCoreH.SagaProg - (saganum * 100 + 10) == 0 ? StatCollector.translateToLocal((String)"dbc.sagasystem.all.none") : StatCollector.translateToLocal((String)"dbc.sagasystem.all.one")) + " " + StatCollector.translateToLocal((String)"dbc.sagasystem.all.tk");
                    }
                    if (type == 3 && JRMCoreH.SagaProg >= saganum * 100 + 10) {
                        b = true;
                        this.Process = "" + (JRMCoreH.SagaProg - (saganum * 100 + 10)) + " " + StatCollector.translateToLocal((String)"dbc.sagasystem.all.ak");
                    }
                    if (type == 4) {
                        b = true;
                        this.Process = "" + (JRMCoreH.SagaProg - saganum * 100) + " " + StatCollector.translateToLocal((String)"dbc.sagasystem.all.ak");
                    }
                    if (b) {
                        nr += JRMCoreH.txt(this.Process, "\u00a72", 5, true, x, y + nr * 10, 0);
                    }
                }
            }
        } else if (JRMCoreH.SagaProg < 100) {
            this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.0.title");
            nr += JRMCoreH.txt(this.Process, "\u00a78", 0, true, x, y + nr * 10, 0);
            this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.0.desc");
            nr += JRMCoreH.txt(this.Process, "\u00a70", 5, true, x, y + nr * 10, 0);
            this.Process = StatCollector.translateToLocal((String)"dbc.sagasystem.0.obj");
            nr += JRMCoreH.txt(this.Process, "\u00a79", 10, true, x, y + nr * 10, 0);
        }
    }

    public static void dataSend(String c, String d) {
        PD.sendToServer(new JRMCorePData2(c, d));
    }

    public void msys(String sid, int x, int y) {
        int szx = 14;
        int curm = JRMCoreM.getSydaAmount(JRMCoreH.MSD);
        int mainMsnID = JRMCoreM.getMda_SeriesByID(JRMCoreH.MSD, sid);
        int MsnID = 0;
        if (mainMsnID >= 0) {
            MsnID = JRMCoreM.getMda_Mission(JRMCoreH.MSD, mainMsnID);
        }
        JRMCoreMsn msn = JRMCoreM.missionsC.get(sid);
        int m1 = scrlld;
        float m2 = 5.0f;
        int sz = 10;
        this.scrollMouseJump = 1;
        if (m1 > sz) {
            if ((float)m1 - m2 < (float)this.scroll) {
                this.scroll = (int)((float)m1 - m2);
            } else if (this.scroll < 0) {
                this.scroll = 0;
            }
            if (this.mousePressed && !JRMCoreGuiButtonsA1.clicked) {
                this.scroll = (int)(((float)m1 - m2) * scrollSide);
            } else {
                scrollSide = JRMCoreGuiSliderX00.sliderValue = (float)this.scroll / ((float)m1 - m2);
            }
        } else {
            this.scroll = 0;
        }
        if (m1 > sz) {
            if (scrollSide > 0.0f) {
                this.buttonList.add(new JRMCoreGuiButtonsA1(43, this.guiLeft + this.xSize / 2 + 110 + 18, this.guiTop + 80 - 70, "i"));
            }
            if (scrollSide < 1.0f) {
                this.buttonList.add(new JRMCoreGuiButtonsA1(44, this.guiLeft + this.xSize / 2 + 110 + 18, this.guiTop + 80 + 60, "v"));
            }
            this.buttonList.add(new JRMCoreGuiSliderX00(1000000, this.guiLeft + this.xSize / 2 + 110 + 18, this.guiTop + 25, this.mousePressed, scrollSide, 1.0f));
        }
        int nr = 0;
        if (!JRMCoreH.MSD.equals(" ") && msn != null && msn.getId() == MsnID) {
            boolean t = msn.isTranslated();
            String s = msn.getTitle(JRMCoreH.Pwrtyp, JRMCoreH.Race, JRMCoreH.Class);
            nr += JRMCoreH.txt(t ? JRMCoreH.trl(s) : s, "\u00a71", 0, true, x, y + (nr - this.scroll) * 10, 0, this.scroll - nr, 0);
            s = msn.getSubtitle(JRMCoreH.Pwrtyp, JRMCoreH.Race, JRMCoreH.Class);
            nr += JRMCoreH.txt(t ? JRMCoreH.trl(s) : s, "\u00a78", 5, true, x + 5, y + (nr - this.scroll) * 10, 0, this.scroll - nr, 0);
            ArrayList<String> a = msn.getObjectives(JRMCoreH.Pwrtyp, JRMCoreH.Race, JRMCoreH.Class);
            String btnN = a.get(0);
            String[] syncMda = JRMCoreM.getMda(JRMCoreH.MSD, sid);
            if (syncMda.length > 1) {
                s = msn.getDescription(JRMCoreH.Pwrtyp, JRMCoreH.Race, JRMCoreH.Class);
                int snr = this.scroll - nr;
                snr = (snr > 0 ? 1 : 0) + snr;
                int test = szx + snr;
                nr += JRMCoreH.txtH(t ? JRMCoreH.trl(s) : s, "\u00a70", 10, true, x, y + (nr - this.scroll) * 10, 0, snr, test, this.buttonList);
                if (JRMCoreM.getMda_ObjComp_all(a, syncMda, JRMCoreH.GMN)) {
                    ArrayList<String> r = msn.getRewards(JRMCoreH.Pwrtyp, JRMCoreH.Race, JRMCoreH.Class);
                    String ps = msn.getProps().get(0);
                    boolean rr = ps.equalsIgnoreCase("randrew");
                    for (int i = 0; i < (rr ? 1 : r.size()); ++i) {
                        String[] rw = r.get(i).split(";");
                        String bs = JRMCoreH.trl(rw[1]);
                        int nw = this.fontRendererObj.getStringWidth(bs) + 8;
                        if (nr - this.scroll < szx - 1 && this.scroll - nr < 0) {
                            this.buttonList.add(new JRMCoreGuiButtons00MS(6000, this.guiLeft + this.xSize / 2 - nw / 2, y + (nr - this.scroll) * 11, nw, 20, bs, 0, sid, "" + i));
                        }
                        ++nr;
                        ++nr;
                    }
                } else {
                    String lkd2;
                    String[] sydaV;
                    String rpv;
                    int rpi;
                    String n;
                    ArrayList<String> d = JRMCoreM.missionsCD.get(sid);
                    String ul = d.size() > 7 ? JRMCoreH.trl(d.get(7)) : "";
                    String nsds = "";
                    String[] syncMdaV = JRMCoreM.getMda(JRMCoreH.MSDV, sid);
                    boolean unlocked = true;
                    if (ul.length() > 0) {
                        int k;
                        String[] sidd = ul.split(",");
                        for (k = 0; k < sidd.length && (unlocked = JRMCoreM.isUnlocked(sidd[k], JRMCoreH.MSD, JRMCoreH.MSDV)); ++k) {
                        }
                        for (k = 0; k < sidd.length; ++k) {
                            unlocked = JRMCoreM.isUnlocked(sidd[k], JRMCoreH.MSD, JRMCoreH.MSDV);
                            if (sidd[k].contains(":")) {
                                String[] nmd = sidd[k].split(":");
                                ArrayList<String> dd = JRMCoreM.missionsCD.get(nmd[0]);
                                if (dd == null) continue;
                                String nsd = JRMCoreH.trl(dd.get(1));
                                if (unlocked) continue;
                                nsds = nsds + "/n" + nsd + " (ID: " + nmd[1] + ")";
                                continue;
                            }
                            ArrayList<String> dd = JRMCoreM.missionsCD.get(sidd[k]);
                            if (dd == null) continue;
                            String nsd = JRMCoreH.trl(dd.get(1));
                            if (unlocked) continue;
                            nsds = nsds + "/n" + nsd;
                        }
                    }
                    String string = n = (rpi = Integer.parseInt(rpv = JRMCoreM.getSydaV(sydaV = JRMCoreM.getMda(JRMCoreH.MSDV, sid), 2)) * 5) > 0 ? JRMCoreH.trl("jrmc", "missionRepeat.wait", JRMCoreH.format_lz2(rpi / 1 % 60), JRMCoreH.format_lz2(rpi / 60 % 60), JRMCoreH.format_lz2(rpi / 3600 % 24), JRMCoreH.format_lz2(rpi / 86400)) : "";
                    String rp3 = rpi > 0 ? n + "/n" : (rpi < 0 ? JRMCoreH.trl("jrmc", "missionRepeat.not") + "/n" : "");
                    String lkd = unlocked ? "" : JRMCoreH.trl("jrmc", "missionUnlock") + nsds;
                    String lkd1 = rpi > 0 || rpi < 0 ? rp3 : "";
                    boolean lck = !unlocked || rpi > 0 || rpi < 0;
                    String string2 = lkd2 = lck ? JRMCoreH.cldr + "Locked!/n" + lkd + lkd1 : "";
                    if (!lck) {
                        for (int i = 1; i < a.size(); ++i) {
                            String nss = JRMCoreM.getMda_Con(syncMda, JRMCoreM.SYNC_COND_data(i));
                            nr += JRMCoreH.txt(JRMCoreM.getMCo_readable(a.get(i), nss, JRMCoreH.GMN), "\u00a79", 5, true, x, y + (nr - this.scroll) * 10, 0, this.scroll - nr, nr - this.scroll > szx ? nr - this.scroll - szx : 0);
                            --nr;
                        }
                        if (JRMCoreM.getMda_btn_Start(a, syncMda, JRMCoreH.GMN)) {
                            String bs = JRMCoreM.getBtn(btnN);
                            int bsw = this.fontRendererObj.getStringWidth(bs) + 8;
                            this.buttonList.add(new JRMCoreGuiButtons00MS(6000, this.guiLeft + this.xSize / 2 + 60, this.guiTop + (this.ySize + 1) / 2 + 50, bsw, 20, bs, 0, sid, a.size() == 1 ? "-2" : "-1"));
                        }
                    } else {
                        nr += JRMCoreH.txt(lkd2, "\u00a79", 5, true, x, y + (nr - this.scroll) * 10, 0, this.scroll - nr, nr - this.scroll + 3 > szx ? nr - this.scroll - szx + 3 : 0);
                        --nr;
                    }
                }
            }
        } else {
            nr += JRMCoreH.txt("DOWNLOADING MISSION...", "\u00a71", 0, true, x, y + nr * 10, 0);
            if (tick == 0) {
                PD.sendToServer(new JRMCorePData2("", ""));
            }
        }
        scrlld = nr;
    }

    public void dri(int id) {
        PD.sendToServer(new DBCPdri(id));
    }

    public String getAttributeBonusDescription(int attributeID) {
        if (JRMCoreConfig.JRMCABonusOn) {
            String[] bonuses;
            String attributeMulti2 = "\n  Bonus Attributes:";
            String description = "\n  Bonus Attributes:";
            for (String bonus : bonuses = JRMCoreH.getBonusAttributes(attributeID).split("\\|")) {
                description = bonus.equals("n") ? description + "\n    NA" : description + "\n    " + bonus.replace(";", ": ");
            }
            return description;
        }
        return "";
    }

    public String getClientConfigText(String configName, boolean configValue) {
        return JRMCoreH.trl("jrmc", configName) + ": " + (configValue ? JRMCoreH.trl("jrmc", "SETTON") : JRMCoreH.trl("jrmc", "SETTOFF"));
    }

    public static void drawStringWithBorder(FontRenderer fontRendererObj, String text, int x, int y, int color, int borderColor) {
        fontRendererObj.drawString(text, x + 1, y + 2, borderColor);
        fontRendererObj.drawString(text, x - 1, y + 2, borderColor);
        fontRendererObj.drawString(text, x, y + 1 + 2, borderColor);
        fontRendererObj.drawString(text, x, y - 1 + 2, borderColor);
        fontRendererObj.drawString(text, x, y + 2, color);
    }

    public static void drawStringWithBorder(FontRenderer fontRendererObj, String text, int x, int y, int color) {
        JRMCoreGuiScreen.drawStringWithBorder(fontRendererObj, text, x, y, color, 0);
    }

    private String textLevel(int lvl) {
        return "\u00a78(lvl: " + lvl + ")";
    }

    private void updateMajinHairToBodyColor() {
        if (JRMCoreH.isRaceMajin(RaceSlcted) && ColorSlcted != BodyColMainSlcted) {
            ColorSlcted = BodyColMainSlcted;
            JRMCoreGuiScreen.setdnsForHair();
        }
    }

    static {
        urlToOpen = "";
        ptch = 0.0f;
        scrollSide = 0.0f;
        hairPreview = 0;
        hairPreviewStates = new int[]{0, 4, 5, 6};
        headRoton = false;
        headRotX = 0;
        headRotY = 0;
        headRotZ = 0;
        help_page_id = 0;
        help_mode = 0;
        cs_pages = new int[]{9, 3};
        cs_page = 0;
        cs_mode = 0;
        CanRace = true;
        CanGender = true;
        CanYears = true;
        CanHair = true;
        CanColor = true;
        canCustom = true;
        CanSpecial = true;
        CanPwr = true;
        CanClass = true;
        CanUpgrade = new boolean[]{true, true, true, true, true, true};
        EnAttNum = 0;
        name = "Attack";
        acquired = 1;
        owner = JRMCoreClient.mc.thePlayer.getCommandSenderName();
        type = JRMCoreH.techBase[3];
        speed = JRMCoreH.techBase[4];
        dam = JRMCoreH.techBase[5];
        effect = JRMCoreH.techBase[6];
        cost = JRMCoreH.techBase[7];
        casttime = JRMCoreH.techBase[8];
        cooldown = JRMCoreH.techBase[9];
        color = JRMCoreH.techBase[10];
        density = JRMCoreH.techBase[11];
        sincantation = JRMCoreH.techBase[12];
        sfire = JRMCoreH.techBase[13];
        smove = JRMCoreH.techBase[14];
        techCrt = new int[]{1, acquired, 1, type, speed, dam, effect, cost, casttime, cooldown, color, density, sincantation, sfire, smove};
        button1 = JRMCoreH.tjjrmc + ":button1.png";
        button2 = JRMCoreH.tjjrmc + ":button2.png";
        wish = JRMCoreH.tjjrmc + ":gui.png";
        guiBG2 = JRMCoreH.tjjrmc + ":gui2.png";
        pc = JRMCoreH.tjjrmc + ":gui_pc.png";
        gui_help_tabs = JRMCoreH.tjjrmc + ":help/tab0.png";
        wishsep = JRMCoreH.tjjrmc + ":guidev.png";
        icons = JRMCoreH.tjjrmc + ":icons.png";
        colorType = 0;
        StateSlcted = 0;
        RaceSlcted = 0;
        GenderSlcted = 0;
        YearsSlcted = 3;
        HairSlcted = 10;
        Hair2Slcted = 0;
        ColorSlcted = 0;
        BreastSizeSlcted = 4;
        SkinTypeSlcted = 0;
        BodyTypeSlcted = 0;
        BodyColPresetSlcted = 0;
        BodyColMainSlcted = 0;
        BodyColSub1Slcted = 0;
        BodyColSub2Slcted = 0;
        BodyColSub3Slcted = 0;
        FaceNoseSlcted = 0;
        FaceMouthSlcted = 0;
        EyesSlcted = 0;
        EyeColPresetSlcted = 0;
        EyeCol1Slcted = 0;
        EyeCol2Slcted = 0;
        BodyauColMainSlcted = 0;
        BodyauColSub1Slcted = 0;
        BodyauColSub2Slcted = 0;
        BodyauColSub3Slcted = 0;
        HairPrstsSlcted = 0;
        canSavePreset = true;
        BrghtSlcted = 0.8f;
        PwrtypSlcted = 0;
        ClassSlcted = 0;
        tail = true;
        KiColorSlcted = 0;
        PresetList = new ArrayList();
        tick = 0;
        dnsau = JRMCoreH.dnsau;
        dns = JRMCoreH.dns;
        dnsSent = "";
        dnsOrig = "";
        dnsH = JRMCoreH.dnsH;
        dnsHSent = "";
        dnsHOrig = "";
        detailList = new ArrayList();
        ssc = "";
        sscr = 0;
        field_110408_a = new ResourceLocation("textures/gui/container/inventory.png");
        count = 0;
        warn = 0;
        startcount = 0;
        scrlld = 0;
    }
}

