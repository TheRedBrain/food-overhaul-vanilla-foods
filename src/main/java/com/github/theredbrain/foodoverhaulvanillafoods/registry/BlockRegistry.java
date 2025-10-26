package com.github.theredbrain.foodoverhaulvanillafoods.registry;

import com.github.theredbrain.foodoverhaul.FoodOverhaul;
import com.github.theredbrain.foodoverhaul.block.entity.FoodBlockEntity;
import com.github.theredbrain.foodoverhaul.registry.EntityRegistry;
import com.github.theredbrain.foodoverhaulvanillafoods.FoodOverhaulVanillaFoods;
import com.github.theredbrain.foodoverhaulvanillafoods.block.OverhauledCakeBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.TypedEntityData;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.BlockSoundGroup;

public class BlockRegistry {

	public static final Block OVERHAULED_CAKE;

	public static void init() {
		EntityRegistry.FOOD_BLOCK_ENTITY.addSupportedBlock(BlockRegistry.OVERHAULED_CAKE);
	}

	static {
		NbtCompound default_cake_nbt = new NbtCompound();
		default_cake_nbt.putString("appliedStatusEffectIdentifier", FoodOverhaulVanillaFoods.identifier("cake_food_effect").toString());
		default_cake_nbt.putInt("duration", 24000);
		default_cake_nbt.putBoolean("ambient", false);
		default_cake_nbt.putBoolean("showParticles", false);
		default_cake_nbt.putBoolean("infiniteUses", false);
		TypedEntityData<BlockEntityType<?>> default_cake_data = TypedEntityData.create(EntityRegistry.GENERIC_FOOD_BLOCK_ENTITY, default_cake_nbt);
		OVERHAULED_CAKE = FoodOverhaul.registerFoodBlock(
				FoodOverhaulVanillaFoods.identifier("overhauled_cake"),
				new OverhauledCakeBlock(AbstractBlock.Settings.create().solid().strength(0.5F).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY)),
				new Item.Settings().component(DataComponentTypes.BLOCK_ENTITY_DATA, default_cake_data).maxCount(1),
				ItemGroups.FOOD_AND_DRINK
		);
	}
}
