
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettermine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bettermine.item.NggyuItem;
import net.mcreator.bettermine.BettermineMod;

public class BettermineModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BettermineMod.MODID);
	public static final RegistryObject<Item> NGGYU = REGISTRY.register("nggyu", () -> new NggyuItem());
	// Start of user code block custom items
	// End of user code block custom items
}
