
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.BloodyClawEntity;
import net.mcreator.doz_in_maincraft.client.model.Modelkogot;

public class BloodyClawRenderer extends MobRenderer<BloodyClawEntity, Modelkogot<BloodyClawEntity>> {
	public BloodyClawRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkogot<BloodyClawEntity>(context.bakeLayer(Modelkogot.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BloodyClawEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/kogot.png");
	}
}
