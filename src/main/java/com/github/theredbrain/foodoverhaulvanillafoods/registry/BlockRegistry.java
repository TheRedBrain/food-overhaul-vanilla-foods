package com.github.theredbrain.foodoverhaulvanillafoods.registry;

import com.github.theredbrain.foodoverhaul.FoodOverhaul;
import com.github.theredbrain.foodoverhaul.block.entity.FoodBlockEntity;
import com.github.theredbrain.foodoverhaul.component.type.FoodBlockDataComponent;
import com.github.theredbrain.foodoverhaul.registry.EntityRegistry;
import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.block.OverhauledCakeBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;

import java.util.List;

public class BlockRegistry {

	public static RegistryKey<Block> OVERHAULED_CAKE_BLOCK_KEY = RegistryKey.of(RegistryKeys.BLOCK, FoodOverhaulVanillaFoods.identifier("overhauled_cake"));
	public static RegistryKey<Item> OVERHAULED_CAKE_ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, FoodOverhaulVanillaFoods.identifier("overhauled_cake"));
	public static FoodBlockEntity.FoodBlockData OVERHAULED_CAKE_FOOD_BLOCK_DATA = new FoodBlockEntity.FoodBlockData(
			"foodoverhaulvanillafoods:cake_food_effect",
			12000,
			0,
			false,
			false,
			true,
			"minecraft:cookie",
			"minecraft:iron_sword",
			"",
			"",
			0,
			false
	);
	public static Block OVERHAULED_CAKE_BLOCK = registerBlockWithFoodBlockData(OVERHAULED_CAKE_FOOD_BLOCK_DATA, OVERHAULED_CAKE_BLOCK_KEY, OVERHAULED_CAKE_ITEM_KEY, new OverhauledCakeBlock(AbstractBlock.Settings.create().registryKey(OVERHAULED_CAKE_BLOCK_KEY).solid().strength(0.5F).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY)), List.of(ItemGroups.FOOD_AND_DRINK));

	private static Block registerBlockWithFoodBlockData(FoodBlockEntity.FoodBlockData foodBlockData, RegistryKey<Block> block_key, RegistryKey<Item> item_key, Block block, List<RegistryKey<ItemGroup>> itemGroupList) {
		Registry.register(Registries.ITEM, item_key, new BlockItem(block, new Item.Settings().registryKey(item_key).component(FoodOverhaul.FOOD_BLOCK_DATA, new FoodBlockDataComponent(foodBlockData)).maxCount(1)));
		for (RegistryKey<ItemGroup> itemGroup : itemGroupList) {
			ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.add(block));
		}
		return Registry.register(Registries.BLOCK, block_key, block);
	}

	public static void init() {
		EntityRegistry.FOOD_BLOCK_ENTITY.addSupportedBlock(BlockRegistry.OVERHAULED_CAKE_BLOCK);
	}
}
