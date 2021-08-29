package net.mcreator.dimensionmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.dimensionmod.item.BlazeKingsCrownItem;
import net.mcreator.dimensionmod.entity.BlazeKingEntity;
import net.mcreator.dimensionmod.DimensionModMod;

import java.util.Map;

public class SummonBlazeKingProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DimensionModMod.LOGGER.warn("Failed to load dependency entity for procedure SummonBlazeKing!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DimensionModMod.LOGGER.warn("Failed to load dependency x for procedure SummonBlazeKing!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DimensionModMod.LOGGER.warn("Failed to load dependency y for procedure SummonBlazeKing!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DimensionModMod.LOGGER.warn("Failed to load dependency z for procedure SummonBlazeKing!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DimensionModMod.LOGGER.warn("Failed to load dependency world for procedure SummonBlazeKing!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.world.getDimensionKey()) == (RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
				new ResourceLocation("dimension_mod:crying_nether"))))) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new BlazeKingEntity.CustomEntity(BlazeKingEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(BlazeKingsCrownItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (world.isRemote()) {
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BlazeKingsCrownItem.block));
			}
		} else if (((entity.world.getDimensionKey()) == (World.THE_NETHER))) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new BlazeKingEntity.CustomEntity(BlazeKingEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(BlazeKingsCrownItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (world.isRemote()) {
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(BlazeKingsCrownItem.block));
			}
		}
	}
}
