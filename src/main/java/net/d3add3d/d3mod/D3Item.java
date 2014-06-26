package net.d3add3d.d3mod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.d3add3d.d3mod.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class D3Item extends Item {
	public D3Item(String par1Name) {
		super();
		this.setUnlocalizedName(par1Name);
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}
}
