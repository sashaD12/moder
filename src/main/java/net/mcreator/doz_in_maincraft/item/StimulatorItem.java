
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.doz_in_maincraft.procedures.StimulatorPriNazhatiiPravoiKnopkoiMyshiProcedure;
import net.mcreator.doz_in_maincraft.procedures.DdProcedure;

public class StimulatorItem extends Item {
	public StimulatorItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		StimulatorPriNazhatiiPravoiKnopkoiMyshiProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		DdProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
