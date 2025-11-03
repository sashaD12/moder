
package net.mcreator.doz_in_maincraft.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.doz_in_maincraft.procedures.ForestSporesKazhdyiTikVoVriemiaEffiektaProcedure;

public class ForestSporesMobEffect extends MobEffect {
	public ForestSporesMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434829);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ForestSporesKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
