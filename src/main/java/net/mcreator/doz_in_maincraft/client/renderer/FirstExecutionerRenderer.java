
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.FirstExecutionerEntity;
import net.mcreator.doz_in_maincraft.client.model.Modelpalach;

public class FirstExecutionerRenderer extends MobRenderer<FirstExecutionerEntity, Modelpalach<FirstExecutionerEntity>> {
	public FirstExecutionerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpalach<FirstExecutionerEntity>(context.bakeLayer(Modelpalach.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FirstExecutionerEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/palach1.png");
	}
}
