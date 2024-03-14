package dev.arthomnix.diamondrails;

import dev.arthomnix.diamondrails.block.ModBlocks;
import dev.arthomnix.diamondrails.item.ModItemGroup;
import dev.arthomnix.diamondrails.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiamondRails implements ModInitializer {
    public static final String MOD_ID = "diamondrails";
    public static final Logger LOGGER = LoggerFactory.getLogger("diamondrails");



    public static final TagKey<Block> TAG_POWERED_RAILS = TagKey.of(
            RegistryKeys.BLOCK, new Identifier("diamondrails", "powered_rails")
    );

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
