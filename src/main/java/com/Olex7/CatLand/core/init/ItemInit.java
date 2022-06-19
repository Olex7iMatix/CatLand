package com.Olex7.CatLand.core.init;

import com.Olex7.CatLand.Main;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

	public static final RegistryObject<Item> COPPER = ITEMS.register("copper", 
			() -> new Item(new Item.Properties().tab(TabInit.CATLAND_INGOTS)));
	public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire", 
			() -> new Item(new Item.Properties().tab(TabInit.CATLAND_INGOTS)));
	public static final RegistryObject<Item> BRONZE = ITEMS.register("bronze", 
			() -> new Item(new Item.Properties().tab(TabInit.CATLAND_INGOTS)));

	// bronze tools & armor
	
	public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", 
			() -> new SwordItem(ItemInitTier.BRONZE, 2, 1f,
					new Item.Properties().tab(TabInit.CATLAND_TOOLS)));
	
	public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", 
			() -> new AxeItem(ItemInitTier.BRONZE, 4, 0f,
					new Item.Properties().tab(TabInit.CATLAND_TOOLS)));
	
	public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", 
			() -> new PickaxeItem(ItemInitTier.BRONZE, 0, -1f,
					new Item.Properties().tab(TabInit.CATLAND_TOOLS)));
	
	public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", 
			() -> new ShovelItem(ItemInitTier.BRONZE, 0, -1f,
					new Item.Properties().tab(TabInit.CATLAND_TOOLS)));
	
	public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", 
			() -> new HoeItem(ItemInitTier.BRONZE, 0, 0f,
					new Item.Properties().tab(TabInit.CATLAND_TOOLS)));
	
	public static final RegistryObject<Item> CAT_HEARTH = ITEMS.register("cathearth", 
			() -> new Item(new Item.Properties().tab(TabInit.CATLAND_TOOLS)));
	
	// food
	
	public static final RegistryObject<Item> 
    PIZZA_SLICE = ITEMS.register("pizza_slice", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)
            .food(new Food.Builder().nutrition(0).saturationMod(0f).alwaysEat().build())));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
	
}
