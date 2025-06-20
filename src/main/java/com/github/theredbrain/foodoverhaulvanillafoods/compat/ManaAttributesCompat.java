package com.github.theredbrain.foodoverhaulvanillafoods.compat;

import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.StatusEffectsRegistry;
import com.github.theredbrain.manaattributes.ManaAttributes;
import com.github.theredbrain.staminaattributes.StaminaAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier;

public class ManaAttributesCompat {
	public static void addAttributes() {
		StatusEffectsRegistry.FERMENTED_SPIDER_EYE_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.fermented_spider_eye_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.fermented_spider_eye_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
		StatusEffectsRegistry.GLOW_BERRIES_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
		StatusEffectsRegistry.RED_MUSHROOM_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.red_mushroom_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
		StatusEffectsRegistry.SUSPICIOUS_STEW_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.suspicious_stew_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
	}
}
