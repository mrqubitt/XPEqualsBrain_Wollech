
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.xpequalsbrain.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.xpequalsbrain.item.SmallXpItem;
import net.mcreator.xpequalsbrain.item.PolenItem;
import net.mcreator.xpequalsbrain.XpequalsbrainMod;

public class XpequalsbrainModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, XpequalsbrainMod.MODID);
	public static final RegistryObject<Item> SMALL_XP = REGISTRY.register("small_xp", () -> new SmallXpItem());
	public static final RegistryObject<Item> POLEN = REGISTRY.register("polen", () -> new PolenItem());
}
