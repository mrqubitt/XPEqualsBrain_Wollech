package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class KotuBuyucuEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.DRAGON_BREATH, x, y, z, 200, 3, 3, 3, 1);
	}
}
