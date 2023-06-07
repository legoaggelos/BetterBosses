package com.BetterBosses.legoaggelos.recipes;

import com.BetterBosses.legoaggelos.init.BlockInit;
import com.BetterBosses.legoaggelos.init.ItemInit;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes 
{
public static void init()
{
	GameRegistry.addSmelting(new ItemStack(Items.WHEAT), new ItemStack(ItemInit.DORITOS_CHIP), 0.1f);
	GameRegistry.addSmelting(new ItemStack(BlockInit.TUNGSTEN_ORE), new ItemStack(ItemInit.TUNGSTEN_INGOT), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ItemInit.RAW_HORSE_MEAT), new ItemStack(ItemInit.HORSE_MEAT), 0.5f);
	GameRegistry.addSmelting(new ItemStack(BlockInit.URANIUM_ORE), new ItemStack(ItemInit.URANIUM_INGOT), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ItemInit.CHESTPLATE_TUNGSTEN), new ItemStack(ItemInit.TUNGSTEN_NUGGET), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ItemInit.BOOTS_TUNGSTEN), new ItemStack(ItemInit.TUNGSTEN_NUGGET), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ItemInit.LEGGINGS_TUNGSTEN), new ItemStack(ItemInit.TUNGSTEN_NUGGET), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ItemInit.HELMET_TUNGSTEN), new ItemStack(ItemInit.TUNGSTEN_NUGGET), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ItemInit.TUNGSTEN_PICKAXE), new ItemStack(ItemInit.TUNGSTEN_NUGGET), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ItemInit.TUNGSTEN_AXE), new ItemStack(ItemInit.TUNGSTEN_NUGGET), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ItemInit.TUNGSTEN_SWORD), new ItemStack(ItemInit.TUNGSTEN_NUGGET), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ItemInit.TUNGSTEN_HOE), new ItemStack(ItemInit.TUNGSTEN_NUGGET), 0.5f);
	GameRegistry.addSmelting(new ItemStack(ItemInit.TUNGSTEN_SHOVEL), new ItemStack(ItemInit.TUNGSTEN_NUGGET), 0.5f);
}
}
