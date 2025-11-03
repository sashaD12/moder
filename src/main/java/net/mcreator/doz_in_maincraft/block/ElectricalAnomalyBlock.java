
package net.mcreator.doz_in_maincraft.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.doz_in_maincraft.procedures.ElectricalAnomalyKoghdaSushchnostKhoditPoBlokuProcedure;

public class ElectricalAnomalyBlock extends Block {
	public ElectricalAnomalyBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		ElectricalAnomalyKoghdaSushchnostKhoditPoBlokuProcedure.execute(world, entity);
	}
}
