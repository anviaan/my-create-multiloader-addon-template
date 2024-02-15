package net.anvian.mod_id;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class ModNameToolsPlatform {
    @ExpectPlatform
    public static int getModGroupId() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static String platformName() {
        throw new AssertionError();
    }
}
