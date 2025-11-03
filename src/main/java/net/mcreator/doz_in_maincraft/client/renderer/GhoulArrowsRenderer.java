
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.GhoulArrowsEntity;
import net.mcreator.doz_in_maincraft.client.model.Modelgul2;

public class GhoulArrowsRenderer extends MobRenderer<GhoulArrowsEntity, Modelgul2<GhoulArrowsEntity>> {
	public GhoulArrowsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgul2<GhoulArrowsEntity>(context.bakeLayer(Modelgul2.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GhoulArrowsEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/gul2.png");
	}
}
