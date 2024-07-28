package commands;

import modeles.Player;
import modeles.Location;
import com.example.minecraftsimulator.PlayerManager;

public class TeleportCommand {

    public static void teleport(Player sender, Player target) {
        if (target != null) {
            Location targetLocation = target.getLocation();
            sender.setLocation(targetLocation);
            System.out.println(sender.getName() + " is teleported to " + target.getName());
        } else {
            System.out.println("Player not found.");
        }
    }

    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager();
        Player sender = playerManager.getPlayer("Player1");
        Player target = playerManager.getPlayer("Player2");

        if (sender != null && target != null) {
            teleport(sender, target);
        } else 
