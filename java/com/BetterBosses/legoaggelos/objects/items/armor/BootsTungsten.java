package com.BetterBosses.legoaggelos.objects.items.armor;

import com.BetterBosses.legoaggelos.BetterBosses;
import com.BetterBosses.legoaggelos.init.ItemInit;
import com.BetterBosses.legoaggelos.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class BootsTungsten extends ItemArmor implements IHasModel {

	public BootsTungsten(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
		super(material, renderIndex, equipmentSlot);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(BetterBosses.BETTERBOSSESTOOLTAB);
		// TODO Auto-generated constructor stub
		ItemInit.ITEMS.add(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registerModels() {
		BetterBosses.proxy.registerItemRenderer(this, 0, "inventory");
		// TODO Auto-generated method stub

	}

}
