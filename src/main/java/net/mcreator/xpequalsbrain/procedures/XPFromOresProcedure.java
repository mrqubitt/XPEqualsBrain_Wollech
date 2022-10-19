package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.xpequalsbrain.init.XpequalsbrainModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class XPFromOresProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player || entity instanceof ServerPlayer) && 25 <= (entity instanceof Player _plr ? _plr.experienceLevel : 0)
				&& 45 > (entity instanceof Player _plr ? _plr.experienceLevel : 0)
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getItem() == XpequalsbrainModItems.AUTO_SMELT_PICKAXE.get()) {
			SmallXpRightclickedProcedure.execute(world, x, y, z, entity);
		}
	}
}
