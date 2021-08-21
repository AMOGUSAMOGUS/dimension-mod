package net.mcreator.dimensionmod.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.dimensionmod.item.FranciumFlaskShooterItem;
import net.mcreator.dimensionmod.item.FranciumFlaskItem;
import net.mcreator.dimensionmod.DimensionModModElements;
import net.mcreator.dimensionmod.DimensionModMod;

import java.util.Random;
import java.util.Map;

@DimensionModModElements.ModElement.Tag
public class FranciumFlaskThrowProcedure extends DimensionModModElements.ModElement {
	public FranciumFlaskThrowProcedure(DimensionModModElements instance) {
		super(instance, 64);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DimensionModMod.LOGGER.warn("Failed to load dependency entity for procedure FranciumFlaskThrow!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				DimensionModMod.LOGGER.warn("Failed to load dependency itemstack for procedure FranciumFlaskThrow!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof LivingEntity) {
			Entity _ent = entity;
			if (!_ent.world.isRemote()) {
				FranciumFlaskItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 0, (int) 0);
			}
		}
		{
			ItemStack _isc = (itemstack);
			final ItemStack _setstack = new ItemStack(FranciumFlaskShooterItem.block, (int) (1));
			final int _sltid = (int) (0);
			_setstack.setCount(
					(int) (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getCount()) - 1));
			_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable) {
					((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
				}
			});
		}
	}
}
