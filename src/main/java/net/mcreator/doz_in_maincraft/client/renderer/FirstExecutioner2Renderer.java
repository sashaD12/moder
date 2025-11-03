
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.FirstExecutioner2Entity;
import net.mcreator.doz_in_maincraft.client.model.Modelpalach;

public class FirstExecutioner2Renderer extends MobRenderer<FirstExecutioner2Entity, Modelpalach<FirstExecutioner2Entity>> {
	public FirstExecutioner2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelpalach<FirstExecutioner2Entity>(context.bakeLayer(Modelpalach.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FirstExecutioner2Entity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/palach1.png");
	}
}
