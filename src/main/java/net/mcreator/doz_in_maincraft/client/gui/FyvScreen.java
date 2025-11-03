package net.mcreator.doz_in_maincraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.doz_in_maincraft.world.inventory.FyvMenu;
import net.mcreator.doz_in_maincraft.procedures.A9Procedure;
import net.mcreator.doz_in_maincraft.procedures.A8Procedure;
import net.mcreator.doz_in_maincraft.procedures.A7Procedure;
import net.mcreator.doz_in_maincraft.procedures.A6Procedure;
import net.mcreator.doz_in_maincraft.procedures.A5Procedure;
import net.mcreator.doz_in_maincraft.procedures.A4Procedure;
import net.mcreator.doz_in_maincraft.procedures.A3Procedure;
import net.mcreator.doz_in_maincraft.procedures.A2Procedure;
import net.mcreator.doz_in_maincraft.procedures.A1Procedure;
import net.mcreator.doz_in_maincraft.procedures.A18Procedure;
import net.mcreator.doz_in_maincraft.procedures.A17Procedure;
import net.mcreator.doz_in_maincraft.procedures.A16Procedure;
import net.mcreator.doz_in_maincraft.procedures.A15Procedure;
import net.mcreator.doz_in_maincraft.procedures.A14Procedure;
import net.mcreator.doz_in_maincraft.procedures.A13Procedure;
import net.mcreator.doz_in_maincraft.procedures.A12Procedure;
import net.mcreator.doz_in_maincraft.procedures.A11Procedure;
import net.mcreator.doz_in_maincraft.procedures.A10Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FyvScreen extends AbstractContainerScreen<FyvMenu> {
	private final static HashMap<String, Object> guistate = FyvMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FyvScreen(FyvMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("doz_in_maincraft:textures/screens/fyv.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/safs.png"), this.leftPos + -2, this.topPos + -2, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/safs.png"), this.leftPos + 162, this.topPos + -2, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/safs.png"), this.leftPos + -2, this.topPos + 71, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/safs.png"), this.leftPos + 161, this.topPos + 71, 0, 0, 16, 16, 16, 16);

		if (A1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/addaa.png"), this.leftPos + 54, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a1.png"), this.leftPos + 55, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a2.png"), this.leftPos + 55, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a3.png"), this.leftPos + 54, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a4.png"), this.leftPos + 54, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a5.png"), this.leftPos + 54, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a6.png"), this.leftPos + 55, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a7.png"), this.leftPos + 55, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a8.png"), this.leftPos + 55, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a9.png"), this.leftPos + 54, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A11Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a10.png"), this.leftPos + 54, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A12Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a11.png"), this.leftPos + 54, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A13Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a12.png"), this.leftPos + 55, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A14Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a13.png"), this.leftPos + 54, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A15Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a14.png"), this.leftPos + 54, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A16Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a15.png"), this.leftPos + 54, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A17Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a16.png"), this.leftPos + 55, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		if (A18Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/a17.png"), this.leftPos + 54, this.topPos + 60, 0, 0, 64, 5, 64, 5);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.doz_in_maincraft.fyv.label_auto_miner"), 60, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
