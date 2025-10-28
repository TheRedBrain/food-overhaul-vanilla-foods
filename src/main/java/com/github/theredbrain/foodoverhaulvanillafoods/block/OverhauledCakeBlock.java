package com.github.theredbrain.foodoverhaulvanillafoods.block;

import com.github.theredbrain.foodoverhaul.block.GenericFoodBlock;
import com.github.theredbrain.foodoverhaul.block.entity.FoodBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;

public class OverhauledCakeBlock extends GenericFoodBlock {
	public static final MapCodec<OverhauledCakeBlock> CODEC = createCodec(OverhauledCakeBlock::new);

	public static final IntProperty BITES;
	protected static final VoxelShape SHAPE;

	@Override
	protected MapCodec<OverhauledCakeBlock> getCodec() {
		return CODEC;
	}

	public OverhauledCakeBlock(Settings settings) {
		super(settings);
		this.setDefaultState(this.stateManager.getDefaultState().with(BITES, 0));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		super.appendProperties(builder);
		builder.add(BITES);
	}

	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return SHAPE;
	}

	@Override
	protected void onSuccessfulInteraction(WorldAccess world, BlockPos pos, BlockState state, FoodBlockEntity foodBlockEntity, PlayerEntity player) {

		super.onSuccessfulInteraction(world, pos, state, foodBlockEntity, player);

		player.incrementStat(Stats.EAT_CAKE_SLICE);
		int i = state.get(BITES);
		world.emitGameEvent(player, GameEvent.EAT, pos);
		if (!foodBlockEntity.getFoodBlockData().infinite_uses()) {
			if (i < 6) {
				world.setBlockState(pos, state.with(BITES, i + 1), Block.NOTIFY_ALL);
			} else {
				world.removeBlock(pos, false);
				world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
			}
		}
	}

	protected void onSuccessfulItemInteraction(WorldAccess world, BlockPos pos, BlockState state, FoodBlockEntity foodBlockEntity, PlayerEntity player) {

		super.onSuccessfulItemInteraction(world, pos, state, foodBlockEntity, player);

		player.incrementStat(Stats.EAT_CAKE_SLICE);
		int i = state.get(BITES);
		world.playSound(player, pos, SoundEvents.BLOCK_WOOL_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
		world.emitGameEvent(player, GameEvent.EAT, pos);
		if (!foodBlockEntity.getFoodBlockData().infinite_uses()) {
			if (i < 6) {
				world.setBlockState(pos, state.with(BITES, i + 1), Block.NOTIFY_ALL);
			} else {
				world.removeBlock(pos, false);
				world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
			}
		}
	}

	@Override
	protected void onRecoveryTick(World world, BlockPos pos, BlockState state) {

		int i = state.get(BITES);
		if (i > 0) {
			world.setBlockState(pos, state.with(BITES, i - 1), Block.NOTIFY_ALL);
		}
	}

	@Override
	protected int getComparatorOutput(BlockState state, World world, BlockPos pos, Direction direction) {
		return getComparatorOutput(state.get(BITES));
	}

	public static int getComparatorOutput(int bites) {
		return (7 - bites) * 2;
	}

	static {
		BITES = Properties.BITES;
		SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
	}
}
