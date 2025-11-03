
package net.mcreator.doz_in_maincraft.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.doz_in_maincraft.procedures.DeepWoundsAktivnoieSostoianiieProcedure;

public class DeepWoundsMobEffect extends MobEffect {
	public DeepWoundsMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10092544);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DeepWoundsAktivnoieSostoianiieProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
