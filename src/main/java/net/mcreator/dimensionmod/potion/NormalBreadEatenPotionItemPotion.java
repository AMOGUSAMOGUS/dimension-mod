
package net.mcreator.dimensionmod.potion;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NormalBreadEatenPotionItemPotion {

	@ObjectHolder("dimension_mod:normal_bread_eaten")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {

		public PotionCustom() {
			super(new EffectInstance(NormalBreadEatenPotionEffect.potion, 3600, 0, false, true));
			setRegistryName("normal_bread_eaten");
		}

	}
}