package com.github.theredbrain.foodoverhaulvanillafoods.compat;

import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.FoodOverhaulVanillaFoodsStatusEffects;
import com.github.theredbrain.staminaattributes.StaminaAttributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class StaminaAttributesCompat {
	public static void addAttributes() {
		FoodOverhaulVanillaFoodsStatusEffects.APPLE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.apple_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.apple_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.BAKED_POTATO_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.baked_potato_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.baked_potato_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		StatusEffectsRegistry.BEEF_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.beef_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.beef_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		FoodOverhaulVanillaFoodsStatusEffects.BEETROOT_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.beetroot_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.beetroot_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.BEETROOT_SOUP_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.beetroot_soup_food_effect"), 30.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.beetroot_soup_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.BREAD_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.bread_food_effect"), 20.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.bread_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		StatusEffectsRegistry.BROWN_MUSHROOM_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.brown_mushroom_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.brown_mushroom_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		FoodOverhaulVanillaFoodsStatusEffects.CAKE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cake_food_effect"), 20.0F, AttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cake_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.CARROT_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.carrot_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.carrot_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		StatusEffectsRegistry.CHICKEN_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.chicken_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		StatusEffectsRegistry.CHORUS_FRUIT_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.chorus_fruit_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.chorus_fruit_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		FoodOverhaulVanillaFoodsStatusEffects.COCOA_BEANS_FOOD_EFFECT_INSTANCE
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cocoa_beans_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cocoa_beans_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		StatusEffectsRegistry.COD_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cod_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cod_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		StatusEffectsRegistry.COOKED_BEEF_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_beef_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_beef_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		StatusEffectsRegistry.COOKED_CHICKEN_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_chicken_food_effect"), 6.0F, AttributeModifier.Operation.ADD_VALUE)
////				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_chicken_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		FoodOverhaulVanillaFoodsStatusEffects.COOKED_COD_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_cod_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_cod_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		StatusEffectsRegistry.COOKED_MUTTON_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_mutton_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_mutton_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		StatusEffectsRegistry.COOKED_PORKCHOP_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_porkchop_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_porkchop_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		StatusEffectsRegistry.COOKED_RABBIT_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_rabbit_food_effect"), 6.0F, AttributeModifier.Operation.ADD_VALUE)
////				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_rabbit_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		FoodOverhaulVanillaFoodsStatusEffects.COOKED_SALMON_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_salmon_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_salmon_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
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
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.enchanted_golden_apple_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.GLOW_BERRIES_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.GOLDEN_APPLE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.golden_apple_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.golden_apple_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.GOLDEN_CARROT_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.golden_carrot_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.golden_carrot_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.MELON_SLICE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.melon_slice_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.melon_slice_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		StatusEffectsRegistry.MUSHROOM_STEW_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		StatusEffectsRegistry.MUTTON_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.mutton_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.mutton_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		FoodOverhaulVanillaFoodsStatusEffects.POTATO_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.potato_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.potato_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.PUMPKIN_PIE_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.pumpkin_pie_food_effect"), 20.0F, AttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.pumpkin_pie_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		StatusEffectsRegistry.RABBIT_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.rabbit_food_effect"), 20.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.rabbit_food_effect"), 3.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		FoodOverhaulVanillaFoodsStatusEffects.RABBIT_STEW_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 20.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoodsStatusEffects.SUGAR_FOOD_EFFECT_INSTANCE
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.sugar_food_effect"), 25.0F, AttributeModifier.Operation.ADD_VALUE)
				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.sugar_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		StatusEffectsRegistry.SUSPICIOUS_STEW_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.suspicious_stew_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		FoodOverhaulVanillaFoodsStatusEffects.SWEET_BERRIES_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.sweet_berries_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//				.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.sweet_berries_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		StatusEffectsRegistry.WARPED_FUNGUS_FOOD_EFFECT
//				.addAttributeModifier(StaminaAttributes.RESERVED_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.warped_fungus_food_effect"), 30.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
	}
}
