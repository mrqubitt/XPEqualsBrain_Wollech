package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

public class BayrakPlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.GENERIC, 100);
		XpequalsbrainModVariables.MapVariables.get(world).BayrakAlindi = true;
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EFFECT, x, y, z, 50, 1, 2, 1, 0.1);
	}
}
