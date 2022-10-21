package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

public class BayrakKonumuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		XpequalsbrainModVariables.MapVariables.get(world).BayrakX = x;
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		XpequalsbrainModVariables.MapVariables.get(world).BayrakY = y;
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		XpequalsbrainModVariables.MapVariables.get(world).BayrakZ = z;
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
	}
}
