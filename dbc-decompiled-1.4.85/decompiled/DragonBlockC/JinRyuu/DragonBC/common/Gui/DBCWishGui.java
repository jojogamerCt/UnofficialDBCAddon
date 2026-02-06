/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreGuiButtonC
 *  JinRyuu.JRMCore.JRMCoreGuiButtons00
 *  JinRyuu.JRMCore.JRMCoreGuiButtons01
 *  JinRyuu.JRMCore.JRMCoreGuiButtonsA1
 *  JinRyuu.JRMCore.JRMCoreGuiSlider00
 *  JinRyuu.JRMCore.JRMCoreGuiSliderX00
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.p.DBC.DBCPwish
 *  JinRyuu.JRMCore.p.PD
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiIngame
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.DragonBC.common.DBCClientTickHandler;
import JinRyuu.DragonBC.common.DBCH;
import JinRyuu.DragonBC.common.Gui.DBCGuiButtons01;
import JinRyuu.JRMCore.JRMCoreGuiButtonC;
import JinRyuu.JRMCore.JRMCoreGuiButtons00;
import JinRyuu.JRMCore.JRMCoreGuiButtons01;
import JinRyuu.JRMCore.JRMCoreGuiButtonsA1;
import JinRyuu.JRMCore.JRMCoreGuiSlider00;
import JinRyuu.JRMCore.JRMCoreGuiSliderX00;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.p.DBC.DBCPwish;
import JinRyuu.JRMCore.p.PD;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.awt.Color;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class DBCWishGui
extends GuiScreen {
    private DBCClientTickHandler tick;
    private GuiIngame Guiingame;
    private int wishID = 0;
    private int prevwish = 0;
    private int wish = 0;
    private int KiColorSlcted = -1;
    boolean clicked = false;
    int wpp = 6;
    String target = "";
    private int ipg;
    private float BrghtSlcted = 0.8f;
    private int scrollMouseJump;
    private int scroll;
    private float scrollSide;
    private boolean mousePressed;
    private int tickI;
    public static String[] playerlist = null;

    public void renderSuperProtect(int ki) {
        this.buttonList.clear();
        int posX = this.width / 2;
        int posY = this.height / 2;
        this.buttonList.add(new DBCGuiButtons01(100, posX - 0, posY - 0, 20, 20, "TEST"));
    }

    public DBCWishGui(int w) {
        this.wish = w;
        this.scroll = 0;
        if (this.wish == 1 || this.wish == 2) {
            DBCH.packDuo(-2, 0);
        }
        playerlist = null;
        this.target = "";
    }

    public void initGui() {
        this.buttonList.clear();
    }

    public void actionPerformed(GuiButton button) {
        if (button.id == -21) {
            int col;
            this.KiColorSlcted = col = ((JRMCoreGuiButtonC)button).getBgCol();
            this.wish = this.prevwish;
        }
        if (button.id == -20) {
            this.BrghtSlcted = ((JRMCoreGuiSlider00)button).sliderValue;
        }
        if (button.id == -3) {
            ++this.ipg;
        }
        if (button.id == -4) {
            --this.ipg;
        }
        if (button.id == -5) {
            this.wish = this.prevwish;
        }
        if (button.id == -2) {
            this.scroll -= 3;
        }
        if (button.id == -1) {
            this.scroll += 3;
        }
        if (button.id >= 0) {
            boolean send = true;
            this.clicked = true;
            this.wishID = button.id;
            if (this.wish == 1) {
                if (this.target.length() < 2 && (DBCH.wishS.get(button.id).equals("revive") || DBCH.wishS.get(button.id).equals("reviventp"))) {
                    send = false;
                    this.dbcWish(3, "");
                    this.prevwish = this.wish;
                    this.wishID = button.id;
                    this.wish = 10;
                }
                if (this.KiColorSlcted == -1 && DBCH.wishS.get(button.id).equals("kicolor")) {
                    send = false;
                    this.prevwish = this.wish;
                    this.wishID = button.id;
                    this.wish = 11;
                }
            }
            if (this.wish == 2) {
                if (this.target.length() < 2 && (DBCH.wishP.get(button.id).equals("revive") || DBCH.wishP.get(button.id).equals("reviventp"))) {
                    send = false;
                    this.dbcWish(3, "");
                    this.prevwish = this.wish;
                    this.wishID = button.id;
                    this.wish = 10;
                }
                if (this.KiColorSlcted == -1 && DBCH.wishP.get(button.id).equals("kicolor")) {
                    send = false;
                    this.prevwish = this.wish;
                    this.wishID = button.id;
                    this.wish = 11;
                }
            }
            if (send) {
                if (this.wish == 10) {
                    int i = button.id - 1000;
                    this.target = playerlist[i];
                    this.wish = this.prevwish;
                } else {
                    this.dbcWish(0, this.wishID + ";" + (this.KiColorSlcted >= 0 ? Integer.valueOf(this.KiColorSlcted) : this.target));
                    this.target = "";
                    this.KiColorSlcted = -1;
                }
            }
            DBCH.packDuo(-2, 0);
        }
    }

    public void dbcWish(int id, String wish) {
        int dbcwish = id;
        PD.sendToServer((IMessage)new DBCPwish(id, wish));
    }

    public void drawScreen(int x, int y, float f) {
        String arg1;
        int fn;
        String n;
        ItemStack is;
        Item item;
        int im;
        int iz;
        String in;
        int pos;
        String o;
        int i;
        int sz;
        float m2;
        int m1;
        int size;
        int a;
        int i2;
        int j;
        ResourceLocation tx;
        if (Mouse.isButtonDown((int)0)) {
            this.mousePressed = true;
            this.scrollSide = JRMCoreGuiSliderX00.sliderValue;
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
        ++this.tickI;
        if (this.tickI > 20) {
            this.tickI = 0;
        }
        if (this.clicked && JRMCoreH.wishes <= 0) {
            this.mc.thePlayer.closeScreen();
        }
        this.buttonList.clear();
        FontRenderer var8 = this.mc.fontRenderer;
        ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        int posX = this.width / 2;
        int posY = this.height / 2;
        int xSize = 182;
        int ySize = 191;
        int guiLeft = (this.width - xSize) / 2;
        int guiTop = (this.height - ySize) / 2;
        String tex = "jinryuudragonbc:wish.png";
        this.wpp = 6;
        if (this.wish == 1) {
            tex = "jinryuudragonbc:wish.png";
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            tx = new ResourceLocation(tex);
            this.mc.renderEngine.bindTexture(tx);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
            j = 0;
            i2 = 0;
            a = JRMCoreH.Algnmnt((int)JRMCoreH.align);
            i2 = JRMCoreH.txt((String)(JRMCoreH.trl((String)"entity.jinryuudragonblockc.Dragon.name") + "/n Wishes: " + JRMCoreH.wishes), (String)JRMCoreH.clb, (int)0, (boolean)true, (int)(guiLeft + 5), (int)(guiTop + 5 + j * 10), (int)175);
            j += i2;
            m1 = size = DBCH.wishS.size();
            m2 = 5.0f;
            sz = 6;
            this.scrollMouseJump = 1;
            if (m1 > sz) {
                if ((float)m1 - m2 < (float)this.scroll) {
                    this.scroll = (int)((float)m1 - m2);
                } else if (this.scroll < 0) {
                    this.scroll = 0;
                }
                if (this.mousePressed && !JRMCoreGuiButtonsA1.clicked) {
                    this.scroll = (int)(((float)m1 - m2) * this.scrollSide);
                } else {
                    this.scrollSide = JRMCoreGuiSliderX00.sliderValue = (float)this.scroll / ((float)m1 - m2);
                }
            } else {
                this.scroll = 0;
            }
            if (m1 > sz) {
                if (this.scrollSide > 0.0f) {
                    this.buttonList.add(new JRMCoreGuiButtonsA1(-2, guiLeft + xSize / 2 + 110 + 18, guiTop + 80 - 70, "i"));
                }
                if (this.scrollSide < 1.0f) {
                    this.buttonList.add(new JRMCoreGuiButtonsA1(-1, guiLeft + xSize / 2 + 110 + 18, guiTop + 80 + 60, "v"));
                }
                this.buttonList.add(new JRMCoreGuiSliderX00(1000000, guiLeft + xSize / 2 + 110 + 18, guiTop + 25, this.mousePressed, this.scrollSide, 1.0f));
            }
            for (i = this.scroll; i < (size > this.scroll + sz ? this.scroll + sz : size); ++i) {
                o = DBCH.wishS.get(i).replace(";+;", ";+");
                pos = i - this.scroll;
                if (o.contains(";+")) {
                    String[] sa = o.split(";+");
                    in = sa[0];
                    iz = Integer.parseInt(sa[1]);
                    im = Integer.parseInt(sa[2]);
                    item = JRMCoreH.getItemByText((String)in);
                    if (item == null) continue;
                    is = new ItemStack(item, iz, im);
                    n = is.stackSize + " " + item.getItemStackDisplayName(is);
                    fn = var8.getStringWidth(n);
                    this.buttonList.add(new DBCGuiButtons01(i, posX - fn / 2 - 5, guiTop + 5 + pos * 21 + j * 10, fn + 10, 20, n));
                    continue;
                }
                if (this.KiColorSlcted >= 0 && o.equals("kicolor")) {
                    int col = this.KiColorSlcted > 0 ? this.KiColorSlcted : 0xA8FFFF;
                    n = JRMCoreH.cct((String)JRMCoreH.trl((String)"dbc", (String)("wish" + o)), (Object[])new Object[0]);
                    fn = var8.getStringWidth(n);
                    this.buttonList.add(new JRMCoreGuiButtons00(i, posX - fn / 2 - 5, guiTop + 5 + pos * 21 + j * 10, fn + 10, 20, n, col));
                    continue;
                }
                String op = (o.equals("revive") || o.equals("reviventp")) && this.target.length() > 2 ? "S" : "";
                arg1 = op.equals("S") ? this.target : JRMCoreH.trl((String)"jrmc", (String)JRMCoreH.AlgnmntNms[JRMCoreH.Algnmnt((int)JRMCoreH.align)]);
                n = JRMCoreH.cct((String)JRMCoreH.trl((String)"dbc", (String)("wish" + o + op)), (Object[])new Object[]{arg1});
                fn = var8.getStringWidth(n);
                this.buttonList.add(new DBCGuiButtons01(i, posX - fn / 2 - 5, guiTop + 5 + pos * 21 + j * 10, fn + 10, 20, n));
            }
        }
        if (this.wish == 2) {
            tex = "jinryuudragonbc:wish2.png";
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            tx = new ResourceLocation(tex);
            this.mc.renderEngine.bindTexture(tx);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
            j = 0;
            i2 = 0;
            a = JRMCoreH.Algnmnt((int)JRMCoreH.align);
            i2 = JRMCoreH.txt((String)(JRMCoreH.trl((String)"entity.jinryuudragonblockc.Dragonp.name") + "/n Wishes: " + JRMCoreH.wishes), (String)JRMCoreH.clb, (int)0, (boolean)true, (int)(guiLeft + 5), (int)(guiTop + 5 + j * 10), (int)175);
            j += i2;
            m1 = size = DBCH.wishP.size();
            m2 = 5.0f;
            sz = 6;
            this.scrollMouseJump = 1;
            if (m1 > sz) {
                if ((float)m1 - m2 < (float)this.scroll) {
                    this.scroll = (int)((float)m1 - m2);
                } else if (this.scroll < 0) {
                    this.scroll = 0;
                }
                if (this.mousePressed && !JRMCoreGuiButtonsA1.clicked) {
                    this.scroll = (int)(((float)m1 - m2) * this.scrollSide);
                } else {
                    this.scrollSide = JRMCoreGuiSliderX00.sliderValue = (float)this.scroll / ((float)m1 - m2);
                }
            } else {
                this.scroll = 0;
            }
            if (m1 > sz) {
                if (this.scrollSide > 0.0f) {
                    this.buttonList.add(new JRMCoreGuiButtonsA1(-2, guiLeft + xSize / 2 + 110 + 18, guiTop + 80 - 70, "i"));
                }
                if (this.scrollSide < 1.0f) {
                    this.buttonList.add(new JRMCoreGuiButtonsA1(-1, guiLeft + xSize / 2 + 110 + 18, guiTop + 80 + 60, "v"));
                }
                this.buttonList.add(new JRMCoreGuiSliderX00(1000000, guiLeft + xSize / 2 + 110 + 18, guiTop + 25, this.mousePressed, this.scrollSide, 1.0f));
            }
            for (i = this.scroll; i < (size > this.scroll + sz ? this.scroll + sz : size); ++i) {
                o = DBCH.wishP.get(i).replace(";+;", ";+");
                pos = i - this.scroll;
                if (o.contains(";+")) {
                    String[] sa = o.split(";+");
                    in = sa[0];
                    iz = Integer.parseInt(sa[1]);
                    im = Integer.parseInt(sa[2]);
                    item = JRMCoreH.getItemByText((String)in);
                    if (item == null) continue;
                    is = new ItemStack(item, iz, im);
                    n = is.stackSize + " " + item.getItemStackDisplayName(is);
                    fn = var8.getStringWidth(n);
                    this.buttonList.add(new DBCGuiButtons01(i, posX - fn / 2 - 5, guiTop + 5 + pos * 21 + j * 10, fn + 10, 20, n));
                    continue;
                }
                if (this.KiColorSlcted >= 0 && o.equals("kicolor")) {
                    int col = this.KiColorSlcted > 0 ? this.KiColorSlcted : 0xA8FFFF;
                    n = JRMCoreH.cct((String)JRMCoreH.trl((String)"dbc", (String)("wish" + o)), (Object[])new Object[0]);
                    fn = var8.getStringWidth(n);
                    this.buttonList.add(new JRMCoreGuiButtons00(i, posX - fn / 2 - 5, guiTop + 5 + pos * 21 + j * 10, fn + 10, 20, n, col));
                    continue;
                }
                String op = (o.equals("revive") || o.equals("reviventp")) && this.target.length() > 2 ? "S" : "";
                arg1 = op.equals("S") ? this.target : JRMCoreH.trl((String)"jrmc", (String)JRMCoreH.AlgnmntNms[JRMCoreH.Algnmnt((int)JRMCoreH.align)]);
                n = JRMCoreH.cct((String)JRMCoreH.trl((String)"dbc", (String)("wish" + o + op)), (Object[])new Object[]{arg1});
                fn = var8.getStringWidth(n);
                this.buttonList.add(new DBCGuiButtons01(i, posX - fn / 2 - 5, guiTop + 5 + pos * 21 + j * 10, fn + 10, 20, n));
            }
        }
        if (this.wish == 10) {
            tex = "jinryuudragonbc:wish.png";
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            tx = new ResourceLocation(tex);
            this.mc.renderEngine.bindTexture(tx);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
            j = 0;
            i2 = 0;
            a = JRMCoreH.Algnmnt((int)JRMCoreH.align);
            i2 = JRMCoreH.txt((String)JRMCoreH.trl((String)"dbc", (String)"selectplayer"), (String)JRMCoreH.clb, (int)0, (boolean)true, (int)(guiLeft + 5), (int)(guiTop + 5 + j * 10), (int)175);
            j += i2;
            int i21 = 0;
            if (playerlist != null && playerlist.length > 0) {
                for (int i3 = 0; i3 < playerlist.length; ++i3) {
                    if (i21 > 14 + this.ipg * 14 || i21 < 0 + this.ipg * 14) continue;
                    String n2 = playerlist[i3];
                    this.buttonList.add(new JRMCoreGuiButtons01(1000 + i3, guiLeft + xSize / 2 - 80, guiTop + (ySize + 1) / 2 - 84 + i21 * 10 - this.ipg * 14 * 10, this.fontRendererObj.getStringWidth(n2), n2, 0));
                    ++i21;
                }
            }
            if (JRMCoreH.plyrs.length > 14 + this.ipg * 14) {
                String n3 = JRMCoreH.trl((String)"jrmc", (String)"Next");
                this.buttonList.add(new JRMCoreGuiButtons00(-3, guiLeft + xSize / 2 + 100, guiTop + (ySize + 1) / 2 + 15, this.fontRendererObj.getStringWidth(n3) + 8, 20, n3, 0));
            }
            if (this.ipg != 0) {
                String p = JRMCoreH.trl((String)"jrmc", (String)"Prev");
                int pw = this.fontRendererObj.getStringWidth(p) + 8;
                this.buttonList.add(new JRMCoreGuiButtons00(-4, guiLeft + xSize / 2 - 100 - pw, guiTop + (ySize + 1) / 2 + 15, pw, 20, p, 0));
            }
            String s = JRMCoreH.trl((String)"jrmc", (String)"Back");
            int sw = this.fontRendererObj.getStringWidth(s) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(-5, guiLeft + xSize / 2 - 100 - sw, guiTop + (ySize + 1) / 2 + 40, sw, 20, s, 0));
        }
        if (this.wish == 11) {
            tex = "jinryuudragonbc:wish.png";
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            tx = new ResourceLocation(tex);
            this.mc.renderEngine.bindTexture(tx);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
            int a2 = 0;
            for (int X = 0; X < 128; ++X) {
                for (int Y = 0; Y < 128; ++Y) {
                    Color i4 = Color.getHSBColor((float)X * 2.0f / 255.0f, (float)Y * 2.0f / 255.0f, this.BrghtSlcted);
                    int cc = i4.getRed() * 65536 + i4.getGreen() * 256 + i4.getBlue();
                    if (cc == 0) {
                        a2 = 0xA8FFFF;
                        if (JRMCoreH.align <= 66 && JRMCoreH.align >= 33) {
                            a2 = 14526719;
                        }
                        if (JRMCoreH.align < 33) {
                            a2 = 0xFE0000;
                        }
                        this.buttonList.add(new JRMCoreGuiButtonC(-21, guiLeft + 5 + X, guiTop + 5 + Y, 1, 1, "", cc, a2));
                        continue;
                    }
                    this.buttonList.add(new JRMCoreGuiButtonC(-21, guiLeft + 5 + X, guiTop + 5 + Y, 1, 1, "", cc));
                }
            }
            if (this.BrghtSlcted == 0.0f) {
                var8.drawString(JRMCoreH.trl((String)"jrmc", (String)"AlignmentBased"), guiLeft + 5, guiTop + 140, 0);
            }
            this.buttonList.add(new JRMCoreGuiSlider00(-20, guiLeft + 135, guiTop + 5, "", this.BrghtSlcted, 1.0f));
            String n4 = JRMCoreH.trl((String)"jrmc", (String)"Back");
            int nw = this.fontRendererObj.getStringWidth(n4) + 8;
            this.buttonList.add(new JRMCoreGuiButtons00(-5, posX - 130 - nw, posY + 65, nw, 20, n4, 0));
        }
        super.drawScreen(x, y, f);
    }

    public boolean doesGuiPauseGame() {
        return false;
    }
}

