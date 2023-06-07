package com.BetterBosses.legoaggelos.entity.testing;

import com.BetterBosses.legoaggelos.util.handlers.SoundsHandler;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityTesting  extends EntityCreature
{
public EntityTesting(World worldIn) {
	super(worldIn);
	this.setSize(0.5f, 0.5f);
	
}
@Override
protected void initEntityAI()
{
	this.tasks.addTask(1, new EntityAIWanderAvoidWater(this, 0.30));
}
@Override
protected void applyEntityAttributes() 
{
	super.applyEntityAttributes();
	this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
	this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
	this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(10.0D);
}
@Override
protected SoundEvent getDeathSound() 
{
	return SoundsHandler.TEST_EVERYTHING;
}

@Override
protected SoundEvent getAmbientSound() 
{
	return SoundsHandler.TEST_EVERYTHING;
}

@Override
protected SoundEvent getHurtSound(DamageSource damageSourceIn) 
{
	return SoundsHandler.TEST_EVERYTHING;
}

@Override
protected boolean canDropLoot() 
{
	return true;
}
}
