
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.doz_in_maincraft.client.gui.Tier4Screen;
import net.mcreator.doz_in_maincraft.client.gui.Tier3Screen;
import net.mcreator.doz_in_maincraft.client.gui.Tier2Screen;
import net.mcreator.doz_in_maincraft.client.gui.TftyfyScreen;
import net.mcreator.doz_in_maincraft.client.gui.SfScreen;
import net.mcreator.doz_in_maincraft.client.gui.SdssScreen;
import net.mcreator.doz_in_maincraft.client.gui.HfScreen;
import net.mcreator.doz_in_maincraft.client.gui.GrtScreen;
import net.mcreator.doz_in_maincraft.client.gui.FyvScreen;
import net.mcreator.doz_in_maincraft.client.gui.DsdScreen;
import net.mcreator.doz_in_maincraft.client.gui.DfsScreen;
import net.mcreator.doz_in_maincraft.client.gui.DfgScreen;
import net.mcreator.doz_in_maincraft.client.gui.ApaaScreen;
import net.mcreator.doz_in_maincraft.client.gui.AddScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DozInMaincraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DozInMaincraftModMenus.DFS.get(), DfsScreen::new);
			MenuScreens.register(DozInMaincraftModMenus.GRT.get(), GrtScreen::new);
			MenuScreens.register(DozInMaincraftModMenus.DFG.get(), DfgScreen::new);
			MenuScreens.register(DozInMaincraftModMenus.TFTYFY.get(), TftyfyScreen::new);
			MenuScreens.register(DozInMaincraftModMenus.TIER_2.get(), Tier2Screen::new);
			MenuScreens.register(DozInMaincraftModMenus.TIER_3.get(), Tier3Screen::new);
			MenuScreens.register(DozInMaincraftModMenus.TIER_4.get(), Tier4Screen::new);
			MenuScreens.register(DozInMaincraftModMenus.SDSS.get(), SdssScreen::new);
			MenuScreens.register(DozInMaincraftModMenus.ADD.get(), AddScreen::new);
			MenuScreens.register(DozInMaincraftModMenus.DSD.get(), DsdScreen::new);
			MenuScreens.register(DozInMaincraftModMenus.HF.get(), HfScreen::new);
			MenuScreens.register(DozInMaincraftModMenus.FYV.get(), FyvScreen::new);
			MenuScreens.register(DozInMaincraftModMenus.APAA.get(), ApaaScreen::new);
			MenuScreens.register(DozInMaincraftModMenus.SF.get(), SfScreen::new);
		});
	}
}
