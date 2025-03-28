package net.fishgethirsty.better_bosses;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fishgethirsty.better_bosses.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class BetterBossesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_MOSS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_MOSS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_MOSS, RenderLayer.getTranslucent());
    }
}
