
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.doz_in_maincraft.world.inventory.Tier4Menu;
import net.mcreator.doz_in_maincraft.world.inventory.Tier3Menu;
import net.mcreator.doz_in_maincraft.world.inventory.Tier2Menu;
import net.mcreator.doz_in_maincraft.world.inventory.TftyfyMenu;
import net.mcreator.doz_in_maincraft.world.inventory.SfMenu;
import net.mcreator.doz_in_maincraft.world.inventory.SdssMenu;
import net.mcreator.doz_in_maincraft.world.inventory.HfMenu;
import net.mcreator.doz_in_maincraft.world.inventory.GrtMenu;
import net.mcreator.doz_in_maincraft.world.inventory.FyvMenu;
import net.mcreator.doz_in_maincraft.world.inventory.DsdMenu;
import net.mcreator.doz_in_maincraft.world.inventory.DfsMenu;
import net.mcreator.doz_in_maincraft.world.inventory.DfgMenu;
import net.mcreator.doz_in_maincraft.world.inventory.AptechkaMenu;
import net.mcreator.doz_in_maincraft.world.inventory.ApaaMenu;
import net.mcreator.doz_in_maincraft.world.inventory.AddMenu;
import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

public class DozInMaincraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DozInMaincraftMod.MODID);
	public static final RegistryObject<MenuType<DfsMenu>> DFS = REGISTRY.register("dfs", () -> IForgeMenuType.create(DfsMenu::new));
	public static final RegistryObject<MenuType<GrtMenu>> GRT = REGISTRY.register("grt", () -> IForgeMenuType.create(GrtMenu::new));
	public static final RegistryObject<MenuType<DfgMenu>> DFG = REGISTRY.register("dfg", () -> IForgeMenuType.create(DfgMenu::new));
	public static final RegistryObject<MenuType<TftyfyMenu>> TFTYFY = REGISTRY.register("tftyfy", () -> IForgeMenuType.create(TftyfyMenu::new));
	public static final RegistryObject<MenuType<Tier2Menu>> TIER_2 = REGISTRY.register("tier_2", () -> IForgeMenuType.create(Tier2Menu::new));
	public static final RegistryObject<MenuType<Tier3Menu>> TIER_3 = REGISTRY.register("tier_3", () -> IForgeMenuType.create(Tier3Menu::new));
	public static final RegistryObject<MenuType<Tier4Menu>> TIER_4 = REGISTRY.register("tier_4", () -> IForgeMenuType.create(Tier4Menu::new));
	public static final RegistryObject<MenuType<SdssMenu>> SDSS = REGISTRY.register("sdss", () -> IForgeMenuType.create(SdssMenu::new));
	public static final RegistryObject<MenuType<AddMenu>> ADD = REGISTRY.register("add", () -> IForgeMenuType.create(AddMenu::new));
	public static final RegistryObject<MenuType<DsdMenu>> DSD = REGISTRY.register("dsd", () -> IForgeMenuType.create(DsdMenu::new));
	public static final RegistryObject<MenuType<HfMenu>> HF = REGISTRY.register("hf", () -> IForgeMenuType.create(HfMenu::new));
	public static final RegistryObject<MenuType<FyvMenu>> FYV = REGISTRY.register("fyv", () -> IForgeMenuType.create(FyvMenu::new));
	public static final RegistryObject<MenuType<ApaaMenu>> APAA = REGISTRY.register("apaa", () -> IForgeMenuType.create(ApaaMenu::new));
	public static final RegistryObject<MenuType<SfMenu>> SF = REGISTRY.register("sf", () -> IForgeMenuType.create(SfMenu::new));
	public static final RegistryObject<MenuType<AptechkaMenu>> APTECHKA = REGISTRY.register("aptechka", () -> IForgeMenuType.create(AptechkaMenu::new));
}
