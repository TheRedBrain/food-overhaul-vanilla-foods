package com.github.theredbrain.foodoverhaulvanillafoods.block;

import com.github.theredbrain.foodoverhaul.block.AbstractShapedFoodBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.Nullable;

public abstract class AbstractSevenUsesFoodBlock extends AbstractShapedFoodBlock {

	public static IntegerProperty BITES;

	public AbstractSevenUsesFoodBlock(Properties properties, VoxelShape[] foodShapes, @Nullable VoxelShape containerShape) {
		super(properties, foodShapes, containerShape);
		this.registerDefaultState(this.stateDefinition.any().setValue(BITES, 0));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(BITES);
	}

	public int getMaxUses() {
		return 7;
	}

	protected int getBites(BlockState state) {
		return state.getValue(BITES);
	}

	protected BlockState setBites(BlockState state, int value) {
		return state.setValue(BITES, value);
	}

	static {
		BITES = IntegerProperty.create("bites", 0, 6);
	}
}
