package com.example.minecraftsimulator.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MsgCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        if (args.length < 2) {
            sender.sendMessage("Uso corretto: /msg <player> <message>");
            return false;
        }

        String targetName = args[0];
        String message = String.join(" ", args, 1, args.length);
        // Invia il messaggio al giocatore target (questo è solo un esempio)
        sender.sendMessage("Non ancora implementato!"); // Questo è solo un esempio
        return true;
    }
}
