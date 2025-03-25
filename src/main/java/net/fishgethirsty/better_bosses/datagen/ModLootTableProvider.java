package net.fishgethirsty.better_bosses.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fishgethirsty.better_bosses.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput){
        super(dataOutput);
    }

    @Override
    public void generate(){
        addDrop(ModBlocks.BLUE_MOSS);
    }
}
