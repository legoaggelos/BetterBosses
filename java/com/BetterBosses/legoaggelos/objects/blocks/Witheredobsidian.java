package com.BetterBosses.legoaggelos.objects.blocks;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.init.BlockInit;
import com.BetterBosses.legoaggelos.init.ItemInit;
import com.BetterBosses.legoaggelos.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class Witheredobsidian extends Block implements IHasModel{

	
	public Witheredobsidian(String name, Material blockMaterialIn) {
		
		
		super(blockMaterialIn);
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(BetterBosses.BETTERBOSSESBLOCKSTAB);
	BlockInit.BLOCKS.add(this);
	ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	setHardness(50.0f);
	setHarvestLevel("pickaxe", 3);
	setResistance(1200.0f);
}
@Override
	public void registerModels() 
{
		BetterBosses.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
}

}

