
package net.mcreator.doz_in_maincraft.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.doz_in_maincraft.procedures.FLUEDGLASSKoghdaBlokDobavlienProcedure;
import net.mcreator.doz_in_maincraft.init.DozInMaincraftModFluids;

public class FLUEDGLASSBlock extends LiquidBlock {
	public FLUEDGLASSBlock() {
		super(() -> DozInMaincraftModFluids.FLUEDGLASS.get(), BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		FLUEDGLASSKoghdaBlokDobavlienProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
