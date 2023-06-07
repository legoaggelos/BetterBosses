package com.BetterBosses.legoaggelos.util.handlers;

import com.BetterBosses.legoaggelos.events.EventWitherImprovementTestingWithTestingEntity;
//import com.BetterBosses.legoaggelos.events.EventWitherImprovementTestingWithTestingEntity;
import com.BetterBosses.legoaggelos.events.LootTableEvent;
import com.BetterBosses.legoaggelos.events.Overriderecipes;

import net.minecraftforge.event.entity.living.LivingDropsEvent;

import net.minecraftforge.common.MinecraftForge;

public class EventHandler 
{
public static void registerEvents()
{
	LootTableEvent lootEvent = new LootTableEvent();
	Overriderecipes overriderecipes = new Overriderecipes();
	EventWitherImprovementTestingWithTestingEntity test = new EventWitherImprovementTestingWithTestingEntity();
	
	MinecraftForge.EVENT_BUS.register(lootEvent);
	MinecraftForge.EVENT_BUS.register(test);
	MinecraftForge.EVENT_BUS.register(overriderecipes);
}
}
