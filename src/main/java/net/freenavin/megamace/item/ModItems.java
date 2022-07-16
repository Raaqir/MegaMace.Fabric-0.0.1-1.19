package net.freenavin.megamace.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.freenavin.megamace.MegaMaceMod;
import net.freenavin.megamace.item.custom.ModMaceItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item Mega_Mace = registerItem("megamace",
            new ModMaceItem(ModToolMaterials.NETHERITE, 20, 2,
                    new FabricItemSettings().group(ModItemGroup.MEGA_MACE).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MegaMaceMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MegaMaceMod.LOGGER.info("Registering Mod Items for " + MegaMaceMod.MOD_ID);
    }
}
