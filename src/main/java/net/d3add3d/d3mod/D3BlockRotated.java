package net.d3add3d.d3mod;

import java.util.List;

import net.d3add3d.d3mod.lib.Reference;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class D3BlockRotated extends BlockDirectional {
	
	@SideOnly(Side.CLIENT)
	private IIcon field_149986_M;
	@SideOnly(Side.CLIENT)
	private IIcon field_149984_b;
	
	public D3BlockRotated(Material par1Material, String par2Name)
	{
	super(par1Material);
	this.setCreativeTab(CreativeTabs.tabDecorations);
	this.setBlockName(par2Name);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.field_149984_b : (p_149691_1_ == 0 ? this.field_149984_b : (p_149691_2_ == 2 && p_149691_1_ == 2 ? this.field_149986_M : (p_149691_2_ == 3 && p_149691_1_ == 5 ? this.field_149986_M : (p_149691_2_ == 0 && p_149691_1_ == 3 ? this.field_149986_M : (p_149691_2_ == 1 && p_149691_1_ == 4 ? this.field_149986_M : this.blockIcon)))));
    }
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack)
    {
        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, l, 2);
    }
	
	/*
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister par1){
		this.blockIcon = par1.registerIcon(Reference.MODID.toLowerCase() + ":" + this.getUnlocalizedName());
	}
	*/
	@SideOnly(Side.CLIENT)
	@Override
    public void registerBlockIcons(IIconRegister par1IIconRegister)
    {
        this.field_149986_M = par1IIconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5) + "_face");
        this.field_149984_b = par1IIconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5) + "_top");
        this.blockIcon = par1IIconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5) + "_side");
    }
	
}
