
package net.mcreator.dimensionmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.dimensionmod.DimensionModModElements;

@DimensionModModElements.ModElement.Tag
public class SandyShovelItem extends DimensionModModElements.ModElement {
	@ObjectHolder("dimension_mod:sandy_shovel")
	public static final Item block = null;
	public SandyShovelItem(DimensionModModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1800;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SandyIngotItem.block));
			}
		}, 1, -2.4f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("sandy_shovel"));
	}
}
