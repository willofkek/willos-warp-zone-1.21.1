package willo.warpzone.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import willo.warpzone.WillosWarpZone;

public class WarpZoneItems {

    public static final Item ROBOT_GUARD = registerItem("robot_guard", new ParryShieldItem(new Item.Settings().maxDamage(750)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WillosWarpZone.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WillosWarpZone.LOGGER.info("Registering Mod Items for " + WillosWarpZone.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(ROBOT_GUARD);
        });
    }
}
