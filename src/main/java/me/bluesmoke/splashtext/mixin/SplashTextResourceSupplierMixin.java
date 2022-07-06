package me.bluesmoke.splashtext.mixin;

import net.minecraft.client.resource.SplashTextResourceSupplier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SplashTextResourceSupplier.class)
public class SplashTextResourceSupplierMixin {

    private static final String CUSTOM_SPLASH = "Sample Text";

    @Inject(method = "get", at = @At("HEAD"), cancellable = true)
    public void changeSplashText(CallbackInfoReturnable<String> callback) {
        callback.setReturnValue(CUSTOM_SPLASH);
    }
}
