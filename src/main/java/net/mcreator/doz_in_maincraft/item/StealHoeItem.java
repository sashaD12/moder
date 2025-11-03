
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModItems;

public class StealHoeItem extends HoeItem {
	public StealHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 802;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 32;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DozInMaincraftModItems.STEAL_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
