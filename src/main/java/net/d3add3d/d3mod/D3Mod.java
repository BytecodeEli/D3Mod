package net.d3add3d.d3mod;

import java.util.Arrays;

import net.d3add3d.d3mod.lib.ConfigHandler;
import net.d3add3d.d3mod.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
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
    public static Item blackPowder, fakeEmerald;
    D3EventHandler events = new D3EventHandler();

    @EventHandler 
    public void preInit(FMLPreInitializationEvent event)
    {
        logger.info("*********D3MOD PREINITIALIZING*********");
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(events);
        FMLCommonHandler.instance().bus().register(events);
        if (Reference.DEBUG == 1) logger.info("Password is: " + Reference.PASSWORD + " and config says: " + Reference.PASSWORD_CONFIG);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	logger.info("*********D3MOD INITIALIZING*********");
        logger.warn("I like using asterisks :)");
        unknownOne = new D3BlockRotated(Material.iron, "unknownOne");
        unknownTwo = new D3BlockRotated(Material.iron, "unknownTwo");
        blackPowder = new D3Item("blackPowder");
        fakeEmerald = new D3Item("fakeEmerald");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	logger.info("*********D3MOD POSTINITIALIZING*********");
    	logger.info("Adding RottenFlesh to Leather smelting.");
    	logger.info("Adding coal/charcoal to black powder crafting.");
    	logger.info("Adding fake emerald recipe.");
    	logger.info("Adding emerald cloning recipe");
    	logger.info("Removing OPedness...");
    	if (Reference.DEBUG == 1) logger.info(Arrays.toString(OreDictionary.getOreNames()));
    	GameRegistry.registerBlock(unknownOne, unknownOne.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(unknownTwo, unknownTwo.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(blackPowder, blackPowder.getUnlocalizedName().substring(5), Reference.MODID);
    	GameRegistry.registerItem(fakeEmerald, fakeEmerald.getUnlocalizedName().substring(5), Reference.MODID);
    	OreDictionary.registerOre("dyeBlack", blackPowder);
    	OreDictionary.registerOre("gemEmerald", fakeEmerald);
    	
    	GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 1.0F);
    	
    	ItemStack vanillaItemCoal = new ItemStack(Items.coal);
    	ItemStack vanillaItemChar = new ItemStack(Items.coal, 0, 1);
    	ItemStack vanillaCobble = new ItemStack(Blocks.cobblestone);
    	ItemStack vanillaItemDia = new ItemStack(Items.diamond);
    	ItemStack vanillaItemEmerald = new ItemStack(Items.emerald);
    	ItemStack vanillaItemGold = new ItemStack(Items.gold_ingot);
    	ItemStack vanillaDyeLime = new ItemStack(Items.dye, 0, 10);
    	
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(blackPowder), vanillaItemCoal, vanillaCobble);
    	GameRegistry.addShapelessRecipe(new ItemStack(blackPowder), vanillaItemChar, vanillaCobble);
    	GameRegistry.addShapelessRecipe(new ItemStack(fakeEmerald), vanillaItemDia, vanillaDyeLime, vanillaItemGold, vanillaDyeLime, vanillaItemDia, vanillaItemGold);
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 2), vanillaItemEmerald, vanillaDyeLime, vanillaItemDia);
    }
    
}
