package net.anvian.mod_id.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class ModNameToolsPlatformImpl {
	public static String platformName() {
		return FabricLoader.getInstance().isModLoaded("quilt_loader") ? "Quilt" : "Fabric";
	}
}
