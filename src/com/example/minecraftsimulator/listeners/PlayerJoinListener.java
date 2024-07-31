package com.example.minecraftsimulator.listeners;

import com.example.minecraftsimulator.utils.ConfigManager;
import com.example.minecraftsimulator.utils.MessageUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String joinMessage = ConfigManager.getString("messages.join")
                .replace("{player}", event.getPlayer().getName());
        event.getPlayer().sendMessage(MessageUtils.colorize(joinMessage));
    }
}

