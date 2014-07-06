package net.d3add3d.d3mod;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class D3Weapon extends Item {

	private float field_150934_a;
	final static ToolMaterial toolmat = ToolMaterial.EMERALD;

	public D3Weapon(String par1String, int par2Integer, boolean par3Boolean) {
		super();
		this.setUnlocalizedName(par1String);
		this.maxStackSize = 1;
		if (par3Boolean) {
			this.setMaxDamage(Integer.MAX_VALUE);
		} else {
			this.setMaxDamage(par2Integer);
		}
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.field_150934_a = 4.0F + toolmat.getDamageVsEntity();
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4Boolean)
	{
		switch (this.getUnlocalizedName().substring(5))
		{
		case "nail": par3List.add("It's nine inches long!"); break;
		case "nailReinforced": par3List.add("Should last a bit longer..."); break;
		//case "unbrekableNail": par3List.add("Hey, who bent it?"); break;
		case "nailUnbreakable" : par3List.add("W.I.P. Minecraft is stupid -_-"); break;
		}
	}
	
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }
	
}
