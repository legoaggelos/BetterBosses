package com.BetterBosses.legoaggelos.objects.items.armor;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.init.ItemInit;
import com.BetterBosses.legoaggelos.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class LeggingsTungsten extends ItemArmor implements IHasModel {

	public LeggingsTungsten(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
		super(material, renderIndex, equipmentSlot);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(BetterBosses.BETTERBOSSESTOOLTAB);
		// TODO Auto-generated constructor stub
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		BetterBosses.proxy.registerItemRenderer(this, 0, "inventory");
	}
	}


