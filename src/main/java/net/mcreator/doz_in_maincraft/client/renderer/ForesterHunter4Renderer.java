
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.ForesterHunter4Entity;
import net.mcreator.doz_in_maincraft.client.model.Modellesovik3;

public class ForesterHunter4Renderer extends MobRenderer<ForesterHunter4Entity, Modellesovik3<ForesterHunter4Entity>> {
	public ForesterHunter4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modellesovik3<ForesterHunter4Entity>(context.bakeLayer(Modellesovik3.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ForesterHunter4Entity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/2.png");
	}
}
