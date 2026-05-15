package com.github.theredbrain.foodoverhaulvanillafoods.compat;

import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.FoodOverhaulVanillaFoodsStatusEffects;
import com.github.theredbrain.overhauleddamage.OverhauledDamage;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class OverhauledDamageCompat {
	public static void addAttributes() {
		FoodOverhaulVanillaFoodsStatusEffects.BEEF_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.beef_food_effect"), -2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.CHICKEN_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.chicken_food_effect"), -2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.HONEY_BOTTLE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.MAX_POISON_BUILD_UP, FoodOverhaulVanillaFoods.identifier("effect.honey_bottle_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.honey_bottle_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.POISONOUS_POTATO_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.poisonous_potato_food_effect"), -3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.PORKCHOP_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.porkchop_porkchop_food_effect"), -2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.PUFFERFISH_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.pufferfish_food_effect"), -5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.RED_MUSHROOM_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.red_mushroom_food_effect"), -4.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.SPIDER_EYE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.spider_eye_food_effect"), -3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.TROPICAL_FISH_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.tropical_fish_food_effect"), -2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
	}
}
