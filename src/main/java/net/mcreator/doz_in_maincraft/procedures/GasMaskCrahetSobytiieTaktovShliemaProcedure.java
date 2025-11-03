package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModItems;

public class GasMaskCrahetSobytiieTaktovShliemaProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), (float) 0.5);
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(DozInMaincraftModItems.GAS_FILTER.get())) : false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(DozInMaincraftModItems.GAS_FILTER.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(DozInMaincraftModItems.GAS_MASK_CRAHET_HELMET.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(4, new ItemStack(DozInMaincraftModItems.GAS_MASK_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, 4), new ItemStack(DozInMaincraftModItems.GAS_MASK_HELMET.get()));
				}
			}
		}
	}
}
