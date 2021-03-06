
package net.mcreator.dimensionmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.dimensionmod.DimensionModModElements;

@DimensionModModElements.ModElement.Tag
public class SandyAxeItem extends DimensionModModElements.ModElement {
	@ObjectHolder("dimension_mod:sandy_axe")
	public static final Item block = null;
	public SandyAxeItem(DimensionModModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1800;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 9f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SandyIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("sandy_axe"));
	}
}
