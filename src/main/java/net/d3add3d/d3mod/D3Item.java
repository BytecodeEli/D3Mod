package net.d3add3d.d3mod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.d3add3d.d3mod.lib.Reference;
import net.minecraft.item.Item;

public class D3Item extends Item {
	public D3Item() {
		super();
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
}
