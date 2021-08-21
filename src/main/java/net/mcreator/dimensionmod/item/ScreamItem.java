
package net.mcreator.dimensionmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.dimensionmod.DimensionModModElements;

@DimensionModModElements.ModElement.Tag
public class ScreamItem extends DimensionModModElements.ModElement {
	@ObjectHolder("dimension_mod:scream")
	public static final Item block = null;
	public ScreamItem(DimensionModModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DimensionModModElements.sounds.get(new ResourceLocation("dimension_mod:crying-wastes-music")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("scream");
		}
	}
}
