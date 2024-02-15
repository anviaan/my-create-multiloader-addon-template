package net.anvian.mod_id.item.tab;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.anvian.mod_id.CreateUnbreakableToolsMod;
import net.anvian.mod_id.CreateUnbreakableToolsPlatform;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class ModGroup {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateUnbreakableToolsMod.MOD_ID);

    public static final CreativeModeTab GROUP = new CreativeModeTab(CreateUnbreakableToolsPlatform.getModGroupId(), CreateUnbreakableToolsMod.MOD_ID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return Items.DIAMOND.getDefaultInstance();
        }

    };

    public static void register() {
        REGISTRATE.creativeModeTab(() -> GROUP, CreateUnbreakableToolsMod.MOD_ID);
    }
}
