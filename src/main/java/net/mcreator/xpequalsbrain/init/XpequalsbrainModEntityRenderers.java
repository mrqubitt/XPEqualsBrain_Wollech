
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.xpequalsbrain.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.xpequalsbrain.client.renderer.ZombieBossEpicRenderer;
import net.mcreator.xpequalsbrain.client.renderer.TargetEntityRenderer;
import net.mcreator.xpequalsbrain.client.renderer.StephenHawkingRenderer;
import net.mcreator.xpequalsbrain.client.renderer.KotuBuyucuRenderer;
import net.mcreator.xpequalsbrain.client.renderer.KotuBitkiRenderer;
import net.mcreator.xpequalsbrain.client.renderer.HerobrineRenderer;
import net.mcreator.xpequalsbrain.client.renderer.FriendlybeeRenderer;
import net.mcreator.xpequalsbrain.client.renderer.FireballRenderer;
import net.mcreator.xpequalsbrain.client.renderer.EinsteinRenderer;
import net.mcreator.xpequalsbrain.client.renderer.BuyucuRenderer;
import net.mcreator.xpequalsbrain.client.renderer.BayrakRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class XpequalsbrainModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(XpequalsbrainModEntities.FRIENDLYBEE.get(), FriendlybeeRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.EINSTEIN.get(), EinsteinRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.STEPHEN_HAWKING.get(), StephenHawkingRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.ZOMBIE_BOSS_EPIC.get(), ZombieBossEpicRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.HEROBRINE.get(), HerobrineRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.KOTU_BITKI.get(), KotuBitkiRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.BUYUCU.get(), BuyucuRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.TARGET_ENTITY.get(), TargetEntityRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.FIREBALL.get(), FireballRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.BAYRAK.get(), BayrakRenderer::new);
		event.registerEntityRenderer(XpequalsbrainModEntities.KOTU_BUYUCU.get(), KotuBuyucuRenderer::new);
	}
}
