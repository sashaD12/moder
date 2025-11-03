
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.BrigadierGhulEntity;
import net.mcreator.doz_in_maincraft.client.model.Modelgul1;

public class BrigadierGhulRenderer extends MobRenderer<BrigadierGhulEntity, Modelgul1<BrigadierGhulEntity>> {
	public BrigadierGhulRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgul1<BrigadierGhulEntity>(context.bakeLayer(Modelgul1.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BrigadierGhulEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/gul.png");
	}
}
