package net.mcreator.xpequalsbrain.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

public class TitleActivatorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(),
							null).withSuppressedOutput(),
					("title @a subtitle \"\u00A7eIQ seviyen: " + "\u00A7a\u00A7b" + XpequalsbrainModVariables.MapVariables.get(world).IQ_NAME
							+ "\u00A7e\u00A7r\""));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"title @a title \"\u00A79\u00A7lBEYN\u0130N B\u00DCY\u00DCD\u00DC!\"");
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.GLOW, x, y, z, 50, 1, 2, 1, 0.3);
	}
}
