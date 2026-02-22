package com.github.WatermanMC.BedrockOnly;

import com.github.WatermanMC.BedrockOnly.managers.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.jetbrains.annotations.NotNull;

public class BedrockOnlyCommand implements CommandExecutor  {
    private final BedrockOnly plugin;
    private final ConfigManager configManager;
    private final MiniMessage minimessage;

    public BedrockOnlyCommand(BedrockOnly plugin, ConfigManager configManager) {
        this.plugin = plugin;
        this.configManager = configManager;
        this.minimessage = MiniMessage.miniMessage();
        plugin.getCommand("bedrockonly").setExecutor(this);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender,
                             @NotNull Command command,
                             @NotNull String label,
                             @NotNull String[] args) {
        if (!(sender.hasPermission("bedrockonly.admin"))) {
            sender.sendMessage(minimessage.deserialize(configManager.getMessage("nopermission-command")));
            return true;
        }

        if (args.length < 1) {
            sender.sendMessage(minimessage.deserialize("<red>Usage: /bedrockonly <info/reload>"));
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "reload" -> {
                boolean success = configManager.reloadConfigs();

                if (success) {
                    sender.sendMessage(minimessage.deserialize(configManager.getMessage("reloaded")));
                } else {
                    sender.sendMessage(minimessage.deserialize("<red>Plugin reload failed. Please check console for errors."));
                }
                return true;
            }
            case "info" -> {
                sender.sendMessage(minimessage.deserialize("<dark_gray><b>BedrockOnly <reset><white>v" + plugin.getPluginMeta().getVersion()));
                sender.sendMessage(minimessage.deserialize("<gray>Only allows bedrock players on your server!"));
                sender.sendMessage(minimessage.deserialize("<gold>Authors<gray>: <reset>" + plugin.getPluginMeta().getAuthors()));
                return true;
            }
            default -> {
                sender.sendMessage(minimessage.deserialize("<red>Usage: /bedrockonly <info/reload>"));
                return true;
            }
        }
    }
}