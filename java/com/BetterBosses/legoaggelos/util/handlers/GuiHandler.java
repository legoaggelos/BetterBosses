package com.BetterBosses.legoaggelos.util.handlers;

import com.BetterBosses.legoaggelos.objects.blocks.chest.ContainerAChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.ContainerBChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.ContainerDChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.ContainerJChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.ContainerSChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.GuiAChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.GuiBChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.GuiDChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.GuiJChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.GuiSChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityAChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityBChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityDChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntityJChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.TileEntitySChest;
import com.BetterBosses.legoaggelos.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_BCHEST)
		{
			return new ContainerBChest(player.inventory, (TileEntityBChest)world.getTileEntity(new BlockPos(x, y, z)), player);
		}
		
		if(ID == Reference.GUI_ACHEST)
		{
			return new ContainerAChest(player.inventory, (TileEntityAChest)world.getTileEntity(new BlockPos(x, y, z)), player);
		}
		
		if(ID == Reference.GUI_SCHEST)
		{
			return new ContainerSChest(player.inventory, (TileEntitySChest)world.getTileEntity(new BlockPos(x, y, z)), player);
		}
		
		if(ID == Reference.GUI_JCHEST) 
		{
			return new ContainerJChest(player.inventory, (TileEntityJChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		}
		if(ID == Reference.GUI_DCHEST) 
		{
			return new ContainerDChest(player.inventory, (TileEntityDChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		}
		return null;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_SCHEST)
		{
			return new GuiSChest(player.inventory, (TileEntitySChest)world.getTileEntity(new BlockPos(x, y, z)), player);
		}
		
		if(ID == Reference.GUI_BCHEST)
		{
			return new GuiBChest(player.inventory, (TileEntityBChest)world.getTileEntity(new BlockPos(x, y, z)), player);
		}
		
		if(ID == Reference.GUI_ACHEST)
		{
			return new GuiAChest(player.inventory, (TileEntityAChest)world.getTileEntity(new BlockPos(x, y, z)), player);
		}
		
		if(ID == Reference.GUI_DCHEST) 
		{
			return new GuiDChest(player.inventory, (TileEntityDChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		}
		if(ID == Reference.GUI_JCHEST) 
		{
			return new GuiJChest(player.inventory, (TileEntityJChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		}
		return null;
	}
}
