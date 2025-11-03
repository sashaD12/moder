
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Ak47ammoItem extends Item {
	public Ak47ammoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
