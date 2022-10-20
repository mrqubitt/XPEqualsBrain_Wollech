package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MonsterPotionPlayerFinishesUsingItemProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean varildi = false;
		if (XpequalsbrainModVariables.MapVariables.get(world).WitchCompassActivate) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4,
								"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
						("title @a actionbar \"\u00A7e\u00A7l\u0130laca olan uzakl\u0131k: \u00A76\u00A7l" + ""
								+ new java.text.DecimalFormat("##")
										.format(Math.round(Math.sqrt((XpequalsbrainModVariables.MapVariables.get(world).WitchX - entity.getX())
												* (XpequalsbrainModVariables.MapVariables.get(world).WitchX - entity.getX())
												+ (XpequalsbrainModVariables.MapVariables.get(world).WitchZ - entity.getZ())
														* (XpequalsbrainModVariables.MapVariables.get(world).WitchZ - entity.getZ()))))
								+ "\""));
		}
	}
}
