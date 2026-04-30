package com.github.theredbrain.foodoverhaulvanillafoods.registry;

import com.github.theredbrain.foodoverhaul.entity.effect.FoodStatusEffect;
import com.github.theredbrain.foodoverhaul.entity.effect.RemoveFoodStatusEffect;
import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class StatusEffectsRegistry {
	public static final MobEffect APPLE_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect BAKED_POTATO_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect BEEF_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect BEETROOT_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect BEETROOT_SOUP_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect BREAD_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect BROWN_MUSHROOM_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect CAKE_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect CARROT_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect CHICKEN_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect CHORUS_FRUIT_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect COCOA_BEANS_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect COD_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect COOKED_BEEF_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect COOKED_CHICKEN_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect COOKED_COD_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect COOKED_MUTTON_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect COOKED_PORKCHOP_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect COOKED_RABBIT_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect COOKED_SALMON_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect COOKIE_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect DRIED_KELP_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect FERMENTED_SPIDER_EYE_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect GLOW_BERRIES_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect GOLDEN_APPLE_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect GOLDEN_CARROT_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect HONEY_BOTTLE_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect MELON_SLICE_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect MUSHROOM_STEW_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect MUTTON_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect POISONOUS_POTATO_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect PORKCHOP_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect POTATO_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect PUFFERFISH_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect PUMPKIN_PIE_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect RABBIT_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect RABBIT_STEW_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect RED_MUSHROOM_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect ROTTEN_FLESH_FOOD_EFFECT = new RemoveFoodStatusEffect();
	public static final MobEffect SALMON_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect SPIDER_EYE_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect SUGAR_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect SUSPICIOUS_STEW_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect SWEET_BERRIES_FOOD_EFFECT = new FoodStatusEffect();
	public static final MobEffect TROPICAL_FISH_FOOD_EFFECT = new FoodStatusEffect();

	public static void registerEffects() {

		// region --- Attribute Modifiers ---
//		APPLE_FOOD_EFFECT
//				.addAttributeModifier(EntityAttributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.apple_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//		;
		BAKED_POTATO_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.baked_potato_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		BEEF_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.beef_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		BEETROOT_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.beetroot_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		BEETROOT_SOUP_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.beetroot_soup_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		BREAD_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.bread_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		BROWN_MUSHROOM_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.brown_mushroom_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		CAKE_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cake_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		CARROT_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.carrot_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		CHICKEN_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.chicken_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		CHORUS_FRUIT_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.chorus_fruit_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		COCOA_BEANS_FOOD_EFFECT
//				.addAttributeModifier(EntityAttributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cocoa_beans_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//		;
		COD_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cod_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_BEEF_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_beef_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_CHICKEN_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_chicken_food_effect"), 7.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_COD_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_cod_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_MUTTON_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_mutton_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_PORKCHOP_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_porkchop_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_RABBIT_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_rabbit_food_effect"), 7.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_SALMON_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_salmon_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKIE_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cookie_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		DRIED_KELP_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.dried_kelp_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.enchanted_golden_apple_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		GLOW_BERRIES_FOOD_EFFECT
//				.addAttributeModifier(EntityAttributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//		;
		GOLDEN_APPLE_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.golden_apple_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		GOLDEN_CARROT_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.golden_carrot_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		MELON_SLICE_FOOD_EFFECT
//				.addAttributeModifier(EntityAttributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.melon_slice_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//		;
		MUSHROOM_STEW_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		MUTTON_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.mutton_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		PORKCHOP_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.porkchop_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		POTATO_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.potato_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		PUMPKIN_PIE_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.pumpkin_pie_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		RABBIT_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.rabbit_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		RABBIT_STEW_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		ROTTEN_FLESH_FOOD_EFFECT
//				.addAttributeModifier(FoodOverhaul.MAX_FOOD_EFFECTS, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE)
//		;
		SALMON_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.salmon_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		SUGAR_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.sugar_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		SUSPICIOUS_STEW_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.suspicious_stew_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		SWEET_BERRIES_FOOD_EFFECT
//				.addAttributeModifier(EntityAttributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.sweet_berries_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//		;
		TROPICAL_FISH_FOOD_EFFECT
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.tropical_fish_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		FoodOverhaulVanillaFoods.addModdedAttributesToFoodEffects();
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

	private static Holder<MobEffect> register(String identifierString, MobEffect statusEffect) {
		return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, FoodOverhaulVanillaFoods.identifier(identifierString), statusEffect);
	}
}
