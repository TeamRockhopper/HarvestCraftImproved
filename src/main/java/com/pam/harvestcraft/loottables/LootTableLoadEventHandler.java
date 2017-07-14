package com.pam.harvestcraft.loottables;

import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootTableLoadEventHandler {

	@SubscribeEvent
	public void onLootTableLoad(LootTableLoadEvent event) {
		LootHandler.handleLootTableMod(event);
	}
}
