package com.BetterBosses.legoaggelos.objects.items.tools;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.init.ItemInit;
import com.BetterBosses.legoaggelos.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;;

public class ToolShovel extends ItemSpade implements IHasModel {

	public ToolShovel(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BetterBosses.BETTERBOSSESTOOLTAB);

		ItemInit.ITEMS.add(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registerModels() {
		BetterBosses.proxy.registerItemRenderer(this, 0, "inventory");
		// TODO Auto-generated method stub

	}

}