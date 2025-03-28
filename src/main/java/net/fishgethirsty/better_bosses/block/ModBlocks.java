package net.fishgethirsty.better_bosses.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fishgethirsty.better_bosses.BetterBosses;
import net.fishgethirsty.better_bosses.block.custom.Moss;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModBlocks {

    public static final Block BLUE_MOSS = registerBlock("blue_moss",
            new Moss(FabricBlockSettings.create()
                    .mapColor(MapColor.BLUE)
                    .replaceable()
                    .noCollision()
                    .strength(0.2F)
                    .sounds(BlockSoundGroup.SCULK_VEIN)
                    .emissiveLighting(ModBlocks::always)
                    .luminance(state -> 10)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GREEN_MOSS = registerBlock("green_moss",
            new Moss(FabricBlockSettings.create()
                    .mapColor(MapColor.EMERALD_GREEN)
                    .replaceable()
                    .noCollision()
                    .strength(0.2F)
                    .sounds(BlockSoundGroup.SCULK_VEIN)
                    .emissiveLighting(ModBlocks::always)
                    .luminance(state -> 10)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_MOSS = registerBlock("orange_moss",
            new Moss(FabricBlockSettings.create()
                    .mapColor(MapColor.ORANGE)
                    .replaceable()
                    .noCollision()
                    .strength(0.2F)
                    .sounds(BlockSoundGroup.SCULK_VEIN)
                    .emissiveLighting(ModBlocks::always)
                    .luminance(state -> 10)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    private static boolean always(BlockState state, BlockView world, BlockPos pos){
        return true;
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BetterBosses.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BetterBosses.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        BetterBosses.LOGGER.info("Registering ModBlocks for " + BetterBosses.MOD_ID);
    }
}
