
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.xpequalsbrain.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.xpequalsbrain.item.SmallXpItem;
import net.mcreator.xpequalsbrain.item.PolenItem;
import net.mcreator.xpequalsbrain.item.DurtmeCubuguItem;
import net.mcreator.xpequalsbrain.XpequalsbrainMod;

public class XpequalsbrainModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, XpequalsbrainMod.MODID);
	public static final RegistryObject<Item> SMALL_XP = REGISTRY.register("small_xp", () -> new SmallXpItem());
	public static final RegistryObject<Item> POLEN = REGISTRY.register("polen", () -> new PolenItem());
	public static final RegistryObject<Item> FRIENDLYBEE = REGISTRY.register("friendlybee_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.FRIENDLYBEE, -13312, -16777216,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DURTME_CUBUGU = REGISTRY.register("durtme_cubugu", () -> new DurtmeCubuguItem());
}
