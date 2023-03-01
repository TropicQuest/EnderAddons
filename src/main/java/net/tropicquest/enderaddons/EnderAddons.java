package net.tropicquest.enderaddons;

import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tropicquest.enderaddons.block.ModBlocks;
import net.tropicquest.enderaddons.item.ModItemGroup;
import net.tropicquest.enderaddons.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.tropicquest.enderaddons.item.ModItems.*;

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
		ModItems.registerarmor();
		Registry.register(Registries.ITEM, new Identifier("enderaddons", "endersword"), ENDERSWORD);
		Registry.register(Registries.ITEM, new Identifier("enderaddons", "enderpickaxe"), ENDERPICKAXE);
		Registry.register(Registries.ITEM, new Identifier("enderaddons", "enderhoe"), ENDERHOE);
		Registry.register(Registries.ITEM, new Identifier("enderaddons", "endershovel"), ENDERSHOVEL);
		Registry.register(Registries.ITEM, new Identifier("enderaddons", "enderaxe"), ENDERAXE);

	}
}

