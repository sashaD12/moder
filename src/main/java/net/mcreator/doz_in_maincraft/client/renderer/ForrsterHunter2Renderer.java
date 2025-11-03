
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.ForrsterHunter2Entity;
import net.mcreator.doz_in_maincraft.client.model.Modellesovik;

public class ForrsterHunter2Renderer extends MobRenderer<ForrsterHunter2Entity, Modellesovik<ForrsterHunter2Entity>> {
	public ForrsterHunter2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modellesovik<ForrsterHunter2Entity>(context.bakeLayer(Modellesovik.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ForrsterHunter2Entity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/luchnik.png");
	}
}
