package com.example.minecraftsimulator.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        if (args.length != 1) {
            sender.sendMessage("Uso corretto: /gamemode <survival|creative|adventure|spectator>");
            return false;
        }

        Player player = (Player) sender;
        GameMode mode;
        switch (args[0].toLowerCase()) {
            case "survival":
                mode = GameMode.SURVIVAL;
                break;
            case "creative":
                mode = GameMode.CREATIVE;
                break;
            case "adventure":
                mode = GameMode.ADVENTURE;
                break;
            case "spectator":
                mode = GameMode.SPECTATOR;
                break;
            default:
                sender.sendMessage("Modalità non valida.");
                return false;
        }

        player.setGameMode(mode);
        sender.sendMessage("Modalità di gioco impostata su " + args[0] + ".");

        return true;
    }
}
