/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JinRyuu.JRMCore.JRMCoreH
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.renderer.texture.IIconRegister
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.StatCollector
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.Teleporter
 *  net.minecraft.world.World
 */
package JinRyuu.DragonBC.common.Blocks;

import JinRyuu.DragonBC.common.Worlds.WorldTeleporterDBCTelep;
import JinRyuu.JRMCore.JRMCoreH;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.StatCollector;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;

public class BlockTCPort
extends Block {
    public BlockTCPort() {
        super(Material.iron);
        this.setBlockUnbreakable();
        this.setResistance(6000000.0f);
    }

    public String getTextureFile() {
        return "jinryuudragonbc:";
    }

    @SideOnly(value=Side.CLIENT)
    public int getRenderBlockPass() {
        return 0;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean canCollideCheck(int par1, boolean par2) {
        return false;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
        return null;
    }

    public boolean isBlockSolid(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        return false;
    }

    @SideOnly(value=Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("jinryuudragonbc:" + this.getUnlocalizedName());
    }

    public int idDropped(int par1, Random par2Random, int par3) {
        return 0;
    }

    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
        if (par5Entity != null && par5Entity instanceof EntityPlayerMP && par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null) {
            EntityPlayerMP playerMP = (EntityPlayerMP)par5Entity;
            if (playerMP.dimension == 0 && par2 == 77 && par3 == 217 && par4 == 8) {
                short s = JRMCoreH.getShort((EntityPlayer)playerMP, (String)"jrmcHTCTmO");
                short s1 = JRMCoreH.getByte((EntityPlayer)playerMP, (String)"jrmcMsg");
                if (s == 0) {
                    playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, 23, (Teleporter)new WorldTeleporterDBCTelep(playerMP.mcServer.worldServerForDimension(23)));
                    playerMP.playerNetServerHandler.setPlayerLocation(55.0, 35.0, 11.0, 0.0f, 0.0f);
                    playerMP.addExperience(1);
                } else if (s1 == 0) {
                    short m = (short)(s / 120);
                    String t1 = JRMCoreH.cly + StatCollector.translateToLocal((String)"dbc.timechamber.waitillenter");
                    String t2 = JRMCoreH.cly + StatCollector.translateToLocal((String)"dbc.timechamber.waitillenter.sec");
                    String t3 = JRMCoreH.cly + StatCollector.translateToLocal((String)"dbc.timechamber.waitillenter.min");
                    String t4 = m <= 0 ? "" + s / 2 + " " + t2 : "" + m + " " + t3;
                    String tf = String.format(JRMCoreH.cldr + t1, JRMCoreH.cldr + t4);
                    playerMP.addChatMessage((IChatComponent)new ChatComponentText(tf));
                    JRMCoreH.setByte((int)1, (EntityPlayer)playerMP, (String)"jrmcMsg");
                }
            }
            if (playerMP.dimension == 23 && (par2 == 55 || par2 == 54) && par3 == 35 && par4 == 8) {
                playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, 0, (Teleporter)new WorldTeleporterDBCTelep(playerMP.mcServer.worldServerForDimension(0)));
                playerMP.playerNetServerHandler.setPlayerLocation(77.5, 217.0, 10.5, 0.0f, 0.0f);
                playerMP.addExperience(1);
            }
        }
    }
}

