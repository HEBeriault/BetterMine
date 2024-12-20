
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettermine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bettermine.block.WoodentableBlock;
import net.mcreator.bettermine.block.CuttingtableBlock;
import net.mcreator.bettermine.block.ABC123Block;
import net.mcreator.bettermine.BettermineMod;

public class BettermineModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BettermineMod.MODID);
	public static final RegistryObject<Block> ABC_123 = REGISTRY.register("abc_123", () -> new ABC123Block());
	public static final RegistryObject<Block> CUTTINGTABLE = REGISTRY.register("cuttingtable", () -> new CuttingtableBlock());
	public static final RegistryObject<Block> WOODENTABLE = REGISTRY.register("woodentable", () -> new WoodentableBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
