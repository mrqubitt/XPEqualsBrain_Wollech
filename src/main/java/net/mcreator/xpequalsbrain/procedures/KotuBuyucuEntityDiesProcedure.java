package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

public class KotuBuyucuEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent("\u00A74Kale Bek\u00E7isi: \u00A7fBeni yendin..."), ChatType.SYSTEM,
						Util.NIL_UUID);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.roar")),
						SoundSource.AMBIENT, 1, (float) 0.7);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.roar")),
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
						_mcserv.getPlayerList().broadcastMessage(
								new TextComponent("\u00A74Kale Bek\u00E7isi: \u00A7fArt\u0131k sana g\u00FCveniyorum."), ChatType.SYSTEM,
								Util.NIL_UUID);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.roar")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.roar")),
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
						_mcserv.getPlayerList().broadcastMessage(
								new TextComponent("\u00A74Kale Bek\u00E7isi: \u00A7fYerimi almaya lay\u0131ks\u0131n..."), ChatType.SYSTEM,
								Util.NIL_UUID);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.celebrate")), SoundSource.AMBIENT, 1,
								(float) 1.4);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.celebrate")),
								SoundSource.AMBIENT, 1, (float) 1.4, false);
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
								new TextComponent("\u00A74Kale Bek\u00E7isi: \u00A7fKendine dikkat et, d\u00FCnyay\u0131 koruyan bendim..."),
								ChatType.SYSTEM, Util.NIL_UUID);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.death")), SoundSource.AMBIENT, 2,
								(float) 0.6);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.death")),
								SoundSource.AMBIENT, 2, (float) 0.6, false);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 20);
		if (sourceentity instanceof Player _player)
			_player.giveExperienceLevels(50);
	}
}
