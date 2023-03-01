package net.tropicquest.enderaddons.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EnderToolMaterial implements ToolMaterial {

    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0F;
    }

    @Override
    public float getAttackDamage() {
        return 10.0F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.ENDERSHARDFRAGMENT);
    }
    public static final EnderToolMaterial INSTANCE = new EnderToolMaterial();
}