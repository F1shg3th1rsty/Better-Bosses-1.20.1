package net.fishgethirsty.better_bosses;

import net.fabricmc.api.ModInitializer;

import net.fishgethirsty.better_bosses.item.ModItemGroups;
import net.fishgethirsty.better_bosses.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterBosses implements ModInitializer {

	public static final String MOD_ID = "better_bosses";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}