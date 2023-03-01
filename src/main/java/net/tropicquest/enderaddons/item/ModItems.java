package net.tropicquest.enderaddons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tropicquest.enderaddons.EnderAddons;
import net.tropicquest.enderaddons.item.custom.ModAxeItem;
import net.tropicquest.enderaddons.item.custom.ModHoeItem;
import net.tropicquest.enderaddons.item.custom.ModPickaxeItem;

public class ModItems {
    public static final Item ENDERSHARDFRAGMENT = registerItem("endershardfragment",
            new Item(new FabricItemSettings()));
    public static ToolItem ENDERSWORD = new SwordItem(EnderToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());
    public static ToolItem ENDERPICKAXE = new ModPickaxeItem(EnderToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings());
    public static ToolItem ENDERAXE = new ModAxeItem(EnderToolMaterial.INSTANCE, 7.0F, -3.2F, new Item.Settings());
    public static ToolItem ENDERHOE = new ModHoeItem(EnderToolMaterial.INSTANCE, 2, -3.2F, new Item.Settings());
    public static ToolItem ENDERSHOVEL = new ShovelItem(EnderToolMaterial.INSTANCE, 1F, -3.0F, new Item.Settings());

    public static final ArmorMaterial ENDER_ARMOR_MATERIAL = new EnderArmorMaterial();
    public static final Item ENDERHELMET = new ArmorItem(ENDER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings());
    public static final Item ENDERCHESTPLATE = new ArmorItem(ENDER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings());
    public static final Item ENDERLEGGINGS = new ArmorItem(ENDER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings());
    public static final Item ENDERBOOTS = new ArmorItem(ENDER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings());

    public static void registerarmor() {
        Registry.register(Registries.ITEM, new Identifier("enderaddons", "enderhelmet"), ENDERHELMET);
        Registry.register(Registries.ITEM, new Identifier("enderaddons", "enderchestplate"), ENDERCHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("enderaddons", "enderleggings"), ENDERLEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("enderaddons", "enderboots"), ENDERBOOTS);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EnderAddons.MOD_ID, name), item);
    }
    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERSHARDFRAGMENT);
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERSWORD);
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERPICKAXE);
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERAXE);
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERHOE);
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERSHOVEL);
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERHELMET);
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERCHESTPLATE);
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERLEGGINGS);
        addToItemGroup(ModItemGroup.ENDERADDONS, ENDERBOOTS);
    }
    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        EnderAddons.LOGGER.info("Registering Mod Items for " + EnderAddons.MOD_ID);

        addItemsToItemGroup();
    }
}
