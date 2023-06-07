package com.BetterBosses.legoaggelos.util.handlers;

import com.BetterBosses.legoaggelos.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
public static SoundEvent TEST_EVERYTHING;
public static void registerSounds()
{
	TEST_EVERYTHING = registerSound("entity.testing.test_eveything");
}
private static SoundEvent registerSound(String name)
{
	ResourceLocation location = new ResourceLocation(Reference.MOD_ID + name);
	SoundEvent event = new SoundEvent(location);
	event.setRegistryName(name);
	ForgeRegistries.SOUND_EVENTS.register(event);
	return event;
}
}
