# Minecraft Simulator Plugin

Questo è un plugin per Minecraft sviluppato in Java utilizzando Bukkit/Spigot. Questo plugin offre una serie di comandi e ascoltatori per migliorare l'esperienza di gioco.

## Funzionalità

- **Comandi:**
  - `/heal`: Ripristina la salute del giocatore.
  - `/fly`: Attiva o disattiva la modalità volo per il giocatore.
  - `/teleport <x> <y> <z>`: Teletrasporta il giocatore alle coordinate specificate.
  - `/broadcast <message>`: Invia un messaggio di broadcast a tutti i giocatori.

- **Ascoltatori di Eventi:**
  - **PlayerJoinListener**: Invia un messaggio di benvenuto quando un giocatore si unisce al server.
  - **PlayerQuitListener**: Invia un messaggio quando un giocatore lascia il server.
  - **PlayerDeathListener**: Mostra un messaggio quando un giocatore muore.

## Configurazione

Modifica il file `config.yml` nella cartella `resources` per personalizzare i messaggi di join e quit.

## Installazione

1. Copia il file JAR del plugin nella cartella `plugins` del tuo server Minecraft.
2. Riavvia il server.

## Contributi

Se vuoi contribuire a questo progetto, sentiti libero di aprire un issue o fare una pull request.

## Licenza

Questo progetto è licenziato sotto la Licenza MIT. Vedi il file `LICENSE` per i dettagli.

