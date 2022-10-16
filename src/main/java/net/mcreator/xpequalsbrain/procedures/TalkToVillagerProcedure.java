package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TalkToVillagerProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Villager) {
			if (0 == (sourceentity instanceof Player _plr ? _plr.experienceLevel : 0)) {
				if (0 == XpequalsbrainModVariables.TalkedToVillager) {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent(
									"\u00A7bK\u00F6yl\u00FC: \u00A7fA\u011Fz\u0131ndan \u00E7\u0131kan hi\u00E7bir \u015Fey anla\u015F\u0131lm\u0131yor. Benimle konu\u015Fmak yeterince zeki de\u011Fil gibisin."),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")),
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
							if (!world.isClientSide()) {
								MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
								if (_mcserv != null)
									_mcserv.getPlayerList().broadcastMessage(new TextComponent(
											"\u00A7a[!] \u00A7eK\u00F6yl\u00FC ile konu\u015Facak kadar zeki de\u011Filsin. XP kazanmay\u0131 dene."),
											ChatType.SYSTEM, Util.NIL_UUID);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
											SoundSource.AMBIENT, 1, 1);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
											SoundSource.AMBIENT, 1, 1, false);
								}
							}
							XpequalsbrainModVariables.TalkedToVillager = 1;
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 20);
				} else {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent(
									"\u00A7bK\u00F6yl\u00FC: \u00A7fBa\u015F\u0131mda sa\u00E7malamaya devam edersen k\u0131zaca\u011F\u0131m he!"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death")),
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
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
											SoundSource.AMBIENT, 1, 1);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
											SoundSource.AMBIENT, 1, 1, false);
								}
							}
							if (!world.isClientSide()) {
								MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
								if (_mcserv != null)
									_mcserv.getPlayerList().broadcastMessage(new TextComponent("\u00A7a[!] \u00A7eEski yollar ile xp bulabilirsin."),
											ChatType.SYSTEM, Util.NIL_UUID);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 20);
				}
			} else if (2 >= (sourceentity instanceof Player _plr ? _plr.experienceLevel : 0)) {
				if (0 == XpequalsbrainModVariables.TalkedToVillager) {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(
									new TextComponent("\u00A7bK\u00F6yl\u00FC: \u00A7fBa\u015F\u0131mda v\u0131z\u0131ldamay\u0131 keser misin?"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")),
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
							if (!world.isClientSide()) {
								MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
								if (_mcserv != null)
									_mcserv.getPlayerList().broadcastMessage(new TextComponent(
											"\u00A7a[!] \u00A7eAr\u0131larla konu\u015Fabilecek d\u00FCzeydesin, bir ar\u0131 bulmay\u0131 dene."),
											ChatType.SYSTEM, Util.NIL_UUID);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
											SoundSource.AMBIENT, 1, 1);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
											SoundSource.AMBIENT, 1, 1, false);
								}
							}
							XpequalsbrainModVariables.TalkedToVillager = 1;
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 20);
				} else {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent("\u00A7bK\u00F6yl\u00FC: \u00A7fSANA BZZZZ!"), ChatType.SYSTEM,
									Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death")),
									SoundSource.AMBIENT, 1, 1, false);
						}
					}
				}
			} else if (24 >= (sourceentity instanceof Player _plr ? _plr.experienceLevel : 0)) {
				if (0 == XpequalsbrainModVariables.TalkedToVillager) {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(
									new TextComponent("\u00A7bK\u00F6yl\u00FC: \u00A7fAh\u0131ra git, orada senden \u00E7ok var!"), ChatType.SYSTEM,
									Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.no")),
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
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
											SoundSource.AMBIENT, 1, 1);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
											SoundSource.AMBIENT, 1, 1, false);
								}
							}
							if (!world.isClientSide()) {
								MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
								if (_mcserv != null)
									_mcserv.getPlayerList().broadcastMessage(
											new TextComponent("\u00A7a[!] \u00A7eKonu\u015Fmak i\u00E7in bir inek bulmay\u0131 dene."),
											ChatType.SYSTEM, Util.NIL_UUID);
							}
							XpequalsbrainModVariables.TalkedToVillager = 1;
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 20);
				} else {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent("\u00A7bK\u00F6yl\u00FC: \u00A7fO\u011Flum bak git!"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death")),
									SoundSource.AMBIENT, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, x, y, z, 25, 1, 1, 1, 1);
					sourceentity.hurt(DamageSource.GENERIC, 4);
				}
			} else if (25 == XpequalsbrainModVariables.PlayerLevel) {
				if (0 == XpequalsbrainModVariables.TalkedToVillager) {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(
									new TextComponent(
											"\u00A7bK\u00F6yl\u00FC: \u00A7fSonunda seni anlayabilyorum! Sana g\u00FCzel bir teklifim var."),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.trade")), SoundSource.AMBIENT, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.trade")),
									SoundSource.AMBIENT, 1, 1, false);
						}
					}
					XpequalsbrainModVariables.TalkedToVillager = 1;
				} else {
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(
									new TextComponent(
											"\u00A7bK\u00F6yl\u00FC: \u00A7fTeklifimi g\u00F6zden ge\u00E7irmeye mi geldin? Ne g\u00FCzel!"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.trade")), SoundSource.AMBIENT, 1,
									(float) 0.7);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.trade")),
									SoundSource.AMBIENT, 1, (float) 0.7, false);
						}
					}
				}
			}
		}
	}
}
