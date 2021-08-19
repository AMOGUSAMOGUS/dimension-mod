
package net.mcreator.dimensionmod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.dimensionmod.DimensionModModElements;

import java.util.List;
import java.util.Collections;

@DimensionModModElements.ModElement.Tag
public class CryingNetherBrickBlock extends DimensionModModElements.ModElement {
	@ObjectHolder("dimension_mod:crying_nether_brick")
	public static final Block block = null;
	public CryingNetherBrickBlock(DimensionModModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.NETHER_BRICK).hardnessAndResistance(1.2f, 10f).setLightLevel(s -> 1)
					.harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool().slipperiness(0.65f));
			setRegistryName("crying_nether_brick");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
