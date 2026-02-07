package com.jojogamerct.dbcaddon;

import net.minecraftforge.common.MinecraftForge;

import com.jojogamerct.dbcaddon.handler.UltraEgoKeyHandler;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);

        // Register client-side key bindings
        UltraEgoKeyHandler.registerKeyBindings();

        // Register key input handler
        UltraEgoKeyHandler keyHandler = new UltraEgoKeyHandler();
        MinecraftForge.EVENT_BUS.register(keyHandler);
        FMLCommonHandler.instance()
            .bus()
            .register(keyHandler);
    }
}
