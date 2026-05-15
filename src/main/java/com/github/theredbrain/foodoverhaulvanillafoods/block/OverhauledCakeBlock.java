package com.github.theredbrain.foodoverhaulvanillafoods.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

public class OverhauledCakeBlock extends AbstractSevenUsesFoodBlock {
	public static final MapCodec<OverhauledCakeBlock> CODEC = simpleCodec(OverhauledCakeBlock::new);

	protected static final VoxelShape[] FOOD_SHAPES;

	@Override
	protected MapCodec<OverhauledCakeBlock> codec() {
		return CODEC;
	}

	public OverhauledCakeBlock(final Properties settings) {
		super(settings, FOOD_SHAPES, null);
	}

	@Override
	protected int getAnalogOutputSignal(BlockState state, Level world, BlockPos pos, Direction direction) {
		return (this.getMaxUses() - this.getBites(state)) * 2;
	}

	static {
		FOOD_SHAPES = new VoxelShape[]{
				Block.box(13.0, 0.0, 1.0, 15.0, 8.0, 15.0),
				Block.box(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
				Block.box(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
				Block.box(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
				Block.box(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
				Block.box(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
				Block.box(1.0, 0.0, 1.0, 15.0, 8.0, 15.0)
		};
	}
}
