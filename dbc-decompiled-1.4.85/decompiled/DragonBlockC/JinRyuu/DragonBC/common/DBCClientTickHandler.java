/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreCliTicH
 *  JinRyuu.JRMCore.JRMCoreClient
 *  JinRyuu.JRMCore.JRMCoreConfig
 *  JinRyuu.JRMCore.JRMCoreH
 *  JinRyuu.JRMCore.JRMCoreHC
 *  JinRyuu.JRMCore.JRMCoreHDBC
 *  JinRyuu.JRMCore.JRMCoreKeyHandler
 *  JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings
 *  JinRyuu.JRMCore.i.ExtendedPlayer
 *  JinRyuu.JRMCore.mod_JRMCore
 *  JinRyuu.JRMCore.p.DBC.DBCPacketHandlerServer
 *  JinRyuu.JRMCore.p.DBC.DBCPdri
 *  JinRyuu.JRMCore.p.DBC.DBCPscouter1
 *  JinRyuu.JRMCore.p.DBC.DBCPscouter2
 *  JinRyuu.JRMCore.p.DBC.DBCPscouter3
 *  JinRyuu.JRMCore.p.DBC.DBCPscouter4
 *  JinRyuu.JRMCore.p.DBC.DBCPspacepod1
 *  JinRyuu.JRMCore.p.PD
 *  JinRyuu.JRMCore.server.config.dbc.JGConfigDBCGoD
 *  JinRyuu.JRMCore.server.config.dbc.JGConfigDBCInstantTransmission
 *  cpw.mods.fml.client.FMLClientHandler
 *  cpw.mods.fml.common.eventhandler.SubscribeEvent
 *  cpw.mods.fml.common.gameevent.TickEvent$ClientTickEvent
 *  cpw.mods.fml.common.gameevent.TickEvent$Phase
 *  cpw.mods.fml.common.gameevent.TickEvent$RenderTickEvent
 *  cpw.mods.fml.common.network.simpleimpl.IMessage
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityClientPlayerMP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.ChatStyle
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.StatCollector
 *  net.minecraft.world.World
 *  org.lwjgl.input.Keyboard
 */
package JinRyuu.DragonBC.common;

import JinRyuu.DragonBC.common.Blocks.BlocksDBC;
import JinRyuu.DragonBC.common.DBCClient;
import JinRyuu.DragonBC.common.DBCConfig;
import JinRyuu.DragonBC.common.DBCEH;
import JinRyuu.DragonBC.common.DBCH;
import JinRyuu.DragonBC.common.DBCKeyHandler;
import JinRyuu.DragonBC.common.DBCKiAttacks;
import JinRyuu.DragonBC.common.DBCKiTech;
import JinRyuu.DragonBC.common.Gui.DBCGuiSpacePod01;
import JinRyuu.DragonBC.common.Gui.ScouterGui;
import JinRyuu.DragonBC.common.Npcs.EntityMasterEnma;
import JinRyuu.DragonBC.common.Npcs.EntityMasterKaio;
import JinRyuu.DragonBC.common.Render.SpacePod01Entity;
import JinRyuu.DragonBC.common.mod_DragonBC;
import JinRyuu.JRMCore.JRMCoreCliTicH;
import JinRyuu.JRMCore.JRMCoreClient;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.JRMCoreHC;
import JinRyuu.JRMCore.JRMCoreHDBC;
import JinRyuu.JRMCore.JRMCoreKeyHandler;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import JinRyuu.JRMCore.i.ExtendedPlayer;
import JinRyuu.JRMCore.mod_JRMCore;
import JinRyuu.JRMCore.p.DBC.DBCPacketHandlerServer;
import JinRyuu.JRMCore.p.DBC.DBCPdri;
import JinRyuu.JRMCore.p.DBC.DBCPscouter1;
import JinRyuu.JRMCore.p.DBC.DBCPscouter2;
import JinRyuu.JRMCore.p.DBC.DBCPscouter3;
import JinRyuu.JRMCore.p.DBC.DBCPscouter4;
import JinRyuu.JRMCore.p.DBC.DBCPspacepod1;
import JinRyuu.JRMCore.p.PD;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCGoD;
import JinRyuu.JRMCore.server.config.dbc.JGConfigDBCInstantTransmission;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

public class DBCClientTickHandler {
    private int kibar;
    public static int countT = 0;
    public static int warnT = 0;
    public static int startcountT = 0;
    public static int ScFunc0 = 0;
    public static int ScFunc00 = 0;
    public static int ScFunc01 = 0;
    public static int ScFunc02 = 0;
    public static int ScFunc03 = 0;
    public static int ScFunc04 = 0;
    public static int ScFunc05 = 0;
    public static int ScFuncSB = 0;
    public static int heightplus = 0;
    public static int tick = 0;
    public static int runOutOfKi = 0;
    public static int c = 0;
    public static boolean selected = false;
    public static short csicsu = 0;
    public static boolean KAchrgOn = false;
    private int previousTime = 0;
    private int currentTime = 0;
    private int countingValue = 0;
    public static int counterValue = 0;
    ArrayList<double[]> dbs = new ArrayList();
    private static int gdb = 0;
    private static int ticking;
    private static int TiLess;
    private static int TiSen;
    private Minecraft mc = DBCClient.mc;
    public static int time;
    public static int power;
    public static int jump;
    public static int ascend;
    public static int pup;
    public static int ptime;
    public static int partnorm;
    public static int inSuperTime;
    public static int inSuperTime2;
    public static int inSuperTime3;
    public static float explevel;
    public static String textura;
    public static Item SuperHair;
    public static Item NormalHair;
    public static Block BlockHair01;
    private int check = 0;
    public int test = 0;
    private int timeincham;
    private boolean liedown;
    private int curHand;
    private static boolean inc;
    public static boolean charge;
    public static int charg;
    public static int mountHelper;
    public static boolean instantTransmissionOn;
    public static boolean instantTransmissionRequestSent;
    public static Instant instantTransmissionPress;
    public static boolean instantTransmissionWarning;

    public static boolean isPlayerInCreativeMode() {
        return JRMCoreH.isInCreativeMode((Entity)DBCClient.mc.thePlayer);
    }

    public void onRenderTickInGUI(GuiScreen guiscreen) {
        if (this.mc.thePlayer != null) {
            EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
            ItemStack hand = player.inventory.getCurrentItem();
            ItemStack stackhead = ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).inventory.getStackInSlot(2);
            if (JRMCoreH.armTypScoutAllOn((ItemStack)stackhead) && DBCKeyHandler.ScFunc.getIsKeyPressed()) {
                if (++ScFuncSB > 3 && ScFunc00 == 0) {
                    if (ScFunc01 == 0 && ScFunc02 == 0 && ScFunc03 == 0 && ScFunc04 == 0) {
                        ScFunc00 = 1;
                        ScFuncSB = 0;
                        DBCKeyHandler.ScFunc.unPressAllKeys();
                    }
                }
                if (ScFuncSB > 3 && ScFunc00 == 1 && ScFunc01 == 0 && ScFunc02 == 0 && ScFunc03 == 0 && ScFunc04 == 0) {
                    ScFuncSB = 0;
                    DBCKeyHandler.ScFunc.unPressAllKeys();
                }
                if (ScFuncSB > 3 && ScFunc00 == 0) {
                    if (ScFunc01 == 1 && ScFunc02 == 0 && ScFunc03 == 0 && ScFunc04 == 0) {
                        ScFunc01 = 0;
                        ScFunc02 = 1;
                        ScFuncSB = 0;
                        KeyBinding.setKeyBindState((int)DBCKeyHandler.ScFunc.getKeyCode(), (boolean)false);
                    }
                }
                if (ScFuncSB > 3 && ScFunc00 == 0 && ScFunc01 == 0 && ScFunc02 == 1 && ScFunc03 == 0 && ScFunc04 == 0) {
                    ScFunc02 = 0;
                    ScFunc03 = 1;
                    ScFuncSB = 0;
                    KeyBinding.setKeyBindState((int)DBCKeyHandler.ScFunc.getKeyCode(), (boolean)false);
                }
                if (ScFuncSB > 3 && ScFunc00 == 0 && ScFunc01 == 0 && ScFunc02 == 0 && ScFunc03 == 1 && ScFunc04 == 0) {
                    ScFunc03 = 0;
                    ScFunc04 = 1;
                    ScFuncSB = 0;
                    KeyBinding.setKeyBindState((int)DBCKeyHandler.ScFunc.getKeyCode(), (boolean)false);
                }
                if (ScFuncSB > 3 && ScFunc00 == 0 && ScFunc01 == 0 && ScFunc02 == 0 && ScFunc03 == 0 && ScFunc04 == 1) {
                    ScFunc04 = 0;
                    ScFuncSB = 0;
                    ScFunc00 = 0;
                    KeyBinding.setKeyBindState((int)DBCKeyHandler.ScFunc.getKeyCode(), (boolean)false);
                }
            }
            DBCClient.scouterGui.renderScouter();
        }
    }

    public static boolean onHotbar(Item item, EntityPlayer player) {
        for (int i = 0; i < 9; ++i) {
            if (player.inventory.getStackInSlot(i) == null || player.inventory.getStackInSlot(i).getItem() != item) continue;
            return true;
        }
        return false;
    }

    public void onRenderTick() {
        this.currentTime = (int)(System.currentTimeMillis() / 1000L);
        if (this.currentTime != this.previousTime) {
            this.previousTime = this.currentTime;
            counterValue = this.countingValue;
            this.countingValue = 0;
        }
        if (this.currentTime == this.previousTime) {
            ++this.countingValue;
        }
        if (!this.mc.isGamePaused()) {
            for (int i = 0; i < JRMCoreH.techniqueCooldowns.length; ++i) {
                if (JRMCoreH.techniqueCooldowns[i] >= 0.0f) {
                    int n = i;
                    JRMCoreH.techniqueCooldowns[n] = JRMCoreH.techniqueCooldowns[n] - 10.0f / (float)counterValue;
                }
                if (!(JRMCoreH.techniqueCooldowns[i] <= 0.0f)) continue;
                JRMCoreH.techniqueCooldowns[i] = 0.0f;
            }
            JRMCoreH.updateAllOldCooldownValues();
        }
        if (this.mc.inGameHasFocus) {
            DBCClientTickHandler dBCClientTickHandler = this;
            if (dBCClientTickHandler.mc.isGuiEnabled()) {
                EntityClientPlayerMP var4 = Minecraft.getMinecraft().thePlayer;
                ItemStack hand = this.mc.thePlayer.inventory.getCurrentItem();
                ItemStack stackhead = ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).inventory.getStackInSlot(2);
                if (stackhead != null && JRMCoreH.armTypScoutAllOn((ItemStack)stackhead)) {
                    if (DBCKeyHandler.ScFunc.getIsKeyPressed()) {
                        if (++ScFuncSB > 3 && ScFunc00 == 0) {
                            if (ScFunc01 == 0 && ScFunc02 == 0 && ScFunc03 == 0 && ScFunc04 == 0 && ScFunc05 == 0) {
                                ScFunc00 = 1;
                                ScFuncSB = 0;
                                DBCKeyHandler.ScFunc.unPressAllKeys();
                            }
                        }
                        if (ScFuncSB > 3 && ScFunc00 == 1 && ScFunc01 == 0 && ScFunc02 == 0 && ScFunc03 == 0 && ScFunc04 == 0 && ScFunc05 == 0) {
                            ScFuncSB = 0;
                            DBCKeyHandler.ScFunc.unPressAllKeys();
                        }
                        if (ScFuncSB > 3 && ScFunc00 == 0) {
                            if (ScFunc01 == 1 && ScFunc02 == 0 && ScFunc03 == 0 && ScFunc04 == 0 && ScFunc05 == 0) {
                                ScFunc01 = 0;
                                ScFunc02 = 1;
                                ScFuncSB = 0;
                                KeyBinding.setKeyBindState((int)DBCKeyHandler.ScFunc.getKeyCode(), (boolean)false);
                            }
                        }
                        if (ScFuncSB > 3 && ScFunc00 == 0 && ScFunc01 == 0 && ScFunc02 == 1 && ScFunc03 == 0 && ScFunc04 == 0 && ScFunc05 == 0) {
                            ScFunc02 = 0;
                            ScFunc03 = 1;
                            ScFuncSB = 0;
                            KeyBinding.setKeyBindState((int)DBCKeyHandler.ScFunc.getKeyCode(), (boolean)false);
                        }
                        if (ScFuncSB > 3 && ScFunc00 == 0 && ScFunc01 == 0 && ScFunc02 == 0 && ScFunc03 == 1 && ScFunc04 == 0 && ScFunc05 == 0) {
                            ScFunc03 = 0;
                            ScFunc04 = 1;
                            ScFuncSB = 0;
                            KeyBinding.setKeyBindState((int)DBCKeyHandler.ScFunc.getKeyCode(), (boolean)false);
                        }
                        if (ScFuncSB > 3 && ScFunc00 == 0 && ScFunc01 == 0 && ScFunc02 == 0 && ScFunc03 == 0 && ScFunc04 == 1 && ScFunc05 == 0) {
                            ScFunc04 = 0;
                            ScFunc05 = 1;
                            ScFuncSB = 0;
                            KeyBinding.setKeyBindState((int)DBCKeyHandler.ScFunc.getKeyCode(), (boolean)false);
                        }
                        if (ScFuncSB > 3 && ScFunc00 == 0 && ScFunc01 == 0 && ScFunc02 == 0 && ScFunc03 == 0 && ScFunc04 == 0 && ScFunc05 == 1) {
                            ScFunc05 = 0;
                            ScFuncSB = 0;
                            ScFunc00 = 0;
                            KeyBinding.setKeyBindState((int)DBCKeyHandler.ScFunc.getKeyCode(), (boolean)false);
                        }
                    }
                } else if (DBCKeyHandler.ScFunc.isPressed() && JRMCoreH.SklLvl((int)6) > 0) {
                    if (++DBCEH.kisnsMd > 4) {
                        DBCEH.kisnsMd = 0;
                    }
                    String t = JRMCoreH.trlai((String)"dbc", (String)("kisensemode" + DBCEH.kisnsMd));
                    ChatStyle color = new ChatStyle().setColor(EnumChatFormatting.YELLOW);
                    JRMCoreClient.mc.thePlayer.addChatMessage(new ChatComponentTranslation(t, new Object[0]).setChatStyle(color));
                }
                if (this.mc.gameSettings.thirdPersonView == 0) {
                    DBCClient.scouterGui.renderScouter();
                }
            }
        }
    }

    public void upd(EntityPlayer p) {
        if (++gdb > 40) {
            gdb = 0;
            this.dbs.clear();
            Block blockID = null;
            if (p.worldObj.provider.dimensionId == 20) {
                blockID = BlocksDBC.BlockNamekDragonBall;
            }
            if (p.worldObj.provider.dimensionId == 0) {
                blockID = BlocksDBC.BlockDragonBall;
            }
            int m = 80;
            int l1 = MathHelper.floor_double((double)p.posX);
            int i11 = MathHelper.floor_double((double)p.posZ);
            for (int j11 = l1 - m; j11 <= l1 + m; ++j11) {
                for (int j2 = i11 - m; j2 <= i11 + m; ++j2) {
                    for (int k2 = 109; k2 >= 64; --k2) {
                        if (p.worldObj.getBlock(j11, k2, j2) != blockID) continue;
                        double[] d = new double[]{j11, j2};
                        this.dbs.add(d);
                    }
                }
            }
        }
    }

    public void DragonRadar(EntityPlayer p) {
        this.upd(p);
        int pitch = (int)p.rotationPitch + 60;
        for (int i = 0; i < this.dbs.size(); ++i) {
            DBCClient.SagaSys.DragonDetect(this.dbs.get(i)[0] - p.posX, this.dbs.get(i)[1] - p.posZ, pitch > 0 ? pitch : 0);
        }
    }

    public void onTickInGUI() {
        GuiScreen guiscreen = this.mc.currentScreen;
        if (DBCGuiSpacePod01.ToEarth == 1 || DBCGuiSpacePod01.ToVegeta == 1 || DBCGuiSpacePod01.ToNamek == 1) {
            int dbcspacepod1 = DBCGuiSpacePod01.ToEarth == 1 ? 3 : (DBCGuiSpacePod01.ToVegeta == 1 ? 2 : (DBCGuiSpacePod01.ToNamek == 1 ? 1 : 0));
            PD.sendToServer((IMessage)new DBCPspacepod1(dbcspacepod1));
        }
    }

    public static void dri(int a) {
        PD.sendToServer((IMessage)new DBCPdri(a));
    }

    public void changeCurEnAtSlct(int par1) {
        byte lmt;
        byte by = lmt = JRMCoreH.mrAtts ? (byte)8 : 4;
        if (par1 > 0) {
            par1 = 1;
        }
        if (par1 < 0) {
            par1 = -1;
        }
        JRMCoreH.EnAtSlct = (byte)(JRMCoreH.EnAtSlct - par1);
        while (JRMCoreH.EnAtSlct < 0) {
            JRMCoreH.EnAtSlct = (byte)(JRMCoreH.EnAtSlct + lmt);
        }
        while (JRMCoreH.EnAtSlct >= lmt) {
            JRMCoreH.EnAtSlct = (byte)(JRMCoreH.EnAtSlct - lmt);
        }
    }

    public void onTickInGameEnd() {
    }

    public void onTickInGame() {
        EntityClientPlayerMP var4 = Minecraft.getMinecraft().thePlayer;
        WorldClient var3 = FMLClientHandler.instance().getClient().theWorld;
        if (this.mc.theWorld != null && this.mc.thePlayer != null && !this.mc.thePlayer.isDead) {
            ItemStack hand;
            if (this.mc.isIntegratedServerRunning()) {
                // empty if block
            }
            if (mountHelper != 0) {
                var4.mountEntity(var4.worldObj.getEntityByID(mountHelper));
                if (var4.isRiding()) {
                    mountHelper = 0;
                }
            }
            boolean inAabb = false;
            if (var4.dimension == DBCConfig.dimTimeChamber) {
                ++this.timeincham;
                if (this.timeincham >= 24000) {
                    DBCKiAttacks.dbctick(-6);
                    this.timeincham = 0;
                    var4.addChatMessage((IChatComponent)new ChatComponentText(StatCollector.translateToLocal((String)"dbc.HTC.toolong")));
                }
                inAabb = true;
            }
            if (var4.dimension == DBCConfig.dimNullRealm && this.mc.thePlayer.posY <= (double)DBCConfig.NullRealmMinimumHeight) {
                JRMCoreHDBC.requestNullRealmKnockout();
            }
            if (!inAabb) {
                this.timeincham = 0;
            }
            if (var4.dimension == DBCConfig.otherWorld) {
                AxisAlignedBB aabbkaio;
                List kaio;
                AxisAlignedBB par2AxisAlignedBB = AxisAlignedBB.getBoundingBox((double)60.0, (double)10.0, (double)35.0, (double)90.0, (double)110.0, (double)65.0);
                List enma = var3.getEntitiesWithinAABB(EntityMasterEnma.class, par2AxisAlignedBB);
                if (enma.size() > 1) {
                    for (int i = 1; enma.size() > i; ++i) {
                        Entity m = (Entity)enma.get(i);
                        JRMCoreH.KAsounds((Entity)m, (int)999);
                    }
                }
                if ((kaio = var3.getEntitiesWithinAABB(EntityMasterKaio.class, aabbkaio = AxisAlignedBB.getBoundingBox((double)87.0, (double)1.0, (double)-3739.0, (double)127.0, (double)140.0, (double)-3699.0))).size() > 1) {
                    for (int i = 1; kaio.size() > i; ++i) {
                        Entity m = (Entity)kaio.get(i);
                        JRMCoreH.KAsounds((Entity)m, (int)999);
                    }
                }
            }
            if (var4.dimension == 0) {
                AxisAlignedBB kn = AxisAlignedBB.getBoundingBox((double)76.0, (double)64.0, (double)41.0, (double)79.0, (double)129.0, (double)44.0);
                List l3 = var4.worldObj.getEntitiesWithinAABB(EntityPlayer.class, kn);
                for (int i = 0; i < l3.size(); ++i) {
                    boolean flag;
                    EntityPlayer e2 = (EntityPlayer)l3.get(i);
                    if (e2.getCommandSenderName() != var4.getCommandSenderName()) continue;
                    float f5 = 0.15f;
                    if (var4.motionX < (double)(-f5)) {
                        var4.motionX = -f5;
                    }
                    if (var4.motionX > (double)f5) {
                        var4.motionX = f5;
                    }
                    if (var4.motionZ < (double)(-f5)) {
                        var4.motionZ = -f5;
                    }
                    if (var4.motionZ > (double)f5) {
                        var4.motionZ = f5;
                    }
                    var4.fallDistance = 0.0f;
                    if (var4.motionY < -0.15) {
                        var4.motionY = -0.15;
                    }
                    boolean bl = flag = var4.isSneaking() && var4 instanceof EntityPlayer;
                    if (flag && var4.motionY < 0.0) {
                        var4.motionY = 0.0;
                    }
                    if (!var4.isCollidedHorizontally) continue;
                    var4.motionY = 0.2;
                }
            }
            if ((hand = this.mc.thePlayer.inventory.getCurrentItem()) != null || !DBCClient.mc.gameSettings.keyBindUseItem.getIsKeyPressed() || JRMCoreH.KASelected != 16 || JRMCoreKeyHandler.KiCharge.getIsKeyPressed() || JRMCoreH.kiAmount > 0) {
                // empty if block
            }
            if (DBCGuiSpacePod01.ToEarth == 1 || DBCGuiSpacePod01.ToVegeta == 1 || DBCGuiSpacePod01.ToNamek == 1) {
                int dbcspacepod1 = DBCGuiSpacePod01.ToEarth == 1 ? 3 : (DBCGuiSpacePod01.ToVegeta == 1 ? 2 : (DBCGuiSpacePod01.ToNamek == 1 ? 1 : 0));
                PD.sendToServer((IMessage)new DBCPspacepod1(dbcspacepod1));
            }
            if (ScFunc00 == 1) {
                if (++ScFunc0 == 2) {
                    ScFunc01 = 0;
                    ScFunc00 = 1;
                    ScFunc02 = 0;
                    ScFunc03 = 0;
                    ScFunc04 = 0;
                    ScFunc05 = 0;
                    int dbcscouter1 = var4.getEntityId();
                    PD.sendToServer((IMessage)new DBCPscouter1(dbcscouter1));
                }
                if (ScFunc0 == 30) {
                    ScFunc01 = 1;
                    ScFunc00 = 0;
                    ScFunc0 = 0;
                }
            }
            if (ScouterGui.count == 1 && ++countT == 5) {
                int dbcscouter2 = var4.getEntityId();
                PD.sendToServer((IMessage)new DBCPscouter2(dbcscouter2));
                countT = 0;
            }
            if (ScouterGui.warn == 1 && ++warnT == 10) {
                int dbcscouter3 = var4.getEntityId();
                PD.sendToServer((IMessage)new DBCPscouter3(dbcscouter3));
                warnT = 10;
            }
            if (ScouterGui.warn != 1) {
                warnT = 0;
            }
            if (ScouterGui.startcount == 1) {
                ++startcountT;
                if (warnT == 10) {
                    int dbcscouter4 = var4.getEntityId();
                    PD.sendToServer((IMessage)new DBCPscouter4(dbcscouter4));
                    startcountT = 10;
                }
            }
            if (ScouterGui.startcount != 1) {
                startcountT = 0;
            }
            if (DBCClient.mc.thePlayer.ridingEntity != null && DBCClient.mc.thePlayer.ridingEntity.getClass() == SpacePod01Entity.class && DBCClient.mc.gameSettings.keyBindPickBlock.getIsKeyPressed()) {
                DBCClient.mc.thePlayer.openGui((Object)mod_DragonBC.instance, 0, (World)DBCClient.mc.theWorld, (int)DBCClient.mc.thePlayer.posX, (int)DBCClient.mc.thePlayer.posY, (int)DBCClient.mc.thePlayer.posZ);
            }
            if (DBCClient.mc.thePlayer.ridingEntity != null) {
                if (DBCClient.mc.gameSettings.keyBindForward.getIsKeyPressed()) {
                    JRMCoreH.forw = 1.0;
                    DBCClientTickHandler.dri(1);
                } else if (DBCClient.mc.gameSettings.keyBindBack.getIsKeyPressed()) {
                    JRMCoreH.forw = 2.0;
                    DBCClientTickHandler.dri(2);
                }
                if (DBCClient.mc.gameSettings.keyBindLeft.getIsKeyPressed()) {
                    JRMCoreH.forw = 1.0;
                    DBCClientTickHandler.dri(5);
                } else if (DBCClient.mc.gameSettings.keyBindRight.getIsKeyPressed()) {
                    JRMCoreH.forw = 2.0;
                    DBCClientTickHandler.dri(6);
                }
                if (DBCClient.mc.gameSettings.keyBindJump.getIsKeyPressed() && DBCClient.mc.thePlayer.ridingEntity != null) {
                    JRMCoreH.forw = 3.0;
                    DBCClientTickHandler.dri(3);
                } else if (JRMCoreKeyHandler.Fn.getIsKeyPressed() && DBCClient.mc.thePlayer.ridingEntity != null) {
                    JRMCoreH.forw = 4.0;
                    DBCClientTickHandler.dri(4);
                } else {
                    JRMCoreH.forw = 0.0;
                }
            }
            if (JRMCoreH.PlyrPwr((EntityPlayer)var4) == 1) {
                int itLevel;
                boolean itEnabled;
                if (JRMCoreH.curRelease != 0 && !JRMCoreH.StusEfctsMe((int)11) && !JRMCoreH.kob) {
                    ExtendedPlayer props;
                    int type;
                    byte[] sts;
                    boolean key = DBCClient.mc.gameSettings.keyBindPickBlock.getIsKeyPressed();
                    if (hand == null && key && !DBCClient.mc.gameSettings.keyBindUseItem.getIsKeyPressed() && !JRMCoreH.isChrgng) {
                        byte b = 0;
                        if (JRMCoreKeyHandler.Fn.getIsKeyPressed()) {
                            b = 1;
                        }
                        DBCKiTech.EnAtSlct(b);
                        KeyBinding cfr_ignored_0 = DBCClient.mc.gameSettings.keyBindPickBlock;
                        KeyBinding.setKeyBindState((int)DBCClient.mc.gameSettings.keyBindPickBlock.getKeyCode(), (boolean)false);
                        DBCClientTickHandler.nuller();
                    } else if (JRMCoreKeyHandler.Fn.getIsKeyPressed() && !DBCClient.mc.gameSettings.keyBindUseItem.getIsKeyPressed() && !JRMCoreH.isChrgng) {
                        int k = JRMCoreCliTicH.mw;
                        if (k != 0) {
                            this.changeCurEnAtSlct(k);
                            var4.inventory.currentItem = this.curHand;
                            if (DBCClient.mc.gameSettings.noclip) {
                                if (k > 0) {
                                    k = 1;
                                }
                                if (k < 0) {
                                    k = -1;
                                }
                                DBCClient.mc.gameSettings.noclipRate += (float)k * 0.25f;
                            }
                        }
                        for (int i = 0; i < 8; ++i) {
                            if (Keyboard.getEventKey() != 2 + i) continue;
                            JRMCoreH.EnAtSlct = (byte)(JRMCoreH.mrAtts ? i : (i < 4 ? i : i - 4));
                            var4.inventory.currentItem = this.curHand;
                        }
                        var4.inventory.currentItem = this.curHand;
                        DBCClientTickHandler.nuller();
                    }
                    this.curHand = var4.inventory.currentItem;
                    float p = DBCClient.mc.thePlayer.rotationPitch < 0.0f ? (float)((int)DBCClient.mc.thePlayer.rotationPitch * -1) : (float)((int)DBCClient.mc.thePlayer.rotationPitch);
                    float y = DBCClient.mc.thePlayer.rotationYaw < 0.0f ? (float)((int)DBCClient.mc.thePlayer.rotationYaw * -1) : (float)((int)DBCClient.mc.thePlayer.rotationYaw);
                    boolean rotat = p > DBCH.RotPic && p > DBCH.RotPic + 0.1f || p < DBCH.RotPic && p < DBCH.RotPic - 0.1f || y > DBCH.RotYaw && y > DBCH.RotYaw + 0.1f || y < DBCH.RotYaw && y < DBCH.RotYaw - 0.1f;
                    byte selectionID = JRMCoreH.EnAtSlct;
                    float currentCooldown = JRMCoreH.techCD((byte)selectionID);
                    String[] tech = JRMCoreH.tech((int)selectionID);
                    if (hand == null && DBCClient.mc.gameSettings.keyBindUseItem.getIsKeyPressed() && JRMCoreKeyHandler.Fn.getIsKeyPressed() && JRMCoreH.curEnergy > 0 && !JRMCoreKeyHandler.KiCharge.getIsKeyPressed() && tech != null && DBCKiTech.KAkiEn(selectionID, JRMCoreH.curRelease, JRMCoreH.chrgPrc) && JRMCoreConfig.dat5695[JRMCoreH.techDBCty((String[])tech)]) {
                        ExtendedPlayer props2;
                        sts = JRMCoreH.tech_statmods((String)tech[19]);
                        type = JRMCoreH.techDBCty((String[])tech);
                        if (!JRMCoreH.isShtng && currentCooldown == 0.0f) {
                            int WILo;
                            JRMCoreH.isChrgng = JRMCoreH.techDBCctWc((String[])tech, (byte[])sts) > 10.0f;
                            int f = (int)(50.0f / JRMCoreH.techDBCctWc((String[])tech, (byte[])sts) * (float)JRMCoreH.charged);
                            int WIL = WILo = JRMCoreH.PlyrAttrbts[3];
                            boolean c = JRMCoreH.isFused();
                            WIL = JRMCoreH.getPlayerAttribute((EntityPlayer)DBCClient.mc.thePlayer, (int[])JRMCoreH.PlyrAttrbts, (int)3, (int)JRMCoreH.State, (int)JRMCoreH.State2, (int)JRMCoreH.Race, (String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.curRelease, (int)JRMCoreH.getArcRsrv(), (boolean)JRMCoreH.StusEfctsMe((int)14), (boolean)JRMCoreH.StusEfctsMe((int)12), (boolean)JRMCoreH.StusEfctsMe((int)5), (boolean)JRMCoreH.StusEfctsMe((int)13), (boolean)JRMCoreH.StusEfctsMe((int)19), (boolean)JRMCoreH.StusEfctsMe((int)20), (int)1, (String[])JRMCoreH.PlyrSkills, (boolean)c, (String)JRMCoreH.getMajinAbsorption());
                            int WIL2 = JRMCoreH.getPlayerAttribute((EntityPlayer)DBCClient.mc.thePlayer, (int[])JRMCoreH.PlyrAttrbts, (int)3, (int)0, (int)0, (int)JRMCoreH.Race, (String)JRMCoreH.PlyrSkillX, (int)JRMCoreH.curRelease, (int)JRMCoreH.getArcRsrv(), (boolean)JRMCoreH.StusEfctsMe((int)14), (boolean)JRMCoreH.StusEfctsMe((int)12), (boolean)false, (boolean)false, (boolean)false, (boolean)false, (int)1, (String[])JRMCoreH.PlyrSkills, (boolean)c, (String)JRMCoreH.getMajinAbsorption());
                            int stat = JRMCoreH.stat((Entity)DBCClient.mc.thePlayer, (int)3, (int)JRMCoreH.Pwrtyp, (int)4, (int)WIL, (int)JRMCoreH.Race, (int)JRMCoreH.Class, (float)0.0f);
                            int stat2 = JRMCoreH.stat((Entity)DBCClient.mc.thePlayer, (int)3, (int)JRMCoreH.Pwrtyp, (int)4, (int)WIL2, (int)JRMCoreH.Race, (int)JRMCoreH.Class, (float)0.0f);
                            float costKi = (float)(JRMCoreH.techDBCkic((String[])tech, (int)stat2, (byte[])sts) * JRMCoreH.chrgPrc) * 0.02f * (float)JRMCoreH.curRelease * 0.01f;
                            costKi = (float)((double)costKi * JRMCoreConfig.dat5696[type][2]);
                            if (tech[0].equals("KAFakeMoon")) {
                                costKi = Integer.parseInt(tech[7]);
                            }
                            if ((float)JRMCoreH.curEnergy > costKi) {
                                if (f > 50 && csicsu == csicsu / 5 * 5) {
                                    csicsu = (short)(csicsu + 1);
                                    JRMCoreH.charged = (short)(JRMCoreH.charged + 1);
                                } else if (f > 50) {
                                    csicsu = (short)(csicsu + 1);
                                } else if (f <= 50) {
                                    JRMCoreH.charged = (short)(JRMCoreH.charged + 1);
                                }
                            }
                            if (JRMCoreH.charged > 0 && JRMCoreH.curRelease > 0) {
                                JRMCoreH.cast = 50.0f / JRMCoreH.techDBCctWc((String[])tech, (byte[])sts) * (float)JRMCoreH.charged;
                                JRMCoreH.chrgPrc = (byte)(JRMCoreH.cast > 100.0f ? 100.0f : JRMCoreH.cast);
                            }
                        }
                        if ((props2 = ExtendedPlayer.get((EntityPlayer)var4)).getAnimKiShoot() != type + 1) {
                            int perc = 100;
                            DBCKiTech.triForce(3, type + 1, selectionID);
                            props2.setAnimKiShoot(type + 1);
                            props2.setAnimKiShootOn(1);
                            int color = Integer.parseInt(JRMCoreH.tech((int)selectionID)[10]);
                            byte align = JRMCoreH.getByte((EntityPlayer)var4, (String)"jrmcAlign");
                            boolean setGoDOn = false;
                            for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                                if (JRMCoreH.plyrs[pl] == null || !JRMCoreH.plyrs[pl].equals(JRMCoreClient.mc.thePlayer.getCommandSenderName())) continue;
                                String s = JRMCoreH.data5[pl].split(";")[0];
                                align = Byte.parseByte(s);
                                setGoDOn = JRMCoreH.StusEfctsClient((int)20, (int)pl);
                                break;
                            }
                            if (color == 0) {
                                if (align > 66) {
                                    color = 2;
                                }
                                if (align <= 66 && align >= 33) {
                                    color = 3;
                                }
                                if (align < 33) {
                                    color = 4;
                                }
                            }
                            boolean isCustomAttack = selectionID < 4;
                            props2.setGoDOn(setGoDOn && isCustomAttack && JGConfigDBCGoD.CONFIG_GOD_ENERGY_ENABLED && JGConfigDBCGoD.CONFIG_GOD_ENABLED ? 1 : 0);
                            props2.setKiShotCol(color);
                            float density = Float.parseFloat(JRMCoreH.tech((int)selectionID)[11]);
                            int dam1 = JRMCoreH.getEnegyDamageC((String[])JRMCoreH.tech((int)selectionID), (byte[])sts);
                            float size = JRMCoreH.calculateEnergyScale((float)dam1, (float)JRMCoreH.getMaxEnergyDamage(), (float)perc, (byte[])sts, (byte)((byte)density), (float)0.01f, (float)0.1f);
                            props2.setKiShotSiz(size);
                            int part = 0;
                            String data = JRMCoreH.tech((int)selectionID)[0];
                            if (data.toLowerCase().contains("spiritbomb") || data.toLowerCase().contains("spirit bomb")) {
                                part = 1;
                            } else if (data.toLowerCase().contains("kahame") || data.toLowerCase().contains("kamehame") || data.toLowerCase().contains("kame hame")) {
                                part = 2;
                            } else if (data.toLowerCase().contains("galic")) {
                                part = 4;
                            } else if (Integer.parseInt(JRMCoreH.tech((int)selectionID)[3]) == 8 && Integer.parseInt(JRMCoreH.tech((int)selectionID)[6]) == 1) {
                                part = 3;
                            }
                            props2.setKiShotPart(part);
                        }
                        if ((float)JRMCoreH.charged >= JRMCoreH.techDBCctWc((String[])tech, (byte[])sts) / 2.0f && type == 6 && JRMCoreH.chrgPrc != 0) {
                            if (JRMCoreH.cDEnAt((byte)selectionID, (float)JRMCoreH.techDBCcd((String[])tech, (byte[])sts)) && JRMCoreH.curEnergy > 0) {
                                JRMCoreH.isShtng = true;
                                DBCKiTech.EnAt(selectionID, JRMCoreH.chrgPrc);
                                DBCClientTickHandler.nuller();
                            }
                            JRMCoreH.isShtng = false;
                            if (tech.length > 12 && JRMCoreH.charged == 1 && !inc) {
                                inc = true;
                                JRMCoreH.quad((int)1, (int)(selectionID > 3 ? 10 : Integer.parseInt(tech[3])), (int)0, (int)(Integer.parseInt(tech[12]) - (selectionID > 3 ? 1 : 0)));
                            }
                        }
                        if (tech.length > 12 && JRMCoreH.charged == 3 && !inc) {
                            inc = true;
                            JRMCoreH.quad((int)1, (int)(selectionID > 3 ? 10 : Integer.parseInt(tech[3])), (int)0, (int)(Integer.parseInt(tech[12]) - (selectionID > 3 ? 1 : 0)));
                        }
                    } else if (tech != null) {
                        sts = JRMCoreH.tech_statmods((String)tech[19]);
                        if (DBCKiTech.KAkiEn(selectionID, JRMCoreH.curRelease, JRMCoreH.chrgPrc)) {
                            boolean doContinues;
                            type = JRMCoreH.techDBCty((String[])tech);
                            boolean isMoving = DBCClient.mc.thePlayer.motionX < 0.05 && DBCClient.mc.thePlayer.motionZ < 0.05 && DBCClient.mc.thePlayer.motionX > -0.05 && DBCClient.mc.thePlayer.motionZ > -0.05 && DBCClient.mc.thePlayer.motionY < 0.05;
                            boolean bl = doContinues = type >= JRMCoreConfig.ContinuesKiAttacks.length ? false : JRMCoreConfig.ContinuesKiAttacks[type];
                            if (doContinues && (float)JRMCoreH.charged > JRMCoreH.techDBCctWc((String[])tech, (byte[])sts) / 2.0f) {
                                if (isMoving) {
                                    if ((float)JRMCoreH.charged > JRMCoreH.techDBCctWc((String[])tech, (byte[])sts) / 2.0f && JRMCoreH.chrgPrc != 0 && !JRMCoreH.isShtng) {
                                        DBCClient.mc.thePlayer.motionY *= 0.0;
                                        if (JRMCoreH.cDEnAt((byte)selectionID, (float)JRMCoreH.techDBCcd((String[])tech, (byte[])sts)) && JRMCoreH.curEnergy > 0) {
                                            DBCKiTech.EnAt(DBCPacketHandlerServer.WAVE_FIRING);
                                            JRMCoreH.isShtng = true;
                                            DBCKiTech.EnAt(selectionID, JRMCoreH.chrgPrc);
                                            DBCClientTickHandler.nuller();
                                        }
                                    }
                                } else {
                                    DBCClientTickHandler.nuller();
                                    DBCKiTech.EnAt(DBCPacketHandlerServer.WAVE_STOP);
                                }
                            } else if ((float)JRMCoreH.charged > JRMCoreH.techDBCctWc((String[])tech, (byte[])sts) / 2.0f && type != 6 && JRMCoreH.chrgPrc != 0) {
                                if (JRMCoreH.cDEnAt((byte)selectionID, (float)JRMCoreH.techDBCcd((String[])tech, (byte[])sts)) && JRMCoreH.curEnergy > 0) {
                                    JRMCoreH.isShtng = true;
                                    DBCKiTech.EnAt(selectionID, JRMCoreH.chrgPrc);
                                    DBCClientTickHandler.nuller();
                                }
                                JRMCoreH.isShtng = false;
                            } else if (JRMCoreH.curRelease != 0) {
                                DBCClientTickHandler.nuller();
                            }
                            if (!isMoving) {
                                JRMCoreH.isShtng = false;
                            }
                        }
                    } else {
                        DBCClientTickHandler.nuller();
                        JRMCoreH.isShtng = false;
                    }
                    if (!JRMCoreH.isShtng && !JRMCoreH.isChrgng && (props = ExtendedPlayer.get((EntityPlayer)var4)).getAnimKiShoot() != 0) {
                        DBCKiTech.triForce(3, 0, 0);
                        props.setAnimKiShoot(0);
                        props.setAnimKiShootOn(0);
                    }
                    DBCH.RotPic = p;
                    DBCH.RotYaw = y;
                    JRMCoreHC.Blocking();
                    DBCKiTech.ChargeKi();
                    DBCKiTech.JumpKi(DBCClient.mc.gameSettings.keyBindJump);
                    DBCKiTech.FloatKi(JRMCoreKeyHandler.KiFlight, DBCClient.mc.gameSettings.keyBindJump, DBCClient.mc.gameSettings.keyBindSneak);
                    DBCKiTech.TurboMode(JRMCoreKeyHandler.KiDash);
                    DBCKiTech.DashKi(var4.isSprinting() || DBCKiTech.turbo);
                    DBCKiTech.Ascend(JRMCoreKeyHandler.KiAscend);
                    DBCKiTech.Descend(JRMCoreKeyHandler.KiDescend);
                } else {
                    if (JGConfigClientSettings.dbcFastFusionSpectatorCameraFollowOn && JRMCoreH.curRelease != 0 && JRMCoreH.StusEfctsMe((int)11) && !JRMCoreH.kob && JRMCoreH.isFused() && JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && JRMCoreH.dnn((int)18)) {
                        for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                            EntityPlayer player;
                            String[] fusionData;
                            if (!JRMCoreH.plyrs[pl].equals(var4.getCommandSenderName())) continue;
                            String[] fullFusionData = JRMCoreH.dat18[pl].split(";");
                            if (fullFusionData.length < 3 || (fusionData = fullFusionData[2].split(",")).length != 3 || (player = var4.worldObj.getPlayerEntityByName(fusionData[0])) == null) break;
                            var4.motionX -= (var4.posX - player.posX) / 3.0;
                            var4.motionY -= (var4.posY - player.posY) / 3.0;
                            var4.motionZ -= (var4.posZ - player.posZ) / 3.0;
                            break;
                        }
                    }
                    if (JRMCoreH.isPowerTypeKi() && DBCKiTech.floating && JRMCoreH.curRelease == 0) {
                        DBCKiTech.floating = false;
                    }
                    if (!JRMCoreH.kob) {
                        if (!JRMCoreH.StusEfctsMe((int)11)) {
                            DBCKiTech.Descend(JRMCoreKeyHandler.KiDescend);
                            DBCKiTech.DashKi(false);
                        }
                        DBCKiTech.ChargeKi();
                    }
                    if (JRMCoreKeyHandler.KiFlight.getIsKeyPressed() || JRMCoreKeyHandler.KiDash.getIsKeyPressed() || JRMCoreKeyHandler.KiAscend.getIsKeyPressed()) {
                        String t1 = JRMCoreH.StusEfctsMe((int)11) ? JRMCoreH.trl((String)"dbc", (String)"fusedspectator") : JRMCoreH.trl((String)"dbc.clienttick.increltouseki");
                        String t2 = JRMCoreKeyHandler.KiCharge.getKeyDescription();
                        String tf = String.format(t1, t2);
                        this.mc.thePlayer.addChatMessage((IChatComponent)new ChatComponentText(tf));
                        KeyBinding.setKeyBindState((int)JRMCoreKeyHandler.KiFlight.getKeyCode(), (boolean)false);
                        KeyBinding.setKeyBindState((int)JRMCoreKeyHandler.KiDash.getKeyCode(), (boolean)false);
                        KeyBinding.setKeyBindState((int)JRMCoreKeyHandler.KiAscend.getKeyCode(), (boolean)false);
                    }
                }
                if (JRMCoreH.isPowerTypeKi()) {
                    JRMCoreHC.BPC_ME = JRMCoreH.gkap((long)JRMCoreH.bpc((EntityPlayer)JRMCoreClient.mc.thePlayer, (String)JRMCoreClient.mc.thePlayer.getCommandSenderName(), (byte)JRMCoreH.Pwrtyp), (String)"BPC_ME");
                    if (JRMCoreHC.t1s) {
                        JRMCoreHC.BPC_ME2 = JRMCoreH.bpc((EntityPlayer)JRMCoreClient.mc.thePlayer, (String)JRMCoreClient.mc.thePlayer.getCommandSenderName(), (byte)JRMCoreH.Pwrtyp, (int)100);
                    }
                    if (!JRMCoreH.damInd.isEmpty() && JRMCoreH.SklLvl((int)6) > 0) {
                        ArrayList remove = new ArrayList();
                        if (!JRMCoreH.damInd.isEmpty()) {
                            for (Map.Entry mapEntry : JRMCoreH.damInd.entrySet()) {
                                String[] k = ((String)mapEntry.getKey()).split(":");
                                String[] v = ((String)mapEntry.getValue()).split(":");
                                double x = Double.parseDouble(k[0]);
                                double y = Double.parseDouble(k[1]);
                                double z = Double.parseDouble(k[2]);
                                double amount = Double.parseDouble(v[0]);
                                float timeleft = Float.parseFloat(v[1]) - 1.0f;
                                remove.add(mapEntry.getKey());
                                double X = x;
                                double Y = y;
                                double Z = z;
                                mod_JRMCore.proxy.generateDamIndParticles(x, y, z, amount, timeleft);
                            }
                        }
                        for (int i = 0; i < remove.size(); ++i) {
                            JRMCoreH.damInd.remove(remove.get(i));
                        }
                        remove.clear();
                    }
                }
                boolean itEnabledShort = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_ENABLED[0];
                boolean itEnabledLong = JGConfigDBCInstantTransmission.CONFIG_INSTANT_TRANSMISSION_ENABLED[1];
                boolean bl = itEnabled = itEnabledShort || itEnabledLong;
                if (itEnabled) {
                    boolean isUsed = this.mc.gameSettings.keyBindUseItem.getIsKeyPressed();
                    if (JRMCoreH.isPowerTypeKi() && JRMCoreH.curRelease != 0) {
                        int itLevel2 = JRMCoreH.SklLvl((int)17, (byte)JRMCoreH.Pwrtyp);
                        if (itLevel2 > 0 && DBCKeyHandler.thirdFn.getIsKeyPressed()) {
                            boolean cancelUse;
                            boolean disabled = false;
                            if (JRMCoreH.StusEfctsMe((int)11) && !JRMCoreH.kob && JRMCoreH.isFused() && JRMCoreH.plyrs != null && JRMCoreH.plyrs.length > 0 && JRMCoreH.dnn((int)18)) {
                                for (int pl = 0; pl < JRMCoreH.plyrs.length; ++pl) {
                                    EntityPlayer player;
                                    String[] fusionData;
                                    if (!JRMCoreH.plyrs[pl].equals(var4.getCommandSenderName())) continue;
                                    String[] fullFusionData = JRMCoreH.dat18[pl].split(";");
                                    if (fullFusionData.length < 3 || (fusionData = fullFusionData[2].split(",")).length != 3 || (player = var4.worldObj.getPlayerEntityByName(fusionData[0])) == null) break;
                                    disabled = true;
                                    break;
                                }
                            }
                            boolean bl2 = cancelUse = this.mc.gameSettings.keyBindAttack.getIsKeyPressed() || this.mc.thePlayer.inventory.getCurrentItem() != null || disabled;
                            if (cancelUse) {
                                DBCClientTickHandler.resetIT(isUsed);
                                KeyBinding.setKeyBindState((int)DBCKeyHandler.thirdFn.getKeyCode(), (boolean)false);
                            } else {
                                instantTransmissionOn = true;
                                if (isUsed) {
                                    if (itEnabledShort) {
                                        if (!instantTransmissionRequestSent) {
                                            DBCKiTech.EnAt(DBCPacketHandlerServer.INSTANT_TRANSMISSION, (byte)0);
                                            instantTransmissionRequestSent = true;
                                            instantTransmissionPress = null;
                                            instantTransmissionPress = Instant.now();
                                        } else {
                                            instantTransmissionPress = null;
                                            instantTransmissionOn = false;
                                        }
                                    } else {
                                        String message = "Instant Transmission Failed! Short teleportation is Disabled! ";
                                        DBCClient.mc.thePlayer.addChatMessage(new ChatComponentText(message).setChatStyle(DBCPacketHandlerServer.styleRed));
                                    }
                                } else if (instantTransmissionPress == null && !instantTransmissionRequestSent) {
                                    instantTransmissionPress = Instant.now();
                                } else if (!instantTransmissionRequestSent) {
                                    long timer = Duration.between(instantTransmissionPress, Instant.now()).getSeconds();
                                    if (timer >= 4L) {
                                        if (itEnabledLong) {
                                            EntityClientPlayerMP plyr = DBCClient.mc.thePlayer;
                                            plyr.openGui((Object)mod_JRMCore.instance, 10100, plyr.worldObj, (int)plyr.posX, (int)plyr.posY, (int)plyr.posZ);
                                            instantTransmissionRequestSent = true;
                                            instantTransmissionPress = null;
                                        } else {
                                            String message = "Instant Transmission Failed! Long teleportation is Disabled! ";
                                            DBCClient.mc.thePlayer.addChatMessage(new ChatComponentText(message).setChatStyle(DBCPacketHandlerServer.styleRed));
                                        }
                                    }
                                } else {
                                    instantTransmissionPress = null;
                                    instantTransmissionOn = false;
                                }
                            }
                        } else {
                            DBCClientTickHandler.resetIT(isUsed);
                        }
                    } else {
                        DBCClientTickHandler.resetIT(isUsed);
                    }
                } else if (JRMCoreH.isPowerTypeKi() && JRMCoreH.curRelease != 0 && (itLevel = JRMCoreH.SklLvl((int)17, (byte)JRMCoreH.Pwrtyp)) > 0) {
                    if (DBCKeyHandler.thirdFn.getIsKeyPressed()) {
                        if (!instantTransmissionWarning) {
                            String message = "Instant Transmission Failed! Teleportation is Disabled! ";
                            DBCClient.mc.thePlayer.addChatMessage(new ChatComponentText(message).setChatStyle(DBCPacketHandlerServer.styleRed));
                            instantTransmissionWarning = true;
                        }
                    } else {
                        instantTransmissionWarning = false;
                    }
                }
            }
        }
    }

    public static void resetIT(boolean isUsed) {
        instantTransmissionOn = false;
        if (!isUsed) {
            instantTransmissionRequestSent = false;
        }
        instantTransmissionPress = null;
    }

    public static void nuller() {
        JRMCoreH.chrgPrc = 0;
        JRMCoreH.charged = 0;
        JRMCoreH.channel = 0;
        JRMCoreH.wave = 0;
        JRMCoreH.isChrgng = false;
        JRMCoreH.cast = 0.0f;
        csicsu = 0;
        inc = false;
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent event) {
        if (!JRMCoreH.paused) {
            if (event.phase.equals((Object)TickEvent.Phase.START)) {
                this.onTickInGame();
            } else if (event.phase.equals((Object)TickEvent.Phase.END)) {
                this.onTickInGameEnd();
            }
        }
    }

    @SubscribeEvent
    public void onRenderTick(TickEvent.RenderTickEvent event) {
        if (event.phase == TickEvent.Phase.END && !JRMCoreH.paused) {
            this.onRenderTick();
        }
    }

    static {
        time = 0;
        power = 0;
        jump = 0;
        ascend = 0;
        pup = 0;
        ptime = 0;
        partnorm = 0;
        inSuperTime = 0;
        inSuperTime2 = 0;
        inSuperTime3 = 0;
        charge = false;
        charg = 0;
        mountHelper = 0;
        instantTransmissionOn = false;
        instantTransmissionRequestSent = false;
        instantTransmissionPress = null;
        instantTransmissionWarning = false;
    }
}

