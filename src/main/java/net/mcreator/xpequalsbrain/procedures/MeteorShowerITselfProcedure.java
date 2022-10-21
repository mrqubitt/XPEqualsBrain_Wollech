package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;
import net.mcreator.xpequalsbrain.init.XpequalsbrainModEntities;
import net.mcreator.xpequalsbrain.entity.FireballEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MeteorShowerITselfProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getY(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double y, Entity entity) {
		execute(null, world, y, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		double Hedefx = 0;
		double HedefZ = 0;
		if (XpequalsbrainModVariables.MapVariables.get(world).meteorshower) {
			if (0.75 < 1 * Math.random()) {
				Hedefx = entity.getX() + 100 * Math.random();
				HedefZ = entity.getZ() + 100 * Math.random();
			} else if (0.5 < 1 * Math.random()) {
				Hedefx = entity.getX() + 100 * Math.random();
				HedefZ = entity.getZ() - 100 * Math.random();
			} else if (0.25 < 1 * Math.random()) {
				Hedefx = entity.getX() - 100 * Math.random();
				HedefZ = entity.getZ() - 100 * Math.random();
			} else {
				Hedefx = entity.getX() - 100 * Math.random();
				HedefZ = entity.getZ() + 100 * Math.random();
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new FireballEntity(XpequalsbrainModEntities.FIREBALL.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setSecondsOnFire(100);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos(Hedefx, (y + 200), HedefZ);
				_entityToSpawn.shoot(Math.random(), 1, Math.random(), (float) (10 * Math.random()), 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
