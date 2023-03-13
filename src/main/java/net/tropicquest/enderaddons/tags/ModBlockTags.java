package net.tropicquest.enderaddons.tags;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> EnderSaplingPlantable = TagKey.of(RegistryKeys.BLOCK, new Identifier("enderaddons", "endersapling_growable_on"));
    public static final TagKey<Block> EnderLeavesNoDecay = TagKey.of(RegistryKeys.BLOCK, new Identifier("enderaddons", "enderleaves_nodecay"));
}
