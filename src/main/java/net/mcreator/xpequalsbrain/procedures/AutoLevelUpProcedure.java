package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.xpequalsbrain.init.XpequalsbrainModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AutoLevelUpProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(),
				event.getItem().getItem());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		execute(null, world, x, y, z, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
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
