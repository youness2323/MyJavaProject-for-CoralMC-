package com.example.minecraftsimulator;

import java.util.HashMap;
import java.util.Map;

import com.example.minecraftsimulator.models.Player;
import com.example.minecraftsimulator.models.Location;

public class PlayerManager {
    private Map<String, Player> players;

    public PlayerManager() {
        players = new HashMap<>();
    }

    public void addPlayer(String name) {
        if (!players.containsKey(name)) {
            players.put(name, new Player(name));
        }
    }

    public void removePlayer(String name) {
        players.remove(name);
    }

    public Player getPlayer(String name) {
        return players.get(name);
    }

    public void setHome(String playerName, Location location) {
        Player player = getPlayer(playerName);
        if (player != null) {
            player.setHome(location);
        }
    }

    public Location getHome(String playerName) {
        Player player = getPlayer(playerName);
        return (player != null) ? player.getHome() : null;
    }

    public void teleportPlayer(String playerName, Location location) {
        Player player = getPlayer(playerName);
        if (player != null) {
            player.setLocation(location);
        }
    }

    public Location getPlayerLocation(String playerName) {
        Player player = getPlayer(playerName);
        return (player != null) ? player.getLocation() : null;
    }
}
