/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.settings.GameSettings
 *  net.minecraft.util.MovementInput
 */
package JinRyuu.JRMCore;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.MovementInput;

@SideOnly(value=Side.CLIENT)
public class MoveInputJRMC
extends MovementInput {
    private GameSettings gameSettings;
    private static final String __OBFID = "CL_00000937";
    public float moveModifier = 1.0f;

    public MoveInputJRMC(GameSettings p_i1237_1_, float mm) {
        this.gameSettings = p_i1237_1_;
        this.moveModifier = mm;
    }

    public void updatePlayerMoveState() {
        this.moveStrafe = 0.0f;
        this.moveForward = 0.0f;
        if (this.gameSettings.keyBindForward.getIsKeyPressed()) {
            this.moveForward += 1.0f;
        }
        if (this.gameSettings.keyBindBack.getIsKeyPressed()) {
            this.moveForward -= 1.0f;
        }
        if (this.gameSettings.keyBindLeft.getIsKeyPressed()) {
            this.moveStrafe += 1.0f;
        }
        if (this.gameSettings.keyBindRight.getIsKeyPressed()) {
            this.moveStrafe -= 1.0f;
        }
        this.jump = this.gameSettings.keyBindJump.getIsKeyPressed();
        this.sneak = this.gameSettings.keyBindSneak.getIsKeyPressed();
        if (this.sneak) {
            this.moveStrafe = (float)((double)this.moveStrafe * 0.3);
            this.moveForward = (float)((double)this.moveForward * 0.3);
        }
        this.moveStrafe *= this.moveModifier;
        this.moveForward *= this.moveModifier;
    }
}

