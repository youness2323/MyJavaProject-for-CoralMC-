package com.example.minecraftsimulator.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Questo comando può essere usato solo dai giocatori.");
            return false;
        }

        if (args.length < 2) {
            sender.sendMessage("Uso corretto: /effect <player> <effect> [duration] [amplifier]");
            return false;
        }

        Player target = sender.getServer().getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage("Giocatore non trovato.");
            return false;
        }

        PotionEffectType effectType = PotionEffectType.getByName(args[1].toUpperCase());
        if (effectType == null) {
            sender.sendMessage("Effetto non valido.");
            return false;
        }

        int duration = 600; // default 30 seconds
        int amplifier = 1;  // default level 1

        if (args.length > 2) {
            try {
                duration = Integer.parseInt(args[2]) * 20; // Convert seconds to ticks
            } catch (NumberFormatException e) {
                sender.sendMessage("Durata non valida.");
                return false;
            }
        }

        if (args.length > 3) {
            try {
                amplifier = Integer.parseInt(args[3]);
            } catch (NumberFormatException e) {
                sender.sendMessage("Amplificatore non valido.");
                return false;
            }
        }

        target.addPotionEffect(new PotionEffect(effectType, duration, amplifier));
        sender.sendMessage("Effetto " + effectType.getName() + " applicato a " + target.getName() + ".");

        return true;
    }
}
