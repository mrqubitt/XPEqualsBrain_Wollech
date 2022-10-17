package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

import java.util.Iterator;

public class AdvancedToLevelThreeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		XpequalsbrainModVariables.MapVariables.get(world).IQ_NAME = "K\u00F6yl\u00FC";
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		TitleActivatorProcedure.execute(world, x, y, z);
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("xpequalsbrain:villager_brain"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemainingCriteria().iterator();
				while (_iterator.hasNext())
					_player.getAdvancements().award(_adv, (String) _iterator.next());
			}
		}
	}
}
