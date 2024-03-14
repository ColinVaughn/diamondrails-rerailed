package dev.arthomnix.diamondrails.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItemGroup {
    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(ModItems.ENHANCEDDIAMONDRAIL);
            entries.add(ModItems.DIAMONDRAIL);
            entries.add(ModItems.NETHERITE_RAIL);

        });
    }
}
