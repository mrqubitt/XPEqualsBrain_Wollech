package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.xpequalsbrain.init.XpequalsbrainModItems;

public class AutoLevelUpProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof Player || entity instanceof ServerPlayer) && XpequalsbrainModItems.SMALL_XP.get() == itemstack.getItem()
				&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 25
				&& (entity instanceof Player _plr ? _plr.experienceLevel : 0) < 45) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(XpequalsbrainModItems.SMALL_XP.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			SmallXpRightclickedProcedure.execute(world, x, y, z, entity);
		}
	}
}
