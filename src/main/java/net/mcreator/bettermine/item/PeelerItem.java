
package net.mcreator.bettermine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PeelerItem extends Item {
	public PeelerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
