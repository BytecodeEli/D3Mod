package net.d3add3d.d3mod;

import net.d3add3d.d3mod.lib.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.event.*;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class D3Mod
{

    private static final Logger logger = FMLLog.getLogger();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	System.out.println("*********D3MOD PREINITIALIZING*********");
        logger.info("*********D3MOD PREINITIALIZING*********");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("*********D3MOD INITIALIZING*********");
        logger.info("I like using asterisks :)");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	System.out.println("*********D3MOD POSTINITIALIZING*********");
    	GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather, 0), 1.0F);
    }
    
}
u
