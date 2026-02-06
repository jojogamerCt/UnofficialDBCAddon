/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.attributes.AttributeModifier
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.world.World
 *  net.minecraftforge.common.IExtendedEntityProperties
 */
package JinRyuu.JRMCore.i;

import JinRyuu.JRMCore.JRMCoreHSAC;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedEntity
implements IExtendedEntityProperties {
    public static final String EXT_PROP_NAME = "JRMCEE";
    private final Entity e;
    private int saga = -1;
    private int side = -1;
    private int cb5 = 100;
    private int Level;
    private int Dam;
    public static final int LVL = 20;
    public static final int DAM = 19;
    private int timer = 100;
    private int hairCheckDim = -1;

    public ExtendedEntity(Entity e) {
        this.e = e;
        this.Level = 0;
        this.Dam = 3;
        this.e.getDataWatcher().addObject(20, (Object)this.Level);
        this.e.getDataWatcher().addObject(19, (Object)this.Dam);
    }

    public static final void register(Entity player) {
        player.registerExtendedProperties(EXT_PROP_NAME, (IExtendedEntityProperties)new ExtendedEntity(player));
    }

    public static final ExtendedEntity get(Entity player) {
        return (ExtendedEntity)player.getExtendedProperties(EXT_PROP_NAME);
    }

    public void copy(ExtendedEntity props) {
        this.Level = props.Level;
        this.Dam = props.Dam;
    }

    public final void saveNBTData(NBTTagCompound compound) {
        NBTTagCompound properties = new NBTTagCompound();
        properties.setInteger("level", this.e.getDataWatcher().getWatchableObjectInt(20));
        properties.setInteger("dam", this.e.getDataWatcher().getWatchableObjectInt(19));
        compound.setTag(EXT_PROP_NAME, (NBTBase)properties);
    }

    public final void loadNBTData(NBTTagCompound compound) {
        NBTTagCompound properties = (NBTTagCompound)compound.getTag(EXT_PROP_NAME);
        if (properties != null) {
            this.e.getDataWatcher().updateObject(20, (Object)properties.getInteger("level"));
            this.e.getDataWatcher().updateObject(19, (Object)properties.getInteger("dam"));
        }
    }

    public void init(Entity entity, World world) {
    }

    public void onUpdate() {
        if (!this.e.worldObj.isRemote && this.getLvl() == 0 && this.e instanceof EntityMob) {
            EntityMob mob = (EntityMob)this.e;
            int lvl = JRMCoreHSAC.SAO_getLvlBasedOnDrop((Entity)mob);
            int newHealth = (int)(mob.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue() * (double)lvl * 1.0);
            AttributeModifier modifier = new AttributeModifier(mob.getUniqueID(), "maxHealthModifier", (double)newHealth, 0);
            if (modifier != null) {
                mob.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.maxHealth).applyModifier(modifier);
            }
            int newDamage = (int)(mob.getEntityAttribute(SharedMonsterAttributes.attackDamage).getBaseValue() * (double)lvl * 5.0);
            modifier = new AttributeModifier(mob.getUniqueID(), "attackDamageModifier", (double)newDamage, 0);
            if (modifier != null) {
                mob.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.attackDamage).applyModifier(modifier);
            }
            mob.setHealth(mob.getMaxHealth());
            this.setDam((int)mob.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.attackDamage).getAttributeValue());
            this.setLvl(lvl);
        }
    }

    public final int getDam() {
        return this.e.getDataWatcher().getWatchableObjectInt(19);
    }

    public final int getLvl() {
        return this.e.getDataWatcher().getWatchableObjectInt(20);
    }

    public final void setDam(int amount) {
        this.e.getDataWatcher().updateObject(19, (Object)amount);
    }

    public final void setLvl(int amount) {
        this.e.getDataWatcher().updateObject(20, (Object)amount);
    }
}

