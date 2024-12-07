
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettermine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bettermine.item.PotatocleanItem;
import net.mcreator.bettermine.item.PeelerItem;
import net.mcreator.bettermine.item.NggyuItem;
import net.mcreator.bettermine.item.KnifeItem;
import net.mcreator.bettermine.item.ChipfriedItem;
import net.mcreator.bettermine.item.ChipItem;
import net.mcreator.bettermine.BettermineMod;

public class BettermineModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BettermineMod.MODID);
	public static final RegistryObject<Item> NGGYU = REGISTRY.register("nggyu", () -> new NggyuItem());
	public static final RegistryObject<Item> ABC_123 = block(BettermineModBlocks.ABC_123);
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> PEELEDPOTATO = REGISTRY.register("peeledpotato", () -> new PotatocleanItem());
	public static final RegistryObject<Item> CHIP = REGISTRY.register("chip", () -> new ChipItem());
	public static final RegistryObject<Item> CHIPFRIED = REGISTRY.register("chipfried", () -> new ChipfriedItem());
	public static final RegistryObject<Item> PEELER = REGISTRY.register("peeler", () -> new PeelerItem());
	public static final RegistryObject<Item> CUTTINGTABLE = block(BettermineModBlocks.CUTTINGTABLE);
	public static final RegistryObject<Item> WOODENTABLE = block(BettermineModBlocks.WOODENTABLE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
