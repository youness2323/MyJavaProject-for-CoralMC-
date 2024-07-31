package com.example.minecraftsimulator.commands;

import com.example.minecraftsimulator.utils.MessageUtils;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (args.length != 3) {
                sender.sendMessage(MessageUtils.colorize("&cUsage: /teleport <x> <y> <z>"));
                return false;
            }

            try {
                double x = Double.parseDouble(args[0]);
                double y = Double.parseDouble(args[1]);
                double z = Double.parseDouble(args[2]);

                Player player = (Player) sender;
                Location location = new Location(player.getWorld(), x, y, z);
                player.teleport(location);
                player.sendMessage(MessageUtils.colorize("&aTeleported to (" + x + ", " + y + ", " + z + ")!"));
                return true;
            } catch (NumberFormatException e) {
                sender.sendMessage(MessageUtils.colorize("&cCoordinates must be numbers."));
                return false;
            }
        } else {
            sender.sendMessage("This command can only be executed by a player.");
            return false;
        }
    }
}
