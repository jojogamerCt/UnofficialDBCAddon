package com.jojogamerct.dbcaddon;

import java.io.File;

import net.minecraftforge.common.MinecraftForge;

import com.jojogamerct.dbcaddon.config.DebugConfig;
import com.jojogamerct.dbcaddon.config.UltraEgoConfig;
import com.jojogamerct.dbcaddon.handler.UltraEgoEventHandler;
import com.jojogamerct.dbcaddon.network.NetworkHandler;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        // Load configuration
        File configDir = new File(event.getModConfigurationDirectory(), "dbcaddon");
        if (!configDir.exists()) {
            configDir.mkdirs();
        }
        UltraEgoConfig.loadConfig(new File(configDir, "ultra_ego.cfg"));
        DebugConfig.loadConfig(new File(configDir, "debug.cfg"));

        // Initialize network
        NetworkHandler.init();

        UnofficialDBCAddon.LOG.info("Unofficial DBC Addon v" + Tags.VERSION + " - Pre-initialization complete");
        if (DebugConfig.debugEnabled) {
            UnofficialDBCAddon.LOG.info("[DBCAddon Debug] Debug mode is ENABLED");
        }
    }

    public void init(FMLInitializationEvent event) {
        // Register event handlers
        UltraEgoEventHandler eventHandler = new UltraEgoEventHandler();
        MinecraftForge.EVENT_BUS.register(eventHandler);
        FMLCommonHandler.instance()
            .bus()
            .register(eventHandler);

        UnofficialDBCAddon.LOG.info("Unofficial DBC Addon - Ultra Ego transformation registered");
    }

    public void postInit(FMLPostInitializationEvent event) {}

    public void serverStarting(FMLServerStartingEvent event) {}
}
