package net.d3add3d.d3mod;

import net.d3add3d.d3mod.lib.Reference;
import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class D3EventHandler {
	
	@SubscribeEvent
	public void welcome(PlayerEvent.PlayerLoggedInEvent event)
	{
		event.player.addChatMessage(new ChatComponentText("In memory of great companion and best cat in the world Columbus."));
		if(Reference.PASSWORD_CONFIG.equals(Reference.PASSWORD))
		{
			event.player.addChatMessage(new ChatComponentText("This is official KingForge pack, enjoy!"));
		}
	}
	@SubscribeEvent
	public void hello(PlayerEvent.ItemCraftedEvent event)
	{
		if(event.crafting.getUnlocalizedName() == "item.fakeEmerald") event.player.addChatMessage(new ChatComponentText("Gratz! You just crafted useless item."));
	}
}
