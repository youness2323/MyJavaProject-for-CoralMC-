package com.example.minecraftsimulator.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        if (args.length < 2) {
            sender.sendMessage("Uso corretto: /give <player> <item> [amount]");
            return false;
        }

        Player target = sender.getServer().getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage("Giocatore non trovato.");
            return false;
        }

        Material material = Material.getMaterial(args[1].toUpperCase());
        if (material == null) {
            sender.sendMessage("Oggetto non valido.");
            return false;
        }

        int amount = 1;
        if (args.length == 3) {
            try {
                amount = Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                sender.sendMessage("Quantità non valida.");
                return false;
            }
        }

        ItemStack item = new ItemStack(material, amount);
        target.getInventory().addItem(item);
        sender.sendMessage("Oggetto " + material.name() + " dato a " + target.getName() + ".");

        return true;
    }
}
