package app;

public class TerrainFootSynthetique extends TerrainFoot {
    public TerrainFootSynthetique(String nom, String responsible, String address, String phoneNumber) {
        super(nom, responsible, address, phoneNumber);
    }

    public void displayDetails() {
        System.out.println("Nom de terrain: " + nom);
        System.out.println("Type de terrain: Synthetic");
        System.out.println("Responsable: " + responsable);
        System.out.println("Adresse: " + adresse);
        System.out.println("Telephone: " + Telephone);
    }

    // ... potentially other methods specific to synthetic terrains
}
