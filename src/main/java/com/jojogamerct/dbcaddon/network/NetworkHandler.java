package com.jojogamerct.dbcaddon.network;

import com.jojogamerct.dbcaddon.UnofficialDBCAddon;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class NetworkHandler {

    public static SimpleNetworkWrapper INSTANCE;

    private static int nextId = 0;

    public static void init() {
        INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(UnofficialDBCAddon.MODID);

        // Client -> Server: player wants to toggle Ultra Ego
        INSTANCE
            .registerMessage(UltraEgoActivatePacket.Handler.class, UltraEgoActivatePacket.class, nextId++, Side.SERVER);

        // Server -> Client: sync Ultra Ego state
        INSTANCE.registerMessage(UltraEgoSyncPacket.Handler.class, UltraEgoSyncPacket.class, nextId++, Side.CLIENT);
    }
}
