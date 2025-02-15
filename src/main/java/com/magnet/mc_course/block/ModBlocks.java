package com.magnet.mc_course.block;

import com.magnet.mc_course.MCCourse;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks
{

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MCCourse.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, Identifier.of(MCCourse.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks()
    {
        MCCourse.LOGGER.info("Registering Mod Blocks for" + MCCourse.MOD_ID);
    }

}
