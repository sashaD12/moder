
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.ForresterHunter3Entity;
import net.mcreator.doz_in_maincraft.client.model.Modellesovik2;

public class ForresterHunter3Renderer extends MobRenderer<ForresterHunter3Entity, Modellesovik2<ForresterHunter3Entity>> {
	public ForresterHunter3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modellesovik2<ForresterHunter3Entity>(context.bakeLayer(Modellesovik2.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ForresterHunter3Entity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/2.png");
	}
}
