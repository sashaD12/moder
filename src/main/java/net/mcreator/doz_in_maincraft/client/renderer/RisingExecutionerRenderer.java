
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.RisingExecutionerEntity;
import net.mcreator.doz_in_maincraft.client.model.Modelpalach;

public class RisingExecutionerRenderer extends MobRenderer<RisingExecutionerEntity, Modelpalach<RisingExecutionerEntity>> {
	public RisingExecutionerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpalach<RisingExecutionerEntity>(context.bakeLayer(Modelpalach.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RisingExecutionerEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/palach1.png");
	}
}
