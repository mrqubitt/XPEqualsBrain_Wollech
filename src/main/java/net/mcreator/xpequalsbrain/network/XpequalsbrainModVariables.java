package net.mcreator.xpequalsbrain.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class XpequalsbrainModVariables {
	public static double PlayerLevel = 0;
	public static double TalkedToVillager = 0;
	public static boolean BeeMissionStarted = false;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
