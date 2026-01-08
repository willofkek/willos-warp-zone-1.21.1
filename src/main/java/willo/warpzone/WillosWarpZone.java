package willo.warpzone;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import willo.warpzone.item.WarpZoneItems;

public class WillosWarpZone implements ModInitializer {
	public static final String MOD_ID = "willos_warp_zone";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		WarpZoneItems.registerModItems();
	}
}