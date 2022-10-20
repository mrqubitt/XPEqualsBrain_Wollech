
package net.mcreator.xpequalsbrain.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.xpequalsbrain.entity.KotuBitkiEntity;
import net.mcreator.xpequalsbrain.client.model.Modelcustom_model;

public class KotuBitkiRenderer extends MobRenderer<KotuBitkiEntity, Modelcustom_model<KotuBitkiEntity>> {
	public KotuBitkiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KotuBitkiEntity entity) {
		return new ResourceLocation("xpequalsbrain:textures/entities/bee.png");
	}
}
