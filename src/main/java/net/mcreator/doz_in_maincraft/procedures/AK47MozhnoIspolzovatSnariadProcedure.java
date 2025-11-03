package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class AK47MozhnoIspolzovatSnariadProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("ak47") != 0;
	}
}
