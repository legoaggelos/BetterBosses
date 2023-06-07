package com.BetterBosses.legoaggelos.util.handlers;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.init.BlockInit;
import com.BetterBosses.legoaggelos.init.EntityInit;
import com.BetterBosses.legoaggelos.init.ItemInit;
import com.BetterBosses.legoaggelos.init.OreDictionary;
import com.BetterBosses.legoaggelos.objects.blocks.chest.RenderAChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.RenderBChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.RenderDChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.RenderJChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.RenderSChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityAChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityBChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityDChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityJChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntitySChest;
import com.BetterBosses.legoaggelos.recipes.SmeltingRecipes;
import com.BetterBosses.legoaggelos.world.gen.WorldGenOres;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class RegistryHandler 
{
	private static final String BiomeInit = null;

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelRegister(ModelRegistryEvent event)
	{
		RenderHandler.registerEntityRenders();
		BetterBosses.proxy.registerItemRenderer(Item.getItemFromBlock(BlockInit.DCHEST), 0, "inventory");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDChest.class, new RenderDChest());
		BetterBosses.proxy.registerItemRenderer(Item.getItemFromBlock(BlockInit.ACHEST), 0, "inventory");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAChest.class, new RenderAChest());
		BetterBosses.proxy.registerItemRenderer(Item.getItemFromBlock(BlockInit.SCHEST), 0, "inventory");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySChest.class, new RenderSChest());
		BetterBosses.proxy.registerItemRenderer(Item.getItemFromBlock(BlockInit.JCHEST), 0, "inventory");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJChest.class, new RenderJChest());
		BetterBosses.proxy.registerItemRenderer(Item.getItemFromBlock(BlockInit.BCHEST), 0, "inventory");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBChest.class, new RenderBChest());
		
		RenderHandler.registerEntityRenders();
		for(Item item : ItemInit.ITEMS)
		{
			BetterBosses.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			BetterBosses.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
		}
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		//BlockInit.getBlocks();
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void registerEnchant(RegistryEvent.Register<Enchantment> event)
	{
		
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
	
		GameRegistry.registerWorldGenerator(new WorldGenOres(), 3);
		EntityInit.registerEntities();
		EventHandler.registerEvents();
		SoundsHandler.registerSounds();
		
	}
	
	public static void initRegistries()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(BetterBosses.instance, new GuiHandler());
		SmeltingRecipes.init();
		
		OreDictionary.registerOres();
		BetterBosses.proxy.render();
		
	}
	
	public static void postInitRegistries()
	{
		
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		
	}
}
