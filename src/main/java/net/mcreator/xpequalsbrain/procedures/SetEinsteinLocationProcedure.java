package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

public class SetEinsteinLocationProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		XpequalsbrainModVariables.MapVariables.get(world).EinsteinLocationX = entity.getX();
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		XpequalsbrainModVariables.MapVariables.get(world).EinsteinLocationY = entity.getY();
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		XpequalsbrainModVariables.MapVariables.get(world).EinsteinLocationZ = entity.getZ();
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
	}
}
