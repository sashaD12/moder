
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.doz_in_maincraft.network.ReloardMessage;
import net.mcreator.doz_in_maincraft.network.ProtgasMessage;
import net.mcreator.doz_in_maincraft.network.GggMessage;
import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DozInMaincraftModKeyMappings {
	public static final KeyMapping RELOARD = new KeyMapping("key.doz_in_maincraft.reloard", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DozInMaincraftMod.PACKET_HANDLER.sendToServer(new ReloardMessage(0, 0));
				ReloardMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PROTGAS = new KeyMapping("key.doz_in_maincraft.protgas", GLFW.GLFW_KEY_N, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DozInMaincraftMod.PACKET_HANDLER.sendToServer(new ProtgasMessage(0, 0));
				ProtgasMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping GGG = new KeyMapping("key.doz_in_maincraft.ggg", GLFW.GLFW_KEY_U, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DozInMaincraftMod.PACKET_HANDLER.sendToServer(new GggMessage(0, 0));
				GggMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(RELOARD);
		event.register(PROTGAS);
		event.register(GGG);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				RELOARD.consumeClick();
				PROTGAS.consumeClick();
				GGG.consumeClick();
			}
		}
	}
}
