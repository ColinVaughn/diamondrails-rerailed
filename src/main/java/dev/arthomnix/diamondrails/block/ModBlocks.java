package dev.arthomnix.diamondrails.block;

import dev.arthomnix.diamondrails.DiamondRails;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PoweredRailBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
public class ModBlocks {





    public static final Block DIAMOND_RAIL = Registry.register(Registries.BLOCK, new Identifier(DiamondRails.MOD_ID, "diamond_rail"),
            new PoweredRailBlock(FabricBlockSettings.copyOf(Blocks.RAIL).sounds(BlockSoundGroup.METAL).strength(0.7f).noCollision()));
    public static final Block ENHANCED_DIAMOND_RAIL = Registry.register(Registries.BLOCK, new Identifier(DiamondRails.MOD_ID, "enhanced_diamond_rail"),
            new PoweredRailBlock(FabricBlockSettings.copyOf(Blocks.RAIL).sounds(BlockSoundGroup.METAL).strength(0.7f).noCollision()));
    public static final Block NETHERITE_RAIL = Registry.register(Registries.BLOCK, new Identifier(DiamondRails.MOD_ID, "netherite_rail"),
            new PoweredRailBlock(FabricBlockSettings.copyOf(Blocks.RAIL).sounds(BlockSoundGroup.METAL).strength(0.7f).noCollision()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DiamondRails.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(DiamondRails.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
        DiamondRails.LOGGER.info("Registering ModBlocks for " + DiamondRails.MOD_ID);
    }
}
