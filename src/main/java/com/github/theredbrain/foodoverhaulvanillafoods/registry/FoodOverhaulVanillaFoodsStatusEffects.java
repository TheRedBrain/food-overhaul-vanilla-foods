package com.github.theredbrain.foodoverhaulvanillafoods.registry;

import com.github.theredbrain.foodoverhaul.FoodOverhaul;
import com.github.theredbrain.foodoverhaul.entity.effect.FoodStatusEffect;
import com.github.theredbrain.foodoverhaul.entity.effect.RemoveEffectsInTagStatusEffect;
import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class FoodOverhaulVanillaFoodsStatusEffects {

	public static Holder<MobEffect> APPLE_FOOD_EFFECT;
	public static Holder<MobEffect> BAKED_POTATO_FOOD_EFFECT;
	public static Holder<MobEffect> BEEF_FOOD_EFFECT;
	public static Holder<MobEffect> BEETROOT_FOOD_EFFECT;
	public static Holder<MobEffect> BEETROOT_SOUP_FOOD_EFFECT;
	public static Holder<MobEffect> BREAD_FOOD_EFFECT;
	public static Holder<MobEffect> BROWN_MUSHROOM_FOOD_EFFECT;
	public static Holder<MobEffect> CAKE_FOOD_EFFECT;
	public static Holder<MobEffect> CARROT_FOOD_EFFECT;
	public static Holder<MobEffect> CHICKEN_FOOD_EFFECT;
	public static Holder<MobEffect> CHORUS_FRUIT_FOOD_EFFECT;
	public static Holder<MobEffect> COCOA_BEANS_FOOD_EFFECT;
	public static Holder<MobEffect> COD_FOOD_EFFECT;
	public static Holder<MobEffect> COOKED_BEEF_FOOD_EFFECT;
	public static Holder<MobEffect> COOKED_CHICKEN_FOOD_EFFECT;
	public static Holder<MobEffect> COOKED_COD_FOOD_EFFECT;
	public static Holder<MobEffect> COOKED_MUTTON_FOOD_EFFECT;
	public static Holder<MobEffect> COOKED_PORKCHOP_FOOD_EFFECT;
	public static Holder<MobEffect> COOKED_RABBIT_FOOD_EFFECT;
	public static Holder<MobEffect> COOKED_SALMON_FOOD_EFFECT;
	public static Holder<MobEffect> COOKIE_FOOD_EFFECT;
	public static Holder<MobEffect> CRIMSON_FUNGUS_FOOD_EFFECT;
	public static Holder<MobEffect> DRIED_KELP_FOOD_EFFECT;
	public static Holder<MobEffect> ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT;
	public static Holder<MobEffect> FERMENTED_SPIDER_EYE_FOOD_EFFECT;
	public static Holder<MobEffect> GLOW_BERRIES_FOOD_EFFECT;
	public static Holder<MobEffect> GOLDEN_APPLE_FOOD_EFFECT;
	public static Holder<MobEffect> GOLDEN_CARROT_FOOD_EFFECT;
	public static Holder<MobEffect> HONEY_BOTTLE_FOOD_EFFECT;
	public static Holder<MobEffect> MELON_SLICE_FOOD_EFFECT;
	public static Holder<MobEffect> REMOVE_EFFECTS_MILK_FOOD_EFFECT;
	public static Holder<MobEffect> MILK_FOOD_EFFECT;
	public static Holder<MobEffect> MUSHROOM_STEW_FOOD_EFFECT;
	public static Holder<MobEffect> MUTTON_FOOD_EFFECT;
	public static Holder<MobEffect> NETHER_WART_FOOD_EFFECT;
	public static Holder<MobEffect> POISONOUS_POTATO_FOOD_EFFECT;
	public static Holder<MobEffect> PORKCHOP_FOOD_EFFECT;
	public static Holder<MobEffect> POTATO_FOOD_EFFECT;
	public static Holder<MobEffect> PUFFERFISH_FOOD_EFFECT;
	public static Holder<MobEffect> PUMPKIN_PIE_FOOD_EFFECT;
	public static Holder<MobEffect> RABBIT_FOOD_EFFECT;
	public static Holder<MobEffect> RABBIT_STEW_FOOD_EFFECT;
	public static Holder<MobEffect> RED_MUSHROOM_FOOD_EFFECT;
	public static Holder<MobEffect> ROTTEN_FLESH_FOOD_EFFECT;
	public static Holder<MobEffect> SALMON_FOOD_EFFECT;
	public static Holder<MobEffect> SPIDER_EYE_FOOD_EFFECT;
	public static Holder<MobEffect> SUGAR_FOOD_EFFECT;
	public static Holder<MobEffect> SUSPICIOUS_STEW_FOOD_EFFECT;
	public static Holder<MobEffect> SWEET_BERRIES_FOOD_EFFECT;
	public static Holder<MobEffect> TROPICAL_FISH_FOOD_EFFECT;
	public static Holder<MobEffect> WARPED_FUNGUS_FOOD_EFFECT;

	public static final MobEffect APPLE_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect BAKED_POTATO_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect BEEF_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect BEETROOT_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect BEETROOT_SOUP_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect BREAD_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect BROWN_MUSHROOM_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect CAKE_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect CARROT_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect CHICKEN_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect CHORUS_FRUIT_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect COCOA_BEANS_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect COD_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect COOKED_BEEF_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect COOKED_CHICKEN_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect COOKED_COD_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect COOKED_MUTTON_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect COOKED_PORKCHOP_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect COOKED_RABBIT_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect COOKED_SALMON_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect COOKIE_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect CRIMSON_FUNGUS_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect DRIED_KELP_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect FERMENTED_SPIDER_EYE_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect GLOW_BERRIES_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect GOLDEN_APPLE_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect GOLDEN_CARROT_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect HONEY_BOTTLE_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect MELON_SLICE_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect REMOVE_EFFECTS_MILK_FOOD_EFFECT_INSTANCE = new RemoveEffectsInTagStatusEffect(FoodOverhaulVanillaFoods.REMOVED_BY_MILK);
	public static final MobEffect MILK_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect MUSHROOM_STEW_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect MUTTON_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect NETHER_WART_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect POISONOUS_POTATO_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect PORKCHOP_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect POTATO_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect PUFFERFISH_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect PUMPKIN_PIE_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect RABBIT_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect RABBIT_STEW_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect RED_MUSHROOM_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect ROTTEN_FLESH_FOOD_EFFECT_INSTANCE = new RemoveEffectsInTagStatusEffect(FoodOverhaul.FOOD_EFFECTS);
	public static final MobEffect SALMON_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect SPIDER_EYE_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect SUGAR_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect SUSPICIOUS_STEW_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect SWEET_BERRIES_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect TROPICAL_FISH_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();
	public static final MobEffect WARPED_FUNGUS_FOOD_EFFECT_INSTANCE = new FoodStatusEffect();

	public static void bootstrap() {
	}

	static {

		// region --- Attribute Modifiers ---
//		APPLE_FOOD_EFFECT
//				.addAttributeModifier(EntityAttributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.apple_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//		;
//		BAKED_POTATO_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.baked_potato_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		BEEF_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.beef_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		BEETROOT_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.beetroot_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		BEETROOT_SOUP_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.beetroot_soup_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		BREAD_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.bread_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		BROWN_MUSHROOM_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.brown_mushroom_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		CAKE_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cake_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		CARROT_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.carrot_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		CHICKEN_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.chicken_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		CHORUS_FRUIT_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.chorus_fruit_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		COCOA_BEANS_FOOD_EFFECT
//				.addAttributeModifier(EntityAttributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cocoa_beans_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//		;
//		COD_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cod_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		COOKED_BEEF_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_beef_food_effect"), 6.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_CHICKEN_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_chicken_food_effect"), 6.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_COD_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_cod_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_MUTTON_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_mutton_food_effect"), 6.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_PORKCHOP_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_porkchop_food_effect"), 6.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_RABBIT_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_rabbit_food_effect"), 6.0F, AttributeModifier.Operation.ADD_VALUE)
		;
		COOKED_SALMON_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cooked_salmon_food_effect"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		COOKIE_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.cookie_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		DRIED_KELP_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.dried_kelp_food_effect"), 1.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.enchanted_golden_apple_food_effect"), 15.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		GLOW_BERRIES_FOOD_EFFECT
//				.addAttributeModifier(EntityAttributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.glow_berries_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//		;
//		GOLDEN_APPLE_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.golden_apple_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		GOLDEN_CARROT_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.golden_carrot_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		MELON_SLICE_FOOD_EFFECT
//				.addAttributeModifier(EntityAttributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.melon_slice_food_effect"), 3.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//		;
//		MILK_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		MUSHROOM_STEW_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.mushroom_stew_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		MUTTON_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.mutton_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		NETHER_WART_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.mutton_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		PORKCHOP_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.porkchop_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		POTATO_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.potato_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		PUMPKIN_PIE_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.pumpkin_pie_food_effect"), 10.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		RABBIT_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.rabbit_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		RABBIT_STEW_FOOD_EFFECT_INSTANCE
				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 6.0F, AttributeModifier.Operation.ADD_VALUE)
		;
//		ROTTEN_FLESH_FOOD_EFFECT
//				.addAttributeModifier(FoodOverhaul.MAX_FOOD_EFFECTS, FoodOverhaulVanillaFoods.identifier("effect.rabbit_stew_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE)
//		;
//		SALMON_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.salmon_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		SUGAR_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.sugar_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		SUSPICIOUS_STEW_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.suspicious_stew_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
//		SWEET_BERRIES_FOOD_EFFECT
//				.addAttributeModifier(EntityAttributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.sweet_berries_food_effect"), 5.0F, EntityAttributeModifier.Operation.ADD_VALUE)
//		;
//		TROPICAL_FISH_FOOD_EFFECT
//				.addAttributeModifier(Attributes.MAX_HEALTH, FoodOverhaulVanillaFoods.identifier("effect.tropical_fish_food_effect"), 5.0F, AttributeModifier.Operation.ADD_VALUE)
//		;
		FoodOverhaulVanillaFoods.addModdedAttributesToFoodEffects();
		// endregion --- Attribute Modifiers ---

		// --- Registration ---
		APPLE_FOOD_EFFECT = register("apple_food_effect", APPLE_FOOD_EFFECT_INSTANCE);
		BAKED_POTATO_FOOD_EFFECT = register("baked_potato_food_effect", BAKED_POTATO_FOOD_EFFECT_INSTANCE);
		BEEF_FOOD_EFFECT = register("beef_food_effect", BEEF_FOOD_EFFECT_INSTANCE);
		BEETROOT_FOOD_EFFECT = register("beetroot_food_effect", BEETROOT_FOOD_EFFECT_INSTANCE);
		BEETROOT_SOUP_FOOD_EFFECT = register("beetroot_soup_food_effect", BEETROOT_SOUP_FOOD_EFFECT_INSTANCE);
		BREAD_FOOD_EFFECT = register("bread_food_effect", BREAD_FOOD_EFFECT_INSTANCE);
		BROWN_MUSHROOM_FOOD_EFFECT = register("brown_mushroom_food_effect", BROWN_MUSHROOM_FOOD_EFFECT_INSTANCE);
		CAKE_FOOD_EFFECT = register("cake_food_effect", CAKE_FOOD_EFFECT_INSTANCE);
		CARROT_FOOD_EFFECT = register("carrot_food_effect", CARROT_FOOD_EFFECT_INSTANCE);
		CHICKEN_FOOD_EFFECT = register("chicken_food_effect", CHICKEN_FOOD_EFFECT_INSTANCE);
		CHORUS_FRUIT_FOOD_EFFECT = register("chorus_fruit_food_effect", CHORUS_FRUIT_FOOD_EFFECT_INSTANCE);
		COCOA_BEANS_FOOD_EFFECT = register("cocoa_beans_food_effect", COCOA_BEANS_FOOD_EFFECT_INSTANCE);
		COD_FOOD_EFFECT = register("cod_food_effect", COD_FOOD_EFFECT_INSTANCE);
		COOKED_BEEF_FOOD_EFFECT = register("cooked_beef_food_effect", COOKED_BEEF_FOOD_EFFECT_INSTANCE);
		COOKED_CHICKEN_FOOD_EFFECT = register("cooked_chicken_food_effect", COOKED_CHICKEN_FOOD_EFFECT_INSTANCE);
		COOKED_COD_FOOD_EFFECT = register("cooked_cod_food_effect", COOKED_COD_FOOD_EFFECT_INSTANCE);
		COOKED_MUTTON_FOOD_EFFECT = register("cooked_mutton_food_effect", COOKED_MUTTON_FOOD_EFFECT_INSTANCE);
		COOKED_PORKCHOP_FOOD_EFFECT = register("cooked_porkchop_food_effect", COOKED_PORKCHOP_FOOD_EFFECT_INSTANCE);
		COOKED_RABBIT_FOOD_EFFECT = register("cooked_rabbit_food_effect", COOKED_RABBIT_FOOD_EFFECT_INSTANCE);
		COOKED_SALMON_FOOD_EFFECT = register("cooked_salmon_food_effect", COOKED_SALMON_FOOD_EFFECT_INSTANCE);
		COOKIE_FOOD_EFFECT = register("cookie_food_effect", COOKIE_FOOD_EFFECT_INSTANCE);
		CRIMSON_FUNGUS_FOOD_EFFECT = register("crimson_fungus_food_effect", CRIMSON_FUNGUS_FOOD_EFFECT_INSTANCE);
		DRIED_KELP_FOOD_EFFECT = register("dried_kelp_food_effect", DRIED_KELP_FOOD_EFFECT_INSTANCE);
		ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT = register("enchanted_golden_apple_food_effect", ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT_INSTANCE);
		FERMENTED_SPIDER_EYE_FOOD_EFFECT = register("fermented_spider_eye_food_effect", FERMENTED_SPIDER_EYE_FOOD_EFFECT_INSTANCE);
		GLOW_BERRIES_FOOD_EFFECT = register("glow_berries_food_effect", GLOW_BERRIES_FOOD_EFFECT_INSTANCE);
		GOLDEN_APPLE_FOOD_EFFECT = register("golden_apple_food_effect", GOLDEN_APPLE_FOOD_EFFECT_INSTANCE);
		GOLDEN_CARROT_FOOD_EFFECT = register("golden_carrot_food_effect", GOLDEN_CARROT_FOOD_EFFECT_INSTANCE);
		HONEY_BOTTLE_FOOD_EFFECT = register("honey_bottle_food_effect", HONEY_BOTTLE_FOOD_EFFECT_INSTANCE);
		MELON_SLICE_FOOD_EFFECT = register("melon_slice_food_effect", MELON_SLICE_FOOD_EFFECT_INSTANCE);
		REMOVE_EFFECTS_MILK_FOOD_EFFECT = register("remove_effects_milk_food_effect", REMOVE_EFFECTS_MILK_FOOD_EFFECT_INSTANCE);
		MILK_FOOD_EFFECT = register("milk_food_effect", MILK_FOOD_EFFECT_INSTANCE);
		MUSHROOM_STEW_FOOD_EFFECT = register("mushroom_stew_food_effect", MUSHROOM_STEW_FOOD_EFFECT_INSTANCE);
		MUTTON_FOOD_EFFECT = register("mutton_food_effect", MUTTON_FOOD_EFFECT_INSTANCE);
		NETHER_WART_FOOD_EFFECT = register("nether_wart_food_effect", NETHER_WART_FOOD_EFFECT_INSTANCE);
		POISONOUS_POTATO_FOOD_EFFECT = register("poisonous_potato_food_effect", POISONOUS_POTATO_FOOD_EFFECT_INSTANCE);
		PORKCHOP_FOOD_EFFECT = register("porkchop_food_effect", PORKCHOP_FOOD_EFFECT_INSTANCE);
		POTATO_FOOD_EFFECT = register("potato_food_effect", POTATO_FOOD_EFFECT_INSTANCE);
		PUFFERFISH_FOOD_EFFECT = register("pufferfish_food_effect", PUFFERFISH_FOOD_EFFECT_INSTANCE);
		PUMPKIN_PIE_FOOD_EFFECT = register("pumpkin_pie_food_effect", PUMPKIN_PIE_FOOD_EFFECT_INSTANCE);
		RABBIT_FOOD_EFFECT = register("rabbit_food_effect", RABBIT_FOOD_EFFECT_INSTANCE);
		RABBIT_STEW_FOOD_EFFECT = register("rabbit_stew_food_effect", RABBIT_STEW_FOOD_EFFECT_INSTANCE);
		RED_MUSHROOM_FOOD_EFFECT = register("red_mushroom_food_effect", RED_MUSHROOM_FOOD_EFFECT_INSTANCE);
		ROTTEN_FLESH_FOOD_EFFECT = register("rotten_flesh_food_effect", ROTTEN_FLESH_FOOD_EFFECT_INSTANCE);
		SALMON_FOOD_EFFECT = register("salmon_food_effect", SALMON_FOOD_EFFECT_INSTANCE);
		SPIDER_EYE_FOOD_EFFECT = register("spider_eye_food_effect", SPIDER_EYE_FOOD_EFFECT_INSTANCE);
		SUGAR_FOOD_EFFECT = register("sugar_food_effect", SUGAR_FOOD_EFFECT_INSTANCE);
		SUSPICIOUS_STEW_FOOD_EFFECT = register("suspicious_stew_food_effect", SUSPICIOUS_STEW_FOOD_EFFECT_INSTANCE);
		SWEET_BERRIES_FOOD_EFFECT = register("sweet_berries_food_effect", SWEET_BERRIES_FOOD_EFFECT_INSTANCE);
		TROPICAL_FISH_FOOD_EFFECT = register("tropical_fish_food_effect", TROPICAL_FISH_FOOD_EFFECT_INSTANCE);
		WARPED_FUNGUS_FOOD_EFFECT = register("warped_fungus_food_effect", WARPED_FUNGUS_FOOD_EFFECT_INSTANCE);

	}

	private static Holder<MobEffect> register(String identifierString, MobEffect statusEffect) {
		return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, FoodOverhaulVanillaFoods.identifier(identifierString), statusEffect);
	}
}
