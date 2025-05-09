package com.github.theredbrain.foodoverhaulvanillafoods.registry;

import com.github.theredbrain.foodoverhaul.effect.FoodStatusEffect;
import com.github.theredbrain.foodoverhaul.effect.RemoveFoodStatusEffect;
import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.healthregenerationoverhaul.HealthRegenerationOverhaul;
import com.github.theredbrain.manaattributes.ManaAttributes;
import com.github.theredbrain.overhauleddamage.OverhauledDamage;
import com.github.theredbrain.staminaattributes.StaminaAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

public class StatusEffectsRegistry {
	private static final StatusEffect APPLE_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect BAKED_POTATO_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect BEEF_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect BEETROOT_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect BEETROOT_SOUP_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect BREAD_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect BROWN_MUSHROOM_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect CAKE_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect CARROT_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect CHICKEN_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect CHORUS_FRUIT_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect COCOA_BEANS_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect COD_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect COOKED_BEEF_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect COOKED_CHICKEN_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect COOKED_COD_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect COOKED_MUTTON_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect COOKED_PORKCHOP_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect COOKED_RABBIT_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect COOKED_SALMON_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect COOKIE_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect DRIED_KELP_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect FERMENTED_SPIDER_EYE_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect GLOW_BERRIES_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect GOLDEN_APPLE_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect GOLDEN_CARROT_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect HONEY_BOTTLE_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect MELON_SLICE_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect MUSHROOM_STEW_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect MUTTON_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect POISONOUS_POTATO_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect PORKCHOP_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect POTATO_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect PUFFERFISH_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect PUMPKIN_PIE_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect RABBIT_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect RABBIT_STEW_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect RED_MUSHROOM_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect ROTTEN_FLESH_FOOD_EFFECT = new RemoveFoodStatusEffect();
	private static final StatusEffect SALMON_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect SPIDER_EYE_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect SUGAR_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect SUSPICIOUS_STEW_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect SWEET_BERRIES_FOOD_EFFECT = new FoodStatusEffect();
	private static final StatusEffect TROPICAL_FISH_FOOD_EFFECT = new FoodStatusEffect();

	public static void registerEffects() {
		// region --- Attribute Modifiers ---
		APPLE_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.apple_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			APPLE_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.apple_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			APPLE_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.apple_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.apple_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		BAKED_POTATO_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.baked_potato_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			BAKED_POTATO_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.baked_potato_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			BAKED_POTATO_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.baked_potato_food_effect"), 7.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.baked_potato_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		BEEF_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.beef_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			BEEF_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.beef_food_effect"), 0.5F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			BEEF_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.beef_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.beef_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		BEETROOT_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.beetroot_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			BEETROOT_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.beetroot_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			BEETROOT_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.beetroot_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.beetroot_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		BEETROOT_SOUP_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.beetroot_soup_food_effect"), 15.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			BEETROOT_SOUP_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.beetroot_soup_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			BEETROOT_SOUP_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.beetroot_soup_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.beetroot_soup_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}
		if (FoodOverhaulVanillaFoods.isOverhauledDamageLoaded) {
			BEETROOT_SOUP_FOOD_EFFECT
					.addAttributeModifier(OverhauledDamage.FROST_RESISTANCE, FoodOverhaulVanillaFoods.identifier("effect.beetroot_soup_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		BREAD_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.bread_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			BREAD_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.bread_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			BREAD_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.bread_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.bread_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		BROWN_MUSHROOM_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.brown_mushroom_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			BROWN_MUSHROOM_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.brown_mushroom_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			BROWN_MUSHROOM_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.brown_mushroom_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.brown_mushroom_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		CAKE_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cake_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			CAKE_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cake_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			CAKE_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cake_food_effect"), 25.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cake_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		CARROT_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.carrot_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			CARROT_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.carrot_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			CARROT_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.carrot_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.carrot_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		CHICKEN_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.chicken_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			CHICKEN_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.chicken_food_effect"), 0.5F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			CHICKEN_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.chicken_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}
		if (FoodOverhaulVanillaFoods.isOverhauledDamageLoaded) {
			CHICKEN_FOOD_EFFECT
					.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.chicken_food_effect"), -2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		CHORUS_FRUIT_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.chorus_fruit_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			CHORUS_FRUIT_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.chorus_fruit_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			CHORUS_FRUIT_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.chorus_fruit_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.chorus_fruit_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		COCOA_BEANS_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cocoa_beans_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			COCOA_BEANS_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cocoa_beans_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			COCOA_BEANS_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cocoa_beans_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cocoa_beans_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		COD_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cod_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			COD_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cod_food_effect"), 0.5F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			COD_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cod_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cod_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}
		if (FoodOverhaulVanillaFoods.isOverhauledDamageLoaded) {
			COD_FOOD_EFFECT
					.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.cod_food_effect"), -2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		COOKED_BEEF_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_beef_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			COOKED_BEEF_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_beef_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			COOKED_BEEF_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_beef_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_beef_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		COOKED_CHICKEN_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_chicken_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			COOKED_CHICKEN_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_chicken_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			COOKED_CHICKEN_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_chicken_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_chicken_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		COOKED_COD_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_cod_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			COOKED_COD_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_cod_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			COOKED_COD_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_cod_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_cod_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		COOKED_MUTTON_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_mutton_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			COOKED_MUTTON_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_mutton_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			COOKED_MUTTON_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_mutton_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_mutton_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		COOKED_PORKCHOP_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_porkchop_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			COOKED_PORKCHOP_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_porkchop_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			COOKED_PORKCHOP_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_porkchop_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_porkchop_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		COOKED_RABBIT_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_rabbit_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			COOKED_RABBIT_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_rabbit_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			COOKED_RABBIT_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_rabbit_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_rabbit_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		COOKED_SALMON_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_salmon_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			COOKED_SALMON_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_salmon_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			COOKED_SALMON_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cooked_salmon_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cooked_salmon_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		COOKIE_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cookie_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			COOKIE_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cookie_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			COOKIE_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.cookie_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.cookie_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		DRIED_KELP_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.dried_kelp_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			DRIED_KELP_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.dried_kelp_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			DRIED_KELP_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION_DELAY_THRESHOLD, FoodOverhaulVanillaFoods.identifier("effect.dried_kelp_food_effect"), -30.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_TICK_THRESHOLD, FoodOverhaulVanillaFoods.identifier("effect.dried_kelp_food_effect"), -10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.enchanted_golden_apple_food_effect"), 15.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.enchanted_golden_apple_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.enchanted_golden_apple_food_effect"), 30.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.enchanted_golden_apple_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		if (FoodOverhaulVanillaFoods.isManaAttributesLoaded) {
			FERMENTED_SPIDER_EYE_FOOD_EFFECT
					.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.fermented_spider_eye_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.fermented_spider_eye_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		GLOW_BERRIES_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			GLOW_BERRIES_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}
		if (FoodOverhaulVanillaFoods.isManaAttributesLoaded) {
			GLOW_BERRIES_FOOD_EFFECT
					.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(ManaAttributes.MANA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		GOLDEN_APPLE_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.golden_apple_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			GOLDEN_APPLE_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.golden_apple_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			GOLDEN_APPLE_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.golden_apple_food_effect"), 50.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.golden_apple_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		GOLDEN_CARROT_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.golden_carrot_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			GOLDEN_CARROT_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.golden_carrot_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			GOLDEN_CARROT_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.golden_carrot_food_effect"), 50.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.golden_carrot_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		if (FoodOverhaulVanillaFoods.isOverhauledDamageLoaded) {
			HONEY_BOTTLE_FOOD_EFFECT
					.addAttributeModifier(OverhauledDamage.MAX_POISON_BUILD_UP, FoodOverhaulVanillaFoods.identifier("effect.honey_bottle_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.honey_bottle_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		MELON_SLICE_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.melon_slice_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			MELON_SLICE_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.melon_slice_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			MELON_SLICE_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.melon_slice_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.melon_slice_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		MUSHROOM_STEW_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			MUSHROOM_STEW_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			MUSHROOM_STEW_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 15.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		MUTTON_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.mutton_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			MUTTON_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.mutton_food_effect"), 0.5F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			MUTTON_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.mutton_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.mutton_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		if (FoodOverhaulVanillaFoods.isOverhauledDamageLoaded) {
			POISONOUS_POTATO_FOOD_EFFECT
					.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.poisonous_potato_food_effect"), -3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		PORKCHOP_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.porkchop_porkchop_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			PORKCHOP_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.porkchop_porkchop_food_effect"), 0.5F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isOverhauledDamageLoaded) {
			PORKCHOP_FOOD_EFFECT
					.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.porkchop_porkchop_food_effect"), -2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		POTATO_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.potato_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			POTATO_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.potato_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			POTATO_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.potato_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.potato_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		if (FoodOverhaulVanillaFoods.isOverhauledDamageLoaded) {
			PUFFERFISH_FOOD_EFFECT
					.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.pufferfish_food_effect"), -5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		PUMPKIN_PIE_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.pumpkin_pie_food_effect"), 10.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			PUMPKIN_PIE_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.pumpkin_pie_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			PUMPKIN_PIE_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.pumpkin_pie_food_effect"), 15.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.pumpkin_pie_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		RABBIT_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.rabbit_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			RABBIT_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.rabbit_food_effect"), 0.5F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			RABBIT_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.rabbit_food_effect"), 20.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.rabbit_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		RABBIT_STEW_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 15.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			RABBIT_STEW_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			RABBIT_STEW_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 7.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		if (FoodOverhaulVanillaFoods.isManaAttributesLoaded) {
			RED_MUSHROOM_FOOD_EFFECT
					.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.red_mushroom_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}
		if (FoodOverhaulVanillaFoods.isOverhauledDamageLoaded) {
			RED_MUSHROOM_FOOD_EFFECT
					.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.red_mushroom_food_effect"), -4.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		SALMON_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.salmon_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			SALMON_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.salmon_food_effect"), 0.5F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isOverhauledDamageLoaded) {
			SALMON_FOOD_EFFECT
					.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.salmon_food_effect"), -2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		if (FoodOverhaulVanillaFoods.isOverhauledDamageLoaded) {
			SPIDER_EYE_FOOD_EFFECT
					.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.spider_eye_food_effect"), -3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		SUGAR_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.sugar_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			SUGAR_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.sugar_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			SUGAR_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.sugar_food_effect"), 25.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.sugar_food_effect"), 4.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		SUSPICIOUS_STEW_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.suspicious_stew_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			SUSPICIOUS_STEW_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.suspicious_stew_food_effect"), 0.5F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			SUSPICIOUS_STEW_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.suspicious_stew_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}
		if (FoodOverhaulVanillaFoods.isManaAttributesLoaded) {
			SUSPICIOUS_STEW_FOOD_EFFECT
					.addAttributeModifier(ManaAttributes.MAX_MANA, FoodOverhaulVanillaFoods.identifier("effect.suspicious_stew_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		SWEET_BERRIES_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.sweet_berries_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			SWEET_BERRIES_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.sweet_berries_food_effect"), 2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isStaminaAttributesLoaded) {
			SWEET_BERRIES_FOOD_EFFECT
					.addAttributeModifier(StaminaAttributes.MAX_STAMINA, FoodOverhaulVanillaFoods.identifier("effect.sweet_berries_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
					.addAttributeModifier(StaminaAttributes.STAMINA_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.sweet_berries_food_effect"), 1.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}

		TROPICAL_FISH_FOOD_EFFECT
				.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.tropical_fish_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
		;
//		if (FoodOverhaulVanillaFoods.isHealthRegenerationOverhaulLoaded) {
//			TROPICAL_FISH_FOOD_EFFECT
//					.addAttributeModifier(HealthRegenerationOverhaul.HEALTH_REGENERATION, FoodOverhaulVanillaFoods.identifier("effect.tropical_fish_food_effect"), 0.5F, EntityAttributeModifier.Operation.ADD_VALUE)
//			;
//		}
		if (FoodOverhaulVanillaFoods.isOverhauledDamageLoaded) {
			TROPICAL_FISH_FOOD_EFFECT
					.addAttributeModifier(OverhauledDamage.POISON_BUILD_UP_REDUCTION, FoodOverhaulVanillaFoods.identifier("effect.tropical_fish_food_effect"), -2.0F, EntityAttributeModifier.Operation.ADD_VALUE)
			;
		}
		// endregion --- Attribute Modifiers ---

		// --- Registration ---
		FoodOverhaulVanillaFoods.APPLE_FOOD_EFFECT = register("apple_food_effect", APPLE_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.BAKED_POTATO_FOOD_EFFECT = register("baked_potato_food_effect", BAKED_POTATO_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.BEEF_FOOD_EFFECT = register("beef_food_effect", BEEF_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.BEETROOT_FOOD_EFFECT = register("beetroot_food_effect", BEETROOT_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.BEETROOT_SOUP_FOOD_EFFECT = register("beetroot_soup_food_effect", BEETROOT_SOUP_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.BREAD_FOOD_EFFECT = register("bread_food_effect", BREAD_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.BROWN_MUSHROOM_FOOD_EFFECT = register("brown_mushroom_food_effect", BROWN_MUSHROOM_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.CAKE_FOOD_EFFECT = register("cake_food_effect", CAKE_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.CARROT_FOOD_EFFECT = register("carrot_food_effect", CARROT_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.CHICKEN_FOOD_EFFECT = register("chicken_food_effect", CHICKEN_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.CHORUS_FRUIT_FOOD_EFFECT = register("chorus_fruit_food_effect", CHORUS_FRUIT_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.COCOA_BEANS_FOOD_EFFECT = register("cocoa_beans_food_effect", COCOA_BEANS_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.COD_FOOD_EFFECT = register("cod_food_effect", COD_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.COOKED_BEEF_FOOD_EFFECT = register("cooked_beef_food_effect", COOKED_BEEF_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.COOKED_CHICKEN_FOOD_EFFECT = register("cooked_chicken_food_effect", COOKED_CHICKEN_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.COOKED_COD_FOOD_EFFECT = register("cooked_cod_food_effect", COOKED_COD_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.COOKED_MUTTON_FOOD_EFFECT = register("cooked_mutton_food_effect", COOKED_MUTTON_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.COOKED_PORKCHOP_FOOD_EFFECT = register("cooked_porkchop_food_effect", COOKED_PORKCHOP_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.COOKED_RABBIT_FOOD_EFFECT = register("cooked_rabbit_food_effect", COOKED_RABBIT_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.COOKED_SALMON_FOOD_EFFECT = register("cooked_salmon_food_effect", COOKED_SALMON_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.COOKIE_FOOD_EFFECT = register("cookie_food_effect", COOKIE_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.DRIED_KELP_FOOD_EFFECT = register("dried_kelp_food_effect", DRIED_KELP_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT = register("enchanted_golden_apple_food_effect", ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.FERMENTED_SPIDER_EYE_FOOD_EFFECT = register("fermented_spider_eye_food_effect", FERMENTED_SPIDER_EYE_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.GLOW_BERRIES_FOOD_EFFECT = register("glow_berries_food_effect", GLOW_BERRIES_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.GOLDEN_APPLE_FOOD_EFFECT = register("golden_apple_food_effect", GOLDEN_APPLE_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.GOLDEN_CARROT_FOOD_EFFECT = register("golden_carrot_food_effect", GOLDEN_CARROT_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.HONEY_BOTTLE_FOOD_EFFECT = register("honey_bottle_food_effect", HONEY_BOTTLE_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.MELON_SLICE_FOOD_EFFECT = register("melon_slice_food_effect", MELON_SLICE_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.MUSHROOM_STEW_FOOD_EFFECT = register("mushroom_stew_food_effect", MUSHROOM_STEW_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.MUTTON_FOOD_EFFECT = register("mutton_food_effect", MUTTON_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.POISONOUS_POTATO_FOOD_EFFECT = register("poisonous_potato_food_effect", POISONOUS_POTATO_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.PORKCHOP_FOOD_EFFECT = register("porkchop_food_effect", PORKCHOP_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.POTATO_FOOD_EFFECT = register("potato_food_effect", POTATO_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.PUFFERFISH_FOOD_EFFECT = register("pufferfish_food_effect", PUFFERFISH_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.PUMPKIN_PIE_FOOD_EFFECT = register("pumpkin_pie_food_effect", PUMPKIN_PIE_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.RABBIT_FOOD_EFFECT = register("rabbit_food_effect", RABBIT_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.RABBIT_STEW_FOOD_EFFECT = register("rabbit_stew_food_effect", RABBIT_STEW_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.RED_MUSHROOM_FOOD_EFFECT = register("red_mushroom_food_effect", RED_MUSHROOM_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.ROTTEN_FLESH_FOOD_EFFECT = register("rotten_flesh_food_effect", ROTTEN_FLESH_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.SALMON_FOOD_EFFECT = register("salmon_food_effect", SALMON_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.SPIDER_EYE_FOOD_EFFECT = register("spider_eye_food_effect", SPIDER_EYE_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.SUGAR_FOOD_EFFECT = register("sugar_food_effect", SUGAR_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.SUSPICIOUS_STEW_FOOD_EFFECT = register("suspicious_stew_food_effect", SUSPICIOUS_STEW_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.SWEET_BERRIES_FOOD_EFFECT = register("sweet_berries_food_effect", SWEET_BERRIES_FOOD_EFFECT);
		FoodOverhaulVanillaFoods.TROPICAL_FISH_FOOD_EFFECT = register("tropical_fish_food_effect", TROPICAL_FISH_FOOD_EFFECT);

	}

	private static RegistryEntry<StatusEffect> register(String identifierString, StatusEffect statusEffect) {
		return Registry.registerReference(Registries.STATUS_EFFECT, FoodOverhaulVanillaFoods.identifier(identifierString), statusEffect);
	}
}
