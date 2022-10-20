package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;
import net.mcreator.xpequalsbrain.init.XpequalsbrainModEntities;
import net.mcreator.xpequalsbrain.entity.KotuBitkiEntity;

public class MiracleGrowthItemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		double YerelX = 0;
		double YerelZ = 0;
		double YerelY = 0;
		double Yerlestir = 0;
		double blocksPlaced = 0;
		if (Blocks.GRASS_BLOCK == blockstate.getBlock()) {
			YerelX = 5 + entity.getX();
			YerelY = 60 + entity.getY();
			YerelZ = 5 + entity.getZ();
			Yerlestir = 4;
			for (int index0 = 0; index0 < (int) (9); index0++) {
				for (int index1 = 0; index1 < (int) (10); index1++) {
					for (int index2 = 0; index2 < (int) (999); index2++) {
						if (Yerlestir != 0) {
							Yerlestir = Yerlestir - 1;
							break;
						} else {
							if (Blocks.AIR == (world.getBlockState(new BlockPos(YerelX, YerelY, YerelZ))).getBlock()) {
								YerelY = YerelY - 1;
							} else {
								if (Blocks.GRASS == (world.getBlockState(new BlockPos(YerelX, YerelY, YerelZ))).getBlock()) {
									world.setBlock(new BlockPos(YerelX, YerelY, YerelZ), Blocks.AIR.defaultBlockState(), 3);
									YerelY = YerelY - 1;
								}
								if (Blocks.TALL_GRASS == (world.getBlockState(new BlockPos(YerelX, YerelY, YerelZ))).getBlock()) {
									for (int index3 = 0; index3 < (int) (2); index3++) {
										world.setBlock(new BlockPos(YerelX, YerelY, YerelZ), Blocks.AIR.defaultBlockState(), 3);
										YerelY = YerelY - 1;
									}
								}
								YerelY = YerelY + 1;
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new KotuBitkiEntity(XpequalsbrainModEntities.KOTU_BITKI.get(), _level);
									entityToSpawn.moveTo(YerelX, YerelY, YerelZ, 0, 0);
									entityToSpawn.setYBodyRot(0);
									entityToSpawn.setYHeadRot(0);
									entityToSpawn.setDeltaMovement(0, 0, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
												MobSpawnType.MOB_SUMMONED, null, null);
									world.addFreshEntity(entityToSpawn);
								}
								Yerlestir = Math.ceil(2 + Math.random() * 10);
								blocksPlaced = blocksPlaced + 1;
								XpequalsbrainModVariables.MapVariables.get(world).KotuBitkiSayisi = blocksPlaced;
								XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
								break;
							}
						}
					}
					YerelX = YerelX - 1;
					YerelY = 60 + entity.getY();
				}
				YerelZ = YerelZ - 1;
				YerelX = YerelX + 11;
			}
		}
	}
}
