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

	public static void init() {

		ServerConfig serverConfig = FoodOverhaulVanillaFoodsConfigs.SERVER_CONFIG;

		DefaultItemComponentEvents.MODIFY.register(context -> {

			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.APPLE_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.APPLE);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.BAKED_POTATO_FOOD_EFFECT,
					36000,
					0,
					false,
					false,
					true
			), Items.BAKED_POTATO);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.BEEF_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.BEEF);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.BEETROOT_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.BEETROOT);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.BEETROOT_SOUP_FOOD_EFFECT,
					48000,
					0,
					false,
					false,
					true
			), Items.BEETROOT_SOUP);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.BREAD_FOOD_EFFECT,
					36000,
					0,
					false,
					false,
					true
			), Items.BREAD);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.BROWN_MUSHROOM_FOOD_EFFECT,
					6000,
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
													FoodOverhaulVanillaFoodsStatusEffects.CARROT_FOOD_EFFECT,
													24000,
													0,
													false,
													false,
													true
											)
									))).build());
				}
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.CHICKEN_FOOD_EFFECT,
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
										FoodOverhaulVanillaFoodsStatusEffects.CHORUS_FRUIT_FOOD_EFFECT,
										6000,
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
													FoodOverhaulVanillaFoodsStatusEffects.COCOA_BEANS_FOOD_EFFECT,
													6000,
													0,
													false,
													false,
													true
											)
									))).build());
				}
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.COD_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.COD);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.COOKED_BEEF_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_BEEF);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.COOKED_CHICKEN_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_CHICKEN);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.COOKED_COD_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_COD);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.COOKED_MUTTON_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_MUTTON);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.COOKED_PORKCHOP_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_PORKCHOP);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.COOKED_RABBIT_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_RABBIT);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.COOKED_SALMON_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.COOKED_SALMON);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.COOKIE_FOOD_EFFECT,
					6000,
					0,
					false,
					false,
					true
			), Items.COOKIE);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.CRIMSON_FUNGUS_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.CRIMSON_FUNGUS);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.DRIED_KELP_FOOD_EFFECT,
					6000,
					0,
					false,
					false,
					true
			), Items.DRIED_KELP);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT,
					144000,
					0,
					false,
					false,
					true
			), Items.ENCHANTED_GOLDEN_APPLE);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.FERMENTED_SPIDER_EYE_FOOD_EFFECT,
					36000,
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
													FoodOverhaulVanillaFoodsStatusEffects.GLOW_BERRIES_FOOD_EFFECT,
													24000,
													0,
													false,
													false,
													true
											),
											new MobEffectInstance(MobEffects.GLOWING, 24000, 0)
									))).build());
				}
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.GOLDEN_APPLE_FOOD_EFFECT,
					72000,
					0,
					false,
					false,
					true
			), Items.GOLDEN_APPLE);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.GOLDEN_CARROT_FOOD_EFFECT,
					72000,
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
												FoodOverhaulVanillaFoodsStatusEffects.HONEY_BOTTLE_FOOD_EFFECT,
												12000,
												0,
												false,
												false,
												true
										))).build());
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.MELON_SLICE_FOOD_EFFECT,
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
													FoodOverhaulVanillaFoodsStatusEffects.MILK_FOOD_EFFECT,
													6000,
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
													FoodOverhaulVanillaFoodsStatusEffects.REMOVE_EFFECTS_MILK_FOOD_EFFECT,
													1,
													0,
													false,
													false,
													false
											))).build());
				});
			}
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.MUSHROOM_STEW_FOOD_EFFECT,
					48000,
					0,
					false,
					false,
					true
			), Items.MUSHROOM_STEW);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.MUTTON_FOOD_EFFECT,
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
												FoodOverhaulVanillaFoodsStatusEffects.NETHER_WART_FOOD_EFFECT,
												12000,
												0,
												false,
												false,
												true
										)
								))).build());
				});
			}
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.POISONOUS_POTATO_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.POISONOUS_POTATO);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.PORKCHOP_FOOD_EFFECT,
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
													FoodOverhaulVanillaFoodsStatusEffects.POTATO_FOOD_EFFECT,
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
					FoodOverhaulVanillaFoodsStatusEffects.PUFFERFISH_FOOD_EFFECT,
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
													FoodOverhaulVanillaFoodsStatusEffects.PUMPKIN_PIE_FOOD_EFFECT,
													36000,
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
					FoodOverhaulVanillaFoodsStatusEffects.RABBIT_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.RABBIT);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.RABBIT_STEW_FOOD_EFFECT,
					48000,
					0,
					false,
					false,
					true
			), Items.RABBIT_STEW);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.RED_MUSHROOM_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.RED_MUSHROOM);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.ROTTEN_FLESH_FOOD_EFFECT,
					1,
					0,
					false,
					false,
					true
			), Items.ROTTEN_FLESH);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.SALMON_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.SALMON);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.SPIDER_EYE_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.SPIDER_EYE);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.SUGAR_FOOD_EFFECT,
					6000,
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
													FoodOverhaulVanillaFoodsStatusEffects.SWEET_BERRIES_FOOD_EFFECT,
													24000,
													0,
													false,
													false,
													true
											)
									))).build());
				}
			});
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.TROPICAL_FISH_FOOD_EFFECT,
					12000,
					0,
					false,
					false,
					true
			), Items.TROPICAL_FISH);
			applyDefaultOverhauledFoodComponents(context, new MobEffectInstance(
					FoodOverhaulVanillaFoodsStatusEffects.WARPED_FUNGUS_FOOD_EFFECT,
					24000,
					0,
					false,
					false,
					true
			), Items.WARPED_FUNGUS);
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
