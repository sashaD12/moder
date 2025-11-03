
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.doz_in_maincraft.block.entity.WeaponWorkbenchBlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.MetalFormingMachineBlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.EngineeringWorkbenchBlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.CreativeCellBlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.BurntBloodyHoleBlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.BoxLevel4BlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.BoxLevel3BlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.BoxLevel2BlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.BoxForestersOpenBlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.AutoMinerBlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.ArmorersWorkbenchBlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.ArcFurnaceBlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.AmmunitionPressBlockEntity;
import net.mcreator.doz_in_maincraft.block.entity.AirdropOpenBlockEntity;
import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

public class DozInMaincraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DozInMaincraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BOX_FORESTERS_OPEN = register("box_foresters_open", DozInMaincraftModBlocks.BOX_FORESTERS_OPEN, BoxForestersOpenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ARC_FURNACE = register("arc_furnace", DozInMaincraftModBlocks.ARC_FURNACE, ArcFurnaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_FORMING_MACHINE = register("metal_forming_machine", DozInMaincraftModBlocks.METAL_FORMING_MACHINE, MetalFormingMachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BURNT_BLOODY_HOLE = register("burnt_bloody_hole", DozInMaincraftModBlocks.BURNT_BLOODY_HOLE, BurntBloodyHoleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOX_LEVEL_2 = register("box_level_2", DozInMaincraftModBlocks.BOX_LEVEL_2, BoxLevel2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOX_LEVEL_3 = register("box_level_3", DozInMaincraftModBlocks.BOX_LEVEL_3, BoxLevel3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOX_LEVEL_4 = register("box_level_4", DozInMaincraftModBlocks.BOX_LEVEL_4, BoxLevel4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENGINEERING_WORKBENCH = register("engineering_workbench", DozInMaincraftModBlocks.ENGINEERING_WORKBENCH, EngineeringWorkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WEAPON_WORKBENCH = register("weapon_workbench", DozInMaincraftModBlocks.WEAPON_WORKBENCH, WeaponWorkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CREATIVE_CELL = register("creative_cell", DozInMaincraftModBlocks.CREATIVE_CELL, CreativeCellBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AMMUNITION_PRESS = register("ammunition_press", DozInMaincraftModBlocks.AMMUNITION_PRESS, AmmunitionPressBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ARMORERS_WORKBENCH = register("armorers_workbench", DozInMaincraftModBlocks.ARMORERS_WORKBENCH, ArmorersWorkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AUTO_MINER = register("auto_miner", DozInMaincraftModBlocks.AUTO_MINER, AutoMinerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AIRDROP_OPEN = register("airdrop_open", DozInMaincraftModBlocks.AIRDROP_OPEN, AirdropOpenBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
