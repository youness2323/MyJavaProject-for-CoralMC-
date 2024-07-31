package com.example.minecraftsimulator.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ServerInfoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int onlinePlayers = Bukkit.getOnlinePlayers().size();
        String version = Bukkit.getVersion();

        sender.sendMessage("Informazioni del server:");
        sender.sendMessage("Giocatori online: " + onlinePlayers);
        sender.sendMessage("Versione: " + version);

        return true;
    }
}
