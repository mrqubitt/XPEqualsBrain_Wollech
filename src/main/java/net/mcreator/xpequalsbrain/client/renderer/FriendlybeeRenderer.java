
package net.mcreator.xpequalsbrain.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.xpequalsbrain.entity.FriendlybeeEntity;
import net.mcreator.xpequalsbrain.client.model.Modelben_bir_ariyim;

public class FriendlybeeRenderer extends MobRenderer<FriendlybeeEntity, Modelben_bir_ariyim<FriendlybeeEntity>> {
	public FriendlybeeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelben_bir_ariyim(context.bakeLayer(Modelben_bir_ariyim.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FriendlybeeEntity entity) {
		return new ResourceLocation("xpequalsbrain:textures/entities/bee.png");
	}
}
