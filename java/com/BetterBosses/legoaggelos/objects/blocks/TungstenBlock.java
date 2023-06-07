package com.BetterBosses.legoaggelos.objects.blocks;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.init.BlockInit;
import com.BetterBosses.legoaggelos.init.ItemInit;
import com.BetterBosses.legoaggelos.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class TungstenBlock extends Block implements IHasModel {

	public TungstenBlock(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BetterBosses.BETTERBOSSESBLOCKSTAB);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		setHardness(20.0f);
		setHarvestLevel("pickaxe", 2);
		setResistance(9.0f);
	}
	@Override
		public void registerModels() 
	{
			BetterBosses.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
