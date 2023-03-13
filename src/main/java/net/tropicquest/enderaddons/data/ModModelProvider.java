package net.tropicquest.enderaddons.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.tropicquest.enderaddons.block.ModBlocks;

import java.util.function.BiFunction;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.ENDERTREE_LOG).log(ModBlocks.ENDERTREE_LOG).wood(ModBlocks.ENDERTREE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.ENDERTREE_STRIPPED_LOG).log(ModBlocks.ENDERTREE_STRIPPED_LOG).wood(ModBlocks.ENDERTREE_STRIPPED_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERTREE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERTREE_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.ENDERTREE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERTREE_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
