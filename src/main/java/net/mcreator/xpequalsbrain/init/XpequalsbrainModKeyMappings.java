
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.xpequalsbrain.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.xpequalsbrain.network.MoonWalkKeyMessage;
import net.mcreator.xpequalsbrain.XpequalsbrainMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class XpequalsbrainModKeyMappings {
	public static final KeyMapping MOON_WALK_KEY = new KeyMapping("key.xpequalsbrain.moon_walk_key", GLFW.GLFW_KEY_C, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(MOON_WALK_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == MOON_WALK_KEY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						XpequalsbrainMod.PACKET_HANDLER.sendToServer(new MoonWalkKeyMessage(0, 0));
						MoonWalkKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
