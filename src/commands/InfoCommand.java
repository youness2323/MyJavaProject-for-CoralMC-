package com.example.minecraftsimulator.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InfoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        Player player = (Player) sender;
        String info = String.format("Nome: %s\nSalute: %.1f\nCibo: %d\nPosizione: %.2f, %.2f, %.2f",
                player.getName(),
                player.getHealth(),
                player.getFoodLevel(),
                player.getLocation().getX(),
                player.getLocation().getY(),
                player.getLocation().getZ()
        );

        player.sendMessage(info);

        return true;
    }
}
