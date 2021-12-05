
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hashmod.craftablechainmail.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import java.util.List;
import java.util.ArrayList;

import hashmod.craftablechainmail.item.ChainmailPlateItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftablechainmailModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item CHAINMAIL_PLATE = register(new ChainmailPlateItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
