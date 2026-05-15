package com.github.theredbrain.foodoverhaulvanillafoods.compat;

import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.FoodOverhaulVanillaFoodsStatusEffects;
import com.github.theredbrain.manaattributes.ManaAttributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class ManaAttributesCompat {
	public static void addAttributes() {
		FoodOverhaulVanillaFoodsStatusEffects.BROWN_MUSHROOM_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.brown_mushroom_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.CHORUS_FRUIT_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.chorus_fruit_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.CRIMSON_FUNGUS_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.crimson_fungus_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.FERMENTED_SPIDER_EYE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.fermented_spider_eye_food_effect"), 20.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.MUSHROOM_STEW_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.NETHER_WART_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.nether_wart_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.RABBIT_STEW_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.WARPED_FUNGUS_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.warped_fungus_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
	}
}
