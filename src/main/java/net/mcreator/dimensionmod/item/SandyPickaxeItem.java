
package net.mcreator.dimensionmod.item;

@DimensionModModElements.ModElement.Tag
public class SandyPickaxeItem extends DimensionModModElements.ModElement {

	@ObjectHolder("dimension_mod:sandy_pickaxe")
	public static final Item block = null;

	public SandyPickaxeItem(DimensionModModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1800;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SandyIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("sandy_pickaxe"));
	}

}
