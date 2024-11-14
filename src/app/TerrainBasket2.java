package app;

public class TerrainBasket2 extends TerrainBasket {
    public TerrainBasket2(String nom, String responsible, String address, String phoneNumber) {
        super(nom, responsible, address, phoneNumber);
    }

    public void displayDetails() {
        System.out.println("Nom de terrain: " + nom);
        System.out.println("Responsable: " + responsible);
        System.out.println("Adresse: " + address);
        System.out.println("Telephone: " + phoneNumber);
    }

    // ... potentially other methods specific to synthetic terrains
}
