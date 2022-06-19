package com.Olex7.CatLand.core.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TabInit {

	public static final ItemGroup CATLAND_INGOTS = new ItemGroup("catlandIngotsTab") {
		
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.COPPER.get());
		}
	};
	
	public static final ItemGroup CATLAND_BLOCK = new ItemGroup("catlandBlocksTab") {
		
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(BlockInit.COPPER_BLOCK.get());
		}
	};
	
	public static final ItemGroup CATLAND_TOOLS = new ItemGroup("catlandToolsTab") {
		
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.BRONZE_SWORD.get());
		}
	};
	
}
