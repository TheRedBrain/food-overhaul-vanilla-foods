package com.github.theredbrain.foodoverhaulvanillafoods.config;

import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import me.fzzyhmstrs.fzzy_config.annotations.ConvertFrom;
import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedBoolean;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedEnum;

@ConvertFrom(fileName = "server.json5", folder = "foodoverhaulvanillafoods")
public class ServerConfig extends Config {

	public ServerConfig() {
		super(FoodOverhaulVanillaFoods.identifier("server"));
	}

	public ValidatedBoolean modify_vanilla_items = new ValidatedBoolean(true);
	public ValidatedEnum<FoodOverhaulVanillaFoods.MilkFunctionality> milk_bucket_functionality = new ValidatedEnum<>(FoodOverhaulVanillaFoods.MilkFunctionality.VANILLA);

	public ValidatedBoolean enable_health_regeneration_overhaul_compatibility = new ValidatedBoolean(true);
	public ValidatedBoolean enable_mana_attributes_compatibility = new ValidatedBoolean(true);
	public ValidatedBoolean enable_overhauled_damage_compatibility = new ValidatedBoolean(true);
	public ValidatedBoolean enable_stamina_attributes_compatibility = new ValidatedBoolean(true);
}
