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
				_mcserv.getPlayerList().broadcastMessage(new TextComponent("-Yak\u0131nlara bir yere ar\u0131 kovan\u0131 koy"), ChatType.SYSTEM,
						Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(
						new TextComponent("-K\u00F6y yak\u0131n\u0131na ufak bir \"ah\u0131r\" in\u015Fa et (\u00E7it i\u00E7inde inekler)"),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList()
						.broadcastMessage(new TextComponent(
								"-Ula\u015Fabilece\u011Fin bir yere, smithing table ile \u00F6zel kazma satan bir k\u00F6yl\u00FC haz\u0131rla"),
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
				_mcserv.getPlayerList().broadcastMessage(
						new TextComponent("-55 seviye olduktan sonra boss'un gelmesi i\u00E7in bir zombi kesmen gerekiyor, boss orada spawn oluyor"),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent(
						"-Oyunun sana \u00FCret dedi\u011Fi \u015Feyleri \u00FCretip kullanmak isteyeceksin. Bunun haricinde \u00FCretebildi\u011Fin t\u00FCm z\u0131rhlar\u0131 vs \u00FCretmeyi de unutma."),
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
				_mcserv.getPlayerList().broadcastMessage(new TextComponent("-Bulut spawn etmek i\u00E7in /spawncloud"), ChatType.SYSTEM,
						Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList()
						.broadcastMessage(new TextComponent(
								"-Yeni portal\u0131 a\u00E7t\u0131ktan sonra girip /spawncastle ile ayaklar\u0131n\u0131n ucuna kaleyi spawn et."),
								ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(
						new TextComponent("-E\u011Fer ilk orbu t\u00FCketince ar\u0131 IQ'suna ula\u015Famazsan, bug olursa /advancetolevelone"),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent("-190 level olduktan sonra seviye atlamazsan /advancetolevelseven"),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(
						new TextComponent("-E\u011Fer seviyen kazayla fazla olduysa ve olay tetiklenmediyse /leveldusur ve /levelyukselt"),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(
						new TextComponent("-Oyuncular ile 190 seviyeye gelene kadar elmas k\u0131l\u0131\u00E7 edindi\u011Finden emin ol."),
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
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent(
						"-\u00D6zel diyara \u00F6nceden gidip kalenin sol \u00F6n taraf\u0131n\u0131n olmas\u0131n\u0131 isetdi\u011Fin yere gel, bir blok a\u015Fa\u011F\u0131 in ve kaleyi olu\u015Ftur. Sonra kap\u0131s\u0131na b\u00FCy\u00FCc\u00FCy\u00FC spawn et, i\u00E7erideki hedeflerde duvarda olanlar\u0131 k\u0131r\u0131p yere koy, sonra hedeflere teker teker bakarak /hedefsec 1 \u015Feklinde 8'e kadar hedef belirle, sonra o b\u00F6lge i\u00E7in buyucuhedefkonumu belirle, sonra b\u00FCy\u00FCc\u00FC buz konumu belirle, sonra bayrak konumu belirle, sonra b\u00FCy\u00FCc\u00FC boss konumu belirle, sonra da zombiekap\u0131s\u0131 konumunu zombie kap\u0131s\u0131n\u0131n \u00F6n\u00FCne dibine ge\u00E7ip belirle. Sonra da kap\u0131n\u0131n i\u00E7ine zombie boss'lar do\u011Fur"),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
	}
}
