
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.doz_in_maincraft.entity.BeastForest4Entity;
import net.mcreator.doz_in_maincraft.client.model.Modelfak;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BeastForest4Renderer extends MobRenderer<BeastForest4Entity, Modelfak<BeastForest4Entity>> {
	public BeastForest4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelfak<BeastForest4Entity>(context.bakeLayer(Modelfak.LAYER_LOCATION)), 0.6f);
		this.addLayer(new RenderLayer<BeastForest4Entity, Modelfak<BeastForest4Entity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("doz_in_maincraft:textures/entities/zvery_lesa.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BeastForest4Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BeastForest4Entity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/zvery_lesa.png");
	}
}
