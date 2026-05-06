package com.github.theredbrain.foodoverhaulvanillafoods.compat;

import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.StatusEffectsRegistry;
import com.github.theredbrain.manaattributes.ManaAttributes;
import com.github.theredbrain.staminaattributes.StaminaAttributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class ManaAttributesCompat {
	public static void addAttributes() {
		StatusEffectsRegistry.BROWN_MUSHROOM_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.brown_mushroom_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		StatusEffectsRegistry.CHORUS_FRUIT_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.chorus_fruit_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		StatusEffectsRegistry.CRIMSON_FUNGUS_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.crimson_fungus_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		StatusEffectsRegistry.FERMENTED_SPIDER_EYE_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.fermented_spider_eye_food_effect"), 20.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.fermented_spider_eye_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		StatusEffectsRegistry.GLOW_BERRIES_FOOD_EFFECT
//				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		StatusEffectsRegistry.MUSHROOM_STEW_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		StatusEffectsRegistry.NETHER_WART_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.nether_wart_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		StatusEffectsRegistry.RED_MUSHROOM_FOOD_EFFECT
//				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.red_mushroom_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		StatusEffectsRegistry.SPIDER_EYE_FOOD_EFFECT
//				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.spider_eye_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		StatusEffectsRegistry.SUSPICIOUS_STEW_FOOD_EFFECT
//				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.suspicious_stew_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		StatusEffectsRegistry.RABBIT_STEW_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		StatusEffectsRegistry.WARPED_FUNGUS_FOOD_EFFECT
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.warped_fungus_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
	}
}
