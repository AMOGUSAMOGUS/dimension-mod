
package net.mcreator.dimensionmod.item;

@DimensionModModElements.ModElement.Tag
public class SandyHoeItem extends DimensionModModElements.ModElement {

	@ObjectHolder("dimension_mod:sandy_hoe")
	public static final Item block = null;

	public SandyHoeItem(DimensionModModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1800;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SandyIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("sandy_hoe"));
	}

}
