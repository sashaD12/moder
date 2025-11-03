
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.GhoulBanditEntity;
import net.mcreator.doz_in_maincraft.client.model.Modelgul0;

public class GhoulBanditRenderer extends MobRenderer<GhoulBanditEntity, Modelgul0<GhoulBanditEntity>> {
	public GhoulBanditRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgul0<GhoulBanditEntity>(context.bakeLayer(Modelgul0.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GhoulBanditEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/gul5.png");
	}
}
