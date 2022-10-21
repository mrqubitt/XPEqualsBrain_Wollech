
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
import net.mcreator.xpequalsbrain.item.RocketItem;
import net.mcreator.xpequalsbrain.item.PolenItem;
import net.mcreator.xpequalsbrain.item.MonsterPotionItem;
import net.mcreator.xpequalsbrain.item.MiracleGrowthItemItem;
import net.mcreator.xpequalsbrain.item.MagicianNetherItem;
import net.mcreator.xpequalsbrain.item.IcebootsItem;
import net.mcreator.xpequalsbrain.item.HerobrineXpItem;
import net.mcreator.xpequalsbrain.item.HerobrineLaserItem;
import net.mcreator.xpequalsbrain.item.FireballItem;
import net.mcreator.xpequalsbrain.item.DurtmeCubuguItem;
import net.mcreator.xpequalsbrain.item.DurtenKazmaItem;
import net.mcreator.xpequalsbrain.item.DehalarinIqsuItem;
import net.mcreator.xpequalsbrain.item.CorapItem;
import net.mcreator.xpequalsbrain.item.CanavarOzuItem;
import net.mcreator.xpequalsbrain.item.BuyucuPortaliTasiItemItem;
import net.mcreator.xpequalsbrain.item.BuyuKitabiItem;
import net.mcreator.xpequalsbrain.item.BookOfSorcererItem;
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
	public static final RegistryObject<Item> EINSTEIN = REGISTRY.register("einstein_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.EINSTEIN, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> STEPHEN_HAWKING = REGISTRY.register("stephen_hawking_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.STEPHEN_HAWKING, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DEHALARIN_IQSU = REGISTRY.register("dehalarin_iqsu", () -> new DehalarinIqsuItem());
	public static final RegistryObject<Item> ZOMBIE_BOSS_EPIC = REGISTRY.register("zombie_boss_epic_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.ZOMBIE_BOSS_EPIC, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HEROBRINE = REGISTRY.register("herobrine_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.HEROBRINE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HEROBRINE_LASER = REGISTRY.register("herobrine_laser", () -> new HerobrineLaserItem());
	public static final RegistryObject<Item> HEROBRINE_XP = REGISTRY.register("herobrine_xp", () -> new HerobrineXpItem());
	public static final RegistryObject<Item> MIRACLE_GROWTH_ITEM = REGISTRY.register("miracle_growth_item", () -> new MiracleGrowthItemItem());
	public static final RegistryObject<Item> CANAVAR_OZU = REGISTRY.register("canavar_ozu", () -> new CanavarOzuItem());
	public static final RegistryObject<Item> MONSTER_POTION = REGISTRY.register("monster_potion", () -> new MonsterPotionItem());
	public static final RegistryObject<Item> BUYU_KITABI = REGISTRY.register("buyu_kitabi", () -> new BuyuKitabiItem());
	public static final RegistryObject<Item> KOTU_BITKI = REGISTRY.register("kotu_bitki_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.KOTU_BITKI, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BUYUCU_PORTALI_TASI_ITEM = REGISTRY.register("buyucu_portali_tasi_item",
			() -> new BuyucuPortaliTasiItemItem());
	public static final RegistryObject<Item> MAGICIAN_NETHER = REGISTRY.register("magician_nether", () -> new MagicianNetherItem());
	public static final RegistryObject<Item> BUYUCU = REGISTRY.register("buyucu_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.BUYUCU, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TARGET_ENTITY = REGISTRY.register("target_entity_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.TARGET_ENTITY, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> FIREBALL = REGISTRY.register("fireball", () -> new FireballItem());
	public static final RegistryObject<Item> BAYRAK = REGISTRY.register("bayrak_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.BAYRAK, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ICEBOOTS_BOOTS = REGISTRY.register("iceboots_boots", () -> new IcebootsItem.Boots());
	public static final RegistryObject<Item> KOTU_BUYUCU = REGISTRY.register("kotu_buyucu_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.KOTU_BUYUCU, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BOOK_OF_SORCERER = REGISTRY.register("book_of_sorcerer", () -> new BookOfSorcererItem());
	public static final RegistryObject<Item> ROKET = REGISTRY.register("roket_spawn_egg",
			() -> new ForgeSpawnEggItem(XpequalsbrainModEntities.ROKET, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ROCKET = REGISTRY.register("rocket", () -> new RocketItem());
}
