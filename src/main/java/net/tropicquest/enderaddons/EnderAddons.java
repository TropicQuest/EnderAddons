package net.tropicquest.enderaddons;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
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
	public static final RegistryKey<PlacedFeature> CUSTOM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("enderaddons","endershard_ore"));


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
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, CUSTOM_ORE_PLACED_KEY);

	}
}

