/*package com.BetterBosses.legoaggelos.enchants;

import com.BetterBosses.legoaggelos.init.EnchantmentInit;
import com.BetterBosses.legoaggelos.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentBossSlayer extends Enchantment 
{

	public EnchantmentBossSlayer(Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots) {
		super(rarityIn, typeIn, slots);
		this.setName("boss_slayer");
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":boss_slayer"));
		EnchantmentInit.ENCHANTMENTS.add(this);
		
	}
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		// TODO Auto-generated method stub
		return enchantmentLevel *7;
	}
	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		// TODO Auto-generated method stub
		return super.getMinEnchantability(enchantmentLevel)*7;
	}
	@Override
	public int getMaxLevel() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		// TODO Auto-generated method stub
		if(ench==Enchantments.SMITE) {
			return false;
		}
		if(ench==Enchantments.BANE_OF_ARTHROPODS) {
			return false;
		}
		if(ench==Enchantments.SHARPNESS) {
			return false;
		}
		return true;
	}
	

}*/
