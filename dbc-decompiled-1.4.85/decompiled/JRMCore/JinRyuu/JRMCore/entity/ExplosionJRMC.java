/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.enchantment.EnchantmentProtection
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityTNTPrimed
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.ChunkPosition
 *  net.minecraft.world.Explosion
 *  net.minecraft.world.World
 */
package JinRyuu.JRMCore.entity;

import JinRyuu.JRMCore.Ds;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.JRMCoreH;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class ExplosionJRMC
extends Explosion {
    public boolean isFlaming = false;
    public boolean isSmoking = true;
    private int field_77289_h = JRMCoreConfig.eaei;
    private Random explosionRNG = new Random();
    private World worldObj;
    public double explosionX;
    public double explosionY;
    public double explosionZ;
    public Entity exploder;
    public float explosionSize;
    public boolean ego;
    public double damage;
    public List affectedBlockPositions = new ArrayList();
    private Map field_77288_k = new HashMap();
    public Entity palyer;
    public byte type;

    public ExplosionJRMC(World par1World, Entity par2Entity, double x, double y, double z, float size, boolean off, double dam, Entity origin, byte type) {
        super(par1World, par2Entity, x, y, z, size);
        this.worldObj = par1World;
        this.exploder = par2Entity;
        this.explosionSize = size;
        this.explosionX = x;
        this.explosionY = y;
        this.explosionZ = z;
        this.ego = off;
        this.damage = dam;
        this.palyer = origin;
        this.type = type;
    }

    public void doExplosionA() {
        double d2;
        double d1;
        double d0;
        int k;
        int j;
        int i;
        this.field_77289_h = (int)((float)this.field_77289_h * this.explosionSize);
        float f = this.explosionSize;
        HashSet<ChunkPosition> hashset = new HashSet<ChunkPosition>();
        if (!this.ego) {
            for (i = 0; i < this.field_77289_h; ++i) {
                for (j = 0; j < this.field_77289_h; ++j) {
                    for (k = 0; k < this.field_77289_h; ++k) {
                        if (i != 0 && i != this.field_77289_h - 1 && j != 0 && j != this.field_77289_h - 1 && k != 0 && k != this.field_77289_h - 1) continue;
                        double d3 = (float)i / ((float)this.field_77289_h - 1.0f) * 2.0f - 1.0f;
                        double d4 = (float)j / ((float)this.field_77289_h - 1.0f) * 2.0f - 1.0f;
                        double d5 = (float)k / ((float)this.field_77289_h - 1.0f) * 2.0f - 1.0f;
                        double d6 = Math.sqrt(d3 * d3 + d4 * d4 + d5 * d5);
                        d3 /= d6;
                        d4 /= d6;
                        d5 /= d6;
                        d0 = this.explosionX;
                        d1 = this.explosionY;
                        d2 = this.explosionZ;
                        float f2 = 0.3f;
                        for (float f1 = this.explosionSize * (0.7f + this.worldObj.rand.nextFloat() * 0.6f); f1 > 0.0f; f1 -= f2 * 0.75f) {
                            int l = MathHelper.floor_double((double)d0);
                            int i1 = MathHelper.floor_double((double)d1);
                            int j1 = MathHelper.floor_double((double)d2);
                            Block block = this.worldObj.getBlock(l, i1, j1);
                            if (!this.ego && block.getMaterial() != Material.air) {
                                float f3 = this.exploder != null ? this.exploder.func_145772_a((Explosion)this, this.worldObj, l, i1, j1, block) * 0.2f : block.getExplosionResistance(this.exploder, this.worldObj, l, i1, j1, this.explosionX, this.explosionY, this.explosionZ) * 0.2f;
                                f1 -= (f3 + 0.3f) * f2;
                            }
                            if (!this.ego && f1 > 0.0f && (this.exploder == null || this.exploder.func_145774_a((Explosion)this, this.worldObj, l, i1, j1, block, f1))) {
                                hashset.add(new ChunkPosition(l, i1, j1));
                            }
                            d0 += d3 * (double)f2;
                            d1 += d4 * (double)f2;
                            d2 += d5 * (double)f2;
                        }
                    }
                }
            }
        }
        this.affectedBlockPositions.addAll(hashset);
        this.explosionSize *= 2.0f;
        i = MathHelper.floor_double((double)(this.explosionX - (double)this.explosionSize - 1.0));
        j = MathHelper.floor_double((double)(this.explosionX + (double)this.explosionSize + 1.0));
        k = MathHelper.floor_double((double)(this.explosionY - (double)this.explosionSize - 1.0));
        int l1 = MathHelper.floor_double((double)(this.explosionY + (double)this.explosionSize + 1.0));
        int i2 = MathHelper.floor_double((double)(this.explosionZ - (double)this.explosionSize - 1.0));
        int j2 = MathHelper.floor_double((double)(this.explosionZ + (double)this.explosionSize + 1.0));
        List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this.exploder, AxisAlignedBB.getBoundingBox((double)i, (double)k, (double)i2, (double)j, (double)l1, (double)j2));
        Vec3 vec3 = Vec3.createVectorHelper((double)this.explosionX, (double)this.explosionY, (double)this.explosionZ);
        for (int k2 = 0; k2 < list.size(); ++k2) {
            double d8;
            Entity entity = (Entity)list.get(k2);
            double d7 = entity.getDistance(this.explosionX, this.explosionY, this.explosionZ) / (double)this.explosionSize;
            if (!(d7 <= 1.0) || (d8 = (double)MathHelper.sqrt_double((double)((d0 = entity.posX - this.explosionX) * d0 + (d1 = entity.posY + (double)entity.getEyeHeight() - this.explosionY) * d1 + (d2 = entity.posZ - this.explosionZ) * d2))) == 0.0) continue;
            d0 /= d8;
            d1 /= d8;
            d2 /= d8;
            double d9 = this.worldObj.getBlockDensity(vec3, entity.boundingBox);
            double d10 = (1.0 - d7) * d9;
            int sdmg = (int)((1.0 - d7) * (this.damage / 1.25));
            if (this.palyer instanceof EntityPlayer || entity instanceof EntityPlayer) {
                entity.attackEntityFrom(Ds.causeExplosion(this.palyer), (float)sdmg);
            }
            double d11 = EnchantmentProtection.func_92092_a((Entity)entity, (double)d10);
            entity.motionX += d0 * d11;
            entity.motionY += d1 * d11;
            entity.motionZ += d2 * d11;
            if (!(entity instanceof EntityPlayer)) continue;
            this.field_77288_k.put((EntityPlayer)entity, Vec3.createVectorHelper((double)(d0 * d10), (double)(d1 * d10), (double)(d2 * d10)));
        }
        this.explosionSize = f;
    }

    public void doExplosionB(boolean par1) {
        Block block;
        int k;
        int j;
        int i;
        String snd = "";
        if (this.palyer instanceof EntityPlayer) {
            byte p = JRMCoreH.getByte((EntityPlayer)this.palyer, "PowerType");
            String string = snd = p == 2 ? "jinryuunarutoc:NC1.Explosion" : "jinryuudragonbc:DBC.expl";
        }
        if (this.type != 5) {
            this.worldObj.playSoundEffect(this.explosionX, this.explosionY, this.explosionZ, snd, 4.0f, (1.0f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2f) * 0.7f);
        }
        if (this.explosionSize >= 2.0f && this.isSmoking) {
            this.worldObj.spawnParticle("hugeexplosion", this.explosionX, this.explosionY, this.explosionZ, 1.0, 0.0, 0.0);
        } else {
            this.worldObj.spawnParticle("largeexplode", this.explosionX, this.explosionY, this.explosionZ, 1.0, 0.0, 0.0);
        }
        if (this.isSmoking) {
            for (ChunkPosition chunkposition : this.affectedBlockPositions) {
                i = chunkposition.chunkPosX;
                j = chunkposition.chunkPosY;
                k = chunkposition.chunkPosZ;
                block = this.worldObj.getBlock(i, j, k);
                if (par1) {
                    double d0 = i;
                    double d1 = j;
                    double d2 = k;
                    double d3 = d0 - this.explosionX;
                    double d4 = d1 - this.explosionY;
                    double d5 = d2 - this.explosionZ;
                    double d6 = MathHelper.sqrt_double((double)(d3 * d3 + d4 * d4 + d5 * d5));
                    d3 /= d6;
                    d4 /= d6;
                    d5 /= d6;
                    double d7 = 0.5 / (d6 / (double)this.explosionSize + 0.1);
                    d3 *= (d7 *= (double)(this.worldObj.rand.nextFloat() * this.worldObj.rand.nextFloat() + 0.3f));
                    d4 *= d7;
                    d5 *= d7;
                }
                if (block.getMaterial() == Material.air) continue;
                this.worldObj.setBlockToAir(i, j, k);
                block.onBlockDestroyedByExplosion(this.worldObj, i, j, k, (Explosion)this);
            }
        }
        if (this.isFlaming) {
            for (ChunkPosition chunkposition : this.affectedBlockPositions) {
                i = chunkposition.chunkPosX;
                j = chunkposition.chunkPosY;
                k = chunkposition.chunkPosZ;
                block = this.worldObj.getBlock(i, j, k);
                Block block1 = this.worldObj.getBlock(i, j - 1, k);
                if (block.getMaterial() == Material.air && block1.func_149730_j() && this.explosionRNG.nextInt(3) != 0) continue;
            }
        }
    }

    public Map func_77277_b() {
        return this.field_77288_k;
    }

    public EntityLivingBase getExplosivePlacedBy() {
        return this.exploder == null ? null : (this.exploder instanceof EntityTNTPrimed ? ((EntityTNTPrimed)this.exploder).getTntPlacedBy() : (this.exploder instanceof EntityLivingBase ? (EntityLivingBase)this.exploder : null));
    }
}

