package net.tropicquest.enderaddons;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class EnderAddonsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {

		generator.createPack().addProvider(AdvancementsProvider::new);

		// .. (Your other generators)
	}
}
