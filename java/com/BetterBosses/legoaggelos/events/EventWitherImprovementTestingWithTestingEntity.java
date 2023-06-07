package com.BetterBosses.legoaggelos.events;

import org.apache.http.util.EntityUtils;

import com.BetterBosses.legoaggelos.entity.testing.EntityTesting;
import com.BetterBosses.legoaggelos.init.EntityInit;
import com.BetterBosses.legoaggelos.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteractSpecific;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventWitherImprovementTestingWithTestingEntity {

	@SuppressWarnings({ "unused", "unlikely-arg-type" })
	@SubscribeEvent
	public void EntityEvent(EntityJoinWorldEvent event)
	{
		
		Entity entity = event.getEntity();
		World world = event.getWorld();
		
		BlockPos pos = new BlockPos(entity);
		BlockPos pos1 = new BlockPos(entity);
	pos.add(entity.posX, entity.posY - 2, entity.posZ) ;
		pos1.add(entity.posX, entity.posY - 1, entity.posZ) ;
		
		
		
if(entity.equals(Reference.ENTITY_TESTING)==true) {
	
		world.setBlockState(pos, Blocks.OBSIDIAN.getDefaultState());
		world.setBlockState(pos1, Blocks.OBSIDIAN.getDefaultState());
	}
}
		
	}

