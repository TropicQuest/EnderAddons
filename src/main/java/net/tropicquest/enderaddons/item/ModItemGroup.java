package net.tropicquest.enderaddons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tropicquest.enderaddons.EnderAddons;

public class ModItemGroup {
    public static ItemGroup ENDERADDONS;

    public static void registerItemGroups() {
        ENDERADDONS = FabricItemGroup.builder(new Identifier(EnderAddons.MOD_ID, "endershardfragment"))
                .displayName(Text.literal("Ender Addons"))
                .icon(() -> new ItemStack(ModItems.ENDERSWORD)).build();
    }
}
