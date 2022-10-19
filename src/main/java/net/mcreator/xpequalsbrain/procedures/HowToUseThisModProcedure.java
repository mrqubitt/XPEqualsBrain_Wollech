package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HowToUseThisModProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getPlayer().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent("MOD KULLANIM KILAVUZU"), ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent("-/clear ile e\u015Fyalar\u0131n\u0131 temizlemeyi unutma."),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(
						new TextComponent("-Modu ba\u015Flatmadan \u00F6nce /einstein_konumu ile einstein'\u0131n belirece\u011Fi konumu belirle."),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent(
						"-Ba\u015Flamadan \u00F6nce /zombi_konumu ile zombilerin do\u011Faca\u011F\u0131 ve boss sava\u015F\u0131n\u0131 yapaca\u011F\u0131n alan\u0131 belirle. (Tavan\u0131 10 bloktan y\u00FCksek bir ma\u011Fara olsun)"),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList()
						.broadcastMessage(new TextComponent(
								"-Ma\u011Farada silahlar\u0131n\u0131 ve z\u0131rhlar\u0131n\u0131 haz\u0131rlad\u0131\u011F\u0131ndan emin ol."),
								ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent(
						"-Einstein i\u00E7in laboratuvar g\u00F6revini yaparken, laboratuvar\u0131n\u0131n tam ortas\u0131na ge\u00E7ip /laboratuvar_konumu yazmay\u0131 unutma. Yapt\u0131\u011F\u0131n yap\u0131 \u00F6nemli de\u011Fil, yerine yenisi gelecek."),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent("-F3+D ile chati temizleyebilece\u011Fini unutma."), ChatType.SYSTEM,
						Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent(
						"-Haz\u0131r oldu\u011Funda /startmod komutu ile ba\u015Flatabilirsin. Oyun i\u00E7inde bunu yazmak seviyeni s\u0131f\u0131rlay\u0131p modu EN BA\u015ETAN ba\u015Flat\u0131r."),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList()
						.broadcastMessage(new TextComponent(
								"-Kontrol d\u0131\u015F\u0131 veya hileyle seviye atlamamaya dikkat et, saya\u00E7ta sorun olu\u015Fturabiliyor."),
								ChatType.SYSTEM, Util.NIL_UUID);
		}
	}
}
