package net.d3add3d.d3mod;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.d3add3d.d3mod.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class D3Item extends Item {
	public D3Item(String par1Name) {
		super();
		this.setUnlocalizedName(par1Name);
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
		this.setCreativeTab(CreativeTabs.tabDecorations);
		D3Mod.logger.info("Substringed item: " + this.getUnlocalizedName().substring(5));
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4Boolean)
	{
		switch (this.getUnlocalizedName().substring(5))
		{
		case "blackPowder": par3List.add("Can be used as dye."); break;
		//case "fakeEmerald": par3List.add("Useless, may get removed."); break;
		}
	}
}
