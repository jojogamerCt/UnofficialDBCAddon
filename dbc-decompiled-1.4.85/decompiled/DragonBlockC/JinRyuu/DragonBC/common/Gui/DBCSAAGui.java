/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityClientPlayerMP
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiIngame
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.StatCollector
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.DragonBC.common.DBCClient;
import JinRyuu.DragonBC.common.DBCClientTickHandler;
import JinRyuu.DragonBC.common.Gui.DBCGuiButtons00;
import JinRyuu.DragonBC.common.Gui.DBCGuiButtons01;
import JinRyuu.DragonBC.common.Gui.DBCGuiButtons02;
import JinRyuu.DragonBC.common.Gui.DBCGuiButtons06;
import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreH;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

public class DBCSAAGui
extends GuiScreen {
    private DBCClientTickHandler tick;
    private GuiIngame Guiingame;
    public int saa = 0;
    public static int count = 0;
    public static int warn = 0;
    public static int startcount = 0;
    private String Process = "Something is Wrong";
    private int wid = 0;
    private int hei = 0;
    private String textureFile = "jinryuudragonbc:sagas.png";

    public void renderSuperProtect(int ki) {
        this.buttonList.clear();
        int posX = this.width / 2;
        int posY = this.height / 2;
        this.buttonList.add(new DBCGuiButtons02(100, posX - 0, posY - 0, 20, 20, "TEST"));
    }

    public DBCSAAGui(int w) {
        this.saa = w;
    }

    public void initGui() {
        this.buttonList.clear();
        int posX = this.width / 2;
        int posY = this.height / 2;
        this.buttonList.add(new DBCGuiButtons02(-1, posX + 130, posY - 70, 70, 20, StatCollector.translateToLocal((String)"dbc.saagui.abilities")));
        this.buttonList.add(new DBCGuiButtons02(-2, posX + 130, posY - 45, 70, 20, StatCollector.translateToLocal((String)"dbc.saagui.sagasystem")));
        if (JRMCoreH.NC()) {
            this.buttonList.add(new DBCGuiButtons02(-1, posX - 200, posY - 70, 70, 20, "Dragon Block C"));
            this.buttonList.add(new DBCGuiButtons02(-3, posX - 200, posY - 45, 70, 20, "Naruto C"));
        }
        if (this.saa == 1) {
            this.buttonList.add(new DBCGuiButtons02(0, posX - 82, posY - 60, 83, 20, StatCollector.translateToLocal((String)"dbc.saagui.body")));
            this.buttonList.add(new DBCGuiButtons02(1, posX + 2, posY - 60, 83, 20, StatCollector.translateToLocal((String)"dbc.saagui.trainingpoints")));
            this.buttonList.add(new DBCGuiButtons02(2, posX - 82, posY - 35, 83, 20, StatCollector.translateToLocal((String)"dbc.saagui.maxki")));
            this.buttonList.add(new DBCGuiButtons02(3, posX + 2, posY - 35, 83, 20, StatCollector.translateToLocal((String)"dbc.saagui.chargeki")));
            this.buttonList.add(new DBCGuiButtons02(4, posX - 82, posY - 10, 83, 20, StatCollector.translateToLocal((String)"dbc.saagui.dash")));
            this.buttonList.add(new DBCGuiButtons02(5, posX + 2, posY - 10, 83, 20, StatCollector.translateToLocal((String)"dbc.saagui.punch")));
            this.buttonList.add(new DBCGuiButtons02(6, posX - 82, posY + 15, 83, 20, StatCollector.translateToLocal((String)"dbc.saagui.jump")));
            this.buttonList.add(new DBCGuiButtons02(7, posX + 2, posY + 15, 83, 20, StatCollector.translateToLocal((String)"dbc.saagui.fly")));
            this.buttonList.add(new DBCGuiButtons02(8, posX - 82, posY + 40, 83, 20, StatCollector.translateToLocal((String)"dbc.saagui.ascending")));
            this.buttonList.add(new DBCGuiButtons02(9, posX + 2, posY + 40, 83, 20, StatCollector.translateToLocal((String)"dbc.saagui.attackpower")));
            this.buttonList.add(new DBCGuiButtons01(10, posX - 10, posY + 65, 20, 20, "X"));
            if (!JRMCoreH.HairExists((EntityPlayer)DBCClient.mc.thePlayer)) {
                this.buttonList.add(new DBCGuiButtons01(200, posX + 55, posY + 65, 70, 20, StatCollector.translateToLocal((String)"dbc.saagui.selecthair")));
            }
        }
        if (this.saa == 2) {
            this.buttonList.add(this.actionPerformed(21, posX - 82, (posY -= 10) - 60, 83, 20, StatCollector.translateToLocal((String)"dbc.KABigBang.name")));
            this.buttonList.add(this.actionPerformed(22, posX + 2, posY - 60, 83, 20, StatCollector.translateToLocal((String)"dbc.KABlast.name")));
            this.buttonList.add(this.actionPerformed(23, posX - 82, posY - 35, 83, 20, StatCollector.translateToLocal((String)"dbc.KABurningAtt.name")));
            this.buttonList.add(this.actionPerformed(24, posX + 2, posY - 35, 83, 20, StatCollector.translateToLocal((String)"dbc.KADeathBeam.name")));
            this.buttonList.add(this.actionPerformed(25, posX - 82, posY - 10, 83, 20, StatCollector.translateToLocal((String)"dbc.KADodon.name")));
            this.buttonList.add(this.actionPerformed(26, posX + 2, posY - 10, 83, 20, StatCollector.translateToLocal((String)"dbc.KAEnergyDisk.name")));
            this.buttonList.add(this.actionPerformed(27, posX - 82, posY + 15, 83, 20, StatCollector.translateToLocal((String)"dbc.KAFinalFlash.name")));
            this.buttonList.add(this.actionPerformed(28, posX + 2, posY + 15, 83, 20, StatCollector.translateToLocal((String)"dbc.KAFingerLeser.name")));
            this.buttonList.add(this.actionPerformed(29, posX - 82, posY + 40, 83, 20, StatCollector.translateToLocal((String)"dbc.KAGalicGun.name")));
            this.buttonList.add(this.actionPerformed(30, posX + 2, posY + 40, 83, 20, StatCollector.translateToLocal((String)"dbc.KAHame.name")));
            this.buttonList.add(new DBCGuiButtons01(100, posX - 80, posY + 65, 160, 20, StatCollector.translateToLocal((String)"dbc.saagui.forgetattacks")));
            this.buttonList.add(new DBCGuiButtons01(10, posX + 100, posY - 80, 20, 20, "X"));
            this.buttonList.add(new DBCGuiButtons01(101, posX + 85, posY + 65, 40, 20, StatCollector.translateToLocal((String)"dbc.saagui.next")));
        }
        if (this.saa == 3) {
            this.buttonList.add(this.actionPerformed(31, posX + 2, (posY -= 10) - 10, 83, 20, StatCollector.translateToLocal((String)"dbc.KAHame10x.name")));
            this.buttonList.add(this.actionPerformed(32, posX - 82, posY + 15, 83, 20, StatCollector.translateToLocal((String)"dbc.KAMakanko.name")));
            this.buttonList.add(this.actionPerformed(33, posX + 2, posY + 15, 83, 20, StatCollector.translateToLocal((String)"dbc.KAMasenko.name")));
            this.buttonList.add(this.actionPerformed(34, posX - 82, posY + 40, 83, 20, StatCollector.translateToLocal((String)"dbc.KAPlanetDest.name")));
            this.buttonList.add(new DBCGuiButtons01(100, posX - 80, posY + 65, 160, 20, StatCollector.translateToLocal((String)"dbc.saagui.forgetattacks")));
            this.buttonList.add(new DBCGuiButtons01(10, posX + 100, posY - 80, 20, 20, "X"));
            this.buttonList.add(new DBCGuiButtons01(102, posX - 125, posY + 65, 40, 20, StatCollector.translateToLocal((String)"dbc.saagui.back")));
        }
        if (this.saa == 4) {
            this.buttonList.add(this.actionPerformed(36, posX - 82, (posY -= 10) - 60, 83, 20, StatCollector.translateToLocal((String)"dbc.KTKaioken.name")));
            this.buttonList.add(this.actionPerformed(35, posX + 2, posY - 60, 83, 20, StatCollector.translateToLocal((String)"dbc.KASpiritbomb.name")));
            this.buttonList.add(new DBCGuiButtons01(100, posX - 80, posY + 65, 160, 20, StatCollector.translateToLocal((String)"dbc.saagui.forgetattacks")));
            this.buttonList.add(new DBCGuiButtons01(10, posX + 100, posY - 80, 20, 20, "X"));
        }
        if (this.saa == 5) {
            this.buttonList.add(new DBCGuiButtons00(200, posX - 83, posY - 83, 83, 83, ""));
            this.buttonList.add(new DBCGuiButtons00(201, posX + 0, posY - 83, 83, 83, ""));
            this.buttonList.add(new DBCGuiButtons00(202, posX - 83, posY + 0, 83, 83, ""));
            this.buttonList.add(new DBCGuiButtons00(203, posX + 0, posY + 0, 83, 83, ""));
            this.buttonList.add(new DBCGuiButtons06(210, posX + 85, posY - 75, 40, 15, StatCollector.translateToLocal((String)"dbc.saagui.Black")));
            this.buttonList.add(new DBCGuiButtons06(211, posX + 85, posY - 60, 40, 15, StatCollector.translateToLocal((String)"dbc.saagui.White")));
            this.buttonList.add(new DBCGuiButtons06(212, posX + 85, posY - 45, 40, 15, StatCollector.translateToLocal((String)"dbc.saagui.Purple")));
            this.buttonList.add(new DBCGuiButtons06(213, posX + 85, posY - 30, 40, 15, StatCollector.translateToLocal((String)"dbc.saagui.Red")));
            this.buttonList.add(new DBCGuiButtons06(214, posX + 85, posY - 15, 40, 15, StatCollector.translateToLocal((String)"dbc.saagui.Brown")));
            this.buttonList.add(new DBCGuiButtons06(215, posX + 85, posY + 0, 40, 15, StatCollector.translateToLocal((String)"dbc.saagui.Orange")));
            this.buttonList.add(new DBCGuiButtons06(216, posX + 85, posY + 15, 40, 15, StatCollector.translateToLocal((String)"dbc.saagui.Green")));
            this.buttonList.add(new DBCGuiButtons06(217, posX + 85, posY + 30, 40, 15, StatCollector.translateToLocal((String)"dbc.saagui.Cyan")));
            this.buttonList.add(new DBCGuiButtons06(218, posX + 85, posY + 45, 40, 15, StatCollector.translateToLocal((String)"dbc.saagui.Blue")));
            this.buttonList.add(new DBCGuiButtons01(10, posX - 10, posY + 65, 20, 20, "X"));
            this.buttonList.add(new DBCGuiButtons01(220, posX + 83, posY + 65, 43, 20, StatCollector.translateToLocal((String)"dbc.saagui.accept")));
        }
    }

    public Object actionPerformed(int par1, int par2, int par3, int par4, int par5, String par6Str) {
        int selct = par1 - 20;
        int KA = 0;
        if (selct == 1) {
            KA = JRMCoreH.KABigBang;
        }
        if (selct == 2) {
            KA = JRMCoreH.KABlast;
        }
        if (selct == 3) {
            KA = JRMCoreH.KABurningAtt;
        }
        if (selct == 4) {
            KA = JRMCoreH.KADeathBeam;
        }
        if (selct == 5) {
            KA = JRMCoreH.KADodon;
        }
        if (selct == 6) {
            KA = JRMCoreH.KAEnergyDisk;
        }
        if (selct == 7) {
            KA = JRMCoreH.KAFinalFlash;
        }
        if (selct == 8) {
            KA = JRMCoreH.KAFingerLaser;
        }
        if (selct == 9) {
            KA = JRMCoreH.KAGalicGun;
        }
        if (selct == 10) {
            KA = JRMCoreH.KAKameHame;
        }
        if (selct == 11) {
            KA = JRMCoreH.KAKameHame10x;
        }
        if (selct == 12) {
            KA = JRMCoreH.KAMakanko;
        }
        if (selct == 13) {
            KA = JRMCoreH.KAMasenko;
        }
        if (selct == 14) {
            KA = JRMCoreH.KAPlanetDest;
        }
        if (selct == 15) {
            KA = JRMCoreH.KASpiritBomb;
        }
        if (selct == 16) {
            KA = JRMCoreH.KTKaioken;
        }
        GuiButton ret = KA == 1 ? new DBCGuiButtons02(par1, par2, par3, par4, par5, par6Str) : new DBCGuiButtons01(par1, par2, par3, par4, par5, par6Str);
        return ret;
    }

    public void actionPerformed(GuiButton button) {
        if (button.id == -1) {
            this.mc.thePlayer.openGui((Object)mod_DragonBC.instance, 6, this.mc.thePlayer.worldObj, (int)this.mc.thePlayer.posX, (int)this.mc.thePlayer.posY, (int)this.mc.thePlayer.posZ);
        }
        if (button.id == -2) {
            this.mc.thePlayer.openGui((Object)mod_DragonBC.instance, 5, this.mc.thePlayer.worldObj, (int)this.mc.thePlayer.posX, (int)this.mc.thePlayer.posY, (int)this.mc.thePlayer.posZ);
        }
        if (button.id == -3) {
            // empty if block
        }
        if (button.id == 0) {
            DBCSAAGui.dbcSAA(20, button.id);
            this.player();
        }
        if (button.id == 10) {
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 21 || button.id == 22 || button.id == 23 || button.id == 24 || button.id == 25 || button.id == 26 || button.id == 27 || button.id == 28 || button.id == 29 || button.id == 30 || button.id == 31 || button.id == 32 || button.id == 33 || button.id == 34 || button.id == 35 || button.id == 36 || button.id == 100) {
            DBCSAAGui.dbcSAA(button.id);
            this.mc.thePlayer.closeScreen();
            if (button.id != 100) {
                this.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText(StatCollector.translateToLocal((String)"dbc.saagui.newskill")));
            }
        }
        if (button.id == 220) {
            this.mc.thePlayer.closeScreen();
            DBCSAAGui.dbcHair(JRMCoreH.Har + JRMCoreH.Col);
        }
    }

    public void player() {
    }

    public static void dbcSAA(int num, int saa) {
        mod_DragonBC.logger.info("dbcsaa channel is has not been set in DBCSAAGui " + num + " " + saa);
    }

    public static void dbcSAA(int num) {
        int dbctick = num + 100;
    }

    public static void dbcHair(String hair2) {
        String dbchalo = hair2;
        mod_DragonBC.logger.info("dbchalo channel is has not been set in DBCSAAGui " + dbchalo);
    }

    public void drawScreen(int x, int y, float f) {
        ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = this.mc.fontRenderer;
        String wish = "jinryuudragonbc:saa.png";
        String ww = "jinryuudragonbc:saa2.png";
        int xSize = 256;
        int ySize = 160;
        int guiLeft = (this.width - xSize) / 2;
        int guiTop = (this.height - ySize) / 2;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation tx = new ResourceLocation(wish);
        this.mc.renderEngine.bindTexture(tx);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        if (this.saa == 5) {
            wish = "jinryuudragonbc:gui/hairs.png";
            int j = 0;
            if (JRMCoreH.Col == "_C0") {
                j = 0;
            }
            if (JRMCoreH.Col == "_C1") {
                j = 0xFFFFF0;
            }
            if (JRMCoreH.Col == "_C2") {
                j = 9265576;
            }
            if (JRMCoreH.Col == "_C3") {
                j = 16766976;
            }
            if (JRMCoreH.Col == "_C4") {
                j = 0xFF3333;
            }
            if (JRMCoreH.Col == "_C5") {
                j = 6045747;
            }
            if (JRMCoreH.Col == "_C6") {
                j = 0xFF7F00;
            }
            if (JRMCoreH.Col == "_C7") {
                j = 25600;
            }
            if (JRMCoreH.Col == "_C8") {
                j = 5956839;
            }
            if (JRMCoreH.Col == "_C9") {
                j = 5683455;
            }
            float h2 = (float)(j >> 16 & 0xFF) / 255.0f;
            float h3 = (float)(j >> 8 & 0xFF) / 255.0f;
            float h4 = (float)(j & 0xFF) / 255.0f;
            float h1 = 1.0f;
            GL11.glColor3f((float)(h1 * h2), (float)(h1 * h3), (float)(h1 * h4));
            ResourceLocation tx2 = new ResourceLocation(wish);
            this.mc.renderEngine.bindTexture(tx2);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        }
        if (this.saa == 1) {
            double maxperc;
            int var22;
            int ySize2 = ySize - 10;
            int guiLeft2 = (this.width - xSize) / 2;
            int guiTop2 = (this.height - ySize2) / 2;
            this.drawTexturedModalRect(guiLeft2, guiTop2, 0, 169, xSize, 5);
            int max = xSize - 20;
            if (max < 1) {
                max = 1;
            }
            if ((var22 = (int)((maxperc = (double)max * 0.01) * (double)JRMCoreH.dbcEvilness)) > xSize) {
                var22 = xSize;
            }
            int xSize2 = 5;
            int ySize3 = ySize - 10;
            int guiLeft3 = (this.width - xSize2) / 2 - max / 2 + var22;
            int guiTop3 = guiTop2 - 1;
            this.drawTexturedModalRect(guiLeft3, guiTop3, 0, 175, xSize2, 7);
            String s = "";
            if (JRMCoreH.dbcBP != null && JRMCoreH.dbcBP.length > 0) {
                for (String n : JRMCoreH.dbcBP) {
                    String[] m = n.split(";");
                    if (!this.mc.thePlayer.getCommandSenderName().equals(m[0])) continue;
                    s = m[1];
                }
            }
            this.current("BP: " + s, 0, -71, var8, var6, var7);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            ResourceLocation tx3 = new ResourceLocation(ww);
            this.mc.renderEngine.bindTexture(tx3);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
            int tp = JRMCoreH.dbcTrainPoint;
            int ex = JRMCoreH.jrmcExp;
            boolean var11 = false;
            int var12 = var11 ? 0xFFFFFF : 8453920;
            String var34 = StatCollector.translateToLocal((String)"dbc.saagui.curexp") + " " + ex;
            int var38 = 5;
            int var37 = 5;
            var8.drawString(var34, var38 + 1, var37, 0);
            var8.drawString(var34, var38 - 1, var37, 0);
            var8.drawString(var34, var38, var37 + 1, 0);
            var8.drawString(var34, var38, var37 - 1, 0);
            var8.drawString(var34, var38, var37, 8388564);
            this.current("" + JRMCoreH.kiPunch, 105, -10, var8, var6, var7);
            this.current("" + JRMCoreH.kiDash, -105, -10, var8, var6, var7);
            this.current("" + JRMCoreH.kiMax, -105, -35, var8, var6, var7);
            this.current("" + JRMCoreH.kiChargRa, 105, -35, var8, var6, var7);
            this.current("" + JRMCoreH.kiJump, -105, 15, var8, var6, var7);
            this.current("" + JRMCoreH.kiFly, 105, 15, var8, var6, var7);
            this.current("" + JRMCoreH.kiAsclvl, -105, 40, var8, var6, var7);
            this.current("" + JRMCoreH.kiAscPow, 105, 40, var8, var6, var7);
            this.current("" + JRMCoreH.dbcTrainPoint, 105, -60, var8, var6, var7);
            this.current("" + JRMCoreH.dbcHealth, -105, -60, var8, var6, var7);
            this.current2("" + JRMCoreH.kiPunch + "TP", 105, -10, var8, var6, var7);
            this.current2("" + JRMCoreH.kiDash + "TP", -105, -10, var8, var6, var7);
            this.current2("" + (JRMCoreH.kiMax / 50 <= 0 ? 1 : JRMCoreH.kiMax / 50) + "TP", -105, -35, var8, var6, var7);
            this.current2("" + JRMCoreH.kiChargRa + "TP", 105, -35, var8, var6, var7);
            this.current2("" + JRMCoreH.kiJump + "TP", -105, 15, var8, var6, var7);
            this.current2("" + JRMCoreH.kiFly + "TP", 105, 15, var8, var6, var7);
            this.current2("" + JRMCoreH.kiAsclvl * 20 + "TP", -105, 40, var8, var6, var7);
            this.current2("" + JRMCoreH.kiAscPow + "TP", 105, 40, var8, var6, var7);
            this.current2("5DBCxp", 106, -60, var8, var6, var7);
            this.current2("" + (JRMCoreH.dbcHealth / 50 <= 0 ? 1 : JRMCoreH.dbcHealth / 50) + "TP", -105, -60, var8, var6, var7);
        }
        super.drawScreen(x, y, f);
    }

    public boolean doesGuiPauseGame() {
        return false;
    }

    public void current(String var35, int posx, int posy, FontRenderer var8, int var6, int var7) {
        int wid = var8.getStringWidth(var35) / 2;
        int posX = var6 / 2 + posx - wid;
        int posY = var7 / 2 + posy + 8 - 6;
        var8.drawString(var35, posX + 1, posY, 0);
        var8.drawString(var35, posX - 1, posY, 0);
        var8.drawString(var35, posX, posY + 1, 0);
        var8.drawString(var35, posX, posY - 1, 0);
        var8.drawString(var35, posX, posY, 8388564);
    }

    public void current2(String var35, int posx, int posy, FontRenderer var8, int var6, int var7) {
        int wid = var8.getStringWidth(var35) / 2;
        int posX = var6 / 2 + posx - wid;
        int posY = var7 / 2 + posy + 8 + 10 - 6;
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
        Minecraft minecraft = this.mc;
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
        ResourceLocation tx = new ResourceLocation(var4);
        this.mc.renderEngine.bindTexture(tx);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

    public void ScouterRenderBlur(int par1, int par2) {
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3008);
        ResourceLocation tx = new ResourceLocation(this.textureFile);
        this.mc.renderEngine.bindTexture(tx);
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
}

