package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class MiracleGrowthItemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		double YerelX = 0;
		double YerelZ = 0;
		double YerelY = 0;
		double Yerlestir = 0;
		if (Blocks.GRASS_BLOCK == blockstate.getBlock()) {
			YerelX = 5 + entity.getX();
			YerelY = 320;
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
								YerelY = YerelY + 1;
								world.setBlock(new BlockPos(YerelX, YerelY, YerelZ), Blocks.AMETHYST_CLUSTER.defaultBlockState(), 3);
								Yerlestir = 4;
								break;
							}
						}
					}
					YerelX = YerelX - 1;
					YerelY = 320;
				}
				YerelZ = YerelZ - 1;
				YerelX = YerelX + 11;
			}
		}
	}
}
