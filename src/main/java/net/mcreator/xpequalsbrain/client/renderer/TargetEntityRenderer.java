
package net.mcreator.xpequalsbrain.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.xpequalsbrain.entity.TargetEntityEntity;

public class TargetEntityRenderer extends MobRenderer<TargetEntityEntity, PigModel<TargetEntityEntity>> {
	public TargetEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TargetEntityEntity entity) {
		return new ResourceLocation("xpequalsbrain:textures/entities/empty_texture.png");
	}
}
