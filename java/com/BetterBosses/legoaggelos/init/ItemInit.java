package com.BetterBosses.legoaggelos.init;

import java.util.ArrayList;
import java.util.List;

import com.BetterBosses.legoaggelos.objects.items.ChickSteak;
import com.BetterBosses.legoaggelos.objects.items.DoritosChip;
import com.BetterBosses.legoaggelos.objects.items.Lacta;
import com.BetterBosses.legoaggelos.objects.items.PorkChick;
import com.BetterBosses.legoaggelos.objects.items.PorkSouvlaki;
import com.BetterBosses.legoaggelos.objects.items.Radioccoal;
import com.BetterBosses.legoaggelos.objects.items.Radiocoal;
import com.BetterBosses.legoaggelos.objects.items.SteakChop;

import com.BetterBosses.legoaggelos.objects.items.TungstenIngot;
import com.BetterBosses.legoaggelos.objects.items.TungstenPlate;
import com.BetterBosses.legoaggelos.objects.items.armor.BootsTungsten;
import com.BetterBosses.legoaggelos.objects.items.armor.ChestplateTungsten;
import com.BetterBosses.legoaggelos.objects.items.armor.HelmetTungsten;
import com.BetterBosses.legoaggelos.objects.items.armor.LeggingsTungsten;
import com.BetterBosses.legoaggelos.objects.items.tools.ToolAxe;
import com.BetterBosses.legoaggelos.objects.items.tools.ToolHoe;
import com.BetterBosses.legoaggelos.objects.items.tools.ToolPickaxe;
import com.BetterBosses.legoaggelos.objects.items.tools.ToolShovel;
import com.BetterBosses.legoaggelos.objects.items.tools.ToolSword;
import com.BetterBosses.legoaggelos.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>(); 
	
	public static final ArmorMaterial ARMOR_TUNGSTEN = EnumHelper.addArmorMaterial("armor_tungsten", Reference.MOD_ID +":tungsten", 2200, new int[] {2, 6, 7, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ToolMaterial SWORD_TUNGSTEN = EnumHelper.addToolMaterial("tool_tungsten", 3, 2200, 14.0f, 3.5f, 9);
	public static final ToolMaterial TOOL_TUNGSTEN = EnumHelper.addToolMaterial("tool_tungsten", 3, 2200, 8.0f, 0.0f, 9);
	public static final ToolMaterial AXE_TUNGSTEN = EnumHelper.addToolMaterial("tool_tungsten", 3, 2200, 8.0f, 0.0f, 9);
	public static final Item DORITOS_CHIP = new PorkSouvlaki("doritos_chip", 1, 1.0f, false); // food code
	public static final Item TUNGSTEN_INGOT = new TungstenIngot("tungsten_ingot"); //item code
	public static final Item STEAKCHOP = new PorkSouvlaki("steakchop", 16, 10.0f, true); // food
	public static final Item TUNGSTEN_PLATE = new TungstenIngot("tungsten_plate"); //item
	public static final Item CHICKSTEAK = new PorkSouvlaki("chicksteak", 14, 8.0f, true); //food
	public static final Item PORKCHICK = new PorkSouvlaki("porkchick", 14, 8.0f, true); //food
	public static final Item LACTA = new PorkSouvlaki("lacta_chocolate_bar", 8, 0.0f, false); //food
	public static final Item PORK_SOUVLAKI = new PorkSouvlaki("pork_souvlaki", 16, 6.0f, false); //food
	public static final Item HELMET_TUNGSTEN = new HelmetTungsten("helmet_tungsten", ARMOR_TUNGSTEN, 1, EntityEquipmentSlot.HEAD); //helmet
	public static final Item CHESTPLATE_TUNGSTEN = new ChestplateTungsten("chestplate_tungsten", ARMOR_TUNGSTEN, 1, EntityEquipmentSlot.CHEST); //chest
	public static final Item LEGGINGS_TUNGSTEN = new LeggingsTungsten("leggings_tungsten", ARMOR_TUNGSTEN, 2, EntityEquipmentSlot.LEGS); // legs
	public static final Item BOOTS_TUNGSTEN = new BootsTungsten("boots_tungsten", ARMOR_TUNGSTEN, 1, EntityEquipmentSlot.FEET); //boots
	public static final Item TUNGSTEN_SWORD = new ToolSword("tungsten_sword", SWORD_TUNGSTEN);
	public static final Item TUNGSTEN_PICKAXE = new ToolPickaxe("tungsten_pickaxe", TOOL_TUNGSTEN);	
	public static final Item TUNGSTEN_AXE = new ToolAxe("tungsten_axe", AXE_TUNGSTEN);
	public static final Item TUNGSTEN_SHOVEL = new ToolShovel("tungsten_shovel", TOOL_TUNGSTEN);
	public static final Item TUNGSTEN_HOE = new ToolHoe("tungsten_hoe", TOOL_TUNGSTEN);
	public static final Item STEAK_SOUVLAKI = new PorkSouvlaki("steak_souvlaki", 16, 7.0f, false);
	public static final Item CHICKEN_SOUVLAKI = new PorkSouvlaki("chicken_souvlaki", 12, 6.0f, false);
	public static final Item CHICKSTEAK_SOUVLAKI = new PorkSouvlaki("chicksteak_souvlaki", 14, 7.0f, false);
	public static final Item PORKCHICK_SOUVLAKI = new PorkSouvlaki("porkchick_souvlaki", 16, 7.0f, false);
	public static final Item STEAKCHOP_SOUVLAKI = new PorkSouvlaki("steakchop_souvlaki", 16, 7.0f, false);
	public static final Item TUNGSTEN_NUGGET = new TungstenIngot("tungsten_nugget");
	public static final Item RAW_HORSE_MEAT =  new PorkSouvlaki("raw_horse_meat", 2, 0.5f, true);
	public static final Item HORSE_MEAT =  new PorkSouvlaki("horse_meat", 7, 4.0f, true);
	public static final Item WITHER_BONE = new TungstenIngot("wither_bone");
    public static final Item URANIUM_INGOT = new TungstenIngot("uranium_ingot");
    public static final Item URANIUM_NUGGET = new TungstenIngot("uranium_nugget");
    public static final Item URANIUM_PLATE = new TungstenIngot("uranium_plate");
    public static final Item RADIOACTIVE_COAL= new Radiocoal("radiocoal");
    public static final Item RADIOACTIVE_CCOAL= new Radioccoal("radioccoal");
    public static final Item BREAD_SLICE = new PorkSouvlaki("bread_slice", 1, 0.5f, false);
    public static final Item CAKE_SLICE = new PorkSouvlaki("cake_slice", 2, 0.4f, false);
	public static final Item MILK_CARDLER = new TungstenIngot("milk_cardler");
	public static final Item CHEESE = new PorkSouvlaki("cheese", 4, 1.0f, false);
	public static final Item FETA = new PorkSouvlaki("feta", 6, 2.5f, false);
}
