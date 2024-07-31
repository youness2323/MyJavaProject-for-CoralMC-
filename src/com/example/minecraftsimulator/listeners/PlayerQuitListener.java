package com.example.minecraftsimulator.listeners;

import com.example.minecraftsimulator.utils.ConfigManager;
import com.example.minecraftsimulator.utils.MessageUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        String quitMessage = ConfigManager.getString("messages.quit")
                .replace("{player}", event.getPlayer().getName());
        event.getPlayer().getServer().broadcastMessage(MessageUtils.colorize(quitMessage));
    }
}
