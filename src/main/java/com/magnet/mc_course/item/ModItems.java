package com.magnet.mc_course.item;

import com.magnet.mc_course.MCCourse;
import com.magnet.mc_course.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{

    public static final Item PINK_GARNET = registerItem("pink_garnet",
            new Item(new Item.Settings()));

    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",
        new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MCCourse.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries)
    {
        entries.add(PINK_GARNET);
        entries.add(RAW_PINK_GARNET);

        entries.add(ModBlocks.PINK_GARNET_BLOCK);
        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
    }

    public static void registerModItems() {
        MCCourse.LOGGER.info(("Registering Mod Items for " + MCCourse.MOD_ID ));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }

}
