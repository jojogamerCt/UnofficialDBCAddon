/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.particle.EntityAuraFX
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Npcs;

import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.world.World;

public class EntityGodParticle
extends EntityAuraFX {
    public EntityGodParticle(World parWorld, double parX, double parY, double parZ, double parMotionX, double parMotionY, double parMotionZ) {
        super(parWorld, parX, parY, parZ, parMotionX, parMotionY, parMotionZ);
        this.setParticleTextureIndex(0);
        this.particleScale = (float)(Math.random() * 1.0) + 0.4f;
        this.setRBGColorF(255.0f, 255.0f, 255.0f);
        this.particleMaxAge = (int)(10.0 / (Math.random() * 0.8 + 0.2));
        this.motionX *= 1.0;
        this.motionY *= 8.0;
        this.motionZ *= 1.0;
    }
}

