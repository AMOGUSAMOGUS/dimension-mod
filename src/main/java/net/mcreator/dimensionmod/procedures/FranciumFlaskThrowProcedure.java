package net.mcreator.dimensionmod.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.dimensionmod.item.FranciumFlaskShooterItem;
import net.mcreator.dimensionmod.item.FranciumFlaskItem;
import net.mcreator.dimensionmod.DimensionModMod;

import java.util.Random;
import java.util.Map;

public class FranciumFlaskThrowProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DimensionModMod.LOGGER.warn("Failed to load dependency entity for procedure FranciumFlaskThrow!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			Entity _ent = entity;
			if (!_ent.world.isRemote()) {
				FranciumFlaskItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 0, (int) 0);
			}
		}
		if (entity instanceof LivingEntity) {
			ItemStack _setstack = new ItemStack(FranciumFlaskShooterItem.block);
			_setstack.setCount(
					(int) (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getCount()) - 1));
			((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
	}
}
