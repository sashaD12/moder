package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class ScarHPriVystrielieSnariadomIzPriedmietaProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("scarh", (itemstack.getOrCreateTag().getDouble("scarh") - 1));
	}
}
