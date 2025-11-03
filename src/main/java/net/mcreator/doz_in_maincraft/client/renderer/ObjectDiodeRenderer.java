
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.ObjectDiodeEntity;
import net.mcreator.doz_in_maincraft.client.model.Modeltuha;

public class ObjectDiodeRenderer extends MobRenderer<ObjectDiodeEntity, Modeltuha<ObjectDiodeEntity>> {
	public ObjectDiodeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltuha<ObjectDiodeEntity>(context.bakeLayer(Modeltuha.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(ObjectDiodeEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/ifi.png");
	}
}
