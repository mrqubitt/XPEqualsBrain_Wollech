package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;
import net.mcreator.xpequalsbrain.init.XpequalsbrainModEntities;
import net.mcreator.xpequalsbrain.entity.BayrakEntity;

public class ParkourProsedureProcedure {
	public static void execute(LevelAccessor world) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new BayrakEntity(XpequalsbrainModEntities.BAYRAK.get(), _level);
			entityToSpawn.moveTo(XpequalsbrainModVariables.MapVariables.get(world).BayrakX, XpequalsbrainModVariables.MapVariables.get(world).BayrakY,
					XpequalsbrainModVariables.MapVariables.get(world).BayrakZ, 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
