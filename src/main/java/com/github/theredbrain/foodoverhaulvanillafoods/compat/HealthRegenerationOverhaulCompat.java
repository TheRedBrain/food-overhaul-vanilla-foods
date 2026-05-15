package com.github.theredbrain.foodoverhaulvanillafoods.compat;

import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.FoodOverhaulVanillaFoodsStatusEffects;
import com.github.theredbrain.healthregenerationoverhaul.HealthRegenerationOverhaul;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class HealthRegenerationOverhaulCompat {
	public static void addAttributes() {
		FoodOverhaulVanillaFoodsStatusEffects.BREAD_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.bread_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.CAKE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cake_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.COD_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cod_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.COOKED_COD_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_cod_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.COOKED_SALMON_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_salmon_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.MILK_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.milk_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.MUSHROOM_STEW_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.PUMPKIN_PIE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.pumpkin_pie_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.SALMON_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.salmon_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
	}
}
