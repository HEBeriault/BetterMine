
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettermine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.bettermine.BettermineMod;

public class BettermineModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BettermineMod.MODID);
	public static final RegistryObject<CreativeModeTab> BETTERMINETAB = REGISTRY.register("betterminetab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bettermine.betterminetab")).icon(() -> new ItemStack(BettermineModBlocks.ABC_123.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BettermineModItems.KNIFE.get());
				tabData.accept(BettermineModItems.SHITTYPEELER.get());
				tabData.accept(BettermineModItems.PEELER.get());
				tabData.accept(BettermineModItems.PEELERUHD.get());
			})

					.build());
}
