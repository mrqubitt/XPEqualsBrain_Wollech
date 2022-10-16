package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerXpEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LevelBelirleyiciProcedure {
	@SubscribeEvent
	public static void onPlayerXPLevelChange(PlayerXpEvent.LevelChange event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) == 0) {
			XpequalsbrainModVariables.TalkedToVillager = 0;
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) == 1) {
			XpequalsbrainModVariables.TalkedToVillager = 0;
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) == 3) {
			XpequalsbrainModVariables.TalkedToVillager = 0;
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
		} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) == 25) {
			XpequalsbrainModVariables.TalkedToVillager = 0;
			XpequalsbrainModVariables.PlayerLevel = entity instanceof Player _plr ? _plr.experienceLevel : 0;
		}
	}
}
