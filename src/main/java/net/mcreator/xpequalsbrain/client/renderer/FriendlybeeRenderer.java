
package net.mcreator.xpequalsbrain.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.xpequalsbrain.entity.FriendlybeeEntity;
import net.mcreator.xpequalsbrain.client.model.Modelcustom_model;

public class FriendlybeeRenderer extends MobRenderer<FriendlybeeEntity, Modelcustom_model<FriendlybeeEntity>> {
	public FriendlybeeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FriendlybeeEntity entity) {
		return new ResourceLocation("xpequalsbrain:textures/entities/bee.png");
	}
}
