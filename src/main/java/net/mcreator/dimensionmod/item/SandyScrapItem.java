
package net.mcreator.dimensionmod.item;

@DimensionModModElements.ModElement.Tag
public class SandyScrapItem extends DimensionModModElements.ModElement {

	@ObjectHolder("dimension_mod:sandy_scrap")
	public static final Item block = null;

	public SandyScrapItem(DimensionModModElements instance) {
		super(instance, 6);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("sandy_scrap");
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
