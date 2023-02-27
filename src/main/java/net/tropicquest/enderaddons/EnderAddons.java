package net.tropicquest.enderaddons;

import net.fabricmc.api.ModInitializer;

import net.tropicquest.enderaddons.block.ModBlocks;
import net.tropicquest.enderaddons.item.ModItemGroup;
import net.tropicquest.enderaddons.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnderAddons implements ModInitializer {
	public static final String MOD_ID = "enderaddons";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("enderaddons");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
