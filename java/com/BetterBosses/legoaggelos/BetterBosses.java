package com.BetterBosses.legoaggelos;

import java.io.File;


import com.BetterBosses.legoaggelos.events.LootTableEvent;
import com.BetterBosses.legoaggelos.proxy.CommonProxy;
import com.BetterBosses.legoaggelos.recipes.SmeltingRecipes;
import com.BetterBosses.legoaggelos.tabs.BetterBossesBlocksTab;
import com.BetterBosses.legoaggelos.tabs.BetterBossesFoodTab;
import com.BetterBosses.legoaggelos.tabs.BetterBossesItemsTab;
import com.BetterBosses.legoaggelos.tabs.BetterBossesToolTab;
import com.BetterBosses.legoaggelos.util.Reference;
import com.BetterBosses.legoaggelos.util.handlers.RegistryHandler;
import com.BetterBosses.legoaggelos.world.gen.WorldGenOres;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.Name)
public class BetterBosses 
{
	
@Instance
public static BetterBosses instance;

@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
public static CommonProxy proxy;
public static final CreativeTabs BETTERBOSSESFOODTAB = new BetterBossesFoodTab("betterbossesfoodtab");
public static final CreativeTabs BETTERBOSSESITEMSTAB = new BetterBossesItemsTab("betterbossesitemtab");
public static final CreativeTabs BETTERBOSSESTOOLTAB = new BetterBossesToolTab("betterbossestooltab");
public static final CreativeTabs BETTERBOSSESBLOCKSTAB = new BetterBossesBlocksTab("betterbossesblockstab");

@EventHandler
public void preInit(FMLPreInitializationEvent event )
{
	RegistryHandler.preInitRegistries(event);
}

@EventHandler
public void Init(FMLInitializationEvent event )
{
	RegistryHandler.initRegistries();
}

@EventHandler
public void postInit(FMLPostInitializationEvent event )
{
	RegistryHandler.postInitRegistries();
}

@EventHandler
public void serverInit(FMLServerStartingEvent event) 
{
	
}
} 
