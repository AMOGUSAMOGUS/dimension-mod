
package net.mcreator.dimensionmod.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.dimensionmod.DimensionModModElements;

@DimensionModModElements.ModElement.Tag
public class BadPaintingPainting extends DimensionModModElements.ModElement {
	public BadPaintingPainting(DimensionModModElements instance) {
		super(instance, 68);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(48, 32).setRegistryName("bad_painting"));
	}
}
