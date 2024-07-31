package com.example.minecraftsimulator.commands;

import com.example.minecraftsimulator.utils.MessageUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            boolean canFly = !player.getAllowFlight();
            player.setAllowFlight(canFly);
            player.sendMessage(MessageUtils.colorize("&aFlight mode " + (canFly ? "enabled" : "disabled") + "!"));
            return true;
        } else {
            sender.sendMessage("This command can only be executed by a player.");
            return false;
        }
    }
}
