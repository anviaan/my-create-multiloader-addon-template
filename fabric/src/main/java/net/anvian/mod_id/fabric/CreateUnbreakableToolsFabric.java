package net.anvian.mod_id.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.anvian.mod_id.CreateUnbreakableToolsMod;
import net.anvian.mod_id.fabric.registry.ModGroup;
import net.fabricmc.api.ModInitializer;

public class CreateUnbreakableToolsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        CreateUnbreakableToolsMod.init();
        CreateUnbreakableToolsMod.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
        ), CreateUnbreakableToolsMod.NAME);

        ModGroup.register();
    }
}
