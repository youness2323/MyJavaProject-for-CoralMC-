package com.example.minecraftsimulator.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.enchantments.Enchantment;

public class EnchantCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        if (args.length < 2) {
            sender.sendMessage("Uso corretto: /enchant <player> <enchantment> [level]");
            return false;
        }

        Player target = sender.getServer().getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage("Giocatore non trovato.");
            return false;
        }

        Enchantment enchantment = Enchantment.getByName(args[1].toUpperCase());
        if (enchantment == null) {
            sender.sendMessage("Incantamento non valido.");
            return false;
        }

        int level = 1;
        if (args.length > 2) {
            try {
                level = Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                sender.sendMessage("Livello non valido.");
                return false;
            }
        }

        ItemStack item = target.getInventory().getItemInMainHand();
        if (item.getType() == Material.AIR) {
            sender.sendMessage("Devi tenere un oggetto in mano per incantarlo.");
            return false;
        }

        item.addEnchantment(enchantment, level);
        sender.sendMessage("Oggetto di " + target.getName() + " incantato con " + enchantment.getName() + " livello " + level + ".");

        return true;
    }
}
