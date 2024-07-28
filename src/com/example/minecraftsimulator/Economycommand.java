package com.example.minecraftsimulator.commands;

import com.example.minecraftsimulator.Economy;
import com.example.minecraftsimulator.PlayerManager;

public class EconomyCommand implements CommandExecutor {
    private Economy economy;
    private PlayerManager playerManager;

    public EconomyCommand(Economy economy, PlayerManager playerManager) {
        this.economy = economy;
        this.playerManager = playerManager;
    }

    @Override
    public void execute(String command) {
        String[] parts = command.split(" ");
        if (parts.length < 3) {
            System.out.println("Comando non valido.");
            return;
        }

        String action = parts[0];
        String playerName = parts[1];

        switch (action.toLowerCase()) {
            case "/createaccount":
                economy.createAccount(playerName);
                System.out.println("Account creato per " + playerName);
                break;

            case "/deposit":
                if (parts.length == 4) {
                    int amount = Integer.parseInt(parts[2]);
                    economy.deposit(playerName, amount);
                    System.out.println(amount + " depositati per " + playerName);
                } else {
                    System.out.println("Comando non valido. Utilizzare: /deposit playerName amount");
                }
                break;

            case "/withdraw":
                if (parts.length == 4) {
                    int amount = Integer.parseInt(parts[2]);
                    economy.withdraw(playerName, amount);
                    System.out.println(amount + " prelevati da " + playerName);
                } else {
                    System.out.println("Comando non valido. Utilizzare: /withdraw playerName amount");
                }
                break;

            case "/balance":
                int balance =

