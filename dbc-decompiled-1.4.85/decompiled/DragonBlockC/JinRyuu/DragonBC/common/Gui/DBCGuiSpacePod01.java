/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.p.DBC.DBCPspacepod1
 *  JinRyuu.JRMCore.p.PD
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityClientPlayerMP
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.World
 *  org.lwjgl.opengl.GL11
 */
package JinRyuu.DragonBC.common.Gui;

import JinRyuu.DragonBC.common.DBCClient;
import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.DBCH;
import JinRyuu.DragonBC.common.Gui.DBCGuiButtonsC;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.p.DBC.DBCPspacepod1;
import JinRyuu.JRMCore.p.PD;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class DBCGuiSpacePod01
extends GuiScreen {
    public World world;
    public EntityPlayer player;
    public Minecraft mc;
    public int planet20;
    int px;
    int py;
    int pz;
    public static String guired = "jinryuudragonbc:guibutton05.png";
    public static String guigreen = "jinryuudragonbc:guibutton06.png";
    public static String buttontex = "";
    public static int spon = 0;
    public static int spoff = 0;
    public static int spstart = 0;
    public static int sp3 = 0;
    public static int sp2 = 0;
    public static int sp1 = 0;
    public static int ToNamek = 0;
    public static int ToVegeta = 0;
    public static int ToEarth = 0;
    public final int xSizeOfTexture = 400;
    public final int ySizeOfTexture = 300;
    public static int loadtime = 10;
    public static int sc = -1;
    public static int ss = 0;
    public static int ssl = 0;
    public static int ssD = 0;
    public static final int screen_OFF = -1;
    public static final int screen_Loading = 0;
    public static final int screen_MainMenu = 1;
    public static final int screen_Destinations = 2;
    public static final int screen_Travelling = 3;
    public static final int screen_Arrived = 4;
    public static final int panel_left_mode = 0;
    public static final int panel_mid_on = 1;
    public static final int panel_right_ok = 2;
    public static final ResourceLocation Panel = new ResourceLocation("jinryuudragonbc:sppanel.png");
    public static final int[] dests = new int[]{DBCConfig.planetEarth, DBCConfig.planetNamek, DBCConfig.planetVegeta};
    public static final int[] destsTP = new int[]{3, 1, 2};

    public DBCGuiSpacePod01(int x, int y, int z) {
        this.world = DBCClient.mc.theWorld;
        this.player = DBCClient.mc.thePlayer;
        this.mc = DBCClient.mc;
        this.planet20 = 0;
        this.xSizeOfTexture = 400;
        this.ySizeOfTexture = 300;
        this.px = x;
        this.py = y;
        this.pz = z;
    }

    public void initGui() {
        this.buttonList.clear();
    }

    public void actionPerformed2(GuiButton button) {
        EntityClientPlayerMP var4 = this.mc.thePlayer;
        WorldClient var3 = this.mc.theWorld;
        if (button.id == 0) {
            if (spon == 0) {
                spon = 1;
            } else {
                this.spResetCounters();
            }
        }
        if (button.id == 1) {
            this.spResetCounters();
            this.mc.thePlayer.closeScreen();
        }
        if (button.id == 2) {
            int dbcspacepod1;
            if (sp3 == 0) {
                if (sp2 == 0) {
                    if (sp1 == 0) {
                        this.mc.thePlayer.closeScreen();
                        this.spResetCounters();
                    }
                }
            }
            if (sp3 == 1) {
                if (sp2 == 0) {
                    if (sp1 == 0) {
                        this.mc.thePlayer.closeScreen();
                        ToEarth = 1;
                        ToNamek = 0;
                        ToVegeta = 0;
                        this.spResetCounters();
                    }
                }
            }
            if (sp3 == 0) {
                if (sp2 == 1) {
                    if (sp1 == 0) {
                        this.mc.thePlayer.closeScreen();
                        ToEarth = 0;
                        ToNamek = 0;
                        ToVegeta = 1;
                        this.spResetCounters();
                    }
                }
            }
            if (sp3 == 0) {
                if (sp2 == 0) {
                    if (sp1 == 1) {
                        this.mc.thePlayer.closeScreen();
                        ToEarth = 0;
                        ToNamek = 1;
                        ToVegeta = 0;
                        this.spResetCounters();
                    }
                }
            }
            if (ToEarth == 1) {
                ToEarth = 0;
                ToNamek = 0;
                ToVegeta = 0;
                dbcspacepod1 = 3;
                PD.sendToServer((IMessage)new DBCPspacepod1((int)((byte)dbcspacepod1)));
            }
            if (ToVegeta == 1) {
                ToEarth = 0;
                ToNamek = 0;
                ToVegeta = 0;
                dbcspacepod1 = 2;
                PD.sendToServer((IMessage)new DBCPspacepod1((int)((byte)dbcspacepod1)));
            }
            if (ToNamek == 1) {
                ToEarth = 0;
                ToNamek = 0;
                ToVegeta = 0;
                dbcspacepod1 = 1;
                PD.sendToServer((IMessage)new DBCPspacepod1((int)((byte)dbcspacepod1)));
            }
        }
        if (button.id == 3) {
            sp3 = 1;
            sp2 = 0;
            sp1 = 0;
        }
        if (button.id == 4) {
            sp3 = 0;
            sp2 = 1;
            sp1 = 0;
        }
        if (button.id == 5) {
            sp3 = 0;
            sp2 = 0;
            sp1 = 1;
        }
        if (button.id == 6) {
            sp3 = 0;
            sp2 = 0;
            sp1 = 0;
            ToEarth = 0;
            ToNamek = 0;
            ToVegeta = 0;
        }
    }

    public void spResetCounters() {
        spon = 0;
        spoff = 0;
        spstart = 0;
        sp3 = 0;
        sp2 = 0;
        sp1 = 0;
    }

    public void actionPerformed(GuiButton button) {
        if (button.id == 1) {
            if (sc == -1) {
                loadtime = 10;
                sc = 0;
            } else {
                sc = -1;
                this.mc.thePlayer.closeScreen();
            }
        } else if (button.id == 0) {
            if (sc == 2 && ++ss > ssl) {
                ss = 0;
            }
        } else if (button.id == 2) {
            if (sc == 1) {
                sc = 2;
            } else if (sc == 2) {
                switch (ss) {
                    case 0: {
                        sc = 1;
                        break;
                    }
                    case 1: {
                        PD.sendToServer((IMessage)new DBCPspacepod1(ssD));
                        sc = 1;
                        break;
                    }
                    case 2: {
                        PD.sendToServer((IMessage)new DBCPspacepod1(ssD));
                        sc = 1;
                        break;
                    }
                }
            }
            ss = 0;
        }
    }

    public void drawScreen(int x, int y, float f) {
        this.buttonList.clear();
        ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        int var6 = var5.getScaledWidth();
        int var7 = var5.getScaledHeight();
        FontRenderer var8 = this.fontRendererObj;
        String spacepod = "jinryuudragonbc:spacepodGUI01.png";
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation tx = new ResourceLocation(spacepod);
        this.mc.renderEngine.bindTexture(tx);
        Tessellator var3 = Tessellator.instance;
        var3.startDrawingQuads();
        var3.addVertexWithUV(0.0, (double)var7, -90.0, 0.0, 1.0);
        var3.addVertexWithUV((double)var6, (double)var7, -90.0, 1.0, 1.0);
        var3.addVertexWithUV((double)var6, 0.0, -90.0, 1.0, 0.0);
        var3.addVertexWithUV(0.0, 0.0, -90.0, 0.0, 0.0);
        var3.draw();
        int posX = this.width / 2;
        int posY = this.height / 2;
        int xSize = 140;
        int ySize = 70;
        int guiLeft = (this.width - xSize) / 2;
        int guiTop = (this.height - ySize) / 2;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation guiLocation = Panel;
        this.mc.renderEngine.bindTexture(guiLocation);
        this.drawTexturedModalRect(posX - 90, posY - 44, 0, 0 + (sc == -1 ? 0 : 70), xSize, ySize);
        this.buttonList.add(0, new DBCGuiButtonsC(0, posX - 90, posY + 29, 50, 15, "", guigreen));
        this.buttonList.add(1, new DBCGuiButtonsC(1, posX - 35, posY + 29, 30, 15, "On", guired));
        this.buttonList.add(2, new DBCGuiButtonsC(2, posX + 0, posY + 29, 50, 15, "", guigreen));
        if (sc == -1) {
            ((DBCGuiButtonsC)((Object)this.buttonList.get((int)0))).displayString = "";
            ((DBCGuiButtonsC)((Object)this.buttonList.get((int)1))).displayString = JRMCoreH.trl((String)"jrmc", (String)"On");
            ((DBCGuiButtonsC)((Object)this.buttonList.get((int)2))).displayString = "";
        } else if (sc == 0) {
            if (loadtime > 0) {
                ((DBCGuiButtonsC)((Object)this.buttonList.get((int)0))).displayString = "";
                ((DBCGuiButtonsC)((Object)this.buttonList.get((int)1))).displayString = "";
                ((DBCGuiButtonsC)((Object)this.buttonList.get((int)2))).displayString = "";
                --loadtime;
                var8.drawString(JRMCoreH.cllg + "LOADING LAUNCHER", posX - 70, posY - 30, 0);
            } else {
                sc = 1;
            }
        } else if (sc == 1) {
            ((DBCGuiButtonsC)((Object)this.buttonList.get((int)0))).displayString = JRMCoreH.trl((String)"jrmc", (String)"Select");
            ((DBCGuiButtonsC)((Object)this.buttonList.get((int)1))).displayString = JRMCoreH.trl((String)"jrmc", (String)"Off");
            ((DBCGuiButtonsC)((Object)this.buttonList.get((int)2))).displayString = JRMCoreH.trl((String)"jrmc", (String)"OK");
            var8.drawString(JRMCoreH.cllg + JRMCoreH.trl((String)"jrmc", (String)"Planet") + ": " + JRMCoreH.cly + JRMCoreH.trl((String)"dbc", (String)DBCH.plntNms.get(DBCClient.mc.thePlayer.dimension)), posX - 80, posY - 40, 0);
            ssl = 0;
            var8.drawString(JRMCoreH.cllg + "> " + JRMCoreH.trl((String)"jrmc", (String)"Destinations"), posX - 70, posY - 20, 0);
        } else if (sc == 2) {
            ((DBCGuiButtonsC)((Object)this.buttonList.get((int)0))).displayString = JRMCoreH.trl((String)"jrmc", (String)"Select");
            ((DBCGuiButtonsC)((Object)this.buttonList.get((int)1))).displayString = JRMCoreH.trl((String)"jrmc", (String)"Off");
            ((DBCGuiButtonsC)((Object)this.buttonList.get((int)2))).displayString = JRMCoreH.trl((String)"jrmc", (String)"OK");
            var8.drawString(JRMCoreH.cllg + JRMCoreH.trl((String)"jrmc", (String)"Destinations"), posX - 80, posY - 40, 0);
            ssl = 2;
            var8.drawString(JRMCoreH.cly + "> ", posX - 70, posY - 30 + ss * 10, 0);
            int i = 0;
            var8.drawString(JRMCoreH.cly + JRMCoreH.trl((String)"jrmc", (String)"Back"), posX - 60, posY - 30 + i * 10, 0);
            ++i;
            for (int j = 0; j < dests.length; ++j) {
                if (DBCClient.mc.thePlayer.dimension == dests[j]) continue;
                if (ss == i) {
                    ssD = destsTP[j];
                }
                var8.drawString(JRMCoreH.cllg + DBCH.plntNms.get(dests[j]), posX - 60, posY - 30 + i * 10, 0);
                ++i;
            }
        }
        super.drawScreen(x, y, f);
    }

    public boolean doesGuiPauseGame() {
        return false;
    }
}

