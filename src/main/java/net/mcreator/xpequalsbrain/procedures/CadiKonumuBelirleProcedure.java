package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

public class CadiKonumuBelirleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		XpequalsbrainModVariables.MapVariables.get(world).WitchX = entity.getX();
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		XpequalsbrainModVariables.MapVariables.get(world).WitchY = entity.getY();
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		XpequalsbrainModVariables.MapVariables.get(world).WitchZ = entity.getZ();
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("xpequalsbrain", "hut"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
	}
}
