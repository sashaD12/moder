package net.mcreator.doz_in_maincraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.doz_in_maincraft.world.inventory.DsdMenu;
import net.mcreator.doz_in_maincraft.procedures.TekProcedure;
import net.mcreator.doz_in_maincraft.network.DsdButtonMessage;
import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DsdScreen extends AbstractContainerScreen<DsdMenu> {
	private final static HashMap<String, Object> guistate = DsdMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_up;
	ImageButton imagebutton_down;

	public DsdScreen(DsdMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("doz_in_maincraft:textures/screens/dsd.png");

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

		guiGraphics.blit(new ResourceLocation("doz_in_maincraft:textures/screens/rrrrrrrrrrrrrrrrrrrrrr.png"), this.leftPos + 69, this.topPos + 34, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font,

				TekProcedure.execute(world, x, y, z), 141, 34, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_up = new ImageButton(this.leftPos + 141, this.topPos + 16, 16, 16, 0, 0, 16, new ResourceLocation("doz_in_maincraft:textures/screens/atlas/imagebutton_up.png"), 16, 32, e -> {
			if (true) {
				DozInMaincraftMod.PACKET_HANDLER.sendToServer(new DsdButtonMessage(0, x, y, z));
				DsdButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_up", imagebutton_up);
		this.addRenderableWidget(imagebutton_up);
		imagebutton_down = new ImageButton(this.leftPos + 141, this.topPos + 43, 16, 16, 0, 0, 16, new ResourceLocation("doz_in_maincraft:textures/screens/atlas/imagebutton_down.png"), 16, 32, e -> {
			if (true) {
				DozInMaincraftMod.PACKET_HANDLER.sendToServer(new DsdButtonMessage(1, x, y, z));
				DsdButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_down", imagebutton_down);
		this.addRenderableWidget(imagebutton_down);
	}
}
