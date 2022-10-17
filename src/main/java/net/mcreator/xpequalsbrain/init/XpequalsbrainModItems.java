
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

import net.mcreator.xpequalsbrain.item.TutamacliDurtmeCubuguItem;
import net.mcreator.xpequalsbrain.item.SmallXpItem;
import net.mcreator.xpequalsbrain.item.PolenItem;
import net.mcreator.xpequalsbrain.item.DurtmeCubuguItem;
import net.mcreator.xpequalsbrain.item.DurtenKazmaItem;
import net.mcreator.xpequalsbrain.item.CorapItem;
import net.mcreator.xpequalsbrain.item.AutoSmeltPickaxeItem;
import net.mcreator.xpequalsbrain.XpequalsbrainMod;

public class XpequalsbrainModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, XpequalsbrainMod.MODID);
	public static final RegistryObject<Item> SMALL_XP = REGISTRY.register("small_xp", () -> new SmallXpItem());
	public static final RegistryObject<Item> POLEN = REGISTRY.register("polen", () -> new PolenItem());
	public static final RegistryObject<Item> FRIENDLYBEE = REGISTRY.register("friendlybee_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.FRIENDLYBEE, -13312, -16777216,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DURTME_CUBUGU = REGISTRY.register("durtme_cubugu", () -> new DurtmeCubuguItem());
	public static final RegistryObject<Item> TUTAMACLI_DURTME_CUBUGU = REGISTRY.register("tutamacli_durtme_cubugu",
			() -> new TutamacliDurtmeCubuguItem());
	public static final RegistryObject<Item> CORAP_BOOTS = REGISTRY.register("corap_boots", () -> new CorapItem.Boots());
	public static final RegistryObject<Item> DURTEN_KAZMA = REGISTRY.register("durten_kazma", () -> new DurtenKazmaItem());
	public static final RegistryObject<Item> AUTO_SMELT_PICKAXE = REGISTRY.register("auto_smelt_pickaxe", () -> new AutoSmeltPickaxeItem());
}
