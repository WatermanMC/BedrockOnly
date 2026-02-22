package com.github.WatermanMC.BedrockOnly;

import com.github.WatermanMC.BedrockOnly.listeners.PlayerJoinListener;
import com.github.WatermanMC.BedrockOnly.managers.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class BedrockOnly extends JavaPlugin {
    private ConfigManager configManager;

    @Override
    public void onEnable() {
        if (getServer().getPluginManager().getPlugin("floodgate") == null) {
            getLogger().severe("Floodgate plugin not found!");
            getLogger().severe("Please download it at: https://geysermc.org/download?project=floodgate");

            getServer().getPluginManager().disablePlugin(this);
        } else {
            this.configManager = new ConfigManager(this);
            new BedrockOnlyCommand(this, configManager);
            getServer().getPluginManager().registerEvents(new PlayerJoinListener(this, configManager), this);
            getLogger().info("BedrockOnly v" + getPluginMeta().getVersion() + " enabled!");
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("BedrockOnly v" + getPluginMeta().getVersion() + " disabled!");
    }

    public String getDiscordHelp() {
        return "Cant fix it? Join on our fast discord support: https://discord.gg/Scgqfm5EU4";
    }
}
