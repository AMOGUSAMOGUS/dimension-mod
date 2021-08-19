
package net.mcreator.dimensionmod.item;

@DimensionModModElements.ModElement.Tag
public class SandyIngotItem extends DimensionModModElements.ModElement {

	@ObjectHolder("dimension_mod:sandy_ingot")
	public static final Item block = null;

	public SandyIngotItem(DimensionModModElements instance) {
		super(instance, 8);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("sandy_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
