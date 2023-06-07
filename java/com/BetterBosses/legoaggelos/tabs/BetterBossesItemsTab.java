package com.BetterBosses.legoaggelos.tabs;

import com.BetterBosses.legoaggelos.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BetterBossesItemsTab extends CreativeTabs
{

	public BetterBossesItemsTab(String label) 
	{
		super("betterbossesitemtab");
		this.setBackgroundImageName("betterbossesfoodtab.png");
		
	}
	@Override 
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.TUNGSTEN_INGOT);
	}

}
