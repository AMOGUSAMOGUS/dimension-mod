
package net.mcreator.dimensionmod.potion;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExplosionResistancePotionItemPotion {

	@ObjectHolder("dimension_mod:explosion_resistance")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {

		public PotionCustom() {
			super(new EffectInstance(ExplosionResistancePotionEffect.potion, 3600, 0, false, true));
			setRegistryName("explosion_resistance");
		}

	}
}