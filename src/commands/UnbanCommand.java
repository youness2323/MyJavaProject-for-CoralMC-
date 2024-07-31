package com.example.minecraftsimulator.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class UnbanCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender.hasPermission("minecraftsimulator.unban"))) {
            sender.sendMessage("Non hai il permesso per eseguire questo comando.");
            return false;
        }

        if (args.length < 1) {
            sender.sendMessage("Uso corretto: /unban <player>");
            return false;
        }

        String playerName = args[0];
        Bukkit.getBanList(org.bukkit.BanList.Type.NAME).pardon(playerName);
        sender.sendMessage("Giocatore " + playerName + " non più bannato.");

        return true;
    }
}
