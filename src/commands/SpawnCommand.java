package com.example.minecraftsimulator.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        Player player = (Player) sender;
        player.teleport(player.getWorld().getSpawnLocation());
        player.sendMessage("Teletrasportato al punto di spawn.");

        return true;
    }
}
