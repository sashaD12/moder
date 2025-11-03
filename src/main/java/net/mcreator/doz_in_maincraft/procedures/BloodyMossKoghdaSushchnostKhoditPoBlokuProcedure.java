package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModMobEffects;

public class BloodyMossKoghdaSushchnostKhoditPoBlokuProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get()) ? _livEnt.getEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get()).getAmplifier() : 0) == 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(DozInMaincraftModMobEffects.DEEP_WOUNDS.get(), 60, 1));
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1);
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get()) ? _livEnt.getEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get()).getAmplifier() : 0) == 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(DozInMaincraftModMobEffects.DEEP_WOUNDS.get(), 60, 1));
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1);
		} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get()) ? _livEnt.getEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get()).getAmplifier() : 0) == 2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(DozInMaincraftModMobEffects.DEEP_WOUNDS.get(), 60, 1));
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1);
		}
	}
}
