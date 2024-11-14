package app;

import java.util.Scanner;

public class GestionTerrains {
    public static void main(String[] args) {
        // Assuming other necessary classes (Utilisateur, Reservation, etc.) are defined elsewhere
        Utilisateur utilisateur1 = new Utilisateur("User1");

        System.out.println("Les terrains disponibles :");
        System.out.println("1. Terrain de foot");
        System.out.println("2. Terrain de basket");
        System.out.println("3. Terrain de volley");
        // ... other terrain options

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisir le terrain que tu veux reserver (1-3) : ");
        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("Saisir un nombre valide.");
            return;
        }

        Terrain terrain = null; // Initialize to null
        if (choice == 1) {
            System.out.println("Les terrains de foot diponibles:");
            System.out.println("1. Herbe synthétique");
            System.out.println("2. Herbe naturelle");
            int subChoice = 0;
            try {
                subChoice = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Saisir un nombre valide.");
                return;
            }
            if (subChoice == 1) {
                terrain = new TerrainFootSynthetique("Terrain A", "MOHAMMED", "AGDAL", "06 06 06 06 06");
                ((TerrainFootSynthetique) terrain).displayDetails(); // Correct way to call displayDetails
            } else {
                // Assuming TerrainFootNaturel is defined elsewhere like TerrainFootSynthetique
                terrain = new TerrainFootNaturel("Terrain B", "AHMED", "HAY RIAD", "07 07 07 07 07");
                ((TerrainFootNaturel)terrain).displayDetails();
            }
        } else if (choice == 2) {
            System.out.println("Les terrains de basket disponibles:");
            System.out.println("1. terrain A");
            System.out.println("2. terrain B");
            int subChoice = 0;
            try {
                subChoice = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Saisir un nombre valide.");
                return;
            }
            if (subChoice == 1) {
                terrain = new TerrainBasket1("Terrain A", "HOUSSAM", "ALYOUSSOUFIA", "05 05 05 05 05");
                ((TerrainBasket1) terrain).displayDetails(); // Correct way to call displayDetails
            } else {
                // Assuming TerrainFootNaturel is defined elsewhere like TerrainFootSynthetique
                terrain = new TerrainBasket2("Terrain B", "ISMAIL", "NAHDA", "06 07 06 06 06");
                ((TerrainBasket2) terrain).displayDetails();
            }
        } else if (choice == 3) {
            System.out.println("Les terrains de volley diponibles:");
            System.out.println("1. terrain normal");
            System.out.println("2. terrain beach");
            int subChoice = 0;
            try {
                subChoice = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Saisir un nombre valide.");
                return;
            }
            if (subChoice == 1) {
                terrain = new TerrainVolleyNormal("Terrain A", "MOUSSA", "ALFATH", "06 73 52 88 23");
                ((TerrainVolleyNormal) terrain).displayDetails(); // Correct way to call displayDetails
            } else {
                // Assuming TerrainFootNaturel is defined elsewhere like TerrainFootSynthetique
                terrain = new TerrainVolleyBeach("Terrain B", "MOUAD", "ASSABAH", "07 09 88 65 23");
                ((TerrainVolleyBeach) terrain).displayDetails();
            }
        } else {
            System.out.println("Choix invalide.");
            return;
        }

        // Ensure terrain is initialized
        if (terrain == null) {
            System.out.println("Erreur en création.");
            return;
        }

        // Display available hours before reservation
        System.out.println("Les heures disponibles pour la reservation de " + terrain.getNom() + ": " + terrain.getHeuresDisponibles());

        System.out.println("Choisir une heure pour la reservation (format HH:00):");
        String reservationTime = scanner.next();

        // Handle reservation logic here
        terrain.reserverTerrain(reservationTime); // Attempt to reserve the chosen time

        // Assuming Utilisateur and Reservation are defined and properly implemented
        utilisateur1.ajouterReservation(new Reservation(utilisateur1, terrain.getNom(), "dateChoisie", reservationTime));

        // Display updated available hours after reservation
        System.out.println("Les heures disponibles après la reservation pour " + terrain.getNom() + ": " + terrain.getHeuresDisponibles());

        scanner.close(); // Close the scanner when done to prevent resource leak
    }
}
