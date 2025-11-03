
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.GhoulRaiderEntity;
import net.mcreator.doz_in_maincraft.client.model.Modelgul3;

public class GhoulRaiderRenderer extends MobRenderer<GhoulRaiderEntity, Modelgul3<GhoulRaiderEntity>> {
	public GhoulRaiderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgul3<GhoulRaiderEntity>(context.bakeLayer(Modelgul3.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GhoulRaiderEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/gul3.png");
	}
}
