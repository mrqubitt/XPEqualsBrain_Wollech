
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.xpequalsbrain.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.xpequalsbrain.client.model.Modelzombieboss;
import net.mcreator.xpequalsbrain.client.model.Modelmustafa;
import net.mcreator.xpequalsbrain.client.model.Modelfileproject;
import net.mcreator.xpequalsbrain.client.model.Modelcustom_model;
import net.mcreator.xpequalsbrain.client.model.Modelben_bir_ariyim;
import net.mcreator.xpequalsbrain.client.model.Modelatesates;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class XpequalsbrainModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmustafa.LAYER_LOCATION, Modelmustafa::createBodyLayer);
		event.registerLayerDefinition(Modelben_bir_ariyim.LAYER_LOCATION, Modelben_bir_ariyim::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelfileproject.LAYER_LOCATION, Modelfileproject::createBodyLayer);
		event.registerLayerDefinition(Modelzombieboss.LAYER_LOCATION, Modelzombieboss::createBodyLayer);
		event.registerLayerDefinition(Modelatesates.LAYER_LOCATION, Modelatesates::createBodyLayer);
	}
}
