package com.example.minecraftsimulator.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KickCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender.hasPermission("minecraftsimulator.kick"))) {
            sender.sendMessage("Non hai il permesso per eseguire questo comando.");
            return false;
        }

        if (args.length < 1) {
            sender.sendMessage("Uso corretto: /kick <player> [reason]");
            return false;
        }

        Player target = Bukkit.getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage("Giocatore non trovato.");
            return false;
        }

        String reason = args.length > 1 ? String.join(" ", args, 1, args.length) : "Nessun motivo specificato.";
        target.kickPlayer("Sei stato espulso: " + reason);
        sender.sendMessage("Giocatore " + target.getName() + " espulso.");

        return true;
    }
}
