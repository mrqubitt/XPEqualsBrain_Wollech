package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
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
import net.mcreator.xpequalsbrain.init.XpequalsbrainModItems;

public class FriendlybeeRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity, ItemStack itemstack) {
		if (sourceentity == null)
			return;
		if (!XpequalsbrainModVariables.BeeMissionStarted) {
			if (!XpequalsbrainModVariables.BeeTalked) {
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(new TextComponent("\u00A76Yorgun Ar\u0131: \u00A7fBzzzZZzz BZZZZz "),
								ChatType.SYSTEM, Util.NIL_UUID);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop_aggressive")), SoundSource.AMBIENT,
								(float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop_aggressive")),
								SoundSource.AMBIENT, (float) 0.5, 1, false);
					}
				}
				XpequalsbrainModVariables.BeeTalked = true;
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
										new TextComponent("\u00A7a[!] \u00A7eAr\u0131y\u0131 takip et! Senden bir iste\u011Fi var."), ChatType.SYSTEM,
										Util.NIL_UUID);
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
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 20);
			} else if (XpequalsbrainModVariables.BeeTalked) {
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(
								new TextComponent("\u00A76Yorgun Ar\u0131: \u00A7fBal sezzzonuna \u00E7ok azzz kald\u0131! Bizzze yard\u0131m et!"),
								ChatType.SYSTEM, Util.NIL_UUID);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop_aggressive")), SoundSource.AMBIENT,
								(float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop_aggressive")),
								SoundSource.AMBIENT, (float) 0.5, 1, false);
					}
				}
				XpequalsbrainModVariables.BeeMissionStarted = true;
				XpequalsbrainModVariables.BeeTalked = false;
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
										new TextComponent("\u00A76Yorgun Ar\u0131: \u00A7f15 polene ihtiyac\u0131m\u0131zzz var!"), ChatType.SYSTEM,
										Util.NIL_UUID);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop_aggressive")),
										SoundSource.AMBIENT, (float) 0.5, (float) 0.7);
							} else {
								_level.playLocalSound(x, y, z,
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop_aggressive")),
										SoundSource.AMBIENT, (float) 0.5, (float) 0.7, false);
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
								_mcserv.getPlayerList().broadcastMessage(
										new TextComponent("\u00A7a[!]\u00A7e \u00C7i\u00E7eklere sa\u011F t\u0131klayarak polen toplayabilirsin."),
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
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 55);
			}
		} else if (XpequalsbrainModVariables.BeeMissionStarted) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == XpequalsbrainModItems.POLEN
					.get() && (itemstack).getCount() >= 15) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(XpequalsbrainModItems.POLEN.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 15,
							_player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HEART, x, y, z, 15, 1, 1, 1, 1);
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(new TextComponent(
								"\u00A76Yorgun Ar\u0131: \u00A7fTe\u015Fekk\u00FCr ederizzz! Sayende polen sezzzonuna yeti\u015Fece\u011Fizzz!"),
								ChatType.SYSTEM, Util.NIL_UUID);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop_aggressive")), SoundSource.AMBIENT,
								(float) 0.5, (float) 0.6);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop_aggressive")),
								SoundSource.AMBIENT, (float) 0.5, (float) 0.6, false);
					}
				}
				XpequalsbrainModVariables.BeeMissionStarted = false;
				XpequalsbrainModVariables.BeeTalked = true;
				XpequalsbrainModVariables.BeeMissonCounter = 1;
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
										new TextComponent("\u00A76Yorgun Ar\u0131: \u00A7fBu da sizzze hediyemizzz."), ChatType.SYSTEM,
										Util.NIL_UUID);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop_aggressive")),
										SoundSource.AMBIENT, (float) 0.5, (float) 0.8);
							} else {
								_level.playLocalSound(x, y, z,
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop_aggressive")),
										SoundSource.AMBIENT, (float) 0.5, (float) 0.8, false);
							}
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
						for (int index0 = 0; index0 < (int) (2); index0++) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(XpequalsbrainModItems.SMALL_XP.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.cave_vines.pick_berries")),
											SoundSource.AMBIENT, 1, 1);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.cave_vines.pick_berries")),
											SoundSource.AMBIENT, 1, 1, false);
								}
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 45);
			}
		}
	}
}
