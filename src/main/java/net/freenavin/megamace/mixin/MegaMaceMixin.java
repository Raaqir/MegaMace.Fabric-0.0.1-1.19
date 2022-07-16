package net.freenavin.megamace.mixin;

import net.freenavin.megamace.MegaMaceMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MegaMaceMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	public void init(CallbackInfo info) {
		MegaMaceMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
