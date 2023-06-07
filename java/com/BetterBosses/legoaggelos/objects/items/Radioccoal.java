package com.BetterBosses.legoaggelos.objects.items;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.init.ItemInit;
import com.BetterBosses.legoaggelos.util.interfaces.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Radioccoal extends Item implements IHasModel{

	public Radioccoal(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BetterBosses.BETTERBOSSESITEMSTAB);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		BetterBosses.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemStack) 
	{
		return 25000;
	}
	
	
	
}
