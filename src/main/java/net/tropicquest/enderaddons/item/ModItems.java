package net.tropicquest.enderaddons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tropicquest.enderaddons.EnderAddons;

public class ModItems {
    public static final Item ENDERSHARDFRAGMENT = registerItem("endershardfragment",
            new Item(new FabricItemSettings()));
    public static final Item ENDERSWORD = registerItem("endersword",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EnderAddons.MOD_ID, name), item);
    }
    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERSHARDFRAGMENT);
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERSWORD);
    }
    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        EnderAddons.LOGGER.info("Registering Mod Items for " + EnderAddons.MOD_ID);

        addItemsToItemGroup();
    }
}
