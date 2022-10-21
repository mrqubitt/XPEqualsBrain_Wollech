package net.mcreator.xpequalsbrain.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.xpequalsbrain.XpequalsbrainMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class XpequalsbrainModVariables {
	public static double PlayerLevel = 0;
	public static double TalkedToVillager = 0;
	public static boolean BeeMissionStarted = false;
	public static boolean BeeTalked = false;
	public static double BeeMissonCounter = 0;
	public static boolean IsLevelZero = false;
	public static boolean CowMissonStarted = false;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		XpequalsbrainMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new,
				SavedDataSyncMessage::handler);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getPlayer().level);
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (mapdata != null)
					XpequalsbrainMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					XpequalsbrainMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (worlddata != null)
					XpequalsbrainMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "xpequalsbrain_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				XpequalsbrainMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "xpequalsbrain_mapvars";
		public String IQ_NAME = "\"\"";
		public double BlocksBroken = 0;
		public double EinsteinLocationX = 0;
		public double EinsteinLocationY = 0;
		public double EinsteinLocationZ = 0;
		public double EinsteinSpeakCounter = 0;
		public boolean EinsteinLabMissionStarted = false;
		public double LabLocX = 0;
		public double LabLocY = 0;
		public double LabLocZ = 0;
		public double ZombieX = 0;
		public double ZombieY = 0;
		public double ZombieZ = 0;
		public double WitchX = 0;
		public double WitchY = 0;
		public double WitchZ = 0;
		public boolean WitchCompassActivate = false;
		public double WitchSpeak = 0;
		public double KotuBitkiOluSayisi = 0;
		public double KotuBitkiSayisi = 0;
		public boolean KaleSpawnOlduMu = false;
		public double BuyucuTalkCounter = 0;
		public double TargetOneX = 0;
		public double TargetTwoX = 0;
		public double TargetThreeX = 0;
		public double TargetFourX = 0;
		public double TargetFiveX = 0;
		public double TargetSixX = 0;
		public double TargetSevenX = 0;
		public double TargetEightX = 0;
		public double TargetOneY = 0;
		public double TargetOneZ = 0;
		public double TargetTwoY = 0;
		public double TargetTwoZ = 0;
		public double TargetThreeY = 0;
		public double TargetThreeZ = 0;
		public double TargetFourY = 0;
		public double TargetFourZ = 0;
		public double TargetFiveY = 0;
		public double TargetFiveZ = 0;
		public double TargetSixY = 0;
		public double TargetSixZ = 0;
		public double TargetSevenY = 0;
		public double TargetSevenZ = 0;
		public double TargetEightY = 0;
		public double TargetEightZ = 0;
		public double BuyucuTargetHitCount = 0;
		public double BuyucuHedefKonumX = 0;
		public double BuyucuHedefKonumY = 0;
		public double BuyucuHedefKonumZ = 0;
		public boolean HedefGorevBasarili = false;
		public double BuyucuKonumBuzX = 0;
		public double BuyucuKonumBossX = 0;
		public double BuyucuKonumBuzY = 0;
		public double BuyucuKonumBuzZ = 0;
		public double BuyucuKonumBossY = 0;
		public double BuyucuKonumBossZ = 0;
		public double BayrakX = 0;
		public double BayrakY = 0;
		public double BayrakZ = 0;
		public boolean BayrakAlindi = false;
		public double globaltimer = 0;
		public double zombiedoorx = 0;
		public double zombiedoory = 0;
		public double zombiedoorz = 0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			IQ_NAME = nbt.getString("IQ_NAME");
			BlocksBroken = nbt.getDouble("BlocksBroken");
			EinsteinLocationX = nbt.getDouble("EinsteinLocationX");
			EinsteinLocationY = nbt.getDouble("EinsteinLocationY");
			EinsteinLocationZ = nbt.getDouble("EinsteinLocationZ");
			EinsteinSpeakCounter = nbt.getDouble("EinsteinSpeakCounter");
			EinsteinLabMissionStarted = nbt.getBoolean("EinsteinLabMissionStarted");
			LabLocX = nbt.getDouble("LabLocX");
			LabLocY = nbt.getDouble("LabLocY");
			LabLocZ = nbt.getDouble("LabLocZ");
			ZombieX = nbt.getDouble("ZombieX");
			ZombieY = nbt.getDouble("ZombieY");
			ZombieZ = nbt.getDouble("ZombieZ");
			WitchX = nbt.getDouble("WitchX");
			WitchY = nbt.getDouble("WitchY");
			WitchZ = nbt.getDouble("WitchZ");
			WitchCompassActivate = nbt.getBoolean("WitchCompassActivate");
			WitchSpeak = nbt.getDouble("WitchSpeak");
			KotuBitkiOluSayisi = nbt.getDouble("KotuBitkiOluSayisi");
			KotuBitkiSayisi = nbt.getDouble("KotuBitkiSayisi");
			KaleSpawnOlduMu = nbt.getBoolean("KaleSpawnOlduMu");
			BuyucuTalkCounter = nbt.getDouble("BuyucuTalkCounter");
			TargetOneX = nbt.getDouble("TargetOneX");
			TargetTwoX = nbt.getDouble("TargetTwoX");
			TargetThreeX = nbt.getDouble("TargetThreeX");
			TargetFourX = nbt.getDouble("TargetFourX");
			TargetFiveX = nbt.getDouble("TargetFiveX");
			TargetSixX = nbt.getDouble("TargetSixX");
			TargetSevenX = nbt.getDouble("TargetSevenX");
			TargetEightX = nbt.getDouble("TargetEightX");
			TargetOneY = nbt.getDouble("TargetOneY");
			TargetOneZ = nbt.getDouble("TargetOneZ");
			TargetTwoY = nbt.getDouble("TargetTwoY");
			TargetTwoZ = nbt.getDouble("TargetTwoZ");
			TargetThreeY = nbt.getDouble("TargetThreeY");
			TargetThreeZ = nbt.getDouble("TargetThreeZ");
			TargetFourY = nbt.getDouble("TargetFourY");
			TargetFourZ = nbt.getDouble("TargetFourZ");
			TargetFiveY = nbt.getDouble("TargetFiveY");
			TargetFiveZ = nbt.getDouble("TargetFiveZ");
			TargetSixY = nbt.getDouble("TargetSixY");
			TargetSixZ = nbt.getDouble("TargetSixZ");
			TargetSevenY = nbt.getDouble("TargetSevenY");
			TargetSevenZ = nbt.getDouble("TargetSevenZ");
			TargetEightY = nbt.getDouble("TargetEightY");
			TargetEightZ = nbt.getDouble("TargetEightZ");
			BuyucuTargetHitCount = nbt.getDouble("BuyucuTargetHitCount");
			BuyucuHedefKonumX = nbt.getDouble("BuyucuHedefKonumX");
			BuyucuHedefKonumY = nbt.getDouble("BuyucuHedefKonumY");
			BuyucuHedefKonumZ = nbt.getDouble("BuyucuHedefKonumZ");
			HedefGorevBasarili = nbt.getBoolean("HedefGorevBasarili");
			BuyucuKonumBuzX = nbt.getDouble("BuyucuKonumBuzX");
			BuyucuKonumBossX = nbt.getDouble("BuyucuKonumBossX");
			BuyucuKonumBuzY = nbt.getDouble("BuyucuKonumBuzY");
			BuyucuKonumBuzZ = nbt.getDouble("BuyucuKonumBuzZ");
			BuyucuKonumBossY = nbt.getDouble("BuyucuKonumBossY");
			BuyucuKonumBossZ = nbt.getDouble("BuyucuKonumBossZ");
			BayrakX = nbt.getDouble("BayrakX");
			BayrakY = nbt.getDouble("BayrakY");
			BayrakZ = nbt.getDouble("BayrakZ");
			BayrakAlindi = nbt.getBoolean("BayrakAlindi");
			globaltimer = nbt.getDouble("globaltimer");
			zombiedoorx = nbt.getDouble("zombiedoorx");
			zombiedoory = nbt.getDouble("zombiedoory");
			zombiedoorz = nbt.getDouble("zombiedoorz");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putString("IQ_NAME", IQ_NAME);
			nbt.putDouble("BlocksBroken", BlocksBroken);
			nbt.putDouble("EinsteinLocationX", EinsteinLocationX);
			nbt.putDouble("EinsteinLocationY", EinsteinLocationY);
			nbt.putDouble("EinsteinLocationZ", EinsteinLocationZ);
			nbt.putDouble("EinsteinSpeakCounter", EinsteinSpeakCounter);
			nbt.putBoolean("EinsteinLabMissionStarted", EinsteinLabMissionStarted);
			nbt.putDouble("LabLocX", LabLocX);
			nbt.putDouble("LabLocY", LabLocY);
			nbt.putDouble("LabLocZ", LabLocZ);
			nbt.putDouble("ZombieX", ZombieX);
			nbt.putDouble("ZombieY", ZombieY);
			nbt.putDouble("ZombieZ", ZombieZ);
			nbt.putDouble("WitchX", WitchX);
			nbt.putDouble("WitchY", WitchY);
			nbt.putDouble("WitchZ", WitchZ);
			nbt.putBoolean("WitchCompassActivate", WitchCompassActivate);
			nbt.putDouble("WitchSpeak", WitchSpeak);
			nbt.putDouble("KotuBitkiOluSayisi", KotuBitkiOluSayisi);
			nbt.putDouble("KotuBitkiSayisi", KotuBitkiSayisi);
			nbt.putBoolean("KaleSpawnOlduMu", KaleSpawnOlduMu);
			nbt.putDouble("BuyucuTalkCounter", BuyucuTalkCounter);
			nbt.putDouble("TargetOneX", TargetOneX);
			nbt.putDouble("TargetTwoX", TargetTwoX);
			nbt.putDouble("TargetThreeX", TargetThreeX);
			nbt.putDouble("TargetFourX", TargetFourX);
			nbt.putDouble("TargetFiveX", TargetFiveX);
			nbt.putDouble("TargetSixX", TargetSixX);
			nbt.putDouble("TargetSevenX", TargetSevenX);
			nbt.putDouble("TargetEightX", TargetEightX);
			nbt.putDouble("TargetOneY", TargetOneY);
			nbt.putDouble("TargetOneZ", TargetOneZ);
			nbt.putDouble("TargetTwoY", TargetTwoY);
			nbt.putDouble("TargetTwoZ", TargetTwoZ);
			nbt.putDouble("TargetThreeY", TargetThreeY);
			nbt.putDouble("TargetThreeZ", TargetThreeZ);
			nbt.putDouble("TargetFourY", TargetFourY);
			nbt.putDouble("TargetFourZ", TargetFourZ);
			nbt.putDouble("TargetFiveY", TargetFiveY);
			nbt.putDouble("TargetFiveZ", TargetFiveZ);
			nbt.putDouble("TargetSixY", TargetSixY);
			nbt.putDouble("TargetSixZ", TargetSixZ);
			nbt.putDouble("TargetSevenY", TargetSevenY);
			nbt.putDouble("TargetSevenZ", TargetSevenZ);
			nbt.putDouble("TargetEightY", TargetEightY);
			nbt.putDouble("TargetEightZ", TargetEightZ);
			nbt.putDouble("BuyucuTargetHitCount", BuyucuTargetHitCount);
			nbt.putDouble("BuyucuHedefKonumX", BuyucuHedefKonumX);
			nbt.putDouble("BuyucuHedefKonumY", BuyucuHedefKonumY);
			nbt.putDouble("BuyucuHedefKonumZ", BuyucuHedefKonumZ);
			nbt.putBoolean("HedefGorevBasarili", HedefGorevBasarili);
			nbt.putDouble("BuyucuKonumBuzX", BuyucuKonumBuzX);
			nbt.putDouble("BuyucuKonumBossX", BuyucuKonumBossX);
			nbt.putDouble("BuyucuKonumBuzY", BuyucuKonumBuzY);
			nbt.putDouble("BuyucuKonumBuzZ", BuyucuKonumBuzZ);
			nbt.putDouble("BuyucuKonumBossY", BuyucuKonumBossY);
			nbt.putDouble("BuyucuKonumBossZ", BuyucuKonumBossZ);
			nbt.putDouble("BayrakX", BayrakX);
			nbt.putDouble("BayrakY", BayrakY);
			nbt.putDouble("BayrakZ", BayrakZ);
			nbt.putBoolean("BayrakAlindi", BayrakAlindi);
			nbt.putDouble("globaltimer", globaltimer);
			nbt.putDouble("zombiedoorx", zombiedoorx);
			nbt.putDouble("zombiedoory", zombiedoory);
			nbt.putDouble("zombiedoorz", zombiedoorz);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				XpequalsbrainMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e),
						MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
