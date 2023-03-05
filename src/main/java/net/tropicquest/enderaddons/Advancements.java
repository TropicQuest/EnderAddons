package net.tropicquest.enderaddons;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.ConsumeItemCriterion;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tropicquest.enderaddons.item.ModItems;

import java.util.function.Consumer;

public class Advancements implements Consumer<Consumer<Advancement>> {

    @Override
    public void accept(Consumer<Advancement> consumer) {
        Advancement rootAdvancement = Advancement.Builder.create()
                .display(
                        ModItems.ENDERSHARD, // The display icon
                        Text.literal("Shiny End Rocks"), // The title
                        Text.literal("Obtain an Ender Shard"), // The description
                        new Identifier("textures/gui/advancements/backgrounds/endershard_block.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_dirt", InventoryChangedCriterion.Conditions.items(ModItems.ENDERSHARD))
                .build(consumer, "enderaddons" + "/root");

        Advancement gotArmorAdvancement = Advancement.Builder.create().parent(rootAdvancement)
                .display(
                        ModItems.ENDERCHESTPLATE,
                        Text.literal("Cover me in Ender Shards"),
                        Text.literal("Obtain a full set of EnderArmor"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .criterion("got_helmet", InventoryChangedCriterion.Conditions.items(ModItems.ENDERHELMET))
                .criterion("got_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.ENDERCHESTPLATE))
                .criterion("got_leggings", InventoryChangedCriterion.Conditions.items(ModItems.ENDERLEGGINGS))
                .criterion("got_boots", InventoryChangedCriterion.Conditions.items(ModItems.ENDERBOOTS))
                .build(consumer, "enderaddons" + "/got_armor");

        Advancement gotToolAdvancement = Advancement.Builder.create().parent(rootAdvancement)
                .display(
                        ModItems.ENDERPICKAXE,
                        Text.literal("The Tools at the End of the Game"),
                        Text.literal("Obtain a full set of EnderTools except the EnderHoe"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .criterion("got_sword", InventoryChangedCriterion.Conditions.items(ModItems.ENDERSWORD))
                .criterion("got_pickaxe", InventoryChangedCriterion.Conditions.items(ModItems.ENDERPICKAXE))
                .criterion("got_axe", InventoryChangedCriterion.Conditions.items(ModItems.ENDERAXE))
                .criterion("got_shovel", InventoryChangedCriterion.Conditions.items(ModItems.ENDERSHOVEL))
                .build(consumer, "enderaddons" + "/got_tools");

        Advancement gotHoeAdvancment = Advancement.Builder.create().parent(gotToolAdvancement)
                .display(
                        ModItems.ENDERHOE,
                        Text.literal("Stupidity Certificate"),
                        Text.literal("Obtain an EnderHoe"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )

                .criterion("got_hoe", InventoryChangedCriterion.Conditions.items(ModItems.ENDERHOE))
                .build(consumer, "enderaddons" + "/got_hoe");

        Advancement gotEverything = Advancement.Builder.create().parent(gotArmorAdvancement)
                .display(
                        ModItems.ENDERTROPHY,
                        Text.literal("Cool Trophy"),
                        Text.literal("Get all tools & armor"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false

                )
                .rewards(AdvancementRewards.Builder.loot(new Identifier("enderaddons", "endertrophy")))
                .criterion("got_sword1", InventoryChangedCriterion.Conditions.items(ModItems.ENDERSWORD))
                .criterion("got_pickaxe1", InventoryChangedCriterion.Conditions.items(ModItems.ENDERPICKAXE))
                .criterion("got_axe1", InventoryChangedCriterion.Conditions.items(ModItems.ENDERAXE))
                .criterion("got_hoe1", InventoryChangedCriterion.Conditions.items(ModItems.ENDERHOE))
                .criterion("got_shovel1", InventoryChangedCriterion.Conditions.items(ModItems.ENDERSHOVEL))
                .criterion("got_helmet1", InventoryChangedCriterion.Conditions.items(ModItems.ENDERHELMET))
                .criterion("got_chestplate1", InventoryChangedCriterion.Conditions.items(ModItems.ENDERCHESTPLATE))
                .criterion("got_leggings1", InventoryChangedCriterion.Conditions.items(ModItems.ENDERLEGGINGS))
                .criterion("got_boots1", InventoryChangedCriterion.Conditions.items(ModItems.ENDERBOOTS))
                .build(consumer, "enderaddons" + "/got_everything");
    }
}