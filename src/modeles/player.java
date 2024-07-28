package com.example.minecraftsimulator.models;

public class Player {
    private String name;
    private Location location;

    public Player(String name) {
        this.name = name;
        this.location = new Location(0, 0, 0);
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public void teleportTo(Location location) {
        this.location = location;
    }
}
