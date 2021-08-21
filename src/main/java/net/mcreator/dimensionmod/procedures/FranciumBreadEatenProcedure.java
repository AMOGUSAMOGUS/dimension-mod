package net.mcreator.dimensionmod.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.dimensionmod.potion.ExplosionResistancePotion;
import net.mcreator.dimensionmod.DimensionModModElements;
import net.mcreator.dimensionmod.DimensionModMod;

import java.util.Map;

@DimensionModModElements.ModElement.Tag
public class FranciumBreadEatenProcedure extends DimensionModModElements.ModElement {
	public FranciumBreadEatenProcedure(DimensionModModElements instance) {
		super(instance, 71);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DimensionModMod.LOGGER.warn("Failed to load dependency entity for procedure FranciumBreadEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		DimensionModMod.LOGGER.debug("?????????????????????!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!????????????????????");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(ExplosionResistancePotion.potion, (int) 60, (int) 1));
	}
}
