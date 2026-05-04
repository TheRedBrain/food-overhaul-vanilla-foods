package com.github.theredbrain.foodoverhaulvanillafoods;

import com.github.theredbrain.foodoverhaulvanillafoods.compat.HealthRegenerationOverhaulCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.compat.ManaAttributesCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.compat.OverhauledDamageCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.compat.StaminaAttributesCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.config.ServerConfig;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.BlockRegistry;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.ModifyDataComponentHelper;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.StatusEffectsRegistry;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class FoodOverhaulVanillaFoods implements ModInitializer {
	public static final String MOD_ID = "foodoverhaulvanillafoods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ServerConfig SERVER_CONFIG;

	public static final boolean isHealthRegenerationOverhaulLoaded = FabricLoader.getInstance().isModLoaded("healthregenerationoverhaul");
	public static final boolean isManaAttributesLoaded = FabricLoader.getInstance().isModLoaded("manaattributes");
	public static final boolean isOverhauledDamageLoaded = FabricLoader.getInstance().isModLoaded("overhauleddamage");
	public static final boolean isStaminaAttributesLoaded = FabricLoader.getInstance().isModLoaded("staminaattributes");

	public static void addModdedAttributesToFoodEffects() {
		if (isHealthRegenerationOverhaulLoaded && SERVER_CONFIG.enable_health_regeneration_overhaul_compatibility.get()) {
			HealthRegenerationOverhaulCompat.addAttributes();
		}
		if (isManaAttributesLoaded && SERVER_CONFIG.enable_mana_attributes_compatibility.get()) {
			ManaAttributesCompat.addAttributes();
		}
		if (isOverhauledDamageLoaded && SERVER_CONFIG.enable_overhauled_damage_compatibility.get()) {
			OverhauledDamageCompat.addAttributes();
		}
		if (isStaminaAttributesLoaded && SERVER_CONFIG.enable_stamina_attributes_compatibility.get()) {
			StaminaAttributesCompat.addAttributes();
		}
	}

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
	public static Holder<MobEffect> DRIED_KELP_FOOD_EFFECT;
	public static Holder<MobEffect> ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT;
	public static Holder<MobEffect> FERMENTED_SPIDER_EYE_FOOD_EFFECT;
	public static Holder<MobEffect> GLOW_BERRIES_FOOD_EFFECT;
	public static Holder<MobEffect> GOLDEN_APPLE_FOOD_EFFECT;
	public static Holder<MobEffect> GOLDEN_CARROT_FOOD_EFFECT;
	public static Holder<MobEffect> HONEY_BOTTLE_FOOD_EFFECT;
	public static Holder<MobEffect> MELON_SLICE_FOOD_EFFECT;
	public static Holder<MobEffect> MUSHROOM_STEW_FOOD_EFFECT;
	public static Holder<MobEffect> MUTTON_FOOD_EFFECT;
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

	@Override
	public void onInitialize() {
		LOGGER.info("Even more overhauled food!");
		SERVER_CONFIG = ConfigApiJava.registerAndLoadConfig(ServerConfig::new);

		StatusEffectsRegistry.registerEffects();
		BlockRegistry.init();

		if (SERVER_CONFIG.modify_vanilla_items.get()) {
			ModifyDataComponentHelper.init();
		}

		Optional<ModContainer> optionalModContainer = FabricLoader.getInstance().getModContainer(MOD_ID);
		if (optionalModContainer.isPresent()) {
			ResourceLoader.registerBuiltinPack(identifier("cake_recipe_replacement"), optionalModContainer.get(), Component.translatable("foodoverhaulvanillafoods.builtin_resource_packs.cake_recipe_replacement"), PackActivationType.DEFAULT_ENABLED);
//			ResourceLoader.registerBuiltinPack(identifier("finite_plants_compat"), optionalModContainer.get(), Component.translatable("foodoverhaulvanillafoods.builtin_resource_packs.finite_plants_compat"), PackActivationType.DEFAULT_ENABLED);
//			ResourceLoader.registerBuiltinPack(identifier("food_overhaul_vanilla_items"), optionalModContainer.get(), Component.translatable("foodoverhaulvanillafoods.builtin_resource_packs.food_overhaul_vanilla_items"), PackActivationType.DEFAULT_ENABLED);
		}
	}

	public static Identifier identifier(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}