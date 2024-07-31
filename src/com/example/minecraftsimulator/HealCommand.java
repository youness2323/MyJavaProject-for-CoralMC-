package com.example.minecraftsimulator.commands;

import com.example.minecraftsimulator.utils.MessageUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setHealth(20.0);
            player.sendMessage(MessageUtils.colorize("&aYou have been healed!"));
            return true;
        } else {
            sender.sendMessage("This command can only be executed by a player.");
            return false;
        }
    }
}
