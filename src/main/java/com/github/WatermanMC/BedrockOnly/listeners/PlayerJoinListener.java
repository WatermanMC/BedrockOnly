package com.github.WatermanMC.BedrockOnly.listeners;

import com.github.WatermanMC.BedrockOnly.BedrockOnly;
import com.github.WatermanMC.BedrockOnly.managers.ConfigManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.geysermc.floodgate.api.FloodgateApi;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.jetbrains.annotations.NotNull;

public class PlayerJoinListener implements Listener {
    private final BedrockOnly plugin;
    private final MiniMessage minimessage;
    private final ConfigManager configManager;

    public PlayerJoinListener(BedrockOnly plugin, ConfigManager configManager) {
        this.plugin = plugin;
        this.minimessage = MiniMessage.miniMessage();
        this.configManager = configManager;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void checkPlayer(@NotNull AsyncPlayerPreLoginEvent event) {
        boolean bedrockPlayer = FloodgateApi.getInstance().isFloodgatePlayer(event.getUniqueId());
        if (bedrockPlayer) return;

        if (configManager.getExemptPlayers().contains(event.getName())) return;

        if (!configManager.getExemptPlayers().contains(event.getName())) {
            plugin.getLogger().info("Blocked Java player: " + event.getName() + " (" + event.getAddress().getHostAddress() + ")");

            String kickMsg = configManager.getMessage("kick-message");
            event.disallow(AsyncPlayerPreLoginEvent.Result.KICK_OTHER, minimessage.deserialize(kickMsg));
        }
    }
}
