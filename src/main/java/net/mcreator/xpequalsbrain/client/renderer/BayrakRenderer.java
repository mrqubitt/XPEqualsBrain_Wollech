
package net.mcreator.xpequalsbrain.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.xpequalsbrain.entity.BayrakEntity;
import net.mcreator.xpequalsbrain.client.model.Modelcustom_model;

public class BayrakRenderer extends MobRenderer<BayrakEntity, Modelcustom_model<BayrakEntity>> {
	public BayrakRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BayrakEntity entity) {
		return new ResourceLocation("xpequalsbrain:textures/entities/bayrak.png");
	}
}
