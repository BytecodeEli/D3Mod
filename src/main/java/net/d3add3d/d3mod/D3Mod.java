package net.d3add3d.d3mod;

import net.d3add3d.d3mod.lib.ConfigHandler;
import net.d3add3d.d3mod.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class D3Mod
{

    final static Logger logger = LogManager.getFormatterLogger(Reference.MODID);
    public static Block unknownOne, unknownTwo;
    public static Item blackPowder;
    D3EventHandler events = new D3EventHandler();

    @EventHandler 
    public void preInit(FMLPreInitializationEvent event)
    {
    	//System.out.println("*********D3MOD PREINITIALIZING*********");
        logger.info("*********D3MOD PREINITIALIZING*********");
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(events);
        FMLCommonHandler.instance().bus().register(events);
        logger.info("Password is: " + Reference.PASSWORD + " and config says: " + Reference.PASSWORD_CONFIG);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //System.out.println("*********D3MOD INITIALIZING*********");
    	logger.info("*********D3MOD INITIALIZING*********");
        logger.warn("I like using asterisks :)");
        unknownOne = new D3BlockRotated(Material.iron).setBlockName("unknownOne").setCreativeTab(CreativeTabs.tabDecorations);
        unknownTwo = new D3BlockRotated(Material.iron).setBlockName("unknownTwo").setCreativeTab(CreativeTabs.tabDecorations);
        blackPowder = new D3Item().setUnlocalizedName("blackPowder").setCreativeTab(CreativeTabs.tabDecorations);
        //logger.warn("DEBUG: " + unknownOne.getUnlocalizedName() + ", " + unknownTwo.getUnlocalizedName());
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	//System.out.println("*********D3MOD POSTINITIALIZING*********");
    	logger.info("*********D3MOD POSTINITIALIZING*********");
    	logger.info("Adding RottenFlesh to Leather smelting.");
    	GameRegistry.registerBlock(unknownOne, unknownOne.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(unknownTwo, unknownTwo.getUnlocalizedName().substring(5));
    	GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 1.0F);
    	
    	ItemStack vanillaCoal = new ItemStack(Items.coal);
    	ItemStack vanillaChar = new ItemStack(Items.)
    	
    	GameRegistry.addShapelessRecipe();
    }
    
}
