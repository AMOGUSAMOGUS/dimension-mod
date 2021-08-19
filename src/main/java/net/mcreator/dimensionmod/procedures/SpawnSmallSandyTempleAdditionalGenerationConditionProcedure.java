package net.mcreator.dimensionmod.procedures;

@DimensionModModElements.ModElement.Tag
public class SpawnSmallSandyTempleAdditionalGenerationConditionProcedure extends DimensionModModElements.ModElement {

	public SpawnSmallSandyTempleAdditionalGenerationConditionProcedure(DimensionModModElements instance) {
		super(instance, 30);

	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DimensionModMod.LOGGER.warn("Failed to load dependency x for procedure SpawnSmallSandyTempleAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DimensionModMod.LOGGER.warn("Failed to load dependency y for procedure SpawnSmallSandyTempleAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DimensionModMod.LOGGER.warn("Failed to load dependency z for procedure SpawnSmallSandyTempleAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DimensionModMod.LOGGER.warn("Failed to load dependency world for procedure SpawnSmallSandyTempleAdditionalGenerationCondition!");
			return false;
		}

		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z)))) {
			if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 10), (int) z)))) {
				return (true);
			}
		}
		return (false);

	}

}
