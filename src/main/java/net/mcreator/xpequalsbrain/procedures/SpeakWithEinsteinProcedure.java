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
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;
import net.minecraft.Util;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;
import net.mcreator.xpequalsbrain.entity.EinsteinEntity;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class SpeakWithEinsteinProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EinsteinEntity && XpequalsbrainModVariables.MapVariables.get(world).EinsteinSpeakCounter == 0
				&& !XpequalsbrainModVariables.MapVariables.get(world).EinsteinLabMissionStarted) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent(
							"\u00A76Albert Einstein: \u00A7fVay can\u0131m \u015Funa bak! Ne kadar da h\u0131zl\u0131 ak\u0131llan\u0131yorsun!"),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.AMBIENT, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")),
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
									"\u00A76Albert Einstein: \u00A7fE\u011Fer bana bir laboratuvar yaparsan, birka\u00E7 deneyle seni daha zeki yapabilece\u011Fimize eminim!"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.AMBIENT, 1,
									(float) 1.3);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")),
									SoundSource.AMBIENT, 1, (float) 1.3, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 40);
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
									new TextComponent("\u00A7a[!]\u00A7e Einstein i\u00E7in bir laboratuvar in\u015Faa etmelisin."), ChatType.SYSTEM,
									Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.AMBIENT,
									1, 1);
						} else {
							_level.playLocalSound(x, y, z,
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.AMBIENT,
									1, 1, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 80);
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
									"\u00A7a[!]\u00A7e Laboratuvarlar genellikle ta\u015F, odun ve hatta demir gibi de\u011Ferli maddelerden \u00FCretilirler!"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.AMBIENT,
									1, 1);
						} else {
							_level.playLocalSound(x, y, z,
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.AMBIENT,
									1, 1, false);
						}
					}
					XpequalsbrainModVariables.MapVariables.get(world).EinsteinLabMissionStarted = true;
					XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("xpequalsbrain:build_a_lab"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.AMBIENT, 1,
									1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")),
									SoundSource.AMBIENT, 1, 1, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 105);
			XpequalsbrainModVariables.MapVariables.get(world).EinsteinSpeakCounter = 1;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		} else if (entity instanceof EinsteinEntity && XpequalsbrainModVariables.MapVariables.get(world).EinsteinSpeakCounter == 1
				&& XpequalsbrainModVariables.MapVariables.get(world).EinsteinLabMissionStarted) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(
							new TextComponent("\u00A76Albert Einstein: \u00A7fHmmm bir bakal\u0131m neler haz\u0131rlam\u0131\u015Fs\u0131n."),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")), SoundSource.AMBIENT, 1,
							(float) 0.7);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.celebrate")),
							SoundSource.AMBIENT, 1, (float) 0.7, false);
				}
			}
		}
	}
}
