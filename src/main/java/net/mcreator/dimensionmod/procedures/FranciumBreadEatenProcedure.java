package net.mcreator.dimensionmod.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.dimensionmod.potion.NormalBreadEatenPotionEffect;
import net.mcreator.dimensionmod.DimensionModMod;

import java.util.Map;

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
			((LivingEntity) entity).addPotionEffect(new EffectInstance(NormalBreadEatenPotionEffect.potion, (int) 60, (int) 1));
	}
}
