package net.anvian.mod_id;

import com.simibubi.create.Create;
import net.anvian.mod_id.item.tab.ModGroup;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModNameToolsMod {
    public static final String MOD_ID = "mod_id";
    public static final String NAME = "Mod Name Mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static void init() {
        LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.VERSION, ModNameToolsPlatform.platformName());
        ModGroup.register();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
