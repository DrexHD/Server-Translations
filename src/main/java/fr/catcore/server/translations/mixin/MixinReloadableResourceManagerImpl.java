package fr.catcore.server.translations.mixin;

import net.minecraft.resource.ReloadableResourceManagerImpl;
import net.minecraft.text.Text;
import org.apache.logging.log4j.util.Supplier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(ReloadableResourceManagerImpl.class)
public class MixinReloadableResourceManagerImpl {

    // TODO:
    /*@ModifyArg(method = "reload", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;info(Ljava/lang/String;[Lorg/apache/logging/log4j/util/Supplier;)V", ordinal = 0, remap = false), index = 0)
    private String translated_loading(String string, Supplier<?>... p0) {
        StringBuilder str = new StringBuilder();
        boolean bol = false;
        for (Supplier<?> supplier : p0) {
            if (bol) str.append(",").append(supplier.get());
            else {
                bol = true;
                str = new StringBuilder(supplier.get().toString());
            }
        }
        return Text.translatable("text.translated_server.loading.datapacks", str.toString()).getString();
    }*/
}
