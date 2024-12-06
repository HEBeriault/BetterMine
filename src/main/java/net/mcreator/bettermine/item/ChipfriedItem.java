
package net.mcreator.bettermine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ChipfriedItem extends Item {
	public ChipfriedItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
