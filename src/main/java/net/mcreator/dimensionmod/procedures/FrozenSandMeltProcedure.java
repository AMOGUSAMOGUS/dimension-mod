package net.mcreator.dimensionmod.procedures;

import org.spongepowered.asm.util.Counter;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.dimensionmod.block.FrozenSandBlock;
import net.mcreator.dimensionmod.DimensionModMod;

import java.util.Map;

public class FrozenSandMeltProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DimensionModMod.LOGGER.warn("Failed to load dependency x for procedure FrozenSandMelt!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DimensionModMod.LOGGER.warn("Failed to load dependency y for procedure FrozenSandMelt!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DimensionModMod.LOGGER.warn("Failed to load dependency z for procedure FrozenSandMelt!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DimensionModMod.LOGGER.warn("Failed to load dependency world for procedure FrozenSandMelt!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double SandMeltRedius = 0;
		double Counter = 0;
		SandMeltRedius = (double) 5;
		Counter = (double) SandMeltRedius;
		for (int index0 = 0; index0 < (int) (SandMeltRedius); index0++) {
			Counter = (double) (Counter - 1);
			if (((world.getBlockState(new BlockPos((int) (x + Counter), (int) y, (int) z))).getBlock() == FrozenSandBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) (x + Counter), (int) y, (int) z);
					BlockState _bs = Blocks.SAND.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos((int) (x - Counter), (int) y, (int) z))).getBlock() == FrozenSandBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) (x - Counter), (int) y, (int) z);
					BlockState _bs = Blocks.SAND.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) (y + Counter), (int) z))).getBlock() == FrozenSandBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + Counter), (int) z);
					BlockState _bs = Blocks.SAND.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) (y - Counter), (int) z))).getBlock() == FrozenSandBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y - Counter), (int) z);
					BlockState _bs = Blocks.SAND.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + Counter)))).getBlock() == FrozenSandBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + Counter));
					BlockState _bs = Blocks.SAND.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - Counter)))).getBlock() == FrozenSandBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - Counter));
					BlockState _bs = Blocks.SAND.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
		}
	}
}
