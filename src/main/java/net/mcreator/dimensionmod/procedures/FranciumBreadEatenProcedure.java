package net.mcreator.dimensionmod.procedures;

public class FranciumBreadEatenProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DimensionModMod.LOGGER.warn("Failed to load dependency entity for procedure FranciumBreadEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		DimensionModMod.LOGGER.debug("?????????????????????!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!????????????????????");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(NormalBreadEatenPotionEffect.potion, (int) 99999, (int) 1));
	}

}
