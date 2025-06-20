package com.github.theredbrain.foodoverhaulvanillafoods;

import com.github.theredbrain.foodoverhaulvanillafoods.compat.HealthRegenerationOverhaulCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.compat.ManaAttributesCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.compat.OverhauledDamageCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.compat.StaminaAttributesCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.config.ServerConfig;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.StatusEffectsRegistry;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

import static net.fabricmc.fabric.api.resource.ResourceManagerHelper.registerBuiltinResourcePack;

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

	public static RegistryEntry<StatusEffect> APPLE_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> BAKED_POTATO_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> BEEF_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> BEETROOT_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> BEETROOT_SOUP_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> BREAD_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> BROWN_MUSHROOM_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> CAKE_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> CARROT_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> CHICKEN_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> CHORUS_FRUIT_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> COCOA_BEANS_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> COD_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> COOKED_BEEF_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> COOKED_CHICKEN_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> COOKED_COD_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> COOKED_MUTTON_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> COOKED_PORKCHOP_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> COOKED_RABBIT_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> COOKED_SALMON_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> COOKIE_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> DRIED_KELP_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> ENCHANTED_GOLDEN_APPLE_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> FERMENTED_SPIDER_EYE_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> GLOW_BERRIES_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> GOLDEN_APPLE_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> GOLDEN_CARROT_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> HONEY_BOTTLE_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> MELON_SLICE_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> MUSHROOM_STEW_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> MUTTON_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> POISONOUS_POTATO_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> PORKCHOP_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> POTATO_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> PUFFERFISH_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> PUMPKIN_PIE_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> RABBIT_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> RABBIT_STEW_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> RED_MUSHROOM_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> ROTTEN_FLESH_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> SALMON_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> SPIDER_EYE_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> SUGAR_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> SUSPICIOUS_STEW_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> SWEET_BERRIES_FOOD_EFFECT;
	public static RegistryEntry<StatusEffect> TROPICAL_FISH_FOOD_EFFECT;

	@Override
	public void onInitialize() {
		LOGGER.info("Even more overhauled food!");
		SERVER_CONFIG = ConfigApiJava.registerAndLoadConfig(ServerConfig::new);

		StatusEffectsRegistry.registerEffects();
	}

	static {
		Optional<ModContainer> optionalModContainer = FabricLoader.getInstance().getModContainer(MOD_ID);
		if (optionalModContainer.isPresent()) {
			registerBuiltinResourcePack(identifier("food_overhaul_vanilla_items"), optionalModContainer.get(), Text.translatable("foodoverhauleffects.builtin_resource_packs.food_overhaul_vanilla_items"), ResourcePackActivationType.DEFAULT_ENABLED);
		}
	}

	public static Identifier identifier(String path) {
		return Identifier.of(MOD_ID, path);
	}
}