
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.ForesterHunterEntity;
import net.mcreator.doz_in_maincraft.client.model.Modellesovik1;

public class ForesterHunterRenderer extends MobRenderer<ForesterHunterEntity, Modellesovik1<ForesterHunterEntity>> {
	public ForesterHunterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellesovik1<ForesterHunterEntity>(context.bakeLayer(Modellesovik1.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(ForesterHunterEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/luchnik.png");
	}
}
