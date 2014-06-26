package net.d3add3d.d3mod;

import net.d3add3d.d3mod.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class D3Block extends Block {
	public D3Block(Material par1Material, String par2Name)
	{
	super(par1Material);
	this.setCreativeTab(CreativeTabs.tabDecorations);
	this.setBlockName(par2Name);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister par1){
		this.blockIcon = par1.registerIcon(Reference.MODID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}
}
