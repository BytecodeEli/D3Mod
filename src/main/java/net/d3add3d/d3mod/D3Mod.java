package net.d3add3d.d3mod;

import net.d3add3d.d3mod.lib.*;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class D3Mod
{
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("'This is me testing CI and Minecraft 1.7.2 :)' - D3add3d");
    }
}
