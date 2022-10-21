
package net.mcreator.xpequalsbrain.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.xpequalsbrain.entity.BayrakEntity;
import net.mcreator.xpequalsbrain.client.model.Modelbayraks;

public class BayrakRenderer extends MobRenderer<BayrakEntity, Modelbayraks<BayrakEntity>> {
	public BayrakRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbayraks(context.bakeLayer(Modelbayraks.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BayrakEntity entity) {
		return new ResourceLocation("xpequalsbrain:textures/entities/bayraktexturenew.png");
	}
}
