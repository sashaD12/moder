package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModItems;
import net.mcreator.doz_in_maincraft.init.DozInMaincraftModEntities;

public class BoxForestersNaBlokieNazhataPravaiaKnopkaMyshiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DozInMaincraftModItems.PICKLOCK.get()) {
			if (Math.random() < 0.25) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(DozInMaincraftModItems.LOAD_FORESTERS.get()));
					entityToSpawn.setPickUpDelay(20);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = DozInMaincraftModEntities.FORESTER_HUNTER.get().spawn(_level, BlockPos.containing(x + 2, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = DozInMaincraftModEntities.FORESTER_HUNTER.get().spawn(_level, BlockPos.containing(x, y, z + 2), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = DozInMaincraftModEntities.FORESTER_HUNTER.get().spawn(_level, BlockPos.containing(x - 2, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = DozInMaincraftModEntities.FORESTER_HUNTER.get().spawn(_level, BlockPos.containing(x, y, z - 2), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(DozInMaincraftModItems.PICKLOCK.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			} else {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(DozInMaincraftModItems.PICKLOCK.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
