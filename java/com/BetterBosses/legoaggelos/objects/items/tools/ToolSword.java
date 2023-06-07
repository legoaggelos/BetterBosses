package com.BetterBosses.legoaggelos.objects.items.tools;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.init.ItemInit;
import com.BetterBosses.legoaggelos.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

	public ToolSword(String name, ToolMaterial material) {
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
