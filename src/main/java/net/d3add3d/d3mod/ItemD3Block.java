package net.d3add3d.d3mod;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemD3Block extends ItemBlock {

	public ItemD3Block(Block p_i45328_1_) {
		super(p_i45328_1_);
		D3Mod.logger.info("ItemBlock: " + this.getUnlocalizedName());
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4Boolean)
	{
		switch (this.getUnlocalizedName().substring(5))
		{
		case "unknownOne": par3List.add("Can't be crafted, only decorative prupose."); break;
		case "unknownTwo": par3List.add("Can't be crafted, only decorative prupose."); break;
		default : par3List.add("NO MATCHING CASE, ADD ME!"); break;
		}
	}

}
