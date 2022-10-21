
package net.mcreator.xpequalsbrain.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.xpequalsbrain.entity.RoketEntity;
import net.mcreator.xpequalsbrain.client.model.Modelrocket;

public class RoketRenderer extends MobRenderer<RoketEntity, Modelrocket<RoketEntity>> {
	public RoketRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrocket(context.bakeLayer(Modelrocket.LAYER_LOCATION)), 7f);
	}

	@Override
	public ResourceLocation getTextureLocation(RoketEntity entity) {
		return new ResourceLocation("xpequalsbrain:textures/entities/texture_rocket.png");
	}
}
