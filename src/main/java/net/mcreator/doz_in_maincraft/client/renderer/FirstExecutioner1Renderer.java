
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.FirstExecutioner1Entity;
import net.mcreator.doz_in_maincraft.client.model.Modelpalach;

public class FirstExecutioner1Renderer extends MobRenderer<FirstExecutioner1Entity, Modelpalach<FirstExecutioner1Entity>> {
	public FirstExecutioner1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelpalach<FirstExecutioner1Entity>(context.bakeLayer(Modelpalach.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FirstExecutioner1Entity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/palach1.png");
	}
}
