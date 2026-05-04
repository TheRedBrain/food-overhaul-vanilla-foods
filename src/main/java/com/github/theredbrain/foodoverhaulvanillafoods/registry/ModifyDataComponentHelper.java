package com.github.theredbrain.foodoverhaulvanillafoods.registry;

import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.config.ServerConfig;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.UseCooldown;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.TeleportRandomlyConsumeEffect;

import java.util.List;

public class ModifyDataComponentHelper {

	public static void init(ServerConfig serverConfig) {

		DefaultItemComponentEvents.MODIFY.register(context -> {

			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.APPLE_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.APPLE);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.BAKED_POTATO_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.BAKED_POTATO);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.BEEF_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.BEEF);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.BEETROOT_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.BEETROOT);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.BEETROOT_SOUP_FOOD_EFFECT,
					30000,
					0,
					false,
					false,
					true
			), Items.BEETROOT_SOUP);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.BREAD_FOOD_EFFECT,
					30000,
					0,
					false,
					false,
					true
			), Items.BREAD);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.BROWN_MUSHROOM_FOOD_EFFECT,
					18000,
					0,
					false,
					false,
					true
			), Items.BROWN_MUSHROOM);
			context.modify(Items.CARROT, builder -> {
				builder.set(DataComponents.FOOD, null);
				if (serverConfig.enable_finite_plants_integration.get()) {
					builder.set(DataComponents.CONSUMABLE, null);
				} else {
					builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
					builder.set(DataComponents.CONSUMABLE, Consumable.builder()
							.consumeSeconds(1.6F)
							.animation(ItemUseAnimation.EAT)
							.sound(SoundEvents.GENERIC_EAT)
							.hasConsumeParticles(true)
							.onConsume(
									new ApplyStatusEffectsConsumeEffect(List.of(
											new MobEffectInstance(
													FoodOverhaulVanillaFoods.CARROT_FOOD_EFFECT,
													18000,
													0,
													false,
													false,
													true
											)
									))).build());
				}
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.CHICKEN_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.CHICKEN);
			context.modify(Items.CHORUS_FRUIT, builder -> {
				builder.set(DataComponents.FOOD, null);
				builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
				builder.set(DataComponents.CONSUMABLE, Consumable.builder()
						.consumeSeconds(1.6F)
						.animation(ItemUseAnimation.EAT)
						.sound(SoundEvents.GENERIC_EAT)
						.hasConsumeParticles(true)
						.onConsume(
								new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(
										FoodOverhaulVanillaFoods.CHORUS_FRUIT_FOOD_EFFECT,
										12000,
										0,
										false,
										false,
										true
								)))
						.onConsume(new TeleportRandomlyConsumeEffect()).build());
			});
			context.modify(Items.COCOA_BEANS, builder -> {
				if (!serverConfig.enable_finite_plants_integration.get()) {
					builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
					builder.set(DataComponents.CONSUMABLE, Consumable.builder()
							.consumeSeconds(1.6F)
							.animation(ItemUseAnimation.EAT)
							.sound(SoundEvents.GENERIC_EAT)
							.hasConsumeParticles(true)
							.onConsume(
									new ApplyStatusEffectsConsumeEffect(List.of(
											new MobEffectInstance(
													FoodOverhaulVanillaFoods.COCOA_BEANS_FOOD_EFFECT,
													18000,
													0,
													false,
													false,
													true
											)
									))).build());
				}
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.COD_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.COD);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.COOKED_BEEF_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_BEEF);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.COOKED_CHICKEN_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_CHICKEN);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.COOKED_COD_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_COD);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.COOKED_MUTTON_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_MUTTON);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.COOKED_PORKCHOP_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_PORKCHOP);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.COOKED_RABBIT_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_RABBIT);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.COOKED_SALMON_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_SALMON);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.COOKIE_FOOD_EFFECT,
					6000,
					0,
					false,
					false,
					true
			), Items.COOKIE);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.DRIED_KELP_FOOD_EFFECT,
					6000,
					0,
					false,
					false,
					true
			), Items.DRIED_KELP);
			context.modify(Items.ENCHANTED_GOLDEN_APPLE, builder -> {
				builder.set(DataComponents.FOOD, null);
				builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
				builder.set(DataComponents.CONSUMABLE, Consumable.builder()
						.consumeSeconds(1.6F)
						.animation(ItemUseAnimation.EAT)
						.sound(SoundEvents.GENERIC_EAT)
						.hasConsumeParticles(true)
						.onConsume(
								new ApplyStatusEffectsConsumeEffect(List.of(
										new MobEffectInstance(
												FoodOverhaulVanillaFoods.ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT,
												30000,
												0,
												false,
												false,
												true
										),
										new MobEffectInstance(MobEffects.REGENERATION, 400, 1),
										new MobEffectInstance(MobEffects.RESISTANCE, 6000, 0),
										new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0),
										new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3)
								))).build());
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.FERMENTED_SPIDER_EYE_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.FERMENTED_SPIDER_EYE);
			context.modify(Items.GLOW_BERRIES, builder -> {
				builder.set(DataComponents.FOOD, null);
				if (serverConfig.enable_finite_plants_integration.get()) {
					builder.set(DataComponents.CONSUMABLE, null);
				} else {
					builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
					builder.set(DataComponents.CONSUMABLE, Consumable.builder()
							.consumeSeconds(1.6F)
							.animation(ItemUseAnimation.EAT)
							.sound(SoundEvents.GENERIC_EAT)
							.hasConsumeParticles(true)
							.onConsume(
									new ApplyStatusEffectsConsumeEffect(List.of(
											new MobEffectInstance(
													FoodOverhaulVanillaFoods.GLOW_BERRIES_FOOD_EFFECT,
													18000,
													0,
													false,
													false,
													true
											),
											new MobEffectInstance(MobEffects.GLOWING, 18000, 0)
									))).build());
				}
			});
			context.modify(Items.GOLDEN_APPLE, builder -> {
				builder.set(DataComponents.FOOD, null);
				builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
				builder.set(DataComponents.CONSUMABLE, Consumable.builder()
						.consumeSeconds(1.6F)
						.animation(ItemUseAnimation.EAT)
						.sound(SoundEvents.GENERIC_EAT)
						.hasConsumeParticles(true)
						.onConsume(
								new ApplyStatusEffectsConsumeEffect(List.of(
										new MobEffectInstance(
												FoodOverhaulVanillaFoods.GOLDEN_APPLE_FOOD_EFFECT,
												30000,
												0,
												false,
												false,
												true
										),
										new MobEffectInstance(MobEffects.REGENERATION, 100, 1),
										new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0)
								))).build());
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.GOLDEN_CARROT_FOOD_EFFECT,
					30000,
					0,
					false,
					false,
					true
			), Items.GOLDEN_CARROT);
			context.modify(Items.HONEY_BOTTLE, builder -> {
				builder.set(DataComponents.FOOD, null);
				builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
				builder.set(DataComponents.CONSUMABLE, Consumable.builder()
						.consumeSeconds(1.6F)
						.animation(ItemUseAnimation.DRINK)
						.sound(SoundEvents.HONEY_DRINK)
						.hasConsumeParticles(false)
						.onConsume(
								new ApplyStatusEffectsConsumeEffect(
										new MobEffectInstance(
												FoodOverhaulVanillaFoods.HONEY_BOTTLE_FOOD_EFFECT,
												12000,
												0,
												false,
												false,
												true
										))).build());
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.MELON_SLICE_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.MELON_SLICE);
			if (serverConfig.milk_bucket_functionality.get() == FoodOverhaulVanillaFoods.MilkFunctionality.FOOD) {
				context.modify(Items.MILK_BUCKET, builder -> {
					builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
					builder.set(DataComponents.CONSUMABLE, Consumable.builder()
							.consumeSeconds(1.6F)
							.animation(ItemUseAnimation.DRINK)
							.sound(SoundEvents.GENERIC_DRINK)
							.onConsume(
									new ApplyStatusEffectsConsumeEffect(
											new MobEffectInstance(
													FoodOverhaulVanillaFoods.MILK_FOOD_EFFECT,
													12000,
													0,
													false,
													false,
													false
											))).build());
				});
			} else if (serverConfig.milk_bucket_functionality.get() == FoodOverhaulVanillaFoods.MilkFunctionality.REMOVE_EFFECTS_IN_TAG) {
				context.modify(Items.MILK_BUCKET, builder -> {
					builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
					builder.set(DataComponents.CONSUMABLE, Consumable.builder()
							.consumeSeconds(1.6F)
							.animation(ItemUseAnimation.DRINK)
							.sound(SoundEvents.GENERIC_DRINK)
							.onConsume(
									new ApplyStatusEffectsConsumeEffect(
											new MobEffectInstance(
													FoodOverhaulVanillaFoods.REMOVE_EFFECTS_MILK_FOOD_EFFECT,
													1,
													0,
													false,
													false,
													false
											))).build());
				});
			}
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.MUSHROOM_STEW_FOOD_EFFECT,
					30000,
					0,
					false,
					false,
					true
			), Items.MUSHROOM_STEW);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.MUTTON_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.MUTTON);
			if (!serverConfig.enable_finite_plants_integration.get()) {
				context.modify(Items.NETHER_WART, builder -> {
				builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
				builder.set(DataComponents.CONSUMABLE, Consumable.builder()
						.consumeSeconds(1.6F)
						.animation(ItemUseAnimation.EAT)
						.sound(SoundEvents.GENERIC_EAT)
						.hasConsumeParticles(true)
						.onConsume(
								new ApplyStatusEffectsConsumeEffect(List.of(
										new MobEffectInstance(
												FoodOverhaulVanillaFoods.NETHER_WART_FOOD_EFFECT,
												18000,
												0,
												false,
												false,
												true
										)
								))).build());
				});
			}
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.POISONOUS_POTATO_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.POISONOUS_POTATO);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.PORKCHOP_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.PORKCHOP);
			context.modify(Items.POTATO, builder -> {
				builder.set(DataComponents.FOOD, null);
				if (serverConfig.enable_finite_plants_integration.get()) {
					builder.set(DataComponents.CONSUMABLE, null);
				} else {
					builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
					builder.set(DataComponents.CONSUMABLE, Consumable.builder()
							.consumeSeconds(1.6F)
							.animation(ItemUseAnimation.EAT)
							.sound(SoundEvents.GENERIC_EAT)
							.hasConsumeParticles(true)
							.onConsume(
									new ApplyStatusEffectsConsumeEffect(List.of(
											new MobEffectInstance(
													FoodOverhaulVanillaFoods.POTATO_FOOD_EFFECT,
													12000,
													0,
													false,
													false,
													true
											)
									))).build());
				}
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.PUFFERFISH_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.PUFFERFISH);
			context.modify(Items.PUMPKIN_PIE, builder -> {
				builder.set(DataComponents.FOOD, null);
				if (serverConfig.is_pumpkin_pie_consumable.get()) {
					builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
					builder.set(DataComponents.CONSUMABLE, Consumable.builder()
							.consumeSeconds(1.6F)
							.animation(ItemUseAnimation.EAT)
							.sound(SoundEvents.GENERIC_EAT)
							.hasConsumeParticles(true)
							.onConsume(
									new ApplyStatusEffectsConsumeEffect(
											new MobEffectInstance(
													FoodOverhaulVanillaFoods.PUMPKIN_PIE_FOOD_EFFECT,
													30000,
													0,
													false,
													false,
													true
											))).build());
				} else {
					builder.set(DataComponents.CONSUMABLE, null);
				}
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.RABBIT_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.RABBIT);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.RABBIT_STEW_FOOD_EFFECT,
					30000,
					0,
					false,
					false,
					true
			), Items.RABBIT_STEW);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.RED_MUSHROOM_FOOD_EFFECT,
					18000,
					0,
					false,
					false,
					true
			), Items.RED_MUSHROOM);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.ROTTEN_FLESH_FOOD_EFFECT,
					1,
					0,
					false,
					false,
					true
			), Items.ROTTEN_FLESH);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.SALMON_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.SALMON);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.SPIDER_EYE_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.SPIDER_EYE);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.SUGAR_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.SUGAR);
			context.modify(Items.SWEET_BERRIES, builder -> {
				builder.set(DataComponents.FOOD, null);
				if (serverConfig.enable_finite_plants_integration.get()) {
					builder.set(DataComponents.CONSUMABLE, null);
				} else {
					builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
					builder.set(DataComponents.CONSUMABLE, Consumable.builder()
							.consumeSeconds(1.6F)
							.animation(ItemUseAnimation.EAT)
							.sound(SoundEvents.GENERIC_EAT)
							.hasConsumeParticles(true)
							.onConsume(
									new ApplyStatusEffectsConsumeEffect(List.of(
											new MobEffectInstance(
													FoodOverhaulVanillaFoods.SWEET_BERRIES_FOOD_EFFECT,
													18000,
													0,
													false,
													false,
													true
											)
									))).build());
				}
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoods.TROPICAL_FISH_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.TROPICAL_FISH);
		});
	}

	private static void applyDefaultOverhauledFoodComponents(DefaultItemComponentEvents.ModifyContext context, MobEffectInstance mobEffectInstance, Item item) {
		context.modify(item, builder -> {
			builder.set(DataComponents.FOOD, null);
			builder.set(DataComponents.USE_COOLDOWN, new UseCooldown(0.5F));
			builder.set(DataComponents.CONSUMABLE, Consumable.builder()
					.consumeSeconds(1.6F)
					.animation(ItemUseAnimation.EAT)
					.sound(SoundEvents.GENERIC_EAT)
					.hasConsumeParticles(true)
					.onConsume(new ApplyStatusEffectsConsumeEffect(mobEffectInstance)).build());
		});
	}
}
