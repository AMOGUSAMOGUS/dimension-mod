package net.mcreator.dimensionmod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.dimensionmod.potion.ExplosionResistancePotionEffect;
import net.mcreator.dimensionmod.DimensionModMod;

import java.util.Map;
import java.util.Collection;

public class ExplodeResistProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DimensionModMod.LOGGER.warn("Failed to load dependency entity for procedure ExplodeResist!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DimensionModMod.LOGGER.warn("Failed to load dependency x for procedure ExplodeResist!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DimensionModMod.LOGGER.warn("Failed to load dependency y for procedure ExplodeResist!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DimensionModMod.LOGGER.warn("Failed to load dependency z for procedure ExplodeResist!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DimensionModMod.LOGGER.warn("Failed to load dependency world for procedure ExplodeResist!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == ExplosionResistancePotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 20, Explosion.Mode.BREAK);
			}
		}
	}
}
