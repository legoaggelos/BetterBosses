package com.BetterBosses.legoaggelos.tabs;

import com.BetterBosses.legoaggelos.init.BlockInit;
import com.BetterBosses.legoaggelos.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BetterBossesBlocksTab extends CreativeTabs
{

	public BetterBossesBlocksTab(String label) 
	{
		super("betterbossesblockstab");
		this.setBackgroundImageName("betterbossesfoodtab.png");
		
	}
	@Override 
	public ItemStack getTabIconItem() {
		return new ItemStack(BlockInit.TUNGSTEN_BLOCK);
	}

}
