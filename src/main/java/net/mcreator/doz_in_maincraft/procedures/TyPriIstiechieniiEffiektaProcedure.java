package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModMobEffects;

public class TyPriIstiechieniiEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(DozInMaincraftModMobEffects.TY.get(), (int) Double.POSITIVE_INFINITY, 1));
	}
}
