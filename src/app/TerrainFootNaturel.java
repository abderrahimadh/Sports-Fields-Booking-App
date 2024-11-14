package app;

public class TerrainFootNaturel extends TerrainFoot {
    public TerrainFootNaturel(String nom, String responsible, String address, String phoneNumber) {
        super(nom, responsible, address, phoneNumber);
    }

    public void displayDetails() {
        System.out.println("Nom de terrain: " + nom);
        System.out.println("Type de terrain: Herbe naturelle");
        System.out.println("Responsable: " + responsable);
        System.out.println("Adresse: " + adresse);
        System.out.println("Numero de responsable: " + Telephone);
    }

    // ... potentially other methods specific to synthetic terrains
}
