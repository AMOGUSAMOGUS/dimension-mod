
package net.mcreator.dimensionmod.world.biome;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.ParticleEffectAmbience;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.audio.BackgroundMusicSelector;

import net.mcreator.dimensionmod.particle.CryingPortalParticle;
import net.mcreator.dimensionmod.block.CryingNetherrackBlock;
import net.mcreator.dimensionmod.DimensionModModElements;

@DimensionModModElements.ModElement.Tag
public class CryingNetherWastesBiome extends DimensionModModElements.ModElement {
	public static Biome biome;
	public CryingNetherWastesBiome(DimensionModModElements instance) {
		super(instance, 3);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-65485).setWaterColor(4159204).setWaterFogColor(-13369549)
						.withSkyColor(-65485).withFoliageColor(-10066432).withGrassColor(-10066432)
						.setMusic(new BackgroundMusicSelector((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("dimension_mod:crying-wastes-music")), 12000, 24000, true))
						.setParticle(new ParticleEffectAmbience(CryingPortalParticle.particle, 0.005f)).build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().withSurfaceBuilder(
						SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(CryingNetherrackBlock.block.getDefaultState(),
								CryingNetherrackBlock.block.getDefaultState(), CryingNetherrackBlock.block.getDefaultState())));
				DefaultBiomeFeatures.withCavesAndCanyons(biomeGenerationSettings);
				DefaultBiomeFeatures.withOverworldOres(biomeGenerationSettings);
				DefaultBiomeFeatures.withFrozenTopLayer(biomeGenerationSettings);
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				biome = new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.NETHER).depth(0.1f).scale(0.2f)
						.temperature(0.5f).downfall(0f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("dimension_mod:crying_nether_wastes"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
