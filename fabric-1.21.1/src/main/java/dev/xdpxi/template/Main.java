package dev.xdpxi.template;

import dev.xdpxi.template.util.Log;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    @Override
    public void onInitialize() {
        Log.info("[Template] - Initializing...");

        Common.init();

        Log.info("[Template] - Initialized successfully!");
    }
}
