
package net.mcreator.dimensionmod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.dimensionmod.item.SandyScrapItem;
import net.mcreator.dimensionmod.item.SandyIngotItem;

@DimensionModModElements.ModElement.Tag
public class SandyIngotRecipeBrewingRecipe extends DimensionModModElements.ModElement {
	public SandyIngotRecipeBrewingRecipe(DimensionModModElements instance) {
		super(instance, 9);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT, (int) (1))),
				Ingredient.fromStacks(new ItemStack(SandyScrapItem.block, (int) (1))), new ItemStack(SandyIngotItem.block, (int) (1)));
	}
}
