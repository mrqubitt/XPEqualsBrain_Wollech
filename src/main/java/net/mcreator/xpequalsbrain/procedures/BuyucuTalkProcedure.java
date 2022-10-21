package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.Util;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;
import net.mcreator.xpequalsbrain.init.XpequalsbrainModItems;
import net.mcreator.xpequalsbrain.init.XpequalsbrainModEntities;
import net.mcreator.xpequalsbrain.entity.TargetEntityEntity;

public class BuyucuTalkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (0 == XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent("\u00A76\u015Eatonun Bek\u00E7isi: \u00A7fO sen misin?"),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
							(float) 0.7);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
							SoundSource.AMBIENT, 1, (float) 0.7, false);
				}
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent(
									"\u00A76\u015Eatonun Bek\u00E7isi: \u00A7fEvet o olmal\u0131s\u0131n, taze b\u00FCy\u00FC g\u00FCc\u00FCn\u00FC hissedebiliyorum."),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
									1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
									SoundSource.AMBIENT, 1, 1, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 20);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent(
									"\u00A76\u015Eatonun Bek\u00E7isi: \u00A7fSana birtak\u0131m b\u00FCy\u00FCler \u00F6\u011Fretmem gerekiyor. Efendilerim maceranda sana bu \u015Fekidle yard\u0131mc\u0131 olmam\u0131 emretti."),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
									(float) 1.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
									SoundSource.AMBIENT, 1, (float) 1.5, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 70);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent(
									"\u00A76\u015Eatonun Bek\u00E7isi: \u00A7fAncak sen b\u00FCy\u00FCy\u00FC de\u011Fil, b\u00FCy\u00FC seni se\u00E7er. O y\u00FCzden \u00F6cne bir bakal\u0131m haz\u0131r m\u0131s\u0131n..."),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
									(float) 0.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
									SoundSource.AMBIENT, 1, (float) 0.5, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 130);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(
									new TextComponent("\u00A76\u015Eatonun Bek\u00E7isi: \u00A7f\u0130\u00E7eride seni bekliyorum!"), ChatType.SYSTEM,
									Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
									(float) 1.7);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
									SoundSource.AMBIENT, 1, (float) 1.7, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 180);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 400, 1, 1.5, 1, 1);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.shulker.teleport")), SoundSource.AMBIENT, 1,
									(float) 1.7);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.shulker.teleport")),
									SoundSource.AMBIENT, 1, (float) 1.7, false);
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo(XpequalsbrainModVariables.MapVariables.get(world).BuyucuHedefKonumX,
								XpequalsbrainModVariables.MapVariables.get(world).BuyucuHedefKonumY,
								XpequalsbrainModVariables.MapVariables.get(world).BuyucuHedefKonumZ);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(XpequalsbrainModVariables.MapVariables.get(world).BuyucuHedefKonumX,
									XpequalsbrainModVariables.MapVariables.get(world).BuyucuHedefKonumY,
									XpequalsbrainModVariables.MapVariables.get(world).BuyucuHedefKonumZ, _ent.getYRot(), _ent.getXRot());
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 210);
			XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter = XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter
					+ 1;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		} else if (1 == XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent(
							"\u00A76\u015Eatonun Bek\u00E7isi: \u00A7f\u0130lk \u00F6\u011Frenece\u011Fin b\u00FCy\u00FC \u00A7e\u00A7lY\u0131ld\u0131r\u0131m At\u0131\u015F\u0131\u00A7r\u00A7f!"),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
							SoundSource.AMBIENT, 1, 1, false);
				}
			}
			XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter = XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter
					+ 1;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList()
									.broadcastMessage(new TextComponent(
											"\u00A76\u015Eatonun Bek\u00E7isi: \u00A7f\u00D6nce bakal\u0131m buna lay\u0131k m\u0131s\u0131n."),
											ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
									(float) 0.7);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
									SoundSource.AMBIENT, 1, (float) 0.7, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 30);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent(
									"\u00A76\u015Eatonun Bek\u00E7isi: \u00A7fT\u00FCm hedefleri 15 saniye i\u00E7inde vurmal\u0131s\u0131n."),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 50);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent("\u00A76\u015Eatonun Bek\u00E7isi: \u00A7fBA\u015ELA!"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TargetEntityEntity(XpequalsbrainModEntities.TARGET_ENTITY.get(), _level);
						entityToSpawn.moveTo(XpequalsbrainModVariables.MapVariables.get(world).TargetOneX,
								(XpequalsbrainModVariables.MapVariables.get(world).TargetOneY + 1),
								XpequalsbrainModVariables.MapVariables.get(world).TargetOneZ, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TargetEntityEntity(XpequalsbrainModEntities.TARGET_ENTITY.get(), _level);
						entityToSpawn.moveTo(XpequalsbrainModVariables.MapVariables.get(world).TargetTwoX,
								(XpequalsbrainModVariables.MapVariables.get(world).TargetTwoY + 1),
								XpequalsbrainModVariables.MapVariables.get(world).TargetTwoZ, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TargetEntityEntity(XpequalsbrainModEntities.TARGET_ENTITY.get(), _level);
						entityToSpawn.moveTo(XpequalsbrainModVariables.MapVariables.get(world).TargetThreeX,
								(XpequalsbrainModVariables.MapVariables.get(world).TargetThreeY + 1),
								XpequalsbrainModVariables.MapVariables.get(world).TargetThreeZ, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TargetEntityEntity(XpequalsbrainModEntities.TARGET_ENTITY.get(), _level);
						entityToSpawn.moveTo(XpequalsbrainModVariables.MapVariables.get(world).TargetFourX,
								(XpequalsbrainModVariables.MapVariables.get(world).TargetFourY + 1),
								XpequalsbrainModVariables.MapVariables.get(world).TargetFourZ, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TargetEntityEntity(XpequalsbrainModEntities.TARGET_ENTITY.get(), _level);
						entityToSpawn.moveTo(XpequalsbrainModVariables.MapVariables.get(world).TargetFiveX,
								(XpequalsbrainModVariables.MapVariables.get(world).TargetFiveY + 1),
								XpequalsbrainModVariables.MapVariables.get(world).TargetFiveZ, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TargetEntityEntity(XpequalsbrainModEntities.TARGET_ENTITY.get(), _level);
						entityToSpawn.moveTo(XpequalsbrainModVariables.MapVariables.get(world).TargetSixX,
								(XpequalsbrainModVariables.MapVariables.get(world).TargetSixY + 1),
								XpequalsbrainModVariables.MapVariables.get(world).TargetSixZ, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TargetEntityEntity(XpequalsbrainModEntities.TARGET_ENTITY.get(), _level);
						entityToSpawn.moveTo(XpequalsbrainModVariables.MapVariables.get(world).TargetSevenX,
								(XpequalsbrainModVariables.MapVariables.get(world).TargetSevenY + 1),
								XpequalsbrainModVariables.MapVariables.get(world).TargetSevenZ, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TargetEntityEntity(XpequalsbrainModEntities.TARGET_ENTITY.get(), _level);
						entityToSpawn.moveTo(XpequalsbrainModVariables.MapVariables.get(world).TargetEightX,
								(XpequalsbrainModVariables.MapVariables.get(world).TargetEightY + 1),
								XpequalsbrainModVariables.MapVariables.get(world).TargetEightZ, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					{
						Entity _ent = sourceentity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
									"settimer 15");
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 70);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
								_level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
								"bossbar remove wollech:hedef");
					if (!XpequalsbrainModVariables.MapVariables.get(world).HedefGorevBasarili) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL,
											new Vec3((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ())), Vec2.ZERO, _level, 4, "",
											new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"kill @e[type=xpequalsbrain:target_entity]");
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands()
									.performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
													new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"bossbar remove wollech:hedef");
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									"title @a subtitle \"Yenilgini kabul etmek i\u00E7in bek\u00E7i ile konu\u015F.\"");
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									"title @a title \"\u00A74\u00A7lBa\u015Faramad\u0131n!\"");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.AMBIENT, 2,
										(float) 0.4);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")),
										SoundSource.AMBIENT, 2, (float) 0.4, false);
							}
						}
						XpequalsbrainModVariables.MapVariables.get(world).BuyucuTargetHitCount = 0;
						XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
						XpequalsbrainModVariables.MapVariables.get(world).HedefGorevBasarili = false;
						XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 370);
		} else if (2 == XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter
				&& XpequalsbrainModVariables.MapVariables.get(world).HedefGorevBasarili) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList()
							.broadcastMessage(new TextComponent(
									"\u00A76\u015Eatonun Bek\u00E7isi:\u00A7f Tebrik ederim. Bekledi\u011Fimden daha iyi ni\u015Fanc\u0131s\u0131n."),
									ChatType.SYSTEM, Util.NIL_UUID);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
							(float) 1.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
							SoundSource.AMBIENT, 1, (float) 1.5, false);
				}
			}
			if (sourceentity instanceof Player _player)
				_player.giveExperienceLevels(40);
			XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter = XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter
					+ 1;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(
									new TextComponent("\u00A76\u015Eatonun Bek\u00E7isi:\u00A7f S\u0131radaki testimize ilerleyelim."),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 400, 1, 1.5, 1, 0.2);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.shulker.teleport")), SoundSource.AMBIENT, 1,
									(float) 1.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.shulker.teleport")),
									SoundSource.AMBIENT, 1, (float) 1.5, false);
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo(XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBuzX,
								XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBuzY,
								XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBuzZ);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBuzX,
									XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBuzY,
									XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBuzZ, _ent.getYRot(), _ent.getXRot());
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 35);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(
									new TextComponent("\u00A7a[!]\u00A7e\u00A7l Yeni yetenek a\u00E7\u0131ld\u0131!"), ChatType.SYSTEM,
									Util.NIL_UUID);
					}
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(
									new TextComponent("\u00A7a[!]\u00A7e \"M\"ye basarak \u00A7ly\u0131ld\u0131r\u0131m\u00A7r\u00A7e atabilirsin!"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
									(float) 1.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
									SoundSource.AMBIENT, 1, (float) 1.5, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 35);
		} else if (2 == XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter
				&& !XpequalsbrainModVariables.MapVariables.get(world).HedefGorevBasarili) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent(
							"\u00A76\u015Eatonun Bek\u00E7isi:\u00A7f Hmm yeteneklerini geli\u015Ftirmelisin, bu b\u00FCy\u00FCc\u00FCl\u00FC\u011F\u00FCn daha temeli. Tekrar denemek istedi\u011Finde bana haber ver."),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
							(float) 1.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
							SoundSource.AMBIENT, 1, (float) 1.5, false);
				}
			}
			XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter = 1;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).BuyucuTargetHitCount = 0;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		} else if (3 == XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter
				&& XpequalsbrainModVariables.MapVariables.get(world).HedefGorevBasarili) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent("\u00A76\u015Eatonun Bek\u00E7isi:\u00A7f S\u0131radaki testin \u00A7ebuz parkuru\u00A7f."),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
							(float) 0.9);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
							SoundSource.AMBIENT, 1, (float) 0.9, false);
				}
			}
			XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter = XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter
					+ 1;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList()
									.broadcastMessage(new TextComponent(
											"\u00A76\u015Eatonun Bek\u00E7isi:\u00A7f Bakal\u0131m isabetli oldu\u011Fun kadar \u00E7evik misin de."),
											ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
									1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
									SoundSource.AMBIENT, 1, 1, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 30);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent(
									"\u00A76\u015Eatonun Bek\u00E7isi:\u00A7f 45 saniye i\u00E7inde yukar\u0131daki bayra\u011F\u0131 al\u0131p geri gelmen gerekiyor."),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
									(float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
									SoundSource.AMBIENT, 1, (float) 0.8, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 65);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(
									new TextComponent("\u00A76\u015Eatonun Bek\u00E7isi:\u00A7f Ha\u0131zr ol, ba\u015Fla!"), ChatType.SYSTEM,
									Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1,
									1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
									SoundSource.AMBIENT, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
								_level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "summonBayrak");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
								_level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "bossbar remove timer");
					{
						Entity _ent = sourceentity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
									"settimer 45");
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"title @a subtitle \"Tekrar denemek i\u00E7in bek\u00E7i ile konu\u015F.");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
												_level.getServer(), null).withSuppressedOutput(),
										"title @a title \"\u00A74\u00A7tBa\u015Faramad\u0131n!\"");
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 90);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!XpequalsbrainModVariables.MapVariables.get(world).BayrakAlindi) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands()
									.performCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
													new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
											"kill @e[type=xpequalsbrain:bayrak]");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")), SoundSource.AMBIENT, 2,
										(float) 0.4);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.death")),
										SoundSource.AMBIENT, 2, (float) 0.4, false);
							}
						}
						XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter = 4;
						XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 990);
		} else if (4 == XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter
				&& XpequalsbrainModVariables.MapVariables.get(world).BayrakAlindi) {
			XpequalsbrainModVariables.MapVariables.get(world).globaltimer = 1;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent(
									"\u00A76\u015Eatonun Bek\u00E7isi:\u00A7f Aferin, hem \u00E7evik hem isabetli. Gelecek vaat ediyorsun."),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
							SoundSource.AMBIENT, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"title @a title \"\u00A76\u00A7lH\u0131zl\u0131s\u0131n!\"");
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.toast.challenge_complete")), SoundSource.AMBIENT, 1,
							(float) 1.3);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.toast.challenge_complete")),
							SoundSource.AMBIENT, 1, (float) 1.3, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, (sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()), 50, 1, 1.5,
						1, 1);
			XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter = XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter
					+ 1;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent(
									"\u00A76\u015Eatonun Bek\u00E7isi:\u00A7f \u0130\u015Fte \u00F6d\u00FCl\u00FCn. Gel, s\u0131radaki teste ge\u00E7elim."),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT,
									(float) 0.7, (float) 0.4);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
									SoundSource.AMBIENT, (float) 0.7, (float) 0.4, false);
						}
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(XpequalsbrainModItems.ICEBOOTS_BOOTS.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					{
						Entity _ent = entity;
						_ent.teleportTo(XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBossX,
								XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBossY,
								XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBossZ);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBossX,
									XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBossY,
									XpequalsbrainModVariables.MapVariables.get(world).BuyucuKonumBossZ, _ent.getYRot(), _ent.getXRot());
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 30);
		} else if (4 == XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter
				&& !XpequalsbrainModVariables.MapVariables.get(world).BayrakAlindi) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent(
							"\u00A76\u015Eatonun Bek\u00E7isi:\u00A7f H\u0131zlanmal\u0131s\u0131n, odaklanmal\u0131s\u0131n. Unutma ki h\u0131z sab\u0131rdan ge\u00E7er. Tekrar denemek istedi\u011Finde burada olaca\u011F\u0131m."),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
							SoundSource.AMBIENT, 1, 1, false);
				}
			}
			XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter = 3;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		} else if (5 == XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter) {
			XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter = XpequalsbrainModVariables.MapVariables.get(world).BuyucuTalkCounter
					+ 1;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent(
							"\u00A76\u015Eatonun Bek\u00E7isi:\u00A7f Son testine ho\u015F geldin! \u00D6\u011Frendi\u011Fin her \u015Feyi kullan ve \u015Fu yarat\u0131klara cehennemi ya\u015Fat!"),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.illusioner.ambient")),
							SoundSource.AMBIENT, 1, 1, false);
				}
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.roar")), SoundSource.AMBIENT, 2, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.roar")),
									SoundSource.AMBIENT, 2, 1, false);
						}
					}
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, XpequalsbrainModVariables.MapVariables.get(world).zombiedoorx,
								(XpequalsbrainModVariables.MapVariables.get(world).zombiedoory + 4),
								XpequalsbrainModVariables.MapVariables.get(world).zombiedoorz, 6, Explosion.BlockInteraction.BREAK);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 40);
		}
	}
}
