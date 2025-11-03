package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModMobEffects;

public class TTSimbiotKoghdaSnariadPopadaietVSushchnostProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.7) {
			if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get()))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(DozInMaincraftModMobEffects.DEEP_WOUNDS.get(), 120, 1));
			} else if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get())) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get()) ? _livEnt.getEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get()).getAmplifier() : 0) == 1) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(DozInMaincraftModMobEffects.DEEP_WOUNDS.get(), 120, 2));
				}
			} else if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get())) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get()) ? _livEnt.getEffect(DozInMaincraftModMobEffects.DEEP_WOUNDS.get()).getAmplifier() : 0) == 2) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(DozInMaincraftModMobEffects.DEEP_WOUNDS.get(), 120, 3));
				}
			}
		}
	}
}
