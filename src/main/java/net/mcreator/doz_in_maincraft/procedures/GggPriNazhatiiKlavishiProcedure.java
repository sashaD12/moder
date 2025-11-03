package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.doz_in_maincraft.network.DozInMaincraftModVariables;
import net.mcreator.doz_in_maincraft.init.DozInMaincraftModMobEffects;
import net.mcreator.doz_in_maincraft.init.DozInMaincraftModEntities;

public class GggPriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DozInMaincraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DozInMaincraftModVariables.PlayerVariables())).ulta == 0 && entity instanceof LivingEntity _livEnt0
				&& _livEnt0.hasEffect(DozInMaincraftModMobEffects.TY.get())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = DozInMaincraftModEntities.DRON.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
			{
				double _setval = 1;
				entity.getCapability(DozInMaincraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ulta = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
