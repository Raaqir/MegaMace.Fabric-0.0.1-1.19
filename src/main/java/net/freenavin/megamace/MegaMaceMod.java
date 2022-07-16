package net.freenavin.megamace;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.impl.client.model.ModelLoadingRegistryImpl;
import net.freenavin.megamace.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MegaMaceMod implements ModInitializer {
    public static final String MOD_ID = "megamace";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {

        ModItems.registerModItems();



    }
}
