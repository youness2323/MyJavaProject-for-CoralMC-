package com.example.minecraftsimulator.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        if (args.length != 1) {
            sender.sendMessage("Uso corretto: /warp <name>");
            return false;
        }

        String warpName = args[0];
        // Gestisci il warp (questo è solo un esempio, dovresti implementare la logica per i warp)
        sender.sendMessage("Non ancora implementato!"); // Questo è solo un esempio
        return true;
    }
}
