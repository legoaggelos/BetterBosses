package com.BetterBosses.legoaggelos.objects.items;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.init.ItemInit;
import com.BetterBosses.legoaggelos.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TungstenPlate extends Item implements IHasModel 
{
		public TungstenPlate(String name) 
		{
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(CreativeTabs.MISC);
			
			ItemInit.ITEMS.add(this);
		}

	@Override
	public void registerModels() 
	{
		BetterBosses.proxy.registerItemRenderer(this, 0, "inventory");

	}

}
