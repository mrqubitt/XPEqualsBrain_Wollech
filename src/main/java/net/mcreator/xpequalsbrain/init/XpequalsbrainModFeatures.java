
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.xpequalsbrain.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.xpequalsbrain.world.features.WitchHutFeature;
import net.mcreator.xpequalsbrain.world.features.LabFeature;
import net.mcreator.xpequalsbrain.world.features.Kale4Feature;
import net.mcreator.xpequalsbrain.world.features.Kale3Feature;
import net.mcreator.xpequalsbrain.world.features.Kale2Feature;
import net.mcreator.xpequalsbrain.world.features.Kale1Feature;
import net.mcreator.xpequalsbrain.world.features.CloudPlatformFeature;
import net.mcreator.xpequalsbrain.XpequalsbrainMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class XpequalsbrainModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, XpequalsbrainMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> LAB = register("lab", LabFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, LabFeature.GENERATE_BIOMES, LabFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CLOUD_PLATFORM = register("cloud_platform", CloudPlatformFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, CloudPlatformFeature.GENERATE_BIOMES, CloudPlatformFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WITCH_HUT = register("witch_hut", WitchHutFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, WitchHutFeature.GENERATE_BIOMES, WitchHutFeature::placedFeature));
	public static final RegistryObject<Feature<?>> KALE_1 = register("kale_1", Kale1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Kale1Feature.GENERATE_BIOMES, Kale1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> KALE_2 = register("kale_2", Kale2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Kale2Feature.GENERATE_BIOMES, Kale2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> KALE_3 = register("kale_3", Kale3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Kale3Feature.GENERATE_BIOMES, Kale3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> KALE_4 = register("kale_4", Kale4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Kale4Feature.GENERATE_BIOMES, Kale4Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
