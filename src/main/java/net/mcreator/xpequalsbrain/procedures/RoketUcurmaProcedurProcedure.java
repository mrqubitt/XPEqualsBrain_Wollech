package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;
import net.mcreator.xpequalsbrain.entity.RoketEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RoketUcurmaProcedurProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Entity MyEntity = null;
		if (entity instanceof ServerPlayer) {
			if (XpequalsbrainModVariables.BeeMissionStarted && (entity.getVehicle()) instanceof RoketEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3(0, 0.6, 0));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, ((entity.getVehicle()).getX()), ((entity.getVehicle()).getY()),
							((entity.getVehicle()).getZ()), 50, 0.5, 1, 0.5, 1.5);
			}
		}
	}
}
