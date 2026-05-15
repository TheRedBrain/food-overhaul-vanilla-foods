package com.github.theredbrain.foodoverhaulvanillafoods.compat;

import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.FoodOverhaulVanillaFoodsStatusEffects;
import com.github.theredbrain.staminaattributes.StaminaAttributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class StaminaAttributesCompat {
	public static void addAttributes() {
		FoodOverhaulVanillaFoodsStatusEffects.APPLE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.apple_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.BAKED_POTATO_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.baked_potato_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.BEETROOT_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.beetroot_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.BEETROOT_SOUP_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.beetroot_soup_food_effect"), 30.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.BREAD_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.bread_food_effect"), 20.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.CAKE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cake_food_effect"), 20.0F, AttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cake_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.CARROT_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.carrot_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.COCOA_BEANS_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cocoa_beans_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.COOKED_COD_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_cod_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.COOKED_SALMON_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_salmon_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.COOKIE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cookie_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cookie_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.DRIED_KELP_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION_DELAY_THRESHOLD, FoodOverhaulVanillaFoods.identifier("effect.dried_kelp_food_effect"), -30.0F, AttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(StaminaAttributes.STAMINA_TICK_THRESHOLD, FoodOverhaulVanillaFoods.identifier("effect.dried_kelp_food_effect"), -10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.enchanted_golden_apple_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.GLOW_BERRIES_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.GOLDEN_APPLE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.golden_apple_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.GOLDEN_CARROT_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.golden_carrot_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.MELON_SLICE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.melon_slice_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.POTATO_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.potato_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.PUMPKIN_PIE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.pumpkin_pie_food_effect"), 20.0F, AttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.pumpkin_pie_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.RABBIT_STEW_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 20.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.SUGAR_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.sugar_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.SWEET_BERRIES_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.sweet_berries_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
	}
}
