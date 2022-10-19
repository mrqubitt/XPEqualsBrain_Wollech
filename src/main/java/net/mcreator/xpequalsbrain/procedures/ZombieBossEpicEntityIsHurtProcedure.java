package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class ZombieBossEpicEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (10); index0++) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ENTITY_EFFECT, x, y, z, 10, 0.1, 2, 0.1, Math.random());
		}
	}
}
