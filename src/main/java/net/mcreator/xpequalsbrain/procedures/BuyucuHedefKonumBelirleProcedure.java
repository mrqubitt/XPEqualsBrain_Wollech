package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

public class BuyucuHedefKonumBelirleProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		XpequalsbrainModVariables.MapVariables.get(world).BuyucuHedefKonumX = entity.getX();
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		XpequalsbrainModVariables.MapVariables.get(world).BuyucuHedefKonumY = entity.getY();
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		XpequalsbrainModVariables.MapVariables.get(world).BuyucuHedefKonumZ = entity.getZ();
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
	}
}
