package com.example.minecraftsimulator.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpdenyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        Player player = (Player) sender;
        // Gestisci il rifiuto della richiesta di teletrasporto (questo è solo un esempio)
        player.sendMessage("Non ancora implementato!"); // Questo è solo un esempio
        return true;
    }
}
