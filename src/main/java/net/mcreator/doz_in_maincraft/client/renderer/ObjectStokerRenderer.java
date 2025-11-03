
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.ObjectStokerEntity;
import net.mcreator.doz_in_maincraft.client.model.Modelpalach;

public class ObjectStokerRenderer extends MobRenderer<ObjectStokerEntity, Modelpalach<ObjectStokerEntity>> {
	public ObjectStokerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpalach<ObjectStokerEntity>(context.bakeLayer(Modelpalach.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(ObjectStokerEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/palach1.png");
	}
}
