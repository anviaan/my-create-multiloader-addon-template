package net.anvian.mod_id;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class CreateUnbreakableToolsPlatform {
    @ExpectPlatform
    public static String platformName() {
        throw new AssertionError();
    }
}
