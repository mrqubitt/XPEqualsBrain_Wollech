package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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

import java.util.Iterator;

public class AdvancedToLevelTwoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		XpequalsbrainModVariables.MapVariables.get(world).IQ_NAME = "\u0130nek";
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		TitleActivatorProcedure.execute(world, x, y, z);
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("xpequalsbrain:cow_brain"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemainingCriteria().iterator();
				while (_iterator.hasNext())
					_player.getAdvancements().award(_adv, (String) _iterator.next());
			}
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(
						new TextComponent(
								"\u00A7a[!]\u00A7e Tebrikler! Art\u0131k \u00A76\u00A7lineklerle\u00A7e konu\u015Fabilecek d\u00FCzeydesin."),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.AMBIENT, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
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
						_mcserv.getPlayerList().broadcastMessage(new TextComponent("\u00A7a[!]\u00A7e Devam etmek i\u00E7in ah\u0131r\u0131 bul."),
								ChatType.SYSTEM, Util.NIL_UUID);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.AMBIENT, 1,
								1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
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
						_mcserv.getPlayerList().broadcastMessage(
								new TextComponent("\u00A76\u00A7a[!]\u00A74 Yeni \u00DCretimler A\u00E7\u0131ld\u0131!"), ChatType.SYSTEM,
								Util.NIL_UUID);
				}
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(new TextComponent(
								"\u00A76\u00A7l+\u00A7r\u00A7a Tutama\u00E7l\u0131 D\u00FCrtme \u00C7ubu\u011Fu \u00A76\u00A7l->\u00A7r\u00A7a Envanterde 2 d\u00FCrtme \u00E7ubu\u011Fu ile yap\u0131l\u0131r."),
								ChatType.SYSTEM, Util.NIL_UUID);
				}
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(new TextComponent(
								"\u00A76\u00A7l+\u00A7r\u00A7a \u00C7orap \u00A76\u00A7l->\u00A7r\u00A7a Envanterde 2 beyaz y\u00FCn ile yap\u0131l\u0131r."),
								ChatType.SYSTEM, Util.NIL_UUID);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.AMBIENT, 2,
								(float) 1.2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
								SoundSource.AMBIENT, 2, (float) 1.2, false);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 40);
	}
}
