package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModEntities;

public class BeastForest3KoghdaSushchnostUmiraietProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = DozInMaincraftModEntities.BEAST_FOREST_2.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = DozInMaincraftModEntities.FORESTER_HUNTER_5.get().spawn(_level, BlockPos.containing(x + 4, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = DozInMaincraftModEntities.FORESTER_HUNTER_4.get().spawn(_level, BlockPos.containing(x, y + 4, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = DozInMaincraftModEntities.FORRESTER_HUNTER_3.get().spawn(_level, BlockPos.containing(x - 4, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = DozInMaincraftModEntities.FORRSTER_HUNTER_2.get().spawn(_level, BlockPos.containing(x, y - 4, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
	}
}
