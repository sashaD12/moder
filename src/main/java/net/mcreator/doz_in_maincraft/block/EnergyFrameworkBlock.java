
package net.mcreator.doz_in_maincraft.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.doz_in_maincraft.procedures.EnergyFrameworkPriDobavlieniiBlokaProcedure;

public class EnergyFrameworkBlock extends Block {
	public EnergyFrameworkBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2.15f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		EnergyFrameworkPriDobavlieniiBlokaProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
