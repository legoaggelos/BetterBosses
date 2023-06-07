package com.BetterBosses.legoaggelos.init;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.entity.testing.EntityTesting;
import com.BetterBosses.legoaggelos.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import com.BetterBosses.legoaggelos.util.Reference;

public class EntityInit 
{
	public static void registerEntities()
	{
registerEntity("testing", EntityTesting.class, Reference.ENTITY_TESTING, 40, 65280, 39424);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, BetterBosses.instance, range, 1, true, color1, color2);
	}
	
	private static void registerArrow(String name, Class<? extends Entity> entity, int id)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, BetterBosses.instance, 64, 20, true);
	}
	
	private static void registerProjectile(String name, int id, Class<? extends Entity> entity, Item item)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(name), entity, name, id, BetterBosses.instance, 64, 10, true);
	}
}

