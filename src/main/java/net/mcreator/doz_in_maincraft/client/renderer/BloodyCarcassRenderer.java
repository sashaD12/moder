
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.doz_in_maincraft.entity.BloodyCarcassEntity;
import net.mcreator.doz_in_maincraft.client.model.Modeltuha;

import com.mojang.blaze3d.vertex.PoseStack;

public class BloodyCarcassRenderer extends MobRenderer<BloodyCarcassEntity, Modeltuha<BloodyCarcassEntity>> {
	public BloodyCarcassRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltuha<BloodyCarcassEntity>(context.bakeLayer(Modeltuha.LAYER_LOCATION)), 1f);
	}

	@Override
	protected void scale(BloodyCarcassEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.02f, 1.02f, 1.02f);
	}

	@Override
	public ResourceLocation getTextureLocation(BloodyCarcassEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/tusha.png");
	}
}
