package com.github.theredbrain.foodoverhaulvanillafoods;

import com.github.theredbrain.foodoverhaulvanillafoods.compat.HealthRegenerationOverhaulCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.compat.ManaAttributesCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.compat.OverhauledDamageCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.compat.StaminaAttributesCompat;
import com.github.theredbrain.foodoverhaulvanillafoods.config.ServerConfig;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.FoodOverhaulVanillaFoodsBlocks;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.FoodOverhaulVanillaFoodsStatusEffects;
import com.github.theredbrain.foodoverhaulvanillafoods.registry.ModifyDataComponentHelper;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class FoodOverhaulVanillaFoods implements ModInitializer {
	public static final String MOD_ID = "foodoverhaulvanillafoods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ServerConfig SERVER_CONFIG;

	public static TagKey<MobEffect> REMOVED_BY_MILK = TagKey.create(Registries.MOB_EFFECT, identifier("removed_by_milk"));

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

	@Override
	public void onInitialize() {
		LOGGER.info("Even more overhauled food!");
		SERVER_CONFIG = ConfigApiJava.registerAndLoadConfig(ServerConfig::new);

		FoodOverhaulVanillaFoodsBlocks.bootstrap();
		FoodOverhaulVanillaFoodsStatusEffects.bootstrap();

		if (SERVER_CONFIG.modify_vanilla_items.get()) {
			ModifyDataComponentHelper.init(SERVER_CONFIG);
		}

		Optional<ModContainer> optionalModContainer = FabricLoader.getInstance().getModContainer(MOD_ID);
		if (optionalModContainer.isPresent()) {
			ResourceLoader.registerBuiltinPack(identifier("cake_recipe_replacement"), optionalModContainer.get(), Component.translatable("foodoverhaulvanillafoods.builtin_resource_packs.cake_recipe_replacement"), PackActivationType.DEFAULT_ENABLED);
//			ResourceLoader.registerBuiltinPack(identifier("finite_plants_compat"), optionalModContainer.get(), Component.translatable("foodoverhaulvanillafoods.builtin_resource_packs.finite_plants_compat"), PackActivationType.DEFAULT_ENABLED);
//			ResourceLoader.registerBuiltinPack(identifier("food_overhaul_vanilla_items"), optionalModContainer.get(), Component.translatable("foodoverhaulvanillafoods.builtin_resource_packs.food_overhaul_vanilla_items"), PackActivationType.DEFAULT_ENABLED);
		}
	}

	public enum MilkFunctionality {
		VANILLA,
		REMOVE_EFFECTS_IN_TAG,
		FOOD
	}

	public static Identifier identifier(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}