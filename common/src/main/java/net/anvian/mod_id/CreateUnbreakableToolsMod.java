package net.anvian.mod_id;

import com.simibubi.create.Create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateUnbreakableToolsMod {
    public static final String MOD_ID = "mod_id";
    public static final String NAME = "Mod Name Mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static void init() {
        LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.VERSION, CreateUnbreakableToolsPlatform.platformName());
    }
}
