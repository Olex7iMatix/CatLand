package com.Olex7.CatLand.core.init.custom.trees;

import java.util.Random;

import com.Olex7.CatLand.world.gen.ModConfiguredFeatures;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class CherryTree extends Tree {

	@Override
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getConfiguredFeature(Random randomIn,
			boolean largeHive) {
		return null; //ModConfiguredFeatures.CHERRY;
	}

}
