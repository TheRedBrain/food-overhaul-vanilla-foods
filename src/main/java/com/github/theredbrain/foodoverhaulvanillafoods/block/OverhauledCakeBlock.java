package com.github.theredbrain.foodoverhaulvanillafoods.block;

import com.github.theredbrain.foodoverhaul.block.GenericFoodBlock;
import com.github.theredbrain.foodoverhaul.block.entity.FoodBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class OverhauledCakeBlock extends GenericFoodBlock {
	public static final MapCodec<OverhauledCakeBlock> CODEC = simpleCodec(OverhauledCakeBlock::new);

	public static final IntegerProperty BITES;
	protected static final VoxelShape SHAPE;

	@Override
	protected MapCodec<OverhauledCakeBlock> codec() {
		return CODEC;
	}

	public OverhauledCakeBlock(Properties settings) {
		super(settings);
		this.registerDefaultState(this.stateDefinition.any().setValue(BITES, 0));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(BITES);
	}

	@Override
	protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	@Override
	protected void onSuccessfulInteraction(LevelAccessor world, BlockPos pos, BlockState state, FoodBlockEntity foodBlockEntity, Player player) {

		super.onSuccessfulInteraction(world, pos, state, foodBlockEntity, player);

		player.awardStat(Stats.EAT_CAKE_SLICE);
		int i = state.getValue(BITES);
		world.gameEvent(player, GameEvent.EAT, pos);
		if (!foodBlockEntity.getFoodBlockData().infinite_uses()) {
			if (i < 6) {
				world.setBlock(pos, state.setValue(BITES, i + 1), Block.UPDATE_ALL);
			} else {
				world.removeBlock(pos, false);
				world.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
			}
		}
	}

	protected void onSuccessfulItemInteraction(LevelAccessor world, BlockPos pos, BlockState state, FoodBlockEntity foodBlockEntity, Player player) {

		super.onSuccessfulItemInteraction(world, pos, state, foodBlockEntity, player);

		player.awardStat(Stats.EAT_CAKE_SLICE);
		int i = state.getValue(BITES);
		world.playSound(player, pos, SoundEvents.WOOL_BREAK, SoundSource.BLOCKS, 1.0F, 1.0F);
		world.gameEvent(player, GameEvent.EAT, pos);
		if (!foodBlockEntity.getFoodBlockData().infinite_uses()) {
			if (i < 6) {
				world.setBlock(pos, state.setValue(BITES, i + 1), Block.UPDATE_ALL);
			} else {
				world.removeBlock(pos, false);
				world.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
			}
		}
	}

	@Override
	protected void onRecoveryTick(Level world, BlockPos pos, BlockState state) {

		int i = state.getValue(BITES);
		if (i > 0) {
			world.setBlock(pos, state.setValue(BITES, i - 1), Block.UPDATE_ALL);
		}
	}

	@Override
	protected int getAnalogOutputSignal(BlockState state, Level world, BlockPos pos, Direction direction) {
		return getComparatorOutput(state.getValue(BITES));
	}

	public static int getComparatorOutput(int bites) {
		return (7 - bites) * 2;
	}

	static {
		BITES = BlockStateProperties.BITES;
		SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
	}
}
