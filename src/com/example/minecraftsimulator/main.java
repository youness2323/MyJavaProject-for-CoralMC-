package com.example.minecraftsimulator;

import com.example.minecraftsimulator.commands.*;
import com.example.minecraftsimulator.models.Player;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlayerManager playerManager = new PlayerManager();

        System.out.println("Benvenuto nel Minecraft Simulator!");

        while (true) {
            System.out.println("Inserisci un comando:");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Chiusura del simulatore...");
                break;
            }

            CommandExecutor executor = CommandFactory.getExecutor(command, playerManager);
            if (executor != null) {
                executor.execute(command);
            } else {
                System.out.println("Comando non riconosciuto.");
            }
        }

        scanner.close();
    }
}
