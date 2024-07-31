package com.example.minecraftsimulator.listeners;

import com.example.minecraftsimulator.utils.MessageUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        event.setDeathMessage(MessageUtils.colorize("&c" + event.getEntity().getName() + " has died!"));
    }
}
