package com.Olex7.CatLand.world.gen;

import com.Olex7.CatLand.core.init.BlockInit;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class ModConfiguredFeatures {

	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CHERRY =
			register("cherry",Feature.TREE.configured((
				new BaseTreeFeatureConfig.Builder(
						new SimpleBlockStateProvider(BlockInit.CHERRYTREE_LOG.get().defaultBlockState()),
						new SimpleBlockStateProvider(BlockInit.CHERRYTREE_LEAVES.get().defaultBlockState()),
						new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3),
						new StraightTrunkPlacer(6, 4, 3), 
						new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));

	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String p_243968_0_,
			ConfiguredFeature<FC, ?> p_243968_1_) {
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, p_243968_0_, p_243968_1_);
	}

}
