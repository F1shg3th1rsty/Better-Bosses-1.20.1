package net.fishgethirsty.better_bosses.block.custom;

import net.minecraft.block.LichenGrower;
import net.minecraft.block.MultifaceGrowthBlock;

public class Moss extends MultifaceGrowthBlock {

    public Moss(Settings settings){
        super(settings);
    }

    @Override
    public LichenGrower getGrower() {
        return null;
    }

}
