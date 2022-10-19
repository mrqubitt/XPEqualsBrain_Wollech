package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerXpEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LevelBelirleyiciProcedure {
	@SubscribeEvent
	public static void onPlayerXPLevelChange(PlayerXpEvent.LevelChange event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) == 0) {
			XpequalsbrainModVariables.TalkedToVillager = 0;
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) + 1 == 1) {
			XpequalsbrainModVariables.TalkedToVillager = 0;
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
			AdvancedToLevelOneProcedure.execute(world, x, y, z, entity);
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) + 1 == 3) {
			XpequalsbrainModVariables.TalkedToVillager = 0;
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
			AdvancedToLevelTwoProcedure.execute(world, x, y, z, entity);
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) + 1 == 25) {
			XpequalsbrainModVariables.TalkedToVillager = 0;
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
			AdvancedToLevelThreeProcedure.execute(world, x, y, z, entity);
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) + 1 == 45) {
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
			AdvancedToLevelFourProcedure.execute(world, x, y, z);
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) + 1 == 55) {
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) + 1 == 57) {
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
			AdvancedToLevelFiveProcedure.execute(world, x, y, z, entity);
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) + 1 == 90) {
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
			AdvancedToLevelSixProcedure.execute(world, x, y, z, entity);
		}
	}
}
