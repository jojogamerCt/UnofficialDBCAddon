package com.jojogamerct.dbcaddon.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

import com.jojogamerct.dbcaddon.network.NetworkHandler;
import com.jojogamerct.dbcaddon.network.UltraEgoActivatePacket;
import com.jojogamerct.dbcaddon.transformation.UltraEgoData;

/**
 * Client-side key binding handler for toggling Ultra Ego.
 */
public class UltraEgoKeyHandler {

    private static final String KEY_CATEGORY = "DBC Addon";
    private static KeyBinding keyUltraEgo;

    public static void registerKeyBindings() {
        keyUltraEgo = new KeyBinding("Toggle Ultra Ego", Keyboard.KEY_U, KEY_CATEGORY);
        ClientRegistry.registerKeyBinding(keyUltraEgo);
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (keyUltraEgo == null || !keyUltraEgo.isPressed()) return;

        Minecraft mc = Minecraft.getMinecraft();
        if (mc.thePlayer == null || mc.currentScreen != null) return;

        boolean currentlyActive = UltraEgoData.isActive(mc.thePlayer);

        // Send toggle packet to server
        NetworkHandler.INSTANCE.sendToServer(new UltraEgoActivatePacket(!currentlyActive));
    }
}
