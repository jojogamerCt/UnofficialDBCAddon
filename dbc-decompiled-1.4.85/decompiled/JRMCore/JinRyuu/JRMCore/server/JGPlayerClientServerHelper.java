/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 */
package JinRyuu.JRMCore.server;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;

public class JGPlayerClientServerHelper {
    public static float clientPlayerPositioner(Entity entity) {
        return entity instanceof EntityPlayerSP ? -1.6f : 0.0f;
    }
}

