
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.xpequalsbrain.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.xpequalsbrain.entity.ZombieBossEpicEntity;
import net.mcreator.xpequalsbrain.entity.TargetEntityEntity;
import net.mcreator.xpequalsbrain.entity.StephenHawkingEntity;
import net.mcreator.xpequalsbrain.entity.KotuBitkiEntity;
import net.mcreator.xpequalsbrain.entity.HerobrineEntity;
import net.mcreator.xpequalsbrain.entity.FriendlybeeEntity;
import net.mcreator.xpequalsbrain.entity.FireballEntity;
import net.mcreator.xpequalsbrain.entity.EinsteinEntity;
import net.mcreator.xpequalsbrain.entity.BuyucuEntity;
import net.mcreator.xpequalsbrain.entity.BayrakEntity;
import net.mcreator.xpequalsbrain.XpequalsbrainMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class XpequalsbrainModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, XpequalsbrainMod.MODID);
	public static final RegistryObject<EntityType<FriendlybeeEntity>> FRIENDLYBEE = register("friendlybee",
			EntityType.Builder.<FriendlybeeEntity>of(FriendlybeeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FriendlybeeEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<EinsteinEntity>> EINSTEIN = register("einstein",
			EntityType.Builder.<EinsteinEntity>of(EinsteinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(EinsteinEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StephenHawkingEntity>> STEPHEN_HAWKING = register("stephen_hawking",
			EntityType.Builder.<StephenHawkingEntity>of(StephenHawkingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StephenHawkingEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZombieBossEpicEntity>> ZOMBIE_BOSS_EPIC = register("zombie_boss_epic",
			EntityType.Builder.<ZombieBossEpicEntity>of(ZombieBossEpicEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombieBossEpicEntity::new)

					.sized(1.5f, 2.5f));
	public static final RegistryObject<EntityType<HerobrineEntity>> HEROBRINE = register("herobrine",
			EntityType.Builder.<HerobrineEntity>of(HerobrineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HerobrineEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KotuBitkiEntity>> KOTU_BITKI = register("kotu_bitki",
			EntityType.Builder.<KotuBitkiEntity>of(KotuBitkiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KotuBitkiEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<BuyucuEntity>> BUYUCU = register("buyucu",
			EntityType.Builder.<BuyucuEntity>of(BuyucuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BuyucuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TargetEntityEntity>> TARGET_ENTITY = register("target_entity",
			EntityType.Builder.<TargetEntityEntity>of(TargetEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TargetEntityEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<FireballEntity>> FIREBALL = register("projectile_fireball",
			EntityType.Builder.<FireballEntity>of(FireballEntity::new, MobCategory.MISC).setCustomClientFactory(FireballEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BayrakEntity>> BAYRAK = register("bayrak",
			EntityType.Builder.<BayrakEntity>of(BayrakEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(0)
					.setUpdateInterval(3).setCustomClientFactory(BayrakEntity::new)

					.sized(1f, 2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FriendlybeeEntity.init();
			EinsteinEntity.init();
			StephenHawkingEntity.init();
			ZombieBossEpicEntity.init();
			HerobrineEntity.init();
			KotuBitkiEntity.init();
			BuyucuEntity.init();
			TargetEntityEntity.init();
			BayrakEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FRIENDLYBEE.get(), FriendlybeeEntity.createAttributes().build());
		event.put(EINSTEIN.get(), EinsteinEntity.createAttributes().build());
		event.put(STEPHEN_HAWKING.get(), StephenHawkingEntity.createAttributes().build());
		event.put(ZOMBIE_BOSS_EPIC.get(), ZombieBossEpicEntity.createAttributes().build());
		event.put(HEROBRINE.get(), HerobrineEntity.createAttributes().build());
		event.put(KOTU_BITKI.get(), KotuBitkiEntity.createAttributes().build());
		event.put(BUYUCU.get(), BuyucuEntity.createAttributes().build());
		event.put(TARGET_ENTITY.get(), TargetEntityEntity.createAttributes().build());
		event.put(BAYRAK.get(), BayrakEntity.createAttributes().build());
	}
}
