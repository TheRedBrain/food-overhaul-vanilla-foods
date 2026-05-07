package com.github.theredbrain.foodoverhaulvanillafoods.compat;

import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.FoodOverhaulVanillaFoods_StatusEffects;
import com.github.theredbrain.overhauleddamage.OverhauledDamage;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class OverhauledDamageCompat {
	public static void addAttributes() {
//		StatusEffectsRegistry.BEETROOT_SOUP_FOOD_EFFECT
//				.addAttributeModifier(OverhauledDamage.FROST_RESISTANCE, FoodOverhaulVanillaFoods.identifier("effect.beetroot_soup_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		FoodOverhaulVanillaFoods_StatusEffects.BEEF_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.beef_food_effect"), -2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoods_StatusEffects.CHICKEN_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.chicken_food_effect"), -2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoods_StatusEffects.COD_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.cod_food_effect"), -2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoods_StatusEffects.HONEY_BOTTLE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.MAX_POISON_BUILD_UP, FoodOverhaulVanillaFoods.identifier("effect.honey_bottle_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.honey_bottle_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoods_StatusEffects.POISONOUS_POTATO_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.poisonous_potato_food_effect"), -3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoods_StatusEffects.PORKCHOP_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.porkchop_porkchop_food_effect"), -2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoods_StatusEffects.PUFFERFISH_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.pufferfish_food_effect"), -5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoods_StatusEffects.RED_MUSHROOM_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.red_mushroom_food_effect"), -4.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoods_StatusEffects.SALMON_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.salmon_food_effect"), -2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoods_StatusEffects.SPIDER_EYE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.spider_eye_food_effect"), -3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoods_StatusEffects.TROPICAL_FISH_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.tropical_fish_food_effect"), -2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
	}
}
