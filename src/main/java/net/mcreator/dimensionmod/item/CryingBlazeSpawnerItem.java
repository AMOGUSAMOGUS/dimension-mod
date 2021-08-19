
package net.mcreator.dimensionmod.item;

@DimensionModModElements.ModElement.Tag
public class CryingBlazeSpawnerItem extends DimensionModModElements.ModElement {

	@ObjectHolder("dimension_mod:crying_blaze_spawner")
	public static final Item block = null;

	public CryingBlazeSpawnerItem(DimensionModModElements instance) {
		super(instance, 28);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("crying_blaze_spawner");
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
