package com.example.ultimateminecraftplugin;

import org.bukkit.plugin.java.JavaPlugin;
import com.example.ultimateminecraftplugin.commands.*;
import com.example.ultimateminecraftplugin.listeners.PlayerJoinListener;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("UltimateMinecraftPlugin abilitato!");

        // Registrazione dei comandi
        getCommand("tpa").setExecutor(new TeleportCommand(this));
        getCommand("tpaccept").setExecutor(new TeleportCommand(this));
        getCommand("tp").setExecutor(new TeleportCommand(this));
        getCommand("balance").setExecutor(new EconomyCommand(this));
        getCommand("pay").setExecutor(new EconomyCommand(this));
        getCommand("claim").setExecutor(new ProtectionCommand(this));
        getCommand("unclaim").setExecutor(new ProtectionCommand(this));
        getCommand("minigame").setExecutor(new MinigameCommand(this));
        getCommand("leaderboard").setExecutor(new LeaderboardCommand(this));
        getCommand("customizeworld").setExecutor(new WorldCustomizationCommand(this));

        // Registrazione degli eventi
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(this), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("UltimateMinecraftPlugin disabilitato!");
    }
}
