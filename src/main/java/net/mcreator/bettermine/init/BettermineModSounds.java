
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettermine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.bettermine.BettermineMod;

public class BettermineModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BettermineMod.MODID);
	public static final RegistryObject<SoundEvent> NGGYU = REGISTRY.register("nggyu", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bettermine", "nggyu")));
}
