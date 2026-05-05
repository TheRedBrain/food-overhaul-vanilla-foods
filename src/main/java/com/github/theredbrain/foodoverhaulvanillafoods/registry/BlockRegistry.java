package com.github.theredbrain.foodoverhaulvanillafoods.registry;

import com.github.theredbrain.foodoverhaul.FoodOverhaul;
import com.github.theredbrain.foodoverhaul.block.entity.FoodBlockEntity;
import com.github.theredbrain.foodoverhaul.component.type.FoodBlockDataComponent;
import com.github.theredbrain.foodoverhaul.registry.EntityRegistry;
import com.github.theredbrain.foodoverhaul.registry.FoodOverhaulDataComponents;
import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.block.OverhauledCakeBlock;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.List;

public class BlockRegistry {

	public static ResourceKey<Block> OVERHAULED_CAKE_BLOCK_KEY = ResourceKey.create(Registries.BLOCK, FoodOverhaulVanillaFoods.identifier("overhauled_cake"));
	public static ResourceKey<Item> OVERHAULED_CAKE_ITEM_KEY = ResourceKey.create(Registries.ITEM, FoodOverhaulVanillaFoods.identifier("overhauled_cake"));
	public static FoodBlockEntity.FoodBlockData OVERHAULED_CAKE_FOOD_BLOCK_DATA = new FoodBlockEntity.FoodBlockData(
			List.of(
					new MobEffectInstance(
							FoodOverhaulVanillaFoods.CAKE_FOOD_EFFECT,
							12000,
							0,
							false,
							false,
							true
					)
			),
			"farmersdelight:cake_slice",
			"#farmersdelight:tools/knives",
			"",
			"",
			0,
			false
	);
	public static Block OVERHAULED_CAKE_BLOCK = registerBlockWithFoodBlockData(OVERHAULED_CAKE_FOOD_BLOCK_DATA, OVERHAULED_CAKE_BLOCK_KEY, OVERHAULED_CAKE_ITEM_KEY, new OverhauledCakeBlock(BlockBehaviour.Properties.of().setId(OVERHAULED_CAKE_BLOCK_KEY).forceSolidOn().strength(0.5F).sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)), List.of(FoodOverhaul.CREATIVE_MODE_TAB_KEY));

	private static Block registerBlockWithFoodBlockData(FoodBlockEntity.FoodBlockData foodBlockData, ResourceKey<Block> block_key, ResourceKey<Item> item_key, Block block, List<ResourceKey<CreativeModeTab>> itemGroupList) {
		Registry.register(BuiltInRegistries.ITEM, item_key, new BlockItem(block, new Item.Properties().setId(item_key).component(FoodOverhaulDataComponents.FOOD_BLOCK_DATA, new FoodBlockDataComponent(foodBlockData)).stacksTo(1)));
		for (ResourceKey<CreativeModeTab> itemGroup : itemGroupList) {
			CreativeModeTabEvents.modifyOutputEvent(itemGroup).register(content -> content.accept(block));
		}
		return Registry.register(BuiltInRegistries.BLOCK, block_key, block);
	}

	public static void init() {
		EntityRegistry.FOOD_BLOCK_ENTITY.addValidBlock(BlockRegistry.OVERHAULED_CAKE_BLOCK);
	}
}
