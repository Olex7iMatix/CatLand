package com.Olex7.CatLand;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Olex7.CatLand.core.init.BlockInit;
import com.Olex7.CatLand.core.init.ItemInit;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("catland")
public class Main
{
	
	public static final String MOD_ID = "catland";
	
    public static final Logger LOGGER = LogManager.getLogger();

    public Main() {
    	
    	IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	ItemInit.register(eventBus);
    	BlockInit.register(eventBus);
    	
    	RenderTypeLookup.setRenderLayer(BlockInit.CHERRYTREE_LEAVES.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.CHERRYTREE_SAPLING.get(), RenderType.cutout());
    	
    	MinecraftForge.EVENT_BUS.register(this);
    }
}
