package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class OneIqInventoryDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) == 0) {
			return true;
		}
		return false;
	}
}
