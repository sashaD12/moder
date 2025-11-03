
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.doz_in_maincraft.potion.TyMobEffect;
import net.mcreator.doz_in_maincraft.potion.ForestSporesMobEffect;
import net.mcreator.doz_in_maincraft.potion.DeepWoundsMobEffect;
import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

public class DozInMaincraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DozInMaincraftMod.MODID);
	public static final RegistryObject<MobEffect> FOREST_SPORES = REGISTRY.register("forest_spores", () -> new ForestSporesMobEffect());
	public static final RegistryObject<MobEffect> DEEP_WOUNDS = REGISTRY.register("deep_wounds", () -> new DeepWoundsMobEffect());
	public static final RegistryObject<MobEffect> TY = REGISTRY.register("ty", () -> new TyMobEffect());
}
