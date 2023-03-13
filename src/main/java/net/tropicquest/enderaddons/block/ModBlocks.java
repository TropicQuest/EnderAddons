package net.tropicquest.enderaddons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.tropicquest.enderaddons.EnderAddons;
import net.tropicquest.enderaddons.item.ModItemGroup;
import net.tropicquest.enderaddons.world.tree.EnderLeavesBlock;
import net.tropicquest.enderaddons.world.tree.EnderSaplingBlock;
import net.tropicquest.enderaddons.world.tree.EnderTreeSaplingGenorator;

public class ModBlocks {
    public static final Block ENDERPEARL_BLOCK = registerBlock("enderpearl_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).requiresTool().luminance(2)), ModItemGroup.ENDERADDONS);

    public static final Block ENDERSHARD_BLOCK = registerBlock("endershard_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(10.0f).requiresTool().luminance(5).sounds(BlockSoundGroup.AMETHYST_BLOCK)), ModItemGroup.ENDERADDONS);
    public static final Block ENDERSHARD_ORE = registerBlock("endershard_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(10.0f).requiresTool(),
                    UniformIntProvider.create(10,15)), ModItemGroup.ENDERADDONS);
    public static final Block ENDER_GRASS = registerBlock("ender_grass",
            new Block(FabricBlockSettings.of(Material.PLANT).strength(5.0f).requiresTool().sounds(BlockSoundGroup.GRASS)), ModItemGroup.ENDERADDONS);

    public static  final  Block ENDERTREE_LOG = registerBlock("endertree_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.ENDERADDONS);
    public static  final  Block ENDERTREE_WOOD = registerBlock("endertree_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.ENDERADDONS);
    public static  final  Block ENDERTREE_STRIPPED_LOG = registerBlock("endertree_stripped_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.ENDERADDONS);
    public static  final  Block ENDERTREE_STRIPPED_WOOD = registerBlock("endertree_stripped_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.ENDERADDONS);
    public static  final  Block ENDERTREE_PLANKS = registerBlock("endertree_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.ENDERADDONS);
    public static  final  Block ENDERTREE_LEAVES = registerBlock("endertree_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool().luminance(10)), ModItemGroup.ENDERADDONS);
    public static  final  Block ENDERTREE_SAPLING = registerBlock("endertree_sapling",
            new EnderSaplingBlock(new EnderTreeSaplingGenorator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool().luminance(10)), ModItemGroup.ENDERADDONS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(EnderAddons.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(EnderAddons.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;

    }
    public static void registerModBlocks() {
        EnderAddons.LOGGER.info("Registering ModBlocks for " + EnderAddons.MOD_ID);
    }
}
