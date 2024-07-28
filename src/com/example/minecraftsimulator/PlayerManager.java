package com.example.minecraftsimulator;

import com.example.minecraftsimulator.models.Player;
import java.util.HashMap;
import java.util.Map;

public class PlayerManager {
    private Map<String, Player> players;

    public PlayerManager() {
        this.players = new HashMap<>();
    }

    public Player getPlayer(String name) {
        return players.get(name);
    }

    public void addPlayer(Player player) {
        players.put(player.getName(), player);
    }
}
