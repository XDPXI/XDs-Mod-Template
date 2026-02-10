package dev.xdpxi.template;

import dev.xdpxi.template.util.Log;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class Main {

    public Main() {
        Log.info("[Template] - Initializing...");

        Common.init();

        Log.info("[Template] - Initialized successfully!");
    }
}
