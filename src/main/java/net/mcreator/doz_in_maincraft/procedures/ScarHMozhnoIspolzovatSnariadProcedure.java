package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class ScarHMozhnoIspolzovatSnariadProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("scarh") != 0;
	}
}
