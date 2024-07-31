package com.example.minecraftsimulator.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WeatherCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("Uso corretto: /weather <clear|rain|thunder>");
            return false;
        }

        String weather = args[0];
        switch (weather.toLowerCase()) {
            case "clear":
                Bukkit.getWorlds().forEach(world -> world.setStorm(false));
                Bukkit.getWorlds().forEach(world -> world.setThunderDuration(0));
                break;
            case "rain":
                Bukkit.getWorlds().forEach(world -> world.setStorm(true));
                Bukkit.getWorlds().forEach(world -> world.setThunderDuration(0));
                break;
            case "thunder":
                Bukkit.getWorlds().forEach(world -> world.setStorm(true));
                Bukkit.getWorlds().forEach(world -> world.setThundering(true));
                break;
            default:
                sender.sendMessage("Tipo di tempo non valido.");
                return false;
        }
        sender.sendMessage("Tempo impostato su " + weather + ".");

        return true;
    }
}
