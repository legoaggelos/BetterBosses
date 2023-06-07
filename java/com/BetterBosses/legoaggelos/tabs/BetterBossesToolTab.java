package com.BetterBosses.legoaggelos.tabs;

import com.BetterBosses.legoaggelos.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BetterBossesToolTab extends CreativeTabs
{

	public BetterBossesToolTab(String label) 
	{
		super("betterbossestooltab");
		this.setBackgroundImageName("betterbossesfoodtab.png");
		
	}
	@Override 
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.TUNGSTEN_SWORD);
	}

}
