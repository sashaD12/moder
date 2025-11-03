package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModEntities;

public class BeastSummonBlockKrasnyiKamienVklProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.BEDROCK && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.BEDROCK
				&& (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.BEDROCK && (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.BEDROCK
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.BEDROCK && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.BEDROCK
						&& (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.BEDROCK && (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.BEDROCK) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DozInMaincraftModEntities.BEAST_FOREST.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
