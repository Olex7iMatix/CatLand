package com.Olex7.CatLand.core.init;

import com.Olex7.CatLand.Main;
import com.Olex7.CatLand.core.init.custom.trees.CherryTree;
import com.google.common.base.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.OakTree;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

	public static final RegistryObject<Block> COPPER_ORE = registerBlock("copper_ore", 
			() -> new Block(Properties.of(Material.STONE)
					.harvestLevel(2)
					.harvestTool(ToolType.PICKAXE)
					.strength(5f)));
	
	public static final RegistryObject<Block> COPPER_BLOCK = registerBlock("copper_block", 
			() -> new Block(Properties.of(Material.HEAVY_METAL)
					.harvestLevel(2)
					.harvestTool(ToolType.PICKAXE)
					.strength(5f)));
	public static final RegistryObject<Block> CHERRYTREE_LOG = registerBlock("cherrytree_log", 
			() -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_LOG)));
	public static final RegistryObject<Block> CHERRYTREE_WOOD = registerBlock("cherrytree_wood", 
			() -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_WOOD)));
	public static final RegistryObject<Block> STRIPPED_CHERRYTREE_LOG = registerBlock("stripped_cherrytree_log", 
			() -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
	public static final RegistryObject<Block> STRIPPED_CHERRYTREE_WOOD = registerBlock("stripped_cherrytree_wood", 
			() -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
	public static final RegistryObject<Block> CHERRYTREE_PLANKS = registerBlock("cherrytree_planks", 
			() -> new Block(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)));
	
	public static final RegistryObject<Block> CHERRYTREE_LEAVES = registerBlock("cherrytree_leaves", 
			() -> new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES).strength(0.2f)
					.randomTicks().noOcclusion()));
	
	public static final RegistryObject<Block> CHERRYTREE_SAPLING = registerBlock("cherrytree_sapling", 
			() -> new SaplingBlock(new CherryTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING)));

	public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);

		registerBlockItem(name, toReturn);

		return toReturn;
	}

	public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
		ItemInit.ITEMS.register(name,
				() -> new BlockItem(block.get(), new Item.Properties().tab(TabInit.CATLAND_BLOCK)));
	}

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}

}
