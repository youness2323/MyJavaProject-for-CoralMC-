package com.example.minecraftsimulator.commands;

import com.example.minecraftsimulator.utils.MessageUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BroadcastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(MessageUtils.colorize("&cUsage: /broadcast <message>"));
            return false;
        }

        String message = String.join(" ", args);
        Bukkit.broadcastMessage(MessageUtils.colorize("&6[Broadcast] &f" + message));
        return true;
    }
}
