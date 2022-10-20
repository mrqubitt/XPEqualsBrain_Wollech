package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.Util;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

public class MonsterPotionPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean varildi = false;
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(
						new TextComponent("\u00A7a[!]\u00A7e\u00A7l Olamaz! Buna acilen bir ila\u00E7 bulmal\u0131s\u0131n!"), ChatType.SYSTEM,
						Util.NIL_UUID);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")),
						SoundSource.AMBIENT, 1, (float) 0.7);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")),
						SoundSource.AMBIENT, 1, (float) 0.7, false);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.AMBIENT, 2, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")),
						SoundSource.AMBIENT, 2, 1, false);
			}
		}
		while (!varildi) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("title @a actionbar \"\u0130laca olan uzakl\u0131k: " + ""
								+ new java.text.DecimalFormat("##")
										.format(Math.sqrt((XpequalsbrainModVariables.MapVariables.get(world).WitchX - entity.getX())
												* (XpequalsbrainModVariables.MapVariables.get(world).WitchX - entity.getX())
												+ (XpequalsbrainModVariables.MapVariables.get(world).WitchZ - entity.getZ())
														* (XpequalsbrainModVariables.MapVariables.get(world).WitchZ - entity.getZ())))
								+ "\""));
			if (Math.sqrt((XpequalsbrainModVariables.MapVariables.get(world).WitchX - entity.getX())
					* (XpequalsbrainModVariables.MapVariables.get(world).WitchX - entity.getX())
					+ (XpequalsbrainModVariables.MapVariables.get(world).WitchZ - entity.getZ())
							* (XpequalsbrainModVariables.MapVariables.get(world).WitchZ - entity.getZ())) < 10) {
				varildi = true;
				break;
			}
		}
	}
}
