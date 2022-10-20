package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

public class MiracleGrowthItemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		double YerelX = 0;
		double YerelZ = 0;
		double YerelY = 0;
		double Yerlestir = 0;
		double blocksPlaced = 0;
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent("\u00A74 SA\u011E TIKLANDI"), ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (Blocks.GRASS_BLOCK == blockstate.getBlock()) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent("D\u00D6NG\u00DCYE G\u0130R\u0130LD\u0130"), ChatType.SYSTEM,
							Util.NIL_UUID);
			}
			YerelX = 5 + entity.getX();
			YerelY = 60 + entity.getY();
			YerelZ = 5 + entity.getZ();
			Yerlestir = 4;
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent("DE\u011EERLER ATANDI"), ChatType.SYSTEM, Util.NIL_UUID);
			}
			for (int index0 = 0; index0 < (int) (9); index0++) {
				for (int index1 = 0; index1 < (int) (10); index1++) {
					for (int index2 = 0; index2 < (int) (999); index2++) {
						if (Yerlestir != 0) {
							Yerlestir = Yerlestir - 1;
							if (!world.isClientSide()) {
								MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
								if (_mcserv != null)
									_mcserv.getPlayerList().broadcastMessage(new TextComponent("D\u00F6ng\u00FCden \u00C7\u0131k\u0131l\u0131yor"),
											ChatType.SYSTEM, Util.NIL_UUID);
							}
							break;
						} else {
							if (Blocks.AIR == (world.getBlockState(new BlockPos(YerelX, YerelY, YerelZ))).getBlock()) {
								if (!world.isClientSide()) {
									MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
									if (_mcserv != null)
										_mcserv.getPlayerList().broadcastMessage(new TextComponent("Hava blo\u011Funday\u0131m!"), ChatType.SYSTEM,
												Util.NIL_UUID);
								}
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
								world.setBlock(new BlockPos(YerelX, YerelY, YerelZ), Blocks.AMETHYST_BLOCK.defaultBlockState(), 3);
								Yerlestir = Math.ceil(2 + Math.random() * 10);
								blocksPlaced = blocksPlaced + 1;
								if (!world.isClientSide()) {
									MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
									if (_mcserv != null)
										_mcserv.getPlayerList()
												.broadcastMessage(new TextComponent(("\u00A7e\u00A7lBLOK YERLE\u015ET\u0130R\u0130LD\u0130: "
														+ new java.text.DecimalFormat("##.## ").format(YerelX)
														+ new java.text.DecimalFormat("##.## ").format(YerelY)
														+ new java.text.DecimalFormat("##.## ").format(YerelZ)
														+ new java.text.DecimalFormat(", ## adet blok yerle\u015Ftirildi").format(blocksPlaced))),
														ChatType.SYSTEM, Util.NIL_UUID);
								}
								break;
							}
						}
					}
					YerelX = YerelX - 1;
					YerelY = 60 + entity.getY();
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent("Sat\u0131r boyu d\u00F6ng\u00FC tekrarlan\u0131yor"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
				YerelZ = YerelZ - 1;
				YerelX = YerelX + 11;
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(new TextComponent("S\u00FCtun boyu d\u00F6ng\u00FC s\u0131radakine ge\u00E7iyor"),
								ChatType.SYSTEM, Util.NIL_UUID);
				}
			}
		}
	}
}
