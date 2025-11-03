package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class AK47PriVystrielieSnariadomIzPriedmietaProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("ak47", (itemstack.getOrCreateTag().getDouble("ak47") - 1));
	}
}
