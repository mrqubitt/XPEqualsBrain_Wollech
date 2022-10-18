package net.mcreator.xpequalsbrain.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.xpequalsbrain.network.XpequalsbrainModVariables;

public class BuildActualLabProcedure {
	public static void execute(LevelAccessor world) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null,
						new BlockPos(XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
								XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.NEUTRAL, 20, 1);
			} else {
				_level.playLocalSound(XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
						XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ,
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.NEUTRAL, 20, 1, false);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
					XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ, 50, 10, 5,
					10, Math.random());
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
								XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.NEUTRAL, 20, 1);
					} else {
						_level.playLocalSound(XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
								XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.NEUTRAL, 20, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
							XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ, 50,
							10, 5, 10, Math.random());
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 20);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null,
						new BlockPos(XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
								XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grindstone.use")), SoundSource.NEUTRAL, 20, 1);
			} else {
				_level.playLocalSound(XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
						XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ,
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grindstone.use")), SoundSource.NEUTRAL, 20, 1, false);
			}
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
								XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.NEUTRAL, 20, 1);
					} else {
						_level.playLocalSound(XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
								XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.NEUTRAL, 20, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
							XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ, 50,
							10, 5, 10, Math.random());
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
								XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grindstone.use")), SoundSource.NEUTRAL, 20, 1);
					} else {
						_level.playLocalSound(XpequalsbrainModVariables.MapVariables.get(world).LabLocX,
								XpequalsbrainModVariables.MapVariables.get(world).LabLocY, XpequalsbrainModVariables.MapVariables.get(world).LabLocZ,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grindstone.use")), SoundSource.NEUTRAL, 20, 1,
								false);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 40);
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("xpequalsbrain", "lab"));
					if (template != null) {
						template.placeInWorld(_serverworld,
								new BlockPos(XpequalsbrainModVariables.MapVariables.get(world).LabLocX - 5,
										XpequalsbrainModVariables.MapVariables.get(world).LabLocY - 1,
										XpequalsbrainModVariables.MapVariables.get(world).LabLocZ - 8),
								new BlockPos(XpequalsbrainModVariables.MapVariables.get(world).LabLocX - 5,
										XpequalsbrainModVariables.MapVariables.get(world).LabLocY - 1,
										XpequalsbrainModVariables.MapVariables.get(world).LabLocZ - 8),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 45);
	}
}
