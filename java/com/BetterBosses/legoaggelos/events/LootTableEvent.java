package com.BetterBosses.legoaggelos.events;

import java.util.Random;

import com.BetterBosses.legoaggelos.entity.testing.EntityTesting;
import com.BetterBosses.legoaggelos.init.ItemInit;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityElderGuardian;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootTableEvent 
{
	@SubscribeEvent
	public void customLootTableDrop(LivingDropsEvent event)
	{
		Random rand = new Random();
		if (event.getEntityLiving() instanceof EntityHorse)
		{
			if(rand.nextInt(1) == 0);
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.RAW_HORSE_MEAT), 0.0f);
			}
			if (rand.nextInt(1)==0);
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.RAW_HORSE_MEAT), 0.0f);
			}
		}
		if(event.getEntityLiving() instanceof EntityWitherSkeleton) 
		{
			if(rand.nextInt(1)==0)
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.WITHER_BONE), 0.0f);
			}
			if(rand.nextInt(3)==0)
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.WITHER_BONE), 0.0f);
			}
		}
		if(event.getEntityLiving() instanceof EntityWither) 
		{
			if(rand.nextInt(1)==0)
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.WITHER_BONE), 0.0f);
			}
			if(rand.nextInt(1)==0)
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.WITHER_BONE), 0.0f);
			}
			if(rand.nextInt(1)==0)
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.WITHER_BONE), 0.0f);
			}
			if(rand.nextInt(3)==0)
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.WITHER_BONE), 0.0f);
			}
			if(rand.nextInt(5)==0)
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.WITHER_BONE), 0.0f);
			}
			if(rand.nextInt(5000)==0)
			{
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.WITHER_BONE), 0.0f);
			}
		}if(event.getEntityLiving() instanceof EntityDragon) 
		{
			if(rand.nextInt(1)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_PEARL), 0.0f);
			}
			if(rand.nextInt(1)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_PEARL), 0.0f);
			}
			if(rand.nextInt(1)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_PEARL), 0.0f);
			}
			if(rand.nextInt(1)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_PEARL), 0.0f);
			}
			if(rand.nextInt(1)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_PEARL), 0.0f);
			}
			if(rand.nextInt(1)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_PEARL), 0.0f);
			}
			if(rand.nextInt(1)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_PEARL), 0.0f);
			}
			if(rand.nextInt(4)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_PEARL), 0.0f);
			}
			if(rand.nextInt(4)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_PEARL), 0.0f);
			}
			if(rand.nextInt(10)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_PEARL), 0.0f);
			}
			if(rand.nextInt(1)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_PEARL), 0.0f);
			}
			if(rand.nextInt(1)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_EYE), 0.0f);
			}
			if(rand.nextInt(1)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.ENDER_EYE), 0.0f);
			}
		}
		if(event.getEntityLiving() instanceof EntityElderGuardian) 
			
		{
			if(rand.nextInt(2)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(Items.DIAMOND), 0.0f);
			}
			
		}
if(event.getEntityLiving() instanceof EntityTesting) 
			
		{
			if(rand.nextInt(1)==0) {
				event.getEntityLiving().entityDropItem(new ItemStack(ItemInit.RADIOACTIVE_COAL), 0.0f);
			}
		}
	
	}

}
