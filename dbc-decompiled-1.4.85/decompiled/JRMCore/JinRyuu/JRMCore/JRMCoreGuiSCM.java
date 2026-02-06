/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.JRMCoreGuiButtons00;
import JinRyuu.JRMCore.JRMCoreGuiButtons01;
import JinRyuu.JRMCore.JRMCoreGuiButtonsA3;
import JinRyuu.JRMCore.JRMCoreH;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class JRMCoreGuiSCM
extends GuiScreen {
    public static Minecraft mc = Minecraft.getMinecraft();
    protected int guiLeft;
    protected int guiTop;
    protected int xSize = 256;
    protected int ySize = 159;
    private float xSize_lo;
    private float ySize_lo;
    int id = 0;
    private int tick = 0;
    private int guiID = 0;
    private int ipg = 0;
    private int lp = 0;

    public void initGui() {
        this.buttonList.clear();
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        int posX = this.width / 2;
        int posY = this.height / 2;
        JRMCoreH.jrmct(1);
        JRMCoreH.jrmct(3);
    }

    public Object actionPerformed(int par1, int par2, int par3, int par4, int par5, String par6Str) {
        int selct = par1 - 20;
        boolean KA = false;
        JRMCoreGuiButtons00 ret = KA ? new JRMCoreGuiButtons00(par1, par2, par3, par4, par5, par6Str, 0) : new JRMCoreGuiButtons00(par1, par2, par3, par4, par5, par6Str, 0);
        return ret;
    }

    public void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            this.id = 0;
        }
    }

    public void drawScreen(int x, int y, float f) {
        ResourceLocation guiLocation;
        int guiTop;
        int guiLeft;
        int ySize;
        int xSize;
        this.xSize_lo = x;
        this.ySize_lo = y;
        ScaledResolution var5 = new ScaledResolution(mc, JRMCoreGuiSCM.mc.displayWidth, JRMCoreGuiSCM.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = JRMCoreGuiSCM.mc.fontRenderer;
        String wish = "jinryuumodscore:gui.png";
        String icons = "jinryuumodscore:icons.png";
        this.buttonList.clear();
        ++this.tick;
        if (this.tick >= 20) {
            this.tick = 0;
            JRMCoreH.jrmct(1);
            JRMCoreH.jrmct(3);
        }
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        int posX = this.width / 2;
        int posY = this.height / 2;
        byte pwr = JRMCoreH.Pwrtyp;
        if (this.guiID == 11) {
            String s;
            int tpLevelCost;
            int n;
            String name;
            String mod;
            String[] sklsNms;
            int[][] sklsLvl;
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
            guiTop = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            guiLocation = new ResourceLocation(wish);
            JRMCoreGuiSCM.mc.renderEngine.bindTexture(guiLocation);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
            this.buttonList.add(new JRMCoreGuiButtons00(10, posX - 150, posY + 65, 20, 20, "X", 0));
            this.buttonList.add(new JRMCoreGuiButtons00(100, posX - 120, posY + 85, 80, 20, JRMCoreH.trl("jrmc", "MainAttributes"), 0));
            this.buttonList.add(new JRMCoreGuiButtons00(101, posX - 35, posY + 85, 80, 20, JRMCoreH.trl("jrmc", "Skills"), 0));
            this.buttonList.add(new JRMCoreGuiButtons00(102, posX + 50, posY + 85, 80, 20, JRMCoreH.Pwrtyp == 1 ? JRMCoreH.trl("jrmc", "KiTechniques") : JRMCoreH.trl("jrmc", "Jutsu"), 0));
            if (JRMCoreH.Pwrtyp == 2) {
                String l = JRMCoreH.trl("jrmc", "Learn");
                int lw = this.fontRendererObj.getStringWidth(l);
                this.buttonList.add(new JRMCoreGuiButtons01(-200, guiLeft + 250 - lw, guiTop + 5, lw, l, JRMCoreH.techNCCol[1]));
            }
            if (JRMCoreH.Pwrtyp == 2) {
                rSkls = JRMCoreH.ncRSkls;
                rSklsLvl = JRMCoreH.ncRSklsLvl;
                rSklsNms = JRMCoreH.ncRSklsNms;
                cSkls = JRMCoreH.ncCSkls;
                cSklsLvl = JRMCoreH.NCRacialSkillTPCost;
                cSklsNms = JRMCoreH.NCRacialSkillAbilityNames;
                skls = JRMCoreH.NCSkillIDs;
                sklsLvl = JRMCoreH.NCSkillTPCost;
                sklsNms = JRMCoreH.NCSkillNames;
                mod = "nc";
            } else {
                rSkls = JRMCoreH.vlblRSkls;
                rSklsLvl = JRMCoreH.DBCRacialSkillTPCost;
                rSklsNms = JRMCoreH.vlblRSklsNms;
                cSkls = JRMCoreH.vlblCSkls;
                cSklsLvl = JRMCoreH.vlblCSklsLvl;
                cSklsNms = JRMCoreH.vlblCSklsNms;
                skls = JRMCoreH.DBCSkillsIDs;
                sklsLvl = JRMCoreH.DBCSkillTPCost;
                sklsNms = JRMCoreH.DBCSkillNames;
                mod = "dbc";
            }
            int b = 0;
            if (JRMCoreH.PlyrSkillX != null && !JRMCoreH.PlyrSkillX.contains("pty") && JRMCoreH.PlyrSkillX.length() > 1) {
                b = (byte)(b + 1);
                name = JRMCoreH.trl(mod, JRMCoreH.SklName(JRMCoreH.PlyrSkillX, rSkls, rSklsNms, JRMCoreH.Race));
                n = Integer.parseInt(JRMCoreH.PlyrSkillX.substring(2));
                var8.drawString("\u00a70" + name + (n < 6 ? " \u00a78lvl: " + n : ""), guiLeft + 5, guiTop + 15 + b * 10, 0);
                if ((JRMCoreH.Race == 1 || JRMCoreH.Race == 2) && n < 6) {
                    this.buttonList.add(new JRMCoreGuiButtonsA3(340, guiLeft - 10, guiTop + 15 + b * 10, 10, 2));
                }
                if (JRMCoreH.Race == 4 && n < 4) {
                    this.buttonList.add(new JRMCoreGuiButtonsA3(340, guiLeft - 10, guiTop + 15 + b * 10, 10, 2));
                }
                if ((JRMCoreH.Race == 1 || JRMCoreH.Race == 2) && JRMCoreH.PlyrSkillY != null && JRMCoreH.PlyrSkillY.contains("Sai") && n >= 5) {
                    this.buttonList.add(new JRMCoreGuiButtonsA3(JRMCoreH.PlyrSkillY.contains("R") ? 343 : 342, guiLeft + 10 + var8.getStringWidth(name + (n < 6 ? " \u00a78lvl: " + n : "")), guiTop + 15 + b * 10, 20, JRMCoreH.PlyrSkillY.contains("R") ? 0 : 1));
                }
                tpLevelCost = 0;
                tpLevelCost = mod.equals("dbc") ? JRMCoreH.skillTPCost_X(JRMCoreH.PlyrSkillX, JRMCoreH.Race, rSklsLvl) : JRMCoreH.skillTPCost_X(JRMCoreH.PlyrSkillY, JRMCoreH.Race, cSklsLvl);
                if (JRMCoreH.Race == 1 || JRMCoreH.Race == 2 || JRMCoreH.Race == 4) {
                    s = n < (JRMCoreH.Race == 1 || JRMCoreH.Race == 2 ? 6 : (JRMCoreH.Race == 4 ? 4 : 0)) ? (tpLevelCost == -1 ? JRMCoreH.trl("jrmc", "UpgradeLocked") : "TP: " + tpLevelCost) : JRMCoreH.trl("jrmc", "Maxed");
                    var8.drawString(s, guiLeft + 250 - var8.getStringWidth(s), guiTop + 15 + b * 10, 0);
                } else {
                    s = JRMCoreH.trl("jrmc", "NoUpgrade");
                    var8.drawString(s, guiLeft + 250 - var8.getStringWidth(s), guiTop + 15 + b * 10, 0);
                }
            }
            if (JRMCoreH.PlyrSkillY != null && !JRMCoreH.PlyrSkillY.contains("pty") && !JRMCoreH.PlyrSkillY.contains("Sai") && JRMCoreH.Race != 1 && JRMCoreH.Race != 2 && JRMCoreH.PlyrSkillY.length() > 1) {
                b = (byte)(b + 1);
                name = JRMCoreH.SklName(JRMCoreH.PlyrSkillY, cSkls, cSklsNms);
                n = Integer.parseInt(JRMCoreH.PlyrSkillY.substring(2));
                var8.drawString("\u00a70" + (JRMCoreH.Race == 1 || JRMCoreH.Race == 2 ? JRMCoreH.TransSaiUpNam[n] : name + " \u00a78lvl: " + (n + 1)), guiLeft + 5, guiTop + 15 + b * 10, 0);
                if (n <= 8) {
                    this.buttonList.add(new JRMCoreGuiButtonsA3(341, guiLeft - 10, guiTop + 15 + b * 10, 10, 2));
                }
                tpLevelCost = 0;
                tpLevelCost = mod.equals("dbc") ? JRMCoreH.skillTPCost_X(JRMCoreH.PlyrSkillX, JRMCoreH.Race, rSklsLvl) : JRMCoreH.skillTPCost_X(JRMCoreH.PlyrSkillY, JRMCoreH.Race, cSklsLvl);
                s = n <= 8 ? (tpLevelCost == -1 ? JRMCoreH.trl("jrmc", "UpgradeLocked") : "TP: " + tpLevelCost) : JRMCoreH.trl("jrmc", "Maxed");
                var8.drawString(s, guiLeft + 250 - var8.getStringWidth(s), guiTop + 15 + b * 10, 0);
            }
            if (JRMCoreH.PlyrSkills != null) {
                int s2 = 0;
                for (int i = 0; i < JRMCoreH.PlyrSkills.length; i = (int)((byte)(i + 1))) {
                    String currentSkill = JRMCoreH.PlyrSkills[i];
                    if (!currentSkill.contains("pty") && currentSkill.length() > 2) {
                        b = (byte)(b + 1);
                        String name2 = JRMCoreH.Pwrtyp == 1 ? JRMCoreH.trl("dbc", JRMCoreH.SklName(currentSkill, skls, sklsNms)) : JRMCoreH.trl("nc", JRMCoreH.SklName(currentSkill, skls, sklsNms));
                        int n2 = Integer.parseInt(currentSkill.substring(2));
                        var8.drawString("\u00a70" + name2 + " \u00a78lvl: " + (n2 + 1), guiLeft + 5, guiTop + 15 + b * 10, 0);
                        this.buttonList.add(new JRMCoreGuiButtonsA3(300 + i, guiLeft + 255, guiTop + 15 + b * 10, 10, 3));
                        if (n2 <= 8) {
                            this.buttonList.add(new JRMCoreGuiButtonsA3(320 + i, guiLeft - 10, guiTop + 15 + b * 10, 10, 2));
                        }
                        int tpLevelCost2 = JRMCoreH.skillTPCost(currentSkill, skls, sklsLvl);
                        String st = n2 <= 8 ? (tpLevelCost2 == -1 ? JRMCoreH.trl("jrmc", "UpgradeLocked") : "TP: " + tpLevelCost2) : JRMCoreH.trl("jrmc", "Maxed");
                        var8.drawString(st, guiLeft + 250 - var8.getStringWidth(st), guiTop + 15 + b * 10, 0);
                        continue;
                    }
                    ++s2;
                }
            }
        }
        if (this.guiID == 16) {
            String mod;
            int[][] SklsLvl;
            String[] SklsNms;
            xSize = 256;
            ySize = 159;
            guiLeft = (this.width - xSize) / 2;
            guiTop = (this.height - ySize) / 2;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            guiLocation = new ResourceLocation(wish);
            JRMCoreGuiSCM.mc.renderEngine.bindTexture(guiLocation);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
            this.buttonList.add(new JRMCoreGuiButtons00(10, posX - 150, posY + 65, 20, 20, "X", 0));
            if (pwr == 2) {
                SklsNms = JRMCoreH.NCSkillNames;
                SklsLvl = JRMCoreH.NCSkillTPCost;
                mod = "nc";
            } else {
                SklsNms = JRMCoreH.DBCSkillNames;
                SklsLvl = JRMCoreH.DBCSkillTPCost;
                mod = "dbc";
            }
            var8.drawString(JRMCoreH.numSep(JRMCoreH.curTP) + " " + "Training Points", guiLeft + 10, guiTop + 5, 0);
            int i2 = 0;
            int nms = SklsNms.length;
            for (int i = 0; i < nms; i = (int)((byte)(i + 1))) {
                if (i2 <= 13 + this.ipg * 13 && i2 >= 0 + this.ipg * 13) {
                    String fn = JRMCoreH.trl(mod, SklsNms[i]);
                    int fnw = this.fontRendererObj.getStringWidth(fn);
                    var8.drawString(fn, guiLeft + xSize / 2 - 122, guiTop + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, 0);
                    String on = JRMCoreH.SklLvl(i, pwr) < 1 ? "" : " " + JRMCoreH.trl("jrmc", "Owned");
                    int onw = this.fontRendererObj.getStringWidth(on);
                    var8.drawString(on, guiLeft + xSize / 2 - 122 + fnw, guiTop + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[1]);
                    if (JRMCoreH.SklLvl(i, pwr) < 1) {
                        int tpCost = JRMCoreH.getSkillTPCost(i, 0, JRMCoreH.isPowerTypeKi());
                        String n = " " + tpCost + " tp";
                        int nw = this.fontRendererObj.getStringWidth(fn);
                        if (tpCost != -1 && JRMCoreH.curTP >= tpCost) {
                            this.buttonList.add(new JRMCoreGuiButtons01(JRMCoreH.SklLvl(i, pwr) < 1 ? 4000 + i : -1, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, nw, n, JRMCoreH.techNCCol[1]));
                        } else {
                            var8.drawString(n, guiLeft + xSize / 2 - 122 + fnw + onw, guiTop + (ySize + 1) / 2 - 64 + i * 10 - this.lp * 13 * 10, JRMCoreH.techNCCol[0]);
                        }
                    }
                }
                ++i2;
            }
            if (i2 > 13 + this.lp * 13) {
                String n = JRMCoreH.trl("jrmc", "Next");
                this.buttonList.add(new JRMCoreGuiButtons00(88, guiLeft + xSize / 2 + 130, guiTop + (ySize + 1) / 2 + 15, this.fontRendererObj.getStringWidth(n) + 8, 20, n, 0));
            }
            if (this.lp != 0) {
                String p = JRMCoreH.trl("jrmc", "Prev");
                int pw = this.fontRendererObj.getStringWidth(p) + 8;
                this.buttonList.add(new JRMCoreGuiButtons00(89, guiLeft + xSize / 2 - 130 - pw, guiTop + (ySize + 1) / 2 + 15, pw, 20, p, 0));
            }
        } else {
            this.lp = 0;
        }
        super.drawScreen(x, y, f);
    }

    public boolean doesGuiPauseGame() {
        return false;
    }
}

