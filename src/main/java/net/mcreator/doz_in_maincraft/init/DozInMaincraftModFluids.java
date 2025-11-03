
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.doz_in_maincraft.fluid.MoltenSteelFluid;
import net.mcreator.doz_in_maincraft.fluid.FLUEDGLASSFluid;
import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

public class DozInMaincraftModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, DozInMaincraftMod.MODID);
	public static final RegistryObject<FlowingFluid> FLUEDGLASS = REGISTRY.register("fluedglass", () -> new FLUEDGLASSFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_FLUEDGLASS = REGISTRY.register("flowing_fluedglass", () -> new FLUEDGLASSFluid.Flowing());
	public static final RegistryObject<FlowingFluid> MOLTEN_STEEL = REGISTRY.register("molten_steel", () -> new MoltenSteelFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_STEEL = REGISTRY.register("flowing_molten_steel", () -> new MoltenSteelFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(FLUEDGLASS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_FLUEDGLASS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(MOLTEN_STEEL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MOLTEN_STEEL.get(), RenderType.translucent());
		}
	}
}
