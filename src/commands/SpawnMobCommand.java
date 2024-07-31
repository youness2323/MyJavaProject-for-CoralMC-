package com.example.minecraftsimulator.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class SpawnMobCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        if (args.length != 1) {
            sender.sendMessage("Uso corretto: /spawnmob <mob_type>");
            return false;
        }

        String mobType = args[0].toUpperCase();
        try {
            EntityType entityType = EntityType.valueOf(mobType);
            Player player = (Player) sender;
            player.getWorld().spawnEntity(player.getLocation(), entityType);
            player.sendMessage("Mob " + mobType + " spawnato.");
        } catch (IllegalArgumentException e) {
            sender.sendMessage("Tipo di mob non valido.");
            return false;
        }

        return true;
    }
}
