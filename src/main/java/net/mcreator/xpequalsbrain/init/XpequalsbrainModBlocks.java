
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.xpequalsbrain.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.xpequalsbrain.block.MagicianNetherPortalBlock;
import net.mcreator.xpequalsbrain.XpequalsbrainMod;

public class XpequalsbrainModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, XpequalsbrainMod.MODID);
	public static final RegistryObject<Block> MAGICIAN_NETHER_PORTAL = REGISTRY.register("magician_nether_portal",
			() -> new MagicianNetherPortalBlock());
}
