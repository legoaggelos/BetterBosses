 package com.BetterBosses.legoaggelos.init;

import java.util.ArrayList;
import java.util.List;

import com.BetterBosses.legoaggelos.objects.blocks.BlockBase;
import com.BetterBosses.legoaggelos.objects.blocks.TungstenBlock;
import com.BetterBosses.legoaggelos.objects.blocks.Witheredobsidian;
import com.BetterBosses.legoaggelos.objects.blocks.chest.AChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.BChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.DChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.JChest;
import com.BetterBosses.legoaggelos.objects.blocks.chest.SChest;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
public static final List<Block>BLOCKS = new ArrayList<Block>();

public static final Block TUNGSTEN_ORE = new BlockBase("tungsten_ore", Material.IRON);
public static final Block TUNGSTEN_BLOCK = new BlockBase("tungsten_block", Material.IRON);
public static final Block URANIUM_ORE = new BlockBase("uranium_ore", Material.IRON);
public static final Block URANIUM_BLOCK = new TungstenBlock("uranium_block", Material.IRON);
public static final Block BCHEST = new BChest("birch_chest", Material.WOOD);
public static final Block SCHEST = new SChest("spruce_chest", Material.WOOD);
public static final Block JCHEST = new JChest("jungle_chest", Material.WOOD);
public static final Block ACHEST = new AChest("acacia_chest", Material.WOOD);
public static final Block DCHEST = new DChest("doak_chest", Material.WOOD);
public static final Block WOBY = new Witheredobsidian("woby", Material.ROCK);
}
