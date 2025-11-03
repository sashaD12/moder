
package net.mcreator.doz_in_maincraft.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.doz_in_maincraft.procedures.TyPriIstiechieniiEffiektaProcedure;

public class TyMobEffect extends MobEffect {
	public TyMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13421824);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TyPriIstiechieniiEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
