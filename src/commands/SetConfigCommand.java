package com.example.minecraftsimulator.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class SetConfigCommand implements CommandExecutor {

    private final FileConfiguration config;

    public SetConfigCommand(FileConfiguration config) {
        this.config = config;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        if (args.length != 2) {
            sender.sendMessage("Uso corretto: /setconfig <key> <value>");
            return false;
        }

        String key = args[0];
        String value = args[1];

        config.set(key, value);
        // Salva la configurazione sul file
        // Assicurati di avere un metodo per salvare la configurazione nel tuo plugin

        sender.sendMessage("Configurazione aggiornata: " + key + " = " + value);

        return true;
    }
}
