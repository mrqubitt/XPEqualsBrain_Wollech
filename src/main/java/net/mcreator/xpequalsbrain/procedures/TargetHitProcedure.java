package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

public class TargetHitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		XpequalsbrainModVariables.MapVariables
				.get(world).BuyucuTargetHitCount = XpequalsbrainModVariables.MapVariables.get(world).BuyucuTargetHitCount + 1;
		XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					("bossbar set wollech:hedef value "
							+ new java.text.DecimalFormat("##").format(8 - XpequalsbrainModVariables.MapVariables.get(world).BuyucuTargetHitCount)));
		if (sourceentity instanceof Player && 8 - XpequalsbrainModVariables.MapVariables.get(world).BuyucuTargetHitCount == 0) {
			XpequalsbrainModVariables.MapVariables.get(world).HedefGorevBasarili = true;
			XpequalsbrainModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
