package net.d3add3d.d3mod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.d3add3d.d3mod.lib.Reference;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class D3Block extends Block {
	public D3Block(Material par1Material)
	{
	super(par1Material);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister par1){
		this.blockIcon = par1.registerIcon(Reference.MODID.toLowerCase() + ":" + this.getUnlocalizedName());
	}
}
