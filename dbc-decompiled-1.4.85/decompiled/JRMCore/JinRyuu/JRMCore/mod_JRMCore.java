/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.FMLCommonHandler
 *  cpw.mods.fml.common.Mod
 *  cpw.mods.fml.common.Mod$EventHandler
 *  cpw.mods.fml.common.Mod$Instance
 *  cpw.mods.fml.common.SidedProxy
 *  cpw.mods.fml.common.event.FMLInitializationEvent
 *  cpw.mods.fml.common.event.FMLPostInitializationEvent
 *  cpw.mods.fml.common.event.FMLPreInitializationEvent
 *  cpw.mods.fml.common.event.FMLServerStartingEvent
 *  cpw.mods.fml.common.network.IGuiHandler
 *  cpw.mods.fml.common.network.NetworkRegistry
 *  cpw.mods.fml.relauncher.Side
 *  net.minecraft.command.ICommand
 *  net.minecraft.command.ServerCommandManager
 *  net.minecraft.creativetab.CreativeTabs
 *  net.minecraftforge.common.MinecraftForge
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.Display
 */
package JinRyuu.JRMCore;

import JinRyuu.JRMCore.ComJrmc;
import JinRyuu.JRMCore.ComJrmcCheck;
import JinRyuu.JRMCore.ComJrmcDebug;
import JinRyuu.JRMCore.ComJrmcFormMastery;
import JinRyuu.JRMCore.ComJrmcFormMasteryCheck;
import JinRyuu.JRMCore.ComJrmcHeal;
import JinRyuu.JRMCore.ComJrmcKills;
import JinRyuu.JRMCore.ComJrmcRacialSkill;
import JinRyuu.JRMCore.ComJrmcRei;
import JinRyuu.JRMCore.ComJrmcRep;
import JinRyuu.JRMCore.ComJrmcSafeZone;
import JinRyuu.JRMCore.ComJrmcStatusEffect;
import JinRyuu.JRMCore.ComJrmcTech;
import JinRyuu.JRMCore.ComJrmca;
import JinRyuu.JRMCore.ComJrmcaBonus;
import JinRyuu.JRMCore.ComJrmcaBonusCheck;
import JinRyuu.JRMCore.ComJrmcm;
import JinRyuu.JRMCore.ComJrmcpvp;
import JinRyuu.JRMCore.ComJrmcpvpcheck;
import JinRyuu.JRMCore.ComJrmctexp;
import JinRyuu.JRMCore.ComJrmctp;
import JinRyuu.JRMCore.JRMCTab;
import JinRyuu.JRMCore.JRMCore;
import JinRyuu.JRMCore.JRMCoreEH;
import JinRyuu.JRMCore.JRMCoreGuiHandler;
import JinRyuu.JRMCore.JRMCoreGuiScreenE;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.blocks.BlocksJRMC;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigsClient;
import JinRyuu.JRMCore.entity.EntitiesJRMC;
import JinRyuu.JRMCore.items.ItemsJRMC;
import JinRyuu.JRMCore.items.RecipesJRMC;
import JinRyuu.JRMCore.p.PD;
import JinRyuu.JRMCore.server.commands.CommandNotification;
import JinRyuu.JRMCore.server.config.JGConfigsServer;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.command.ICommand;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

@Mod(modid="jinryuujrmcore", name="JinRyuu's JRMCore", version="1.3.51")
public class mod_JRMCore {
    @SidedProxy(clientSide="JinRyuu.JRMCore.JRMCoreClient", serverSide="JinRyuu.JRMCore.JRMCore")
    public static JRMCore proxy;
    @Mod.Instance(value="mod_JRMCore")
    public static mod_JRMCore instance;
    private JRMCoreGuiHandler guiHandler = new JRMCoreGuiHandler();
    private static int modGuiIndex;
    public static CreativeTabs JRMCore;
    public static final int GUI_CUSTOM_INV;
    public static final int GUI_ITEM_INV;
    public static Logger logger;

    private String getVersion() {
        return "1.3.51";
    }

    @Mod.EventHandler
    public void ServerStarting(FMLServerStartingEvent event) {
        ServerCommandManager manager = (ServerCommandManager)event.getServer().getCommandManager();
        manager.registerCommand((ICommand)new ComJrmctp());
        manager.registerCommand((ICommand)new ComJrmca());
        manager.registerCommand((ICommand)new ComJrmc());
        manager.registerCommand((ICommand)new ComJrmcpvp());
        manager.registerCommand((ICommand)new ComJrmcpvpcheck());
        manager.registerCommand((ICommand)new ComJrmcKills());
        manager.registerCommand((ICommand)new ComJrmcCheck());
        manager.registerCommand((ICommand)new ComJrmcHeal());
        manager.registerCommand((ICommand)new ComJrmcStatusEffect());
        manager.registerCommand((ICommand)new ComJrmcTech());
        manager.registerCommand((ICommand)new ComJrmcm());
        manager.registerCommand((ICommand)new ComJrmctexp());
        manager.registerCommand((ICommand)new ComJrmcRep());
        manager.registerCommand((ICommand)new ComJrmcRei());
        manager.registerCommand((ICommand)new ComJrmcDebug());
        manager.registerCommand((ICommand)new ComJrmcRacialSkill());
        manager.registerCommand((ICommand)new ComJrmcaBonus());
        manager.registerCommand((ICommand)new ComJrmcaBonusCheck());
        manager.registerCommand((ICommand)new CommandNotification());
        manager.registerCommand((ICommand)new ComJrmcSafeZone());
        manager.registerCommand((ICommand)new ComJrmcFormMastery());
        manager.registerCommand((ICommand)new ComJrmcFormMasteryCheck());
    }

    @Mod.EventHandler
    public void PreLoad(FMLPreInitializationEvent event) {
        if (System.getProperty("posX") != null && System.getProperty("posY") != null) {
            Display.setLocation((int)Integer.parseInt(System.getProperty("posX")), (int)Integer.parseInt(System.getProperty("posY")));
        }
        if (System.getProperty("title") != null) {
            Display.setTitle((String)System.getProperty("title"));
        }
        if (event.getSide() == Side.CLIENT) {
            JGConfigsClient.preInitClient(event);
        }
        logger = event.getModLog();
        logger.info("Current Version " + this.getVersion());
        String thisYear = new SimpleDateFormat("yyyy").format(new Date());
        logger.info("Copyright (c) Tamas 'JinRyuu' Nagy,  2012-2018");
        logger.info("Copyright (c) Benjamin 'JinGames_Ben' Nagy,  2018-" + new SimpleDateFormat("yyyy").format(new Date()) + "");
        logger.info("https://jingames.net");
        proxy.registerKeys();
        proxy.registerTicks();
        proxy.initialize();
        JRMCoreH.init();
        PD.registerPackets();
        JGConfigsServer.preInitServer(event);
        logger.info("Pre Initialization Complated");
        instance = this;
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        BlocksJRMC.init();
        BlocksJRMC.register();
        ItemsJRMC.init();
        RecipesJRMC.init();
        proxy.registerRenderThings();
        if (event.getSide() == Side.CLIENT) {
            JRMCoreGuiScreenE eventgs = new JRMCoreGuiScreenE();
            MinecraftForge.EVENT_BUS.register((Object)eventgs);
            FMLCommonHandler.instance().bus().register((Object)eventgs);
        }
        JRMCoreEH events = new JRMCoreEH();
        MinecraftForge.EVENT_BUS.register((Object)events);
        FMLCommonHandler.instance().bus().register((Object)events);
        NetworkRegistry.INSTANCE.registerGuiHandler((Object)this, (IGuiHandler)this.guiHandler);
        EntitiesJRMC.common();
    }

    @Mod.EventHandler
    public void PostLoad(FMLPostInitializationEvent event) {
        long m;
        proxy.postInit();
        JRMCoreH.mem = m = Runtime.getRuntime().maxMemory() / 1000000L;
        logger.info("Max Memory: " + m + "M");
        logger.info("Initialization Completed");
        logger.info("Fully Loaded!");
        logger.info("Enjoy ^^");
    }

    static {
        instance = new mod_JRMCore();
        modGuiIndex = -10;
        JRMCore = new JRMCTab("JRMCore");
        GUI_CUSTOM_INV = modGuiIndex--;
        GUI_ITEM_INV = modGuiIndex--;
    }
}

