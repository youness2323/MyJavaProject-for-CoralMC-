package com.example.minecraftsimulator.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UnmuteCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender.hasPermission("minecraftsimulator.unmute"))) {
            sender.sendMessage("Non hai il permesso per eseguire questo comando.");
            return false;
        }

        if (args.length < 1) {
            sender.sendMessage("Uso corretto: /unmute <player>");
            return false;
        }

        Player target = sender.getServer().getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage("Giocatore non trovato.");
            return false;
        }

        // Gestisci il ripristino del muting del giocatore (questo è solo un esempio)
        sender.sendMessage("Giocatore " + target.getName() + " non più muto."); // Questo è solo un esempio
        return true;
    }
}
