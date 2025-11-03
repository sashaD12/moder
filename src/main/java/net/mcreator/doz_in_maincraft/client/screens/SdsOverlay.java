
package net.mcreator.doz_in_maincraft.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.doz_in_maincraft.procedures.SdsUsloviiePokazaNalozhieniiaProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SdsOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (SdsUsloviiePokazaNalozhieniiaProcedure.execute()) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.doz_in_maincraft.sds.label_stop_increased_danger"), w / 2 + -46, h / 2 + -73, -13434880, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.doz_in_maincraft.sds.label_warning"), w / 2 + -19, h / 2 + -62, -16777165, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.doz_in_maincraft.sds.label_the_institute_is_not_responsible"), w / 2 + -145, h / 2 + -49, -13434880, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.doz_in_maincraft.sds.label_warning1"), w / 2 + -19, h / 2 + -38, -16777165, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.doz_in_maincraft.sds.label_the_institute_is_not_responsible1"), w / 2 + -145, h / 2 + -19, -13434880, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.doz_in_maincraft.sds.label_stop_increased_danger1"), w / 2 + -45, h / 2 + -5, -13434880, false);
		}
	}
}
