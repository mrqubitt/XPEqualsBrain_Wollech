
package net.mcreator.xpequalsbrain.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.xpequalsbrain.entity.KotuBitkiEntity;
import net.mcreator.xpequalsbrain.client.model.Modelmustafa;

public class KotuBitkiRenderer extends MobRenderer<KotuBitkiEntity, Modelmustafa<KotuBitkiEntity>> {
	public KotuBitkiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmustafa(context.bakeLayer(Modelmustafa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KotuBitkiEntity entity) {
		return new ResourceLocation("xpequalsbrain:textures/entities/cicek.png");
	}
}
