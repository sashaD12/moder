
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.GhoulBullEntity;
import net.mcreator.doz_in_maincraft.client.model.Modelgul2;

public class GhoulBullRenderer extends MobRenderer<GhoulBullEntity, Modelgul2<GhoulBullEntity>> {
	public GhoulBullRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgul2<GhoulBullEntity>(context.bakeLayer(Modelgul2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GhoulBullEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/gul2.png");
	}
}
