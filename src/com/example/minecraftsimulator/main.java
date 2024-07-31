package com.myplugin;

import com.myplugin.commands.*;
import com.myplugin.listeners.*;
import com.myplugin.utils.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        // Save default config if it doesn't exist
        saveDefaultConfig();
        
        // Initialize config manager
        ConfigManager.init(this);

        // Register commands
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("teleport").setExecutor(new TeleportCommand());
        getCommand("broadcast").setExecutor(new BroadcastCommand());
        
        // Register event listeners
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuitListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);

        getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }
}
