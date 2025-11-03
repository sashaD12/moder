package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.doz_in_maincraft.network.DozInMaincraftModVariables;

public class FdgdPriObnovlieniiTikaSushchnostiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DozInMaincraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DozInMaincraftModVariables.PlayerVariables())).ulta == 1440) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 6);
		}
	}
}
