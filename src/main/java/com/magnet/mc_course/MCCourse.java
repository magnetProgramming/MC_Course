package com.magnet.mc_course;

import com.magnet.mc_course.block.ModBlocks;
import com.magnet.mc_course.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourse implements ModInitializer {

    public static final String MOD_ID = "mc_course";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize()
    {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
