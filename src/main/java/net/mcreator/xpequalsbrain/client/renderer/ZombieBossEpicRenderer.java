
package net.mcreator.xpequalsbrain.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.xpequalsbrain.entity.ZombieBossEpicEntity;
import net.mcreator.xpequalsbrain.client.model.Modelzombieboss;

public class ZombieBossEpicRenderer extends MobRenderer<ZombieBossEpicEntity, Modelzombieboss<ZombieBossEpicEntity>> {
	public ZombieBossEpicRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzombieboss(context.bakeLayer(Modelzombieboss.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ZombieBossEpicEntity entity) {
		return new ResourceLocation("xpequalsbrain:textures/entities/zombieasd.png");
	}
}
