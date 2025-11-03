package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class FirstExecutionerPriNachalnomPrizyvieSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BEDROCK)) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
