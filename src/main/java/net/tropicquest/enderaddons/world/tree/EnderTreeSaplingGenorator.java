package net.tropicquest.enderaddons.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.tropicquest.enderaddons.world.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;


public class EnderTreeSaplingGenorator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.ENDERTREE_KEY;
    }
}
