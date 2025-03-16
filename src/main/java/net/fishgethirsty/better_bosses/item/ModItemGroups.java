package net.fishgethirsty.better_bosses.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fishgethirsty.better_bosses.BetterBosses;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup BETTER_BOSSES = Registry.register(Registries.ITEM_GROUP, new Identifier(BetterBosses.MOD_ID, "better_bosses"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.better_bosses")).icon(() -> new ItemStack(ModItems.WORM_FLESH)).entries((displayContext, entries) -> {
                entries.add(ModItems.WORM_FLESH);

            }).build());

    public static void registerItemGroups(){
        BetterBosses.LOGGER.info("Registering Item Groups for " + BetterBosses.MOD_ID);
    }
}
