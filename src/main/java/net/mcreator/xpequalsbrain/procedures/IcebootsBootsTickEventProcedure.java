package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class IcebootsBootsTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Blocks.AIR == (world.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock()) {
			world.setBlock(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()), Blocks.ICE.defaultBlockState(), 3);
		}
		if (Blocks.ICE == (world.getBlockState(new BlockPos(entity.getX() + 1, entity.getY() - 1, entity.getZ() + 1))).getBlock()) {
			world.setBlock(new BlockPos(entity.getX() + 1, entity.getY() - 1, entity.getZ() + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if (Blocks.ICE == (world.getBlockState(new BlockPos(entity.getX() - 1, entity.getY() - 1, entity.getZ() - 1))).getBlock()) {
			world.setBlock(new BlockPos(entity.getX() - 1, entity.getY() - 1, entity.getZ() - 1), Blocks.AIR.defaultBlockState(), 3);
		} else if (Blocks.ICE == (world.getBlockState(new BlockPos(entity.getX() - 1, entity.getY() - 1, entity.getZ() + 1))).getBlock()) {
			world.setBlock(new BlockPos(entity.getX() - 1, entity.getY() - 1, entity.getZ() + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if (Blocks.ICE == (world.getBlockState(new BlockPos(entity.getX() + 1, entity.getY() - 1, entity.getZ() - 1))).getBlock()) {
			world.setBlock(new BlockPos(entity.getX() + 1, entity.getY() - 1, entity.getZ() - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if (Blocks.ICE == (world.getBlockState(new BlockPos(entity.getX() + 1, entity.getY() - 2, entity.getZ() + 1))).getBlock()) {
			world.setBlock(new BlockPos(entity.getX() + 1, entity.getY() - 2, entity.getZ() + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if (Blocks.ICE == (world.getBlockState(new BlockPos(entity.getX() - 1, entity.getY() - 2, entity.getZ() - 1))).getBlock()) {
			world.setBlock(new BlockPos(entity.getX() - 1, entity.getY() - 2, entity.getZ() - 1), Blocks.AIR.defaultBlockState(), 3);
		} else if (Blocks.ICE == (world.getBlockState(new BlockPos(entity.getX() - 1, entity.getY() - 2, entity.getZ() + 1))).getBlock()) {
			world.setBlock(new BlockPos(entity.getX() - 1, entity.getY() - 2, entity.getZ() + 1), Blocks.AIR.defaultBlockState(), 3);
		} else if (Blocks.ICE == (world.getBlockState(new BlockPos(entity.getX() + 1, entity.getY() - 2, entity.getZ() - 1))).getBlock()) {
			world.setBlock(new BlockPos(entity.getX() + 1, entity.getY() - 2, entity.getZ() - 1), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
