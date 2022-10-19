
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.xpequalsbrain.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.xpequalsbrain.client.renderer.StephenHawkingRenderer;
import net.mcreator.xpequalsbrain.client.renderer.FriendlybeeRenderer;
import net.mcreator.xpequalsbrain.client.renderer.EinsteinRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class XpequalsbrainModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(XpequalsbrainModEntities.FRIENDLYBEE.get(), FriendlybeeRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.EINSTEIN.get(), EinsteinRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.STEPHEN_HAWKING.get(), StephenHawkingRenderer::new);
	}
}
