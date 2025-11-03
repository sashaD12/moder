
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.doz_in_maincraft.client.renderer.RisingExecutionerRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.ObjectStokerRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.ObjectDiodeRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.GhoulRaiderRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.GhoulBullRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.GhoulBanditRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.GhoulArrowsRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.ForrsterHunter2Renderer;
import net.mcreator.doz_in_maincraft.client.renderer.ForresterHunter3Renderer;
import net.mcreator.doz_in_maincraft.client.renderer.ForesterHunterRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.ForesterHunter5Renderer;
import net.mcreator.doz_in_maincraft.client.renderer.ForesterHunter4Renderer;
import net.mcreator.doz_in_maincraft.client.renderer.FirstExecutionerRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.FirstExecutioner2Renderer;
import net.mcreator.doz_in_maincraft.client.renderer.FirstExecutioner1Renderer;
import net.mcreator.doz_in_maincraft.client.renderer.FdgdRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.BrigadierGhulRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.BloodyClawRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.BloodyCarcassRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.BeastForestRenderer;
import net.mcreator.doz_in_maincraft.client.renderer.BeastForest4Renderer;
import net.mcreator.doz_in_maincraft.client.renderer.BeastForest3Renderer;
import net.mcreator.doz_in_maincraft.client.renderer.BeastForest2Renderer;
import net.mcreator.doz_in_maincraft.client.renderer.BeastForest1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DozInMaincraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DozInMaincraftModEntities.FORESTER_HUNTER.get(), ForesterHunterRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.FORRSTER_HUNTER_2.get(), ForrsterHunter2Renderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.FORRESTER_HUNTER_3.get(), ForresterHunter3Renderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.FORESTER_HUNTER_4.get(), ForesterHunter4Renderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.FORESTER_HUNTER_5.get(), ForesterHunter5Renderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.BEAST_FOREST.get(), BeastForestRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.BEAST_FOREST_4.get(), BeastForest4Renderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.BEAST_FOREST_3.get(), BeastForest3Renderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.BEAST_FOREST_2.get(), BeastForest2Renderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.BEAST_FOREST_1.get(), BeastForest1Renderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.GHOUL_BANDIT.get(), GhoulBanditRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.GHOUL_BULL.get(), GhoulBullRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.BRIGADIER_GHUL.get(), BrigadierGhulRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.GHOUL_ARROWS.get(), GhoulArrowsRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.GHOUL_RAIDER.get(), GhoulRaiderRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.FIRST_EXECUTIONER.get(), FirstExecutionerRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.FIRST_EXECUTIONER_2.get(), FirstExecutioner2Renderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.FIRST_EXECUTIONER_1.get(), FirstExecutioner1Renderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.RISING_EXECUTIONER.get(), RisingExecutionerRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.BLOODY_CLAW.get(), BloodyClawRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.BLOODY_CARCASS.get(), BloodyCarcassRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.OBJECT_STOKER.get(), ObjectStokerRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.DRON.get(), FdgdRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.OBJECT_DIODE.get(), ObjectDiodeRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.BOW_FORESTERS_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.L_96_A_1_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.MGL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.MAGNUM_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.PP_19_BIZON_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.TT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.TT_SIMBIOT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DozInMaincraftModEntities.SPAS_12_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
