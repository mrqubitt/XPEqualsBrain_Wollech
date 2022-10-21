package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.xpequalsbrain.init.XpequalsbrainModEntities;
import net.mcreator.xpequalsbrain.entity.KotuBuyucuEntity;
import net.mcreator.xpequalsbrain.entity.FireballEntity;

public class BuyucuOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double hedefx = 0;
		double hedefz = 0;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
					new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=minecraft:hoglin]");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
					new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=minecraft:piglin]");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
					new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=minecraft:item]");
		if (entity instanceof KotuBuyucuEntity) {
			if (0.5 < Math.random()) {
				hedefx = entity.getX() + 7 * Math.random();
			} else {
				hedefx = entity.getX() - 7 * Math.random();
			}
			if (0.5 < Math.random()) {
				hedefz = entity.getZ() + 7 * Math.random();
			} else {
				hedefz = entity.getZ() - 7 * Math.random();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(hedefx, y, hedefz),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.AMBIENT, (float) 0.2, 1);
				} else {
					_level.playLocalSound(hedefx, y, hedefz, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")),
							SoundSource.AMBIENT, (float) 0.2, 1, false);
				}
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new FireballEntity(XpequalsbrainModEntities.FIREBALL.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 10, 2);
				_entityToSpawn.setPos(hedefx, y, hedefz);
				_entityToSpawn.shoot(0, 1, 0, 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
