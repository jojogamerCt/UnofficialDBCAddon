/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreClient
 *  JinRyuu.JRMCore.JRMCoreGuiButtons00MS
 *  JinRyuu.JRMCore.JRMCoreGuiButtons01
 *  JinRyuu.JRMCore.JRMCoreGuiScreen
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.JRMCoreHDBC
 *  JinRyuu.JRMCore.JRMCoreM
 *  JinRyuu.JRMCore.p.DBC.DBCPdri
 *  JinRyuu.JRMCore.p.DBC.DBCPwish
 *  JinRyuu.JRMCore.p.PD
 *  JinRyuu.JRMCore.server.config.dbc.JGConfigUltraInstinct
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityClientPlayerMP
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiIngame
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.entity.EntityList
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.StatCollector
 *  net.minecraft.world.World
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.DBCH;
import JinRyuu.DragonBC.common.DBCKiAttacks;
import JinRyuu.DragonBC.common.DBCKiTech;
import JinRyuu.DragonBC.common.Gui.DBCGuiButtons01;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Npcs.EntityDBCKami;
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreGuiButtons00MS;
import JinRyuu.JRMCore.JRMCoreGuiButtons01;
import JinRyuu.JRMCore.JRMCoreGuiScreen;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHDBC;
import JinRyuu.JRMCore.JRMCoreM;
import JinRyuu.JRMCore.p.DBC.DBCPdri;
import JinRyuu.JRMCore.p.DBC.DBCPwish;
import JinRyuu.JRMCore.p.PD;
import JinRyuu.JRMCore.server.config.dbc.JGConfigUltraInstinct;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.EntityList;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class DBCTalkGui
extends GuiScreen {
    public static final int ENMA = 10;
    public static final int ENMA_REINCARNATE = 1001;
    public static final int KAMI = 11;
    public static final int KAMI_STARTANEW = 1101;
    public static final int KAMI_CUTTAIL = 1102;
    public static final int KAMI_REGROWTAIL = 1104;
    public static final int KAMI_WEIGHT = 1105;
    public static final int KAMI_SKILLS = 111;
    public static final int JIN = 9000;
    public static final int JIN_SKILLS = 9100;
    public static final int GURU = 9001;
    public static final int GURU_SKILLS = 9101;
    public static final int WHIS = 9002;
    public static final int WHIS_SKILLS = 9102;
    public static final int KAIO = 12;
    public static final int KAIO_SKILLS = 112;
    public static final int KAIO_ATTACKS = 1121;
    public static final int KAIO_DIFFICULTY = 221;
    public static final int KARIN = 13;
    public static final int KARIN_SKILLS = 113;
    public static final int ROSHI = 15;
    public static final int ROSHI_SKILLS = 115;
    public static final int ROSHI_ATTACKS = 1151;
    public static final int CELL = 16;
    public static final int CELL_SKILLS = 116;
    public static final int CELL_ATTACKS = 1161;
    public static final int GOKU = 17;
    public static final int GOKU_SKILLS = 117;
    public static final int GOKU_ATTACKS = 1171;
    public static final int FRIEZA = 18;
    public static final int FRIEZA_SKILLS = 118;
    public static final int FRIEZA_ATTACKS = 1181;
    public static final int BABIDI = 19;
    public static final int BABIDI_SKILLS = 119;
    public static final int BABIDI_ATTACKS = 1191;
    public static final int PICCOLO = 20;
    public static final int PICCOLO_SKILLS = 120;
    public static final int PICCOLO_ATTACKS = 1201;
    public static final int VEGETA = 21;
    public static final int VEGETA_SKILLS = 121;
    public static final int VEGETA_ATTACKS = 1211;
    public static final int GOHAN = 22;
    public static final int GOHAN_SKILLS = 122;
    public static final int GOHAN_ATTACKS = 1221;
    public static final int TRUNKS = 23;
    public static final int TRUNKS_SKILLS = 123;
    public static final int TRUNKS_ATTACKS = 1231;
    private Minecraft mc = JRMCoreClient.mc;
    private FontRenderer fontRenderer;
    private int tick;
    private GuiIngame Guiingame;
    private int wish;
    private int ipg;
    private int lp;
    private int master;
    private HashMap<String, String> MsnSysTalkTo;
    private String CurMaster;
    private String name;
    private int text;
    protected GuiTextField inputField;
    private String defaultInputFieldText;
    private int updateTimer;
    private int updateTime;
    private boolean updateTimerStopper;
    public static int count = 0;
    public static int warn = 0;
    public static int startcount = 0;
    private String Process;
    private int wid;
    private int hei;
    private String textureFile;

    public void renderSuperProtect(int ki) {
        this.buttonList.clear();
        int posX = this.width / 2;
        int posY = this.height / 2;
        this.buttonList.add(new DBCGuiButtons01(100, posX - 0, posY - 0, 20, 20, "TEST"));
    }

    public DBCTalkGui(int w, World wld, int x, int y, int z) {
        this.fontRenderer = this.mc.fontRenderer;
        this.wish = 0;
        this.ipg = 0;
        this.lp = 0;
        this.master = 0;
        this.CurMaster = "";
        this.name = "";
        this.text = 0;
        this.defaultInputFieldText = "";
        this.updateTimer = 0;
        this.updateTime = 0;
        this.updateTimerStopper = false;
        this.Process = "Something is Wrong";
        this.wid = 0;
        this.hei = 0;
        this.textureFile = "jinryuudragonbc:sagas.png";
        double n = 0.1;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)((double)x - n), (double)((double)y + n), (double)((double)z - n), (double)((double)x + n), (double)((double)y + n), (double)((double)z + n));
        List l = wld.getEntitiesWithinAABB(EntityDBCKami.class, aabb);
        Iterator it = l.iterator();
        if (it.hasNext()) {
            EntityDBCKami k = (EntityDBCKami)((Object)it.next());
            this.CurMaster = k.getCommandSenderName();
        }
        this.wish = w;
        this.updateTime = 0;
        JRMCoreH.revTmr = -1;
        JRMCoreH.Master = 1;
        this.MsnSysTalkTo = JRMCoreM.getMda_Obj_TalkTo();
        if (this.wish == 13) {
            DBCKiAttacks.dbctick(-100);
        } else if (this.wish == 12) {
            DBCKiAttacks.dbctick(-101);
        } else if (this.wish == 15) {
            DBCKiAttacks.dbctick(-101);
        } else if (this.wish == 16) {
            DBCKiAttacks.dbctick(-101);
        } else if (this.wish == 17) {
            DBCKiAttacks.dbctick(-101);
        } else if (this.wish == 18) {
            DBCKiAttacks.dbctick(-101);
        } else if (this.wish == 19) {
            DBCKiAttacks.dbctick(-101);
        }
    }

    public void initGui() {
    }

    public void actionPerformed(GuiButton button) {
        int i;
        if (button.id == -1) {
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 0) {
            this.dbcWish(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 1) {
            this.dbcWish(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 2) {
            this.dbcWish(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 3) {
            this.dbcWish(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 4) {
            this.dbcWish(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 10) {
            this.dbcWish(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 11) {
            this.dbcWish(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 12) {
            this.dbcWish(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 13) {
            this.dbcWish(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 14) {
            this.dbcWish(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 99) {
            this.updateTime = 0;
            if (this.wish == 10) {
                this.wish = 1001;
            } else if (this.wish == 1001) {
                this.wish = 10;
            }
        }
        if (button.id == 100) {
            this.dbcTelep(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 101) {
            this.dbcTelep(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 103) {
            this.wish = 221;
        }
        if (button.id == 104) {
            this.wish = 12;
        }
        if (button.id == 105) {
            this.mc.thePlayer.closeScreen();
            JRMCoreH.Char((byte)101, (byte)0);
        }
        if (button.id == 106) {
            JRMCoreH.Char((byte)104, (byte)0);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 107) {
            this.wish = 1102;
        }
        if (button.id == 108) {
            this.wish = 1104;
        }
        if (button.id == 109) {
            JRMCoreH.Char((byte)105, (byte)0);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 198) {
            this.wish = 113;
        }
        if (button.id == 110) {
            this.wish = 1105;
        }
        if (button.id == 111) {
            this.wish = 2005;
        }
        for (int i2 = 0; i2 < 15; ++i2) {
            if (button.id == 10111 + i2) {
                this.wish = 111 + i2;
            }
            if (button.id != 101111 + i2 * 10) continue;
            this.wish = 1111 + i2 * 10;
        }
        if (button.id == 9100) {
            this.wish = 9100;
        }
        if (button.id == 9101) {
            this.wish = 9101;
        }
        if (button.id == 9102) {
            this.wish = 9102;
        }
        if (button.id == 199) {
            this.dbcWish(button.id);
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 201) {
            this.mc.thePlayer.closeScreen();
            JRMCoreH.Char((byte)4, (byte)0);
            JRMCoreH.Char((byte)100, (byte)0);
            boolean doit = true;
            if (JRMCoreH.DBC() && this.mc.thePlayer != null) {
                boolean bl = doit = !JRMCoreH.isFused();
            }
            if (doit) {
                JRMCoreH.resetChar();
                DBCKiTech.turbo = false;
            }
        }
        if (button.id == 2011) {
            this.wish = 1101;
        }
        if (button.id == 2012) {
            this.wish = 11;
        }
        if (button.id == 202) {
            if (JRMCoreH.align > 65) {
                this.dbcWish(button.id);
            } else {
                this.dbcWish(button.id + 1);
            }
            this.mc.thePlayer.closeScreen();
        }
        if (button instanceof JRMCoreGuiButtons00MS && button.id == 6000) {
            JRMCoreGuiButtons00MS btn = (JRMCoreGuiButtons00MS)button;
            if (btn.d2.equals("-3")) {
                this.mc.thePlayer.closeScreen();
            }
            JRMCoreGuiScreen.dataSend((String)btn.d1, (String)btn.d2);
        }
        for (i = 0; i < JRMCoreH.DBCSkillsIDs.length; ++i) {
            if (button.id != 1000 + i) continue;
            JRMCoreH.Skll((byte)1, (byte)((byte)i));
        }
        for (i = 0; i < (JRMCoreH.Pwrtyp == 2 ? JRMCoreH.pmj : JRMCoreH.pmdbc).length; i = (int)((byte)(i + 1))) {
            if (button.id != 4200 + i) continue;
            JRMCoreH.Tech((byte)4, (String)("" + i));
            this.wish = (this.wish - 1000) / 10;
            this.ipg = 0;
        }
        if ((this.name.matches("[0-9].+") || this.name.matches("[0-9]+")) && this.name.length() > 0) {
            try {
                this.name = (Float.parseFloat(this.name) > 5000.0f ? 5000.0f : (Float.parseFloat(this.name) < 0.1f ? 0.1f : Float.parseFloat(this.name))) + "";
            }
            catch (Exception e) {
                this.name = "5";
            }
            if (button.id == 210) {
                PD.sendToServer((IMessage)new DBCPwish(2, "0;" + this.name));
                this.mc.thePlayer.closeScreen();
            }
            if (button.id == 211) {
                PD.sendToServer((IMessage)new DBCPwish(2, "1;" + this.name));
                this.mc.thePlayer.closeScreen();
            }
            if (button.id == 212) {
                PD.sendToServer((IMessage)new DBCPwish(2, "2;" + this.name));
                this.mc.thePlayer.closeScreen();
            }
            if (button.id == 213) {
                PD.sendToServer((IMessage)new DBCPwish(2, "3;" + this.name));
                this.mc.thePlayer.closeScreen();
            }
            if (button.id == 214) {
                PD.sendToServer((IMessage)new DBCPwish(2, "4;" + this.name));
                this.mc.thePlayer.closeScreen();
            }
        }
        if (button.id == 50) {
            PD.sendToServer((IMessage)new DBCPwish(5, "0"));
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 51) {
            PD.sendToServer((IMessage)new DBCPwish(5, "1"));
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 52) {
            PD.sendToServer((IMessage)new DBCPwish(6, ""));
            this.mc.thePlayer.closeScreen();
        }
    }

    public void dri(int id) {
        int dri = id;
        PD.sendToServer((IMessage)new DBCPdri(dri));
    }

    public void dbcWish(int id) {
        int dbcwish = id;
        PD.sendToServer((IMessage)new DBCPwish(1, dbcwish + ""));
    }

    public void dbcTelep(int id) {
        int dbcwish = id;
        PD.sendToServer((IMessage)new DBCPwish(1, dbcwish + ""));
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
    }

    protected void keyTyped(char c, int i) {
        super.keyTyped(c, i);
        if (this.inputField != null) {
            this.inputField.textboxKeyTyped(c, i);
        }
    }

    protected void mouseClicked(int i, int j, int k) {
        super.mouseClicked(i, j, k);
        if (this.inputField != null) {
            this.inputField.mouseClicked(i, j, k);
        }
    }

    public void sklLrn(int i, int x, int y) {
        DBCGuiButtons01 btn = new DBCGuiButtons01(JRMCoreH.SklLvl((int)i, (byte)1) < 1 ? 1000 + i : -1, x, y, 83, 20, JRMCoreH.trl((String)"dbc", (String)JRMCoreH.DBCSkillNames[i]));
        btn.enabled = JRMCoreH.getDBCSkillTPCost((int)i, (int)0) == -1 ? false : (JRMCoreH.getDBCSkillTPCost((int)i, (int)0) <= JRMCoreH.curTP ? JRMCoreH.SklLvl((int)i) < 1 : false);
        this.buttonList.add(btn);
        this.mc.fontRenderer.drawString(JRMCoreH.SklLvl((int)i, (byte)1) < 1 ? (JRMCoreH.getDBCSkillTPCost((int)i, (int)0) == -1 ? JRMCoreH.trl((String)"jrmc", (String)"UpgradeLocked") : JRMCoreH.trl((String)"dbc.talkgui.cost") + ": " + JRMCoreH.getDBCSkillTPCost((int)i, (int)0) + " " + JRMCoreH.trl((String)"dbc.talkgui.mind") + ": " + JRMCoreH.skillMindRequirement((String)JRMCoreH.DBCSkillsIDs[i], (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost)) : JRMCoreH.trl((String)"dbc.talkgui.owned"), x + 120, y + 7, 0);
    }

    public void sklLrn(int i, int x, int y, boolean b) {
        DBCGuiButtons01 btn = new DBCGuiButtons01(JRMCoreH.SklLvl((int)i, (byte)1) < 1 ? 1000 + i : -1, x, y, 83, 20, JRMCoreH.trl((String)"dbc", (String)JRMCoreH.DBCSkillNames[i]));
        btn.enabled = JRMCoreH.getDBCSkillTPCost((int)i, (int)0) == -1 ? false : (JRMCoreH.getDBCSkillTPCost((int)i, (int)0) <= JRMCoreH.curTP && JRMCoreH.SklLvl((int)i) < 1 ? b : false);
        this.buttonList.add(btn);
        this.mc.fontRenderer.drawString(JRMCoreH.SklLvl((int)i) < 1 ? (JRMCoreH.getDBCSkillTPCost((int)i, (int)0) == -1 ? JRMCoreH.trl((String)"jrmc", (String)"UpgradeLocked") : JRMCoreH.trl((String)"dbc.talkgui.cost") + ": " + JRMCoreH.getDBCSkillTPCost((int)i, (int)0) + " " + JRMCoreH.trl((String)"dbc.talkgui.mind") + ": " + JRMCoreH.skillMindRequirement((String)JRMCoreH.DBCSkillsIDs[i], (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost)) : JRMCoreH.trl((String)"dbc.talkgui.owned"), x + 120, y + 7, 0);
    }

    public void drawScreen(int x, int y, float f) {
        String en;
        ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = this.mc.fontRenderer;
        this.buttonList.clear();
        ++this.tick;
        if (this.tick >= 20) {
            this.tick = 0;
            JRMCoreH.jrmct((int)1);
            JRMCoreH.jrmct((int)3);
        }
        int posX = this.width / 2;
        int posY = this.height / 2;
        int xSize = 256;
        int ySize = 160;
        int guiLeft = (this.width - xSize) / 2;
        int guiTop = (this.height - ySize) / 2;
        boolean cont = true;
        if (this.MsnSysTalkTo != null && (en = EntityList.createEntityByName((String)this.MsnSysTalkTo.get("N"), null).getCommandSenderName()).equalsIgnoreCase(this.CurMaster)) {
            cont = false;
            String wish = "jinryuudragonbc:saa.png";
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation tx = new ResourceLocation(wish);
            this.mc.renderEngine.bindTexture(tx);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
            int nr = 0;
            this.Process = en;
            nr += JRMCoreH.txt((String)this.Process, (String)"\u00a78", (int)0, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
            boolean t = Boolean.parseBoolean(this.MsnSysTalkTo.get("translated"));
            this.Process = JRMCoreH.trl((String)this.MsnSysTalkTo.get("G"));
            nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
            this.Process = JRMCoreH.trl((String)this.MsnSysTalkTo.get("B"));
            int pw = var8.getStringWidth(this.Process) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00MS(6000, guiLeft + xSize - 6 - pw, guiTop + ySize - 5 - 20, pw, 20, this.Process, 0, this.MsnSysTalkTo.get("series"), "-3"));
            this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
        }
        if (cont) {
            int nw;
            int onw;
            int fnw;
            int owner;
            int i;
            int nms;
            int i2;
            boolean gf;
            int nw2;
            int i3;
            int ml;
            int nw3;
            int line;
            ResourceLocation tx;
            String n;
            int i22;
            int i4;
            if (this.wish == 10) {
                xSize = 182;
                ySize = 191;
                guiLeft = (this.width - xSize) / 2;
                guiTop = (this.height - ySize) / 2;
                this.drawBg("enma", xSize, ySize);
                int time = (int)(System.currentTimeMillis() / 1000L);
                if (this.updateTime < time) {
                    this.updateTime = time + 5;
                    DBCH.packDuo(-1, 0);
                }
                i4 = 0;
                i22 = 0;
                int a = JRMCoreH.Algnmnt((int)JRMCoreH.align);
                i22 = JRMCoreH.txt((String)JRMCoreH.trl((String)("dbc.talkgui.enmawelcome" + (a == 0 ? "G" : (a == 1 ? "N" : "E")))), (String)JRMCoreH.clb, (int)0, (boolean)true, (int)(guiLeft + 5), (int)(guiTop + 5 + i4 * 10), (int)175);
                i4 += i22;
                if (DBCConfig.Reinc > 0.0f) {
                    n = JRMCoreH.trl((String)"dbc.talkgui.reincarnate");
                    int nw4 = var8.getStringWidth(n);
                    this.buttonList.add(new DBCGuiButtons01(99, guiLeft + xSize / 2 - nw4 / 2 - 5, guiTop + 5 + i4 * 21 - i22 * 10, nw4 + 10, 20, n));
                    ++i4;
                }
                if (JRMCoreH.revTmr > 0 && DBCConfig.FreeRev) {
                    int rt = (int)JRMCoreH.gkap((long)(JRMCoreH.revTmr - 5), (String)"rt", (int)5, (double)0.025);
                    int rt1 = rt / 1 % 60;
                    int rt2 = rt / 60 % 60;
                    int rt3 = rt / 3600 % 24;
                    int rt4 = rt / 86400;
                    n = JRMCoreH.trl((String)"dbc.talkgui.revivetime", (Object[])new Object[]{JRMCoreH.format_lz2((Object[])new Object[]{rt1}), JRMCoreH.format_lz2((Object[])new Object[]{rt2}), JRMCoreH.format_lz2((Object[])new Object[]{rt3}), JRMCoreH.format_lz2((Object[])new Object[]{rt4})});
                    int nw5 = var8.getStringWidth(n);
                    var8.drawString(n, guiLeft + xSize / 2 - nw5 / 2, guiTop + 12 + i4 * 21 - i22 * 10, 0);
                    n = JRMCoreH.trl((String)"dbc.talkgui.revfree");
                    nw5 = var8.getStringWidth(n);
                    DBCGuiButtons01 b = new DBCGuiButtons01(-1, posX - nw5 / 2 - 5, guiTop + 5 + ++i4 * 21 - i22 * 10, nw5 + 10, 20, n);
                    b.enabled = false;
                    this.buttonList.add(b);
                    ++i4;
                } else if (JRMCoreH.revTmr == 0) {
                    n = JRMCoreH.trl((String)"dbc.talkgui.revfree");
                    int nw6 = var8.getStringWidth(n);
                    this.buttonList.add(new DBCGuiButtons01(100, posX - nw6 / 2 - 5, guiTop + 5 + i4 * 21 - i22 * 10, nw6 + 10, 20, n));
                    ++i4;
                }
                n = JRMCoreH.trl((String)"dbc.talkgui.stay");
                int nw7 = var8.getStringWidth(n);
                this.buttonList.add(new DBCGuiButtons01(-1, posX - nw7 / 2 - 5, guiTop + 5 + i4 * 21 - i22 * 10, nw7 + 10, 20, n));
                ++i4;
            } else if (this.wish == 1001) {
                xSize = 182;
                ySize = 191;
                guiLeft = (this.width - xSize) / 2;
                guiTop = (this.height - ySize) / 2;
                this.drawBg("enma", xSize, ySize);
                int time = (int)(System.currentTimeMillis() / 1000L);
                if (this.updateTime < time && !this.updateTimerStopper) {
                    this.updateTime = time + 10;
                }
                this.updateTimer = this.updateTime - time;
                if (this.updateTimer <= 0 && !this.updateTimerStopper) {
                    this.updateTimerStopper = true;
                }
                i4 = 0;
                i22 = 0;
                i22 = JRMCoreH.txt((String)JRMCoreH.trl((String)"dbc.talkgui.enmareincarnate", (Object[])new Object[]{(int)(DBCConfig.Reinc * 100.0f) + "%"}), (String)JRMCoreH.clb, (int)0, (boolean)true, (int)(guiLeft + 5), (int)(guiTop + 5 + i4 * 10), (int)175);
                this.buttonList.add(new DBCGuiButtons01(99, guiLeft + xSize / 2 - 40 - 5, guiTop + 10 + (i4 += i22) * 21 - i22 * 10, 80, 20, JRMCoreH.trl((String)"dbc.talkgui.no")));
                ++i4;
                if (this.updateTimer <= 0) {
                    this.buttonList.add(new DBCGuiButtons01(101, guiLeft + xSize / 2 - 40 - 5, guiTop + 10 + i4 * 21 - i22 * 10, 80, 20, JRMCoreH.trl((String)"dbc.talkgui.confirm")));
                    ++i4;
                } else {
                    n = JRMCoreH.trl((String)"dbc.talkgui.enmareincavilabl", (Object[])new Object[]{JRMCoreH.format_lz2((Object[])new Object[]{this.updateTimer % 60})});
                    int nw8 = var8.getStringWidth(n);
                    var8.drawString(n, guiLeft + xSize / 2 - nw8 / 2, guiTop + 10 + i4 * 21 - i22 * 10 + 5, 0);
                    ++i4;
                }
            } else if (this.wish == 9000) {
                this.master = 16;
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            }
            if (this.wish == 9001) {
                this.master = 17;
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            }
            if (this.wish == 9002) {
                this.master = 18;
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            }
            if (this.wish == 11) {
                this.master = 5;
                int line2 = 0;
                if (JRMCoreH.SagaProg == 1700) {
                    this.buttonList.add(new DBCGuiButtons01(203, posX - 35, posY - 5, 100, 20, StatCollector.translateToLocal((String)"dbc.MainSaga.17.1")));
                } else if (JRMCoreH.SagaSideProg == 10100) {
                    this.buttonList.add(new DBCGuiButtons01(204, posX - 35, posY - 5, 100, 20, StatCollector.translateToLocal((String)"dbc.sidesagas.101.talkok")));
                } else {
                    if (!(JRMCoreH.Race != 1 && JRMCoreH.Race != 2 || JRMCoreH.TlMd != 3 && JRMCoreH.TlMd != 4)) {
                        n = JRMCoreH.trl((String)"dbc.talkgui.kami.forcetailregrow");
                        int nw9 = this.fontRendererObj.getStringWidth(n) + 8;
                        this.buttonList.add(new DBCGuiButtons01(108, posX + 115 - nw9, posY + 15 + line2 * 21, nw9, 20, n));
                        ++line2;
                    }
                    if (!(JRMCoreH.Race != 1 && JRMCoreH.Race != 2 || JRMCoreH.TlMd != -1 && JRMCoreH.TlMd != 0 && JRMCoreH.TlMd != 1)) {
                        n = JRMCoreH.trl((String)"dbc.talkgui.kami.cutdowntail");
                        int nw10 = this.fontRendererObj.getStringWidth(n) + 8;
                        this.buttonList.add(new DBCGuiButtons01(107, posX + 115 - nw10, posY + 15 + line2 * 21, nw10, 20, n));
                        ++line2;
                    }
                    n = JRMCoreH.trl((String)"dbc.talkgui.anew");
                    int nw11 = this.fontRendererObj.getStringWidth(n) + 8;
                    this.buttonList.add(new DBCGuiButtons01(2011, posX + 115 - nw11, posY + 15 + line2 * 21, nw11, 20, n));
                    n = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw11 = this.fontRendererObj.getStringWidth(n) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 10100, posX + 115 - nw11, posY + 15 + ++line2 * 21, nw11, 20, n));
                    ++line2;
                    line2 = 0;
                    n = JRMCoreH.trl((String)"dbc.talkgui.giveweights");
                    nw11 = this.fontRendererObj.getStringWidth(n) + 8;
                    this.buttonList.add(new DBCGuiButtons01(110, posX - 115 - 0, posY + 15 + line2 * 21, nw11, 20, n));
                    ++line2;
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 1101) {
                this.buttonList.add(new DBCGuiButtons01(2012, posX - 35, posY + 55, 80, 20, JRMCoreH.trl((String)"dbc.talkgui.no")));
                this.buttonList.add(new DBCGuiButtons01(201, posX - 120, posY + 55, 80, 20, JRMCoreH.trl((String)"dbc.talkgui.confirm")));
            } else if (this.wish == 1102) {
                this.buttonList.add(new DBCGuiButtons01(2012, posX - 35, posY + 55, 80, 20, JRMCoreH.trl((String)"dbc.talkgui.no")));
                this.buttonList.add(new DBCGuiButtons01(106, posX - 120, posY + 55, 80, 20, JRMCoreH.trl((String)"dbc.talkgui.confirm")));
            } else if (this.wish == 1104) {
                this.buttonList.add(new DBCGuiButtons01(2012, posX - 35, posY + 55, 80, 20, JRMCoreH.trl((String)"dbc.talkgui.no")));
                this.buttonList.add(new DBCGuiButtons01(109, posX - 120, posY + 55, 80, 20, JRMCoreH.trl((String)"dbc.talkgui.confirm")));
            } else if (this.wish == 1105) {
                String im = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(im);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.giveweightsdesc");
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                line = 0;
                String n2 = JRMCoreH.trl((String)"dbc.talkgui.weightamount");
                nw3 = this.fontRendererObj.getStringWidth(n2) + 8;
                ++this.text;
                if (this.text == 1) {
                    this.name(var8, posX - 220 + nw3, posY - 25 + line * 21);
                    this.inputField.setText("5");
                } else {
                    this.text = 2;
                }
                if (this.inputField != null) {
                    this.inputField.drawTextBox();
                    this.name = this.inputField.getText();
                    var8.drawString(n2, posX - 120, posY - 7 + line * 21, 0);
                }
                ++line;
                n2 = ItemsDBC.ItemWeightHandLeg.getItemStackDisplayName(new ItemStack(ItemsDBC.ItemWeightHandLeg));
                nw3 = this.fontRendererObj.getStringWidth(n2) + 8;
                if (this.master == 6) {
                    this.buttonList.add(new DBCGuiButtons01(210, posX - 120, posY - 15 + line * 21, nw3, 20, n2));
                    ++line;
                }
                n2 = ItemsDBC.ItemWeightShell.getItemStackDisplayName(new ItemStack(ItemsDBC.ItemWeightShell));
                nw3 = this.fontRendererObj.getStringWidth(n2) + 8;
                if (this.master == 2) {
                    this.buttonList.add(new DBCGuiButtons01(211, posX - 120, posY - 15 + line * 21, nw3, 20, n2));
                    ++line;
                }
                n2 = ItemsDBC.ItemWeightShirt.getItemStackDisplayName(new ItemStack(ItemsDBC.ItemWeightShirt));
                nw3 = this.fontRendererObj.getStringWidth(n2) + 8;
                if (this.master == 6 || this.master == 5) {
                    this.buttonList.add(new DBCGuiButtons01(212, posX - 120, posY - 15 + line * 21, nw3, 20, n2));
                    ++line;
                }
                n2 = ItemsDBC.ItemWeightCape.getItemStackDisplayName(new ItemStack(ItemsDBC.ItemWeightCape));
                nw3 = this.fontRendererObj.getStringWidth(n2) + 8;
                if (this.master == 8) {
                    this.buttonList.add(new DBCGuiButtons01(213, posX - 120, posY - 15 + line * 21, nw3, 20, n2));
                    ++line;
                }
                n2 = ItemsDBC.ItemWeightHeavySuit.getItemStackDisplayName(new ItemStack(ItemsDBC.ItemWeightHeavySuit));
                nw3 = this.fontRendererObj.getStringWidth(n2) + 8;
                if (this.master == 18) {
                    this.buttonList.add(new DBCGuiButtons01(214, posX - 120, posY - 15 + line * 21, nw3, 20, n2));
                    ++line;
                }
            } else if (this.wish == 111) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                this.sklLrn(1, guiLeft + 5, guiTop + 25 + i3 * 21);
                this.sklLrn(3, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(5, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(4, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(7, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(6, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                ++i3;
            } else if (this.wish == 9000) {
                this.drawBg("saa", xSize, ySize);
                this.master = 17;
                boolean line3 = false;
                int line2 = 0;
                if (JRMCoreH.align > 33) {
                    String n3 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw2 = this.fontRendererObj.getStringWidth(n3) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 100, posX + 115 - nw2, posY + 15 + line2 * 21, nw2, 20, n3));
                    ++line2;
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 9100) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                gf = DBCConfig.Godform && JRMCoreHDBC.godKiAble();
                this.sklLrn(9, guiLeft + 5, guiTop + 25 + i3 * 21, gf);
                ++i3;
                if (JGConfigUltraInstinct.CONFIG_UI_LEVELS > 0) {
                    this.sklLrn(16, guiLeft + 5, guiTop + 25 + i3 * 21);
                    ++i3;
                }
            } else if (this.wish == 9001) {
                this.drawBg("saa", xSize, ySize);
                this.master = 17;
                boolean line4 = false;
                int line2 = 0;
                if (JRMCoreH.align > 33) {
                    String n4 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw2 = this.fontRendererObj.getStringWidth(n4) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 100, posX + 115 - nw2, posY + 15 + line2 * 21, nw2, 20, n4));
                    ++line2;
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 9101) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                this.sklLrn(5, guiLeft + 5, guiTop + 25 + i3 * 21);
                ++i3;
            } else if (this.wish == 9002) {
                this.drawBg("saa", xSize, ySize);
                this.master = 18;
                int line5 = 0;
                int line2 = 0;
                if (JRMCoreH.align > 33) {
                    String n5 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw2 = this.fontRendererObj.getStringWidth(n5) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 100, posX + 115 - nw2, posY + 15 + line2 * 21, nw2, 20, n5));
                    ++line2;
                    if (JRMCoreH.align > 33) {
                        n5 = JRMCoreH.trl((String)"dbc.talkgui.giveweights");
                        nw2 = this.fontRendererObj.getStringWidth(n5) + 8;
                        this.buttonList.add(new DBCGuiButtons01(110, posX - 115, posY + 15 + line5 * 21, nw2, 20, n5));
                        ++line5;
                    }
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                int ln = 0;
                String n6 = JRMCoreH.trl((String)"dbc", (String)"whisteleport");
                nw2 = this.fontRendererObj.getStringWidth(n6) + 8;
                this.buttonList.add(new DBCGuiButtons01(52, posX - nw2 / 2, posY + 20 + ++ln * 20, nw2, 20, n6));
                ++ln;
            } else if (this.wish == 9102) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                gf = DBCConfig.Godform && JRMCoreHDBC.godKiAble();
                this.sklLrn(9, guiLeft + 5, guiTop + 25 + i3 * 21, gf);
                ++i3;
                if (JGConfigUltraInstinct.CONFIG_UI_LEVELS > 0) {
                    this.sklLrn(16, guiLeft + 5, guiTop + 25 + i3 * 21);
                    ++i3;
                }
                this.sklLrn(18, guiLeft + 5, guiTop + 25 + i3 * 21);
                ++i3;
            } else if (this.wish == 12) {
                this.drawBg("saa", xSize, ySize);
                this.master = 6;
                int line6 = 0;
                int line2 = 0;
                if (JRMCoreH.align > 33) {
                    if (JRMCoreH.Master == 1) {
                        String n7 = JRMCoreH.trl((String)"dbc.talkgui.learntechs");
                        nw2 = this.fontRendererObj.getStringWidth(n7) + 8;
                        this.buttonList.add(new DBCGuiButtons01((this.wish + 10100) * 10 + 1, posX + 115 - nw2, posY + 15 + line2 * 21, nw2, 20, n7));
                        ++line2;
                    }
                    String n8 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw2 = this.fontRendererObj.getStringWidth(n8) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 10100, posX + 115 - nw2, posY + 15 + line2 * 21, nw2, 20, n8));
                    ++line2;
                }
                String n9 = JRMCoreH.trl((String)"dbc.talkgui.difftonormal");
                nw2 = this.fontRendererObj.getStringWidth(n9) + 8;
                this.buttonList.add(new DBCGuiButtons01(103, posX + 115 - nw2, posY + 15 + line2 * 21, nw2, 20, n9));
                ++line2;
                if (JRMCoreH.align > 33) {
                    n9 = JRMCoreH.trl((String)"dbc.talkgui.giveweights");
                    nw2 = this.fontRendererObj.getStringWidth(n9) + 8;
                    this.buttonList.add(new DBCGuiButtons01(110, posX - 115 - 0, posY + 15 + line6 * 21, nw2, 20, n9));
                    ++line6;
                }
                if (JRMCoreH.StusEfctsMe((int)12)) {
                    n9 = JRMCoreH.trl((String)"dbc", (String)"majinLoose");
                    nw2 = this.fontRendererObj.getStringWidth(n9) + 8;
                    this.buttonList.add(new DBCGuiButtons01(50, posX + 115 - nw2, posY + 15 + line2 * 21, nw2, 20, n9));
                    ++line2;
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 112) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                gf = DBCConfig.Godform && JRMCoreHDBC.godKiAble();
                String n10 = JRMCoreH.trl((String)"dbc", (String)"PURitual");
                int nw12 = this.fontRendererObj.getStringWidth(n10) + 8;
                DBCGuiButtons01 btn = new DBCGuiButtons01(JRMCoreH.SklLvl((int)10, (byte)1) < 1 ? 1010 : -1, guiLeft + 5, guiTop + 25 + i3 * 21, 83, 20, n10);
                btn.enabled = JRMCoreH.align == 100 && JRMCoreH.SklLvl((int)10) == 0 && JRMCoreH.getDBCSkillTPCost((int)10, (int)0) != -1 && JRMCoreH.getDBCSkillTPCost((int)10, (int)0) <= JRMCoreH.curTP;
                this.buttonList.add(btn);
                this.mc.fontRenderer.drawString(JRMCoreH.align < 100 ? JRMCoreH.trl((String)"jrmc", (String)"NeedToBeGood", (Object[])new Object[]{100}) : (JRMCoreH.SklLvl((int)10) < 1 ? (JRMCoreH.getDBCSkillTPCost((int)10, (int)0) == -1 ? JRMCoreH.trl((String)"jrmc", (String)"UpgradeLocked") : JRMCoreH.trl((String)"dbc.talkgui.cost") + ": " + JRMCoreH.getDBCSkillTPCost((int)10, (int)0) + " " + JRMCoreH.trl((String)"dbc.talkgui.mind") + ": " + JRMCoreH.skillMindRequirement((String)JRMCoreH.DBCSkillsIDs[i3], (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost)) : JRMCoreH.trl((String)"dbc.talkgui.owned")), guiLeft + 5 + 120, guiTop + 25 + 7 + i3 * 21, 0);
                this.sklLrn(8, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(3, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(13, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                ++i3;
            } else if (this.wish == 1121) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                String[][] PMA = JRMCoreH.pmdbc;
                var8.drawString(JRMCoreH.numSep((long)JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop + 5, 0);
                i2 = 0;
                nms = PMA.length;
                for (i = 0; i < nms; i = (int)((byte)(i + 1))) {
                    owner = Integer.parseInt(PMA[i][2]);
                    if (owner != 1 && owner != 6) continue;
                    if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                        String fn = JRMCoreH.trl((String)"dbc", (String)PMA[i][0]);
                        fnw = this.fontRenderer.getStringWidth(fn);
                        var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, 0);
                        String on = JRMCoreH.techOwnd((int)i, (byte)1) ? " Owned" : "";
                        onw = this.fontRenderer.getStringWidth(on);
                        var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                        if (!JRMCoreH.techOwnd((int)i, (byte)1)) {
                            int costTp;
                            int cost = costTp = (int)((float)JRMCoreH.techDBCtpc((String[])PMA[i]) * 0.9f);
                            String n11 = " " + cost + " tp";
                            int nw13 = this.fontRenderer.getStringWidth(fn);
                            if (JRMCoreH.curTP >= cost) {
                                this.buttonList.add(new JRMCoreGuiButtons01(!JRMCoreH.techOwnd((int)i, (byte)1) ? 4200 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, nw13, n11, JRMCoreH.techNCCol[1]));
                            } else {
                                var8.drawString(n11, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                            }
                        }
                    }
                    ++i2;
                }
            } else if (this.wish == 221) {
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                Iterator iterator = this.mc.fontRenderer.listFormattedStringToWidth(JRMCoreH.trl((String)"dbc", (String)"KaioDiffRed"), 245).iterator();
                i2 = 0;
                while (iterator.hasNext()) {
                    String s1 = (String)iterator.next();
                    var8.drawString("\u00a70" + s1, guiLeft + 5, guiTop + 5 + ++i2 * 10, 0);
                }
                this.buttonList.add(new DBCGuiButtons01(104, posX - 35, posY + 55, 80, 20, JRMCoreH.trl((String)"dbc.talkgui.no")));
                this.buttonList.add(new DBCGuiButtons01(105, posX - 120, posY + 55, 80, 20, JRMCoreH.trl((String)"dbc.talkgui.confirm")));
            } else if (this.wish == 13) {
                this.master = 4;
                if (JRMCoreH.align > 65) {
                    if (JRMCoreH.Senzu == 0) {
                        this.buttonList.add(new DBCGuiButtons01(199, posX - 35, posY + 35, 100, 20, StatCollector.translateToLocal((String)"dbc.talkgui.karin.senzu")));
                    }
                    this.buttonList.add(new DBCGuiButtons01(198, posX - 35, posY + 55, 100, 20, StatCollector.translateToLocal((String)"dbc.talkgui.skills")));
                    if (!this.mc.thePlayer.inventory.hasItem(ItemsDBC.KintounItem)) {
                        this.buttonList.add(new DBCGuiButtons01(202, posX - 35, posY + 15, 100, 20, StatCollector.translateToLocal((String)"dbc.talkgui.kintoun")));
                    }
                } else if (!this.mc.thePlayer.inventory.hasItem(ItemsDBC.KintounBlackItem)) {
                    this.buttonList.add(new DBCGuiButtons01(202, posX - 35, posY + 15, 140, 20, StatCollector.translateToLocal((String)"dbc.talkgui.kintounblack")));
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 113) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                this.sklLrn(1, guiLeft + 5, guiTop + 25 + i3 * 21);
                this.sklLrn(3, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                ++i3;
            } else if (this.wish == 15) {
                this.master = 2;
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)JRMCoreH.Masters[2]);
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a78", (int)0, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.roshi.goodneut");
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                line = 0;
                if (JRMCoreH.align > 32) {
                    if (JRMCoreH.Master == 1) {
                        String n12 = JRMCoreH.trl((String)"dbc.talkgui.learntechs");
                        nw3 = this.fontRendererObj.getStringWidth(n12) + 8;
                        this.buttonList.add(new DBCGuiButtons01((this.wish + 10100) * 10 + 1, posX + 115 - nw3, posY + 15 + line * 21, nw3, 20, n12));
                        ++line;
                    }
                    String n13 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw3 = this.fontRendererObj.getStringWidth(n13) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 10100, posX + 115 - nw3, posY + 15 + line * 21, nw3, 20, n13));
                    ++line;
                }
                line = 0;
                String n14 = JRMCoreH.trl((String)"dbc.talkgui.giveweights");
                nw3 = this.fontRendererObj.getStringWidth(n14) + 8;
                this.buttonList.add(new DBCGuiButtons01(110, posX - 115 - 0, posY + 15 + line * 21, nw3, 20, n14));
                ++line;
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 115) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                this.sklLrn(1, guiLeft + 5, guiTop + 25 + i3 * 21);
                this.sklLrn(2, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(3, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                ++i3;
            } else if (this.wish == 1151) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                String[][] PMA = JRMCoreH.pmdbc;
                var8.drawString(JRMCoreH.numSep((long)JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop + 5, 0);
                i2 = 0;
                nms = PMA.length;
                for (i = 0; i < nms; i = (int)((byte)(i + 1))) {
                    if (Integer.parseInt(PMA[i][2]) != 2 && Integer.parseInt(PMA[i][2]) != 1) continue;
                    if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                        String fn = JRMCoreH.trl((String)"dbc", (String)PMA[i][0]);
                        int fnw2 = this.fontRenderer.getStringWidth(fn);
                        var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, 0);
                        String on = JRMCoreH.techOwnd((int)i, (byte)1) ? " Owned" : "";
                        int onw2 = this.fontRenderer.getStringWidth(on);
                        var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw2, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                        if (!JRMCoreH.techOwnd((int)i, (byte)1)) {
                            int costTp;
                            int cost = costTp = (int)((float)JRMCoreH.techDBCtpc((String[])PMA[i]) * 0.9f);
                            String n15 = " " + cost + " tp";
                            int nw14 = this.fontRenderer.getStringWidth(fn);
                            if (JRMCoreH.curTP >= cost) {
                                this.buttonList.add(new JRMCoreGuiButtons01(!JRMCoreH.techOwnd((int)i, (byte)1) ? 4200 + i : -1, guiLeft + xSize / 2 - 122 + fnw2 + onw2, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, nw14, n15, JRMCoreH.techNCCol[1]));
                            } else {
                                var8.drawString(n15, guiLeft + xSize / 2 - 122 + fnw2 + onw2, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                            }
                        }
                    }
                    ++i2;
                }
            } else if (this.wish == 16) {
                this.master = 12;
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)JRMCoreH.Masters[12]);
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a78", (int)0, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                if (JRMCoreH.align <= 32) {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.cell.evil");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                    if (JRMCoreH.Master == 1) {
                        String n16 = JRMCoreH.trl((String)"dbc.talkgui.learntechs");
                        nw = this.fontRendererObj.getStringWidth(n16) + 8;
                        this.buttonList.add(new DBCGuiButtons01((this.wish + 10100) * 10 + 1, posX + 15 - nw / 2, posY + 35, nw, 20, n16));
                    }
                    String n17 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw = this.fontRendererObj.getStringWidth(n17) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 10100, posX + 15 - nw / 2, posY + 55, nw, 20, n17));
                } else {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.cell.goodneut");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 116) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                this.sklLrn(5, guiLeft + 5, guiTop + 25 + i3 * 21);
                this.sklLrn(4, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(6, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(11, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(12, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(17, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                ++i3;
            } else if (this.wish == 1161) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                String[][] PMA = JRMCoreH.pmdbc;
                var8.drawString(JRMCoreH.numSep((long)JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop + 5, 0);
                i2 = 0;
                nms = PMA.length;
                for (i = 0; i < nms; i = (int)((byte)(i + 1))) {
                    owner = Integer.parseInt(PMA[i][2]);
                    if (owner != 2 && owner != 1 && owner != 7 && owner != 8 && owner != 9 && owner != 11) continue;
                    if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                        String fn = JRMCoreH.trl((String)"dbc", (String)PMA[i][0]);
                        fnw = this.fontRenderer.getStringWidth(fn);
                        var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, 0);
                        String on = JRMCoreH.techOwnd((int)i, (byte)1) ? " Owned" : "";
                        onw = this.fontRenderer.getStringWidth(on);
                        var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                        if (!JRMCoreH.techOwnd((int)i, (byte)1)) {
                            int costTp;
                            int cost = costTp = (int)((float)JRMCoreH.techDBCtpc((String[])PMA[i]) * 0.9f);
                            String n18 = " " + cost + " tp";
                            int nw15 = this.fontRenderer.getStringWidth(fn);
                            if (JRMCoreH.curTP >= cost) {
                                this.buttonList.add(new JRMCoreGuiButtons01(!JRMCoreH.techOwnd((int)i, (byte)1) ? 4200 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, nw15, n18, JRMCoreH.techNCCol[1]));
                            } else {
                                var8.drawString(n18, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                            }
                        }
                    }
                    ++i2;
                }
            } else if (this.wish == 17) {
                this.master = 13;
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)JRMCoreH.Masters[13]);
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a78", (int)0, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                if (JRMCoreH.align > 32) {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.songoku.goodneut");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                    if (JRMCoreH.Master == 1) {
                        String n19 = JRMCoreH.trl((String)"dbc.talkgui.learntechs");
                        nw = this.fontRendererObj.getStringWidth(n19) + 8;
                        this.buttonList.add(new DBCGuiButtons01((this.wish + 10100) * 10 + 1, posX + 15 - nw / 2, posY + 35, nw, 20, n19));
                    }
                    String n20 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw = this.fontRendererObj.getStringWidth(n20) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 10100, posX + 15 - nw / 2, posY + 55, nw, 20, n20));
                } else {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.songoku.evil");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 117) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int ml2 = JRMCoreH.skillSlot_AvailableMindLeft();
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml2), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i4 = 0;
                this.sklLrn(5, guiLeft + 5, guiTop + 25 + i4 * 21);
                this.sklLrn(6, guiLeft + 5, guiTop + 25 + ++i4 * 21);
                this.sklLrn(0, guiLeft + 5, guiTop + 25 + ++i4 * 21);
                this.sklLrn(14, guiLeft + 5, guiTop + 25 + ++i4 * 21);
                this.sklLrn(12, guiLeft + 5, guiTop + 25 + ++i4 * 21);
                this.sklLrn(17, guiLeft + 5, guiTop + 25 + ++i4 * 21);
                ++i4;
            } else if (this.wish == 1171) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                String[][] PMA = JRMCoreH.pmdbc;
                var8.drawString(JRMCoreH.numSep((long)JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop + 5, 0);
                i2 = 0;
                nms = PMA.length;
                for (i = 0; i < nms; i = (int)((byte)(i + 1))) {
                    owner = Integer.parseInt(PMA[i][2]);
                    if (owner != 2 && owner != 1 && owner != 6 && owner != 7) continue;
                    if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                        String fn = JRMCoreH.trl((String)"dbc", (String)PMA[i][0]);
                        fnw = this.fontRenderer.getStringWidth(fn);
                        var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, 0);
                        String on = JRMCoreH.techOwnd((int)i, (byte)1) ? " Owned" : "";
                        onw = this.fontRenderer.getStringWidth(on);
                        var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                        if (!JRMCoreH.techOwnd((int)i, (byte)1)) {
                            int costTp;
                            int cost = costTp = (int)((float)JRMCoreH.techDBCtpc((String[])PMA[i]) * 0.9f);
                            String n21 = " " + cost + " tp";
                            int nw16 = this.fontRenderer.getStringWidth(fn);
                            if (JRMCoreH.curTP >= cost) {
                                this.buttonList.add(new JRMCoreGuiButtons01(!JRMCoreH.techOwnd((int)i, (byte)1) ? 4200 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, nw16, n21, JRMCoreH.techNCCol[1]));
                            } else {
                                var8.drawString(n21, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                            }
                        }
                    }
                    ++i2;
                }
            } else if (this.wish == 18) {
                this.master = 11;
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)JRMCoreH.Masters[11]);
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a78", (int)0, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                if (JRMCoreH.align <= 32) {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.freeza.evil");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                    if (JRMCoreH.Master == 1) {
                        String n22 = JRMCoreH.trl((String)"dbc.talkgui.learntechs");
                        nw = this.fontRendererObj.getStringWidth(n22) + 8;
                        this.buttonList.add(new DBCGuiButtons01((this.wish + 10100) * 10 + 1, posX + 15 - nw / 2, posY + 35, nw, 20, n22));
                    }
                    String n23 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw = this.fontRendererObj.getStringWidth(n23) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 10100, posX + 15 - nw / 2, posY + 55, nw, 20, n23));
                } else {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.freeza.else");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 118) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                this.sklLrn(1, guiLeft + 5, guiTop + 25 + i3 * 21);
                this.sklLrn(2, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(3, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(5, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(4, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                ++i3;
            } else if (this.wish == 1181) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                String[][] PMA = JRMCoreH.pmdbc;
                var8.drawString(JRMCoreH.numSep((long)JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop + 5, 0);
                i2 = 0;
                nms = PMA.length;
                for (i = 0; i < nms; i = (int)((byte)(i + 1))) {
                    owner = Integer.parseInt(PMA[i][2]);
                    if (owner != 1 && owner != 11) continue;
                    if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                        String fn = JRMCoreH.trl((String)"dbc", (String)PMA[i][0]);
                        fnw = this.fontRenderer.getStringWidth(fn);
                        var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, 0);
                        String on = JRMCoreH.techOwnd((int)i, (byte)1) ? " Owned" : "";
                        onw = this.fontRenderer.getStringWidth(on);
                        var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                        if (!JRMCoreH.techOwnd((int)i, (byte)1)) {
                            int costTp;
                            int cost = costTp = (int)((float)JRMCoreH.techDBCtpc((String[])PMA[i]) * 0.9f);
                            String n24 = " " + cost + " tp";
                            int nw17 = this.fontRenderer.getStringWidth(fn);
                            if (JRMCoreH.curTP >= cost) {
                                this.buttonList.add(new JRMCoreGuiButtons01(!JRMCoreH.techOwnd((int)i, (byte)1) ? 4200 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, nw17, n24, JRMCoreH.techNCCol[1]));
                            } else {
                                var8.drawString(n24, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                            }
                        }
                    }
                    ++i2;
                }
            } else if (this.wish == 19) {
                this.master = 15;
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)JRMCoreH.Masters[15]);
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a78", (int)0, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                int ln = 0;
                if (JRMCoreH.align <= 65) {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.babidi.evilneut");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                    if (JRMCoreH.Master == 1) {
                        String n25 = JRMCoreH.trl((String)"dbc.talkgui.learntechs");
                        nw3 = this.fontRendererObj.getStringWidth(n25) + 8;
                        this.buttonList.add(new DBCGuiButtons01((this.wish + 10100) * 10 + 1, posX + 15 - nw3 / 2, posY + 15 + ln * 20, nw3, 20, n25));
                        ++ln;
                    }
                    String n26 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw3 = this.fontRendererObj.getStringWidth(n26) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 10100, posX + 15 - nw3 / 2, posY + 15 + ln * 20, nw3, 20, n26));
                    ++ln;
                    if (!JRMCoreH.StusEfctsMe((int)12)) {
                        n26 = JRMCoreH.trl((String)"dbc", (String)"majinGet");
                        nw3 = this.fontRendererObj.getStringWidth(n26) + 8;
                        this.buttonList.add(new DBCGuiButtons01(51, posX + 15 - nw3 / 2, posY + 15 + ln * 20, nw3, 20, n26));
                        ++ln;
                    }
                } else if (JRMCoreH.align == 100) {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.babidi.fullgood");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                } else {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.babidi.good");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                    if (!JRMCoreH.StusEfctsMe((int)12)) {
                        String n27 = JRMCoreH.trl((String)"dbc", (String)"majinGet");
                        nw3 = this.fontRendererObj.getStringWidth(n27) + 8;
                        this.buttonList.add(new DBCGuiButtons01(51, posX + 15 - nw3 / 2, posY + 15 + ln * 20, nw3, 20, n27));
                        ++ln;
                    }
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 119) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                this.sklLrn(1, guiLeft + 5, guiTop + 25 + i3 * 21);
                this.sklLrn(2, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(3, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(5, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(4, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                ++i3;
            } else if (this.wish == 1191) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                String[][] PMA = JRMCoreH.pmdbc;
                var8.drawString(JRMCoreH.numSep((long)JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop + 5, 0);
                i2 = 0;
                nms = PMA.length;
                for (i = 0; i < nms; i = (int)((byte)(i + 1))) {
                    owner = Integer.parseInt(PMA[i][2]);
                    if (owner != 1) continue;
                    if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                        String fn = JRMCoreH.trl((String)"dbc", (String)PMA[i][0]);
                        fnw = this.fontRenderer.getStringWidth(fn);
                        var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, 0);
                        String on = JRMCoreH.techOwnd((int)i, (byte)1) ? " Owned" : "";
                        onw = this.fontRenderer.getStringWidth(on);
                        var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                        if (!JRMCoreH.techOwnd((int)i, (byte)1)) {
                            int costTp;
                            int cost = costTp = (int)((float)JRMCoreH.techDBCtpc((String[])PMA[i]) * 0.9f);
                            String n28 = " " + cost + " tp";
                            int nw18 = this.fontRenderer.getStringWidth(fn);
                            if (JRMCoreH.curTP >= cost) {
                                this.buttonList.add(new JRMCoreGuiButtons01(!JRMCoreH.techOwnd((int)i, (byte)1) ? 4200 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, nw18, n28, JRMCoreH.techNCCol[1]));
                            } else {
                                var8.drawString(n28, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                            }
                        }
                    }
                    ++i2;
                }
            } else if (this.wish == 20) {
                this.master = 8;
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)JRMCoreH.Masters[this.master]);
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a78", (int)0, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                line = 0;
                if (JRMCoreH.align > 32) {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.piccolo.goodneut");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                    if (JRMCoreH.Master == 1) {
                        String n29 = JRMCoreH.trl((String)"dbc.talkgui.learntechs");
                        nw3 = this.fontRendererObj.getStringWidth(n29) + 8;
                        this.buttonList.add(new DBCGuiButtons01((this.wish + 10100) * 10 + 1, posX + 115 - nw3, posY + 15 + line * 21, nw3, 20, n29));
                        ++line;
                    }
                    String n30 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw3 = this.fontRendererObj.getStringWidth(n30) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 10100, posX + 115 - nw3, posY + 15 + line * 21, nw3, 20, n30));
                    ++line;
                    line = 0;
                    n30 = JRMCoreH.trl((String)"dbc.talkgui.giveweights");
                    nw3 = this.fontRendererObj.getStringWidth(n30) + 8;
                    this.buttonList.add(new DBCGuiButtons01(110, posX - 115 - 0, posY + 15 + line * 21, nw3, 20, n30));
                    ++line;
                } else {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.piccolo.evil");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 120) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                this.sklLrn(3, guiLeft + 5, guiTop + 25 + i3 * 21);
                this.sklLrn(5, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(7, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(6, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(11, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(12, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                ++i3;
            } else if (this.wish == 1201) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                String[][] PMA = JRMCoreH.pmdbc;
                var8.drawString(JRMCoreH.numSep((long)JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop + 5, 0);
                i2 = 0;
                nms = PMA.length;
                for (i = 0; i < nms; i = (int)((byte)(i + 1))) {
                    owner = Integer.parseInt(PMA[i][2]);
                    if (owner != 1 && owner != 7 && owner != 8) continue;
                    if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                        String fn = JRMCoreH.trl((String)"dbc", (String)PMA[i][0]);
                        fnw = this.fontRenderer.getStringWidth(fn);
                        var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, 0);
                        String on = JRMCoreH.techOwnd((int)i, (byte)1) ? " Owned" : "";
                        onw = this.fontRenderer.getStringWidth(on);
                        var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                        if (!JRMCoreH.techOwnd((int)i, (byte)1)) {
                            int costTp;
                            int cost = costTp = (int)((float)JRMCoreH.techDBCtpc((String[])PMA[i]) * 0.9f);
                            String n31 = " " + cost + " tp";
                            int nw19 = this.fontRenderer.getStringWidth(fn);
                            if (JRMCoreH.curTP >= cost) {
                                this.buttonList.add(new JRMCoreGuiButtons01(!JRMCoreH.techOwnd((int)i, (byte)1) ? 4200 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, nw19, n31, JRMCoreH.techNCCol[1]));
                            } else {
                                var8.drawString(n31, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                            }
                        }
                    }
                    ++i2;
                }
            } else if (this.wish == 21) {
                this.master = 9;
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)JRMCoreH.Masters[this.master]);
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a78", (int)0, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                if (JRMCoreH.align > 32) {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.vegeta.goodneut");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                    if (JRMCoreH.Master == 1) {
                        String n32 = JRMCoreH.trl((String)"dbc.talkgui.learntechs");
                        nw = this.fontRendererObj.getStringWidth(n32) + 8;
                        this.buttonList.add(new DBCGuiButtons01((this.wish + 10100) * 10 + 1, posX + 15 - nw / 2, posY + 35, nw, 20, n32));
                    }
                    String n33 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw = this.fontRendererObj.getStringWidth(n33) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 10100, posX + 15 - nw / 2, posY + 55, nw, 20, n33));
                } else {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.vegeta.evil");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 121) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int m = JRMCoreH.skillSlot_SpentMindRequirement((String[])JRMCoreH.PlyrSkills, (String[])JRMCoreH.DBCSkillsIDs, (int[][])JRMCoreH.DBCSkillMindCost) + JRMCoreH.skillSlot_SpentMindRequirement_X((String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.Race, (int[][])JRMCoreH.DBCRacialSkillMindCost);
                ml = JRMCoreH.statMindC() - m;
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i3 = 0;
                this.sklLrn(2, guiLeft + 5, guiTop + 25 + i3 * 21);
                this.sklLrn(5, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                this.sklLrn(4, guiLeft + 5, guiTop + 25 + ++i3 * 21);
                ++i3;
            } else if (this.wish == 1211) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                String[][] PMA = JRMCoreH.pmdbc;
                var8.drawString(JRMCoreH.numSep((long)JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop + 5, 0);
                i2 = 0;
                nms = PMA.length;
                for (i = 0; i < nms; i = (int)((byte)(i + 1))) {
                    owner = Integer.parseInt(PMA[i][2]);
                    if (owner != 1 && owner != 9) continue;
                    if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                        String fn = JRMCoreH.trl((String)"dbc", (String)PMA[i][0]);
                        fnw = this.fontRenderer.getStringWidth(fn);
                        var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, 0);
                        String on = JRMCoreH.techOwnd((int)i, (byte)1) ? " Owned" : "";
                        onw = this.fontRenderer.getStringWidth(on);
                        var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                        if (!JRMCoreH.techOwnd((int)i, (byte)1)) {
                            int costTp;
                            int cost = costTp = (int)((float)JRMCoreH.techDBCtpc((String[])PMA[i]) * 0.9f);
                            String n34 = " " + cost + " tp";
                            int nw20 = this.fontRenderer.getStringWidth(fn);
                            if (JRMCoreH.curTP >= cost) {
                                this.buttonList.add(new JRMCoreGuiButtons01(!JRMCoreH.techOwnd((int)i, (byte)1) ? 4200 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, nw20, n34, JRMCoreH.techNCCol[1]));
                            } else {
                                var8.drawString(n34, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                            }
                        }
                    }
                    ++i2;
                }
            } else if (this.wish == 22) {
                this.master = 14;
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)JRMCoreH.Masters[14]);
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a78", (int)0, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                if (JRMCoreH.align > 32) {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.songohan.goodneut");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                    if (JRMCoreH.Master == 1) {
                        String n35 = JRMCoreH.trl((String)"dbc.talkgui.learntechs");
                        nw = this.fontRendererObj.getStringWidth(n35) + 8;
                        this.buttonList.add(new DBCGuiButtons01((this.wish + 10100) * 10 + 1, posX + 15 - nw / 2, posY + 35, nw, 20, n35));
                    }
                    String n36 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw = this.fontRendererObj.getStringWidth(n36) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 10100, posX + 15 - nw / 2, posY + 55, nw, 20, n36));
                } else {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.songohan.evil");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 122) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int ml3 = JRMCoreH.skillSlot_AvailableMindLeft();
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml3), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i4 = 0;
                this.sklLrn(3, guiLeft + 5, guiTop + 25 + i4 * 21);
                this.sklLrn(6, guiLeft + 5, guiTop + 25 + ++i4 * 21);
                this.sklLrn(11, guiLeft + 5, guiTop + 25 + ++i4 * 21);
                this.sklLrn(15, guiLeft + 5, guiTop + 25 + ++i4 * 21);
                ++i4;
            } else if (this.wish == 1221) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                String[][] PMA = JRMCoreH.pmdbc;
                var8.drawString(JRMCoreH.numSep((long)JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop + 5, 0);
                i2 = 0;
                nms = PMA.length;
                for (i = 0; i < nms; i = (int)((byte)(i + 1))) {
                    owner = Integer.parseInt(PMA[i][2]);
                    if (owner != 2 && owner != 1 && owner != 8 && owner != 14) continue;
                    if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                        String fn = JRMCoreH.trl((String)"dbc", (String)PMA[i][0]);
                        fnw = this.fontRenderer.getStringWidth(fn);
                        var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, 0);
                        String on = JRMCoreH.techOwnd((int)i, (byte)1) ? " Owned" : "";
                        onw = this.fontRenderer.getStringWidth(on);
                        var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                        if (!JRMCoreH.techOwnd((int)i, (byte)1)) {
                            int costTp;
                            int cost = costTp = (int)((float)JRMCoreH.techDBCtpc((String[])PMA[i]) * 0.9f);
                            String n37 = " " + cost + " tp";
                            int nw21 = this.fontRenderer.getStringWidth(fn);
                            if (JRMCoreH.curTP >= cost) {
                                this.buttonList.add(new JRMCoreGuiButtons01(!JRMCoreH.techOwnd((int)i, (byte)1) ? 4200 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, nw21, n37, JRMCoreH.techNCCol[1]));
                            } else {
                                var8.drawString(n37, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                            }
                        }
                    }
                    ++i2;
                }
            } else if (this.wish == 23) {
                this.master = 10;
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)JRMCoreH.Masters[10]);
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a78", (int)0, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                if (JRMCoreH.align > 32) {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.songohan.goodneut");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                    if (JRMCoreH.Master == 1) {
                        String n38 = JRMCoreH.trl((String)"dbc.talkgui.learntechs");
                        nw = this.fontRendererObj.getStringWidth(n38) + 8;
                        this.buttonList.add(new DBCGuiButtons01((this.wish + 10100) * 10 + 1, posX + 15 - nw / 2, posY + 35, nw, 20, n38));
                    }
                    String n39 = JRMCoreH.trl((String)"dbc.talkgui.skills");
                    nw = this.fontRendererObj.getStringWidth(n39) + 8;
                    this.buttonList.add(new DBCGuiButtons01(this.wish + 10100, posX + 15 - nw / 2, posY + 55, nw, 20, n39));
                } else {
                    this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.songohan.evil");
                    nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
                }
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
            } else if (this.wish == 123) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                int ml4 = JRMCoreH.skillSlot_AvailableMindLeft();
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AvailableMind") + ": " + JRMCoreH.numSep((long)ml4), guiLeft + 5, guiTop + 15, 0);
                var8.drawString("TP: " + JRMCoreH.numSep((long)JRMCoreH.curTP), guiLeft + 5, guiTop + 5, 0);
                i4 = 0;
                this.sklLrn(3, guiLeft + 5, guiTop + 25 + i4 * 21);
                this.sklLrn(14, guiLeft + 5, guiTop + 25 + ++i4 * 21);
                this.sklLrn(12, guiLeft + 5, guiTop + 25 + ++i4 * 21);
                this.sklLrn(15, guiLeft + 5, guiTop + 25 + ++i4 * 21);
                ++i4;
            } else if (this.wish == 1231) {
                this.buttonList.add(new DBCGuiButtons01(-1, posX - 150, posY + 65, 20, 20, "X"));
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                tx = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                posX = this.width / 2;
                posY = this.height / 2;
                String[][] PMA = JRMCoreH.pmdbc;
                var8.drawString(JRMCoreH.numSep((long)JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop + 5, 0);
                i2 = 0;
                nms = PMA.length;
                for (i = 0; i < nms; i = (int)((byte)(i + 1))) {
                    owner = Integer.parseInt(PMA[i][2]);
                    if (owner != 2 && owner != 1 && owner != 14 && owner != 10) continue;
                    if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                        String fn = JRMCoreH.trl((String)"dbc", (String)PMA[i][0]);
                        fnw = this.fontRenderer.getStringWidth(fn);
                        var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, 0);
                        String on = JRMCoreH.techOwnd((int)i, (byte)1) ? " Owned" : "";
                        onw = this.fontRenderer.getStringWidth(on);
                        var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                        if (!JRMCoreH.techOwnd((int)i, (byte)1)) {
                            int costTp;
                            int cost = costTp = (int)((float)JRMCoreH.techDBCtpc((String[])PMA[i]) * 0.9f);
                            String n40 = " " + cost + " tp";
                            int nw22 = this.fontRenderer.getStringWidth(fn);
                            if (JRMCoreH.curTP >= cost) {
                                this.buttonList.add(new JRMCoreGuiButtons01(!JRMCoreH.techOwnd((int)i, (byte)1) ? 4200 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, nw22, n40, JRMCoreH.techNCCol[1]));
                            } else {
                                var8.drawString(n40, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i2 * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                            }
                        }
                    }
                    ++i2;
                }
            }
            if (this.wish == 9000) {
                String im = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                ResourceLocation tx2 = new ResourceLocation(im);
                this.mc.renderEngine.bindTexture(tx2);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                this.current(StatCollector.translateToLocal((String)"dbc.talkgui.line1000"), 10, 10, var8, guiLeft, guiTop);
                String s = StatCollector.translateToLocal((String)"dbc.talkgui.line1001");
                String s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line1002");
                String s3 = StatCollector.translateToLocal((String)"dbc.talkgui.line1003");
                if (JRMCoreH.align > 66) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.line1004");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line1005");
                    s3 = StatCollector.translateToLocal((String)"dbc.talkgui.line1006");
                }
                if (JRMCoreH.align < 33) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.line1007");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line1008");
                    s3 = StatCollector.translateToLocal((String)"dbc.talkgui.line1009");
                }
                this.current(s, 15, 20, var8, guiLeft, guiTop);
                this.current(s2, 15, 30, var8, guiLeft, guiTop);
                this.current(s3, 15, 40, var8, guiLeft, guiTop);
            } else if (this.wish == 9001) {
                String im = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                ResourceLocation tx3 = new ResourceLocation(im);
                this.mc.renderEngine.bindTexture(tx3);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                this.current(StatCollector.translateToLocal((String)"dbc.talkgui.line1010"), 10, 10, var8, guiLeft, guiTop);
                String s = StatCollector.translateToLocal((String)"dbc.talkgui.line1011");
                String s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line1012");
                if (JRMCoreH.align > 66) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.line1013");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line1014");
                }
                if (JRMCoreH.align < 33) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.line1015");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line1016");
                }
                this.current(s, 15, 20, var8, guiLeft, guiTop);
                this.current(s2, 15, 30, var8, guiLeft, guiTop);
            } else if (this.wish == 9002) {
                String im = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                ResourceLocation tx4 = new ResourceLocation(im);
                this.mc.renderEngine.bindTexture(tx4);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                this.current(StatCollector.translateToLocal((String)"dbc.talkgui.line1017"), 10, 10, var8, guiLeft, guiTop);
                String s = StatCollector.translateToLocal((String)"dbc.talkgui.line1018");
                String s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line1019");
                if (JRMCoreH.align > 66) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.line1020");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line1021");
                }
                if (JRMCoreH.align < 33) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.line1022");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line1023");
                }
                this.current(s, 15, 20, var8, guiLeft, guiTop);
                this.current(s2, 15, 30, var8, guiLeft, guiTop);
            } else if (this.wish == 11) {
                String im = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                ResourceLocation tx5 = new ResourceLocation(im);
                this.mc.renderEngine.bindTexture(tx5);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                this.current(StatCollector.translateToLocal((String)"dbc.talkgui.line0000"), 10, 10, var8, guiLeft, guiTop);
                String s = StatCollector.translateToLocal((String)"dbc.talkgui.line0001");
                String s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line0002");
                String s3 = StatCollector.translateToLocal((String)"dbc.talkgui.line0003");
                if (JRMCoreH.align > 66) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.line0004");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line0005");
                    s3 = StatCollector.translateToLocal((String)"dbc.talkgui.line0006");
                }
                if (JRMCoreH.align < 33) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.line0007");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line0008");
                    s3 = StatCollector.translateToLocal((String)"dbc.talkgui.line0009");
                }
                if (JRMCoreH.SagaProg == 1700) {
                    s = StatCollector.translateToLocal((String)"dbc.MainSaga.17.2");
                    s2 = StatCollector.translateToLocal((String)"dbc.MainSaga.17.3");
                    s3 = StatCollector.translateToLocal((String)"dbc.MainSaga.17.4");
                }
                if (JRMCoreH.SagaSideProg == 10100) {
                    s = StatCollector.translateToLocal((String)"dbc.sidesagas.101.talk");
                    int n41 = JRMCoreH.txt((String)s, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 15), (int)(guiTop + 20), (int)0);
                } else {
                    this.current(s, 15, 20, var8, guiLeft, guiTop);
                    this.current(s2, 15, 30, var8, guiLeft, guiTop);
                    this.current(s3, 15, 40, var8, guiLeft, guiTop);
                }
            } else if (this.wish == 1101) {
                String im = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                ResourceLocation tx6 = new ResourceLocation(im);
                this.mc.renderEngine.bindTexture(tx6);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.kami.startanew");
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
            } else if (this.wish == 1102) {
                String im = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                ResourceLocation tx7 = new ResourceLocation(im);
                this.mc.renderEngine.bindTexture(tx7);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.kami.confirmtailcut");
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
            } else if (this.wish == 1104) {
                String im = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                ResourceLocation tx8 = new ResourceLocation(im);
                this.mc.renderEngine.bindTexture(tx8);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                int nr = 0;
                this.Process = StatCollector.translateToLocal((String)"dbc.talkgui.kami.tailregrow");
                nr += JRMCoreH.txt((String)this.Process, (String)"\u00a70", (int)5, (boolean)true, (int)(guiLeft + 6), (int)(guiTop + 5 + nr * 10), (int)0);
            } else if (this.wish == 12) {
                this.current(StatCollector.translateToLocal((String)"dbc.talkgui.line0010"), 10, 10, var8, guiLeft, guiTop);
                String s = StatCollector.translateToLocal((String)"dbc.talkgui.line0011");
                String s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line0012");
                String s3 = StatCollector.translateToLocal((String)"dbc.talkgui.line0013");
                if (JRMCoreH.align > 66) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.line0014");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line0015");
                    s3 = StatCollector.translateToLocal((String)"dbc.talkgui.line0016");
                }
                if (JRMCoreH.align < 33) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.line0017");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.line0018");
                    s3 = StatCollector.translateToLocal((String)"dbc.talkgui.line0019");
                }
                this.current(s, 15, 20, var8, guiLeft, guiTop);
                this.current(s2, 15, 30, var8, guiLeft, guiTop);
                this.current(s3, 15, 40, var8, guiLeft, guiTop);
            } else if (this.wish == 13) {
                String wish = "jinryuudragonbc:saa.png";
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                ResourceLocation tx9 = new ResourceLocation(wish);
                this.mc.renderEngine.bindTexture(tx9);
                this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
                this.current(StatCollector.translateToLocal((String)"dbc.talkgui.karin.00"), 10, 10, var8, guiLeft, guiTop);
                String s = StatCollector.translateToLocal((String)"dbc.talkgui.karin.01");
                String s2 = StatCollector.translateToLocal((String)"dbc.talkgui.karin.02");
                String s3 = StatCollector.translateToLocal((String)"dbc.talkgui.karin.03");
                if (JRMCoreH.align < 66) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.karin.04");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.karin.05");
                    s3 = StatCollector.translateToLocal((String)"dbc.talkgui.karin.06");
                }
                if (JRMCoreH.align < 33) {
                    s = StatCollector.translateToLocal((String)"dbc.talkgui.karin.07");
                    s2 = StatCollector.translateToLocal((String)"dbc.talkgui.karin.08");
                    s3 = StatCollector.translateToLocal((String)"dbc.talkgui.karin.09");
                }
                if (JRMCoreH.Senzu == 1) {
                    this.current(StatCollector.translateToLocal((String)"dbc.talkgui.karin.nosenzu"), 25, 80, var8, guiLeft, guiTop);
                }
                this.current(s, 15, 20, var8, guiLeft, guiTop);
                this.current(s2, 15, 30, var8, guiLeft, guiTop);
                this.current(s3, 15, 40, var8, guiLeft, guiTop);
            }
        }
        super.drawScreen(x, y, f);
    }

    private void drawBg(String name) {
        this.drawBg(name, 256, 160);
    }

    private void drawBg(String name, int xSize, int ySize) {
        String wish = "jinryuudragonbc:" + name + ".png";
        int guiLeft = (this.width - xSize) / 2;
        int guiTop = (this.height - ySize) / 2;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation tx = new ResourceLocation(wish);
        this.mc.renderEngine.bindTexture(tx);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

    public void current(String var35, int posx, int posy, FontRenderer var8, int var6, int var7) {
        int wid = var8.getStringWidth(var35) / 2;
        int posX = var6 + posx;
        int posY = var7 + posy;
        var8.drawString(var35, posX, posY, 0);
    }

    public boolean doesGuiPauseGame() {
        return false;
    }

    public void SagasPrint() {
        this.initGui();
        Minecraft minecraft = this.mc;
        WorldClient world = minecraft.theWorld;
        EntityClientPlayerMP entityplayersp = minecraft.thePlayer;
        ScaledResolution scaledresolution = new ScaledResolution(minecraft, minecraft.displayWidth, minecraft.displayHeight);
        int width = scaledresolution.getScaledWidth() / 2;
        int height = scaledresolution.getScaledHeight() / 2;
        int widthplus = 8;
        minecraft.entityRenderer.setupOverlayRendering();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)32826);
        RenderHelper.enableStandardItemLighting();
        RenderHelper.disableStandardItemLighting();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.drawCenteredString(this.fontRenderer, this.Process, width + this.wid, height + this.hei, 16768306);
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
        ResourceLocation tx = new ResourceLocation(var4);
        this.mc.renderEngine.bindTexture(tx);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}

