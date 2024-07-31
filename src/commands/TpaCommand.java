package com.example.minecraftsimulator.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpaCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        if (args.length != 1) {
            sender.sendMessage("Uso corretto: /tpa <player>");
            return false;
        }

        String targetName = args[0];
        // Gestisci la richiesta di teletrasporto (questo è solo un esempio)
        sender.sendMessage("Non ancora implementato!"); // Questo è solo un esempio
        return true;
    }
}
