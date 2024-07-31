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

        getCommand("tpa").setExecutor(new TpaCommand());
        getCommand("tpaccept").setExecutor(new TpacceptCommand());
        getCommand("tpdeny").setExecutor(new TpdenyCommand());
        getCommand("msg").setExecutor(new MsgCommand());
        getCommand("reply").setExecutor(new ReplyCommand());
        getCommand("warpcreate").setExecutor(new WarpCreateCommand());
        getCommand("warpdelete").setExecutor(new WarpDeleteCommand());
        getCommand("give").setExecutor(new GiveCommand());
        getCommand("ban").setExecutor(new BanCommand());
        getCommand("unban").setExecutor(new UnbanCommand());
        getCommand("kick").setExecutor(new KickCommand());
        getCommand("mute").setExecutor(new MuteCommand());
        getCommand("unmute").setExecutor(new UnmuteCommand());
        getCommand("time").setExecutor(new TimeCommand());
        getCommand("weather").setExecutor(new WeatherCommand());
        getCommand("spawnmob").setExecutor(new SpawnMobCommand());
        getCommand("gamemode").setExecutor(new GamemodeCommand());
        getCommand("effect").setExecutor(new EffectCommand());
        getCommand("enchant").setExecutor(new EnchantCommand());

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
