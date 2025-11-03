
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.doz_in_maincraft.block.WeaponWorkbenchBlock;
import net.mcreator.doz_in_maincraft.block.TinOreBlock;
import net.mcreator.doz_in_maincraft.block.TinBlockBlock;
import net.mcreator.doz_in_maincraft.block.StocerBlock;
import net.mcreator.doz_in_maincraft.block.StealBlockBlock;
import net.mcreator.doz_in_maincraft.block.SedlingMagicPineBlock;
import net.mcreator.doz_in_maincraft.block.SdddBlock;
import net.mcreator.doz_in_maincraft.block.RefuelingInstallationBlock;
import net.mcreator.doz_in_maincraft.block.Polka4Block;
import net.mcreator.doz_in_maincraft.block.Polka3Block;
import net.mcreator.doz_in_maincraft.block.Polka2Block;
import net.mcreator.doz_in_maincraft.block.Polka1Block;
import net.mcreator.doz_in_maincraft.block.PileCastIronBlock;
import net.mcreator.doz_in_maincraft.block.PalachPRBlock;
import net.mcreator.doz_in_maincraft.block.NezeriteOreBlock;
import net.mcreator.doz_in_maincraft.block.MoltenSteelBlock;
import net.mcreator.doz_in_maincraft.block.MetalFormingMachineBlock;
import net.mcreator.doz_in_maincraft.block.MagicPineWoodBlock;
import net.mcreator.doz_in_maincraft.block.MagicPineStairsBlock;
import net.mcreator.doz_in_maincraft.block.MagicPineSlabBlock;
import net.mcreator.doz_in_maincraft.block.MagicPinePressurePlateBlock;
import net.mcreator.doz_in_maincraft.block.MagicPinePlanksBlock;
import net.mcreator.doz_in_maincraft.block.MagicPineLogBlock;
import net.mcreator.doz_in_maincraft.block.MagicPineLeavesBlock;
import net.mcreator.doz_in_maincraft.block.MagicPineFenceGateBlock;
import net.mcreator.doz_in_maincraft.block.MagicPineFenceBlock;
import net.mcreator.doz_in_maincraft.block.MagicPineButtonBlock;
import net.mcreator.doz_in_maincraft.block.LeadOreBlock;
import net.mcreator.doz_in_maincraft.block.LeadBlockBlock;
import net.mcreator.doz_in_maincraft.block.LampBlock;
import net.mcreator.doz_in_maincraft.block.HozmagBrickBlock;
import net.mcreator.doz_in_maincraft.block.ForestRootsBlock;
import net.mcreator.doz_in_maincraft.block.FirstAidKitOppenBlock;
import net.mcreator.doz_in_maincraft.block.FirstAidKitBlock;
import net.mcreator.doz_in_maincraft.block.FLUEDGLASSBlock;
import net.mcreator.doz_in_maincraft.block.EngineeringWorkbenchBlock;
import net.mcreator.doz_in_maincraft.block.EnergyFrameworkBlock;
import net.mcreator.doz_in_maincraft.block.ElectricalAnomalyBlock;
import net.mcreator.doz_in_maincraft.block.DarkZonePortalBlock;
import net.mcreator.doz_in_maincraft.block.DarkZoneCrystalBlock;
import net.mcreator.doz_in_maincraft.block.CrystallineWoodBlock;
import net.mcreator.doz_in_maincraft.block.CrystallineSlabBlock;
import net.mcreator.doz_in_maincraft.block.CrystallinePressurePlateBlock;
import net.mcreator.doz_in_maincraft.block.CrystallinePlanksBlock;
import net.mcreator.doz_in_maincraft.block.CrystallineLogBlock;
import net.mcreator.doz_in_maincraft.block.CrystallineLeavesBlock;
import net.mcreator.doz_in_maincraft.block.CrystallineFenceGateBlock;
import net.mcreator.doz_in_maincraft.block.CrystallineFenceBlock;
import net.mcreator.doz_in_maincraft.block.CrystallineButtonBlock;
import net.mcreator.doz_in_maincraft.block.CrystalStoneBlock;
import net.mcreator.doz_in_maincraft.block.CrystalGroundBlock;
import net.mcreator.doz_in_maincraft.block.CrystalEarthBlock;
import net.mcreator.doz_in_maincraft.block.CrystalCobblestoneBlock;
import net.mcreator.doz_in_maincraft.block.CreativeCellBlock;
import net.mcreator.doz_in_maincraft.block.CopperOreBlock;
import net.mcreator.doz_in_maincraft.block.CopperBlockBlock;
import net.mcreator.doz_in_maincraft.block.ChugunnBlockBlock;
import net.mcreator.doz_in_maincraft.block.BurntBloodyHoleBlock;
import net.mcreator.doz_in_maincraft.block.BurntBloodHoleBlockBlock;
import net.mcreator.doz_in_maincraft.block.BoxLevel4Block;
import net.mcreator.doz_in_maincraft.block.BoxLevel3Block;
import net.mcreator.doz_in_maincraft.block.BoxLevel2Block;
import net.mcreator.doz_in_maincraft.block.BoxForestersOpenBlock;
import net.mcreator.doz_in_maincraft.block.BoxForestersBlock;
import net.mcreator.doz_in_maincraft.block.BloodyMossBlock;
import net.mcreator.doz_in_maincraft.block.BloodyHoleBlock;
import net.mcreator.doz_in_maincraft.block.BloodHoleBlockBlock;
import net.mcreator.doz_in_maincraft.block.BetBlock;
import net.mcreator.doz_in_maincraft.block.BeastSummonBlockBlock;
import net.mcreator.doz_in_maincraft.block.AutoMinerBlock;
import net.mcreator.doz_in_maincraft.block.ArmorersWorkbenchBlock;
import net.mcreator.doz_in_maincraft.block.ArcFurnaceBlock;
import net.mcreator.doz_in_maincraft.block.AmmunitionPressBlock;
import net.mcreator.doz_in_maincraft.block.AluminumOreBlock;
import net.mcreator.doz_in_maincraft.block.AluminumBlockBlock;
import net.mcreator.doz_in_maincraft.block.AirdropOpenBlock;
import net.mcreator.doz_in_maincraft.block.AirdropBlock;
import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

public class DozInMaincraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DozInMaincraftMod.MODID);
	public static final RegistryObject<Block> FLUEDGLASS = REGISTRY.register("fluedglass", () -> new FLUEDGLASSBlock());
	public static final RegistryObject<Block> MAGIC_PINE_WOOD = REGISTRY.register("magic_pine_wood", () -> new MagicPineWoodBlock());
	public static final RegistryObject<Block> MAGIC_PINE_LOG = REGISTRY.register("magic_pine_log", () -> new MagicPineLogBlock());
	public static final RegistryObject<Block> MAGIC_PINE_PLANKS = REGISTRY.register("magic_pine_planks", () -> new MagicPinePlanksBlock());
	public static final RegistryObject<Block> MAGIC_PINE_LEAVES = REGISTRY.register("magic_pine_leaves", () -> new MagicPineLeavesBlock());
	public static final RegistryObject<Block> MAGIC_PINE_STAIRS = REGISTRY.register("magic_pine_stairs", () -> new MagicPineStairsBlock());
	public static final RegistryObject<Block> MAGIC_PINE_SLAB = REGISTRY.register("magic_pine_slab", () -> new MagicPineSlabBlock());
	public static final RegistryObject<Block> MAGIC_PINE_FENCE = REGISTRY.register("magic_pine_fence", () -> new MagicPineFenceBlock());
	public static final RegistryObject<Block> MAGIC_PINE_FENCE_GATE = REGISTRY.register("magic_pine_fence_gate", () -> new MagicPineFenceGateBlock());
	public static final RegistryObject<Block> MAGIC_PINE_PRESSURE_PLATE = REGISTRY.register("magic_pine_pressure_plate", () -> new MagicPinePressurePlateBlock());
	public static final RegistryObject<Block> MAGIC_PINE_BUTTON = REGISTRY.register("magic_pine_button", () -> new MagicPineButtonBlock());
	public static final RegistryObject<Block> SEDLING_MAGIC_PINE = REGISTRY.register("sedling_magic_pine", () -> new SedlingMagicPineBlock());
	public static final RegistryObject<Block> SDDD = REGISTRY.register("sddd", () -> new SdddBlock());
	public static final RegistryObject<Block> BOX_FORESTERS = REGISTRY.register("box_foresters", () -> new BoxForestersBlock());
	public static final RegistryObject<Block> FOREST_ROOTS = REGISTRY.register("forest_roots", () -> new ForestRootsBlock());
	public static final RegistryObject<Block> COPPER_ORE = REGISTRY.register("copper_ore", () -> new CopperOreBlock());
	public static final RegistryObject<Block> COPPER_BLOCK = REGISTRY.register("copper_block", () -> new CopperBlockBlock());
	public static final RegistryObject<Block> ALUMINUM_ORE = REGISTRY.register("aluminum_ore", () -> new AluminumOreBlock());
	public static final RegistryObject<Block> ALUMINUM_BLOCK = REGISTRY.register("aluminum_block", () -> new AluminumBlockBlock());
	public static final RegistryObject<Block> LEAD_ORE = REGISTRY.register("lead_ore", () -> new LeadOreBlock());
	public static final RegistryObject<Block> LEAD_BLOCK = REGISTRY.register("lead_block", () -> new LeadBlockBlock());
	public static final RegistryObject<Block> BOX_FORESTERS_OPEN = REGISTRY.register("box_foresters_open", () -> new BoxForestersOpenBlock());
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final RegistryObject<Block> STEAL_BLOCK = REGISTRY.register("steal_block", () -> new StealBlockBlock());
	public static final RegistryObject<Block> MOLTEN_STEEL = REGISTRY.register("molten_steel", () -> new MoltenSteelBlock());
	public static final RegistryObject<Block> ARC_FURNACE = REGISTRY.register("arc_furnace", () -> new ArcFurnaceBlock());
	public static final RegistryObject<Block> NEZERITE_ORE = REGISTRY.register("nezerite_ore", () -> new NezeriteOreBlock());
	public static final RegistryObject<Block> METAL_FORMING_MACHINE = REGISTRY.register("metal_forming_machine", () -> new MetalFormingMachineBlock());
	public static final RegistryObject<Block> BEAST_SUMMON_BLOCK = REGISTRY.register("beast_summon_block", () -> new BeastSummonBlockBlock());
	public static final RegistryObject<Block> HOZMAG_BRICK = REGISTRY.register("hozmag_brick", () -> new HozmagBrickBlock());
	public static final RegistryObject<Block> BURNT_BLOOD_HOLE_BLOCK = REGISTRY.register("burnt_blood_hole_block", () -> new BurntBloodHoleBlockBlock());
	public static final RegistryObject<Block> BLOOD_HOLE_BLOCK = REGISTRY.register("blood_hole_block", () -> new BloodHoleBlockBlock());
	public static final RegistryObject<Block> BURNT_BLOODY_HOLE = REGISTRY.register("burnt_bloody_hole", () -> new BurntBloodyHoleBlock());
	public static final RegistryObject<Block> BLOODY_HOLE = REGISTRY.register("bloody_hole", () -> new BloodyHoleBlock());
	public static final RegistryObject<Block> PALACH_PR = REGISTRY.register("palach_pr", () -> new PalachPRBlock());
	public static final RegistryObject<Block> BOX_LEVEL_2 = REGISTRY.register("box_level_2", () -> new BoxLevel2Block());
	public static final RegistryObject<Block> BOX_LEVEL_3 = REGISTRY.register("box_level_3", () -> new BoxLevel3Block());
	public static final RegistryObject<Block> BOX_LEVEL_4 = REGISTRY.register("box_level_4", () -> new BoxLevel4Block());
	public static final RegistryObject<Block> POLKA_1 = REGISTRY.register("polka_1", () -> new Polka1Block());
	public static final RegistryObject<Block> POLKA_2 = REGISTRY.register("polka_2", () -> new Polka2Block());
	public static final RegistryObject<Block> POLKA_3 = REGISTRY.register("polka_3", () -> new Polka3Block());
	public static final RegistryObject<Block> POLKA_4 = REGISTRY.register("polka_4", () -> new Polka4Block());
	public static final RegistryObject<Block> BLOODY_MOSS = REGISTRY.register("bloody_moss", () -> new BloodyMossBlock());
	public static final RegistryObject<Block> ENGINEERING_WORKBENCH = REGISTRY.register("engineering_workbench", () -> new EngineeringWorkbenchBlock());
	public static final RegistryObject<Block> WEAPON_WORKBENCH = REGISTRY.register("weapon_workbench", () -> new WeaponWorkbenchBlock());
	public static final RegistryObject<Block> CRYSTALLINE_WOOD = REGISTRY.register("crystalline_wood", () -> new CrystallineWoodBlock());
	public static final RegistryObject<Block> CRYSTALLINE_LOG = REGISTRY.register("crystalline_log", () -> new CrystallineLogBlock());
	public static final RegistryObject<Block> CRYSTALLINE_PLANKS = REGISTRY.register("crystalline_planks", () -> new CrystallinePlanksBlock());
	public static final RegistryObject<Block> CRYSTALLINE_LEAVES = REGISTRY.register("crystalline_leaves", () -> new CrystallineLeavesBlock());
	public static final RegistryObject<Block> CRYSTALLINE_SLAB = REGISTRY.register("crystalline_slab", () -> new CrystallineSlabBlock());
	public static final RegistryObject<Block> CRYSTALLINE_FENCE = REGISTRY.register("crystalline_fence", () -> new CrystallineFenceBlock());
	public static final RegistryObject<Block> CRYSTALLINE_FENCE_GATE = REGISTRY.register("crystalline_fence_gate", () -> new CrystallineFenceGateBlock());
	public static final RegistryObject<Block> CRYSTALLINE_PRESSURE_PLATE = REGISTRY.register("crystalline_pressure_plate", () -> new CrystallinePressurePlateBlock());
	public static final RegistryObject<Block> CRYSTALLINE_BUTTON = REGISTRY.register("crystalline_button", () -> new CrystallineButtonBlock());
	public static final RegistryObject<Block> CRYSTAL_GROUND = REGISTRY.register("crystal_ground", () -> new CrystalGroundBlock());
	public static final RegistryObject<Block> CRYSTAL_STONE = REGISTRY.register("crystal_stone", () -> new CrystalStoneBlock());
	public static final RegistryObject<Block> CRYSTAL_COBBLESTONE = REGISTRY.register("crystal_cobblestone", () -> new CrystalCobblestoneBlock());
	public static final RegistryObject<Block> CRYSTAL_EARTH = REGISTRY.register("crystal_earth", () -> new CrystalEarthBlock());
	public static final RegistryObject<Block> DARK_ZONE_PORTAL = REGISTRY.register("dark_zone_portal", () -> new DarkZonePortalBlock());
	public static final RegistryObject<Block> ENERGY_FRAMEWORK = REGISTRY.register("energy_framework", () -> new EnergyFrameworkBlock());
	public static final RegistryObject<Block> CREATIVE_CELL = REGISTRY.register("creative_cell", () -> new CreativeCellBlock());
	public static final RegistryObject<Block> AMMUNITION_PRESS = REGISTRY.register("ammunition_press", () -> new AmmunitionPressBlock());
	public static final RegistryObject<Block> PILE_CAST_IRON = REGISTRY.register("pile_cast_iron", () -> new PileCastIronBlock());
	public static final RegistryObject<Block> CHUGUNN_BLOCK = REGISTRY.register("chugunn_block", () -> new ChugunnBlockBlock());
	public static final RegistryObject<Block> ARMORERS_WORKBENCH = REGISTRY.register("armorers_workbench", () -> new ArmorersWorkbenchBlock());
	public static final RegistryObject<Block> STOCER = REGISTRY.register("stocer", () -> new StocerBlock());
	public static final RegistryObject<Block> AUTO_MINER = REGISTRY.register("auto_miner", () -> new AutoMinerBlock());
	public static final RegistryObject<Block> BET = REGISTRY.register("bet", () -> new BetBlock());
	public static final RegistryObject<Block> AIRDROP = REGISTRY.register("airdrop", () -> new AirdropBlock());
	public static final RegistryObject<Block> AIRDROP_OPEN = REGISTRY.register("airdrop_open", () -> new AirdropOpenBlock());
	public static final RegistryObject<Block> DARK_ZONE_CRYSTAL = REGISTRY.register("dark_zone_crystal", () -> new DarkZoneCrystalBlock());
	public static final RegistryObject<Block> LAMP = REGISTRY.register("lamp", () -> new LampBlock());
	public static final RegistryObject<Block> REFUELING_INSTALLATION = REGISTRY.register("refueling_installation", () -> new RefuelingInstallationBlock());
	public static final RegistryObject<Block> FIRST_AID_KIT = REGISTRY.register("first_aid_kit", () -> new FirstAidKitBlock());
	public static final RegistryObject<Block> ELECTRICAL_ANOMALY = REGISTRY.register("electrical_anomaly", () -> new ElectricalAnomalyBlock());
	public static final RegistryObject<Block> FIRST_AID_KIT_OPPEN = REGISTRY.register("first_aid_kit_oppen", () -> new FirstAidKitOppenBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			DarkZoneCrystalBlock.blockColorLoad(event);
		}
	}
}
