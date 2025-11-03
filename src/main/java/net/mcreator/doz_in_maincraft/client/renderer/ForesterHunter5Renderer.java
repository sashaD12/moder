
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.ForesterHunter5Entity;
import net.mcreator.doz_in_maincraft.client.model.Modellesovik4;

public class ForesterHunter5Renderer extends MobRenderer<ForesterHunter5Entity, Modellesovik4<ForesterHunter5Entity>> {
	public ForesterHunter5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modellesovik4<ForesterHunter5Entity>(context.bakeLayer(Modellesovik4.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ForesterHunter5Entity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/1.png");
	}
}
