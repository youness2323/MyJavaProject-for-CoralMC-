package com.example.minecraftsimulator.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TimeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("Uso corretto: /time <day|night>");
            return false;
        }

        String time = args[0];
        long timeValue = time.equalsIgnoreCase("day") ? 1000 : 13000;
        Bukkit.getWorlds().forEach(world -> world.setTime(timeValue));
        sender.sendMessage("Tempo impostato su " + time + ".");

        return true;
    }
}
