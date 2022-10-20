package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetTargetPositionProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "Hedef") == 1) {
			XpequalsbrainModVariables.MapVariables.get(world).TargetOneX = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getX();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetOneY = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getY();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetOneZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getZ();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		} else if (DoubleArgumentType.getDouble(arguments, "Hedef") == 2) {
			XpequalsbrainModVariables.MapVariables.get(world).TargetTwoX = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getX();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetTwoY = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getY();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetTwoZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getZ();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		} else if (DoubleArgumentType.getDouble(arguments, "Hedef") == 3) {
			XpequalsbrainModVariables.MapVariables.get(world).TargetThreeX = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getX();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetThreeY = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getY();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetThreeZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getZ();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		} else if (DoubleArgumentType.getDouble(arguments, "Hedef") == 4) {
			XpequalsbrainModVariables.MapVariables.get(world).TargetFourX = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getX();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetFourY = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getY();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetFourZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getZ();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		} else if (DoubleArgumentType.getDouble(arguments, "Hedef") == 5) {
			XpequalsbrainModVariables.MapVariables.get(world).TargetFiveX = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getX();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetFiveY = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getY();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetFiveZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getZ();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		} else if (DoubleArgumentType.getDouble(arguments, "Hedef") == 6) {
			XpequalsbrainModVariables.MapVariables.get(world).TargetSixX = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getX();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetSixY = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getY();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetSixZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getZ();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		} else if (DoubleArgumentType.getDouble(arguments, "Hedef") == 7) {
			XpequalsbrainModVariables.MapVariables.get(world).TargetSevenX = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getX();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetSevenY = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getY();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetSevenZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getZ();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		} else if (DoubleArgumentType.getDouble(arguments, "Hedef") == 8) {
			XpequalsbrainModVariables.MapVariables.get(world).TargetEightX = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getX();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetEightY = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getY();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
			XpequalsbrainModVariables.MapVariables.get(world).TargetEightZ = entity.level.clip(new ClipContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getZ();
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
