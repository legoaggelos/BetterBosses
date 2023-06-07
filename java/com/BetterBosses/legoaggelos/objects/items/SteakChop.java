package com.BetterBosses.legoaggelos.objects.items;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.init.ItemInit;
import com.BetterBosses.legoaggelos.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class SteakChop extends ItemFood implements IHasModel 
{
    public SteakChop(String name, int amount, float saturation, boolean isWolfFood) 
    {
		super(amount, saturation, isWolfFood);
		
setUnlocalizedName(name);
setRegistryName(name);
setCreativeTab(CreativeTabs.FOOD);

ItemInit.ITEMS.add(this);
    }

	@Override
	public void registerModels() 
	{
		BetterBosses.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

	
	
		

	
