package ca.aoof.communityserver;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class CommunityServer extends JavaPlugin {
    public static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();
    public CommunityServer(@NonNullDecl JavaPluginInit init) {
        super(init);
        LOGGER.atInfo().log("Hello from %s version %s!", this.getName(), this.getManifest().getVersion().toString());
    }

    @Override
    protected void setup()
    {
        super.setup();
    }
}
