package com.BetterBosses.legoaggelos.objects.items;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.init.ItemInit;
import com.BetterBosses.legoaggelos.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ChickSteak extends ItemFood implements IHasModel 
{
	  public ChickSteak(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		// TODO Auto-generated constructor stub
	
			
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(CreativeTabs.FOOD);

	ItemInit.ITEMS.add(this);
	    }

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		BetterBosses.proxy.registerItemRenderer(this, 0, "inventory");

	}

}
