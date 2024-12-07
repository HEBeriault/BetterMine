
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettermine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.bettermine.world.inventory.CuttingboardguiMenu;
import net.mcreator.bettermine.BettermineMod;

public class BettermineModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BettermineMod.MODID);
	public static final RegistryObject<MenuType<CuttingboardguiMenu>> CUTTINGBOARDGUI = REGISTRY.register("cuttingboardgui", () -> IForgeMenuType.create(CuttingboardguiMenu::new));
}
