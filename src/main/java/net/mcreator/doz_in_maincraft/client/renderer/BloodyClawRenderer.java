
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.doz_in_maincraft.entity.BloodyClawEntity;
import net.mcreator.doz_in_maincraft.client.model.Modelkogot;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BloodyClawRenderer extends MobRenderer<BloodyClawEntity, Modelkogot<BloodyClawEntity>> {
	public BloodyClawRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkogot<BloodyClawEntity>(context.bakeLayer(Modelkogot.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BloodyClawEntity, Modelkogot<BloodyClawEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("doz_in_maincraft:textures/entities/kogot.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BloodyClawEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BloodyClawEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/kogot.png");
	}
}
