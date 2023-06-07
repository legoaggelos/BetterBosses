package com.BetterBosses.legoaggelos.tabs;

import com.BetterBosses.legoaggelos.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BetterBossesFoodTab extends CreativeTabs
{

	public BetterBossesFoodTab(String label) 
	{
		super("betterbossesfoodtab");
		this.setBackgroundImageName("betterbossesfoodtab.png");
		
	}
	@Override 
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.DORITOS_CHIP);
	}

}
