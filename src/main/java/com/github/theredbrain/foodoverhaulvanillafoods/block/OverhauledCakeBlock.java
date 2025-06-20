package com.github.theredbrain.foodoverhaulvanillafoods.block;

import com.github.theredbrain.foodoverhaul.block.GenericFoodBlock;
import com.github.theredbrain.foodoverhaul.block.entity.FoodBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class OverhauledCakeBlock extends GenericFoodBlock {
	public static final MapCodec<OverhauledCakeBlock> CODEC = createCodec(OverhauledCakeBlock::new);

	public static final IntProperty BITES;
	protected static final VoxelShape[] BITES_TO_SHAPE;

	public OverhauledCakeBlock(Settings settings) {
		super(settings);
		this.setDefaultState((BlockState) ((BlockState) this.stateManager.getDefaultState()).with(BITES, 0));
	}

	public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new FoodBlockEntity(pos, state);
	}

	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return BITES_TO_SHAPE[(Integer) state.get(BITES)];
	}

	@Override
	protected MapCodec<OverhauledCakeBlock> getCodec() {
		return CODEC;
	}

	@Override
	protected void onSuccessfulInteraction(WorldAccess world, BlockPos pos, BlockState state, FoodBlockEntity foodBlockEntity, PlayerEntity player) {

		super.onSuccessfulInteraction(world, pos, state, foodBlockEntity, player);

		player.incrementStat(Stats.EAT_CAKE_SLICE);
		int i = state.get(BITES);
		world.emitGameEvent(player, GameEvent.EAT, pos);
		if (i < 6) {
			world.setBlockState(pos, state.with(BITES, i + 1), Block.NOTIFY_ALL);
		} else {
			world.removeBlock(pos, false);
			world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
		}
	}

	@Override
	protected void onRecoveryTick(World world, BlockPos pos, BlockState state) {

		int i = state.get(BITES);
		if (i > 0) {
			world.setBlockState(pos, state.with(BITES, i - 1), Block.NOTIFY_ALL);
		}
	}

	protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		return direction == Direction.DOWN && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
	}

	protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
		return world.getBlockState(pos.down()).isSolid();
	}

	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(new Property[]{BITES});
	}

	protected int getComparatorOutput(BlockState state, World world, BlockPos pos) {
		return getComparatorOutput((Integer) state.get(BITES));
	}

	public static int getComparatorOutput(int bites) {
		return (7 - bites) * 2;
	}

	protected boolean hasComparatorOutput(BlockState state) {
		return true;
	}

	protected boolean canPathfindThrough(BlockState state, NavigationType type) {
		return false;
	}

	static {
		BITES = Properties.BITES;
		BITES_TO_SHAPE = new VoxelShape[]{Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.createCuboidShape(3.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.createCuboidShape(5.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.createCuboidShape(7.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.createCuboidShape(9.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.createCuboidShape(11.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.createCuboidShape(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)};
	}
}
