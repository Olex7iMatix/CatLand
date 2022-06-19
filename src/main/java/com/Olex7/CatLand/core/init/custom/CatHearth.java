package com.Olex7.CatLand.core.init.custom;

import com.Olex7.CatLand.core.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.World;

public class CatHearth extends Item {
	
	public CatHearth(Properties properties) {
		super(properties);
	}
	
	@Override
	public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
		World world = context.getLevel();
		
		if(!world.isClientSide()) {
			PlayerEntity playerEntity = context.getPlayer();
			BlockState blockState = world.getBlockState(context.getClickedPos());
			Block block = blockState.getBlock();
			
			if (block == BlockInit.COPPER_BLOCK.get()) {
				playerEntity.kill();
			}
		}
		
		return super.onItemUseFirst(stack, context);
	}

}
