package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

public class RoketCommandProcedure {
	public static void execute(LevelAccessor world) {
		XpequalsbrainModVariables.MapVariables.get(world).RoketIsFlying = true;
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
	}
}
