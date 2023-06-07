package com.BetterBosses.legoaggelos.util.handlers;

import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityAChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityBChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityDChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityJChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntitySChest;
import com.BetterBosses.legoaggelos.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityBChest.class, new ResourceLocation(Reference.MOD_ID + ":birch_chest"));
		GameRegistry.registerTileEntity(TileEntitySChest.class, new ResourceLocation(Reference.MOD_ID + ":spruce_chest"));
		GameRegistry.registerTileEntity(TileEntityAChest.class, new ResourceLocation(Reference.MOD_ID + ":acacia_chest"));
		GameRegistry.registerTileEntity(TileEntityDChest.class, new ResourceLocation(Reference.MOD_ID + ":doak_chest"));
		GameRegistry.registerTileEntity(TileEntityJChest.class, new ResourceLocation(Reference.MOD_ID + ":jungle_chest"));
	}
}