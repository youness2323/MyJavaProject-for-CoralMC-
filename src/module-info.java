module com.example.minecraftsimulator {
    requires java.base; // Questa è implicita, ma puoi includerla per chiarezza
    requires java.logging; // Se usi la libreria di logging Java, altrimenti rimuovila

    exports com.example.minecraftsimulator;
    exports com.example.minecraftsimulator.commands;
    exports com.example.minecraftsimulator.models;
}
