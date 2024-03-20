package org.example;

public class Main {
    public static void main(String[] args) {
        // Erstellen von Tieren
        Tier löwe = new Tier(1, "Löwe", "Löwe", 5, new Besitzer("Alice", 30, "Hauptstraße 123"), new Art("Löwe", 500));
        Tier elefant = new Tier(2, "Elefant", "Elefant", 10, new Besitzer("Bob", 35, "Parkstraße 456"), new Art("Elefant", 1000));
        Tier zebra = new Tier(3, "Zebra", "Zebra", 4, new Besitzer("Charlie", 25, "Waldweg 789"), new Art("Zebra", 300));

        // Ausgabe der erstellten Tiere
        System.out.println("Erstellte Tiere:");
        System.out.println(löwe);
        System.out.println(elefant);
        System.out.println(zebra);

        // Test der equals-Methode
        System.out.println("\nTest der equals-Methode:");
        System.out.println("löwe.equals(elefant): " + löwe.equals(elefant));
        System.out.println("elefant.equals(elefant): " + elefant.equals(elefant));

        // Test der toString-Methode
        System.out.println("\nTest der toString-Methode:");
        System.out.println(löwe.toString());
        System.out.println(elefant.toString());
        System.out.println(zebra.toString());
    }
}
