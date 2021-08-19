
package net.mcreator.dimensionmod.world.structure;

@DimensionModModElements.ModElement.Tag
public class SpawnSmallSandyTempleStructure extends DimensionModModElements.ModElement {

	private static Feature<NoFeatureConfig> feature = null;
	private static ConfiguredFeature<?, ?> configuredFeature = null;

	public SpawnSmallSandyTempleStructure(DimensionModModElements instance) {
		super(instance, 27);

		MinecraftForge.EVENT_BUS.register(this);
		FMLJavaModLoadingContext.get().getModEventBus().register(new FeatureRegisterHandler());
	}

	private static class FeatureRegisterHandler {

		@SubscribeEvent
		public void registerFeature(RegistryEvent.Register<Feature<?>> event) {
			feature = new Feature<NoFeatureConfig>(NoFeatureConfig.field_236558_a_) {
				@Override
				public boolean generate(ISeedReader world, ChunkGenerator generator, Random random, BlockPos pos, NoFeatureConfig config) {
					int ci = (pos.getX() >> 4) << 4;
					int ck = (pos.getZ() >> 4) << 4;

					RegistryKey<World> dimensionType = world.getWorld().getDimensionKey();
					boolean dimensionCriteria = false;

					if (dimensionType == RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("dimension_mod:collapsing_dimension")))
						dimensionCriteria = true;

					if (!dimensionCriteria)
						return false;

					if ((random.nextInt(1000000) + 1) <= 1000000) {
						int count = random.nextInt(1) + 1;
						for (int a = 0; a < count; a++) {
							int i = ci + random.nextInt(16);
							int k = ck + random.nextInt(16);
							int j = world.getHeight(Heightmap.Type.OCEAN_FLOOR_WG, i, k);

							j = Math.abs(random.nextInt(Math.max(1, j)) - 24);

							BlockState blockAt = world.getBlockState(new BlockPos(i, j, k));
							boolean blockCriteria = false;
							if (blockAt.getBlock() == Blocks.SANDSTONE.getDefaultState().getBlock())
								blockCriteria = true;
							if (blockAt.getBlock() == Blocks.SAND.getDefaultState().getBlock())
								blockCriteria = true;
							if (blockAt.getBlock() == FrozenSandBlock.block.getDefaultState().getBlock())
								blockCriteria = true;
							if (!blockCriteria)
								continue;

							Rotation rotation = Rotation.values()[random.nextInt(3)];
							Mirror mirror = Mirror.values()[random.nextInt(2)];

							BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);

							int x = spawnTo.getX();
							int y = spawnTo.getY();
							int z = spawnTo.getZ();

							if (!

							SpawnSmallSandyTempleAdditionalGenerationConditionProcedure
									.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
								continue;

							Template template = world.getWorld().getStructureTemplateManager()
									.getTemplateDefaulted(new ResourceLocation("dimension_mod", "smallsandytemple"));

							if (template == null)
								return false;

							template.func_237144_a_(world, spawnTo,
									new PlacementSettings().setRotation(rotation).setRandom(random).setMirror(mirror)
											.addProcessor(BlockIgnoreStructureProcessor.STRUCTURE_BLOCK).setChunk(null).setIgnoreEntities(false),
									random);

						}
					}

					return true;
				}
			};

			configuredFeature = feature.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
					.withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG));

			event.getRegistry().register(feature.setRegistryName("spawn_small_sandy_temple"));
			Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation("dimension_mod:spawn_small_sandy_temple"),
					configuredFeature);
		}

	}

	@SubscribeEvent
	public void addFeatureToBiomes(BiomeLoadingEvent event) {

		event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_STRUCTURES).add(() -> configuredFeature);
	}

}
